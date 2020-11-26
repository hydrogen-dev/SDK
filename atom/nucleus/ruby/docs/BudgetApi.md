# NucleusApi::BudgetApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_budget_using_post**](BudgetApi.md#create_budget_using_post) | **POST** /budget | Create a budget request
[**delete_budget_using_delete**](BudgetApi.md#delete_budget_using_delete) | **DELETE** /budget/{budget_id} | Delete a budget request
[**get_budget_all_using_get**](BudgetApi.md#get_budget_all_using_get) | **GET** /budget | List all budget requests
[**get_budget_using_get**](BudgetApi.md#get_budget_using_get) | **GET** /budget/{budget_id} | Retrieve a budget request
[**update_budget_using_put**](BudgetApi.md#update_budget_using_put) | **PUT** /budget/{budget_id} | Update a budget request


# **create_budget_using_post**
> Budget create_budget_using_post(budget_request)

Create a budget request

Create a new budget request.

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

api_instance = NucleusApi::BudgetApi.new

budget_request = NucleusApi::Budget.new # Budget | budgetRequest


begin
  #Create a budget request
  result = api_instance.create_budget_using_post(budget_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BudgetApi->create_budget_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget_request** | [**Budget**](Budget.md)| budgetRequest | 

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_budget_using_delete**
> delete_budget_using_delete(budget_id)

Delete a budget request

Permanently delete a budget request.

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

api_instance = NucleusApi::BudgetApi.new

budget_id = 'budget_id_example' # String | UUID budget_id


begin
  #Delete a budget request
  api_instance.delete_budget_using_delete(budget_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling BudgetApi->delete_budget_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget_id** | [**String**](.md)| UUID budget_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_budget_all_using_get**
> PageBudget get_budget_all_using_get(opts)

List all budget requests

Get the information for all budget requests.

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

api_instance = NucleusApi::BudgetApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  currency_conversion: 'currency_conversion_example', # String | currency_conversion
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all budget requests
  result = api_instance.get_budget_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BudgetApi->get_budget_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **currency_conversion** | **String**| currency_conversion | [optional] 
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageBudget**](PageBudget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_budget_using_get**
> Budget get_budget_using_get(budget_id, opts)

Retrieve a budget request

Retrieve the information for a budget request.

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

api_instance = NucleusApi::BudgetApi.new

budget_id = 'budget_id_example' # String | UUID budget_id

opts = { 
  currency_conversion: 'currency_conversion_example' # String | USD
}

begin
  #Retrieve a budget request
  result = api_instance.get_budget_using_get(budget_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BudgetApi->get_budget_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget_id** | [**String**](.md)| UUID budget_id | 
 **currency_conversion** | **String**| USD | [optional] 

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_budget_using_put**
> Budget update_budget_using_put(budget, budget_id)

Update a budget request

Update the information for a budget request.

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

api_instance = NucleusApi::BudgetApi.new

budget = NucleusApi::Budget.new # Budget | budget

budget_id = 'budget_id_example' # String | UUID budget_id


begin
  #Update a budget request
  result = api_instance.update_budget_using_put(budget, budget_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BudgetApi->update_budget_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget** | [**Budget**](Budget.md)| budget | 
 **budget_id** | [**String**](.md)| UUID budget_id | 

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



