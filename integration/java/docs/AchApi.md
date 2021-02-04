# AchApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelAchTransferUsingDelete**](AchApi.md#cancelAchTransferUsingDelete) | **DELETE** /ach/{nucleus_funding_id} | Cancel the ACH transfer
[**createAchCardLinkUsingPost**](AchApi.md#createAchCardLinkUsingPost) | **POST** /ach/card_link | Create an ACH card link
[**createBankLinkUsingPost**](AchApi.md#createBankLinkUsingPost) | **POST** /ach/bank_link | Create bank link
[**createBusinessUsingPost**](AchApi.md#createBusinessUsingPost) | **POST** /ach/business | Create a business
[**createClientUsingPost**](AchApi.md#createClientUsingPost) | **POST** /ach/client | Create a client
[**deleteBankLinkUsingDelete**](AchApi.md#deleteBankLinkUsingDelete) | **DELETE** /ach/bank_link/{nucleus_bank_link_id} | Delete bank link
[**getAchTransferUsingGet**](AchApi.md#getAchTransferUsingGet) | **GET** /ach/{nucleus_funding_id} | Get the ACH transfer
[**getBalanceUsingGet**](AchApi.md#getBalanceUsingGet) | **GET** /ach/balance/{portfolio_id} | Get balance
[**getBankLinkUsingGet**](AchApi.md#getBankLinkUsingGet) | **GET** /ach/bank_link/{nucleus_bank_link_id} | Get bank link
[**getBankLinksForReserveAccountUsingGet**](AchApi.md#getBankLinksForReserveAccountUsingGet) | **GET** /ach/bank_link/reserve | Get bank links for a reserve account
[**getClientBankLinksUsingGet**](AchApi.md#getClientBankLinksUsingGet) | **GET** /ach/bank_link/client/{nucleus_client_id} | Get client bank links
[**getListOfClientAchTransfersUsingGet**](AchApi.md#getListOfClientAchTransfersUsingGet) | **GET** /ach/client/{nucleus_client_id} | Get a list of client&#39;s ACH transfers
[**getListOfTenantAchTransfersUsingGet**](AchApi.md#getListOfTenantAchTransfersUsingGet) | **GET** /ach | Get a list of tenant&#39;s ACH transfers
[**submitAchTransferUsingPost**](AchApi.md#submitAchTransferUsingPost) | **POST** /ach | Submit an ACH transfer
[**updateBankLinkUsingPut**](AchApi.md#updateBankLinkUsingPut) | **PUT** /ach/bank_link/{nucleus_bank_link_id} | Update bank link


<a name="cancelAchTransferUsingDelete"></a>
# **cancelAchTransferUsingDelete**
> AchTransferResponseVO cancelAchTransferUsingDelete(nucleusFundingId)

Cancel the ACH transfer

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
UUID nucleusFundingId = new UUID(); // UUID | nucleus_funding_id
try {
    AchTransferResponseVO result = apiInstance.cancelAchTransferUsingDelete(nucleusFundingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#cancelAchTransferUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**UUID**](.md)| nucleus_funding_id |

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAchCardLinkUsingPost"></a>
# **createAchCardLinkUsingPost**
> AchCardLinkResponseVO createAchCardLinkUsingPost(cardLinkRequestCO)

Create an ACH card link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
AchCardLinkRequestCO cardLinkRequestCO = new AchCardLinkRequestCO(); // AchCardLinkRequestCO | cardLinkRequestCO
try {
    AchCardLinkResponseVO result = apiInstance.createAchCardLinkUsingPost(cardLinkRequestCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#createAchCardLinkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardLinkRequestCO** | [**AchCardLinkRequestCO**](AchCardLinkRequestCO.md)| cardLinkRequestCO |

### Return type

[**AchCardLinkResponseVO**](AchCardLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBankLinkUsingPost"></a>
# **createBankLinkUsingPost**
> AchBankLinkResponseVO createBankLinkUsingPost(achBankLinkRequestCO)

Create bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
AchBankLinkRequestCO achBankLinkRequestCO = new AchBankLinkRequestCO(); // AchBankLinkRequestCO | achBankLinkRequestCO
try {
    AchBankLinkResponseVO result = apiInstance.createBankLinkUsingPost(achBankLinkRequestCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#createBankLinkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **achBankLinkRequestCO** | [**AchBankLinkRequestCO**](AchBankLinkRequestCO.md)| achBankLinkRequestCO |

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBusinessUsingPost"></a>
# **createBusinessUsingPost**
> BaseResponseVO createBusinessUsingPost(businessRequest)

Create a business

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
AchBusinessRequestCO businessRequest = new AchBusinessRequestCO(); // AchBusinessRequestCO | businessRequest
try {
    BaseResponseVO result = apiInstance.createBusinessUsingPost(businessRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#createBusinessUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessRequest** | [**AchBusinessRequestCO**](AchBusinessRequestCO.md)| businessRequest |

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientUsingPost"></a>
# **createClientUsingPost**
> AchClientResponseVO createClientUsingPost(clientRequest)

Create a client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
AchClientRequestCO clientRequest = new AchClientRequestCO(); // AchClientRequestCO | clientRequest
try {
    AchClientResponseVO result = apiInstance.createClientUsingPost(clientRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#createClientUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientRequest** | [**AchClientRequestCO**](AchClientRequestCO.md)| clientRequest |

### Return type

[**AchClientResponseVO**](AchClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBankLinkUsingDelete"></a>
# **deleteBankLinkUsingDelete**
> AchBankLinkResponseVO deleteBankLinkUsingDelete(nucleusBankLinkId)

Delete bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    AchBankLinkResponseVO result = apiInstance.deleteBankLinkUsingDelete(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#deleteBankLinkUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAchTransferUsingGet"></a>
# **getAchTransferUsingGet**
> AchTransferResponseVO getAchTransferUsingGet(nucleusFundingId)

Get the ACH transfer

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
UUID nucleusFundingId = new UUID(); // UUID | nucleus_funding_id
try {
    AchTransferResponseVO result = apiInstance.getAchTransferUsingGet(nucleusFundingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#getAchTransferUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**UUID**](.md)| nucleus_funding_id |

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBalanceUsingGet"></a>
# **getBalanceUsingGet**
> AchBalanceResponseVO getBalanceUsingGet(portfolioId, endDate, startDate)

Get balance

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
UUID portfolioId = new UUID(); // UUID | portfolio_id
LocalDate endDate = LocalDate.now(); // LocalDate | end_date
LocalDate startDate = LocalDate.now(); // LocalDate | start_date
try {
    AchBalanceResponseVO result = apiInstance.getBalanceUsingGet(portfolioId, endDate, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#getBalanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**UUID**](.md)| portfolio_id |
 **endDate** | **LocalDate**| end_date | [optional]
 **startDate** | **LocalDate**| start_date | [optional]

### Return type

[**AchBalanceResponseVO**](AchBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankLinkUsingGet"></a>
# **getBankLinkUsingGet**
> AchBankLinkResponseVO getBankLinkUsingGet(nucleusBankLinkId)

Get bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    AchBankLinkResponseVO result = apiInstance.getBankLinkUsingGet(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#getBankLinkUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankLinksForReserveAccountUsingGet"></a>
# **getBankLinksForReserveAccountUsingGet**
> List&lt;AchBankLinkResponseVO&gt; getBankLinksForReserveAccountUsingGet()

Get bank links for a reserve account

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
try {
    List<AchBankLinkResponseVO> result = apiInstance.getBankLinksForReserveAccountUsingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#getBankLinksForReserveAccountUsingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AchBankLinkResponseVO&gt;**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientBankLinksUsingGet"></a>
# **getClientBankLinksUsingGet**
> List&lt;AchBankLinkResponseVO&gt; getClientBankLinksUsingGet(nucleusClientId)

Get client bank links

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
try {
    List<AchBankLinkResponseVO> result = apiInstance.getClientBankLinksUsingGet(nucleusClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#getClientBankLinksUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id |

### Return type

[**List&lt;AchBankLinkResponseVO&gt;**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListOfClientAchTransfersUsingGet"></a>
# **getListOfClientAchTransfersUsingGet**
> PageAchTransferResponseVO getListOfClientAchTransfersUsingGet(nucleusClientId, page, size)

Get a list of client&#39;s ACH transfers

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAchTransferResponseVO result = apiInstance.getListOfClientAchTransfersUsingGet(nucleusClientId, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#getListOfClientAchTransfersUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id |
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAchTransferResponseVO**](PageAchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListOfTenantAchTransfersUsingGet"></a>
# **getListOfTenantAchTransfersUsingGet**
> PageAchTransferResponseVO getListOfTenantAchTransfersUsingGet(endDate, page, size, startDate, status)

Get a list of tenant&#39;s ACH transfers

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
LocalDate endDate = LocalDate.now(); // LocalDate | end_date
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
LocalDate startDate = LocalDate.now(); // LocalDate | start_date
String status = "status_example"; // String | status
try {
    PageAchTransferResponseVO result = apiInstance.getListOfTenantAchTransfersUsingGet(endDate, page, size, startDate, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#getListOfTenantAchTransfersUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | **LocalDate**| end_date | [optional]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **LocalDate**| start_date | [optional]
 **status** | **String**| status | [optional]

### Return type

[**PageAchTransferResponseVO**](PageAchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitAchTransferUsingPost"></a>
# **submitAchTransferUsingPost**
> AchTransferResponseVO submitAchTransferUsingPost(transferRequest)

Submit an ACH transfer

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
AchTransferRequestCO transferRequest = new AchTransferRequestCO(); // AchTransferRequestCO | transferRequest
try {
    AchTransferResponseVO result = apiInstance.submitAchTransferUsingPost(transferRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#submitAchTransferUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferRequest** | [**AchTransferRequestCO**](AchTransferRequestCO.md)| transferRequest |

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBankLinkUsingPut"></a>
# **updateBankLinkUsingPut**
> AchBankLinkResponseVO updateBankLinkUsingPut(nucleusBankLinkId)

Update bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AchApi;

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
AchApi apiInstance = new AchApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    AchBankLinkResponseVO result = apiInstance.updateBankLinkUsingPut(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AchApi#updateBankLinkUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

