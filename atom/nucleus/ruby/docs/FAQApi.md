# AtomApi::FAQApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_faq_using_post**](FAQApi.md#create_faq_using_post) | **POST** /faq | Create a FAQ
[**delete_faq_using_delete**](FAQApi.md#delete_faq_using_delete) | **DELETE** /faq/{faq_id} | Delete a FAQ
[**get_faq_all_using_get**](FAQApi.md#get_faq_all_using_get) | **GET** /faq | List all FAQ
[**get_faq_using_get**](FAQApi.md#get_faq_using_get) | **GET** /faq/{faq_id} | Retrieve a FAQ
[**update_faq_using_put**](FAQApi.md#update_faq_using_put) | **PUT** /faq/{faq_id} | Update a FAQ


# **create_faq_using_post**
> Faq create_faq_using_post(faq_request)

Create a FAQ

Create a new FAQ

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


api_instance = AtomApi::FAQApi.new

faq_request = AtomApi::Faq.new # Faq | faqRequest


begin
  #Create a FAQ
  result = api_instance.create_faq_using_post(faq_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FAQApi->create_faq_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq_request** | [**Faq**](Faq.md)| faqRequest | 

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_faq_using_delete**
> delete_faq_using_delete(faq_id)

Delete a FAQ

Permanently delete a FAQ

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


api_instance = AtomApi::FAQApi.new

faq_id = 'faq_id_example' # String | UUID faq_id


begin
  #Delete a FAQ
  api_instance.delete_faq_using_delete(faq_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling FAQApi->delete_faq_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq_id** | [**String**](.md)| UUID faq_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_faq_all_using_get**
> PageFaq get_faq_all_using_get(opts)

List all FAQ

Get the information for all FAQ

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


api_instance = AtomApi::FAQApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all FAQ
  result = api_instance.get_faq_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FAQApi->get_faq_all_using_get: #{e}"
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

[**PageFaq**](PageFaq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_faq_using_get**
> Faq get_faq_using_get(faq_id)

Retrieve a FAQ

Retrieve the information for a FAQ

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


api_instance = AtomApi::FAQApi.new

faq_id = 'faq_id_example' # String | UUID faq_id


begin
  #Retrieve a FAQ
  result = api_instance.get_faq_using_get(faq_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FAQApi->get_faq_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq_id** | [**String**](.md)| UUID faq_id | 

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_faq_using_put**
> Faq update_faq_using_put(faq, faq_id)

Update a FAQ

Update the information for a FAQ

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


api_instance = AtomApi::FAQApi.new

faq = AtomApi::Faq.new # Faq | faq

faq_id = 'faq_id_example' # String | UUID faq_id


begin
  #Update a FAQ
  result = api_instance.update_faq_using_put(faq, faq_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FAQApi->update_faq_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq** | [**Faq**](Faq.md)| faq | 
 **faq_id** | [**String**](.md)| UUID faq_id | 

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



