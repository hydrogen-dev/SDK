# AnnuitiesApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annuityCalculatorAccumulationHorizon**](AnnuitiesApi.md#annuityCalculatorAccumulationHorizon) | **POST** /annuity_calculator/accumulation_horizon | Annuity Calculator - Accumulation Horizon
[**annuityCalculatorAnnuityAmount**](AnnuitiesApi.md#annuityCalculatorAnnuityAmount) | **POST** /annuity_calculator/annuity_amount | Annuity Calculator - Annuity Amount
[**annuityCalculatorDecumulationHorizon**](AnnuitiesApi.md#annuityCalculatorDecumulationHorizon) | **POST** /annuity_calculator/decumulation_horizon | Annuity Calculator - Decumulation Horizon
[**annuityCalculatorDepositAmount**](AnnuitiesApi.md#annuityCalculatorDepositAmount) | **POST** /annuity_calculator/deposit_amount | Annuity Calculator - Deposit Amount
[**annuityCalculatorInitialBalance**](AnnuitiesApi.md#annuityCalculatorInitialBalance) | **POST** /annuity_calculator/initial_balance | Annuity Calculator - Initial Balance
[**variableAnnuity**](AnnuitiesApi.md#variableAnnuity) | **POST** /variable_annuity | Variable Annuity


<a name="annuityCalculatorAccumulationHorizon"></a>
# **annuityCalculatorAccumulationHorizon**
> Map&lt;String, Object&gt; annuityCalculatorAccumulationHorizon(annuityCalculatorAccumulationHorizonRequest)

Annuity Calculator - Accumulation Horizon

Calculate the necessary fixed annuity contribution period

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import AnnuitiesApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}


AnnuitiesApi apiInstance = new AnnuitiesApi();
AnnuityCalculatorAccumulationHorizonRequest annuityCalculatorAccumulationHorizonRequest = new AnnuityCalculatorAccumulationHorizonRequest(); // AnnuityCalculatorAccumulationHorizonRequest | Request payload for Annuity Calculator - Accumulation Horizon
try {
    Map<String, Object> result = apiInstance.annuityCalculatorAccumulationHorizon(annuityCalculatorAccumulationHorizonRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnuitiesApi#annuityCalculatorAccumulationHorizon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuityCalculatorAccumulationHorizonRequest** | [**AnnuityCalculatorAccumulationHorizonRequest**](AnnuityCalculatorAccumulationHorizonRequest.md)| Request payload for Annuity Calculator - Accumulation Horizon |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorAnnuityAmount"></a>
# **annuityCalculatorAnnuityAmount**
> Map&lt;String, Object&gt; annuityCalculatorAnnuityAmount(annuityCalculatorAnnuityAmountRequest)

Annuity Calculator - Annuity Amount

Calculate the achievable fixed annuity amount

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import AnnuitiesApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}


AnnuitiesApi apiInstance = new AnnuitiesApi();
AnnuityCalculatorAnnuityAmountRequest annuityCalculatorAnnuityAmountRequest = new AnnuityCalculatorAnnuityAmountRequest(); // AnnuityCalculatorAnnuityAmountRequest | Request payload for Annuity Calculator - Annuity Amount
try {
    Map<String, Object> result = apiInstance.annuityCalculatorAnnuityAmount(annuityCalculatorAnnuityAmountRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnuitiesApi#annuityCalculatorAnnuityAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuityCalculatorAnnuityAmountRequest** | [**AnnuityCalculatorAnnuityAmountRequest**](AnnuityCalculatorAnnuityAmountRequest.md)| Request payload for Annuity Calculator - Annuity Amount |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorDecumulationHorizon"></a>
# **annuityCalculatorDecumulationHorizon**
> Map&lt;String, Object&gt; annuityCalculatorDecumulationHorizon(annuityCalculatorDecumulationHorizonRequest)

Annuity Calculator - Decumulation Horizon

Calculate the achievable fixed annuity payout period

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import AnnuitiesApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}


AnnuitiesApi apiInstance = new AnnuitiesApi();
AnnuityCalculatorDecumulationHorizonRequest annuityCalculatorDecumulationHorizonRequest = new AnnuityCalculatorDecumulationHorizonRequest(); // AnnuityCalculatorDecumulationHorizonRequest | Request payload for Annuity Calculator - Decumulation Horizon
try {
    Map<String, Object> result = apiInstance.annuityCalculatorDecumulationHorizon(annuityCalculatorDecumulationHorizonRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnuitiesApi#annuityCalculatorDecumulationHorizon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuityCalculatorDecumulationHorizonRequest** | [**AnnuityCalculatorDecumulationHorizonRequest**](AnnuityCalculatorDecumulationHorizonRequest.md)| Request payload for Annuity Calculator - Decumulation Horizon |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorDepositAmount"></a>
# **annuityCalculatorDepositAmount**
> Map&lt;String, Object&gt; annuityCalculatorDepositAmount(annuityCalculatorDepositAmountRequest)

Annuity Calculator - Deposit Amount

Calculate the necessary periodic deposit amount for a fixed annuity

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import AnnuitiesApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}


AnnuitiesApi apiInstance = new AnnuitiesApi();
AnnuityCalculatorDepositAmountRequest annuityCalculatorDepositAmountRequest = new AnnuityCalculatorDepositAmountRequest(); // AnnuityCalculatorDepositAmountRequest | Request payload for Annuity Calculator - Deposit Amount
try {
    Map<String, Object> result = apiInstance.annuityCalculatorDepositAmount(annuityCalculatorDepositAmountRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnuitiesApi#annuityCalculatorDepositAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuityCalculatorDepositAmountRequest** | [**AnnuityCalculatorDepositAmountRequest**](AnnuityCalculatorDepositAmountRequest.md)| Request payload for Annuity Calculator - Deposit Amount |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorInitialBalance"></a>
# **annuityCalculatorInitialBalance**
> Map&lt;String, Object&gt; annuityCalculatorInitialBalance(annuityCalculatorInitialBalanceRequest)

Annuity Calculator - Initial Balance

Calculate the necessary initial balance for a fixed annuity

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import AnnuitiesApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}


AnnuitiesApi apiInstance = new AnnuitiesApi();
AnnuityCalculatorInitialBalanceRequest annuityCalculatorInitialBalanceRequest = new AnnuityCalculatorInitialBalanceRequest(); // AnnuityCalculatorInitialBalanceRequest | Request payload for Annuity Calculator - Initial Balance
try {
    Map<String, Object> result = apiInstance.annuityCalculatorInitialBalance(annuityCalculatorInitialBalanceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnuitiesApi#annuityCalculatorInitialBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuityCalculatorInitialBalanceRequest** | [**AnnuityCalculatorInitialBalanceRequest**](AnnuityCalculatorInitialBalanceRequest.md)| Request payload for Annuity Calculator - Initial Balance |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="variableAnnuity"></a>
# **variableAnnuity**
> Map&lt;String, Object&gt; variableAnnuity(variableAnnuityRequest)

Variable Annuity

Project the behavior of a variable annuity over time

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import AnnuitiesApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}


AnnuitiesApi apiInstance = new AnnuitiesApi();
VariableAnnuityRequest variableAnnuityRequest = new VariableAnnuityRequest(); // VariableAnnuityRequest | Request payload for Variable Annuity
try {
    Map<String, Object> result = apiInstance.variableAnnuity(variableAnnuityRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnuitiesApi#variableAnnuity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableAnnuityRequest** | [**VariableAnnuityRequest**](VariableAnnuityRequest.md)| Request payload for Variable Annuity |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

