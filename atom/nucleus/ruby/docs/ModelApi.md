# AtomApi::ModelApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_model_asset_size_using_post**](ModelApi.md#create_model_asset_size_using_post) | **POST** /model_asset_size | Create a model asset size
[**create_model_change_using_post**](ModelApi.md#create_model_change_using_post) | **POST** /model/{model_id}/model_change | Change a model composition
[**create_model_comment_using_post**](ModelApi.md#create_model_comment_using_post) | **POST** /model_comment | Create a model commentary
[**create_model_holding_using_post**](ModelApi.md#create_model_holding_using_post) | **POST** /model_holding | Create a model holding
[**create_model_transaction_using_post**](ModelApi.md#create_model_transaction_using_post) | **POST** /model_transaction | Create a model transaction
[**create_model_using_post**](ModelApi.md#create_model_using_post) | **POST** /model | Create a model
[**delete_model_asset_size_using_delete**](ModelApi.md#delete_model_asset_size_using_delete) | **DELETE** /model_asset_size/{model_asset_size_id} | Delete a model asset size
[**delete_model_comment_using_delete**](ModelApi.md#delete_model_comment_using_delete) | **DELETE** /model_comment/{model_comment_id} | Delete a model commentary
[**delete_model_holding_using_delete**](ModelApi.md#delete_model_holding_using_delete) | **DELETE** /model_holding/{model_holding_id} | Delete a model holding
[**delete_model_transaction_using_delete**](ModelApi.md#delete_model_transaction_using_delete) | **DELETE** /model_transaction/{model_transaction_id} | Delete a model transaction
[**delete_model_using_delete**](ModelApi.md#delete_model_using_delete) | **DELETE** /model/{model_id} | Delete a model
[**get_model_all_using_get**](ModelApi.md#get_model_all_using_get) | **GET** /model | List all models
[**get_model_asset_size_all_using_get**](ModelApi.md#get_model_asset_size_all_using_get) | **GET** /model_asset_size | List all model asset sizes
[**get_model_asset_size_using_get**](ModelApi.md#get_model_asset_size_using_get) | **GET** /model_asset_size/{model_asset_size_id} | Retrieve a model asset size
[**get_model_comment_all_using_get**](ModelApi.md#get_model_comment_all_using_get) | **GET** /model_comment | List all model commentary
[**get_model_comment_using_get**](ModelApi.md#get_model_comment_using_get) | **GET** /model_comment/{model_comment_id} | Retrieve a model commentary
[**get_model_holding_all_using_get**](ModelApi.md#get_model_holding_all_using_get) | **GET** /model_holding | List all model holdings
[**get_model_holding_using_get**](ModelApi.md#get_model_holding_using_get) | **GET** /model_holding/{model_holding_id} | Retrieve a model holding
[**get_model_transaction_all_using_get**](ModelApi.md#get_model_transaction_all_using_get) | **GET** /model_transaction | List all model transactions
[**get_model_transaction_using_get**](ModelApi.md#get_model_transaction_using_get) | **GET** /model_transaction/{model_transaction_id} | Retrieve a model transaction
[**get_model_using_get**](ModelApi.md#get_model_using_get) | **GET** /model/{model_id} | Retrieve a model
[**update_model_asset_size_using_put**](ModelApi.md#update_model_asset_size_using_put) | **PUT** /model_asset_size/{model_asset_size_id} | Update a model asset size
[**update_model_comment_using_put**](ModelApi.md#update_model_comment_using_put) | **PUT** /model_comment/{model_comment_id} | Update a model commentary
[**update_model_holding_using_put**](ModelApi.md#update_model_holding_using_put) | **PUT** /model_holding/{model_holding_id} | Update a model holding
[**update_model_transaction_using_put**](ModelApi.md#update_model_transaction_using_put) | **PUT** /model_transaction/{model_transaction_id} | Update a model transaction
[**update_model_using_put**](ModelApi.md#update_model_using_put) | **PUT** /model/{model_id} | Update a model


# **create_model_asset_size_using_post**
> ModelAssetSize create_model_asset_size_using_post(req)

Create a model asset size

Create a new asset size record for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

req = AtomApi::ModelAssetSize.new # ModelAssetSize | req


begin
  #Create a model asset size
  result = api_instance.create_model_asset_size_using_post(req)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->create_model_asset_size_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**ModelAssetSize**](ModelAssetSize.md)| req | 

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_model_change_using_post**
> Array&lt;ModelTransaction&gt; create_model_change_using_post(change_request, model_id)

Change a model composition

Model composition changes represent a change in a model’s holdings.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

change_request = AtomApi::OrderReconcileRequest.new # OrderReconcileRequest | changeRequest

model_id = 'model_id_example' # String | UUID model_id


begin
  #Change a model composition
  result = api_instance.create_model_change_using_post(change_request, model_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->create_model_change_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **change_request** | [**OrderReconcileRequest**](OrderReconcileRequest.md)| changeRequest | 
 **model_id** | [**String**](.md)| UUID model_id | 

### Return type

[**Array&lt;ModelTransaction&gt;**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_model_comment_using_post**
> Integer create_model_comment_using_post(model_comment_request)

Create a model commentary

Create a new comment for a model available for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_comment_request = AtomApi::ModelComment.new # ModelComment | modelCommentRequest


begin
  #Create a model commentary
  result = api_instance.create_model_comment_using_post(model_comment_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->create_model_comment_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment_request** | [**ModelComment**](ModelComment.md)| modelCommentRequest | 

### Return type

**Integer**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_model_holding_using_post**
> ModelHolding create_model_holding_using_post(model_holding_request)

Create a model holding

Create a new model holding record for a specific model and date.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_holding_request = AtomApi::ModelHolding.new # ModelHolding | modelHoldingRequest


begin
  #Create a model holding
  result = api_instance.create_model_holding_using_post(model_holding_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->create_model_holding_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding_request** | [**ModelHolding**](ModelHolding.md)| modelHoldingRequest | 

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_model_transaction_using_post**
> ModelTransaction create_model_transaction_using_post(model_transaction_request)

Create a model transaction

Create a new transaction record for a security under a model for a specific date.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_transaction_request = AtomApi::ModelTransaction.new # ModelTransaction | modelTransactionRequest


begin
  #Create a model transaction
  result = api_instance.create_model_transaction_using_post(model_transaction_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->create_model_transaction_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction_request** | [**ModelTransaction**](ModelTransaction.md)| modelTransactionRequest | 

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_model_using_post**
> Model create_model_using_post(model_info_request)

Create a model

Create a new model for your firm to which a portfolios can later subscribe.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_info_request = AtomApi::Model.new # Model | modelInfoRequest


begin
  #Create a model
  result = api_instance.create_model_using_post(model_info_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->create_model_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_info_request** | [**Model**](Model.md)| modelInfoRequest | 

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_model_asset_size_using_delete**
> delete_model_asset_size_using_delete(model_asset_size_id)

Delete a model asset size

Permanently delete a model asset size record for a model. 

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_asset_size_id = 'model_asset_size_id_example' # String | UUID model_asset_size_id


begin
  #Delete a model asset size
  api_instance.delete_model_asset_size_using_delete(model_asset_size_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->delete_model_asset_size_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_asset_size_id** | [**String**](.md)| UUID model_asset_size_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_model_comment_using_delete**
> delete_model_comment_using_delete(model_comment_id)

Delete a model commentary

Permanently delete a model comment for a model

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_comment_id = 'model_comment_id_example' # String | UUID model_comment_id


begin
  #Delete a model commentary
  api_instance.delete_model_comment_using_delete(model_comment_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->delete_model_comment_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment_id** | [**String**](.md)| UUID model_comment_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_model_holding_using_delete**
> delete_model_holding_using_delete(model_holding_id)

Delete a model holding

Permanently delete a model holding record for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_holding_id = 'model_holding_id_example' # String | UUID model_holding_id


begin
  #Delete a model holding
  api_instance.delete_model_holding_using_delete(model_holding_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->delete_model_holding_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding_id** | [**String**](.md)| UUID model_holding_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_model_transaction_using_delete**
> delete_model_transaction_using_delete(model_transaction_id)

Delete a model transaction

Permanently delete a model transaction for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_transaction_id = 'model_transaction_id_example' # String | UUID model_transaction_id


begin
  #Delete a model transaction
  api_instance.delete_model_transaction_using_delete(model_transaction_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->delete_model_transaction_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction_id** | [**String**](.md)| UUID model_transaction_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_model_using_delete**
> delete_model_using_delete(model_id)

Delete a model

Permanently delete a model for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_id = 'model_id_example' # String | UUID model_id


begin
  #Delete a model
  api_instance.delete_model_using_delete(model_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->delete_model_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_id** | [**String**](.md)| UUID model_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_all_using_get**
> PageModel get_model_all_using_get(opts)

List all models

Get details for all models defined for your firm to which portfolios can subscribe.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all models
  result = api_instance.get_model_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->get_model_all_using_get: #{e}"
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

[**PageModel**](PageModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_asset_size_all_using_get**
> PageModelAssetSize get_model_asset_size_all_using_get(opts)

List all model asset sizes

Get a list of asset sizes per date for all models defined for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all model asset sizes
  result = api_instance.get_model_asset_size_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->get_model_asset_size_all_using_get: #{e}"
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

[**PageModelAssetSize**](PageModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_asset_size_using_get**
> ModelAssetSize get_model_asset_size_using_get(model_asset_size_id)

Retrieve a model asset size

Retrieve the information for a model asset size record for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_asset_size_id = 'model_asset_size_id_example' # String | UUID model_asset_size_id


begin
  #Retrieve a model asset size
  result = api_instance.get_model_asset_size_using_get(model_asset_size_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->get_model_asset_size_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_asset_size_id** | [**String**](.md)| UUID model_asset_size_id | 

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_comment_all_using_get**
> PageModelComment get_model_comment_all_using_get(opts)

List all model commentary

List all comments for all models defined by your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all model commentary
  result = api_instance.get_model_comment_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->get_model_comment_all_using_get: #{e}"
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

[**PageModelComment**](PageModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_comment_using_get**
> ModelComment get_model_comment_using_get(model_comment_id)

Retrieve a model commentary

Retrieve the information for a model comment for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_comment_id = 'model_comment_id_example' # String | UUID model_comment_id


begin
  #Retrieve a model commentary
  result = api_instance.get_model_comment_using_get(model_comment_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->get_model_comment_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment_id** | [**String**](.md)| UUID model_comment_id | 

### Return type

[**ModelComment**](ModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_holding_all_using_get**
> PageModelHolding get_model_holding_all_using_get(opts)

List all model holdings

Get all model holding records for all models defined for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all model holdings
  result = api_instance.get_model_holding_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->get_model_holding_all_using_get: #{e}"
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

[**PageModelHolding**](PageModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_holding_using_get**
> ModelHolding get_model_holding_using_get(model_holding_id)

Retrieve a model holding

Retrieve the information for a model holding record for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_holding_id = 'model_holding_id_example' # String | UUID model_holding_id


begin
  #Retrieve a model holding
  result = api_instance.get_model_holding_using_get(model_holding_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->get_model_holding_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding_id** | [**String**](.md)| UUID model_holding_id | 

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_transaction_all_using_get**
> PageModelTransaction get_model_transaction_all_using_get(opts)

List all model transactions

Get details for all transaction records for all models defined by your firm. 

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all model transactions
  result = api_instance.get_model_transaction_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->get_model_transaction_all_using_get: #{e}"
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

[**PageModelTransaction**](PageModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_transaction_using_get**
> ModelTransaction get_model_transaction_using_get(model_transaction_id)

Retrieve a model transaction

Retrieve the information for a model transaction for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_transaction_id = 'model_transaction_id_example' # String | UUID model_transaction_id


begin
  #Retrieve a model transaction
  result = api_instance.get_model_transaction_using_get(model_transaction_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->get_model_transaction_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction_id** | [**String**](.md)| UUID model_transaction_id | 

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_using_get**
> Model get_model_using_get(model_id)

Retrieve a model

Get the information for a model for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_id = 'model_id_example' # String | UUID model_id


begin
  #Retrieve a model
  result = api_instance.get_model_using_get(model_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->get_model_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_id** | [**String**](.md)| UUID model_id | 

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_model_asset_size_using_put**
> ModelAssetSize update_model_asset_size_using_put(model_asset_size, model_asset_size_id)

Update a model asset size

Update a model asset size record for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_asset_size = AtomApi::ModelAssetSize.new # ModelAssetSize | model_asset_size

model_asset_size_id = 'model_asset_size_id_example' # String | UUID model_asset_size_id


begin
  #Update a model asset size
  result = api_instance.update_model_asset_size_using_put(model_asset_size, model_asset_size_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->update_model_asset_size_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_asset_size** | [**ModelAssetSize**](ModelAssetSize.md)| model_asset_size | 
 **model_asset_size_id** | [**String**](.md)| UUID model_asset_size_id | 

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_model_comment_using_put**
> ModelComment update_model_comment_using_put(model_comment, model_comment_id)

Update a model commentary

Update a model comment for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_comment = AtomApi::ModelComment.new # ModelComment | model_comment

model_comment_id = 'model_comment_id_example' # String | UUID model_comment_id


begin
  #Update a model commentary
  result = api_instance.update_model_comment_using_put(model_comment, model_comment_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->update_model_comment_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment** | [**ModelComment**](ModelComment.md)| model_comment | 
 **model_comment_id** | [**String**](.md)| UUID model_comment_id | 

### Return type

[**ModelComment**](ModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_model_holding_using_put**
> ModelHolding update_model_holding_using_put(model_holding, model_holding_id)

Update a model holding

Update a model holding record for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_holding = AtomApi::ModelHolding.new # ModelHolding | model_holding

model_holding_id = 'model_holding_id_example' # String | UUID model_holding_id


begin
  #Update a model holding
  result = api_instance.update_model_holding_using_put(model_holding, model_holding_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->update_model_holding_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding** | [**ModelHolding**](ModelHolding.md)| model_holding | 
 **model_holding_id** | [**String**](.md)| UUID model_holding_id | 

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_model_transaction_using_put**
> ModelTransaction update_model_transaction_using_put(model_transaction, model_transaction_id)

Update a model transaction

Update a model transaction for a model.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model_transaction = AtomApi::ModelTransaction.new # ModelTransaction | model_transaction

model_transaction_id = 'model_transaction_id_example' # String | UUID model_transaction_id


begin
  #Update a model transaction
  result = api_instance.update_model_transaction_using_put(model_transaction, model_transaction_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->update_model_transaction_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction** | [**ModelTransaction**](ModelTransaction.md)| model_transaction | 
 **model_transaction_id** | [**String**](.md)| UUID model_transaction_id | 

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_model_using_put**
> Model update_model_using_put(model, model_id)

Update a model

Update a model for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ModelApi.new

model = AtomApi::Model.new # Model | model

model_id = 'model_id_example' # String | UUID model_id


begin
  #Update a model
  result = api_instance.update_model_using_put(model, model_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ModelApi->update_model_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**Model**](Model.md)| model | 
 **model_id** | [**String**](.md)| UUID model_id | 

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



