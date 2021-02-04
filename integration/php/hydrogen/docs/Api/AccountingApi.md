# com\hydrogen\integration\AccountingApi

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


# **createOrUpdateCustomer**
> \com\hydrogen\integration\Model\AccountingFinalResponseVO createOrUpdateCustomer($nucleus_client_id)

Update/Create all customers in Nucleus for a given nucleus_client_id

Update/Create all customers in Nucleus for a given nucleus_client_id

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AccountingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id

try {
    $result = $apiInstance->createOrUpdateCustomer($nucleus_client_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountingApi->createOrUpdateCustomer: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id |

### Return type

[**\com\hydrogen\integration\Model\AccountingFinalResponseVO**](../Model/AccountingFinalResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createOrUpdateCustomerRevenue**
> \com\hydrogen\integration\Model\AccountingFinalResponseVO createOrUpdateCustomerRevenue($nucleus_customer_id, $start_date, $accounting_method, $end_date)

Update/Create all customers revenue in Nucleus for a given nucleus_customer_id

Update/Create all customers revenue in Nucleus for a given nucleus_customer_id

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AccountingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_customer_id = "nucleus_customer_id_example"; // string | nucleus_customer_id
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | start_date
$accounting_method = "accrual"; // string | accounting_method
$end_date = new \DateTime("null"); // \DateTime | end_date

try {
    $result = $apiInstance->createOrUpdateCustomerRevenue($nucleus_customer_id, $start_date, $accounting_method, $end_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountingApi->createOrUpdateCustomerRevenue: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_customer_id** | [**string**](../Model/.md)| nucleus_customer_id |
 **start_date** | **\DateTime**| start_date |
 **accounting_method** | **string**| accounting_method | [optional] [default to accrual]
 **end_date** | **\DateTime**| end_date | [optional] [default to null]

### Return type

[**\com\hydrogen\integration\Model\AccountingFinalResponseVO**](../Model/AccountingFinalResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createOrUpdateInvoicePayment**
> \com\hydrogen\integration\Model\AccountingFinalResponseVO createOrUpdateInvoicePayment($nucleus_invoice_id)

Create/Update invoice payment in Nucleus for a given nucleus_invoice_id

Create/Update invoice payment in Nucleus for a given nucleus_invoice_id

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AccountingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_invoice_id = "nucleus_invoice_id_example"; // string | nucleus_invoice_id

try {
    $result = $apiInstance->createOrUpdateInvoicePayment($nucleus_invoice_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountingApi->createOrUpdateInvoicePayment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_invoice_id** | [**string**](../Model/.md)| nucleus_invoice_id |

### Return type

[**\com\hydrogen\integration\Model\AccountingFinalResponseVO**](../Model/AccountingFinalResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createOrUpdateInvoices**
> \com\hydrogen\integration\Model\AccountingFinalResponseVO createOrUpdateInvoices($nucleus_customer_id, $start_date, $end_date)

Update/Create all invoices in Nucleus for a given nucleus_client_id

Update/Create all invoices in Nucleus for a given nucleus_client_id

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AccountingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_customer_id = "nucleus_customer_id_example"; // string | nucleus_customer_id
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | start_date
$end_date = new \DateTime("null"); // \DateTime | end_date

try {
    $result = $apiInstance->createOrUpdateInvoices($nucleus_customer_id, $start_date, $end_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountingApi->createOrUpdateInvoices: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_customer_id** | [**string**](../Model/.md)| nucleus_customer_id |
 **start_date** | **\DateTime**| start_date |
 **end_date** | **\DateTime**| end_date | [optional] [default to null]

### Return type

[**\com\hydrogen\integration\Model\AccountingFinalResponseVO**](../Model/AccountingFinalResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAccountingVendorAccessConfigIsActiveById**
> deleteAccountingVendorAccessConfigIsActiveById($id)

Permanently delete relation with particular accounting vendor.

Permanently delete relation with particular accounting vendor.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AccountingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | id

try {
    $apiInstance->deleteAccountingVendorAccessConfigIsActiveById($id);
} catch (Exception $e) {
    echo 'Exception when calling AccountingApi->deleteAccountingVendorAccessConfigIsActiveById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountingStats**
> \com\hydrogen\integration\Model\AccountingFinalResponseVO getAccountingStats($accounting_method, $nucleus_client_id, $period_length, $period_month, $period_quarter, $period_type, $period_year, $report, $statement_date)

Get accounting stats from financial statements at the vendor for the business provided

Get accounting stats from financial statements at the vendor for the business provided

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AccountingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$accounting_method = "accrual"; // string | accounting_method
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id
$period_length = "period_length_example"; // string | period_length
$period_month = 56; // int | period_month
$period_quarter = 56; // int | period_quarter
$period_type = "period_type_example"; // string | period_type
$period_year = 56; // int | period_year
$report = "report_example"; // string | report
$statement_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | statement_date

try {
    $result = $apiInstance->getAccountingStats($accounting_method, $nucleus_client_id, $period_length, $period_month, $period_quarter, $period_type, $period_year, $report, $statement_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountingApi->getAccountingStats: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting_method** | **string**| accounting_method | [optional] [default to accrual]
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id | [optional]
 **period_length** | **string**| period_length | [optional]
 **period_month** | **int**| period_month | [optional]
 **period_quarter** | **int**| period_quarter | [optional]
 **period_type** | **string**| period_type | [optional]
 **period_year** | **int**| period_year | [optional]
 **report** | **string**| report | [optional]
 **statement_date** | **\DateTime**| statement_date | [optional]

### Return type

[**\com\hydrogen\integration\Model\AccountingFinalResponseVO**](../Model/AccountingFinalResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountingVendorInfoUsingClientId**
> \com\hydrogen\integration\Model\VendorAccessConfigVO getAccountingVendorInfoUsingClientId($nucleus_client_id)

Get Accounting Vendor Config

Get Accounting vendor config information with its status.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AccountingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id

try {
    $result = $apiInstance->getAccountingVendorInfoUsingClientId($nucleus_client_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountingApi->getAccountingVendorInfoUsingClientId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id |

### Return type

[**\com\hydrogen\integration\Model\VendorAccessConfigVO**](../Model/VendorAccessConfigVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAccountingVendorAccessConfigIsActiveById**
> \com\hydrogen\integration\Model\VendorAccessConfigVO updateAccountingVendorAccessConfigIsActiveById($id, $is_active)

Enable/Disable relation with particular accounting vendor.

Enable/Disable link with particular accounting vendor.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AccountingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = "id_example"; // string | id
$is_active = true; // bool | is_active

try {
    $result = $apiInstance->updateAccountingVendorAccessConfigIsActiveById($id, $is_active);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountingApi->updateAccountingVendorAccessConfigIsActiveById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**](../Model/.md)| id |
 **is_active** | **bool**| is_active |

### Return type

[**\com\hydrogen\integration\Model\VendorAccessConfigVO**](../Model/VendorAccessConfigVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCustomer**
> \com\hydrogen\integration\Model\AccountingFinalResponseVO updateCustomer($nucleus_customer_id)

Update customer in Nucleus for a given nucleus_customer_id

Update customer in Nucleus for a given nucleus_customer_id

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AccountingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_customer_id = "nucleus_customer_id_example"; // string | nucleus_customer_id

try {
    $result = $apiInstance->updateCustomer($nucleus_customer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountingApi->updateCustomer: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_customer_id** | [**string**](../Model/.md)| nucleus_customer_id |

### Return type

[**\com\hydrogen\integration\Model\AccountingFinalResponseVO**](../Model/AccountingFinalResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateInvoice**
> \com\hydrogen\integration\Model\AccountingFinalResponseVO updateInvoice($nucleus_invoice_id)

Update invoice in Nucleus for a given nucleus_invoice_id

Update invoice in Nucleus for a given nucleus_invoice_id

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AccountingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_invoice_id = "nucleus_invoice_id_example"; // string | nucleus_invoice_id

try {
    $result = $apiInstance->updateInvoice($nucleus_invoice_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountingApi->updateInvoice: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_invoice_id** | [**string**](../Model/.md)| nucleus_invoice_id |

### Return type

[**\com\hydrogen\integration\Model\AccountingFinalResponseVO**](../Model/AccountingFinalResponseVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

