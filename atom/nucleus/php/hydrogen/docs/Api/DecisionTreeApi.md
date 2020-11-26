# com\hydrogen\nucleus\DecisionTreeApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDecisionTreeResultUsingPost**](DecisionTreeApi.md#createDecisionTreeResultUsingPost) | **POST** /decision_tree_result | Decision tree result
[**createDecisionTreeUsingPost**](DecisionTreeApi.md#createDecisionTreeUsingPost) | **POST** /decision_tree | Create a decision tree
[**createNodeRelationshipUsingPost**](DecisionTreeApi.md#createNodeRelationshipUsingPost) | **POST** /node_relationship | Create a node relationship
[**createNodeUsingPost**](DecisionTreeApi.md#createNodeUsingPost) | **POST** /node | Create a node
[**deleteDecisionTreeUsingDelete**](DecisionTreeApi.md#deleteDecisionTreeUsingDelete) | **DELETE** /decision_tree/{decision_tree_id} | Delete a decision tree
[**deleteNodeRelationshipUsingDelete**](DecisionTreeApi.md#deleteNodeRelationshipUsingDelete) | **DELETE** /node_relationship/{node_relationship_id} | Delete a node relationship
[**deleteNodeUsingDelete**](DecisionTreeApi.md#deleteNodeUsingDelete) | **DELETE** /node/{node_id} | Delete a node
[**getDecisionTreeAllUsingGet**](DecisionTreeApi.md#getDecisionTreeAllUsingGet) | **GET** /decision_tree | List all decision tree
[**getDecisionTreeUsingGet**](DecisionTreeApi.md#getDecisionTreeUsingGet) | **GET** /decision_tree/{decision_tree_id} | Retrieve a decision tree
[**getNodeAllUsingGet**](DecisionTreeApi.md#getNodeAllUsingGet) | **GET** /node | List all nodes
[**getNodeRelationshipAllUsingGet**](DecisionTreeApi.md#getNodeRelationshipAllUsingGet) | **GET** /node_relationship | List all node relationships
[**getNodeRelationshipUsingGet**](DecisionTreeApi.md#getNodeRelationshipUsingGet) | **GET** /node_relationship/{node_relationship_id} | Retrieve a node relationship
[**getNodeUsingGet**](DecisionTreeApi.md#getNodeUsingGet) | **GET** /node/{node_id} | Retrieve a node
[**updateDecisionTreeUsingPut**](DecisionTreeApi.md#updateDecisionTreeUsingPut) | **PUT** /decision_tree/{decision_tree_id} | Update a decision tree
[**updateNodeRelationshipUsingPut**](DecisionTreeApi.md#updateNodeRelationshipUsingPut) | **PUT** /node_relationship/{node_relationship_id} | Update a node relationship
[**updateNodeUsingPut**](DecisionTreeApi.md#updateNodeUsingPut) | **PUT** /node/{node_id} | Update a node


# **createDecisionTreeResultUsingPost**
> \com\hydrogen\nucleus\Model\DecisionTreeResultVO createDecisionTreeResultUsingPost($decision_tree_co)

Decision tree result

Decision tree result.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$decision_tree_co = new \com\hydrogen\nucleus\Model\DecisionTreeCO(); // \com\hydrogen\nucleus\Model\DecisionTreeCO | decisionTreeCO

try {
    $result = $apiInstance->createDecisionTreeResultUsingPost($decision_tree_co);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->createDecisionTreeResultUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree_co** | [**\com\hydrogen\nucleus\Model\DecisionTreeCO**](../Model/DecisionTreeCO.md)| decisionTreeCO |

### Return type

[**\com\hydrogen\nucleus\Model\DecisionTreeResultVO**](../Model/DecisionTreeResultVO.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createDecisionTreeUsingPost**
> \com\hydrogen\nucleus\Model\DecisionTree createDecisionTreeUsingPost($decision_tree)

Create a decision tree

Create a new decision tree for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$decision_tree = new \com\hydrogen\nucleus\Model\DecisionTree(); // \com\hydrogen\nucleus\Model\DecisionTree | decisionTree

try {
    $result = $apiInstance->createDecisionTreeUsingPost($decision_tree);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->createDecisionTreeUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree** | [**\com\hydrogen\nucleus\Model\DecisionTree**](../Model/DecisionTree.md)| decisionTree |

### Return type

[**\com\hydrogen\nucleus\Model\DecisionTree**](../Model/DecisionTree.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createNodeRelationshipUsingPost**
> \com\hydrogen\nucleus\Model\NodeRelationship createNodeRelationshipUsingPost($node)

Create a node relationship

Create a new node relationship for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$node = new \com\hydrogen\nucleus\Model\NodeRelationship(); // \com\hydrogen\nucleus\Model\NodeRelationship | node

try {
    $result = $apiInstance->createNodeRelationshipUsingPost($node);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->createNodeRelationshipUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | [**\com\hydrogen\nucleus\Model\NodeRelationship**](../Model/NodeRelationship.md)| node |

### Return type

[**\com\hydrogen\nucleus\Model\NodeRelationship**](../Model/NodeRelationship.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createNodeUsingPost**
> \com\hydrogen\nucleus\Model\Node createNodeUsingPost($node)

Create a node

Create a new node for your firm that can be used in a decision tree and mapped to other nodes.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$node = new \com\hydrogen\nucleus\Model\Node(); // \com\hydrogen\nucleus\Model\Node | node

try {
    $result = $apiInstance->createNodeUsingPost($node);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->createNodeUsingPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | [**\com\hydrogen\nucleus\Model\Node**](../Model/Node.md)| node |

### Return type

[**\com\hydrogen\nucleus\Model\Node**](../Model/Node.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteDecisionTreeUsingDelete**
> deleteDecisionTreeUsingDelete($decision_tree_id)

Delete a decision tree

Permanently delete a decision tree.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$decision_tree_id = "decision_tree_id_example"; // string | UUID decision_tree_id

try {
    $apiInstance->deleteDecisionTreeUsingDelete($decision_tree_id);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->deleteDecisionTreeUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree_id** | [**string**](../Model/.md)| UUID decision_tree_id |

### Return type

void (empty response body)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteNodeRelationshipUsingDelete**
> \com\hydrogen\nucleus\Model\NodeRelationship deleteNodeRelationshipUsingDelete($node_relationship_id)

Delete a node relationship

Permanently delete a node relationship.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$node_relationship_id = "node_relationship_id_example"; // string | UUID node_relationship_id

try {
    $result = $apiInstance->deleteNodeRelationshipUsingDelete($node_relationship_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->deleteNodeRelationshipUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_relationship_id** | [**string**](../Model/.md)| UUID node_relationship_id |

### Return type

[**\com\hydrogen\nucleus\Model\NodeRelationship**](../Model/NodeRelationship.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteNodeUsingDelete**
> \com\hydrogen\nucleus\Model\DecisionTree deleteNodeUsingDelete($node_id)

Delete a node

Permanently delete a node.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$node_id = "node_id_example"; // string | UUID node_id

try {
    $result = $apiInstance->deleteNodeUsingDelete($node_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->deleteNodeUsingDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_id** | [**string**](../Model/.md)| UUID node_id |

### Return type

[**\com\hydrogen\nucleus\Model\DecisionTree**](../Model/DecisionTree.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDecisionTreeAllUsingGet**
> \com\hydrogen\nucleus\Model\PageDecisionTree_ getDecisionTreeAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all decision tree

Get the information for all decision trees defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
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
    $result = $apiInstance->getDecisionTreeAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->getDecisionTreeAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageDecisionTree_**](../Model/PageDecisionTree_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDecisionTreeUsingGet**
> \com\hydrogen\nucleus\Model\DecisionTree getDecisionTreeUsingGet($decision_tree_id)

Retrieve a decision tree

Retrieve the information for a decision tree.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$decision_tree_id = "decision_tree_id_example"; // string | UUID decision_tree_id

try {
    $result = $apiInstance->getDecisionTreeUsingGet($decision_tree_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->getDecisionTreeUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree_id** | [**string**](../Model/.md)| UUID decision_tree_id |

### Return type

[**\com\hydrogen\nucleus\Model\DecisionTree**](../Model/DecisionTree.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getNodeAllUsingGet**
> \com\hydrogen\nucleus\Model\PageNode_ getNodeAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all nodes

List all nodes that are defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
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
    $result = $apiInstance->getNodeAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->getNodeAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageNode_**](../Model/PageNode_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getNodeRelationshipAllUsingGet**
> \com\hydrogen\nucleus\Model\PageNodeRelationship_ getNodeRelationshipAllUsingGet($ascending, $filter, $order_by, $page, $size)

List all node relationships

Get the information for all the node relationships defined for your firm.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
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
    $result = $apiInstance->getNodeRelationshipAllUsingGet($ascending, $filter, $order_by, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->getNodeRelationshipAllUsingGet: ', $e->getMessage(), PHP_EOL;
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

[**\com\hydrogen\nucleus\Model\PageNodeRelationship_**](../Model/PageNodeRelationship_.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getNodeRelationshipUsingGet**
> \com\hydrogen\nucleus\Model\NodeRelationship getNodeRelationshipUsingGet($node_relationship_id)

Retrieve a node relationship

Retrieve the information for a node relationship.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$node_relationship_id = "node_relationship_id_example"; // string | UUID node_relationship_id

try {
    $result = $apiInstance->getNodeRelationshipUsingGet($node_relationship_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->getNodeRelationshipUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_relationship_id** | [**string**](../Model/.md)| UUID node_relationship_id |

### Return type

[**\com\hydrogen\nucleus\Model\NodeRelationship**](../Model/NodeRelationship.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getNodeUsingGet**
> \com\hydrogen\nucleus\Model\Node getNodeUsingGet($node_id)

Retrieve a node

Retrieve the information for a node.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$node_id = "node_id_example"; // string | UUID node_id

try {
    $result = $apiInstance->getNodeUsingGet($node_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->getNodeUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_id** | [**string**](../Model/.md)| UUID node_id |

### Return type

[**\com\hydrogen\nucleus\Model\Node**](../Model/Node.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateDecisionTreeUsingPut**
> \com\hydrogen\nucleus\Model\DecisionTree updateDecisionTreeUsingPut($decision_tree, $decision_tree_id)

Update a decision tree

Updated the information for a decision tree.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$decision_tree = new \com\hydrogen\nucleus\Model\DecisionTree(); // \com\hydrogen\nucleus\Model\DecisionTree | decision_tree
$decision_tree_id = "decision_tree_id_example"; // string | UUID decision_tree_id

try {
    $result = $apiInstance->updateDecisionTreeUsingPut($decision_tree, $decision_tree_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->updateDecisionTreeUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree** | [**\com\hydrogen\nucleus\Model\DecisionTree**](../Model/DecisionTree.md)| decision_tree |
 **decision_tree_id** | [**string**](../Model/.md)| UUID decision_tree_id |

### Return type

[**\com\hydrogen\nucleus\Model\DecisionTree**](../Model/DecisionTree.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateNodeRelationshipUsingPut**
> \com\hydrogen\nucleus\Model\NodeRelationship updateNodeRelationshipUsingPut($json_node, $node_relationship_id)

Update a node relationship

Update the information for a node relationship.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$json_node = new \com\hydrogen\nucleus\Model\JsonNode(); // \com\hydrogen\nucleus\Model\JsonNode | jsonNode
$node_relationship_id = "node_relationship_id_example"; // string | UUID node_relationship_id

try {
    $result = $apiInstance->updateNodeRelationshipUsingPut($json_node, $node_relationship_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->updateNodeRelationshipUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_node** | [**\com\hydrogen\nucleus\Model\JsonNode**](../Model/JsonNode.md)| jsonNode |
 **node_relationship_id** | [**string**](../Model/.md)| UUID node_relationship_id |

### Return type

[**\com\hydrogen\nucleus\Model\NodeRelationship**](../Model/NodeRelationship.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateNodeUsingPut**
> \com\hydrogen\nucleus\Model\Node updateNodeUsingPut($json_node, $node_id)

Update a node

Updated the information for a node.

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
$apiInstance = new com\hydrogen\nucleus\Api\DecisionTreeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$json_node = new \com\hydrogen\nucleus\Model\JsonNode(); // \com\hydrogen\nucleus\Model\JsonNode | jsonNode
$node_id = "node_id_example"; // string | UUID node_id

try {
    $result = $apiInstance->updateNodeUsingPut($json_node, $node_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DecisionTreeApi->updateNodeUsingPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_node** | [**\com\hydrogen\nucleus\Model\JsonNode**](../Model/JsonNode.md)| jsonNode |
 **node_id** | [**string**](../Model/.md)| UUID node_id |

### Return type

[**\com\hydrogen\nucleus\Model\Node**](../Model/Node.md)

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

