# com\hydrogen\nucleus\AccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountAllocationMappingUsingPost**](AccountApi.md#createAccountAllocationMappingUsingPost) | **POST** /account_allocation | Create an account allocation
[**createAccountStatusUsingPost**](AccountApi.md#createAccountStatusUsingPost) | **POST** /account_status | Create an account status
[**createAccountTypeUsingPost**](AccountApi.md#createAccountTypeUsingPost) | **POST** /account_type | Create an account type
[**createAccountUsingPost**](AccountApi.md#createAccountUsingPost) | **POST** /account | Create an account
[**deleteAccountAllocationMappingUsingDelete**](AccountApi.md#deleteAccountAllocationMappingUsingDelete) | **DELETE** /account_allocation/{account_allocation_id} | Delete an account allocation
[**deleteAccountPermissionUsingDELETE**](AccountApi.md#deleteAccountPermissionUsingDELETE) | **DELETE** /account_permission/{account_id} | Delete an account permission
[**deleteAccountStatusUsingDelete**](AccountApi.md#deleteAccountStatusUsingDelete) | **DELETE** /account_status/{account_status_id} | Delete an account status
[**deleteAccountTypeUsingDelete**](AccountApi.md#deleteAccountTypeUsingDelete) | **DELETE** /account_type/{account_type_id} | Delete an account type
[**deleteAccountUsingDelete**](AccountApi.md#deleteAccountUsingDelete) | **DELETE** /account/{account_id} | Delete an account
[**getAccountAllUsingGet**](AccountApi.md#getAccountAllUsingGet) | **GET** /account | List all accounts
[**getAccountAllocationMappingAllUsingGet**](AccountApi.md#getAccountAllocationMappingAllUsingGet) | **GET** /account_allocation | List all account allocations
[**getAccountAllocationMappingUsingGet**](AccountApi.md#getAccountAllocationMappingUsingGet) | **GET** /account_allocation/{account_allocation_id} | Retrieve an account allocation
[**getAccountAssetSizeAggAllUsingGet**](AccountApi.md#getAccountAssetSizeAggAllUsingGet) | **GET** /account/{account_id}/asset_size | List all account asset sizes
[**getAccountAssetSizeAllUsingGet**](AccountApi.md#getAccountAssetSizeAllUsingGet) | **GET** /account_asset_size | List all account asset sizes
[**getAccountOverviewUsingGet**](AccountApi.md#getAccountOverviewUsingGet) | **GET** /account/{account_id}/account_overview | List all Account overview
[**getAccountPermissionUsingGET**](AccountApi.md#getAccountPermissionUsingGET) | **GET** /account_permission/{account_id} | Get an account permission
[**getAccountStatusAllUsingGet**](AccountApi.md#getAccountStatusAllUsingGet) | **GET** /account_status | List all account statuses
[**getAccountStatusUsingGet**](AccountApi.md#getAccountStatusUsingGet) | **GET** /account_status/{account_status_id} | Retrieve an account status
[**getAccountTypeAllUsingGet**](AccountApi.md#getAccountTypeAllUsingGet) | **GET** /account_type | List all account types
[**getAccountTypeUsingGet**](AccountApi.md#getAccountTypeUsingGet) | **GET** /account_type/{account_type_id} | Get an Account Type
[**getAccountUsingGet**](AccountApi.md#getAccountUsingGet) | **GET** /account/{account_id} | Retrieve an account
[**getAllAccountPermissionUsingGET**](AccountApi.md#getAllAccountPermissionUsingGET) | **GET** /account_permission | List all account permission
[**getPortfolioHoldingAggAllUsingGet**](AccountApi.md#getPortfolioHoldingAggAllUsingGet) | **GET** /account/{account_id}/holding | List all account holdings
[**getPortfolioTransactionAggAllUsingGet**](AccountApi.md#getPortfolioTransactionAggAllUsingGet) | **GET** /account/{account_id}/transaction | List all account transactions
[**insertAccountAndRelatedPermissionUsingPOST**](AccountApi.md#insertAccountAndRelatedPermissionUsingPOST) | **POST** /account_permission | create an account permission
[**subscribeAccountUsingPost**](AccountApi.md#subscribeAccountUsingPost) | **POST** /account/{account_id}/subscribe | Subscribe an account
[**updateAccountAllocationMappingUsingPut**](AccountApi.md#updateAccountAllocationMappingUsingPut) | **PUT** /account_allocation/{account_allocation_id} | Update an account allocation
[**updateAccountStatusUsingPut**](AccountApi.md#updateAccountStatusUsingPut) | **PUT** /account_status/{account_status_id} | Update an account status
[**updateAccountTypeUsingPut**](AccountApi.md#updateAccountTypeUsingPut) | **PUT** /account_type/{account_type_id} | Update an account type
[**updateAccountUsingPut**](AccountApi.md#updateAccountUsingPut) | **PUT** /account/{account_id} | Update an account
[**updateClientAccountPermissionUsingPUT**](AccountApi.md#updateClientAccountPermissionUsingPUT) | **PUT** /account_permission/{account_id} | Update an account permission


# **createAccountAllocationMappingUsingPost**
> \com\hydrogen\nucleus\Model\AccountAllocationMapping createAccountAllocationMappingUsingPost($alloc_request)

Create an account allocation

Create an account-allocation mapping for an account.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$alloc_request = new \com\hydrogen\nucleus\Model\AccountAllocationMapping(); // \com\hydrogen\nucleus\Model\AccountAllocationMapping | allocRequest

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
 **alloc_request** | [**\com\hydrogen\nucleus\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)| allocRequest |

### Return type

[**\com\hydrogen\nucleus\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountStatusUsingPost**
> \com\hydrogen\nucleus\Model\AccountStatus createAccountStatusUsingPost($account_status_request)

Create an account status

Create an account status record for an account.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_status_request = new \com\hydrogen\nucleus\Model\AccountStatus(); // \com\hydrogen\nucleus\Model\AccountStatus | accountStatusRequest

try {
    $result = $apiInstance->createAccountStatusUsingPost($account_status_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->createAccountStatusUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_status_request** | [**\com\hydrogen\nucleus\Model\AccountStatus**](../Model/AccountStatus.md)| accountStatusRequest |

### Return type

[**\com\hydrogen\nucleus\Model\AccountStatus**](../Model/AccountStatus.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountTypeUsingPost**
> \com\hydrogen\nucleus\Model\AccountType createAccountTypeUsingPost($account_type_request)

Create an account type

Create a new account type for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_type_request = new \com\hydrogen\nucleus\Model\AccountType(); // \com\hydrogen\nucleus\Model\AccountType | accountTypeRequest

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
 **account_type_request** | [**\com\hydrogen\nucleus\Model\AccountType**](../Model/AccountType.md)| accountTypeRequest |

### Return type

[**\com\hydrogen\nucleus\Model\AccountType**](../Model/AccountType.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createAccountUsingPost**
> \com\hydrogen\nucleus\Model\Account createAccountUsingPost($client_account_request)

Create an account

Create an account under a client.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_account_request = new \com\hydrogen\nucleus\Model\Account(); // \com\hydrogen\nucleus\Model\Account | clientAccountRequest

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
 **client_account_request** | [**\com\hydrogen\nucleus\Model\Account**](../Model/Account.md)| clientAccountRequest |

### Return type

[**\com\hydrogen\nucleus\Model\Account**](../Model/Account.md)

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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
> \com\hydrogen\nucleus\Model\AccountPermissionVO deleteAccountPermissionUsingDELETE($account_id)

Delete an account permission

Delete an account permission

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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

[**\com\hydrogen\nucleus\Model\AccountPermissionVO**](../Model/AccountPermissionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAccountStatusUsingDelete**
> deleteAccountStatusUsingDelete($account_status_id)

Delete an account status

Permanently delete an account status record from an account’s history.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_status_id = "account_status_id_example"; // string | UUID account_status_id

try {
    $apiInstance->deleteAccountStatusUsingDelete($account_status_id);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->deleteAccountStatusUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_status_id** | [**string**](../Model/.md)| UUID account_status_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAccountTypeUsingDelete**
> deleteAccountTypeUsingDelete($account_type_id)

Delete an account type

Permanently delete a possible account type defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_type_id = "account_type_id_example"; // string | UUID account_type_id

try {
    $apiInstance->deleteAccountTypeUsingDelete($account_type_id);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->deleteAccountTypeUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type_id** | [**string**](../Model/.md)| UUID account_type_id |

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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
> \com\hydrogen\nucleus\Model\PageAccount_ getAccountAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all accounts

Get information for all accounts for all clients defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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

[**\com\hydrogen\nucleus\Model\PageAccount_**](../Model/PageAccount_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountAllocationMappingAllUsingGet**
> \com\hydrogen\nucleus\Model\PageAccountAllocationMapping_ getAccountAllocationMappingAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all account allocations

Get information for all account-allocation mappings for all accounts defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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

[**\com\hydrogen\nucleus\Model\PageAccountAllocationMapping_**](../Model/PageAccountAllocationMapping_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountAllocationMappingUsingGet**
> \com\hydrogen\nucleus\Model\AccountAllocationMapping getAccountAllocationMappingUsingGet($account_allocation_id)

Retrieve an account allocation

Retrieve the information for a specific account-allocation mapping for an account.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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

[**\com\hydrogen\nucleus\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountAssetSizeAggAllUsingGet**
> \com\hydrogen\nucleus\Model\AvailableDateDoubleVO[] getAccountAssetSizeAggAllUsingGet($account_id, $currency_conversion, $end_date, $exclude_subledger, $get_latest, $sort_type, $start_date)

List all account asset sizes

Get a list of asset sizes by date for an account.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | Account Id
$currency_conversion = "currency_conversion_example"; // string | USD
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$exclude_subledger = true; // bool | true or false
$get_latest = true; // bool | true or false
$sort_type = "sort_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date

try {
    $result = $apiInstance->getAccountAssetSizeAggAllUsingGet($account_id, $currency_conversion, $end_date, $exclude_subledger, $get_latest, $sort_type, $start_date);
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
 **currency_conversion** | **string**| USD | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **exclude_subledger** | **bool**| true or false | [optional]
 **get_latest** | **bool**| true or false | [optional]
 **sort_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional]
 **start_date** | **\DateTime**| start date | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\AvailableDateDoubleVO[]**](../Model/AvailableDateDoubleVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountAssetSizeAllUsingGet**
> \com\hydrogen\nucleus\Model\PageVAccountAssetSize_ getAccountAssetSizeAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all account asset sizes

Get information for all account asset sizes

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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

[**\com\hydrogen\nucleus\Model\PageVAccountAssetSize_**](../Model/PageVAccountAssetSize_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountOverviewUsingGet**
> object getAccountOverviewUsingGet($account_id, $ascending, $order_by)

List all Account overview

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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

**object**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountPermissionUsingGET**
> \com\hydrogen\nucleus\Model\AccountPermissionVO getAccountPermissionUsingGET($account_id)

Get an account permission

Get an account permission

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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

[**\com\hydrogen\nucleus\Model\AccountPermissionVO**](../Model/AccountPermissionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountStatusAllUsingGet**
> \com\hydrogen\nucleus\Model\PageAccountStatus_ getAccountStatusAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all account statuses

Get the account status history information for all accounts.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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
    $result = $apiInstance->getAccountStatusAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountStatusAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageAccountStatus_**](../Model/PageAccountStatus_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountStatusUsingGet**
> \com\hydrogen\nucleus\Model\AccountStatus getAccountStatusUsingGet($account_status_id)

Retrieve an account status

Retrieve the information for a specific account status record for an account.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_status_id = "account_status_id_example"; // string | UUID account_status_id

try {
    $result = $apiInstance->getAccountStatusUsingGet($account_status_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->getAccountStatusUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_status_id** | [**string**](../Model/.md)| UUID account_status_id |

### Return type

[**\com\hydrogen\nucleus\Model\AccountStatus**](../Model/AccountStatus.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountTypeAllUsingGet**
> \com\hydrogen\nucleus\Model\PageAccountType_ getAccountTypeAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all account types

List all account types defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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

[**\com\hydrogen\nucleus\Model\PageAccountType_**](../Model/PageAccountType_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountTypeUsingGet**
> \com\hydrogen\nucleus\Model\AccountType getAccountTypeUsingGet($account_type_id)

Get an Account Type

Get an account types defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_type_id = "account_type_id_example"; // string | UUID account_type_id

try {
    $result = $apiInstance->getAccountTypeUsingGet($account_type_id);
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

### Return type

[**\com\hydrogen\nucleus\Model\AccountType**](../Model/AccountType.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAccountUsingGet**
> \com\hydrogen\nucleus\Model\Account getAccountUsingGet($account_id)

Retrieve an account

Retrieve the information for a specific account associated with a client.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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

[**\com\hydrogen\nucleus\Model\Account**](../Model/Account.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllAccountPermissionUsingGET**
> \com\hydrogen\nucleus\Model\PageAccountPermissionVO_ getAllAccountPermissionUsingGET($ascending, $filter, $order_by, $page, $size)

List all account permission

List all account permission

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
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

[**\com\hydrogen\nucleus\Model\PageAccountPermissionVO_**](../Model/PageAccountPermissionVO_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioHoldingAggAllUsingGet**
> \com\hydrogen\nucleus\Model\PortfolioHoldingAgg[] getPortfolioHoldingAggAllUsingGet($account_id, $currency_conversion, $end_date, $get_latest, $start_date)

List all account holdings

Get information for all the securities that are currently being held by an account.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | UUID account_id
$currency_conversion = "currency_conversion_example"; // string | USD
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$get_latest = true; // bool | true or false
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date

try {
    $result = $apiInstance->getPortfolioHoldingAggAllUsingGet($account_id, $currency_conversion, $end_date, $get_latest, $start_date);
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
 **currency_conversion** | **string**| USD | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **get_latest** | **bool**| true or false | [optional]
 **start_date** | **\DateTime**| start date | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\PortfolioHoldingAgg[]**](../Model/PortfolioHoldingAgg.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioTransactionAggAllUsingGet**
> \com\hydrogen\nucleus\Model\PagePortfolioTransaction_ getPortfolioTransactionAggAllUsingGet($account_id, $ascending, $currency_conversion, $end_date, $order_by, $page, $size, $start_date)

List all account transactions

Get the information for all transactions for an account.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | UUID account_id
$ascending = false; // bool | ascending
$currency_conversion = "currency_conversion_example"; // string | USD
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date

try {
    $result = $apiInstance->getPortfolioTransactionAggAllUsingGet($account_id, $ascending, $currency_conversion, $end_date, $order_by, $page, $size, $start_date);
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
 **currency_conversion** | **string**| USD | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **\DateTime**| start date | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\PagePortfolioTransaction_**](../Model/PagePortfolioTransaction_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **insertAccountAndRelatedPermissionUsingPOST**
> \com\hydrogen\nucleus\Model\AccountPermissionVO insertAccountAndRelatedPermissionUsingPOST($acl_client_permission_vo)

create an account permission

create an account permission

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$acl_client_permission_vo = new \com\hydrogen\nucleus\Model\AclClientPermissionVO(); // \com\hydrogen\nucleus\Model\AclClientPermissionVO | aclClientPermissionVO

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
 **acl_client_permission_vo** | [**\com\hydrogen\nucleus\Model\AclClientPermissionVO**](../Model/AclClientPermissionVO.md)| aclClientPermissionVO |

### Return type

[**\com\hydrogen\nucleus\Model\AccountPermissionVO**](../Model/AccountPermissionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **subscribeAccountUsingPost**
> \com\hydrogen\nucleus\Model\Portfolio[] subscribeAccountUsingPost($account_id, $alloc_request)

Subscribe an account

After creating an account, you may create portfolios for the account to track a client’s investment, savings, or insurance products.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | UUID account_id
$alloc_request = new \com\hydrogen\nucleus\Model\AccountAllocationMapping(); // \com\hydrogen\nucleus\Model\AccountAllocationMapping | allocRequest

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
 **alloc_request** | [**\com\hydrogen\nucleus\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)| allocRequest |

### Return type

[**\com\hydrogen\nucleus\Model\Portfolio[]**](../Model/Portfolio.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAccountAllocationMappingUsingPut**
> \com\hydrogen\nucleus\Model\AccountAllocationMapping updateAccountAllocationMappingUsingPut($account_allocation_id, $account_allocation_mapping)

Update an account allocation

Update the information for an account-allocation mapping.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_allocation_id = "account_allocation_id_example"; // string | UUID account_allocation_id
$account_allocation_mapping = new \com\hydrogen\nucleus\Model\AccountAllocationMapping(); // \com\hydrogen\nucleus\Model\AccountAllocationMapping | account_allocation_mapping

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
 **account_allocation_mapping** | [**\com\hydrogen\nucleus\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)| account_allocation_mapping | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\AccountAllocationMapping**](../Model/AccountAllocationMapping.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAccountStatusUsingPut**
> \com\hydrogen\nucleus\Model\AccountStatus updateAccountStatusUsingPut($account_status, $account_status_id)

Update an account status

Update an account status record for an account.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_status = new \com\hydrogen\nucleus\Model\AccountStatus(); // \com\hydrogen\nucleus\Model\AccountStatus | account_status
$account_status_id = "account_status_id_example"; // string | UUID account_status_id

try {
    $result = $apiInstance->updateAccountStatusUsingPut($account_status, $account_status_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->updateAccountStatusUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_status** | [**\com\hydrogen\nucleus\Model\AccountStatus**](../Model/AccountStatus.md)| account_status |
 **account_status_id** | [**string**](../Model/.md)| UUID account_status_id |

### Return type

[**\com\hydrogen\nucleus\Model\AccountStatus**](../Model/AccountStatus.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAccountTypeUsingPut**
> \com\hydrogen\nucleus\Model\AccountType updateAccountTypeUsingPut($account_type, $account_type_id)

Update an account type

Update the information for a possible account type defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_type = new \com\hydrogen\nucleus\Model\AccountType(); // \com\hydrogen\nucleus\Model\AccountType | account_type
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
 **account_type** | [**\com\hydrogen\nucleus\Model\AccountType**](../Model/AccountType.md)| account_type |
 **account_type_id** | [**string**](../Model/.md)| UUID account_type_id |

### Return type

[**\com\hydrogen\nucleus\Model\AccountType**](../Model/AccountType.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAccountUsingPut**
> \com\hydrogen\nucleus\Model\Account updateAccountUsingPut($account, $account_id)

Update an account

Update the information for an account.

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account = new \com\hydrogen\nucleus\Model\Account(); // \com\hydrogen\nucleus\Model\Account | account
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
 **account** | [**\com\hydrogen\nucleus\Model\Account**](../Model/Account.md)| account |
 **account_id** | [**string**](../Model/.md)| UUID account_id |

### Return type

[**\com\hydrogen\nucleus\Model\Account**](../Model/Account.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateClientAccountPermissionUsingPUT**
> \com\hydrogen\nucleus\Model\AccountPermissionVO updateClientAccountPermissionUsingPUT($account_id, $acl_client_permission_vo)

Update an account permission

Update an account permission

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
$apiInstance = new com\hydrogen\nucleus\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | account_id
$acl_client_permission_vo = new \com\hydrogen\nucleus\Model\AclClientPermissionVO(); // \com\hydrogen\nucleus\Model\AclClientPermissionVO | aclClientPermissionVO

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
 **acl_client_permission_vo** | [**\com\hydrogen\nucleus\Model\AclClientPermissionVO**](../Model/AclClientPermissionVO.md)| aclClientPermissionVO |

### Return type

[**\com\hydrogen\nucleus\Model\AccountPermissionVO**](../Model/AccountPermissionVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

