# IntegrationApi::BrokerageApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_bank_link_using_post**](BrokerageApi.md#create_bank_link_using_post) | **POST** /brokerage/bank_link | create a Bank Link
[**create_brokerage_account_using_post**](BrokerageApi.md#create_brokerage_account_using_post) | **POST** /brokerage/account | create a Brokerage account
[**create_brokerage_client_using_post**](BrokerageApi.md#create_brokerage_client_using_post) | **POST** /brokerage/client | Create a Brokerage Client
[**create_order_using_post**](BrokerageApi.md#create_order_using_post) | **POST** /brokerage/order | Create an Order
[**delete_bank_link_using_delete**](BrokerageApi.md#delete_bank_link_using_delete) | **DELETE** /brokerage/bank_link/{nucleus_bank_link_id} | Delete a Bank Link
[**delete_order_using_delete**](BrokerageApi.md#delete_order_using_delete) | **DELETE** /brokerage/order | Delete an Order
[**get_bank_link_using_get**](BrokerageApi.md#get_bank_link_using_get) | **GET** /brokerage/bank_link/{nucleus_bank_link_id} | Get a Bank Link
[**get_brokerage_account_statement_using_get**](BrokerageApi.md#get_brokerage_account_statement_using_get) | **GET** /brokerage/{nucleus_account_id}/statement | Get a Brokerage account statement
[**get_order_using_get**](BrokerageApi.md#get_order_using_get) | **GET** /brokerage/order | Get an Order
[**update_bank_link_using_put**](BrokerageApi.md#update_bank_link_using_put) | **PUT** /brokerage/bank_link/{nucleus_bank_link_id} | Update a Bank Link
[**update_brokerage_client_using_put**](BrokerageApi.md#update_brokerage_client_using_put) | **PUT** /brokerage/client | Update a Brokerage client


# **create_bank_link_using_post**
> BrokerageBankLinkVO create_bank_link_using_post(brokerage_bank_link_co)

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
  result = api_instance.create_bank_link_using_post(brokerage_bank_link_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->create_bank_link_using_post: #{e}"
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



# **create_order_using_post**
> CreateOrderResponse create_order_using_post(nucleus_order_id)

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

nucleus_order_id = 'nucleus_order_id_example' # String | nucleus_order_id


begin
  #Create an Order
  result = api_instance.create_order_using_post(nucleus_order_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->create_order_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**String**](.md)| nucleus_order_id | 

### Return type

[**CreateOrderResponse**](CreateOrderResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_bank_link_using_delete**
> ResponseEntity delete_bank_link_using_delete(nucleus_bank_link_id)

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
  result = api_instance.delete_bank_link_using_delete(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->delete_bank_link_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_order_using_delete**
> delete_order_using_delete(nucleus_order_id)

Delete an Order

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
  #Delete an Order
  api_instance.delete_order_using_delete(nucleus_order_id)
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->delete_order_using_delete: #{e}"
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

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_bank_link_using_get**
> BrokerageBankLinkVO get_bank_link_using_get(nucleus_bank_link_id)

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
  result = api_instance.get_bank_link_using_get(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->get_bank_link_using_get: #{e}"
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



# **get_order_using_get**
> GetOrderResponse get_order_using_get(nucleus_order_id)

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

[**GetOrderResponse**](GetOrderResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_bank_link_using_put**
> BrokerageBankLinkVO update_bank_link_using_put(nucleus_bank_link_id)

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
  result = api_instance.update_bank_link_using_put(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BrokerageApi->update_bank_link_using_put: #{e}"
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



