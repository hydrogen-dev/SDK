# BaasApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBaasAccountUsingPost**](BaasApi.md#createBaasAccountUsingPost) | **POST** /baas/account | create a Baas account
[**createBaasBusinessUsingPost**](BaasApi.md#createBaasBusinessUsingPost) | **POST** /baas/business | Create a Baas Business
[**createBaasClientUsingPost**](BaasApi.md#createBaasClientUsingPost) | **POST** /baas/client | Create a Baas Client
[**createBaasSubAccountUsingPost**](BaasApi.md#createBaasSubAccountUsingPost) | **POST** /baas/subaccount | create a Baas subaccount
[**getBaasAccountStatementUsingGet**](BaasApi.md#getBaasAccountStatementUsingGet) | **GET** /baas/statement/{nucleus_account_id} | Get a Baas account statement
[**getBaasPortfolioBalanceUsingGet**](BaasApi.md#getBaasPortfolioBalanceUsingGet) | **GET** /baas/balance/{nucleus_portfolio_id} | Get a Baas portfolio balance
[**getBaasPortfolioTransactionUsingGet**](BaasApi.md#getBaasPortfolioTransactionUsingGet) | **GET** /baas/transaction/{nucleus_portfolio_id} | Get a Baas portfolio transaction
[**updateBaasBusinessUsingPut**](BaasApi.md#updateBaasBusinessUsingPut) | **PUT** /baas/business/{nucleus_business_id} | Update a Baas business
[**updateBaasClientUsingPut**](BaasApi.md#updateBaasClientUsingPut) | **PUT** /baas/client/{nucleus_client_id} | Update a Baas client


<a name="createBaasAccountUsingPost"></a>
# **createBaasAccountUsingPost**
> BaasAccountVO createBaasAccountUsingPost(baasAccountCO)

create a Baas account

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BaasApi;

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
BaasApi apiInstance = new BaasApi();
BaasAccountCO baasAccountCO = new BaasAccountCO(); // BaasAccountCO | baasAccountCO
try {
    BaasAccountVO result = apiInstance.createBaasAccountUsingPost(baasAccountCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaasApi#createBaasAccountUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baasAccountCO** | [**BaasAccountCO**](BaasAccountCO.md)| baasAccountCO |

### Return type

[**BaasAccountVO**](BaasAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBaasBusinessUsingPost"></a>
# **createBaasBusinessUsingPost**
> BaasBusinessVO createBaasBusinessUsingPost(baasBusinessCO)

Create a Baas Business

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BaasApi;

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
BaasApi apiInstance = new BaasApi();
CreateBaasBusinessCO baasBusinessCO = new CreateBaasBusinessCO(); // CreateBaasBusinessCO | baasBusinessCO
try {
    BaasBusinessVO result = apiInstance.createBaasBusinessUsingPost(baasBusinessCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaasApi#createBaasBusinessUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baasBusinessCO** | [**CreateBaasBusinessCO**](CreateBaasBusinessCO.md)| baasBusinessCO |

### Return type

[**BaasBusinessVO**](BaasBusinessVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBaasClientUsingPost"></a>
# **createBaasClientUsingPost**
> BaasClientVO createBaasClientUsingPost(baasClientCO)

Create a Baas Client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BaasApi;

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
BaasApi apiInstance = new BaasApi();
CreateBaasClientCO baasClientCO = new CreateBaasClientCO(); // CreateBaasClientCO | baasClientCO
try {
    BaasClientVO result = apiInstance.createBaasClientUsingPost(baasClientCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaasApi#createBaasClientUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baasClientCO** | [**CreateBaasClientCO**](CreateBaasClientCO.md)| baasClientCO |

### Return type

[**BaasClientVO**](BaasClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBaasSubAccountUsingPost"></a>
# **createBaasSubAccountUsingPost**
> BaasSubAccountVO createBaasSubAccountUsingPost(baasSubAccountCO)

create a Baas subaccount

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BaasApi;

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
BaasApi apiInstance = new BaasApi();
BaasSubAccountCO baasSubAccountCO = new BaasSubAccountCO(); // BaasSubAccountCO | baasSubAccountCO
try {
    BaasSubAccountVO result = apiInstance.createBaasSubAccountUsingPost(baasSubAccountCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaasApi#createBaasSubAccountUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baasSubAccountCO** | [**BaasSubAccountCO**](BaasSubAccountCO.md)| baasSubAccountCO |

### Return type

[**BaasSubAccountVO**](BaasSubAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getBaasAccountStatementUsingGet"></a>
# **getBaasAccountStatementUsingGet**
> BaasStatementsVO getBaasAccountStatementUsingGet(endDate, nucleusAccountId, startDate, statementType)

Get a Baas account statement

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BaasApi;

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
BaasApi apiInstance = new BaasApi();
LocalDate endDate = LocalDate.now(); // LocalDate | end_date
UUID nucleusAccountId = new UUID(); // UUID | nucleus_account_id
LocalDate startDate = LocalDate.now(); // LocalDate | start_date
String statementType = "statementType_example"; // String | statement_type
try {
    BaasStatementsVO result = apiInstance.getBaasAccountStatementUsingGet(endDate, nucleusAccountId, startDate, statementType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaasApi#getBaasAccountStatementUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | **LocalDate**| end_date |
 **nucleusAccountId** | [**UUID**](.md)| nucleus_account_id |
 **startDate** | **LocalDate**| start_date |
 **statementType** | **String**| statement_type | [optional]

### Return type

[**BaasStatementsVO**](BaasStatementsVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBaasPortfolioBalanceUsingGet"></a>
# **getBaasPortfolioBalanceUsingGet**
> BaasBalanceVO getBaasPortfolioBalanceUsingGet(nucleusPortfolioId, endDate, startDate)

Get a Baas portfolio balance

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BaasApi;

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
BaasApi apiInstance = new BaasApi();
UUID nucleusPortfolioId = new UUID(); // UUID | nucleus_portfolio_id
LocalDate endDate = LocalDate.now(); // LocalDate | end_date
LocalDate startDate = LocalDate.now(); // LocalDate | start_date
try {
    BaasBalanceVO result = apiInstance.getBaasPortfolioBalanceUsingGet(nucleusPortfolioId, endDate, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaasApi#getBaasPortfolioBalanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusPortfolioId** | [**UUID**](.md)| nucleus_portfolio_id |
 **endDate** | **LocalDate**| end_date | [optional]
 **startDate** | **LocalDate**| start_date | [optional]

### Return type

[**BaasBalanceVO**](BaasBalanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBaasPortfolioTransactionUsingGet"></a>
# **getBaasPortfolioTransactionUsingGet**
> BaasTransactionsVO getBaasPortfolioTransactionUsingGet(nucleusPortfolioId, endDate, startDate)

Get a Baas portfolio transaction

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BaasApi;

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
BaasApi apiInstance = new BaasApi();
UUID nucleusPortfolioId = new UUID(); // UUID | nucleus_portfolio_id
LocalDate endDate = LocalDate.now(); // LocalDate | end_date
LocalDate startDate = LocalDate.now(); // LocalDate | start_date
try {
    BaasTransactionsVO result = apiInstance.getBaasPortfolioTransactionUsingGet(nucleusPortfolioId, endDate, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaasApi#getBaasPortfolioTransactionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusPortfolioId** | [**UUID**](.md)| nucleus_portfolio_id |
 **endDate** | **LocalDate**| end_date | [optional]
 **startDate** | **LocalDate**| start_date | [optional]

### Return type

[**BaasTransactionsVO**](BaasTransactionsVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBaasBusinessUsingPut"></a>
# **updateBaasBusinessUsingPut**
> BaasBusinessVO updateBaasBusinessUsingPut(nucleusBusinessId, baasBusinessCO)

Update a Baas business

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BaasApi;

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
BaasApi apiInstance = new BaasApi();
UUID nucleusBusinessId = new UUID(); // UUID | nucleus_business_id
UpdateBaasBusinessCO baasBusinessCO = new UpdateBaasBusinessCO(); // UpdateBaasBusinessCO | baasBusinessCO
try {
    BaasBusinessVO result = apiInstance.updateBaasBusinessUsingPut(nucleusBusinessId, baasBusinessCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaasApi#updateBaasBusinessUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBusinessId** | [**UUID**](.md)| nucleus_business_id |
 **baasBusinessCO** | [**UpdateBaasBusinessCO**](UpdateBaasBusinessCO.md)| baasBusinessCO | [optional]

### Return type

[**BaasBusinessVO**](BaasBusinessVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateBaasClientUsingPut"></a>
# **updateBaasClientUsingPut**
> BaasClientVO updateBaasClientUsingPut(nucleusClientId, baasClientCO)

Update a Baas client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BaasApi;

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
BaasApi apiInstance = new BaasApi();
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
UpdateBaasClientCO baasClientCO = new UpdateBaasClientCO(); // UpdateBaasClientCO | baasClientCO
try {
    BaasClientVO result = apiInstance.updateBaasClientUsingPut(nucleusClientId, baasClientCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaasApi#updateBaasClientUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id |
 **baasClientCO** | [**UpdateBaasClientCO**](UpdateBaasClientCO.md)| baasClientCO | [optional]

### Return type

[**BaasClientVO**](BaasClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

