# AdminApi::ClientApi

All URIs are relative to *https://api.hydrogenplatform.com/admin/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_using_post**](ClientApi.md#create_using_post) | **POST** /client | create
[**delete_using_delete**](ClientApi.md#delete_using_delete) | **DELETE** /client/{client_id} | delete
[**get_all_client_using_get**](ClientApi.md#get_all_client_using_get) | **GET** /client | getAllClient
[**get_using_get**](ClientApi.md#get_using_get) | **GET** /client/{client_id} | get
[**update_using_put**](ClientApi.md#update_using_put) | **PUT** /client/{client_id} | update


# **create_using_post**
> Client create_using_post(client)

create

### Example
```ruby
# Load the gem
require 'admin_api'

# Setup authorization
AdminApi.configure do |config|
  # Use one of the below method to generate oauth token        
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = AdminApi::ClientApi.new

client = AdminApi::Client.new # Client | client


begin
  #create
  result = api_instance.create_using_post(client)
  p result
rescue AdminApi::ApiError => e
  puts "Exception when calling ClientApi->create_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**Client**](Client.md)| client |

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_using_delete**
> delete_using_delete(client_id)

delete

### Example
```ruby
# Load the gem
require 'admin_api'

# Setup authorization
AdminApi.configure do |config|
  # Use one of the below method to generate oauth token        
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = AdminApi::ClientApi.new

client_id = 789 # Integer | client_id


begin
  #delete
  api_instance.delete_using_delete(client_id)
rescue AdminApi::ApiError => e
  puts "Exception when calling ClientApi->delete_using_delete: #{e}"
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



# **get_all_client_using_get**
> PageClient get_all_client_using_get(opts)

getAllClient

### Example
```ruby
# Load the gem
require 'admin_api'

# Setup authorization
AdminApi.configure do |config|
  # Use one of the below method to generate oauth token        
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = AdminApi::ClientApi.new

opts = {
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'username', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #getAllClient
  result = api_instance.get_all_client_using_get(opts)
  p result
rescue AdminApi::ApiError => e
  puts "Exception when calling ClientApi->get_all_client_using_get: #{e}"
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

[**PageClient**](PageClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_using_get**
> Client get_using_get(client_id)

get

### Example
```ruby
# Load the gem
require 'admin_api'

# Setup authorization
AdminApi.configure do |config|
  # Use one of the below method to generate oauth token        
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = AdminApi::ClientApi.new

client_id = 789 # Integer | client_id


begin
  #get
  result = api_instance.get_using_get(client_id)
  p result
rescue AdminApi::ApiError => e
  puts "Exception when calling ClientApi->get_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **Integer**| client_id |

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_using_put**
> Client update_using_put(client, client_id)

update

### Example
```ruby
# Load the gem
require 'admin_api'

# Setup authorization
AdminApi.configure do |config|
  # Use one of the below method to generate oauth token        
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = AdminApi::ClientApi.new

client = AdminApi::Client.new # Client | client

client_id = 789 # Integer | client_id


begin
  #update
  result = api_instance.update_using_put(client, client_id)
  p result
rescue AdminApi::ApiError => e
  puts "Exception when calling ClientApi->update_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**Client**](Client.md)| client |
 **client_id** | **Integer**| client_id |

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*
