# UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTokenExchangeUsingPost**](UtilsApi.md#createTokenExchangeUsingPost) | **POST** /token_exchange | Retrieve token based on certain vendor specific value
[**createUserUsingPost**](UtilsApi.md#createUserUsingPost) | **POST** /user | Create user in vendor
[**getAuditLogAllUsingGet**](UtilsApi.md#getAuditLogAllUsingGet) | **GET** /audit_log | Gel all audit log
[**getWidgetLinkUsingGet**](UtilsApi.md#getWidgetLinkUsingGet) | **GET** /widget_link/{nucleus_client_id} | Retrieve widget link


<a name="createTokenExchangeUsingPost"></a>
# **createTokenExchangeUsingPost**
> ExchangePublicTokenVO createTokenExchangeUsingPost(exchangeTokenCO)

Retrieve token based on certain vendor specific value

Retrieve the token.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import UtilsApi;

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
UtilsApi apiInstance = new UtilsApi();
ExchangeTokenCO exchangeTokenCO = new ExchangeTokenCO(); // ExchangeTokenCO | exchangeTokenCO
try {
    ExchangePublicTokenVO result = apiInstance.createTokenExchangeUsingPost(exchangeTokenCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#createTokenExchangeUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangeTokenCO** | [**ExchangeTokenCO**](ExchangeTokenCO.md)| exchangeTokenCO |

### Return type

[**ExchangePublicTokenVO**](ExchangePublicTokenVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserUsingPost"></a>
# **createUserUsingPost**
> UserResponseVO createUserUsingPost(createUserRequest)

Create user in vendor

Create user in vendor.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import UtilsApi;

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
UtilsApi apiInstance = new UtilsApi();
CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | createUserRequest
try {
    UserResponseVO result = apiInstance.createUserUsingPost(createUserRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#createUserUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)| createUserRequest |

### Return type

[**UserResponseVO**](UserResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuditLogAllUsingGet"></a>
# **getAuditLogAllUsingGet**
> Pageobject getAuditLogAllUsingGet(ascending, endDate, event, integrationType, isRequest, nucleusClientId, orderBy, page, requestType, size, startDate, vendorName)

Gel all audit log

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import UtilsApi;

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
UtilsApi apiInstance = new UtilsApi();
Boolean ascending = false; // Boolean | ascending
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
String event = "event_example"; // String | event
String integrationType = "integrationType_example"; // String | integration_type
Boolean isRequest = false; // Boolean | is_request
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
String requestType = "requestType_example"; // String | request_type
Integer size = 25; // Integer | size
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
String vendorName = "vendorName_example"; // String | vendor_name
try {
    Pageobject result = apiInstance.getAuditLogAllUsingGet(ascending, endDate, event, integrationType, isRequest, nucleusClientId, orderBy, page, requestType, size, startDate, vendorName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#getAuditLogAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **endDate** | **OffsetDateTime**| end_date | [optional] [default to null]
 **event** | **String**| event | [optional]
 **integrationType** | **String**| integration_type | [optional]
 **isRequest** | **Boolean**| is_request | [optional] [default to false]
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **requestType** | **String**| request_type | [optional]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **OffsetDateTime**| start_date | [optional] [default to null]
 **vendorName** | **String**| vendor_name | [optional]

### Return type

[**Pageobject**](Pageobject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWidgetLinkUsingGet"></a>
# **getWidgetLinkUsingGet**
> WidgetUrlVO getWidgetLinkUsingGet(nucleusClientId, isMobileWebview, mode, vendorName)

Retrieve widget link

Retrieve the widget link.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import UtilsApi;

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
UtilsApi apiInstance = new UtilsApi();
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
Boolean isMobileWebview = false; // Boolean | is_mobile_webview
String mode = "aggregation"; // String | mode
String vendorName = "vendorName_example"; // String | vendor_name
try {
    WidgetUrlVO result = apiInstance.getWidgetLinkUsingGet(nucleusClientId, isMobileWebview, mode, vendorName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#getWidgetLinkUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id |
 **isMobileWebview** | **Boolean**| is_mobile_webview | [optional] [default to false]
 **mode** | **String**| mode | [optional] [default to aggregation]
 **vendorName** | **String**| vendor_name | [optional]

### Return type

[**WidgetUrlVO**](WidgetUrlVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

