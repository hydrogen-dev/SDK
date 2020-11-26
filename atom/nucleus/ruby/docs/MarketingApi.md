# NucleusApi::MarketingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_campaign_data_using_post**](MarketingApi.md#create_campaign_data_using_post) | **POST** /campaign_data | Create a campaign data record
[**create_campaign_plan_using_post**](MarketingApi.md#create_campaign_plan_using_post) | **POST** /campaign_plan | Create a campaign plan
[**create_campaign_using_post**](MarketingApi.md#create_campaign_using_post) | **POST** /campaign | Create a campaign
[**create_client_campaign_using_post**](MarketingApi.md#create_client_campaign_using_post) | **POST** /client_campaign | Mark a client signing up through a campaign
[**delete_campaign_data_using_delete**](MarketingApi.md#delete_campaign_data_using_delete) | **DELETE** /campaign_data/{campaign_data_id} | Delete a campaign data record
[**delete_campaign_plan_using_delete**](MarketingApi.md#delete_campaign_plan_using_delete) | **DELETE** /campaign_plan/{campaign_plan_id} | Delete a campaign plan
[**delete_campaign_using_delete**](MarketingApi.md#delete_campaign_using_delete) | **DELETE** /campaign/{campaign_id} | Delete a campaign
[**delete_client_campaign_using_delete**](MarketingApi.md#delete_client_campaign_using_delete) | **DELETE** /client_campaign/{client_campaign_id} | Delete a clients/ips pair under a campaign
[**get_campaign_all_using_get**](MarketingApi.md#get_campaign_all_using_get) | **GET** /campaign | List all campaigns
[**get_campaign_data_all_using_get**](MarketingApi.md#get_campaign_data_all_using_get) | **GET** /campaign_data | List all campaign data
[**get_campaign_data_using_get**](MarketingApi.md#get_campaign_data_using_get) | **GET** /campaign_data/{campaign_data_id} | Retrieve a campaign data record
[**get_campaign_plan_all_using_get**](MarketingApi.md#get_campaign_plan_all_using_get) | **GET** /campaign_plan | List all campaign plans
[**get_campaign_plan_using_get**](MarketingApi.md#get_campaign_plan_using_get) | **GET** /campaign_plan/{campaign_plan_id} | Retrieve a campaign plan
[**get_campaign_using_get**](MarketingApi.md#get_campaign_using_get) | **GET** /campaign/{campaign_id} | Retrieve a campaign
[**get_client_campaign_all_using_get**](MarketingApi.md#get_client_campaign_all_using_get) | **GET** /client_campaign | List all clients/ips under a campaign
[**get_client_campaign_using_get**](MarketingApi.md#get_client_campaign_using_get) | **GET** /client_campaign/{client_campaign_id} | Retrieve a clients/ips pair under a campaign
[**update_campaign_data_using_put**](MarketingApi.md#update_campaign_data_using_put) | **PUT** /campaign_data/{campaign_data_id} | Update a campaign data record
[**update_campaign_plan_using_put**](MarketingApi.md#update_campaign_plan_using_put) | **PUT** /campaign_plan/{campaign_plan_id} | Update a campaign plan
[**update_campaign_using_put**](MarketingApi.md#update_campaign_using_put) | **PUT** /campaign/{campaign_id} | Update a campaign
[**update_client_campaign_using_put**](MarketingApi.md#update_client_campaign_using_put) | **PUT** /client_campaign/{client_campaign_id} | Update a clients/ips pair under a campaign


# **create_campaign_data_using_post**
> CampaignData create_campaign_data_using_post(campaign_data_request)

Create a campaign data record

Create a new  campaign data record for your firm.

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

api_instance = NucleusApi::MarketingApi.new

campaign_data_request = NucleusApi::CampaignData.new # CampaignData | campaignDataRequest


begin
  #Create a campaign data record
  result = api_instance.create_campaign_data_using_post(campaign_data_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->create_campaign_data_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_request** | [**CampaignData**](CampaignData.md)| campaignDataRequest | 

### Return type

[**CampaignData**](CampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_campaign_plan_using_post**
> CampaignPlan create_campaign_plan_using_post(campaign_plan_request)

Create a campaign plan

Create a new campaign plan for your firm.

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

api_instance = NucleusApi::MarketingApi.new

campaign_plan_request = NucleusApi::CampaignPlan.new # CampaignPlan | campaignPlanRequest


begin
  #Create a campaign plan
  result = api_instance.create_campaign_plan_using_post(campaign_plan_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->create_campaign_plan_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_request** | [**CampaignPlan**](CampaignPlan.md)| campaignPlanRequest | 

### Return type

[**CampaignPlan**](CampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_campaign_using_post**
> Campaign create_campaign_using_post(campaign_request)

Create a campaign

Create a new campaign for your firm.

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

api_instance = NucleusApi::MarketingApi.new

campaign_request = NucleusApi::Campaign.new # Campaign | campaignRequest


begin
  #Create a campaign
  result = api_instance.create_campaign_using_post(campaign_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->create_campaign_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_request** | [**Campaign**](Campaign.md)| campaignRequest | 

### Return type

[**Campaign**](Campaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_client_campaign_using_post**
> ClientCampaignMapping create_client_campaign_using_post(campaign_mapping_request)

Mark a client signing up through a campaign

We are adding a campaign association to a clientId or ip.  We create this association because we are trying to measure how affective a campaign is in directing traffic to our website.  

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

api_instance = NucleusApi::MarketingApi.new

campaign_mapping_request = NucleusApi::ClientCampaignMapping.new # ClientCampaignMapping | campaignMappingRequest


begin
  #Mark a client signing up through a campaign
  result = api_instance.create_client_campaign_using_post(campaign_mapping_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->create_client_campaign_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_mapping_request** | [**ClientCampaignMapping**](ClientCampaignMapping.md)| campaignMappingRequest | 

### Return type

[**ClientCampaignMapping**](ClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_campaign_data_using_delete**
> delete_campaign_data_using_delete(campaign_data_id)

Delete a campaign data record

Permanently delete a campaign data record

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

api_instance = NucleusApi::MarketingApi.new

campaign_data_id = 'campaign_data_id_example' # String | UUID campaign_data_id


begin
  #Delete a campaign data record
  api_instance.delete_campaign_data_using_delete(campaign_data_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->delete_campaign_data_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_id** | [**String**](.md)| UUID campaign_data_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_campaign_plan_using_delete**
> delete_campaign_plan_using_delete(campaign_plan_id)

Delete a campaign plan

Permanently delete a campaign plan

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

api_instance = NucleusApi::MarketingApi.new

campaign_plan_id = 'campaign_plan_id_example' # String | UUID campaign_plan_id


begin
  #Delete a campaign plan
  api_instance.delete_campaign_plan_using_delete(campaign_plan_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->delete_campaign_plan_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_id** | [**String**](.md)| UUID campaign_plan_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_campaign_using_delete**
> delete_campaign_using_delete(campaign_id)

Delete a campaign

Permanently delete a campaign

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

api_instance = NucleusApi::MarketingApi.new

campaign_id = 'campaign_id_example' # String | Campaign Id


begin
  #Delete a campaign
  api_instance.delete_campaign_using_delete(campaign_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->delete_campaign_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | [**String**](.md)| Campaign Id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_client_campaign_using_delete**
> delete_client_campaign_using_delete(client_campaign_id)

Delete a clients/ips pair under a campaign

Permanently delete a clients/ips pair under a campaign

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

api_instance = NucleusApi::MarketingApi.new

client_campaign_id = 'client_campaign_id_example' # String | UUID client_campaign_id


begin
  #Delete a clients/ips pair under a campaign
  api_instance.delete_client_campaign_using_delete(client_campaign_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->delete_client_campaign_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**String**](.md)| UUID client_campaign_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_campaign_all_using_get**
> PageCampaign get_campaign_all_using_get(opts)

List all campaigns

Get details for all campaigns defined for your firm.

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

api_instance = NucleusApi::MarketingApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all campaigns
  result = api_instance.get_campaign_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->get_campaign_all_using_get: #{e}"
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

[**PageCampaign**](PageCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_campaign_data_all_using_get**
> PageCampaignData get_campaign_data_all_using_get(opts)

List all campaign data

Get details for all campaign data defined for your firm.

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

api_instance = NucleusApi::MarketingApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all campaign data
  result = api_instance.get_campaign_data_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->get_campaign_data_all_using_get: #{e}"
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

[**PageCampaignData**](PageCampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_campaign_data_using_get**
> CampaignData get_campaign_data_using_get(campaign_data_id)

Retrieve a campaign data record

Retrieve the information for a campaign data record

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

api_instance = NucleusApi::MarketingApi.new

campaign_data_id = 'campaign_data_id_example' # String | UUID campaign_data_id


begin
  #Retrieve a campaign data record
  result = api_instance.get_campaign_data_using_get(campaign_data_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->get_campaign_data_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_id** | [**String**](.md)| UUID campaign_data_id | 

### Return type

[**CampaignData**](CampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_campaign_plan_all_using_get**
> PageCampaignPlan get_campaign_plan_all_using_get(opts)

List all campaign plans

Get details for all campaign plans defined for your firm.

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

api_instance = NucleusApi::MarketingApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all campaign plans
  result = api_instance.get_campaign_plan_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->get_campaign_plan_all_using_get: #{e}"
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

[**PageCampaignPlan**](PageCampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_campaign_plan_using_get**
> CampaignPlan get_campaign_plan_using_get(campaign_plan_id)

Retrieve a campaign plan

Retrieve the information for a campaign plan

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

api_instance = NucleusApi::MarketingApi.new

campaign_plan_id = 'campaign_plan_id_example' # String | UUID campaign_plan_id


begin
  #Retrieve a campaign plan
  result = api_instance.get_campaign_plan_using_get(campaign_plan_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->get_campaign_plan_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_id** | [**String**](.md)| UUID campaign_plan_id | 

### Return type

[**CampaignPlan**](CampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_campaign_using_get**
> Campaign get_campaign_using_get(campaign_id)

Retrieve a campaign

Retrieve the information for a campaign.

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

api_instance = NucleusApi::MarketingApi.new

campaign_id = 'campaign_id_example' # String | Campaign Id


begin
  #Retrieve a campaign
  result = api_instance.get_campaign_using_get(campaign_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->get_campaign_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | [**String**](.md)| Campaign Id | 

### Return type

[**Campaign**](Campaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_campaign_all_using_get**
> PageClientCampaignMapping get_client_campaign_all_using_get(opts)

List all clients/ips under a campaign

Get details for all clients/ips under a campaign

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

api_instance = NucleusApi::MarketingApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all clients/ips under a campaign
  result = api_instance.get_client_campaign_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->get_client_campaign_all_using_get: #{e}"
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

[**PageClientCampaignMapping**](PageClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_campaign_using_get**
> ClientCampaignMapping get_client_campaign_using_get(client_campaign_id)

Retrieve a clients/ips pair under a campaign

Retrieve the information for a clients/ips pair under a campaign

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

api_instance = NucleusApi::MarketingApi.new

client_campaign_id = 'client_campaign_id_example' # String | UUID client_campaign_id


begin
  #Retrieve a clients/ips pair under a campaign
  result = api_instance.get_client_campaign_using_get(client_campaign_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->get_client_campaign_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**String**](.md)| UUID client_campaign_id | 

### Return type

[**ClientCampaignMapping**](ClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_campaign_data_using_put**
> CampaignData update_campaign_data_using_put(campaign_data, campaign_data_id)

Update a campaign data record

Updated the information for a campaign data record

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

api_instance = NucleusApi::MarketingApi.new

campaign_data = NucleusApi::CampaignPlan.new # CampaignPlan | campaign_data

campaign_data_id = 'campaign_data_id_example' # String | UUID campaign_data_id


begin
  #Update a campaign data record
  result = api_instance.update_campaign_data_using_put(campaign_data, campaign_data_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->update_campaign_data_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data** | [**CampaignPlan**](CampaignPlan.md)| campaign_data | 
 **campaign_data_id** | [**String**](.md)| UUID campaign_data_id | 

### Return type

[**CampaignData**](CampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_campaign_plan_using_put**
> CampaignPlan update_campaign_plan_using_put(campaign_plan, campaign_plan_id)

Update a campaign plan

Updated the information for a campaign plan

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

api_instance = NucleusApi::MarketingApi.new

campaign_plan = NucleusApi::CampaignPlan.new # CampaignPlan | campaign_plan

campaign_plan_id = 'campaign_plan_id_example' # String | UUID campaign_plan_id


begin
  #Update a campaign plan
  result = api_instance.update_campaign_plan_using_put(campaign_plan, campaign_plan_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->update_campaign_plan_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan** | [**CampaignPlan**](CampaignPlan.md)| campaign_plan | 
 **campaign_plan_id** | [**String**](.md)| UUID campaign_plan_id | 

### Return type

[**CampaignPlan**](CampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_campaign_using_put**
> Campaign update_campaign_using_put(campaign, campaign_id)

Update a campaign

Updated the information for a campaign

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

api_instance = NucleusApi::MarketingApi.new

campaign = NucleusApi::Campaign.new # Campaign | campaign

campaign_id = 'campaign_id_example' # String | UUID campaign_id


begin
  #Update a campaign
  result = api_instance.update_campaign_using_put(campaign, campaign_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->update_campaign_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign** | [**Campaign**](Campaign.md)| campaign | 
 **campaign_id** | [**String**](.md)| UUID campaign_id | 

### Return type

[**Campaign**](Campaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_client_campaign_using_put**
> ClientCampaignMapping update_client_campaign_using_put(client_campaign_id, json_node)

Update a clients/ips pair under a campaign

Updated the information for clients/ips pair under a campaign

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

api_instance = NucleusApi::MarketingApi.new

client_campaign_id = 'client_campaign_id_example' # String | UUID client_campaign_id

json_node = NucleusApi::JsonNode.new # JsonNode | jsonNode


begin
  #Update a clients/ips pair under a campaign
  result = api_instance.update_client_campaign_using_put(client_campaign_id, json_node)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling MarketingApi->update_client_campaign_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**String**](.md)| UUID client_campaign_id | 
 **json_node** | [**JsonNode**](JsonNode.md)| jsonNode | 

### Return type

[**ClientCampaignMapping**](ClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



