# TokenCrowdsaleApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployCrowdsaleUsingPost**](TokenCrowdsaleApi.md#deployCrowdsaleUsingPost) | **POST** /crowdsale/deploy | Deploy token for Crowdsale
[**fundCrowdsaleUsingPost**](TokenCrowdsaleApi.md#fundCrowdsaleUsingPost) | **POST** /crowdsale/fund | Fund/add Tokens supply to Crowdsale
[**purchaseCrowdsaleUsingPost**](TokenCrowdsaleApi.md#purchaseCrowdsaleUsingPost) | **POST** /crowdsale/purchase | Purchase Tokens from Crowdsale


<a name="deployCrowdsaleUsingPost"></a>
# **deployCrowdsaleUsingPost**
> TransactionSuccessResponse deployCrowdsaleUsingPost(crowdsaleDeployParams)

Deploy token for Crowdsale

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenCrowdsaleApi;

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

TokenCrowdsaleApi apiInstance = new TokenCrowdsaleApi();
CrowdsaleDeployParams crowdsaleDeployParams = new CrowdsaleDeployParams(); // CrowdsaleDeployParams | Deploy token for Crowdsale
try {
    TransactionSuccessResponse result = apiInstance.deployCrowdsaleUsingPost(crowdsaleDeployParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenCrowdsaleApi#deployCrowdsaleUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsaleDeployParams** | [**CrowdsaleDeployParams**](CrowdsaleDeployParams.md)| Deploy token for Crowdsale |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fundCrowdsaleUsingPost"></a>
# **fundCrowdsaleUsingPost**
> TransactionSuccessResponse fundCrowdsaleUsingPost(crowdsaleFundParams)

Fund/add Tokens supply to Crowdsale

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenCrowdsaleApi;

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

TokenCrowdsaleApi apiInstance = new TokenCrowdsaleApi();
CrowdsaleFundParams crowdsaleFundParams = new CrowdsaleFundParams(); // CrowdsaleFundParams | Fund provided Token's supply to Crowdsale
try {
    TransactionSuccessResponse result = apiInstance.fundCrowdsaleUsingPost(crowdsaleFundParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenCrowdsaleApi#fundCrowdsaleUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsaleFundParams** | [**CrowdsaleFundParams**](CrowdsaleFundParams.md)| Fund provided Token&#39;s supply to Crowdsale |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="purchaseCrowdsaleUsingPost"></a>
# **purchaseCrowdsaleUsingPost**
> TransactionSuccessResponse purchaseCrowdsaleUsingPost(crowdsalePurchaseParams)

Purchase Tokens from Crowdsale

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenCrowdsaleApi;

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

TokenCrowdsaleApi apiInstance = new TokenCrowdsaleApi();
CrowdsalePurchaseParams crowdsalePurchaseParams = new CrowdsalePurchaseParams(); // CrowdsalePurchaseParams | Purchase Tokens
try {
    TransactionSuccessResponse result = apiInstance.purchaseCrowdsaleUsingPost(crowdsalePurchaseParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenCrowdsaleApi#purchaseCrowdsaleUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsalePurchaseParams** | [**CrowdsalePurchaseParams**](CrowdsalePurchaseParams.md)| Purchase Tokens |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

