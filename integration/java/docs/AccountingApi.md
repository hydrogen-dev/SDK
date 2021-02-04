# AccountingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateCustomer**](AccountingApi.md#createOrUpdateCustomer) | **GET** /accounting/customer | Update/Create all customers in Nucleus for a given nucleus_client_id
[**createOrUpdateCustomerRevenue**](AccountingApi.md#createOrUpdateCustomerRevenue) | **GET** /accounting/customer_revenue/{nucleus_customer_id} | Update/Create all customers revenue in Nucleus for a given nucleus_customer_id
[**createOrUpdateInvoicePayment**](AccountingApi.md#createOrUpdateInvoicePayment) | **GET** /accounting/invoice_payment/{nucleus_invoice_id} | Create/Update invoice payment in Nucleus for a given nucleus_invoice_id
[**createOrUpdateInvoices**](AccountingApi.md#createOrUpdateInvoices) | **GET** /accounting/invoice | Update/Create all invoices in Nucleus for a given nucleus_client_id
[**deleteAccountingVendorAccessConfigIsActiveById**](AccountingApi.md#deleteAccountingVendorAccessConfigIsActiveById) | **DELETE** /accounting/vendor/{id} | Permanently delete relation with particular accounting vendor.
[**getAccountingStats**](AccountingApi.md#getAccountingStats) | **GET** /accounting/report | Get accounting stats from financial statements at the vendor for the business provided
[**getAccountingVendorInfoUsingClientId**](AccountingApi.md#getAccountingVendorInfoUsingClientId) | **GET** /accounting/vendor/{nucleus_client_id} | Get Accounting Vendor Config
[**updateAccountingVendorAccessConfigIsActiveById**](AccountingApi.md#updateAccountingVendorAccessConfigIsActiveById) | **PUT** /accounting/vendor/{id} | Enable/Disable relation with particular accounting vendor.
[**updateCustomer**](AccountingApi.md#updateCustomer) | **GET** /accounting/customer/{nucleus_customer_id} | Update customer in Nucleus for a given nucleus_customer_id
[**updateInvoice**](AccountingApi.md#updateInvoice) | **GET** /accounting/invoice/{nucleus_invoice_id} | Update invoice in Nucleus for a given nucleus_invoice_id


<a name="createOrUpdateCustomer"></a>
# **createOrUpdateCustomer**
> AccountingFinalResponseVO createOrUpdateCustomer(nucleusClientId)

Update/Create all customers in Nucleus for a given nucleus_client_id

Update/Create all customers in Nucleus for a given nucleus_client_id

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AccountingApi;

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
AccountingApi apiInstance = new AccountingApi();
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
try {
    AccountingFinalResponseVO result = apiInstance.createOrUpdateCustomer(nucleusClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#createOrUpdateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id |

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrUpdateCustomerRevenue"></a>
# **createOrUpdateCustomerRevenue**
> AccountingFinalResponseVO createOrUpdateCustomerRevenue(nucleusCustomerId, startDate, accountingMethod, endDate)

Update/Create all customers revenue in Nucleus for a given nucleus_customer_id

Update/Create all customers revenue in Nucleus for a given nucleus_customer_id

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AccountingApi;

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
AccountingApi apiInstance = new AccountingApi();
UUID nucleusCustomerId = new UUID(); // UUID | nucleus_customer_id
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
String accountingMethod = "accrual"; // String | accounting_method
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
try {
    AccountingFinalResponseVO result = apiInstance.createOrUpdateCustomerRevenue(nucleusCustomerId, startDate, accountingMethod, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#createOrUpdateCustomerRevenue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusCustomerId** | [**UUID**](.md)| nucleus_customer_id |
 **startDate** | **OffsetDateTime**| start_date |
 **accountingMethod** | **String**| accounting_method | [optional] [default to accrual]
 **endDate** | **OffsetDateTime**| end_date | [optional] [default to null]

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrUpdateInvoicePayment"></a>
# **createOrUpdateInvoicePayment**
> AccountingFinalResponseVO createOrUpdateInvoicePayment(nucleusInvoiceId)

Create/Update invoice payment in Nucleus for a given nucleus_invoice_id

Create/Update invoice payment in Nucleus for a given nucleus_invoice_id

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AccountingApi;

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
AccountingApi apiInstance = new AccountingApi();
UUID nucleusInvoiceId = new UUID(); // UUID | nucleus_invoice_id
try {
    AccountingFinalResponseVO result = apiInstance.createOrUpdateInvoicePayment(nucleusInvoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#createOrUpdateInvoicePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusInvoiceId** | [**UUID**](.md)| nucleus_invoice_id |

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrUpdateInvoices"></a>
# **createOrUpdateInvoices**
> AccountingFinalResponseVO createOrUpdateInvoices(nucleusCustomerId, startDate, endDate)

Update/Create all invoices in Nucleus for a given nucleus_client_id

Update/Create all invoices in Nucleus for a given nucleus_client_id

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AccountingApi;

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
AccountingApi apiInstance = new AccountingApi();
UUID nucleusCustomerId = new UUID(); // UUID | nucleus_customer_id
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
try {
    AccountingFinalResponseVO result = apiInstance.createOrUpdateInvoices(nucleusCustomerId, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#createOrUpdateInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusCustomerId** | [**UUID**](.md)| nucleus_customer_id |
 **startDate** | **OffsetDateTime**| start_date |
 **endDate** | **OffsetDateTime**| end_date | [optional] [default to null]

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAccountingVendorAccessConfigIsActiveById"></a>
# **deleteAccountingVendorAccessConfigIsActiveById**
> deleteAccountingVendorAccessConfigIsActiveById(id)

Permanently delete relation with particular accounting vendor.

Permanently delete relation with particular accounting vendor.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AccountingApi;

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
AccountingApi apiInstance = new AccountingApi();
UUID id = new UUID(); // UUID | id
try {
    apiInstance.deleteAccountingVendorAccessConfigIsActiveById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#deleteAccountingVendorAccessConfigIsActiveById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountingStats"></a>
# **getAccountingStats**
> AccountingFinalResponseVO getAccountingStats(accountingMethod, nucleusClientId, periodLength, periodMonth, periodQuarter, periodType, periodYear, report, statementDate)

Get accounting stats from financial statements at the vendor for the business provided

Get accounting stats from financial statements at the vendor for the business provided

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AccountingApi;

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
AccountingApi apiInstance = new AccountingApi();
String accountingMethod = "accrual"; // String | accounting_method
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
String periodLength = "periodLength_example"; // String | period_length
Integer periodMonth = 56; // Integer | period_month
Integer periodQuarter = 56; // Integer | period_quarter
String periodType = "periodType_example"; // String | period_type
Integer periodYear = 56; // Integer | period_year
String report = "report_example"; // String | report
OffsetDateTime statementDate = OffsetDateTime.now(); // OffsetDateTime | statement_date
try {
    AccountingFinalResponseVO result = apiInstance.getAccountingStats(accountingMethod, nucleusClientId, periodLength, periodMonth, periodQuarter, periodType, periodYear, report, statementDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#getAccountingStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingMethod** | **String**| accounting_method | [optional] [default to accrual]
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id | [optional]
 **periodLength** | **String**| period_length | [optional]
 **periodMonth** | **Integer**| period_month | [optional]
 **periodQuarter** | **Integer**| period_quarter | [optional]
 **periodType** | **String**| period_type | [optional]
 **periodYear** | **Integer**| period_year | [optional]
 **report** | **String**| report | [optional]
 **statementDate** | **OffsetDateTime**| statement_date | [optional]

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountingVendorInfoUsingClientId"></a>
# **getAccountingVendorInfoUsingClientId**
> VendorAccessConfigVO getAccountingVendorInfoUsingClientId(nucleusClientId)

Get Accounting Vendor Config

Get Accounting vendor config information with its status.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AccountingApi;

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
AccountingApi apiInstance = new AccountingApi();
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
try {
    VendorAccessConfigVO result = apiInstance.getAccountingVendorInfoUsingClientId(nucleusClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#getAccountingVendorInfoUsingClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id |

### Return type

[**VendorAccessConfigVO**](VendorAccessConfigVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAccountingVendorAccessConfigIsActiveById"></a>
# **updateAccountingVendorAccessConfigIsActiveById**
> VendorAccessConfigVO updateAccountingVendorAccessConfigIsActiveById(id, isActive)

Enable/Disable relation with particular accounting vendor.

Enable/Disable link with particular accounting vendor.

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AccountingApi;

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
AccountingApi apiInstance = new AccountingApi();
UUID id = new UUID(); // UUID | id
Boolean isActive = true; // Boolean | is_active
try {
    VendorAccessConfigVO result = apiInstance.updateAccountingVendorAccessConfigIsActiveById(id, isActive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#updateAccountingVendorAccessConfigIsActiveById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |
 **isActive** | **Boolean**| is_active |

### Return type

[**VendorAccessConfigVO**](VendorAccessConfigVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCustomer"></a>
# **updateCustomer**
> AccountingFinalResponseVO updateCustomer(nucleusCustomerId)

Update customer in Nucleus for a given nucleus_customer_id

Update customer in Nucleus for a given nucleus_customer_id

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AccountingApi;

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
AccountingApi apiInstance = new AccountingApi();
UUID nucleusCustomerId = new UUID(); // UUID | nucleus_customer_id
try {
    AccountingFinalResponseVO result = apiInstance.updateCustomer(nucleusCustomerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusCustomerId** | [**UUID**](.md)| nucleus_customer_id |

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInvoice"></a>
# **updateInvoice**
> AccountingFinalResponseVO updateInvoice(nucleusInvoiceId)

Update invoice in Nucleus for a given nucleus_invoice_id

Update invoice in Nucleus for a given nucleus_invoice_id

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AccountingApi;

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
AccountingApi apiInstance = new AccountingApi();
UUID nucleusInvoiceId = new UUID(); // UUID | nucleus_invoice_id
try {
    AccountingFinalResponseVO result = apiInstance.updateInvoice(nucleusInvoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#updateInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusInvoiceId** | [**UUID**](.md)| nucleus_invoice_id |

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

