# AtomApi::FeatureApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_feature_track_using_post**](FeatureApi.md#create_feature_track_using_post) | **POST** /feature_track | Create a Feature Track
[**create_feature_using_post**](FeatureApi.md#create_feature_using_post) | **POST** /feature | Create a  Feature
[**delete_feature_track_using_delete**](FeatureApi.md#delete_feature_track_using_delete) | **DELETE** /feature_track/{feature_track_id} | Delete a Feature Track
[**delete_feature_using_delete**](FeatureApi.md#delete_feature_using_delete) | **DELETE** /feature/{feature_id} | Delete a Feature
[**get_feature_all_using_get**](FeatureApi.md#get_feature_all_using_get) | **GET** /feature | List all Feature
[**get_feature_track_all_using_get**](FeatureApi.md#get_feature_track_all_using_get) | **GET** /feature_track | List all Feature track
[**get_feature_track_using_get**](FeatureApi.md#get_feature_track_using_get) | **GET** /feature_track/{feature_track_id} | Retrieve a Feature track
[**get_feature_using_get**](FeatureApi.md#get_feature_using_get) | **GET** /feature/{feature_id} | Retrieve a Feature
[**update_feature_track_using_put**](FeatureApi.md#update_feature_track_using_put) | **PUT** /feature_track/{feature_track_id} | Update a Feature Track
[**update_feature_using_put**](FeatureApi.md#update_feature_using_put) | **PUT** /feature/{feature_id} | Update a Feature


# **create_feature_track_using_post**
> FeatureTrack create_feature_track_using_post(feature_track)

Create a Feature Track

Create a new feature track.

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


api_instance = AtomApi::FeatureApi.new

feature_track = AtomApi::FeatureTrack.new # FeatureTrack | featureTrack


begin
  #Create a Feature Track
  result = api_instance.create_feature_track_using_post(feature_track)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FeatureApi->create_feature_track_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_track** | [**FeatureTrack**](FeatureTrack.md)| featureTrack | 

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_feature_using_post**
> Feature create_feature_using_post(feature)

Create a  Feature

Create a new feature.

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


api_instance = AtomApi::FeatureApi.new

feature = AtomApi::Feature.new # Feature | feature


begin
  #Create a  Feature
  result = api_instance.create_feature_using_post(feature)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FeatureApi->create_feature_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature** | [**Feature**](Feature.md)| feature | 

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_feature_track_using_delete**
> delete_feature_track_using_delete(feature_track_id)

Delete a Feature Track

Permanently delete a feature track registered with your firm.

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


api_instance = AtomApi::FeatureApi.new

feature_track_id = 'feature_track_id_example' # String | UUID feature_track_id


begin
  #Delete a Feature Track
  api_instance.delete_feature_track_using_delete(feature_track_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling FeatureApi->delete_feature_track_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_track_id** | [**String**](.md)| UUID feature_track_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_feature_using_delete**
> delete_feature_using_delete(feature_id)

Delete a Feature

Permanently delete a  feature registered with your firm.

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


api_instance = AtomApi::FeatureApi.new

feature_id = 'feature_id_example' # String | UUID feature_id


begin
  #Delete a Feature
  api_instance.delete_feature_using_delete(feature_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling FeatureApi->delete_feature_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_id** | [**String**](.md)| UUID feature_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_feature_all_using_get**
> PageFeature get_feature_all_using_get(opts)

List all Feature

Get details for all features.

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


api_instance = AtomApi::FeatureApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all Feature
  result = api_instance.get_feature_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FeatureApi->get_feature_all_using_get: #{e}"
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

[**PageFeature**](PageFeature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_feature_track_all_using_get**
> PageFeatureTrack get_feature_track_all_using_get(opts)

List all Feature track

Get details for all feature track.

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


api_instance = AtomApi::FeatureApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all Feature track
  result = api_instance.get_feature_track_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FeatureApi->get_feature_track_all_using_get: #{e}"
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

[**PageFeatureTrack**](PageFeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_feature_track_using_get**
> FeatureTrack get_feature_track_using_get(feature_track_id)

Retrieve a Feature track

Retrieve the information for a Feature track.

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


api_instance = AtomApi::FeatureApi.new

feature_track_id = 'feature_track_id_example' # String | UUID feature_track_id


begin
  #Retrieve a Feature track
  result = api_instance.get_feature_track_using_get(feature_track_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FeatureApi->get_feature_track_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_track_id** | [**String**](.md)| UUID feature_track_id | 

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_feature_using_get**
> Feature get_feature_using_get(feature_id)

Retrieve a Feature

Retrieve the information for a Feature.

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


api_instance = AtomApi::FeatureApi.new

feature_id = 'feature_id_example' # String | UUID feature_id


begin
  #Retrieve a Feature
  result = api_instance.get_feature_using_get(feature_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FeatureApi->get_feature_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_id** | [**String**](.md)| UUID feature_id | 

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_feature_track_using_put**
> FeatureTrack update_feature_track_using_put(feature_track, feature_track_id)

Update a Feature Track

Update the information for a Feature track registered with your firm.

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


api_instance = AtomApi::FeatureApi.new

feature_track = AtomApi::FeatureTrack.new # FeatureTrack | feature_track

feature_track_id = 'feature_track_id_example' # String | UUID feature_track_id


begin
  #Update a Feature Track
  result = api_instance.update_feature_track_using_put(feature_track, feature_track_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FeatureApi->update_feature_track_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_track** | [**FeatureTrack**](FeatureTrack.md)| feature_track | 
 **feature_track_id** | [**String**](.md)| UUID feature_track_id | 

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_feature_using_put**
> Feature update_feature_using_put(feature, feature_id)

Update a Feature

Update the information for a Feature registered with your firm.

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


api_instance = AtomApi::FeatureApi.new

feature = AtomApi::Feature.new # Feature | feature

feature_id = 'feature_id_example' # String | UUID feature_id


begin
  #Update a Feature
  result = api_instance.update_feature_using_put(feature, feature_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FeatureApi->update_feature_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature** | [**Feature**](Feature.md)| feature | 
 **feature_id** | [**String**](.md)| UUID feature_id | 

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



