# FinancialPlanningApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**educationCalculatorAnnualCost**](FinancialPlanningApi.md#educationCalculatorAnnualCost) | **POST** /education_calculator/annual_cost | Education Calculator - Annual Cost
[**educationCalculatorDepositAmount**](FinancialPlanningApi.md#educationCalculatorDepositAmount) | **POST** /education_calculator/deposit_amount | Education Calculator - Deposit Amount
[**educationCalculatorPercentCovered**](FinancialPlanningApi.md#educationCalculatorPercentCovered) | **POST** /education_calculator/percent_covered | Education Calculator - Percent Covered
[**mortgageCalculatorDownPayment**](FinancialPlanningApi.md#mortgageCalculatorDownPayment) | **POST** /mortgage_calculator/down_payment | Mortgage Calculator - Down Payment
[**mortgageCalculatorHomePrice**](FinancialPlanningApi.md#mortgageCalculatorHomePrice) | **POST** /mortgage_calculator/home_price | Mortgage Calculator - Home Price
[**mortgageCalculatorPeriodicPayment**](FinancialPlanningApi.md#mortgageCalculatorPeriodicPayment) | **POST** /mortgage_calculator/periodic_payment | Mortgage Calculator - Periodic Payment
[**purchaseCalculatorAmount**](FinancialPlanningApi.md#purchaseCalculatorAmount) | **POST** /purchase_calculator/amount | Purchase Calculator - Amount
[**purchaseCalculatorDepositAmount**](FinancialPlanningApi.md#purchaseCalculatorDepositAmount) | **POST** /purchase_calculator/deposit_amount | Purchase Calculator - Deposit Amount
[**purchaseCalculatorHorizon**](FinancialPlanningApi.md#purchaseCalculatorHorizon) | **POST** /purchase_calculator/horizon | Purchase Calculator - Horizon
[**retirementCalculatorDepositAmount**](FinancialPlanningApi.md#retirementCalculatorDepositAmount) | **POST** /retirement_calculator/deposit_amount | Retirement Calculator - Deposit Amount
[**retirementCalculatorExpenses**](FinancialPlanningApi.md#retirementCalculatorExpenses) | **POST** /retirement_calculator/expenses | Retirement Calculator - Expenses
[**retirementCalculatorPercentCovered**](FinancialPlanningApi.md#retirementCalculatorPercentCovered) | **POST** /retirement_calculator/percent_covered | Retirement Calculator - Percent Covered


<a name="educationCalculatorAnnualCost"></a>
# **educationCalculatorAnnualCost**
> Map&lt;String, Object&gt; educationCalculatorAnnualCost(educationCalculatorAnnualCostRequest)

Education Calculator - Annual Cost

Calculate the achievable education costs

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
EducationCalculatorAnnualCostRequest educationCalculatorAnnualCostRequest = new EducationCalculatorAnnualCostRequest(); // EducationCalculatorAnnualCostRequest | Request payload for Education Calculator - Annual Cost
try {
    Map<String, Object> result = apiInstance.educationCalculatorAnnualCost(educationCalculatorAnnualCostRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#educationCalculatorAnnualCost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **educationCalculatorAnnualCostRequest** | [**EducationCalculatorAnnualCostRequest**](EducationCalculatorAnnualCostRequest.md)| Request payload for Education Calculator - Annual Cost |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="educationCalculatorDepositAmount"></a>
# **educationCalculatorDepositAmount**
> Map&lt;String, Object&gt; educationCalculatorDepositAmount(educationCalculatorDepositAmountRequest)

Education Calculator - Deposit Amount

Calculate the necessary periodic deposit amount to achieve education costs

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
EducationCalculatorDepositAmountRequest educationCalculatorDepositAmountRequest = new EducationCalculatorDepositAmountRequest(); // EducationCalculatorDepositAmountRequest | Request payload for Education Calculator - Deposit Amount
try {
    Map<String, Object> result = apiInstance.educationCalculatorDepositAmount(educationCalculatorDepositAmountRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#educationCalculatorDepositAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **educationCalculatorDepositAmountRequest** | [**EducationCalculatorDepositAmountRequest**](EducationCalculatorDepositAmountRequest.md)| Request payload for Education Calculator - Deposit Amount |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="educationCalculatorPercentCovered"></a>
# **educationCalculatorPercentCovered**
> Map&lt;String, Object&gt; educationCalculatorPercentCovered(educationCalculatorPercentCoveredRequest)

Education Calculator - Percent Covered

Calculate the achievable percentage of education costs that can be covered

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
EducationCalculatorPercentCoveredRequest educationCalculatorPercentCoveredRequest = new EducationCalculatorPercentCoveredRequest(); // EducationCalculatorPercentCoveredRequest | Request payload for Education Calculator - Percent Covered
try {
    Map<String, Object> result = apiInstance.educationCalculatorPercentCovered(educationCalculatorPercentCoveredRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#educationCalculatorPercentCovered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **educationCalculatorPercentCoveredRequest** | [**EducationCalculatorPercentCoveredRequest**](EducationCalculatorPercentCoveredRequest.md)| Request payload for Education Calculator - Percent Covered |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorDownPayment"></a>
# **mortgageCalculatorDownPayment**
> Map&lt;String, Object&gt; mortgageCalculatorDownPayment(mortgageCalculatorDownPaymentRequest)

Mortgage Calculator - Down Payment

Calculate the necessary down payment for the mortgage

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
MortgageCalculatorDownPaymentRequest mortgageCalculatorDownPaymentRequest = new MortgageCalculatorDownPaymentRequest(); // MortgageCalculatorDownPaymentRequest | Request payload for Mortgage Calculator - Down Payment
try {
    Map<String, Object> result = apiInstance.mortgageCalculatorDownPayment(mortgageCalculatorDownPaymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#mortgageCalculatorDownPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgageCalculatorDownPaymentRequest** | [**MortgageCalculatorDownPaymentRequest**](MortgageCalculatorDownPaymentRequest.md)| Request payload for Mortgage Calculator - Down Payment |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorHomePrice"></a>
# **mortgageCalculatorHomePrice**
> Map&lt;String, Object&gt; mortgageCalculatorHomePrice(mortgageCalculatorHomePriceRequest)

Mortgage Calculator - Home Price

Calculate the achievable home price for the mortgage

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
MortgageCalculatorHomePriceRequest mortgageCalculatorHomePriceRequest = new MortgageCalculatorHomePriceRequest(); // MortgageCalculatorHomePriceRequest | Request payload for Mortgage Calculator - Home Price
try {
    Map<String, Object> result = apiInstance.mortgageCalculatorHomePrice(mortgageCalculatorHomePriceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#mortgageCalculatorHomePrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgageCalculatorHomePriceRequest** | [**MortgageCalculatorHomePriceRequest**](MortgageCalculatorHomePriceRequest.md)| Request payload for Mortgage Calculator - Home Price |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorPeriodicPayment"></a>
# **mortgageCalculatorPeriodicPayment**
> Map&lt;String, Object&gt; mortgageCalculatorPeriodicPayment(mortgageCalculatorPeriodicPaymentRequest)

Mortgage Calculator - Periodic Payment

Calculate the periodic payment for the mortgage

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
MortgageCalculatorPeriodicPaymentRequest mortgageCalculatorPeriodicPaymentRequest = new MortgageCalculatorPeriodicPaymentRequest(); // MortgageCalculatorPeriodicPaymentRequest | Request payload for Mortgage Calculator - Periodic Payment
try {
    Map<String, Object> result = apiInstance.mortgageCalculatorPeriodicPayment(mortgageCalculatorPeriodicPaymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#mortgageCalculatorPeriodicPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgageCalculatorPeriodicPaymentRequest** | [**MortgageCalculatorPeriodicPaymentRequest**](MortgageCalculatorPeriodicPaymentRequest.md)| Request payload for Mortgage Calculator - Periodic Payment |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorAmount"></a>
# **purchaseCalculatorAmount**
> Map&lt;String, Object&gt; purchaseCalculatorAmount(purchaseCalculatorAmountRequest)

Purchase Calculator - Amount

Calculate the achievable purchase amount

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
PurchaseCalculatorAmountRequest purchaseCalculatorAmountRequest = new PurchaseCalculatorAmountRequest(); // PurchaseCalculatorAmountRequest | Request payload for Purchase Calculator - Amount
try {
    Map<String, Object> result = apiInstance.purchaseCalculatorAmount(purchaseCalculatorAmountRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#purchaseCalculatorAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseCalculatorAmountRequest** | [**PurchaseCalculatorAmountRequest**](PurchaseCalculatorAmountRequest.md)| Request payload for Purchase Calculator - Amount |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorDepositAmount"></a>
# **purchaseCalculatorDepositAmount**
> Map&lt;String, Object&gt; purchaseCalculatorDepositAmount(purchaseCalculatorDepositAmountRequest)

Purchase Calculator - Deposit Amount

Calculate the necessary periodic deposit amount to achieve the purchase amount

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
PurchaseCalculatorDepositAmountRequest purchaseCalculatorDepositAmountRequest = new PurchaseCalculatorDepositAmountRequest(); // PurchaseCalculatorDepositAmountRequest | Request payload for Purchase Calculator - Deposit Amount
try {
    Map<String, Object> result = apiInstance.purchaseCalculatorDepositAmount(purchaseCalculatorDepositAmountRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#purchaseCalculatorDepositAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseCalculatorDepositAmountRequest** | [**PurchaseCalculatorDepositAmountRequest**](PurchaseCalculatorDepositAmountRequest.md)| Request payload for Purchase Calculator - Deposit Amount |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorHorizon"></a>
# **purchaseCalculatorHorizon**
> Map&lt;String, Object&gt; purchaseCalculatorHorizon(purchaseCalculatorHorizonRequest)

Purchase Calculator - Horizon

Calculate the necessary time horizon to achieve the purchase amount

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
PurchaseCalculatorHorizonRequest purchaseCalculatorHorizonRequest = new PurchaseCalculatorHorizonRequest(); // PurchaseCalculatorHorizonRequest | Request payload for Purchase Calculator - Horizon
try {
    Map<String, Object> result = apiInstance.purchaseCalculatorHorizon(purchaseCalculatorHorizonRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#purchaseCalculatorHorizon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseCalculatorHorizonRequest** | [**PurchaseCalculatorHorizonRequest**](PurchaseCalculatorHorizonRequest.md)| Request payload for Purchase Calculator - Horizon |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorDepositAmount"></a>
# **retirementCalculatorDepositAmount**
> Map&lt;String, Object&gt; retirementCalculatorDepositAmount(retirementCalculatorDepositAmountRequest)

Retirement Calculator - Deposit Amount

Calculate the necessary period deposit amount to achieve the retirement expenses

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
RetirementCalculatorDepositAmountRequest retirementCalculatorDepositAmountRequest = new RetirementCalculatorDepositAmountRequest(); // RetirementCalculatorDepositAmountRequest | Request payload for Retirement Calculator - Deposit AMount
try {
    Map<String, Object> result = apiInstance.retirementCalculatorDepositAmount(retirementCalculatorDepositAmountRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#retirementCalculatorDepositAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirementCalculatorDepositAmountRequest** | [**RetirementCalculatorDepositAmountRequest**](RetirementCalculatorDepositAmountRequest.md)| Request payload for Retirement Calculator - Deposit AMount |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorExpenses"></a>
# **retirementCalculatorExpenses**
> Map&lt;String, Object&gt; retirementCalculatorExpenses(retirementCalculatorExpensesRequest)

Retirement Calculator - Expenses

Calculate the achievable retirement expenses

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
RetirementCalculatorExpensesRequest retirementCalculatorExpensesRequest = new RetirementCalculatorExpensesRequest(); // RetirementCalculatorExpensesRequest | Request payload for Retirement Calculator - Expenses
try {
    Map<String, Object> result = apiInstance.retirementCalculatorExpenses(retirementCalculatorExpensesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#retirementCalculatorExpenses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirementCalculatorExpensesRequest** | [**RetirementCalculatorExpensesRequest**](RetirementCalculatorExpensesRequest.md)| Request payload for Retirement Calculator - Expenses |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorPercentCovered"></a>
# **retirementCalculatorPercentCovered**
> Map&lt;String, Object&gt; retirementCalculatorPercentCovered(retirementCalculatorPercentCoveredRequest)

Retirement Calculator - Percent Covered

Calculate the achievable percentage of retirement expenses that can be covered

### Example
```java
// Import classes:
//import com.hydrogen.proton.AuthApiClient;
//import com.hydrogen.proton.ApiException;
//import com.hydrogen.proton.auth.*;
//import FinancialPlanningApi;

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

FinancialPlanningApi apiInstance = new FinancialPlanningApi();
RetirementCalculatorPercentCoveredRequest retirementCalculatorPercentCoveredRequest = new RetirementCalculatorPercentCoveredRequest(); // RetirementCalculatorPercentCoveredRequest | Request payload for Retirement Calculator - Percent Covered
try {
    Map<String, Object> result = apiInstance.retirementCalculatorPercentCovered(retirementCalculatorPercentCoveredRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPlanningApi#retirementCalculatorPercentCovered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirementCalculatorPercentCoveredRequest** | [**RetirementCalculatorPercentCoveredRequest**](RetirementCalculatorPercentCoveredRequest.md)| Request payload for Retirement Calculator - Percent Covered |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

