# atom_api.ElectronApi

All URIs are relative to *https://sandbox.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCampaign**](ElectronApi.md#deleteCampaign) | **DELETE** /electron/v1/campaign/{campaign_id} | Delete a marketing campaign
[**deleteCampaignDataRecord**](ElectronApi.md#deleteCampaignDataRecord) | **DELETE** /electron/v1/campaign_data/{campaign_data_id} | Delete a marketing campaign data record
[**deleteCampaignPlan**](ElectronApi.md#deleteCampaignPlan) | **DELETE** /electron/v1/campaign_plan/{campaign_plan_id} | Delete a marketing campaign plan
[**deleteChatLog**](ElectronApi.md#deleteChatLog) | **DELETE** /electron/v1/chat/{chat_id} | Delete a chat log
[**deleteClientCampaign**](ElectronApi.md#deleteClientCampaign) | **DELETE** /electron/v1/client_campaign/{client_campaign_id} | Remove a client from a campaign
[**deleteConsultation**](ElectronApi.md#deleteConsultation) | **DELETE** /electron/v1/consultation/{consultation_id} | Delete a consultation
[**deleteDocument**](ElectronApi.md#deleteDocument) | **DELETE** /electron/v1/document/{document_id} | Delete a document
[**deleteFaq**](ElectronApi.md#deleteFaq) | **DELETE** /electron/v1/faq/{faq_id} | Delete a FAQ
[**deleteSalesInquiry**](ElectronApi.md#deleteSalesInquiry) | **DELETE** /electron/v1/sales/{sales_id} | Delete a sales inquiry
[**deleteSupportTicket**](ElectronApi.md#deleteSupportTicket) | **DELETE** /electron/v1/support_ticket/{support_ticket_id} | Delete a support ticket
[**deleteSupportTicketComment**](ElectronApi.md#deleteSupportTicketComment) | **DELETE** /electron/v1/support_ticket_comment/{support_ticket_comment_id} | Delete a support ticket comment
[**getCampaign**](ElectronApi.md#getCampaign) | **GET** /electron/v1/campaign/{campaign_id} | Retrieve a marketing campaign
[**getCampaignDataRecord**](ElectronApi.md#getCampaignDataRecord) | **GET** /electron/v1/campaign_data/{campaign_data_id} | Retrieve a marketing campaign data record
[**getCampaignDataRecords**](ElectronApi.md#getCampaignDataRecords) | **GET** /electron/v1/campaign_data | List all marketing campaign data records
[**getCampaignPlan**](ElectronApi.md#getCampaignPlan) | **GET** /electron/v1/campaign_plan/{campaign_plan_id} | Retrieve a marketing campaign plan
[**getCampaignPlans**](ElectronApi.md#getCampaignPlans) | **GET** /electron/v1/campaign_plan | List all marketing campaign plans
[**getCampaigns**](ElectronApi.md#getCampaigns) | **GET** /electron/v1/campaign | List all marketing campaigns
[**getChatLog**](ElectronApi.md#getChatLog) | **GET** /electron/v1/chat/{chat_id} | Retrieve a chat log
[**getChatLogs**](ElectronApi.md#getChatLogs) | **GET** /electron/v1/chat | List all chat logs
[**getClientCampaign**](ElectronApi.md#getClientCampaign) | **GET** /electron/v1/client_campaign/{client_campaign_id} | Retrieve a client assigned to a campaign
[**getClientCampaigns**](ElectronApi.md#getClientCampaigns) | **GET** /electron/v1/client_campaign | List information for all clients that are assigned to a marketing campaign defined for your firm
[**getConsultation**](ElectronApi.md#getConsultation) | **GET** /electron/v1/consultation/{consultation_id} | Retrieve a consultation
[**getConsultations**](ElectronApi.md#getConsultations) | **GET** /electron/v1/consultation | List all consultations
[**getDocument**](ElectronApi.md#getDocument) | **GET** /electron/v1/document/{document_id} | Retrieve a document
[**getDocuments**](ElectronApi.md#getDocuments) | **GET** /electron/v1/document | List all documents
[**getFaq**](ElectronApi.md#getFaq) | **GET** /electron/v1/faq/{faq_id} | Retrieve a FAQ
[**getFaqs**](ElectronApi.md#getFaqs) | **GET** /electron/v1/faq | List all FAQs
[**getSalesInquiries**](ElectronApi.md#getSalesInquiries) | **GET** /electron/v1/sales | List all sales inquiries
[**getSalesInquiry**](ElectronApi.md#getSalesInquiry) | **GET** /electron/v1/sales/{sales_id} | Retrieve a sales inquiry
[**getSupportTicket**](ElectronApi.md#getSupportTicket) | **GET** /electron/v1/support_ticket/{support_ticket_id} | Retrieve a support ticket
[**getSupportTicketComment**](ElectronApi.md#getSupportTicketComment) | **GET** /electron/v1/support_ticket_comment/{support_ticket_comment_id} | Retrieve a support ticket comment
[**getSupportTicketComments**](ElectronApi.md#getSupportTicketComments) | **GET** /electron/v1/support_ticket_comment | List all support ticket comments
[**getSupportTickets**](ElectronApi.md#getSupportTickets) | **GET** /electron/v1/support_ticket | List all support tickets
[**postCampaign**](ElectronApi.md#postCampaign) | **POST** /electron/v1/campaign | Create a marketing campaign
[**postCampaignDataRecord**](ElectronApi.md#postCampaignDataRecord) | **POST** /electron/v1/campaign_data | Create a marketing campaign data record
[**postCampaignPlan**](ElectronApi.md#postCampaignPlan) | **POST** /electron/v1/campaign_plan | Create a marketing campaign plan
[**postChatLog**](ElectronApi.md#postChatLog) | **POST** /electron/v1/chat | Create a chat log
[**postClientCampaign**](ElectronApi.md#postClientCampaign) | **POST** /electron/v1/client_campaign | Assign a client to a campaign to indicate the client has registered through the campaign specified
[**postConsultation**](ElectronApi.md#postConsultation) | **POST** /electron/v1/consultation | Create a consultation
[**postDocument**](ElectronApi.md#postDocument) | **POST** /electron/v1/document | Create a document
[**postFaq**](ElectronApi.md#postFaq) | **POST** /electron/v1/faq | Create a faq
[**postSalesInquiry**](ElectronApi.md#postSalesInquiry) | **POST** /electron/v1/sales | Create a sales inquiry
[**postSupportTicket**](ElectronApi.md#postSupportTicket) | **POST** /electron/v1/support_ticket | Create a support ticket
[**postSupportTicketComment**](ElectronApi.md#postSupportTicketComment) | **POST** /electron/v1/support_ticket_comment | Create a support ticket comment
[**updateCampaign**](ElectronApi.md#updateCampaign) | **PUT** /electron/v1/campaign/{campaign_id} | Update a marketing campaign
[**updateCampaignDataRecord**](ElectronApi.md#updateCampaignDataRecord) | **PUT** /electron/v1/campaign_data/{campaign_data_id} | Update a marketing campaign data record
[**updateCampaignPlan**](ElectronApi.md#updateCampaignPlan) | **PUT** /electron/v1/campaign_plan/{campaign_plan_id} | Update a marketing campaign plan
[**updateChatLog**](ElectronApi.md#updateChatLog) | **PUT** /electron/v1/chat/{chat_id} | Update a chat log
[**updateClientCampaign**](ElectronApi.md#updateClientCampaign) | **PUT** /electron/v1/client_campaign/{client_campaign_id} | Update a client assigned to a campaign
[**updateConsultation**](ElectronApi.md#updateConsultation) | **PUT** /electron/v1/consultation/{consultation_id} | Update a consultation
[**updateDocument**](ElectronApi.md#updateDocument) | **PUT** /electron/v1/document/{document_id} | Update a document
[**updateFaq**](ElectronApi.md#updateFaq) | **PUT** /electron/v1/faq/{faq_id} | Update a FAQ
[**updateSalesInquiry**](ElectronApi.md#updateSalesInquiry) | **PUT** /electron/v1/sales/{sales_id} | Update a sales inquiry
[**updateSupportTicket**](ElectronApi.md#updateSupportTicket) | **PUT** /electron/v1/support_ticket/{support_ticket_id} | Update a support ticket
[**updateSupportTicketComment**](ElectronApi.md#updateSupportTicketComment) | **PUT** /electron/v1/support_ticket_comment/{support_ticket_comment_id} | Update a support ticket comment


<a name="deleteCampaign"></a>
# **deleteCampaign**
> deleteCampaign(campaignId)

Delete a marketing campaign

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var campaignId = "campaignId_example"; // String | UUID of a marketing campaign


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCampaign(campaignId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | [**String**](.md)| UUID of a marketing campaign | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCampaignDataRecord"></a>
# **deleteCampaignDataRecord**
> deleteCampaignDataRecord(campaignDataId)

Delete a marketing campaign data record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var campaignDataId = "campaignDataId_example"; // String | UUID of a campaign data record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCampaignDataRecord(campaignDataId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataId** | [**String**](.md)| UUID of a campaign data record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCampaignPlan"></a>
# **deleteCampaignPlan**
> deleteCampaignPlan(campaignPlanId)

Delete a marketing campaign plan

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var campaignPlanId = "campaignPlanId_example"; // String | UUID of a campaign plan


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCampaignPlan(campaignPlanId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanId** | [**String**](.md)| UUID of a campaign plan | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteChatLog"></a>
# **deleteChatLog**
> deleteChatLog(chatId)

Delete a chat log

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var chatId = "chatId_example"; // String | UUID of a chat record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteChatLog(chatId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**String**](.md)| UUID of a chat record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClientCampaign"></a>
# **deleteClientCampaign**
> deleteClientCampaign(clientCampaignId)

Remove a client from a campaign

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var clientCampaignId = "clientCampaignId_example"; // String | UUID of a client campaign record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteClientCampaign(clientCampaignId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | [**String**](.md)| UUID of a client campaign record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteConsultation"></a>
# **deleteConsultation**
> deleteConsultation(consultationId)

Delete a consultation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var consultationId = "consultationId_example"; // String | UUID of a consultation record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteConsultation(consultationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**String**](.md)| UUID of a consultation record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocument"></a>
# **deleteDocument**
> deleteDocument(documentId)

Delete a document

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var documentId = "documentId_example"; // String | UUID of a document


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteDocument(documentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | [**String**](.md)| UUID of a document | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFaq"></a>
# **deleteFaq**
> deleteFaq(faqId)

Delete a FAQ

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var faqId = "faqId_example"; // String | UUID of a FAQ


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteFaq(faqId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**String**](.md)| UUID of a FAQ | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSalesInquiry"></a>
# **deleteSalesInquiry**
> deleteSalesInquiry(salesId)

Delete a sales inquiry

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var salesId = "salesId_example"; // String | UUID of a sales record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSalesInquiry(salesId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesId** | [**String**](.md)| UUID of a sales record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSupportTicket"></a>
# **deleteSupportTicket**
> deleteSupportTicket(supportTicketId)

Delete a support ticket

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var supportTicketId = "supportTicketId_example"; // String | UUID of a support ticket


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSupportTicket(supportTicketId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketId** | [**String**](.md)| UUID of a support ticket | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSupportTicketComment"></a>
# **deleteSupportTicketComment**
> deleteSupportTicketComment(supportTicketCommentId)

Delete a support ticket comment

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var supportTicketCommentId = "supportTicketCommentId_example"; // String | UUID of a support ticket comment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSupportTicketComment(supportTicketCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketCommentId** | [**String**](.md)| UUID of a support ticket comment | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaign"></a>
# **getCampaign**
> SpecificCampaignResponse getCampaign(campaignId)

Retrieve a marketing campaign

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var campaignId = "campaignId_example"; // String | UUID of a marketing campaign


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaign(campaignId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | [**String**](.md)| UUID of a marketing campaign | 

### Return type

[**SpecificCampaignResponse**](SpecificCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignDataRecord"></a>
# **getCampaignDataRecord**
> SpecificCampaignDataResponse getCampaignDataRecord(campaignDataId)

Retrieve a marketing campaign data record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var campaignDataId = "campaignDataId_example"; // String | UUID of a campaign data record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaignDataRecord(campaignDataId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataId** | [**String**](.md)| UUID of a campaign data record | 

### Return type

[**SpecificCampaignDataResponse**](SpecificCampaignDataResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignDataRecords"></a>
# **getCampaignDataRecords**
> GetCampaignDataResponse getCampaignDataRecords(opts)

List all marketing campaign data records

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaignDataRecords(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetCampaignDataResponse**](GetCampaignDataResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignPlan"></a>
# **getCampaignPlan**
> SpecificCampaignPlanResponse getCampaignPlan(campaignPlanId)

Retrieve a marketing campaign plan

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var campaignPlanId = "campaignPlanId_example"; // String | UUID of a campaign plan


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaignPlan(campaignPlanId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanId** | [**String**](.md)| UUID of a campaign plan | 

### Return type

[**SpecificCampaignPlanResponse**](SpecificCampaignPlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignPlans"></a>
# **getCampaignPlans**
> GetCampaignPlanResponse getCampaignPlans(opts)

List all marketing campaign plans

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaignPlans(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetCampaignPlanResponse**](GetCampaignPlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaigns"></a>
# **getCampaigns**
> GetCampaignResponse getCampaigns(opts)

List all marketing campaigns

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCampaigns(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChatLog"></a>
# **getChatLog**
> SpecificChatResponse getChatLog(chatId)

Retrieve a chat log

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var chatId = "chatId_example"; // String | UUID of a chat record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getChatLog(chatId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**String**](.md)| UUID of a chat record | 

### Return type

[**SpecificChatResponse**](SpecificChatResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChatLogs"></a>
# **getChatLogs**
> GetChatResponse getChatLogs(opts)

List all chat logs

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getChatLogs(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetChatResponse**](GetChatResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientCampaign"></a>
# **getClientCampaign**
> SpecificClientCampaignResponse getClientCampaign(clientCampaignId)

Retrieve a client assigned to a campaign

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var clientCampaignId = "clientCampaignId_example"; // String | UUID of a client campaign record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientCampaign(clientCampaignId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | [**String**](.md)| UUID of a client campaign record | 

### Return type

[**SpecificClientCampaignResponse**](SpecificClientCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientCampaigns"></a>
# **getClientCampaigns**
> GetClientCampaignResponse getClientCampaigns(opts)

List information for all clients that are assigned to a marketing campaign defined for your firm

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientCampaigns(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetClientCampaignResponse**](GetClientCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConsultation"></a>
# **getConsultation**
> SpecificConsultationResponse getConsultation(consultationId)

Retrieve a consultation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var consultationId = "consultationId_example"; // String | UUID of a consultation record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getConsultation(consultationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**String**](.md)| UUID of a consultation record | 

### Return type

[**SpecificConsultationResponse**](SpecificConsultationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConsultations"></a>
# **getConsultations**
> GetConsultationResponse getConsultations(opts)

List all consultations

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getConsultations(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetConsultationResponse**](GetConsultationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> SpecificDocumentResponse getDocument(documentId)

Retrieve a document

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var documentId = "documentId_example"; // String | UUID of a document


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDocument(documentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | [**String**](.md)| UUID of a document | 

### Return type

[**SpecificDocumentResponse**](SpecificDocumentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocuments"></a>
# **getDocuments**
> GetDocumentResponse getDocuments(opts)

List all documents

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDocuments(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetDocumentResponse**](GetDocumentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFaq"></a>
# **getFaq**
> SpecificFaqResponse getFaq(faqId)

Retrieve a FAQ

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var faqId = "faqId_example"; // String | UUID of a FAQ


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFaq(faqId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**String**](.md)| UUID of a FAQ | 

### Return type

[**SpecificFaqResponse**](SpecificFaqResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFaqs"></a>
# **getFaqs**
> GetFaqResponse getFaqs(opts)

List all FAQs

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFaqs(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetFaqResponse**](GetFaqResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSalesInquiries"></a>
# **getSalesInquiries**
> GetSalesResponse getSalesInquiries(opts)

List all sales inquiries

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSalesInquiries(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetSalesResponse**](GetSalesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSalesInquiry"></a>
# **getSalesInquiry**
> SpecificSalesResponse getSalesInquiry(salesId)

Retrieve a sales inquiry

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var salesId = "salesId_example"; // String | UUID of a sales record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSalesInquiry(salesId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesId** | [**String**](.md)| UUID of a sales record | 

### Return type

[**SpecificSalesResponse**](SpecificSalesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSupportTicket"></a>
# **getSupportTicket**
> SpecificSupportTicketResponse getSupportTicket(supportTicketId)

Retrieve a support ticket

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var supportTicketId = "supportTicketId_example"; // String | UUID of a support ticket


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSupportTicket(supportTicketId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketId** | [**String**](.md)| UUID of a support ticket | 

### Return type

[**SpecificSupportTicketResponse**](SpecificSupportTicketResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSupportTicketComment"></a>
# **getSupportTicketComment**
> SpecificSupportTicketCommentResponse getSupportTicketComment(supportTicketCommentId)

Retrieve a support ticket comment

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var supportTicketCommentId = "supportTicketCommentId_example"; // String | UUID of a support ticket comment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSupportTicketComment(supportTicketCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketCommentId** | [**String**](.md)| UUID of a support ticket comment | 

### Return type

[**SpecificSupportTicketCommentResponse**](SpecificSupportTicketCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSupportTicketComments"></a>
# **getSupportTicketComments**
> GetSupportTicketCommentResponse getSupportTicketComments(opts)

List all support ticket comments

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSupportTicketComments(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetSupportTicketCommentResponse**](GetSupportTicketCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSupportTickets"></a>
# **getSupportTickets**
> GetSupportTicketResponse getSupportTickets(opts)

List all support tickets

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSupportTickets(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetSupportTicketResponse**](GetSupportTicketResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCampaign"></a>
# **postCampaign**
> CreateCampaignResponse postCampaign(payload)

Create a marketing campaign

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.CampaignManagementPayload(); // CampaignManagementPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postCampaign(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CampaignManagementPayload**](CampaignManagementPayload.md)|  | 

### Return type

[**CreateCampaignResponse**](CreateCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCampaignDataRecord"></a>
# **postCampaignDataRecord**
> CreateCampaignDataResponse postCampaignDataRecord(payload)

Create a marketing campaign data record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.CampaignDataPayload(); // CampaignDataPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postCampaignDataRecord(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CampaignDataPayload**](CampaignDataPayload.md)|  | 

### Return type

[**CreateCampaignDataResponse**](CreateCampaignDataResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCampaignPlan"></a>
# **postCampaignPlan**
> CreateCampaignPlanResponse postCampaignPlan(payload)

Create a marketing campaign plan

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.CampaignPlanPayload(); // CampaignPlanPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postCampaignPlan(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CampaignPlanPayload**](CampaignPlanPayload.md)|  | 

### Return type

[**CreateCampaignPlanResponse**](CreateCampaignPlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postChatLog"></a>
# **postChatLog**
> CreateChatResponse postChatLog(payload)

Create a chat log

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.ChatPayload(); // ChatPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postChatLog(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ChatPayload**](ChatPayload.md)|  | 

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postClientCampaign"></a>
# **postClientCampaign**
> CreateClientCampaignResponse postClientCampaign(payload)

Assign a client to a campaign to indicate the client has registered through the campaign specified

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.ClientCampaignPayload(); // ClientCampaignPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postClientCampaign(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ClientCampaignPayload**](ClientCampaignPayload.md)|  | 

### Return type

[**CreateClientCampaignResponse**](CreateClientCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConsultation"></a>
# **postConsultation**
> CreateConsultationResponse postConsultation(payload)

Create a consultation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.ConsultationPayload(); // ConsultationPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postConsultation(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ConsultationPayload**](ConsultationPayload.md)|  | 

### Return type

[**CreateConsultationResponse**](CreateConsultationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocument"></a>
# **postDocument**
> CreateDocumentResponse postDocument(payload)

Create a document

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.DocumentPayload(); // DocumentPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postDocument(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**DocumentPayload**](DocumentPayload.md)|  | 

### Return type

[**CreateDocumentResponse**](CreateDocumentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFaq"></a>
# **postFaq**
> CreateFaqResponse postFaq(payload)

Create a faq

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.FaqPayload(); // FaqPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postFaq(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**FaqPayload**](FaqPayload.md)|  | 

### Return type

[**CreateFaqResponse**](CreateFaqResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSalesInquiry"></a>
# **postSalesInquiry**
> CreateSalesResponse postSalesInquiry(payload)

Create a sales inquiry

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.SalesPayload(); // SalesPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postSalesInquiry(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SalesPayload**](SalesPayload.md)|  | 

### Return type

[**CreateSalesResponse**](CreateSalesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSupportTicket"></a>
# **postSupportTicket**
> CreateSupportTicketResponse postSupportTicket(payload)

Create a support ticket

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.SupportTicketPayload(); // SupportTicketPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postSupportTicket(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SupportTicketPayload**](SupportTicketPayload.md)|  | 

### Return type

[**CreateSupportTicketResponse**](CreateSupportTicketResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSupportTicketComment"></a>
# **postSupportTicketComment**
> CreateSupportTicketCommentResponse postSupportTicketComment(payload)

Create a support ticket comment

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var payload = new atom_api.SupportTicketCommentPayload(); // SupportTicketCommentPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postSupportTicketComment(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SupportTicketCommentPayload**](SupportTicketCommentPayload.md)|  | 

### Return type

[**CreateSupportTicketCommentResponse**](CreateSupportTicketCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCampaign"></a>
# **updateCampaign**
> SpecificCampaignResponse updateCampaign(campaignIdpayload)

Update a marketing campaign

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var campaignId = "campaignId_example"; // String | UUID of a marketing campaign

var payload = new atom_api.ClientCampaignPayload(); // ClientCampaignPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCampaign(campaignIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | [**String**](.md)| UUID of a marketing campaign | 
 **payload** | [**ClientCampaignPayload**](ClientCampaignPayload.md)|  | 

### Return type

[**SpecificCampaignResponse**](SpecificCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCampaignDataRecord"></a>
# **updateCampaignDataRecord**
> SpecificCampaignDataResponse updateCampaignDataRecord(campaignDataIdpayload)

Update a marketing campaign data record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var campaignDataId = "campaignDataId_example"; // String | UUID of a campaign data record

var payload = new atom_api.CampaignDataPayload(); // CampaignDataPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCampaignDataRecord(campaignDataIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataId** | [**String**](.md)| UUID of a campaign data record | 
 **payload** | [**CampaignDataPayload**](CampaignDataPayload.md)|  | 

### Return type

[**SpecificCampaignDataResponse**](SpecificCampaignDataResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCampaignPlan"></a>
# **updateCampaignPlan**
> SpecificCampaignPlanResponse updateCampaignPlan(campaignPlanIdpayload)

Update a marketing campaign plan

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var campaignPlanId = "campaignPlanId_example"; // String | UUID of a campaign plan

var payload = new atom_api.CampaignPlanPayload(); // CampaignPlanPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCampaignPlan(campaignPlanIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanId** | [**String**](.md)| UUID of a campaign plan | 
 **payload** | [**CampaignPlanPayload**](CampaignPlanPayload.md)|  | 

### Return type

[**SpecificCampaignPlanResponse**](SpecificCampaignPlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateChatLog"></a>
# **updateChatLog**
> SpecificChatResponse updateChatLog(chatIdpayload)

Update a chat log

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var chatId = "chatId_example"; // String | UUID of a chat record

var payload = new atom_api.ChatPayload(); // ChatPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateChatLog(chatIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**String**](.md)| UUID of a chat record | 
 **payload** | [**ChatPayload**](ChatPayload.md)|  | 

### Return type

[**SpecificChatResponse**](SpecificChatResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClientCampaign"></a>
# **updateClientCampaign**
> SpecificClientCampaignResponse updateClientCampaign(clientCampaignIdpayload)

Update a client assigned to a campaign

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var clientCampaignId = "clientCampaignId_example"; // String | UUID of a client campaign record

var payload = new atom_api.ClientCampaignPayload(); // ClientCampaignPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateClientCampaign(clientCampaignIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | [**String**](.md)| UUID of a client campaign record | 
 **payload** | [**ClientCampaignPayload**](ClientCampaignPayload.md)|  | 

### Return type

[**SpecificClientCampaignResponse**](SpecificClientCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConsultation"></a>
# **updateConsultation**
> SpecificConsultationResponse updateConsultation(consultationIdpayload)

Update a consultation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var consultationId = "consultationId_example"; // String | UUID of a consultation record

var payload = new atom_api.ConsultationPayload(); // ConsultationPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateConsultation(consultationIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**String**](.md)| UUID of a consultation record | 
 **payload** | [**ConsultationPayload**](ConsultationPayload.md)|  | 

### Return type

[**SpecificConsultationResponse**](SpecificConsultationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDocument"></a>
# **updateDocument**
> SpecificDocumentResponse updateDocument(documentIdpayload)

Update a document

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var documentId = "documentId_example"; // String | UUID of a document

var payload = new atom_api.DocumentPayload(); // DocumentPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateDocument(documentIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | [**String**](.md)| UUID of a document | 
 **payload** | [**DocumentPayload**](DocumentPayload.md)|  | 

### Return type

[**SpecificDocumentResponse**](SpecificDocumentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFaq"></a>
# **updateFaq**
> SpecificFaqResponse updateFaq(faqIdpayload)

Update a FAQ

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var faqId = "faqId_example"; // String | UUID of a FAQ

var payload = new atom_api.FaqPayload(); // FaqPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateFaq(faqIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**String**](.md)| UUID of a FAQ | 
 **payload** | [**FaqPayload**](FaqPayload.md)|  | 

### Return type

[**SpecificFaqResponse**](SpecificFaqResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSalesInquiry"></a>
# **updateSalesInquiry**
> SpecificSalesResponse updateSalesInquiry(salesIdpayload)

Update a sales inquiry

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var salesId = "salesId_example"; // String | UUID of a sales record

var payload = new atom_api.SalesPayload(); // SalesPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSalesInquiry(salesIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesId** | [**String**](.md)| UUID of a sales record | 
 **payload** | [**SalesPayload**](SalesPayload.md)|  | 

### Return type

[**SpecificSalesResponse**](SpecificSalesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSupportTicket"></a>
# **updateSupportTicket**
> SpecificSupportTicketResponse updateSupportTicket(supportTicketIdpayload)

Update a support ticket

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var supportTicketId = "supportTicketId_example"; // String | UUID of a support ticket

var payload = new atom_api.SupportTicketPayload(); // SupportTicketPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSupportTicket(supportTicketIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketId** | [**String**](.md)| UUID of a support ticket | 
 **payload** | [**SupportTicketPayload**](SupportTicketPayload.md)|  | 

### Return type

[**SpecificSupportTicketResponse**](SpecificSupportTicketResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSupportTicketComment"></a>
# **updateSupportTicketComment**
> SpecificSupportTicketCommentResponse updateSupportTicketComment(supportTicketCommentIdpayload)

Update a support ticket comment

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ElectronApi();

var supportTicketCommentId = "supportTicketCommentId_example"; // String | UUID of a support ticket comment

var payload = new atom_api.SupportTicketCommentPayload(); // SupportTicketCommentPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSupportTicketComment(supportTicketCommentIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketCommentId** | [**String**](.md)| UUID of a support ticket comment | 
 **payload** | [**SupportTicketCommentPayload**](SupportTicketCommentPayload.md)|  | 

### Return type

[**SpecificSupportTicketCommentResponse**](SpecificSupportTicketCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

