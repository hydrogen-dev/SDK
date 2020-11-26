# FinancialStatementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFinancialStatementUsingPost**](FinancialStatementApi.md#createFinancialStatementUsingPost) | **POST** /financial_statement | Create an financialStatement
[**deleteFinancialStatementUsingDelete**](FinancialStatementApi.md#deleteFinancialStatementUsingDelete) | **DELETE** /financial_statement/{financial_statement_id} | Delete an financialStatement
[**getFinancialStatementAllUsingGet**](FinancialStatementApi.md#getFinancialStatementAllUsingGet) | **GET** /financial_statement | List all financialStatement
[**getFinancialStatementUsingGet**](FinancialStatementApi.md#getFinancialStatementUsingGet) | **GET** /financial_statement/{financial_statement_id} | Retrieve an financialStatement
[**updateFinancialStatementUsingPut**](FinancialStatementApi.md#updateFinancialStatementUsingPut) | **PUT** /financial_statement/{financial_statement_id} | Update an financialStatement


<a name="createFinancialStatementUsingPost"></a>
# **createFinancialStatementUsingPost**
> FinancialStatement createFinancialStatementUsingPost(financialStatement)

Create an financialStatement

Store stats pulled from financialStatement vendors.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FinancialStatementApi;

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


FinancialStatementApi apiInstance = new FinancialStatementApi();
FinancialStatement financialStatement = new FinancialStatement(); // FinancialStatement | financialStatement
try {
    FinancialStatement result = apiInstance.createFinancialStatementUsingPost(financialStatement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialStatementApi#createFinancialStatementUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialStatement** | [**FinancialStatement**](FinancialStatement.md)| financialStatement |

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteFinancialStatementUsingDelete"></a>
# **deleteFinancialStatementUsingDelete**
> deleteFinancialStatementUsingDelete(financialStatementId)

Delete an financialStatement

Permanently delete an financialStatement.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FinancialStatementApi;

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


FinancialStatementApi apiInstance = new FinancialStatementApi();
UUID financialStatementId = new UUID(); // UUID | UUID financialStatement_id
try {
    apiInstance.deleteFinancialStatementUsingDelete(financialStatementId);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialStatementApi#deleteFinancialStatementUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialStatementId** | [**UUID**](.md)| UUID financialStatement_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFinancialStatementAllUsingGet"></a>
# **getFinancialStatementAllUsingGet**
> PageFinancialStatement getFinancialStatementAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all financialStatement

Get information for all financialStatement for all clients defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FinancialStatementApi;

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


FinancialStatementApi apiInstance = new FinancialStatementApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageFinancialStatement result = apiInstance.getFinancialStatementAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialStatementApi#getFinancialStatementAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageFinancialStatement**](PageFinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFinancialStatementUsingGet"></a>
# **getFinancialStatementUsingGet**
> FinancialStatement getFinancialStatementUsingGet(financialStatementId, currencyConversion)

Retrieve an financialStatement

Retrieve the information for a specific financialStatement associated with a client.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FinancialStatementApi;

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


FinancialStatementApi apiInstance = new FinancialStatementApi();
UUID financialStatementId = new UUID(); // UUID | UUID financial_statement_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    FinancialStatement result = apiInstance.getFinancialStatementUsingGet(financialStatementId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialStatementApi#getFinancialStatementUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialStatementId** | [**UUID**](.md)| UUID financial_statement_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateFinancialStatementUsingPut"></a>
# **updateFinancialStatementUsingPut**
> FinancialStatement updateFinancialStatementUsingPut(financialStatement, financialStatementId)

Update an financialStatement

Update the information for an financialStatement.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FinancialStatementApi;

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


FinancialStatementApi apiInstance = new FinancialStatementApi();
FinancialStatement financialStatement = new FinancialStatement(); // FinancialStatement | financialStatement
UUID financialStatementId = new UUID(); // UUID | UUID financialStatement_id
try {
    FinancialStatement result = apiInstance.updateFinancialStatementUsingPut(financialStatement, financialStatementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialStatementApi#updateFinancialStatementUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialStatement** | [**FinancialStatement**](FinancialStatement.md)| financialStatement |
 **financialStatementId** | [**UUID**](.md)| UUID financialStatement_id |

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

