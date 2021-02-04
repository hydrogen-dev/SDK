# WireApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelWireTransferUsingDelete**](WireApi.md#cancelWireTransferUsingDelete) | **DELETE** /wire/{nucleus_funding_id} | Cancel the Wire transfer
[**createBankLinkUsingPost3**](WireApi.md#createBankLinkUsingPost3) | **POST** /wire/bank_link | Create bank link
[**deleteBankLinkUsingDelete3**](WireApi.md#deleteBankLinkUsingDelete3) | **DELETE** /wire/bank_link/{nucleus_bank_link_id} | Delete bank link
[**getBankLinkUsingGet3**](WireApi.md#getBankLinkUsingGet3) | **GET** /wire/bank_link/{nucleus_bank_link_id} | Get bank link
[**getClientBankLinksUsingGet2**](WireApi.md#getClientBankLinksUsingGet2) | **GET** /wire/bank_link/client/{nucleus_client_id} | Get client bank links
[**getListOfWireTransfersUsingGet**](WireApi.md#getListOfWireTransfersUsingGet) | **GET** /wire/client/{nucleus_client_id} | Get a list of Wire transfers
[**getWireTransferUsingGet**](WireApi.md#getWireTransferUsingGet) | **GET** /wire/{nucleus_funding_id} | Get the Wire transfer
[**submitWireTransferUsingPost**](WireApi.md#submitWireTransferUsingPost) | **POST** /wire | Submit a Wire transfer
[**updateBankLinkUsingPut3**](WireApi.md#updateBankLinkUsingPut3) | **PUT** /wire/bank_link/{nucleus_bank_link_id} | Update bank link


<a name="cancelWireTransferUsingDelete"></a>
# **cancelWireTransferUsingDelete**
> WireTransferResponseVO cancelWireTransferUsingDelete(nucleusFundingId)

Cancel the Wire transfer

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import WireApi;

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
WireApi apiInstance = new WireApi();
UUID nucleusFundingId = new UUID(); // UUID | nucleus_funding_id
try {
    WireTransferResponseVO result = apiInstance.cancelWireTransferUsingDelete(nucleusFundingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WireApi#cancelWireTransferUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**UUID**](.md)| nucleus_funding_id |

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBankLinkUsingPost3"></a>
# **createBankLinkUsingPost3**
> WireBankLinkResponseVO createBankLinkUsingPost3(request)

Create bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import WireApi;

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
WireApi apiInstance = new WireApi();
WireBankLinkRequestCO request = new WireBankLinkRequestCO(); // WireBankLinkRequestCO | request
try {
    WireBankLinkResponseVO result = apiInstance.createBankLinkUsingPost3(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WireApi#createBankLinkUsingPost3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**WireBankLinkRequestCO**](WireBankLinkRequestCO.md)| request |

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBankLinkUsingDelete3"></a>
# **deleteBankLinkUsingDelete3**
> WireBankLinkResponseVO deleteBankLinkUsingDelete3(nucleusBankLinkId)

Delete bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import WireApi;

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
WireApi apiInstance = new WireApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    WireBankLinkResponseVO result = apiInstance.deleteBankLinkUsingDelete3(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WireApi#deleteBankLinkUsingDelete3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankLinkUsingGet3"></a>
# **getBankLinkUsingGet3**
> WireBankLinkResponseVO getBankLinkUsingGet3(nucleusBankLinkId)

Get bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import WireApi;

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
WireApi apiInstance = new WireApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    WireBankLinkResponseVO result = apiInstance.getBankLinkUsingGet3(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WireApi#getBankLinkUsingGet3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientBankLinksUsingGet2"></a>
# **getClientBankLinksUsingGet2**
> List&lt;WireBankLinkResponseVO&gt; getClientBankLinksUsingGet2(nucleusClientId)

Get client bank links

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import WireApi;

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
WireApi apiInstance = new WireApi();
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
try {
    List<WireBankLinkResponseVO> result = apiInstance.getClientBankLinksUsingGet2(nucleusClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WireApi#getClientBankLinksUsingGet2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id |

### Return type

[**List&lt;WireBankLinkResponseVO&gt;**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListOfWireTransfersUsingGet"></a>
# **getListOfWireTransfersUsingGet**
> List&lt;WireTransferResponseVO&gt; getListOfWireTransfersUsingGet(nucleusClientId)

Get a list of Wire transfers

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import WireApi;

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
WireApi apiInstance = new WireApi();
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
try {
    List<WireTransferResponseVO> result = apiInstance.getListOfWireTransfersUsingGet(nucleusClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WireApi#getListOfWireTransfersUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id |

### Return type

[**List&lt;WireTransferResponseVO&gt;**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWireTransferUsingGet"></a>
# **getWireTransferUsingGet**
> WireTransferResponseVO getWireTransferUsingGet(nucleusFundingId)

Get the Wire transfer

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import WireApi;

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
WireApi apiInstance = new WireApi();
UUID nucleusFundingId = new UUID(); // UUID | nucleus_funding_id
try {
    WireTransferResponseVO result = apiInstance.getWireTransferUsingGet(nucleusFundingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WireApi#getWireTransferUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**UUID**](.md)| nucleus_funding_id |

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitWireTransferUsingPost"></a>
# **submitWireTransferUsingPost**
> WireTransferResponseVO submitWireTransferUsingPost(transferRequest)

Submit a Wire transfer

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import WireApi;

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
WireApi apiInstance = new WireApi();
WireTransferRequestCO transferRequest = new WireTransferRequestCO(); // WireTransferRequestCO | transferRequest
try {
    WireTransferResponseVO result = apiInstance.submitWireTransferUsingPost(transferRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WireApi#submitWireTransferUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferRequest** | [**WireTransferRequestCO**](WireTransferRequestCO.md)| transferRequest |

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBankLinkUsingPut3"></a>
# **updateBankLinkUsingPut3**
> WireBankLinkResponseVO updateBankLinkUsingPut3(nucleusBankLinkId)

Update bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import WireApi;

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
WireApi apiInstance = new WireApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    WireBankLinkResponseVO result = apiInstance.updateBankLinkUsingPut3(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WireApi#updateBankLinkUsingPut3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

