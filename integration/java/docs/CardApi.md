# CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutoReloadUsingPost**](CardApi.md#createAutoReloadUsingPost) | **POST** /card/auto_reload | Card auto reload
[**createCardActivateUsingPost**](CardApi.md#createCardActivateUsingPost) | **POST** /card/activate | Activate card
[**createCardBusinessUsingPost**](CardApi.md#createCardBusinessUsingPost) | **POST** /card/business | Create a card business
[**createCardCloseUsingPost**](CardApi.md#createCardCloseUsingPost) | **POST** /card/close | close a card
[**createCardIssueUsingPost**](CardApi.md#createCardIssueUsingPost) | **POST** /card/issue | issue a card
[**createCardLoadUsingPost**](CardApi.md#createCardLoadUsingPost) | **POST** /card/load | Create a card load
[**createCardPinUsingPost**](CardApi.md#createCardPinUsingPost) | **POST** /card/pin | pin card
[**createCardReactivateUsingPost**](CardApi.md#createCardReactivateUsingPost) | **POST** /card/reactivate | reactivate card
[**createCardReissueUsingPost**](CardApi.md#createCardReissueUsingPost) | **POST** /card/reissue | Reissue a card
[**createCardReplaceUsingPost**](CardApi.md#createCardReplaceUsingPost) | **POST** /card/replace | Create card replace
[**createCardSpendingControlUsingPost**](CardApi.md#createCardSpendingControlUsingPost) | **POST** /card/spending_control | Create card spending control
[**createCardSuspendUsingPost**](CardApi.md#createCardSuspendUsingPost) | **POST** /card/suspend | suspend card
[**createCardTokenUsingPost**](CardApi.md#createCardTokenUsingPost) | **POST** /card/token | token card
[**createCardUnloadUsingPost**](CardApi.md#createCardUnloadUsingPost) | **POST** /card/unload | Create a card upload
[**createClientCardUsingPost**](CardApi.md#createClientCardUsingPost) | **POST** /card/client | Create a card client
[**getCardBalanceUsingGet**](CardApi.md#getCardBalanceUsingGet) | **GET** /card/balance/{id} | Get a Card Balance
[**getCardImage**](CardApi.md#getCardImage) | **GET** /card/image/{card_id} | Get card image
[**getCardPciDetails**](CardApi.md#getCardPciDetails) | **GET** /card/pci_details/{card_id} | Get card pci details
[**getCardReserveAccountDetailsUsingGet**](CardApi.md#getCardReserveAccountDetailsUsingGet) | **GET** /card/reserve | Card reserve account
[**getCardStatementUsingGet**](CardApi.md#getCardStatementUsingGet) | **GET** /card/statement/{card_id} | Get card statement
[**getCardTokenUsingToken**](CardApi.md#getCardTokenUsingToken) | **GET** /card/token/{id} | Get a card token
[**getCardTransactionUsingGet**](CardApi.md#getCardTransactionUsingGet) | **GET** /card/transaction/{id} | Get a card transaction
[**getCardUsingGet**](CardApi.md#getCardUsingGet) | **GET** /card/{id} | Get a card information
[**updateCardBusinessUsingPut**](CardApi.md#updateCardBusinessUsingPut) | **PUT** /card/business/{nucleus_business_id} | Update a card business
[**updateCardPinUsingPost**](CardApi.md#updateCardPinUsingPost) | **PUT** /card/pin/{id} | update a pin card
[**updateCardSpendingControlUsingPut**](CardApi.md#updateCardSpendingControlUsingPut) | **PUT** /card/spending_control/{nucleus_spending_control_id} | Update a card spending control
[**updateCardUsingPut**](CardApi.md#updateCardUsingPut) | **PUT** /card/{id} | Update a card information
[**updateClientCardUsingPut**](CardApi.md#updateClientCardUsingPut) | **PUT** /card/client/{id} | Update a card client
[**verifyCardPinUsingPost**](CardApi.md#verifyCardPinUsingPost) | **POST** /card/pin/verify | verify card pin


<a name="createAutoReloadUsingPost"></a>
# **createAutoReloadUsingPost**
> CardAutoReloadResponseVO createAutoReloadUsingPost(request)

Card auto reload

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardAutoReloadRequestCO request = new CardAutoReloadRequestCO(); // CardAutoReloadRequestCO | request
try {
    CardAutoReloadResponseVO result = apiInstance.createAutoReloadUsingPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createAutoReloadUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardAutoReloadRequestCO**](CardAutoReloadRequestCO.md)| request |

### Return type

[**CardAutoReloadResponseVO**](CardAutoReloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardActivateUsingPost"></a>
# **createCardActivateUsingPost**
> BaseResponseVO createCardActivateUsingPost(activateRequest)

Activate card

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardBaseRequestCO activateRequest = new CardBaseRequestCO(); // CardBaseRequestCO | activateRequest
try {
    BaseResponseVO result = apiInstance.createCardActivateUsingPost(activateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardActivateUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activateRequest** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| activateRequest |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardBusinessUsingPost"></a>
# **createCardBusinessUsingPost**
> CreateBusinessResponseVO createCardBusinessUsingPost(cardBusinessRequestCO)

Create a card business

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardBusinessRequestCO cardBusinessRequestCO = new CardBusinessRequestCO(); // CardBusinessRequestCO | cardBusinessRequestCO
try {
    CreateBusinessResponseVO result = apiInstance.createCardBusinessUsingPost(cardBusinessRequestCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardBusinessUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardBusinessRequestCO** | [**CardBusinessRequestCO**](CardBusinessRequestCO.md)| cardBusinessRequestCO |

### Return type

[**CreateBusinessResponseVO**](CreateBusinessResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardCloseUsingPost"></a>
# **createCardCloseUsingPost**
> BaseResponseVO createCardCloseUsingPost(closeRequest)

close a card

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardBaseRequestCO closeRequest = new CardBaseRequestCO(); // CardBaseRequestCO | closeRequest
try {
    BaseResponseVO result = apiInstance.createCardCloseUsingPost(closeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardCloseUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **closeRequest** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| closeRequest |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardIssueUsingPost"></a>
# **createCardIssueUsingPost**
> BaseResponseVO createCardIssueUsingPost(issueRequest)

issue a card

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardBaseRequestCO issueRequest = new CardBaseRequestCO(); // CardBaseRequestCO | issueRequest
try {
    BaseResponseVO result = apiInstance.createCardIssueUsingPost(issueRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardIssueUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueRequest** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| issueRequest |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardLoadUsingPost"></a>
# **createCardLoadUsingPost**
> CardLoadUnloadResponseVO createCardLoadUsingPost(loadRequest)

Create a card load

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardLoadRequestCO loadRequest = new CardLoadRequestCO(); // CardLoadRequestCO | loadRequest
try {
    CardLoadUnloadResponseVO result = apiInstance.createCardLoadUsingPost(loadRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardLoadUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadRequest** | [**CardLoadRequestCO**](CardLoadRequestCO.md)| loadRequest |

### Return type

[**CardLoadUnloadResponseVO**](CardLoadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardPinUsingPost"></a>
# **createCardPinUsingPost**
> BaseResponseVO createCardPinUsingPost(cardPinRequestCO)

pin card

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardPinRequestCO cardPinRequestCO = new CardPinRequestCO(); // CardPinRequestCO | cardPinRequestCO
try {
    BaseResponseVO result = apiInstance.createCardPinUsingPost(cardPinRequestCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardPinUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardPinRequestCO** | [**CardPinRequestCO**](CardPinRequestCO.md)| cardPinRequestCO |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardReactivateUsingPost"></a>
# **createCardReactivateUsingPost**
> BaseResponseVO createCardReactivateUsingPost(reactivateRequest)

reactivate card

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardBaseRequestCO reactivateRequest = new CardBaseRequestCO(); // CardBaseRequestCO | reactivateRequest
try {
    BaseResponseVO result = apiInstance.createCardReactivateUsingPost(reactivateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardReactivateUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reactivateRequest** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| reactivateRequest |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardReissueUsingPost"></a>
# **createCardReissueUsingPost**
> BaseResponseVO createCardReissueUsingPost(request)

Reissue a card

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardBaseRequestCO request = new CardBaseRequestCO(); // CardBaseRequestCO | request
try {
    BaseResponseVO result = apiInstance.createCardReissueUsingPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardReissueUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| request |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardReplaceUsingPost"></a>
# **createCardReplaceUsingPost**
> CardReplaceResponseVO createCardReplaceUsingPost(request)

Create card replace

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardBaseRequestCO request = new CardBaseRequestCO(); // CardBaseRequestCO | request
try {
    CardReplaceResponseVO result = apiInstance.createCardReplaceUsingPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardReplaceUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| request |

### Return type

[**CardReplaceResponseVO**](CardReplaceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardSpendingControlUsingPost"></a>
# **createCardSpendingControlUsingPost**
> CardSpendingControlResponseVO createCardSpendingControlUsingPost(request)

Create card spending control

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardSpendingControlRequestCO request = new CardSpendingControlRequestCO(); // CardSpendingControlRequestCO | request
try {
    CardSpendingControlResponseVO result = apiInstance.createCardSpendingControlUsingPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardSpendingControlUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardSpendingControlRequestCO**](CardSpendingControlRequestCO.md)| request |

### Return type

[**CardSpendingControlResponseVO**](CardSpendingControlResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardSuspendUsingPost"></a>
# **createCardSuspendUsingPost**
> BaseResponseVO createCardSuspendUsingPost(suspendRequest)

suspend card

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardBaseRequestCO suspendRequest = new CardBaseRequestCO(); // CardBaseRequestCO | suspendRequest
try {
    BaseResponseVO result = apiInstance.createCardSuspendUsingPost(suspendRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardSuspendUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suspendRequest** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| suspendRequest |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardTokenUsingPost"></a>
# **createCardTokenUsingPost**
> CardTokenResponseVO createCardTokenUsingPost(tokenizeRequest)

token card

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardTokenRequestCO tokenizeRequest = new CardTokenRequestCO(); // CardTokenRequestCO | tokenizeRequest
try {
    CardTokenResponseVO result = apiInstance.createCardTokenUsingPost(tokenizeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardTokenUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenizeRequest** | [**CardTokenRequestCO**](CardTokenRequestCO.md)| tokenizeRequest |

### Return type

[**CardTokenResponseVO**](CardTokenResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardUnloadUsingPost"></a>
# **createCardUnloadUsingPost**
> CardLoadUnloadResponseVO createCardUnloadUsingPost(reloadRequest)

Create a card upload

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardUnloadRequestCO reloadRequest = new CardUnloadRequestCO(); // CardUnloadRequestCO | reloadRequest
try {
    CardLoadUnloadResponseVO result = apiInstance.createCardUnloadUsingPost(reloadRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardUnloadUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reloadRequest** | [**CardUnloadRequestCO**](CardUnloadRequestCO.md)| reloadRequest |

### Return type

[**CardLoadUnloadResponseVO**](CardLoadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientCardUsingPost"></a>
# **createClientCardUsingPost**
> CreateCardClientResponseVO createClientCardUsingPost(cardClientRequestCO)

Create a card client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardClientRequestCO cardClientRequestCO = new CardClientRequestCO(); // CardClientRequestCO | cardClientRequestCO
try {
    CreateCardClientResponseVO result = apiInstance.createClientCardUsingPost(cardClientRequestCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createClientCardUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardClientRequestCO** | [**CardClientRequestCO**](CardClientRequestCO.md)| cardClientRequestCO |

### Return type

[**CreateCardClientResponseVO**](CreateCardClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardBalanceUsingGet"></a>
# **getCardBalanceUsingGet**
> CardBalanceResponseVO getCardBalanceUsingGet(id, endDate, startDate)

Get a Card Balance

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID id = new UUID(); // UUID | id
LocalDate endDate = LocalDate.now(); // LocalDate | end_date
LocalDate startDate = LocalDate.now(); // LocalDate | start_date
try {
    CardBalanceResponseVO result = apiInstance.getCardBalanceUsingGet(id, endDate, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardBalanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |
 **endDate** | **LocalDate**| end_date | [optional]
 **startDate** | **LocalDate**| start_date | [optional]

### Return type

[**CardBalanceResponseVO**](CardBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardImage"></a>
# **getCardImage**
> GetCardImageResponseVO getCardImage(cardId)

Get card image

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID cardId = new UUID(); // UUID | card_id
try {
    GetCardImageResponseVO result = apiInstance.getCardImage(cardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**UUID**](.md)| card_id |

### Return type

[**GetCardImageResponseVO**](GetCardImageResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardPciDetails"></a>
# **getCardPciDetails**
> GetCardPciDetailsResponseVO getCardPciDetails(cardId)

Get card pci details

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID cardId = new UUID(); // UUID | card_id
try {
    GetCardPciDetailsResponseVO result = apiInstance.getCardPciDetails(cardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardPciDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**UUID**](.md)| card_id |

### Return type

[**GetCardPciDetailsResponseVO**](GetCardPciDetailsResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardReserveAccountDetailsUsingGet"></a>
# **getCardReserveAccountDetailsUsingGet**
> CardReserveAccountResponseVO getCardReserveAccountDetailsUsingGet()

Card reserve account

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
try {
    CardReserveAccountResponseVO result = apiInstance.getCardReserveAccountDetailsUsingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardReserveAccountDetailsUsingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CardReserveAccountResponseVO**](CardReserveAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardStatementUsingGet"></a>
# **getCardStatementUsingGet**
> GetCardStatementResponseVO getCardStatementUsingGet(cardId, endDate, startDate)

Get card statement

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID cardId = new UUID(); // UUID | card_id
LocalDate endDate = LocalDate.now(); // LocalDate | end_date
LocalDate startDate = LocalDate.now(); // LocalDate | start_date
try {
    GetCardStatementResponseVO result = apiInstance.getCardStatementUsingGet(cardId, endDate, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardStatementUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**UUID**](.md)| card_id |
 **endDate** | **LocalDate**| end_date | [optional]
 **startDate** | **LocalDate**| start_date | [optional]

### Return type

[**GetCardStatementResponseVO**](GetCardStatementResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardTokenUsingToken"></a>
# **getCardTokenUsingToken**
> List&lt;GetCardTokenResponseVO&gt; getCardTokenUsingToken(id, deviceId, deviceType, wallet)

Get a card token

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID id = new UUID(); // UUID | id
String deviceId = "deviceId_example"; // String | device_id
String deviceType = "deviceType_example"; // String | device_type
String wallet = "wallet_example"; // String | wallet
try {
    List<GetCardTokenResponseVO> result = apiInstance.getCardTokenUsingToken(id, deviceId, deviceType, wallet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardTokenUsingToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |
 **deviceId** | **String**| device_id | [optional]
 **deviceType** | **String**| device_type | [optional] [enum: watch, mobile_phone, tablet, gaming_device, vehicle, appliance, laptop]
 **wallet** | **String**| wallet | [optional] [enum: google, apple, samsung]

### Return type

[**List&lt;GetCardTokenResponseVO&gt;**](GetCardTokenResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardTransactionUsingGet"></a>
# **getCardTransactionUsingGet**
> CardTransactionResponseVO getCardTransactionUsingGet(id, endDate, startDate)

Get a card transaction

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID id = new UUID(); // UUID | id
LocalDate endDate = LocalDate.now(); // LocalDate | end_date
LocalDate startDate = LocalDate.now(); // LocalDate | start_date
try {
    CardTransactionResponseVO result = apiInstance.getCardTransactionUsingGet(id, endDate, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardTransactionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |
 **endDate** | **LocalDate**| end_date | [optional]
 **startDate** | **LocalDate**| start_date | [optional]

### Return type

[**CardTransactionResponseVO**](CardTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardUsingGet"></a>
# **getCardUsingGet**
> BaseResponseVO getCardUsingGet(id)

Get a card information

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID id = new UUID(); // UUID | id
try {
    BaseResponseVO result = apiInstance.getCardUsingGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCardBusinessUsingPut"></a>
# **updateCardBusinessUsingPut**
> UpdateBusinessResponseVO updateCardBusinessUsingPut(nucleusBusinessId)

Update a card business

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID nucleusBusinessId = new UUID(); // UUID | nucleus_business_id
try {
    UpdateBusinessResponseVO result = apiInstance.updateCardBusinessUsingPut(nucleusBusinessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardBusinessUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBusinessId** | [**UUID**](.md)| nucleus_business_id |

### Return type

[**UpdateBusinessResponseVO**](UpdateBusinessResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCardPinUsingPost"></a>
# **updateCardPinUsingPost**
> BaseResponseVO updateCardPinUsingPost(cardPinRequestCO, id)

update a pin card

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardUpdatePinRequestCO cardPinRequestCO = new CardUpdatePinRequestCO(); // CardUpdatePinRequestCO | cardPinRequestCO
UUID id = new UUID(); // UUID | id
try {
    BaseResponseVO result = apiInstance.updateCardPinUsingPost(cardPinRequestCO, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardPinUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardPinRequestCO** | [**CardUpdatePinRequestCO**](CardUpdatePinRequestCO.md)| cardPinRequestCO |
 **id** | [**UUID**](.md)| id |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCardSpendingControlUsingPut"></a>
# **updateCardSpendingControlUsingPut**
> CardSpendingControlResponseVO updateCardSpendingControlUsingPut(nucleusSpendingControlId)

Update a card spending control

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID nucleusSpendingControlId = new UUID(); // UUID | nucleus_spending_control_id
try {
    CardSpendingControlResponseVO result = apiInstance.updateCardSpendingControlUsingPut(nucleusSpendingControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardSpendingControlUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusSpendingControlId** | [**UUID**](.md)| nucleus_spending_control_id |

### Return type

[**CardSpendingControlResponseVO**](CardSpendingControlResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCardUsingPut"></a>
# **updateCardUsingPut**
> BaseResponseVO updateCardUsingPut(id)

Update a card information

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID id = new UUID(); // UUID | id
try {
    BaseResponseVO result = apiInstance.updateCardUsingPut(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClientCardUsingPut"></a>
# **updateClientCardUsingPut**
> UpdateCardClientResponseVO updateClientCardUsingPut(id)

Update a card client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
UUID id = new UUID(); // UUID | id
try {
    UpdateCardClientResponseVO result = apiInstance.updateClientCardUsingPut(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateClientCardUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

[**UpdateCardClientResponseVO**](UpdateCardClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyCardPinUsingPost"></a>
# **verifyCardPinUsingPost**
> BaseResponseVO verifyCardPinUsingPost(cardPinRequestCO)

verify card pin

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

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
CardApi apiInstance = new CardApi();
CardPinRequestCO cardPinRequestCO = new CardPinRequestCO(); // CardPinRequestCO | cardPinRequestCO
try {
    BaseResponseVO result = apiInstance.verifyCardPinUsingPost(cardPinRequestCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#verifyCardPinUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardPinRequestCO** | [**CardPinRequestCO**](CardPinRequestCO.md)| cardPinRequestCO |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

