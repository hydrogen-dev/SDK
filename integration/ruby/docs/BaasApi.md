# IntegrationApi::BaasApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_baas_account_using_post**](BaasApi.md#create_baas_account_using_post) | **POST** /baas/account | create a Baas account
[**create_baas_client_using_post**](BaasApi.md#create_baas_client_using_post) | **POST** /baas/client | Create a Baas Client
[**create_baas_sub_account_using_post**](BaasApi.md#create_baas_sub_account_using_post) | **POST** /baas/subaccount | create a Baas subaccount
[**get_baas_account_statement_using_get**](BaasApi.md#get_baas_account_statement_using_get) | **GET** /baas/statement/{nucleus_account_id} | Get a Baas account statement
[**get_baas_portfolio_balance_using_get**](BaasApi.md#get_baas_portfolio_balance_using_get) | **GET** /baas/balance/{nucleus_portfolio_id} | Get a Baas portfolio balance
[**get_baas_portfolio_transaction_using_get**](BaasApi.md#get_baas_portfolio_transaction_using_get) | **GET** /baas/transaction/{nucleus_portfolio_id} | Get a Baas portfolio transaction
[**update_baas_client_using_put**](BaasApi.md#update_baas_client_using_put) | **PUT** /baas/client | Update a Baas client


# **create_baas_account_using_post**
> BaasAccountVO create_baas_account_using_post(baas_account_co)

create a Baas account

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
end


api_instance = IntegrationApi::BaasApi.new

baas_account_co = IntegrationApi::BaasAccountCO.new # BaasAccountCO | baasAccountCO


begin
  #create a Baas account
  result = api_instance.create_baas_account_using_post(baas_account_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BaasApi->create_baas_account_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_account_co** | [**BaasAccountCO**](BaasAccountCO.md)| baasAccountCO | 

### Return type

[**BaasAccountVO**](BaasAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_baas_client_using_post**
> BaasClientVO create_baas_client_using_post(baas_client_co)

Create a Baas Client

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
end


api_instance = IntegrationApi::BaasApi.new

baas_client_co = IntegrationApi::BaasClientCO.new # BaasClientCO | baasClientCO


begin
  #Create a Baas Client
  result = api_instance.create_baas_client_using_post(baas_client_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BaasApi->create_baas_client_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_client_co** | [**BaasClientCO**](BaasClientCO.md)| baasClientCO | 

### Return type

[**BaasClientVO**](BaasClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_baas_sub_account_using_post**
> BaasSubAccountVO create_baas_sub_account_using_post(baas_sub_account_co)

create a Baas subaccount

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
end


api_instance = IntegrationApi::BaasApi.new

baas_sub_account_co = IntegrationApi::BaasSubAccountCO.new # BaasSubAccountCO | baasSubAccountCO


begin
  #create a Baas subaccount
  result = api_instance.create_baas_sub_account_using_post(baas_sub_account_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BaasApi->create_baas_sub_account_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_sub_account_co** | [**BaasSubAccountCO**](BaasSubAccountCO.md)| baasSubAccountCO | 

### Return type

[**BaasSubAccountVO**](BaasSubAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **get_baas_account_statement_using_get**
> BaasStatementsVO get_baas_account_statement_using_get(end_date, nucleus_account_id, start_date, opts)

Get a Baas account statement

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
end


api_instance = IntegrationApi::BaasApi.new

end_date = Date.parse('2013-10-20') # Date | end_date

nucleus_account_id = 'nucleus_account_id_example' # String | nucleus_account_id

start_date = Date.parse('2013-10-20') # Date | start_date

opts = { 
  statement_type: 'statement_type_example' # String | statement_type
}

begin
  #Get a Baas account statement
  result = api_instance.get_baas_account_statement_using_get(end_date, nucleus_account_id, start_date, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BaasApi->get_baas_account_statement_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **Date**| end_date | 
 **nucleus_account_id** | [**String**](.md)| nucleus_account_id | 
 **start_date** | **Date**| start_date | 
 **statement_type** | **String**| statement_type | [optional] 

### Return type

[**BaasStatementsVO**](BaasStatementsVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_baas_portfolio_balance_using_get**
> BaasBalanceVO get_baas_portfolio_balance_using_get(nucleus_portfolio_id, opts)

Get a Baas portfolio balance

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
end


api_instance = IntegrationApi::BaasApi.new

nucleus_portfolio_id = 'nucleus_portfolio_id_example' # String | nucleus_portfolio_id

opts = { 
  end_date: Date.parse('2013-10-20'), # Date | end_date
  start_date: Date.parse('2013-10-20') # Date | start_date
}

begin
  #Get a Baas portfolio balance
  result = api_instance.get_baas_portfolio_balance_using_get(nucleus_portfolio_id, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BaasApi->get_baas_portfolio_balance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**String**](.md)| nucleus_portfolio_id | 
 **end_date** | **Date**| end_date | [optional] 
 **start_date** | **Date**| start_date | [optional] 

### Return type

[**BaasBalanceVO**](BaasBalanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_baas_portfolio_transaction_using_get**
> BaasTransactionsVO get_baas_portfolio_transaction_using_get(nucleus_portfolio_id, opts)

Get a Baas portfolio transaction

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
end


api_instance = IntegrationApi::BaasApi.new

nucleus_portfolio_id = 'nucleus_portfolio_id_example' # String | nucleus_portfolio_id

opts = { 
  end_date: Date.parse('2013-10-20'), # Date | end_date
  start_date: Date.parse('2013-10-20') # Date | start_date
}

begin
  #Get a Baas portfolio transaction
  result = api_instance.get_baas_portfolio_transaction_using_get(nucleus_portfolio_id, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BaasApi->get_baas_portfolio_transaction_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**String**](.md)| nucleus_portfolio_id | 
 **end_date** | **Date**| end_date | [optional] 
 **start_date** | **Date**| start_date | [optional] 

### Return type

[**BaasTransactionsVO**](BaasTransactionsVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_baas_client_using_put**
> BaasClientVO update_baas_client_using_put(baas_client_co)

Update a Baas client

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
end


api_instance = IntegrationApi::BaasApi.new

baas_client_co = IntegrationApi::BaasClientCO.new # BaasClientCO | baasClientCO


begin
  #Update a Baas client
  result = api_instance.update_baas_client_using_put(baas_client_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling BaasApi->update_baas_client_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_client_co** | [**BaasClientCO**](BaasClientCO.md)| baasClientCO | 

### Return type

[**BaasClientVO**](BaasClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



