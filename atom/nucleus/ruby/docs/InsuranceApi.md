# NucleusApi::InsuranceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_insurance_coverage_using_post**](InsuranceApi.md#create_insurance_coverage_using_post) | **POST** /insurance_coverage | Create a insurance coverage request
[**create_insurance_discount_using_post**](InsuranceApi.md#create_insurance_discount_using_post) | **POST** /insurance_discount | Create a insurance discount request
[**create_insurance_quote_using_post**](InsuranceApi.md#create_insurance_quote_using_post) | **POST** /insurance_quote | Create a insuranceQuote request
[**delete_insurance_coverage_using_delete**](InsuranceApi.md#delete_insurance_coverage_using_delete) | **DELETE** /insurance_coverage/{insurance_coverage_id} | Delete an insurance coverage request
[**delete_insurance_discount_using_delete**](InsuranceApi.md#delete_insurance_discount_using_delete) | **DELETE** /insurance_discount/{insurance_discount_id} | Delete an insurance discount request
[**delete_insurance_quote_using_delete**](InsuranceApi.md#delete_insurance_quote_using_delete) | **DELETE** /insurance_quote/{insurance_quote_id} | Delete a insuranceQuote request
[**get_insurance_coverage_all_using_get**](InsuranceApi.md#get_insurance_coverage_all_using_get) | **GET** /insurance_coverage | Get all insurance coverage request
[**get_insurance_coverage_using_get**](InsuranceApi.md#get_insurance_coverage_using_get) | **GET** /insurance_coverage/{insurance_coverage_id} | Get a insurance coverage request
[**get_insurance_discount_all_using_get**](InsuranceApi.md#get_insurance_discount_all_using_get) | **GET** /insurance_discount | Get all insurance discount request
[**get_insurance_discount_using_get**](InsuranceApi.md#get_insurance_discount_using_get) | **GET** /insurance_discount/{insurance_discount_id} | Get a insurance discount request
[**get_insurance_quote_all_using_get**](InsuranceApi.md#get_insurance_quote_all_using_get) | **GET** /insurance_quote | List all insuranceQuote requests
[**get_insurance_quote_using_get**](InsuranceApi.md#get_insurance_quote_using_get) | **GET** /insurance_quote/{insurance_quote_id} | Retrieve a insuranceQuote request
[**update_insurance_coverage_using_put**](InsuranceApi.md#update_insurance_coverage_using_put) | **PUT** /insurance_coverage/{insurance_coverage_id} | Update a insurance coverage request
[**update_insurance_discount_using_put**](InsuranceApi.md#update_insurance_discount_using_put) | **PUT** /insurance_discount/{insurance_discount_id} | Update an insurance discount 
[**update_insurance_quote_using_put**](InsuranceApi.md#update_insurance_quote_using_put) | **PUT** /insurance_quote/{insurance_quote_id} | Update a insuranceQuote request


# **create_insurance_coverage_using_post**
> InsuranceCoverage create_insurance_coverage_using_post(insurance_coverage)

Create a insurance coverage request

Create a new insurance coverage.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_coverage = NucleusApi::InsuranceCoverage.new # InsuranceCoverage | insuranceCoverage


begin
  #Create a insurance coverage request
  result = api_instance.create_insurance_coverage_using_post(insurance_coverage)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->create_insurance_coverage_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage** | [**InsuranceCoverage**](InsuranceCoverage.md)| insuranceCoverage | 

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_insurance_discount_using_post**
> InsuranceDiscount create_insurance_discount_using_post(insurance_discount)

Create a insurance discount request

Create a new insurance discount.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_discount = NucleusApi::InsuranceDiscount.new # InsuranceDiscount | insuranceDiscount


begin
  #Create a insurance discount request
  result = api_instance.create_insurance_discount_using_post(insurance_discount)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->create_insurance_discount_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount** | [**InsuranceDiscount**](InsuranceDiscount.md)| insuranceDiscount | 

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_insurance_quote_using_post**
> InsuranceQuote create_insurance_quote_using_post(insurance_quote)

Create a insuranceQuote request

Create a new insuranceQuote request.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_quote = NucleusApi::InsuranceQuote.new # InsuranceQuote | insuranceQuote


begin
  #Create a insuranceQuote request
  result = api_instance.create_insurance_quote_using_post(insurance_quote)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->create_insurance_quote_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote** | [**InsuranceQuote**](InsuranceQuote.md)| insuranceQuote | 

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_insurance_coverage_using_delete**
> delete_insurance_coverage_using_delete(insurance_coverage_id)

Delete an insurance coverage request

Delete an  insurance coverage.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_coverage_id = 'insurance_coverage_id_example' # String | UUID insurance_coverage_id


begin
  #Delete an insurance coverage request
  api_instance.delete_insurance_coverage_using_delete(insurance_coverage_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->delete_insurance_coverage_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage_id** | [**String**](.md)| UUID insurance_coverage_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_insurance_discount_using_delete**
> delete_insurance_discount_using_delete(insurance_discount_id)

Delete an insurance discount request

Delete an  insurance discount.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_discount_id = 'insurance_discount_id_example' # String | UUID insurance_discount_id


begin
  #Delete an insurance discount request
  api_instance.delete_insurance_discount_using_delete(insurance_discount_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->delete_insurance_discount_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount_id** | [**String**](.md)| UUID insurance_discount_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_insurance_quote_using_delete**
> delete_insurance_quote_using_delete(insurance_quote, insurance_quote_id)

Delete a insuranceQuote request

Permanently delete a insuranceQuote request.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_quote = 'insurance_quote_example' # String | UUID insurance_quote_id

insurance_quote_id = 'insurance_quote_id_example' # String | insurance_quote_id


begin
  #Delete a insuranceQuote request
  api_instance.delete_insurance_quote_using_delete(insurance_quote, insurance_quote_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->delete_insurance_quote_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote** | [**String**](.md)| UUID insurance_quote_id | 
 **insurance_quote_id** | [**String**](.md)| insurance_quote_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_insurance_coverage_all_using_get**
> PageInsuranceCoverage get_insurance_coverage_all_using_get(opts)

Get all insurance coverage request

Get all new insurance coverage.

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


api_instance = NucleusApi::InsuranceApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #Get all insurance coverage request
  result = api_instance.get_insurance_coverage_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->get_insurance_coverage_all_using_get: #{e}"
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

[**PageInsuranceCoverage**](PageInsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_insurance_coverage_using_get**
> InsuranceCoverage get_insurance_coverage_using_get(insurance_coverage_id)

Get a insurance coverage request

Get a new insurance coverage.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_coverage_id = 'insurance_coverage_id_example' # String | UUID insurance_coverage_id


begin
  #Get a insurance coverage request
  result = api_instance.get_insurance_coverage_using_get(insurance_coverage_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->get_insurance_coverage_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage_id** | [**String**](.md)| UUID insurance_coverage_id | 

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_insurance_discount_all_using_get**
> PageInsuranceDiscount get_insurance_discount_all_using_get(opts)

Get all insurance discount request

Get all new insurance discount.

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


api_instance = NucleusApi::InsuranceApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #Get all insurance discount request
  result = api_instance.get_insurance_discount_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->get_insurance_discount_all_using_get: #{e}"
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

[**PageInsuranceDiscount**](PageInsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_insurance_discount_using_get**
> InsuranceDiscount get_insurance_discount_using_get(insurance_discount_id)

Get a insurance discount request

Get a new insurance discount.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_discount_id = 'insurance_discount_id_example' # String |  UUID insurance_discount_id


begin
  #Get a insurance discount request
  result = api_instance.get_insurance_discount_using_get(insurance_discount_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->get_insurance_discount_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount_id** | [**String**](.md)|  UUID insurance_discount_id | 

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_insurance_quote_all_using_get**
> PageInsuranceQuote get_insurance_quote_all_using_get(opts)

List all insuranceQuote requests

Get the information for all insuranceQuote requests.

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


api_instance = NucleusApi::InsuranceApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all insuranceQuote requests
  result = api_instance.get_insurance_quote_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->get_insurance_quote_all_using_get: #{e}"
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

[**PageInsuranceQuote**](PageInsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_insurance_quote_using_get**
> InsuranceQuote get_insurance_quote_using_get(insurance_quote, insurance_quote_id)

Retrieve a insuranceQuote request

Retrieve the information for a insuranceQuote request.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_quote = 'insurance_quote_example' # String | UUID insurance_quote_id

insurance_quote_id = 'insurance_quote_id_example' # String | insurance_quote_id


begin
  #Retrieve a insuranceQuote request
  result = api_instance.get_insurance_quote_using_get(insurance_quote, insurance_quote_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->get_insurance_quote_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote** | [**String**](.md)| UUID insurance_quote_id | 
 **insurance_quote_id** | [**String**](.md)| insurance_quote_id | 

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_insurance_coverage_using_put**
> InsuranceCoverage update_insurance_coverage_using_put(insurance_coverage, insurance_coverage_id)

Update a insurance coverage request

Update a new insurance coverage.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_coverage = NucleusApi::InsuranceCoverage.new # InsuranceCoverage | insurance_coverage

insurance_coverage_id = 'insurance_coverage_id_example' # String | UUID insurance_coverage_id


begin
  #Update a insurance coverage request
  result = api_instance.update_insurance_coverage_using_put(insurance_coverage, insurance_coverage_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->update_insurance_coverage_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage** | [**InsuranceCoverage**](InsuranceCoverage.md)| insurance_coverage | 
 **insurance_coverage_id** | [**String**](.md)| UUID insurance_coverage_id | 

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_insurance_discount_using_put**
> InsuranceDiscount update_insurance_discount_using_put(insurance_discount, insurance_discount_id)

Update an insurance discount 

Update an new insurance .

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


api_instance = NucleusApi::InsuranceApi.new

insurance_discount = NucleusApi::InsuranceDiscount.new # InsuranceDiscount | insurance_discount

insurance_discount_id = 'insurance_discount_id_example' # String | UUID insurance_discount_id


begin
  #Update an insurance discount 
  result = api_instance.update_insurance_discount_using_put(insurance_discount, insurance_discount_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->update_insurance_discount_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount** | [**InsuranceDiscount**](InsuranceDiscount.md)| insurance_discount | 
 **insurance_discount_id** | [**String**](.md)| UUID insurance_discount_id | 

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_insurance_quote_using_put**
> InsuranceQuote update_insurance_quote_using_put(insurance_quote, insurance_quote_id)

Update a insuranceQuote request

Update the information for a insuranceQuote request.

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


api_instance = NucleusApi::InsuranceApi.new

insurance_quote = NucleusApi::InsuranceQuote.new # InsuranceQuote | insurance_quote

insurance_quote_id = 'insurance_quote_id_example' # String | UUID insurance_quote_id


begin
  #Update a insuranceQuote request
  result = api_instance.update_insurance_quote_using_put(insurance_quote, insurance_quote_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling InsuranceApi->update_insurance_quote_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote** | [**InsuranceQuote**](InsuranceQuote.md)| insurance_quote | 
 **insurance_quote_id** | [**String**](.md)| UUID insurance_quote_id | 

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



