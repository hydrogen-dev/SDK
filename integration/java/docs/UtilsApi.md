# UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTokenExchangeUsingPost**](UtilsApi.md#createTokenExchangeUsingPost) | **POST** /token_exchange | Retrieve token based on certain vendor specific value
[**createUserUsingPost**](UtilsApi.md#createUserUsingPost) | **POST** /user | Create user in vendor
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

