# SecuritiesApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSecurityExclusionUsingPost**](SecuritiesApi.md#createSecurityExclusionUsingPost) | **POST** /security_exclusion | Create a security exclusion
[**createSecurityPriceUsingPost**](SecuritiesApi.md#createSecurityPriceUsingPost) | **POST** /security_price | Create a security price
[**createSecurityUsingPost**](SecuritiesApi.md#createSecurityUsingPost) | **POST** /security | Create a security
[**deleteSecurityExclusionUsingDelete**](SecuritiesApi.md#deleteSecurityExclusionUsingDelete) | **DELETE** /security_exclusion/{security_exclusion_id} | Delete a security exclusion
[**deleteSecurityPriceUsingDelete**](SecuritiesApi.md#deleteSecurityPriceUsingDelete) | **DELETE** /security_price/{security_price_id} | Delete a security price
[**deleteSecurityUsingDelete**](SecuritiesApi.md#deleteSecurityUsingDelete) | **DELETE** /security/{security_id} | Delete a security
[**getSecurityAllUsingGet**](SecuritiesApi.md#getSecurityAllUsingGet) | **GET** /security | List all securities
[**getSecurityExclusionAllUsingGet**](SecuritiesApi.md#getSecurityExclusionAllUsingGet) | **GET** /security_exclusion | List all security exclusions
[**getSecurityExclusionUsingGet**](SecuritiesApi.md#getSecurityExclusionUsingGet) | **GET** /security_exclusion/{security_exclusion_id} | Retrieve a security exclusion
[**getSecurityPriceAllUsingGet**](SecuritiesApi.md#getSecurityPriceAllUsingGet) | **GET** /security_price | List all security prices
[**getSecurityPriceUsingGet**](SecuritiesApi.md#getSecurityPriceUsingGet) | **GET** /security_price/{security_price_id} | Retrieve a security price
[**getSecurityUsingGet**](SecuritiesApi.md#getSecurityUsingGet) | **GET** /security/{security_id} | Retrieve a security
[**updateSecurityExclusionUsingPut**](SecuritiesApi.md#updateSecurityExclusionUsingPut) | **PUT** /security_exclusion/{security_exclusion_id} | Update a security exclusion
[**updateSecurityPriceUsingPut**](SecuritiesApi.md#updateSecurityPriceUsingPut) | **PUT** /security_price/{security_price_id} | Update a security price
[**updateSecurityUsingPut**](SecuritiesApi.md#updateSecurityUsingPut) | **PUT** /security/{security_id} | Update a security


<a name="createSecurityExclusionUsingPost"></a>
# **createSecurityExclusionUsingPost**
> SecurityExclusion createSecurityExclusionUsingPost(securityExclusionRequest)

Create a security exclusion

Create a new security exclusion for a specific account or portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
SecurityExclusion securityExclusionRequest = new SecurityExclusion(); // SecurityExclusion | securityExclusionRequest
try {
    SecurityExclusion result = apiInstance.createSecurityExclusionUsingPost(securityExclusionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#createSecurityExclusionUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusionRequest** | [**SecurityExclusion**](SecurityExclusion.md)| securityExclusionRequest |

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSecurityPriceUsingPost"></a>
# **createSecurityPriceUsingPost**
> SecurityPrice createSecurityPriceUsingPost(securityPriceRequest)

Create a security price

Create a new price for a security defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
SecurityPrice securityPriceRequest = new SecurityPrice(); // SecurityPrice | securityPriceRequest
try {
    SecurityPrice result = apiInstance.createSecurityPriceUsingPost(securityPriceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#createSecurityPriceUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPriceRequest** | [**SecurityPrice**](SecurityPrice.md)| securityPriceRequest |

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSecurityUsingPost"></a>
# **createSecurityUsingPost**
> Security createSecurityUsingPost(securitiesInfoRequest)

Create a security

Create a new security for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
Security securitiesInfoRequest = new Security(); // Security | securitiesInfoRequest
try {
    Security result = apiInstance.createSecurityUsingPost(securitiesInfoRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#createSecurityUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securitiesInfoRequest** | [**Security**](Security.md)| securitiesInfoRequest |

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteSecurityExclusionUsingDelete"></a>
# **deleteSecurityExclusionUsingDelete**
> deleteSecurityExclusionUsingDelete(securityExclusionId)

Delete a security exclusion

Permanently delete a security exclusion

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
UUID securityExclusionId = new UUID(); // UUID | UUID security_exclusion_id
try {
    apiInstance.deleteSecurityExclusionUsingDelete(securityExclusionId);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#deleteSecurityExclusionUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusionId** | [**UUID**](.md)| UUID security_exclusion_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteSecurityPriceUsingDelete"></a>
# **deleteSecurityPriceUsingDelete**
> deleteSecurityPriceUsingDelete(securityPriceId)

Delete a security price

Permanently delete a security price from a security.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
UUID securityPriceId = new UUID(); // UUID | UUID security_price_id
try {
    apiInstance.deleteSecurityPriceUsingDelete(securityPriceId);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#deleteSecurityPriceUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPriceId** | [**UUID**](.md)| UUID security_price_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteSecurityUsingDelete"></a>
# **deleteSecurityUsingDelete**
> deleteSecurityUsingDelete(securityId)

Delete a security

Permanently delete a security for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
UUID securityId = new UUID(); // UUID | UUID security_id
try {
    apiInstance.deleteSecurityUsingDelete(securityId);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#deleteSecurityUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityId** | [**UUID**](.md)| UUID security_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityAllUsingGet"></a>
# **getSecurityAllUsingGet**
> PageSecurity getSecurityAllUsingGet(ascending, filter, orderBy, page, size)

List all securities

Get details for all securities defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageSecurity result = apiInstance.getSecurityAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#getSecurityAllUsingGet");
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

[**PageSecurity**](PageSecurity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityExclusionAllUsingGet"></a>
# **getSecurityExclusionAllUsingGet**
> PageSecurityExclusion getSecurityExclusionAllUsingGet(ascending, filter, orderBy, page, size)

List all security exclusions

Get details for all security exclusions defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageSecurityExclusion result = apiInstance.getSecurityExclusionAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#getSecurityExclusionAllUsingGet");
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

[**PageSecurityExclusion**](PageSecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityExclusionUsingGet"></a>
# **getSecurityExclusionUsingGet**
> SecurityExclusion getSecurityExclusionUsingGet(securityExclusionId)

Retrieve a security exclusion

Retrieve the information for a security exclusion.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
UUID securityExclusionId = new UUID(); // UUID | UUID security_exclusion_id
try {
    SecurityExclusion result = apiInstance.getSecurityExclusionUsingGet(securityExclusionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#getSecurityExclusionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusionId** | [**UUID**](.md)| UUID security_exclusion_id |

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityPriceAllUsingGet"></a>
# **getSecurityPriceAllUsingGet**
> PageSecurityPrice getSecurityPriceAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all security prices

Get prices for all securities defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageSecurityPrice result = apiInstance.getSecurityPriceAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#getSecurityPriceAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageSecurityPrice**](PageSecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityPriceUsingGet"></a>
# **getSecurityPriceUsingGet**
> SecurityPrice getSecurityPriceUsingGet(securityPriceId, currencyConversion)

Retrieve a security price

Retrieve the information for a security price for a security.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
UUID securityPriceId = new UUID(); // UUID | UUID security_price_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    SecurityPrice result = apiInstance.getSecurityPriceUsingGet(securityPriceId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#getSecurityPriceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPriceId** | [**UUID**](.md)| UUID security_price_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityUsingGet"></a>
# **getSecurityUsingGet**
> Security getSecurityUsingGet(securityId)

Retrieve a security

Retrieve the information for a security defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
UUID securityId = new UUID(); // UUID | UUID security_id
try {
    Security result = apiInstance.getSecurityUsingGet(securityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#getSecurityUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityId** | [**UUID**](.md)| UUID security_id |

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateSecurityExclusionUsingPut"></a>
# **updateSecurityExclusionUsingPut**
> SecurityExclusion updateSecurityExclusionUsingPut(securityExclusion, securityExclusionId)

Update a security exclusion

Update the information for a security exclusion.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
Object securityExclusion = null; // Object | security_exclusion
UUID securityExclusionId = new UUID(); // UUID | UUID security_exclusion_id
try {
    SecurityExclusion result = apiInstance.updateSecurityExclusionUsingPut(securityExclusion, securityExclusionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#updateSecurityExclusionUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusion** | **Object**| security_exclusion |
 **securityExclusionId** | [**UUID**](.md)| UUID security_exclusion_id |

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSecurityPriceUsingPut"></a>
# **updateSecurityPriceUsingPut**
> SecurityPrice updateSecurityPriceUsingPut(securityPrice, securityPriceId)

Update a security price

Update a security price for a security.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
Object securityPrice = null; // Object | security_price
UUID securityPriceId = new UUID(); // UUID | UUID security_price_id
try {
    SecurityPrice result = apiInstance.updateSecurityPriceUsingPut(securityPrice, securityPriceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#updateSecurityPriceUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPrice** | **Object**| security_price |
 **securityPriceId** | [**UUID**](.md)| UUID security_price_id |

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSecurityUsingPut"></a>
# **updateSecurityUsingPut**
> Security updateSecurityUsingPut(security, securityId)

Update a security

Update a security for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import SecuritiesApi;

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
SecuritiesApi apiInstance = new SecuritiesApi();
Object security = null; // Object | security
UUID securityId = new UUID(); // UUID | UUID security_id
try {
    Security result = apiInstance.updateSecurityUsingPut(security, securityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritiesApi#updateSecurityUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security** | **Object**| security |
 **securityId** | [**UUID**](.md)| UUID security_id |

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

