# NucleusApi::FinancialStatementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_financial_statement_using_post**](FinancialStatementApi.md#create_financial_statement_using_post) | **POST** /financial_statement | Create an financialStatement
[**delete_financial_statement_using_delete**](FinancialStatementApi.md#delete_financial_statement_using_delete) | **DELETE** /financial_statement/{financial_statement_id} | Delete an financialStatement
[**get_financial_statement_all_using_get**](FinancialStatementApi.md#get_financial_statement_all_using_get) | **GET** /financial_statement | List all financialStatement
[**get_financial_statement_using_get**](FinancialStatementApi.md#get_financial_statement_using_get) | **GET** /financial_statement/{financial_statement_id} | Retrieve an financialStatement
[**update_financial_statement_using_put**](FinancialStatementApi.md#update_financial_statement_using_put) | **PUT** /financial_statement/{financial_statement_id} | Update an financialStatement


# **create_financial_statement_using_post**
> FinancialStatement create_financial_statement_using_post(financial_statement)

Create an financialStatement

Store stats pulled from financialStatement vendors.

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

api_instance = NucleusApi::FinancialStatementApi.new

financial_statement = NucleusApi::FinancialStatement.new # FinancialStatement | financialStatement


begin
  #Create an financialStatement
  result = api_instance.create_financial_statement_using_post(financial_statement)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling FinancialStatementApi->create_financial_statement_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement** | [**FinancialStatement**](FinancialStatement.md)| financialStatement | 

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_financial_statement_using_delete**
> delete_financial_statement_using_delete(financial_statement_id)

Delete an financialStatement

Permanently delete an financialStatement.

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

api_instance = NucleusApi::FinancialStatementApi.new

financial_statement_id = 'financial_statement_id_example' # String | UUID financialStatement_id


begin
  #Delete an financialStatement
  api_instance.delete_financial_statement_using_delete(financial_statement_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling FinancialStatementApi->delete_financial_statement_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement_id** | [**String**](.md)| UUID financialStatement_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_financial_statement_all_using_get**
> PageFinancialStatement get_financial_statement_all_using_get(opts)

List all financialStatement

Get information for all financialStatement for all clients defined for your firm.

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

api_instance = NucleusApi::FinancialStatementApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  currency_conversion: 'currency_conversion_example', # String | currency_conversion
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all financialStatement
  result = api_instance.get_financial_statement_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling FinancialStatementApi->get_financial_statement_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **currency_conversion** | **String**| currency_conversion | [optional] 
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageFinancialStatement**](PageFinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_financial_statement_using_get**
> FinancialStatement get_financial_statement_using_get(financial_statement_id, opts)

Retrieve an financialStatement

Retrieve the information for a specific financialStatement associated with a client.

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

api_instance = NucleusApi::FinancialStatementApi.new

financial_statement_id = 'financial_statement_id_example' # String | UUID financial_statement_id

opts = { 
  currency_conversion: 'currency_conversion_example' # String | USD
}

begin
  #Retrieve an financialStatement
  result = api_instance.get_financial_statement_using_get(financial_statement_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling FinancialStatementApi->get_financial_statement_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement_id** | [**String**](.md)| UUID financial_statement_id | 
 **currency_conversion** | **String**| USD | [optional] 

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_financial_statement_using_put**
> FinancialStatement update_financial_statement_using_put(financial_statement, financial_statement_id)

Update an financialStatement

Update the information for an financialStatement.

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

api_instance = NucleusApi::FinancialStatementApi.new

financial_statement = NucleusApi::FinancialStatement.new # FinancialStatement | financialStatement

financial_statement_id = 'financial_statement_id_example' # String | UUID financialStatement_id


begin
  #Update an financialStatement
  result = api_instance.update_financial_statement_using_put(financial_statement, financial_statement_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling FinancialStatementApi->update_financial_statement_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement** | [**FinancialStatement**](FinancialStatement.md)| financialStatement | 
 **financial_statement_id** | [**String**](.md)| UUID financialStatement_id | 

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



