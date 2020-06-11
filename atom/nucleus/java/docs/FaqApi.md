# FaqApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFaqUsingPost**](FaqApi.md#createFaqUsingPost) | **POST** /faq | Create a FAQ
[**deleteFaqUsingDelete**](FaqApi.md#deleteFaqUsingDelete) | **DELETE** /faq/{faq_id} | Delete a FAQ
[**getFaqAllUsingGet**](FaqApi.md#getFaqAllUsingGet) | **GET** /faq | List all FAQ
[**getFaqUsingGet**](FaqApi.md#getFaqUsingGet) | **GET** /faq/{faq_id} | Retrieve a FAQ
[**updateFaqUsingPut**](FaqApi.md#updateFaqUsingPut) | **PUT** /faq/{faq_id} | Update a FAQ


<a name="createFaqUsingPost"></a>
# **createFaqUsingPost**
> Faq createFaqUsingPost(faqRequest)

Create a FAQ

Create a new FAQ

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import FaqApi;

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

FaqApi apiInstance = new FaqApi();
Faq faqRequest = new Faq(); // Faq | faqRequest
try {
    Faq result = apiInstance.createFaqUsingPost(faqRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#createFaqUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqRequest** | [**Faq**](Faq.md)| faqRequest |

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteFaqUsingDelete"></a>
# **deleteFaqUsingDelete**
> deleteFaqUsingDelete(faqId)

Delete a FAQ

Permanently delete a FAQ

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import FaqApi;

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

FaqApi apiInstance = new FaqApi();
UUID faqId = new UUID(); // UUID | UUID faq_id
try {
    apiInstance.deleteFaqUsingDelete(faqId);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#deleteFaqUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**UUID**](.md)| UUID faq_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFaqAllUsingGet"></a>
# **getFaqAllUsingGet**
> PageFaq getFaqAllUsingGet(ascending, filter, orderBy, page, size)

List all FAQ

Get the information for all FAQ

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import FaqApi;

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

FaqApi apiInstance = new FaqApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageFaq result = apiInstance.getFaqAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#getFaqAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageFaq**](PageFaq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFaqUsingGet"></a>
# **getFaqUsingGet**
> Faq getFaqUsingGet(faqId)

Retrieve a FAQ

Retrieve the information for a FAQ

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import FaqApi;

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

FaqApi apiInstance = new FaqApi();
UUID faqId = new UUID(); // UUID | UUID faq_id
try {
    Faq result = apiInstance.getFaqUsingGet(faqId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#getFaqUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faqId** | [**UUID**](.md)| UUID faq_id |

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateFaqUsingPut"></a>
# **updateFaqUsingPut**
> Faq updateFaqUsingPut(faq, faqId)

Update a FAQ

Update the information for a FAQ

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import FaqApi;

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

FaqApi apiInstance = new FaqApi();
Faq faq = new Faq(); // Faq | faq
UUID faqId = new UUID(); // UUID | UUID faq_id
try {
    Faq result = apiInstance.updateFaqUsingPut(faq, faqId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#updateFaqUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq** | [**Faq**](Faq.md)| faq |
 **faqId** | [**UUID**](.md)| UUID faq_id |

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

