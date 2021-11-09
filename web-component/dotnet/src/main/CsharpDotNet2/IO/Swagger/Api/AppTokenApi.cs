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
    public interface IAppTokenApi
    {
        /// <summary>
        /// getAppToken 
        /// </summary>
        /// <param name="appName">app_name</param>
        /// <param name="tenantName">tenant-name</param>
        /// <returns>List&lt;AppToken&gt;</returns>
        List<AppToken> GetAppTokenUsingGET (List<string> appName, string tenantName);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class AppTokenApi : IAppTokenApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AppTokenApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public AppTokenApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="AppTokenApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AppTokenApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
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
        public List<AppToken> GetAppTokenUsingGET (List<string> appName, string tenantName)
        {
            
            // verify the required parameter 'appName' is set
            if (appName == null) throw new ApiException(400, "Missing required parameter 'appName' when calling GetAppTokenUsingGET");
            
    
            var path = "/app_token";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (appName != null) queryParams.Add("app_name", ApiClient.ParameterToString(appName)); // query parameter
             if (tenantName != null) headerParams.Add("tenant-name", ApiClient.ParameterToString(tenantName)); // header parameter
                            
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
    
    }
}
