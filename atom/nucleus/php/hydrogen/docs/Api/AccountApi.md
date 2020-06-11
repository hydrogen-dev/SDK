# com\hydrogen\AccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountAllocationMappingUsingPost**](AccountApi.md#createAccountAllocationMappingUsingPost) | **POST** /account_allocation | Create an account allocation
[**createAccountTypeUsingPost**](AccountApi.md#createAccountTypeUsingPost) | **POST** /account_type | Create an account type
[**createAccountUsingPost**](AccountApi.md#createAccountUsingPost) | **POST** /account | Create an account
[**deleteAccountAllocationMappingUsingDelete**](AccountApi.md#deleteAccountAllocationMappingUsingDelete) | **DELETE** /account_allocation/{account_allocation_id} | Delete an account allocation
[**deleteAccountPermissionUsingDELETE**](AccountApi.md#deleteAccountPermissionUsingDELETE) | **DELETE** /account_permission/{account_id} | Delete an account permission
[**deleteAccountTypeUsingDelete**](AccountApi.md#deleteAccountTypeUsingDelete) | **DELETE** /account_type/{account_type_id} | Delete an account type
[**deleteAccountUsingDelete**](AccountApi.md#deleteAccountUsingDelete) | **DELETE** /account/{account_id} | Delete an account
[**getAccountAllUsingGet**](AccountApi.md#getAccountAllUsingGet) | **GET** /account | List all accounts
[**getAccountAllocationMappingAllUsingGet**](AccountApi.md#getAccountAllocationMappingAllUsingGet) | **GET** /account_allocation | List all account allocations
[**getAccountAllocationMappingUsingGet**](AccountApi.md#getAccountAllocationMappingUsingGet) | **GET** /account_allocation/{account_allocation_id} | Retrieve an account allocation
[**getAccountAssetSizeAggAllUsingGet**](AccountApi.md#getAccountAssetSizeAggAllUsingGet) | **GET** /account/{account_id}/asset_size | List all account asset sizes
[**getAccountAssetSizeAllUsingGet**](AccountApi.md#getAccountAssetSizeAllUsingGet) | **GET** /account_asset_size | List all account asset sizes
[**getAccountOverviewUsingGet**](AccountApi.md#getAccountOverviewUsingGet) | **GET** /account/{account_id}/account_overview | List all Account overview
[**getAccountPermissionUsingGET**](AccountApi.md#getAccountPermissionUsingGET) | **GET** /account_permission/{account_id} | Get an account permission
[**getAccountTypeAllUsingGet**](AccountApi.md#getAccountTypeAllUsingGet) | **GET** /account_type | List all account types
[**getAccountTypeUsingGet**](AccountApi.md#getAccountTypeUsingGet) | **GET** /account_type/{account_type_id} | Get an Account Type
[**getAccountUsingGet**](AccountApi.md#getAccountUsingGet) | **GET** /account/{account_id} | Retrieve an account
[**getAllAccountPermissionUsingGET**](AccountApi.md#getAllAccountPermissionUsingGET) | **GET** /account_permission | List all account permission
[**getPortfolioHoldingAggAllUsingGet**](AccountApi.md#getPortfolioHoldingAggAllUsingGet) | **GET** /account/{account_id}/holding | List all account holdings
[**getPortfolioTransactionAggAllUsingGet**](AccountApi.md#getPortfolioTransactionAggAllUsingGet) | **GET** /account/{account_id}/transaction | List all account transactions
[**insertAccountAndRelatedPermissionUsingPOST**](AccountApi.md#insertAccountAndRelatedPermissionUsingPOST) | **POST** /account_permission | create an account permission
[**subscribeAccountUsingPost**](AccountApi.md#subscribeAccountUsingPost) | **POST** /account/{account_id}/subscribe | Subscribe an account
[**updateAccountAllocationMappingUsingPut**](AccountApi.md#updateAccountAllocationMappingUsingPut) | **PUT** /account_allocation/{account_allocation_id} | Update an account allocation
[**updateAccountTypeUsingPut**](AccountApi.md#updateAccountTypeUsingPut) | **PUT** /account_type/{account_type_id} | Update an account type
[**updateAccountUsingPut**](AccountApi.md#updateAccountUsingPut) | **PUT** /account/{account_id} | Update an account
[**updateClientAccountPermissionUsingPUT**](AccountApi.md#updateClientAccountPermissionUsingPUT) | **PUT** /account_permission/{account_id} | Update an account permission


# **createAccountAllocationMappingUsingPost**
> \com\hydrogen\Model\AccountAllocationMapping createAccountAllocationMappingUsingPost($alloc_request)

Create an account allocation

Create an account-allocation mapping for an account.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$alloc_request = new \com\hydrogen\Model\AccountAllocationMapping(); // \com\hydrogen\Model\AccountAllocationMapping | allocRequest

try {
    $result = $apiInstance->createAccountAllocationMappingUsingPost($alloc_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->createAccountAllocationMappingUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alloc_request** | [**\com\hydrogen\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)| allocRequest |

### Return type

[**\com\hydrogen\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountTypeUsingPost**
> \com\hydrogen\Model\AccountType createAccountTypeUsingPost($account_type_request)

Create an account type

Create a new account type for your firm.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_type_request = new \com\hydrogen\Model\AccountType(); // \com\hydrogen\Model\AccountType | accountTypeRequest

try {
    $result = $apiInstance->createAccountTypeUsingPost($account_type_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->createAccountTypeUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type_request** | [**\com\hydrogen\Model\AccountType**](../Model/AccountType.md)| accountTypeRequest |

### Return type

[**\com\hydrogen\Model\AccountType**](../Model/AccountType.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountUsingPost**
> \com\hydrogen\Model\Account createAccountUsingPost($client_account_request)

Create an account

Create an account under a client.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_account_request = new \com\hydrogen\Model\Account(); // \com\hydrogen\Model\Account | clientAccountRequest

try {
    $result = $apiInstance->createAccountUsingPost($client_account_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->createAccountUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_account_request** | [**\com\hydrogen\Model\Account**](../Model/Account.md)| clientAccountRequest |

### Return type

[**\com\hydrogen\Model\Account**](../Model/Account.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAccountAllocationMappingUsingDelete**
> deleteAccountAllocationMappingUsingDelete($account_allocation_id)

Delete an account allocation

Permanently delete an account-allocation mapping for an account.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_allocation_id = "account_allocation_id_example"; // string | UUID account_allocation_id

try {
    $apiInstance->deleteAccountAllocationMappingUsingDelete($account_allocation_id);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->deleteAccountAllocationMappingUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_allocation_id** | [**string**](../Model/.md)| UUID account_allocation_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAccountPermissionUsingDELETE**
> \com\hydrogen\Model\AccountPermissionVO deleteAccountPermissionUsingDELETE($account_id)

Delete an account permission

Delete an account permission

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | account_id

try {
    $result = $apiInstance->deleteAccountPermissionUsingDELETE($account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->deleteAccountPermissionUsingDELETE: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| account_id |

### Return type

[**\com\hydrogen\Model\AccountPermissionVO**](../Model/AccountPermissionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAccountTypeUsingDelete**
> deleteAccountTypeUsingDelete($account_type_id, $account_type_id2)

Delete an account type

Permanently delete a possible account type defined for your firm.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_type_id = "account_type_id_example"; // string | UUID account_type_id
$account_type_id2 = "account_type_id_example"; // string | account_type_id

try {
    $apiInstance->deleteAccountTypeUsingDelete($account_type_id, $account_type_id2);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->deleteAccountTypeUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type_id** | [**string**](../Model/.md)| UUID account_type_id |
 **account_type_id2** | [**string**](../Model/.md)| account_type_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAccountUsingDelete**
> deleteAccountUsingDelete($account_id)

Delete an account

Permanently delete an account under a client.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | UUID account_id

try {
    $apiInstance->deleteAccountUsingDelete($account_id);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->deleteAccountUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| UUID account_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountAllUsingGet**
> \com\hydrogen\Model\PageAccount_ getAccountAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all accounts

Get information for all accounts for all clients defined for your firm.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
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
    $result = $apiInstance->getAccountAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageAccount_**](../Model/PageAccount_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountAllocationMappingAllUsingGet**
> \com\hydrogen\Model\PageAccountAllocationMapping_ getAccountAllocationMappingAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all account allocations

Get information for all account-allocation mappings for all accounts defined for your firm.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
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
    $result = $apiInstance->getAccountAllocationMappingAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountAllocationMappingAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageAccountAllocationMapping_**](../Model/PageAccountAllocationMapping_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountAllocationMappingUsingGet**
> \com\hydrogen\Model\AccountAllocationMapping getAccountAllocationMappingUsingGet($account_allocation_id)

Retrieve an account allocation

Retrieve the information for a specific account-allocation mapping for an account.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_allocation_id = "account_allocation_id_example"; // string | UUID account_allocation_id

try {
    $result = $apiInstance->getAccountAllocationMappingUsingGet($account_allocation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountAllocationMappingUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_allocation_id** | [**string**](../Model/.md)| UUID account_allocation_id |

### Return type

[**\com\hydrogen\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountAssetSizeAggAllUsingGet**
> \com\hydrogen\Model\AvailableDateDoubleVO[] getAccountAssetSizeAggAllUsingGet($account_id, $end_date, $exclude_subledger, $get_latest, $sort_type, $start_date)

List all account asset sizes

Get a list of asset sizes by date for an account.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | Account Id
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$exclude_subledger = false; // bool | exclude_subledger
$get_latest = true; // bool | true or false
$sort_type = "sort_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date

try {
    $result = $apiInstance->getAccountAssetSizeAggAllUsingGet($account_id, $end_date, $exclude_subledger, $get_latest, $sort_type, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountAssetSizeAggAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| Account Id |
 **end_date** | **\DateTime**| end date | [optional]
 **exclude_subledger** | **bool**| exclude_subledger | [optional] [default to false]
 **get_latest** | **bool**| true or false | [optional]
 **sort_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional]
 **start_date** | **\DateTime**| start date | [optional]

### Return type

[**\com\hydrogen\Model\AvailableDateDoubleVO[]**](../Model/AvailableDateDoubleVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountAssetSizeAllUsingGet**
> \com\hydrogen\Model\PageVAccountAssetSize_ getAccountAssetSizeAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all account asset sizes

Get information for all account asset sizes

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getAccountAssetSizeAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountAssetSizeAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\Model\PageVAccountAssetSize_**](../Model/PageVAccountAssetSize_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountOverviewUsingGet**
> \com\hydrogen\Model\AccountOverviewVO getAccountOverviewUsingGet($account_id, $ascending, $order_by)

List all Account overview

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | UUID account_id
$ascending = false; // bool | ascending
$order_by = "update_date"; // string | order_by

try {
    $result = $apiInstance->getAccountOverviewUsingGet($account_id, $ascending, $order_by);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountOverviewUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| UUID account_id |
 **ascending** | **bool**| ascending | [optional] [default to false]
 **order_by** | **string**| order_by | [optional] [default to update_date]

### Return type

[**\com\hydrogen\Model\AccountOverviewVO**](../Model/AccountOverviewVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountPermissionUsingGET**
> \com\hydrogen\Model\AccountPermissionVO getAccountPermissionUsingGET($account_id)

Get an account permission

Get an account permission

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | account_id

try {
    $result = $apiInstance->getAccountPermissionUsingGET($account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountPermissionUsingGET: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| account_id |

### Return type

[**\com\hydrogen\Model\AccountPermissionVO**](../Model/AccountPermissionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountTypeAllUsingGet**
> \com\hydrogen\Model\PageAccountType_ getAccountTypeAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all account types

List all account types defined for your firm.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
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
    $result = $apiInstance->getAccountTypeAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountTypeAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageAccountType_**](../Model/PageAccountType_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountTypeUsingGet**
> \com\hydrogen\Model\AccountType getAccountTypeUsingGet($account_type_id, $account_type_id2)

Get an Account Type

Get an account types defined for your firm.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_type_id = "account_type_id_example"; // string | UUID account_type_id
$account_type_id2 = "account_type_id_example"; // string | account_type_id

try {
    $result = $apiInstance->getAccountTypeUsingGet($account_type_id, $account_type_id2);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountTypeUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type_id** | [**string**](../Model/.md)| UUID account_type_id |
 **account_type_id2** | [**string**](../Model/.md)| account_type_id |

### Return type

[**\com\hydrogen\Model\AccountType**](../Model/AccountType.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountUsingGet**
> \com\hydrogen\Model\Account getAccountUsingGet($account_id)

Retrieve an account

Retrieve the information for a specific account associated with a client.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | UUID account_id

try {
    $result = $apiInstance->getAccountUsingGet($account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| UUID account_id |

### Return type

[**\com\hydrogen\Model\Account**](../Model/Account.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllAccountPermissionUsingGET**
> \com\hydrogen\Model\PageAccountPermissionVO_ getAllAccountPermissionUsingGET($ascending, $filter, $order_by, $page, $size)

List all account permission

List all account permission

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
$apiInstance = new com\hydrogen\Api\AccountApi(
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
    $result = $apiInstance->getAllAccountPermissionUsingGET($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAllAccountPermissionUsingGET: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageAccountPermissionVO_**](../Model/PageAccountPermissionVO_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioHoldingAggAllUsingGet**
> \com\hydrogen\Model\PortfolioHoldingAgg[] getPortfolioHoldingAggAllUsingGet($account_id, $end_date, $get_latest, $start_date)

List all account holdings

Get information for all the securities that are currently being held by an account.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | UUID account_id
$end_date = "end_date_example"; // string | end date
$get_latest = true; // bool | true or false
$start_date = "start_date_example"; // string | start date

try {
    $result = $apiInstance->getPortfolioHoldingAggAllUsingGet($account_id, $end_date, $get_latest, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getPortfolioHoldingAggAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| UUID account_id |
 **end_date** | **string**| end date | [optional]
 **get_latest** | **bool**| true or false | [optional]
 **start_date** | **string**| start date | [optional]

### Return type

[**\com\hydrogen\Model\PortfolioHoldingAgg[]**](../Model/PortfolioHoldingAgg.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioTransactionAggAllUsingGet**
> \com\hydrogen\Model\PagePortfolioTransaction_ getPortfolioTransactionAggAllUsingGet($account_id, $ascending, $end_date, $order_by, $page, $size, $start_date)

List all account transactions

Get the information for all transactions for an account.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | UUID account_id
$ascending = false; // bool | ascending
$end_date = new \DateTime("null"); // \DateTime | end_date
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size
$start_date = new \DateTime("null"); // \DateTime | start_date

try {
    $result = $apiInstance->getPortfolioTransactionAggAllUsingGet($account_id, $ascending, $end_date, $order_by, $page, $size, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getPortfolioTransactionAggAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| UUID account_id |
 **ascending** | **bool**| ascending | [optional] [default to false]
 **end_date** | **\DateTime**| end_date | [optional] [default to null]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **\DateTime**| start_date | [optional] [default to null]

### Return type

[**\com\hydrogen\Model\PagePortfolioTransaction_**](../Model/PagePortfolioTransaction_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **insertAccountAndRelatedPermissionUsingPOST**
> \com\hydrogen\Model\AccountPermissionVO insertAccountAndRelatedPermissionUsingPOST($acl_client_permission_vo)

create an account permission

create an account permission

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$acl_client_permission_vo = new \com\hydrogen\Model\AclClientPermissionVO(); // \com\hydrogen\Model\AclClientPermissionVO | aclClientPermissionVO

try {
    $result = $apiInstance->insertAccountAndRelatedPermissionUsingPOST($acl_client_permission_vo);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->insertAccountAndRelatedPermissionUsingPOST: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acl_client_permission_vo** | [**\com\hydrogen\Model\AclClientPermissionVO**](../Model/AclClientPermissionVO.md)| aclClientPermissionVO |

### Return type

[**\com\hydrogen\Model\AccountPermissionVO**](../Model/AccountPermissionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **subscribeAccountUsingPost**
> \com\hydrogen\Model\Portfolio[] subscribeAccountUsingPost($account_id, $alloc_request)

Subscribe an account

After creating an account, you may create portfolios for the account to track a client’s investment, savings, or insurance products.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | UUID account_id
$alloc_request = new \com\hydrogen\Model\AccountAllocationMapping(); // \com\hydrogen\Model\AccountAllocationMapping | allocRequest

try {
    $result = $apiInstance->subscribeAccountUsingPost($account_id, $alloc_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->subscribeAccountUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| UUID account_id |
 **alloc_request** | [**\com\hydrogen\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)| allocRequest |

### Return type

[**\com\hydrogen\Model\Portfolio[]**](../Model/Portfolio.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAccountAllocationMappingUsingPut**
> \com\hydrogen\Model\AccountAllocationMapping updateAccountAllocationMappingUsingPut($account_allocation_id, $account_allocation_mapping)

Update an account allocation

Update the information for an account-allocation mapping.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_allocation_id = "account_allocation_id_example"; // string | UUID account_allocation_id
$account_allocation_mapping = new \com\hydrogen\Model\AccountAllocationMapping(); // \com\hydrogen\Model\AccountAllocationMapping | account_allocation_mapping

try {
    $result = $apiInstance->updateAccountAllocationMappingUsingPut($account_allocation_id, $account_allocation_mapping);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->updateAccountAllocationMappingUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_allocation_id** | [**string**](../Model/.md)| UUID account_allocation_id |
 **account_allocation_mapping** | [**\com\hydrogen\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)| account_allocation_mapping | [optional]

### Return type

[**\com\hydrogen\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAccountTypeUsingPut**
> \com\hydrogen\Model\AccountType updateAccountTypeUsingPut($account_type, $account_type_id)

Update an account type

Update the information for a possible account type defined for your firm.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_type = new \com\hydrogen\Model\AccountType(); // \com\hydrogen\Model\AccountType | account_type
$account_type_id = "account_type_id_example"; // string | UUID account_type_id

try {
    $result = $apiInstance->updateAccountTypeUsingPut($account_type, $account_type_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->updateAccountTypeUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type** | [**\com\hydrogen\Model\AccountType**](../Model/AccountType.md)| account_type |
 **account_type_id** | [**string**](../Model/.md)| UUID account_type_id |

### Return type

[**\com\hydrogen\Model\AccountType**](../Model/AccountType.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAccountUsingPut**
> \com\hydrogen\Model\Account updateAccountUsingPut($account, $account_id)

Update an account

Update the information for an account.

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account = new \com\hydrogen\Model\Account(); // \com\hydrogen\Model\Account | account
$account_id = "account_id_example"; // string | UUID account_id

try {
    $result = $apiInstance->updateAccountUsingPut($account, $account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->updateAccountUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**\com\hydrogen\Model\Account**](../Model/Account.md)| account |
 **account_id** | [**string**](../Model/.md)| UUID account_id |

### Return type

[**\com\hydrogen\Model\Account**](../Model/Account.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateClientAccountPermissionUsingPUT**
> \com\hydrogen\Model\AccountPermissionVO updateClientAccountPermissionUsingPUT($account_id, $acl_client_permission_vo)

Update an account permission

Update an account permission

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
$apiInstance = new com\hydrogen\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | account_id
$acl_client_permission_vo = new \com\hydrogen\Model\AclClientPermissionVO(); // \com\hydrogen\Model\AclClientPermissionVO | aclClientPermissionVO

try {
    $result = $apiInstance->updateClientAccountPermissionUsingPUT($account_id, $acl_client_permission_vo);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->updateClientAccountPermissionUsingPUT: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| account_id |
 **acl_client_permission_vo** | [**\com\hydrogen\Model\AclClientPermissionVO**](../Model/AclClientPermissionVO.md)| aclClientPermissionVO |

### Return type

[**\com\hydrogen\Model\AccountPermissionVO**](../Model/AccountPermissionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

