# NucleusApi::UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_reason_code_using_post**](UtilsApi.md#create_reason_code_using_post) | **POST** /reason_code | Create a reason code
[**create_stage_using_post**](UtilsApi.md#create_stage_using_post) | **POST** /stage | Create an account stage
[**create_transaction_code_using_post**](UtilsApi.md#create_transaction_code_using_post) | **POST** /transaction_code | Create a transaction code
[**delete_reason_code_using_delete**](UtilsApi.md#delete_reason_code_using_delete) | **DELETE** /reason_code/{reason_code_id} | Delete a reason code
[**delete_stage_using_delete**](UtilsApi.md#delete_stage_using_delete) | **DELETE** /stage/{stage_id} | Delete an account stage
[**delete_transaction_code_using_delete**](UtilsApi.md#delete_transaction_code_using_delete) | **DELETE** /transaction_code/{transaction_code_id} | Delete a transaction code
[**get_reason_code_all_using_get**](UtilsApi.md#get_reason_code_all_using_get) | **GET** /reason_code | List all reason codes
[**get_reason_code_using_get**](UtilsApi.md#get_reason_code_using_get) | **GET** /reason_code/{reason_code_id} | Retrieve a reason code
[**get_stage_all_using_get**](UtilsApi.md#get_stage_all_using_get) | **GET** /stage | List all account stages
[**get_stage_using_get**](UtilsApi.md#get_stage_using_get) | **GET** /stage/{stage_id} | Retrieve an account stage
[**get_transaction_code_all_using_get**](UtilsApi.md#get_transaction_code_all_using_get) | **GET** /transaction_code | List all transaction codes
[**get_transaction_code_using_get**](UtilsApi.md#get_transaction_code_using_get) | **GET** /transaction_code/{transaction_code_id} | Retrieve a transaction code
[**update_reason_code_using_put**](UtilsApi.md#update_reason_code_using_put) | **PUT** /reason_code/{reason_code_id} | Update a reason code
[**update_stage_using_put**](UtilsApi.md#update_stage_using_put) | **PUT** /stage/{stage_id} | Update an account stage
[**update_transaction_code_using_put**](UtilsApi.md#update_transaction_code_using_put) | **PUT** /transaction_code/{transaction_code_id} | Update a transaction code


# **create_reason_code_using_post**
> ReasonCode create_reason_code_using_post(reason_code_request)

Create a reason code

Create a new reason code for your firm.

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

api_instance = NucleusApi::UtilsApi.new

reason_code_request = NucleusApi::ReasonCode.new # ReasonCode | reasonCodeRequest


begin
  #Create a reason code
  result = api_instance.create_reason_code_using_post(reason_code_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->create_reason_code_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reason_code_request** | [**ReasonCode**](ReasonCode.md)| reasonCodeRequest | 

### Return type

[**ReasonCode**](ReasonCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_stage_using_post**
> Stage create_stage_using_post(stage_request)

Create an account stage

Create a new account stage

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

api_instance = NucleusApi::UtilsApi.new

stage_request = NucleusApi::Stage.new # Stage | stageRequest


begin
  #Create an account stage
  result = api_instance.create_stage_using_post(stage_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->create_stage_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage_request** | [**Stage**](Stage.md)| stageRequest | 

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_transaction_code_using_post**
> TransactionCode create_transaction_code_using_post(transaction_request)

Create a transaction code

Create a new transaction code for your firm.

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

api_instance = NucleusApi::UtilsApi.new

transaction_request = NucleusApi::TransactionCode.new # TransactionCode | transactionRequest


begin
  #Create a transaction code
  result = api_instance.create_transaction_code_using_post(transaction_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->create_transaction_code_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_request** | [**TransactionCode**](TransactionCode.md)| transactionRequest | 

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_reason_code_using_delete**
> delete_reason_code_using_delete(reason_code_id)

Delete a reason code

Permanently delete a reason code for your firm.

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

api_instance = NucleusApi::UtilsApi.new

reason_code_id = 'reason_code_id_example' # String | UUID reason_code_id


begin
  #Delete a reason code
  api_instance.delete_reason_code_using_delete(reason_code_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->delete_reason_code_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reason_code_id** | [**String**](.md)| UUID reason_code_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_stage_using_delete**
> delete_stage_using_delete(stage_id)

Delete an account stage

Permanently delete an account stage.

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

api_instance = NucleusApi::UtilsApi.new

stage_id = 'stage_id_example' # String | UUID stage_id


begin
  #Delete an account stage
  api_instance.delete_stage_using_delete(stage_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->delete_stage_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage_id** | [**String**](.md)| UUID stage_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_transaction_code_using_delete**
> delete_transaction_code_using_delete(transaction_code_id)

Delete a transaction code

Permanently delete a transaction code for your firm.

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

api_instance = NucleusApi::UtilsApi.new

transaction_code_id = 'transaction_code_id_example' # String | UUID transaction_code_id


begin
  #Delete a transaction code
  api_instance.delete_transaction_code_using_delete(transaction_code_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->delete_transaction_code_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_code_id** | [**String**](.md)| UUID transaction_code_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_reason_code_all_using_get**
> PageReasonCode get_reason_code_all_using_get(opts)

List all reason codes

Get the information for all reason codes defined by your firm.

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

api_instance = NucleusApi::UtilsApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all reason codes
  result = api_instance.get_reason_code_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->get_reason_code_all_using_get: #{e}"
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

[**PageReasonCode**](PageReasonCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_reason_code_using_get**
> ReasonCode get_reason_code_using_get(reason_code_id)

Retrieve a reason code

Retrieve the information for a reason code defined by your firm.

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

api_instance = NucleusApi::UtilsApi.new

reason_code_id = 'reason_code_id_example' # String | UUID reason_code_id


begin
  #Retrieve a reason code
  result = api_instance.get_reason_code_using_get(reason_code_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->get_reason_code_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reason_code_id** | [**String**](.md)| UUID reason_code_id | 

### Return type

[**ReasonCode**](ReasonCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_stage_all_using_get**
> PageStage get_stage_all_using_get(opts)

List all account stages

Get the information for all possible account stages.

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

api_instance = NucleusApi::UtilsApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all account stages
  result = api_instance.get_stage_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->get_stage_all_using_get: #{e}"
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

[**PageStage**](PageStage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_stage_using_get**
> Stage get_stage_using_get(stage_id)

Retrieve an account stage

Retrieve the information for a specific account stage.

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

api_instance = NucleusApi::UtilsApi.new

stage_id = 'stage_id_example' # String | UUID stage_id


begin
  #Retrieve an account stage
  result = api_instance.get_stage_using_get(stage_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->get_stage_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage_id** | [**String**](.md)| UUID stage_id | 

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_transaction_code_all_using_get**
> PageTransactionCode get_transaction_code_all_using_get(opts)

List all transaction codes

Get the information for all transaction codes defined by your firm.

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

api_instance = NucleusApi::UtilsApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all transaction codes
  result = api_instance.get_transaction_code_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->get_transaction_code_all_using_get: #{e}"
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

[**PageTransactionCode**](PageTransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_transaction_code_using_get**
> TransactionCode get_transaction_code_using_get(transaction_code_id)

Retrieve a transaction code

Retrieve the information for a transaction code defined by your firm.

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

api_instance = NucleusApi::UtilsApi.new

transaction_code_id = 'transaction_code_id_example' # String | UUID transaction_code_id


begin
  #Retrieve a transaction code
  result = api_instance.get_transaction_code_using_get(transaction_code_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->get_transaction_code_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_code_id** | [**String**](.md)| UUID transaction_code_id | 

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_reason_code_using_put**
> ReasonCode update_reason_code_using_put(reason_code, reason_code_id)

Update a reason code

Update a reason code for your firm.

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

api_instance = NucleusApi::UtilsApi.new

reason_code = NucleusApi::ReasonCode.new # ReasonCode | reason_code

reason_code_id = 'reason_code_id_example' # String | UUID reason_code_id


begin
  #Update a reason code
  result = api_instance.update_reason_code_using_put(reason_code, reason_code_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->update_reason_code_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reason_code** | [**ReasonCode**](ReasonCode.md)| reason_code | 
 **reason_code_id** | [**String**](.md)| UUID reason_code_id | 

### Return type

[**ReasonCode**](ReasonCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_stage_using_put**
> Stage update_stage_using_put(stage, stage_id)

Update an account stage

Update the information for an account stage.

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

api_instance = NucleusApi::UtilsApi.new

stage = NucleusApi::Stage.new # Stage | stage

stage_id = 'stage_id_example' # String | UUID stage_id


begin
  #Update an account stage
  result = api_instance.update_stage_using_put(stage, stage_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->update_stage_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | [**Stage**](Stage.md)| stage | 
 **stage_id** | [**String**](.md)| UUID stage_id | 

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_transaction_code_using_put**
> TransactionCode update_transaction_code_using_put(transaction_code, transaction_code_id)

Update a transaction code

Update a transaction code for your firm.

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

api_instance = NucleusApi::UtilsApi.new

transaction_code = NucleusApi::TransactionCode.new # TransactionCode | transaction_code

transaction_code_id = 'transaction_code_id_example' # String | UUID transaction_code_id


begin
  #Update a transaction code
  result = api_instance.update_transaction_code_using_put(transaction_code, transaction_code_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling UtilsApi->update_transaction_code_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_code** | [**TransactionCode**](TransactionCode.md)| transaction_code | 
 **transaction_code_id** | [**String**](.md)| UUID transaction_code_id | 

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



