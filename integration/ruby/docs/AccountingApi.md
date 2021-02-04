# IntegrationApi::AccountingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_or_update_customer**](AccountingApi.md#create_or_update_customer) | **GET** /accounting/customer | Update/Create all customers in Nucleus for a given nucleus_client_id
[**create_or_update_customer_revenue**](AccountingApi.md#create_or_update_customer_revenue) | **GET** /accounting/customer_revenue/{nucleus_customer_id} | Update/Create all customers revenue in Nucleus for a given nucleus_customer_id
[**create_or_update_invoice_payment**](AccountingApi.md#create_or_update_invoice_payment) | **GET** /accounting/invoice_payment/{nucleus_invoice_id} | Create/Update invoice payment in Nucleus for a given nucleus_invoice_id
[**create_or_update_invoices**](AccountingApi.md#create_or_update_invoices) | **GET** /accounting/invoice | Update/Create all invoices in Nucleus for a given nucleus_client_id
[**delete_accounting_vendor_access_config_is_active_by_id**](AccountingApi.md#delete_accounting_vendor_access_config_is_active_by_id) | **DELETE** /accounting/vendor/{id} | Permanently delete relation with particular accounting vendor.
[**get_accounting_stats**](AccountingApi.md#get_accounting_stats) | **GET** /accounting/report | Get accounting stats from financial statements at the vendor for the business provided
[**get_accounting_vendor_info_using_client_id**](AccountingApi.md#get_accounting_vendor_info_using_client_id) | **GET** /accounting/vendor/{nucleus_client_id} | Get Accounting Vendor Config
[**update_accounting_vendor_access_config_is_active_by_id**](AccountingApi.md#update_accounting_vendor_access_config_is_active_by_id) | **PUT** /accounting/vendor/{id} | Enable/Disable relation with particular accounting vendor.
[**update_customer**](AccountingApi.md#update_customer) | **GET** /accounting/customer/{nucleus_customer_id} | Update customer in Nucleus for a given nucleus_customer_id
[**update_invoice**](AccountingApi.md#update_invoice) | **GET** /accounting/invoice/{nucleus_invoice_id} | Update invoice in Nucleus for a given nucleus_invoice_id


# **create_or_update_customer**
> AccountingFinalResponseVO create_or_update_customer(nucleus_client_id)

Update/Create all customers in Nucleus for a given nucleus_client_id

Update/Create all customers in Nucleus for a given nucleus_client_id

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

api_instance = IntegrationApi::AccountingApi.new

nucleus_client_id = 'nucleus_client_id_example' # String | nucleus_client_id


begin
  #Update/Create all customers in Nucleus for a given nucleus_client_id
  result = api_instance.create_or_update_customer(nucleus_client_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AccountingApi->create_or_update_customer: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **create_or_update_customer_revenue**
> AccountingFinalResponseVO create_or_update_customer_revenue(nucleus_customer_id, start_date, opts)

Update/Create all customers revenue in Nucleus for a given nucleus_customer_id

Update/Create all customers revenue in Nucleus for a given nucleus_customer_id

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

api_instance = IntegrationApi::AccountingApi.new

nucleus_customer_id = 'nucleus_customer_id_example' # String | nucleus_customer_id

start_date = DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | start_date

opts = { 
  accounting_method: 'accrual', # String | accounting_method
  end_date: DateTime.parse('null') # DateTime | end_date
}

begin
  #Update/Create all customers revenue in Nucleus for a given nucleus_customer_id
  result = api_instance.create_or_update_customer_revenue(nucleus_customer_id, start_date, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AccountingApi->create_or_update_customer_revenue: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_customer_id** | [**String**](.md)| nucleus_customer_id | 
 **start_date** | **DateTime**| start_date | 
 **accounting_method** | **String**| accounting_method | [optional] [default to accrual]
 **end_date** | **DateTime**| end_date | [optional] [default to null]

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **create_or_update_invoice_payment**
> AccountingFinalResponseVO create_or_update_invoice_payment(nucleus_invoice_id)

Create/Update invoice payment in Nucleus for a given nucleus_invoice_id

Create/Update invoice payment in Nucleus for a given nucleus_invoice_id

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

api_instance = IntegrationApi::AccountingApi.new

nucleus_invoice_id = 'nucleus_invoice_id_example' # String | nucleus_invoice_id


begin
  #Create/Update invoice payment in Nucleus for a given nucleus_invoice_id
  result = api_instance.create_or_update_invoice_payment(nucleus_invoice_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AccountingApi->create_or_update_invoice_payment: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_invoice_id** | [**String**](.md)| nucleus_invoice_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **create_or_update_invoices**
> AccountingFinalResponseVO create_or_update_invoices(nucleus_customer_id, start_date, opts)

Update/Create all invoices in Nucleus for a given nucleus_client_id

Update/Create all invoices in Nucleus for a given nucleus_client_id

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

api_instance = IntegrationApi::AccountingApi.new

nucleus_customer_id = 'nucleus_customer_id_example' # String | nucleus_customer_id

start_date = DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | start_date

opts = { 
  end_date: DateTime.parse('null') # DateTime | end_date
}

begin
  #Update/Create all invoices in Nucleus for a given nucleus_client_id
  result = api_instance.create_or_update_invoices(nucleus_customer_id, start_date, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AccountingApi->create_or_update_invoices: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_customer_id** | [**String**](.md)| nucleus_customer_id | 
 **start_date** | **DateTime**| start_date | 
 **end_date** | **DateTime**| end_date | [optional] [default to null]

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **delete_accounting_vendor_access_config_is_active_by_id**
> delete_accounting_vendor_access_config_is_active_by_id(id)

Permanently delete relation with particular accounting vendor.

Permanently delete relation with particular accounting vendor.

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

api_instance = IntegrationApi::AccountingApi.new

id = 'id_example' # String | id


begin
  #Permanently delete relation with particular accounting vendor.
  api_instance.delete_accounting_vendor_access_config_is_active_by_id(id)
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AccountingApi->delete_accounting_vendor_access_config_is_active_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_accounting_stats**
> AccountingFinalResponseVO get_accounting_stats(opts)

Get accounting stats from financial statements at the vendor for the business provided

Get accounting stats from financial statements at the vendor for the business provided

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

api_instance = IntegrationApi::AccountingApi.new

opts = { 
  accounting_method: 'accrual', # String | accounting_method
  nucleus_client_id: 'nucleus_client_id_example', # String | nucleus_client_id
  period_length: 'period_length_example', # String | period_length
  period_month: 56, # Integer | period_month
  period_quarter: 56, # Integer | period_quarter
  period_type: 'period_type_example', # String | period_type
  period_year: 56, # Integer | period_year
  report: 'report_example', # String | report
  statement_date: DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | statement_date
}

begin
  #Get accounting stats from financial statements at the vendor for the business provided
  result = api_instance.get_accounting_stats(opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AccountingApi->get_accounting_stats: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting_method** | **String**| accounting_method | [optional] [default to accrual]
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | [optional] 
 **period_length** | **String**| period_length | [optional] 
 **period_month** | **Integer**| period_month | [optional] 
 **period_quarter** | **Integer**| period_quarter | [optional] 
 **period_type** | **String**| period_type | [optional] 
 **period_year** | **Integer**| period_year | [optional] 
 **report** | **String**| report | [optional] 
 **statement_date** | **DateTime**| statement_date | [optional] 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_accounting_vendor_info_using_client_id**
> VendorAccessConfigVO get_accounting_vendor_info_using_client_id(nucleus_client_id)

Get Accounting Vendor Config

Get Accounting vendor config information with its status.

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

api_instance = IntegrationApi::AccountingApi.new

nucleus_client_id = 'nucleus_client_id_example' # String | nucleus_client_id


begin
  #Get Accounting Vendor Config
  result = api_instance.get_accounting_vendor_info_using_client_id(nucleus_client_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AccountingApi->get_accounting_vendor_info_using_client_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | 

### Return type

[**VendorAccessConfigVO**](VendorAccessConfigVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_accounting_vendor_access_config_is_active_by_id**
> VendorAccessConfigVO update_accounting_vendor_access_config_is_active_by_id(id, is_active)

Enable/Disable relation with particular accounting vendor.

Enable/Disable link with particular accounting vendor.

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

api_instance = IntegrationApi::AccountingApi.new

id = 'id_example' # String | id

is_active = true # BOOLEAN | is_active


begin
  #Enable/Disable relation with particular accounting vendor.
  result = api_instance.update_accounting_vendor_access_config_is_active_by_id(id, is_active)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AccountingApi->update_accounting_vendor_access_config_is_active_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 
 **is_active** | **BOOLEAN**| is_active | 

### Return type

[**VendorAccessConfigVO**](VendorAccessConfigVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_customer**
> AccountingFinalResponseVO update_customer(nucleus_customer_id)

Update customer in Nucleus for a given nucleus_customer_id

Update customer in Nucleus for a given nucleus_customer_id

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

api_instance = IntegrationApi::AccountingApi.new

nucleus_customer_id = 'nucleus_customer_id_example' # String | nucleus_customer_id


begin
  #Update customer in Nucleus for a given nucleus_customer_id
  result = api_instance.update_customer(nucleus_customer_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AccountingApi->update_customer: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_customer_id** | [**String**](.md)| nucleus_customer_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_invoice**
> AccountingFinalResponseVO update_invoice(nucleus_invoice_id)

Update invoice in Nucleus for a given nucleus_invoice_id

Update invoice in Nucleus for a given nucleus_invoice_id

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

api_instance = IntegrationApi::AccountingApi.new

nucleus_invoice_id = 'nucleus_invoice_id_example' # String | nucleus_invoice_id


begin
  #Update invoice in Nucleus for a given nucleus_invoice_id
  result = api_instance.update_invoice(nucleus_invoice_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AccountingApi->update_invoice: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_invoice_id** | [**String**](.md)| nucleus_invoice_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



