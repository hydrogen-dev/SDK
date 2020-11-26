# InvoiceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInvoicePaymentUsingPost**](InvoiceApi.md#createInvoicePaymentUsingPost) | **POST** /invoice_payment | Create a invoicePayment
[**createInvoiceUsingPost**](InvoiceApi.md#createInvoiceUsingPost) | **POST** /invoice | Create a invoice
[**deleteInvoicePaymentUsingDelete**](InvoiceApi.md#deleteInvoicePaymentUsingDelete) | **DELETE** /invoice_payment/{invoice_payment_id} | Delete a invoicePayment
[**deleteInvoiceUsingDelete**](InvoiceApi.md#deleteInvoiceUsingDelete) | **DELETE** /invoice/{invoice_id} | Delete a invoice
[**getInvoiceAllUsingGet**](InvoiceApi.md#getInvoiceAllUsingGet) | **GET** /invoice | List all invoices
[**getInvoicePaymentAllUsingGet**](InvoiceApi.md#getInvoicePaymentAllUsingGet) | **GET** /invoice_payment | List all invoice payments
[**getInvoicePaymentUsingGet**](InvoiceApi.md#getInvoicePaymentUsingGet) | **GET** /invoice_payment/{invoice_payment_id} | Retrieve a invoicePayment
[**getInvoiceUsingGet**](InvoiceApi.md#getInvoiceUsingGet) | **GET** /invoice/{invoice_id} | Retrieve a invoice
[**updateInvoicePaymentUsingPut**](InvoiceApi.md#updateInvoicePaymentUsingPut) | **PUT** /invoice_payment/{invoice_payment_id} | Update a invoicePayment
[**updateInvoiceUsingPut**](InvoiceApi.md#updateInvoiceUsingPut) | **PUT** /invoice/{invoice_id} | Update a invoice


<a name="createInvoicePaymentUsingPost"></a>
# **createInvoicePaymentUsingPost**
> InvoicePayment createInvoicePaymentUsingPost(invoicePayment)

Create a invoicePayment

Create a new invoicePayment, for tracking invoice status.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import InvoiceApi;

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


InvoiceApi apiInstance = new InvoiceApi();
InvoicePayment invoicePayment = new InvoicePayment(); // InvoicePayment | invoicePayment
try {
    InvoicePayment result = apiInstance.createInvoicePaymentUsingPost(invoicePayment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#createInvoicePaymentUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoicePayment** | [**InvoicePayment**](InvoicePayment.md)| invoicePayment |

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createInvoiceUsingPost"></a>
# **createInvoiceUsingPost**
> Invoice createInvoiceUsingPost(invoice)

Create a invoice

Create a new invoice, with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import InvoiceApi;

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


InvoiceApi apiInstance = new InvoiceApi();
Invoice invoice = new Invoice(); // Invoice | invoice
try {
    Invoice result = apiInstance.createInvoiceUsingPost(invoice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#createInvoiceUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteInvoicePaymentUsingDelete"></a>
# **deleteInvoicePaymentUsingDelete**
> deleteInvoicePaymentUsingDelete(invoicePaymentId)

Delete a invoicePayment

Delete a invoicePayment. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import InvoiceApi;

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


InvoiceApi apiInstance = new InvoiceApi();
UUID invoicePaymentId = new UUID(); // UUID | UUID invoice_payment_id
try {
    apiInstance.deleteInvoicePaymentUsingDelete(invoicePaymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#deleteInvoicePaymentUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoicePaymentId** | [**UUID**](.md)| UUID invoice_payment_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteInvoiceUsingDelete"></a>
# **deleteInvoiceUsingDelete**
> deleteInvoiceUsingDelete(invoiceId)

Delete a invoice

Delete a invoice. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import InvoiceApi;

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


InvoiceApi apiInstance = new InvoiceApi();
UUID invoiceId = new UUID(); // UUID | UUID invoice_id
try {
    apiInstance.deleteInvoiceUsingDelete(invoiceId);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#deleteInvoiceUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | [**UUID**](.md)| UUID invoice_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceAllUsingGet"></a>
# **getInvoiceAllUsingGet**
> PageInvoice getInvoiceAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all invoices

List all invoice. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import InvoiceApi;

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


InvoiceApi apiInstance = new InvoiceApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageInvoice result = apiInstance.getInvoiceAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getInvoiceAllUsingGet");
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

[**PageInvoice**](PageInvoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoicePaymentAllUsingGet"></a>
# **getInvoicePaymentAllUsingGet**
> PageInvoicePayment getInvoicePaymentAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all invoice payments

List all invoicePayment. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import InvoiceApi;

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


InvoiceApi apiInstance = new InvoiceApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageInvoicePayment result = apiInstance.getInvoicePaymentAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getInvoicePaymentAllUsingGet");
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

[**PageInvoicePayment**](PageInvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoicePaymentUsingGet"></a>
# **getInvoicePaymentUsingGet**
> InvoicePayment getInvoicePaymentUsingGet(invoicePaymentId, currencyConversion)

Retrieve a invoicePayment

Retrieve a invoicePayment. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import InvoiceApi;

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


InvoiceApi apiInstance = new InvoiceApi();
UUID invoicePaymentId = new UUID(); // UUID | UUID invoice_payment_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    InvoicePayment result = apiInstance.getInvoicePaymentUsingGet(invoicePaymentId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getInvoicePaymentUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoicePaymentId** | [**UUID**](.md)| UUID invoice_payment_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceUsingGet"></a>
# **getInvoiceUsingGet**
> Invoice getInvoiceUsingGet(invoiceId, currencyConversion)

Retrieve a invoice

Retrieve a invoice. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import InvoiceApi;

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


InvoiceApi apiInstance = new InvoiceApi();
UUID invoiceId = new UUID(); // UUID | UUID invoice_idd
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    Invoice result = apiInstance.getInvoiceUsingGet(invoiceId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#getInvoiceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | [**UUID**](.md)| UUID invoice_idd |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateInvoicePaymentUsingPut"></a>
# **updateInvoicePaymentUsingPut**
> InvoicePayment updateInvoicePaymentUsingPut(invoicePayment, invoicePaymentId)

Update a invoicePayment

Update a invoicePayment. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import InvoiceApi;

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


InvoiceApi apiInstance = new InvoiceApi();
InvoicePayment invoicePayment = new InvoicePayment(); // InvoicePayment | invoice_payment
UUID invoicePaymentId = new UUID(); // UUID | UUID invoice_payment_id
try {
    InvoicePayment result = apiInstance.updateInvoicePaymentUsingPut(invoicePayment, invoicePaymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#updateInvoicePaymentUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoicePayment** | [**InvoicePayment**](InvoicePayment.md)| invoice_payment |
 **invoicePaymentId** | [**UUID**](.md)| UUID invoice_payment_id |

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateInvoiceUsingPut"></a>
# **updateInvoiceUsingPut**
> Invoice updateInvoiceUsingPut(invoice, invoiceId)

Update a invoice

Update a invoice. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import InvoiceApi;

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


InvoiceApi apiInstance = new InvoiceApi();
Invoice invoice = new Invoice(); // Invoice | invoice
UUID invoiceId = new UUID(); // UUID | UUID invoice_id
try {
    Invoice result = apiInstance.updateInvoiceUsingPut(invoice, invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceApi#updateInvoiceUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice |
 **invoiceId** | [**UUID**](.md)| UUID invoice_id |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

