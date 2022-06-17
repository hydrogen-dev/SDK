using System;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAutoGenerateAppTokenApi
    {
        /// <summary>
        /// getAppToken 
        /// </summary>
        List<Dictionary<String, String>> GetAppTokenUsingGET ();
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class AutoGenerateAppTokenApi : IAutoGenerateAppTokenApi
    {
        private AppTokenConfig appTokenConfig;
        private String template = "<tag app-token='##app_token##' ##attrib_map##></tag>";
        /// <summary>
        /// Initializes a new instance of the <see cref="AutoGenerateAppTokenApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public AutoGenerateAppTokenApi(AppTokenConfig appTokenConfig)
        {
            this.ApiClient = Configuration.DefaultApiClient; 
            this.ApiClient.BasePath = appTokenConfig.basePath;
            this.appTokenConfig = appTokenConfig;
        }

    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        /// getAppToken 
        /// </summary>
        /// <param name="appName">app_name</param> 
        /// <param name="tenantName">tenant-name</param> 
        /// <returns>List&lt;AppToken&gt;</returns>            
        public List<AppToken> GetAppTokenUsingGET (List<string> appName, string tenantName, string token)
        {
            const string AUTHORIZATION = "Authorization";
            const string BEARER = "Bearer ";
            // verify the required parameter 'appName' is set
            if (appName == null) throw new ApiException(400, "Missing required parameter 'appName' when calling GetAppTokenUsingGET");
            this.ApiClient.BasePath = this.appTokenConfig.basePath;
            String baseUri = this.appTokenConfig.basePath.Substring(0, appTokenConfig.basePath.IndexOf(".com") + 4);
            this.ApiClient.BasePath = baseUri;
           
            var path = "/admin/v1/app_token";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (appName != null) queryParams.Add("app_name", ApiClient.ParameterToString(appName)); // query parameter
             if (tenantName != null) headerParams.Add("tenant-name", ApiClient.ParameterToString(tenantName)); // header parameter
             
             headerParams[AUTHORIZATION] = BEARER + token;
            // authentication setting, if any
            String[] authSettings = new String[] { "oauth2" };
           
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAppTokenUsingGET: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAppTokenUsingGET: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<AppToken>) ApiClient.Deserialize(response.Content, typeof(List<AppToken>), response.Headers);
        }

        public List<Dictionary<String, String>> GetAppTokenUsingGET ()
        {
             List<Dictionary<String, String>> localVarResponse = GetAppTokenUsingGETAsyncWithHttpInfo();
             return localVarResponse;
        }

          public List<Dictionary<String, String>> GetAppTokenUsingGETAsyncWithHttpInfo ()
        {
            List<Dictionary<String, String>> response = new List<Dictionary<String, String>>();
            String token = null;
            AuthApiClient authApiClient = new AuthApiClient(this.ApiClient);
            String clientCredentialToken = authApiClient.createClientCredential(appTokenConfig.clientId, appTokenConfig.clientSecret);
            token = clientCredentialToken;

                foreach (AppConfig app in appTokenConfig.appNames) {
                    if (app.authType != null && app.authType.ToLower()=="client_credentials") {
                        token = clientCredentialToken;
                    } else if (app.authType != null && app.authType.ToLower() == "password_credentials") {
                        token = appTokenConfig.userAccessToken;
                        if (appTokenConfig.isCredsPassed) {
                            String passwordCredentialToken = authApiClient.createPasswordCredential(appTokenConfig.clientId, appTokenConfig.clientSecret, appTokenConfig.username, appTokenConfig.password);
                            token = passwordCredentialToken;
                        }
                    }

                    List<AppToken> appTokens = GetAppTokenUsingGET(new List<String> {app.appName}, null, token);
                    if (appTokens != null) {
                        String appTokenValue = appTokens != null && appTokens.Count > 0 ? appTokens[0]._AppToken : "";
                        String tagValue = app.appName.ToLower().Replace("_", "-");
                        String fillTemplateValue = template.Replace("tag", tagValue)
                                .Replace("##app_token##", appTokenValue)
                                .Replace("##attrib_map##", getAttribMapList(appTokenConfig) != null ? string.Join(" ", getAttribMapList(appTokenConfig)) : "");

                        Dictionary<String, String> appMap = new Dictionary<String, String>();
                        

                        if (appTokenConfig.isEmbed) {
                            appMap.Add(app.appName, fillTemplateValue);
                        }else{
                            appMap.Add(app.appName, appTokenValue);
                        }
                        response.Add(appMap);
                    }
                }
            return response;
        }
        private String[] getAttribMapList(AppTokenConfig appTokenConfig) {
            List<TagAttributes> attributes = appTokenConfig.attributes;
            List<String> finalAttributes = new List<String>();

            foreach (TagAttributes tagAttributes in attributes?? new List<TagAttributes>()) {
                finalAttributes.Add(tagAttributes.name + "='" + tagAttributes.value + "'");
            }
            return finalAttributes.ToArray();
        }
    
    }
}
