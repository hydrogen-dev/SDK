# molecule_api.MoleculeApi

All URIs are relative to *https://api.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteToken**](MoleculeApi.md#deleteToken) | **DELETE** /molecule/v1/token/{token_id}/ | Delete a token
[**deleteWebhook**](MoleculeApi.md#deleteWebhook) | **DELETE** /molecule/v1/webhook/{webhook_id}/ | Delete a webhook
[**getCurrencies**](MoleculeApi.md#getCurrencies) | **GET** /molecule/v1/currency | Get information for all currencies defined for your firm
[**getCurrency**](MoleculeApi.md#getCurrency) | **GET** /molecule/v1/currency/{currency_id}/ | Retrieve a currency
[**getCurrencyBalance**](MoleculeApi.md#getCurrencyBalance) | **GET** /molecule/v1/currency_balance/{currency_balance_id} | Retrieve a currency balance
[**getCurrencyBalances**](MoleculeApi.md#getCurrencyBalances) | **GET** /molecule/v1/currency_balance | Get information for all currency balances recorded in your application.
[**getCurrencyTransfer**](MoleculeApi.md#getCurrencyTransfer) | **GET** /molecule/v1/currency_transfer/{currency_transfer_id} | Retrieve a currency transfer
[**getCurrencyTransfers**](MoleculeApi.md#getCurrencyTransfers) | **GET** /molecule/v1/currency_transfer | Get information for all currency transfers
[**getToken**](MoleculeApi.md#getToken) | **GET** /molecule/v1/token/{token_id}/ | Retrieve a token
[**getTokenBalance**](MoleculeApi.md#getTokenBalance) | **GET** /molecule/v1/token_balance/{token_balance_id} | Retrieve a token balance
[**getTokenBalances**](MoleculeApi.md#getTokenBalances) | **GET** /molecule/v1/token_balance | Get information for all token balances defined for your application.
[**getTokenSupplies**](MoleculeApi.md#getTokenSupplies) | **GET** /molecule/v1/token_supply | Get information for all token supplies defined for your application.
[**getTokenSupply**](MoleculeApi.md#getTokenSupply) | **GET** /molecule/v1/token_supply/{token_supply_id} | Retrieve a token supply
[**getTokenTransfer**](MoleculeApi.md#getTokenTransfer) | **GET** /molecule/v1/token_transfer/{token_transfer_id} | Retrieve a token transfer
[**getTokenTransfers**](MoleculeApi.md#getTokenTransfers) | **GET** /molecule/v1/token_transfer | Get information for all token transfers
[**getTokens**](MoleculeApi.md#getTokens) | **GET** /molecule/v1/token | Get information for all tokens defined for your firm
[**getTransactionStatus**](MoleculeApi.md#getTransactionStatus) | **GET** /molecule/v1/transaction_status/{transaction_status_id} | Retrieve status information for a specific transaction
[**getTransactionStatuses**](MoleculeApi.md#getTransactionStatuses) | **GET** /molecule/v1/transaction_status | Get status information for all transactions
[**getWallet**](MoleculeApi.md#getWallet) | **GET** /molecule/v1/wallet/{wallet_id}/ | Retrieve a wallet
[**getWalletKey**](MoleculeApi.md#getWalletKey) | **GET** /molecule/v1/wallet_key/{wallet_key_id}/ | Retrieve a wallet key
[**getWalletKeys**](MoleculeApi.md#getWalletKeys) | **GET** /molecule/v1/wallet_key | Get all wallet keys associated with wallets defined for your firm.
[**getWallets**](MoleculeApi.md#getWallets) | **GET** /molecule/v1/wallet | Get information for all wallets defined for your firm
[**getWebhook**](MoleculeApi.md#getWebhook) | **GET** /molecule/v1/webhook/{webhook_id}/ | Retrieve a webhook
[**getWebhooks**](MoleculeApi.md#getWebhooks) | **GET** /molecule/v1/webhook | Get information for all webhooks defined for your firm
[**postCrowdsaleDeploy**](MoleculeApi.md#postCrowdsaleDeploy) | **POST** /molecule/v1/crowdsale/deploy | Deploy a token&#39;s crowdsale contract.
[**postCrowdsaleFund**](MoleculeApi.md#postCrowdsaleFund) | **POST** /molecule/v1/crowdsale/fund | Transfer tokens to a token&#39;s crowdsale address.
[**postCrowdsalePurchase**](MoleculeApi.md#postCrowdsalePurchase) | **POST** /molecule/v1/crowdsale/purchase | Purchase tokens from a crowdsale contract
[**postCurrencyTransfer**](MoleculeApi.md#postCurrencyTransfer) | **POST** /molecule/v1/currency_transfer | Transfer currency between wallets
[**postToken**](MoleculeApi.md#postToken) | **POST** /molecule/v1/token | Create a token under your firm.
[**postTokenDeploy**](MoleculeApi.md#postTokenDeploy) | **POST** /molecule/v1/token/deploy | Deploy a security token contract to blockchain.
[**postTokenTransfer**](MoleculeApi.md#postTokenTransfer) | **POST** /molecule/v1/token_transfer | Transfer tokens between wallets
[**postTokenWhitelist**](MoleculeApi.md#postTokenWhitelist) | **POST** /molecule/v1/token/whitelist | Add an investor to a token&#39;s whitelist
[**postWallet**](MoleculeApi.md#postWallet) | **POST** /molecule/v1/wallet | Create a wallet under your firm.
[**postWalletKey**](MoleculeApi.md#postWalletKey) | **POST** /molecule/v1/wallet_key | Associate an existing key pair with a wallet defined for your firm.
[**postWalletKeyGenerator**](MoleculeApi.md#postWalletKeyGenerator) | **POST** /molecule/v1/wallet_key/generator | Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
[**postWebhook**](MoleculeApi.md#postWebhook) | **POST** /molecule/v1/webhook | Create a webhook under your firm.
[**updateToken**](MoleculeApi.md#updateToken) | **PUT** /molecule/v1/token/{token_id}/ | Update a token
[**updateWallet**](MoleculeApi.md#updateWallet) | **PUT** /molecule/v1/wallet/{wallet_id}/ | Update a wallet
[**updateWebhook**](MoleculeApi.md#updateWebhook) | **PUT** /molecule/v1/webhook/{webhook_id}/ | Update a webhook


<a name="deleteToken"></a>
# **deleteToken**
> deleteToken(tokenId)

Delete a token

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var tokenId = "tokenId_example"; // String | UUID of a token


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteToken(tokenId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**String**](.md)| UUID of a token | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(webhookId)

Delete a webhook

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var webhookId = "webhookId_example"; // String | UUID of a webhook


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteWebhook(webhookId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**String**](.md)| UUID of a webhook | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencies"></a>
# **getCurrencies**
> CurrencyGetResponse getCurrencies(opts)

Get information for all currencies defined for your firm

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
  'symbol': "symbol_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCurrencies(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 
 **symbol** | **String**|  | [optional] 

### Return type

[**CurrencyGetResponse**](CurrencyGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrency"></a>
# **getCurrency**
> CurrencySpecificResponse getCurrency(currencyId)

Retrieve a currency

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var currencyId = "currencyId_example"; // String | UUID of a currency


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCurrency(currencyId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | [**String**](.md)| UUID of a currency | 

### Return type

[**CurrencySpecificResponse**](CurrencySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencyBalance"></a>
# **getCurrencyBalance**
> CurrencyBalanceSpecificResponse getCurrencyBalance(currencyBalanceId)

Retrieve a currency balance

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var currencyBalanceId = "currencyBalanceId_example"; // String | UUID of a currency balance


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCurrencyBalance(currencyBalanceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyBalanceId** | [**String**](.md)| UUID of a currency balance | 

### Return type

[**CurrencyBalanceSpecificResponse**](CurrencyBalanceSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencyBalances"></a>
# **getCurrencyBalances**
> CurrencyBalanceGetResponse getCurrencyBalances(opts)

Get information for all currency balances recorded in your application.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
  'currencyId': "currencyId_example", // String | Filters results by their currency ids
  'walletId': "walletId_example", // String | Filters results by their wallet ids
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCurrencyBalances(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 
 **currencyId** | **String**| Filters results by their currency ids | [optional] 
 **walletId** | **String**| Filters results by their wallet ids | [optional] 

### Return type

[**CurrencyBalanceGetResponse**](CurrencyBalanceGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencyTransfer"></a>
# **getCurrencyTransfer**
> CurrencyTransferSpecificResponse getCurrencyTransfer(currencyTransferId)

Retrieve a currency transfer

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var currencyTransferId = "currencyTransferId_example"; // String | UUID of a currency transfer


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCurrencyTransfer(currencyTransferId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyTransferId** | [**String**](.md)| UUID of a currency transfer | 

### Return type

[**CurrencyTransferSpecificResponse**](CurrencyTransferSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencyTransfers"></a>
# **getCurrencyTransfers**
> CurrencyTransferGetResponse getCurrencyTransfers(opts)

Get information for all currency transfers

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
  'currencyId': "currencyId_example", // String | Filters results by their currency ids
  'walletId': "walletId_example", // String | Filters results by their wallet ids
  'senderWalletId': "senderWalletId_example", // String | Filters results by their sender wallet ids
  'receiverWalletId': "receiverWalletId_example" // String | Filters results by their receiver wallet ids
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCurrencyTransfers(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 
 **currencyId** | **String**| Filters results by their currency ids | [optional] 
 **walletId** | **String**| Filters results by their wallet ids | [optional] 
 **senderWalletId** | **String**| Filters results by their sender wallet ids | [optional] 
 **receiverWalletId** | **String**| Filters results by their receiver wallet ids | [optional] 

### Return type

[**CurrencyTransferGetResponse**](CurrencyTransferGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getToken"></a>
# **getToken**
> TokenSpecificResponse getToken(tokenId)

Retrieve a token

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var tokenId = "tokenId_example"; // String | UUID of a token


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getToken(tokenId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**String**](.md)| UUID of a token | 

### Return type

[**TokenSpecificResponse**](TokenSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenBalance"></a>
# **getTokenBalance**
> TokenBalanceSpecificResponse getTokenBalance(tokenBalanceId)

Retrieve a token balance

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var tokenBalanceId = "tokenBalanceId_example"; // String | UUID of a token balance


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTokenBalance(tokenBalanceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenBalanceId** | [**String**](.md)| UUID of a token balance | 

### Return type

[**TokenBalanceSpecificResponse**](TokenBalanceSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenBalances"></a>
# **getTokenBalances**
> TokenBalanceGetResponse getTokenBalances(opts)

Get information for all token balances defined for your application.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
  'tokenId': "tokenId_example", // String | Filters results by their token ids
  'walletId': "walletId_example", // String | Filters results by their wallet ids
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTokenBalances(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 
 **tokenId** | **String**| Filters results by their token ids | [optional] 
 **walletId** | **String**| Filters results by their wallet ids | [optional] 

### Return type

[**TokenBalanceGetResponse**](TokenBalanceGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenSupplies"></a>
# **getTokenSupplies**
> TokenSupplyGetResponse getTokenSupplies(opts)

Get information for all token supplies defined for your application.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
  'tokenId': "tokenId_example", // String | Filters results by their token ids
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTokenSupplies(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 
 **tokenId** | **String**| Filters results by their token ids | [optional] 

### Return type

[**TokenSupplyGetResponse**](TokenSupplyGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenSupply"></a>
# **getTokenSupply**
> TokenSupplySpecificResponse getTokenSupply(tokenSupplyId)

Retrieve a token supply

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var tokenSupplyId = "tokenSupplyId_example"; // String | UUID of a token supply


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTokenSupply(tokenSupplyId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenSupplyId** | [**String**](.md)| UUID of a token supply | 

### Return type

[**TokenSupplySpecificResponse**](TokenSupplySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenTransfer"></a>
# **getTokenTransfer**
> TokenTransferSpecificResponse getTokenTransfer(tokenTransferId)

Retrieve a token transfer

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var tokenTransferId = "tokenTransferId_example"; // String | UUID of a token transfer


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTokenTransfer(tokenTransferId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenTransferId** | [**String**](.md)| UUID of a token transfer | 

### Return type

[**TokenTransferSpecificResponse**](TokenTransferSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenTransfers"></a>
# **getTokenTransfers**
> TokenTransferGetResponse getTokenTransfers(opts)

Get information for all token transfers

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
  'tokenId': "tokenId_example", // String | Filters results by their token ids
  'walletId': "walletId_example", // String | Filters results by their wallet ids
  'senderWalletId': "senderWalletId_example", // String | Filters results by their sender wallet ids
  'receiverWalletId': "receiverWalletId_example" // String | Filters results by their receiver wallet ids
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTokenTransfers(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 
 **tokenId** | **String**| Filters results by their token ids | [optional] 
 **walletId** | **String**| Filters results by their wallet ids | [optional] 
 **senderWalletId** | **String**| Filters results by their sender wallet ids | [optional] 
 **receiverWalletId** | **String**| Filters results by their receiver wallet ids | [optional] 

### Return type

[**TokenTransferGetResponse**](TokenTransferGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokens"></a>
# **getTokens**
> TokenGetResponse getTokens(opts)

Get information for all tokens defined for your firm

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTokens(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 

### Return type

[**TokenGetResponse**](TokenGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionStatus"></a>
# **getTransactionStatus**
> TransactionStatusSpecificResponse getTransactionStatus(transactionStatusId)

Retrieve status information for a specific transaction

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var transactionStatusId = "transactionStatusId_example"; // String | UUID of a transaction status


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransactionStatus(transactionStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionStatusId** | [**String**](.md)| UUID of a transaction status | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionStatuses"></a>
# **getTransactionStatuses**
> TransactionStatusGetResponse getTransactionStatuses(opts)

Get status information for all transactions

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransactionStatuses(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 

### Return type

[**TransactionStatusGetResponse**](TransactionStatusGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWallet"></a>
# **getWallet**
> WalletSpecificResponse getWallet(walletId, )

Retrieve a wallet

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var walletId = "walletId_example"; // String | UUID of a wallet


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWallet(walletId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**String**](.md)| UUID of a wallet | 

### Return type

[**WalletSpecificResponse**](WalletSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWalletKey"></a>
# **getWalletKey**
> WalletKeySpecificResponse getWalletKey(walletKeyId)

Retrieve a wallet key

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var walletKeyId = "walletKeyId_example"; // String | UUID of a wallet key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWalletKey(walletKeyId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletKeyId** | [**String**](.md)| UUID of a wallet key | 

### Return type

[**WalletKeySpecificResponse**](WalletKeySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWalletKeys"></a>
# **getWalletKeys**
> WalletKeyGetResponse getWalletKeys(opts)

Get all wallet keys associated with wallets defined for your firm.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWalletKeys(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 

### Return type

[**WalletKeyGetResponse**](WalletKeyGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWallets"></a>
# **getWallets**
> WalletGetResponse getWallets(opts)

Get information for all wallets defined for your firm

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
  'nucleusClientId': "nucleusClientId_example", // String | 
  'isPrimary': true // Boolean | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWallets(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 
 **nucleusClientId** | **String**|  | [optional] 
 **isPrimary** | **Boolean**|  | [optional] 

### Return type

[**WalletGetResponse**](WalletGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebhook"></a>
# **getWebhook**
> WebhookSpecificResponse getWebhook(webhookId)

Retrieve a webhook

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var webhookId = "webhookId_example"; // String | UUID of a webhook


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWebhook(webhookId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**String**](.md)| UUID of a webhook | 

### Return type

[**WebhookSpecificResponse**](WebhookSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> WebhookGetResponse getWebhooks(opts)

Get information for all webhooks defined for your firm

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'getLatest': true, // Boolean | Retrieves the latest entry
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWebhooks(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **getLatest** | **Boolean**| Retrieves the latest entry | [optional] 

### Return type

[**WebhookGetResponse**](WebhookGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCrowdsaleDeploy"></a>
# **postCrowdsaleDeploy**
> TransactionStatusSpecificResponse postCrowdsaleDeploy(payload)

Deploy a token&#39;s crowdsale contract.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.CrowdsaleDeployPayload(); // CrowdsaleDeployPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postCrowdsaleDeploy(payload, callback);
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

<a name="postCrowdsaleFund"></a>
# **postCrowdsaleFund**
> TransactionStatusSpecificResponse postCrowdsaleFund(payload)

Transfer tokens to a token&#39;s crowdsale address.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.CrowdsaleFundPayload(); // CrowdsaleFundPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postCrowdsaleFund(payload, callback);
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

<a name="postCrowdsalePurchase"></a>
# **postCrowdsalePurchase**
> TransactionStatusSpecificResponse postCrowdsalePurchase(payload)

Purchase tokens from a crowdsale contract

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.CrowdsalePurchasePayload(); // CrowdsalePurchasePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postCrowdsalePurchase(payload, callback);
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

<a name="postCurrencyTransfer"></a>
# **postCurrencyTransfer**
> TransactionStatusSpecificResponse postCurrencyTransfer(payload)

Transfer currency between wallets

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.CurrencyTransferPayload(); // CurrencyTransferPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postCurrencyTransfer(payload, callback);
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

<a name="postToken"></a>
# **postToken**
> TokenCreateResponse postToken(payload)

Create a token under your firm.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.TokenCreatePayload(); // TokenCreatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postToken(payload, callback);
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

<a name="postTokenDeploy"></a>
# **postTokenDeploy**
> TransactionStatusSpecificResponse postTokenDeploy(payload)

Deploy a security token contract to blockchain.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.TokenDeployPayload(); // TokenDeployPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postTokenDeploy(payload, callback);
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

<a name="postTokenTransfer"></a>
# **postTokenTransfer**
> TransactionStatusSpecificResponse postTokenTransfer(payload)

Transfer tokens between wallets

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.TokenTransferPayload(); // TokenTransferPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postTokenTransfer(payload, callback);
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

<a name="postTokenWhitelist"></a>
# **postTokenWhitelist**
> TransactionStatusSpecificResponse postTokenWhitelist(payload)

Add an investor to a token&#39;s whitelist

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.TokenWhitelistPayload(); // TokenWhitelistPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postTokenWhitelist(payload, callback);
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

<a name="postWallet"></a>
# **postWallet**
> WalletCreateResponse postWallet(payload)

Create a wallet under your firm.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.WalletCreatePayload(); // WalletCreatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postWallet(payload, callback);
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

<a name="postWalletKey"></a>
# **postWalletKey**
> WalletKeyCreateResponse postWalletKey(payload)

Associate an existing key pair with a wallet defined for your firm.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.WalletKeyCreatePayload(); // WalletKeyCreatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postWalletKey(payload, callback);
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

<a name="postWalletKeyGenerator"></a>
# **postWalletKeyGenerator**
> WalletKeyCreateResponse postWalletKeyGenerator(payload)

Generate a wallet key using the Key Service and associate with a wallet defined for your firm.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.WalletKeyGeneratorPayload(); // WalletKeyGeneratorPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postWalletKeyGenerator(payload, callback);
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

<a name="postWebhook"></a>
# **postWebhook**
> WebhookCreateResponse postWebhook(payload)

Create a webhook under your firm.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.WebhookCreatePayload(); // WebhookCreatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postWebhook(payload, callback);
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

<a name="updateToken"></a>
# **updateToken**
> TokenSpecificResponse updateToken(tokenIdpayload)

Update a token

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var tokenId = "tokenId_example"; // String | UUID of a token

var payload = new molecule_api.TokenUpdatePayload(); // TokenUpdatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateToken(tokenIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**String**](.md)| UUID of a token | 
 **payload** | [**TokenUpdatePayload**](TokenUpdatePayload.md)|  | 

### Return type

[**TokenSpecificResponse**](TokenSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWallet"></a>
# **updateWallet**
> WalletSpecificResponse updateWallet(walletId, payload)

Update a wallet

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var walletId = "walletId_example"; // String | UUID of a wallet

var payload = new molecule_api.WalletUpdatePayload(); // WalletUpdatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateWallet(walletId, payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**String**](.md)| UUID of a wallet | 
 **payload** | [**WalletUpdatePayload**](WalletUpdatePayload.md)|  | 

### Return type

[**WalletSpecificResponse**](WalletSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWebhook"></a>
# **updateWebhook**
> WebhookSpecificResponse updateWebhook(webhookIdpayload)

Update a webhook

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');
var defaultClient = molecule_api.ApiClient.instance;

// (Optional) Set the Atom environment you wish to use (defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.basePath = "https://sandbox.hydrogenplatform.com";


// Configure OAuth2 access token for authorization: oauth
// Ensure the token is from the same environment as the defaultClient.basePath above
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "YOUR ACCESS TOKEN";

var apiInstance = new molecule_api.MoleculeApi();

var webhookId = "webhookId_example"; // String | UUID of a webhook

var payload = new molecule_api.WebhookUpdatePayload(); // WebhookUpdatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateWebhook(webhookIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**String**](.md)| UUID of a webhook | 
 **payload** | [**WebhookUpdatePayload**](WebhookUpdatePayload.md)|  | 

### Return type

[**WebhookSpecificResponse**](WebhookSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

