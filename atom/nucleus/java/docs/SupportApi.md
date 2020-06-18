# SupportApi

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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
ChatInfo chatInfoRequest = new ChatInfo(); // ChatInfo | chatInfoRequest
try {
    ChatInfo result = apiInstance.createChatUsingPost(chatInfoRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#createChatUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
Consultation cioConsultationRequest = new Consultation(); // Consultation | cioConsultationRequest
try {
    Consultation result = apiInstance.createConsultationUsingPost(cioConsultationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#createConsultationUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
Sale saleRequest = new Sale(); // Sale | saleRequest
try {
    Sale result = apiInstance.createSaleUsingPost(saleRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#createSaleUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
SupportTicketComment supportTickerCommentRequest = new SupportTicketComment(); // SupportTicketComment | supportTickerCommentRequest
try {
    SupportTicket result = apiInstance.createSupportTicketCommentUsingPost(supportTickerCommentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#createSupportTicketCommentUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
SupportTicket supportTicketRequest = new SupportTicket(); // SupportTicket | supportTicketRequest
try {
    SupportTicket result = apiInstance.createSupportTicketUsingPost(supportTicketRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#createSupportTicketUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID chatId = new UUID(); // UUID | UUID chat_info_id
try {
    apiInstance.deleteChatUsingDelete(chatId);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#deleteChatUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**UUID**](.md)| UUID chat_info_id |

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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID consultationId = new UUID(); // UUID | UUID consultation_id
try {
    apiInstance.deleteConsultationUsingDelete(consultationId);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#deleteConsultationUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**UUID**](.md)| UUID consultation_id |

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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID salesId = new UUID(); // UUID | UUID sales_id
try {
    apiInstance.deleteSaleUsingDelete(salesId);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#deleteSaleUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesId** | [**UUID**](.md)| UUID sales_id |

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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID supportTicketCommentId = new UUID(); // UUID | UUID support_ticket_comment_id
try {
    apiInstance.deleteSupportTicketCommentUsingDelete(supportTicketCommentId);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#deleteSupportTicketCommentUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketCommentId** | [**UUID**](.md)| UUID support_ticket_comment_id |

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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID supportTicketId = new UUID(); // UUID | UUID support_ticket_id
try {
    apiInstance.deleteSupportTicketUsingDelete(supportTicketId);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#deleteSupportTicketUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketId** | [**UUID**](.md)| UUID support_ticket_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChatAllUsingGet"></a>
# **getChatAllUsingGet**
> PageChatInfo getChatAllUsingGet(ascending, filter, orderBy, page, size)

List all open chats

Get details for all open chat

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageChatInfo result = apiInstance.getChatAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#getChatAllUsingGet");
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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID chatId = new UUID(); // UUID | UUID chat_info_id
try {
    ChatInfo result = apiInstance.getChatUsingGet(chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#getChatUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**UUID**](.md)| UUID chat_info_id |

### Return type

[**ChatInfo**](ChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getConsultationAllUsingGet"></a>
# **getConsultationAllUsingGet**
> PageConsultation getConsultationAllUsingGet(ascending, filter, orderBy, page, size)

List all CIO Consultation

Get details for all CIO Consultation

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageConsultation result = apiInstance.getConsultationAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#getConsultationAllUsingGet");
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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID consultationId = new UUID(); // UUID | UUID consultation_id
try {
    Consultation result = apiInstance.getConsultationUsingGet(consultationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#getConsultationUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultationId** | [**UUID**](.md)| UUID consultation_id |

### Return type

[**Consultation**](Consultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSaleAllUsingGet"></a>
# **getSaleAllUsingGet**
> PageSale getSaleAllUsingGet(ascending, filter, orderBy, page, size)

List all sales inquiries

Get all sales inquiries defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageSale result = apiInstance.getSaleAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#getSaleAllUsingGet");
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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID salesId = new UUID(); // UUID | UUID sales_id
try {
    Sale result = apiInstance.getSaleUsingGet(salesId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#getSaleUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesId** | [**UUID**](.md)| UUID sales_id |

### Return type

[**Sale**](Sale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSupportTicketAllUsingGet"></a>
# **getSupportTicketAllUsingGet**
> PageSupportTicket getSupportTicketAllUsingGet(ascending, filter, orderBy, page, size)

List all support tickets

Get the information for all support tickets defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageSupportTicket result = apiInstance.getSupportTicketAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#getSupportTicketAllUsingGet");
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

[**PageSupportTicket**](PageSupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSupportTicketCommentAllUsingGet"></a>
# **getSupportTicketCommentAllUsingGet**
> PageSupportTicketComment getSupportTicketCommentAllUsingGet(ascending, filter, orderBy, page, size)

List all support ticket comments

Get the information for all support ticket comments defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageSupportTicketComment result = apiInstance.getSupportTicketCommentAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#getSupportTicketCommentAllUsingGet");
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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID supportTicketCommentId = new UUID(); // UUID | UUID support_ticket_comment_id
try {
    SupportTicketComment result = apiInstance.getSupportTicketCommentUsingGet(supportTicketCommentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#getSupportTicketCommentUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketCommentId** | [**UUID**](.md)| UUID support_ticket_comment_id |

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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID supportTicketId = new UUID(); // UUID | UUID support_ticket_id
try {
    SupportTicket result = apiInstance.getSupportTicketUsingGet(supportTicketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#getSupportTicketUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketId** | [**UUID**](.md)| UUID support_ticket_id |

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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
UUID chatId = new UUID(); // UUID | UUID chat_id
ChatInfo chatInfo = new ChatInfo(); // ChatInfo | chat_info
try {
    ChatInfo result = apiInstance.updateChatUsingPut(chatId, chatInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#updateChatUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | [**UUID**](.md)| UUID chat_id |
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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
Consultation consultation = new Consultation(); // Consultation | consultation
UUID consultationId = new UUID(); // UUID | UUID consultation_id
try {
    Consultation result = apiInstance.updateConsultationUsingPut(consultation, consultationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#updateConsultationUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation** | [**Consultation**](Consultation.md)| consultation |
 **consultationId** | [**UUID**](.md)| UUID consultation_id |

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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
Sale sales = new Sale(); // Sale | sales
UUID salesId = new UUID(); // UUID | UUID sales_id
try {
    Sale result = apiInstance.updateSaleUsingPut(sales, salesId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#updateSaleUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales** | [**Sale**](Sale.md)| sales |
 **salesId** | [**UUID**](.md)| UUID sales_id |

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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
SupportTicketComment supportTicketComment = new SupportTicketComment(); // SupportTicketComment | support_ticket_comment
UUID supportTicketCommentId = new UUID(); // UUID | UUID support_ticket_comment_id
try {
    SupportTicketComment result = apiInstance.updateSupportTicketCommentUsingPut(supportTicketComment, supportTicketCommentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#updateSupportTicketCommentUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicketComment** | [**SupportTicketComment**](SupportTicketComment.md)| support_ticket_comment |
 **supportTicketCommentId** | [**UUID**](.md)| UUID support_ticket_comment_id |

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
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import SupportApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

SupportApi apiInstance = new SupportApi();
SupportTicket supportTicket = new SupportTicket(); // SupportTicket | support_ticket
UUID supportTicketId = new UUID(); // UUID | UUID support_ticket_id
try {
    SupportTicket result = apiInstance.updateSupportTicketUsingPut(supportTicket, supportTicketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupportApi#updateSupportTicketUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supportTicket** | [**SupportTicket**](SupportTicket.md)| support_ticket |
 **supportTicketId** | [**UUID**](.md)| UUID support_ticket_id |

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

