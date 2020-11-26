# ProtonApi::BusinessFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**business_financial_health_check**](BusinessFinancialManagementApi.md#business_financial_health_check) | **POST** /business/financial_health_check | Business Financial Health Check
[**cash_analysis**](BusinessFinancialManagementApi.md#cash_analysis) | **POST** /business/cash_analysis | Cash Analysis
[**customer_analysis**](BusinessFinancialManagementApi.md#customer_analysis) | **POST** /business/customer_analysis | Customer Analysis
[**financial_statement_analysis**](BusinessFinancialManagementApi.md#financial_statement_analysis) | **POST** /business/financial_statement_analysis | Financial Statement Analysis
[**invoice_analysis**](BusinessFinancialManagementApi.md#invoice_analysis) | **POST** /business/invoice_analysis | Invoice Analysis


# **business_financial_health_check**
> Hash&lt;String, Object&gt; business_financial_health_check(business_financial_health_check_request)

Business Financial Health Check

Calculate a series of financial ratios to assess business financial health

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

api_instance = ProtonApi::BusinessFinancialManagementApi.new

business_financial_health_check_request = ProtonApi::BusinessFinancialHealthCheckRequest.new # BusinessFinancialHealthCheckRequest | Request payload for Business Financial Health Check


begin
  #Business Financial Health Check
  result = api_instance.business_financial_health_check(business_financial_health_check_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling BusinessFinancialManagementApi->business_financial_health_check: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_financial_health_check_request** | [**BusinessFinancialHealthCheckRequest**](BusinessFinancialHealthCheckRequest.md)| Request payload for Business Financial Health Check | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **cash_analysis**
> Hash&lt;String, Object&gt; cash_analysis(cash_analysis_request)

Cash Analysis

Analyze cash activity over time

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

api_instance = ProtonApi::BusinessFinancialManagementApi.new

cash_analysis_request = ProtonApi::CashAnalysisRequest.new # CashAnalysisRequest | Request payload for Cash Analysis


begin
  #Cash Analysis
  result = api_instance.cash_analysis(cash_analysis_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling BusinessFinancialManagementApi->cash_analysis: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cash_analysis_request** | [**CashAnalysisRequest**](CashAnalysisRequest.md)| Request payload for Cash Analysis | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **customer_analysis**
> Hash&lt;String, Object&gt; customer_analysis(customer_analysis_request)

Customer Analysis

Analyze customer revenues over a time period

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

api_instance = ProtonApi::BusinessFinancialManagementApi.new

customer_analysis_request = ProtonApi::CustomerAnalysisRequest.new # CustomerAnalysisRequest | Request payload for Customer Analysis


begin
  #Customer Analysis
  result = api_instance.customer_analysis(customer_analysis_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling BusinessFinancialManagementApi->customer_analysis: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_analysis_request** | [**CustomerAnalysisRequest**](CustomerAnalysisRequest.md)| Request payload for Customer Analysis | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **financial_statement_analysis**
> Hash&lt;String, Object&gt; financial_statement_analysis(financial_statement_analysis_request)

Financial Statement Analysis

Analyze financial statement accounting data for a business

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

api_instance = ProtonApi::BusinessFinancialManagementApi.new

financial_statement_analysis_request = ProtonApi::FinancialStatementAnalysisRequest.new # FinancialStatementAnalysisRequest | Request payload for Financial Statement Analysis


begin
  #Financial Statement Analysis
  result = api_instance.financial_statement_analysis(financial_statement_analysis_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling BusinessFinancialManagementApi->financial_statement_analysis: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement_analysis_request** | [**FinancialStatementAnalysisRequest**](FinancialStatementAnalysisRequest.md)| Request payload for Financial Statement Analysis | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **invoice_analysis**
> Hash&lt;String, Object&gt; invoice_analysis(invoice_analysis_request)

Invoice Analysis

Analyze invoices to understand the context of money owed and paid to a business

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

api_instance = ProtonApi::BusinessFinancialManagementApi.new

invoice_analysis_request = ProtonApi::BusinessInvoiceAnalysisRequest.new # BusinessInvoiceAnalysisRequest | Request payload for Invoice Analysis


begin
  #Invoice Analysis
  result = api_instance.invoice_analysis(invoice_analysis_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling BusinessFinancialManagementApi->invoice_analysis: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_analysis_request** | [**BusinessInvoiceAnalysisRequest**](BusinessInvoiceAnalysisRequest.md)| Request payload for Invoice Analysis | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



