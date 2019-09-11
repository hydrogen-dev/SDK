# molecule_api.MoleculeApi

All URIs are relative to *https://api.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteToken**](MoleculeApi.md#deleteToken) | **DELETE** /molecule/v1/token/{token_id}/ | Delete a token
[**getCurrencyBalance**](MoleculeApi.md#getCurrencyBalance) | **GET** /molecule/v1/currency_balance/{currency_balance_id} | Retrieve a currency balance
[**getCurrencyBalances**](MoleculeApi.md#getCurrencyBalances) | **GET** /molecule/v1/currency_balance | Get information for all currency balances defined for your application.
[**getToken**](MoleculeApi.md#getToken) | **GET** /molecule/v1/token/{token_id}/ | Retrieve a token
[**getTokenBalance**](MoleculeApi.md#getTokenBalance) | **GET** /molecule/v1/token_balance/{token_balance_id} | Retrieve a token balance
[**getTokenBalances**](MoleculeApi.md#getTokenBalances) | **GET** /molecule/v1/token_balance | Get information for all token balances defined for your application.
[**getTokenRestriction**](MoleculeApi.md#getTokenRestriction) | **GET** /molecule/v1/token_restriction/{token_restriction_id}/ | Retrieve a token restriction
[**getTokenRestrictions**](MoleculeApi.md#getTokenRestrictions) | **GET** /molecule/v1/token_restriction | Get information for all token restrictions defined for your firm
[**getTokenSupplies**](MoleculeApi.md#getTokenSupplies) | **GET** /molecule/v1/token_supply | Get information for all token supplies defined for your application.
[**getTokenSupply**](MoleculeApi.md#getTokenSupply) | **GET** /molecule/v1/token_supply/{token_supply_id} | Retrieve a token supply
[**getTokens**](MoleculeApi.md#getTokens) | **GET** /molecule/v1/token | Get information for all tokens defined for your firm
[**getWallet**](MoleculeApi.md#getWallet) | **GET** /molecule/v1/wallet/{wallet_id}/ | Retrieve a wallet
[**getWalletKey**](MoleculeApi.md#getWalletKey) | **GET** /molecule/v1/wallet_key/{wallet_key_id}/ | Retrieve a wallet key
[**getWalletKeys**](MoleculeApi.md#getWalletKeys) | **GET** /molecule/v1/wallet_key | Get all wallet keys associated with wallets defined for your firm.
[**getWallets**](MoleculeApi.md#getWallets) | **GET** /molecule/v1/wallet | Get information for all wallets defined for your firm
[**postToken**](MoleculeApi.md#postToken) | **POST** /molecule/v1/token | Create a token under your firm.
[**postTokenCrowdsale**](MoleculeApi.md#postTokenCrowdsale) | **POST** /molecule/v1/token/crowdsale | Transfer tokens to a token&#39;s crowdsale address.
[**postTokenDeploy**](MoleculeApi.md#postTokenDeploy) | **POST** /molecule/v1/token/deploy | Deploy a secuirty token contract and its crowdsale contract to blockchain.
[**postTokenPurchase**](MoleculeApi.md#postTokenPurchase) | **POST** /molecule/v1/token/purchase | Participate in a token&#39;s crowdsale and purchase tokens.
[**postTokenRestriction**](MoleculeApi.md#postTokenRestriction) | **POST** /molecule/v1/token_restriction | Create a token restriction under your firm.
[**postTokenWhitelist**](MoleculeApi.md#postTokenWhitelist) | **POST** /molecule/v1/token/whitelist | Add an investor to a token&#39;s whitelist
[**postWallet**](MoleculeApi.md#postWallet) | **POST** /molecule/v1/wallet | Create a wallet under your firm.
[**postWalletKey**](MoleculeApi.md#postWalletKey) | **POST** /molecule/v1/wallet_key | Associate an existing key pair with a wallet defined for your firm.
[**postWalletKeyGenerator**](MoleculeApi.md#postWalletKeyGenerator) | **POST** /molecule/v1/wallet_key/generator | Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
[**updateToken**](MoleculeApi.md#updateToken) | **PUT** /molecule/v1/token/{token_id}/ | Update a token
[**updateTokenRestriction**](MoleculeApi.md#updateTokenRestriction) | **PUT** /molecule/v1/token_restriction/{token_restriction_id}/ | Update a token restriction
[**updateWallet**](MoleculeApi.md#updateWallet) | **PUT** /molecule/v1/wallet/{wallet_id}/ | Update a wallet


<a name="deleteToken"></a>
# **deleteToken**
> deleteToken(tokenId)

Delete a token

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');

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

No authorization required

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

Get information for all currency balances defined for your application.

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
  'ascending': false // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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

### Return type

[**CurrencyBalanceGetResponse**](CurrencyBalanceGetResponse.md)

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
  'ascending': false // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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

### Return type

[**TokenBalanceGetResponse**](TokenBalanceGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenRestriction"></a>
# **getTokenRestriction**
> TokenRestrictionSpecificResponse getTokenRestriction(tokenRestrictionId, )

Retrieve a token restriction

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

var tokenRestrictionId = "tokenRestrictionId_example"; // String | UUID of a token restriction


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTokenRestriction(tokenRestrictionId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenRestrictionId** | [**String**](.md)| UUID of a token restriction | 

### Return type

[**TokenRestrictionSpecificResponse**](TokenRestrictionSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenRestrictions"></a>
# **getTokenRestrictions**
> TokenRestrictionGetResponse getTokenRestrictions(opts)

Get information for all token restrictions defined for your firm

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
  'ascending': false // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTokenRestrictions(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]

### Return type

[**TokenRestrictionGetResponse**](TokenRestrictionGetResponse.md)

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
  'ascending': false // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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
  'ascending': false // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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

### Return type

[**TokenGetResponse**](TokenGetResponse.md)

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
  'ascending': false // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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
  'ascending': false // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
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

### Return type

[**WalletGetResponse**](WalletGetResponse.md)

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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTokenCrowdsale"></a>
# **postTokenCrowdsale**
> TokenCreateResponse postTokenCrowdsale(payload)

Transfer tokens to a token&#39;s crowdsale address.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.TokenCrowdsalePayload(); // TokenCrowdsalePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postTokenCrowdsale(payload, callback);
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

<a name="postTokenDeploy"></a>
# **postTokenDeploy**
> TokenCreateResponse postTokenDeploy(payload)

Deploy a secuirty token contract and its crowdsale contract to blockchain.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');

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

[**TokenCreateResponse**](TokenCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTokenPurchase"></a>
# **postTokenPurchase**
> postTokenPurchase(payload)

Participate in a token&#39;s crowdsale and purchase tokens.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.TokenPurchasePayload(); // TokenPurchasePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postTokenPurchase(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenPurchasePayload**](TokenPurchasePayload.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTokenRestriction"></a>
# **postTokenRestriction**
> TokenRestrictionCreateResponse postTokenRestriction(payload)

Create a token restriction under your firm.

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.TokenRestrictionCreatePayload(); // TokenRestrictionCreatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postTokenRestriction(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenRestrictionCreatePayload**](TokenRestrictionCreatePayload.md)|  | 

### Return type

[**TokenRestrictionCreateResponse**](TokenRestrictionCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTokenWhitelist"></a>
# **postTokenWhitelist**
> postTokenWhitelist(payload)

Add an investor to a token&#39;s whitelist

### Example
```javascript
var molecule_api = require('hydrogen-molecule-api');

var apiInstance = new molecule_api.MoleculeApi();

var payload = new molecule_api.TokenWhitelistPayload(); // TokenWhitelistPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postTokenWhitelist(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenWhitelistPayload**](TokenWhitelistPayload.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

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

No authorization required

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

No authorization required

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

No authorization required

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

var payload = new molecule_api.TokenCreatePayload(); // TokenCreatePayload | 


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
 **payload** | [**TokenCreatePayload**](TokenCreatePayload.md)|  | 

### Return type

[**TokenSpecificResponse**](TokenSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTokenRestriction"></a>
# **updateTokenRestriction**
> TokenRestrictionSpecificResponse updateTokenRestriction(tokenRestrictionId, payload)

Update a token restriction

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

var tokenRestrictionId = "tokenRestrictionId_example"; // String | UUID of a token restriction

var payload = new molecule_api.TokenRestrictionCreatePayload(); // TokenRestrictionCreatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateTokenRestriction(tokenRestrictionId, payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenRestrictionId** | [**String**](.md)| UUID of a token restriction | 
 **payload** | [**TokenRestrictionCreatePayload**](TokenRestrictionCreatePayload.md)|  | 

### Return type

[**TokenRestrictionSpecificResponse**](TokenRestrictionSpecificResponse.md)

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

var payload = new molecule_api.WalletCreatePayload(); // WalletCreatePayload | 


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
 **payload** | [**WalletCreatePayload**](WalletCreatePayload.md)|  | 

### Return type

[**WalletSpecificResponse**](WalletSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

