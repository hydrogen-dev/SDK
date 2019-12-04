# MoleculeApi

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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID tokenId = new UUID(); // UUID | UUID of a token
try {
    apiInstance.deleteToken(tokenId);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#deleteToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**UUID**](.md)| UUID of a token |

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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID webhookId = new UUID(); // UUID | UUID of a webhook
try {
    apiInstance.deleteWebhook(webhookId);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#deleteWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**UUID**](.md)| UUID of a webhook |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencies"></a>
# **getCurrencies**
> CurrencyGetResponse getCurrencies(page, size, orderBy, ascending, getLatest, symbol)

Get information for all currencies defined for your firm

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
String symbol = "symbol_example"; // String | 
try {
    CurrencyGetResponse result = apiInstance.getCurrencies(page, size, orderBy, ascending, getLatest, symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getCurrencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID currencyId = new UUID(); // UUID | UUID of a currency
try {
    CurrencySpecificResponse result = apiInstance.getCurrency(currencyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getCurrency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | [**UUID**](.md)| UUID of a currency |

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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID currencyBalanceId = new UUID(); // UUID | UUID of a currency balance
try {
    CurrencyBalanceSpecificResponse result = apiInstance.getCurrencyBalance(currencyBalanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getCurrencyBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyBalanceId** | [**UUID**](.md)| UUID of a currency balance |

### Return type

[**CurrencyBalanceSpecificResponse**](CurrencyBalanceSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencyBalances"></a>
# **getCurrencyBalances**
> CurrencyBalanceGetResponse getCurrencyBalances(page, size, orderBy, ascending, getLatest, currencyId, walletId)

Get information for all currency balances recorded in your application.

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
String currencyId = "currencyId_example"; // String | Filters results by their currency ids
String walletId = "walletId_example"; // String | Filters results by their wallet ids
try {
    CurrencyBalanceGetResponse result = apiInstance.getCurrencyBalances(page, size, orderBy, ascending, getLatest, currencyId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getCurrencyBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID currencyTransferId = new UUID(); // UUID | UUID of a currency transfer
try {
    CurrencyTransferSpecificResponse result = apiInstance.getCurrencyTransfer(currencyTransferId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getCurrencyTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyTransferId** | [**UUID**](.md)| UUID of a currency transfer |

### Return type

[**CurrencyTransferSpecificResponse**](CurrencyTransferSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrencyTransfers"></a>
# **getCurrencyTransfers**
> CurrencyTransferGetResponse getCurrencyTransfers(page, size, orderBy, ascending, getLatest, currencyId, walletId, senderWalletId, receiverWalletId)

Get information for all currency transfers

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
String currencyId = "currencyId_example"; // String | Filters results by their currency ids
String walletId = "walletId_example"; // String | Filters results by their wallet ids
String senderWalletId = "senderWalletId_example"; // String | Filters results by their sender wallet ids
String receiverWalletId = "receiverWalletId_example"; // String | Filters results by their receiver wallet ids
try {
    CurrencyTransferGetResponse result = apiInstance.getCurrencyTransfers(page, size, orderBy, ascending, getLatest, currencyId, walletId, senderWalletId, receiverWalletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getCurrencyTransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID tokenId = new UUID(); // UUID | UUID of a token
try {
    TokenSpecificResponse result = apiInstance.getToken(tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**UUID**](.md)| UUID of a token |

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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID tokenBalanceId = new UUID(); // UUID | UUID of a token balance
try {
    TokenBalanceSpecificResponse result = apiInstance.getTokenBalance(tokenBalanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getTokenBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenBalanceId** | [**UUID**](.md)| UUID of a token balance |

### Return type

[**TokenBalanceSpecificResponse**](TokenBalanceSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenBalances"></a>
# **getTokenBalances**
> TokenBalanceGetResponse getTokenBalances(page, size, orderBy, ascending, getLatest, tokenId, walletId)

Get information for all token balances defined for your application.

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
String tokenId = "tokenId_example"; // String | Filters results by their token ids
String walletId = "walletId_example"; // String | Filters results by their wallet ids
try {
    TokenBalanceGetResponse result = apiInstance.getTokenBalances(page, size, orderBy, ascending, getLatest, tokenId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getTokenBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
> TokenSupplyGetResponse getTokenSupplies(page, size, orderBy, ascending, getLatest, tokenId)

Get information for all token supplies defined for your application.

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
String tokenId = "tokenId_example"; // String | Filters results by their token ids
try {
    TokenSupplyGetResponse result = apiInstance.getTokenSupplies(page, size, orderBy, ascending, getLatest, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getTokenSupplies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID tokenSupplyId = new UUID(); // UUID | UUID of a token supply
try {
    TokenSupplySpecificResponse result = apiInstance.getTokenSupply(tokenSupplyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getTokenSupply");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenSupplyId** | [**UUID**](.md)| UUID of a token supply |

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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID tokenTransferId = new UUID(); // UUID | UUID of a token transfer
try {
    TokenTransferSpecificResponse result = apiInstance.getTokenTransfer(tokenTransferId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getTokenTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenTransferId** | [**UUID**](.md)| UUID of a token transfer |

### Return type

[**TokenTransferSpecificResponse**](TokenTransferSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenTransfers"></a>
# **getTokenTransfers**
> TokenTransferGetResponse getTokenTransfers(page, size, orderBy, ascending, getLatest, tokenId, walletId, senderWalletId, receiverWalletId)

Get information for all token transfers

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
String tokenId = "tokenId_example"; // String | Filters results by their token ids
String walletId = "walletId_example"; // String | Filters results by their wallet ids
String senderWalletId = "senderWalletId_example"; // String | Filters results by their sender wallet ids
String receiverWalletId = "receiverWalletId_example"; // String | Filters results by their receiver wallet ids
try {
    TokenTransferGetResponse result = apiInstance.getTokenTransfers(page, size, orderBy, ascending, getLatest, tokenId, walletId, senderWalletId, receiverWalletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getTokenTransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
> TokenGetResponse getTokens(page, size, orderBy, ascending, getLatest)

Get information for all tokens defined for your firm

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
try {
    TokenGetResponse result = apiInstance.getTokens(page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID transactionStatusId = new UUID(); // UUID | UUID of a transaction status
try {
    TransactionStatusSpecificResponse result = apiInstance.getTransactionStatus(transactionStatusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getTransactionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionStatusId** | [**UUID**](.md)| UUID of a transaction status |

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionStatuses"></a>
# **getTransactionStatuses**
> TransactionStatusGetResponse getTransactionStatuses(page, size, orderBy, ascending, getLatest)

Get status information for all transactions

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
try {
    TransactionStatusGetResponse result = apiInstance.getTransactionStatuses(page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getTransactionStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
> WalletSpecificResponse getWallet(walletId)

Retrieve a wallet

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID walletId = new UUID(); // UUID | UUID of a wallet
try {
    WalletSpecificResponse result = apiInstance.getWallet(walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**UUID**](.md)| UUID of a wallet |

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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID walletKeyId = new UUID(); // UUID | UUID of a wallet key
try {
    WalletKeySpecificResponse result = apiInstance.getWalletKey(walletKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getWalletKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletKeyId** | [**UUID**](.md)| UUID of a wallet key |

### Return type

[**WalletKeySpecificResponse**](WalletKeySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWalletKeys"></a>
# **getWalletKeys**
> WalletKeyGetResponse getWalletKeys(page, size, orderBy, ascending, getLatest)

Get all wallet keys associated with wallets defined for your firm.

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
try {
    WalletKeyGetResponse result = apiInstance.getWalletKeys(page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getWalletKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
> WalletGetResponse getWallets(page, size, orderBy, ascending, getLatest, nucleusClientId, isPrimary)

Get information for all wallets defined for your firm

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
String nucleusClientId = "nucleusClientId_example"; // String | 
Boolean isPrimary = true; // Boolean | 
try {
    WalletGetResponse result = apiInstance.getWallets(page, size, orderBy, ascending, getLatest, nucleusClientId, isPrimary);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getWallets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID webhookId = new UUID(); // UUID | UUID of a webhook
try {
    WebhookSpecificResponse result = apiInstance.getWebhook(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**UUID**](.md)| UUID of a webhook |

### Return type

[**WebhookSpecificResponse**](WebhookSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> WebhookGetResponse getWebhooks(page, size, orderBy, ascending, getLatest)

Get information for all webhooks defined for your firm

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
Integer page = 0; // Integer | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
Integer size = 25; // Integer | The number or records to be included per page. The default is 25. There is no max value.
String orderBy = "update_date"; // String | The field in the response body to order the list by. Default is update_date.
Boolean ascending = false; // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
Boolean getLatest = true; // Boolean | Retrieves the latest entry
try {
    WebhookGetResponse result = apiInstance.getWebhooks(page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#getWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Integer**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
CrowdsaleDeployPayload payload = new CrowdsaleDeployPayload(); // CrowdsaleDeployPayload | 
try {
    TransactionStatusSpecificResponse result = apiInstance.postCrowdsaleDeploy(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postCrowdsaleDeploy");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
CrowdsaleFundPayload payload = new CrowdsaleFundPayload(); // CrowdsaleFundPayload | 
try {
    TransactionStatusSpecificResponse result = apiInstance.postCrowdsaleFund(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postCrowdsaleFund");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
CrowdsalePurchasePayload payload = new CrowdsalePurchasePayload(); // CrowdsalePurchasePayload | 
try {
    TransactionStatusSpecificResponse result = apiInstance.postCrowdsalePurchase(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postCrowdsalePurchase");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
CurrencyTransferPayload payload = new CurrencyTransferPayload(); // CurrencyTransferPayload | 
try {
    TransactionStatusSpecificResponse result = apiInstance.postCurrencyTransfer(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postCurrencyTransfer");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
TokenCreatePayload payload = new TokenCreatePayload(); // TokenCreatePayload | 
try {
    TokenCreateResponse result = apiInstance.postToken(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postToken");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
TokenDeployPayload payload = new TokenDeployPayload(); // TokenDeployPayload | 
try {
    TransactionStatusSpecificResponse result = apiInstance.postTokenDeploy(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postTokenDeploy");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
TokenTransferPayload payload = new TokenTransferPayload(); // TokenTransferPayload | 
try {
    TransactionStatusSpecificResponse result = apiInstance.postTokenTransfer(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postTokenTransfer");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
TokenWhitelistPayload payload = new TokenWhitelistPayload(); // TokenWhitelistPayload | 
try {
    TransactionStatusSpecificResponse result = apiInstance.postTokenWhitelist(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postTokenWhitelist");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
WalletCreatePayload payload = new WalletCreatePayload(); // WalletCreatePayload | 
try {
    WalletCreateResponse result = apiInstance.postWallet(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postWallet");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
WalletKeyCreatePayload payload = new WalletKeyCreatePayload(); // WalletKeyCreatePayload | 
try {
    WalletKeyCreateResponse result = apiInstance.postWalletKey(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postWalletKey");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
WalletKeyGeneratorPayload payload = new WalletKeyGeneratorPayload(); // WalletKeyGeneratorPayload | 
try {
    WalletKeyCreateResponse result = apiInstance.postWalletKeyGenerator(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postWalletKeyGenerator");
    e.printStackTrace();
}
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
WebhookCreatePayload payload = new WebhookCreatePayload(); // WebhookCreatePayload | 
try {
    WebhookCreateResponse result = apiInstance.postWebhook(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postWebhook");
    e.printStackTrace();
}
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
> TokenSpecificResponse updateToken(tokenId, payload)

Update a token

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID tokenId = new UUID(); // UUID | UUID of a token
TokenUpdatePayload payload = new TokenUpdatePayload(); // TokenUpdatePayload | 
try {
    TokenSpecificResponse result = apiInstance.updateToken(tokenId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#updateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**UUID**](.md)| UUID of a token |
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
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID walletId = new UUID(); // UUID | UUID of a wallet
WalletUpdatePayload payload = new WalletUpdatePayload(); // WalletUpdatePayload | 
try {
    WalletSpecificResponse result = apiInstance.updateWallet(walletId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#updateWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**UUID**](.md)| UUID of a wallet |
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
> WebhookSpecificResponse updateWebhook(webhookId, payload)

Update a webhook

### Example
```java
// Import classes:
//import molecule_api.ApiClient;
//import molecule_api.ApiException;
//import molecule_api.Configuration;
//import molecule_api.auth.*;
//import io.swagger.client.api.MoleculeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Set the environment (optional, defaults to sandbox)
// This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
defaultClient.setEnvironment("sandbox");


// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("MYACCESSTOKEN");

MoleculeApi apiInstance = new MoleculeApi();
UUID webhookId = new UUID(); // UUID | UUID of a webhook
WebhookUpdatePayload payload = new WebhookUpdatePayload(); // WebhookUpdatePayload | 
try {
    WebhookSpecificResponse result = apiInstance.updateWebhook(webhookId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#updateWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**UUID**](.md)| UUID of a webhook |
 **payload** | [**WebhookUpdatePayload**](WebhookUpdatePayload.md)|  |

### Return type

[**WebhookSpecificResponse**](WebhookSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

