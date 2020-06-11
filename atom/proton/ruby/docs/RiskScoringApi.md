# ProtonApi::RiskScoringApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dimensional_risk_score**](RiskScoringApi.md#dimensional_risk_score) | **POST** /dimensional_risk_score | Dimensional Risk Score
[**risk_allocation**](RiskScoringApi.md#risk_allocation) | **POST** /risk_allocation | Risk Allocation
[**risk_score**](RiskScoringApi.md#risk_score) | **POST** /risk_score | Risk Score


# **dimensional_risk_score**
> Hash&lt;String, Object&gt; dimensional_risk_score(dimensional_risk_score_request)

Dimensional Risk Score

Calculate a dimensional risk score based on questionnaire responses

### Example
```ruby
# load the gem
require 'proton_api'
ProtonApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = ProtonApi::RiskScoringApi.new

dimensional_risk_score_request = ProtonApi::DimensionalRiskScoreRequest.new # DimensionalRiskScoreRequest | Request payload for Dimensional Risk Score


begin
  #Dimensional Risk Score
  result = api_instance.dimensional_risk_score(dimensional_risk_score_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling RiskScoringApi->dimensional_risk_score: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dimensional_risk_score_request** | [**DimensionalRiskScoreRequest**](DimensionalRiskScoreRequest.md)| Request payload for Dimensional Risk Score | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **risk_allocation**
> Hash&lt;String, Object&gt; risk_allocation(risk_allocation_request)

Risk Allocation

Allocate based on a risk score

### Example
```ruby
# load the gem
require 'proton_api'
ProtonApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = ProtonApi::RiskScoringApi.new

risk_allocation_request = ProtonApi::RiskAllocationRequest.new # RiskAllocationRequest | Request payload for Risk Allocation


begin
  #Risk Allocation
  result = api_instance.risk_allocation(risk_allocation_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling RiskScoringApi->risk_allocation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_allocation_request** | [**RiskAllocationRequest**](RiskAllocationRequest.md)| Request payload for Risk Allocation | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **risk_score**
> Hash&lt;String, Object&gt; risk_score(risk_score_request)

Risk Score

Calculate a risk score based on questionnaire responses

### Example
```ruby
# load the gem
require 'proton_api'
ProtonApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = ProtonApi::RiskScoringApi.new

risk_score_request = ProtonApi::RiskScoreRequest.new # RiskScoreRequest | Request payload for Risk Score

begin
  #Risk Score
  result = api_instance.risk_score(risk_score_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling RiskScoringApi->risk_score: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_score_request** | [**RiskScoreRequest**](RiskScoreRequest.md)| Request payload for Risk Score | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



