# PersonalFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**budgetCalculator**](PersonalFinancialManagementApi.md#budgetCalculator) | **POST** /budget_calculator | Budget Calculator
[**cashFlowAnalysis**](PersonalFinancialManagementApi.md#cashFlowAnalysis) | **POST** /cash_flow_analysis | Cash Flow Analysis
[**feeAnalysis**](PersonalFinancialManagementApi.md#feeAnalysis) | **POST** /fee_analysis | RFee Analysis
[**financialPicture**](PersonalFinancialManagementApi.md#financialPicture) | **POST** /financial_picture | Financial Picture
[**recurringTransactionAnalysis**](PersonalFinancialManagementApi.md#recurringTransactionAnalysis) | **POST** /recurring_transaction_analysis | Recurring Transaction Analysis


<a name="budgetCalculator"></a>
# **budgetCalculator**
> Map&lt;String, Object&gt; budgetCalculator(budgetCalculatorRequest)

Budget Calculator

Analyze spending against a defined budget

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import PersonalFinancialManagementApi;

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

PersonalFinancialManagementApi apiInstance = new PersonalFinancialManagementApi();
BudgetCalculatorRequest budgetCalculatorRequest = new BudgetCalculatorRequest(); // BudgetCalculatorRequest | Request payload for Budget Calculator
try {
    Map<String, Object> result = apiInstance.budgetCalculator(budgetCalculatorRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalFinancialManagementApi#budgetCalculator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetCalculatorRequest** | [**BudgetCalculatorRequest**](BudgetCalculatorRequest.md)| Request payload for Budget Calculator |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cashFlowAnalysis"></a>
# **cashFlowAnalysis**
> Map&lt;String, Object&gt; cashFlowAnalysis(cashFlowAnalysisRequest)

Cash Flow Analysis

Analyze income, expenses, and net income

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import PersonalFinancialManagementApi;

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

PersonalFinancialManagementApi apiInstance = new PersonalFinancialManagementApi();
CashFlowAnalysisRequest cashFlowAnalysisRequest = new CashFlowAnalysisRequest(); // CashFlowAnalysisRequest | Request payload for Cash Flow Analysis
try {
    Map<String, Object> result = apiInstance.cashFlowAnalysis(cashFlowAnalysisRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalFinancialManagementApi#cashFlowAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashFlowAnalysisRequest** | [**CashFlowAnalysisRequest**](CashFlowAnalysisRequest.md)| Request payload for Cash Flow Analysis |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="feeAnalysis"></a>
# **feeAnalysis**
> Map&lt;String, Object&gt; feeAnalysis(feeAnalysisRequest)

RFee Analysis

Analyze fee data

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import PersonalFinancialManagementApi;

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

PersonalFinancialManagementApi apiInstance = new PersonalFinancialManagementApi();
FeeAnalysisRequest feeAnalysisRequest = new FeeAnalysisRequest(); // FeeAnalysisRequest | Request payload for Fee Analysis
try {
    Map<String, Object> result = apiInstance.feeAnalysis(feeAnalysisRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalFinancialManagementApi#feeAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feeAnalysisRequest** | [**FeeAnalysisRequest**](FeeAnalysisRequest.md)| Request payload for Fee Analysis |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="financialPicture"></a>
# **financialPicture**
> Map&lt;String, Object&gt; financialPicture(financialPictureRequest)

Financial Picture

Assess assets, liabilities, and net worth

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import PersonalFinancialManagementApi;

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

PersonalFinancialManagementApi apiInstance = new PersonalFinancialManagementApi();
FinancialPictureRequest financialPictureRequest = new FinancialPictureRequest(); // FinancialPictureRequest | Request payload for Financial Picture
try {
    Map<String, Object> result = apiInstance.financialPicture(financialPictureRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalFinancialManagementApi#financialPicture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialPictureRequest** | [**FinancialPictureRequest**](FinancialPictureRequest.md)| Request payload for Financial Picture |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recurringTransactionAnalysis"></a>
# **recurringTransactionAnalysis**
> Map&lt;String, Object&gt; recurringTransactionAnalysis(recurringTransactionAnalysisRequest)

Recurring Transaction Analysis

Analyze recurring transactions

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import PersonalFinancialManagementApi;

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

PersonalFinancialManagementApi apiInstance = new PersonalFinancialManagementApi();
RecurringTransactionAnalysisRequest recurringTransactionAnalysisRequest = new RecurringTransactionAnalysisRequest(); // RecurringTransactionAnalysisRequest | Request payload for Recurring Transaction Analysis
try {
    Map<String, Object> result = apiInstance.recurringTransactionAnalysis(recurringTransactionAnalysisRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalFinancialManagementApi#recurringTransactionAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurringTransactionAnalysisRequest** | [**RecurringTransactionAnalysisRequest**](RecurringTransactionAnalysisRequest.md)| Request payload for Recurring Transaction Analysis |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

