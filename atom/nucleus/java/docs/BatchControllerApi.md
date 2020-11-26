# BatchControllerApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aggregationAccountBalanceEncryptionJobUsingGET**](BatchControllerApi.md#aggregationAccountBalanceEncryptionJobUsingGET) | **GET** /aggregation_account_balance_encryption | aggregationAccountBalanceEncryptionJob
[**bankLinkEncryptionJobUsingGET**](BatchControllerApi.md#bankLinkEncryptionJobUsingGET) | **GET** /bank_link_encryption | bankLinkEncryptionJob
[**clientAddressEncryptionJobUsingGET**](BatchControllerApi.md#clientAddressEncryptionJobUsingGET) | **GET** /client_address_encryption | clientAddressEncryptionJob
[**clientCitizenshipEncryptionJobUsingGET**](BatchControllerApi.md#clientCitizenshipEncryptionJobUsingGET) | **GET** /client_citizenship_encryption | clientCitizenshipEncryptionJob
[**clientEncryptionJobUsingGET**](BatchControllerApi.md#clientEncryptionJobUsingGET) | **GET** /client_encryption | clientEncryptionJob


<a name="aggregationAccountBalanceEncryptionJobUsingGET"></a>
# **aggregationAccountBalanceEncryptionJobUsingGET**
> String aggregationAccountBalanceEncryptionJobUsingGET()

aggregationAccountBalanceEncryptionJob

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BatchControllerApi;

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


BatchControllerApi apiInstance = new BatchControllerApi();
try {
    String result = apiInstance.aggregationAccountBalanceEncryptionJobUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchControllerApi#aggregationAccountBalanceEncryptionJobUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="bankLinkEncryptionJobUsingGET"></a>
# **bankLinkEncryptionJobUsingGET**
> String bankLinkEncryptionJobUsingGET()

bankLinkEncryptionJob

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BatchControllerApi;

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


BatchControllerApi apiInstance = new BatchControllerApi();
try {
    String result = apiInstance.bankLinkEncryptionJobUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchControllerApi#bankLinkEncryptionJobUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="clientAddressEncryptionJobUsingGET"></a>
# **clientAddressEncryptionJobUsingGET**
> String clientAddressEncryptionJobUsingGET()

clientAddressEncryptionJob

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BatchControllerApi;

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


BatchControllerApi apiInstance = new BatchControllerApi();
try {
    String result = apiInstance.clientAddressEncryptionJobUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchControllerApi#clientAddressEncryptionJobUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="clientCitizenshipEncryptionJobUsingGET"></a>
# **clientCitizenshipEncryptionJobUsingGET**
> String clientCitizenshipEncryptionJobUsingGET()

clientCitizenshipEncryptionJob

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BatchControllerApi;

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


BatchControllerApi apiInstance = new BatchControllerApi();
try {
    String result = apiInstance.clientCitizenshipEncryptionJobUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchControllerApi#clientCitizenshipEncryptionJobUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="clientEncryptionJobUsingGET"></a>
# **clientEncryptionJobUsingGET**
> String clientEncryptionJobUsingGET()

clientEncryptionJob

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import BatchControllerApi;

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


BatchControllerApi apiInstance = new BatchControllerApi();
try {
    String result = apiInstance.clientEncryptionJobUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchControllerApi#clientEncryptionJobUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

