# MarketingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaignDataUsingPost**](MarketingApi.md#createCampaignDataUsingPost) | **POST** /campaign_data | Create a campaign data record
[**createCampaignPlanUsingPost**](MarketingApi.md#createCampaignPlanUsingPost) | **POST** /campaign_plan | Create a campaign plan
[**createCampaignUsingPost**](MarketingApi.md#createCampaignUsingPost) | **POST** /campaign | Create a campaign
[**createClientCampaignUsingPost**](MarketingApi.md#createClientCampaignUsingPost) | **POST** /client_campaign | Mark a client signing up through a campaign
[**deleteCampaignDataUsingDelete**](MarketingApi.md#deleteCampaignDataUsingDelete) | **DELETE** /campaign_data/{campaign_data_id} | Delete a campaign data record
[**deleteCampaignPlanUsingDelete**](MarketingApi.md#deleteCampaignPlanUsingDelete) | **DELETE** /campaign_plan/{campaign_plan_id} | Delete a campaign plan
[**deleteCampaignUsingDelete**](MarketingApi.md#deleteCampaignUsingDelete) | **DELETE** /campaign/{campaign_id} | Delete a campaign
[**deleteClientCampaignUsingDelete**](MarketingApi.md#deleteClientCampaignUsingDelete) | **DELETE** /client_campaign/{client_campaign_id} | Delete a clients/ips pair under a campaign
[**getCampaignAllUsingGet**](MarketingApi.md#getCampaignAllUsingGet) | **GET** /campaign | List all campaigns
[**getCampaignDataAllUsingGet**](MarketingApi.md#getCampaignDataAllUsingGet) | **GET** /campaign_data | List all campaign data
[**getCampaignDataUsingGet**](MarketingApi.md#getCampaignDataUsingGet) | **GET** /campaign_data/{campaign_data_id} | Retrieve a campaign data record
[**getCampaignPlanAllUsingGet**](MarketingApi.md#getCampaignPlanAllUsingGet) | **GET** /campaign_plan | List all campaign plans
[**getCampaignPlanUsingGet**](MarketingApi.md#getCampaignPlanUsingGet) | **GET** /campaign_plan/{campaign_plan_id} | Retrieve a campaign plan
[**getCampaignUsingGet**](MarketingApi.md#getCampaignUsingGet) | **GET** /campaign/{campaign_id} | Retrieve a campaign
[**getClientCampaignAllUsingGet**](MarketingApi.md#getClientCampaignAllUsingGet) | **GET** /client_campaign | List all clients/ips under a campaign
[**getClientCampaignUsingGet**](MarketingApi.md#getClientCampaignUsingGet) | **GET** /client_campaign/{client_campaign_id} | Retrieve a clients/ips pair under a campaign
[**updateCampaignDataUsingPut**](MarketingApi.md#updateCampaignDataUsingPut) | **PUT** /campaign_data/{campaign_data_id} | Update a campaign data record
[**updateCampaignPlanUsingPut**](MarketingApi.md#updateCampaignPlanUsingPut) | **PUT** /campaign_plan/{campaign_plan_id} | Update a campaign plan
[**updateCampaignUsingPut**](MarketingApi.md#updateCampaignUsingPut) | **PUT** /campaign/{campaign_id} | Update a campaign
[**updateClientCampaignUsingPut**](MarketingApi.md#updateClientCampaignUsingPut) | **PUT** /client_campaign/{client_campaign_id} | Update a clients/ips pair under a campaign


<a name="createCampaignDataUsingPost"></a>
# **createCampaignDataUsingPost**
> CampaignData createCampaignDataUsingPost(campaignDataRequest)

Create a campaign data record

Create a new  campaign data record for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
CampaignData campaignDataRequest = new CampaignData(); // CampaignData | campaignDataRequest
try {
    CampaignData result = apiInstance.createCampaignDataUsingPost(campaignDataRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#createCampaignDataUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataRequest** | [**CampaignData**](CampaignData.md)| campaignDataRequest |

### Return type

[**CampaignData**](CampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCampaignPlanUsingPost"></a>
# **createCampaignPlanUsingPost**
> CampaignPlan createCampaignPlanUsingPost(campaignPlanRequest)

Create a campaign plan

Create a new campaign plan for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
CampaignPlan campaignPlanRequest = new CampaignPlan(); // CampaignPlan | campaignPlanRequest
try {
    CampaignPlan result = apiInstance.createCampaignPlanUsingPost(campaignPlanRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#createCampaignPlanUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanRequest** | [**CampaignPlan**](CampaignPlan.md)| campaignPlanRequest |

### Return type

[**CampaignPlan**](CampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCampaignUsingPost"></a>
# **createCampaignUsingPost**
> Campaign createCampaignUsingPost(campaignRequest)

Create a campaign

Create a new campaign for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
Campaign campaignRequest = new Campaign(); // Campaign | campaignRequest
try {
    Campaign result = apiInstance.createCampaignUsingPost(campaignRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#createCampaignUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignRequest** | [**Campaign**](Campaign.md)| campaignRequest |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createClientCampaignUsingPost"></a>
# **createClientCampaignUsingPost**
> ClientCampaignMapping createClientCampaignUsingPost(campaignMappingRequest)

Mark a client signing up through a campaign

We are adding a campaign association to a clientId or ip.  We create this association because we are trying to measure how affective a campaign is in directing traffic to our website.  

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
ClientCampaignMapping campaignMappingRequest = new ClientCampaignMapping(); // ClientCampaignMapping | campaignMappingRequest
try {
    ClientCampaignMapping result = apiInstance.createClientCampaignUsingPost(campaignMappingRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#createClientCampaignUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignMappingRequest** | [**ClientCampaignMapping**](ClientCampaignMapping.md)| campaignMappingRequest |

### Return type

[**ClientCampaignMapping**](ClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCampaignDataUsingDelete"></a>
# **deleteCampaignDataUsingDelete**
> deleteCampaignDataUsingDelete(campaignDataId)

Delete a campaign data record

Permanently delete a campaign data record

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
UUID campaignDataId = new UUID(); // UUID | UUID campaign_data_id
try {
    apiInstance.deleteCampaignDataUsingDelete(campaignDataId);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#deleteCampaignDataUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataId** | [**UUID**](.md)| UUID campaign_data_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteCampaignPlanUsingDelete"></a>
# **deleteCampaignPlanUsingDelete**
> deleteCampaignPlanUsingDelete(campaignPlanId)

Delete a campaign plan

Permanently delete a campaign plan

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
UUID campaignPlanId = new UUID(); // UUID | UUID campaign_plan_id
try {
    apiInstance.deleteCampaignPlanUsingDelete(campaignPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#deleteCampaignPlanUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanId** | [**UUID**](.md)| UUID campaign_plan_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteCampaignUsingDelete"></a>
# **deleteCampaignUsingDelete**
> deleteCampaignUsingDelete(campaignId)

Delete a campaign

Permanently delete a campaign

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
UUID campaignId = new UUID(); // UUID | Campaign Id
try {
    apiInstance.deleteCampaignUsingDelete(campaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#deleteCampaignUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | [**UUID**](.md)| Campaign Id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteClientCampaignUsingDelete"></a>
# **deleteClientCampaignUsingDelete**
> deleteClientCampaignUsingDelete(clientCampaignId)

Delete a clients/ips pair under a campaign

Permanently delete a clients/ips pair under a campaign

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
UUID clientCampaignId = new UUID(); // UUID | UUID client_campaign_id
try {
    apiInstance.deleteClientCampaignUsingDelete(clientCampaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#deleteClientCampaignUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | [**UUID**](.md)| UUID client_campaign_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCampaignAllUsingGet"></a>
# **getCampaignAllUsingGet**
> PageCampaign getCampaignAllUsingGet(ascending, filter, orderBy, page, size)

List all campaigns

Get details for all campaigns defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageCampaign result = apiInstance.getCampaignAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#getCampaignAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageCampaign**](PageCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCampaignDataAllUsingGet"></a>
# **getCampaignDataAllUsingGet**
> PageCampaignData getCampaignDataAllUsingGet(ascending, filter, orderBy, page, size)

List all campaign data

Get details for all campaign data defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageCampaignData result = apiInstance.getCampaignDataAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#getCampaignDataAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageCampaignData**](PageCampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCampaignDataUsingGet"></a>
# **getCampaignDataUsingGet**
> CampaignData getCampaignDataUsingGet(campaignDataId)

Retrieve a campaign data record

Retrieve the information for a campaign data record

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
UUID campaignDataId = new UUID(); // UUID | UUID campaign_data_id
try {
    CampaignData result = apiInstance.getCampaignDataUsingGet(campaignDataId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#getCampaignDataUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataId** | [**UUID**](.md)| UUID campaign_data_id |

### Return type

[**CampaignData**](CampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCampaignPlanAllUsingGet"></a>
# **getCampaignPlanAllUsingGet**
> PageCampaignPlan getCampaignPlanAllUsingGet(ascending, filter, orderBy, page, size)

List all campaign plans

Get details for all campaign plans defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageCampaignPlan result = apiInstance.getCampaignPlanAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#getCampaignPlanAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageCampaignPlan**](PageCampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCampaignPlanUsingGet"></a>
# **getCampaignPlanUsingGet**
> CampaignPlan getCampaignPlanUsingGet(campaignPlanId)

Retrieve a campaign plan

Retrieve the information for a campaign plan

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
UUID campaignPlanId = new UUID(); // UUID | UUID campaign_plan_id
try {
    CampaignPlan result = apiInstance.getCampaignPlanUsingGet(campaignPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#getCampaignPlanUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanId** | [**UUID**](.md)| UUID campaign_plan_id |

### Return type

[**CampaignPlan**](CampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCampaignUsingGet"></a>
# **getCampaignUsingGet**
> Campaign getCampaignUsingGet(campaignId)

Retrieve a campaign

Retrieve the information for a campaign.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
UUID campaignId = new UUID(); // UUID | Campaign Id
try {
    Campaign result = apiInstance.getCampaignUsingGet(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#getCampaignUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | [**UUID**](.md)| Campaign Id |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientCampaignAllUsingGet"></a>
# **getClientCampaignAllUsingGet**
> PageClientCampaignMapping getClientCampaignAllUsingGet(ascending, filter, orderBy, page, size)

List all clients/ips under a campaign

Get details for all clients/ips under a campaign

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageClientCampaignMapping result = apiInstance.getClientCampaignAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#getClientCampaignAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageClientCampaignMapping**](PageClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientCampaignUsingGet"></a>
# **getClientCampaignUsingGet**
> ClientCampaignMapping getClientCampaignUsingGet(clientCampaignId)

Retrieve a clients/ips pair under a campaign

Retrieve the information for a clients/ips pair under a campaign

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
UUID clientCampaignId = new UUID(); // UUID | UUID client_campaign_id
try {
    ClientCampaignMapping result = apiInstance.getClientCampaignUsingGet(clientCampaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#getClientCampaignUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | [**UUID**](.md)| UUID client_campaign_id |

### Return type

[**ClientCampaignMapping**](ClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCampaignDataUsingPut"></a>
# **updateCampaignDataUsingPut**
> CampaignData updateCampaignDataUsingPut(campaignData, campaignDataId)

Update a campaign data record

Updated the information for a campaign data record

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
CampaignPlan campaignData = new CampaignPlan(); // CampaignPlan | campaign_data
UUID campaignDataId = new UUID(); // UUID | UUID campaign_data_id
try {
    CampaignData result = apiInstance.updateCampaignDataUsingPut(campaignData, campaignDataId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#updateCampaignDataUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignData** | [**CampaignPlan**](CampaignPlan.md)| campaign_data |
 **campaignDataId** | [**UUID**](.md)| UUID campaign_data_id |

### Return type

[**CampaignData**](CampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCampaignPlanUsingPut"></a>
# **updateCampaignPlanUsingPut**
> CampaignPlan updateCampaignPlanUsingPut(campaignPlan, campaignPlanId)

Update a campaign plan

Updated the information for a campaign plan

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
CampaignPlan campaignPlan = new CampaignPlan(); // CampaignPlan | campaign_plan
UUID campaignPlanId = new UUID(); // UUID | UUID campaign_plan_id
try {
    CampaignPlan result = apiInstance.updateCampaignPlanUsingPut(campaignPlan, campaignPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#updateCampaignPlanUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlan** | [**CampaignPlan**](CampaignPlan.md)| campaign_plan |
 **campaignPlanId** | [**UUID**](.md)| UUID campaign_plan_id |

### Return type

[**CampaignPlan**](CampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCampaignUsingPut"></a>
# **updateCampaignUsingPut**
> Campaign updateCampaignUsingPut(campaign, campaignId)

Update a campaign

Updated the information for a campaign

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
Campaign campaign = new Campaign(); // Campaign | campaign
UUID campaignId = new UUID(); // UUID | UUID campaign_id
try {
    Campaign result = apiInstance.updateCampaignUsingPut(campaign, campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#updateCampaignUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign** | [**Campaign**](Campaign.md)| campaign |
 **campaignId** | [**UUID**](.md)| UUID campaign_id |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateClientCampaignUsingPut"></a>
# **updateClientCampaignUsingPut**
> ClientCampaignMapping updateClientCampaignUsingPut(clientCampaignId, jsonNode)

Update a clients/ips pair under a campaign

Updated the information for clients/ips pair under a campaign

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import MarketingApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


MarketingApi apiInstance = new MarketingApi();
UUID clientCampaignId = new UUID(); // UUID | UUID client_campaign_id
JsonNode jsonNode = new JsonNode(); // JsonNode | jsonNode
try {
    ClientCampaignMapping result = apiInstance.updateClientCampaignUsingPut(clientCampaignId, jsonNode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketingApi#updateClientCampaignUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | [**UUID**](.md)| UUID client_campaign_id |
 **jsonNode** | [**JsonNode**](JsonNode.md)| jsonNode |

### Return type

[**ClientCampaignMapping**](ClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

