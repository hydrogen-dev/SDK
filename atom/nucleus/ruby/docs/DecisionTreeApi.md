# NucleusApi::DecisionTreeApi

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
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

decision_tree_co = NucleusApi::DecisionTreeCO.new # DecisionTreeCO | decisionTreeCO


begin
  #Decision tree result
  result = api_instance.create_decision_tree_result_using_post(decision_tree_co)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->create_decision_tree_result_using_post: #{e}"
end
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



# **create_decision_tree_using_post**
> DecisionTree create_decision_tree_using_post(decision_tree)

Create a decision tree

Create a new decision tree for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

decision_tree = NucleusApi::DecisionTree.new # DecisionTree | decisionTree


begin
  #Create a decision tree
  result = api_instance.create_decision_tree_using_post(decision_tree)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->create_decision_tree_using_post: #{e}"
end
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



# **create_node_relationship_using_post**
> NodeRelationship create_node_relationship_using_post(node)

Create a node relationship

Create a new node relationship for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

node = NucleusApi::NodeRelationship.new # NodeRelationship | node


begin
  #Create a node relationship
  result = api_instance.create_node_relationship_using_post(node)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->create_node_relationship_using_post: #{e}"
end
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



# **create_node_using_post**
> Node create_node_using_post(node)

Create a node

Create a new node for your firm that can be used in a decision tree and mapped to other nodes.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

node = NucleusApi::Node.new # Node | node


begin
  #Create a node
  result = api_instance.create_node_using_post(node)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->create_node_using_post: #{e}"
end
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



# **delete_decision_tree_using_delete**
> delete_decision_tree_using_delete(decision_tree_id)

Delete a decision tree

Permanently delete a decision tree.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

decision_tree_id = 'decision_tree_id_example' # String | UUID decision_tree_id


begin
  #Delete a decision tree
  api_instance.delete_decision_tree_using_delete(decision_tree_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->delete_decision_tree_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree_id** | [**String**](.md)| UUID decision_tree_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_node_relationship_using_delete**
> NodeRelationship delete_node_relationship_using_delete(node_relationship_id)

Delete a node relationship

Permanently delete a node relationship.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

node_relationship_id = 'node_relationship_id_example' # String | UUID node_relationship_id


begin
  #Delete a node relationship
  result = api_instance.delete_node_relationship_using_delete(node_relationship_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->delete_node_relationship_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_relationship_id** | [**String**](.md)| UUID node_relationship_id | 

### Return type

[**NodeRelationship**](NodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_node_using_delete**
> DecisionTree delete_node_using_delete(node_id)

Delete a node

Permanently delete a node.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

node_id = 'node_id_example' # String | UUID node_id


begin
  #Delete a node
  result = api_instance.delete_node_using_delete(node_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->delete_node_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_id** | [**String**](.md)| UUID node_id | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_decision_tree_all_using_get**
> PageDecisionTree get_decision_tree_all_using_get(opts)

List all decision tree

Get the information for all decision trees defined for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all decision tree
  result = api_instance.get_decision_tree_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->get_decision_tree_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageDecisionTree**](PageDecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_decision_tree_using_get**
> DecisionTree get_decision_tree_using_get(decision_tree_id)

Retrieve a decision tree

Retrieve the information for a decision tree.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

decision_tree_id = 'decision_tree_id_example' # String | UUID decision_tree_id


begin
  #Retrieve a decision tree
  result = api_instance.get_decision_tree_using_get(decision_tree_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->get_decision_tree_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree_id** | [**String**](.md)| UUID decision_tree_id | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_node_all_using_get**
> PageNode get_node_all_using_get(opts)

List all nodes

List all nodes that are defined for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all nodes
  result = api_instance.get_node_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->get_node_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageNode**](PageNode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_node_relationship_all_using_get**
> PageNodeRelationship get_node_relationship_all_using_get(opts)

List all node relationships

Get the information for all the node relationships defined for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all node relationships
  result = api_instance.get_node_relationship_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->get_node_relationship_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageNodeRelationship**](PageNodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_node_relationship_using_get**
> NodeRelationship get_node_relationship_using_get(node_relationship_id)

Retrieve a node relationship

Retrieve the information for a node relationship.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

node_relationship_id = 'node_relationship_id_example' # String | UUID node_relationship_id


begin
  #Retrieve a node relationship
  result = api_instance.get_node_relationship_using_get(node_relationship_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->get_node_relationship_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_relationship_id** | [**String**](.md)| UUID node_relationship_id | 

### Return type

[**NodeRelationship**](NodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_node_using_get**
> Node get_node_using_get(node_id)

Retrieve a node

Retrieve the information for a node.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

node_id = 'node_id_example' # String | UUID node_id


begin
  #Retrieve a node
  result = api_instance.get_node_using_get(node_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->get_node_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node_id** | [**String**](.md)| UUID node_id | 

### Return type

[**Node**](Node.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_decision_tree_using_put**
> DecisionTree update_decision_tree_using_put(decision_tree, decision_tree_id)

Update a decision tree

Updated the information for a decision tree.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

decision_tree = nil # Object | decision_tree

decision_tree_id = 'decision_tree_id_example' # String | UUID decision_tree_id


begin
  #Update a decision tree
  result = api_instance.update_decision_tree_using_put(decision_tree, decision_tree_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->update_decision_tree_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decision_tree** | **Object**| decision_tree | 
 **decision_tree_id** | [**String**](.md)| UUID decision_tree_id | 

### Return type

[**DecisionTree**](DecisionTree.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_node_relationship_using_put**
> NodeRelationship update_node_relationship_using_put(json_node, node_relationship_id)

Update a node relationship

Update the information for a node relationship.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

json_node = nil # Object | jsonNode

node_relationship_id = 'node_relationship_id_example' # String | UUID node_relationship_id


begin
  #Update a node relationship
  result = api_instance.update_node_relationship_using_put(json_node, node_relationship_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->update_node_relationship_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_node** | **Object**| jsonNode | 
 **node_relationship_id** | [**String**](.md)| UUID node_relationship_id | 

### Return type

[**NodeRelationship**](NodeRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_node_using_put**
> Node update_node_using_put(json_node, node_id)

Update a node

Updated the information for a node.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::DecisionTreeApi.new

json_node = nil # Object | jsonNode

node_id = 'node_id_example' # String | UUID node_id


begin
  #Update a node
  result = api_instance.update_node_using_put(json_node, node_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DecisionTreeApi->update_node_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_node** | **Object**| jsonNode | 
 **node_id** | [**String**](.md)| UUID node_id | 

### Return type

[**Node**](Node.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



