# InsuranceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInsuranceCoverageUsingPost**](InsuranceApi.md#createInsuranceCoverageUsingPost) | **POST** /insurance_coverage | Create a insurance coverage request
[**createInsuranceDiscountUsingPost**](InsuranceApi.md#createInsuranceDiscountUsingPost) | **POST** /insurance_discount | Create a insurance discount request
[**createInsuranceQuoteUsingPost**](InsuranceApi.md#createInsuranceQuoteUsingPost) | **POST** /insurance_quote | Create a insuranceQuote request
[**deleteInsuranceCoverageUsingDelete**](InsuranceApi.md#deleteInsuranceCoverageUsingDelete) | **DELETE** /insurance_coverage/{insurance_coverage_id} | Delete an insurance coverage request
[**deleteInsuranceDiscountUsingDelete**](InsuranceApi.md#deleteInsuranceDiscountUsingDelete) | **DELETE** /insurance_discount/{insurance_discount_id} | Delete an insurance discount request
[**deleteInsuranceQuoteUsingDelete**](InsuranceApi.md#deleteInsuranceQuoteUsingDelete) | **DELETE** /insurance_quote/{insurance_quote_id} | Delete a insuranceQuote request
[**getInsuranceCoverageAllUsingGet**](InsuranceApi.md#getInsuranceCoverageAllUsingGet) | **GET** /insurance_coverage | Get all insurance coverage request
[**getInsuranceCoverageUsingGet**](InsuranceApi.md#getInsuranceCoverageUsingGet) | **GET** /insurance_coverage/{insurance_coverage_id} | Get a insurance coverage request
[**getInsuranceDiscountAllUsingGet**](InsuranceApi.md#getInsuranceDiscountAllUsingGet) | **GET** /insurance_discount | Get all insurance discount request
[**getInsuranceDiscountUsingGet**](InsuranceApi.md#getInsuranceDiscountUsingGet) | **GET** /insurance_discount/{insurance_discount_id} | Get a insurance discount request
[**getInsuranceQuoteAllUsingGet**](InsuranceApi.md#getInsuranceQuoteAllUsingGet) | **GET** /insurance_quote | List all insuranceQuote requests
[**getInsuranceQuoteUsingGet**](InsuranceApi.md#getInsuranceQuoteUsingGet) | **GET** /insurance_quote/{insurance_quote_id} | Retrieve a insuranceQuote request
[**updateInsuranceCoverageUsingPut**](InsuranceApi.md#updateInsuranceCoverageUsingPut) | **PUT** /insurance_coverage/{insurance_coverage_id} | Update a insurance coverage request
[**updateInsuranceDiscountUsingPut**](InsuranceApi.md#updateInsuranceDiscountUsingPut) | **PUT** /insurance_discount/{insurance_discount_id} | Update an insurance discount 
[**updateInsuranceQuoteUsingPut**](InsuranceApi.md#updateInsuranceQuoteUsingPut) | **PUT** /insurance_quote/{insurance_quote_id} | Update a insuranceQuote request


<a name="createInsuranceCoverageUsingPost"></a>
# **createInsuranceCoverageUsingPost**
> InsuranceCoverage createInsuranceCoverageUsingPost(insuranceCoverage)

Create a insurance coverage request

Create a new insurance coverage.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
InsuranceCoverage insuranceCoverage = new InsuranceCoverage(); // InsuranceCoverage | insuranceCoverage
try {
    InsuranceCoverage result = apiInstance.createInsuranceCoverageUsingPost(insuranceCoverage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#createInsuranceCoverageUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceCoverage** | [**InsuranceCoverage**](InsuranceCoverage.md)| insuranceCoverage |

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createInsuranceDiscountUsingPost"></a>
# **createInsuranceDiscountUsingPost**
> InsuranceDiscount createInsuranceDiscountUsingPost(insuranceDiscount)

Create a insurance discount request

Create a new insurance discount.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
InsuranceDiscount insuranceDiscount = new InsuranceDiscount(); // InsuranceDiscount | insuranceDiscount
try {
    InsuranceDiscount result = apiInstance.createInsuranceDiscountUsingPost(insuranceDiscount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#createInsuranceDiscountUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceDiscount** | [**InsuranceDiscount**](InsuranceDiscount.md)| insuranceDiscount |

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createInsuranceQuoteUsingPost"></a>
# **createInsuranceQuoteUsingPost**
> InsuranceQuote createInsuranceQuoteUsingPost(insuranceQuote)

Create a insuranceQuote request

Create a new insuranceQuote request.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
InsuranceQuote insuranceQuote = new InsuranceQuote(); // InsuranceQuote | insuranceQuote
try {
    InsuranceQuote result = apiInstance.createInsuranceQuoteUsingPost(insuranceQuote);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#createInsuranceQuoteUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceQuote** | [**InsuranceQuote**](InsuranceQuote.md)| insuranceQuote |

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteInsuranceCoverageUsingDelete"></a>
# **deleteInsuranceCoverageUsingDelete**
> deleteInsuranceCoverageUsingDelete(insuranceCoverageId)

Delete an insurance coverage request

Delete an  insurance coverage.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
UUID insuranceCoverageId = new UUID(); // UUID | UUID insurance_coverage_id
try {
    apiInstance.deleteInsuranceCoverageUsingDelete(insuranceCoverageId);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#deleteInsuranceCoverageUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceCoverageId** | [**UUID**](.md)| UUID insurance_coverage_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteInsuranceDiscountUsingDelete"></a>
# **deleteInsuranceDiscountUsingDelete**
> deleteInsuranceDiscountUsingDelete(insuranceDiscountId)

Delete an insurance discount request

Delete an  insurance discount.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
UUID insuranceDiscountId = new UUID(); // UUID | UUID insurance_discount_id
try {
    apiInstance.deleteInsuranceDiscountUsingDelete(insuranceDiscountId);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#deleteInsuranceDiscountUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceDiscountId** | [**UUID**](.md)| UUID insurance_discount_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteInsuranceQuoteUsingDelete"></a>
# **deleteInsuranceQuoteUsingDelete**
> deleteInsuranceQuoteUsingDelete(insuranceQuote, insuranceQuoteId)

Delete a insuranceQuote request

Permanently delete a insuranceQuote request.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
UUID insuranceQuote = new UUID(); // UUID | UUID insurance_quote_id
UUID insuranceQuoteId = new UUID(); // UUID | insurance_quote_id
try {
    apiInstance.deleteInsuranceQuoteUsingDelete(insuranceQuote, insuranceQuoteId);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#deleteInsuranceQuoteUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceQuote** | [**UUID**](.md)| UUID insurance_quote_id |
 **insuranceQuoteId** | [**UUID**](.md)| insurance_quote_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceCoverageAllUsingGet"></a>
# **getInsuranceCoverageAllUsingGet**
> PageInsuranceCoverage getInsuranceCoverageAllUsingGet(ascending, filter, orderBy, page, size)

Get all insurance coverage request

Get all new insurance coverage.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageInsuranceCoverage result = apiInstance.getInsuranceCoverageAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#getInsuranceCoverageAllUsingGet");
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

[**PageInsuranceCoverage**](PageInsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceCoverageUsingGet"></a>
# **getInsuranceCoverageUsingGet**
> InsuranceCoverage getInsuranceCoverageUsingGet(insuranceCoverageId)

Get a insurance coverage request

Get a new insurance coverage.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
UUID insuranceCoverageId = new UUID(); // UUID | UUID insurance_coverage_id
try {
    InsuranceCoverage result = apiInstance.getInsuranceCoverageUsingGet(insuranceCoverageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#getInsuranceCoverageUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceCoverageId** | [**UUID**](.md)| UUID insurance_coverage_id |

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceDiscountAllUsingGet"></a>
# **getInsuranceDiscountAllUsingGet**
> PageInsuranceDiscount getInsuranceDiscountAllUsingGet(ascending, filter, orderBy, page, size)

Get all insurance discount request

Get all new insurance discount.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageInsuranceDiscount result = apiInstance.getInsuranceDiscountAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#getInsuranceDiscountAllUsingGet");
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

[**PageInsuranceDiscount**](PageInsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceDiscountUsingGet"></a>
# **getInsuranceDiscountUsingGet**
> InsuranceDiscount getInsuranceDiscountUsingGet(insuranceDiscountId)

Get a insurance discount request

Get a new insurance discount.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
UUID insuranceDiscountId = new UUID(); // UUID |  UUID insurance_discount_id
try {
    InsuranceDiscount result = apiInstance.getInsuranceDiscountUsingGet(insuranceDiscountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#getInsuranceDiscountUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceDiscountId** | [**UUID**](.md)|  UUID insurance_discount_id |

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceQuoteAllUsingGet"></a>
# **getInsuranceQuoteAllUsingGet**
> PageInsuranceQuote getInsuranceQuoteAllUsingGet(ascending, filter, orderBy, page, size)

List all insuranceQuote requests

Get the information for all insuranceQuote requests.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageInsuranceQuote result = apiInstance.getInsuranceQuoteAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#getInsuranceQuoteAllUsingGet");
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

[**PageInsuranceQuote**](PageInsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceQuoteUsingGet"></a>
# **getInsuranceQuoteUsingGet**
> InsuranceQuote getInsuranceQuoteUsingGet(insuranceQuote, insuranceQuoteId)

Retrieve a insuranceQuote request

Retrieve the information for a insuranceQuote request.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
UUID insuranceQuote = new UUID(); // UUID | UUID insurance_quote_id
UUID insuranceQuoteId = new UUID(); // UUID | insurance_quote_id
try {
    InsuranceQuote result = apiInstance.getInsuranceQuoteUsingGet(insuranceQuote, insuranceQuoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#getInsuranceQuoteUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceQuote** | [**UUID**](.md)| UUID insurance_quote_id |
 **insuranceQuoteId** | [**UUID**](.md)| insurance_quote_id |

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateInsuranceCoverageUsingPut"></a>
# **updateInsuranceCoverageUsingPut**
> InsuranceCoverage updateInsuranceCoverageUsingPut(insuranceCoverage, insuranceCoverageId)

Update a insurance coverage request

Update a new insurance coverage.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
InsuranceCoverage insuranceCoverage = new InsuranceCoverage(); // InsuranceCoverage | insurance_coverage
UUID insuranceCoverageId = new UUID(); // UUID | UUID insurance_coverage_id
try {
    InsuranceCoverage result = apiInstance.updateInsuranceCoverageUsingPut(insuranceCoverage, insuranceCoverageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#updateInsuranceCoverageUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceCoverage** | [**InsuranceCoverage**](InsuranceCoverage.md)| insurance_coverage |
 **insuranceCoverageId** | [**UUID**](.md)| UUID insurance_coverage_id |

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateInsuranceDiscountUsingPut"></a>
# **updateInsuranceDiscountUsingPut**
> InsuranceDiscount updateInsuranceDiscountUsingPut(insuranceDiscount, insuranceDiscountId)

Update an insurance discount 

Update an new insurance .

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
InsuranceDiscount insuranceDiscount = new InsuranceDiscount(); // InsuranceDiscount | insurance_discount
UUID insuranceDiscountId = new UUID(); // UUID | UUID insurance_discount_id
try {
    InsuranceDiscount result = apiInstance.updateInsuranceDiscountUsingPut(insuranceDiscount, insuranceDiscountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#updateInsuranceDiscountUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceDiscount** | [**InsuranceDiscount**](InsuranceDiscount.md)| insurance_discount |
 **insuranceDiscountId** | [**UUID**](.md)| UUID insurance_discount_id |

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateInsuranceQuoteUsingPut"></a>
# **updateInsuranceQuoteUsingPut**
> InsuranceQuote updateInsuranceQuoteUsingPut(insuranceQuote, insuranceQuoteId)

Update a insuranceQuote request

Update the information for a insuranceQuote request.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import InsuranceApi;

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

InsuranceApi apiInstance = new InsuranceApi();
InsuranceQuote insuranceQuote = new InsuranceQuote(); // InsuranceQuote | insurance_quote
UUID insuranceQuoteId = new UUID(); // UUID | UUID insurance_quote_id
try {
    InsuranceQuote result = apiInstance.updateInsuranceQuoteUsingPut(insuranceQuote, insuranceQuoteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsuranceApi#updateInsuranceQuoteUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceQuote** | [**InsuranceQuote**](InsuranceQuote.md)| insurance_quote |
 **insuranceQuoteId** | [**UUID**](.md)| UUID insurance_quote_id |

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

