# ProtonApi::SimulationsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backtest**](SimulationsApi.md#backtest) | **POST** /backtest | Backtest
[**event_study**](SimulationsApi.md#event_study) | **POST** /event_study | Event Study
[**monte_carlo**](SimulationsApi.md#monte_carlo) | **POST** /monte_carlo | Monte Carlo
[**portfolio_what_if**](SimulationsApi.md#portfolio_what_if) | **POST** /portfolio_what_if | Porfolio What-If
[**savings_calculator**](SimulationsApi.md#savings_calculator) | **POST** /savings_calculator | Savings Calculator
[**scenario_analysis**](SimulationsApi.md#scenario_analysis) | **POST** /scenario_analysis | Scenario Analysis
[**sensitivity_analysis**](SimulationsApi.md#sensitivity_analysis) | **POST** /sensitivity_analysis | Sensitivity Analysis


# **backtest**
> Hash&lt;String, Object&gt; backtest(backtest_request)

Backtest

Run a historical analysis for a group of investments

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


api_instance = ProtonApi::SimulationsApi.new

backtest_request = ProtonApi::BacktestRequest.new # BacktestRequest | Request payload for Backtest


begin
  #Backtest
  result = api_instance.backtest(backtest_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling SimulationsApi->backtest: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backtest_request** | [**BacktestRequest**](BacktestRequest.md)| Request payload for Backtest | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **event_study**
> Hash&lt;String, Object&gt; event_study(event_study_request)

Event Study

Analyze a group of investments against key historical events

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


api_instance = ProtonApi::SimulationsApi.new

event_study_request = ProtonApi::EventStudyRequest.new # EventStudyRequest | Request payload for Event Study


begin
  #Event Study
  result = api_instance.event_study(event_study_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling SimulationsApi->event_study: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_study_request** | [**EventStudyRequest**](EventStudyRequest.md)| Request payload for Event Study | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **monte_carlo**
> Hash&lt;String, Object&gt; monte_carlo(monte_carlo_request)

Monte Carlo

Simulate the future growth of a group of investments

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


api_instance = ProtonApi::SimulationsApi.new

monte_carlo_request = ProtonApi::MonteCarloRequest.new # MonteCarloRequest | Request payload for Monte Carlo


begin
  #Monte Carlo
  result = api_instance.monte_carlo(monte_carlo_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling SimulationsApi->monte_carlo: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monte_carlo_request** | [**MonteCarloRequest**](MonteCarloRequest.md)| Request payload for Monte Carlo | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **portfolio_what_if**
> Hash&lt;String, Object&gt; portfolio_what_if(portfolio_what_if_request)

Porfolio What-If

Simulate the impact of adding, removing, reducing, or increasing various positions in a group of investments

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


api_instance = ProtonApi::SimulationsApi.new

portfolio_what_if_request = ProtonApi::PortfolioWhatIfRequest.new # PortfolioWhatIfRequest | Request payload for Portfolio What-If


begin
  #Porfolio What-If
  result = api_instance.portfolio_what_if(portfolio_what_if_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling SimulationsApi->portfolio_what_if: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_what_if_request** | [**PortfolioWhatIfRequest**](PortfolioWhatIfRequest.md)| Request payload for Portfolio What-If | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **savings_calculator**
> Hash&lt;String, Object&gt; savings_calculator(savings_calculator_request)

Savings Calculator

Simulate the future growth of a simple savings account

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


api_instance = ProtonApi::SimulationsApi.new

savings_calculator_request = ProtonApi::SavingsCalculatorRequest.new # SavingsCalculatorRequest | Request payload for Savings Calculator


begin
  #Savings Calculator
  result = api_instance.savings_calculator(savings_calculator_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling SimulationsApi->savings_calculator: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savings_calculator_request** | [**SavingsCalculatorRequest**](SavingsCalculatorRequest.md)| Request payload for Savings Calculator | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **scenario_analysis**
> Hash&lt;String, Object&gt; scenario_analysis(scneario_analysis_request)

Scenario Analysis

Analyze a group of investments against a series of external economic factors

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


api_instance = ProtonApi::SimulationsApi.new

scneario_analysis_request = ProtonApi::ScenarioAnalysisRequest.new # ScenarioAnalysisRequest | Request payload for Scenario Analysis


begin
  #Scenario Analysis
  result = api_instance.scenario_analysis(scneario_analysis_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling SimulationsApi->scenario_analysis: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scneario_analysis_request** | [**ScenarioAnalysisRequest**](ScenarioAnalysisRequest.md)| Request payload for Scenario Analysis | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **sensitivity_analysis**
> Hash&lt;String, Object&gt; sensitivity_analysis(sensitivity_analysis_request)

Sensitivity Analysis

Analyze a group of investments against an external economic factor

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


api_instance = ProtonApi::SimulationsApi.new

sensitivity_analysis_request = ProtonApi::SensitivityAnalysisRequest.new # SensitivityAnalysisRequest | Request payload for Sensitivity Analysis


begin
  #Sensitivity Analysis
  result = api_instance.sensitivity_analysis(sensitivity_analysis_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling SimulationsApi->sensitivity_analysis: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensitivity_analysis_request** | [**SensitivityAnalysisRequest**](SensitivityAnalysisRequest.md)| Request payload for Sensitivity Analysis | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



