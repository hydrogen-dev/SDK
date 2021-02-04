# KycApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKYCUsingPost**](KycApi.md#createKYCUsingPost) | **POST** /kyc | Do kyc for the client.
[**getKYCStatusUsingGet**](KycApi.md#getKYCStatusUsingGet) | **GET** /kyc_status | Fetch kyc_status for the given nucleus_client_id


<a name="createKYCUsingPost"></a>
# **createKYCUsingPost**
> KycResponseVo createKYCUsingPost(kycRequestCO)

Do kyc for the client.

Do kyc for the client.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import KycApi;

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
KycApi apiInstance = new KycApi();
KycRequestCO kycRequestCO = new KycRequestCO(); // KycRequestCO | kycRequestCO
try {
    KycResponseVo result = apiInstance.createKYCUsingPost(kycRequestCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#createKYCUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kycRequestCO** | [**KycRequestCO**](KycRequestCO.md)| kycRequestCO |

### Return type

[**KycResponseVo**](KycResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getKYCStatusUsingGet"></a>
# **getKYCStatusUsingGet**
> List&lt;KycResponseVo&gt; getKYCStatusUsingGet(getLatest, kycType, nucleusBusinessId, nucleusClientId, product)

Fetch kyc_status for the given nucleus_client_id

Fetch kyc_status for the given nucleus_client_id

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import KycApi;

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
KycApi apiInstance = new KycApi();
Boolean getLatest = false; // Boolean | get_latest
String kycType = "all"; // String | kyc_type
UUID nucleusBusinessId = new UUID(); // UUID | nucleus_business_id
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
String product = "atom"; // String | product
try {
    List<KycResponseVo> result = apiInstance.getKYCStatusUsingGet(getLatest, kycType, nucleusBusinessId, nucleusClientId, product);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#getKYCStatusUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getLatest** | **Boolean**| get_latest | [optional] [default to false]
 **kycType** | **String**| kyc_type | [optional] [default to all]
 **nucleusBusinessId** | [**UUID**](.md)| nucleus_business_id | [optional]
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id | [optional]
 **product** | **String**| product | [optional] [default to atom]

### Return type

[**List&lt;KycResponseVo&gt;**](KycResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

