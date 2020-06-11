# ProtonApi::LifeInsuranceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**life_insurance_needs_calculator**](LifeInsuranceApi.md#life_insurance_needs_calculator) | **POST** /life_insurance/needs_calculator | Life Insurance Needs Calculator


# **life_insurance_needs_calculator**
> Hash&lt;String, Object&gt; life_insurance_needs_calculator(life_insurance_needs_calculator_request)

Life Insurance Needs Calculator

Calculate life insurance needs based on existing asset and liability data

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


api_instance = ProtonApi::LifeInsuranceApi.new

life_insurance_needs_calculator_request = ProtonApi::LifeInsuranceNeedsCalculatorRequest.new # LifeInsuranceNeedsCalculatorRequest | Request payload for Life Insurance Needs Calculator


begin
  #Life Insurance Needs Calculator
  result = api_instance.life_insurance_needs_calculator(life_insurance_needs_calculator_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling LifeInsuranceApi->life_insurance_needs_calculator: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **life_insurance_needs_calculator_request** | [**LifeInsuranceNeedsCalculatorRequest**](LifeInsuranceNeedsCalculatorRequest.md)| Request payload for Life Insurance Needs Calculator | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



