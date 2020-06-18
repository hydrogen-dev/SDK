# NucleusApi::InvoiceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_invoice_payment_using_post**](InvoiceApi.md#create_invoice_payment_using_post) | **POST** /invoice_payment | Create a invoicePayment
[**create_invoice_using_post**](InvoiceApi.md#create_invoice_using_post) | **POST** /invoice | Create a invoice
[**delete_invoice_payment_using_delete**](InvoiceApi.md#delete_invoice_payment_using_delete) | **DELETE** /invoice_payment/{invoice_payment_id} | Delete a invoicePayment
[**delete_invoice_using_delete**](InvoiceApi.md#delete_invoice_using_delete) | **DELETE** /invoice/{invoice_id} | Delete a invoice
[**get_invoice_all_using_get**](InvoiceApi.md#get_invoice_all_using_get) | **GET** /invoice | List all invoice
[**get_invoice_payment_all_using_get**](InvoiceApi.md#get_invoice_payment_all_using_get) | **GET** /invoice_payment | List all invoicePayment
[**get_invoice_payment_using_get**](InvoiceApi.md#get_invoice_payment_using_get) | **GET** /invoice_payment/{invoice_payment_id} | Retrieve a invoicePayment
[**get_invoice_using_get**](InvoiceApi.md#get_invoice_using_get) | **GET** /invoice/{invoice_id} | Retrieve a invoice
[**update_invoice_payment_using_put**](InvoiceApi.md#update_invoice_payment_using_put) | **PUT** /invoice_payment/{invoice_payment_id} | Update a invoicePayment
[**update_invoice_using_put**](InvoiceApi.md#update_invoice_using_put) | **PUT** /invoice/{invoice_id} | Update a invoice


# **create_invoice_payment_using_post**
> InvoicePayment create_invoice_payment_using_post(invoice_payment)

Create a invoicePayment

Create a new invoicePayment, for tracking invoice status.

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


api_instance = NucleusApi::InvoiceApi.new

invoice_payment = NucleusApi::InvoicePayment.new # InvoicePayment | invoicePayment


begin
  #Create a invoicePayment
  result = api_instance.create_invoice_payment_using_post(invoice_payment)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InvoiceApi->create_invoice_payment_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment** | [**InvoicePayment**](InvoicePayment.md)| invoicePayment | 

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_invoice_using_post**
> Invoice create_invoice_using_post(invoice)

Create a invoice

Create a new invoice, with your firm.

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


api_instance = NucleusApi::InvoiceApi.new

invoice = NucleusApi::Invoice.new # Invoice | invoice


begin
  #Create a invoice
  result = api_instance.create_invoice_using_post(invoice)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InvoiceApi->create_invoice_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice | 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_invoice_payment_using_delete**
> delete_invoice_payment_using_delete(invoice_payment_id)

Delete a invoicePayment

Delete a invoicePayment. 

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


api_instance = NucleusApi::InvoiceApi.new

invoice_payment_id = 'invoice_payment_id_example' # String | UUID invoice_payment_id


begin
  #Delete a invoicePayment
  api_instance.delete_invoice_payment_using_delete(invoice_payment_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling InvoiceApi->delete_invoice_payment_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment_id** | [**String**](.md)| UUID invoice_payment_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_invoice_using_delete**
> delete_invoice_using_delete(invoice_id)

Delete a invoice

Delete a invoice. 

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


api_instance = NucleusApi::InvoiceApi.new

invoice_id = 'invoice_id_example' # String | UUID invoice_id


begin
  #Delete a invoice
  api_instance.delete_invoice_using_delete(invoice_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling InvoiceApi->delete_invoice_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | [**String**](.md)| UUID invoice_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_invoice_all_using_get**
> PageInvoice get_invoice_all_using_get(opts)

List all invoice

List all invoice. 

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


api_instance = NucleusApi::InvoiceApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all invoice
  result = api_instance.get_invoice_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InvoiceApi->get_invoice_all_using_get: #{e}"
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

[**PageInvoice**](PageInvoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_invoice_payment_all_using_get**
> PageInvoicePayment get_invoice_payment_all_using_get(opts)

List all invoicePayment

List all invoicePayment. 

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


api_instance = NucleusApi::InvoiceApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all invoicePayment
  result = api_instance.get_invoice_payment_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InvoiceApi->get_invoice_payment_all_using_get: #{e}"
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

[**PageInvoicePayment**](PageInvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_invoice_payment_using_get**
> InvoicePayment get_invoice_payment_using_get(invoice_payment_id)

Retrieve a invoicePayment

Retrieve a invoicePayment. 

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


api_instance = NucleusApi::InvoiceApi.new

invoice_payment_id = 'invoice_payment_id_example' # String | UUID invoice_payment_id


begin
  #Retrieve a invoicePayment
  result = api_instance.get_invoice_payment_using_get(invoice_payment_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InvoiceApi->get_invoice_payment_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment_id** | [**String**](.md)| UUID invoice_payment_id | 

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_invoice_using_get**
> Invoice get_invoice_using_get(invoice_id)

Retrieve a invoice

Retrieve a invoice. 

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


api_instance = NucleusApi::InvoiceApi.new

invoice_id = 'invoice_id_example' # String | UUID invoice_idd


begin
  #Retrieve a invoice
  result = api_instance.get_invoice_using_get(invoice_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InvoiceApi->get_invoice_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | [**String**](.md)| UUID invoice_idd | 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_invoice_payment_using_put**
> InvoicePayment update_invoice_payment_using_put(invoice_payment, invoice_payment_id)

Update a invoicePayment

Update a invoicePayment. 

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


api_instance = NucleusApi::InvoiceApi.new

invoice_payment = NucleusApi::InvoicePayment.new # InvoicePayment | invoice_payment

invoice_payment_id = 'invoice_payment_id_example' # String | UUID invoice_payment_id


begin
  #Update a invoicePayment
  result = api_instance.update_invoice_payment_using_put(invoice_payment, invoice_payment_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InvoiceApi->update_invoice_payment_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment** | [**InvoicePayment**](InvoicePayment.md)| invoice_payment | 
 **invoice_payment_id** | [**String**](.md)| UUID invoice_payment_id | 

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_invoice_using_put**
> Invoice update_invoice_using_put(invoice, invoice_id)

Update a invoice

Update a invoice. 

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


api_instance = NucleusApi::InvoiceApi.new

invoice = NucleusApi::Invoice.new # Invoice | invoice

invoice_id = 'invoice_id_example' # String | UUID invoice_id


begin
  #Update a invoice
  result = api_instance.update_invoice_using_put(invoice, invoice_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InvoiceApi->update_invoice_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice | 
 **invoice_id** | [**String**](.md)| UUID invoice_id | 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



