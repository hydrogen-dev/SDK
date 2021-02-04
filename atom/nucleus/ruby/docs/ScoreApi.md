# NucleusApi::ScoreApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_score_using_post**](ScoreApi.md#create_score_using_post) | **POST** /score | Create a score
[**delete_score_using_delete**](ScoreApi.md#delete_score_using_delete) | **DELETE** /score/{score_id} | Delete a score
[**get_score_all_using_get**](ScoreApi.md#get_score_all_using_get) | **GET** /score | List all scores
[**get_score_using_get**](ScoreApi.md#get_score_using_get) | **GET** /score/{score_id} | Retrieve a score
[**update_score_using_put**](ScoreApi.md#update_score_using_put) | **PUT** /score/{score_id} | Update a score


# **create_score_using_post**
> Score create_score_using_post(score)

Create a score

Create a score for a client, account, goal, portfolio, allocation, model, benchmark or security.

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

api_instance = NucleusApi::ScoreApi.new

score = NucleusApi::Score.new # Score | score


begin
  #Create a score
  result = api_instance.create_score_using_post(score)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ScoreApi->create_score_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score** | [**Score**](Score.md)| score | 

### Return type

[**Score**](Score.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_score_using_delete**
> delete_score_using_delete(score_id)

Delete a score

Permanently delete a score

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

api_instance = NucleusApi::ScoreApi.new

score_id = 'score_id_example' # String | UUID score_id


begin
  #Delete a score
  api_instance.delete_score_using_delete(score_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling ScoreApi->delete_score_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score_id** | [**String**](.md)| UUID score_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_score_all_using_get**
> PageScore get_score_all_using_get(opts)

List all scores

Get information for all scores stored for your firm.

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

api_instance = NucleusApi::ScoreApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all scores
  result = api_instance.get_score_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ScoreApi->get_score_all_using_get: #{e}"
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

[**PageScore**](PageScore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_score_using_get**
> Score get_score_using_get(score_id)

Retrieve a score

Retrieve the information for a specific score associated with a client, account, goal, portfolio, allocation, model, benchmark or security.

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

api_instance = NucleusApi::ScoreApi.new

score_id = 'score_id_example' # String | UUID score_id


begin
  #Retrieve a score
  result = api_instance.get_score_using_get(score_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ScoreApi->get_score_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score_id** | [**String**](.md)| UUID score_id | 

### Return type

[**Score**](Score.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_score_using_put**
> Score update_score_using_put(score, score_id)

Update a score

Update the information for a score.

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

api_instance = NucleusApi::ScoreApi.new

score = nil # Object | score

score_id = 'score_id_example' # String | UUID score_id


begin
  #Update a score
  result = api_instance.update_score_using_put(score, score_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ScoreApi->update_score_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score** | **Object**| score | 
 **score_id** | [**String**](.md)| UUID score_id | 

### Return type

[**Score**](Score.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



