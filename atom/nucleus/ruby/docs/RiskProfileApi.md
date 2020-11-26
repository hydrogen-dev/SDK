# NucleusApi::RiskProfileApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_risk_profile_using_post**](RiskProfileApi.md#create_risk_profile_using_post) | **POST** /risk_profile | Create a Risk Profile
[**delete_risk_profile_using_delete**](RiskProfileApi.md#delete_risk_profile_using_delete) | **DELETE** /risk_profile/{risk_profile_id} | Delete a Risk Profile
[**get_risk_profile_all_using_get**](RiskProfileApi.md#get_risk_profile_all_using_get) | **GET** /risk_profile | Get All Risk Profile
[**get_risk_profile_using_get**](RiskProfileApi.md#get_risk_profile_using_get) | **GET** /risk_profile/{risk_profile_id} | Get a Risk Profile
[**update_risk_profile_using_put**](RiskProfileApi.md#update_risk_profile_using_put) | **PUT** /risk_profile/{risk_profile_id} | Update a Risk Profile


# **create_risk_profile_using_post**
> RiskProfile create_risk_profile_using_post(risk_profile)

Create a Risk Profile

Create a new Risk Profile. 

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

api_instance = NucleusApi::RiskProfileApi.new

risk_profile = NucleusApi::RiskProfile.new # RiskProfile | riskProfile


begin
  #Create a Risk Profile
  result = api_instance.create_risk_profile_using_post(risk_profile)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RiskProfileApi->create_risk_profile_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_profile** | [**RiskProfile**](RiskProfile.md)| riskProfile | 

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_risk_profile_using_delete**
> delete_risk_profile_using_delete(risk_profile_id)

Delete a Risk Profile

Permanently Delete a Risk Profile.

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

api_instance = NucleusApi::RiskProfileApi.new

risk_profile_id = 'risk_profile_id_example' # String | UUID risk_profile_id


begin
  #Delete a Risk Profile
  api_instance.delete_risk_profile_using_delete(risk_profile_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling RiskProfileApi->delete_risk_profile_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_profile_id** | [**String**](.md)| UUID risk_profile_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_risk_profile_all_using_get**
> PageRiskProfile get_risk_profile_all_using_get(opts)

Get All Risk Profile

Get All Risk Profile. 

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

api_instance = NucleusApi::RiskProfileApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #Get All Risk Profile
  result = api_instance.get_risk_profile_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RiskProfileApi->get_risk_profile_all_using_get: #{e}"
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

[**PageRiskProfile**](PageRiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_risk_profile_using_get**
> RiskProfile get_risk_profile_using_get(risk_profile_id)

Get a Risk Profile

Get a Risk Profile. 

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

api_instance = NucleusApi::RiskProfileApi.new

risk_profile_id = 'risk_profile_id_example' # String | UUID risk_profile_id


begin
  #Get a Risk Profile
  result = api_instance.get_risk_profile_using_get(risk_profile_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RiskProfileApi->get_risk_profile_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_profile_id** | [**String**](.md)| UUID risk_profile_id | 

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_risk_profile_using_put**
> RiskProfile update_risk_profile_using_put(risk_profile, risk_profile_id)

Update a Risk Profile

Update a Risk Profile. 

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

api_instance = NucleusApi::RiskProfileApi.new

risk_profile = NucleusApi::RiskProfile.new # RiskProfile | risk_profile

risk_profile_id = 'risk_profile_id_example' # String | UUID risk_profile_id


begin
  #Update a Risk Profile
  result = api_instance.update_risk_profile_using_put(risk_profile, risk_profile_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RiskProfileApi->update_risk_profile_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_profile** | [**RiskProfile**](RiskProfile.md)| risk_profile | 
 **risk_profile_id** | [**String**](.md)| UUID risk_profile_id | 

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



