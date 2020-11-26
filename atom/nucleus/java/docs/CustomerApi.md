# CustomerApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerRevenueUsingPost**](CustomerApi.md#createCustomerRevenueUsingPost) | **POST** /customer_revenue | Create a customer revenue
[**createCustomerUsingPost**](CustomerApi.md#createCustomerUsingPost) | **POST** /customer | Create a customer
[**deleteCustomerRevenueUsingDelete**](CustomerApi.md#deleteCustomerRevenueUsingDelete) | **DELETE** /customer_revenue/{customer_revenue_id} | Delete a customer revenue
[**deleteCustomerUsingDelete**](CustomerApi.md#deleteCustomerUsingDelete) | **DELETE** /customer/{customer_id} | Delete a customer
[**getCustomerAllUsingGet**](CustomerApi.md#getCustomerAllUsingGet) | **GET** /customer | List all customer
[**getCustomerRevenueAllUsingGet**](CustomerApi.md#getCustomerRevenueAllUsingGet) | **GET** /customer_revenue | List all customer revenue
[**getCustomerRevenueUsingGet**](CustomerApi.md#getCustomerRevenueUsingGet) | **GET** /customer_revenue/{customer_revenue_id} | Retrieve a customer revenue
[**getCustomerUsingGet**](CustomerApi.md#getCustomerUsingGet) | **GET** /customer/{customer_id} | Retrieve a customer
[**updateCustomerRevenueUsingPut**](CustomerApi.md#updateCustomerRevenueUsingPut) | **PUT** /customer_revenue/{customer_revenue_id} | Update a customer revenue
[**updateCustomerUsingPut**](CustomerApi.md#updateCustomerUsingPut) | **PUT** /customer/{customer_id} | Update a customer


<a name="createCustomerRevenueUsingPost"></a>
# **createCustomerRevenueUsingPost**
> CustomerRevenue createCustomerRevenueUsingPost(customerRevenue)

Create a customer revenue

Create a new customer revenue, with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CustomerApi;

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


CustomerApi apiInstance = new CustomerApi();
CustomerRevenue customerRevenue = new CustomerRevenue(); // CustomerRevenue | customerRevenue
try {
    CustomerRevenue result = apiInstance.createCustomerRevenueUsingPost(customerRevenue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#createCustomerRevenueUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerRevenue** | [**CustomerRevenue**](CustomerRevenue.md)| customerRevenue |

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCustomerUsingPost"></a>
# **createCustomerUsingPost**
> Customer createCustomerUsingPost(customer)

Create a customer

Create a new customer, with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CustomerApi;

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


CustomerApi apiInstance = new CustomerApi();
Customer customer = new Customer(); // Customer | customer
try {
    Customer result = apiInstance.createCustomerUsingPost(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#createCustomerUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| customer |

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCustomerRevenueUsingDelete"></a>
# **deleteCustomerRevenueUsingDelete**
> deleteCustomerRevenueUsingDelete(customerRevenueId)

Delete a customer revenue

Delete a customer revenue. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CustomerApi;

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


CustomerApi apiInstance = new CustomerApi();
UUID customerRevenueId = new UUID(); // UUID | UUID customer_revenue_id
try {
    apiInstance.deleteCustomerRevenueUsingDelete(customerRevenueId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#deleteCustomerRevenueUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerRevenueId** | [**UUID**](.md)| UUID customer_revenue_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteCustomerUsingDelete"></a>
# **deleteCustomerUsingDelete**
> deleteCustomerUsingDelete(customerId)

Delete a customer

Delete a customer. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CustomerApi;

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


CustomerApi apiInstance = new CustomerApi();
UUID customerId = new UUID(); // UUID | UUID customer_id
try {
    apiInstance.deleteCustomerUsingDelete(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#deleteCustomerUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | [**UUID**](.md)| UUID customer_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCustomerAllUsingGet"></a>
# **getCustomerAllUsingGet**
> PageCustomer getCustomerAllUsingGet(ascending, filter, orderBy, page, size)

List all customer

List all customer. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CustomerApi;

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


CustomerApi apiInstance = new CustomerApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageCustomer result = apiInstance.getCustomerAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomerAllUsingGet");
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

[**PageCustomer**](PageCustomer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCustomerRevenueAllUsingGet"></a>
# **getCustomerRevenueAllUsingGet**
> PageCustomerRevenue getCustomerRevenueAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all customer revenue

List all customer revenue. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CustomerApi;

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


CustomerApi apiInstance = new CustomerApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageCustomerRevenue result = apiInstance.getCustomerRevenueAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomerRevenueAllUsingGet");
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

[**PageCustomerRevenue**](PageCustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCustomerRevenueUsingGet"></a>
# **getCustomerRevenueUsingGet**
> CustomerRevenue getCustomerRevenueUsingGet(customerRevenueId, currencyConversion)

Retrieve a customer revenue

Retrieve a customer revenue. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CustomerApi;

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


CustomerApi apiInstance = new CustomerApi();
UUID customerRevenueId = new UUID(); // UUID | UUID customer_revenue_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    CustomerRevenue result = apiInstance.getCustomerRevenueUsingGet(customerRevenueId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomerRevenueUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerRevenueId** | [**UUID**](.md)| UUID customer_revenue_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerUsingGet"></a>
# **getCustomerUsingGet**
> Customer getCustomerUsingGet(customerId)

Retrieve a customer

Retrieve a customer. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CustomerApi;

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


CustomerApi apiInstance = new CustomerApi();
UUID customerId = new UUID(); // UUID | UUID customer_id
try {
    Customer result = apiInstance.getCustomerUsingGet(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomerUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | [**UUID**](.md)| UUID customer_id |

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCustomerRevenueUsingPut"></a>
# **updateCustomerRevenueUsingPut**
> CustomerRevenue updateCustomerRevenueUsingPut(customerRevenue, customerRevenueId)

Update a customer revenue

Update a customer revenue. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CustomerApi;

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


CustomerApi apiInstance = new CustomerApi();
CustomerRevenue customerRevenue = new CustomerRevenue(); // CustomerRevenue | customer_revenue
UUID customerRevenueId = new UUID(); // UUID | UUID customer_revenue_id
try {
    CustomerRevenue result = apiInstance.updateCustomerRevenueUsingPut(customerRevenue, customerRevenueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#updateCustomerRevenueUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerRevenue** | [**CustomerRevenue**](CustomerRevenue.md)| customer_revenue |
 **customerRevenueId** | [**UUID**](.md)| UUID customer_revenue_id |

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCustomerUsingPut"></a>
# **updateCustomerUsingPut**
> Customer updateCustomerUsingPut(customer, customerId)

Update a customer

Update a customer. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CustomerApi;

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


CustomerApi apiInstance = new CustomerApi();
Customer customer = new Customer(); // Customer | customer
UUID customerId = new UUID(); // UUID | UUID customer_id
try {
    Customer result = apiInstance.updateCustomerUsingPut(customer, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#updateCustomerUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| customer |
 **customerId** | [**UUID**](.md)| UUID customer_id |

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

