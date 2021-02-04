# BrokerageApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrderUsingPut**](BrokerageApi.md#cancelOrderUsingPut) | **PUT** /brokerage/order/{nucleus_order_id} | Cancel an Order
[**createBankLinkUsingPost1**](BrokerageApi.md#createBankLinkUsingPost1) | **POST** /brokerage/bank_link | create a Bank Link
[**createBrokerageAccountUsingPost**](BrokerageApi.md#createBrokerageAccountUsingPost) | **POST** /brokerage/account | create a Brokerage account
[**createBrokerageClientUsingPost**](BrokerageApi.md#createBrokerageClientUsingPost) | **POST** /brokerage/client | Create a Brokerage Client
[**createDepositUsingPost**](BrokerageApi.md#createDepositUsingPost) | **POST** /brokerage/deposit | Create a deposit
[**createDocumentUsingPost**](BrokerageApi.md#createDocumentUsingPost) | **POST** /brokerage/document | Create a Brokerage document
[**createOrderUsingPost**](BrokerageApi.md#createOrderUsingPost) | **POST** /brokerage/order | Create an Order
[**createWithdrawalUsingPost**](BrokerageApi.md#createWithdrawalUsingPost) | **POST** /brokerage/withdrawal | Create a withdrawal
[**deleteBankLinkUsingDelete1**](BrokerageApi.md#deleteBankLinkUsingDelete1) | **DELETE** /brokerage/bank_link/{nucleus_bank_link_id} | Delete a Bank Link
[**getBalanceUsingGet1**](BrokerageApi.md#getBalanceUsingGet1) | **GET** /brokerage/balance/{nucleus_portfolio_id} | Get account balance
[**getBankLinkUsingGet1**](BrokerageApi.md#getBankLinkUsingGet1) | **GET** /brokerage/bank_link/{nucleus_bank_link_id} | Get a Bank Link
[**getBrokerageAccountStatementUsingGet**](BrokerageApi.md#getBrokerageAccountStatementUsingGet) | **GET** /brokerage/statement/{nucleus_account_id} | Get a Brokerage account statement
[**getDocumentUsingGet**](BrokerageApi.md#getDocumentUsingGet) | **GET** /brokerage/document/{nucleus_document_id} | Get a Brokerage document
[**getHoldingPerformanceUsingGet**](BrokerageApi.md#getHoldingPerformanceUsingGet) | **GET** /brokerage/holding/performance/{nucleus_portfolio_id} | Get portfolio holding performance
[**getHoldingUsingGet**](BrokerageApi.md#getHoldingUsingGet) | **GET** /brokerage/holding/{nucleus_portfolio_id} | Get portfolio holdings
[**getOrderUsingGet**](BrokerageApi.md#getOrderUsingGet) | **GET** /brokerage/order/{nucleus_order_id} | Get an Order
[**getSecuritiesUsingGet**](BrokerageApi.md#getSecuritiesUsingGet) | **GET** /brokerage/securities | Get securities information
[**getTransactionsUsingGet**](BrokerageApi.md#getTransactionsUsingGet) | **GET** /brokerage/transaction/{nucleus_portfolio_id} | Get account transactions
[**updateBankLinkUsingPut1**](BrokerageApi.md#updateBankLinkUsingPut1) | **PUT** /brokerage/bank_link/{nucleus_bank_link_id} | Update a Bank Link
[**updateBrokerageClientUsingPut**](BrokerageApi.md#updateBrokerageClientUsingPut) | **PUT** /brokerage/client | Update a Brokerage client


<a name="cancelOrderUsingPut"></a>
# **cancelOrderUsingPut**
> cancelOrderUsingPut(nucleusOrderId)

Cancel an Order

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusOrderId = new UUID(); // UUID | nucleus_order_id
try {
    apiInstance.cancelOrderUsingPut(nucleusOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#cancelOrderUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusOrderId** | [**UUID**](.md)| nucleus_order_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBankLinkUsingPost1"></a>
# **createBankLinkUsingPost1**
> BrokerageBankLinkVO createBankLinkUsingPost1(brokerageBankLinkCO)

create a Bank Link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
BrokerageBankLinkCO brokerageBankLinkCO = new BrokerageBankLinkCO(); // BrokerageBankLinkCO | brokerageBankLinkCO
try {
    BrokerageBankLinkVO result = apiInstance.createBankLinkUsingPost1(brokerageBankLinkCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createBankLinkUsingPost1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageBankLinkCO** | [**BrokerageBankLinkCO**](BrokerageBankLinkCO.md)| brokerageBankLinkCO |

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBrokerageAccountUsingPost"></a>
# **createBrokerageAccountUsingPost**
> BrokerageAccountVO createBrokerageAccountUsingPost(brokerageAccountCO)

create a Brokerage account

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
BrokerageAccountCO brokerageAccountCO = new BrokerageAccountCO(); // BrokerageAccountCO | brokerageAccountCO
try {
    BrokerageAccountVO result = apiInstance.createBrokerageAccountUsingPost(brokerageAccountCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createBrokerageAccountUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageAccountCO** | [**BrokerageAccountCO**](BrokerageAccountCO.md)| brokerageAccountCO |

### Return type

[**BrokerageAccountVO**](BrokerageAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBrokerageClientUsingPost"></a>
# **createBrokerageClientUsingPost**
> BrokerageCreateClientVO createBrokerageClientUsingPost(clientCO)

Create a Brokerage Client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
BrokerageClientCO clientCO = new BrokerageClientCO(); // BrokerageClientCO | clientCO
try {
    BrokerageCreateClientVO result = apiInstance.createBrokerageClientUsingPost(clientCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createBrokerageClientUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCO** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO |

### Return type

[**BrokerageCreateClientVO**](BrokerageCreateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createDepositUsingPost"></a>
# **createDepositUsingPost**
> BrokerageDepositVO createDepositUsingPost(brokerageDepositCO)

Create a deposit

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
BrokerageDepositCO brokerageDepositCO = new BrokerageDepositCO(); // BrokerageDepositCO | brokerageDepositCO
try {
    BrokerageDepositVO result = apiInstance.createDepositUsingPost(brokerageDepositCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createDepositUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageDepositCO** | [**BrokerageDepositCO**](BrokerageDepositCO.md)| brokerageDepositCO |

### Return type

[**BrokerageDepositVO**](BrokerageDepositVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createDocumentUsingPost"></a>
# **createDocumentUsingPost**
> BrokerageDocumentVO createDocumentUsingPost(documentCO)

Create a Brokerage document

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
BrokerageDocumentCO documentCO = new BrokerageDocumentCO(); // BrokerageDocumentCO | documentCO
try {
    BrokerageDocumentVO result = apiInstance.createDocumentUsingPost(documentCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createDocumentUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentCO** | [**BrokerageDocumentCO**](BrokerageDocumentCO.md)| documentCO |

### Return type

[**BrokerageDocumentVO**](BrokerageDocumentVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOrderUsingPost"></a>
# **createOrderUsingPost**
> BrokerageOrderVO createOrderUsingPost(brokerageOrderCO)

Create an Order

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
BrokerageOrderCO brokerageOrderCO = new BrokerageOrderCO(); // BrokerageOrderCO | brokerageOrderCO
try {
    BrokerageOrderVO result = apiInstance.createOrderUsingPost(brokerageOrderCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createOrderUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageOrderCO** | [**BrokerageOrderCO**](BrokerageOrderCO.md)| brokerageOrderCO |

### Return type

[**BrokerageOrderVO**](BrokerageOrderVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createWithdrawalUsingPost"></a>
# **createWithdrawalUsingPost**
> BrokerageWithdrawalVO createWithdrawalUsingPost(brokerageWithdrawalCO)

Create a withdrawal

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
BrokerageWithdrawalCO brokerageWithdrawalCO = new BrokerageWithdrawalCO(); // BrokerageWithdrawalCO | brokerageWithdrawalCO
try {
    BrokerageWithdrawalVO result = apiInstance.createWithdrawalUsingPost(brokerageWithdrawalCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createWithdrawalUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageWithdrawalCO** | [**BrokerageWithdrawalCO**](BrokerageWithdrawalCO.md)| brokerageWithdrawalCO |

### Return type

[**BrokerageWithdrawalVO**](BrokerageWithdrawalVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBankLinkUsingDelete1"></a>
# **deleteBankLinkUsingDelete1**
> deleteBankLinkUsingDelete1(nucleusBankLinkId)

Delete a Bank Link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    apiInstance.deleteBankLinkUsingDelete1(nucleusBankLinkId);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#deleteBankLinkUsingDelete1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBalanceUsingGet1"></a>
# **getBalanceUsingGet1**
> BrokerageBalanceVO getBalanceUsingGet1(nucleusPortfolioId)

Get account balance

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusPortfolioId = new UUID(); // UUID | nucleus_portfolio_id
try {
    BrokerageBalanceVO result = apiInstance.getBalanceUsingGet1(nucleusPortfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getBalanceUsingGet1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusPortfolioId** | [**UUID**](.md)| nucleus_portfolio_id |

### Return type

[**BrokerageBalanceVO**](BrokerageBalanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankLinkUsingGet1"></a>
# **getBankLinkUsingGet1**
> BrokerageBankLinkVO getBankLinkUsingGet1(nucleusBankLinkId)

Get a Bank Link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    BrokerageBankLinkVO result = apiInstance.getBankLinkUsingGet1(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getBankLinkUsingGet1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBrokerageAccountStatementUsingGet"></a>
# **getBrokerageAccountStatementUsingGet**
> BrokerageStatementVO getBrokerageAccountStatementUsingGet(endDate, nucleusAccountId, startDate, statementType)

Get a Brokerage account statement

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
UUID nucleusAccountId = new UUID(); // UUID | nucleus_account_id
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
String statementType = "statementType_example"; // String | statement_type
try {
    BrokerageStatementVO result = apiInstance.getBrokerageAccountStatementUsingGet(endDate, nucleusAccountId, startDate, statementType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getBrokerageAccountStatementUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | **OffsetDateTime**| end_date |
 **nucleusAccountId** | [**UUID**](.md)| nucleus_account_id |
 **startDate** | **OffsetDateTime**| start_date |
 **statementType** | **String**| statement_type |

### Return type

[**BrokerageStatementVO**](BrokerageStatementVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDocumentUsingGet"></a>
# **getDocumentUsingGet**
> BrokerageDocumentVO getDocumentUsingGet(nucleusDocumentId)

Get a Brokerage document

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusDocumentId = new UUID(); // UUID | nucleus_document_id
try {
    BrokerageDocumentVO result = apiInstance.getDocumentUsingGet(nucleusDocumentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getDocumentUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusDocumentId** | [**UUID**](.md)| nucleus_document_id |

### Return type

[**BrokerageDocumentVO**](BrokerageDocumentVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHoldingPerformanceUsingGet"></a>
# **getHoldingPerformanceUsingGet**
> BrokeragePerformanceVO getHoldingPerformanceUsingGet(nucleusPortfolioId)

Get portfolio holding performance

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusPortfolioId = new UUID(); // UUID | nucleus_portfolio_id
try {
    BrokeragePerformanceVO result = apiInstance.getHoldingPerformanceUsingGet(nucleusPortfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getHoldingPerformanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusPortfolioId** | [**UUID**](.md)| nucleus_portfolio_id |

### Return type

[**BrokeragePerformanceVO**](BrokeragePerformanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHoldingUsingGet"></a>
# **getHoldingUsingGet**
> BrokerageHoldingVO getHoldingUsingGet(nucleusPortfolioId)

Get portfolio holdings

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusPortfolioId = new UUID(); // UUID | nucleus_portfolio_id
try {
    BrokerageHoldingVO result = apiInstance.getHoldingUsingGet(nucleusPortfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getHoldingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusPortfolioId** | [**UUID**](.md)| nucleus_portfolio_id |

### Return type

[**BrokerageHoldingVO**](BrokerageHoldingVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderUsingGet"></a>
# **getOrderUsingGet**
> BrokerageOrderVO getOrderUsingGet(nucleusOrderId)

Get an Order

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusOrderId = new UUID(); // UUID | nucleus_order_id
try {
    BrokerageOrderVO result = apiInstance.getOrderUsingGet(nucleusOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getOrderUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusOrderId** | [**UUID**](.md)| nucleus_order_id |

### Return type

[**BrokerageOrderVO**](BrokerageOrderVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecuritiesUsingGet"></a>
# **getSecuritiesUsingGet**
> BrokerageSecuritiesVO getSecuritiesUsingGet(vendorName, getFundamentals, nucleusSecurityId)

Get securities information

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
String vendorName = "vendorName_example"; // String | vendor_name
Boolean getFundamentals = false; // Boolean | get_fundamentals
UUID nucleusSecurityId = new UUID(); // UUID | nucleus_security_id
try {
    BrokerageSecuritiesVO result = apiInstance.getSecuritiesUsingGet(vendorName, getFundamentals, nucleusSecurityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getSecuritiesUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorName** | **String**| vendor_name |
 **getFundamentals** | **Boolean**| get_fundamentals | [optional] [default to false]
 **nucleusSecurityId** | [**UUID**](.md)| nucleus_security_id | [optional]

### Return type

[**BrokerageSecuritiesVO**](BrokerageSecuritiesVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTransactionsUsingGet"></a>
# **getTransactionsUsingGet**
> BrokerageTransactionVO getTransactionsUsingGet(drivewealthResponse, endDate, nucleusPortfolioId, startDate)

Get account transactions

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
GetTransactionsResponse drivewealthResponse = new GetTransactionsResponse(); // GetTransactionsResponse | drivewealthResponse
LocalDate endDate = LocalDate.now(); // LocalDate | end_date
UUID nucleusPortfolioId = new UUID(); // UUID | nucleus_portfolio_id
LocalDate startDate = LocalDate.now(); // LocalDate | start_date
try {
    BrokerageTransactionVO result = apiInstance.getTransactionsUsingGet(drivewealthResponse, endDate, nucleusPortfolioId, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getTransactionsUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivewealthResponse** | [**GetTransactionsResponse**](GetTransactionsResponse.md)| drivewealthResponse |
 **endDate** | **LocalDate**| end_date |
 **nucleusPortfolioId** | [**UUID**](.md)| nucleus_portfolio_id |
 **startDate** | **LocalDate**| start_date |

### Return type

[**BrokerageTransactionVO**](BrokerageTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBankLinkUsingPut1"></a>
# **updateBankLinkUsingPut1**
> BrokerageBankLinkVO updateBankLinkUsingPut1(nucleusBankLinkId)

Update a Bank Link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    BrokerageBankLinkVO result = apiInstance.updateBankLinkUsingPut1(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#updateBankLinkUsingPut1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateBrokerageClientUsingPut"></a>
# **updateBrokerageClientUsingPut**
> BrokerageUpdateClientVO updateBrokerageClientUsingPut(clientCO)

Update a Brokerage client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

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
BrokerageApi apiInstance = new BrokerageApi();
BrokerageClientCO clientCO = new BrokerageClientCO(); // BrokerageClientCO | clientCO
try {
    BrokerageUpdateClientVO result = apiInstance.updateBrokerageClientUsingPut(clientCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#updateBrokerageClientUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCO** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO |

### Return type

[**BrokerageUpdateClientVO**](BrokerageUpdateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

