# com\hydrogen\GoalApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGoalTrackUsingPost**](GoalApi.md#createGoalTrackUsingPost) | **POST** /goal_track | Create a goal track record
[**createGoalUsingPost**](GoalApi.md#createGoalUsingPost) | **POST** /goal | Create a goal
[**deleteGoalTrackUsingDelete**](GoalApi.md#deleteGoalTrackUsingDelete) | **DELETE** /goal_track/{goal_track_id} | Delete a goal track record
[**deleteGoalUsingDelete**](GoalApi.md#deleteGoalUsingDelete) | **DELETE** /goal/{goal_id} | Delete a goal
[**getGoalAllUsingGet**](GoalApi.md#getGoalAllUsingGet) | **GET** /goal | List all goals
[**getGoalAssetSizeAllUsingGet**](GoalApi.md#getGoalAssetSizeAllUsingGet) | **GET** /goal/{goal_id}/asset_size | List goal asset sizes
[**getGoalHoldingAllUsingGet**](GoalApi.md#getGoalHoldingAllUsingGet) | **GET** /goal/{goal_id}/holding | List goal holdings
[**getGoalTrackAllUsingGet**](GoalApi.md#getGoalTrackAllUsingGet) | **GET** /goal_track | List all goal track records
[**getGoalTrackUsingGet**](GoalApi.md#getGoalTrackUsingGet) | **GET** /goal_track/{goal_track_id} | Retrieve a goal track record
[**getGoalTransactionAllUsingGet**](GoalApi.md#getGoalTransactionAllUsingGet) | **GET** /goal/{goal_id}/transaction | List goal transactions
[**getGoalUsingGet**](GoalApi.md#getGoalUsingGet) | **GET** /goal/{goal_id} | Retrieve a goal
[**updateGoalTrackUsingPut**](GoalApi.md#updateGoalTrackUsingPut) | **PUT** /goal_track/{goal_track_id} | Update a goal track record
[**updateGoalUsingPut**](GoalApi.md#updateGoalUsingPut) | **PUT** /goal/{goal_id} | Update a goal


# **createGoalTrackUsingPost**
> \com\hydrogen\Model\GoalTrack createGoalTrackUsingPost($goal_track)

Create a goal track record

Create a goal track record for a goal under a client.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_track = new \com\hydrogen\Model\GoalTrack(); // \com\hydrogen\Model\GoalTrack | goalTrack

try {
    $result = $apiInstance->createGoalTrackUsingPost($goal_track);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->createGoalTrackUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track** | [**\com\hydrogen\Model\GoalTrack**](../Model/GoalTrack.md)| goalTrack |

### Return type

[**\com\hydrogen\Model\GoalTrack**](../Model/GoalTrack.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createGoalUsingPost**
> \com\hydrogen\Model\Goal createGoalUsingPost($goal_request)

Create a goal

Create a new goal for your firm that clients can customize for themselves.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_request = new \com\hydrogen\Model\Goal(); // \com\hydrogen\Model\Goal | goalRequest

try {
    $result = $apiInstance->createGoalUsingPost($goal_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->createGoalUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_request** | [**\com\hydrogen\Model\Goal**](../Model/Goal.md)| goalRequest |

### Return type

[**\com\hydrogen\Model\Goal**](../Model/Goal.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteGoalTrackUsingDelete**
> deleteGoalTrackUsingDelete($goal_track_id, $goal_track_id2)

Delete a goal track record

Permanently delete an goal track record for a goal under a client.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_track_id = "goal_track_id_example"; // string | UUID goal_track_id
$goal_track_id2 = "goal_track_id_example"; // string | goal_track_id

try {
    $apiInstance->deleteGoalTrackUsingDelete($goal_track_id, $goal_track_id2);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->deleteGoalTrackUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track_id** | [**string**](../Model/.md)| UUID goal_track_id |
 **goal_track_id2** | [**string**](../Model/.md)| goal_track_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteGoalUsingDelete**
> deleteGoalUsingDelete($goal_id)

Delete a goal

Permanently delete a goal for your firm.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_id = "goal_id_example"; // string | UUID goal_id

try {
    $apiInstance->deleteGoalUsingDelete($goal_id);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->deleteGoalUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_id** | [**string**](../Model/.md)| UUID goal_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getGoalAllUsingGet**
> \com\hydrogen\Model\PageGoal_ getGoalAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all goals

Get the details for all goals defined by your firm.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
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
    $result = $apiInstance->getGoalAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->getGoalAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageGoal_**](../Model/PageGoal_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getGoalAssetSizeAllUsingGet**
> \com\hydrogen\Model\AvailableDateDoubleVO[] getGoalAssetSizeAllUsingGet($client_id, $goal_id, $end_date, $get_latest, $portfolio_goal, $sort_type, $start_date)

List goal asset sizes

Get a list of asset sizes per date for a goal for a specified client.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_id = "client_id_example"; // string | client_id
$goal_id = "goal_id_example"; // string | UUID goal_id
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | end_date
$get_latest = false; // bool | get_latest
$portfolio_goal = false; // bool | portfolio_goal
$sort_type = "sort_type_example"; // string | sort_type
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | start_date

try {
    $result = $apiInstance->getGoalAssetSizeAllUsingGet($client_id, $goal_id, $end_date, $get_latest, $portfolio_goal, $sort_type, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->getGoalAssetSizeAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**string**](../Model/.md)| client_id |
 **goal_id** | [**string**](../Model/.md)| UUID goal_id |
 **end_date** | **\DateTime**| end_date | [optional]
 **get_latest** | **bool**| get_latest | [optional] [default to false]
 **portfolio_goal** | **bool**| portfolio_goal | [optional] [default to false]
 **sort_type** | **string**| sort_type | [optional]
 **start_date** | **\DateTime**| start_date | [optional]

### Return type

[**\com\hydrogen\Model\AvailableDateDoubleVO[]**](../Model/AvailableDateDoubleVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getGoalHoldingAllUsingGet**
> \com\hydrogen\Model\PortfolioHoldingAgg[] getGoalHoldingAllUsingGet($client_id, $goal_id, $end_date, $portfolio_goal, $start_date)

List goal holdings

Get the information for all the securities that are currently being held in portfolios associated with a particular goal.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_id = "client_id_example"; // string | client_id
$goal_id = "goal_id_example"; // string | UUID goal_id
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | end_date
$portfolio_goal = false; // bool | portfolio_goal
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | start_date

try {
    $result = $apiInstance->getGoalHoldingAllUsingGet($client_id, $goal_id, $end_date, $portfolio_goal, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->getGoalHoldingAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**string**](../Model/.md)| client_id |
 **goal_id** | [**string**](../Model/.md)| UUID goal_id |
 **end_date** | **\DateTime**| end_date | [optional]
 **portfolio_goal** | **bool**| portfolio_goal | [optional] [default to false]
 **start_date** | **\DateTime**| start_date | [optional]

### Return type

[**\com\hydrogen\Model\PortfolioHoldingAgg[]**](../Model/PortfolioHoldingAgg.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getGoalTrackAllUsingGet**
> \com\hydrogen\Model\PageGoalTrack_ getGoalTrackAllUsingGet($ascending, $end_date, $filter, $get_latest, $order_by, $page, $size, $start_date)

List all goal track records

Get information for all goal track records stored for your firm.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$end_date = "end_date_example"; // string | end date
$filter = "filter_example"; // string | filter
$get_latest = true; // bool | true or false
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size
$start_date = "start_date_example"; // string | start date

try {
    $result = $apiInstance->getGoalTrackAllUsingGet($ascending, $end_date, $filter, $get_latest, $order_by, $page, $size, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->getGoalTrackAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **end_date** | **string**| end date | [optional]
 **filter** | **string**| filter | [optional]
 **get_latest** | **bool**| true or false | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **string**| start date | [optional]

### Return type

[**\com\hydrogen\Model\PageGoalTrack_**](../Model/PageGoalTrack_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getGoalTrackUsingGet**
> \com\hydrogen\Model\GoalTrack getGoalTrackUsingGet($goal_track_id, $goal_track_id2)

Retrieve a goal track record

Retrieve the information for a specific goal track record for a goal under a client.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_track_id = "goal_track_id_example"; // string | UUID goal_track_id
$goal_track_id2 = "goal_track_id_example"; // string | goal_track_id

try {
    $result = $apiInstance->getGoalTrackUsingGet($goal_track_id, $goal_track_id2);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->getGoalTrackUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track_id** | [**string**](../Model/.md)| UUID goal_track_id |
 **goal_track_id2** | [**string**](../Model/.md)| goal_track_id |

### Return type

[**\com\hydrogen\Model\GoalTrack**](../Model/GoalTrack.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getGoalTransactionAllUsingGet**
> \com\hydrogen\Model\PagePortfolioTransaction_ getGoalTransactionAllUsingGet($client_id, $goal_id, $ascending, $end_date, $order_by, $page, $portfolio_goal, $size, $start_date)

List goal transactions

Get the information for all transactions under portfolios associated with a particular goal.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_id = "client_id_example"; // string | client_id
$goal_id = "goal_id_example"; // string | UUID goal_id
$ascending = false; // bool | ascending
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | end_date
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$portfolio_goal = false; // bool | portfolio_goal
$size = 25; // int | size
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | start_date

try {
    $result = $apiInstance->getGoalTransactionAllUsingGet($client_id, $goal_id, $ascending, $end_date, $order_by, $page, $portfolio_goal, $size, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->getGoalTransactionAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**string**](../Model/.md)| client_id |
 **goal_id** | [**string**](../Model/.md)| UUID goal_id |
 **ascending** | **bool**| ascending | [optional] [default to false]
 **end_date** | **\DateTime**| end_date | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **portfolio_goal** | **bool**| portfolio_goal | [optional] [default to false]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **\DateTime**| start_date | [optional]

### Return type

[**\com\hydrogen\Model\PagePortfolioTransaction_**](../Model/PagePortfolioTransaction_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getGoalUsingGet**
> \com\hydrogen\Model\Goal getGoalUsingGet($goal_id)

Retrieve a goal

Retrieve the information for a goal defined for your firm.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_id = "goal_id_example"; // string | UUID goal_id

try {
    $result = $apiInstance->getGoalUsingGet($goal_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->getGoalUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_id** | [**string**](../Model/.md)| UUID goal_id |

### Return type

[**\com\hydrogen\Model\Goal**](../Model/Goal.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateGoalTrackUsingPut**
> \com\hydrogen\Model\GoalTrack updateGoalTrackUsingPut($goal_track, $goal_track_id)

Update a goal track record

Update the information for a goal track record.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal_track = new \com\hydrogen\Model\GoalTrack(); // \com\hydrogen\Model\GoalTrack | goal_track
$goal_track_id = "goal_track_id_example"; // string | UUID goal_track_id

try {
    $result = $apiInstance->updateGoalTrackUsingPut($goal_track, $goal_track_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->updateGoalTrackUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track** | [**\com\hydrogen\Model\GoalTrack**](../Model/GoalTrack.md)| goal_track |
 **goal_track_id** | [**string**](../Model/.md)| UUID goal_track_id |

### Return type

[**\com\hydrogen\Model\GoalTrack**](../Model/GoalTrack.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateGoalUsingPut**
> \com\hydrogen\Model\Goal updateGoalUsingPut($goal, $goal_id)

Update a goal

Update a goal defined for your firm.

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
$apiInstance = new com\hydrogen\Api\GoalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$goal = new \com\hydrogen\Model\Goal(); // \com\hydrogen\Model\Goal | goal
$goal_id = "goal_id_example"; // string | UUID goal_id

try {
    $result = $apiInstance->updateGoalUsingPut($goal, $goal_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GoalApi->updateGoalUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal** | [**\com\hydrogen\Model\Goal**](../Model/Goal.md)| goal |
 **goal_id** | [**string**](../Model/.md)| UUID goal_id |

### Return type

[**\com\hydrogen\Model\Goal**](../Model/Goal.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

