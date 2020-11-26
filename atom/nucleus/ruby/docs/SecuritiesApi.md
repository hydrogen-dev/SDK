# NucleusApi::SecuritiesApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_security_exclusion_using_post**](SecuritiesApi.md#create_security_exclusion_using_post) | **POST** /security_exclusion | Create a security exclusion
[**create_security_price_using_post**](SecuritiesApi.md#create_security_price_using_post) | **POST** /security_price | Create a security price
[**create_security_using_post**](SecuritiesApi.md#create_security_using_post) | **POST** /security | Create a security
[**delete_security_exclusion_using_delete**](SecuritiesApi.md#delete_security_exclusion_using_delete) | **DELETE** /security_exclusion/{security_exclusion_id} | Delete a security exclusion
[**delete_security_price_using_delete**](SecuritiesApi.md#delete_security_price_using_delete) | **DELETE** /security_price/{security_price_id} | Delete a security price
[**delete_security_using_delete**](SecuritiesApi.md#delete_security_using_delete) | **DELETE** /security/{security_id} | Delete a security
[**get_security_all_using_get**](SecuritiesApi.md#get_security_all_using_get) | **GET** /security | List all securities
[**get_security_exclusion_all_using_get**](SecuritiesApi.md#get_security_exclusion_all_using_get) | **GET** /security_exclusion | List all security exclusions
[**get_security_exclusion_using_get**](SecuritiesApi.md#get_security_exclusion_using_get) | **GET** /security_exclusion/{security_exclusion_id} | Retrieve a security exclusion
[**get_security_price_all_using_get**](SecuritiesApi.md#get_security_price_all_using_get) | **GET** /security_price | List all security prices
[**get_security_price_using_get**](SecuritiesApi.md#get_security_price_using_get) | **GET** /security_price/{security_price_id} | Retrieve a security price
[**get_security_using_get**](SecuritiesApi.md#get_security_using_get) | **GET** /security/{security_id} | Retrieve a security
[**update_security_exclusion_using_put**](SecuritiesApi.md#update_security_exclusion_using_put) | **PUT** /security_exclusion/{security_exclusion_id} | Update a security exclusion
[**update_security_price_using_put**](SecuritiesApi.md#update_security_price_using_put) | **PUT** /security_price/{security_price_id} | Update a security price
[**update_security_using_put**](SecuritiesApi.md#update_security_using_put) | **PUT** /security/{security_id} | Update a security


# **create_security_exclusion_using_post**
> SecurityExclusion create_security_exclusion_using_post(security_exclusion_request)

Create a security exclusion

Create a new security exclusion for a specific account or portfolio.

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

api_instance = NucleusApi::SecuritiesApi.new

security_exclusion_request = NucleusApi::SecurityExclusion.new # SecurityExclusion | securityExclusionRequest


begin
  #Create a security exclusion
  result = api_instance.create_security_exclusion_using_post(security_exclusion_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->create_security_exclusion_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_exclusion_request** | [**SecurityExclusion**](SecurityExclusion.md)| securityExclusionRequest | 

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_security_price_using_post**
> SecurityPrice create_security_price_using_post(security_price_request)

Create a security price

Create a new price for a security defined for your firm.

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

api_instance = NucleusApi::SecuritiesApi.new

security_price_request = NucleusApi::SecurityPrice.new # SecurityPrice | securityPriceRequest


begin
  #Create a security price
  result = api_instance.create_security_price_using_post(security_price_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->create_security_price_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_price_request** | [**SecurityPrice**](SecurityPrice.md)| securityPriceRequest | 

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_security_using_post**
> Security create_security_using_post(securities_info_request)

Create a security

Create a new security for your firm.

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

api_instance = NucleusApi::SecuritiesApi.new

securities_info_request = NucleusApi::Security.new # Security | securitiesInfoRequest


begin
  #Create a security
  result = api_instance.create_security_using_post(securities_info_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->create_security_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securities_info_request** | [**Security**](Security.md)| securitiesInfoRequest | 

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_security_exclusion_using_delete**
> delete_security_exclusion_using_delete(security_exclusion_id)

Delete a security exclusion

Permanently delete a security exclusion

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

api_instance = NucleusApi::SecuritiesApi.new

security_exclusion_id = 'security_exclusion_id_example' # String | UUID security_exclusion_id


begin
  #Delete a security exclusion
  api_instance.delete_security_exclusion_using_delete(security_exclusion_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->delete_security_exclusion_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_exclusion_id** | [**String**](.md)| UUID security_exclusion_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_security_price_using_delete**
> delete_security_price_using_delete(security_price_id)

Delete a security price

Permanently delete a security price from a security.

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

api_instance = NucleusApi::SecuritiesApi.new

security_price_id = 'security_price_id_example' # String | UUID security_price_id


begin
  #Delete a security price
  api_instance.delete_security_price_using_delete(security_price_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->delete_security_price_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_price_id** | [**String**](.md)| UUID security_price_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_security_using_delete**
> delete_security_using_delete(security_id)

Delete a security

Permanently delete a security for your firm.

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

api_instance = NucleusApi::SecuritiesApi.new

security_id = 'security_id_example' # String | UUID security_id


begin
  #Delete a security
  api_instance.delete_security_using_delete(security_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->delete_security_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_id** | [**String**](.md)| UUID security_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_security_all_using_get**
> PageSecurity get_security_all_using_get(opts)

List all securities

Get details for all securities defined for your firm.

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

api_instance = NucleusApi::SecuritiesApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all securities
  result = api_instance.get_security_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->get_security_all_using_get: #{e}"
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

[**PageSecurity**](PageSecurity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_security_exclusion_all_using_get**
> PageSecurityExclusion get_security_exclusion_all_using_get(opts)

List all security exclusions

Get details for all security exclusions defined for your firm.

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

api_instance = NucleusApi::SecuritiesApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all security exclusions
  result = api_instance.get_security_exclusion_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->get_security_exclusion_all_using_get: #{e}"
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

[**PageSecurityExclusion**](PageSecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_security_exclusion_using_get**
> SecurityExclusion get_security_exclusion_using_get(security_exclusion_id)

Retrieve a security exclusion

Retrieve the information for a security exclusion.

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

api_instance = NucleusApi::SecuritiesApi.new

security_exclusion_id = 'security_exclusion_id_example' # String | UUID security_exclusion_id


begin
  #Retrieve a security exclusion
  result = api_instance.get_security_exclusion_using_get(security_exclusion_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->get_security_exclusion_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_exclusion_id** | [**String**](.md)| UUID security_exclusion_id | 

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_security_price_all_using_get**
> PageSecurityPrice get_security_price_all_using_get(opts)

List all security prices

Get prices for all securities defined for your firm.

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

api_instance = NucleusApi::SecuritiesApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  currency_conversion: 'currency_conversion_example', # String | currency_conversion
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all security prices
  result = api_instance.get_security_price_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->get_security_price_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **currency_conversion** | **String**| currency_conversion | [optional] 
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageSecurityPrice**](PageSecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_security_price_using_get**
> SecurityPrice get_security_price_using_get(security_price_id, opts)

Retrieve a security price

Retrieve the information for a security price for a security.

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

api_instance = NucleusApi::SecuritiesApi.new

security_price_id = 'security_price_id_example' # String | UUID security_price_id

opts = { 
  currency_conversion: 'currency_conversion_example' # String | USD
}

begin
  #Retrieve a security price
  result = api_instance.get_security_price_using_get(security_price_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->get_security_price_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_price_id** | [**String**](.md)| UUID security_price_id | 
 **currency_conversion** | **String**| USD | [optional] 

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_security_using_get**
> Security get_security_using_get(security_id)

Retrieve a security

Retrieve the information for a security defined for your firm.

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

api_instance = NucleusApi::SecuritiesApi.new

security_id = 'security_id_example' # String | UUID security_id


begin
  #Retrieve a security
  result = api_instance.get_security_using_get(security_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->get_security_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_id** | [**String**](.md)| UUID security_id | 

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_security_exclusion_using_put**
> SecurityExclusion update_security_exclusion_using_put(security_exclusion, security_exclusion_id)

Update a security exclusion

Update the information for a security exclusion.

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

api_instance = NucleusApi::SecuritiesApi.new

security_exclusion = NucleusApi::SecurityExclusion.new # SecurityExclusion | security_exclusion

security_exclusion_id = 'security_exclusion_id_example' # String | UUID security_exclusion_id


begin
  #Update a security exclusion
  result = api_instance.update_security_exclusion_using_put(security_exclusion, security_exclusion_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->update_security_exclusion_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_exclusion** | [**SecurityExclusion**](SecurityExclusion.md)| security_exclusion | 
 **security_exclusion_id** | [**String**](.md)| UUID security_exclusion_id | 

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_security_price_using_put**
> SecurityPrice update_security_price_using_put(security_price, security_price_id)

Update a security price

Update a security price for a security.

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

api_instance = NucleusApi::SecuritiesApi.new

security_price = NucleusApi::SecurityPrice.new # SecurityPrice | security_price

security_price_id = 'security_price_id_example' # String | UUID security_price_id


begin
  #Update a security price
  result = api_instance.update_security_price_using_put(security_price, security_price_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->update_security_price_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_price** | [**SecurityPrice**](SecurityPrice.md)| security_price | 
 **security_price_id** | [**String**](.md)| UUID security_price_id | 

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_security_using_put**
> Security update_security_using_put(security, security_id)

Update a security

Update a security for your firm.

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

api_instance = NucleusApi::SecuritiesApi.new

security = NucleusApi::Security.new # Security | security

security_id = 'security_id_example' # String | UUID security_id


begin
  #Update a security
  result = api_instance.update_security_using_put(security, security_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling SecuritiesApi->update_security_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security** | [**Security**](Security.md)| security | 
 **security_id** | [**String**](.md)| UUID security_id | 

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



