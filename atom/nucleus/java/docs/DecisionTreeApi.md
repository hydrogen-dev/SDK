# DecisionTreeApi

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
DecisionTreeCO decisionTreeCO = new DecisionTreeCO(); // DecisionTreeCO | decisionTreeCO
try {
    DecisionTreeResultVO result = apiInstance.createDecisionTreeResultUsingPost(decisionTreeCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#createDecisionTreeResultUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
DecisionTree decisionTree = new DecisionTree(); // DecisionTree | decisionTree
try {
    DecisionTree result = apiInstance.createDecisionTreeUsingPost(decisionTree);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#createDecisionTreeUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
NodeRelationship node = new NodeRelationship(); // NodeRelationship | node
try {
    NodeRelationship result = apiInstance.createNodeRelationshipUsingPost(node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#createNodeRelationshipUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
Node node = new Node(); // Node | node
try {
    Node result = apiInstance.createNodeUsingPost(node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#createNodeUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
UUID decisionTreeId = new UUID(); // UUID | UUID decision_tree_id
try {
    apiInstance.deleteDecisionTreeUsingDelete(decisionTreeId);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#deleteDecisionTreeUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTreeId** | [**UUID**](.md)| UUID decision_tree_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
UUID nodeRelationshipId = new UUID(); // UUID | UUID node_relationship_id
try {
    NodeRelationship result = apiInstance.deleteNodeRelationshipUsingDelete(nodeRelationshipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#deleteNodeRelationshipUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRelationshipId** | [**UUID**](.md)| UUID node_relationship_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
UUID nodeId = new UUID(); // UUID | UUID node_id
try {
    DecisionTree result = apiInstance.deleteNodeUsingDelete(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#deleteNodeUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | [**UUID**](.md)| UUID node_id |

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDecisionTreeAllUsingGet"></a>
# **getDecisionTreeAllUsingGet**
> PageDecisionTree getDecisionTreeAllUsingGet(ascending, filter, orderBy, page, size)

List all decision tree

Get the information for all decision trees defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageDecisionTree result = apiInstance.getDecisionTreeAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#getDecisionTreeAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
UUID decisionTreeId = new UUID(); // UUID | UUID decision_tree_id
try {
    DecisionTree result = apiInstance.getDecisionTreeUsingGet(decisionTreeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#getDecisionTreeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTreeId** | [**UUID**](.md)| UUID decision_tree_id |

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNodeAllUsingGet"></a>
# **getNodeAllUsingGet**
> PageNode getNodeAllUsingGet(ascending, filter, orderBy, page, size)

List all nodes

List all nodes that are defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageNode result = apiInstance.getNodeAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#getNodeAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageNode**](PageNode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNodeRelationshipAllUsingGet"></a>
# **getNodeRelationshipAllUsingGet**
> PageNodeRelationship getNodeRelationshipAllUsingGet(ascending, filter, orderBy, page, size)

List all node relationships

Get the information for all the node relationships defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageNodeRelationship result = apiInstance.getNodeRelationshipAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#getNodeRelationshipAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
UUID nodeRelationshipId = new UUID(); // UUID | UUID node_relationship_id
try {
    NodeRelationship result = apiInstance.getNodeRelationshipUsingGet(nodeRelationshipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#getNodeRelationshipUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRelationshipId** | [**UUID**](.md)| UUID node_relationship_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
UUID nodeId = new UUID(); // UUID | UUID node_id
try {
    Node result = apiInstance.getNodeUsingGet(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#getNodeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | [**UUID**](.md)| UUID node_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
DecisionTree decisionTree = new DecisionTree(); // DecisionTree | decision_tree
UUID decisionTreeId = new UUID(); // UUID | UUID decision_tree_id
try {
    DecisionTree result = apiInstance.updateDecisionTreeUsingPut(decisionTree, decisionTreeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#updateDecisionTreeUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTree** | [**DecisionTree**](DecisionTree.md)| decision_tree |
 **decisionTreeId** | [**UUID**](.md)| UUID decision_tree_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
JsonNode jsonNode = new JsonNode(); // JsonNode | jsonNode
UUID nodeRelationshipId = new UUID(); // UUID | UUID node_relationship_id
try {
    NodeRelationship result = apiInstance.updateNodeRelationshipUsingPut(jsonNode, nodeRelationshipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#updateNodeRelationshipUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonNode** | [**JsonNode**](JsonNode.md)| jsonNode |
 **nodeRelationshipId** | [**UUID**](.md)| UUID node_relationship_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import DecisionTreeApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


DecisionTreeApi apiInstance = new DecisionTreeApi();
JsonNode jsonNode = new JsonNode(); // JsonNode | jsonNode
UUID nodeId = new UUID(); // UUID | UUID node_id
try {
    Node result = apiInstance.updateNodeUsingPut(jsonNode, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTreeApi#updateNodeUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonNode** | [**JsonNode**](JsonNode.md)| jsonNode |
 **nodeId** | [**UUID**](.md)| UUID node_id |

### Return type

[**Node**](Node.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

