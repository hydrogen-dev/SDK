# HydrogenNucleusApi.DecisionTreeApi

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


<a name="createDecisionTreeResultUsingPost"></a>
# **createDecisionTreeResultUsingPost**
> DecisionTreeResultVO createDecisionTreeResultUsingPost(decisionTreeCO)

Decision tree result

Decision tree result. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var decisionTreeCO = new HydrogenNucleusApi.DecisionTreeCO(); // DecisionTreeCO | decisionTreeCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createDecisionTreeResultUsingPost(decisionTreeCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTreeCO** | [**DecisionTreeCO**](DecisionTreeCO.md)| decisionTreeCO | 

### Return type

[**DecisionTreeResultVO**](DecisionTreeResultVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createDecisionTreeUsingPost"></a>
# **createDecisionTreeUsingPost**
> DecisionTree createDecisionTreeUsingPost(decisionTree)

Create a decision tree

Create a new decision tree for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var decisionTree = new HydrogenNucleusApi.DecisionTree(); // DecisionTree | decisionTree


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createDecisionTreeUsingPost(decisionTree, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTree** | [**DecisionTree**](DecisionTree.md)| decisionTree | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createNodeRelationshipUsingPost"></a>
# **createNodeRelationshipUsingPost**
> NodeRelationship createNodeRelationshipUsingPost(node)

Create a node relationship

Create a new node relationship for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var node = new HydrogenNucleusApi.NodeRelationship(); // NodeRelationship | node


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createNodeRelationshipUsingPost(node, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | [**NodeRelationship**](NodeRelationship.md)| node | 

### Return type

[**NodeRelationship**](NodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createNodeUsingPost"></a>
# **createNodeUsingPost**
> Node createNodeUsingPost(node)

Create a node

Create a new node for your firm that can be used in a decision tree and mapped to other nodes.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var node = new HydrogenNucleusApi.Node(); // Node | node


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createNodeUsingPost(node, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | [**Node**](Node.md)| node | 

### Return type

[**Node**](Node.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDecisionTreeUsingDelete"></a>
# **deleteDecisionTreeUsingDelete**
> deleteDecisionTreeUsingDelete(decisionTreeId)

Delete a decision tree

Permanently delete a decision tree.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var decisionTreeId = "28021071-bece-400b-a0f6-23fb13adfcd3"; // String | UUID decision_tree_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteDecisionTreeUsingDelete(decisionTreeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTreeId** | **String**| UUID decision_tree_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteNodeRelationshipUsingDelete"></a>
# **deleteNodeRelationshipUsingDelete**
> NodeRelationship deleteNodeRelationshipUsingDelete(nodeRelationshipId)

Delete a node relationship

Permanently delete a node relationship.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var nodeRelationshipId = "8397d8fd-e80d-48ea-bf79-81f32b12606e"; // String | UUID node_relationship_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteNodeRelationshipUsingDelete(nodeRelationshipId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRelationshipId** | **String**| UUID node_relationship_id | 

### Return type

[**NodeRelationship**](NodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteNodeUsingDelete"></a>
# **deleteNodeUsingDelete**
> DecisionTree deleteNodeUsingDelete(nodeId)

Delete a node

Permanently delete a node.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var nodeId = "05b9f2e6-aabc-44b5-8e02-f1ab216ebd62"; // String | UUID node_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteNodeUsingDelete(nodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| UUID node_id | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDecisionTreeAllUsingGet"></a>
# **getDecisionTreeAllUsingGet**
> PageDecisionTree getDecisionTreeAllUsingGet(opts)

List all decision tree

Get the information for all decision trees defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDecisionTreeAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageDecisionTree**](PageDecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDecisionTreeUsingGet"></a>
# **getDecisionTreeUsingGet**
> DecisionTree getDecisionTreeUsingGet(decisionTreeId)

Retrieve a decision tree

Retrieve the information for a decision tree.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var decisionTreeId = "28021071-bece-400b-a0f6-23fb13adfcd3"; // String | UUID decision_tree_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDecisionTreeUsingGet(decisionTreeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTreeId** | **String**| UUID decision_tree_id | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNodeAllUsingGet"></a>
# **getNodeAllUsingGet**
> PageNode getNodeAllUsingGet(opts)

List all nodes

List all nodes that are defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNodeAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageNode**](PageNode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNodeRelationshipAllUsingGet"></a>
# **getNodeRelationshipAllUsingGet**
> PageNodeRelationship getNodeRelationshipAllUsingGet(opts)

List all node relationships

Get the information for all the node relationships defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNodeRelationshipAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageNodeRelationship**](PageNodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNodeRelationshipUsingGet"></a>
# **getNodeRelationshipUsingGet**
> NodeRelationship getNodeRelationshipUsingGet(nodeRelationshipId)

Retrieve a node relationship

Retrieve the information for a node relationship.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var nodeRelationshipId = "8397d8fd-e80d-48ea-bf79-81f32b12606e"; // String | UUID node_relationship_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNodeRelationshipUsingGet(nodeRelationshipId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRelationshipId** | **String**| UUID node_relationship_id | 

### Return type

[**NodeRelationship**](NodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNodeUsingGet"></a>
# **getNodeUsingGet**
> Node getNodeUsingGet(nodeId)

Retrieve a node

Retrieve the information for a node.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var nodeId = "05b9f2e6-aabc-44b5-8e02-f1ab216ebd62"; // String | UUID node_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNodeUsingGet(nodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| UUID node_id | 

### Return type

[**Node**](Node.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateDecisionTreeUsingPut"></a>
# **updateDecisionTreeUsingPut**
> DecisionTree updateDecisionTreeUsingPut(decisionTree, decisionTreeId)

Update a decision tree

Updated the information for a decision tree.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var decisionTree = new HydrogenNucleusApi.DecisionTree(); // DecisionTree | decision_tree

var decisionTreeId = "28021071-bece-400b-a0f6-23fb13adfcd3"; // String | UUID decision_tree_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateDecisionTreeUsingPut(decisionTree, decisionTreeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTree** | [**DecisionTree**](DecisionTree.md)| decision_tree | 
 **decisionTreeId** | **String**| UUID decision_tree_id | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateNodeRelationshipUsingPut"></a>
# **updateNodeRelationshipUsingPut**
> NodeRelationship updateNodeRelationshipUsingPut(jsonNode, nodeRelationshipId)

Update a node relationship

Update the information for a node relationship.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var jsonNode = new HydrogenNucleusApi.JsonNode(); // JsonNode | jsonNode

var nodeRelationshipId = "8397d8fd-e80d-48ea-bf79-81f32b12606e"; // String | UUID node_relationship_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateNodeRelationshipUsingPut(jsonNode, nodeRelationshipId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonNode** | [**JsonNode**](JsonNode.md)| jsonNode | 
 **nodeRelationshipId** | **String**| UUID node_relationship_id | 

### Return type

[**NodeRelationship**](NodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateNodeUsingPut"></a>
# **updateNodeUsingPut**
> Node updateNodeUsingPut(jsonNode, nodeId)

Update a node

Updated the information for a node.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.DecisionTreeApi();

var jsonNode = new HydrogenNucleusApi.JsonNode(); // JsonNode | jsonNode

var nodeId = "28021071-bece-400b-a0f6-23fb13adfcd3"; // String | UUID node_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateNodeUsingPut(jsonNode, nodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonNode** | [**JsonNode**](JsonNode.md)| jsonNode | 
 **nodeId** | **String**| UUID node_id | 

### Return type

[**Node**](Node.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

