# com\hydrogen\integration\AuditLogApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuditLogAllUsingGet**](AuditLogApi.md#getAuditLogAllUsingGet) | **GET** /audit_log | Gel all audit log


# **getAuditLogAllUsingGet**
> \com\hydrogen\integration\Model\PageObject_ getAuditLogAllUsingGet($ascending, $end_date, $event, $integration_type, $is_request, $nucleus_client_id, $order_by, $page, $request_type, $size, $start_date, $vendor_name)

Gel all audit log

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
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\AuditLogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$end_date = new \DateTime("null"); // \DateTime | end_date
$event = "event_example"; // string | event
$integration_type = "integration_type_example"; // string | integration_type
$is_request = false; // bool | is_request
$nucleus_client_id = "nucleus_client_id_example"; // string | nucleus_client_id
$order_by = "update_date"; // string | order_by
$page = 0; // int | page
$request_type = "request_type_example"; // string | request_type
$size = 25; // int | size
$start_date = new \DateTime("null"); // \DateTime | start_date
$vendor_name = "vendor_name_example"; // string | vendor_name

try {
    $result = $apiInstance->getAuditLogAllUsingGet($ascending, $end_date, $event, $integration_type, $is_request, $nucleus_client_id, $order_by, $page, $request_type, $size, $start_date, $vendor_name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuditLogApi->getAuditLogAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **end_date** | **\DateTime**| end_date | [optional] [default to null]
 **event** | **string**| event | [optional]
 **integration_type** | **string**| integration_type | [optional]
 **is_request** | **bool**| is_request | [optional] [default to false]
 **nucleus_client_id** | [**string**](../Model/.md)| nucleus_client_id | [optional]
 **order_by** | **string**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **request_type** | **string**| request_type | [optional]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **\DateTime**| start_date | [optional] [default to null]
 **vendor_name** | **string**| vendor_name | [optional]

### Return type

[**\com\hydrogen\integration\Model\PageObject_**](../Model/PageObject_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

