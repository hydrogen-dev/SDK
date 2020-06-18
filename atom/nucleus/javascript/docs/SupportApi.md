# HydrogenNucleusApi.SupportApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatUsingPost**](SupportApi.md#createChatUsingPost) | **POST** /chat | Create a Chat
[**createConsultationUsingPost**](SupportApi.md#createConsultationUsingPost) | **POST** /consultation | Create a CIO Consultation
[**createSaleUsingPost**](SupportApi.md#createSaleUsingPost) | **POST** /sales | Create a sales inquiry
[**createSupportTicketCommentUsingPost**](SupportApi.md#createSupportTicketCommentUsingPost) | **POST** /support_ticket_comment | Create a support ticket comment
[**createSupportTicketUsingPost**](SupportApi.md#createSupportTicketUsingPost) | **POST** /support_ticket | Create a support ticket
[**deleteChatUsingDelete**](SupportApi.md#deleteChatUsingDelete) | **DELETE** /chat/{chat_id} | Delete a Chat
[**deleteConsultationUsingDelete**](SupportApi.md#deleteConsultationUsingDelete) | **DELETE** /consultation/{consultation_id} | Delete a CIO Consultation
[**deleteSaleUsingDelete**](SupportApi.md#deleteSaleUsingDelete) | **DELETE** /sales/{sales_id} | Delete a sales inquiry
[**deleteSupportTicketCommentUsingDelete**](SupportApi.md#deleteSupportTicketCommentUsingDelete) | **DELETE** /support_ticket_comment/{support_ticket_comment_id} | Delete a support ticket comment
[**deleteSupportTicketUsingDelete**](SupportApi.md#deleteSupportTicketUsingDelete) | **DELETE** /support_ticket/{support_ticket_id} | Delete a support ticket
[**getChatAllUsingGet**](SupportApi.md#getChatAllUsingGet) | **GET** /chat | List all open chats
[**getChatUsingGet**](SupportApi.md#getChatUsingGet) | **GET** /chat/{chat_id} | Retrieve a Chat
[**getConsultationAllUsingGet**](SupportApi.md#getConsultationAllUsingGet) | **GET** /consultation | List all CIO Consultation
[**getConsultationUsingGet**](SupportApi.md#getConsultationUsingGet) | **GET** /consultation/{consultation_id} | Retrieve a CIO Consultation
[**getSaleAllUsingGet**](SupportApi.md#getSaleAllUsingGet) | **GET** /sales | List all sales inquiries
[**getSaleUsingGet**](SupportApi.md#getSaleUsingGet) | **GET** /sales/{sales_id} | Retrieve a sales record
[**getSupportTicketAllUsingGet**](SupportApi.md#getSupportTicketAllUsingGet) | **GET** /support_ticket | List all support tickets
[**getSupportTicketCommentAllUsingGet**](SupportApi.md#getSupportTicketCommentAllUsingGet) | **GET** /support_ticket_comment | List all support ticket comments
[**getSupportTicketCommentUsingGet**](SupportApi.md#getSupportTicketCommentUsingGet) | **GET** /support_ticket_comment/{support_ticket_comment_id} | Retrieve a support ticket comment
[**getSupportTicketUsingGet**](SupportApi.md#getSupportTicketUsingGet) | **GET** /support_ticket/{support_ticket_id} | Retrieve a support ticket
[**updateChatUsingPut**](SupportApi.md#updateChatUsingPut) | **PUT** /chat/{chat_id} | Update a Chat
[**updateConsultationUsingPut**](SupportApi.md#updateConsultationUsingPut) | **PUT** /consultation/{consultation_id} | Update a CIO Consultation
[**updateSaleUsingPut**](SupportApi.md#updateSaleUsingPut) | **PUT** /sales/{sales_id} | Update a sales inquiry
[**updateSupportTicketCommentUsingPut**](SupportApi.md#updateSupportTicketCommentUsingPut) | **PUT** /support_ticket_comment/{support_ticket_comment_id} | Update a support ticket comment
[**updateSupportTicketUsingPut**](SupportApi.md#updateSupportTicketUsingPut) | **PUT** /support_ticket/{support_ticket_id} | Update a support ticket


<a name="createChatUsingPost"></a>
# **createChatUsingPost**
> ChatInfo createChatUsingPost(chatInfoRequest)

Create a Chat

Create a Chat

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var chatInfoRequest = new HydrogenNucleusApi.ChatInfo(); // ChatInfo | chatInfoRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createChatUsingPost(chatInfoRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatInfoRequest** | [**ChatInfo**](ChatInfo.md)| chatInfoRequest | 

### Return type

[**ChatInfo**](ChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createConsultationUsingPost"></a>
# **createConsultationUsingPost**
> Consultation createConsultationUsingPost(cioConsultationRequest)

Create a CIO Consultation

Create a new CIO Consultation

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var cioConsultationRequest = new HydrogenNucleusApi.Consultation(); // Consultation | cioConsultationRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createConsultationUsingPost(cioConsultationRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cioConsultationRequest** | [**Consultation**](Consultation.md)| cioConsultationRequest | 

### Return type

[**Consultation**](Consultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSaleUsingPost"></a>
# **createSaleUsingPost**
> Sale createSaleUsingPost(saleRequest)

Create a sales inquiry

Create a new sales inquiry for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var saleRequest = new HydrogenNucleusApi.Sale(); // Sale | saleRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createSaleUsingPost(saleRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saleRequest** | [**Sale**](Sale.md)| saleRequest | 

### Return type

[**Sale**](Sale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSupportTicketCommentUsingPost"></a>
# **createSupportTicketCommentUsingPost**
> SupportTicket createSupportTicketCommentUsingPost(supportTickerCommentRequest)

Create a support ticket comment

Create a new support ticket comment for a support ticket.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var supportTickerCommentRequest = new HydrogenNucleusApi.SupportTicketComment(); // SupportTicketComment | supportTickerCommentRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createSupportTicketCommentUsingPost(supportTickerCommentRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTickerCommentRequest** | [**SupportTicketComment**](SupportTicketComment.md)| supportTickerCommentRequest | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSupportTicketUsingPost"></a>
# **createSupportTicketUsingPost**
> SupportTicket createSupportTicketUsingPost(supportTicketRequest)

Create a support ticket

Create a new support ticket for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var supportTicketRequest = new HydrogenNucleusApi.SupportTicket(); // SupportTicket | supportTicketRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createSupportTicketUsingPost(supportTicketRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketRequest** | [**SupportTicket**](SupportTicket.md)| supportTicketRequest | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteChatUsingDelete"></a>
# **deleteChatUsingDelete**
> deleteChatUsingDelete(chatId)

Delete a Chat

Permanently delete a Chat

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var chatId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID chat_info_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteChatUsingDelete(chatId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| UUID chat_info_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteConsultationUsingDelete"></a>
# **deleteConsultationUsingDelete**
> deleteConsultationUsingDelete(consultationId)

Delete a CIO Consultation

Permanently delete a CIO Consultation

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var consultationId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID consultation_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteConsultationUsingDelete(consultationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | **String**| UUID consultation_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteSaleUsingDelete"></a>
# **deleteSaleUsingDelete**
> deleteSaleUsingDelete(salesId)

Delete a sales inquiry

Permanently delete a sales inquiry.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var salesId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID sales_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSaleUsingDelete(salesId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesId** | **String**| UUID sales_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteSupportTicketCommentUsingDelete"></a>
# **deleteSupportTicketCommentUsingDelete**
> deleteSupportTicketCommentUsingDelete(supportTicketCommentId)

Delete a support ticket comment

Permanently delete a support ticket comment for a support ticket.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var supportTicketCommentId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID support_ticket_comment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSupportTicketCommentUsingDelete(supportTicketCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketCommentId** | **String**| UUID support_ticket_comment_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteSupportTicketUsingDelete"></a>
# **deleteSupportTicketUsingDelete**
> deleteSupportTicketUsingDelete(supportTicketId)

Delete a support ticket

Permanently delete a support ticket for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var supportTicketId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID support_ticket_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSupportTicketUsingDelete(supportTicketId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketId** | **String**| UUID support_ticket_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChatAllUsingGet"></a>
# **getChatAllUsingGet**
> PageChatInfo getChatAllUsingGet(opts)

List all open chats

Get details for all open chat

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

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
apiInstance.getChatAllUsingGet(opts, callback);
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

[**PageChatInfo**](PageChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChatUsingGet"></a>
# **getChatUsingGet**
> ChatInfo getChatUsingGet(chatId)

Retrieve a Chat

Retrieve the information for a Chat

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var chatId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID chat_info_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getChatUsingGet(chatId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| UUID chat_info_id | 

### Return type

[**ChatInfo**](ChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getConsultationAllUsingGet"></a>
# **getConsultationAllUsingGet**
> PageConsultation getConsultationAllUsingGet(opts)

List all CIO Consultation

Get details for all CIO Consultation

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

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
apiInstance.getConsultationAllUsingGet(opts, callback);
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

[**PageConsultation**](PageConsultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getConsultationUsingGet"></a>
# **getConsultationUsingGet**
> Consultation getConsultationUsingGet(consultationId)

Retrieve a CIO Consultation

Retrieve the information for a CIO Consultation

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var consultationId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID consultation_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getConsultationUsingGet(consultationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | **String**| UUID consultation_id | 

### Return type

[**Consultation**](Consultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSaleAllUsingGet"></a>
# **getSaleAllUsingGet**
> PageSale getSaleAllUsingGet(opts)

List all sales inquiries

Get all sales inquiries defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

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
apiInstance.getSaleAllUsingGet(opts, callback);
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

[**PageSale**](PageSale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSaleUsingGet"></a>
# **getSaleUsingGet**
> Sale getSaleUsingGet(salesId)

Retrieve a sales record

Retrieve the information for a sales record

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var salesId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID sales_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSaleUsingGet(salesId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesId** | **String**| UUID sales_id | 

### Return type

[**Sale**](Sale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSupportTicketAllUsingGet"></a>
# **getSupportTicketAllUsingGet**
> PageSupportTicket getSupportTicketAllUsingGet(opts)

List all support tickets

Get the information for all support tickets defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

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
apiInstance.getSupportTicketAllUsingGet(opts, callback);
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

[**PageSupportTicket**](PageSupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSupportTicketCommentAllUsingGet"></a>
# **getSupportTicketCommentAllUsingGet**
> PageSupportTicketComment getSupportTicketCommentAllUsingGet(opts)

List all support ticket comments

Get the information for all support ticket comments defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

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
apiInstance.getSupportTicketCommentAllUsingGet(opts, callback);
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

[**PageSupportTicketComment**](PageSupportTicketComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSupportTicketCommentUsingGet"></a>
# **getSupportTicketCommentUsingGet**
> SupportTicketComment getSupportTicketCommentUsingGet(supportTicketCommentId)

Retrieve a support ticket comment

Retrieve the information for a support ticket comment defined for a support ticket.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var supportTicketCommentId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID support_ticket_comment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSupportTicketCommentUsingGet(supportTicketCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketCommentId** | **String**| UUID support_ticket_comment_id | 

### Return type

[**SupportTicketComment**](SupportTicketComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSupportTicketUsingGet"></a>
# **getSupportTicketUsingGet**
> SupportTicket getSupportTicketUsingGet(supportTicketId)

Retrieve a support ticket

Retrieve the information for a support ticket defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var supportTicketId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID support_ticket_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSupportTicketUsingGet(supportTicketId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketId** | **String**| UUID support_ticket_id | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateChatUsingPut"></a>
# **updateChatUsingPut**
> ChatInfo updateChatUsingPut(chatId, chatInfo)

Update a Chat

Updated the information for a Chat

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var chatId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID chat_id

var chatInfo = new HydrogenNucleusApi.ChatInfo(); // ChatInfo | chat_info


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateChatUsingPut(chatId, chatInfo, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| UUID chat_id | 
 **chatInfo** | [**ChatInfo**](ChatInfo.md)| chat_info | 

### Return type

[**ChatInfo**](ChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateConsultationUsingPut"></a>
# **updateConsultationUsingPut**
> Consultation updateConsultationUsingPut(consultation, consultationId)

Update a CIO Consultation

Updated the information CIO Consultation

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var consultation = new HydrogenNucleusApi.Consultation(); // Consultation | consultation

var consultationId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID consultation_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateConsultationUsingPut(consultation, consultationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation** | [**Consultation**](Consultation.md)| consultation | 
 **consultationId** | **String**| UUID consultation_id | 

### Return type

[**Consultation**](Consultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSaleUsingPut"></a>
# **updateSaleUsingPut**
> Sale updateSaleUsingPut(sales, salesId)

Update a sales inquiry

Update the information for a sales inquiry. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var sales = new HydrogenNucleusApi.Sale(); // Sale | sales

var salesId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID sales_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSaleUsingPut(sales, salesId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales** | [**Sale**](Sale.md)| sales | 
 **salesId** | **String**| UUID sales_id | 

### Return type

[**Sale**](Sale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSupportTicketCommentUsingPut"></a>
# **updateSupportTicketCommentUsingPut**
> SupportTicketComment updateSupportTicketCommentUsingPut(supportTicketComment, supportTicketCommentId)

Update a support ticket comment

Update the information for a support ticket comments defined for a support ticket.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var supportTicketComment = new HydrogenNucleusApi.SupportTicketComment(); // SupportTicketComment | support_ticket_comment

var supportTicketCommentId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID support_ticket_comment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSupportTicketCommentUsingPut(supportTicketComment, supportTicketCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketComment** | [**SupportTicketComment**](SupportTicketComment.md)| support_ticket_comment | 
 **supportTicketCommentId** | **String**| UUID support_ticket_comment_id | 

### Return type

[**SupportTicketComment**](SupportTicketComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSupportTicketUsingPut"></a>
# **updateSupportTicketUsingPut**
> SupportTicket updateSupportTicketUsingPut(supportTicket, supportTicketId)

Update a support ticket

Update the information for a support ticket defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SupportApi();

var supportTicket = new HydrogenNucleusApi.SupportTicket(); // SupportTicket | support_ticket

var supportTicketId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID support_ticket_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSupportTicketUsingPut(supportTicket, supportTicketId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicket** | [**SupportTicket**](SupportTicket.md)| support_ticket | 
 **supportTicketId** | **String**| UUID support_ticket_id | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

