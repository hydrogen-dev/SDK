# OrderApi

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
[**createOrderUsingPost**](OrderApi.md#createOrderUsingPost) | **POST** /order | Create an order record
[**createPortfolioOrderBuyOnlyUsingPost**](OrderApi.md#createPortfolioOrderBuyOnlyUsingPost) | **POST** /portfolio/{portfolio_id}/order_buy_only | Create buy-only portfolio rebalance orders
[**createPortfolioOrderRebalanceUsingPost**](OrderApi.md#createPortfolioOrderRebalanceUsingPost) | **POST** /portfolio/{portfolio_id}/order_rebalance | Create portfolio rebalance orders
[**createPortfolioOrderReconciliation**](OrderApi.md#createPortfolioOrderReconciliation) | **POST** /portfolio/{portfolio_id}/order_reconciliation | Create portfolio reconciliation order
[**createPortfolioOrderSellAllUsingPost**](OrderApi.md#createPortfolioOrderSellAllUsingPost) | **POST** /portfolio/{portfolio_id}/order_sell_all | Sell all portfolio order
[**createPortfolioOrderSellOnlyUsingPost**](OrderApi.md#createPortfolioOrderSellOnlyUsingPost) | **POST** /portfolio/{portfolio_id}/order_sell_only | Create sell-only portfolio rebalance orders
[**deleteOrderStatusUsingDelete**](OrderApi.md#deleteOrderStatusUsingDelete) | **DELETE** /order_status/{order_status_id} | Delete an order status
[**deleteOrderTrackUsingDelete**](OrderApi.md#deleteOrderTrackUsingDelete) | **DELETE** /order_track/{order_track_id} | Delete an order tracking record
[**deleteOrderUsingDelete**](OrderApi.md#deleteOrderUsingDelete) | **DELETE** /order/{order_id} | Delete an order record
[**getOrderAllUsingGet**](OrderApi.md#getOrderAllUsingGet) | **GET** /order | List all order records
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
> List&lt;Order&gt; createAccountOrderBulkUsingPost(accountId, req)

Bulk orders for an account

Aggregates all orders on a given date for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID accountId = new UUID(); // UUID | account_id
TokenDateRequest req = new TokenDateRequest(); // TokenDateRequest | req
try {
    List<Order> result = apiInstance.createAccountOrderBulkUsingPost(accountId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createAccountOrderBulkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| account_id |
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountOrderBuyOnlyUsingPost"></a>
# **createAccountOrderBuyOnlyUsingPost**
> List&lt;OrderVoClone&gt; createAccountOrderBuyOnlyUsingPost(accountId, req)

Create buy-only account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID accountId = new UUID(); // UUID | account_id
AccountPortfolioRebalanceRequest req = new AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req
try {
    List<OrderVoClone> result = apiInstance.createAccountOrderBuyOnlyUsingPost(accountId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createAccountOrderBuyOnlyUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| account_id |
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**List&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountOrderRebalanceUsingPost"></a>
# **createAccountOrderRebalanceUsingPost**
> List&lt;OrderVoClone&gt; createAccountOrderRebalanceUsingPost(accountId, req)

Create account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID accountId = new UUID(); // UUID | account_id
AccountPortfolioRebalanceRequest req = new AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req
try {
    List<OrderVoClone> result = apiInstance.createAccountOrderRebalanceUsingPost(accountId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createAccountOrderRebalanceUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| account_id |
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**List&lt;OrderVoClone&gt;**](OrderVoClone.md)

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID accountId = new UUID(); // UUID | account_id
OrderReconcileRequest req = new OrderReconcileRequest(); // OrderReconcileRequest | req
try {
    OrderReconcileReturnObject result = apiInstance.createAccountOrderReconciliation(accountId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createAccountOrderReconciliation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| account_id |
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
> List&lt;OrderVoClone&gt; createAccountOrderSellAllUsingPost(accountId, req)

Sell all account order

Create order records necessary to entirely sell all the holdings within an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID accountId = new UUID(); // UUID | account_id
AccountPortfolioRebalanceRequest req = new AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req
try {
    List<OrderVoClone> result = apiInstance.createAccountOrderSellAllUsingPost(accountId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createAccountOrderSellAllUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| account_id |
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**List&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountOrderSellOnlyUsingPost"></a>
# **createAccountOrderSellOnlyUsingPost**
> List&lt;OrderVoClone&gt; createAccountOrderSellOnlyUsingPost(accountId, req)

Create sell-only account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID accountId = new UUID(); // UUID | account_id
AccountPortfolioRebalanceRequest req = new AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req
try {
    List<OrderVoClone> result = apiInstance.createAccountOrderSellOnlyUsingPost(accountId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createAccountOrderSellOnlyUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| account_id |
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**List&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createClientOrderBulkUsingPost"></a>
# **createClientOrderBulkUsingPost**
> List&lt;Order&gt; createClientOrderBulkUsingPost(clientId, req)

Bulk orders for a client

Aggregates all orders on a given date for a client

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID clientId = new UUID(); // UUID | client_id
TokenDateRequest req = new TokenDateRequest(); // TokenDateRequest | req
try {
    List<Order> result = apiInstance.createClientOrderBulkUsingPost(clientId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createClientOrderBulkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| client_id |
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOrderBulkUsingPost"></a>
# **createOrderBulkUsingPost**
> List&lt;Order&gt; createOrderBulkUsingPost(req)

Bulk orders for your firm

Aggregates all orders on a given date for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
TokenDateRequest req = new TokenDateRequest(); // TokenDateRequest | req
try {
    List<Order> result = apiInstance.createOrderBulkUsingPost(req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createOrderBulkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req |

### Return type

[**List&lt;Order&gt;**](Order.md)

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
OrderStatus orderStatusRequest = new OrderStatus(); // OrderStatus | orderStatusRequest
try {
    OrderStatus result = apiInstance.createOrderStatusUsingPost(orderStatusRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createOrderStatusUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
OrderTrack orderTrackRequest = new OrderTrack(); // OrderTrack | orderTrackRequest
try {
    OrderTrack result = apiInstance.createOrderTrackUsingPost(orderTrackRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createOrderTrackUsingPost");
    e.printStackTrace();
}
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

<a name="createOrderUsingPost"></a>
# **createOrderUsingPost**
> Order createOrderUsingPost(orderInfoRequest)

Create an order record

Create an order record defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
Order orderInfoRequest = new Order(); // Order | orderInfoRequest
try {
    Order result = apiInstance.createOrderUsingPost(orderInfoRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createOrderUsingPost");
    e.printStackTrace();
}
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

<a name="createPortfolioOrderBuyOnlyUsingPost"></a>
# **createPortfolioOrderBuyOnlyUsingPost**
> List&lt;OrderVoClone&gt; createPortfolioOrderBuyOnlyUsingPost(portfolioId, req)

Create buy-only portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes. However, these will only be buy transactions, and no securities will be sold.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID portfolioId = new UUID(); // UUID | portfolio_id
AccountPortfolioRebalanceRequest req = new AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req
try {
    List<OrderVoClone> result = apiInstance.createPortfolioOrderBuyOnlyUsingPost(portfolioId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createPortfolioOrderBuyOnlyUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**UUID**](.md)| portfolio_id |
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**List&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioOrderRebalanceUsingPost"></a>
# **createPortfolioOrderRebalanceUsingPost**
> List&lt;OrderVoClone&gt; createPortfolioOrderRebalanceUsingPost(portfolioId, req)

Create portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID portfolioId = new UUID(); // UUID | portfolio_id
AccountPortfolioRebalanceRequest req = new AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req
try {
    List<OrderVoClone> result = apiInstance.createPortfolioOrderRebalanceUsingPost(portfolioId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createPortfolioOrderRebalanceUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**UUID**](.md)| portfolio_id |
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**List&lt;OrderVoClone&gt;**](OrderVoClone.md)

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID portfolioId = new UUID(); // UUID | portfolio_id
OrderReconcileRequest req = new OrderReconcileRequest(); // OrderReconcileRequest | req
try {
    OrderReconcileReturnObject result = apiInstance.createPortfolioOrderReconciliation(portfolioId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createPortfolioOrderReconciliation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**UUID**](.md)| portfolio_id |
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
> List&lt;OrderVoClone&gt; createPortfolioOrderSellAllUsingPost(portfolioId, req)

Sell all portfolio order

Create order records necessary to entirely sell all the holdings within a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID portfolioId = new UUID(); // UUID | portfolio_id
AccountPortfolioRebalanceRequest req = new AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req
try {
    List<OrderVoClone> result = apiInstance.createPortfolioOrderSellAllUsingPost(portfolioId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createPortfolioOrderSellAllUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**UUID**](.md)| portfolio_id |
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**List&lt;OrderVoClone&gt;**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioOrderSellOnlyUsingPost"></a>
# **createPortfolioOrderSellOnlyUsingPost**
> List&lt;OrderVoClone&gt; createPortfolioOrderSellOnlyUsingPost(portfolioId, req)

Create sell-only portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID portfolioId = new UUID(); // UUID | portfolio_id
AccountPortfolioRebalanceRequest req = new AccountPortfolioRebalanceRequest(); // AccountPortfolioRebalanceRequest | req
try {
    List<OrderVoClone> result = apiInstance.createPortfolioOrderSellOnlyUsingPost(portfolioId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createPortfolioOrderSellOnlyUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**UUID**](.md)| portfolio_id |
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req |

### Return type

[**List&lt;OrderVoClone&gt;**](OrderVoClone.md)

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID orderStatusId = new UUID(); // UUID | UUID order_status_id
try {
    apiInstance.deleteOrderStatusUsingDelete(orderStatusId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrderStatusUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatusId** | [**UUID**](.md)| UUID order_status_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID orderTrackId = new UUID(); // UUID | UUID order_track_id
try {
    apiInstance.deleteOrderTrackUsingDelete(orderTrackId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrderTrackUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderTrackId** | [**UUID**](.md)| UUID order_track_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID orderId = new UUID(); // UUID | UUID order_id
try {
    apiInstance.deleteOrderUsingDelete(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrderUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**UUID**](.md)| UUID order_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderAllUsingGet"></a>
# **getOrderAllUsingGet**
> PageOrder getOrderAllUsingGet(ascending, filter, orderBy, page, size)

List all order records

Get the information for all order records defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageOrder result = apiInstance.getOrderAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageOrder**](PageOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderBulkAllUsingGet"></a>
# **getOrderBulkAllUsingGet**
> PageOrderBulk getOrderBulkAllUsingGet(ascending, filter, orderBy, page, size)

List all bulk orders

Get the information for all bulk order records.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
Boolean ascending = true; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "order_bulk_id"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageOrderBulk result = apiInstance.getOrderBulkAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderBulkAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to true]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to order_bulk_id]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageOrderBulk**](PageOrderBulk.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderStatusAllUsingGet"></a>
# **getOrderStatusAllUsingGet**
> PageOrderStatus getOrderStatusAllUsingGet(ascending, filter, orderBy, page, size)

List all order statuses

Get the information for all order statuses defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageOrderStatus result = apiInstance.getOrderStatusAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderStatusAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID orderStatusId = new UUID(); // UUID | UUID order_status_id
try {
    OrderStatus result = apiInstance.getOrderStatusUsingGet(orderStatusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderStatusUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatusId** | [**UUID**](.md)| UUID order_status_id |

### Return type

[**OrderStatus**](OrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderTrackAllUsingGet"></a>
# **getOrderTrackAllUsingGet**
> PageOrderTrack getOrderTrackAllUsingGet(ascending, filter, orderBy, page, size)

List all order tracking records

Get the information for all order tracking record for all order records.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageOrderTrack result = apiInstance.getOrderTrackAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderTrackAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID orderTrackId = new UUID(); // UUID | UUID order_track_id
try {
    OrderTrack result = apiInstance.getOrderTrackUsingGet(orderTrackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderTrackUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderTrackId** | [**UUID**](.md)| UUID order_track_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
UUID orderId = new UUID(); // UUID | UUID order_id
try {
    Order result = apiInstance.getOrderUsingGet(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**UUID**](.md)| UUID order_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
OrderStatus orderStatus = new OrderStatus(); // OrderStatus | order_status
UUID orderStatusId = new UUID(); // UUID | UUID order_status_id
try {
    OrderStatus result = apiInstance.updateOrderStatusUsingPut(orderStatus, orderStatusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateOrderStatusUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatus** | [**OrderStatus**](OrderStatus.md)| order_status |
 **orderStatusId** | [**UUID**](.md)| UUID order_status_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
OrderTrack orderTrack = new OrderTrack(); // OrderTrack | order_track
UUID orderTrackId = new UUID(); // UUID | UUID order_track_id
try {
    OrderTrack result = apiInstance.updateOrderTrackUsingPut(orderTrack, orderTrackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateOrderTrackUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderTrack** | [**OrderTrack**](OrderTrack.md)| order_track |
 **orderTrackId** | [**UUID**](.md)| UUID order_track_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import OrderApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}


OrderApi apiInstance = new OrderApi();
Order order = new Order(); // Order | order
UUID orderId = new UUID(); // UUID | UUID order_id
try {
    Order result = apiInstance.updateOrderUsingPut(order, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateOrderUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| order |
 **orderId** | [**UUID**](.md)| UUID order_id |

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

