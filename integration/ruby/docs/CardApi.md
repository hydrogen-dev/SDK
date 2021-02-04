# IntegrationApi::CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_auto_reload_using_post**](CardApi.md#create_auto_reload_using_post) | **POST** /card/auto_reload | Card auto reload
[**create_card_activate_using_post**](CardApi.md#create_card_activate_using_post) | **POST** /card/activate | Activate card
[**create_card_business_using_post**](CardApi.md#create_card_business_using_post) | **POST** /card/business | Create a card business
[**create_card_close_using_post**](CardApi.md#create_card_close_using_post) | **POST** /card/close | close a card
[**create_card_issue_using_post**](CardApi.md#create_card_issue_using_post) | **POST** /card/issue | issue a card
[**create_card_load_using_post**](CardApi.md#create_card_load_using_post) | **POST** /card/load | Create a card load
[**create_card_pin_using_post**](CardApi.md#create_card_pin_using_post) | **POST** /card/pin | pin card
[**create_card_reactivate_using_post**](CardApi.md#create_card_reactivate_using_post) | **POST** /card/reactivate | reactivate card
[**create_card_reissue_using_post**](CardApi.md#create_card_reissue_using_post) | **POST** /card/reissue | Reissue a card
[**create_card_replace_using_post**](CardApi.md#create_card_replace_using_post) | **POST** /card/replace | Create card replace
[**create_card_spending_control_using_post**](CardApi.md#create_card_spending_control_using_post) | **POST** /card/spending_control | Create card spending control
[**create_card_suspend_using_post**](CardApi.md#create_card_suspend_using_post) | **POST** /card/suspend | suspend card
[**create_card_token_using_post**](CardApi.md#create_card_token_using_post) | **POST** /card/token | token card
[**create_card_unload_using_post**](CardApi.md#create_card_unload_using_post) | **POST** /card/unload | Create a card upload
[**create_client_card_using_post**](CardApi.md#create_client_card_using_post) | **POST** /card/client | Create a card client
[**get_card_balance_using_get**](CardApi.md#get_card_balance_using_get) | **GET** /card/balance/{id} | Get a Card Balance
[**get_card_image**](CardApi.md#get_card_image) | **GET** /card/image/{card_id} | Get card image
[**get_card_pci_details**](CardApi.md#get_card_pci_details) | **GET** /card/pci_details/{card_id} | Get card pci details
[**get_card_reserve_account_details_using_get**](CardApi.md#get_card_reserve_account_details_using_get) | **GET** /card/reserve | Card reserve account
[**get_card_statement_using_get**](CardApi.md#get_card_statement_using_get) | **GET** /card/statement/{card_id} | Get card statement
[**get_card_token_using_token**](CardApi.md#get_card_token_using_token) | **GET** /card/token/{id} | Get a card token
[**get_card_transaction_using_get**](CardApi.md#get_card_transaction_using_get) | **GET** /card/transaction/{id} | Get a card transaction
[**get_card_using_get**](CardApi.md#get_card_using_get) | **GET** /card/{id} | Get a card information
[**update_card_business_using_put**](CardApi.md#update_card_business_using_put) | **PUT** /card/business/{nucleus_business_id} | Update a card business
[**update_card_pin_using_post**](CardApi.md#update_card_pin_using_post) | **PUT** /card/pin/{id} | update a pin card
[**update_card_spending_control_using_put**](CardApi.md#update_card_spending_control_using_put) | **PUT** /card/spending_control/{nucleus_spending_control_id} | Update a card spending control
[**update_card_using_put**](CardApi.md#update_card_using_put) | **PUT** /card/{id} | Update a card information
[**update_client_card_using_put**](CardApi.md#update_client_card_using_put) | **PUT** /card/client/{id} | Update a card client
[**verify_card_pin_using_post**](CardApi.md#verify_card_pin_using_post) | **POST** /card/pin/verify | verify card pin


# **create_auto_reload_using_post**
> CardAutoReloadResponseVO create_auto_reload_using_post(request)

Card auto reload

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

api_instance = IntegrationApi::CardApi.new

request = IntegrationApi::CardAutoReloadRequestCO.new # CardAutoReloadRequestCO | request


begin
  #Card auto reload
  result = api_instance.create_auto_reload_using_post(request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_auto_reload_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardAutoReloadRequestCO**](CardAutoReloadRequestCO.md)| request | 

### Return type

[**CardAutoReloadResponseVO**](CardAutoReloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_activate_using_post**
> BaseResponseVO create_card_activate_using_post(activate_request)

Activate card

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

api_instance = IntegrationApi::CardApi.new

activate_request = IntegrationApi::CardBaseRequestCO.new # CardBaseRequestCO | activateRequest


begin
  #Activate card
  result = api_instance.create_card_activate_using_post(activate_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_activate_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activate_request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| activateRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_business_using_post**
> CreateBusinessResponseVO create_card_business_using_post(card_business_request_co)

Create a card business

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

api_instance = IntegrationApi::CardApi.new

card_business_request_co = IntegrationApi::CardBusinessRequestCO.new # CardBusinessRequestCO | cardBusinessRequestCO


begin
  #Create a card business
  result = api_instance.create_card_business_using_post(card_business_request_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_business_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_business_request_co** | [**CardBusinessRequestCO**](CardBusinessRequestCO.md)| cardBusinessRequestCO | 

### Return type

[**CreateBusinessResponseVO**](CreateBusinessResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_close_using_post**
> BaseResponseVO create_card_close_using_post(close_request)

close a card

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

api_instance = IntegrationApi::CardApi.new

close_request = IntegrationApi::CardBaseRequestCO.new # CardBaseRequestCO | closeRequest


begin
  #close a card
  result = api_instance.create_card_close_using_post(close_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_close_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **close_request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| closeRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_issue_using_post**
> BaseResponseVO create_card_issue_using_post(issue_request)

issue a card

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

api_instance = IntegrationApi::CardApi.new

issue_request = IntegrationApi::CardBaseRequestCO.new # CardBaseRequestCO | issueRequest


begin
  #issue a card
  result = api_instance.create_card_issue_using_post(issue_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_issue_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issue_request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| issueRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_load_using_post**
> CardLoadUnloadResponseVO create_card_load_using_post(load_request)

Create a card load

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

api_instance = IntegrationApi::CardApi.new

load_request = IntegrationApi::CardLoadRequestCO.new # CardLoadRequestCO | loadRequest


begin
  #Create a card load
  result = api_instance.create_card_load_using_post(load_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_load_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **load_request** | [**CardLoadRequestCO**](CardLoadRequestCO.md)| loadRequest | 

### Return type

[**CardLoadUnloadResponseVO**](CardLoadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_pin_using_post**
> BaseResponseVO create_card_pin_using_post(card_pin_request_co)

pin card

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

api_instance = IntegrationApi::CardApi.new

card_pin_request_co = IntegrationApi::CardPinRequestCO.new # CardPinRequestCO | cardPinRequestCO


begin
  #pin card
  result = api_instance.create_card_pin_using_post(card_pin_request_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_pin_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_pin_request_co** | [**CardPinRequestCO**](CardPinRequestCO.md)| cardPinRequestCO | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_reactivate_using_post**
> BaseResponseVO create_card_reactivate_using_post(reactivate_request)

reactivate card

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

api_instance = IntegrationApi::CardApi.new

reactivate_request = IntegrationApi::CardBaseRequestCO.new # CardBaseRequestCO | reactivateRequest


begin
  #reactivate card
  result = api_instance.create_card_reactivate_using_post(reactivate_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_reactivate_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reactivate_request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| reactivateRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_reissue_using_post**
> BaseResponseVO create_card_reissue_using_post(request)

Reissue a card

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

api_instance = IntegrationApi::CardApi.new

request = IntegrationApi::CardBaseRequestCO.new # CardBaseRequestCO | request


begin
  #Reissue a card
  result = api_instance.create_card_reissue_using_post(request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_reissue_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| request | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_replace_using_post**
> CardReplaceResponseVO create_card_replace_using_post(request)

Create card replace

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

api_instance = IntegrationApi::CardApi.new

request = IntegrationApi::CardBaseRequestCO.new # CardBaseRequestCO | request


begin
  #Create card replace
  result = api_instance.create_card_replace_using_post(request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_replace_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| request | 

### Return type

[**CardReplaceResponseVO**](CardReplaceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_spending_control_using_post**
> CardSpendingControlResponseVO create_card_spending_control_using_post(request)

Create card spending control

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

api_instance = IntegrationApi::CardApi.new

request = IntegrationApi::CardSpendingControlRequestCO.new # CardSpendingControlRequestCO | request


begin
  #Create card spending control
  result = api_instance.create_card_spending_control_using_post(request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_spending_control_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardSpendingControlRequestCO**](CardSpendingControlRequestCO.md)| request | 

### Return type

[**CardSpendingControlResponseVO**](CardSpendingControlResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_suspend_using_post**
> BaseResponseVO create_card_suspend_using_post(suspend_request)

suspend card

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

api_instance = IntegrationApi::CardApi.new

suspend_request = IntegrationApi::CardBaseRequestCO.new # CardBaseRequestCO | suspendRequest


begin
  #suspend card
  result = api_instance.create_card_suspend_using_post(suspend_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_suspend_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suspend_request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| suspendRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_token_using_post**
> CardTokenResponseVO create_card_token_using_post(tokenize_request)

token card

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

api_instance = IntegrationApi::CardApi.new

tokenize_request = IntegrationApi::CardTokenRequestCO.new # CardTokenRequestCO | tokenizeRequest


begin
  #token card
  result = api_instance.create_card_token_using_post(tokenize_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_token_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenize_request** | [**CardTokenRequestCO**](CardTokenRequestCO.md)| tokenizeRequest | 

### Return type

[**CardTokenResponseVO**](CardTokenResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_unload_using_post**
> CardLoadUnloadResponseVO create_card_unload_using_post(reload_request)

Create a card upload

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

api_instance = IntegrationApi::CardApi.new

reload_request = IntegrationApi::CardUnloadRequestCO.new # CardUnloadRequestCO | reloadRequest


begin
  #Create a card upload
  result = api_instance.create_card_unload_using_post(reload_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_unload_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reload_request** | [**CardUnloadRequestCO**](CardUnloadRequestCO.md)| reloadRequest | 

### Return type

[**CardLoadUnloadResponseVO**](CardLoadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_client_card_using_post**
> CreateCardClientResponseVO create_client_card_using_post(card_client_request_co)

Create a card client

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

api_instance = IntegrationApi::CardApi.new

card_client_request_co = IntegrationApi::CardClientRequestCO.new # CardClientRequestCO | cardClientRequestCO


begin
  #Create a card client
  result = api_instance.create_client_card_using_post(card_client_request_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_client_card_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_client_request_co** | [**CardClientRequestCO**](CardClientRequestCO.md)| cardClientRequestCO | 

### Return type

[**CreateCardClientResponseVO**](CreateCardClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_card_balance_using_get**
> CardBalanceResponseVO get_card_balance_using_get(id, opts)

Get a Card Balance

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

api_instance = IntegrationApi::CardApi.new

id = 'id_example' # String | id

opts = { 
  end_date: Date.parse('2013-10-20'), # Date | end_date
  start_date: Date.parse('2013-10-20') # Date | start_date
}

begin
  #Get a Card Balance
  result = api_instance.get_card_balance_using_get(id, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->get_card_balance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 
 **end_date** | **Date**| end_date | [optional] 
 **start_date** | **Date**| start_date | [optional] 

### Return type

[**CardBalanceResponseVO**](CardBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_card_image**
> GetCardImageResponseVO get_card_image(card_id)

Get card image

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

api_instance = IntegrationApi::CardApi.new

card_id = 'card_id_example' # String | card_id


begin
  #Get card image
  result = api_instance.get_card_image(card_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->get_card_image: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**String**](.md)| card_id | 

### Return type

[**GetCardImageResponseVO**](GetCardImageResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_card_pci_details**
> GetCardPciDetailsResponseVO get_card_pci_details(card_id)

Get card pci details

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

api_instance = IntegrationApi::CardApi.new

card_id = 'card_id_example' # String | card_id


begin
  #Get card pci details
  result = api_instance.get_card_pci_details(card_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->get_card_pci_details: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**String**](.md)| card_id | 

### Return type

[**GetCardPciDetailsResponseVO**](GetCardPciDetailsResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_card_reserve_account_details_using_get**
> CardReserveAccountResponseVO get_card_reserve_account_details_using_get

Card reserve account

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

api_instance = IntegrationApi::CardApi.new

begin
  #Card reserve account
  result = api_instance.get_card_reserve_account_details_using_get
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->get_card_reserve_account_details_using_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CardReserveAccountResponseVO**](CardReserveAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_card_statement_using_get**
> GetCardStatementResponseVO get_card_statement_using_get(card_id, opts)

Get card statement

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

api_instance = IntegrationApi::CardApi.new

card_id = 'card_id_example' # String | card_id

opts = { 
  end_date: Date.parse('2013-10-20'), # Date | end_date
  start_date: Date.parse('2013-10-20') # Date | start_date
}

begin
  #Get card statement
  result = api_instance.get_card_statement_using_get(card_id, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->get_card_statement_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**String**](.md)| card_id | 
 **end_date** | **Date**| end_date | [optional] 
 **start_date** | **Date**| start_date | [optional] 

### Return type

[**GetCardStatementResponseVO**](GetCardStatementResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_card_token_using_token**
> Array&lt;GetCardTokenResponseVO&gt; get_card_token_using_token(id, opts)

Get a card token

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

api_instance = IntegrationApi::CardApi.new

id = 'id_example' # String | id

opts = { 
  device_id: 'device_id_example', # String | device_id
  device_type: 'device_type_example', # String | device_type
  wallet: 'wallet_example' # String | wallet
}

begin
  #Get a card token
  result = api_instance.get_card_token_using_token(id, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->get_card_token_using_token: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 
 **device_id** | **String**| device_id | [optional] 
 **device_type** | **String**| device_type | [optional] 
 **wallet** | **String**| wallet | [optional] 

### Return type

[**Array&lt;GetCardTokenResponseVO&gt;**](GetCardTokenResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_card_transaction_using_get**
> CardTransactionResponseVO get_card_transaction_using_get(id, opts)

Get a card transaction

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

api_instance = IntegrationApi::CardApi.new

id = 'id_example' # String | id

opts = { 
  end_date: Date.parse('2013-10-20'), # Date | end_date
  start_date: Date.parse('2013-10-20') # Date | start_date
}

begin
  #Get a card transaction
  result = api_instance.get_card_transaction_using_get(id, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->get_card_transaction_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 
 **end_date** | **Date**| end_date | [optional] 
 **start_date** | **Date**| start_date | [optional] 

### Return type

[**CardTransactionResponseVO**](CardTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_card_using_get**
> BaseResponseVO get_card_using_get(id)

Get a card information

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

api_instance = IntegrationApi::CardApi.new

id = 'id_example' # String | id


begin
  #Get a card information
  result = api_instance.get_card_using_get(id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->get_card_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_card_business_using_put**
> UpdateBusinessResponseVO update_card_business_using_put(nucleus_business_id)

Update a card business

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

api_instance = IntegrationApi::CardApi.new

nucleus_business_id = 'nucleus_business_id_example' # String | nucleus_business_id


begin
  #Update a card business
  result = api_instance.update_card_business_using_put(nucleus_business_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->update_card_business_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_business_id** | [**String**](.md)| nucleus_business_id | 

### Return type

[**UpdateBusinessResponseVO**](UpdateBusinessResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_card_pin_using_post**
> BaseResponseVO update_card_pin_using_post(card_pin_request_co, id)

update a pin card

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

api_instance = IntegrationApi::CardApi.new

card_pin_request_co = IntegrationApi::CardUpdatePinRequestCO.new # CardUpdatePinRequestCO | cardPinRequestCO

id = 'id_example' # String | id


begin
  #update a pin card
  result = api_instance.update_card_pin_using_post(card_pin_request_co, id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->update_card_pin_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_pin_request_co** | [**CardUpdatePinRequestCO**](CardUpdatePinRequestCO.md)| cardPinRequestCO | 
 **id** | [**String**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_card_spending_control_using_put**
> CardSpendingControlResponseVO update_card_spending_control_using_put(nucleus_spending_control_id)

Update a card spending control

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

api_instance = IntegrationApi::CardApi.new

nucleus_spending_control_id = 'nucleus_spending_control_id_example' # String | nucleus_spending_control_id


begin
  #Update a card spending control
  result = api_instance.update_card_spending_control_using_put(nucleus_spending_control_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->update_card_spending_control_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_spending_control_id** | [**String**](.md)| nucleus_spending_control_id | 

### Return type

[**CardSpendingControlResponseVO**](CardSpendingControlResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_card_using_put**
> BaseResponseVO update_card_using_put(id)

Update a card information

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

api_instance = IntegrationApi::CardApi.new

id = 'id_example' # String | id


begin
  #Update a card information
  result = api_instance.update_card_using_put(id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->update_card_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_client_card_using_put**
> UpdateCardClientResponseVO update_client_card_using_put(id)

Update a card client

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

api_instance = IntegrationApi::CardApi.new

id = 'id_example' # String | id


begin
  #Update a card client
  result = api_instance.update_client_card_using_put(id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->update_client_card_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 

### Return type

[**UpdateCardClientResponseVO**](UpdateCardClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **verify_card_pin_using_post**
> BaseResponseVO verify_card_pin_using_post(card_pin_request_co)

verify card pin

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

api_instance = IntegrationApi::CardApi.new

card_pin_request_co = IntegrationApi::CardPinRequestCO.new # CardPinRequestCO | cardPinRequestCO


begin
  #verify card pin
  result = api_instance.verify_card_pin_using_post(card_pin_request_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->verify_card_pin_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_pin_request_co** | [**CardPinRequestCO**](CardPinRequestCO.md)| cardPinRequestCO | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



