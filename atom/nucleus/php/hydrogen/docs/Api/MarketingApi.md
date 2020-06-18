# com\hydrogen\nucleus\MarketingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaignDataUsingPost**](MarketingApi.md#createCampaignDataUsingPost) | **POST** /campaign_data | Create a campaign data record
[**createCampaignPlanUsingPost**](MarketingApi.md#createCampaignPlanUsingPost) | **POST** /campaign_plan | Create a campaign plan
[**createCampaignUsingPost**](MarketingApi.md#createCampaignUsingPost) | **POST** /campaign | Create a campaign
[**createClientCampaignUsingPost**](MarketingApi.md#createClientCampaignUsingPost) | **POST** /client_campaign | Mark a client signing up through a campaign
[**deleteCampaignDataUsingDelete**](MarketingApi.md#deleteCampaignDataUsingDelete) | **DELETE** /campaign_data/{campaign_data_id} | Delete a campaign data record
[**deleteCampaignPlanUsingDelete**](MarketingApi.md#deleteCampaignPlanUsingDelete) | **DELETE** /campaign_plan/{campaign_plan_id} | Delete a campaign plan
[**deleteCampaignUsingDelete**](MarketingApi.md#deleteCampaignUsingDelete) | **DELETE** /campaign/{campaign_id} | Delete a campaign
[**deleteClientCampaignUsingDelete**](MarketingApi.md#deleteClientCampaignUsingDelete) | **DELETE** /client_campaign/{client_campaign_id} | Delete a clients/ips pair under a campaign
[**getCampaignAllUsingGet**](MarketingApi.md#getCampaignAllUsingGet) | **GET** /campaign | List all campaigns
[**getCampaignDataAllUsingGet**](MarketingApi.md#getCampaignDataAllUsingGet) | **GET** /campaign_data | List all campaign data
[**getCampaignDataUsingGet**](MarketingApi.md#getCampaignDataUsingGet) | **GET** /campaign_data/{campaign_data_id} | Retrieve a campaign data record
[**getCampaignPlanAllUsingGet**](MarketingApi.md#getCampaignPlanAllUsingGet) | **GET** /campaign_plan | List all campaign plans
[**getCampaignPlanUsingGet**](MarketingApi.md#getCampaignPlanUsingGet) | **GET** /campaign_plan/{campaign_plan_id} | Retrieve a campaign plan
[**getCampaignUsingGet**](MarketingApi.md#getCampaignUsingGet) | **GET** /campaign/{campaign_id} | Retrieve a campaign
[**getClientCampaignAllUsingGet**](MarketingApi.md#getClientCampaignAllUsingGet) | **GET** /client_campaign | List all clients/ips under a campaign
[**getClientCampaignUsingGet**](MarketingApi.md#getClientCampaignUsingGet) | **GET** /client_campaign/{client_campaign_id} | Retrieve a clients/ips pair under a campaign
[**updateCampaignDataUsingPut**](MarketingApi.md#updateCampaignDataUsingPut) | **PUT** /campaign_data/{campaign_data_id} | Update a campaign data record
[**updateCampaignPlanUsingPut**](MarketingApi.md#updateCampaignPlanUsingPut) | **PUT** /campaign_plan/{campaign_plan_id} | Update a campaign plan
[**updateCampaignUsingPut**](MarketingApi.md#updateCampaignUsingPut) | **PUT** /campaign/{campaign_id} | Update a campaign
[**updateClientCampaignUsingPut**](MarketingApi.md#updateClientCampaignUsingPut) | **PUT** /client_campaign/{client_campaign_id} | Update a clients/ips pair under a campaign


# **createCampaignDataUsingPost**
> \com\hydrogen\nucleus\Model\CampaignData createCampaignDataUsingPost($campaign_data_request)

Create a campaign data record

Create a new  campaign data record for your firm.

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_data_request = new \com\hydrogen\nucleus\Model\CampaignData(); // \com\hydrogen\nucleus\Model\CampaignData | campaignDataRequest

try {
    $result = $apiInstance->createCampaignDataUsingPost($campaign_data_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->createCampaignDataUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_request** | [**\com\hydrogen\nucleus\Model\CampaignData**](../Model/CampaignData.md)| campaignDataRequest |

### Return type

[**\com\hydrogen\nucleus\Model\CampaignData**](../Model/CampaignData.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCampaignPlanUsingPost**
> \com\hydrogen\nucleus\Model\CampaignPlan createCampaignPlanUsingPost($campaign_plan_request)

Create a campaign plan

Create a new campaign plan for your firm.

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_plan_request = new \com\hydrogen\nucleus\Model\CampaignPlan(); // \com\hydrogen\nucleus\Model\CampaignPlan | campaignPlanRequest

try {
    $result = $apiInstance->createCampaignPlanUsingPost($campaign_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->createCampaignPlanUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_request** | [**\com\hydrogen\nucleus\Model\CampaignPlan**](../Model/CampaignPlan.md)| campaignPlanRequest |

### Return type

[**\com\hydrogen\nucleus\Model\CampaignPlan**](../Model/CampaignPlan.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createCampaignUsingPost**
> \com\hydrogen\nucleus\Model\Campaign createCampaignUsingPost($campaign_request)

Create a campaign

Create a new campaign for your firm.

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_request = new \com\hydrogen\nucleus\Model\Campaign(); // \com\hydrogen\nucleus\Model\Campaign | campaignRequest

try {
    $result = $apiInstance->createCampaignUsingPost($campaign_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->createCampaignUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_request** | [**\com\hydrogen\nucleus\Model\Campaign**](../Model/Campaign.md)| campaignRequest |

### Return type

[**\com\hydrogen\nucleus\Model\Campaign**](../Model/Campaign.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createClientCampaignUsingPost**
> \com\hydrogen\nucleus\Model\ClientCampaignMapping createClientCampaignUsingPost($campaign_mapping_request)

Mark a client signing up through a campaign

We are adding a campaign association to a clientId or ip.  We create this association because we are trying to measure how affective a campaign is in directing traffic to our website.

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_mapping_request = new \com\hydrogen\nucleus\Model\ClientCampaignMapping(); // \com\hydrogen\nucleus\Model\ClientCampaignMapping | campaignMappingRequest

try {
    $result = $apiInstance->createClientCampaignUsingPost($campaign_mapping_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->createClientCampaignUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_mapping_request** | [**\com\hydrogen\nucleus\Model\ClientCampaignMapping**](../Model/ClientCampaignMapping.md)| campaignMappingRequest |

### Return type

[**\com\hydrogen\nucleus\Model\ClientCampaignMapping**](../Model/ClientCampaignMapping.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCampaignDataUsingDelete**
> deleteCampaignDataUsingDelete($campaign_data_id)

Delete a campaign data record

Permanently delete a campaign data record

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_data_id = "campaign_data_id_example"; // string | UUID campaign_data_id

try {
    $apiInstance->deleteCampaignDataUsingDelete($campaign_data_id);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->deleteCampaignDataUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_id** | [**string**](../Model/.md)| UUID campaign_data_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCampaignPlanUsingDelete**
> deleteCampaignPlanUsingDelete($campaign_plan_id)

Delete a campaign plan

Permanently delete a campaign plan

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_plan_id = "campaign_plan_id_example"; // string | UUID campaign_plan_id

try {
    $apiInstance->deleteCampaignPlanUsingDelete($campaign_plan_id);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->deleteCampaignPlanUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_id** | [**string**](../Model/.md)| UUID campaign_plan_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteCampaignUsingDelete**
> deleteCampaignUsingDelete($campaign_id)

Delete a campaign

Permanently delete a campaign

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_id = "campaign_id_example"; // string | Campaign Id

try {
    $apiInstance->deleteCampaignUsingDelete($campaign_id);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->deleteCampaignUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | [**string**](../Model/.md)| Campaign Id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteClientCampaignUsingDelete**
> deleteClientCampaignUsingDelete($client_campaign_id)

Delete a clients/ips pair under a campaign

Permanently delete a clients/ips pair under a campaign

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_campaign_id = "client_campaign_id_example"; // string | UUID client_campaign_id

try {
    $apiInstance->deleteClientCampaignUsingDelete($client_campaign_id);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->deleteClientCampaignUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**string**](../Model/.md)| UUID client_campaign_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCampaignAllUsingGet**
> \com\hydrogen\nucleus\Model\PageCampaign_ getCampaignAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all campaigns

Get details for all campaigns defined for your firm.

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
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
    $result = $apiInstance->getCampaignAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->getCampaignAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageCampaign_**](../Model/PageCampaign_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCampaignDataAllUsingGet**
> \com\hydrogen\nucleus\Model\PageCampaignData_ getCampaignDataAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all campaign data

Get details for all campaign data defined for your firm.

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
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
    $result = $apiInstance->getCampaignDataAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->getCampaignDataAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageCampaignData_**](../Model/PageCampaignData_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCampaignDataUsingGet**
> \com\hydrogen\nucleus\Model\CampaignData getCampaignDataUsingGet($campaign_data_id)

Retrieve a campaign data record

Retrieve the information for a campaign data record

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_data_id = "campaign_data_id_example"; // string | UUID campaign_data_id

try {
    $result = $apiInstance->getCampaignDataUsingGet($campaign_data_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->getCampaignDataUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_id** | [**string**](../Model/.md)| UUID campaign_data_id |

### Return type

[**\com\hydrogen\nucleus\Model\CampaignData**](../Model/CampaignData.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCampaignPlanAllUsingGet**
> \com\hydrogen\nucleus\Model\PageCampaignPlan_ getCampaignPlanAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all campaign plans

Get details for all campaign plans defined for your firm.

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
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
    $result = $apiInstance->getCampaignPlanAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->getCampaignPlanAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageCampaignPlan_**](../Model/PageCampaignPlan_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCampaignPlanUsingGet**
> \com\hydrogen\nucleus\Model\CampaignPlan getCampaignPlanUsingGet($campaign_plan_id)

Retrieve a campaign plan

Retrieve the information for a campaign plan

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_plan_id = "campaign_plan_id_example"; // string | UUID campaign_plan_id

try {
    $result = $apiInstance->getCampaignPlanUsingGet($campaign_plan_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->getCampaignPlanUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_id** | [**string**](../Model/.md)| UUID campaign_plan_id |

### Return type

[**\com\hydrogen\nucleus\Model\CampaignPlan**](../Model/CampaignPlan.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCampaignUsingGet**
> \com\hydrogen\nucleus\Model\Campaign getCampaignUsingGet($campaign_id)

Retrieve a campaign

Retrieve the information for a campaign.

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_id = "campaign_id_example"; // string | Campaign Id

try {
    $result = $apiInstance->getCampaignUsingGet($campaign_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->getCampaignUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | [**string**](../Model/.md)| Campaign Id |

### Return type

[**\com\hydrogen\nucleus\Model\Campaign**](../Model/Campaign.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getClientCampaignAllUsingGet**
> \com\hydrogen\nucleus\Model\PageClientCampaignMapping_ getClientCampaignAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all clients/ips under a campaign

Get details for all clients/ips under a campaign

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
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
    $result = $apiInstance->getClientCampaignAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->getClientCampaignAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageClientCampaignMapping_**](../Model/PageClientCampaignMapping_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getClientCampaignUsingGet**
> \com\hydrogen\nucleus\Model\ClientCampaignMapping getClientCampaignUsingGet($client_campaign_id)

Retrieve a clients/ips pair under a campaign

Retrieve the information for a clients/ips pair under a campaign

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_campaign_id = "client_campaign_id_example"; // string | UUID client_campaign_id

try {
    $result = $apiInstance->getClientCampaignUsingGet($client_campaign_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->getClientCampaignUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**string**](../Model/.md)| UUID client_campaign_id |

### Return type

[**\com\hydrogen\nucleus\Model\ClientCampaignMapping**](../Model/ClientCampaignMapping.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCampaignDataUsingPut**
> \com\hydrogen\nucleus\Model\CampaignData updateCampaignDataUsingPut($campaign_data, $campaign_data_id)

Update a campaign data record

Updated the information for a campaign data record

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_data = new \com\hydrogen\nucleus\Model\CampaignPlan(); // \com\hydrogen\nucleus\Model\CampaignPlan | campaign_data
$campaign_data_id = "campaign_data_id_example"; // string | UUID campaign_data_id

try {
    $result = $apiInstance->updateCampaignDataUsingPut($campaign_data, $campaign_data_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->updateCampaignDataUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data** | [**\com\hydrogen\nucleus\Model\CampaignPlan**](../Model/CampaignPlan.md)| campaign_data |
 **campaign_data_id** | [**string**](../Model/.md)| UUID campaign_data_id |

### Return type

[**\com\hydrogen\nucleus\Model\CampaignData**](../Model/CampaignData.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCampaignPlanUsingPut**
> \com\hydrogen\nucleus\Model\CampaignPlan updateCampaignPlanUsingPut($campaign_plan, $campaign_plan_id)

Update a campaign plan

Updated the information for a campaign plan

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign_plan = new \com\hydrogen\nucleus\Model\CampaignPlan(); // \com\hydrogen\nucleus\Model\CampaignPlan | campaign_plan
$campaign_plan_id = "campaign_plan_id_example"; // string | UUID campaign_plan_id

try {
    $result = $apiInstance->updateCampaignPlanUsingPut($campaign_plan, $campaign_plan_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->updateCampaignPlanUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan** | [**\com\hydrogen\nucleus\Model\CampaignPlan**](../Model/CampaignPlan.md)| campaign_plan |
 **campaign_plan_id** | [**string**](../Model/.md)| UUID campaign_plan_id |

### Return type

[**\com\hydrogen\nucleus\Model\CampaignPlan**](../Model/CampaignPlan.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateCampaignUsingPut**
> \com\hydrogen\nucleus\Model\Campaign updateCampaignUsingPut($campaign, $campaign_id)

Update a campaign

Updated the information for a campaign

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$campaign = new \com\hydrogen\nucleus\Model\Campaign(); // \com\hydrogen\nucleus\Model\Campaign | campaign
$campaign_id = "campaign_id_example"; // string | UUID campaign_id

try {
    $result = $apiInstance->updateCampaignUsingPut($campaign, $campaign_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->updateCampaignUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign** | [**\com\hydrogen\nucleus\Model\Campaign**](../Model/Campaign.md)| campaign |
 **campaign_id** | [**string**](../Model/.md)| UUID campaign_id |

### Return type

[**\com\hydrogen\nucleus\Model\Campaign**](../Model/Campaign.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateClientCampaignUsingPut**
> \com\hydrogen\nucleus\Model\ClientCampaignMapping updateClientCampaignUsingPut($client_campaign_id, $json_node)

Update a clients/ips pair under a campaign

Updated the information for clients/ips pair under a campaign

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
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\MarketingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_campaign_id = "client_campaign_id_example"; // string | UUID client_campaign_id
$json_node = new \com\hydrogen\nucleus\Model\JsonNode(); // \com\hydrogen\nucleus\Model\JsonNode | jsonNode

try {
    $result = $apiInstance->updateClientCampaignUsingPut($client_campaign_id, $json_node);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MarketingApi->updateClientCampaignUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**string**](../Model/.md)| UUID client_campaign_id |
 **json_node** | [**\com\hydrogen\nucleus\Model\JsonNode**](../Model/JsonNode.md)| jsonNode |

### Return type

[**\com\hydrogen\nucleus\Model\ClientCampaignMapping**](../Model/ClientCampaignMapping.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

