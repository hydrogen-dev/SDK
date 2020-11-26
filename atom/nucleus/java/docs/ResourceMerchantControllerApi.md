# ResourceMerchantControllerApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMerchantsUsingGET**](ResourceMerchantControllerApi.md#getAllMerchantsUsingGET) | **GET** /resource/merchant | getAllMerchants
[**saveMerchantsUsingPOST**](ResourceMerchantControllerApi.md#saveMerchantsUsingPOST) | **POST** /resource/merchant | saveMerchants


<a name="getAllMerchantsUsingGET"></a>
# **getAllMerchantsUsingGET**
> PageMXMerchantRes getAllMerchantsUsingGET(ascending, filter, orderBy, page, size)

getAllMerchants

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ResourceMerchantControllerApi;

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


ResourceMerchantControllerApi apiInstance = new ResourceMerchantControllerApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "id"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageMXMerchantRes result = apiInstance.getAllMerchantsUsingGET(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceMerchantControllerApi#getAllMerchantsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to id]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageMXMerchantRes**](PageMXMerchantRes.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="saveMerchantsUsingPOST"></a>
# **saveMerchantsUsingPOST**
> List&lt;MXMerchantRes&gt; saveMerchantsUsingPOST(merchants)

saveMerchants

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ResourceMerchantControllerApi;

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


ResourceMerchantControllerApi apiInstance = new ResourceMerchantControllerApi();
List<MXMerchantRes> merchants = Arrays.asList(new MXMerchantRes()); // List<MXMerchantRes> | merchants
try {
    List<MXMerchantRes> result = apiInstance.saveMerchantsUsingPOST(merchants);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceMerchantControllerApi#saveMerchantsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchants** | [**List&lt;MXMerchantRes&gt;**](MXMerchantRes.md)| merchants |

### Return type

[**List&lt;MXMerchantRes&gt;**](MXMerchantRes.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

