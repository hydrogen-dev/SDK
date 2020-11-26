# ProtonApi::FinancialHealthApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**diversification_score**](FinancialHealthApi.md#diversification_score) | **POST** /diversification_score | Diversification Score
[**emergency_fund_calculator**](FinancialHealthApi.md#emergency_fund_calculator) | **POST** /emergency_fund_calculator | Emergency Fund Calculator
[**financial_health_check**](FinancialHealthApi.md#financial_health_check) | **POST** /financial_health_check | Financial Health Check
[**portfolio_optimization_score**](FinancialHealthApi.md#portfolio_optimization_score) | **POST** /portfolio_optimization_score | Portfolio Optimization Score


# **diversification_score**
> Hash&lt;String, Object&gt; diversification_score(diversification_score_request)

Diversification Score

Assess how well a group of investments is diversified

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

api_instance = ProtonApi::FinancialHealthApi.new

diversification_score_request = ProtonApi::DiversificationScoreRequest.new # DiversificationScoreRequest | Request payload for Diversification Score


begin
  #Diversification Score
  result = api_instance.diversification_score(diversification_score_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialHealthApi->diversification_score: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diversification_score_request** | [**DiversificationScoreRequest**](DiversificationScoreRequest.md)| Request payload for Diversification Score | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **emergency_fund_calculator**
> Hash&lt;String, Object&gt; emergency_fund_calculator(emergency_fund_calculator_request)

Emergency Fund Calculator

Calculate a target emergency fund amount and savings plan

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

api_instance = ProtonApi::FinancialHealthApi.new

emergency_fund_calculator_request = ProtonApi::EmergencyFundCalculatorRequest.new # EmergencyFundCalculatorRequest | Request payload for Emergency Fund Calculator


begin
  #Emergency Fund Calculator
  result = api_instance.emergency_fund_calculator(emergency_fund_calculator_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialHealthApi->emergency_fund_calculator: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emergency_fund_calculator_request** | [**EmergencyFundCalculatorRequest**](EmergencyFundCalculatorRequest.md)| Request payload for Emergency Fund Calculator | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **financial_health_check**
> Hash&lt;String, Object&gt; financial_health_check(financial_health_check_request)

Financial Health Check

Calculate a series of financial ratios to assess financial health

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

api_instance = ProtonApi::FinancialHealthApi.new

financial_health_check_request = ProtonApi::FinancialHealthCheckRequest.new # FinancialHealthCheckRequest | Request payload for Financial Health Check


begin
  #Financial Health Check
  result = api_instance.financial_health_check(financial_health_check_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialHealthApi->financial_health_check: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_health_check_request** | [**FinancialHealthCheckRequest**](FinancialHealthCheckRequest.md)| Request payload for Financial Health Check | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **portfolio_optimization_score**
> Hash&lt;String, Object&gt; portfolio_optimization_score(portfolio_optimization_score_request)

Portfolio Optimization Score

Analyze a group of investments against the optimized result

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

api_instance = ProtonApi::FinancialHealthApi.new

portfolio_optimization_score_request = ProtonApi::PortfolioOptimizationScoreRequest.new # PortfolioOptimizationScoreRequest | Request payload for Portfolio Optimization Score


begin
  #Portfolio Optimization Score
  result = api_instance.portfolio_optimization_score(portfolio_optimization_score_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialHealthApi->portfolio_optimization_score: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_optimization_score_request** | [**PortfolioOptimizationScoreRequest**](PortfolioOptimizationScoreRequest.md)| Request payload for Portfolio Optimization Score | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



