# BusinessFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessFinancialHealthCheck**](BusinessFinancialManagementApi.md#businessFinancialHealthCheck) | **POST** /business/financial_health_check | Business Financial Health Check
[**cashAnalysis**](BusinessFinancialManagementApi.md#cashAnalysis) | **POST** /business/cash_analysis | Cash Analysis
[**customerAnalysis**](BusinessFinancialManagementApi.md#customerAnalysis) | **POST** /business/customer_analysis | Customer Analysis
[**financialStatementAnalysis**](BusinessFinancialManagementApi.md#financialStatementAnalysis) | **POST** /business/financial_statement_analysis | Financial Statement Analysis
[**invoiceAnalysis**](BusinessFinancialManagementApi.md#invoiceAnalysis) | **POST** /business/invoice_analysis | Invoice Analysis


<a name="businessFinancialHealthCheck"></a>
# **businessFinancialHealthCheck**
> Map&lt;String, Object&gt; businessFinancialHealthCheck(businessFinancialHealthCheckRequest)

Business Financial Health Check

Calculate a series of financial ratios to assess business financial health

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import BusinessFinancialManagementApi;

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

BusinessFinancialManagementApi apiInstance = new BusinessFinancialManagementApi();
BusinessFinancialHealthCheckRequest businessFinancialHealthCheckRequest = new BusinessFinancialHealthCheckRequest(); // BusinessFinancialHealthCheckRequest | Request payload for Business Financial Health Check
try {
    Map<String, Object> result = apiInstance.businessFinancialHealthCheck(businessFinancialHealthCheckRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessFinancialManagementApi#businessFinancialHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessFinancialHealthCheckRequest** | [**BusinessFinancialHealthCheckRequest**](BusinessFinancialHealthCheckRequest.md)| Request payload for Business Financial Health Check |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cashAnalysis"></a>
# **cashAnalysis**
> Map&lt;String, Object&gt; cashAnalysis(cashAnalysisRequest)

Cash Analysis

Analyze cash activity over time

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import BusinessFinancialManagementApi;

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

BusinessFinancialManagementApi apiInstance = new BusinessFinancialManagementApi();
CashAnalysisRequest cashAnalysisRequest = new CashAnalysisRequest(); // CashAnalysisRequest | Request payload for Cash Analysis
try {
    Map<String, Object> result = apiInstance.cashAnalysis(cashAnalysisRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessFinancialManagementApi#cashAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashAnalysisRequest** | [**CashAnalysisRequest**](CashAnalysisRequest.md)| Request payload for Cash Analysis |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerAnalysis"></a>
# **customerAnalysis**
> Map&lt;String, Object&gt; customerAnalysis(customerAnalysisRequest)

Customer Analysis

Analyze customer revenues over a time period

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import BusinessFinancialManagementApi;

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

BusinessFinancialManagementApi apiInstance = new BusinessFinancialManagementApi();
CustomerAnalysisRequest customerAnalysisRequest = new CustomerAnalysisRequest(); // CustomerAnalysisRequest | Request payload for Customer Analysis
try {
    Map<String, Object> result = apiInstance.customerAnalysis(customerAnalysisRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessFinancialManagementApi#customerAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerAnalysisRequest** | [**CustomerAnalysisRequest**](CustomerAnalysisRequest.md)| Request payload for Customer Analysis |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="financialStatementAnalysis"></a>
# **financialStatementAnalysis**
> Map&lt;String, Object&gt; financialStatementAnalysis(financialStatementAnalysisRequest)

Financial Statement Analysis

Analyze financial statement accounting data for a business

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import BusinessFinancialManagementApi;

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

BusinessFinancialManagementApi apiInstance = new BusinessFinancialManagementApi();
FinancialStatementAnalysisRequest financialStatementAnalysisRequest = new FinancialStatementAnalysisRequest(); // FinancialStatementAnalysisRequest | Request payload for Financial Statement Analysis
try {
    Map<String, Object> result = apiInstance.financialStatementAnalysis(financialStatementAnalysisRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessFinancialManagementApi#financialStatementAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialStatementAnalysisRequest** | [**FinancialStatementAnalysisRequest**](FinancialStatementAnalysisRequest.md)| Request payload for Financial Statement Analysis |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invoiceAnalysis"></a>
# **invoiceAnalysis**
> Map&lt;String, Object&gt; invoiceAnalysis(invoiceAnalysisRequest)

Invoice Analysis

Analyze invoices to understand the context of money owed and paid to a business

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import BusinessFinancialManagementApi;

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

BusinessFinancialManagementApi apiInstance = new BusinessFinancialManagementApi();
BusinessInvoiceAnalysisRequest invoiceAnalysisRequest = new BusinessInvoiceAnalysisRequest(); // BusinessInvoiceAnalysisRequest | Request payload for Invoice Analysis
try {
    Map<String, Object> result = apiInstance.invoiceAnalysis(invoiceAnalysisRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessFinancialManagementApi#invoiceAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceAnalysisRequest** | [**BusinessInvoiceAnalysisRequest**](BusinessInvoiceAnalysisRequest.md)| Request payload for Invoice Analysis |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

