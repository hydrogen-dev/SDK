# NucleusApi::AdminClientApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/admin/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_admin_client_using_post**](AdminClientApi.md#create_admin_client_using_post) | **POST** /client | Create an admin client
[**delete_admin_client_using_get**](AdminClientApi.md#delete_admin_client_using_get) | **DELETE** /client/{client_id} | Delete an admin client
[**get_admin_client_using_get**](AdminClientApi.md#get_admin_client_using_get) | **GET** /client/{client_id} | Get an admin client
[**get_all_admin_client_using_get**](AdminClientApi.md#get_all_admin_client_using_get) | **GET** /client | List all admin clients
[**update_admin_client_using_put**](AdminClientApi.md#update_admin_client_using_put) | **PUT** /client/{client_id} | Update an admin client


# **create_admin_client_using_post**
> AdminClient create_admin_client_using_post(client)

Create an admin client

Create an admin client

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

api_instance = NucleusApi::AdminClientApi.new

client = NucleusApi::AdminClient.new # AdminClient | client


begin
  #Create an admin client
  result = api_instance.create_admin_client_using_post(client)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AdminClientApi->create_admin_client_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**AdminClient**](AdminClient.md)| client | 

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_admin_client_using_get**
> delete_admin_client_using_get(client_id)

Delete an admin client

Delete an admin client

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

api_instance = NucleusApi::AdminClientApi.new

client_id = 789 # Integer | client_id


begin
  #Delete an admin client
  api_instance.delete_admin_client_using_get(client_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling AdminClientApi->delete_admin_client_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **Integer**| client_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_admin_client_using_get**
> AdminClient get_admin_client_using_get(client_id)

Get an admin client

Get an admin client

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

api_instance = NucleusApi::AdminClientApi.new

client_id = 789 # Integer | client_id


begin
  #Get an admin client
  result = api_instance.get_admin_client_using_get(client_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AdminClientApi->get_admin_client_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **Integer**| client_id | 

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_all_admin_client_using_get**
> PageAdminClient get_all_admin_client_using_get(opts)

List all admin clients

Get a list of all admin clients

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

api_instance = NucleusApi::AdminClientApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'username', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all admin clients
  result = api_instance.get_all_admin_client_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AdminClientApi->get_all_admin_client_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to username]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAdminClient**](PageAdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_admin_client_using_put**
> AdminClient update_admin_client_using_put(client, client_id)

Update an admin client

Update an admin client

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

api_instance = NucleusApi::AdminClientApi.new

client = NucleusApi::AdminClient.new # AdminClient | client

client_id = 789 # Integer | client_id


begin
  #Update an admin client
  result = api_instance.update_admin_client_using_put(client, client_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AdminClientApi->update_admin_client_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**AdminClient**](AdminClient.md)| client | 
 **client_id** | **Integer**| client_id | 

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



