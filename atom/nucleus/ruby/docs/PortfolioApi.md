# NucleusApi::PortfolioApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_portfolio_asset_size_using_post**](PortfolioApi.md#create_portfolio_asset_size_using_post) | **POST** /portfolio_asset_size | Create a portfolio asset size
[**create_portfolio_comment_using_post**](PortfolioApi.md#create_portfolio_comment_using_post) | **POST** /portfolio_comment | Create a portfolio commentary
[**create_portfolio_goal_using_post**](PortfolioApi.md#create_portfolio_goal_using_post) | **POST** /portfolio_goal | Create an portfolio goal
[**create_portfolio_holding_using_post**](PortfolioApi.md#create_portfolio_holding_using_post) | **POST** /portfolio_holding | Create a portfolio holding
[**create_portfolio_transaction_using_post**](PortfolioApi.md#create_portfolio_transaction_using_post) | **POST** /portfolio_transaction | Create a portfolio transaction
[**create_portfolio_using_post**](PortfolioApi.md#create_portfolio_using_post) | **POST** /portfolio | Create a portfolio
[**delete_portfolio_asset_size_using_delete**](PortfolioApi.md#delete_portfolio_asset_size_using_delete) | **DELETE** /portfolio_asset_size/{portfolio_asset_size_id} | Delete a portfolio asset size
[**delete_portfolio_comment_using_delete**](PortfolioApi.md#delete_portfolio_comment_using_delete) | **DELETE** /portfolio_comment/{portfolio_comment_id} | Delete a portfolio commentary
[**delete_portfolio_goal_using_delete**](PortfolioApi.md#delete_portfolio_goal_using_delete) | **DELETE** /portfolio_goal/{portfolio_goal_id} | Delete an portfolio goal
[**delete_portfolio_holding_using_delete**](PortfolioApi.md#delete_portfolio_holding_using_delete) | **DELETE** /portfolio_holding/{portfolio_holding_id} | Delete a portfolio holding
[**delete_portfolio_transaction_using_delete**](PortfolioApi.md#delete_portfolio_transaction_using_delete) | **DELETE** /portfolio_transaction/{portfolio_transaction_id} | Delete a portfolio transaction
[**delete_portfolio_using_delete**](PortfolioApi.md#delete_portfolio_using_delete) | **DELETE** /portfolio/{portfolio_id} | Delete a portfolio
[**get_portfolio_aggregated_data_using_get**](PortfolioApi.md#get_portfolio_aggregated_data_using_get) | **GET** /portfolio/{portfolio_id}/aggregate_data | Retrieve an portfolio aggregate data
[**get_portfolio_all_using_get**](PortfolioApi.md#get_portfolio_all_using_get) | **GET** /portfolio | List all portfolios
[**get_portfolio_asset_size_all_using_get**](PortfolioApi.md#get_portfolio_asset_size_all_using_get) | **GET** /portfolio_asset_size | Retrieve a portfolio asset size
[**get_portfolio_asset_size_using_get**](PortfolioApi.md#get_portfolio_asset_size_using_get) | **GET** /portfolio_asset_size/{portfolio_asset_size_id} | Retrieve a portfolio asset size
[**get_portfolio_comment_all_using_get**](PortfolioApi.md#get_portfolio_comment_all_using_get) | **GET** /portfolio_comment | List all portfolio commentary
[**get_portfolio_comment_using_get**](PortfolioApi.md#get_portfolio_comment_using_get) | **GET** /portfolio_comment/{portfolio_comment_id} | Retrieve a portfolio commentary
[**get_portfolio_goal_all_using_get**](PortfolioApi.md#get_portfolio_goal_all_using_get) | **GET** /portfolio_goal | List all portfolio goals
[**get_portfolio_goal_using_get**](PortfolioApi.md#get_portfolio_goal_using_get) | **GET** /portfolio_goal/{portfolio_goal_id} | Retrieve an portfolio goal
[**get_portfolio_holding_all_using_get**](PortfolioApi.md#get_portfolio_holding_all_using_get) | **GET** /portfolio_holding | List all portfolio holdings
[**get_portfolio_holding_using_get**](PortfolioApi.md#get_portfolio_holding_using_get) | **GET** /portfolio_holding/{portfolio_holding_id} | Retrieve a portfolio holding
[**get_portfolio_transaction_all_using_get**](PortfolioApi.md#get_portfolio_transaction_all_using_get) | **GET** /portfolio_transaction | List all portfolio transactions
[**get_portfolio_transaction_using_get**](PortfolioApi.md#get_portfolio_transaction_using_get) | **GET** /portfolio_transaction/{portfolio_transaction_id} | Retrieve a portfolio transaction
[**get_portfolio_using_get**](PortfolioApi.md#get_portfolio_using_get) | **GET** /portfolio/{portfolio_id} | Retrieve a portfolio
[**update_portfolio_asset_size_using_put**](PortfolioApi.md#update_portfolio_asset_size_using_put) | **PUT** /portfolio_asset_size/{portfolio_asset_size_id} | Update a portfolio asset size
[**update_portfolio_comment_using_put**](PortfolioApi.md#update_portfolio_comment_using_put) | **PUT** /portfolio_comment/{portfolio_comment_id} | Update a portfolio comment
[**update_portfolio_goal_using_put**](PortfolioApi.md#update_portfolio_goal_using_put) | **PUT** /portfolio_goal/{portfolio_goal_id} | Update an portfolio goal
[**update_portfolio_holding_using_put**](PortfolioApi.md#update_portfolio_holding_using_put) | **PUT** /portfolio_holding/{portfolio_holding_id} | Update a portfolio holding
[**update_portfolio_transaction_using_put**](PortfolioApi.md#update_portfolio_transaction_using_put) | **PUT** /portfolio_transaction/{portfolio_transaction_id} | Update a portfolio transaction
[**update_portfolio_using_put**](PortfolioApi.md#update_portfolio_using_put) | **PUT** /portfolio/{portfolio_id} | Update a portfolio


# **create_portfolio_asset_size_using_post**
> PortfolioAssetSizeLog create_portfolio_asset_size_using_post(portfolio_asset_size_log_request)

Create a portfolio asset size

Create a new asset size record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_asset_size_log_request = NucleusApi::PortfolioAssetSizeLog.new # PortfolioAssetSizeLog | portfolioAssetSizeLogRequest


begin
  #Create a portfolio asset size
  result = api_instance.create_portfolio_asset_size_using_post(portfolio_asset_size_log_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->create_portfolio_asset_size_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size_log_request** | [**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)| portfolioAssetSizeLogRequest | 

### Return type

[**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_portfolio_comment_using_post**
> PortfolioComment create_portfolio_comment_using_post(portfolio_comment)

Create a portfolio commentary

Create a new comment for a portfolio defined for your firm.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_comment = NucleusApi::PortfolioComment.new # PortfolioComment | portfolioComment


begin
  #Create a portfolio commentary
  result = api_instance.create_portfolio_comment_using_post(portfolio_comment)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->create_portfolio_comment_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment** | [**PortfolioComment**](PortfolioComment.md)| portfolioComment | 

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_portfolio_goal_using_post**
> PortfolioGoal create_portfolio_goal_using_post(portfolio_goal)

Create an portfolio goal

Create an portfolio goal.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_goal = NucleusApi::PortfolioGoal.new # PortfolioGoal | portfolioGoal


begin
  #Create an portfolio goal
  result = api_instance.create_portfolio_goal_using_post(portfolio_goal)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->create_portfolio_goal_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal** | [**PortfolioGoal**](PortfolioGoal.md)| portfolioGoal | 

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_portfolio_holding_using_post**
> PortfolioHoldingLog create_portfolio_holding_using_post(portfolio_holdin_log_request)

Create a portfolio holding

Create a new holding record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_holdin_log_request = NucleusApi::PortfolioHoldingLog.new # PortfolioHoldingLog | portfolioHoldinLogRequest


begin
  #Create a portfolio holding
  result = api_instance.create_portfolio_holding_using_post(portfolio_holdin_log_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->create_portfolio_holding_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holdin_log_request** | [**PortfolioHoldingLog**](PortfolioHoldingLog.md)| portfolioHoldinLogRequest | 

### Return type

[**PortfolioHoldingLog**](PortfolioHoldingLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_portfolio_transaction_using_post**
> PortfolioTransaction create_portfolio_transaction_using_post(portfolio_transaction_request)

Create a portfolio transaction

Create a new transaction record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_transaction_request = NucleusApi::PortfolioTransaction.new # PortfolioTransaction | portfolioTransactionRequest


begin
  #Create a portfolio transaction
  result = api_instance.create_portfolio_transaction_using_post(portfolio_transaction_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->create_portfolio_transaction_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction_request** | [**PortfolioTransaction**](PortfolioTransaction.md)| portfolioTransactionRequest | 

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_portfolio_using_post**
> Portfolio create_portfolio_using_post(portfolio_request)

Create a portfolio

Create a new portfolio for an account.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_request = NucleusApi::Portfolio.new # Portfolio | portfolioRequest


begin
  #Create a portfolio
  result = api_instance.create_portfolio_using_post(portfolio_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->create_portfolio_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_request** | [**Portfolio**](Portfolio.md)| portfolioRequest | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_portfolio_asset_size_using_delete**
> delete_portfolio_asset_size_using_delete(portfolio_asset_size_id)

Delete a portfolio asset size

Permanently delete a portfolio asset size record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_asset_size_id = 'portfolio_asset_size_id_example' # String | UUID portfolio_asset_size_id


begin
  #Delete a portfolio asset size
  api_instance.delete_portfolio_asset_size_using_delete(portfolio_asset_size_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->delete_portfolio_asset_size_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size_id** | [**String**](.md)| UUID portfolio_asset_size_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_portfolio_comment_using_delete**
> delete_portfolio_comment_using_delete(portfolio_comment_id)

Delete a portfolio commentary

Permanently delete a portfolio comment for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_comment_id = 'portfolio_comment_id_example' # String | UUID portfolio_comment_id


begin
  #Delete a portfolio commentary
  api_instance.delete_portfolio_comment_using_delete(portfolio_comment_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->delete_portfolio_comment_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment_id** | [**String**](.md)| UUID portfolio_comment_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_portfolio_goal_using_delete**
> delete_portfolio_goal_using_delete(portfolio_goal_id)

Delete an portfolio goal

Permanently delete an portfolio-goal mapping.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_goal_id = 'portfolio_goal_id_example' # String | UUID portfolio_goal_id


begin
  #Delete an portfolio goal
  api_instance.delete_portfolio_goal_using_delete(portfolio_goal_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->delete_portfolio_goal_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal_id** | [**String**](.md)| UUID portfolio_goal_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_portfolio_holding_using_delete**
> delete_portfolio_holding_using_delete(portfolio_holding_id)

Delete a portfolio holding

Permanently delete a portfolio holding record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_holding_id = 'portfolio_holding_id_example' # String | UUID portfolio_holding_id


begin
  #Delete a portfolio holding
  api_instance.delete_portfolio_holding_using_delete(portfolio_holding_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->delete_portfolio_holding_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holding_id** | [**String**](.md)| UUID portfolio_holding_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_portfolio_transaction_using_delete**
> delete_portfolio_transaction_using_delete(portfolio_transaction_id)

Delete a portfolio transaction

Permanently delete a portfolio transaction record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_transaction_id = 'portfolio_transaction_id_example' # String | UUID portfolio_transaction_id


begin
  #Delete a portfolio transaction
  api_instance.delete_portfolio_transaction_using_delete(portfolio_transaction_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->delete_portfolio_transaction_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction_id** | [**String**](.md)| UUID portfolio_transaction_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_portfolio_using_delete**
> delete_portfolio_using_delete(portfolio_id)

Delete a portfolio

Permanently delete a portfolio for an account.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_id = 'portfolio_id_example' # String | UUID portfolio_id


begin
  #Delete a portfolio
  api_instance.delete_portfolio_using_delete(portfolio_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->delete_portfolio_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**String**](.md)| UUID portfolio_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_aggregated_data_using_get**
> PortfolioAggregatedVO get_portfolio_aggregated_data_using_get(portfolio_id, opts)

Retrieve an portfolio aggregate data

Retrieve the information for a securities associated with a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_id = 'portfolio_id_example' # String | Portfolio Id

opts = { 
  show_asset_class: true, # BOOLEAN | true or false
  show_category: true, # BOOLEAN | true or false
  show_industry: true, # BOOLEAN | true or false
  show_sector: true, # BOOLEAN | true or false
  show_security_class: true # BOOLEAN | true or false
}

begin
  #Retrieve an portfolio aggregate data
  result = api_instance.get_portfolio_aggregated_data_using_get(portfolio_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_aggregated_data_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**String**](.md)| Portfolio Id | 
 **show_asset_class** | **BOOLEAN**| true or false | [optional] [default to true]
 **show_category** | **BOOLEAN**| true or false | [optional] [default to true]
 **show_industry** | **BOOLEAN**| true or false | [optional] [default to true]
 **show_sector** | **BOOLEAN**| true or false | [optional] [default to true]
 **show_security_class** | **BOOLEAN**| true or false | [optional] [default to true]

### Return type

[**PortfolioAggregatedVO**](PortfolioAggregatedVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_all_using_get**
> PagePortfolio get_portfolio_all_using_get(opts)

List all portfolios

Get the information for all portfolios assigned to all of your firm’s accounts. 

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


api_instance = NucleusApi::PortfolioApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all portfolios
  result = api_instance.get_portfolio_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_all_using_get: #{e}"
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

[**PagePortfolio**](PagePortfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_asset_size_all_using_get**
> PagePortfolioAssetSizeLog get_portfolio_asset_size_all_using_get(opts)

Retrieve a portfolio asset size

Retrieve the information for a portfolio asset size record for a portfolio. 

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


api_instance = NucleusApi::PortfolioApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #Retrieve a portfolio asset size
  result = api_instance.get_portfolio_asset_size_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_asset_size_all_using_get: #{e}"
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

[**PagePortfolioAssetSizeLog**](PagePortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_asset_size_using_get**
> PortfolioAssetSize get_portfolio_asset_size_using_get(portfolio_asset_size_id)

Retrieve a portfolio asset size

Retrieve the information for a portfolio asset size record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_asset_size_id = 'portfolio_asset_size_id_example' # String | portfolio_asset_size_id


begin
  #Retrieve a portfolio asset size
  result = api_instance.get_portfolio_asset_size_using_get(portfolio_asset_size_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_asset_size_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size_id** | [**String**](.md)| portfolio_asset_size_id | 

### Return type

[**PortfolioAssetSize**](PortfolioAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_comment_all_using_get**
> PagePortfolioComment get_portfolio_comment_all_using_get(opts)

List all portfolio commentary

List all comments for all portfolios defined for your firm.

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


api_instance = NucleusApi::PortfolioApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all portfolio commentary
  result = api_instance.get_portfolio_comment_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_comment_all_using_get: #{e}"
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

[**PagePortfolioComment**](PagePortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_comment_using_get**
> PortfolioComment get_portfolio_comment_using_get(portfolio_comment_id)

Retrieve a portfolio commentary

Retrieve the information for a portfolio comment for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_comment_id = 'portfolio_comment_id_example' # String | UUID portfolio_comment_id


begin
  #Retrieve a portfolio commentary
  result = api_instance.get_portfolio_comment_using_get(portfolio_comment_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_comment_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment_id** | [**String**](.md)| UUID portfolio_comment_id | 

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_goal_all_using_get**
> PagePortfolioGoal get_portfolio_goal_all_using_get(opts)

List all portfolio goals

Get information for all portfolio-goal mappings defined for your firm.

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


api_instance = NucleusApi::PortfolioApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all portfolio goals
  result = api_instance.get_portfolio_goal_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_goal_all_using_get: #{e}"
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

[**PagePortfolioGoal**](PagePortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_goal_using_get**
> PortfolioGoal get_portfolio_goal_using_get(portfolio_goal_id)

Retrieve an portfolio goal

Retrieve the information for a specific portfolio-goal mapping.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_goal_id = 'portfolio_goal_id_example' # String | UUID portfolio_goal_id


begin
  #Retrieve an portfolio goal
  result = api_instance.get_portfolio_goal_using_get(portfolio_goal_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_goal_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal_id** | [**String**](.md)| UUID portfolio_goal_id | 

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_holding_all_using_get**
> PortfolioHolding get_portfolio_holding_all_using_get(opts)

List all portfolio holdings

Get the information for all holding records for all portfolios defined for your firm.

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


api_instance = NucleusApi::PortfolioApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all portfolio holdings
  result = api_instance.get_portfolio_holding_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_holding_all_using_get: #{e}"
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

[**PortfolioHolding**](PortfolioHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_holding_using_get**
> PortfolioHolding get_portfolio_holding_using_get(portfolio_holding_id)

Retrieve a portfolio holding

Retrieve the information for a portfolio holding record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_holding_id = 'portfolio_holding_id_example' # String | UUID portfolio_holding_id


begin
  #Retrieve a portfolio holding
  result = api_instance.get_portfolio_holding_using_get(portfolio_holding_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_holding_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holding_id** | [**String**](.md)| UUID portfolio_holding_id | 

### Return type

[**PortfolioHolding**](PortfolioHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_transaction_all_using_get**
> PagePortfolioTransaction get_portfolio_transaction_all_using_get(opts)

List all portfolio transactions

Get the information for all transaction records for all portfolios defined for your firm.

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


api_instance = NucleusApi::PortfolioApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all portfolio transactions
  result = api_instance.get_portfolio_transaction_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_transaction_all_using_get: #{e}"
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

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_transaction_using_get**
> PortfolioTransaction get_portfolio_transaction_using_get(portfolio_transaction_id)

Retrieve a portfolio transaction

Retrieve the information for a portfolio transaction record for a portfolio. 

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_transaction_id = 'portfolio_transaction_id_example' # String | UUID portfolio_transaction_id


begin
  #Retrieve a portfolio transaction
  result = api_instance.get_portfolio_transaction_using_get(portfolio_transaction_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_transaction_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction_id** | [**String**](.md)| UUID portfolio_transaction_id | 

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_using_get**
> Portfolio get_portfolio_using_get(portfolio_id)

Retrieve a portfolio

Retrieve a portfolio for an account.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_id = 'portfolio_id_example' # String | UUID portfolio_id


begin
  #Retrieve a portfolio
  result = api_instance.get_portfolio_using_get(portfolio_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->get_portfolio_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**String**](.md)| UUID portfolio_id | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_portfolio_asset_size_using_put**
> PortfolioAssetSize update_portfolio_asset_size_using_put(portfolio_asset_size, portfolio_asset_size_id)

Update a portfolio asset size

Update the information for a portfolio asset size record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_asset_size = NucleusApi::PortfolioAssetSizeLog.new # PortfolioAssetSizeLog | portfolio_asset_size

portfolio_asset_size_id = 'portfolio_asset_size_id_example' # String | UUID portfolio_asset_size_id


begin
  #Update a portfolio asset size
  result = api_instance.update_portfolio_asset_size_using_put(portfolio_asset_size, portfolio_asset_size_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->update_portfolio_asset_size_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size** | [**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)| portfolio_asset_size | 
 **portfolio_asset_size_id** | [**String**](.md)| UUID portfolio_asset_size_id | 

### Return type

[**PortfolioAssetSize**](PortfolioAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_portfolio_comment_using_put**
> PortfolioComment update_portfolio_comment_using_put(portfolio_comment, portfolio_comment_id)

Update a portfolio comment

Update the information for a portfolio comment for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_comment = NucleusApi::PortfolioComment.new # PortfolioComment | portfolio_comment

portfolio_comment_id = 'portfolio_comment_id_example' # String | UUID portfolio_comment_id


begin
  #Update a portfolio comment
  result = api_instance.update_portfolio_comment_using_put(portfolio_comment, portfolio_comment_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->update_portfolio_comment_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment** | [**PortfolioComment**](PortfolioComment.md)| portfolio_comment | 
 **portfolio_comment_id** | [**String**](.md)| UUID portfolio_comment_id | 

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_portfolio_goal_using_put**
> PortfolioGoal update_portfolio_goal_using_put(portfolio_goal, portfolio_goal_id)

Update an portfolio goal

Update the information for an portfolio-goal mapping.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_goal = NucleusApi::PortfolioGoal.new # PortfolioGoal | portfolio_goal

portfolio_goal_id = 'portfolio_goal_id_example' # String | UUID portfolio_goal_id


begin
  #Update an portfolio goal
  result = api_instance.update_portfolio_goal_using_put(portfolio_goal, portfolio_goal_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->update_portfolio_goal_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal** | [**PortfolioGoal**](PortfolioGoal.md)| portfolio_goal | 
 **portfolio_goal_id** | [**String**](.md)| UUID portfolio_goal_id | 

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_portfolio_holding_using_put**
> PortfolioHolding update_portfolio_holding_using_put(portfolio_holding, portfolio_holding_id)

Update a portfolio holding

Update the information for a portfolio holding record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_holding = NucleusApi::PortfolioHoldingLog.new # PortfolioHoldingLog | portfolio_holding

portfolio_holding_id = 'portfolio_holding_id_example' # String | UUID portfolio_holding_id


begin
  #Update a portfolio holding
  result = api_instance.update_portfolio_holding_using_put(portfolio_holding, portfolio_holding_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->update_portfolio_holding_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holding** | [**PortfolioHoldingLog**](PortfolioHoldingLog.md)| portfolio_holding | 
 **portfolio_holding_id** | [**String**](.md)| UUID portfolio_holding_id | 

### Return type

[**PortfolioHolding**](PortfolioHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_portfolio_transaction_using_put**
> PortfolioTransaction update_portfolio_transaction_using_put(portfolio_transaction, portfolio_transaction_id)

Update a portfolio transaction

Update the information for a portfolio transaction record for a portfolio.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio_transaction = NucleusApi::PortfolioTransaction.new # PortfolioTransaction | portfolio_transaction

portfolio_transaction_id = 'portfolio_transaction_id_example' # String | UUID portfolio_transaction_id


begin
  #Update a portfolio transaction
  result = api_instance.update_portfolio_transaction_using_put(portfolio_transaction, portfolio_transaction_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->update_portfolio_transaction_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction** | [**PortfolioTransaction**](PortfolioTransaction.md)| portfolio_transaction | 
 **portfolio_transaction_id** | [**String**](.md)| UUID portfolio_transaction_id | 

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_portfolio_using_put**
> Portfolio update_portfolio_using_put(portfolio, portfolio_id)

Update a portfolio

Update a portfolio for an account.

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


api_instance = NucleusApi::PortfolioApi.new

portfolio = NucleusApi::Portfolio.new # Portfolio | portfolio

portfolio_id = 'portfolio_id_example' # String | UUID portfolio_id


begin
  #Update a portfolio
  result = api_instance.update_portfolio_using_put(portfolio, portfolio_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PortfolioApi->update_portfolio_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio** | [**Portfolio**](Portfolio.md)| portfolio | 
 **portfolio_id** | [**String**](.md)| UUID portfolio_id | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



