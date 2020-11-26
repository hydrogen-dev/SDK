# NucleusApi::OrderApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_account_order_bulk_using_post**](OrderApi.md#create_account_order_bulk_using_post) | **POST** /account/{account_id}/order_bulk | Bulk orders for an account
[**create_account_order_buy_only_using_post**](OrderApi.md#create_account_order_buy_only_using_post) | **POST** /account/{account_id}/order_buy_only | Create buy-only account rebalance orders
[**create_account_order_rebalance_using_post**](OrderApi.md#create_account_order_rebalance_using_post) | **POST** /account/{account_id}/order_rebalance | Create account rebalance orders
[**create_account_order_reconciliation**](OrderApi.md#create_account_order_reconciliation) | **POST** /account/{account_id}/order_reconciliation | Create account reconciliation order
[**create_account_order_sell_all_using_post**](OrderApi.md#create_account_order_sell_all_using_post) | **POST** /account/{account_id}/order_sell_all | Sell all account order
[**create_account_order_sell_only_using_post**](OrderApi.md#create_account_order_sell_only_using_post) | **POST** /account/{account_id}/order_sell_only | Create sell-only account rebalance orders
[**create_client_order_bulk_using_post**](OrderApi.md#create_client_order_bulk_using_post) | **POST** /client/{client_id}/order_bulk | Bulk orders for a client
[**create_order_bulk_using_post**](OrderApi.md#create_order_bulk_using_post) | **POST** /order_bulk | Bulk orders for your firm
[**create_order_status_using_post**](OrderApi.md#create_order_status_using_post) | **POST** /order_status | Create an order status
[**create_order_track_using_post**](OrderApi.md#create_order_track_using_post) | **POST** /order_track | Create an order tracking record
[**create_order_using_post**](OrderApi.md#create_order_using_post) | **POST** /order | Create an order record
[**create_portfolio_order_buy_only_using_post**](OrderApi.md#create_portfolio_order_buy_only_using_post) | **POST** /portfolio/{portfolio_id}/order_buy_only | Create buy-only portfolio rebalance orders
[**create_portfolio_order_rebalance_using_post**](OrderApi.md#create_portfolio_order_rebalance_using_post) | **POST** /portfolio/{portfolio_id}/order_rebalance | Create portfolio rebalance orders
[**create_portfolio_order_reconciliation**](OrderApi.md#create_portfolio_order_reconciliation) | **POST** /portfolio/{portfolio_id}/order_reconciliation | Create portfolio reconciliation order
[**create_portfolio_order_sell_all_using_post**](OrderApi.md#create_portfolio_order_sell_all_using_post) | **POST** /portfolio/{portfolio_id}/order_sell_all | Sell all portfolio order
[**create_portfolio_order_sell_only_using_post**](OrderApi.md#create_portfolio_order_sell_only_using_post) | **POST** /portfolio/{portfolio_id}/order_sell_only | Create sell-only portfolio rebalance orders
[**delete_order_status_using_delete**](OrderApi.md#delete_order_status_using_delete) | **DELETE** /order_status/{order_status_id} | Delete an order status
[**delete_order_track_using_delete**](OrderApi.md#delete_order_track_using_delete) | **DELETE** /order_track/{order_track_id} | Delete an order tracking record
[**delete_order_using_delete**](OrderApi.md#delete_order_using_delete) | **DELETE** /order/{order_id} | Delete an order record
[**get_order_all_using_get**](OrderApi.md#get_order_all_using_get) | **GET** /order | List all order records
[**get_order_bulk_all_using_get**](OrderApi.md#get_order_bulk_all_using_get) | **GET** /order_bulk | List all bulk orders
[**get_order_status_all_using_get**](OrderApi.md#get_order_status_all_using_get) | **GET** /order_status | List all order statuses
[**get_order_status_using_get**](OrderApi.md#get_order_status_using_get) | **GET** /order_status/{order_status_id} | Retrieve an order status
[**get_order_track_all_using_get**](OrderApi.md#get_order_track_all_using_get) | **GET** /order_track | List all order tracking records
[**get_order_track_using_get**](OrderApi.md#get_order_track_using_get) | **GET** /order_track/{order_track_id} | Retrieve an order tracking record
[**get_order_using_get**](OrderApi.md#get_order_using_get) | **GET** /order/{order_id} | Retrieve an order record
[**update_order_status_using_put**](OrderApi.md#update_order_status_using_put) | **PUT** /order_status/{order_status_id} | Update an order status
[**update_order_track_using_put**](OrderApi.md#update_order_track_using_put) | **PUT** /order_track/{order_track_id} | Update an order tracking record
[**update_order_using_put**](OrderApi.md#update_order_using_put) | **PUT** /order/{order_id} | Update an order record


# **create_account_order_bulk_using_post**
> Array&lt;Order&gt; create_account_order_bulk_using_post(account_id, req)

Bulk orders for an account

Aggregates all orders on a given date for an account.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

account_id = 'account_id_example' # String | account_id

req = NucleusApi::TokenDateRequest.new # TokenDateRequest | req


begin
  #Bulk orders for an account
  result = api_instance.create_account_order_bulk_using_post(account_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_account_order_bulk_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| account_id | 
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req | 

### Return type

[**Array&lt;Order&gt;**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_account_order_buy_only_using_post**
> Array&lt;OrderVoClone&gt; create_account_order_buy_only_using_post(account_id, req)

Create buy-only account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

account_id = 'account_id_example' # String | account_id

req = NucleusApi::AccountPortfolioRebalanceRequest.new # AccountPortfolioRebalanceRequest | req


begin
  #Create buy-only account rebalance orders
  result = api_instance.create_account_order_buy_only_using_post(account_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_account_order_buy_only_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**Array&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_account_order_rebalance_using_post**
> Array&lt;OrderVoClone&gt; create_account_order_rebalance_using_post(account_id, req)

Create account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe. 

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

account_id = 'account_id_example' # String | account_id

req = NucleusApi::AccountPortfolioRebalanceRequest.new # AccountPortfolioRebalanceRequest | req


begin
  #Create account rebalance orders
  result = api_instance.create_account_order_rebalance_using_post(account_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_account_order_rebalance_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**Array&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_account_order_reconciliation**
> OrderReconcileReturnObject create_account_order_reconciliation(account_id, req)

Create account reconciliation order

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

account_id = 'account_id_example' # String | account_id

req = NucleusApi::OrderReconcileRequest.new # OrderReconcileRequest | req


begin
  #Create account reconciliation order
  result = api_instance.create_account_order_reconciliation(account_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_account_order_reconciliation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| account_id | 
 **req** | [**OrderReconcileRequest**](OrderReconcileRequest.md)| req | 

### Return type

[**OrderReconcileReturnObject**](OrderReconcileReturnObject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_account_order_sell_all_using_post**
> Array&lt;OrderVoClone&gt; create_account_order_sell_all_using_post(account_id, req)

Sell all account order

Create order records necessary to entirely sell all the holdings within an account.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

account_id = 'account_id_example' # String | account_id

req = NucleusApi::AccountPortfolioRebalanceRequest.new # AccountPortfolioRebalanceRequest | req


begin
  #Sell all account order
  result = api_instance.create_account_order_sell_all_using_post(account_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_account_order_sell_all_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**Array&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_account_order_sell_only_using_post**
> Array&lt;OrderVoClone&gt; create_account_order_sell_only_using_post(account_id, req)

Create sell-only account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

account_id = 'account_id_example' # String | account_id

req = NucleusApi::AccountPortfolioRebalanceRequest.new # AccountPortfolioRebalanceRequest | req


begin
  #Create sell-only account rebalance orders
  result = api_instance.create_account_order_sell_only_using_post(account_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_account_order_sell_only_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**Array&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_client_order_bulk_using_post**
> Array&lt;Order&gt; create_client_order_bulk_using_post(client_id, req)

Bulk orders for a client

Aggregates all orders on a given date for a client

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

client_id = 'client_id_example' # String | client_id

req = NucleusApi::TokenDateRequest.new # TokenDateRequest | req


begin
  #Bulk orders for a client
  result = api_instance.create_client_order_bulk_using_post(client_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_client_order_bulk_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| client_id | 
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req | 

### Return type

[**Array&lt;Order&gt;**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_order_bulk_using_post**
> Array&lt;Order&gt; create_order_bulk_using_post(req)

Bulk orders for your firm

Aggregates all orders on a given date for your firm.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

req = NucleusApi::TokenDateRequest.new # TokenDateRequest | req


begin
  #Bulk orders for your firm
  result = api_instance.create_order_bulk_using_post(req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_order_bulk_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req | 

### Return type

[**Array&lt;Order&gt;**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_order_status_using_post**
> OrderStatus create_order_status_using_post(order_status_request)

Create an order status

Create an order status for your firm.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_status_request = NucleusApi::OrderStatus.new # OrderStatus | orderStatusRequest


begin
  #Create an order status
  result = api_instance.create_order_status_using_post(order_status_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_order_status_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status_request** | [**OrderStatus**](OrderStatus.md)| orderStatusRequest | 

### Return type

[**OrderStatus**](OrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_order_track_using_post**
> OrderTrack create_order_track_using_post(order_track_request)

Create an order tracking record

Create a new order tracking record for an order.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_track_request = NucleusApi::OrderTrack.new # OrderTrack | orderTrackRequest


begin
  #Create an order tracking record
  result = api_instance.create_order_track_using_post(order_track_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_order_track_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track_request** | [**OrderTrack**](OrderTrack.md)| orderTrackRequest | 

### Return type

[**OrderTrack**](OrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_order_using_post**
> Order create_order_using_post(order_info_request)

Create an order record

Create an order record defined for your firm.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_info_request = NucleusApi::Order.new # Order | orderInfoRequest


begin
  #Create an order record
  result = api_instance.create_order_using_post(order_info_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_order_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_info_request** | [**Order**](Order.md)| orderInfoRequest | 

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_portfolio_order_buy_only_using_post**
> Array&lt;OrderVoClone&gt; create_portfolio_order_buy_only_using_post(portfolio_id, req)

Create buy-only portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes. However, these will only be buy transactions, and no securities will be sold.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

portfolio_id = 'portfolio_id_example' # String | portfolio_id

req = NucleusApi::AccountPortfolioRebalanceRequest.new # AccountPortfolioRebalanceRequest | req


begin
  #Create buy-only portfolio rebalance orders
  result = api_instance.create_portfolio_order_buy_only_using_post(portfolio_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_portfolio_order_buy_only_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**String**](.md)| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**Array&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_portfolio_order_rebalance_using_post**
> Array&lt;OrderVoClone&gt; create_portfolio_order_rebalance_using_post(portfolio_id, req)

Create portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

portfolio_id = 'portfolio_id_example' # String | portfolio_id

req = NucleusApi::AccountPortfolioRebalanceRequest.new # AccountPortfolioRebalanceRequest | req


begin
  #Create portfolio rebalance orders
  result = api_instance.create_portfolio_order_rebalance_using_post(portfolio_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_portfolio_order_rebalance_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**String**](.md)| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**Array&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_portfolio_order_reconciliation**
> OrderReconcileReturnObject create_portfolio_order_reconciliation(portfolio_id, req)

Create portfolio reconciliation order

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

portfolio_id = 'portfolio_id_example' # String | portfolio_id

req = NucleusApi::OrderReconcileRequest.new # OrderReconcileRequest | req


begin
  #Create portfolio reconciliation order
  result = api_instance.create_portfolio_order_reconciliation(portfolio_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_portfolio_order_reconciliation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**String**](.md)| portfolio_id | 
 **req** | [**OrderReconcileRequest**](OrderReconcileRequest.md)| req | 

### Return type

[**OrderReconcileReturnObject**](OrderReconcileReturnObject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_portfolio_order_sell_all_using_post**
> Array&lt;OrderVoClone&gt; create_portfolio_order_sell_all_using_post(portfolio_id, req)

Sell all portfolio order

Create order records necessary to entirely sell all the holdings within a portfolio.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

portfolio_id = 'portfolio_id_example' # String | portfolio_id

req = NucleusApi::AccountPortfolioRebalanceRequest.new # AccountPortfolioRebalanceRequest | req


begin
  #Sell all portfolio order
  result = api_instance.create_portfolio_order_sell_all_using_post(portfolio_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_portfolio_order_sell_all_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**String**](.md)| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**Array&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_portfolio_order_sell_only_using_post**
> Array&lt;OrderVoClone&gt; create_portfolio_order_sell_only_using_post(portfolio_id, req)

Create sell-only portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

portfolio_id = 'portfolio_id_example' # String | portfolio_id

req = NucleusApi::AccountPortfolioRebalanceRequest.new # AccountPortfolioRebalanceRequest | req


begin
  #Create sell-only portfolio rebalance orders
  result = api_instance.create_portfolio_order_sell_only_using_post(portfolio_id, req)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->create_portfolio_order_sell_only_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**String**](.md)| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**Array&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_order_status_using_delete**
> delete_order_status_using_delete(order_status_id)

Delete an order status

Permanently delete an order status defined for your firm.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_status_id = 'order_status_id_example' # String | UUID order_status_id


begin
  #Delete an order status
  api_instance.delete_order_status_using_delete(order_status_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->delete_order_status_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status_id** | [**String**](.md)| UUID order_status_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_order_track_using_delete**
> delete_order_track_using_delete(order_track_id)

Delete an order tracking record

Permanently delete an order tracking record for an order.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_track_id = 'order_track_id_example' # String | UUID order_track_id


begin
  #Delete an order tracking record
  api_instance.delete_order_track_using_delete(order_track_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->delete_order_track_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track_id** | [**String**](.md)| UUID order_track_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_order_using_delete**
> delete_order_using_delete(order_id)

Delete an order record

Permanently delete an order record.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_id = 'order_id_example' # String | UUID order_id


begin
  #Delete an order record
  api_instance.delete_order_using_delete(order_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->delete_order_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | [**String**](.md)| UUID order_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_order_all_using_get**
> PageOrder get_order_all_using_get(opts)

List all order records

Get the information for all order records defined for your firm.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all order records
  result = api_instance.get_order_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->get_order_all_using_get: #{e}"
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

[**PageOrder**](PageOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_order_bulk_all_using_get**
> PageOrderBulk get_order_bulk_all_using_get(opts)

List all bulk orders

Get the information for all bulk order records.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

opts = { 
  ascending: true, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'order_bulk_id', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all bulk orders
  result = api_instance.get_order_bulk_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->get_order_bulk_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to true]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to order_bulk_id]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageOrderBulk**](PageOrderBulk.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_order_status_all_using_get**
> PageOrderStatus get_order_status_all_using_get(opts)

List all order statuses

Get the information for all order statuses defined for your firm.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all order statuses
  result = api_instance.get_order_status_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->get_order_status_all_using_get: #{e}"
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

[**PageOrderStatus**](PageOrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_order_status_using_get**
> OrderStatus get_order_status_using_get(order_status_id)

Retrieve an order status

Retrieve the information for an order status defined for your firm.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_status_id = 'order_status_id_example' # String | UUID order_status_id


begin
  #Retrieve an order status
  result = api_instance.get_order_status_using_get(order_status_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->get_order_status_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status_id** | [**String**](.md)| UUID order_status_id | 

### Return type

[**OrderStatus**](OrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_order_track_all_using_get**
> PageOrderTrack get_order_track_all_using_get(opts)

List all order tracking records

Get the information for all order tracking record for all order records.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all order tracking records
  result = api_instance.get_order_track_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->get_order_track_all_using_get: #{e}"
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

[**PageOrderTrack**](PageOrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_order_track_using_get**
> OrderTrack get_order_track_using_get(order_track_id)

Retrieve an order tracking record

Retrieve the information for an order tracking record for an order.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_track_id = 'order_track_id_example' # String | UUID order_track_id


begin
  #Retrieve an order tracking record
  result = api_instance.get_order_track_using_get(order_track_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->get_order_track_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track_id** | [**String**](.md)| UUID order_track_id | 

### Return type

[**OrderTrack**](OrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_order_using_get**
> Order get_order_using_get(order_id)

Retrieve an order record

Retrieve the information for an order record.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_id = 'order_id_example' # String | UUID order_id


begin
  #Retrieve an order record
  result = api_instance.get_order_using_get(order_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->get_order_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | [**String**](.md)| UUID order_id | 

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_order_status_using_put**
> OrderStatus update_order_status_using_put(order_status, order_status_id)

Update an order status

Update the information for an order status defined for your firm.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_status = NucleusApi::OrderStatus.new # OrderStatus | order_status

order_status_id = 'order_status_id_example' # String | UUID order_status_id


begin
  #Update an order status
  result = api_instance.update_order_status_using_put(order_status, order_status_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->update_order_status_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status** | [**OrderStatus**](OrderStatus.md)| order_status | 
 **order_status_id** | [**String**](.md)| UUID order_status_id | 

### Return type

[**OrderStatus**](OrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_order_track_using_put**
> OrderTrack update_order_track_using_put(order_track, order_track_id)

Update an order tracking record

Update the information for an order tracking record for an order.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order_track = NucleusApi::OrderTrack.new # OrderTrack | order_track

order_track_id = 'order_track_id_example' # String | UUID order_track_id


begin
  #Update an order tracking record
  result = api_instance.update_order_track_using_put(order_track, order_track_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->update_order_track_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track** | [**OrderTrack**](OrderTrack.md)| order_track | 
 **order_track_id** | [**String**](.md)| UUID order_track_id | 

### Return type

[**OrderTrack**](OrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_order_using_put**
> Order update_order_using_put(order, order_id)

Update an order record

Update the information for an order record.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OrderApi.new

order = NucleusApi::Order.new # Order | order

order_id = 'order_id_example' # String | UUID order_id


begin
  #Update an order record
  result = api_instance.update_order_using_put(order, order_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OrderApi->update_order_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| order | 
 **order_id** | [**String**](.md)| UUID order_id | 

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



