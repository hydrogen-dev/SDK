# NucleusApi::SpendingControlApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_spending_control_using_post**](SpendingControlApi.md#create_spending_control_using_post) | **POST** /spending_control | Create a Spending Control
[**delete_spending_control_using_delete**](SpendingControlApi.md#delete_spending_control_using_delete) | **DELETE** /spending_control/{spending_control_id} | Delete a Spending Control
[**get_spending_control_all_using_get**](SpendingControlApi.md#get_spending_control_all_using_get) | **GET** /spending_control | List all Spending Control
[**get_spending_control_using_get**](SpendingControlApi.md#get_spending_control_using_get) | **GET** /spending_control/{spending_control_id} | Retrieve a Spending Control
[**update_spending_control_using_put**](SpendingControlApi.md#update_spending_control_using_put) | **PUT** /spending_control/{spending_control_id} | Update a Spending Control


# **create_spending_control_using_post**
> SpendingControl create_spending_control_using_post(spending_control)

Create a Spending Control

Create a new Spending Control.

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

api_instance = NucleusApi::SpendingControlApi.new

spending_control = NucleusApi::SpendingControl.new # SpendingControl | spendingControl


begin
  #Create a Spending Control
  result = api_instance.create_spending_control_using_post(spending_control)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SpendingControlApi->create_spending_control_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spending_control** | [**SpendingControl**](SpendingControl.md)| spendingControl | 

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_spending_control_using_delete**
> delete_spending_control_using_delete(spending_control_id)

Delete a Spending Control

Permanently Delete Spending Control.

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

api_instance = NucleusApi::SpendingControlApi.new

spending_control_id = 'spending_control_id_example' # String | spending_control_id


begin
  #Delete a Spending Control
  api_instance.delete_spending_control_using_delete(spending_control_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling SpendingControlApi->delete_spending_control_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spending_control_id** | [**String**](.md)| spending_control_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_spending_control_all_using_get**
> PageSpendingControl get_spending_control_all_using_get(opts)

List all Spending Control

List all Spending Control.

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

api_instance = NucleusApi::SpendingControlApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all Spending Control
  result = api_instance.get_spending_control_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SpendingControlApi->get_spending_control_all_using_get: #{e}"
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

[**PageSpendingControl**](PageSpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_spending_control_using_get**
> SpendingControl get_spending_control_using_get(spending_control_id)

Retrieve a Spending Control

Retrieve a Spending Control. 

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

api_instance = NucleusApi::SpendingControlApi.new

spending_control_id = 'spending_control_id_example' # String | spending_control_id


begin
  #Retrieve a Spending Control
  result = api_instance.get_spending_control_using_get(spending_control_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SpendingControlApi->get_spending_control_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spending_control_id** | [**String**](.md)| spending_control_id | 

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_spending_control_using_put**
> SpendingControl update_spending_control_using_put(spending_control, spending_control_id)

Update a Spending Control

Update a Spending Control. 

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

api_instance = NucleusApi::SpendingControlApi.new

spending_control = nil # Object | spending_control

spending_control_id = 'spending_control_id_example' # String | UUID spending_control_id


begin
  #Update a Spending Control
  result = api_instance.update_spending_control_using_put(spending_control, spending_control_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SpendingControlApi->update_spending_control_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spending_control** | **Object**| spending_control | 
 **spending_control_id** | [**String**](.md)| UUID spending_control_id | 

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



