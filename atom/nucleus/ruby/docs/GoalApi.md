# NucleusApi::GoalApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_goal_track_using_post**](GoalApi.md#create_goal_track_using_post) | **POST** /goal_track | Create a goal track record
[**create_goal_using_post**](GoalApi.md#create_goal_using_post) | **POST** /goal | Create a goal
[**delete_goal_track_using_delete**](GoalApi.md#delete_goal_track_using_delete) | **DELETE** /goal_track/{goal_track_id} | Delete a goal track record
[**delete_goal_using_delete**](GoalApi.md#delete_goal_using_delete) | **DELETE** /goal/{goal_id} | Delete a goal
[**get_goal_all_using_get**](GoalApi.md#get_goal_all_using_get) | **GET** /goal | List all goals
[**get_goal_asset_size_all_using_get**](GoalApi.md#get_goal_asset_size_all_using_get) | **GET** /goal/{goal_id}/asset_size | List goal asset sizes
[**get_goal_holding_all_using_get**](GoalApi.md#get_goal_holding_all_using_get) | **GET** /goal/{goal_id}/holding | List goal holdings
[**get_goal_track_all_using_get**](GoalApi.md#get_goal_track_all_using_get) | **GET** /goal_track | List all goal track records
[**get_goal_track_using_get**](GoalApi.md#get_goal_track_using_get) | **GET** /goal_track/{goal_track_id} | Retrieve a goal track record
[**get_goal_transaction_all_using_get**](GoalApi.md#get_goal_transaction_all_using_get) | **GET** /goal/{goal_id}/transaction | List goal transactions
[**get_goal_using_get**](GoalApi.md#get_goal_using_get) | **GET** /goal/{goal_id} | Retrieve a goal
[**update_goal_track_using_put**](GoalApi.md#update_goal_track_using_put) | **PUT** /goal_track/{goal_track_id} | Update a goal track record
[**update_goal_using_put**](GoalApi.md#update_goal_using_put) | **PUT** /goal/{goal_id} | Update a goal


# **create_goal_track_using_post**
> GoalTrack create_goal_track_using_post(goal_track)

Create a goal track record

Create a goal track record for a goal under a client.

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

api_instance = NucleusApi::GoalApi.new

goal_track = NucleusApi::GoalTrack.new # GoalTrack | goalTrack


begin
  #Create a goal track record
  result = api_instance.create_goal_track_using_post(goal_track)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->create_goal_track_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track** | [**GoalTrack**](GoalTrack.md)| goalTrack | 

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_goal_using_post**
> Goal create_goal_using_post(goal_request)

Create a goal

Create a new goal for your firm that clients can customize for themselves.

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

api_instance = NucleusApi::GoalApi.new

goal_request = NucleusApi::Goal.new # Goal | goalRequest


begin
  #Create a goal
  result = api_instance.create_goal_using_post(goal_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->create_goal_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_request** | [**Goal**](Goal.md)| goalRequest | 

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_goal_track_using_delete**
> delete_goal_track_using_delete(goal_track_id)

Delete a goal track record

Permanently delete an goal track record for a goal under a client.

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

api_instance = NucleusApi::GoalApi.new

goal_track_id = 'goal_track_id_example' # String | UUID goal_track_id


begin
  #Delete a goal track record
  api_instance.delete_goal_track_using_delete(goal_track_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->delete_goal_track_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track_id** | [**String**](.md)| UUID goal_track_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_goal_using_delete**
> delete_goal_using_delete(goal_id)

Delete a goal

Permanently delete a goal for your firm.

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

api_instance = NucleusApi::GoalApi.new

goal_id = 'goal_id_example' # String | UUID goal_id


begin
  #Delete a goal
  api_instance.delete_goal_using_delete(goal_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->delete_goal_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_id** | [**String**](.md)| UUID goal_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_goal_all_using_get**
> PageGoal get_goal_all_using_get(opts)

List all goals

Get the details for all goals defined by your firm.

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

api_instance = NucleusApi::GoalApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all goals
  result = api_instance.get_goal_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->get_goal_all_using_get: #{e}"
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

[**PageGoal**](PageGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_goal_asset_size_all_using_get**
> Array&lt;AvailableDateDoubleVO&gt; get_goal_asset_size_all_using_get(client_id, goal_id, opts)

List goal asset sizes

Get a list of asset sizes per date for a goal for a specified client.

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

api_instance = NucleusApi::GoalApi.new

client_id = 'client_id_example' # String | client_id

goal_id = 'goal_id_example' # String | UUID goal_id

opts = { 
  currency_conversion: 'currency_conversion_example', # String | Currency Code
  end_date: Date.parse('2013-10-20'), # Date | end date
  get_latest: false, # BOOLEAN | get_latest
  portfolio_goal: false, # BOOLEAN | portfolio_goal
  sort_type: 'sort_type_example', # String | sort_type
  start_date: Date.parse('2013-10-20') # Date | start date
}

begin
  #List goal asset sizes
  result = api_instance.get_goal_asset_size_all_using_get(client_id, goal_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->get_goal_asset_size_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| client_id | 
 **goal_id** | [**String**](.md)| UUID goal_id | 
 **currency_conversion** | **String**| Currency Code | [optional] 
 **end_date** | **Date**| end date | [optional] 
 **get_latest** | **BOOLEAN**| get_latest | [optional] [default to false]
 **portfolio_goal** | **BOOLEAN**| portfolio_goal | [optional] [default to false]
 **sort_type** | **String**| sort_type | [optional] 
 **start_date** | **Date**| start date | [optional] 

### Return type

[**Array&lt;AvailableDateDoubleVO&gt;**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_goal_holding_all_using_get**
> Array&lt;PortfolioHoldingAgg&gt; get_goal_holding_all_using_get(client_id, goal_id, opts)

List goal holdings

Get the information for all the securities that are currently being held in portfolios associated with a particular goal.

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

api_instance = NucleusApi::GoalApi.new

client_id = 'client_id_example' # String | client_id

goal_id = 'goal_id_example' # String | UUID goal_id

opts = { 
  currency_conversion: 'currency_conversion_example', # String | Currency Code
  end_date: Date.parse('2013-10-20'), # Date | end date
  portfolio_goal: false, # BOOLEAN | portfolio_goal
  start_date: Date.parse('2013-10-20') # Date | start date
}

begin
  #List goal holdings
  result = api_instance.get_goal_holding_all_using_get(client_id, goal_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->get_goal_holding_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| client_id | 
 **goal_id** | [**String**](.md)| UUID goal_id | 
 **currency_conversion** | **String**| Currency Code | [optional] 
 **end_date** | **Date**| end date | [optional] 
 **portfolio_goal** | **BOOLEAN**| portfolio_goal | [optional] [default to false]
 **start_date** | **Date**| start date | [optional] 

### Return type

[**Array&lt;PortfolioHoldingAgg&gt;**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_goal_track_all_using_get**
> PageGoalTrack get_goal_track_all_using_get(opts)

List all goal track records

Get information for all goal track records stored for your firm.

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

api_instance = NucleusApi::GoalApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  end_date: 'end_date_example', # String | end date 
  filter: 'filter_example', # String | filter
  get_latest: true, # BOOLEAN | true or false
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25, # Integer | size
  start_date: 'start_date_example' # String | start date 
}

begin
  #List all goal track records
  result = api_instance.get_goal_track_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->get_goal_track_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **end_date** | **String**| end date  | [optional] 
 **filter** | **String**| filter | [optional] 
 **get_latest** | **BOOLEAN**| true or false | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **start_date** | **String**| start date  | [optional] 

### Return type

[**PageGoalTrack**](PageGoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_goal_track_using_get**
> GoalTrack get_goal_track_using_get(goal_track_id)

Retrieve a goal track record

Retrieve the information for a specific goal track record for a goal under a client.

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

api_instance = NucleusApi::GoalApi.new

goal_track_id = 'goal_track_id_example' # String | UUID goal_track_id


begin
  #Retrieve a goal track record
  result = api_instance.get_goal_track_using_get(goal_track_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->get_goal_track_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track_id** | [**String**](.md)| UUID goal_track_id | 

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_goal_transaction_all_using_get**
> PagePortfolioTransaction get_goal_transaction_all_using_get(client_id, goal_id, opts)

List goal transactions

Get the information for all transactions under portfolios associated with a particular goal.

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

api_instance = NucleusApi::GoalApi.new

client_id = 'client_id_example' # String | client_id

goal_id = 'goal_id_example' # String | UUID goal_id

opts = { 
  ascending: false, # BOOLEAN | ascending
  currency_conversion: 'currency_conversion_example', # String | Currency Code
  end_date: Date.parse('2013-10-20'), # Date | end date
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  portfolio_goal: false, # BOOLEAN | portfolio_goal
  size: 25, # Integer | size
  start_date: Date.parse('2013-10-20') # Date | start date
}

begin
  #List goal transactions
  result = api_instance.get_goal_transaction_all_using_get(client_id, goal_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->get_goal_transaction_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| client_id | 
 **goal_id** | [**String**](.md)| UUID goal_id | 
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **currency_conversion** | **String**| Currency Code | [optional] 
 **end_date** | **Date**| end date | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **portfolio_goal** | **BOOLEAN**| portfolio_goal | [optional] [default to false]
 **size** | **Integer**| size | [optional] [default to 25]
 **start_date** | **Date**| start date | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_goal_using_get**
> Goal get_goal_using_get(goal_id)

Retrieve a goal

Retrieve the information for a goal defined for your firm.

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

api_instance = NucleusApi::GoalApi.new

goal_id = 'goal_id_example' # String | UUID goal_id


begin
  #Retrieve a goal
  result = api_instance.get_goal_using_get(goal_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->get_goal_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_id** | [**String**](.md)| UUID goal_id | 

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_goal_track_using_put**
> GoalTrack update_goal_track_using_put(goal_track, goal_track_id)

Update a goal track record

Update the information for a goal track record.

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

api_instance = NucleusApi::GoalApi.new

goal_track = NucleusApi::GoalTrack.new # GoalTrack | goal_track

goal_track_id = 'goal_track_id_example' # String | UUID goal_track_id


begin
  #Update a goal track record
  result = api_instance.update_goal_track_using_put(goal_track, goal_track_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->update_goal_track_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track** | [**GoalTrack**](GoalTrack.md)| goal_track | 
 **goal_track_id** | [**String**](.md)| UUID goal_track_id | 

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_goal_using_put**
> Goal update_goal_using_put(goal, goal_id)

Update a goal

Update a goal defined for your firm.

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

api_instance = NucleusApi::GoalApi.new

goal = NucleusApi::Goal.new # Goal | goal

goal_id = 'goal_id_example' # String | UUID goal_id


begin
  #Update a goal
  result = api_instance.update_goal_using_put(goal, goal_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling GoalApi->update_goal_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal** | [**Goal**](Goal.md)| goal | 
 **goal_id** | [**String**](.md)| UUID goal_id | 

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



