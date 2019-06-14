# ElectronApi

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID campaignId = new UUID(); // UUID | UUID of a marketing campaign
try {
    apiInstance.deleteCampaign(campaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | [**UUID**](.md)| UUID of a marketing campaign |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID campaignDataId = new UUID(); // UUID | UUID of a campaign data record
try {
    apiInstance.deleteCampaignDataRecord(campaignDataId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteCampaignDataRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataId** | [**UUID**](.md)| UUID of a campaign data record |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID campaignPlanId = new UUID(); // UUID | UUID of a campaign plan
try {
    apiInstance.deleteCampaignPlan(campaignPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteCampaignPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanId** | [**UUID**](.md)| UUID of a campaign plan |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID chatId = new UUID(); // UUID | UUID of a chat record
try {
    apiInstance.deleteChatLog(chatId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteChatLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**UUID**](.md)| UUID of a chat record |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID clientCampaignId = new UUID(); // UUID | UUID of a client campaign record
try {
    apiInstance.deleteClientCampaign(clientCampaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteClientCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | [**UUID**](.md)| UUID of a client campaign record |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID consultationId = new UUID(); // UUID | UUID of a consultation record
try {
    apiInstance.deleteConsultation(consultationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteConsultation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**UUID**](.md)| UUID of a consultation record |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID documentId = new UUID(); // UUID | UUID of a document
try {
    apiInstance.deleteDocument(documentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | [**UUID**](.md)| UUID of a document |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID faqId = new UUID(); // UUID | UUID of a FAQ
try {
    apiInstance.deleteFaq(faqId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteFaq");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**UUID**](.md)| UUID of a FAQ |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID salesId = new UUID(); // UUID | UUID of a sales record
try {
    apiInstance.deleteSalesInquiry(salesId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteSalesInquiry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesId** | [**UUID**](.md)| UUID of a sales record |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID supportTicketId = new UUID(); // UUID | UUID of a support ticket
try {
    apiInstance.deleteSupportTicket(supportTicketId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteSupportTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketId** | [**UUID**](.md)| UUID of a support ticket |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID supportTicketCommentId = new UUID(); // UUID | UUID of a support ticket comment
try {
    apiInstance.deleteSupportTicketComment(supportTicketCommentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#deleteSupportTicketComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketCommentId** | [**UUID**](.md)| UUID of a support ticket comment |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID campaignId = new UUID(); // UUID | UUID of a marketing campaign
try {
    SpecificCampaignResponse result = apiInstance.getCampaign(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | [**UUID**](.md)| UUID of a marketing campaign |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID campaignDataId = new UUID(); // UUID | UUID of a campaign data record
try {
    SpecificCampaignDataResponse result = apiInstance.getCampaignDataRecord(campaignDataId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getCampaignDataRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataId** | [**UUID**](.md)| UUID of a campaign data record |

### Return type

[**SpecificCampaignDataResponse**](SpecificCampaignDataResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignDataRecords"></a>
# **getCampaignDataRecords**
> GetCampaignDataResponse getCampaignDataRecords(page, size, orderBy, ascending, filter)

List all marketing campaign data records

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetCampaignDataResponse result = apiInstance.getCampaignDataRecords(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getCampaignDataRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID campaignPlanId = new UUID(); // UUID | UUID of a campaign plan
try {
    SpecificCampaignPlanResponse result = apiInstance.getCampaignPlan(campaignPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getCampaignPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanId** | [**UUID**](.md)| UUID of a campaign plan |

### Return type

[**SpecificCampaignPlanResponse**](SpecificCampaignPlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignPlans"></a>
# **getCampaignPlans**
> GetCampaignPlanResponse getCampaignPlans(page, size, orderBy, ascending, filter)

List all marketing campaign plans

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetCampaignPlanResponse result = apiInstance.getCampaignPlans(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getCampaignPlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
> GetCampaignResponse getCampaigns(page, size, orderBy, ascending, filter)

List all marketing campaigns

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetCampaignResponse result = apiInstance.getCampaigns(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID chatId = new UUID(); // UUID | UUID of a chat record
try {
    SpecificChatResponse result = apiInstance.getChatLog(chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getChatLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**UUID**](.md)| UUID of a chat record |

### Return type

[**SpecificChatResponse**](SpecificChatResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChatLogs"></a>
# **getChatLogs**
> GetChatResponse getChatLogs(page, size, orderBy, ascending, filter)

List all chat logs

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetChatResponse result = apiInstance.getChatLogs(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getChatLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID clientCampaignId = new UUID(); // UUID | UUID of a client campaign record
try {
    SpecificClientCampaignResponse result = apiInstance.getClientCampaign(clientCampaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getClientCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | [**UUID**](.md)| UUID of a client campaign record |

### Return type

[**SpecificClientCampaignResponse**](SpecificClientCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientCampaigns"></a>
# **getClientCampaigns**
> GetClientCampaignResponse getClientCampaigns(page, size, orderBy, ascending, filter)

List information for all clients that are assigned to a marketing campaign defined for your firm

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetClientCampaignResponse result = apiInstance.getClientCampaigns(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getClientCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID consultationId = new UUID(); // UUID | UUID of a consultation record
try {
    SpecificConsultationResponse result = apiInstance.getConsultation(consultationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getConsultation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**UUID**](.md)| UUID of a consultation record |

### Return type

[**SpecificConsultationResponse**](SpecificConsultationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConsultations"></a>
# **getConsultations**
> GetConsultationResponse getConsultations(page, size, orderBy, ascending, filter)

List all consultations

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetConsultationResponse result = apiInstance.getConsultations(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getConsultations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID documentId = new UUID(); // UUID | UUID of a document
try {
    SpecificDocumentResponse result = apiInstance.getDocument(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | [**UUID**](.md)| UUID of a document |

### Return type

[**SpecificDocumentResponse**](SpecificDocumentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocuments"></a>
# **getDocuments**
> GetDocumentResponse getDocuments(page, size, orderBy, ascending, filter)

List all documents

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetDocumentResponse result = apiInstance.getDocuments(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID faqId = new UUID(); // UUID | UUID of a FAQ
try {
    SpecificFaqResponse result = apiInstance.getFaq(faqId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getFaq");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**UUID**](.md)| UUID of a FAQ |

### Return type

[**SpecificFaqResponse**](SpecificFaqResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFaqs"></a>
# **getFaqs**
> GetFaqResponse getFaqs(page, size, orderBy, ascending, filter)

List all FAQs

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetFaqResponse result = apiInstance.getFaqs(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getFaqs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
> GetSalesResponse getSalesInquiries(page, size, orderBy, ascending, filter)

List all sales inquiries

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetSalesResponse result = apiInstance.getSalesInquiries(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getSalesInquiries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID salesId = new UUID(); // UUID | UUID of a sales record
try {
    SpecificSalesResponse result = apiInstance.getSalesInquiry(salesId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getSalesInquiry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesId** | [**UUID**](.md)| UUID of a sales record |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID supportTicketId = new UUID(); // UUID | UUID of a support ticket
try {
    SpecificSupportTicketResponse result = apiInstance.getSupportTicket(supportTicketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getSupportTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketId** | [**UUID**](.md)| UUID of a support ticket |

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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID supportTicketCommentId = new UUID(); // UUID | UUID of a support ticket comment
try {
    SpecificSupportTicketCommentResponse result = apiInstance.getSupportTicketComment(supportTicketCommentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getSupportTicketComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketCommentId** | [**UUID**](.md)| UUID of a support ticket comment |

### Return type

[**SpecificSupportTicketCommentResponse**](SpecificSupportTicketCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSupportTicketComments"></a>
# **getSupportTicketComments**
> GetSupportTicketCommentResponse getSupportTicketComments(page, size, orderBy, ascending, filter)

List all support ticket comments

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetSupportTicketCommentResponse result = apiInstance.getSupportTicketComments(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getSupportTicketComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
> GetSupportTicketResponse getSupportTickets(page, size, orderBy, ascending, filter)

List all support tickets

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
String filter = "filter_example"; // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
try {
    GetSupportTicketResponse result = apiInstance.getSupportTickets(page, size, orderBy, ascending, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#getSupportTickets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
CampaignManagementPayload payload = new CampaignManagementPayload(); // CampaignManagementPayload | 
try {
    CreateCampaignResponse result = apiInstance.postCampaign(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postCampaign");
    e.printStackTrace();
}
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
CampaignDataPayload payload = new CampaignDataPayload(); // CampaignDataPayload | 
try {
    CreateCampaignDataResponse result = apiInstance.postCampaignDataRecord(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postCampaignDataRecord");
    e.printStackTrace();
}
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
CampaignPlanPayload payload = new CampaignPlanPayload(); // CampaignPlanPayload | 
try {
    CreateCampaignPlanResponse result = apiInstance.postCampaignPlan(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postCampaignPlan");
    e.printStackTrace();
}
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
ChatPayload payload = new ChatPayload(); // ChatPayload | 
try {
    CreateChatResponse result = apiInstance.postChatLog(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postChatLog");
    e.printStackTrace();
}
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
ClientCampaignPayload payload = new ClientCampaignPayload(); // ClientCampaignPayload | 
try {
    CreateClientCampaignResponse result = apiInstance.postClientCampaign(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postClientCampaign");
    e.printStackTrace();
}
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
ConsultationPayload payload = new ConsultationPayload(); // ConsultationPayload | 
try {
    CreateConsultationResponse result = apiInstance.postConsultation(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postConsultation");
    e.printStackTrace();
}
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
DocumentPayload payload = new DocumentPayload(); // DocumentPayload | 
try {
    CreateDocumentResponse result = apiInstance.postDocument(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postDocument");
    e.printStackTrace();
}
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
FaqPayload payload = new FaqPayload(); // FaqPayload | 
try {
    CreateFaqResponse result = apiInstance.postFaq(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postFaq");
    e.printStackTrace();
}
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
SalesPayload payload = new SalesPayload(); // SalesPayload | 
try {
    CreateSalesResponse result = apiInstance.postSalesInquiry(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postSalesInquiry");
    e.printStackTrace();
}
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
SupportTicketPayload payload = new SupportTicketPayload(); // SupportTicketPayload | 
try {
    CreateSupportTicketResponse result = apiInstance.postSupportTicket(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postSupportTicket");
    e.printStackTrace();
}
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
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
SupportTicketCommentPayload payload = new SupportTicketCommentPayload(); // SupportTicketCommentPayload | 
try {
    CreateSupportTicketCommentResponse result = apiInstance.postSupportTicketComment(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#postSupportTicketComment");
    e.printStackTrace();
}
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
> SpecificCampaignResponse updateCampaign(campaignId, payload)

Update a marketing campaign

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID campaignId = new UUID(); // UUID | UUID of a marketing campaign
ClientCampaignPayload payload = new ClientCampaignPayload(); // ClientCampaignPayload | 
try {
    SpecificCampaignResponse result = apiInstance.updateCampaign(campaignId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | [**UUID**](.md)| UUID of a marketing campaign |
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
> SpecificCampaignDataResponse updateCampaignDataRecord(campaignDataId, payload)

Update a marketing campaign data record

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID campaignDataId = new UUID(); // UUID | UUID of a campaign data record
CampaignDataPayload payload = new CampaignDataPayload(); // CampaignDataPayload | 
try {
    SpecificCampaignDataResponse result = apiInstance.updateCampaignDataRecord(campaignDataId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateCampaignDataRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignDataId** | [**UUID**](.md)| UUID of a campaign data record |
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
> SpecificCampaignPlanResponse updateCampaignPlan(campaignPlanId, payload)

Update a marketing campaign plan

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID campaignPlanId = new UUID(); // UUID | UUID of a campaign plan
CampaignPlanPayload payload = new CampaignPlanPayload(); // CampaignPlanPayload | 
try {
    SpecificCampaignPlanResponse result = apiInstance.updateCampaignPlan(campaignPlanId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateCampaignPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignPlanId** | [**UUID**](.md)| UUID of a campaign plan |
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
> SpecificChatResponse updateChatLog(chatId, payload)

Update a chat log

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID chatId = new UUID(); // UUID | UUID of a chat record
ChatPayload payload = new ChatPayload(); // ChatPayload | 
try {
    SpecificChatResponse result = apiInstance.updateChatLog(chatId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateChatLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**UUID**](.md)| UUID of a chat record |
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
> SpecificClientCampaignResponse updateClientCampaign(clientCampaignId, payload)

Update a client assigned to a campaign

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID clientCampaignId = new UUID(); // UUID | UUID of a client campaign record
ClientCampaignPayload payload = new ClientCampaignPayload(); // ClientCampaignPayload | 
try {
    SpecificClientCampaignResponse result = apiInstance.updateClientCampaign(clientCampaignId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateClientCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCampaignId** | [**UUID**](.md)| UUID of a client campaign record |
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
> SpecificConsultationResponse updateConsultation(consultationId, payload)

Update a consultation

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID consultationId = new UUID(); // UUID | UUID of a consultation record
ConsultationPayload payload = new ConsultationPayload(); // ConsultationPayload | 
try {
    SpecificConsultationResponse result = apiInstance.updateConsultation(consultationId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateConsultation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**UUID**](.md)| UUID of a consultation record |
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
> SpecificDocumentResponse updateDocument(documentId, payload)

Update a document

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID documentId = new UUID(); // UUID | UUID of a document
DocumentPayload payload = new DocumentPayload(); // DocumentPayload | 
try {
    SpecificDocumentResponse result = apiInstance.updateDocument(documentId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | [**UUID**](.md)| UUID of a document |
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
> SpecificFaqResponse updateFaq(faqId, payload)

Update a FAQ

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID faqId = new UUID(); // UUID | UUID of a FAQ
FaqPayload payload = new FaqPayload(); // FaqPayload | 
try {
    SpecificFaqResponse result = apiInstance.updateFaq(faqId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateFaq");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**UUID**](.md)| UUID of a FAQ |
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
> SpecificSalesResponse updateSalesInquiry(salesId, payload)

Update a sales inquiry

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID salesId = new UUID(); // UUID | UUID of a sales record
SalesPayload payload = new SalesPayload(); // SalesPayload | 
try {
    SpecificSalesResponse result = apiInstance.updateSalesInquiry(salesId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateSalesInquiry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesId** | [**UUID**](.md)| UUID of a sales record |
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
> SpecificSupportTicketResponse updateSupportTicket(supportTicketId, payload)

Update a support ticket

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID supportTicketId = new UUID(); // UUID | UUID of a support ticket
SupportTicketPayload payload = new SupportTicketPayload(); // SupportTicketPayload | 
try {
    SpecificSupportTicketResponse result = apiInstance.updateSupportTicket(supportTicketId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateSupportTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketId** | [**UUID**](.md)| UUID of a support ticket |
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
> SpecificSupportTicketCommentResponse updateSupportTicketComment(supportTicketCommentId, payload)

Update a support ticket comment

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ElectronApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

ElectronApi apiInstance = new ElectronApi();
UUID supportTicketCommentId = new UUID(); // UUID | UUID of a support ticket comment
SupportTicketCommentPayload payload = new SupportTicketCommentPayload(); // SupportTicketCommentPayload | 
try {
    SpecificSupportTicketCommentResponse result = apiInstance.updateSupportTicketComment(supportTicketCommentId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronApi#updateSupportTicketComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketCommentId** | [**UUID**](.md)| UUID of a support ticket comment |
 **payload** | [**SupportTicketCommentPayload**](SupportTicketCommentPayload.md)|  |

### Return type

[**SpecificSupportTicketCommentResponse**](SpecificSupportTicketCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

