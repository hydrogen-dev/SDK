# ProtonApi::PersonalFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**budget_calculator**](PersonalFinancialManagementApi.md#budget_calculator) | **POST** /budget_calculator | Budget Calculator
[**cash_flow_analysis**](PersonalFinancialManagementApi.md#cash_flow_analysis) | **POST** /cash_flow_analysis | Cash Flow Analysis
[**financial_picture**](PersonalFinancialManagementApi.md#financial_picture) | **POST** /financial_picture | Financial Picture


# **budget_calculator**
> Hash&lt;String, Object&gt; budget_calculator(budget_calculator_request)

Budget Calculator

Analyze spending against a defined budget

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


api_instance = ProtonApi::PersonalFinancialManagementApi.new

budget_calculator_request = ProtonApi::BudgetCalculatorRequest.new # BudgetCalculatorRequest | Request payload for Budget Calculator


begin
  #Budget Calculator
  result = api_instance.budget_calculator(budget_calculator_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling PersonalFinancialManagementApi->budget_calculator: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget_calculator_request** | [**BudgetCalculatorRequest**](BudgetCalculatorRequest.md)| Request payload for Budget Calculator | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **cash_flow_analysis**
> Hash&lt;String, Object&gt; cash_flow_analysis(cash_flow_analysis_request)

Cash Flow Analysis

Analyze income, expenses, and net income

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


api_instance = ProtonApi::PersonalFinancialManagementApi.new

cash_flow_analysis_request = ProtonApi::CashFlowAnalysisRequest.new # CashFlowAnalysisRequest | Request payload for Cash Flow Analysis


begin
  #Cash Flow Analysis
  result = api_instance.cash_flow_analysis(cash_flow_analysis_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling PersonalFinancialManagementApi->cash_flow_analysis: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cash_flow_analysis_request** | [**CashFlowAnalysisRequest**](CashFlowAnalysisRequest.md)| Request payload for Cash Flow Analysis | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **financial_picture**
> Hash&lt;String, Object&gt; financial_picture(financial_picture_request)

Financial Picture

Assess assets, liabilities, and net worth

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


api_instance = ProtonApi::PersonalFinancialManagementApi.new

financial_picture_request = ProtonApi::FinancialPictureRequest.new # FinancialPictureRequest | Request payload for Financial Picture


begin
  #Financial Picture
  result = api_instance.financial_picture(financial_picture_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling PersonalFinancialManagementApi->financial_picture: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_picture_request** | [**FinancialPictureRequest**](FinancialPictureRequest.md)| Request payload for Financial Picture | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



