# com\hydrogen\nucleus\InvoiceApi

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


# **createInvoicePaymentUsingPost**
> \com\hydrogen\nucleus\Model\InvoicePayment createInvoicePaymentUsingPost($invoice_payment)

Create a invoicePayment

Create a new invoicePayment, for tracking invoice status.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\InvoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invoice_payment = new \com\hydrogen\nucleus\Model\InvoicePayment(); // \com\hydrogen\nucleus\Model\InvoicePayment | invoicePayment

try {
    $result = $apiInstance->createInvoicePaymentUsingPost($invoice_payment);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceApi->createInvoicePaymentUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment** | [**\com\hydrogen\nucleus\Model\InvoicePayment**](../Model/InvoicePayment.md)| invoicePayment |

### Return type

[**\com\hydrogen\nucleus\Model\InvoicePayment**](../Model/InvoicePayment.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createInvoiceUsingPost**
> \com\hydrogen\nucleus\Model\Invoice createInvoiceUsingPost($invoice)

Create a invoice

Create a new invoice, with your firm.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\InvoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invoice = new \com\hydrogen\nucleus\Model\Invoice(); // \com\hydrogen\nucleus\Model\Invoice | invoice

try {
    $result = $apiInstance->createInvoiceUsingPost($invoice);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceApi->createInvoiceUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**\com\hydrogen\nucleus\Model\Invoice**](../Model/Invoice.md)| invoice |

### Return type

[**\com\hydrogen\nucleus\Model\Invoice**](../Model/Invoice.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteInvoicePaymentUsingDelete**
> deleteInvoicePaymentUsingDelete($invoice_payment_id)

Delete a invoicePayment

Delete a invoicePayment.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\InvoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invoice_payment_id = "invoice_payment_id_example"; // string | UUID invoice_payment_id

try {
    $apiInstance->deleteInvoicePaymentUsingDelete($invoice_payment_id);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceApi->deleteInvoicePaymentUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment_id** | [**string**](../Model/.md)| UUID invoice_payment_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteInvoiceUsingDelete**
> deleteInvoiceUsingDelete($invoice_id)

Delete a invoice

Delete a invoice.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\InvoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invoice_id = "invoice_id_example"; // string | UUID invoice_id

try {
    $apiInstance->deleteInvoiceUsingDelete($invoice_id);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceApi->deleteInvoiceUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | [**string**](../Model/.md)| UUID invoice_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInvoiceAllUsingGet**
> \com\hydrogen\nucleus\Model\PageInvoice_ getInvoiceAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size)

List all invoices

List all invoice.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\InvoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$currency_conversion = "currency_conversion_example"; // string | currency_conversion
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getInvoiceAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceApi->getInvoiceAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **string**| currency_conversion | [optional]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageInvoice_**](../Model/PageInvoice_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInvoicePaymentAllUsingGet**
> \com\hydrogen\nucleus\Model\PageInvoicePayment_ getInvoicePaymentAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size)

List all invoice payments

List all invoicePayment.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\InvoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$currency_conversion = "currency_conversion_example"; // string | currency_conversion
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getInvoicePaymentAllUsingGet($ascending, $currency_conversion, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceApi->getInvoicePaymentAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **string**| currency_conversion | [optional]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageInvoicePayment_**](../Model/PageInvoicePayment_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInvoicePaymentUsingGet**
> \com\hydrogen\nucleus\Model\InvoicePayment getInvoicePaymentUsingGet($invoice_payment_id, $currency_conversion)

Retrieve a invoicePayment

Retrieve a invoicePayment.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\InvoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invoice_payment_id = "invoice_payment_id_example"; // string | UUID invoice_payment_id
$currency_conversion = "currency_conversion_example"; // string | USD

try {
    $result = $apiInstance->getInvoicePaymentUsingGet($invoice_payment_id, $currency_conversion);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceApi->getInvoicePaymentUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment_id** | [**string**](../Model/.md)| UUID invoice_payment_id |
 **currency_conversion** | **string**| USD | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\InvoicePayment**](../Model/InvoicePayment.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInvoiceUsingGet**
> \com\hydrogen\nucleus\Model\Invoice getInvoiceUsingGet($invoice_id, $currency_conversion)

Retrieve a invoice

Retrieve a invoice.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\InvoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invoice_id = "invoice_id_example"; // string | UUID invoice_idd
$currency_conversion = "currency_conversion_example"; // string | USD

try {
    $result = $apiInstance->getInvoiceUsingGet($invoice_id, $currency_conversion);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceApi->getInvoiceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | [**string**](../Model/.md)| UUID invoice_idd |
 **currency_conversion** | **string**| USD | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\Invoice**](../Model/Invoice.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateInvoicePaymentUsingPut**
> \com\hydrogen\nucleus\Model\InvoicePayment updateInvoicePaymentUsingPut($invoice_payment, $invoice_payment_id)

Update a invoicePayment

Update a invoicePayment.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\InvoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invoice_payment = new \com\hydrogen\nucleus\Model\InvoicePayment(); // \com\hydrogen\nucleus\Model\InvoicePayment | invoice_payment
$invoice_payment_id = "invoice_payment_id_example"; // string | UUID invoice_payment_id

try {
    $result = $apiInstance->updateInvoicePaymentUsingPut($invoice_payment, $invoice_payment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceApi->updateInvoicePaymentUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment** | [**\com\hydrogen\nucleus\Model\InvoicePayment**](../Model/InvoicePayment.md)| invoice_payment |
 **invoice_payment_id** | [**string**](../Model/.md)| UUID invoice_payment_id |

### Return type

[**\com\hydrogen\nucleus\Model\InvoicePayment**](../Model/InvoicePayment.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateInvoiceUsingPut**
> \com\hydrogen\nucleus\Model\Invoice updateInvoiceUsingPut($invoice, $invoice_id)

Update a invoice

Update a invoice.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\InvoiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invoice = new \com\hydrogen\nucleus\Model\Invoice(); // \com\hydrogen\nucleus\Model\Invoice | invoice
$invoice_id = "invoice_id_example"; // string | UUID invoice_id

try {
    $result = $apiInstance->updateInvoiceUsingPut($invoice, $invoice_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceApi->updateInvoiceUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**\com\hydrogen\nucleus\Model\Invoice**](../Model/Invoice.md)| invoice |
 **invoice_id** | [**string**](../Model/.md)| UUID invoice_id |

### Return type

[**\com\hydrogen\nucleus\Model\Invoice**](../Model/Invoice.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

