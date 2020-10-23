# IntegrationApi::CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_card_activate_using_post**](CardApi.md#create_card_activate_using_post) | **POST** /card/activate | Activate card
[**create_card_close_using_post**](CardApi.md#create_card_close_using_post) | **POST** /card/close | close a card
[**create_card_issue_using_post**](CardApi.md#create_card_issue_using_post) | **POST** /card/issue | issue a card
[**create_card_pin_using_post**](CardApi.md#create_card_pin_using_post) | **POST** /card/pin | pin card
[**create_card_reactivate_using_post**](CardApi.md#create_card_reactivate_using_post) | **POST** /card/reactivate | reactivate card
[**create_card_reissue_using_post**](CardApi.md#create_card_reissue_using_post) | **POST** /card/reissue | Reissue a card
[**create_card_reload_using_post**](CardApi.md#create_card_reload_using_post) | **POST** /card/reload | Create a card reload
[**create_card_suspend_using_post**](CardApi.md#create_card_suspend_using_post) | **POST** /card/suspend | suspend card
[**create_card_token_using_post**](CardApi.md#create_card_token_using_post) | **POST** /card/token | token card
[**create_card_transfer_using_post**](CardApi.md#create_card_transfer_using_post) | **POST** /card/transfer | Create Card transfer
[**create_card_unload_using_post**](CardApi.md#create_card_unload_using_post) | **POST** /card/unload | Create a card upload
[**create_client_card_using_post**](CardApi.md#create_client_card_using_post) | **POST** /card/client | Create a card client
[**get_card_balance_using_get**](CardApi.md#get_card_balance_using_get) | **GET** /card/balance/{id} | Get a Card Balance
[**get_card_token_using_token**](CardApi.md#get_card_token_using_token) | **GET** /card/token/{id} | Get a card token
[**get_card_transaction_using_get**](CardApi.md#get_card_transaction_using_get) | **GET** /card/transaction/{id} | Get a card transaction
[**get_card_using_get**](CardApi.md#get_card_using_get) | **GET** /card/{id} | Get a card information
[**update_card_pin_using_post**](CardApi.md#update_card_pin_using_post) | **PUT** /card/pin/{id} | update a pin card
[**update_card_using_put**](CardApi.md#update_card_using_put) | **PUT** /card/{id} | Update a card information


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



# **create_card_reload_using_post**
> CardReloadUnloadResponseVO create_card_reload_using_post(reload_request)

Create a card reload

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

reload_request = IntegrationApi::CardReloadRequestCO.new # CardReloadRequestCO | reloadRequest


begin
  #Create a card reload
  result = api_instance.create_card_reload_using_post(reload_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_reload_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reload_request** | [**CardReloadRequestCO**](CardReloadRequestCO.md)| reloadRequest | 

### Return type

[**CardReloadUnloadResponseVO**](CardReloadUnloadResponseVO.md)

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



# **create_card_transfer_using_post**
> CardTransferResponseVO create_card_transfer_using_post(transfer_request)

Create Card transfer

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

transfer_request = IntegrationApi::CardTransferRequestCO.new # CardTransferRequestCO | transferRequest


begin
  #Create Card transfer
  result = api_instance.create_card_transfer_using_post(transfer_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->create_card_transfer_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**CardTransferRequestCO**](CardTransferRequestCO.md)| transferRequest | 

### Return type

[**CardTransferResponseVO**](CardTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_card_unload_using_post**
> CardReloadUnloadResponseVO create_card_unload_using_post(reload_request)

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

[**CardReloadUnloadResponseVO**](CardReloadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_client_card_using_post**
> CardClientResponseVO create_client_card_using_post(card_client_request_co)

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

[**CardClientResponseVO**](CardClientResponseVO.md)

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



# **get_card_token_using_token**
> GetCardTokenResponseVO get_card_token_using_token(id)

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


begin
  #Get a card token
  result = api_instance.get_card_token_using_token(id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling CardApi->get_card_token_using_token: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 

### Return type

[**GetCardTokenResponseVO**](GetCardTokenResponseVO.md)

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

card_pin_request_co = IntegrationApi::CardPinRequestCO.new # CardPinRequestCO | cardPinRequestCO

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
 **card_pin_request_co** | [**CardPinRequestCO**](CardPinRequestCO.md)| cardPinRequestCO | 
 **id** | [**String**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

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



