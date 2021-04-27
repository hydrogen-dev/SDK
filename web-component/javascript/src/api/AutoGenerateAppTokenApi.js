(function(root, factory) {
    if (typeof define === 'function' && define.amd) {
      // AMD. Register as an anonymous module.
      define(['ApiClient', 'model/AppToken','AuthApi'], factory);
    } else if (typeof module === 'object' && module.exports) {
      // CommonJS-like environments that support module.exports, like Node.
      module.exports = factory(require('../ApiClient'), require('../model/AppToken'), require('./AuthApi'));
    } else {
      // Browser globals (root is window)
      if (!root.HydrogenAdminApi) {
        root.HydrogenAdminApi = {};
      }
      root.HydrogenAdminApi.AutoGenerateAppTokenApi = factory(root.HydrogenAdminApi.ApiClient, root.HydrogenAdminApi.AppToken, root.HydrogenAdminApi.AuthApi);
    }
  }(this, function(ApiClient, AppToken, AuthApi) {
    'use strict';
  
    /**
     * AppToken service.
     * @module api/GetAppTokenApi
     * @version 1.3.0
     */
  
    /**
     * Constructs a new GetAppTokenApi. 
     * @alias module:api/GetAppTokenApi
     * @class
     * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
     * default to {@link module:ApiClient#instance} if unspecified.
     */
    var exports = function(apiClient, authApi) {
      this.apiClient = apiClient || ApiClient.instance;
      this.authApi = authApi || new AuthApi();
      
      this.getAppTokenUsingGET = function(appTokenConfig, callback) {

        
        let template  = "<tag app-token='##app_token##' ##attrib_map##></tag>";
        var postBody = null;
  
        // verify the required parameter 'appName' is set
        if (appTokenConfig.appName === undefined || appTokenConfig.appName === null) {
          throw new Error("Missing the required parameter 'appName' when calling getAppTokenUsingGET");
        }

        if (appTokenConfig.basePath === undefined || appTokenConfig.basePath === null) {
          throw new Error("Missing the required parameter 'basePath' when calling getAppTokenUsingGET");
        }

        this.apiClient.basePath = appTokenConfig.basePath;

  
        var pathParams = {
        };
        var queryParams = {
        };
        var collectionQueryParams = {
          'app_name': {
            value: appTokenConfig.appName,
            collectionFormat: 'multi'
          },
        };
        var headerParams = {
        };
        var formParams = {
        };
  
        var authNames = ['oauth2'];
        var contentTypes = [];
        var accepts = ['*/*'];
        var returnType = [AppToken];

        var oauth2 = this.apiClient.authentications['oauth2'];

       
        let finalAttribMap = [];
        if(appTokenConfig.attribMap){
          finalAttribMap = [...new Set(appTokenConfig.attribMap.map(it => it.name + "='"+it.value+"'"))];
        }

        async function createUsingPostClientCredentials (apiClient, authApi) {
          // Token Generation for grant_type = client_credentials
          const req = authApi.createUsingPostClientCredentials({
            'grant_type': 'client_credentials',
            'client_id': appTokenConfig.clientId,
            'client_secret': appTokenConfig.clientSecret
          }, null);

          return new Promise(function(resolve, reject) {
              req
              .then(response => {
                let data = null;
                try {
                    data = apiClient.deserialize(response, Object);
                    if (apiClient.enableCookies && typeof window === 'undefined') {
                        apiClient.agent.saveCookies(response);
                    }
                } catch (err) {
                    console.log(err);
                    reject(err);
                }

                resolve(data)
              })
              .catch(err => {
                console.error(err);
                reject(err);
             });
            });
        }

        async function createUsingPostPassword (apiClient, authApi, username, password) {
          // Token Generation for grant_type = password
          const req = authApi.createUsingPostPassword({
            'grant_type': 'password',
            'client_id': appTokenConfig.clientId,
            'client_secret': appTokenConfig.clientSecret,
            'username': username,
            'password': password
          }, null);

          return new Promise(function(resolve, reject) {
              req
              .then(response => {
                let data = null;
                try {
                    data = apiClient.deserialize(response, Object);
                    if (apiClient.enableCookies && typeof window === 'undefined') {
                        apiClient.agent.saveCookies(response);
                    }
                } catch (err) {
                    console.log(err);
                    reject(err);
                }

                resolve(data)
              })
              .catch(err => {
                console.error(err);
                reject(err);
             });
            });
        }

        async function getWhiteLabelApplication (apiClient, authApi) {
          const req = apiClient.callApi(
                '/white_label/application?size=100000', 'GET',
                pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
                authNames, contentTypes, accepts, Object, null
              );

          return new Promise(function(resolve, reject) {
              req
              .then(response => {
                let data = null;
                try {
                    data = apiClient.deserialize(response, Object);
                    if (apiClient.enableCookies && typeof window === 'undefined') {
                        apiClient.agent.saveCookies(response);
                    }
                } catch (err) {
                    console.log(err);
                    reject(err);
                }

                resolve(data)
              })
              .catch(err => {
                console.error(err);
                reject(err);
             });
            });
        }

        async function getAppToken (apiClient, appName) {
          const req = apiClient.callApi(
                    '/app_token?app_name=' + appName, 'GET',
                    pathParams, {}, {}, headerParams, formParams, postBody,
                    authNames, contentTypes, accepts, [AppToken], null
                  );

          return new Promise(function(resolve, reject) {
              req
              .then(response => {
                let data = null;
                try {
                    data = apiClient.deserialize(response, Object);
                    if (apiClient.enableCookies && typeof window === 'undefined') {
                        apiClient.agent.saveCookies(response);
                    }
                } catch (err) {
                    console.log(err);
                    reject(err);
                }

                resolve(data)
              })
              .catch(err => {
                console.error(err);
                reject(err);
             });
            });
        }

        try {
        (async () => {
          const tokenData = await createUsingPostClientCredentials(this.apiClient, this.authApi).catch(e=>{
            callback(e, null, null)
          });
          oauth2.accessToken = tokenData.access_token;

          const applicationsData = await getWhiteLabelApplication(this.apiClient, this.authApi).catch(e=>{
            callback(e, null, null)
          });

          let applicationMap = [];
          if(applicationsData && applicationsData.content){
            let content = applicationsData.content;
            applicationMap = Array.from(content).reduce(function(map, obj) {
              map[obj.name] = obj.auth_type;
              return map;
            }, {});

            const appNameQueryParam = collectionQueryParams && collectionQueryParams['app_name'] ? collectionQueryParams['app_name'] : [];
            let response = [];
            if(appNameQueryParam){
              for (var param in appNameQueryParam.value) {
                let item = {};
                const app = appNameQueryParam.value[param];
                if(applicationMap && applicationMap[app]){
                  const authType = applicationMap[app];
                  if(authType && authType.find(a=>a.toLowerCase() === "client_credentials")){
                    oauth2.accessToken = tokenData.access_token;

                  }else if(authType && authType.find(a=>a.toLowerCase() === "password_credentials")){
                    oauth2.accessToken = appTokenConfig.userAccessToken;
                    if(appTokenConfig.isCredsPassed){
                      const passwordTokenData = await createUsingPostPassword(this.apiClient, this.authApi, appTokenConfig.username, appTokenConfig.password).catch(e=>{
                        callback(e, null, null)
                      });
                      oauth2.accessToken = passwordTokenData.access_token;
                    }
                  }
                  const appTokenData = await getAppToken(this.apiClient, app).catch(e=>{
                    callback(e, null, null)
                  });
                  const appTokenValue = appTokenData && appTokenData.length>0 ? appTokenData[0].app_token : '';
                  const tagValue = app.toLowerCase().replace(/_/g, '-');
                  const fillTemplateValue = template.replace(/tag/g, tagValue)
                                            .replace(/##app_token##/g, appTokenValue)
                                            .replace(/##attrib_map##/g, finalAttribMap!=null ?  finalAttribMap.join(' ') : '');
                  
                  item[app] = appTokenValue;
                  if(appTokenConfig.isEmbed){
                    item[app] = fillTemplateValue;
                  }
                  response.push(item);
                }else{
                  console.log("application not found : " + app);
                  callback("application not found", response, response) ;
                }
              }
            }
            callback(null, response, response) ;
          }else{
            console.log("Unble to get whitelabel applications");
            callback("Unble to get whitelabel applications", response, response) ;
          }

        })();
      }catch(e){
        callback(e, null, null);
      }
     }
  };
  
    return exports;
  }));
  