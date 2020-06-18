# HydrogenNucleusApi.FAQApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFaqUsingPost**](FAQApi.md#createFaqUsingPost) | **POST** /faq | Create a FAQ
[**deleteFaqUsingDelete**](FAQApi.md#deleteFaqUsingDelete) | **DELETE** /faq/{faq_id} | Delete a FAQ
[**getFaqAllUsingGet**](FAQApi.md#getFaqAllUsingGet) | **GET** /faq | List all FAQ
[**getFaqUsingGet**](FAQApi.md#getFaqUsingGet) | **GET** /faq/{faq_id} | Retrieve a FAQ
[**updateFaqUsingPut**](FAQApi.md#updateFaqUsingPut) | **PUT** /faq/{faq_id} | Update a FAQ


<a name="createFaqUsingPost"></a>
# **createFaqUsingPost**
> Faq createFaqUsingPost(faqRequest)

Create a FAQ

Create a new FAQ

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FAQApi();

var faqRequest = new HydrogenNucleusApi.Faq(); // Faq | faqRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createFaqUsingPost(faqRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqRequest** | [**Faq**](Faq.md)| faqRequest | 

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteFaqUsingDelete"></a>
# **deleteFaqUsingDelete**
> deleteFaqUsingDelete(faqId)

Delete a FAQ

Permanently delete a FAQ

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FAQApi();

var faqId = "8397d8fd-e80d-48ea-bf79-81f32b12606e"; // String | UUID faq_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteFaqUsingDelete(faqId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | **String**| UUID faq_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFaqAllUsingGet"></a>
# **getFaqAllUsingGet**
> PageFaq getFaqAllUsingGet(opts)

List all FAQ

Get the information for all FAQ

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FAQApi();

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
apiInstance.getFaqAllUsingGet(opts, callback);
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

[**PageFaq**](PageFaq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFaqUsingGet"></a>
# **getFaqUsingGet**
> Faq getFaqUsingGet(faqId)

Retrieve a FAQ

Retrieve the information for a FAQ

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FAQApi();

var faqId = "8397d8fd-e80d-48ea-bf79-81f32b12606e"; // String | UUID faq_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFaqUsingGet(faqId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | **String**| UUID faq_id | 

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateFaqUsingPut"></a>
# **updateFaqUsingPut**
> Faq updateFaqUsingPut(faq, faqId)

Update a FAQ

Update the information for a FAQ

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FAQApi();

var faq = new HydrogenNucleusApi.Faq(); // Faq | faq

var faqId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID faq_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateFaqUsingPut(faq, faqId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq** | [**Faq**](Faq.md)| faq | 
 **faqId** | **String**| UUID faq_id | 

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

