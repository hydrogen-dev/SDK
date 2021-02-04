# ProtonApi::FinancialPlanningApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**education_calculator_annual_cost**](FinancialPlanningApi.md#education_calculator_annual_cost) | **POST** /education_calculator/annual_cost | Education Calculator - Annual Cost
[**education_calculator_deposit_amount**](FinancialPlanningApi.md#education_calculator_deposit_amount) | **POST** /education_calculator/deposit_amount | Education Calculator - Deposit Amount
[**education_calculator_percent_covered**](FinancialPlanningApi.md#education_calculator_percent_covered) | **POST** /education_calculator/percent_covered | Education Calculator - Percent Covered
[**mortgage_calculator_down_payment**](FinancialPlanningApi.md#mortgage_calculator_down_payment) | **POST** /mortgage_calculator/down_payment | Mortgage Calculator - Down Payment
[**mortgage_calculator_home_price**](FinancialPlanningApi.md#mortgage_calculator_home_price) | **POST** /mortgage_calculator/home_price | Mortgage Calculator - Home Price
[**mortgage_calculator_periodic_payment**](FinancialPlanningApi.md#mortgage_calculator_periodic_payment) | **POST** /mortgage_calculator/periodic_payment | Mortgage Calculator - Periodic Payment
[**purchase_calculator_amount**](FinancialPlanningApi.md#purchase_calculator_amount) | **POST** /purchase_calculator/amount | Purchase Calculator - Amount
[**purchase_calculator_deposit_amount**](FinancialPlanningApi.md#purchase_calculator_deposit_amount) | **POST** /purchase_calculator/deposit_amount | Purchase Calculator - Deposit Amount
[**purchase_calculator_horizon**](FinancialPlanningApi.md#purchase_calculator_horizon) | **POST** /purchase_calculator/horizon | Purchase Calculator - Horizon
[**retirement_calculator_deposit_amount**](FinancialPlanningApi.md#retirement_calculator_deposit_amount) | **POST** /retirement_calculator/deposit_amount | Retirement Calculator - Deposit Amount
[**retirement_calculator_expenses**](FinancialPlanningApi.md#retirement_calculator_expenses) | **POST** /retirement_calculator/expenses | Retirement Calculator - Expenses
[**retirement_calculator_percent_covered**](FinancialPlanningApi.md#retirement_calculator_percent_covered) | **POST** /retirement_calculator/percent_covered | Retirement Calculator - Percent Covered


# **education_calculator_annual_cost**
> Hash&lt;String, Object&gt; education_calculator_annual_cost(education_calculator_annual_cost_request)

Education Calculator - Annual Cost

Calculate the achievable education costs

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
api_instance = ProtonApi::FinancialPlanningApi.new

education_calculator_annual_cost_request = ProtonApi::EducationCalculatorAnnualCostRequest.new # EducationCalculatorAnnualCostRequest | Request payload for Education Calculator - Annual Cost


begin
  #Education Calculator - Annual Cost
  result = api_instance.education_calculator_annual_cost(education_calculator_annual_cost_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->education_calculator_annual_cost: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **education_calculator_annual_cost_request** | [**EducationCalculatorAnnualCostRequest**](EducationCalculatorAnnualCostRequest.md)| Request payload for Education Calculator - Annual Cost | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **education_calculator_deposit_amount**
> Hash&lt;String, Object&gt; education_calculator_deposit_amount(education_calculator_deposit_amount_request)

Education Calculator - Deposit Amount

Calculate the necessary periodic deposit amount to achieve education costs

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
api_instance = ProtonApi::FinancialPlanningApi.new

education_calculator_deposit_amount_request = ProtonApi::EducationCalculatorDepositAmountRequest.new # EducationCalculatorDepositAmountRequest | Request payload for Education Calculator - Deposit Amount


begin
  #Education Calculator - Deposit Amount
  result = api_instance.education_calculator_deposit_amount(education_calculator_deposit_amount_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->education_calculator_deposit_amount: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **education_calculator_deposit_amount_request** | [**EducationCalculatorDepositAmountRequest**](EducationCalculatorDepositAmountRequest.md)| Request payload for Education Calculator - Deposit Amount | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **education_calculator_percent_covered**
> Hash&lt;String, Object&gt; education_calculator_percent_covered(education_calculator_percent_covered_request)

Education Calculator - Percent Covered

Calculate the achievable percentage of education costs that can be covered

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
api_instance = ProtonApi::FinancialPlanningApi.new

education_calculator_percent_covered_request = ProtonApi::EducationCalculatorPercentCoveredRequest.new # EducationCalculatorPercentCoveredRequest | Request payload for Education Calculator - Percent Covered


begin
  #Education Calculator - Percent Covered
  result = api_instance.education_calculator_percent_covered(education_calculator_percent_covered_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->education_calculator_percent_covered: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **education_calculator_percent_covered_request** | [**EducationCalculatorPercentCoveredRequest**](EducationCalculatorPercentCoveredRequest.md)| Request payload for Education Calculator - Percent Covered | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **mortgage_calculator_down_payment**
> Hash&lt;String, Object&gt; mortgage_calculator_down_payment(mortgage_calculator_down_payment_request)

Mortgage Calculator - Down Payment

Calculate the necessary down payment for the mortgage

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
api_instance = ProtonApi::FinancialPlanningApi.new

mortgage_calculator_down_payment_request = ProtonApi::MortgageCalculatorDownPaymentRequest.new # MortgageCalculatorDownPaymentRequest | Request payload for Mortgage Calculator - Down Payment


begin
  #Mortgage Calculator - Down Payment
  result = api_instance.mortgage_calculator_down_payment(mortgage_calculator_down_payment_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->mortgage_calculator_down_payment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgage_calculator_down_payment_request** | [**MortgageCalculatorDownPaymentRequest**](MortgageCalculatorDownPaymentRequest.md)| Request payload for Mortgage Calculator - Down Payment | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **mortgage_calculator_home_price**
> Hash&lt;String, Object&gt; mortgage_calculator_home_price(mortgage_calculator_home_price_request)

Mortgage Calculator - Home Price

Calculate the achievable home price for the mortgage

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
api_instance = ProtonApi::FinancialPlanningApi.new

mortgage_calculator_home_price_request = ProtonApi::MortgageCalculatorHomePriceRequest.new # MortgageCalculatorHomePriceRequest | Request payload for Mortgage Calculator - Home Price


begin
  #Mortgage Calculator - Home Price
  result = api_instance.mortgage_calculator_home_price(mortgage_calculator_home_price_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->mortgage_calculator_home_price: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgage_calculator_home_price_request** | [**MortgageCalculatorHomePriceRequest**](MortgageCalculatorHomePriceRequest.md)| Request payload for Mortgage Calculator - Home Price | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **mortgage_calculator_periodic_payment**
> Hash&lt;String, Object&gt; mortgage_calculator_periodic_payment(mortgage_calculator_periodic_payment_request)

Mortgage Calculator - Periodic Payment

Calculate the periodic payment for the mortgage

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
api_instance = ProtonApi::FinancialPlanningApi.new

mortgage_calculator_periodic_payment_request = ProtonApi::MortgageCalculatorPeriodicPaymentRequest.new # MortgageCalculatorPeriodicPaymentRequest | Request payload for Mortgage Calculator - Periodic Payment


begin
  #Mortgage Calculator - Periodic Payment
  result = api_instance.mortgage_calculator_periodic_payment(mortgage_calculator_periodic_payment_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->mortgage_calculator_periodic_payment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgage_calculator_periodic_payment_request** | [**MortgageCalculatorPeriodicPaymentRequest**](MortgageCalculatorPeriodicPaymentRequest.md)| Request payload for Mortgage Calculator - Periodic Payment | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **purchase_calculator_amount**
> Hash&lt;String, Object&gt; purchase_calculator_amount(purchase_calculator_amount_request)

Purchase Calculator - Amount

Calculate the achievable purchase amount

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
api_instance = ProtonApi::FinancialPlanningApi.new

purchase_calculator_amount_request = ProtonApi::PurchaseCalculatorAmountRequest.new # PurchaseCalculatorAmountRequest | Request payload for Purchase Calculator - Amount


begin
  #Purchase Calculator - Amount
  result = api_instance.purchase_calculator_amount(purchase_calculator_amount_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->purchase_calculator_amount: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchase_calculator_amount_request** | [**PurchaseCalculatorAmountRequest**](PurchaseCalculatorAmountRequest.md)| Request payload for Purchase Calculator - Amount | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **purchase_calculator_deposit_amount**
> Hash&lt;String, Object&gt; purchase_calculator_deposit_amount(purchase_calculator_deposit_amount_request)

Purchase Calculator - Deposit Amount

Calculate the necessary periodic deposit amount to achieve the purchase amount

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
api_instance = ProtonApi::FinancialPlanningApi.new

purchase_calculator_deposit_amount_request = ProtonApi::PurchaseCalculatorDepositAmountRequest.new # PurchaseCalculatorDepositAmountRequest | Request payload for Purchase Calculator - Deposit Amount


begin
  #Purchase Calculator - Deposit Amount
  result = api_instance.purchase_calculator_deposit_amount(purchase_calculator_deposit_amount_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->purchase_calculator_deposit_amount: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchase_calculator_deposit_amount_request** | [**PurchaseCalculatorDepositAmountRequest**](PurchaseCalculatorDepositAmountRequest.md)| Request payload for Purchase Calculator - Deposit Amount | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **purchase_calculator_horizon**
> Hash&lt;String, Object&gt; purchase_calculator_horizon(purchase_calculator_horizon_request)

Purchase Calculator - Horizon

Calculate the necessary time horizon to achieve the purchase amount

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
api_instance = ProtonApi::FinancialPlanningApi.new

purchase_calculator_horizon_request = ProtonApi::PurchaseCalculatorHorizonRequest.new # PurchaseCalculatorHorizonRequest | Request payload for Purchase Calculator - Horizon


begin
  #Purchase Calculator - Horizon
  result = api_instance.purchase_calculator_horizon(purchase_calculator_horizon_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->purchase_calculator_horizon: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchase_calculator_horizon_request** | [**PurchaseCalculatorHorizonRequest**](PurchaseCalculatorHorizonRequest.md)| Request payload for Purchase Calculator - Horizon | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **retirement_calculator_deposit_amount**
> Hash&lt;String, Object&gt; retirement_calculator_deposit_amount(retirement_calculator_deposit_amount_request)

Retirement Calculator - Deposit Amount

Calculate the necessary period deposit amount to achieve the retirement expenses

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
api_instance = ProtonApi::FinancialPlanningApi.new

retirement_calculator_deposit_amount_request = ProtonApi::RetirementCalculatorDepositAmountRequest.new # RetirementCalculatorDepositAmountRequest | Request payload for Retirement Calculator - Deposit AMount


begin
  #Retirement Calculator - Deposit Amount
  result = api_instance.retirement_calculator_deposit_amount(retirement_calculator_deposit_amount_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->retirement_calculator_deposit_amount: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirement_calculator_deposit_amount_request** | [**RetirementCalculatorDepositAmountRequest**](RetirementCalculatorDepositAmountRequest.md)| Request payload for Retirement Calculator - Deposit AMount | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **retirement_calculator_expenses**
> Hash&lt;String, Object&gt; retirement_calculator_expenses(retirement_calculator_expenses_request)

Retirement Calculator - Expenses

Calculate the achievable retirement expenses

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
api_instance = ProtonApi::FinancialPlanningApi.new

retirement_calculator_expenses_request = ProtonApi::RetirementCalculatorExpensesRequest.new # RetirementCalculatorExpensesRequest | Request payload for Retirement Calculator - Expenses


begin
  #Retirement Calculator - Expenses
  result = api_instance.retirement_calculator_expenses(retirement_calculator_expenses_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->retirement_calculator_expenses: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirement_calculator_expenses_request** | [**RetirementCalculatorExpensesRequest**](RetirementCalculatorExpensesRequest.md)| Request payload for Retirement Calculator - Expenses | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **retirement_calculator_percent_covered**
> Hash&lt;String, Object&gt; retirement_calculator_percent_covered(retirement_calculator_percent_covered_request)

Retirement Calculator - Percent Covered

Calculate the achievable percentage of retirement expenses that can be covered

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
api_instance = ProtonApi::FinancialPlanningApi.new

retirement_calculator_percent_covered_request = ProtonApi::RetirementCalculatorPercentCoveredRequest.new # RetirementCalculatorPercentCoveredRequest | Request payload for Retirement Calculator - Percent Covered


begin
  #Retirement Calculator - Percent Covered
  result = api_instance.retirement_calculator_percent_covered(retirement_calculator_percent_covered_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling FinancialPlanningApi->retirement_calculator_percent_covered: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirement_calculator_percent_covered_request** | [**RetirementCalculatorPercentCoveredRequest**](RetirementCalculatorPercentCoveredRequest.md)| Request payload for Retirement Calculator - Percent Covered | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



