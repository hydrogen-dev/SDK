# com\hydrogen\SupportApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatUsingPost**](SupportApi.md#createChatUsingPost) | **POST** /chat | Create a Chat
[**createConsultationUsingPost**](SupportApi.md#createConsultationUsingPost) | **POST** /consultation | Create a CIO Consultation
[**createSaleUsingPost**](SupportApi.md#createSaleUsingPost) | **POST** /sales | Create a sales inquiry
[**createSupportTicketCommentUsingPost**](SupportApi.md#createSupportTicketCommentUsingPost) | **POST** /support_ticket_comment | Create a support ticket comment
[**createSupportTicketUsingPost**](SupportApi.md#createSupportTicketUsingPost) | **POST** /support_ticket | Create a support ticket
[**deleteChatUsingDelete**](SupportApi.md#deleteChatUsingDelete) | **DELETE** /chat/{chat_id} | Delete a Chat
[**deleteConsultationUsingDelete**](SupportApi.md#deleteConsultationUsingDelete) | **DELETE** /consultation/{consultation_id} | Delete a CIO Consultation
[**deleteSaleUsingDelete**](SupportApi.md#deleteSaleUsingDelete) | **DELETE** /sales/{sales_id} | Delete a sales inquiry
[**deleteSupportTicketCommentUsingDelete**](SupportApi.md#deleteSupportTicketCommentUsingDelete) | **DELETE** /support_ticket_comment/{support_ticket_comment_id} | Delete a support ticket comment
[**deleteSupportTicketUsingDelete**](SupportApi.md#deleteSupportTicketUsingDelete) | **DELETE** /support_ticket/{support_ticket_id} | Delete a support ticket
[**getChatAllUsingGet**](SupportApi.md#getChatAllUsingGet) | **GET** /chat | List all open chats
[**getChatUsingGet**](SupportApi.md#getChatUsingGet) | **GET** /chat/{chat_id} | Retrieve a Chat
[**getConsultationAllUsingGet**](SupportApi.md#getConsultationAllUsingGet) | **GET** /consultation | List all CIO Consultation
[**getConsultationUsingGet**](SupportApi.md#getConsultationUsingGet) | **GET** /consultation/{consultation_id} | Retrieve a CIO Consultation
[**getSaleAllUsingGet**](SupportApi.md#getSaleAllUsingGet) | **GET** /sales | List all sales inquiries
[**getSaleUsingGet**](SupportApi.md#getSaleUsingGet) | **GET** /sales/{sales_id} | Retrieve a sales record
[**getSupportTicketAllUsingGet**](SupportApi.md#getSupportTicketAllUsingGet) | **GET** /support_ticket | List all support tickets
[**getSupportTicketCommentAllUsingGet**](SupportApi.md#getSupportTicketCommentAllUsingGet) | **GET** /support_ticket_comment | List all support ticket comments
[**getSupportTicketCommentUsingGet**](SupportApi.md#getSupportTicketCommentUsingGet) | **GET** /support_ticket_comment/{support_ticket_comment_id} | Retrieve a support ticket comment
[**getSupportTicketUsingGet**](SupportApi.md#getSupportTicketUsingGet) | **GET** /support_ticket/{support_ticket_id} | Retrieve a support ticket
[**updateChatUsingPut**](SupportApi.md#updateChatUsingPut) | **PUT** /chat/{chat_id} | Update a Chat
[**updateConsultationUsingPut**](SupportApi.md#updateConsultationUsingPut) | **PUT** /consultation/{consultation_id} | Update a CIO Consultation
[**updateSaleUsingPut**](SupportApi.md#updateSaleUsingPut) | **PUT** /sales/{sales_id} | Update a sales inquiry
[**updateSupportTicketCommentUsingPut**](SupportApi.md#updateSupportTicketCommentUsingPut) | **PUT** /support_ticket_comment/{support_ticket_comment_id} | Update a support ticket comment
[**updateSupportTicketUsingPut**](SupportApi.md#updateSupportTicketUsingPut) | **PUT** /support_ticket/{support_ticket_id} | Update a support ticket


# **createChatUsingPost**
> \com\hydrogen\Model\ChatInfo createChatUsingPost($chat_info_request)

Create a Chat

Create a Chat

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$chat_info_request = new \com\hydrogen\Model\ChatInfo(); // \com\hydrogen\Model\ChatInfo | chatInfoRequest

try {
    $result = $apiInstance->createChatUsingPost($chat_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->createChatUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_info_request** | [**\com\hydrogen\Model\ChatInfo**](../Model/ChatInfo.md)| chatInfoRequest |

### Return type

[**\com\hydrogen\Model\ChatInfo**](../Model/ChatInfo.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createConsultationUsingPost**
> \com\hydrogen\Model\Consultation createConsultationUsingPost($cio_consultation_request)

Create a CIO Consultation

Create a new CIO Consultation

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cio_consultation_request = new \com\hydrogen\Model\Consultation(); // \com\hydrogen\Model\Consultation | cioConsultationRequest

try {
    $result = $apiInstance->createConsultationUsingPost($cio_consultation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->createConsultationUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cio_consultation_request** | [**\com\hydrogen\Model\Consultation**](../Model/Consultation.md)| cioConsultationRequest |

### Return type

[**\com\hydrogen\Model\Consultation**](../Model/Consultation.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createSaleUsingPost**
> \com\hydrogen\Model\Sale createSaleUsingPost($sale_request)

Create a sales inquiry

Create a new sales inquiry for your firm.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sale_request = new \com\hydrogen\Model\Sale(); // \com\hydrogen\Model\Sale | saleRequest

try {
    $result = $apiInstance->createSaleUsingPost($sale_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->createSaleUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sale_request** | [**\com\hydrogen\Model\Sale**](../Model/Sale.md)| saleRequest |

### Return type

[**\com\hydrogen\Model\Sale**](../Model/Sale.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createSupportTicketCommentUsingPost**
> \com\hydrogen\Model\SupportTicket createSupportTicketCommentUsingPost($support_ticker_comment_request)

Create a support ticket comment

Create a new support ticket comment for a support ticket.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$support_ticker_comment_request = new \com\hydrogen\Model\SupportTicketComment(); // \com\hydrogen\Model\SupportTicketComment | supportTickerCommentRequest

try {
    $result = $apiInstance->createSupportTicketCommentUsingPost($support_ticker_comment_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->createSupportTicketCommentUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticker_comment_request** | [**\com\hydrogen\Model\SupportTicketComment**](../Model/SupportTicketComment.md)| supportTickerCommentRequest |

### Return type

[**\com\hydrogen\Model\SupportTicket**](../Model/SupportTicket.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createSupportTicketUsingPost**
> \com\hydrogen\Model\SupportTicket createSupportTicketUsingPost($support_ticket_request)

Create a support ticket

Create a new support ticket for your firm.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$support_ticket_request = new \com\hydrogen\Model\SupportTicket(); // \com\hydrogen\Model\SupportTicket | supportTicketRequest

try {
    $result = $apiInstance->createSupportTicketUsingPost($support_ticket_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->createSupportTicketUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_request** | [**\com\hydrogen\Model\SupportTicket**](../Model/SupportTicket.md)| supportTicketRequest |

### Return type

[**\com\hydrogen\Model\SupportTicket**](../Model/SupportTicket.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteChatUsingDelete**
> deleteChatUsingDelete($chat_id)

Delete a Chat

Permanently delete a Chat

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$chat_id = "chat_id_example"; // string | UUID chat_info_id

try {
    $apiInstance->deleteChatUsingDelete($chat_id);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->deleteChatUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**string**](../Model/.md)| UUID chat_info_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteConsultationUsingDelete**
> deleteConsultationUsingDelete($consultation_id)

Delete a CIO Consultation

Permanently delete a CIO Consultation

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$consultation_id = "consultation_id_example"; // string | UUID consultation_id

try {
    $apiInstance->deleteConsultationUsingDelete($consultation_id);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->deleteConsultationUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation_id** | [**string**](../Model/.md)| UUID consultation_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteSaleUsingDelete**
> deleteSaleUsingDelete($sales_id)

Delete a sales inquiry

Permanently delete a sales inquiry.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sales_id = "sales_id_example"; // string | UUID sales_id

try {
    $apiInstance->deleteSaleUsingDelete($sales_id);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->deleteSaleUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales_id** | [**string**](../Model/.md)| UUID sales_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteSupportTicketCommentUsingDelete**
> deleteSupportTicketCommentUsingDelete($support_ticket_comment_id)

Delete a support ticket comment

Permanently delete a support ticket comment for a support ticket.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$support_ticket_comment_id = "support_ticket_comment_id_example"; // string | UUID support_ticket_comment_id

try {
    $apiInstance->deleteSupportTicketCommentUsingDelete($support_ticket_comment_id);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->deleteSupportTicketCommentUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment_id** | [**string**](../Model/.md)| UUID support_ticket_comment_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteSupportTicketUsingDelete**
> deleteSupportTicketUsingDelete($support_ticket_id)

Delete a support ticket

Permanently delete a support ticket for your firm.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$support_ticket_id = "support_ticket_id_example"; // string | UUID support_ticket_id

try {
    $apiInstance->deleteSupportTicketUsingDelete($support_ticket_id);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->deleteSupportTicketUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_id** | [**string**](../Model/.md)| UUID support_ticket_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getChatAllUsingGet**
> \com\hydrogen\Model\PageChatInfo_ getChatAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all open chats

Get details for all open chat

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
$apiInstance = new com\hydrogen\Api\SupportApi(
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
    $result = $apiInstance->getChatAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->getChatAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageChatInfo_**](../Model/PageChatInfo_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getChatUsingGet**
> \com\hydrogen\Model\ChatInfo getChatUsingGet($chat_id)

Retrieve a Chat

Retrieve the information for a Chat

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$chat_id = "chat_id_example"; // string | UUID chat_info_id

try {
    $result = $apiInstance->getChatUsingGet($chat_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->getChatUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**string**](../Model/.md)| UUID chat_info_id |

### Return type

[**\com\hydrogen\Model\ChatInfo**](../Model/ChatInfo.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getConsultationAllUsingGet**
> \com\hydrogen\Model\PageConsultation_ getConsultationAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all CIO Consultation

Get details for all CIO Consultation

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
$apiInstance = new com\hydrogen\Api\SupportApi(
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
    $result = $apiInstance->getConsultationAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->getConsultationAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageConsultation_**](../Model/PageConsultation_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getConsultationUsingGet**
> \com\hydrogen\Model\Consultation getConsultationUsingGet($consultation_id)

Retrieve a CIO Consultation

Retrieve the information for a CIO Consultation

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$consultation_id = "consultation_id_example"; // string | UUID consultation_id

try {
    $result = $apiInstance->getConsultationUsingGet($consultation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->getConsultationUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation_id** | [**string**](../Model/.md)| UUID consultation_id |

### Return type

[**\com\hydrogen\Model\Consultation**](../Model/Consultation.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSaleAllUsingGet**
> \com\hydrogen\Model\PageSale_ getSaleAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all sales inquiries

Get all sales inquiries defined for your firm.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
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
    $result = $apiInstance->getSaleAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->getSaleAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageSale_**](../Model/PageSale_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSaleUsingGet**
> \com\hydrogen\Model\Sale getSaleUsingGet($sales_id)

Retrieve a sales record

Retrieve the information for a sales record

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sales_id = "sales_id_example"; // string | UUID sales_id

try {
    $result = $apiInstance->getSaleUsingGet($sales_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->getSaleUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales_id** | [**string**](../Model/.md)| UUID sales_id |

### Return type

[**\com\hydrogen\Model\Sale**](../Model/Sale.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSupportTicketAllUsingGet**
> \com\hydrogen\Model\PageSupportTicket_ getSupportTicketAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all support tickets

Get the information for all support tickets defined for your firm.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
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
    $result = $apiInstance->getSupportTicketAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->getSupportTicketAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageSupportTicket_**](../Model/PageSupportTicket_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSupportTicketCommentAllUsingGet**
> \com\hydrogen\Model\PageSupportTicketComment_ getSupportTicketCommentAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all support ticket comments

Get the information for all support ticket comments defined for your firm.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
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
    $result = $apiInstance->getSupportTicketCommentAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->getSupportTicketCommentAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\Model\PageSupportTicketComment_**](../Model/PageSupportTicketComment_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSupportTicketCommentUsingGet**
> \com\hydrogen\Model\SupportTicketComment getSupportTicketCommentUsingGet($support_ticket_comment_id)

Retrieve a support ticket comment

Retrieve the information for a support ticket comment defined for a support ticket.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$support_ticket_comment_id = "support_ticket_comment_id_example"; // string | UUID support_ticket_comment_id

try {
    $result = $apiInstance->getSupportTicketCommentUsingGet($support_ticket_comment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->getSupportTicketCommentUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment_id** | [**string**](../Model/.md)| UUID support_ticket_comment_id |

### Return type

[**\com\hydrogen\Model\SupportTicketComment**](../Model/SupportTicketComment.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSupportTicketUsingGet**
> \com\hydrogen\Model\SupportTicket getSupportTicketUsingGet($support_ticket_id)

Retrieve a support ticket

Retrieve the information for a support ticket defined for your firm.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$support_ticket_id = "support_ticket_id_example"; // string | UUID support_ticket_id

try {
    $result = $apiInstance->getSupportTicketUsingGet($support_ticket_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->getSupportTicketUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_id** | [**string**](../Model/.md)| UUID support_ticket_id |

### Return type

[**\com\hydrogen\Model\SupportTicket**](../Model/SupportTicket.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateChatUsingPut**
> \com\hydrogen\Model\ChatInfo updateChatUsingPut($chat_id, $chat_info)

Update a Chat

Updated the information for a Chat

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$chat_id = "chat_id_example"; // string | UUID chat_id
$chat_info = new \com\hydrogen\Model\ChatInfo(); // \com\hydrogen\Model\ChatInfo | chat_info

try {
    $result = $apiInstance->updateChatUsingPut($chat_id, $chat_info);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->updateChatUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**string**](../Model/.md)| UUID chat_id |
 **chat_info** | [**\com\hydrogen\Model\ChatInfo**](../Model/ChatInfo.md)| chat_info |

### Return type

[**\com\hydrogen\Model\ChatInfo**](../Model/ChatInfo.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateConsultationUsingPut**
> \com\hydrogen\Model\Consultation updateConsultationUsingPut($consultation, $consultation_id)

Update a CIO Consultation

Updated the information CIO Consultation

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$consultation = new \com\hydrogen\Model\Consultation(); // \com\hydrogen\Model\Consultation | consultation
$consultation_id = "consultation_id_example"; // string | UUID consultation_id

try {
    $result = $apiInstance->updateConsultationUsingPut($consultation, $consultation_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->updateConsultationUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation** | [**\com\hydrogen\Model\Consultation**](../Model/Consultation.md)| consultation |
 **consultation_id** | [**string**](../Model/.md)| UUID consultation_id |

### Return type

[**\com\hydrogen\Model\Consultation**](../Model/Consultation.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateSaleUsingPut**
> \com\hydrogen\Model\Sale updateSaleUsingPut($sales, $sales_id)

Update a sales inquiry

Update the information for a sales inquiry.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$sales = new \com\hydrogen\Model\Sale(); // \com\hydrogen\Model\Sale | sales
$sales_id = "sales_id_example"; // string | UUID sales_id

try {
    $result = $apiInstance->updateSaleUsingPut($sales, $sales_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->updateSaleUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales** | [**\com\hydrogen\Model\Sale**](../Model/Sale.md)| sales |
 **sales_id** | [**string**](../Model/.md)| UUID sales_id |

### Return type

[**\com\hydrogen\Model\Sale**](../Model/Sale.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateSupportTicketCommentUsingPut**
> \com\hydrogen\Model\SupportTicketComment updateSupportTicketCommentUsingPut($support_ticket_comment, $support_ticket_comment_id)

Update a support ticket comment

Update the information for a support ticket comments defined for a support ticket.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$support_ticket_comment = new \com\hydrogen\Model\SupportTicketComment(); // \com\hydrogen\Model\SupportTicketComment | support_ticket_comment
$support_ticket_comment_id = "support_ticket_comment_id_example"; // string | UUID support_ticket_comment_id

try {
    $result = $apiInstance->updateSupportTicketCommentUsingPut($support_ticket_comment, $support_ticket_comment_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->updateSupportTicketCommentUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment** | [**\com\hydrogen\Model\SupportTicketComment**](../Model/SupportTicketComment.md)| support_ticket_comment |
 **support_ticket_comment_id** | [**string**](../Model/.md)| UUID support_ticket_comment_id |

### Return type

[**\com\hydrogen\Model\SupportTicketComment**](../Model/SupportTicketComment.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateSupportTicketUsingPut**
> \com\hydrogen\Model\SupportTicket updateSupportTicketUsingPut($support_ticket, $support_ticket_id)

Update a support ticket

Update the information for a support ticket defined for your firm.

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
$apiInstance = new com\hydrogen\Api\SupportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$support_ticket = new \com\hydrogen\Model\SupportTicket(); // \com\hydrogen\Model\SupportTicket | support_ticket
$support_ticket_id = "support_ticket_id_example"; // string | UUID support_ticket_id

try {
    $result = $apiInstance->updateSupportTicketUsingPut($support_ticket, $support_ticket_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SupportApi->updateSupportTicketUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket** | [**\com\hydrogen\Model\SupportTicket**](../Model/SupportTicket.md)| support_ticket |
 **support_ticket_id** | [**string**](../Model/.md)| UUID support_ticket_id |

### Return type

[**\com\hydrogen\Model\SupportTicket**](../Model/SupportTicket.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

