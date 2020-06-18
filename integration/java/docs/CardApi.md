# CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCardActivateUsingPost**](CardApi.md#createCardActivateUsingPost) | **POST** /card/activate | Activate card
[**createCardCloseUsingPost**](CardApi.md#createCardCloseUsingPost) | **POST** /card/close | close a card
[**createCardIssueUsingPost**](CardApi.md#createCardIssueUsingPost) | **POST** /card/issue | issue a card
[**createCardPinUsingPost**](CardApi.md#createCardPinUsingPost) | **POST** /card/pin | pin card
[**createCardReactivateUsingPost**](CardApi.md#createCardReactivateUsingPost) | **POST** /card/reactivate | reactivate card
[**createCardReissueUsingPost**](CardApi.md#createCardReissueUsingPost) | **POST** /card/reissue | Reissue a card
[**createCardReloadUsingPost**](CardApi.md#createCardReloadUsingPost) | **POST** /card/reload | Create a card reload
[**createCardSuspendUsingPost**](CardApi.md#createCardSuspendUsingPost) | **POST** /card/suspend | suspend card
[**createCardTokenUsingPost**](CardApi.md#createCardTokenUsingPost) | **POST** /card/token | token card
[**createCardTransferUsingPost**](CardApi.md#createCardTransferUsingPost) | **POST** /card/transfer | Create Card transfer
[**createCardUnloadUsingPost**](CardApi.md#createCardUnloadUsingPost) | **POST** /card/unload | Create a card upload
[**createClientCardUsingPost**](CardApi.md#createClientCardUsingPost) | **POST** /card/client | Create a card client
[**getCardBalanceUsingGet**](CardApi.md#getCardBalanceUsingGet) | **GET** /card/balance/{id} | Get a Card Balance
[**getCardTokenUsingToken**](CardApi.md#getCardTokenUsingToken) | **GET** /card/token/{id} | Get a card token
[**getCardTransactionUsingGet**](CardApi.md#getCardTransactionUsingGet) | **GET** /card/transaction/{id} | Get a card transaction
[**getCardUsingGet**](CardApi.md#getCardUsingGet) | **GET** /card/{id} | Get a card information
[**updateCardPinUsingPost**](CardApi.md#updateCardPinUsingPost) | **PUT** /card/pin/{id} | update a pin card
[**updateCardUsingPut**](CardApi.md#updateCardUsingPut) | **PUT** /card/{id} | Update a card information


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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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

<a name="createCardReloadUsingPost"></a>
# **createCardReloadUsingPost**
> CardReloadUnloadResponseVO createCardReloadUsingPost(reloadRequest)

Create a card reload

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
CardApi apiInstance = new CardApi();
CardReloadRequestCO reloadRequest = new CardReloadRequestCO(); // CardReloadRequestCO | reloadRequest
try {
    CardReloadUnloadResponseVO result = apiInstance.createCardReloadUsingPost(reloadRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardReloadUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reloadRequest** | [**CardReloadRequestCO**](CardReloadRequestCO.md)| reloadRequest |

### Return type

[**CardReloadUnloadResponseVO**](CardReloadUnloadResponseVO.md)

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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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

<a name="createCardTransferUsingPost"></a>
# **createCardTransferUsingPost**
> CardTransferResponseVO createCardTransferUsingPost(transferRequest)

Create Card transfer

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
CardApi apiInstance = new CardApi();
CardTransferRequestCO transferRequest = new CardTransferRequestCO(); // CardTransferRequestCO | transferRequest
try {
    CardTransferResponseVO result = apiInstance.createCardTransferUsingPost(transferRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardTransferUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferRequest** | [**CardTransferRequestCO**](CardTransferRequestCO.md)| transferRequest |

### Return type

[**CardTransferResponseVO**](CardTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardUnloadUsingPost"></a>
# **createCardUnloadUsingPost**
> CardReloadUnloadResponseVO createCardUnloadUsingPost(reloadRequest)

Create a card upload

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
CardApi apiInstance = new CardApi();
CardUnloadRequestCO reloadRequest = new CardUnloadRequestCO(); // CardUnloadRequestCO | reloadRequest
try {
    CardReloadUnloadResponseVO result = apiInstance.createCardUnloadUsingPost(reloadRequest);
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

[**CardReloadUnloadResponseVO**](CardReloadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientCardUsingPost"></a>
# **createClientCardUsingPost**
> CardClientResponseVO createClientCardUsingPost(cardClientRequestCO)

Create a card client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
CardApi apiInstance = new CardApi();
CardClientRequestCO cardClientRequestCO = new CardClientRequestCO(); // CardClientRequestCO | cardClientRequestCO
try {
    CardClientResponseVO result = apiInstance.createClientCardUsingPost(cardClientRequestCO);
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

[**CardClientResponseVO**](CardClientResponseVO.md)

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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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

<a name="getCardTokenUsingToken"></a>
# **getCardTokenUsingToken**
> GetCardTokenResponseVO getCardTokenUsingToken(id)

Get a card token

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import CardApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
CardApi apiInstance = new CardApi();
UUID id = new UUID(); // UUID | id
try {
    GetCardTokenResponseVO result = apiInstance.getCardTokenUsingToken(id);
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

### Return type

[**GetCardTokenResponseVO**](GetCardTokenResponseVO.md)

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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
CardApi apiInstance = new CardApi();
CardPinRequestCO cardPinRequestCO = new CardPinRequestCO(); // CardPinRequestCO | cardPinRequestCO
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
 **cardPinRequestCO** | [**CardPinRequestCO**](CardPinRequestCO.md)| cardPinRequestCO |
 **id** | [**UUID**](.md)| id |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

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
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
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

