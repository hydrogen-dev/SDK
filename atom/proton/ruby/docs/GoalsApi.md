# ProtonApi::GoalsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goal_accumulation_allocation**](GoalsApi.md#goal_accumulation_allocation) | **POST** /goal_accumulation/allocation | Goal Accumulation Allocation
[**goal_accumulation_recommendation**](GoalsApi.md#goal_accumulation_recommendation) | **POST** /goal_accumulation/recommendation | Goal Accumulation Recommendation
[**goal_accumulation_status**](GoalsApi.md#goal_accumulation_status) | **POST** /goal_accumulation/status | Goal Accumulation Status
[**goal_decumulation_allocation**](GoalsApi.md#goal_decumulation_allocation) | **POST** /goal_decumulation/allocation | Goal Decumulation Allocation
[**goal_decumulation_recommendation**](GoalsApi.md#goal_decumulation_recommendation) | **POST** /goal_decumulation/recommendation | Goal Decumulation Recommendation
[**goal_decumulation_status**](GoalsApi.md#goal_decumulation_status) | **POST** /goal_decumulation/status | Goal Decumulation Status


# **goal_accumulation_allocation**
> Hash&lt;String, Object&gt; goal_accumulation_allocation(goal_accumulation_allocation_request)

Goal Accumulation Allocation

Allocate based on an accumulation goal

### Example
```ruby
# load the gem
require 'proton_api'
# setup authorization
ProtonApi.configure do |config|
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = ProtonApi::GoalsApi.new

goal_accumulation_allocation_request = ProtonApi::GoalAccumulationAllocationRequest.new # GoalAccumulationAllocationRequest | Request payload for Goal Accumulation Allocation


begin
  #Goal Accumulation Allocation
  result = api_instance.goal_accumulation_allocation(goal_accumulation_allocation_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling GoalsApi->goal_accumulation_allocation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_accumulation_allocation_request** | [**GoalAccumulationAllocationRequest**](GoalAccumulationAllocationRequest.md)| Request payload for Goal Accumulation Allocation | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **goal_accumulation_recommendation**
> Hash&lt;String, Object&gt; goal_accumulation_recommendation(goal_accumulation_recommendation_request)

Goal Accumulation Recommendation

Generate recommendations to achieve an accumulation goal

### Example
```ruby
# load the gem
require 'proton_api'
# setup authorization
ProtonApi.configure do |config|
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = ProtonApi::GoalsApi.new

goal_accumulation_recommendation_request = ProtonApi::GoalAccumulationRecommendationRequest.new # GoalAccumulationRecommendationRequest | Request payload for Goal Accumulation Recommendation


begin
  #Goal Accumulation Recommendation
  result = api_instance.goal_accumulation_recommendation(goal_accumulation_recommendation_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling GoalsApi->goal_accumulation_recommendation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_accumulation_recommendation_request** | [**GoalAccumulationRecommendationRequest**](GoalAccumulationRecommendationRequest.md)| Request payload for Goal Accumulation Recommendation | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **goal_accumulation_status**
> Hash&lt;String, Object&gt; goal_accumulation_status(goal_accumulation_status_request)

Goal Accumulation Status

Track the status of an accumulation goal

### Example
```ruby
# load the gem
require 'proton_api'
# setup authorization
ProtonApi.configure do |config|
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = ProtonApi::GoalsApi.new

goal_accumulation_status_request = ProtonApi::GoalAccumulationStatusRequest.new # GoalAccumulationStatusRequest | Request payload for Goal Accumulation Status


begin
  #Goal Accumulation Status
  result = api_instance.goal_accumulation_status(goal_accumulation_status_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling GoalsApi->goal_accumulation_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_accumulation_status_request** | [**GoalAccumulationStatusRequest**](GoalAccumulationStatusRequest.md)| Request payload for Goal Accumulation Status | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **goal_decumulation_allocation**
> Hash&lt;String, Object&gt; goal_decumulation_allocation(goal_decumulation_allocation_request)

Goal Decumulation Allocation

Allocate based on a decumulation goal

### Example
```ruby
# load the gem
require 'proton_api'
# setup authorization
ProtonApi.configure do |config|
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = ProtonApi::GoalsApi.new

goal_decumulation_allocation_request = ProtonApi::GoalDecumulationAllocationRequest.new # GoalDecumulationAllocationRequest | Request payload for Goal Decumulation Allocation


begin
  #Goal Decumulation Allocation
  result = api_instance.goal_decumulation_allocation(goal_decumulation_allocation_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling GoalsApi->goal_decumulation_allocation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_decumulation_allocation_request** | [**GoalDecumulationAllocationRequest**](GoalDecumulationAllocationRequest.md)| Request payload for Goal Decumulation Allocation | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **goal_decumulation_recommendation**
> Hash&lt;String, Object&gt; goal_decumulation_recommendation(goal_decumulation_recommendation_request)

Goal Decumulation Recommendation

Generate recommendations to achieve a decumulation goal

### Example
```ruby
# load the gem
require 'proton_api'
# setup authorization
ProtonApi.configure do |config|
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = ProtonApi::GoalsApi.new

goal_decumulation_recommendation_request = ProtonApi::GoalDecumulationRecommendationRequest.new # GoalDecumulationRecommendationRequest | Request payload for Goal Decumulation Recommendation


begin
  #Goal Decumulation Recommendation
  result = api_instance.goal_decumulation_recommendation(goal_decumulation_recommendation_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling GoalsApi->goal_decumulation_recommendation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_decumulation_recommendation_request** | [**GoalDecumulationRecommendationRequest**](GoalDecumulationRecommendationRequest.md)| Request payload for Goal Decumulation Recommendation | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **goal_decumulation_status**
> Hash&lt;String, Object&gt; goal_decumulation_status(goal_decumulation_status_request)

Goal Decumulation Status

Track the status of a decumulation goal

### Example
```ruby
# load the gem
require 'proton_api'
# setup authorization
ProtonApi.configure do |config|
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = ProtonApi::GoalsApi.new

goal_decumulation_status_request = ProtonApi::GoalDecumulationStatusRequest.new # GoalDecumulationStatusRequest | Request payload for Goal Decumulation Status


begin
  #Goal Decumulation Status
  result = api_instance.goal_decumulation_status(goal_decumulation_status_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling GoalsApi->goal_decumulation_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_decumulation_status_request** | [**GoalDecumulationStatusRequest**](GoalDecumulationStatusRequest.md)| Request payload for Goal Decumulation Status | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



