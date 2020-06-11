# AtomApi::ClientApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_client_hydro_using_post**](ClientApi.md#create_client_hydro_using_post) | **POST** /client_hydro | Create a client-hydro relationship
[**create_client_status_using_post**](ClientApi.md#create_client_status_using_post) | **POST** /client_status | Create an client status
[**create_client_using_post**](ClientApi.md#create_client_using_post) | **POST** /client | Create a client
[**delete_client_hydro_using_delete**](ClientApi.md#delete_client_hydro_using_delete) | **DELETE** /client_hydro/{client_hydro_id} | Delete a client-hydro relationship
[**delete_client_status_using_delete**](ClientApi.md#delete_client_status_using_delete) | **DELETE** /client_status/{client_status_id} | Delete an client status
[**delete_client_using_delete**](ClientApi.md#delete_client_using_delete) | **DELETE** /client/{client_id} | Delete a client
[**get_client_account_overview_using_get**](ClientApi.md#get_client_account_overview_using_get) | **GET** /client/{client_id}/account_overview | List all client Account overview
[**get_client_advisor_overview_using_get**](ClientApi.md#get_client_advisor_overview_using_get) | **GET** /client/{client_id}/advisor_overview | Advisor overview
[**get_client_all_using_get**](ClientApi.md#get_client_all_using_get) | **GET** /client | List all clients
[**get_client_asset_size_using_get**](ClientApi.md#get_client_asset_size_using_get) | **GET** /client/{client_id}/asset_size | List all client asset sizes
[**get_client_goal_overview_using_get**](ClientApi.md#get_client_goal_overview_using_get) | **GET** /client/{client_id}/goal_overview | Retrieve client&#39;s goal details 
[**get_client_holding_using_get**](ClientApi.md#get_client_holding_using_get) | **GET** /client/{client_id}/holding | List all client holdings
[**get_client_hydro_all_using_get**](ClientApi.md#get_client_hydro_all_using_get) | **GET** /client_hydro | List all client-hydro relationship
[**get_client_hydro_using_get**](ClientApi.md#get_client_hydro_using_get) | **GET** /client_hydro/{client_hydro_id} | Retrieve a client-hydro relationship
[**get_client_status_all_using_get**](ClientApi.md#get_client_status_all_using_get) | **GET** /client_status | List all client statuses
[**get_client_status_using_get**](ClientApi.md#get_client_status_using_get) | **GET** /client_status/{client_status_id} | Retrieve an client status
[**get_client_transaction_using_get**](ClientApi.md#get_client_transaction_using_get) | **GET** /client/{client_id}/transaction | List all client transactions
[**get_client_using_get**](ClientApi.md#get_client_using_get) | **GET** /client/{client_id} | Retrieve a client
[**get_total_clients_using_get**](ClientApi.md#get_total_clients_using_get) | **GET** /client/total_clients | total clients
[**update_client_hydro_using_put**](ClientApi.md#update_client_hydro_using_put) | **PUT** /client_hydro/{client_hydro_id} | Update a client-hydro relationship
[**update_client_status_using_put**](ClientApi.md#update_client_status_using_put) | **PUT** /client_status/{client_status_id} | Update an client status
[**update_client_using_put**](ClientApi.md#update_client_using_put) | **PUT** /client/{client_id} | Update a client


# **create_client_hydro_using_post**
> ClientHydro create_client_hydro_using_post(client_hydro)

Create a client-hydro relationship

Create an client-hydro relationship under a client.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_hydro = AtomApi::ClientHydro.new # ClientHydro | clientHydro


begin
  #Create a client-hydro relationship
  result = api_instance.create_client_hydro_using_post(client_hydro)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->create_client_hydro_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_hydro** | [**ClientHydro**](ClientHydro.md)| clientHydro | 

### Return type

[**ClientHydro**](ClientHydro.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_client_status_using_post**
> ClientStatus create_client_status_using_post(client_status_request)

Create an client status

Create an client status record for an client.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_status_request = AtomApi::ClientStatus.new # ClientStatus | clientStatusRequest


begin
  #Create an client status
  result = api_instance.create_client_status_using_post(client_status_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->create_client_status_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_status_request** | [**ClientStatus**](ClientStatus.md)| clientStatusRequest | 

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_client_using_post**
> Client create_client_using_post(client_request)

Create a client

Create a new client, or register a new user, with your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_request = AtomApi::Client.new # Client | clientRequest


begin
  #Create a client
  result = api_instance.create_client_using_post(client_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->create_client_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_request** | [**Client**](Client.md)| clientRequest | 

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_client_hydro_using_delete**
> delete_client_hydro_using_delete(client_hydro_id)

Delete a client-hydro relationship

Permanently delete a client-hydro relationship for a Hydro ID and a client.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_hydro_id = 'client_hydro_id_example' # String | UUID client_hydro_id


begin
  #Delete a client-hydro relationship
  api_instance.delete_client_hydro_using_delete(client_hydro_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->delete_client_hydro_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_hydro_id** | [**String**](.md)| UUID client_hydro_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_client_status_using_delete**
> delete_client_status_using_delete(client_status_id)

Delete an client status

Permanently delete an client status record from an client’s history.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_status_id = 'client_status_id_example' # String | UUID client_status_id


begin
  #Delete an client status
  api_instance.delete_client_status_using_delete(client_status_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->delete_client_status_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_status_id** | [**String**](.md)| UUID client_status_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_client_using_delete**
> delete_client_using_delete(client_id)

Delete a client

Permanently delete a client registered with your firm. Turns the client's is_active  = 0

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_id = 'client_id_example' # String | UUID client_id


begin
  #Delete a client
  api_instance.delete_client_using_delete(client_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->delete_client_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| UUID client_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_account_overview_using_get**
> ClientAccountVO get_client_account_overview_using_get(client_id, opts)

List all client Account overview

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_id = 'client_id_example' # String | UUID client_id

opts = { 
  ascending: false, # BOOLEAN | ascending
  order_by: 'update_date' # String | order_by
}

begin
  #List all client Account overview
  result = api_instance.get_client_account_overview_using_get(client_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_account_overview_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| UUID client_id | 
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **order_by** | **String**| order_by | [optional] [default to update_date]

### Return type

[**ClientAccountVO**](ClientAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_advisor_overview_using_get**
> AdvisorOverviewVO get_client_advisor_overview_using_get(client_id, opts)

Advisor overview

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_id = 'client_id_example' # String | UUID client_id

opts = { 
  show_clients: false # BOOLEAN | show_clients
}

begin
  #Advisor overview
  result = api_instance.get_client_advisor_overview_using_get(client_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_advisor_overview_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| UUID client_id | 
 **show_clients** | **BOOLEAN**| show_clients | [optional] [default to false]

### Return type

[**AdvisorOverviewVO**](AdvisorOverviewVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_all_using_get**
> PageClient get_client_all_using_get(opts)

List all clients

Get details for all clients registered with your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all clients
  result = api_instance.get_client_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_all_using_get: #{e}"
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

[**PageClient**](PageClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_asset_size_using_get**
> Array&lt;AvailableDateDoubleVO&gt; get_client_asset_size_using_get(client_id, opts)

List all client asset sizes

Get a list of asset sizes per date for a client.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_id = 'client_id_example' # String | UUID client_id

opts = { 
  end_date: Date.parse('null'), # Date | end date
  exclude_subledger: false, # BOOLEAN | exclude_subledger
  get_latest: true, # BOOLEAN | true or false
  sort_type: 'sort_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
  start_date: Date.parse('null') # Date | start date
}

begin
  #List all client asset sizes
  result = api_instance.get_client_asset_size_using_get(client_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_asset_size_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| UUID client_id | 
 **end_date** | **Date**| end date | [optional] [default to null]
 **exclude_subledger** | **BOOLEAN**| exclude_subledger | [optional] [default to false]
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



# **get_client_goal_overview_using_get**
> VClientGoalViewData get_client_goal_overview_using_get(client_id, opts)

Retrieve client's goal details 

Retrieve client's goal details

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_id = 'client_id_example' # String | UUID client_id

opts = { 
  portfolio_goal: false # BOOLEAN | portfolio_goal
}

begin
  #Retrieve client's goal details 
  result = api_instance.get_client_goal_overview_using_get(client_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_goal_overview_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| UUID client_id | 
 **portfolio_goal** | **BOOLEAN**| portfolio_goal | [optional] [default to false]

### Return type

[**VClientGoalViewData**](VClientGoalViewData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_holding_using_get**
> Array&lt;PortfolioHoldingAgg&gt; get_client_holding_using_get(client_id, opts)

List all client holdings

Get the information for all the securities that are currently being held by a client registered with your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_id = 'client_id_example' # String | UUID client_id

opts = { 
  end_date: 'end_date_example', # String | end date - yyyy-mm-dd
  get_latest: true, # BOOLEAN | true or false
  start_date: 'start_date_example' # String | start date - yyyy-mm-dd
}

begin
  #List all client holdings
  result = api_instance.get_client_holding_using_get(client_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_holding_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| UUID client_id | 
 **end_date** | **String**| end date - yyyy-mm-dd | [optional] 
 **get_latest** | **BOOLEAN**| true or false | [optional] 
 **start_date** | **String**| start date - yyyy-mm-dd | [optional] 

### Return type

[**Array&lt;PortfolioHoldingAgg&gt;**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_hydro_all_using_get**
> PageClientHydro get_client_hydro_all_using_get(opts)

List all client-hydro relationship

Get information for all client-hydro relationships for all clients defined for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all client-hydro relationship
  result = api_instance.get_client_hydro_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_hydro_all_using_get: #{e}"
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

[**PageClientHydro**](PageClientHydro.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_hydro_using_get**
> ClientHydro get_client_hydro_using_get(client_hydro_id)

Retrieve a client-hydro relationship

Retrieve the information for a specific client-hydro relationship.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_hydro_id = 'client_hydro_id_example' # String | UUID client_hydro_id


begin
  #Retrieve a client-hydro relationship
  result = api_instance.get_client_hydro_using_get(client_hydro_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_hydro_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_hydro_id** | [**String**](.md)| UUID client_hydro_id | 

### Return type

[**ClientHydro**](ClientHydro.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_status_all_using_get**
> PageClientStatus get_client_status_all_using_get(opts)

List all client statuses

Get the client status history information for all clients.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all client statuses
  result = api_instance.get_client_status_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_status_all_using_get: #{e}"
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

[**PageClientStatus**](PageClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_status_using_get**
> ClientStatus get_client_status_using_get(client_status_id)

Retrieve an client status

Retrieve the information for a specific client status record for an client.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_status_id = 'client_status_id_example' # String | UUID client_status_id


begin
  #Retrieve an client status
  result = api_instance.get_client_status_using_get(client_status_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_status_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_status_id** | [**String**](.md)| UUID client_status_id | 

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_transaction_using_get**
> PagePortfolioTransaction get_client_transaction_using_get(client_id, opts)

List all client transactions

Get the information for all transactions under a client registered with your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_id = 'client_id_example' # String | UUID client_id

opts = { 
  ascending: false, # BOOLEAN | ascending
  end_date: DateTime.parse('null'), # DateTime | end_date
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25, # Integer | size
  start_date: DateTime.parse('null') # DateTime | start_date
}

begin
  #List all client transactions
  result = api_instance.get_client_transaction_using_get(client_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_transaction_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| UUID client_id | 
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **end_date** | **DateTime**| end_date | [optional] [default to null]
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **start_date** | **DateTime**| start_date | [optional] [default to null]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_using_get**
> Client get_client_using_get(client_id)

Retrieve a client

Retrieve the information for a client registered with your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_id = 'client_id_example' # String | UUID client_id


begin
  #Retrieve a client
  result = api_instance.get_client_using_get(client_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_client_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| UUID client_id | 

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_total_clients_using_get**
> ClientAnalyticsResponse get_total_clients_using_get(opts)

total clients

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

opts = { 
  as_of_date: DateTime.parse('#{new java.util.Date()}'), # DateTime | as_of_date
  client_id: 'client_id_example', # String | client_id
  end_date: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | end_date
  show_history: false, # BOOLEAN | show_history
  start_date: DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | start_date
}

begin
  #total clients
  result = api_instance.get_total_clients_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->get_total_clients_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **as_of_date** | **DateTime**| as_of_date | [optional] [default to #{new java.util.Date()}]
 **client_id** | **String**| client_id | [optional] 
 **end_date** | **DateTime**| end_date | [optional] 
 **show_history** | **BOOLEAN**| show_history | [optional] [default to false]
 **start_date** | **DateTime**| start_date | [optional] 

### Return type

[**ClientAnalyticsResponse**](ClientAnalyticsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_client_hydro_using_put**
> ClientHydro update_client_hydro_using_put(client_hydro, client_hydro_id)

Update a client-hydro relationship

Update the information for a client-hydro relationship.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_hydro = AtomApi::ClientHydro.new # ClientHydro | client_hydro

client_hydro_id = 'client_hydro_id_example' # String | UUID client_hydro_id


begin
  #Update a client-hydro relationship
  result = api_instance.update_client_hydro_using_put(client_hydro, client_hydro_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->update_client_hydro_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_hydro** | [**ClientHydro**](ClientHydro.md)| client_hydro | 
 **client_hydro_id** | [**String**](.md)| UUID client_hydro_id | 

### Return type

[**ClientHydro**](ClientHydro.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_client_status_using_put**
> ClientStatus update_client_status_using_put(client_status, client_status_id)

Update an client status

Update an client status record for an client.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client_status = AtomApi::ClientStatus.new # ClientStatus | client_status

client_status_id = 'client_status_id_example' # String | UUID client_status_id


begin
  #Update an client status
  result = api_instance.update_client_status_using_put(client_status, client_status_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->update_client_status_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_status** | [**ClientStatus**](ClientStatus.md)| client_status | 
 **client_status_id** | [**String**](.md)| UUID client_status_id | 

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_client_using_put**
> Client update_client_using_put(client, client_id)

Update a client

Update the information for a client registered with your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::ClientApi.new

client = AtomApi::Client.new # Client | client

client_id = 'client_id_example' # String | UUID client_id


begin
  #Update a client
  result = api_instance.update_client_using_put(client, client_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling ClientApi->update_client_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**Client**](Client.md)| client | 
 **client_id** | [**String**](.md)| UUID client_id | 

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



