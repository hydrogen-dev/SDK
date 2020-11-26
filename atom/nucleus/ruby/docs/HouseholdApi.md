# NucleusApi::HouseholdApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_household_using_post**](HouseholdApi.md#create_household_using_post) | **POST** /household | Create a Household
[**delete_household_using_delete**](HouseholdApi.md#delete_household_using_delete) | **DELETE** /household/{household_id} | Delete a Household
[**get_household_all_using_get**](HouseholdApi.md#get_household_all_using_get) | **GET** /household | List all household
[**get_household_client_asset_size_using_get**](HouseholdApi.md#get_household_client_asset_size_using_get) | **GET** /household/{household_id}/asset_size | List all household client asset sizes
[**get_household_client_holding_using_get**](HouseholdApi.md#get_household_client_holding_using_get) | **GET** /household/{household_id}/holding | List all household&#39;s clientIds holdings
[**get_household_client_transaction_using_get**](HouseholdApi.md#get_household_client_transaction_using_get) | **GET** /household/{household_id}/transaction | List all household&#39;s client ids transactions
[**get_household_using_get**](HouseholdApi.md#get_household_using_get) | **GET** /household/{household_id} | Retrieve a Household
[**update_household_using_put**](HouseholdApi.md#update_household_using_put) | **PUT** /household/{household_id} | Update a Household


# **create_household_using_post**
> Household create_household_using_post(household)

Create a Household

Create a new household, with your firm.

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

api_instance = NucleusApi::HouseholdApi.new

household = NucleusApi::Household.new # Household | household


begin
  #Create a Household
  result = api_instance.create_household_using_post(household)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling HouseholdApi->create_household_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household** | [**Household**](Household.md)| household | 

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_household_using_delete**
> delete_household_using_delete(household_id)

Delete a Household

Permanently delete a household

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

api_instance = NucleusApi::HouseholdApi.new

household_id = 'household_id_example' # String | UUID household_id


begin
  #Delete a Household
  api_instance.delete_household_using_delete(household_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling HouseholdApi->delete_household_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**String**](.md)| UUID household_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_household_all_using_get**
> PageHousehold get_household_all_using_get(opts)

List all household

Get details for all Household.

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

api_instance = NucleusApi::HouseholdApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all household
  result = api_instance.get_household_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling HouseholdApi->get_household_all_using_get: #{e}"
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

[**PageHousehold**](PageHousehold.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_household_client_asset_size_using_get**
> Array&lt;AvailableDateDoubleVO&gt; get_household_client_asset_size_using_get(household_id, opts)

List all household client asset sizes

Get a list of asset sizes per date for a client's household.

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

api_instance = NucleusApi::HouseholdApi.new

household_id = 'household_id_example' # String | UUID household_id

opts = { 
  currency_conversion: 'currency_conversion_example', # String | USD
  end_date: Date.parse('null'), # Date | end date
  exclude_subledger: true, # BOOLEAN | true or false
  get_latest: true, # BOOLEAN | true or false
  sort_type: 'sort_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
  start_date: Date.parse('null') # Date | start date
}

begin
  #List all household client asset sizes
  result = api_instance.get_household_client_asset_size_using_get(household_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling HouseholdApi->get_household_client_asset_size_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**String**](.md)| UUID household_id | 
 **currency_conversion** | **String**| USD | [optional] 
 **end_date** | **Date**| end date | [optional] [default to null]
 **exclude_subledger** | **BOOLEAN**| true or false | [optional] 
 **get_latest** | **BOOLEAN**| true or false | [optional] 
 **sort_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional] 
 **start_date** | **Date**| start date | [optional] [default to null]

### Return type

[**Array&lt;AvailableDateDoubleVO&gt;**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_household_client_holding_using_get**
> Array&lt;PortfolioHoldingAgg&gt; get_household_client_holding_using_get(household_id, opts)

List all household's clientIds holdings

Get the information for all the securities that are currently being held by a household's client ids registered with your firm.

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

api_instance = NucleusApi::HouseholdApi.new

household_id = 'household_id_example' # String | UUID household_id

opts = { 
  currency_conversion: 'currency_conversion_example', # String | USD
  end_date: Date.parse('2013-10-20'), # Date | end date - yyyy-mm-dd
  get_latest: true, # BOOLEAN | true or false
  start_date: Date.parse('2013-10-20') # Date | start date - yyyy-mm-dd
}

begin
  #List all household's clientIds holdings
  result = api_instance.get_household_client_holding_using_get(household_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling HouseholdApi->get_household_client_holding_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**String**](.md)| UUID household_id | 
 **currency_conversion** | **String**| USD | [optional] 
 **end_date** | **Date**| end date - yyyy-mm-dd | [optional] 
 **get_latest** | **BOOLEAN**| true or false | [optional] 
 **start_date** | **Date**| start date - yyyy-mm-dd | [optional] 

### Return type

[**Array&lt;PortfolioHoldingAgg&gt;**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_household_client_transaction_using_get**
> PagePortfolioTransaction get_household_client_transaction_using_get(household_id, opts)

List all household's client ids transactions

Get the information for all transactions under a household client ids registered with your firm.

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

api_instance = NucleusApi::HouseholdApi.new

household_id = 'household_id_example' # String | UUID household_id

opts = { 
  ascending: false, # BOOLEAN | ascending
  currency_conversion: 'currency_conversion_example', # String | USD
  end_date: Date.parse('2013-10-20'), # Date | end date
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25, # Integer | size
  start_date: Date.parse('2013-10-20') # Date | start date
}

begin
  #List all household's client ids transactions
  result = api_instance.get_household_client_transaction_using_get(household_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling HouseholdApi->get_household_client_transaction_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**String**](.md)| UUID household_id | 
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **currency_conversion** | **String**| USD | [optional] 
 **end_date** | **Date**| end date | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **start_date** | **Date**| start date | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_household_using_get**
> Household get_household_using_get(household_id)

Retrieve a Household

Retrieve the information for a Household.

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

api_instance = NucleusApi::HouseholdApi.new

household_id = 'household_id_example' # String | UUID household_id


begin
  #Retrieve a Household
  result = api_instance.get_household_using_get(household_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling HouseholdApi->get_household_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**String**](.md)| UUID household_id | 

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_household_using_put**
> Household update_household_using_put(household, household_id)

Update a Household

Update the information for a Household.

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

api_instance = NucleusApi::HouseholdApi.new

household = NucleusApi::Household.new # Household | household

household_id = 'household_id_example' # String | UUID household_id


begin
  #Update a Household
  result = api_instance.update_household_using_put(household, household_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling HouseholdApi->update_household_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household** | [**Household**](Household.md)| household | 
 **household_id** | [**String**](.md)| UUID household_id | 

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



