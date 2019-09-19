# MoleculeApi::MoleculeApi

All URIs are relative to *https://api.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_token**](MoleculeApi.md#delete_token) | **DELETE** /molecule/v1/token/{token_id}/ | Delete a token
[**get_currency_balance**](MoleculeApi.md#get_currency_balance) | **GET** /molecule/v1/currency_balance/{currency_balance_id} | Retrieve a currency balance
[**get_currency_balances**](MoleculeApi.md#get_currency_balances) | **GET** /molecule/v1/currency_balance | Get information for all currency balances defined for your application.
[**get_token**](MoleculeApi.md#get_token) | **GET** /molecule/v1/token/{token_id}/ | Retrieve a token
[**get_token_balance**](MoleculeApi.md#get_token_balance) | **GET** /molecule/v1/token_balance/{token_balance_id} | Retrieve a token balance
[**get_token_balances**](MoleculeApi.md#get_token_balances) | **GET** /molecule/v1/token_balance | Get information for all token balances defined for your application.
[**get_token_supplies**](MoleculeApi.md#get_token_supplies) | **GET** /molecule/v1/token_supply | Get information for all token supplies defined for your application.
[**get_token_supply**](MoleculeApi.md#get_token_supply) | **GET** /molecule/v1/token_supply/{token_supply_id} | Retrieve a token supply
[**get_tokens**](MoleculeApi.md#get_tokens) | **GET** /molecule/v1/token | Get information for all tokens defined for your firm
[**get_wallet**](MoleculeApi.md#get_wallet) | **GET** /molecule/v1/wallet/{wallet_id}/ | Retrieve a wallet
[**get_wallet_key**](MoleculeApi.md#get_wallet_key) | **GET** /molecule/v1/wallet_key/{wallet_key_id}/ | Retrieve a wallet key
[**get_wallet_keys**](MoleculeApi.md#get_wallet_keys) | **GET** /molecule/v1/wallet_key | Get all wallet keys associated with wallets defined for your firm.
[**get_wallets**](MoleculeApi.md#get_wallets) | **GET** /molecule/v1/wallet | Get information for all wallets defined for your firm
[**post_token**](MoleculeApi.md#post_token) | **POST** /molecule/v1/token | Create a token under your firm.
[**post_token_crowdsale**](MoleculeApi.md#post_token_crowdsale) | **POST** /molecule/v1/token/crowdsale | Transfer tokens to a token&#39;s crowdsale address.
[**post_token_deploy**](MoleculeApi.md#post_token_deploy) | **POST** /molecule/v1/token/deploy | Deploy a secuirty token contract and its crowdsale contract to blockchain.
[**post_token_purchase**](MoleculeApi.md#post_token_purchase) | **POST** /molecule/v1/token/purchase | Participate in a token&#39;s crowdsale and purchase tokens.
[**post_token_whitelist**](MoleculeApi.md#post_token_whitelist) | **POST** /molecule/v1/token/whitelist | Add an investor to a token&#39;s whitelist
[**post_wallet**](MoleculeApi.md#post_wallet) | **POST** /molecule/v1/wallet | Create a wallet under your firm.
[**post_wallet_key**](MoleculeApi.md#post_wallet_key) | **POST** /molecule/v1/wallet_key | Associate an existing key pair with a wallet defined for your firm.
[**post_wallet_key_generator**](MoleculeApi.md#post_wallet_key_generator) | **POST** /molecule/v1/wallet_key/generator | Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
[**update_token**](MoleculeApi.md#update_token) | **PUT** /molecule/v1/token/{token_id}/ | Update a token
[**update_wallet**](MoleculeApi.md#update_wallet) | **PUT** /molecule/v1/wallet/{wallet_id}/ | Update a wallet


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

Get information for all currency balances defined for your application.

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
  ascending: false # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
}

begin
  #Get information for all currency balances defined for your application.
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

### Return type

[**CurrencyBalanceGetResponse**](CurrencyBalanceGetResponse.md)

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
  ascending: false # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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
  ascending: false # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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
  ascending: false # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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

### Return type

[**TokenGetResponse**](TokenGetResponse.md)

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
  ascending: false # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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

### Return type

[**WalletKeyGetResponse**](WalletKeyGetResponse.md)

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
  ascending: false # BOOLEAN | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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

### Return type

[**WalletGetResponse**](WalletGetResponse.md)

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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_token_crowdsale**
> TokenCreateResponse post_token_crowdsale(payload)

Transfer tokens to a token's crowdsale address.

### Example
```ruby
# load the gem
require 'molecule_api'

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::TokenCrowdsalePayload.new # TokenCrowdsalePayload | 


begin
  #Transfer tokens to a token's crowdsale address.
  result = api_instance.post_token_crowdsale(payload)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_token_crowdsale: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenCrowdsalePayload**](TokenCrowdsalePayload.md)|  | 

### Return type

[**TokenCreateResponse**](TokenCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_token_deploy**
> TokenCreateResponse post_token_deploy(payload)

Deploy a secuirty token contract and its crowdsale contract to blockchain.

### Example
```ruby
# load the gem
require 'molecule_api'

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::TokenDeployPayload.new # TokenDeployPayload | 


begin
  #Deploy a secuirty token contract and its crowdsale contract to blockchain.
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

[**TokenCreateResponse**](TokenCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_token_purchase**
> post_token_purchase(payload)

Participate in a token's crowdsale and purchase tokens.

### Example
```ruby
# load the gem
require 'molecule_api'

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::TokenPurchasePayload.new # TokenPurchasePayload | 


begin
  #Participate in a token's crowdsale and purchase tokens.
  api_instance.post_token_purchase(payload)
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_token_purchase: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenPurchasePayload**](TokenPurchasePayload.md)|  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **post_token_whitelist**
> post_token_whitelist(payload)

Add an investor to a token's whitelist

### Example
```ruby
# load the gem
require 'molecule_api'

api_instance = MoleculeApi::MoleculeApi.new

payload = MoleculeApi::TokenWhitelistPayload.new # TokenWhitelistPayload | 


begin
  #Add an investor to a token's whitelist
  api_instance.post_token_whitelist(payload)
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->post_token_whitelist: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenWhitelistPayload**](TokenWhitelistPayload.md)|  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

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

No authorization required

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

No authorization required

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

No authorization required

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



