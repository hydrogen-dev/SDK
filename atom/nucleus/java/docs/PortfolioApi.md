# PortfolioApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPortfolioAssetSizeUsingPost**](PortfolioApi.md#createPortfolioAssetSizeUsingPost) | **POST** /portfolio_asset_size | Create a portfolio asset size
[**createPortfolioCommentUsingPost**](PortfolioApi.md#createPortfolioCommentUsingPost) | **POST** /portfolio_comment | Create a portfolio commentary
[**createPortfolioGoalUsingPost**](PortfolioApi.md#createPortfolioGoalUsingPost) | **POST** /portfolio_goal | Create an portfolio goal
[**createPortfolioHoldingUsingPost**](PortfolioApi.md#createPortfolioHoldingUsingPost) | **POST** /portfolio_holding | Create a portfolio holding
[**createPortfolioTransactionUsingPost**](PortfolioApi.md#createPortfolioTransactionUsingPost) | **POST** /portfolio_transaction | Create a portfolio transaction
[**createPortfolioUsingPost**](PortfolioApi.md#createPortfolioUsingPost) | **POST** /portfolio | Create a portfolio
[**deletePortfolioAssetSizeUsingDelete**](PortfolioApi.md#deletePortfolioAssetSizeUsingDelete) | **DELETE** /portfolio_asset_size/{portfolio_asset_size_id} | Delete a portfolio asset size
[**deletePortfolioCommentUsingDelete**](PortfolioApi.md#deletePortfolioCommentUsingDelete) | **DELETE** /portfolio_comment/{portfolio_comment_id} | Delete a portfolio commentary
[**deletePortfolioGoalUsingDelete**](PortfolioApi.md#deletePortfolioGoalUsingDelete) | **DELETE** /portfolio_goal/{portfolio_goal_id} | Delete an portfolio goal
[**deletePortfolioHoldingUsingDelete**](PortfolioApi.md#deletePortfolioHoldingUsingDelete) | **DELETE** /portfolio_holding/{portfolio_holding_id} | Delete a portfolio holding
[**deletePortfolioTransactionUsingDelete**](PortfolioApi.md#deletePortfolioTransactionUsingDelete) | **DELETE** /portfolio_transaction/{portfolio_transaction_id} | Delete a portfolio transaction
[**deletePortfolioUsingDelete**](PortfolioApi.md#deletePortfolioUsingDelete) | **DELETE** /portfolio/{portfolio_id} | Delete a portfolio
[**getPortfolioAggregatedDataUsingGet**](PortfolioApi.md#getPortfolioAggregatedDataUsingGet) | **GET** /portfolio/{portfolio_id}/aggregate_data | Retrieve an portfolio aggregate data
[**getPortfolioAllUsingGet**](PortfolioApi.md#getPortfolioAllUsingGet) | **GET** /portfolio | List all portfolios
[**getPortfolioAssetSizeAllUsingGet**](PortfolioApi.md#getPortfolioAssetSizeAllUsingGet) | **GET** /portfolio_asset_size | Retrieve a portfolio asset size
[**getPortfolioAssetSizeUsingGet**](PortfolioApi.md#getPortfolioAssetSizeUsingGet) | **GET** /portfolio_asset_size/{portfolio_asset_size_id} | Retrieve a portfolio asset size
[**getPortfolioCommentAllUsingGet**](PortfolioApi.md#getPortfolioCommentAllUsingGet) | **GET** /portfolio_comment | List all portfolio commentary
[**getPortfolioCommentUsingGet**](PortfolioApi.md#getPortfolioCommentUsingGet) | **GET** /portfolio_comment/{portfolio_comment_id} | Retrieve a portfolio commentary
[**getPortfolioGoalAllUsingGet**](PortfolioApi.md#getPortfolioGoalAllUsingGet) | **GET** /portfolio_goal | List all portfolio goals
[**getPortfolioGoalUsingGet**](PortfolioApi.md#getPortfolioGoalUsingGet) | **GET** /portfolio_goal/{portfolio_goal_id} | Retrieve an portfolio goal
[**getPortfolioHoldingAllUsingGet**](PortfolioApi.md#getPortfolioHoldingAllUsingGet) | **GET** /portfolio_holding | List all portfolio holdings
[**getPortfolioHoldingUsingGet**](PortfolioApi.md#getPortfolioHoldingUsingGet) | **GET** /portfolio_holding/{portfolio_holding_id} | Retrieve a portfolio holding
[**getPortfolioTransactionAllUsingGet**](PortfolioApi.md#getPortfolioTransactionAllUsingGet) | **GET** /portfolio_transaction | List all portfolio transactions
[**getPortfolioTransactionUsingGet**](PortfolioApi.md#getPortfolioTransactionUsingGet) | **GET** /portfolio_transaction/{portfolio_transaction_id} | Retrieve a portfolio transaction
[**getPortfolioUsingGet**](PortfolioApi.md#getPortfolioUsingGet) | **GET** /portfolio/{portfolio_id} | Retrieve a portfolio
[**updatePortfolioAssetSizeUsingPut**](PortfolioApi.md#updatePortfolioAssetSizeUsingPut) | **PUT** /portfolio_asset_size/{portfolio_asset_size_id} | Update a portfolio asset size
[**updatePortfolioCommentUsingPut**](PortfolioApi.md#updatePortfolioCommentUsingPut) | **PUT** /portfolio_comment/{portfolio_comment_id} | Update a portfolio comment
[**updatePortfolioGoalUsingPut**](PortfolioApi.md#updatePortfolioGoalUsingPut) | **PUT** /portfolio_goal/{portfolio_goal_id} | Update an portfolio goal
[**updatePortfolioHoldingUsingPut**](PortfolioApi.md#updatePortfolioHoldingUsingPut) | **PUT** /portfolio_holding/{portfolio_holding_id} | Update a portfolio holding
[**updatePortfolioTransactionUsingPut**](PortfolioApi.md#updatePortfolioTransactionUsingPut) | **PUT** /portfolio_transaction/{portfolio_transaction_id} | Update a portfolio transaction
[**updatePortfolioUsingPut**](PortfolioApi.md#updatePortfolioUsingPut) | **PUT** /portfolio/{portfolio_id} | Update a portfolio


<a name="createPortfolioAssetSizeUsingPost"></a>
# **createPortfolioAssetSizeUsingPost**
> PortfolioAssetSizeLog createPortfolioAssetSizeUsingPost(portfolioAssetSizeLogRequest)

Create a portfolio asset size

Create a new asset size record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
PortfolioAssetSizeLog portfolioAssetSizeLogRequest = new PortfolioAssetSizeLog(); // PortfolioAssetSizeLog | portfolioAssetSizeLogRequest
try {
    PortfolioAssetSizeLog result = apiInstance.createPortfolioAssetSizeUsingPost(portfolioAssetSizeLogRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#createPortfolioAssetSizeUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSizeLogRequest** | [**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)| portfolioAssetSizeLogRequest |

### Return type

[**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioCommentUsingPost"></a>
# **createPortfolioCommentUsingPost**
> PortfolioComment createPortfolioCommentUsingPost(portfolioComment)

Create a portfolio commentary

Create a new comment for a portfolio defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
PortfolioComment portfolioComment = new PortfolioComment(); // PortfolioComment | portfolioComment
try {
    PortfolioComment result = apiInstance.createPortfolioCommentUsingPost(portfolioComment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#createPortfolioCommentUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioComment** | [**PortfolioComment**](PortfolioComment.md)| portfolioComment |

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioGoalUsingPost"></a>
# **createPortfolioGoalUsingPost**
> PortfolioGoal createPortfolioGoalUsingPost(portfolioGoal)

Create an portfolio goal

Create an portfolio goal.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
PortfolioGoal portfolioGoal = new PortfolioGoal(); // PortfolioGoal | portfolioGoal
try {
    PortfolioGoal result = apiInstance.createPortfolioGoalUsingPost(portfolioGoal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#createPortfolioGoalUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioGoal** | [**PortfolioGoal**](PortfolioGoal.md)| portfolioGoal |

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioHoldingUsingPost"></a>
# **createPortfolioHoldingUsingPost**
> PortfolioHoldingLog createPortfolioHoldingUsingPost(portfolioHoldinLogRequest)

Create a portfolio holding

Create a new holding record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
PortfolioHoldingLog portfolioHoldinLogRequest = new PortfolioHoldingLog(); // PortfolioHoldingLog | portfolioHoldinLogRequest
try {
    PortfolioHoldingLog result = apiInstance.createPortfolioHoldingUsingPost(portfolioHoldinLogRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#createPortfolioHoldingUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHoldinLogRequest** | [**PortfolioHoldingLog**](PortfolioHoldingLog.md)| portfolioHoldinLogRequest |

### Return type

[**PortfolioHoldingLog**](PortfolioHoldingLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioTransactionUsingPost"></a>
# **createPortfolioTransactionUsingPost**
> PortfolioTransaction createPortfolioTransactionUsingPost(portfolioTransactionRequest)

Create a portfolio transaction

Create a new transaction record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
PortfolioTransaction portfolioTransactionRequest = new PortfolioTransaction(); // PortfolioTransaction | portfolioTransactionRequest
try {
    PortfolioTransaction result = apiInstance.createPortfolioTransactionUsingPost(portfolioTransactionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#createPortfolioTransactionUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransactionRequest** | [**PortfolioTransaction**](PortfolioTransaction.md)| portfolioTransactionRequest |

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioUsingPost"></a>
# **createPortfolioUsingPost**
> Portfolio createPortfolioUsingPost(portfolioRequest)

Create a portfolio

Create a new portfolio for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
Portfolio portfolioRequest = new Portfolio(); // Portfolio | portfolioRequest
try {
    Portfolio result = apiInstance.createPortfolioUsingPost(portfolioRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#createPortfolioUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioRequest** | [**Portfolio**](Portfolio.md)| portfolioRequest |

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deletePortfolioAssetSizeUsingDelete"></a>
# **deletePortfolioAssetSizeUsingDelete**
> deletePortfolioAssetSizeUsingDelete(portfolioAssetSizeId)

Delete a portfolio asset size

Permanently delete a portfolio asset size record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioAssetSizeId = new UUID(); // UUID | UUID portfolio_asset_size_id
try {
    apiInstance.deletePortfolioAssetSizeUsingDelete(portfolioAssetSizeId);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#deletePortfolioAssetSizeUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSizeId** | [**UUID**](.md)| UUID portfolio_asset_size_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePortfolioCommentUsingDelete"></a>
# **deletePortfolioCommentUsingDelete**
> deletePortfolioCommentUsingDelete(portfolioCommentId)

Delete a portfolio commentary

Permanently delete a portfolio comment for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioCommentId = new UUID(); // UUID | UUID portfolio_comment_id
try {
    apiInstance.deletePortfolioCommentUsingDelete(portfolioCommentId);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#deletePortfolioCommentUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioCommentId** | [**UUID**](.md)| UUID portfolio_comment_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePortfolioGoalUsingDelete"></a>
# **deletePortfolioGoalUsingDelete**
> deletePortfolioGoalUsingDelete(portfolioGoalId)

Delete an portfolio goal

Permanently delete an portfolio-goal mapping.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioGoalId = new UUID(); // UUID | UUID portfolio_goal_id
try {
    apiInstance.deletePortfolioGoalUsingDelete(portfolioGoalId);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#deletePortfolioGoalUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioGoalId** | [**UUID**](.md)| UUID portfolio_goal_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePortfolioHoldingUsingDelete"></a>
# **deletePortfolioHoldingUsingDelete**
> deletePortfolioHoldingUsingDelete(portfolioHoldingId)

Delete a portfolio holding

Permanently delete a portfolio holding record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioHoldingId = new UUID(); // UUID | UUID portfolio_holding_id
try {
    apiInstance.deletePortfolioHoldingUsingDelete(portfolioHoldingId);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#deletePortfolioHoldingUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHoldingId** | [**UUID**](.md)| UUID portfolio_holding_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePortfolioTransactionUsingDelete"></a>
# **deletePortfolioTransactionUsingDelete**
> deletePortfolioTransactionUsingDelete(portfolioTransactionId)

Delete a portfolio transaction

Permanently delete a portfolio transaction record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioTransactionId = new UUID(); // UUID | UUID portfolio_transaction_id
try {
    apiInstance.deletePortfolioTransactionUsingDelete(portfolioTransactionId);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#deletePortfolioTransactionUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransactionId** | [**UUID**](.md)| UUID portfolio_transaction_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePortfolioUsingDelete"></a>
# **deletePortfolioUsingDelete**
> deletePortfolioUsingDelete(portfolioId)

Delete a portfolio

Permanently delete a portfolio for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioId = new UUID(); // UUID | UUID portfolio_id
try {
    apiInstance.deletePortfolioUsingDelete(portfolioId);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#deletePortfolioUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**UUID**](.md)| UUID portfolio_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioAggregatedDataUsingGet"></a>
# **getPortfolioAggregatedDataUsingGet**
> Object getPortfolioAggregatedDataUsingGet(portfolioId, showAssetClass, showCategory, showIndustry, showSector, showSecurityClass)

Retrieve an portfolio aggregate data

Retrieve the information for a securities associated with a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioId = new UUID(); // UUID | Portfolio Id
Boolean showAssetClass = true; // Boolean | true or false
Boolean showCategory = true; // Boolean | true or false
Boolean showIndustry = true; // Boolean | true or false
Boolean showSector = true; // Boolean | true or false
Boolean showSecurityClass = true; // Boolean | true or false
try {
    Object result = apiInstance.getPortfolioAggregatedDataUsingGet(portfolioId, showAssetClass, showCategory, showIndustry, showSector, showSecurityClass);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioAggregatedDataUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**UUID**](.md)| Portfolio Id |
 **showAssetClass** | **Boolean**| true or false | [optional] [default to true]
 **showCategory** | **Boolean**| true or false | [optional] [default to true]
 **showIndustry** | **Boolean**| true or false | [optional] [default to true]
 **showSector** | **Boolean**| true or false | [optional] [default to true]
 **showSecurityClass** | **Boolean**| true or false | [optional] [default to true]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioAllUsingGet"></a>
# **getPortfolioAllUsingGet**
> PagePortfolio getPortfolioAllUsingGet(ascending, filter, orderBy, page, size)

List all portfolios

Get the information for all portfolios assigned to all of your firm’s accounts. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PagePortfolio result = apiInstance.getPortfolioAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioAllUsingGet");
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

[**PagePortfolio**](PagePortfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioAssetSizeAllUsingGet"></a>
# **getPortfolioAssetSizeAllUsingGet**
> PagePortfolioAssetSizeLog getPortfolioAssetSizeAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

Retrieve a portfolio asset size

Retrieve the information for a portfolio asset size record for a portfolio. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PagePortfolioAssetSizeLog result = apiInstance.getPortfolioAssetSizeAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioAssetSizeAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PagePortfolioAssetSizeLog**](PagePortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioAssetSizeUsingGet"></a>
# **getPortfolioAssetSizeUsingGet**
> PortfolioAssetSizeLog getPortfolioAssetSizeUsingGet(portfolioAssetSizeId, currencyConversion)

Retrieve a portfolio asset size

Retrieve the information for a portfolio asset size record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioAssetSizeId = new UUID(); // UUID | portfolio_asset_size_id
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
try {
    PortfolioAssetSizeLog result = apiInstance.getPortfolioAssetSizeUsingGet(portfolioAssetSizeId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioAssetSizeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSizeId** | [**UUID**](.md)| portfolio_asset_size_id |
 **currencyConversion** | **String**| currency_conversion | [optional]

### Return type

[**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioCommentAllUsingGet"></a>
# **getPortfolioCommentAllUsingGet**
> PagePortfolioComment getPortfolioCommentAllUsingGet(ascending, filter, orderBy, page, size)

List all portfolio commentary

List all comments for all portfolios defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PagePortfolioComment result = apiInstance.getPortfolioCommentAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioCommentAllUsingGet");
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

[**PagePortfolioComment**](PagePortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioCommentUsingGet"></a>
# **getPortfolioCommentUsingGet**
> PortfolioComment getPortfolioCommentUsingGet(portfolioCommentId)

Retrieve a portfolio commentary

Retrieve the information for a portfolio comment for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioCommentId = new UUID(); // UUID | UUID portfolio_comment_id
try {
    PortfolioComment result = apiInstance.getPortfolioCommentUsingGet(portfolioCommentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioCommentUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioCommentId** | [**UUID**](.md)| UUID portfolio_comment_id |

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioGoalAllUsingGet"></a>
# **getPortfolioGoalAllUsingGet**
> PagePortfolioGoal getPortfolioGoalAllUsingGet(ascending, filter, orderBy, page, size)

List all portfolio goals

Get information for all portfolio-goal mappings defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PagePortfolioGoal result = apiInstance.getPortfolioGoalAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioGoalAllUsingGet");
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

[**PagePortfolioGoal**](PagePortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioGoalUsingGet"></a>
# **getPortfolioGoalUsingGet**
> PortfolioGoal getPortfolioGoalUsingGet(portfolioGoalId)

Retrieve an portfolio goal

Retrieve the information for a specific portfolio-goal mapping.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioGoalId = new UUID(); // UUID | UUID portfolio_goal_id
try {
    PortfolioGoal result = apiInstance.getPortfolioGoalUsingGet(portfolioGoalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioGoalUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioGoalId** | [**UUID**](.md)| UUID portfolio_goal_id |

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioHoldingAllUsingGet"></a>
# **getPortfolioHoldingAllUsingGet**
> PagePortfolioHoldingLog getPortfolioHoldingAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all portfolio holdings

Get the information for all holding records for all portfolios defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PagePortfolioHoldingLog result = apiInstance.getPortfolioHoldingAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioHoldingAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PagePortfolioHoldingLog**](PagePortfolioHoldingLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioHoldingUsingGet"></a>
# **getPortfolioHoldingUsingGet**
> PortfolioHoldingLog getPortfolioHoldingUsingGet(portfolioHoldingId, currencyConversion)

Retrieve a portfolio holding

Retrieve the information for a portfolio holding record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioHoldingId = new UUID(); // UUID | UUID portfolio_holding_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    PortfolioHoldingLog result = apiInstance.getPortfolioHoldingUsingGet(portfolioHoldingId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioHoldingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHoldingId** | [**UUID**](.md)| UUID portfolio_holding_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**PortfolioHoldingLog**](PortfolioHoldingLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioTransactionAllUsingGet"></a>
# **getPortfolioTransactionAllUsingGet**
> PagePortfolioTransaction getPortfolioTransactionAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all portfolio transactions

Get the information for all transaction records for all portfolios defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PagePortfolioTransaction result = apiInstance.getPortfolioTransactionAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioTransactionAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioTransactionUsingGet"></a>
# **getPortfolioTransactionUsingGet**
> PortfolioTransaction getPortfolioTransactionUsingGet(portfolioTransactionId, currencyConversion)

Retrieve a portfolio transaction

Retrieve the information for a portfolio transaction record for a portfolio. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioTransactionId = new UUID(); // UUID | UUID portfolio_transaction_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    PortfolioTransaction result = apiInstance.getPortfolioTransactionUsingGet(portfolioTransactionId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioTransactionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransactionId** | [**UUID**](.md)| UUID portfolio_transaction_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioUsingGet"></a>
# **getPortfolioUsingGet**
> Portfolio getPortfolioUsingGet(portfolioId)

Retrieve a portfolio

Retrieve a portfolio for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
UUID portfolioId = new UUID(); // UUID | UUID portfolio_id
try {
    Portfolio result = apiInstance.getPortfolioUsingGet(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**UUID**](.md)| UUID portfolio_id |

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updatePortfolioAssetSizeUsingPut"></a>
# **updatePortfolioAssetSizeUsingPut**
> PortfolioAssetSizeLog updatePortfolioAssetSizeUsingPut(portfolioAssetSize, portfolioAssetSizeId)

Update a portfolio asset size

Update the information for a portfolio asset size record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
PortfolioAssetSizeLog portfolioAssetSize = new PortfolioAssetSizeLog(); // PortfolioAssetSizeLog | portfolio_asset_size
UUID portfolioAssetSizeId = new UUID(); // UUID | UUID portfolio_asset_size_id
try {
    PortfolioAssetSizeLog result = apiInstance.updatePortfolioAssetSizeUsingPut(portfolioAssetSize, portfolioAssetSizeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#updatePortfolioAssetSizeUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSize** | [**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)| portfolio_asset_size |
 **portfolioAssetSizeId** | [**UUID**](.md)| UUID portfolio_asset_size_id |

### Return type

[**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePortfolioCommentUsingPut"></a>
# **updatePortfolioCommentUsingPut**
> PortfolioComment updatePortfolioCommentUsingPut(portfolioComment, portfolioCommentId)

Update a portfolio comment

Update the information for a portfolio comment for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
PortfolioComment portfolioComment = new PortfolioComment(); // PortfolioComment | portfolio_comment
UUID portfolioCommentId = new UUID(); // UUID | UUID portfolio_comment_id
try {
    PortfolioComment result = apiInstance.updatePortfolioCommentUsingPut(portfolioComment, portfolioCommentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#updatePortfolioCommentUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioComment** | [**PortfolioComment**](PortfolioComment.md)| portfolio_comment |
 **portfolioCommentId** | [**UUID**](.md)| UUID portfolio_comment_id |

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePortfolioGoalUsingPut"></a>
# **updatePortfolioGoalUsingPut**
> PortfolioGoal updatePortfolioGoalUsingPut(portfolioGoal, portfolioGoalId)

Update an portfolio goal

Update the information for an portfolio-goal mapping.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
PortfolioGoal portfolioGoal = new PortfolioGoal(); // PortfolioGoal | portfolio_goal
UUID portfolioGoalId = new UUID(); // UUID | UUID portfolio_goal_id
try {
    PortfolioGoal result = apiInstance.updatePortfolioGoalUsingPut(portfolioGoal, portfolioGoalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#updatePortfolioGoalUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioGoal** | [**PortfolioGoal**](PortfolioGoal.md)| portfolio_goal |
 **portfolioGoalId** | [**UUID**](.md)| UUID portfolio_goal_id |

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePortfolioHoldingUsingPut"></a>
# **updatePortfolioHoldingUsingPut**
> PortfolioHoldingLog updatePortfolioHoldingUsingPut(portfolioHolding, portfolioHoldingId)

Update a portfolio holding

Update the information for a portfolio holding record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
PortfolioHoldingLog portfolioHolding = new PortfolioHoldingLog(); // PortfolioHoldingLog | portfolio_holding
UUID portfolioHoldingId = new UUID(); // UUID | UUID portfolio_holding_id
try {
    PortfolioHoldingLog result = apiInstance.updatePortfolioHoldingUsingPut(portfolioHolding, portfolioHoldingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#updatePortfolioHoldingUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHolding** | [**PortfolioHoldingLog**](PortfolioHoldingLog.md)| portfolio_holding |
 **portfolioHoldingId** | [**UUID**](.md)| UUID portfolio_holding_id |

### Return type

[**PortfolioHoldingLog**](PortfolioHoldingLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePortfolioTransactionUsingPut"></a>
# **updatePortfolioTransactionUsingPut**
> PortfolioTransaction updatePortfolioTransactionUsingPut(portfolioTransaction, portfolioTransactionId)

Update a portfolio transaction

Update the information for a portfolio transaction record for a portfolio.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
PortfolioTransaction portfolioTransaction = new PortfolioTransaction(); // PortfolioTransaction | portfolio_transaction
UUID portfolioTransactionId = new UUID(); // UUID | UUID portfolio_transaction_id
try {
    PortfolioTransaction result = apiInstance.updatePortfolioTransactionUsingPut(portfolioTransaction, portfolioTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#updatePortfolioTransactionUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransaction** | [**PortfolioTransaction**](PortfolioTransaction.md)| portfolio_transaction |
 **portfolioTransactionId** | [**UUID**](.md)| UUID portfolio_transaction_id |

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePortfolioUsingPut"></a>
# **updatePortfolioUsingPut**
> Portfolio updatePortfolioUsingPut(portfolio, portfolioId)

Update a portfolio

Update a portfolio for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import PortfolioApi;

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


PortfolioApi apiInstance = new PortfolioApi();
Portfolio portfolio = new Portfolio(); // Portfolio | portfolio
UUID portfolioId = new UUID(); // UUID | UUID portfolio_id
try {
    Portfolio result = apiInstance.updatePortfolioUsingPut(portfolio, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#updatePortfolioUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio** | [**Portfolio**](Portfolio.md)| portfolio |
 **portfolioId** | [**UUID**](.md)| UUID portfolio_id |

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

