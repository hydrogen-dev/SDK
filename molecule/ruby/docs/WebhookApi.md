# MoleculeApi::WebhookApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_webhook_using_post**](WebhookApi.md#create_webhook_using_post) | **POST** /webhook | Creates a new Webhook record
[**delete_webhook_using_delete**](WebhookApi.md#delete_webhook_using_delete) | **DELETE** /webhook/{webhook_id} | Delete Webhook
[**get_webhook_all_using_get**](WebhookApi.md#get_webhook_all_using_get) | **GET** /webhook | Fetch Webhook list
[**get_webhook_using_get**](WebhookApi.md#get_webhook_using_get) | **GET** /webhook/{webhook_id} | Fetch Webhook details
[**update_webhook_using_put**](WebhookApi.md#update_webhook_using_put) | **PUT** /webhook/{webhook_id} | Update Webhook details


# **create_webhook_using_post**
> WebhookResponse create_webhook_using_post(webhook_params)

Creates a new Webhook record

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::WebhookApi.new

webhook_params = MoleculeApi::WebhookParams.new # WebhookParams | It enables a user to create a Webhook record


begin
  #Creates a new Webhook record
  result = api_instance.create_webhook_using_post(webhook_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WebhookApi->create_webhook_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_params** | [**WebhookParams**](WebhookParams.md)| It enables a user to create a Webhook record | 

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **delete_webhook_using_delete**
> delete_webhook_using_delete(webhook_id)

Delete Webhook

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::WebhookApi.new

webhook_id = 'webhook_id_example' # String | Webhook ID


begin
  #Delete Webhook
  api_instance.delete_webhook_using_delete(webhook_id)
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WebhookApi->delete_webhook_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**String**](.md)| Webhook ID | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_webhook_all_using_get**
> PageWebhookResponse get_webhook_all_using_get(opts)

Fetch Webhook list

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::WebhookApi.new

opts = { 
  page: 56, # Integer | To filter response webhook list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Webhook list
  result = api_instance.get_webhook_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WebhookApi->get_webhook_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| To filter response webhook list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageWebhookResponse**](PageWebhookResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_webhook_using_get**
> WebhookResponse get_webhook_using_get(webhook_id)

Fetch Webhook details

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::WebhookApi.new

webhook_id = 'webhook_id_example' # String | Webhook ID


begin
  #Fetch Webhook details
  result = api_instance.get_webhook_using_get(webhook_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WebhookApi->get_webhook_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**String**](.md)| Webhook ID | 

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_webhook_using_put**
> WebhookResponse update_webhook_using_put(webhook_id, webhook_update_params)

Update Webhook details

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::WebhookApi.new

webhook_id = 'webhook_id_example' # String | Webhook ID

webhook_update_params = MoleculeApi::WebhookParams.new # WebhookParams | Webhook details to be updated


begin
  #Update Webhook details
  result = api_instance.update_webhook_using_put(webhook_id, webhook_update_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WebhookApi->update_webhook_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**String**](.md)| Webhook ID | 
 **webhook_update_params** | [**WebhookParams**](WebhookParams.md)| Webhook details to be updated | 

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



