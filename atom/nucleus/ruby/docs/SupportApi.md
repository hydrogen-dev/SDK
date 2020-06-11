# AtomApi::SupportApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_chat_using_post**](SupportApi.md#create_chat_using_post) | **POST** /chat | Create a Chat
[**create_consultation_using_post**](SupportApi.md#create_consultation_using_post) | **POST** /consultation | Create a CIO Consultation
[**create_sale_using_post**](SupportApi.md#create_sale_using_post) | **POST** /sales | Create a sales inquiry
[**create_support_ticket_comment_using_post**](SupportApi.md#create_support_ticket_comment_using_post) | **POST** /support_ticket_comment | Create a support ticket comment
[**create_support_ticket_using_post**](SupportApi.md#create_support_ticket_using_post) | **POST** /support_ticket | Create a support ticket
[**delete_chat_using_delete**](SupportApi.md#delete_chat_using_delete) | **DELETE** /chat/{chat_id} | Delete a Chat
[**delete_consultation_using_delete**](SupportApi.md#delete_consultation_using_delete) | **DELETE** /consultation/{consultation_id} | Delete a CIO Consultation
[**delete_sale_using_delete**](SupportApi.md#delete_sale_using_delete) | **DELETE** /sales/{sales_id} | Delete a sales inquiry
[**delete_support_ticket_comment_using_delete**](SupportApi.md#delete_support_ticket_comment_using_delete) | **DELETE** /support_ticket_comment/{support_ticket_comment_id} | Delete a support ticket comment
[**delete_support_ticket_using_delete**](SupportApi.md#delete_support_ticket_using_delete) | **DELETE** /support_ticket/{support_ticket_id} | Delete a support ticket
[**get_chat_all_using_get**](SupportApi.md#get_chat_all_using_get) | **GET** /chat | List all open chats
[**get_chat_using_get**](SupportApi.md#get_chat_using_get) | **GET** /chat/{chat_id} | Retrieve a Chat
[**get_consultation_all_using_get**](SupportApi.md#get_consultation_all_using_get) | **GET** /consultation | List all CIO Consultation
[**get_consultation_using_get**](SupportApi.md#get_consultation_using_get) | **GET** /consultation/{consultation_id} | Retrieve a CIO Consultation
[**get_sale_all_using_get**](SupportApi.md#get_sale_all_using_get) | **GET** /sales | List all sales inquiries
[**get_sale_using_get**](SupportApi.md#get_sale_using_get) | **GET** /sales/{sales_id} | Retrieve a sales record
[**get_support_ticket_all_using_get**](SupportApi.md#get_support_ticket_all_using_get) | **GET** /support_ticket | List all support tickets
[**get_support_ticket_comment_all_using_get**](SupportApi.md#get_support_ticket_comment_all_using_get) | **GET** /support_ticket_comment | List all support ticket comments
[**get_support_ticket_comment_using_get**](SupportApi.md#get_support_ticket_comment_using_get) | **GET** /support_ticket_comment/{support_ticket_comment_id} | Retrieve a support ticket comment
[**get_support_ticket_using_get**](SupportApi.md#get_support_ticket_using_get) | **GET** /support_ticket/{support_ticket_id} | Retrieve a support ticket
[**update_chat_using_put**](SupportApi.md#update_chat_using_put) | **PUT** /chat/{chat_id} | Update a Chat
[**update_consultation_using_put**](SupportApi.md#update_consultation_using_put) | **PUT** /consultation/{consultation_id} | Update a CIO Consultation
[**update_sale_using_put**](SupportApi.md#update_sale_using_put) | **PUT** /sales/{sales_id} | Update a sales inquiry
[**update_support_ticket_comment_using_put**](SupportApi.md#update_support_ticket_comment_using_put) | **PUT** /support_ticket_comment/{support_ticket_comment_id} | Update a support ticket comment
[**update_support_ticket_using_put**](SupportApi.md#update_support_ticket_using_put) | **PUT** /support_ticket/{support_ticket_id} | Update a support ticket


# **create_chat_using_post**
> ChatInfo create_chat_using_post(chat_info_request)

Create a Chat

Create a Chat

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


api_instance = AtomApi::SupportApi.new

chat_info_request = AtomApi::ChatInfo.new # ChatInfo | chatInfoRequest


begin
  #Create a Chat
  result = api_instance.create_chat_using_post(chat_info_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->create_chat_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_info_request** | [**ChatInfo**](ChatInfo.md)| chatInfoRequest | 

### Return type

[**ChatInfo**](ChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_consultation_using_post**
> Consultation create_consultation_using_post(cio_consultation_request)

Create a CIO Consultation

Create a new CIO Consultation

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


api_instance = AtomApi::SupportApi.new

cio_consultation_request = AtomApi::Consultation.new # Consultation | cioConsultationRequest


begin
  #Create a CIO Consultation
  result = api_instance.create_consultation_using_post(cio_consultation_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->create_consultation_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cio_consultation_request** | [**Consultation**](Consultation.md)| cioConsultationRequest | 

### Return type

[**Consultation**](Consultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_sale_using_post**
> Sale create_sale_using_post(sale_request)

Create a sales inquiry

Create a new sales inquiry for your firm.

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


api_instance = AtomApi::SupportApi.new

sale_request = AtomApi::Sale.new # Sale | saleRequest


begin
  #Create a sales inquiry
  result = api_instance.create_sale_using_post(sale_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->create_sale_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sale_request** | [**Sale**](Sale.md)| saleRequest | 

### Return type

[**Sale**](Sale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_support_ticket_comment_using_post**
> SupportTicket create_support_ticket_comment_using_post(support_ticker_comment_request)

Create a support ticket comment

Create a new support ticket comment for a support ticket.

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


api_instance = AtomApi::SupportApi.new

support_ticker_comment_request = AtomApi::SupportTicketComment.new # SupportTicketComment | supportTickerCommentRequest


begin
  #Create a support ticket comment
  result = api_instance.create_support_ticket_comment_using_post(support_ticker_comment_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->create_support_ticket_comment_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticker_comment_request** | [**SupportTicketComment**](SupportTicketComment.md)| supportTickerCommentRequest | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_support_ticket_using_post**
> SupportTicket create_support_ticket_using_post(support_ticket_request)

Create a support ticket

Create a new support ticket for your firm.

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


api_instance = AtomApi::SupportApi.new

support_ticket_request = AtomApi::SupportTicket.new # SupportTicket | supportTicketRequest


begin
  #Create a support ticket
  result = api_instance.create_support_ticket_using_post(support_ticket_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->create_support_ticket_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_request** | [**SupportTicket**](SupportTicket.md)| supportTicketRequest | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_chat_using_delete**
> delete_chat_using_delete(chat_id)

Delete a Chat

Permanently delete a Chat

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


api_instance = AtomApi::SupportApi.new

chat_id = 'chat_id_example' # String | UUID chat_info_id


begin
  #Delete a Chat
  api_instance.delete_chat_using_delete(chat_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->delete_chat_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**String**](.md)| UUID chat_info_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_consultation_using_delete**
> delete_consultation_using_delete(consultation_id)

Delete a CIO Consultation

Permanently delete a CIO Consultation

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


api_instance = AtomApi::SupportApi.new

consultation_id = 'consultation_id_example' # String | UUID consultation_id


begin
  #Delete a CIO Consultation
  api_instance.delete_consultation_using_delete(consultation_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->delete_consultation_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation_id** | [**String**](.md)| UUID consultation_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_sale_using_delete**
> delete_sale_using_delete(sales_id)

Delete a sales inquiry

Permanently delete a sales inquiry.

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


api_instance = AtomApi::SupportApi.new

sales_id = 'sales_id_example' # String | UUID sales_id


begin
  #Delete a sales inquiry
  api_instance.delete_sale_using_delete(sales_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->delete_sale_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales_id** | [**String**](.md)| UUID sales_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_support_ticket_comment_using_delete**
> delete_support_ticket_comment_using_delete(support_ticket_comment_id)

Delete a support ticket comment

Permanently delete a support ticket comment for a support ticket.

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


api_instance = AtomApi::SupportApi.new

support_ticket_comment_id = 'support_ticket_comment_id_example' # String | UUID support_ticket_comment_id


begin
  #Delete a support ticket comment
  api_instance.delete_support_ticket_comment_using_delete(support_ticket_comment_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->delete_support_ticket_comment_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment_id** | [**String**](.md)| UUID support_ticket_comment_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_support_ticket_using_delete**
> delete_support_ticket_using_delete(support_ticket_id)

Delete a support ticket

Permanently delete a support ticket for your firm.

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


api_instance = AtomApi::SupportApi.new

support_ticket_id = 'support_ticket_id_example' # String | UUID support_ticket_id


begin
  #Delete a support ticket
  api_instance.delete_support_ticket_using_delete(support_ticket_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->delete_support_ticket_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_id** | [**String**](.md)| UUID support_ticket_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_chat_all_using_get**
> PageChatInfo get_chat_all_using_get(opts)

List all open chats

Get details for all open chat

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


api_instance = AtomApi::SupportApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all open chats
  result = api_instance.get_chat_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->get_chat_all_using_get: #{e}"
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

[**PageChatInfo**](PageChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_chat_using_get**
> ChatInfo get_chat_using_get(chat_id)

Retrieve a Chat

Retrieve the information for a Chat

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


api_instance = AtomApi::SupportApi.new

chat_id = 'chat_id_example' # String | UUID chat_info_id


begin
  #Retrieve a Chat
  result = api_instance.get_chat_using_get(chat_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->get_chat_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**String**](.md)| UUID chat_info_id | 

### Return type

[**ChatInfo**](ChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_consultation_all_using_get**
> PageConsultation get_consultation_all_using_get(opts)

List all CIO Consultation

Get details for all CIO Consultation

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


api_instance = AtomApi::SupportApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all CIO Consultation
  result = api_instance.get_consultation_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->get_consultation_all_using_get: #{e}"
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

[**PageConsultation**](PageConsultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_consultation_using_get**
> Consultation get_consultation_using_get(consultation_id)

Retrieve a CIO Consultation

Retrieve the information for a CIO Consultation

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


api_instance = AtomApi::SupportApi.new

consultation_id = 'consultation_id_example' # String | UUID consultation_id


begin
  #Retrieve a CIO Consultation
  result = api_instance.get_consultation_using_get(consultation_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->get_consultation_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation_id** | [**String**](.md)| UUID consultation_id | 

### Return type

[**Consultation**](Consultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_sale_all_using_get**
> PageSale get_sale_all_using_get(opts)

List all sales inquiries

Get all sales inquiries defined for your firm.

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


api_instance = AtomApi::SupportApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all sales inquiries
  result = api_instance.get_sale_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->get_sale_all_using_get: #{e}"
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

[**PageSale**](PageSale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_sale_using_get**
> Sale get_sale_using_get(sales_id)

Retrieve a sales record

Retrieve the information for a sales record

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


api_instance = AtomApi::SupportApi.new

sales_id = 'sales_id_example' # String | UUID sales_id


begin
  #Retrieve a sales record
  result = api_instance.get_sale_using_get(sales_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->get_sale_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales_id** | [**String**](.md)| UUID sales_id | 

### Return type

[**Sale**](Sale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_support_ticket_all_using_get**
> PageSupportTicket get_support_ticket_all_using_get(opts)

List all support tickets

Get the information for all support tickets defined for your firm.

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


api_instance = AtomApi::SupportApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all support tickets
  result = api_instance.get_support_ticket_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->get_support_ticket_all_using_get: #{e}"
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

[**PageSupportTicket**](PageSupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_support_ticket_comment_all_using_get**
> PageSupportTicketComment get_support_ticket_comment_all_using_get(opts)

List all support ticket comments

Get the information for all support ticket comments defined for your firm.

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


api_instance = AtomApi::SupportApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all support ticket comments
  result = api_instance.get_support_ticket_comment_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->get_support_ticket_comment_all_using_get: #{e}"
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

[**PageSupportTicketComment**](PageSupportTicketComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_support_ticket_comment_using_get**
> SupportTicketComment get_support_ticket_comment_using_get(support_ticket_comment_id)

Retrieve a support ticket comment

Retrieve the information for a support ticket comment defined for a support ticket.

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


api_instance = AtomApi::SupportApi.new

support_ticket_comment_id = 'support_ticket_comment_id_example' # String | UUID support_ticket_comment_id


begin
  #Retrieve a support ticket comment
  result = api_instance.get_support_ticket_comment_using_get(support_ticket_comment_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->get_support_ticket_comment_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment_id** | [**String**](.md)| UUID support_ticket_comment_id | 

### Return type

[**SupportTicketComment**](SupportTicketComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_support_ticket_using_get**
> SupportTicket get_support_ticket_using_get(support_ticket_id)

Retrieve a support ticket

Retrieve the information for a support ticket defined for your firm.

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


api_instance = AtomApi::SupportApi.new

support_ticket_id = 'support_ticket_id_example' # String | UUID support_ticket_id


begin
  #Retrieve a support ticket
  result = api_instance.get_support_ticket_using_get(support_ticket_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->get_support_ticket_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_id** | [**String**](.md)| UUID support_ticket_id | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_chat_using_put**
> ChatInfo update_chat_using_put(chat_id, chat_info)

Update a Chat

Updated the information for a Chat

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


api_instance = AtomApi::SupportApi.new

chat_id = 'chat_id_example' # String | UUID chat_id

chat_info = AtomApi::ChatInfo.new # ChatInfo | chat_info


begin
  #Update a Chat
  result = api_instance.update_chat_using_put(chat_id, chat_info)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->update_chat_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**String**](.md)| UUID chat_id | 
 **chat_info** | [**ChatInfo**](ChatInfo.md)| chat_info | 

### Return type

[**ChatInfo**](ChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_consultation_using_put**
> Consultation update_consultation_using_put(consultation, consultation_id)

Update a CIO Consultation

Updated the information CIO Consultation

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


api_instance = AtomApi::SupportApi.new

consultation = AtomApi::Consultation.new # Consultation | consultation

consultation_id = 'consultation_id_example' # String | UUID consultation_id


begin
  #Update a CIO Consultation
  result = api_instance.update_consultation_using_put(consultation, consultation_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->update_consultation_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation** | [**Consultation**](Consultation.md)| consultation | 
 **consultation_id** | [**String**](.md)| UUID consultation_id | 

### Return type

[**Consultation**](Consultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_sale_using_put**
> Sale update_sale_using_put(sales, sales_id)

Update a sales inquiry

Update the information for a sales inquiry. 

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


api_instance = AtomApi::SupportApi.new

sales = AtomApi::Sale.new # Sale | sales

sales_id = 'sales_id_example' # String | UUID sales_id


begin
  #Update a sales inquiry
  result = api_instance.update_sale_using_put(sales, sales_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->update_sale_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales** | [**Sale**](Sale.md)| sales | 
 **sales_id** | [**String**](.md)| UUID sales_id | 

### Return type

[**Sale**](Sale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_support_ticket_comment_using_put**
> SupportTicketComment update_support_ticket_comment_using_put(support_ticket_comment, support_ticket_comment_id)

Update a support ticket comment

Update the information for a support ticket comments defined for a support ticket.

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


api_instance = AtomApi::SupportApi.new

support_ticket_comment = AtomApi::SupportTicketComment.new # SupportTicketComment | support_ticket_comment

support_ticket_comment_id = 'support_ticket_comment_id_example' # String | UUID support_ticket_comment_id


begin
  #Update a support ticket comment
  result = api_instance.update_support_ticket_comment_using_put(support_ticket_comment, support_ticket_comment_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->update_support_ticket_comment_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment** | [**SupportTicketComment**](SupportTicketComment.md)| support_ticket_comment | 
 **support_ticket_comment_id** | [**String**](.md)| UUID support_ticket_comment_id | 

### Return type

[**SupportTicketComment**](SupportTicketComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_support_ticket_using_put**
> SupportTicket update_support_ticket_using_put(support_ticket, support_ticket_id)

Update a support ticket

Update the information for a support ticket defined for your firm.

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


api_instance = AtomApi::SupportApi.new

support_ticket = AtomApi::SupportTicket.new # SupportTicket | support_ticket

support_ticket_id = 'support_ticket_id_example' # String | UUID support_ticket_id


begin
  #Update a support ticket
  result = api_instance.update_support_ticket_using_put(support_ticket, support_ticket_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling SupportApi->update_support_ticket_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket** | [**SupportTicket**](SupportTicket.md)| support_ticket | 
 **support_ticket_id** | [**String**](.md)| UUID support_ticket_id | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



