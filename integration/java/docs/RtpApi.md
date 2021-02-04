# RtpApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRtpTransferUsingDelete**](RtpApi.md#cancelRtpTransferUsingDelete) | **DELETE** /rtp/{nucleus_funding_id} | Cancel the RTP transfer
[**createBankLinkUsingPost2**](RtpApi.md#createBankLinkUsingPost2) | **POST** /rtp/bank_link | Create bank link
[**deleteBankLinkUsingDelete2**](RtpApi.md#deleteBankLinkUsingDelete2) | **DELETE** /rtp/bank_link/{nucleus_bank_link_id} | Delete bank link
[**getBankLinkUsingGet2**](RtpApi.md#getBankLinkUsingGet2) | **GET** /rtp/bank_link/{nucleus_bank_link_id} | Get bank link
[**getClientBankLinksUsingGet1**](RtpApi.md#getClientBankLinksUsingGet1) | **GET** /rtp/bank_link/client/{nucleus_client_id} | Get client bank links
[**getListOfRtpTransfersUsingGet**](RtpApi.md#getListOfRtpTransfersUsingGet) | **GET** /rtp/client/{nucleus_client_id} | Get a list of Rtp transfers
[**getRtpTransferUsingGet**](RtpApi.md#getRtpTransferUsingGet) | **GET** /rtp/{nucleus_funding_id} | Get the RTP transfer
[**submitRtpTransferUsingPost**](RtpApi.md#submitRtpTransferUsingPost) | **POST** /rtp | Submit a RTP transfer
[**updateBankLinkUsingPut2**](RtpApi.md#updateBankLinkUsingPut2) | **PUT** /rtp/bank_link/{nucleus_bank_link_id} | Update bank link


<a name="cancelRtpTransferUsingDelete"></a>
# **cancelRtpTransferUsingDelete**
> RtpTransferResponseVO cancelRtpTransferUsingDelete(nucleusFundingId)

Cancel the RTP transfer

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import RtpApi;

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
RtpApi apiInstance = new RtpApi();
UUID nucleusFundingId = new UUID(); // UUID | nucleus_funding_id
try {
    RtpTransferResponseVO result = apiInstance.cancelRtpTransferUsingDelete(nucleusFundingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RtpApi#cancelRtpTransferUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**UUID**](.md)| nucleus_funding_id |

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBankLinkUsingPost2"></a>
# **createBankLinkUsingPost2**
> RtpBankLinkResponseVO createBankLinkUsingPost2(request)

Create bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import RtpApi;

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
RtpApi apiInstance = new RtpApi();
RtpBankLinkRequestCO request = new RtpBankLinkRequestCO(); // RtpBankLinkRequestCO | request
try {
    RtpBankLinkResponseVO result = apiInstance.createBankLinkUsingPost2(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RtpApi#createBankLinkUsingPost2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RtpBankLinkRequestCO**](RtpBankLinkRequestCO.md)| request |

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBankLinkUsingDelete2"></a>
# **deleteBankLinkUsingDelete2**
> RtpBankLinkResponseVO deleteBankLinkUsingDelete2(nucleusBankLinkId)

Delete bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import RtpApi;

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
RtpApi apiInstance = new RtpApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    RtpBankLinkResponseVO result = apiInstance.deleteBankLinkUsingDelete2(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RtpApi#deleteBankLinkUsingDelete2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankLinkUsingGet2"></a>
# **getBankLinkUsingGet2**
> RtpBankLinkResponseVO getBankLinkUsingGet2(nucleusBankLinkId)

Get bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import RtpApi;

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
RtpApi apiInstance = new RtpApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    RtpBankLinkResponseVO result = apiInstance.getBankLinkUsingGet2(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RtpApi#getBankLinkUsingGet2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientBankLinksUsingGet1"></a>
# **getClientBankLinksUsingGet1**
> List&lt;RtpBankLinkResponseVO&gt; getClientBankLinksUsingGet1(nucleusClientId)

Get client bank links

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import RtpApi;

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
RtpApi apiInstance = new RtpApi();
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
try {
    List<RtpBankLinkResponseVO> result = apiInstance.getClientBankLinksUsingGet1(nucleusClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RtpApi#getClientBankLinksUsingGet1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id |

### Return type

[**List&lt;RtpBankLinkResponseVO&gt;**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListOfRtpTransfersUsingGet"></a>
# **getListOfRtpTransfersUsingGet**
> List&lt;RtpTransferResponseVO&gt; getListOfRtpTransfersUsingGet(nucleusClientId)

Get a list of Rtp transfers

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import RtpApi;

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
RtpApi apiInstance = new RtpApi();
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
try {
    List<RtpTransferResponseVO> result = apiInstance.getListOfRtpTransfersUsingGet(nucleusClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RtpApi#getListOfRtpTransfersUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id |

### Return type

[**List&lt;RtpTransferResponseVO&gt;**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRtpTransferUsingGet"></a>
# **getRtpTransferUsingGet**
> RtpTransferResponseVO getRtpTransferUsingGet(nucleusFundingId)

Get the RTP transfer

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import RtpApi;

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
RtpApi apiInstance = new RtpApi();
UUID nucleusFundingId = new UUID(); // UUID | nucleus_funding_id
try {
    RtpTransferResponseVO result = apiInstance.getRtpTransferUsingGet(nucleusFundingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RtpApi#getRtpTransferUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusFundingId** | [**UUID**](.md)| nucleus_funding_id |

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitRtpTransferUsingPost"></a>
# **submitRtpTransferUsingPost**
> RtpTransferResponseVO submitRtpTransferUsingPost(transferRequest)

Submit a RTP transfer

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import RtpApi;

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
RtpApi apiInstance = new RtpApi();
RtpTransferRequestCO transferRequest = new RtpTransferRequestCO(); // RtpTransferRequestCO | transferRequest
try {
    RtpTransferResponseVO result = apiInstance.submitRtpTransferUsingPost(transferRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RtpApi#submitRtpTransferUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferRequest** | [**RtpTransferRequestCO**](RtpTransferRequestCO.md)| transferRequest |

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBankLinkUsingPut2"></a>
# **updateBankLinkUsingPut2**
> RtpBankLinkResponseVO updateBankLinkUsingPut2(nucleusBankLinkId)

Update bank link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import RtpApi;

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
RtpApi apiInstance = new RtpApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    RtpBankLinkResponseVO result = apiInstance.updateBankLinkUsingPut2(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RtpApi#updateBankLinkUsingPut2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

