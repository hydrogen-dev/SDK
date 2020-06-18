# NucleusApi::AggregationAccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_aggregation_account_balance_bulk_using_post**](AggregationAccountApi.md#create_aggregation_account_balance_bulk_using_post) | **POST** /bulk_aggregation_account_balance | Create a bulk aggregation account balance
[**create_aggregation_account_balance_using_post**](AggregationAccountApi.md#create_aggregation_account_balance_using_post) | **POST** /aggregation_account_balance | Create an aggregation account balance
[**create_aggregation_account_bulk_using_post**](AggregationAccountApi.md#create_aggregation_account_bulk_using_post) | **POST** /bulk_aggregation_account | Create a bulk aggregation account
[**create_aggregation_account_holding_bulk_using_post**](AggregationAccountApi.md#create_aggregation_account_holding_bulk_using_post) | **POST** /bulk_aggregation_account_holding | Create a bulk aggregation account holding
[**create_aggregation_account_holding_using_post**](AggregationAccountApi.md#create_aggregation_account_holding_using_post) | **POST** /aggregation_account_holding | Create an aggregation account holding
[**create_aggregation_account_transaction_bulk_using_post**](AggregationAccountApi.md#create_aggregation_account_transaction_bulk_using_post) | **POST** /bulk_aggregation_account_transaction | Create a bulk aggregation account transaction
[**create_aggregation_account_transaction_using_post**](AggregationAccountApi.md#create_aggregation_account_transaction_using_post) | **POST** /aggregation_account_transaction | Create an aggregation account transaction
[**create_aggregation_account_using_post**](AggregationAccountApi.md#create_aggregation_account_using_post) | **POST** /aggregation_account | Create an aggregation account
[**delete_aggregation_account_balance_using_delete**](AggregationAccountApi.md#delete_aggregation_account_balance_using_delete) | **DELETE** /aggregation_account_balance/{aggregation_account_balance_id} | Delete an aggregation account balance
[**delete_aggregation_account_holding_using_delete**](AggregationAccountApi.md#delete_aggregation_account_holding_using_delete) | **DELETE** /aggregation_account_holding/{aggregation_account_holding_id} | Delete an aggregation account holding
[**delete_aggregation_account_transaction_using_delete**](AggregationAccountApi.md#delete_aggregation_account_transaction_using_delete) | **DELETE** /aggregation_account_transaction/{aggregation_account_transaction_id} | Delete an aggregation account transaction
[**delete_aggregation_account_using_delete**](AggregationAccountApi.md#delete_aggregation_account_using_delete) | **DELETE** /aggregation_account/{aggregation_account_id} | Delete an aggregation account
[**get_aggregation_account_aggregate_data_using_get**](AggregationAccountApi.md#get_aggregation_account_aggregate_data_using_get) | **GET** /aggregation_account/{aggregation_account_id}/aggregate_data | Retrieve an aggregation account aggregate data
[**get_aggregation_account_all_using_get**](AggregationAccountApi.md#get_aggregation_account_all_using_get) | **GET** /aggregation_account | List all aggregation accounts
[**get_aggregation_account_balance_all_using_get**](AggregationAccountApi.md#get_aggregation_account_balance_all_using_get) | **GET** /aggregation_account_balance | List all aggregation account balances
[**get_aggregation_account_balance_using_get**](AggregationAccountApi.md#get_aggregation_account_balance_using_get) | **GET** /aggregation_account_balance/{aggregation_account_balance_id} | Retrieve an aggregation account balance
[**get_aggregation_account_holding_all_using_get**](AggregationAccountApi.md#get_aggregation_account_holding_all_using_get) | **GET** /aggregation_account_holding | List all aggregation account holdings
[**get_aggregation_account_holding_using_get**](AggregationAccountApi.md#get_aggregation_account_holding_using_get) | **GET** /aggregation_account_holding/{aggregation_account_holding_id} | Retrieve an aggregation account holding
[**get_aggregation_account_overview_using_get**](AggregationAccountApi.md#get_aggregation_account_overview_using_get) | **GET** /client/{client_id}/aggregation_account_overview | Retrieve an aggregation account aggregate data
[**get_aggregation_account_transaction_all_using_get**](AggregationAccountApi.md#get_aggregation_account_transaction_all_using_get) | **GET** /aggregation_account_transaction | List all aggregation account transactions
[**get_aggregation_account_transaction_using_get**](AggregationAccountApi.md#get_aggregation_account_transaction_using_get) | **GET** /aggregation_account_transaction/{aggregation_account_transaction_id} | Retrieve an aggregation account transaction
[**get_aggregation_account_using_get**](AggregationAccountApi.md#get_aggregation_account_using_get) | **GET** /aggregation_account/{aggregation_account_id} | Retrieve an aggregation account
[**update_aggregation_account_balance_using_put**](AggregationAccountApi.md#update_aggregation_account_balance_using_put) | **PUT** /aggregation_account_balance/{aggregation_account_balance_id} | Update an aggregation account balance
[**update_aggregation_account_bulk_using_put**](AggregationAccountApi.md#update_aggregation_account_bulk_using_put) | **PUT** /bulk_aggregation_account | Update a bulk aggregation account
[**update_aggregation_account_holding_bulk_using_put**](AggregationAccountApi.md#update_aggregation_account_holding_bulk_using_put) | **PUT** /bulk_aggregation_account_holding | Update an bulk aggregation account holding
[**update_aggregation_account_holding_using_put**](AggregationAccountApi.md#update_aggregation_account_holding_using_put) | **PUT** /aggregation_account_holding/{aggregation_account_holding_id} | Update an aggregation account holding
[**update_aggregation_account_transaction_using_put**](AggregationAccountApi.md#update_aggregation_account_transaction_using_put) | **PUT** /aggregation_account_transaction/{aggregation_account_transaction_id} | Update an aggregation account transaction
[**update_aggregation_account_using_put**](AggregationAccountApi.md#update_aggregation_account_using_put) | **PUT** /aggregation_account/{aggregation_account_id} | Update an aggregation account


# **create_aggregation_account_balance_bulk_using_post**
> Array&lt;AggregationAccountBalance&gt; create_aggregation_account_balance_bulk_using_post(aggregation_account_balance)

Create a bulk aggregation account balance

Create a balance records under an aggregation accounts.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_balance = [NucleusApi::AggregationAccountBalance.new] # Array<AggregationAccountBalance> | aggregationAccountBalance


begin
  #Create a bulk aggregation account balance
  result = api_instance.create_aggregation_account_balance_bulk_using_post(aggregation_account_balance)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->create_aggregation_account_balance_bulk_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance** | [**Array&lt;AggregationAccountBalance&gt;**](AggregationAccountBalance.md)| aggregationAccountBalance | 

### Return type

[**Array&lt;AggregationAccountBalance&gt;**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_aggregation_account_balance_using_post**
> AggregationAccountBalance create_aggregation_account_balance_using_post(aggregation_account_balance)

Create an aggregation account balance

Create a balance record under an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_balance = NucleusApi::AggregationAccountBalance.new # AggregationAccountBalance | aggregationAccountBalance


begin
  #Create an aggregation account balance
  result = api_instance.create_aggregation_account_balance_using_post(aggregation_account_balance)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->create_aggregation_account_balance_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance** | [**AggregationAccountBalance**](AggregationAccountBalance.md)| aggregationAccountBalance | 

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_aggregation_account_bulk_using_post**
> Array&lt;AggregationAccount&gt; create_aggregation_account_bulk_using_post(aggregation_account_list)

Create a bulk aggregation account

Create a bulk aggregation account under a client.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_list = [NucleusApi::AggregationAccount.new] # Array<AggregationAccount> | aggregationAccountList


begin
  #Create a bulk aggregation account
  result = api_instance.create_aggregation_account_bulk_using_post(aggregation_account_list)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->create_aggregation_account_bulk_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_list** | [**Array&lt;AggregationAccount&gt;**](AggregationAccount.md)| aggregationAccountList | 

### Return type

[**Array&lt;AggregationAccount&gt;**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_aggregation_account_holding_bulk_using_post**
> Array&lt;AggregationAccountHolding&gt; create_aggregation_account_holding_bulk_using_post(aggregation_transaction)

Create a bulk aggregation account holding

Create a bulk aggregation account holding.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_transaction = [NucleusApi::AggregationAccountHolding.new] # Array<AggregationAccountHolding> | aggregationTransaction


begin
  #Create a bulk aggregation account holding
  result = api_instance.create_aggregation_account_holding_bulk_using_post(aggregation_transaction)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->create_aggregation_account_holding_bulk_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_transaction** | [**Array&lt;AggregationAccountHolding&gt;**](AggregationAccountHolding.md)| aggregationTransaction | 

### Return type

[**Array&lt;AggregationAccountHolding&gt;**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_aggregation_account_holding_using_post**
> AggregationAccountHolding create_aggregation_account_holding_using_post(aggregation_account_holding)

Create an aggregation account holding

Create a holding record under an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_holding = NucleusApi::AggregationAccountHolding.new # AggregationAccountHolding | aggregationAccountHolding


begin
  #Create an aggregation account holding
  result = api_instance.create_aggregation_account_holding_using_post(aggregation_account_holding)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->create_aggregation_account_holding_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding** | [**AggregationAccountHolding**](AggregationAccountHolding.md)| aggregationAccountHolding | 

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_aggregation_account_transaction_bulk_using_post**
> Array&lt;AggregationAccountTransaction&gt; create_aggregation_account_transaction_bulk_using_post(aggregation_account_transactions)

Create a bulk aggregation account transaction

Create a bulk transaction record under an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_transactions = [NucleusApi::AggregationAccountTransaction.new] # Array<AggregationAccountTransaction> | aggregationAccountTransactions


begin
  #Create a bulk aggregation account transaction
  result = api_instance.create_aggregation_account_transaction_bulk_using_post(aggregation_account_transactions)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->create_aggregation_account_transaction_bulk_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transactions** | [**Array&lt;AggregationAccountTransaction&gt;**](AggregationAccountTransaction.md)| aggregationAccountTransactions | 

### Return type

[**Array&lt;AggregationAccountTransaction&gt;**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_aggregation_account_transaction_using_post**
> AggregationAccountTransaction create_aggregation_account_transaction_using_post(aggregation_account_transaction)

Create an aggregation account transaction

Create a transaction record under an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_transaction = NucleusApi::AggregationAccountTransaction.new # AggregationAccountTransaction | aggregationAccountTransaction


begin
  #Create an aggregation account transaction
  result = api_instance.create_aggregation_account_transaction_using_post(aggregation_account_transaction)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->create_aggregation_account_transaction_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction** | [**AggregationAccountTransaction**](AggregationAccountTransaction.md)| aggregationAccountTransaction | 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_aggregation_account_using_post**
> AggregationAccount create_aggregation_account_using_post(aggregation_account)

Create an aggregation account

Create an aggregation account under a client.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account = NucleusApi::AggregationAccount.new # AggregationAccount | aggregationAccount


begin
  #Create an aggregation account
  result = api_instance.create_aggregation_account_using_post(aggregation_account)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->create_aggregation_account_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account** | [**AggregationAccount**](AggregationAccount.md)| aggregationAccount | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_aggregation_account_balance_using_delete**
> delete_aggregation_account_balance_using_delete(aggregation_account_balance_id)

Delete an aggregation account balance

Permanently delete a balance record for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_balance_id = 'aggregation_account_balance_id_example' # String | UUID aggregation_account_balance_id


begin
  #Delete an aggregation account balance
  api_instance.delete_aggregation_account_balance_using_delete(aggregation_account_balance_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->delete_aggregation_account_balance_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance_id** | [**String**](.md)| UUID aggregation_account_balance_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_aggregation_account_holding_using_delete**
> delete_aggregation_account_holding_using_delete(aggregation_account_holding_id)

Delete an aggregation account holding

Permanently delete a holding record for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_holding_id = 'aggregation_account_holding_id_example' # String | UUID aggregation_account_holding_id


begin
  #Delete an aggregation account holding
  api_instance.delete_aggregation_account_holding_using_delete(aggregation_account_holding_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->delete_aggregation_account_holding_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding_id** | [**String**](.md)| UUID aggregation_account_holding_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_aggregation_account_transaction_using_delete**
> AggregationAccountTransaction delete_aggregation_account_transaction_using_delete(aggregation_account_transaction_id)

Delete an aggregation account transaction

Permanently delete a transaction record for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_transaction_id = 'aggregation_account_transaction_id_example' # String | UUID aggregation_account_transaction_id


begin
  #Delete an aggregation account transaction
  result = api_instance.delete_aggregation_account_transaction_using_delete(aggregation_account_transaction_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->delete_aggregation_account_transaction_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction_id** | [**String**](.md)| UUID aggregation_account_transaction_id | 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_aggregation_account_using_delete**
> delete_aggregation_account_using_delete(aggregation_account_id)

Delete an aggregation account

Permanently delete an aggregation account under a client.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_id = 'aggregation_account_id_example' # String | UUID aggregation_account_id


begin
  #Delete an aggregation account
  api_instance.delete_aggregation_account_using_delete(aggregation_account_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->delete_aggregation_account_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id** | [**String**](.md)| UUID aggregation_account_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_aggregate_data_using_get**
> AggregationAccountAggregateDataVO get_aggregation_account_aggregate_data_using_get(aggregation_account_id)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account associated with a client.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_id = 'aggregation_account_id_example' # String | UUID aggregation_account_id


begin
  #Retrieve an aggregation account aggregate data
  result = api_instance.get_aggregation_account_aggregate_data_using_get(aggregation_account_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->get_aggregation_account_aggregate_data_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id** | [**String**](.md)| UUID aggregation_account_id | 

### Return type

[**AggregationAccountAggregateDataVO**](AggregationAccountAggregateDataVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_all_using_get**
> PageAggregationAccount get_aggregation_account_all_using_get(opts)

List all aggregation accounts

Get information for all aggregation accounts for all clients defined for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all aggregation accounts
  result = api_instance.get_aggregation_account_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->get_aggregation_account_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAggregationAccount**](PageAggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_balance_all_using_get**
> PageAggregationAccountBalance get_aggregation_account_balance_all_using_get(opts)

List all aggregation account balances

Get all of the balance records for all aggregation accounts defined for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all aggregation account balances
  result = api_instance.get_aggregation_account_balance_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->get_aggregation_account_balance_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAggregationAccountBalance**](PageAggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_balance_using_get**
> AggregationAccountBalance get_aggregation_account_balance_using_get(aggregation_account_balance_id)

Retrieve an aggregation account balance

Retrieve the information for a specific balance record for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_balance_id = 'aggregation_account_balance_id_example' # String | UUID aggregation_account_balance_id


begin
  #Retrieve an aggregation account balance
  result = api_instance.get_aggregation_account_balance_using_get(aggregation_account_balance_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->get_aggregation_account_balance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance_id** | [**String**](.md)| UUID aggregation_account_balance_id | 

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_holding_all_using_get**
> PageAggregationAccountHolding get_aggregation_account_holding_all_using_get(opts)

List all aggregation account holdings

Get all of the holding records for all aggregation accounts defined for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all aggregation account holdings
  result = api_instance.get_aggregation_account_holding_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->get_aggregation_account_holding_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAggregationAccountHolding**](PageAggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_holding_using_get**
> AggregationAccountHolding get_aggregation_account_holding_using_get(aggregation_account_holding_id)

Retrieve an aggregation account holding

Retrieve the information for a specific holding record for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_holding_id = 'aggregation_account_holding_id_example' # String | UUID aggregation_account_holding_id


begin
  #Retrieve an aggregation account holding
  result = api_instance.get_aggregation_account_holding_using_get(aggregation_account_holding_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->get_aggregation_account_holding_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding_id** | [**String**](.md)| UUID aggregation_account_holding_id | 

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_overview_using_get**
> AggregationDataForClientParentResponseVO get_aggregation_account_overview_using_get(client_id)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account with aggregate data for a client.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

client_id = 'client_id_example' # String | UUID client_id


begin
  #Retrieve an aggregation account aggregate data
  result = api_instance.get_aggregation_account_overview_using_get(client_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->get_aggregation_account_overview_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| UUID client_id | 

### Return type

[**AggregationDataForClientParentResponseVO**](AggregationDataForClientParentResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_transaction_all_using_get**
> PageAggregationAccountTransaction get_aggregation_account_transaction_all_using_get(opts)

List all aggregation account transactions

Get all of the transaction records for all aggregation accounts defined for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all aggregation account transactions
  result = api_instance.get_aggregation_account_transaction_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->get_aggregation_account_transaction_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAggregationAccountTransaction**](PageAggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_transaction_using_get**
> AggregationAccountTransaction get_aggregation_account_transaction_using_get(aggregation_account_transaction_id)

Retrieve an aggregation account transaction

Retrieve the information for a specific transaction record for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_transaction_id = 'aggregation_account_transaction_id_example' # String | UUID aggregation_account_transaction_id


begin
  #Retrieve an aggregation account transaction
  result = api_instance.get_aggregation_account_transaction_using_get(aggregation_account_transaction_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->get_aggregation_account_transaction_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction_id** | [**String**](.md)| UUID aggregation_account_transaction_id | 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_aggregation_account_using_get**
> AggregationAccount get_aggregation_account_using_get(aggregation_account_id)

Retrieve an aggregation account

Retrieve the information for a specific aggregation account associated with a client.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_id = 'aggregation_account_id_example' # String | UUID aggregation_account_id


begin
  #Retrieve an aggregation account
  result = api_instance.get_aggregation_account_using_get(aggregation_account_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->get_aggregation_account_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id** | [**String**](.md)| UUID aggregation_account_id | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_aggregation_account_balance_using_put**
> AggregationAccountBalance update_aggregation_account_balance_using_put(aggregation_account_balance, aggregation_account_balance_id)

Update an aggregation account balance

Update a balance record for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_balance = NucleusApi::AggregationAccountBalance.new # AggregationAccountBalance | aggregation_account_balance

aggregation_account_balance_id = 'aggregation_account_balance_id_example' # String | UUID aggregation_account_balance_id


begin
  #Update an aggregation account balance
  result = api_instance.update_aggregation_account_balance_using_put(aggregation_account_balance, aggregation_account_balance_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->update_aggregation_account_balance_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance** | [**AggregationAccountBalance**](AggregationAccountBalance.md)| aggregation_account_balance | 
 **aggregation_account_balance_id** | [**String**](.md)| UUID aggregation_account_balance_id | 

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_aggregation_account_bulk_using_put**
> AggregationAccount update_aggregation_account_bulk_using_put(aggregation_account_list)

Update a bulk aggregation account

Update a bulk aggregation account under a client.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_list = [NucleusApi::AggregationAccount.new] # Array<AggregationAccount> | aggregationAccountList


begin
  #Update a bulk aggregation account
  result = api_instance.update_aggregation_account_bulk_using_put(aggregation_account_list)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->update_aggregation_account_bulk_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_list** | [**Array&lt;AggregationAccount&gt;**](AggregationAccount.md)| aggregationAccountList | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_aggregation_account_holding_bulk_using_put**
> Array&lt;AggregationAccountHolding&gt; update_aggregation_account_holding_bulk_using_put(aggregation_account_holding)

Update an bulk aggregation account holding

Update a bulk holding record for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_holding = [NucleusApi::AggregationAccountHolding.new] # Array<AggregationAccountHolding> | aggregationAccountHolding


begin
  #Update an bulk aggregation account holding
  result = api_instance.update_aggregation_account_holding_bulk_using_put(aggregation_account_holding)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->update_aggregation_account_holding_bulk_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding** | [**Array&lt;AggregationAccountHolding&gt;**](AggregationAccountHolding.md)| aggregationAccountHolding | 

### Return type

[**Array&lt;AggregationAccountHolding&gt;**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_aggregation_account_holding_using_put**
> AggregationAccountHolding update_aggregation_account_holding_using_put(aggregation_account_holding, aggregation_account_holding_id)

Update an aggregation account holding

Update a holding record for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_holding = NucleusApi::AggregationAccountHolding.new # AggregationAccountHolding | aggregation_account_holding

aggregation_account_holding_id = 'aggregation_account_holding_id_example' # String | UUID aggregation_account_holding_id


begin
  #Update an aggregation account holding
  result = api_instance.update_aggregation_account_holding_using_put(aggregation_account_holding, aggregation_account_holding_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->update_aggregation_account_holding_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding** | [**AggregationAccountHolding**](AggregationAccountHolding.md)| aggregation_account_holding | 
 **aggregation_account_holding_id** | [**String**](.md)| UUID aggregation_account_holding_id | 

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_aggregation_account_transaction_using_put**
> AggregationAccountTransaction update_aggregation_account_transaction_using_put(aggregation_account_transaction, aggregation_account_transaction_id)

Update an aggregation account transaction

Update a transaction record for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account_transaction = NucleusApi::AggregationAccountTransaction.new # AggregationAccountTransaction | aggregation_account_transaction

aggregation_account_transaction_id = 'aggregation_account_transaction_id_example' # String | UUID aggregation_account_transaction_id


begin
  #Update an aggregation account transaction
  result = api_instance.update_aggregation_account_transaction_using_put(aggregation_account_transaction, aggregation_account_transaction_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->update_aggregation_account_transaction_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction** | [**AggregationAccountTransaction**](AggregationAccountTransaction.md)| aggregation_account_transaction | 
 **aggregation_account_transaction_id** | [**String**](.md)| UUID aggregation_account_transaction_id | 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_aggregation_account_using_put**
> AggregationAccount update_aggregation_account_using_put(aggregation_account, aggregation_account_id)

Update an aggregation account

Update the information for an aggregation account.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::AggregationAccountApi.new

aggregation_account = NucleusApi::AggregationAccount.new # AggregationAccount | aggregation_account

aggregation_account_id = 'aggregation_account_id_example' # String | UUID aggregation_account_id


begin
  #Update an aggregation account
  result = api_instance.update_aggregation_account_using_put(aggregation_account, aggregation_account_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AggregationAccountApi->update_aggregation_account_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account** | [**AggregationAccount**](AggregationAccount.md)| aggregation_account | 
 **aggregation_account_id** | [**String**](.md)| UUID aggregation_account_id | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



