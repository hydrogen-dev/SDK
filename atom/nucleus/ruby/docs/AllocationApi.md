# NucleusApi::AllocationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_allocation_composition_using_post**](AllocationApi.md#create_allocation_composition_using_post) | **POST** /allocation_composition | Create an allocation composition
[**create_allocation_using_post**](AllocationApi.md#create_allocation_using_post) | **POST** /allocation | Create an allocation
[**delete_allocation_composition_using_delete**](AllocationApi.md#delete_allocation_composition_using_delete) | **DELETE** /allocation_composition/{allocation_composition_id} | Delete an allocation composition
[**delete_allocation_using_delete**](AllocationApi.md#delete_allocation_using_delete) | **DELETE** /allocation/{allocation_id} | Delete an allocation
[**get_all_holdings_using_get**](AllocationApi.md#get_all_holdings_using_get) | **GET** /allocation/{allocation_id}/holding | List all allocation holdings
[**get_all_transactions_using_get**](AllocationApi.md#get_all_transactions_using_get) | **GET** /allocation/{allocation_id}/transaction | List all allocation transactions
[**get_allocation_aggregated_data_using_get**](AllocationApi.md#get_allocation_aggregated_data_using_get) | **GET** /allocation/{allocation_id}/aggregate_data | List all Allocation aggregated data overview
[**get_allocation_all_using_get**](AllocationApi.md#get_allocation_all_using_get) | **GET** /allocation | List all allocations
[**get_allocation_composition_all_using_get**](AllocationApi.md#get_allocation_composition_all_using_get) | **GET** /allocation_composition | List all allocations compositions
[**get_allocation_composition_using_get**](AllocationApi.md#get_allocation_composition_using_get) | **GET** /allocation_composition/{allocation_composition_id} | Retrieve an allocation composition
[**get_allocation_using_get**](AllocationApi.md#get_allocation_using_get) | **GET** /allocation/{allocation_id} | Retrieve an allocation
[**get_assetsize_using_get**](AllocationApi.md#get_assetsize_using_get) | **GET** /allocation/{allocation_id}/asset_size | List all allocation asset sizes
[**update_allocation_composition_using_put**](AllocationApi.md#update_allocation_composition_using_put) | **PUT** /allocation_composition/{allocation_composition_id} | Update an allocation composition
[**update_allocation_using_put**](AllocationApi.md#update_allocation_using_put) | **PUT** /allocation/{allocation_id} | Update an allocation


# **create_allocation_composition_using_post**
> AllocationComposition create_allocation_composition_using_post(alloc_request)

Create an allocation composition

Create a new allocation composition record for an allocation.

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


api_instance = NucleusApi::AllocationApi.new

alloc_request = NucleusApi::AllocationComposition.new # AllocationComposition | allocRequest


begin
  #Create an allocation composition
  result = api_instance.create_allocation_composition_using_post(alloc_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->create_allocation_composition_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alloc_request** | [**AllocationComposition**](AllocationComposition.md)| allocRequest | 

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_allocation_using_post**
> Allocation create_allocation_using_post(allocation_request)

Create an allocation

Create a new allocation for your firm.

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


api_instance = NucleusApi::AllocationApi.new

allocation_request = NucleusApi::Allocation.new # Allocation | allocationRequest


begin
  #Create an allocation
  result = api_instance.create_allocation_using_post(allocation_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->create_allocation_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_request** | [**Allocation**](Allocation.md)| allocationRequest | 

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_allocation_composition_using_delete**
> delete_allocation_composition_using_delete(allocation_composition_id)

Delete an allocation composition

Permanently delete an allocation composition record for an allocation.

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


api_instance = NucleusApi::AllocationApi.new

allocation_composition_id = 'allocation_composition_id_example' # String | UUID allocation_composition_id


begin
  #Delete an allocation composition
  api_instance.delete_allocation_composition_using_delete(allocation_composition_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->delete_allocation_composition_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_composition_id** | [**String**](.md)| UUID allocation_composition_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_allocation_using_delete**
> delete_allocation_using_delete(allocation_id)

Delete an allocation

Permanently delete an allocation defined by your firm.

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


api_instance = NucleusApi::AllocationApi.new

allocation_id = 'allocation_id_example' # String | UUID allocation_id


begin
  #Delete an allocation
  api_instance.delete_allocation_using_delete(allocation_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->delete_allocation_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**String**](.md)| UUID allocation_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_all_holdings_using_get**
> Array&lt;ModelHoldingAgg&gt; get_all_holdings_using_get(allocation_id, opts)

List all allocation holdings

Get the information for all securities assigned to a specific allocation. 

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


api_instance = NucleusApi::AllocationApi.new

allocation_id = 'allocation_id_example' # String | UUID allocation_id

opts = { 
  end_date: DateTime.parse('null'), # DateTime | end_date
  start_date: DateTime.parse('null') # DateTime | start_date
}

begin
  #List all allocation holdings
  result = api_instance.get_all_holdings_using_get(allocation_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->get_all_holdings_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**String**](.md)| UUID allocation_id | 
 **end_date** | **DateTime**| end_date | [optional] [default to null]
 **start_date** | **DateTime**| start_date | [optional] [default to null]

### Return type

[**Array&lt;ModelHoldingAgg&gt;**](ModelHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_all_transactions_using_get**
> PageModelTransaction get_all_transactions_using_get(allocation_id, opts)

List all allocation transactions

Get the information for all transactions made under an allocation to achieve the composition of the allocation.

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


api_instance = NucleusApi::AllocationApi.new

allocation_id = 'allocation_id_example' # String | UUID allocation_id

opts = { 
  ascending: false, # BOOLEAN | ascending
  end_date: DateTime.parse('null'), # DateTime | end_date
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25, # Integer | size
  start_date: DateTime.parse('null') # DateTime | start_date
}

begin
  #List all allocation transactions
  result = api_instance.get_all_transactions_using_get(allocation_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->get_all_transactions_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**String**](.md)| UUID allocation_id | 
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **end_date** | **DateTime**| end_date | [optional] [default to null]
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **start_date** | **DateTime**| start_date | [optional] [default to null]

### Return type

[**PageModelTransaction**](PageModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_allocation_aggregated_data_using_get**
> AllocationAggregatedVO get_allocation_aggregated_data_using_get(allocation_id)

List all Allocation aggregated data overview

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


api_instance = NucleusApi::AllocationApi.new

allocation_id = 'allocation_id_example' # String | Allocation Id


begin
  #List all Allocation aggregated data overview
  result = api_instance.get_allocation_aggregated_data_using_get(allocation_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->get_allocation_aggregated_data_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**String**](.md)| Allocation Id | 

### Return type

[**AllocationAggregatedVO**](AllocationAggregatedVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_allocation_all_using_get**
> PageAllocation get_allocation_all_using_get(opts)

List all allocations

Get details for all allocations defined for your firm.

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


api_instance = NucleusApi::AllocationApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all allocations
  result = api_instance.get_allocation_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->get_allocation_all_using_get: #{e}"
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

[**PageAllocation**](PageAllocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_allocation_composition_all_using_get**
> PageAllocationComposition get_allocation_composition_all_using_get(opts)

List all allocations compositions

Get the allocation composition for all allocations.

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


api_instance = NucleusApi::AllocationApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all allocations compositions
  result = api_instance.get_allocation_composition_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->get_allocation_composition_all_using_get: #{e}"
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

[**PageAllocationComposition**](PageAllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_allocation_composition_using_get**
> AllocationComposition get_allocation_composition_using_get(allocation_composition_id)

Retrieve an allocation composition

Retrieve the information of an allocation composition record for an allocation.

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


api_instance = NucleusApi::AllocationApi.new

allocation_composition_id = 'allocation_composition_id_example' # String | UUID allocation_composition_id


begin
  #Retrieve an allocation composition
  result = api_instance.get_allocation_composition_using_get(allocation_composition_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->get_allocation_composition_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_composition_id** | [**String**](.md)| UUID allocation_composition_id | 

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_allocation_using_get**
> Allocation get_allocation_using_get(allocation_id)

Retrieve an allocation

Retrieve the information for an allocation defined by your firm.

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


api_instance = NucleusApi::AllocationApi.new

allocation_id = 'allocation_id_example' # String | UUID allocation_id


begin
  #Retrieve an allocation
  result = api_instance.get_allocation_using_get(allocation_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->get_allocation_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**String**](.md)| UUID allocation_id | 

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_assetsize_using_get**
> Array&lt;DateDoubleVO&gt; get_assetsize_using_get(allocation_id, opts)

List all allocation asset sizes

Get a list of asset sizes by date for a specific allocation.

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


api_instance = NucleusApi::AllocationApi.new

allocation_id = 'allocation_id_example' # String | UUID allocation_id

opts = { 
  end_date: Date.parse('2013-10-20'), # Date | end date
  get_latest: true, # BOOLEAN | get_latest
  is_current_weight: true, # BOOLEAN | is_current_weight
  sort_type: 'sort_type_example', # String | D (Daily), Q (quarterly), M (Monthly), Y (Annually) 
  start_date: Date.parse('2013-10-20') # Date | start date
}

begin
  #List all allocation asset sizes
  result = api_instance.get_assetsize_using_get(allocation_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->get_assetsize_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**String**](.md)| UUID allocation_id | 
 **end_date** | **Date**| end date | [optional] 
 **get_latest** | **BOOLEAN**| get_latest | [optional] 
 **is_current_weight** | **BOOLEAN**| is_current_weight | [optional] [default to true]
 **sort_type** | **String**| D (Daily), Q (quarterly), M (Monthly), Y (Annually)  | [optional] 
 **start_date** | **Date**| start date | [optional] 

### Return type

[**Array&lt;DateDoubleVO&gt;**](DateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_allocation_composition_using_put**
> AllocationComposition update_allocation_composition_using_put(allocation_composition, allocation_composition_id)

Update an allocation composition

Update the information of an allocation composition record for an allocation.

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


api_instance = NucleusApi::AllocationApi.new

allocation_composition = NucleusApi::AllocationComposition.new # AllocationComposition | aggregation_composition

allocation_composition_id = 'allocation_composition_id_example' # String | UUID allocation_composition_id


begin
  #Update an allocation composition
  result = api_instance.update_allocation_composition_using_put(allocation_composition, allocation_composition_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->update_allocation_composition_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_composition** | [**AllocationComposition**](AllocationComposition.md)| aggregation_composition | 
 **allocation_composition_id** | [**String**](.md)| UUID allocation_composition_id | 

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_allocation_using_put**
> Allocation update_allocation_using_put(allocation, allocation_id)

Update an allocation

Update an allocation defined by your firm.

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


api_instance = NucleusApi::AllocationApi.new

allocation = NucleusApi::Allocation.new # Allocation | allocation

allocation_id = 'allocation_id_example' # String | UUID allocation_id


begin
  #Update an allocation
  result = api_instance.update_allocation_using_put(allocation, allocation_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AllocationApi->update_allocation_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation** | [**Allocation**](Allocation.md)| allocation | 
 **allocation_id** | [**String**](.md)| UUID allocation_id | 

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



