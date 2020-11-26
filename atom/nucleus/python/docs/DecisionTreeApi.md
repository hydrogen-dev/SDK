# nucleus_api.DecisionTreeApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_decision_tree_result_using_post**](DecisionTreeApi.md#create_decision_tree_result_using_post) | **POST** /decision_tree_result | Decision tree result
[**create_decision_tree_using_post**](DecisionTreeApi.md#create_decision_tree_using_post) | **POST** /decision_tree | Create a decision tree
[**create_node_relationship_using_post**](DecisionTreeApi.md#create_node_relationship_using_post) | **POST** /node_relationship | Create a node relationship
[**create_node_using_post**](DecisionTreeApi.md#create_node_using_post) | **POST** /node | Create a node
[**delete_decision_tree_using_delete**](DecisionTreeApi.md#delete_decision_tree_using_delete) | **DELETE** /decision_tree/{decision_tree_id} | Delete a decision tree
[**delete_node_relationship_using_delete**](DecisionTreeApi.md#delete_node_relationship_using_delete) | **DELETE** /node_relationship/{node_relationship_id} | Delete a node relationship
[**delete_node_using_delete**](DecisionTreeApi.md#delete_node_using_delete) | **DELETE** /node/{node_id} | Delete a node
[**get_decision_tree_all_using_get**](DecisionTreeApi.md#get_decision_tree_all_using_get) | **GET** /decision_tree | List all decision tree
[**get_decision_tree_using_get**](DecisionTreeApi.md#get_decision_tree_using_get) | **GET** /decision_tree/{decision_tree_id} | Retrieve a decision tree
[**get_node_all_using_get**](DecisionTreeApi.md#get_node_all_using_get) | **GET** /node | List all nodes
[**get_node_relationship_all_using_get**](DecisionTreeApi.md#get_node_relationship_all_using_get) | **GET** /node_relationship | List all node relationships
[**get_node_relationship_using_get**](DecisionTreeApi.md#get_node_relationship_using_get) | **GET** /node_relationship/{node_relationship_id} | Retrieve a node relationship
[**get_node_using_get**](DecisionTreeApi.md#get_node_using_get) | **GET** /node/{node_id} | Retrieve a node
[**update_decision_tree_using_put**](DecisionTreeApi.md#update_decision_tree_using_put) | **PUT** /decision_tree/{decision_tree_id} | Update a decision tree
[**update_node_relationship_using_put**](DecisionTreeApi.md#update_node_relationship_using_put) | **PUT** /node_relationship/{node_relationship_id} | Update a node relationship
[**update_node_using_put**](DecisionTreeApi.md#update_node_using_put) | **PUT** /node/{node_id} | Update a node


# **create_decision_tree_result_using_post**
> DecisionTreeResultVO create_decision_tree_result_using_post(decision_tree_co)

Decision tree result

Decision tree result. 

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
decision_tree_co = nucleus_api.DecisionTreeCO() # DecisionTreeCO | decisionTreeCO

try:
    # Decision tree result
    api_response = api_instance.create_decision_tree_result_using_post(decision_tree_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->create_decision_tree_result_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree_co** | [**DecisionTreeCO**](DecisionTreeCO.md)| decisionTreeCO | 

### Return type

[**DecisionTreeResultVO**](DecisionTreeResultVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_decision_tree_using_post**
> DecisionTree create_decision_tree_using_post(decision_tree)

Create a decision tree

Create a new decision tree for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
decision_tree = nucleus_api.DecisionTree() # DecisionTree | decisionTree

try:
    # Create a decision tree
    api_response = api_instance.create_decision_tree_using_post(decision_tree)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->create_decision_tree_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree** | [**DecisionTree**](DecisionTree.md)| decisionTree | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_node_relationship_using_post**
> NodeRelationship create_node_relationship_using_post(node)

Create a node relationship

Create a new node relationship for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
node = nucleus_api.NodeRelationship() # NodeRelationship | node

try:
    # Create a node relationship
    api_response = api_instance.create_node_relationship_using_post(node)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->create_node_relationship_using_post: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_node_using_post**
> Node create_node_using_post(node)

Create a node

Create a new node for your firm that can be used in a decision tree and mapped to other nodes.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
node = nucleus_api.Node() # Node | node

try:
    # Create a node
    api_response = api_instance.create_node_using_post(node)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->create_node_using_post: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_decision_tree_using_delete**
> delete_decision_tree_using_delete(decision_tree_id)

Delete a decision tree

Permanently delete a decision tree.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
decision_tree_id = 'decision_tree_id_example' # str | UUID decision_tree_id

try:
    # Delete a decision tree
    api_instance.delete_decision_tree_using_delete(decision_tree_id)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->delete_decision_tree_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree_id** | [**str**](.md)| UUID decision_tree_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_node_relationship_using_delete**
> NodeRelationship delete_node_relationship_using_delete(node_relationship_id)

Delete a node relationship

Permanently delete a node relationship.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
node_relationship_id = 'node_relationship_id_example' # str | UUID node_relationship_id

try:
    # Delete a node relationship
    api_response = api_instance.delete_node_relationship_using_delete(node_relationship_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->delete_node_relationship_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_relationship_id** | [**str**](.md)| UUID node_relationship_id | 

### Return type

[**NodeRelationship**](NodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_node_using_delete**
> DecisionTree delete_node_using_delete(node_id)

Delete a node

Permanently delete a node.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
node_id = 'node_id_example' # str | UUID node_id

try:
    # Delete a node
    api_response = api_instance.delete_node_using_delete(node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->delete_node_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_id** | [**str**](.md)| UUID node_id | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_decision_tree_all_using_get**
> PageDecisionTree get_decision_tree_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all decision tree

Get the information for all decision trees defined for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all decision tree
    api_response = api_instance.get_decision_tree_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->get_decision_tree_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageDecisionTree**](PageDecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_decision_tree_using_get**
> DecisionTree get_decision_tree_using_get(decision_tree_id)

Retrieve a decision tree

Retrieve the information for a decision tree.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
decision_tree_id = 'decision_tree_id_example' # str | UUID decision_tree_id

try:
    # Retrieve a decision tree
    api_response = api_instance.get_decision_tree_using_get(decision_tree_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->get_decision_tree_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree_id** | [**str**](.md)| UUID decision_tree_id | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node_all_using_get**
> PageNode get_node_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all nodes

List all nodes that are defined for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all nodes
    api_response = api_instance.get_node_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->get_node_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageNode**](PageNode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node_relationship_all_using_get**
> PageNodeRelationship get_node_relationship_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all node relationships

Get the information for all the node relationships defined for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all node relationships
    api_response = api_instance.get_node_relationship_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->get_node_relationship_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageNodeRelationship**](PageNodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node_relationship_using_get**
> NodeRelationship get_node_relationship_using_get(node_relationship_id)

Retrieve a node relationship

Retrieve the information for a node relationship.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
node_relationship_id = 'node_relationship_id_example' # str | UUID node_relationship_id

try:
    # Retrieve a node relationship
    api_response = api_instance.get_node_relationship_using_get(node_relationship_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->get_node_relationship_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_relationship_id** | [**str**](.md)| UUID node_relationship_id | 

### Return type

[**NodeRelationship**](NodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node_using_get**
> Node get_node_using_get(node_id)

Retrieve a node

Retrieve the information for a node.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
node_id = 'node_id_example' # str | UUID node_id

try:
    # Retrieve a node
    api_response = api_instance.get_node_using_get(node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->get_node_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_id** | [**str**](.md)| UUID node_id | 

### Return type

[**Node**](Node.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_decision_tree_using_put**
> DecisionTree update_decision_tree_using_put(decision_tree, decision_tree_id)

Update a decision tree

Updated the information for a decision tree.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
decision_tree = nucleus_api.DecisionTree() # DecisionTree | decision_tree
decision_tree_id = 'decision_tree_id_example' # str | UUID decision_tree_id

try:
    # Update a decision tree
    api_response = api_instance.update_decision_tree_using_put(decision_tree, decision_tree_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->update_decision_tree_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree** | [**DecisionTree**](DecisionTree.md)| decision_tree | 
 **decision_tree_id** | [**str**](.md)| UUID decision_tree_id | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_node_relationship_using_put**
> NodeRelationship update_node_relationship_using_put(json_node, node_relationship_id)

Update a node relationship

Update the information for a node relationship.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
json_node = nucleus_api.JsonNode() # JsonNode | jsonNode
node_relationship_id = 'node_relationship_id_example' # str | UUID node_relationship_id

try:
    # Update a node relationship
    api_response = api_instance.update_node_relationship_using_put(json_node, node_relationship_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->update_node_relationship_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_node** | [**JsonNode**](JsonNode.md)| jsonNode | 
 **node_relationship_id** | [**str**](.md)| UUID node_relationship_id | 

### Return type

[**NodeRelationship**](NodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_node_using_put**
> Node update_node_using_put(json_node, node_id)

Update a node

Updated the information for a node.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.DecisionTreeApi(nucleus_api.ApiClient(configuration))
json_node = nucleus_api.JsonNode() # JsonNode | jsonNode
node_id = 'node_id_example' # str | UUID node_id

try:
    # Update a node
    api_response = api_instance.update_node_using_put(json_node, node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DecisionTreeApi->update_node_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_node** | [**JsonNode**](JsonNode.md)| jsonNode | 
 **node_id** | [**str**](.md)| UUID node_id | 

### Return type

[**Node**](Node.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

