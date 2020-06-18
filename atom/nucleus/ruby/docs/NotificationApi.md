# NucleusApi::NotificationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_notification_client_using_post**](NotificationApi.md#create_notification_client_using_post) | **POST** /notification_client | Create a Notification Client
[**create_notification_setting_using_post**](NotificationApi.md#create_notification_setting_using_post) | **POST** /notification_setting | Create a Notification Setting
[**create_notification_using_post**](NotificationApi.md#create_notification_using_post) | **POST** /notification | Create a Notification
[**delete_notification_client_using_delete**](NotificationApi.md#delete_notification_client_using_delete) | **DELETE** /notification_client/{notification_client_id} | Delete a Notification Client
[**delete_notification_setting_using_delete**](NotificationApi.md#delete_notification_setting_using_delete) | **DELETE** /notification_setting/{notification_setting_id} | Delete a Notification Setting
[**delete_notification_using_delete**](NotificationApi.md#delete_notification_using_delete) | **DELETE** /notification/{notification_id} | Delete a Notification
[**get_notification_all_using_get**](NotificationApi.md#get_notification_all_using_get) | **GET** /notification | Get All Notification
[**get_notification_client_all_using_get**](NotificationApi.md#get_notification_client_all_using_get) | **GET** /notification_client | List all Notification Client
[**get_notification_client_using_get**](NotificationApi.md#get_notification_client_using_get) | **GET** /notification_client/{notification_client_id} | Retrieve a Notification Client
[**get_notification_setting_all_using_get**](NotificationApi.md#get_notification_setting_all_using_get) | **GET** /notification_setting | List all Notification Setting
[**get_notification_setting_using_get**](NotificationApi.md#get_notification_setting_using_get) | **GET** /notification_setting/{notification_setting_id} | Retrieve a Notification Setting
[**get_notification_using_get**](NotificationApi.md#get_notification_using_get) | **GET** /notification/{notification_id} | Get a Notification
[**update_notification_client_using_put**](NotificationApi.md#update_notification_client_using_put) | **PUT** /notification_client/{notification_client_id} | Update a Notification Client
[**update_notification_setting_using_put**](NotificationApi.md#update_notification_setting_using_put) | **PUT** /notification_setting/{notification_setting_id} | Update a Notification Setting
[**update_notification_using_put**](NotificationApi.md#update_notification_using_put) | **PUT** /notification/{notification_id} | Update a Notification


# **create_notification_client_using_post**
> NotificationClient create_notification_client_using_post(notification_client)

Create a Notification Client

Create a new Notification Client. 

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


api_instance = NucleusApi::NotificationApi.new

notification_client = NucleusApi::NotificationClient.new # NotificationClient | notificationClient


begin
  #Create a Notification Client
  result = api_instance.create_notification_client_using_post(notification_client)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->create_notification_client_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_client** | [**NotificationClient**](NotificationClient.md)| notificationClient | 

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_notification_setting_using_post**
> NotificationSetting create_notification_setting_using_post(notification_setting)

Create a Notification Setting

Create a new Notification Setting. 

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


api_instance = NucleusApi::NotificationApi.new

notification_setting = NucleusApi::NotificationSetting.new # NotificationSetting | notificationSetting


begin
  #Create a Notification Setting
  result = api_instance.create_notification_setting_using_post(notification_setting)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->create_notification_setting_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_setting** | [**NotificationSetting**](NotificationSetting.md)| notificationSetting | 

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_notification_using_post**
> Notification create_notification_using_post(notification)

Create a Notification

Create a new Notification. 

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


api_instance = NucleusApi::NotificationApi.new

notification = NucleusApi::Notification.new # Notification | notification


begin
  #Create a Notification
  result = api_instance.create_notification_using_post(notification)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->create_notification_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification** | [**Notification**](Notification.md)| notification | 

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_notification_client_using_delete**
> delete_notification_client_using_delete(notification_client_id)

Delete a Notification Client

Permanently Delete Notification Client.

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


api_instance = NucleusApi::NotificationApi.new

notification_client_id = 'notification_client_id_example' # String | notification_client_id


begin
  #Delete a Notification Client
  api_instance.delete_notification_client_using_delete(notification_client_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->delete_notification_client_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_client_id** | [**String**](.md)| notification_client_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_notification_setting_using_delete**
> delete_notification_setting_using_delete(notification_setting_id)

Delete a Notification Setting

Permanently Delete Notification Setting. 

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


api_instance = NucleusApi::NotificationApi.new

notification_setting_id = 'notification_setting_id_example' # String | notification_setting_id


begin
  #Delete a Notification Setting
  api_instance.delete_notification_setting_using_delete(notification_setting_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->delete_notification_setting_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_setting_id** | [**String**](.md)| notification_setting_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_notification_using_delete**
> delete_notification_using_delete(notification_id)

Delete a Notification

Permanently Delete a Notification. 

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


api_instance = NucleusApi::NotificationApi.new

notification_id = 'notification_id_example' # String | UUID notification_id


begin
  #Delete a Notification
  api_instance.delete_notification_using_delete(notification_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->delete_notification_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_id** | [**String**](.md)| UUID notification_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_notification_all_using_get**
> PageNotification get_notification_all_using_get(opts)

Get All Notification

Get All Notification. 

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


api_instance = NucleusApi::NotificationApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #Get All Notification
  result = api_instance.get_notification_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->get_notification_all_using_get: #{e}"
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

[**PageNotification**](PageNotification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_notification_client_all_using_get**
> PageNotificationClient get_notification_client_all_using_get(opts)

List all Notification Client

List all Notification Client. 

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


api_instance = NucleusApi::NotificationApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all Notification Client
  result = api_instance.get_notification_client_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->get_notification_client_all_using_get: #{e}"
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

[**PageNotificationClient**](PageNotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_notification_client_using_get**
> NotificationClient get_notification_client_using_get(notification_client_id)

Retrieve a Notification Client

Retrieve a  Notification Client. 

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


api_instance = NucleusApi::NotificationApi.new

notification_client_id = 'notification_client_id_example' # String | notification_client_id


begin
  #Retrieve a Notification Client
  result = api_instance.get_notification_client_using_get(notification_client_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->get_notification_client_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_client_id** | [**String**](.md)| notification_client_id | 

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_notification_setting_all_using_get**
> PageNotificationSetting get_notification_setting_all_using_get(opts)

List all Notification Setting

List all Notification Setting. 

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


api_instance = NucleusApi::NotificationApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all Notification Setting
  result = api_instance.get_notification_setting_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->get_notification_setting_all_using_get: #{e}"
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

[**PageNotificationSetting**](PageNotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_notification_setting_using_get**
> NotificationSetting get_notification_setting_using_get(notification_setting_id)

Retrieve a Notification Setting

Retrieve a  Notification Setting. 

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


api_instance = NucleusApi::NotificationApi.new

notification_setting_id = 'notification_setting_id_example' # String | notification_setting_id


begin
  #Retrieve a Notification Setting
  result = api_instance.get_notification_setting_using_get(notification_setting_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->get_notification_setting_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_setting_id** | [**String**](.md)| notification_setting_id | 

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_notification_using_get**
> Notification get_notification_using_get(notification_id)

Get a Notification

Get a Notification. 

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


api_instance = NucleusApi::NotificationApi.new

notification_id = 'notification_id_example' # String | notification_id


begin
  #Get a Notification
  result = api_instance.get_notification_using_get(notification_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->get_notification_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_id** | [**String**](.md)| notification_id | 

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_notification_client_using_put**
> NotificationClient update_notification_client_using_put(notification_client, notification_client_id)

Update a Notification Client

Update a  Notification Client. 

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


api_instance = NucleusApi::NotificationApi.new

notification_client = NucleusApi::NotificationClient.new # NotificationClient | notification_client

notification_client_id = 'notification_client_id_example' # String | UUID notification_client_id


begin
  #Update a Notification Client
  result = api_instance.update_notification_client_using_put(notification_client, notification_client_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->update_notification_client_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_client** | [**NotificationClient**](NotificationClient.md)| notification_client | 
 **notification_client_id** | [**String**](.md)| UUID notification_client_id | 

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_notification_setting_using_put**
> NotificationSetting update_notification_setting_using_put(notification_setting, notification_setting_id)

Update a Notification Setting

Update a  Notification Setting. 

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


api_instance = NucleusApi::NotificationApi.new

notification_setting = NucleusApi::NotificationSetting.new # NotificationSetting | notification_setting

notification_setting_id = 'notification_setting_id_example' # String | UUID notification_setting_id


begin
  #Update a Notification Setting
  result = api_instance.update_notification_setting_using_put(notification_setting, notification_setting_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->update_notification_setting_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_setting** | [**NotificationSetting**](NotificationSetting.md)| notification_setting | 
 **notification_setting_id** | [**String**](.md)| UUID notification_setting_id | 

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_notification_using_put**
> Notification update_notification_using_put(notification, notification_id)

Update a Notification

Update a Notification. 

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


api_instance = NucleusApi::NotificationApi.new

notification = NucleusApi::Notification.new # Notification | notification

notification_id = 'notification_id_example' # String | UUID notification_id


begin
  #Update a Notification
  result = api_instance.update_notification_using_put(notification, notification_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling NotificationApi->update_notification_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification** | [**Notification**](Notification.md)| notification | 
 **notification_id** | [**String**](.md)| UUID notification_id | 

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



