# CardsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardLimitCheck**](CardsApi.md#cardLimitCheck) | **POST** /card_limit_check | Card Limit Check
[**cardTransactionAuthorization**](CardsApi.md#cardTransactionAuthorization) | **POST** /card_authorization | Card Transaction Authorization


<a name="cardLimitCheck"></a>
# **cardLimitCheck**
> Map&lt;String, Object&gt; cardLimitCheck(cardLimitCheckRequest)

Card Limit Check

Evaluate card transaction history against spending controls

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import CardsApi;

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

CardsApi apiInstance = new CardsApi();
CardLimitCheckRequest cardLimitCheckRequest = new CardLimitCheckRequest(); // CardLimitCheckRequest | Request payload for Card Limit Check
try {
    Map<String, Object> result = apiInstance.cardLimitCheck(cardLimitCheckRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#cardLimitCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardLimitCheckRequest** | [**CardLimitCheckRequest**](CardLimitCheckRequest.md)| Request payload for Card Limit Check |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cardTransactionAuthorization"></a>
# **cardTransactionAuthorization**
> Map&lt;String, Object&gt; cardTransactionAuthorization(cardTransactionAuthorizationRequest)

Card Transaction Authorization

Approve or reject a card transaction based on applicable conditions

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import CardsApi;

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

CardsApi apiInstance = new CardsApi();
CardTransactionAuthorizationRequest cardTransactionAuthorizationRequest = new CardTransactionAuthorizationRequest(); // CardTransactionAuthorizationRequest | Request payload for Card Transaction Authorization
try {
    Map<String, Object> result = apiInstance.cardTransactionAuthorization(cardTransactionAuthorizationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#cardTransactionAuthorization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardTransactionAuthorizationRequest** | [**CardTransactionAuthorizationRequest**](CardTransactionAuthorizationRequest.md)| Request payload for Card Transaction Authorization |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

