# ProtonApi::AnnuitiesApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annuity_calculator_accumulation_horizon**](AnnuitiesApi.md#annuity_calculator_accumulation_horizon) | **POST** /annuity_calculator/accumulation_horizon | Annuity Calculator - Accumulation Horizon
[**annuity_calculator_annuity_amount**](AnnuitiesApi.md#annuity_calculator_annuity_amount) | **POST** /annuity_calculator/annuity_amount | Annuity Calculator - Annuity Amount
[**annuity_calculator_decumulation_horizon**](AnnuitiesApi.md#annuity_calculator_decumulation_horizon) | **POST** /annuity_calculator/decumulation_horizon | Annuity Calculator - Decumulation Horizon
[**annuity_calculator_deposit_amount**](AnnuitiesApi.md#annuity_calculator_deposit_amount) | **POST** /annuity_calculator/deposit_amount | Annuity Calculator - Deposit Amount
[**annuity_calculator_initial_balance**](AnnuitiesApi.md#annuity_calculator_initial_balance) | **POST** /annuity_calculator/initial_balance | Annuity Calculator - Initial Balance
[**variable_annuity**](AnnuitiesApi.md#variable_annuity) | **POST** /variable_annuity | Variable Annuity


# **annuity_calculator_accumulation_horizon**
> Hash&lt;String, Object&gt; annuity_calculator_accumulation_horizon(annuity_calculator_accumulation_horizon_request)

Annuity Calculator - Accumulation Horizon

Calculate the necessary fixed annuity contribution period

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


api_instance = ProtonApi::AnnuitiesApi.new

annuity_calculator_accumulation_horizon_request = ProtonApi::AnnuityCalculatorAccumulationHorizonRequest.new # AnnuityCalculatorAccumulationHorizonRequest | Request payload for Annuity Calculator - Accumulation Horizon


begin
  #Annuity Calculator - Accumulation Horizon
  result = api_instance.annuity_calculator_accumulation_horizon(annuity_calculator_accumulation_horizon_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling AnnuitiesApi->annuity_calculator_accumulation_horizon: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_accumulation_horizon_request** | [**AnnuityCalculatorAccumulationHorizonRequest**](AnnuityCalculatorAccumulationHorizonRequest.md)| Request payload for Annuity Calculator - Accumulation Horizon | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **annuity_calculator_annuity_amount**
> Hash&lt;String, Object&gt; annuity_calculator_annuity_amount(annuity_calculator_annuity_amount_request)

Annuity Calculator - Annuity Amount

Calculate the achievable fixed annuity amount

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


api_instance = ProtonApi::AnnuitiesApi.new

annuity_calculator_annuity_amount_request = ProtonApi::AnnuityCalculatorAnnuityAmountRequest.new # AnnuityCalculatorAnnuityAmountRequest | Request payload for Annuity Calculator - Annuity Amount


begin
  #Annuity Calculator - Annuity Amount
  result = api_instance.annuity_calculator_annuity_amount(annuity_calculator_annuity_amount_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling AnnuitiesApi->annuity_calculator_annuity_amount: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_annuity_amount_request** | [**AnnuityCalculatorAnnuityAmountRequest**](AnnuityCalculatorAnnuityAmountRequest.md)| Request payload for Annuity Calculator - Annuity Amount | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **annuity_calculator_decumulation_horizon**
> Hash&lt;String, Object&gt; annuity_calculator_decumulation_horizon(annuity_calculator_decumulation_horizon_request)

Annuity Calculator - Decumulation Horizon

Calculate the achievable fixed annuity payout period

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


api_instance = ProtonApi::AnnuitiesApi.new

annuity_calculator_decumulation_horizon_request = ProtonApi::AnnuityCalculatorDecumulationHorizonRequest.new # AnnuityCalculatorDecumulationHorizonRequest | Request payload for Annuity Calculator - Decumulation Horizon


begin
  #Annuity Calculator - Decumulation Horizon
  result = api_instance.annuity_calculator_decumulation_horizon(annuity_calculator_decumulation_horizon_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling AnnuitiesApi->annuity_calculator_decumulation_horizon: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_decumulation_horizon_request** | [**AnnuityCalculatorDecumulationHorizonRequest**](AnnuityCalculatorDecumulationHorizonRequest.md)| Request payload for Annuity Calculator - Decumulation Horizon | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **annuity_calculator_deposit_amount**
> Hash&lt;String, Object&gt; annuity_calculator_deposit_amount(annuity_calculator_deposit_amount_request)

Annuity Calculator - Deposit Amount

Calculate the necessary periodic deposit amount for a fixed annuity

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


api_instance = ProtonApi::AnnuitiesApi.new

annuity_calculator_deposit_amount_request = ProtonApi::AnnuityCalculatorDepositAmountRequest.new # AnnuityCalculatorDepositAmountRequest | Request payload for Annuity Calculator - Deposit Amount


begin
  #Annuity Calculator - Deposit Amount
  result = api_instance.annuity_calculator_deposit_amount(annuity_calculator_deposit_amount_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling AnnuitiesApi->annuity_calculator_deposit_amount: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_deposit_amount_request** | [**AnnuityCalculatorDepositAmountRequest**](AnnuityCalculatorDepositAmountRequest.md)| Request payload for Annuity Calculator - Deposit Amount | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **annuity_calculator_initial_balance**
> Hash&lt;String, Object&gt; annuity_calculator_initial_balance(annuity_calculator_initial_balance_request)

Annuity Calculator - Initial Balance

Calculate the necessary initial balance for a fixed annuity

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


api_instance = ProtonApi::AnnuitiesApi.new

annuity_calculator_initial_balance_request = ProtonApi::AnnuityCalculatorInitialBalanceRequest.new # AnnuityCalculatorInitialBalanceRequest | Request payload for Annuity Calculator - Initial Balance


begin
  #Annuity Calculator - Initial Balance
  result = api_instance.annuity_calculator_initial_balance(annuity_calculator_initial_balance_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling AnnuitiesApi->annuity_calculator_initial_balance: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_initial_balance_request** | [**AnnuityCalculatorInitialBalanceRequest**](AnnuityCalculatorInitialBalanceRequest.md)| Request payload for Annuity Calculator - Initial Balance | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **variable_annuity**
> Hash&lt;String, Object&gt; variable_annuity(variable_annuity_request)

Variable Annuity

Project the behavior of a variable annuity over time

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


api_instance = ProtonApi::AnnuitiesApi.new

variable_annuity_request = ProtonApi::VariableAnnuityRequest.new # VariableAnnuityRequest | Request payload for Variable Annuity


begin
  #Variable Annuity
  result = api_instance.variable_annuity(variable_annuity_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling AnnuitiesApi->variable_annuity: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variable_annuity_request** | [**VariableAnnuityRequest**](VariableAnnuityRequest.md)| Request payload for Variable Annuity | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



