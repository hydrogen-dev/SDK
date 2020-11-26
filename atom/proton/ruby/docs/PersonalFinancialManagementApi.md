# ProtonApi::PersonalFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**budget_calculator**](PersonalFinancialManagementApi.md#budget_calculator) | **POST** /budget_calculator | Budget Calculator
[**cash_flow_analysis**](PersonalFinancialManagementApi.md#cash_flow_analysis) | **POST** /cash_flow_analysis | Cash Flow Analysis
[**fee_analysis**](PersonalFinancialManagementApi.md#fee_analysis) | **POST** /fee_analysis | RFee Analysis
[**financial_picture**](PersonalFinancialManagementApi.md#financial_picture) | **POST** /financial_picture | Financial Picture
[**recurring_transaction_analysis**](PersonalFinancialManagementApi.md#recurring_transaction_analysis) | **POST** /recurring_transaction_analysis | Recurring Transaction Analysis


# **budget_calculator**
> Hash&lt;String, Object&gt; budget_calculator(budget_calculator_request)

Budget Calculator

Analyze spending against a defined budget

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
# setup authorization
ProtonApi.configure do |config|
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
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



# **fee_analysis**
> Hash&lt;String, Object&gt; fee_analysis(fee_analysis_request)

RFee Analysis

Analyze fee data

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

api_instance = ProtonApi::PersonalFinancialManagementApi.new

fee_analysis_request = ProtonApi::FeeAnalysisRequest.new # FeeAnalysisRequest | Request payload for Fee Analysis


begin
  #RFee Analysis
  result = api_instance.fee_analysis(fee_analysis_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling PersonalFinancialManagementApi->fee_analysis: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fee_analysis_request** | [**FeeAnalysisRequest**](FeeAnalysisRequest.md)| Request payload for Fee Analysis | 

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
# setup authorization
ProtonApi.configure do |config|
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
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



# **recurring_transaction_analysis**
> Hash&lt;String, Object&gt; recurring_transaction_analysis(recurring_transaction_analysis_request)

Recurring Transaction Analysis

Analyze recurring transactions

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

api_instance = ProtonApi::PersonalFinancialManagementApi.new

recurring_transaction_analysis_request = ProtonApi::RecurringTransactionAnalysisRequest.new # RecurringTransactionAnalysisRequest | Request payload for Recurring Transaction Analysis


begin
  #Recurring Transaction Analysis
  result = api_instance.recurring_transaction_analysis(recurring_transaction_analysis_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling PersonalFinancialManagementApi->recurring_transaction_analysis: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurring_transaction_analysis_request** | [**RecurringTransactionAnalysisRequest**](RecurringTransactionAnalysisRequest.md)| Request payload for Recurring Transaction Analysis | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



