# NucleusApi::CustomerApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_customer_revenue_using_post**](CustomerApi.md#create_customer_revenue_using_post) | **POST** /customer_revenue | Create a customer revenue
[**create_customer_using_post**](CustomerApi.md#create_customer_using_post) | **POST** /customer | Create a customer
[**delete_customer_revenue_using_delete**](CustomerApi.md#delete_customer_revenue_using_delete) | **DELETE** /customer_revenue/{customer_revenue_id} | Delete a customer revenue
[**delete_customer_using_delete**](CustomerApi.md#delete_customer_using_delete) | **DELETE** /customer/{customer_id} | Delete a customer
[**get_customer_all_using_get**](CustomerApi.md#get_customer_all_using_get) | **GET** /customer | List all customer
[**get_customer_revenue_all_using_get**](CustomerApi.md#get_customer_revenue_all_using_get) | **GET** /customer_revenue | List all customer revenue
[**get_customer_revenue_using_get**](CustomerApi.md#get_customer_revenue_using_get) | **GET** /customer_revenue/{customer_revenue_id} | Retrieve a customer revenue
[**get_customer_using_get**](CustomerApi.md#get_customer_using_get) | **GET** /customer/{customer_id} | Retrieve a customer
[**update_customer_revenue_using_put**](CustomerApi.md#update_customer_revenue_using_put) | **PUT** /customer_revenue/{customer_revenue_id} | Update a customer revenue
[**update_customer_using_put**](CustomerApi.md#update_customer_using_put) | **PUT** /customer/{customer_id} | Update a customer


# **create_customer_revenue_using_post**
> CustomerRevenue create_customer_revenue_using_post(customer_revenue)

Create a customer revenue

Create a new customer revenue, with your firm.

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
end


api_instance = NucleusApi::CustomerApi.new

customer_revenue = NucleusApi::CustomerRevenue.new # CustomerRevenue | customerRevenue


begin
  #Create a customer revenue
  result = api_instance.create_customer_revenue_using_post(customer_revenue)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling CustomerApi->create_customer_revenue_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_revenue** | [**CustomerRevenue**](CustomerRevenue.md)| customerRevenue | 

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_customer_using_post**
> Customer create_customer_using_post(customer)

Create a customer

Create a new customer, with your firm.

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
end


api_instance = NucleusApi::CustomerApi.new

customer = NucleusApi::Customer.new # Customer | customer


begin
  #Create a customer
  result = api_instance.create_customer_using_post(customer)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling CustomerApi->create_customer_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| customer | 

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_customer_revenue_using_delete**
> delete_customer_revenue_using_delete(customer_revenue_id)

Delete a customer revenue

Delete a customer revenue. 

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
end


api_instance = NucleusApi::CustomerApi.new

customer_revenue_id = 'customer_revenue_id_example' # String | UUID customer_revenue_id


begin
  #Delete a customer revenue
  api_instance.delete_customer_revenue_using_delete(customer_revenue_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling CustomerApi->delete_customer_revenue_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_revenue_id** | [**String**](.md)| UUID customer_revenue_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_customer_using_delete**
> delete_customer_using_delete(customer_id)

Delete a customer

Delete a customer. 

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
end


api_instance = NucleusApi::CustomerApi.new

customer_id = 'customer_id_example' # String | UUID customer_id


begin
  #Delete a customer
  api_instance.delete_customer_using_delete(customer_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling CustomerApi->delete_customer_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | [**String**](.md)| UUID customer_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_customer_all_using_get**
> PageCustomer get_customer_all_using_get(opts)

List all customer

List all customer. 

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
end


api_instance = NucleusApi::CustomerApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all customer
  result = api_instance.get_customer_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling CustomerApi->get_customer_all_using_get: #{e}"
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

[**PageCustomer**](PageCustomer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_customer_revenue_all_using_get**
> PageCustomerRevenue get_customer_revenue_all_using_get(opts)

List all customer revenue

List all customer revenue. 

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
end


api_instance = NucleusApi::CustomerApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all customer revenue
  result = api_instance.get_customer_revenue_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling CustomerApi->get_customer_revenue_all_using_get: #{e}"
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

[**PageCustomerRevenue**](PageCustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_customer_revenue_using_get**
> CustomerRevenue get_customer_revenue_using_get(customer_revenue_id)

Retrieve a customer revenue

Retrieve a customer revenue. 

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
end


api_instance = NucleusApi::CustomerApi.new

customer_revenue_id = 'customer_revenue_id_example' # String | UUID customer_revenue_id


begin
  #Retrieve a customer revenue
  result = api_instance.get_customer_revenue_using_get(customer_revenue_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling CustomerApi->get_customer_revenue_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_revenue_id** | [**String**](.md)| UUID customer_revenue_id | 

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_customer_using_get**
> Customer get_customer_using_get(customer_id)

Retrieve a customer

Retrieve a customer. 

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
end


api_instance = NucleusApi::CustomerApi.new

customer_id = 'customer_id_example' # String | UUID customer_id


begin
  #Retrieve a customer
  result = api_instance.get_customer_using_get(customer_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling CustomerApi->get_customer_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | [**String**](.md)| UUID customer_id | 

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_customer_revenue_using_put**
> CustomerRevenue update_customer_revenue_using_put(customer_revenue, customer_revenue_id)

Update a customer revenue

Update a customer revenue. 

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
end


api_instance = NucleusApi::CustomerApi.new

customer_revenue = NucleusApi::CustomerRevenue.new # CustomerRevenue | customer_revenue

customer_revenue_id = 'customer_revenue_id_example' # String | UUID customer_revenue_id


begin
  #Update a customer revenue
  result = api_instance.update_customer_revenue_using_put(customer_revenue, customer_revenue_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling CustomerApi->update_customer_revenue_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_revenue** | [**CustomerRevenue**](CustomerRevenue.md)| customer_revenue | 
 **customer_revenue_id** | [**String**](.md)| UUID customer_revenue_id | 

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_customer_using_put**
> Customer update_customer_using_put(customer, customer_id)

Update a customer

Update a customer. 

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
end


api_instance = NucleusApi::CustomerApi.new

customer = NucleusApi::Customer.new # Customer | customer

customer_id = 'customer_id_example' # String | UUID customer_id


begin
  #Update a customer
  result = api_instance.update_customer_using_put(customer, customer_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling CustomerApi->update_customer_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| customer | 
 **customer_id** | [**String**](.md)| UUID customer_id | 

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



