# IntegrationApi::WebhookApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_webhook_using_post**](WebhookApi.md#create_webhook_using_post) | **POST** /webhook | Create a webhook
[**delete_webhook_using_delete**](WebhookApi.md#delete_webhook_using_delete) | **DELETE** /webhook/{webhook_id} | Delete a webhook
[**get_webhook_all_using_get**](WebhookApi.md#get_webhook_all_using_get) | **GET** /webhook | List all webhooks
[**get_webhook_using_get**](WebhookApi.md#get_webhook_using_get) | **GET** /webhook/{webhook_id} | Retrieve a webhook
[**update_webhook_using_put**](WebhookApi.md#update_webhook_using_put) | **PUT** /webhook/{webhook_id} | Update a webhook


# **create_webhook_using_post**
> Webhook create_webhook_using_post(webhook_request)

Create a webhook

One active webhook service is allowed at all times.

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = IntegrationApi::WebhookApi.new

webhook_request = IntegrationApi::Webhook.new # Webhook | webhookRequest


begin
  #Create a webhook
  result = api_instance.create_webhook_using_post(webhook_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WebhookApi->create_webhook_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_request** | [**Webhook**](Webhook.md)| webhookRequest | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_webhook_using_delete**
> delete_webhook_using_delete(webhook_id)

Delete a webhook

Permanently delete a webhook for your firm. The webhook_id must be provided.

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = IntegrationApi::WebhookApi.new

webhook_id = 'webhook_id_example' # String | UUID webhook_id


begin
  #Delete a webhook
  api_instance.delete_webhook_using_delete(webhook_id)
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WebhookApi->delete_webhook_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**String**](.md)| UUID webhook_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_webhook_all_using_get**
> PageWebhook get_webhook_all_using_get(opts)

List all webhooks

Get information for all webhooks defined for your firm.

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = IntegrationApi::WebhookApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all webhooks
  result = api_instance.get_webhook_all_using_get(opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WebhookApi->get_webhook_all_using_get: #{e}"
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

[**PageWebhook**](PageWebhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_webhook_using_get**
> Webhook get_webhook_using_get(webhook_id)

Retrieve a webhook

Retrieve the information for a specific webhook. The webhook_id must be provided.

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = IntegrationApi::WebhookApi.new

webhook_id = 'webhook_id_example' # String | UUID webhook_id


begin
  #Retrieve a webhook
  result = api_instance.get_webhook_using_get(webhook_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WebhookApi->get_webhook_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**String**](.md)| UUID webhook_id | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_webhook_using_put**
> Webhook update_webhook_using_put(webhook, webhook_id)

Update a webhook

Update a webhook for your firm. The webhook_id must be provided

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = IntegrationApi::WebhookApi.new

webhook = IntegrationApi::Webhook.new # Webhook | webhook

webhook_id = 'webhook_id_example' # String | UUID webhook_id


begin
  #Update a webhook
  result = api_instance.update_webhook_using_put(webhook, webhook_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WebhookApi->update_webhook_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook** | [**Webhook**](Webhook.md)| webhook | 
 **webhook_id** | [**String**](.md)| UUID webhook_id | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



