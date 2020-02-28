# MoleculeApi::MoleculeApi

All URIs are relative to *https://api.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_token**](MoleculeApi.md#delete_token) | **DELETE** /molecule/v1/token/{token_id}/ | Delete a token
[**delete_webhook**](MoleculeApi.md#delete_webhook) | **DELETE** /molecule/v1/webhook/{webhook_id}/ | Delete a webhook
[**get_currencies**](MoleculeApi.md#get_currencies) | **GET** /molecule/v1/currency | Get information for all currencies defined for your firm
[**get_currency**](MoleculeApi.md#get_currency) | **GET** /molecule/v1/currency/{currency_id}/ | Retrieve a currency
[**get_currency_balance**](MoleculeApi.md#get_currency_balance) | **GET** /molecule/v1/currency_balance/{currency_balance_id} | Retrieve a currency balance
[**get_currency_balances**](MoleculeApi.md#get_currency_balances) | **GET** /molecule/v1/currency_balance | Get information for all currency balances recorded in your application.
[**get_currency_transfer**](MoleculeApi.md#get_currency_transfer) | **GET** /molecule/v1/currency_transfer/{currency_transfer_id} | Retrieve a currency transfer
[**get_currency_transfers**](MoleculeApi.md#get_currency_transfers) | **GET** /molecule/v1/currency_transfer | Get information for all currency transfers
[**get_token**](MoleculeApi.md#get_token) | **GET** /molecule/v1/token/{token_id}/ | Retrieve a token
[**get_token_balance**](MoleculeApi.md#get_token_balance) | **GET** /molecule/v1/token_balance/{token_balance_id} | Retrieve a token balance
[**get_token_balances**](MoleculeApi.md#get_token_balances) | **GET** /molecule/v1/token_balance | Get information for all token balances defined for your application.
[**get_token_supplies**](MoleculeApi.md#get_token_supplies) | **GET** /molecule/v1/token_supply | Get information for all token supplies defined for your application.
[**get_token_supply**](MoleculeApi.md#get_token_supply) | **GET** /molecule/v1/token_supply/{token_supply_id} | Retrieve a token supply
[**get_token_transfer**](MoleculeApi.md#get_token_transfer) | **GET** /molecule/v1/token_transfer/{token_transfer_id} | Retrieve a token transfer
[**get_token_transfers**](MoleculeApi.md#get_token_transfers) | **GET** /molecule/v1/token_transfer | Get information for all token transfers
[**get_tokens**](MoleculeApi.md#get_tokens) | **GET** /molecule/v1/token | Get information for all tokens defined for your firm
[**get_transaction_status**](MoleculeApi.md#get_transaction_status) | **GET** /molecule/v1/transaction_status/{transaction_status_id} | Retrieve status information for a specific transaction
[**get_transaction_statuses**](MoleculeApi.md#get_transaction_statuses) | **GET** /molecule/v1/transaction_status | Get status information for all transactions
[**get_wallet**](MoleculeApi.md#get_wallet) | **GET** /molecule/v1/wallet/{wallet_id}/ | Retrieve a wallet
[**get_wallet_key**](MoleculeApi.md#get_wallet_key) | **GET** /molecule/v1/wallet_key/{wallet_key_id}/ | Retrieve a wallet key
[**get_wallet_keys**](MoleculeApi.md#get_wallet_keys) | **GET** /molecule/v1/wallet_key | Get all wallet keys associated with wallets defined for your firm.
[**get_wallet_permission**](MoleculeApi.md#get_wallet_permission) | **GET** /molecule/v1/wallet_permission/{wallet_id}/ | Retrieve a wallet&#39;s permission
[**get_wallet_permissions**](MoleculeApi.md#get_wallet_permissions) | **GET** /molecule/v1/wallet_permission | Get information for all wallet permisions defined for your firm
[**get_wallets**](MoleculeApi.md#get_wallets) | **GET** /molecule/v1/wallet | Get information for all wallets defined for your firm
[**get_webhook**](MoleculeApi.md#get_webhook) | **GET** /molecule/v1/webhook/{webhook_id}/ | Retrieve a webhook
[**get_webhooks**](MoleculeApi.md#get_webhooks) | **GET** /molecule/v1/webhook | Get information for all webhooks defined for your firm
[**post_crowdsale_deploy**](MoleculeApi.md#post_crowdsale_deploy) | **POST** /molecule/v1/crowdsale/deploy | Deploy a token&#39;s crowdsale contract.
[**post_crowdsale_fund**](MoleculeApi.md#post_crowdsale_fund) | **POST** /molecule/v1/crowdsale/fund | Transfer tokens to a token&#39;s crowdsale address.
[**post_crowdsale_purchase**](MoleculeApi.md#post_crowdsale_purchase) | **POST** /molecule/v1/crowdsale/purchase | Purchase tokens from a crowdsale contract
[**post_currency**](MoleculeApi.md#post_currency) | **POST** /molecule/v1/currency | Add a currency under your firm.
[**post_currency_balance_update**](MoleculeApi.md#post_currency_balance_update) | **POST** /molecule/v1/currency_balance/update | Update the currency balance of a wallet using the blockchain
[**post_currency_transfer**](MoleculeApi.md#post_currency_transfer) | **POST** /molecule/v1/currency_transfer | Transfer currency between wallets
[**post_token**](MoleculeApi.md#post_token) | **POST** /molecule/v1/token | Create a token under your firm.
[**post_token_burn**](MoleculeApi.md#post_token_burn) | **POST** /molecule/v1/token/burn | Burn existing tokens
[**post_token_deploy**](MoleculeApi.md#post_token_deploy) | **POST** /molecule/v1/token/deploy | Deploy a security token contract to blockchain.
[**post_token_mint**](MoleculeApi.md#post_token_mint) | **POST** /molecule/v1/token/mint | Mint new tokens
[**post_token_transfer**](MoleculeApi.md#post_token_transfer) | **POST** /molecule/v1/token_transfer | Transfer tokens between wallets
[**post_token_whitelist**](MoleculeApi.md#post_token_whitelist) | **POST** /molecule/v1/token/whitelist | Add an investor to a token&#39;s whitelist
[**post_wallet**](MoleculeApi.md#post_wallet) | **POST** /molecule/v1/wallet | Create a wallet under your firm.
[**post_wallet_key**](MoleculeApi.md#post_wallet_key) | **POST** /molecule/v1/wallet_key | Associate an existing key pair with a wallet defined for your firm.
[**post_wallet_key_generator**](MoleculeApi.md#post_wallet_key_generator) | **POST** /molecule/v1/wallet_key/generator | Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
[**post_webhook**](MoleculeApi.md#post_webhook) | **POST** /molecule/v1/webhook | Create a webhook under your firm.
[**update_currency**](MoleculeApi.md#update_currency) | **PUT** /molecule/v1/currency/{currency_id}/ | Update a currency
[**update_token**](MoleculeApi.md#update_token) | **PUT** /molecule/v1/token/{token_id}/ | Update a token
[**update_wallet**](MoleculeApi.md#update_wallet) | **PUT** /molecule/v1/wallet/{wallet_id}/ | Update a wallet
[**update_wallet_permission**](MoleculeApi.md#update_wallet_permission) | **PUT** /molecule/v1/wallet_permission/{wallet_id}/ | Update a wallet&#39;s permission
[**update_webhook**](MoleculeApi.md#update_webhook) | **PUT** /molecule/v1/webhook/{webhook_id}/ | Update a webhook


# **delete_token**
> delete_token(token_id)

Delete a token

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

token_id = 'token_id_example' # String | UUID of a token


begin
  #Delete a token
  api_instance.delete_token(token_id)
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->delete_token: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**String**](.md)| UUID of a token | 

### Return type

nil (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_webhook**
> delete_webhook(webhook_id)

Delete a webhook

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

webhook_id = 'webhook_id_example' # String | UUID of a webhook


begin
  #Delete a webhook
  api_instance.delete_webhook(webhook_id)
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->delete_webhook: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**String**](.md)| UUID of a webhook | 

### Return type

nil (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_currencies**
> CurrencyGetResponse get_currencies(opts)

Get information for all currencies defined for your firm

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
  symbol: 'symbol_example' # String | 
}

begin
  #Get information for all currencies defined for your firm
  result = api_instance.get_currencies(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_currencies: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 
 **symbol** | **String**|  | [optional] 

### Return type

[**CurrencyGetResponse**](CurrencyGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_currency**
> CurrencySpecificResponse get_currency(currency_id, )

Retrieve a currency

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

currency_id = 'currency_id_example' # String | UUID of a currency


begin
  #Retrieve a currency
  result = api_instance.get_currency(currency_id, )
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_currency: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_id** | [**String**](.md)| UUID of a currency | 

### Return type

[**CurrencySpecificResponse**](CurrencySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_currency_balance**
> CurrencyBalanceSpecificResponse get_currency_balance(currency_balance_id)

Retrieve a currency balance

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

currency_balance_id = 'currency_balance_id_example' # String | UUID of a currency balance


begin
  #Retrieve a currency balance
  result = api_instance.get_currency_balance(currency_balance_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_currency_balance: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_balance_id** | [**String**](.md)| UUID of a currency balance | 

### Return type

[**CurrencyBalanceSpecificResponse**](CurrencyBalanceSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_currency_balances**
> CurrencyBalanceGetResponse get_currency_balances(opts)

Get information for all currency balances recorded in your application.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
  currency_id: 'currency_id_example', # String | Filters results by their currency ids
  wallet_id: 'wallet_id_example', # String | Filters results by their wallet ids
}

begin
  #Get information for all currency balances recorded in your application.
  result = api_instance.get_currency_balances(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_currency_balances: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 
 **currency_id** | **String**| Filters results by their currency ids | [optional] 
 **wallet_id** | **String**| Filters results by their wallet ids | [optional] 

### Return type

[**CurrencyBalanceGetResponse**](CurrencyBalanceGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_currency_transfer**
> CurrencyTransferSpecificResponse get_currency_transfer(currency_transfer_id)

Retrieve a currency transfer

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

currency_transfer_id = 'currency_transfer_id_example' # String | UUID of a currency transfer


begin
  #Retrieve a currency transfer
  result = api_instance.get_currency_transfer(currency_transfer_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_currency_transfer: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_transfer_id** | [**String**](.md)| UUID of a currency transfer | 

### Return type

[**CurrencyTransferSpecificResponse**](CurrencyTransferSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_currency_transfers**
> CurrencyTransferGetResponse get_currency_transfers(opts)

Get information for all currency transfers

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
  currency_id: 'currency_id_example', # String | Filters results by their currency ids
  wallet_id: 'wallet_id_example', # String | Filters results by their wallet ids
  sender_wallet_id: 'sender_wallet_id_example', # String | Filters results by their sender wallet ids
  receiver_wallet_id: 'receiver_wallet_id_example' # String | Filters results by their receiver wallet ids
}

begin
  #Get information for all currency transfers
  result = api_instance.get_currency_transfers(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_currency_transfers: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 
 **currency_id** | **String**| Filters results by their currency ids | [optional] 
 **wallet_id** | **String**| Filters results by their wallet ids | [optional] 
 **sender_wallet_id** | **String**| Filters results by their sender wallet ids | [optional] 
 **receiver_wallet_id** | **String**| Filters results by their receiver wallet ids | [optional] 

### Return type

[**CurrencyTransferGetResponse**](CurrencyTransferGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_token**
> TokenSpecificResponse get_token(token_id)

Retrieve a token

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

token_id = 'token_id_example' # String | UUID of a token


begin
  #Retrieve a token
  result = api_instance.get_token(token_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_token: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**String**](.md)| UUID of a token | 

### Return type

[**TokenSpecificResponse**](TokenSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_token_balance**
> TokenBalanceSpecificResponse get_token_balance(token_balance_id)

Retrieve a token balance

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

token_balance_id = 'token_balance_id_example' # String | UUID of a token balance


begin
  #Retrieve a token balance
  result = api_instance.get_token_balance(token_balance_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_token_balance: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_balance_id** | [**String**](.md)| UUID of a token balance | 

### Return type

[**TokenBalanceSpecificResponse**](TokenBalanceSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_token_balances**
> TokenBalanceGetResponse get_token_balances(opts)

Get information for all token balances defined for your application.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
  token_id: 'token_id_example', # String | Filters results by their token ids
  wallet_id: 'wallet_id_example', # String | Filters results by their wallet ids
}

begin
  #Get information for all token balances defined for your application.
  result = api_instance.get_token_balances(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_token_balances: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 
 **token_id** | **String**| Filters results by their token ids | [optional] 
 **wallet_id** | **String**| Filters results by their wallet ids | [optional] 

### Return type

[**TokenBalanceGetResponse**](TokenBalanceGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_token_supplies**
> TokenSupplyGetResponse get_token_supplies(opts)

Get information for all token supplies defined for your application.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
  token_id: 'token_id_example', # String | Filters results by their token ids
}

begin
  #Get information for all token supplies defined for your application.
  result = api_instance.get_token_supplies(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_token_supplies: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 
 **token_id** | **String**| Filters results by their token ids | [optional] 

### Return type

[**TokenSupplyGetResponse**](TokenSupplyGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_token_supply**
> TokenSupplySpecificResponse get_token_supply(token_supply_id)

Retrieve a token supply

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

token_supply_id = 'token_supply_id_example' # String | UUID of a token supply


begin
  #Retrieve a token supply
  result = api_instance.get_token_supply(token_supply_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_token_supply: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_supply_id** | [**String**](.md)| UUID of a token supply | 

### Return type

[**TokenSupplySpecificResponse**](TokenSupplySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_token_transfer**
> TokenTransferSpecificResponse get_token_transfer(token_transfer_id)

Retrieve a token transfer

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

token_transfer_id = 'token_transfer_id_example' # String | UUID of a token transfer


begin
  #Retrieve a token transfer
  result = api_instance.get_token_transfer(token_transfer_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_token_transfer: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_transfer_id** | [**String**](.md)| UUID of a token transfer | 

### Return type

[**TokenTransferSpecificResponse**](TokenTransferSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_token_transfers**
> TokenTransferGetResponse get_token_transfers(opts)

Get information for all token transfers

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
  token_id: 'token_id_example', # String | Filters results by their token ids
  wallet_id: 'wallet_id_example', # String | Filters results by their wallet ids
  sender_wallet_id: 'sender_wallet_id_example', # String | Filters results by their sender wallet ids
  receiver_wallet_id: 'receiver_wallet_id_example' # String | Filters results by their receiver wallet ids
}

begin
  #Get information for all token transfers
  result = api_instance.get_token_transfers(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_token_transfers: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 
 **token_id** | **String**| Filters results by their token ids | [optional] 
 **wallet_id** | **String**| Filters results by their wallet ids | [optional] 
 **sender_wallet_id** | **String**| Filters results by their sender wallet ids | [optional] 
 **receiver_wallet_id** | **String**| Filters results by their receiver wallet ids | [optional] 

### Return type

[**TokenTransferGetResponse**](TokenTransferGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_tokens**
> TokenGetResponse get_tokens(opts)

Get information for all tokens defined for your firm

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
}

begin
  #Get information for all tokens defined for your firm
  result = api_instance.get_tokens(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_tokens: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 

### Return type

[**TokenGetResponse**](TokenGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_transaction_status**
> TransactionStatusSpecificResponse get_transaction_status(transaction_status_id)

Retrieve status information for a specific transaction

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

transaction_status_id = 'transaction_status_id_example' # String | UUID of a transaction status


begin
  #Retrieve status information for a specific transaction
  result = api_instance.get_transaction_status(transaction_status_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_transaction_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_status_id** | [**String**](.md)| UUID of a transaction status | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_transaction_statuses**
> TransactionStatusGetResponse get_transaction_statuses(opts)

Get status information for all transactions

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
  wallet_id: 'wallet_id_example', # String | Filters results by their wallet ids
  hash: 'hash_example', # String | 
  status: 'status_example' # String | 
}

begin
  #Get status information for all transactions
  result = api_instance.get_transaction_statuses(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_transaction_statuses: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 
 **wallet_id** | **String**| Filters results by their wallet ids | [optional] 
 **hash** | **String**|  | [optional] 
 **status** | **String**|  | [optional] 

### Return type

[**TransactionStatusGetResponse**](TransactionStatusGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_wallet**
> WalletSpecificResponse get_wallet(wallet_id, )

Retrieve a wallet

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

wallet_id = 'wallet_id_example' # String | UUID of a wallet


begin
  #Retrieve a wallet
  result = api_instance.get_wallet(wallet_id, )
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_wallet: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| UUID of a wallet | 

### Return type

[**WalletSpecificResponse**](WalletSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_wallet_key**
> WalletKeySpecificResponse get_wallet_key(wallet_key_id)

Retrieve a wallet key

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

wallet_key_id = 'wallet_key_id_example' # String | UUID of a wallet key


begin
  #Retrieve a wallet key
  result = api_instance.get_wallet_key(wallet_key_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_wallet_key: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_id** | [**String**](.md)| UUID of a wallet key | 

### Return type

[**WalletKeySpecificResponse**](WalletKeySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_wallet_keys**
> WalletKeyGetResponse get_wallet_keys(opts)

Get all wallet keys associated with wallets defined for your firm.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
}

begin
  #Get all wallet keys associated with wallets defined for your firm.
  result = api_instance.get_wallet_keys(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_wallet_keys: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 

### Return type

[**WalletKeyGetResponse**](WalletKeyGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_wallet_permission**
> WalletPermissionSpecificResponse get_wallet_permission(wallet_id, )

Retrieve a wallet's permission

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

wallet_id = 'wallet_id_example' # String | UUID of a wallet


begin
  #Retrieve a wallet's permission
  result = api_instance.get_wallet_permission(wallet_id, )
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_wallet_permission: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| UUID of a wallet | 

### Return type

[**WalletPermissionSpecificResponse**](WalletPermissionSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_wallet_permissions**
> WalletPermissionGetResponse get_wallet_permissions(opts)

Get information for all wallet permisions defined for your firm

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
}

begin
  #Get information for all wallet permisions defined for your firm
  result = api_instance.get_wallet_permissions(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_wallet_permissions: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 

### Return type

[**WalletPermissionGetResponse**](WalletPermissionGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_wallets**
> WalletGetResponse get_wallets(opts)

Get information for all wallets defined for your firm

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
  nucleus_client_id: 'nucleus_client_id_example', # String | 
  is_primary: true # BOOLEAN | 
}

begin
  #Get information for all wallets defined for your firm
  result = api_instance.get_wallets(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_wallets: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 
 **nucleus_client_id** | **String**|  | [optional] 
 **is_primary** | **BOOLEAN**|  | [optional] 

### Return type

[**WalletGetResponse**](WalletGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_webhook**
> WebhookSpecificResponse get_webhook(webhook_id)

Retrieve a webhook

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

webhook_id = 'webhook_id_example' # String | UUID of a webhook


begin
  #Retrieve a webhook
  result = api_instance.get_webhook(webhook_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_webhook: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**String**](.md)| UUID of a webhook | 

### Return type

[**WebhookSpecificResponse**](WebhookSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_webhooks**
> WebhookGetResponse get_webhooks(opts)

Get information for all webhooks defined for your firm

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

opts = { 
  page: 0, # Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  size: 25, # Integer | The number or records to be included per page. The default is 25. There is no max value.
  order_by: 'update_date', # String | The field in the response body to order the list by. Default is update_date.
  ascending: false, # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  get_latest: true # BOOLEAN | Retrieves the latest entry
}

begin
  #Get information for all webhooks defined for your firm
  result = api_instance.get_webhooks(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->get_webhooks: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **BOOLEAN**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **BOOLEAN**| Retrieves the latest entry | [optional] 

### Return type

[**WebhookGetResponse**](WebhookGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_crowdsale_deploy**
> TransactionStatusSpecificResponse post_crowdsale_deploy(payload)

Deploy a token's crowdsale contract.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::CrowdsaleDeployPayload.new # CrowdsaleDeployPayload | 


begin
  #Deploy a token's crowdsale contract.
  result = api_instance.post_crowdsale_deploy(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_crowdsale_deploy: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CrowdsaleDeployPayload**](CrowdsaleDeployPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_crowdsale_fund**
> TransactionStatusSpecificResponse post_crowdsale_fund(payload)

Transfer tokens to a token's crowdsale address.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::CrowdsaleFundPayload.new # CrowdsaleFundPayload | 


begin
  #Transfer tokens to a token's crowdsale address.
  result = api_instance.post_crowdsale_fund(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_crowdsale_fund: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CrowdsaleFundPayload**](CrowdsaleFundPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_crowdsale_purchase**
> TransactionStatusSpecificResponse post_crowdsale_purchase(payload)

Purchase tokens from a crowdsale contract

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::CrowdsalePurchasePayload.new # CrowdsalePurchasePayload | 


begin
  #Purchase tokens from a crowdsale contract
  result = api_instance.post_crowdsale_purchase(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_crowdsale_purchase: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CrowdsalePurchasePayload**](CrowdsalePurchasePayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_currency**
> CurrencyCreateResponse post_currency(payload)

Add a currency under your firm.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::CurrencyCreatePayload.new # CurrencyCreatePayload | 


begin
  #Add a currency under your firm.
  result = api_instance.post_currency(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_currency: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CurrencyCreatePayload**](CurrencyCreatePayload.md)|  | 

### Return type

[**CurrencyCreateResponse**](CurrencyCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_currency_balance_update**
> CurrencyBalanceSpecificResponse post_currency_balance_update(payload)

Update the currency balance of a wallet using the blockchain

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::CurrencyBalanceUpdatePayload.new # CurrencyBalanceUpdatePayload | 


begin
  #Update the currency balance of a wallet using the blockchain
  result = api_instance.post_currency_balance_update(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_currency_balance_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CurrencyBalanceUpdatePayload**](CurrencyBalanceUpdatePayload.md)|  | 

### Return type

[**CurrencyBalanceSpecificResponse**](CurrencyBalanceSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_currency_transfer**
> TransactionStatusSpecificResponse post_currency_transfer(payload)

Transfer currency between wallets

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::CurrencyTransferPayload.new # CurrencyTransferPayload | 


begin
  #Transfer currency between wallets
  result = api_instance.post_currency_transfer(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_currency_transfer: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CurrencyTransferPayload**](CurrencyTransferPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_token**
> TokenCreateResponse post_token(payload)

Create a token under your firm.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::TokenCreatePayload.new # TokenCreatePayload | 


begin
  #Create a token under your firm.
  result = api_instance.post_token(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_token: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenCreatePayload**](TokenCreatePayload.md)|  | 

### Return type

[**TokenCreateResponse**](TokenCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_token_burn**
> TransactionStatusSpecificResponse post_token_burn(payload)

Burn existing tokens

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::TokenBurnPayload.new # TokenBurnPayload | 


begin
  #Burn existing tokens
  result = api_instance.post_token_burn(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_token_burn: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenBurnPayload**](TokenBurnPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_token_deploy**
> TransactionStatusSpecificResponse post_token_deploy(payload)

Deploy a security token contract to blockchain.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::TokenDeployPayload.new # TokenDeployPayload | 


begin
  #Deploy a security token contract to blockchain.
  result = api_instance.post_token_deploy(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_token_deploy: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenDeployPayload**](TokenDeployPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_token_mint**
> TransactionStatusSpecificResponse post_token_mint(payload)

Mint new tokens

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::TokenMintPayload.new # TokenMintPayload | 


begin
  #Mint new tokens
  result = api_instance.post_token_mint(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_token_mint: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenMintPayload**](TokenMintPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_token_transfer**
> TransactionStatusSpecificResponse post_token_transfer(payload)

Transfer tokens between wallets

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::TokenTransferPayload.new # TokenTransferPayload | 


begin
  #Transfer tokens between wallets
  result = api_instance.post_token_transfer(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_token_transfer: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenTransferPayload**](TokenTransferPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_token_whitelist**
> TransactionStatusSpecificResponse post_token_whitelist(payload)

Add an investor to a token's whitelist

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::TokenWhitelistPayload.new # TokenWhitelistPayload | 


begin
  #Add an investor to a token's whitelist
  result = api_instance.post_token_whitelist(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_token_whitelist: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenWhitelistPayload**](TokenWhitelistPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_wallet**
> WalletCreateResponse post_wallet(payload)

Create a wallet under your firm.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::WalletCreatePayload.new # WalletCreatePayload | 


begin
  #Create a wallet under your firm.
  result = api_instance.post_wallet(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_wallet: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WalletCreatePayload**](WalletCreatePayload.md)|  | 

### Return type

[**WalletCreateResponse**](WalletCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_wallet_key**
> WalletKeyCreateResponse post_wallet_key(payload)

Associate an existing key pair with a wallet defined for your firm.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::WalletKeyCreatePayload.new # WalletKeyCreatePayload | 


begin
  #Associate an existing key pair with a wallet defined for your firm.
  result = api_instance.post_wallet_key(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_wallet_key: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WalletKeyCreatePayload**](WalletKeyCreatePayload.md)|  | 

### Return type

[**WalletKeyCreateResponse**](WalletKeyCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_wallet_key_generator**
> WalletKeyCreateResponse post_wallet_key_generator(payload)

Generate a wallet key using the Key Service and associate with a wallet defined for your firm.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::WalletKeyGeneratorPayload.new # WalletKeyGeneratorPayload | 


begin
  #Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
  result = api_instance.post_wallet_key_generator(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_wallet_key_generator: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WalletKeyGeneratorPayload**](WalletKeyGeneratorPayload.md)|  | 

### Return type

[**WalletKeyCreateResponse**](WalletKeyCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_webhook**
> WebhookCreateResponse post_webhook(payload)

Create a webhook under your firm.

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::WebhookCreatePayload.new # WebhookCreatePayload | 


begin
  #Create a webhook under your firm.
  result = api_instance.post_webhook(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_webhook: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WebhookCreatePayload**](WebhookCreatePayload.md)|  | 

### Return type

[**WebhookCreateResponse**](WebhookCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_currency**
> CurrencySpecificResponse update_currency(currency_id, payload)

Update a currency

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

currency_id = 'currency_id_example' # String | UUID of a currency

payload = MoleculeApi::CurrencyUpdatePayload.new # CurrencyUpdatePayload | 


begin
  #Update a currency
  result = api_instance.update_currency(currency_id, payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->update_currency: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_id** | [**String**](.md)| UUID of a currency | 
 **payload** | [**CurrencyUpdatePayload**](CurrencyUpdatePayload.md)|  | 

### Return type

[**CurrencySpecificResponse**](CurrencySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_token**
> TokenSpecificResponse update_token(token_idpayload)

Update a token

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

token_id = 'token_id_example' # String | UUID of a token

payload = MoleculeApi::TokenUpdatePayload.new # TokenUpdatePayload | 


begin
  #Update a token
  result = api_instance.update_token(token_idpayload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->update_token: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**String**](.md)| UUID of a token | 
 **payload** | [**TokenUpdatePayload**](TokenUpdatePayload.md)|  | 

### Return type

[**TokenSpecificResponse**](TokenSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_wallet**
> WalletSpecificResponse update_wallet(wallet_id, payload)

Update a wallet

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

wallet_id = 'wallet_id_example' # String | UUID of a wallet

payload = MoleculeApi::WalletUpdatePayload.new # WalletUpdatePayload | 


begin
  #Update a wallet
  result = api_instance.update_wallet(wallet_id, payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->update_wallet: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| UUID of a wallet | 
 **payload** | [**WalletUpdatePayload**](WalletUpdatePayload.md)|  | 

### Return type

[**WalletSpecificResponse**](WalletSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_wallet_permission**
> WalletPermissionSpecificResponse update_wallet_permission(wallet_id, payload)

Update a wallet's permission

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

wallet_id = 'wallet_id_example' # String | UUID of a wallet

payload = MoleculeApi::WalletPermissionUpdatePayload.new # WalletPermissionUpdatePayload | 


begin
  #Update a wallet's permission
  result = api_instance.update_wallet_permission(wallet_id, payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->update_wallet_permission: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| UUID of a wallet | 
 **payload** | [**WalletPermissionUpdatePayload**](WalletPermissionUpdatePayload.md)|  | 

### Return type

[**WalletPermissionSpecificResponse**](WalletPermissionSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_webhook**
> WebhookSpecificResponse update_webhook(webhook_idpayload)

Update a webhook

### Example
```ruby
# load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

webhook_id = 'webhook_id_example' # String | UUID of a webhook

payload = MoleculeApi::WebhookUpdatePayload.new # WebhookUpdatePayload | 


begin
  #Update a webhook
  result = api_instance.update_webhook(webhook_idpayload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->update_webhook: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**String**](.md)| UUID of a webhook | 
 **payload** | [**WebhookUpdatePayload**](WebhookUpdatePayload.md)|  | 

### Return type

[**WebhookSpecificResponse**](WebhookSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



