# com\hydrogen\nucleus\CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCardProgramUsingPost**](CardApi.md#createCardProgramUsingPost) | **POST** /card_program | Create a cardProgram request
[**createCardUsingPost**](CardApi.md#createCardUsingPost) | **POST** /card | Create a card request
[**deleteCardProgramUsingDelete**](CardApi.md#deleteCardProgramUsingDelete) | **DELETE** /card_program/{card_program_id} | Delete an cardProgram
[**deleteCardUsingDelete**](CardApi.md#deleteCardUsingDelete) | **DELETE** /card/{card_id} | Delete a card request
[**getCardAllUsingGet**](CardApi.md#getCardAllUsingGet) | **GET** /card | List all card requests
[**getCardAssetSizeAggAllUsingGet**](CardApi.md#getCardAssetSizeAggAllUsingGet) | **GET** /card/{card_id}/asset_size | List all card asset sizes
[**getCardProgramAllUsingGet**](CardApi.md#getCardProgramAllUsingGet) | **GET** /card_program | List all cardProgram
[**getCardProgramUsingGet**](CardApi.md#getCardProgramUsingGet) | **GET** /card_program/{card_program_id} | Retrieve an cardProgram
[**getCardTransactionAggAllUsingGet**](CardApi.md#getCardTransactionAggAllUsingGet) | **GET** /card/{card_id}/transaction | List all card transactions
[**getCardUsingGet**](CardApi.md#getCardUsingGet) | **GET** /card/{card_id} | Retrieve a card request
[**updateCardProgramUsingPut**](CardApi.md#updateCardProgramUsingPut) | **PUT** /card_program/{card_program_id} | Update an cardProgram
[**updateCardUsingPut**](CardApi.md#updateCardUsingPut) | **PUT** /card/{card_id} | Update a card request


# **createCardProgramUsingPost**
> \com\hydrogen\nucleus\Model\CardProgram createCardProgramUsingPost($card_program_request)

Create a cardProgram request

Create a new cardProgram request.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_program_request = new \com\hydrogen\nucleus\Model\CardProgram(); // \com\hydrogen\nucleus\Model\CardProgram | cardProgramRequest

try {
    $result = $apiInstance->createCardProgramUsingPost($card_program_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardProgramUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_program_request** | [**\com\hydrogen\nucleus\Model\CardProgram**](../Model/CardProgram.md)| cardProgramRequest |

### Return type

[**\com\hydrogen\nucleus\Model\CardProgram**](../Model/CardProgram.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCardUsingPost**
> \com\hydrogen\nucleus\Model\Card createCardUsingPost($card_request)

Create a card request

Create a new card request.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_request = new \com\hydrogen\nucleus\Model\Card(); // \com\hydrogen\nucleus\Model\Card | cardRequest

try {
    $result = $apiInstance->createCardUsingPost($card_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->createCardUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_request** | [**\com\hydrogen\nucleus\Model\Card**](../Model/Card.md)| cardRequest |

### Return type

[**\com\hydrogen\nucleus\Model\Card**](../Model/Card.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCardProgramUsingDelete**
> deleteCardProgramUsingDelete($card_program_id)

Delete an cardProgram

Permanently delete an cardProgram.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_program_id = "card_program_id_example"; // string | UUID card_program_id

try {
    $apiInstance->deleteCardProgramUsingDelete($card_program_id);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->deleteCardProgramUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_program_id** | [**string**](../Model/.md)| UUID card_program_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCardUsingDelete**
> deleteCardUsingDelete($card_id)

Delete a card request

Permanently delete a card request.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_id = "card_id_example"; // string | UUID card_id

try {
    $apiInstance->deleteCardUsingDelete($card_id);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->deleteCardUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**string**](../Model/.md)| UUID card_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardAllUsingGet**
> \com\hydrogen\nucleus\Model\PageCard_ getCardAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all card requests

Get the information for all card requests.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
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
    $result = $apiInstance->getCardAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageCard_**](../Model/PageCard_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardAssetSizeAggAllUsingGet**
> object[] getCardAssetSizeAggAllUsingGet($card_id, $currency_conversion, $end_date, $get_latest, $sort_type, $start_date)

List all card asset sizes

Get a list of asset sizes by date for an card.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_id = "card_id_example"; // string | Card Id
$currency_conversion = "currency_conversion_example"; // string | USD
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$get_latest = true; // bool | true or false
$sort_type = "sort_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date

try {
    $result = $apiInstance->getCardAssetSizeAggAllUsingGet($card_id, $currency_conversion, $end_date, $get_latest, $sort_type, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardAssetSizeAggAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**string**](../Model/.md)| Card Id |
 **currency_conversion** | **string**| USD | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **get_latest** | **bool**| true or false | [optional]
 **sort_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional]
 **start_date** | **\DateTime**| start date | [optional]

### Return type

**object[]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardProgramAllUsingGet**
> \com\hydrogen\nucleus\Model\PageCardProgram_ getCardProgramAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all cardProgram

Get information for all cardProgram.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
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
    $result = $apiInstance->getCardProgramAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardProgramAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageCardProgram_**](../Model/PageCardProgram_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardProgramUsingGet**
> \com\hydrogen\nucleus\Model\CardProgram getCardProgramUsingGet($card_program_id)

Retrieve an cardProgram

Retrieve the information for a specific cardProgram.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_program_id = "card_program_id_example"; // string | UUID card_program_id

try {
    $result = $apiInstance->getCardProgramUsingGet($card_program_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardProgramUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_program_id** | [**string**](../Model/.md)| UUID card_program_id |

### Return type

[**\com\hydrogen\nucleus\Model\CardProgram**](../Model/CardProgram.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCardTransactionAggAllUsingGet**
> \com\hydrogen\nucleus\Model\PagePortfolioTransaction_ getCardTransactionAggAllUsingGet($card_id, $ascending, $currency_conversion, $end_date, $order_by, $page, $size, $start_date)

List all card transactions

Get the information for all transactions for an card.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_id = "card_id_example"; // string | UUID card_id
$ascending = false; // bool | ascending
$currency_conversion = "currency_conversion_example"; // string | USD
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date

try {
    $result = $apiInstance->getCardTransactionAggAllUsingGet($card_id, $ascending, $currency_conversion, $end_date, $order_by, $page, $size, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardTransactionAggAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**string**](../Model/.md)| UUID card_id |
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

# **getCardUsingGet**
> \com\hydrogen\nucleus\Model\Card getCardUsingGet($card_id)

Retrieve a card request

Retrieve the information for a card request.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_id = "card_id_example"; // string | UUID card_id

try {
    $result = $apiInstance->getCardUsingGet($card_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->getCardUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**string**](../Model/.md)| UUID card_id |

### Return type

[**\com\hydrogen\nucleus\Model\Card**](../Model/Card.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCardProgramUsingPut**
> \com\hydrogen\nucleus\Model\CardProgram updateCardProgramUsingPut($card_program, $card_program_id)

Update an cardProgram

Update the information for an cardProgram.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card_program = new \com\hydrogen\nucleus\Model\CardProgram(); // \com\hydrogen\nucleus\Model\CardProgram | card_program
$card_program_id = "card_program_id_example"; // string | UUID card_program_id

try {
    $result = $apiInstance->updateCardProgramUsingPut($card_program, $card_program_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->updateCardProgramUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_program** | [**\com\hydrogen\nucleus\Model\CardProgram**](../Model/CardProgram.md)| card_program |
 **card_program_id** | [**string**](../Model/.md)| UUID card_program_id |

### Return type

[**\com\hydrogen\nucleus\Model\CardProgram**](../Model/CardProgram.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCardUsingPut**
> \com\hydrogen\nucleus\Model\Card updateCardUsingPut($card, $card_id)

Update a card request

Update the information for a card request.

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
$apiInstance = new com\hydrogen\nucleus\Api\CardApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$card = new \com\hydrogen\nucleus\Model\Card(); // \com\hydrogen\nucleus\Model\Card | card
$card_id = "card_id_example"; // string | UUID card_id

try {
    $result = $apiInstance->updateCardUsingPut($card, $card_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CardApi->updateCardUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card** | [**\com\hydrogen\nucleus\Model\Card**](../Model/Card.md)| card |
 **card_id** | [**string**](../Model/.md)| UUID card_id |

### Return type

[**\com\hydrogen\nucleus\Model\Card**](../Model/Card.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

