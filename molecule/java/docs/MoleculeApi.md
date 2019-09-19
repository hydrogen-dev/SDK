# MoleculeApi

All URIs are relative to *https://api.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteToken**](MoleculeApi.md#deleteToken) | **DELETE** /molecule/v1/token/{token_id}/ | Delete a token
[**getCurrencyBalance**](MoleculeApi.md#getCurrencyBalance) | **GET** /molecule/v1/currency_balance/{currency_balance_id} | Retrieve a currency balance
[**getCurrencyBalances**](MoleculeApi.md#getCurrencyBalances) | **GET** /molecule/v1/currency_balance | Get information for all currency balances defined for your application.
[**getToken**](MoleculeApi.md#getToken) | **GET** /molecule/v1/token/{token_id}/ | Retrieve a token
[**getTokenBalance**](MoleculeApi.md#getTokenBalance) | **GET** /molecule/v1/token_balance/{token_balance_id} | Retrieve a token balance
[**getTokenBalances**](MoleculeApi.md#getTokenBalances) | **GET** /molecule/v1/token_balance | Get information for all token balances defined for your application.
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
[**postTokenWhitelist**](MoleculeApi.md#postTokenWhitelist) | **POST** /molecule/v1/token/whitelist | Add an investor to a token&#39;s whitelist
[**postWallet**](MoleculeApi.md#postWallet) | **POST** /molecule/v1/wallet | Create a wallet under your firm.
[**postWalletKey**](MoleculeApi.md#postWalletKey) | **POST** /molecule/v1/wallet_key | Associate an existing key pair with a wallet defined for your firm.
[**postWalletKeyGenerator**](MoleculeApi.md#postWalletKeyGenerator) | **POST** /molecule/v1/wallet_key/generator | Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
[**updateToken**](MoleculeApi.md#updateToken) | **PUT** /molecule/v1/token/{token_id}/ | Update a token
[**updateWallet**](MoleculeApi.md#updateWallet) | **PUT** /molecule/v1/wallet/{wallet_id}/ | Update a wallet


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
> CurrencyBalanceGetResponse getCurrencyBalances(page, size, orderBy, ascending)

Get information for all currency balances defined for your application.

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
try {
    CurrencyBalanceGetResponse result = apiInstance.getCurrencyBalances(page, size, orderBy, ascending);
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
> TokenBalanceGetResponse getTokenBalances(page, size, orderBy, ascending)

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
try {
    TokenBalanceGetResponse result = apiInstance.getTokenBalances(page, size, orderBy, ascending);
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

### Return type

[**TokenBalanceGetResponse**](TokenBalanceGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTokenSupplies"></a>
# **getTokenSupplies**
> TokenSupplyGetResponse getTokenSupplies(page, size, orderBy, ascending)

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
try {
    TokenSupplyGetResponse result = apiInstance.getTokenSupplies(page, size, orderBy, ascending);
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

<a name="getTokens"></a>
# **getTokens**
> TokenGetResponse getTokens(page, size, orderBy, ascending)

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
try {
    TokenGetResponse result = apiInstance.getTokens(page, size, orderBy, ascending);
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

### Return type

[**TokenGetResponse**](TokenGetResponse.md)

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
> WalletKeyGetResponse getWalletKeys(page, size, orderBy, ascending)

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
try {
    WalletKeyGetResponse result = apiInstance.getWalletKeys(page, size, orderBy, ascending);
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

### Return type

[**WalletKeyGetResponse**](WalletKeyGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWallets"></a>
# **getWallets**
> WalletGetResponse getWallets(page, size, orderBy, ascending)

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
try {
    WalletGetResponse result = apiInstance.getWallets(page, size, orderBy, ascending);
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

<a name="postTokenCrowdsale"></a>
# **postTokenCrowdsale**
> TokenCreateResponse postTokenCrowdsale(payload)

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
TokenCrowdsalePayload payload = new TokenCrowdsalePayload(); // TokenCrowdsalePayload | 
try {
    TokenCreateResponse result = apiInstance.postTokenCrowdsale(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postTokenCrowdsale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenCrowdsalePayload**](TokenCrowdsalePayload.md)|  |

### Return type

[**TokenCreateResponse**](TokenCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTokenDeploy"></a>
# **postTokenDeploy**
> TokenCreateResponse postTokenDeploy(payload)

Deploy a secuirty token contract and its crowdsale contract to blockchain.

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
    TokenCreateResponse result = apiInstance.postTokenDeploy(payload);
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

[**TokenCreateResponse**](TokenCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTokenPurchase"></a>
# **postTokenPurchase**
> postTokenPurchase(payload)

Participate in a token&#39;s crowdsale and purchase tokens.

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
TokenPurchasePayload payload = new TokenPurchasePayload(); // TokenPurchasePayload | 
try {
    apiInstance.postTokenPurchase(payload);
} catch (ApiException e) {
    System.err.println("Exception when calling MoleculeApi#postTokenPurchase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenPurchasePayload**](TokenPurchasePayload.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTokenWhitelist"></a>
# **postTokenWhitelist**
> postTokenWhitelist(payload)

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
    apiInstance.postTokenWhitelist(payload);
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

null (empty response body)

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

