# IntegrationApi::BrokerageApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_order_using_put**](BrokerageApi.md#cancel_order_using_put) | **PUT** /brokerage/order/{nucleus_order_id} | Cancel an Order
[**create_bank_link_using_post1**](BrokerageApi.md#create_bank_link_using_post1) | **POST** /brokerage/bank_link | create a Bank Link
[**create_brokerage_account_using_post**](BrokerageApi.md#create_brokerage_account_using_post) | **POST** /brokerage/account | create a Brokerage account
[**create_brokerage_client_using_post**](BrokerageApi.md#create_brokerage_client_using_post) | **POST** /brokerage/client | Create a Brokerage Client
[**create_deposit_using_post**](BrokerageApi.md#create_deposit_using_post) | **POST** /brokerage/deposit | Create a deposit
[**create_document_using_post**](BrokerageApi.md#create_document_using_post) | **POST** /brokerage/document | Create a Brokerage document
[**create_order_using_post**](BrokerageApi.md#create_order_using_post) | **POST** /brokerage/order | Create an Order
[**create_withdrawal_using_post**](BrokerageApi.md#create_withdrawal_using_post) | **POST** /brokerage/withdrawal | Create a withdrawal
[**delete_bank_link_using_delete1**](BrokerageApi.md#delete_bank_link_using_delete1) | **DELETE** /brokerage/bank_link/{nucleus_bank_link_id} | Delete a Bank Link
[**get_balance_using_get1**](BrokerageApi.md#get_balance_using_get1) | **GET** /brokerage/balance/{nucleus_portfolio_id} | Get account balance
[**get_bank_link_using_get1**](BrokerageApi.md#get_bank_link_using_get1) | **GET** /brokerage/bank_link/{nucleus_bank_link_id} | Get a Bank Link
[**get_brokerage_account_statement_using_get**](BrokerageApi.md#get_brokerage_account_statement_using_get) | **GET** /brokerage/statement/{nucleus_account_id} | Get a Brokerage account statement
[**get_document_using_get**](BrokerageApi.md#get_document_using_get) | **GET** /brokerage/document/{nucleus_document_id} | Get a Brokerage document
[**get_holding_performance_using_get**](BrokerageApi.md#get_holding_performance_using_get) | **GET** /brokerage/holding/performance/{nucleus_portfolio_id} | Get portfolio holding performance
[**get_holding_using_get**](BrokerageApi.md#get_holding_using_get) | **GET** /brokerage/holding/{nucleus_portfolio_id} | Get portfolio holdings
[**get_order_using_get**](BrokerageApi.md#get_order_using_get) | **GET** /brokerage/order/{nucleus_order_id} | Get an Order
[**get_securities_using_get**](BrokerageApi.md#get_securities_using_get) | **GET** /brokerage/securities | Get securities information
[**get_transactions_using_get**](BrokerageApi.md#get_transactions_using_get) | **GET** /brokerage/transaction/{nucleus_portfolio_id} | Get account transactions
[**update_bank_link_using_put1**](BrokerageApi.md#update_bank_link_using_put1) | **PUT** /brokerage/bank_link/{nucleus_bank_link_id} | Update a Bank Link
[**update_brokerage_client_using_put**](BrokerageApi.md#update_brokerage_client_using_put) | **PUT** /brokerage/client | Update a Brokerage client


# **cancel_order_using_put**
> cancel_order_using_put(nucleus_order_id)

Cancel an Order

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

api_instance = IntegrationApi::BrokerageApi.new

nucleus_order_id = 'nucleus_order_id_example' # String | nucleus_order_id


begin
  #Cancel an Order
  api_instance.cancel_order_using_put(nucleus_order_id)
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->cancel_order_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**String**](.md)| nucleus_order_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_bank_link_using_post1**
> BrokerageBankLinkVO create_bank_link_using_post1(brokerage_bank_link_co)

create a Bank Link

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

api_instance = IntegrationApi::BrokerageApi.new

brokerage_bank_link_co = IntegrationApi::BrokerageBankLinkCO.new # BrokerageBankLinkCO | brokerageBankLinkCO


begin
  #create a Bank Link
  result = api_instance.create_bank_link_using_post1(brokerage_bank_link_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->create_bank_link_using_post1: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_bank_link_co** | [**BrokerageBankLinkCO**](BrokerageBankLinkCO.md)| brokerageBankLinkCO | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_brokerage_account_using_post**
> BrokerageAccountVO create_brokerage_account_using_post(brokerage_account_co)

create a Brokerage account

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

api_instance = IntegrationApi::BrokerageApi.new

brokerage_account_co = IntegrationApi::BrokerageAccountCO.new # BrokerageAccountCO | brokerageAccountCO


begin
  #create a Brokerage account
  result = api_instance.create_brokerage_account_using_post(brokerage_account_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->create_brokerage_account_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_account_co** | [**BrokerageAccountCO**](BrokerageAccountCO.md)| brokerageAccountCO | 

### Return type

[**BrokerageAccountVO**](BrokerageAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_brokerage_client_using_post**
> BrokerageCreateClientVO create_brokerage_client_using_post(client_co)

Create a Brokerage Client

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

api_instance = IntegrationApi::BrokerageApi.new

client_co = IntegrationApi::BrokerageClientCO.new # BrokerageClientCO | clientCO


begin
  #Create a Brokerage Client
  result = api_instance.create_brokerage_client_using_post(client_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->create_brokerage_client_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_co** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO | 

### Return type

[**BrokerageCreateClientVO**](BrokerageCreateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_deposit_using_post**
> BrokerageDepositVO create_deposit_using_post(brokerage_deposit_co)

Create a deposit

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

api_instance = IntegrationApi::BrokerageApi.new

brokerage_deposit_co = IntegrationApi::BrokerageDepositCO.new # BrokerageDepositCO | brokerageDepositCO


begin
  #Create a deposit
  result = api_instance.create_deposit_using_post(brokerage_deposit_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->create_deposit_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_deposit_co** | [**BrokerageDepositCO**](BrokerageDepositCO.md)| brokerageDepositCO | 

### Return type

[**BrokerageDepositVO**](BrokerageDepositVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_document_using_post**
> BrokerageDocumentVO create_document_using_post(document_co)

Create a Brokerage document

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

api_instance = IntegrationApi::BrokerageApi.new

document_co = IntegrationApi::BrokerageDocumentCO.new # BrokerageDocumentCO | documentCO


begin
  #Create a Brokerage document
  result = api_instance.create_document_using_post(document_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->create_document_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_co** | [**BrokerageDocumentCO**](BrokerageDocumentCO.md)| documentCO | 

### Return type

[**BrokerageDocumentVO**](BrokerageDocumentVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_order_using_post**
> BrokerageOrderVO create_order_using_post(brokerage_order_co)

Create an Order

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

api_instance = IntegrationApi::BrokerageApi.new

brokerage_order_co = IntegrationApi::BrokerageOrderCO.new # BrokerageOrderCO | brokerageOrderCO


begin
  #Create an Order
  result = api_instance.create_order_using_post(brokerage_order_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->create_order_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_order_co** | [**BrokerageOrderCO**](BrokerageOrderCO.md)| brokerageOrderCO | 

### Return type

[**BrokerageOrderVO**](BrokerageOrderVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_withdrawal_using_post**
> BrokerageWithdrawalVO create_withdrawal_using_post(brokerage_withdrawal_co)

Create a withdrawal

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

api_instance = IntegrationApi::BrokerageApi.new

brokerage_withdrawal_co = IntegrationApi::BrokerageWithdrawalCO.new # BrokerageWithdrawalCO | brokerageWithdrawalCO


begin
  #Create a withdrawal
  result = api_instance.create_withdrawal_using_post(brokerage_withdrawal_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->create_withdrawal_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_withdrawal_co** | [**BrokerageWithdrawalCO**](BrokerageWithdrawalCO.md)| brokerageWithdrawalCO | 

### Return type

[**BrokerageWithdrawalVO**](BrokerageWithdrawalVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_bank_link_using_delete1**
> delete_bank_link_using_delete1(nucleus_bank_link_id)

Delete a Bank Link

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

api_instance = IntegrationApi::BrokerageApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Delete a Bank Link
  api_instance.delete_bank_link_using_delete1(nucleus_bank_link_id)
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->delete_bank_link_using_delete1: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_balance_using_get1**
> BrokerageBalanceVO get_balance_using_get1(nucleus_portfolio_id)

Get account balance

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

api_instance = IntegrationApi::BrokerageApi.new

nucleus_portfolio_id = 'nucleus_portfolio_id_example' # String | nucleus_portfolio_id


begin
  #Get account balance
  result = api_instance.get_balance_using_get1(nucleus_portfolio_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->get_balance_using_get1: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**String**](.md)| nucleus_portfolio_id | 

### Return type

[**BrokerageBalanceVO**](BrokerageBalanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_bank_link_using_get1**
> BrokerageBankLinkVO get_bank_link_using_get1(nucleus_bank_link_id)

Get a Bank Link

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

api_instance = IntegrationApi::BrokerageApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Get a Bank Link
  result = api_instance.get_bank_link_using_get1(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->get_bank_link_using_get1: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_brokerage_account_statement_using_get**
> BrokerageStatementVO get_brokerage_account_statement_using_get(end_date, nucleus_account_id, start_date, statement_type)

Get a Brokerage account statement

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

api_instance = IntegrationApi::BrokerageApi.new

end_date = DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | end_date

nucleus_account_id = 'nucleus_account_id_example' # String | nucleus_account_id

start_date = DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | start_date

statement_type = 'statement_type_example' # String | statement_type


begin
  #Get a Brokerage account statement
  result = api_instance.get_brokerage_account_statement_using_get(end_date, nucleus_account_id, start_date, statement_type)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->get_brokerage_account_statement_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **DateTime**| end_date | 
 **nucleus_account_id** | [**String**](.md)| nucleus_account_id | 
 **start_date** | **DateTime**| start_date | 
 **statement_type** | **String**| statement_type | 

### Return type

[**BrokerageStatementVO**](BrokerageStatementVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_document_using_get**
> BrokerageDocumentVO get_document_using_get(nucleus_document_id)

Get a Brokerage document

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

api_instance = IntegrationApi::BrokerageApi.new

nucleus_document_id = 'nucleus_document_id_example' # String | nucleus_document_id


begin
  #Get a Brokerage document
  result = api_instance.get_document_using_get(nucleus_document_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->get_document_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_document_id** | [**String**](.md)| nucleus_document_id | 

### Return type

[**BrokerageDocumentVO**](BrokerageDocumentVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_holding_performance_using_get**
> BrokeragePerformanceVO get_holding_performance_using_get(nucleus_portfolio_id)

Get portfolio holding performance

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

api_instance = IntegrationApi::BrokerageApi.new

nucleus_portfolio_id = 'nucleus_portfolio_id_example' # String | nucleus_portfolio_id


begin
  #Get portfolio holding performance
  result = api_instance.get_holding_performance_using_get(nucleus_portfolio_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->get_holding_performance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**String**](.md)| nucleus_portfolio_id | 

### Return type

[**BrokeragePerformanceVO**](BrokeragePerformanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_holding_using_get**
> BrokerageHoldingVO get_holding_using_get(nucleus_portfolio_id)

Get portfolio holdings

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

api_instance = IntegrationApi::BrokerageApi.new

nucleus_portfolio_id = 'nucleus_portfolio_id_example' # String | nucleus_portfolio_id


begin
  #Get portfolio holdings
  result = api_instance.get_holding_using_get(nucleus_portfolio_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->get_holding_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**String**](.md)| nucleus_portfolio_id | 

### Return type

[**BrokerageHoldingVO**](BrokerageHoldingVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_order_using_get**
> BrokerageOrderVO get_order_using_get(nucleus_order_id)

Get an Order

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

api_instance = IntegrationApi::BrokerageApi.new

nucleus_order_id = 'nucleus_order_id_example' # String | nucleus_order_id


begin
  #Get an Order
  result = api_instance.get_order_using_get(nucleus_order_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->get_order_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**String**](.md)| nucleus_order_id | 

### Return type

[**BrokerageOrderVO**](BrokerageOrderVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_securities_using_get**
> BrokerageSecuritiesVO get_securities_using_get(vendor_name, opts)

Get securities information

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

api_instance = IntegrationApi::BrokerageApi.new

vendor_name = 'vendor_name_example' # String | vendor_name

opts = { 
  get_fundamentals: false, # BOOLEAN | get_fundamentals
  nucleus_security_id: 'nucleus_security_id_example' # String | nucleus_security_id
}

begin
  #Get securities information
  result = api_instance.get_securities_using_get(vendor_name, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->get_securities_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendor_name** | **String**| vendor_name | 
 **get_fundamentals** | **BOOLEAN**| get_fundamentals | [optional] [default to false]
 **nucleus_security_id** | [**String**](.md)| nucleus_security_id | [optional] 

### Return type

[**BrokerageSecuritiesVO**](BrokerageSecuritiesVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_transactions_using_get**
> BrokerageTransactionVO get_transactions_using_get(drivewealth_response, end_date, nucleus_portfolio_id, start_date)

Get account transactions

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

api_instance = IntegrationApi::BrokerageApi.new

drivewealth_response = IntegrationApi::GetTransactionsResponse.new # GetTransactionsResponse | drivewealthResponse

end_date = Date.parse('2013-10-20') # Date | end_date

nucleus_portfolio_id = 'nucleus_portfolio_id_example' # String | nucleus_portfolio_id

start_date = Date.parse('2013-10-20') # Date | start_date


begin
  #Get account transactions
  result = api_instance.get_transactions_using_get(drivewealth_response, end_date, nucleus_portfolio_id, start_date)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->get_transactions_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivewealth_response** | [**GetTransactionsResponse**](GetTransactionsResponse.md)| drivewealthResponse | 
 **end_date** | **Date**| end_date | 
 **nucleus_portfolio_id** | [**String**](.md)| nucleus_portfolio_id | 
 **start_date** | **Date**| start_date | 

### Return type

[**BrokerageTransactionVO**](BrokerageTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_bank_link_using_put1**
> BrokerageBankLinkVO update_bank_link_using_put1(nucleus_bank_link_id)

Update a Bank Link

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

api_instance = IntegrationApi::BrokerageApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Update a Bank Link
  result = api_instance.update_bank_link_using_put1(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->update_bank_link_using_put1: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_brokerage_client_using_put**
> BrokerageUpdateClientVO update_brokerage_client_using_put(client_co)

Update a Brokerage client

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

api_instance = IntegrationApi::BrokerageApi.new

client_co = IntegrationApi::BrokerageClientCO.new # BrokerageClientCO | clientCO


begin
  #Update a Brokerage client
  result = api_instance.update_brokerage_client_using_put(client_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->update_brokerage_client_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_co** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO | 

### Return type

[**BrokerageUpdateClientVO**](BrokerageUpdateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



