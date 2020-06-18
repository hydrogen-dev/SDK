# HydrogenNucleusApi.OrderApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountOrderBulkUsingPost**](OrderApi.md#createAccountOrderBulkUsingPost) | **POST** /account/{account_id}/order_bulk | Bulk orders for an account
[**createAccountOrderBuyOnlyUsingPost**](OrderApi.md#createAccountOrderBuyOnlyUsingPost) | **POST** /account/{account_id}/order_buy_only | Create buy-only account rebalance orders
[**createAccountOrderRebalanceUsingPost**](OrderApi.md#createAccountOrderRebalanceUsingPost) | **POST** /account/{account_id}/order_rebalance | Create account rebalance orders
[**createAccountOrderReconciliation**](OrderApi.md#createAccountOrderReconciliation) | **POST** /account/{account_id}/order_reconciliation | Create account reconciliation order
[**createAccountOrderSellAllUsingPost**](OrderApi.md#createAccountOrderSellAllUsingPost) | **POST** /account/{account_id}/order_sell_all | Sell all account order
[**createAccountOrderSellOnlyUsingPost**](OrderApi.md#createAccountOrderSellOnlyUsingPost) | **POST** /account/{account_id}/order_sell_only | Create sell-only account rebalance orders
[**createClientOrderBulkUsingPost**](OrderApi.md#createClientOrderBulkUsingPost) | **POST** /client/{client_id}/order_bulk | Bulk orders for a client
[**createOrderBulkUsingPost**](OrderApi.md#createOrderBulkUsingPost) | **POST** /order_bulk | Bulk orders for your firm
[**createOrderStatusUsingPost**](OrderApi.md#createOrderStatusUsingPost) | **POST** /order_status | Create an order status
[**createOrderTrackUsingPost**](OrderApi.md#createOrderTrackUsingPost) | **POST** /order_track | Create an order tracking record
[**createPortfolioOrderBuyOnlyUsingPost**](OrderApi.md#createPortfolioOrderBuyOnlyUsingPost) | **POST** /portfolio/{portfolio_id}/order_buy_only | Create buy-only portfolio rebalance orders
[**createPortfolioOrderRebalanceUsingPost**](OrderApi.md#createPortfolioOrderRebalanceUsingPost) | **POST** /portfolio/{portfolio_id}/order_rebalance | Create portfolio rebalance orders
[**createPortfolioOrderReconciliation**](OrderApi.md#createPortfolioOrderReconciliation) | **POST** /portfolio/{portfolio_id}/order_reconciliation | Create portfolio reconciliation order
[**createPortfolioOrderSellAllUsingPost**](OrderApi.md#createPortfolioOrderSellAllUsingPost) | **POST** /portfolio/{portfolio_id}/order_sell_all | Sell all portfolio order
[**createPortfolioOrderSellOnlyUsingPost**](OrderApi.md#createPortfolioOrderSellOnlyUsingPost) | **POST** /portfolio/{portfolio_id}/order_sell_only | Create sell-only portfolio rebalance orders
[**deleteOrderStatusUsingDelete**](OrderApi.md#deleteOrderStatusUsingDelete) | **DELETE** /order_status/{order_status_id} | Delete an order status
[**deleteOrderTrackUsingDelete**](OrderApi.md#deleteOrderTrackUsingDelete) | **DELETE** /order_track/{order_track_id} | Delete an order tracking record
[**deleteOrderUsingDelete**](OrderApi.md#deleteOrderUsingDelete) | **DELETE** /order/{order_id} | Delete an order record
[**getOrderAllUsingGet**](OrderApi.md#getOrderAllUsingGet) | **POST** /order | Create an order record
[**getOrderAllUsingGet1**](OrderApi.md#getOrderAllUsingGet1) | **GET** /order | List all order records
[**getOrderBulkAllUsingGet**](OrderApi.md#getOrderBulkAllUsingGet) | **GET** /order_bulk | List all bulk orders
[**getOrderStatusAllUsingGet**](OrderApi.md#getOrderStatusAllUsingGet) | **GET** /order_status | List all order statuses
[**getOrderStatusUsingGet**](OrderApi.md#getOrderStatusUsingGet) | **GET** /order_status/{order_status_id} | Retrieve an order status
[**getOrderTrackAllUsingGet**](OrderApi.md#getOrderTrackAllUsingGet) | **GET** /order_track | List all order tracking records
[**getOrderTrackUsingGet**](OrderApi.md#getOrderTrackUsingGet) | **GET** /order_track/{order_track_id} | Retrieve an order tracking record
[**getOrderUsingGet**](OrderApi.md#getOrderUsingGet) | **GET** /order/{order_id} | Retrieve an order record
[**updateOrderStatusUsingPut**](OrderApi.md#updateOrderStatusUsingPut) | **PUT** /order_status/{order_status_id} | Update an order status
[**updateOrderTrackUsingPut**](OrderApi.md#updateOrderTrackUsingPut) | **PUT** /order_track/{order_track_id} | Update an order tracking record
[**updateOrderUsingPut**](OrderApi.md#updateOrderUsingPut) | **PUT** /order/{order_id} | Update an order record


<a name="createAccountOrderBulkUsingPost"></a>
# **createAccountOrderBulkUsingPost**
> [Order] createAccountOrderBulkUsingPost(accountId, req)

Bulk orders for an account

Aggregates all orders on a given date for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var accountId = "accountId_example"; // String | account_id

var req = new HydrogenNucleusApi.TokenDateRequest(); // TokenDateRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAccountOrderBulkUsingPost(accountId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| account_id | 
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req | 

### Return type

[**[Order]**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountOrderBuyOnlyUsingPost"></a>
# **createAccountOrderBuyOnlyUsingPost**
> [OrderVoClone] createAccountOrderBuyOnlyUsingPost(accountId, req)

Create buy-only account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var accountId = "accountId_example"; // String | account_id

var req = new HydrogenNucleusApi.AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAccountOrderBuyOnlyUsingPost(accountId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountOrderRebalanceUsingPost"></a>
# **createAccountOrderRebalanceUsingPost**
> [OrderVoClone] createAccountOrderRebalanceUsingPost(accountId, req)

Create account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var accountId = "accountId_example"; // String | account_id

var req = new HydrogenNucleusApi.AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAccountOrderRebalanceUsingPost(accountId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountOrderReconciliation"></a>
# **createAccountOrderReconciliation**
> OrderReconcileReturnObject createAccountOrderReconciliation(accountId, req)

Create account reconciliation order

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var accountId = "accountId_example"; // String | account_id

var req = new HydrogenNucleusApi.OrderReconcileRequest(); // OrderReconcileRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAccountOrderReconciliation(accountId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| account_id | 
 **req** | [**OrderReconcileRequest**](OrderReconcileRequest.md)| req | 

### Return type

[**OrderReconcileReturnObject**](OrderReconcileReturnObject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountOrderSellAllUsingPost"></a>
# **createAccountOrderSellAllUsingPost**
> [OrderVoClone] createAccountOrderSellAllUsingPost(accountId, req)

Sell all account order

Create order records necessary to entirely sell all the holdings within an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var accountId = "accountId_example"; // String | account_id

var req = new HydrogenNucleusApi.AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAccountOrderSellAllUsingPost(accountId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountOrderSellOnlyUsingPost"></a>
# **createAccountOrderSellOnlyUsingPost**
> [OrderVoClone] createAccountOrderSellOnlyUsingPost(accountId, req)

Create sell-only account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var accountId = "accountId_example"; // String | account_id

var req = new HydrogenNucleusApi.AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAccountOrderSellOnlyUsingPost(accountId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createClientOrderBulkUsingPost"></a>
# **createClientOrderBulkUsingPost**
> [Order] createClientOrderBulkUsingPost(clientId, req)

Bulk orders for a client

Aggregates all orders on a given date for a client

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var clientId = "clientId_example"; // String | client_id

var req = new HydrogenNucleusApi.TokenDateRequest(); // TokenDateRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createClientOrderBulkUsingPost(clientId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| client_id | 
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req | 

### Return type

[**[Order]**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOrderBulkUsingPost"></a>
# **createOrderBulkUsingPost**
> [Order] createOrderBulkUsingPost(req)

Bulk orders for your firm

Aggregates all orders on a given date for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var req = new HydrogenNucleusApi.TokenDateRequest(); // TokenDateRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createOrderBulkUsingPost(req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req | 

### Return type

[**[Order]**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOrderStatusUsingPost"></a>
# **createOrderStatusUsingPost**
> OrderStatus createOrderStatusUsingPost(orderStatusRequest)

Create an order status

Create an order status for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderStatusRequest = new HydrogenNucleusApi.OrderStatus(); // OrderStatus | orderStatusRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createOrderStatusUsingPost(orderStatusRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatusRequest** | [**OrderStatus**](OrderStatus.md)| orderStatusRequest | 

### Return type

[**OrderStatus**](OrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOrderTrackUsingPost"></a>
# **createOrderTrackUsingPost**
> OrderTrack createOrderTrackUsingPost(orderTrackRequest)

Create an order tracking record

Create a new order tracking record for an order.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderTrackRequest = new HydrogenNucleusApi.OrderTrack(); // OrderTrack | orderTrackRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createOrderTrackUsingPost(orderTrackRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderTrackRequest** | [**OrderTrack**](OrderTrack.md)| orderTrackRequest | 

### Return type

[**OrderTrack**](OrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioOrderBuyOnlyUsingPost"></a>
# **createPortfolioOrderBuyOnlyUsingPost**
> [OrderVoClone] createPortfolioOrderBuyOnlyUsingPost(portfolioId, req)

Create buy-only portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes. However, these will only be buy transactions, and no securities will be sold.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var portfolioId = "portfolioId_example"; // String | portfolio_id

var req = new HydrogenNucleusApi.AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioOrderBuyOnlyUsingPost(portfolioId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioOrderRebalanceUsingPost"></a>
# **createPortfolioOrderRebalanceUsingPost**
> [OrderVoClone] createPortfolioOrderRebalanceUsingPost(portfolioId, req)

Create portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var portfolioId = "portfolioId_example"; // String | portfolio_id

var req = new HydrogenNucleusApi.AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioOrderRebalanceUsingPost(portfolioId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioOrderReconciliation"></a>
# **createPortfolioOrderReconciliation**
> OrderReconcileReturnObject createPortfolioOrderReconciliation(portfolioId, req)

Create portfolio reconciliation order

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var portfolioId = "portfolioId_example"; // String | portfolio_id

var req = new HydrogenNucleusApi.OrderReconcileRequest(); // OrderReconcileRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioOrderReconciliation(portfolioId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolio_id | 
 **req** | [**OrderReconcileRequest**](OrderReconcileRequest.md)| req | 

### Return type

[**OrderReconcileReturnObject**](OrderReconcileReturnObject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioOrderSellAllUsingPost"></a>
# **createPortfolioOrderSellAllUsingPost**
> [OrderVoClone] createPortfolioOrderSellAllUsingPost(portfolioId, req)

Sell all portfolio order

Create order records necessary to entirely sell all the holdings within a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var portfolioId = "portfolioId_example"; // String | portfolio_id

var req = new HydrogenNucleusApi.AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioOrderSellAllUsingPost(portfolioId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioOrderSellOnlyUsingPost"></a>
# **createPortfolioOrderSellOnlyUsingPost**
> [OrderVoClone] createPortfolioOrderSellOnlyUsingPost(portfolioId, req)

Create sell-only portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var portfolioId = "portfolioId_example"; // String | portfolio_id

var req = new HydrogenNucleusApi.AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioOrderSellOnlyUsingPost(portfolioId, req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteOrderStatusUsingDelete"></a>
# **deleteOrderStatusUsingDelete**
> deleteOrderStatusUsingDelete(orderStatusId)

Delete an order status

Permanently delete an order status defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderStatusId = "9b515c67-3791-400f-9da4-9dc69eb992ac"; // String | UUID order_status_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteOrderStatusUsingDelete(orderStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatusId** | **String**| UUID order_status_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteOrderTrackUsingDelete"></a>
# **deleteOrderTrackUsingDelete**
> deleteOrderTrackUsingDelete(orderTrackId)

Delete an order tracking record

Permanently delete an order tracking record for an order.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderTrackId = "ef93ce1c-b50e-4856-803a-db5332be93b0"; // String | UUID order_track_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteOrderTrackUsingDelete(orderTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderTrackId** | **String**| UUID order_track_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteOrderUsingDelete"></a>
# **deleteOrderUsingDelete**
> deleteOrderUsingDelete(orderId)

Delete an order record

Permanently delete an order record.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderId = "67190064-0731-4b29-b2a7-4a35eb8e7afe"; // String | UUID order_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteOrderUsingDelete(orderId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| UUID order_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderAllUsingGet"></a>
# **getOrderAllUsingGet**
> Order getOrderAllUsingGet(orderInfoRequest)

Create an order record

Create an order record defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderInfoRequest = new HydrogenNucleusApi.Order(); // Order | orderInfoRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderAllUsingGet(orderInfoRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderInfoRequest** | [**Order**](Order.md)| orderInfoRequest | 

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getOrderAllUsingGet1"></a>
# **getOrderAllUsingGet1**
> PageOrder getOrderAllUsingGet1(opts)

List all order records

Get the information for all order records defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderAllUsingGet1(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageOrder**](PageOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderBulkAllUsingGet"></a>
# **getOrderBulkAllUsingGet**
> PageOrderBulk getOrderBulkAllUsingGet(opts)

List all bulk orders

Get the information for all bulk order records.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderBulkAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageOrderBulk**](PageOrderBulk.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderStatusAllUsingGet"></a>
# **getOrderStatusAllUsingGet**
> PageOrderStatus getOrderStatusAllUsingGet(opts)

List all order statuses

Get the information for all order statuses defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderStatusAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageOrderStatus**](PageOrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderStatusUsingGet"></a>
# **getOrderStatusUsingGet**
> OrderStatus getOrderStatusUsingGet(orderStatusId)

Retrieve an order status

Retrieve the information for an order status defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderStatusId = "9b515c67-3791-400f-9da4-9dc69eb992ac"; // String | UUID order_status_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderStatusUsingGet(orderStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatusId** | **String**| UUID order_status_id | 

### Return type

[**OrderStatus**](OrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderTrackAllUsingGet"></a>
# **getOrderTrackAllUsingGet**
> PageOrderTrack getOrderTrackAllUsingGet(opts)

List all order tracking records

Get the information for all order tracking record for all order records.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderTrackAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageOrderTrack**](PageOrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderTrackUsingGet"></a>
# **getOrderTrackUsingGet**
> OrderTrack getOrderTrackUsingGet(orderTrackId)

Retrieve an order tracking record

Retrieve the information for an order tracking record for an order.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderTrackId = "ef93ce1c-b50e-4856-803a-db5332be93b0"; // String | UUID order_track_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderTrackUsingGet(orderTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderTrackId** | **String**| UUID order_track_id | 

### Return type

[**OrderTrack**](OrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderUsingGet"></a>
# **getOrderUsingGet**
> Order getOrderUsingGet(orderId)

Retrieve an order record

Retrieve the information for an order record.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderId = "67190064-0731-4b29-b2a7-4a35eb8e7afe"; // String | UUID order_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderUsingGet(orderId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| UUID order_id | 

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateOrderStatusUsingPut"></a>
# **updateOrderStatusUsingPut**
> OrderStatus updateOrderStatusUsingPut(orderStatus, orderStatusId)

Update an order status

Update the information for an order status defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderStatus = new HydrogenNucleusApi.OrderStatus(); // OrderStatus | order_status

var orderStatusId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID order_status_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateOrderStatusUsingPut(orderStatus, orderStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatus** | [**OrderStatus**](OrderStatus.md)| order_status | 
 **orderStatusId** | **String**| UUID order_status_id | 

### Return type

[**OrderStatus**](OrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateOrderTrackUsingPut"></a>
# **updateOrderTrackUsingPut**
> OrderTrack updateOrderTrackUsingPut(orderTrack, orderTrackId)

Update an order tracking record

Update the information for an order tracking record for an order.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var orderTrack = new HydrogenNucleusApi.OrderTrack(); // OrderTrack | order_track

var orderTrackId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID order_track_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateOrderTrackUsingPut(orderTrack, orderTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderTrack** | [**OrderTrack**](OrderTrack.md)| order_track | 
 **orderTrackId** | **String**| UUID order_track_id | 

### Return type

[**OrderTrack**](OrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateOrderUsingPut"></a>
# **updateOrderUsingPut**
> Order updateOrderUsingPut(order, orderId)

Update an order record

Update the information for an order record.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OrderApi();

var order = new HydrogenNucleusApi.Order(); // Order | order

var orderId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID order_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateOrderUsingPut(order, orderId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| order | 
 **orderId** | **String**| UUID order_id | 

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

