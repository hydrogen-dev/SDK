# com\hydrogen\nucleus\QuestionnaireApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAnswerUsingPost**](QuestionnaireApi.md#createAnswerUsingPost) | **POST** /answer | Create an answer
[**createClientResponseUsingPost**](QuestionnaireApi.md#createClientResponseUsingPost) | **POST** /client_response | Create a client response
[**createQuestionUsingPost**](QuestionnaireApi.md#createQuestionUsingPost) | **POST** /question | Create a question
[**createQuestionnaireUsingPost**](QuestionnaireApi.md#createQuestionnaireUsingPost) | **POST** /questionnaire | Create a questionnaire
[**deleteAnswerUsingDelete**](QuestionnaireApi.md#deleteAnswerUsingDelete) | **DELETE** /answer/{answer_id} | Delete an answer
[**deleteClientResponseUsingDelete**](QuestionnaireApi.md#deleteClientResponseUsingDelete) | **DELETE** /client_response/{client_response_id} | Delete a client response
[**deleteQuestionUsingDelete**](QuestionnaireApi.md#deleteQuestionUsingDelete) | **DELETE** /question/{question_id} | Delete a question
[**deleteQuestionnaireUsingDelete**](QuestionnaireApi.md#deleteQuestionnaireUsingDelete) | **DELETE** /questionnaire/{questionnaire_id} | Delete a questionnaire
[**getAnswerAllUsingGet**](QuestionnaireApi.md#getAnswerAllUsingGet) | **GET** /answer | List all Answers
[**getAnswerUsingGet**](QuestionnaireApi.md#getAnswerUsingGet) | **GET** /answer/{answer_id} | Retrieve an answer
[**getClientResponseAllUsingGet**](QuestionnaireApi.md#getClientResponseAllUsingGet) | **GET** /client_response | List all client responses
[**getClientResponseUsingGet**](QuestionnaireApi.md#getClientResponseUsingGet) | **GET** /client_response/{client_response_id} | Retrieve a client response
[**getQuestionAllUsingGet**](QuestionnaireApi.md#getQuestionAllUsingGet) | **GET** /question | List all Questions
[**getQuestionUsingGet**](QuestionnaireApi.md#getQuestionUsingGet) | **GET** /question/{question_id} | Retrieve a question
[**getQuestionnaireAllUsingGet**](QuestionnaireApi.md#getQuestionnaireAllUsingGet) | **GET** /questionnaire | List all questionnaires
[**getQuestionnaireUsingGet**](QuestionnaireApi.md#getQuestionnaireUsingGet) | **GET** /questionnaire/{questionnaire_id} | Retrieve a questionnaire
[**updateAnswerUsingPut**](QuestionnaireApi.md#updateAnswerUsingPut) | **PUT** /answer/{answer_id} | Update an answer
[**updateClientResponseUsingPut**](QuestionnaireApi.md#updateClientResponseUsingPut) | **PUT** /client_response/{client_response_id} | Update a client response
[**updateQuestionUsingPut**](QuestionnaireApi.md#updateQuestionUsingPut) | **PUT** /question/{question_id} | Update a question.
[**updateQuestionnaireUsingPut**](QuestionnaireApi.md#updateQuestionnaireUsingPut) | **PUT** /questionnaire/{questionnaire_id} | Update a questionnaire


# **createAnswerUsingPost**
> \com\hydrogen\nucleus\Model\Answer createAnswerUsingPost($answer)

Create an answer

Create a new answer for question.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$answer = new \com\hydrogen\nucleus\Model\Answer(); // \com\hydrogen\nucleus\Model\Answer | answer

try {
    $result = $apiInstance->createAnswerUsingPost($answer);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->createAnswerUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer** | [**\com\hydrogen\nucleus\Model\Answer**](../Model/Answer.md)| answer |

### Return type

[**\com\hydrogen\nucleus\Model\Answer**](../Model/Answer.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createClientResponseUsingPost**
> \com\hydrogen\nucleus\Model\ClientResponse createClientResponseUsingPost($client_response)

Create a client response

Create a new client response for a question as part of a questionnaires.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_response = new \com\hydrogen\nucleus\Model\ClientResponse(); // \com\hydrogen\nucleus\Model\ClientResponse | clientResponse

try {
    $result = $apiInstance->createClientResponseUsingPost($client_response);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->createClientResponseUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response** | [**\com\hydrogen\nucleus\Model\ClientResponse**](../Model/ClientResponse.md)| clientResponse |

### Return type

[**\com\hydrogen\nucleus\Model\ClientResponse**](../Model/ClientResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createQuestionUsingPost**
> \com\hydrogen\nucleus\Model\Question createQuestionUsingPost($question)

Create a question

Create a new question for questionnaire.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$question = new \com\hydrogen\nucleus\Model\Question(); // \com\hydrogen\nucleus\Model\Question | question

try {
    $result = $apiInstance->createQuestionUsingPost($question);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->createQuestionUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question** | [**\com\hydrogen\nucleus\Model\Question**](../Model/Question.md)| question |

### Return type

[**\com\hydrogen\nucleus\Model\Question**](../Model/Question.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createQuestionnaireUsingPost**
> \com\hydrogen\nucleus\Model\Questionnaire createQuestionnaireUsingPost($questionnaire)

Create a questionnaire

Create a new questionnaire for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$questionnaire = new \com\hydrogen\nucleus\Model\Questionnaire(); // \com\hydrogen\nucleus\Model\Questionnaire | questionnaire

try {
    $result = $apiInstance->createQuestionnaireUsingPost($questionnaire);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->createQuestionnaireUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire** | [**\com\hydrogen\nucleus\Model\Questionnaire**](../Model/Questionnaire.md)| questionnaire |

### Return type

[**\com\hydrogen\nucleus\Model\Questionnaire**](../Model/Questionnaire.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteAnswerUsingDelete**
> deleteAnswerUsingDelete($answer_id)

Delete an answer

Delete an answer for the question

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$answer_id = "answer_id_example"; // string | UUID answer_id

try {
    $apiInstance->deleteAnswerUsingDelete($answer_id);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->deleteAnswerUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer_id** | [**string**](../Model/.md)| UUID answer_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteClientResponseUsingDelete**
> deleteClientResponseUsingDelete($client_response_id)

Delete a client response

Permanently delete a client response for a client.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_response_id = "client_response_id_example"; // string | UUID client_response_id

try {
    $apiInstance->deleteClientResponseUsingDelete($client_response_id);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->deleteClientResponseUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response_id** | [**string**](../Model/.md)| UUID client_response_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteQuestionUsingDelete**
> deleteQuestionUsingDelete($question_id)

Delete a question

Delete an answer for the question

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$question_id = "question_id_example"; // string | UUID question_id

try {
    $apiInstance->deleteQuestionUsingDelete($question_id);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->deleteQuestionUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question_id** | [**string**](../Model/.md)| UUID question_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteQuestionnaireUsingDelete**
> deleteQuestionnaireUsingDelete($questionnaire_id)

Delete a questionnaire

Permanently delete a questionnaire for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$questionnaire_id = "questionnaire_id_example"; // string | UUID questionnaire_id

try {
    $apiInstance->deleteQuestionnaireUsingDelete($questionnaire_id);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->deleteQuestionnaireUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire_id** | [**string**](../Model/.md)| UUID questionnaire_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAnswerAllUsingGet**
> \com\hydrogen\nucleus\Model\PageAnswer_ getAnswerAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all Answers

Get information for all Answers

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "label"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getAnswerAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->getAnswerAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to label]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageAnswer_**](../Model/PageAnswer_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAnswerUsingGet**
> \com\hydrogen\nucleus\Model\Answer getAnswerUsingGet($answer_id)

Retrieve an answer

Retrieve the information for an answer for question

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$answer_id = "answer_id_example"; // string | UUID answer_id

try {
    $result = $apiInstance->getAnswerUsingGet($answer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->getAnswerUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer_id** | [**string**](../Model/.md)| UUID answer_id |

### Return type

[**\com\hydrogen\nucleus\Model\Answer**](../Model/Answer.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getClientResponseAllUsingGet**
> \com\hydrogen\nucleus\Model\PageClientResponse_ getClientResponseAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all client responses

Get all the client responses for questions as part of a questionnaire defined by your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
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
    $result = $apiInstance->getClientResponseAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->getClientResponseAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageClientResponse_**](../Model/PageClientResponse_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getClientResponseUsingGet**
> \com\hydrogen\nucleus\Model\ClientResponse getClientResponseUsingGet($client_response_id)

Retrieve a client response

Retrieve the information for a client response for a client.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_response_id = "client_response_id_example"; // string | UUID client_response_id

try {
    $result = $apiInstance->getClientResponseUsingGet($client_response_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->getClientResponseUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response_id** | [**string**](../Model/.md)| UUID client_response_id |

### Return type

[**\com\hydrogen\nucleus\Model\ClientResponse**](../Model/ClientResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getQuestionAllUsingGet**
> \com\hydrogen\nucleus\Model\PageQuestion_ getQuestionAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all Questions

Get information for all Questions

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ascending = false; // bool | ascending
$filter = "filter_example"; // string | filter
$order_by = "order_index"; // string | order_by
$page = 0; // int | page
$size = 25; // int | size

try {
    $result = $apiInstance->getQuestionAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->getQuestionAllUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **string**| filter | [optional]
 **order_by** | **string**| order_by | [optional] [default to order_index]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**\com\hydrogen\nucleus\Model\PageQuestion_**](../Model/PageQuestion_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getQuestionUsingGet**
> \com\hydrogen\nucleus\Model\Question getQuestionUsingGet($question_id)

Retrieve a question

Retrieve the information for a question for questionnaire

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$question_id = "question_id_example"; // string | UUID question_id

try {
    $result = $apiInstance->getQuestionUsingGet($question_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->getQuestionUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question_id** | [**string**](../Model/.md)| UUID question_id |

### Return type

[**\com\hydrogen\nucleus\Model\Question**](../Model/Question.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getQuestionnaireAllUsingGet**
> \com\hydrogen\nucleus\Model\PageQuestionnaire_ getQuestionnaireAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all questionnaires

Get the information for all questionnaires defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
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
    $result = $apiInstance->getQuestionnaireAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->getQuestionnaireAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageQuestionnaire_**](../Model/PageQuestionnaire_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getQuestionnaireUsingGet**
> \com\hydrogen\nucleus\Model\Questionnaire getQuestionnaireUsingGet($questionnaire_id)

Retrieve a questionnaire

Retrieve the information for a questionnaire for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$questionnaire_id = "questionnaire_id_example"; // string | UUID questionnaire_id

try {
    $result = $apiInstance->getQuestionnaireUsingGet($questionnaire_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->getQuestionnaireUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire_id** | [**string**](../Model/.md)| UUID questionnaire_id |

### Return type

[**\com\hydrogen\nucleus\Model\Questionnaire**](../Model/Questionnaire.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAnswerUsingPut**
> \com\hydrogen\nucleus\Model\Answer updateAnswerUsingPut($answer, $answer_id)

Update an answer

Update a answer for question.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$answer = new \com\hydrogen\nucleus\Model\Answer(); // \com\hydrogen\nucleus\Model\Answer | answer
$answer_id = "answer_id_example"; // string | UUID answer_id

try {
    $result = $apiInstance->updateAnswerUsingPut($answer, $answer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->updateAnswerUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer** | [**\com\hydrogen\nucleus\Model\Answer**](../Model/Answer.md)| answer |
 **answer_id** | [**string**](../Model/.md)| UUID answer_id |

### Return type

[**\com\hydrogen\nucleus\Model\Answer**](../Model/Answer.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateClientResponseUsingPut**
> \com\hydrogen\nucleus\Model\ClientResponse updateClientResponseUsingPut($client_response, $client_response_id)

Update a client response

Update a client response for a client.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_response = new \com\hydrogen\nucleus\Model\ClientResponse(); // \com\hydrogen\nucleus\Model\ClientResponse | client_response
$client_response_id = "client_response_id_example"; // string | UUID client_response_id

try {
    $result = $apiInstance->updateClientResponseUsingPut($client_response, $client_response_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->updateClientResponseUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response** | [**\com\hydrogen\nucleus\Model\ClientResponse**](../Model/ClientResponse.md)| client_response |
 **client_response_id** | [**string**](../Model/.md)| UUID client_response_id |

### Return type

[**\com\hydrogen\nucleus\Model\ClientResponse**](../Model/ClientResponse.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateQuestionUsingPut**
> \com\hydrogen\nucleus\Model\Question updateQuestionUsingPut($question, $question_id)

Update a question.

Update a question for questionnaire.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$question = new \com\hydrogen\nucleus\Model\Question(); // \com\hydrogen\nucleus\Model\Question | question
$question_id = "question_id_example"; // string | UUID question_id

try {
    $result = $apiInstance->updateQuestionUsingPut($question, $question_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->updateQuestionUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question** | [**\com\hydrogen\nucleus\Model\Question**](../Model/Question.md)| question |
 **question_id** | [**string**](../Model/.md)| UUID question_id |

### Return type

[**\com\hydrogen\nucleus\Model\Question**](../Model/Question.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateQuestionnaireUsingPut**
> \com\hydrogen\nucleus\Model\Questionnaire updateQuestionnaireUsingPut($questionnaire, $questionnaire_id)

Update a questionnaire

Update a questionnaire for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\QuestionnaireApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$questionnaire = new \com\hydrogen\nucleus\Model\Questionnaire(); // \com\hydrogen\nucleus\Model\Questionnaire | questionnaire
$questionnaire_id = "questionnaire_id_example"; // string | UUID questionnaire_id

try {
    $result = $apiInstance->updateQuestionnaireUsingPut($questionnaire, $questionnaire_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QuestionnaireApi->updateQuestionnaireUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire** | [**\com\hydrogen\nucleus\Model\Questionnaire**](../Model/Questionnaire.md)| questionnaire |
 **questionnaire_id** | [**string**](../Model/.md)| UUID questionnaire_id |

### Return type

[**\com\hydrogen\nucleus\Model\Questionnaire**](../Model/Questionnaire.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

