# HydrogenNucleusApi.MarketingApi

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignDataRequest = new HydrogenNucleusApi.CampaignData(); // CampaignData | campaignDataRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCampaignDataUsingPost(campaignDataRequest, callback);
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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignPlanRequest = new HydrogenNucleusApi.CampaignPlan(); // CampaignPlan | campaignPlanRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCampaignPlanUsingPost(campaignPlanRequest, callback);
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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignRequest = new HydrogenNucleusApi.Campaign(); // Campaign | campaignRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCampaignUsingPost(campaignRequest, callback);
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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignMappingRequest = new HydrogenNucleusApi.ClientCampaignMapping(); // ClientCampaignMapping | campaignMappingRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createClientCampaignUsingPost(campaignMappingRequest, callback);
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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignDataId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID campaign_data_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCampaignDataUsingDelete(campaignDataId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataId** | **String**| UUID campaign_data_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignPlanId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID campaign_plan_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCampaignPlanUsingDelete(campaignPlanId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanId** | **String**| UUID campaign_plan_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | Campaign Id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCampaignUsingDelete(campaignId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign Id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var clientCampaignId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID client_campaign_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteClientCampaignUsingDelete(clientCampaignId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | **String**| UUID client_campaign_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCampaignAllUsingGet"></a>
# **getCampaignAllUsingGet**
> PageCampaign getCampaignAllUsingGet(opts)

List all campaigns

Get details for all campaigns defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaignAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageCampaign**](PageCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCampaignDataAllUsingGet"></a>
# **getCampaignDataAllUsingGet**
> PageCampaignData getCampaignDataAllUsingGet(opts)

List all campaign data

Get details for all campaign data defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaignDataAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignDataId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID campaign_data_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaignDataUsingGet(campaignDataId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataId** | **String**| UUID campaign_data_id | 

### Return type

[**CampaignData**](CampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCampaignPlanAllUsingGet"></a>
# **getCampaignPlanAllUsingGet**
> PageCampaignPlan getCampaignPlanAllUsingGet(opts)

List all campaign plans

Get details for all campaign plans defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaignPlanAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignPlanId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID campaign_plan_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaignPlanUsingGet(campaignPlanId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanId** | **String**| UUID campaign_plan_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | Campaign Id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaignUsingGet(campaignId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| Campaign Id | 

### Return type

[**Campaign**](Campaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientCampaignAllUsingGet"></a>
# **getClientCampaignAllUsingGet**
> PageClientCampaignMapping getClientCampaignAllUsingGet(opts)

List all clients/ips under a campaign

Get details for all clients/ips under a campaign

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientCampaignAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var clientCampaignId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID client_campaign_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientCampaignUsingGet(clientCampaignId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | **String**| UUID client_campaign_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignData = new HydrogenNucleusApi.CampaignPlan(); // CampaignPlan | campaign_data

var campaignDataId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID campaign_data_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCampaignDataUsingPut(campaignData, campaignDataId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignData** | [**CampaignPlan**](CampaignPlan.md)| campaign_data | 
 **campaignDataId** | **String**| UUID campaign_data_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaignPlan = new HydrogenNucleusApi.CampaignPlan(); // CampaignPlan | campaign_plan

var campaignPlanId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID campaign_plan_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCampaignPlanUsingPut(campaignPlan, campaignPlanId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlan** | [**CampaignPlan**](CampaignPlan.md)| campaign_plan | 
 **campaignPlanId** | **String**| UUID campaign_plan_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var campaign = new HydrogenNucleusApi.Campaign(); // Campaign | campaign

var campaignId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID campaign_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCampaignUsingPut(campaign, campaignId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign** | [**Campaign**](Campaign.md)| campaign | 
 **campaignId** | **String**| UUID campaign_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.MarketingApi();

var clientCampaignId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID client_campaign_id

var jsonNode = new HydrogenNucleusApi.JsonNode(); // JsonNode | jsonNode


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateClientCampaignUsingPut(clientCampaignId, jsonNode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | **String**| UUID client_campaign_id | 
 **jsonNode** | [**JsonNode**](JsonNode.md)| jsonNode | 

### Return type

[**ClientCampaignMapping**](ClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

