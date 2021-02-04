# com\hydrogen\nucleus\HouseholdApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHouseholdUsingPost**](HouseholdApi.md#createHouseholdUsingPost) | **POST** /household | Create a Household
[**deleteHouseholdUsingDelete**](HouseholdApi.md#deleteHouseholdUsingDelete) | **DELETE** /household/{household_id} | Delete a Household
[**getHouseholdAllUsingGet**](HouseholdApi.md#getHouseholdAllUsingGet) | **GET** /household | List all household
[**getHouseholdClientAssetSizeUsingGet**](HouseholdApi.md#getHouseholdClientAssetSizeUsingGet) | **GET** /household/{household_id}/asset_size | List all household client asset sizes
[**getHouseholdClientHoldingUsingGet**](HouseholdApi.md#getHouseholdClientHoldingUsingGet) | **GET** /household/{household_id}/holding | List all household&#39;s clientIds holdings
[**getHouseholdClientTransactionUsingGet**](HouseholdApi.md#getHouseholdClientTransactionUsingGet) | **GET** /household/{household_id}/transaction | List all household&#39;s client ids transactions
[**getHouseholdUsingGet**](HouseholdApi.md#getHouseholdUsingGet) | **GET** /household/{household_id} | Retrieve a Household
[**updateHouseholdUsingPut**](HouseholdApi.md#updateHouseholdUsingPut) | **PUT** /household/{household_id} | Update a Household


# **createHouseholdUsingPost**
> \com\hydrogen\nucleus\Model\Household createHouseholdUsingPost($household)

Create a Household

Create a new household, with your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\HouseholdApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$household = new \com\hydrogen\nucleus\Model\Household(); // \com\hydrogen\nucleus\Model\Household | household

try {
    $result = $apiInstance->createHouseholdUsingPost($household);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling HouseholdApi->createHouseholdUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household** | [**\com\hydrogen\nucleus\Model\Household**](../Model/Household.md)| household |

### Return type

[**\com\hydrogen\nucleus\Model\Household**](../Model/Household.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteHouseholdUsingDelete**
> deleteHouseholdUsingDelete($household_id)

Delete a Household

Permanently delete a household

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
$apiInstance = new com\hydrogen\nucleus\Api\HouseholdApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$household_id = "household_id_example"; // string | UUID household_id

try {
    $apiInstance->deleteHouseholdUsingDelete($household_id);
} catch (Exception $e) {
    echo 'Exception when calling HouseholdApi->deleteHouseholdUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**string**](../Model/.md)| UUID household_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getHouseholdAllUsingGet**
> \com\hydrogen\nucleus\Model\PageHousehold_ getHouseholdAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all household

Get details for all Household.

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
$apiInstance = new com\hydrogen\nucleus\Api\HouseholdApi(
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
    $result = $apiInstance->getHouseholdAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling HouseholdApi->getHouseholdAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageHousehold_**](../Model/PageHousehold_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getHouseholdClientAssetSizeUsingGet**
> \com\hydrogen\nucleus\Model\AvailableDateDoubleVO[] getHouseholdClientAssetSizeUsingGet($household_id, $currency_conversion, $end_date, $exclude_subledger, $get_latest, $sort_type, $start_date)

List all household client asset sizes

Get a list of asset sizes per date for a client's household.

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
$apiInstance = new com\hydrogen\nucleus\Api\HouseholdApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$household_id = "household_id_example"; // string | UUID household_id
$currency_conversion = "currency_conversion_example"; // string | USD
$end_date = new \DateTime("null"); // \DateTime | end date
$exclude_subledger = true; // bool | true or false
$get_latest = true; // bool | true or false
$sort_type = "sort_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
$start_date = new \DateTime("null"); // \DateTime | start date

try {
    $result = $apiInstance->getHouseholdClientAssetSizeUsingGet($household_id, $currency_conversion, $end_date, $exclude_subledger, $get_latest, $sort_type, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling HouseholdApi->getHouseholdClientAssetSizeUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**string**](../Model/.md)| UUID household_id |
 **currency_conversion** | **string**| USD | [optional]
 **end_date** | **\DateTime**| end date | [optional] [default to null]
 **exclude_subledger** | **bool**| true or false | [optional]
 **get_latest** | **bool**| true or false | [optional]
 **sort_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional]
 **start_date** | **\DateTime**| start date | [optional] [default to null]

### Return type

[**\com\hydrogen\nucleus\Model\AvailableDateDoubleVO[]**](../Model/AvailableDateDoubleVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getHouseholdClientHoldingUsingGet**
> \com\hydrogen\nucleus\Model\PortfolioHoldingAgg[] getHouseholdClientHoldingUsingGet($household_id, $currency_conversion, $end_date, $get_latest, $start_date)

List all household's clientIds holdings

Get the information for all the securities that are currently being held by a household's client ids registered with your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\HouseholdApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$household_id = "household_id_example"; // string | UUID household_id
$currency_conversion = "currency_conversion_example"; // string | USD
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date - yyyy-mm-dd
$get_latest = true; // bool | true or false
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date - yyyy-mm-dd

try {
    $result = $apiInstance->getHouseholdClientHoldingUsingGet($household_id, $currency_conversion, $end_date, $get_latest, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling HouseholdApi->getHouseholdClientHoldingUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**string**](../Model/.md)| UUID household_id |
 **currency_conversion** | **string**| USD | [optional]
 **end_date** | **\DateTime**| end date - yyyy-mm-dd | [optional]
 **get_latest** | **bool**| true or false | [optional]
 **start_date** | **\DateTime**| start date - yyyy-mm-dd | [optional]

### Return type

[**\com\hydrogen\nucleus\Model\PortfolioHoldingAgg[]**](../Model/PortfolioHoldingAgg.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getHouseholdClientTransactionUsingGet**
> \com\hydrogen\nucleus\Model\PagePortfolioTransaction_ getHouseholdClientTransactionUsingGet($household_id, $ascending, $currency_conversion, $end_date, $order_by, $page, $size, $start_date)

List all household's client ids transactions

Get the information for all transactions under a household client ids registered with your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\HouseholdApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$household_id = "household_id_example"; // string | UUID household_id
$ascending = false; // bool | ascending
$currency_conversion = "currency_conversion_example"; // string | USD
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date

try {
    $result = $apiInstance->getHouseholdClientTransactionUsingGet($household_id, $ascending, $currency_conversion, $end_date, $order_by, $page, $size, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling HouseholdApi->getHouseholdClientTransactionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**string**](../Model/.md)| UUID household_id |
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

# **getHouseholdUsingGet**
> \com\hydrogen\nucleus\Model\Household getHouseholdUsingGet($household_id)

Retrieve a Household

Retrieve the information for a Household.

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
$apiInstance = new com\hydrogen\nucleus\Api\HouseholdApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$household_id = "household_id_example"; // string | UUID household_id

try {
    $result = $apiInstance->getHouseholdUsingGet($household_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling HouseholdApi->getHouseholdUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**string**](../Model/.md)| UUID household_id |

### Return type

[**\com\hydrogen\nucleus\Model\Household**](../Model/Household.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateHouseholdUsingPut**
> \com\hydrogen\nucleus\Model\Household updateHouseholdUsingPut($household, $household_id)

Update a Household

Update the information for a Household.

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
$apiInstance = new com\hydrogen\nucleus\Api\HouseholdApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$household = new \stdClass; // object | household
$household_id = "household_id_example"; // string | UUID household_id

try {
    $result = $apiInstance->updateHouseholdUsingPut($household, $household_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling HouseholdApi->updateHouseholdUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household** | **object**| household |
 **household_id** | [**string**](../Model/.md)| UUID household_id |

### Return type

[**\com\hydrogen\nucleus\Model\Household**](../Model/Household.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

