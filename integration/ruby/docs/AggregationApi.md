# IntegrationApi::AggregationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_aggregation_account_using_post**](AggregationApi.md#create_aggregation_account_using_post) | **POST** /aggregation/account | Create mapping between client,vendor,tenant
[**create_property_value_using_post**](AggregationApi.md#create_property_value_using_post) | **POST** /property_value | Create mapping between client,vendor,tenant for the property
[**delete_aggregation_account_using_delete**](AggregationApi.md#delete_aggregation_account_using_delete) | **DELETE** /aggregation/account/{nucleus_aggregation_account_id} | De-Link mapping between client,vendor,tenant
[**get_aggregation_account_all_using_get**](AggregationApi.md#get_aggregation_account_all_using_get) | **GET** /aggregation/account | Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client
[**get_aggregation_account_balance_all_using_get**](AggregationApi.md#get_aggregation_account_balance_all_using_get) | **GET** /aggregation/balance | Fetch all aggregation account balance details with for the given aggregation accounts 
[**get_aggregation_account_balance_using_get**](AggregationApi.md#get_aggregation_account_balance_using_get) | **GET** /aggregation/balance/{nucleus_aggregation_account_id} | Fetch aggregation account balance details with the mapping created in POST endpoint
[**get_aggregation_account_holding_all_using_get**](AggregationApi.md#get_aggregation_account_holding_all_using_get) | **GET** /aggregation/holding | Fetch all aggregation account(s) holding details with the mapping created in POST endpoint
[**get_aggregation_account_holding_using_get**](AggregationApi.md#get_aggregation_account_holding_using_get) | **GET** /aggregation/holding/{nucleus_aggregation_account_id} | Fetch aggregation account holding details with the mapping created in POST endpoint
[**get_aggregation_account_transaction_all_using_get**](AggregationApi.md#get_aggregation_account_transaction_all_using_get) | **GET** /aggregation/transaction | Fetch all aggregation account balance details with for the given aggregation accounts 
[**get_aggregation_account_transaction_using_get**](AggregationApi.md#get_aggregation_account_transaction_using_get) | **GET** /aggregation/transaction/{nucleus_aggregation_account_id} | Fetch aggregation account transaction details with the mapping created in POST endpoint
[**get_aggregation_account_using_get**](AggregationApi.md#get_aggregation_account_using_get) | **GET** /aggregation/account/{nucleus_aggregation_account_id} | Fetch aggregation account details with the mapping created in POST endpoint


# **create_aggregation_account_using_post**
> AggregationAccountsResponseVO create_aggregation_account_using_post(aggregation_request_object)

Create mapping between client,vendor,tenant

Create mapping between client,vendor,tenant

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

aggregation_request_object = IntegrationApi::AggregationRequestObject.new # AggregationRequestObject | aggregationRequestObject


begin
  #Create mapping between client,vendor,tenant
  result = api_instance.create_aggregation_account_using_post(aggregation_request_object)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->create_aggregation_account_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_request_object** | [**AggregationRequestObject**](AggregationRequestObject.md)| aggregationRequestObject | 

### Return type

[**AggregationAccountsResponseVO**](AggregationAccountsResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_property_value_using_post**
> PropertyValueResponseVO create_property_value_using_post(aggregation_request_object)

Create mapping between client,vendor,tenant for the property

Create mapping between client,vendor,tenant for property

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

aggregation_request_object = IntegrationApi::AggregationRequestObject.new # AggregationRequestObject | aggregationRequestObject


begin
  #Create mapping between client,vendor,tenant for the property
  result = api_instance.create_property_value_using_post(aggregation_request_object)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->create_property_value_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_request_object** | [**AggregationRequestObject**](AggregationRequestObject.md)| aggregationRequestObject | 

### Return type

[**PropertyValueResponseVO**](PropertyValueResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_aggregation_account_using_delete**
> delete_aggregation_account_using_delete(nucleus_aggregation_account_id)

De-Link mapping between client,vendor,tenant

De-Link mapping between client,vendor,tenant

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

nucleus_aggregation_account_id = 'nucleus_aggregation_account_id_example' # String | nucleus_aggregation_account_id


begin
  #De-Link mapping between client,vendor,tenant
  api_instance.delete_aggregation_account_using_delete(nucleus_aggregation_account_id)
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->delete_aggregation_account_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**String**](.md)| nucleus_aggregation_account_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_aggregation_account_all_using_get**
> Array&lt;AggregationAccountResponseVO&gt; get_aggregation_account_all_using_get(aggregation_account_id_list)

Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client

Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

aggregation_account_id_list = ['aggregation_account_id_list_example'] # Array<String> | aggregation_account_id_list


begin
  #Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client
  result = api_instance.get_aggregation_account_all_using_get(aggregation_account_id_list)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->get_aggregation_account_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**Array&lt;String&gt;**](String.md)| aggregation_account_id_list | 

### Return type

[**Array&lt;AggregationAccountResponseVO&gt;**](AggregationAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_aggregation_account_balance_all_using_get**
> Array&lt;AggregationAccountBalanceResponseVO&gt; get_aggregation_account_balance_all_using_get(aggregation_account_id_list)

Fetch all aggregation account balance details with for the given aggregation accounts 

Fetch all aggregation account balance details with for the given aggregation accounts

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

aggregation_account_id_list = ['aggregation_account_id_list_example'] # Array<String> | aggregation_account_id_list


begin
  #Fetch all aggregation account balance details with for the given aggregation accounts 
  result = api_instance.get_aggregation_account_balance_all_using_get(aggregation_account_id_list)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->get_aggregation_account_balance_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**Array&lt;String&gt;**](String.md)| aggregation_account_id_list | 

### Return type

[**Array&lt;AggregationAccountBalanceResponseVO&gt;**](AggregationAccountBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_aggregation_account_balance_using_get**
> AggregationAccountBalanceResponseVO get_aggregation_account_balance_using_get(nucleus_aggregation_account_id)

Fetch aggregation account balance details with the mapping created in POST endpoint

Fetch aggregation account balance details with the mapping created in POST endpoint

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

nucleus_aggregation_account_id = 'nucleus_aggregation_account_id_example' # String | nucleus_aggregation_account_id


begin
  #Fetch aggregation account balance details with the mapping created in POST endpoint
  result = api_instance.get_aggregation_account_balance_using_get(nucleus_aggregation_account_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->get_aggregation_account_balance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**String**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountBalanceResponseVO**](AggregationAccountBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_holding_all_using_get**
> Array&lt;AggregationAccountHoldingResponseVO&gt; get_aggregation_account_holding_all_using_get(aggregation_account_id_list)

Fetch all aggregation account(s) holding details with the mapping created in POST endpoint

Fetch all aggregation account(s) holding details with the mapping created in POST endpoint

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

aggregation_account_id_list = ['aggregation_account_id_list_example'] # Array<String> | aggregation_account_id_list


begin
  #Fetch all aggregation account(s) holding details with the mapping created in POST endpoint
  result = api_instance.get_aggregation_account_holding_all_using_get(aggregation_account_id_list)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->get_aggregation_account_holding_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**Array&lt;String&gt;**](String.md)| aggregation_account_id_list | 

### Return type

[**Array&lt;AggregationAccountHoldingResponseVO&gt;**](AggregationAccountHoldingResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_aggregation_account_holding_using_get**
> AggregationAccountHoldingResponseVO get_aggregation_account_holding_using_get(nucleus_aggregation_account_id)

Fetch aggregation account holding details with the mapping created in POST endpoint

Fetch aggregation account holding details with the mapping created in POST endpoint

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

nucleus_aggregation_account_id = 'nucleus_aggregation_account_id_example' # String | nucleus_aggregation_account_id


begin
  #Fetch aggregation account holding details with the mapping created in POST endpoint
  result = api_instance.get_aggregation_account_holding_using_get(nucleus_aggregation_account_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->get_aggregation_account_holding_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**String**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountHoldingResponseVO**](AggregationAccountHoldingResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_transaction_all_using_get**
> Array&lt;AggregationAccountTransactionResponseVO&gt; get_aggregation_account_transaction_all_using_get(aggregation_account_id_list)

Fetch all aggregation account balance details with for the given aggregation accounts 

Fetch all aggregation account balance details with for the given aggregation accounts

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

aggregation_account_id_list = ['aggregation_account_id_list_example'] # Array<String> | aggregation_account_id_list


begin
  #Fetch all aggregation account balance details with for the given aggregation accounts 
  result = api_instance.get_aggregation_account_transaction_all_using_get(aggregation_account_id_list)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->get_aggregation_account_transaction_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**Array&lt;String&gt;**](String.md)| aggregation_account_id_list | 

### Return type

[**Array&lt;AggregationAccountTransactionResponseVO&gt;**](AggregationAccountTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_aggregation_account_transaction_using_get**
> AggregationAccountTransactionResponseVO get_aggregation_account_transaction_using_get(nucleus_aggregation_account_id)

Fetch aggregation account transaction details with the mapping created in POST endpoint

Fetch aggregation account transaction details with the mapping created in POST endpoint

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

nucleus_aggregation_account_id = 'nucleus_aggregation_account_id_example' # String | nucleus_aggregation_account_id


begin
  #Fetch aggregation account transaction details with the mapping created in POST endpoint
  result = api_instance.get_aggregation_account_transaction_using_get(nucleus_aggregation_account_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->get_aggregation_account_transaction_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**String**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountTransactionResponseVO**](AggregationAccountTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_using_get**
> AggregationAccountResponseVO get_aggregation_account_using_get(nucleus_aggregation_account_id)

Fetch aggregation account details with the mapping created in POST endpoint

Fetch aggregation account details with the mapping created in POST endpoint

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::AggregationApi.new

nucleus_aggregation_account_id = 'nucleus_aggregation_account_id_example' # String | nucleus_aggregation_account_id


begin
  #Fetch aggregation account details with the mapping created in POST endpoint
  result = api_instance.get_aggregation_account_using_get(nucleus_aggregation_account_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AggregationApi->get_aggregation_account_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**String**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountResponseVO**](AggregationAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



