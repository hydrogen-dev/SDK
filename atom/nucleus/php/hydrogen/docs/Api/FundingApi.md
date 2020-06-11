# com\hydrogen\FundingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankLinkUsingPost**](FundingApi.md#createBankLinkUsingPost) | **POST** /bank_link | Create a bank link
[**createDepositUsingPost**](FundingApi.md#createDepositUsingPost) | **POST** /deposit | Create a deposit request
[**createFundingUsingPost**](FundingApi.md#createFundingUsingPost) | **POST** /funding | Create a funding request
[**createTransferUsingPost**](FundingApi.md#createTransferUsingPost) | **POST** /transfer | Create a transfer requests
[**createWithdrawalUsingPost**](FundingApi.md#createWithdrawalUsingPost) | **POST** /withdrawal | Create a withdrawal request
[**deleteBankLinkUsingDelete**](FundingApi.md#deleteBankLinkUsingDelete) | **DELETE** /bank_link/{bank_link_id} | Delete a bank link
[**deleteDepositUsingDelete**](FundingApi.md#deleteDepositUsingDelete) | **DELETE** /deposit/{deposit_id} | Delete a deposit request
[**deleteFundingUsingDelete**](FundingApi.md#deleteFundingUsingDelete) | **DELETE** /funding/{funding_id} | Delete a funding request
[**deleteTransferUsingDelete**](FundingApi.md#deleteTransferUsingDelete) | **DELETE** /transfer/{transfer_id} | Delete a transfer request
[**deleteWithdrawalUsingDelete**](FundingApi.md#deleteWithdrawalUsingDelete) | **DELETE** /withdrawal/{withdrawal_id} | Delete a withdrawal request
[**getBankLinkAllUsingGet**](FundingApi.md#getBankLinkAllUsingGet) | **GET** /bank_link | List all bank links
[**getBankLinkUsingGet**](FundingApi.md#getBankLinkUsingGet) | **GET** /bank_link/{bank_link_id} | Retrieve a bank link
[**getDepositAllUsingGet**](FundingApi.md#getDepositAllUsingGet) | **GET** /deposit | List all deposit requests
[**getDepositUsingGet**](FundingApi.md#getDepositUsingGet) | **GET** /deposit/{deposit_id} | Retrieve a deposit request
[**getFundingAllUsingGet**](FundingApi.md#getFundingAllUsingGet) | **GET** /funding | List all funding requests
[**getFundingUsingGet**](FundingApi.md#getFundingUsingGet) | **GET** /funding/{funding_id} | Retrieve a funding request
[**getTransferAllUsingGet**](FundingApi.md#getTransferAllUsingGet) | **GET** /transfer | List all transfer requests
[**getTransferUsingGet**](FundingApi.md#getTransferUsingGet) | **GET** /transfer/{transfer_id} | Retrieve a transfer request
[**getWithdrawalAllUsingGet**](FundingApi.md#getWithdrawalAllUsingGet) | **GET** /withdrawal | List all withdrawal requests
[**getWithdrawalUsingGet**](FundingApi.md#getWithdrawalUsingGet) | **GET** /withdrawal/{withdrawal_id} | Retrieve a withdrawal request
[**updateBankLinkBulkUsingPut**](FundingApi.md#updateBankLinkBulkUsingPut) | **PUT** /bulk_bank_link | Update list of bank link
[**updateBankLinkUsingPut**](FundingApi.md#updateBankLinkUsingPut) | **PUT** /bank_link/{bank_link_id} | Update a bank link
[**updateDepositUsingPut**](FundingApi.md#updateDepositUsingPut) | **PUT** /deposit/{deposit_id} | Update a deposit request
[**updateFundingUsingPut**](FundingApi.md#updateFundingUsingPut) | **PUT** /funding/{funding_id} | Update a funding request
[**updateTransferUsingPut**](FundingApi.md#updateTransferUsingPut) | **PUT** /transfer/{transfer_id} | Update a transfer request
[**updateWithdrawalUsingPut**](FundingApi.md#updateWithdrawalUsingPut) | **PUT** /withdrawal/{withdrawal_id} | Update a withdrawal request


# **createBankLinkUsingPost**
> \com\hydrogen\Model\BankLink createBankLinkUsingPost($bank_link_info_request)

Create a bank link

Create a new bank link for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bank_link_info_request = new \com\hydrogen\Model\BankLink(); // \com\hydrogen\Model\BankLink | bankLinkInfoRequest

try {
    $result = $apiInstance->createBankLinkUsingPost($bank_link_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->createBankLinkUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_info_request** | [**\com\hydrogen\Model\BankLink**](../Model/BankLink.md)| bankLinkInfoRequest |

### Return type

[**\com\hydrogen\Model\BankLink**](../Model/BankLink.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createDepositUsingPost**
> \com\hydrogen\Model\DailyDeposit createDepositUsingPost($daily_deposit_request)

Create a deposit request

Create a new deposit request for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$daily_deposit_request = new \com\hydrogen\Model\DailyDeposit(); // \com\hydrogen\Model\DailyDeposit | dailyDepositRequest

try {
    $result = $apiInstance->createDepositUsingPost($daily_deposit_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->createDepositUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **daily_deposit_request** | [**\com\hydrogen\Model\DailyDeposit**](../Model/DailyDeposit.md)| dailyDepositRequest |

### Return type

[**\com\hydrogen\Model\DailyDeposit**](../Model/DailyDeposit.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createFundingUsingPost**
> \com\hydrogen\Model\Funding createFundingUsingPost($funding_request)

Create a funding request

Create a new funding request for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$funding_request = new \com\hydrogen\Model\Funding(); // \com\hydrogen\Model\Funding | fundingRequest

try {
    $result = $apiInstance->createFundingUsingPost($funding_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->createFundingUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding_request** | [**\com\hydrogen\Model\Funding**](../Model/Funding.md)| fundingRequest |

### Return type

[**\com\hydrogen\Model\Funding**](../Model/Funding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createTransferUsingPost**
> \com\hydrogen\Model\ExternalAccountTransfer createTransferUsingPost($external_account_transfer_request)

Create a transfer requests

Create a new external account transfer for a client account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$external_account_transfer_request = new \com\hydrogen\Model\ExternalAccountTransfer(); // \com\hydrogen\Model\ExternalAccountTransfer | externalAccountTransferRequest

try {
    $result = $apiInstance->createTransferUsingPost($external_account_transfer_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->createTransferUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_account_transfer_request** | [**\com\hydrogen\Model\ExternalAccountTransfer**](../Model/ExternalAccountTransfer.md)| externalAccountTransferRequest |

### Return type

[**\com\hydrogen\Model\ExternalAccountTransfer**](../Model/ExternalAccountTransfer.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createWithdrawalUsingPost**
> \com\hydrogen\Model\DailyWithdrawal createWithdrawalUsingPost($daily_withdrawal_request)

Create a withdrawal request

Create a new withdrawal request for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$daily_withdrawal_request = new \com\hydrogen\Model\DailyWithdrawal(); // \com\hydrogen\Model\DailyWithdrawal | dailyWithdrawalRequest

try {
    $result = $apiInstance->createWithdrawalUsingPost($daily_withdrawal_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->createWithdrawalUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **daily_withdrawal_request** | [**\com\hydrogen\Model\DailyWithdrawal**](../Model/DailyWithdrawal.md)| dailyWithdrawalRequest |

### Return type

[**\com\hydrogen\Model\DailyWithdrawal**](../Model/DailyWithdrawal.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteBankLinkUsingDelete**
> deleteBankLinkUsingDelete($bank_link_id)

Delete a bank link

Permanently delete a bank link defined for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bank_link_id = "bank_link_id_example"; // string | UUID bank_link_id

try {
    $apiInstance->deleteBankLinkUsingDelete($bank_link_id);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->deleteBankLinkUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_id** | [**string**](../Model/.md)| UUID bank_link_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteDepositUsingDelete**
> deleteDepositUsingDelete($deposit_id)

Delete a deposit request

Permanently delete a deposit request for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$deposit_id = "deposit_id_example"; // string | UUID deposit_id

try {
    $apiInstance->deleteDepositUsingDelete($deposit_id);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->deleteDepositUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit_id** | [**string**](../Model/.md)| UUID deposit_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteFundingUsingDelete**
> deleteFundingUsingDelete($funding_id)

Delete a funding request

Permanently delete a funding request defined for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$funding_id = "funding_id_example"; // string | UUID funding_id

try {
    $apiInstance->deleteFundingUsingDelete($funding_id);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->deleteFundingUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding_id** | [**string**](../Model/.md)| UUID funding_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteTransferUsingDelete**
> deleteTransferUsingDelete($transfer, $transfer_id)

Delete a transfer request

Permanently delete a external account transfer from a client account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$transfer = "transfer_example"; // string | UUID external_account_transfer_id
$transfer_id = "transfer_id_example"; // string | transfer_id

try {
    $apiInstance->deleteTransferUsingDelete($transfer, $transfer_id);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->deleteTransferUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer** | [**string**](../Model/.md)| UUID external_account_transfer_id |
 **transfer_id** | [**string**](../Model/.md)| transfer_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteWithdrawalUsingDelete**
> deleteWithdrawalUsingDelete($withdrawal_id)

Delete a withdrawal request

Permanently delete a withdrawal request from an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$withdrawal_id = "withdrawal_id_example"; // string | UUID withdrawal_id

try {
    $apiInstance->deleteWithdrawalUsingDelete($withdrawal_id);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->deleteWithdrawalUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal_id** | [**string**](../Model/.md)| UUID withdrawal_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBankLinkAllUsingGet**
> \com\hydrogen\Model\PageBankLink_ getBankLinkAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all bank links

Get all bank links defined for all clients defined for your firm.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getBankLinkAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->getBankLinkAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\Model\PageBankLink_**](../Model/PageBankLink_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBankLinkUsingGet**
> \com\hydrogen\Model\BankLink getBankLinkUsingGet($bank_link_id)

Retrieve a bank link

Retrieve the information for a bank link for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bank_link_id = "bank_link_id_example"; // string | UUID bank_link_id

try {
    $result = $apiInstance->getBankLinkUsingGet($bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->getBankLinkUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_id** | [**string**](../Model/.md)| UUID bank_link_id |

### Return type

[**\com\hydrogen\Model\BankLink**](../Model/BankLink.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDepositAllUsingGet**
> \com\hydrogen\Model\PageDailyDeposit_ getDepositAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all deposit requests

Get the information for all deposit requests for all clients.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getDepositAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->getDepositAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\Model\PageDailyDeposit_**](../Model/PageDailyDeposit_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDepositUsingGet**
> \com\hydrogen\Model\DailyDeposit getDepositUsingGet($deposit_id)

Retrieve a deposit request

Retrieve the information for a deposit request for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$deposit_id = "deposit_id_example"; // string | UUID deposit_id

try {
    $result = $apiInstance->getDepositUsingGet($deposit_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->getDepositUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit_id** | [**string**](../Model/.md)| UUID deposit_id |

### Return type

[**\com\hydrogen\Model\DailyDeposit**](../Model/DailyDeposit.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFundingAllUsingGet**
> \com\hydrogen\Model\PageFunding_ getFundingAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all funding requests

Get the information for all funding requests defined for your firm.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getFundingAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->getFundingAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\Model\PageFunding_**](../Model/PageFunding_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFundingUsingGet**
> \com\hydrogen\Model\Funding getFundingUsingGet($funding_id)

Retrieve a funding request

Retrieve the information for a funding request for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$funding_id = "funding_id_example"; // string | UUID funding_id

try {
    $result = $apiInstance->getFundingUsingGet($funding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->getFundingUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding_id** | [**string**](../Model/.md)| UUID funding_id |

### Return type

[**\com\hydrogen\Model\Funding**](../Model/Funding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTransferAllUsingGet**
> \com\hydrogen\Model\PageExternalAccountTransfer_ getTransferAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all transfer requests

Get the information for all external account transfers defined for your firm.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getTransferAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->getTransferAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\Model\PageExternalAccountTransfer_**](../Model/PageExternalAccountTransfer_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTransferUsingGet**
> \com\hydrogen\Model\ExternalAccountTransfer getTransferUsingGet($external_account_transfer_id, $transfer_id)

Retrieve a transfer request

Retrieve the information for a external account transfer for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$external_account_transfer_id = "external_account_transfer_id_example"; // string | UUID external_account_transfer_id
$transfer_id = "transfer_id_example"; // string | transfer_id

try {
    $result = $apiInstance->getTransferUsingGet($external_account_transfer_id, $transfer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->getTransferUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_account_transfer_id** | [**string**](../Model/.md)| UUID external_account_transfer_id |
 **transfer_id** | [**string**](../Model/.md)| transfer_id |

### Return type

[**\com\hydrogen\Model\ExternalAccountTransfer**](../Model/ExternalAccountTransfer.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWithdrawalAllUsingGet**
> \com\hydrogen\Model\PageDailyWithdrawal_ getWithdrawalAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all withdrawal requests

Get the information for all withdrawal requests for all clients.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getWithdrawalAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->getWithdrawalAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\Model\PageDailyWithdrawal_**](../Model/PageDailyWithdrawal_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWithdrawalUsingGet**
> \com\hydrogen\Model\DailyWithdrawal getWithdrawalUsingGet($withdrawal_id)

Retrieve a withdrawal request

Retrieve the information for a withdrawal request for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$withdrawal_id = "withdrawal_id_example"; // string | UUID withdrawal_id

try {
    $result = $apiInstance->getWithdrawalUsingGet($withdrawal_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->getWithdrawalUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal_id** | [**string**](../Model/.md)| UUID withdrawal_id |

### Return type

[**\com\hydrogen\Model\DailyWithdrawal**](../Model/DailyWithdrawal.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBankLinkBulkUsingPut**
> \com\hydrogen\Model\BankLink[] updateBankLinkBulkUsingPut($bank_link_list)

Update list of bank link

Update bank link list for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bank_link_list = array(new \com\hydrogen\Model\BankLink()); // \com\hydrogen\Model\BankLink[] | bankLinkList

try {
    $result = $apiInstance->updateBankLinkBulkUsingPut($bank_link_list);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->updateBankLinkBulkUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_list** | [**\com\hydrogen\Model\BankLink[]**](../Model/BankLink.md)| bankLinkList |

### Return type

[**\com\hydrogen\Model\BankLink[]**](../Model/BankLink.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateBankLinkUsingPut**
> \com\hydrogen\Model\BankLink updateBankLinkUsingPut($bank_link, $bank_link_id)

Update a bank link

Update the information for a bank link for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bank_link = new \com\hydrogen\Model\BankLink(); // \com\hydrogen\Model\BankLink | bank_link
$bank_link_id = "bank_link_id_example"; // string | UUID bank_link_id

try {
    $result = $apiInstance->updateBankLinkUsingPut($bank_link, $bank_link_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->updateBankLinkUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link** | [**\com\hydrogen\Model\BankLink**](../Model/BankLink.md)| bank_link |
 **bank_link_id** | [**string**](../Model/.md)| UUID bank_link_id |

### Return type

[**\com\hydrogen\Model\BankLink**](../Model/BankLink.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateDepositUsingPut**
> \com\hydrogen\Model\DailyDeposit updateDepositUsingPut($deposit, $deposit_id)

Update a deposit request

Update the information for a deposit request for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$deposit = new \com\hydrogen\Model\DailyDeposit(); // \com\hydrogen\Model\DailyDeposit | deposit
$deposit_id = "deposit_id_example"; // string | UUID deposit_id

try {
    $result = $apiInstance->updateDepositUsingPut($deposit, $deposit_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->updateDepositUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit** | [**\com\hydrogen\Model\DailyDeposit**](../Model/DailyDeposit.md)| deposit |
 **deposit_id** | [**string**](../Model/.md)| UUID deposit_id |

### Return type

[**\com\hydrogen\Model\DailyDeposit**](../Model/DailyDeposit.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateFundingUsingPut**
> \com\hydrogen\Model\Funding updateFundingUsingPut($funding, $funding_id)

Update a funding request

Update the information for a funding request for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$funding = new \com\hydrogen\Model\Funding(); // \com\hydrogen\Model\Funding | funding
$funding_id = "funding_id_example"; // string | UUID funding_id

try {
    $result = $apiInstance->updateFundingUsingPut($funding, $funding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->updateFundingUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding** | [**\com\hydrogen\Model\Funding**](../Model/Funding.md)| funding |
 **funding_id** | [**string**](../Model/.md)| UUID funding_id |

### Return type

[**\com\hydrogen\Model\Funding**](../Model/Funding.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateTransferUsingPut**
> \com\hydrogen\Model\ExternalAccountTransfer updateTransferUsingPut($transfer, $transfer_id)

Update a transfer request

Update the information for a external account transfer for a client account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$transfer = new \com\hydrogen\Model\ExternalAccountTransfer(); // \com\hydrogen\Model\ExternalAccountTransfer | transfer
$transfer_id = "transfer_id_example"; // string | UUID external_account_transfer_id

try {
    $result = $apiInstance->updateTransferUsingPut($transfer, $transfer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->updateTransferUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer** | [**\com\hydrogen\Model\ExternalAccountTransfer**](../Model/ExternalAccountTransfer.md)| transfer |
 **transfer_id** | [**string**](../Model/.md)| UUID external_account_transfer_id |

### Return type

[**\com\hydrogen\Model\ExternalAccountTransfer**](../Model/ExternalAccountTransfer.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateWithdrawalUsingPut**
> \com\hydrogen\Model\DailyWithdrawal updateWithdrawalUsingPut($withdrawal, $withdrawal_id)

Update a withdrawal request

Update the information for a withdrawal request for an account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
} catch (\com\hydrogen\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\Api\FundingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$withdrawal = new \com\hydrogen\Model\DailyWithdrawal(); // \com\hydrogen\Model\DailyWithdrawal | withdrawal
$withdrawal_id = "withdrawal_id_example"; // string | UUID withdrawal_id

try {
    $result = $apiInstance->updateWithdrawalUsingPut($withdrawal, $withdrawal_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FundingApi->updateWithdrawalUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal** | [**\com\hydrogen\Model\DailyWithdrawal**](../Model/DailyWithdrawal.md)| withdrawal |
 **withdrawal_id** | [**string**](../Model/.md)| UUID withdrawal_id |

### Return type

[**\com\hydrogen\Model\DailyWithdrawal**](../Model/DailyWithdrawal.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

