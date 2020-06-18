# AggregationAccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAggregationAccountBalanceBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountBalanceBulkUsingPost) | **POST** /bulk_aggregation_account_balance | Create a bulk aggregation account balance
[**createAggregationAccountBalanceUsingPost**](AggregationAccountApi.md#createAggregationAccountBalanceUsingPost) | **POST** /aggregation_account_balance | Create an aggregation account balance
[**createAggregationAccountBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountBulkUsingPost) | **POST** /bulk_aggregation_account | Create a bulk aggregation account
[**createAggregationAccountHoldingBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountHoldingBulkUsingPost) | **POST** /bulk_aggregation_account_holding | Create a bulk aggregation account holding
[**createAggregationAccountHoldingUsingPost**](AggregationAccountApi.md#createAggregationAccountHoldingUsingPost) | **POST** /aggregation_account_holding | Create an aggregation account holding
[**createAggregationAccountTransactionBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountTransactionBulkUsingPost) | **POST** /bulk_aggregation_account_transaction | Create a bulk aggregation account transaction
[**createAggregationAccountTransactionUsingPost**](AggregationAccountApi.md#createAggregationAccountTransactionUsingPost) | **POST** /aggregation_account_transaction | Create an aggregation account transaction
[**createAggregationAccountUsingPost**](AggregationAccountApi.md#createAggregationAccountUsingPost) | **POST** /aggregation_account | Create an aggregation account
[**deleteAggregationAccountBalanceUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountBalanceUsingDelete) | **DELETE** /aggregation_account_balance/{aggregation_account_balance_id} | Delete an aggregation account balance
[**deleteAggregationAccountHoldingUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountHoldingUsingDelete) | **DELETE** /aggregation_account_holding/{aggregation_account_holding_id} | Delete an aggregation account holding
[**deleteAggregationAccountTransactionUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountTransactionUsingDelete) | **DELETE** /aggregation_account_transaction/{aggregation_account_transaction_id} | Delete an aggregation account transaction
[**deleteAggregationAccountUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountUsingDelete) | **DELETE** /aggregation_account/{aggregation_account_id} | Delete an aggregation account
[**getAggregationAccountAggregateDataUsingGet**](AggregationAccountApi.md#getAggregationAccountAggregateDataUsingGet) | **GET** /aggregation_account/{aggregation_account_id}/aggregate_data | Retrieve an aggregation account aggregate data
[**getAggregationAccountAllUsingGet**](AggregationAccountApi.md#getAggregationAccountAllUsingGet) | **GET** /aggregation_account | List all aggregation accounts
[**getAggregationAccountBalanceAllUsingGet**](AggregationAccountApi.md#getAggregationAccountBalanceAllUsingGet) | **GET** /aggregation_account_balance | List all aggregation account balances
[**getAggregationAccountBalanceUsingGet**](AggregationAccountApi.md#getAggregationAccountBalanceUsingGet) | **GET** /aggregation_account_balance/{aggregation_account_balance_id} | Retrieve an aggregation account balance
[**getAggregationAccountHoldingAllUsingGet**](AggregationAccountApi.md#getAggregationAccountHoldingAllUsingGet) | **GET** /aggregation_account_holding | List all aggregation account holdings
[**getAggregationAccountHoldingUsingGet**](AggregationAccountApi.md#getAggregationAccountHoldingUsingGet) | **GET** /aggregation_account_holding/{aggregation_account_holding_id} | Retrieve an aggregation account holding
[**getAggregationAccountOverviewUsingGet**](AggregationAccountApi.md#getAggregationAccountOverviewUsingGet) | **GET** /client/{client_id}/aggregation_account_overview | Retrieve an aggregation account aggregate data
[**getAggregationAccountTransactionAllUsingGet**](AggregationAccountApi.md#getAggregationAccountTransactionAllUsingGet) | **GET** /aggregation_account_transaction | List all aggregation account transactions
[**getAggregationAccountTransactionUsingGet**](AggregationAccountApi.md#getAggregationAccountTransactionUsingGet) | **GET** /aggregation_account_transaction/{aggregation_account_transaction_id} | Retrieve an aggregation account transaction
[**getAggregationAccountUsingGet**](AggregationAccountApi.md#getAggregationAccountUsingGet) | **GET** /aggregation_account/{aggregation_account_id} | Retrieve an aggregation account
[**updateAggregationAccountBalanceUsingPut**](AggregationAccountApi.md#updateAggregationAccountBalanceUsingPut) | **PUT** /aggregation_account_balance/{aggregation_account_balance_id} | Update an aggregation account balance
[**updateAggregationAccountBulkUsingPut**](AggregationAccountApi.md#updateAggregationAccountBulkUsingPut) | **PUT** /bulk_aggregation_account | Update a bulk aggregation account
[**updateAggregationAccountHoldingBulkUsingPut**](AggregationAccountApi.md#updateAggregationAccountHoldingBulkUsingPut) | **PUT** /bulk_aggregation_account_holding | Update an bulk aggregation account holding
[**updateAggregationAccountHoldingUsingPut**](AggregationAccountApi.md#updateAggregationAccountHoldingUsingPut) | **PUT** /aggregation_account_holding/{aggregation_account_holding_id} | Update an aggregation account holding
[**updateAggregationAccountTransactionUsingPut**](AggregationAccountApi.md#updateAggregationAccountTransactionUsingPut) | **PUT** /aggregation_account_transaction/{aggregation_account_transaction_id} | Update an aggregation account transaction
[**updateAggregationAccountUsingPut**](AggregationAccountApi.md#updateAggregationAccountUsingPut) | **PUT** /aggregation_account/{aggregation_account_id} | Update an aggregation account


<a name="createAggregationAccountBalanceBulkUsingPost"></a>
# **createAggregationAccountBalanceBulkUsingPost**
> List&lt;AggregationAccountBalance&gt; createAggregationAccountBalanceBulkUsingPost(aggregationAccountBalance)

Create a bulk aggregation account balance

Create a balance records under an aggregation accounts.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
List<AggregationAccountBalance> aggregationAccountBalance = Arrays.asList(new AggregationAccountBalance()); // List<AggregationAccountBalance> | aggregationAccountBalance
try {
    List<AggregationAccountBalance> result = apiInstance.createAggregationAccountBalanceBulkUsingPost(aggregationAccountBalance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#createAggregationAccountBalanceBulkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalance** | [**List&lt;AggregationAccountBalance&gt;**](AggregationAccountBalance.md)| aggregationAccountBalance |

### Return type

[**List&lt;AggregationAccountBalance&gt;**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountBalanceUsingPost"></a>
# **createAggregationAccountBalanceUsingPost**
> AggregationAccountBalance createAggregationAccountBalanceUsingPost(aggregationAccountBalance)

Create an aggregation account balance

Create a balance record under an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
AggregationAccountBalance aggregationAccountBalance = new AggregationAccountBalance(); // AggregationAccountBalance | aggregationAccountBalance
try {
    AggregationAccountBalance result = apiInstance.createAggregationAccountBalanceUsingPost(aggregationAccountBalance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#createAggregationAccountBalanceUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalance** | [**AggregationAccountBalance**](AggregationAccountBalance.md)| aggregationAccountBalance |

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountBulkUsingPost"></a>
# **createAggregationAccountBulkUsingPost**
> List&lt;AggregationAccount&gt; createAggregationAccountBulkUsingPost(aggregationAccountList)

Create a bulk aggregation account

Create a bulk aggregation account under a client.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
List<AggregationAccount> aggregationAccountList = Arrays.asList(new AggregationAccount()); // List<AggregationAccount> | aggregationAccountList
try {
    List<AggregationAccount> result = apiInstance.createAggregationAccountBulkUsingPost(aggregationAccountList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#createAggregationAccountBulkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountList** | [**List&lt;AggregationAccount&gt;**](AggregationAccount.md)| aggregationAccountList |

### Return type

[**List&lt;AggregationAccount&gt;**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountHoldingBulkUsingPost"></a>
# **createAggregationAccountHoldingBulkUsingPost**
> List&lt;AggregationAccountHolding&gt; createAggregationAccountHoldingBulkUsingPost(aggregationTransaction)

Create a bulk aggregation account holding

Create a bulk aggregation account holding.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
List<AggregationAccountHolding> aggregationTransaction = Arrays.asList(new AggregationAccountHolding()); // List<AggregationAccountHolding> | aggregationTransaction
try {
    List<AggregationAccountHolding> result = apiInstance.createAggregationAccountHoldingBulkUsingPost(aggregationTransaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#createAggregationAccountHoldingBulkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationTransaction** | [**List&lt;AggregationAccountHolding&gt;**](AggregationAccountHolding.md)| aggregationTransaction |

### Return type

[**List&lt;AggregationAccountHolding&gt;**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountHoldingUsingPost"></a>
# **createAggregationAccountHoldingUsingPost**
> AggregationAccountHolding createAggregationAccountHoldingUsingPost(aggregationAccountHolding)

Create an aggregation account holding

Create a holding record under an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
AggregationAccountHolding aggregationAccountHolding = new AggregationAccountHolding(); // AggregationAccountHolding | aggregationAccountHolding
try {
    AggregationAccountHolding result = apiInstance.createAggregationAccountHoldingUsingPost(aggregationAccountHolding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#createAggregationAccountHoldingUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHolding** | [**AggregationAccountHolding**](AggregationAccountHolding.md)| aggregationAccountHolding |

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountTransactionBulkUsingPost"></a>
# **createAggregationAccountTransactionBulkUsingPost**
> List&lt;AggregationAccountTransaction&gt; createAggregationAccountTransactionBulkUsingPost(aggregationAccountTransactions)

Create a bulk aggregation account transaction

Create a bulk transaction record under an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
List<AggregationAccountTransaction> aggregationAccountTransactions = Arrays.asList(new AggregationAccountTransaction()); // List<AggregationAccountTransaction> | aggregationAccountTransactions
try {
    List<AggregationAccountTransaction> result = apiInstance.createAggregationAccountTransactionBulkUsingPost(aggregationAccountTransactions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#createAggregationAccountTransactionBulkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransactions** | [**List&lt;AggregationAccountTransaction&gt;**](AggregationAccountTransaction.md)| aggregationAccountTransactions |

### Return type

[**List&lt;AggregationAccountTransaction&gt;**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountTransactionUsingPost"></a>
# **createAggregationAccountTransactionUsingPost**
> AggregationAccountTransaction createAggregationAccountTransactionUsingPost(aggregationAccountTransaction)

Create an aggregation account transaction

Create a transaction record under an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
AggregationAccountTransaction aggregationAccountTransaction = new AggregationAccountTransaction(); // AggregationAccountTransaction | aggregationAccountTransaction
try {
    AggregationAccountTransaction result = apiInstance.createAggregationAccountTransactionUsingPost(aggregationAccountTransaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#createAggregationAccountTransactionUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransaction** | [**AggregationAccountTransaction**](AggregationAccountTransaction.md)| aggregationAccountTransaction |

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountUsingPost"></a>
# **createAggregationAccountUsingPost**
> AggregationAccount createAggregationAccountUsingPost(aggregationAccount)

Create an aggregation account

Create an aggregation account under a client.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
AggregationAccount aggregationAccount = new AggregationAccount(); // AggregationAccount | aggregationAccount
try {
    AggregationAccount result = apiInstance.createAggregationAccountUsingPost(aggregationAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#createAggregationAccountUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccount** | [**AggregationAccount**](AggregationAccount.md)| aggregationAccount |

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAggregationAccountBalanceUsingDelete"></a>
# **deleteAggregationAccountBalanceUsingDelete**
> deleteAggregationAccountBalanceUsingDelete(aggregationAccountBalanceId)

Delete an aggregation account balance

Permanently delete a balance record for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
UUID aggregationAccountBalanceId = new UUID(); // UUID | UUID aggregation_account_balance_id
try {
    apiInstance.deleteAggregationAccountBalanceUsingDelete(aggregationAccountBalanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#deleteAggregationAccountBalanceUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalanceId** | [**UUID**](.md)| UUID aggregation_account_balance_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAggregationAccountHoldingUsingDelete"></a>
# **deleteAggregationAccountHoldingUsingDelete**
> deleteAggregationAccountHoldingUsingDelete(aggregationAccountHoldingId)

Delete an aggregation account holding

Permanently delete a holding record for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
UUID aggregationAccountHoldingId = new UUID(); // UUID | UUID aggregation_account_holding_id
try {
    apiInstance.deleteAggregationAccountHoldingUsingDelete(aggregationAccountHoldingId);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#deleteAggregationAccountHoldingUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHoldingId** | [**UUID**](.md)| UUID aggregation_account_holding_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAggregationAccountTransactionUsingDelete"></a>
# **deleteAggregationAccountTransactionUsingDelete**
> AggregationAccountTransaction deleteAggregationAccountTransactionUsingDelete(aggregationAccountTransactionId)

Delete an aggregation account transaction

Permanently delete a transaction record for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
UUID aggregationAccountTransactionId = new UUID(); // UUID | UUID aggregation_account_transaction_id
try {
    AggregationAccountTransaction result = apiInstance.deleteAggregationAccountTransactionUsingDelete(aggregationAccountTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#deleteAggregationAccountTransactionUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransactionId** | [**UUID**](.md)| UUID aggregation_account_transaction_id |

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAggregationAccountUsingDelete"></a>
# **deleteAggregationAccountUsingDelete**
> deleteAggregationAccountUsingDelete(aggregationAccountId)

Delete an aggregation account

Permanently delete an aggregation account under a client.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
UUID aggregationAccountId = new UUID(); // UUID | UUID aggregation_account_id
try {
    apiInstance.deleteAggregationAccountUsingDelete(aggregationAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#deleteAggregationAccountUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountId** | [**UUID**](.md)| UUID aggregation_account_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountAggregateDataUsingGet"></a>
# **getAggregationAccountAggregateDataUsingGet**
> AggregationAccountAggregateDataVO getAggregationAccountAggregateDataUsingGet(aggregationAccountId)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account associated with a client.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
UUID aggregationAccountId = new UUID(); // UUID | UUID aggregation_account_id
try {
    AggregationAccountAggregateDataVO result = apiInstance.getAggregationAccountAggregateDataUsingGet(aggregationAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#getAggregationAccountAggregateDataUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountId** | [**UUID**](.md)| UUID aggregation_account_id |

### Return type

[**AggregationAccountAggregateDataVO**](AggregationAccountAggregateDataVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountAllUsingGet"></a>
# **getAggregationAccountAllUsingGet**
> PageAggregationAccount getAggregationAccountAllUsingGet(ascending, filter, orderBy, page, size)

List all aggregation accounts

Get information for all aggregation accounts for all clients defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAggregationAccount result = apiInstance.getAggregationAccountAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#getAggregationAccountAllUsingGet");
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

[**PageAggregationAccount**](PageAggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountBalanceAllUsingGet"></a>
# **getAggregationAccountBalanceAllUsingGet**
> PageAggregationAccountBalance getAggregationAccountBalanceAllUsingGet(ascending, filter, orderBy, page, size)

List all aggregation account balances

Get all of the balance records for all aggregation accounts defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAggregationAccountBalance result = apiInstance.getAggregationAccountBalanceAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#getAggregationAccountBalanceAllUsingGet");
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

[**PageAggregationAccountBalance**](PageAggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountBalanceUsingGet"></a>
# **getAggregationAccountBalanceUsingGet**
> AggregationAccountBalance getAggregationAccountBalanceUsingGet(aggregationAccountBalanceId)

Retrieve an aggregation account balance

Retrieve the information for a specific balance record for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
UUID aggregationAccountBalanceId = new UUID(); // UUID | UUID aggregation_account_balance_id
try {
    AggregationAccountBalance result = apiInstance.getAggregationAccountBalanceUsingGet(aggregationAccountBalanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#getAggregationAccountBalanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalanceId** | [**UUID**](.md)| UUID aggregation_account_balance_id |

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountHoldingAllUsingGet"></a>
# **getAggregationAccountHoldingAllUsingGet**
> PageAggregationAccountHolding getAggregationAccountHoldingAllUsingGet(ascending, filter, orderBy, page, size)

List all aggregation account holdings

Get all of the holding records for all aggregation accounts defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAggregationAccountHolding result = apiInstance.getAggregationAccountHoldingAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#getAggregationAccountHoldingAllUsingGet");
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

[**PageAggregationAccountHolding**](PageAggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountHoldingUsingGet"></a>
# **getAggregationAccountHoldingUsingGet**
> AggregationAccountHolding getAggregationAccountHoldingUsingGet(aggregationAccountHoldingId)

Retrieve an aggregation account holding

Retrieve the information for a specific holding record for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
UUID aggregationAccountHoldingId = new UUID(); // UUID | UUID aggregation_account_holding_id
try {
    AggregationAccountHolding result = apiInstance.getAggregationAccountHoldingUsingGet(aggregationAccountHoldingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#getAggregationAccountHoldingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHoldingId** | [**UUID**](.md)| UUID aggregation_account_holding_id |

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountOverviewUsingGet"></a>
# **getAggregationAccountOverviewUsingGet**
> AggregationDataForClientParentResponseVO getAggregationAccountOverviewUsingGet(clientId)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account with aggregate data for a client.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
UUID clientId = new UUID(); // UUID | UUID client_id
try {
    AggregationDataForClientParentResponseVO result = apiInstance.getAggregationAccountOverviewUsingGet(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#getAggregationAccountOverviewUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| UUID client_id |

### Return type

[**AggregationDataForClientParentResponseVO**](AggregationDataForClientParentResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountTransactionAllUsingGet"></a>
# **getAggregationAccountTransactionAllUsingGet**
> PageAggregationAccountTransaction getAggregationAccountTransactionAllUsingGet(ascending, filter, orderBy, page, size)

List all aggregation account transactions

Get all of the transaction records for all aggregation accounts defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAggregationAccountTransaction result = apiInstance.getAggregationAccountTransactionAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#getAggregationAccountTransactionAllUsingGet");
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

[**PageAggregationAccountTransaction**](PageAggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountTransactionUsingGet"></a>
# **getAggregationAccountTransactionUsingGet**
> AggregationAccountTransaction getAggregationAccountTransactionUsingGet(aggregationAccountTransactionId)

Retrieve an aggregation account transaction

Retrieve the information for a specific transaction record for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
UUID aggregationAccountTransactionId = new UUID(); // UUID | UUID aggregation_account_transaction_id
try {
    AggregationAccountTransaction result = apiInstance.getAggregationAccountTransactionUsingGet(aggregationAccountTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#getAggregationAccountTransactionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransactionId** | [**UUID**](.md)| UUID aggregation_account_transaction_id |

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountUsingGet"></a>
# **getAggregationAccountUsingGet**
> AggregationAccount getAggregationAccountUsingGet(aggregationAccountId)

Retrieve an aggregation account

Retrieve the information for a specific aggregation account associated with a client.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
UUID aggregationAccountId = new UUID(); // UUID | UUID aggregation_account_id
try {
    AggregationAccount result = apiInstance.getAggregationAccountUsingGet(aggregationAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#getAggregationAccountUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountId** | [**UUID**](.md)| UUID aggregation_account_id |

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAggregationAccountBalanceUsingPut"></a>
# **updateAggregationAccountBalanceUsingPut**
> AggregationAccountBalance updateAggregationAccountBalanceUsingPut(aggregationAccountBalance, aggregationAccountBalanceId)

Update an aggregation account balance

Update a balance record for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
AggregationAccountBalance aggregationAccountBalance = new AggregationAccountBalance(); // AggregationAccountBalance | aggregation_account_balance
UUID aggregationAccountBalanceId = new UUID(); // UUID | UUID aggregation_account_balance_id
try {
    AggregationAccountBalance result = apiInstance.updateAggregationAccountBalanceUsingPut(aggregationAccountBalance, aggregationAccountBalanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#updateAggregationAccountBalanceUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalance** | [**AggregationAccountBalance**](AggregationAccountBalance.md)| aggregation_account_balance |
 **aggregationAccountBalanceId** | [**UUID**](.md)| UUID aggregation_account_balance_id |

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAggregationAccountBulkUsingPut"></a>
# **updateAggregationAccountBulkUsingPut**
> AggregationAccount updateAggregationAccountBulkUsingPut(aggregationAccountList)

Update a bulk aggregation account

Update a bulk aggregation account under a client.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
List<AggregationAccount> aggregationAccountList = Arrays.asList(new AggregationAccount()); // List<AggregationAccount> | aggregationAccountList
try {
    AggregationAccount result = apiInstance.updateAggregationAccountBulkUsingPut(aggregationAccountList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#updateAggregationAccountBulkUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountList** | [**List&lt;AggregationAccount&gt;**](AggregationAccount.md)| aggregationAccountList |

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAggregationAccountHoldingBulkUsingPut"></a>
# **updateAggregationAccountHoldingBulkUsingPut**
> List&lt;AggregationAccountHolding&gt; updateAggregationAccountHoldingBulkUsingPut(aggregationAccountHolding)

Update an bulk aggregation account holding

Update a bulk holding record for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
List<AggregationAccountHolding> aggregationAccountHolding = Arrays.asList(new AggregationAccountHolding()); // List<AggregationAccountHolding> | aggregationAccountHolding
try {
    List<AggregationAccountHolding> result = apiInstance.updateAggregationAccountHoldingBulkUsingPut(aggregationAccountHolding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#updateAggregationAccountHoldingBulkUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHolding** | [**List&lt;AggregationAccountHolding&gt;**](AggregationAccountHolding.md)| aggregationAccountHolding |

### Return type

[**List&lt;AggregationAccountHolding&gt;**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAggregationAccountHoldingUsingPut"></a>
# **updateAggregationAccountHoldingUsingPut**
> AggregationAccountHolding updateAggregationAccountHoldingUsingPut(aggregationAccountHolding, aggregationAccountHoldingId)

Update an aggregation account holding

Update a holding record for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
AggregationAccountHolding aggregationAccountHolding = new AggregationAccountHolding(); // AggregationAccountHolding | aggregation_account_holding
UUID aggregationAccountHoldingId = new UUID(); // UUID | UUID aggregation_account_holding_id
try {
    AggregationAccountHolding result = apiInstance.updateAggregationAccountHoldingUsingPut(aggregationAccountHolding, aggregationAccountHoldingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#updateAggregationAccountHoldingUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHolding** | [**AggregationAccountHolding**](AggregationAccountHolding.md)| aggregation_account_holding |
 **aggregationAccountHoldingId** | [**UUID**](.md)| UUID aggregation_account_holding_id |

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAggregationAccountTransactionUsingPut"></a>
# **updateAggregationAccountTransactionUsingPut**
> AggregationAccountTransaction updateAggregationAccountTransactionUsingPut(aggregationAccountTransaction, aggregationAccountTransactionId)

Update an aggregation account transaction

Update a transaction record for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
AggregationAccountTransaction aggregationAccountTransaction = new AggregationAccountTransaction(); // AggregationAccountTransaction | aggregation_account_transaction
UUID aggregationAccountTransactionId = new UUID(); // UUID | UUID aggregation_account_transaction_id
try {
    AggregationAccountTransaction result = apiInstance.updateAggregationAccountTransactionUsingPut(aggregationAccountTransaction, aggregationAccountTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#updateAggregationAccountTransactionUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransaction** | [**AggregationAccountTransaction**](AggregationAccountTransaction.md)| aggregation_account_transaction |
 **aggregationAccountTransactionId** | [**UUID**](.md)| UUID aggregation_account_transaction_id |

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAggregationAccountUsingPut"></a>
# **updateAggregationAccountUsingPut**
> AggregationAccount updateAggregationAccountUsingPut(aggregationAccount, aggregationAccountId)

Update an aggregation account

Update the information for an aggregation account.

### Example
```java
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.auth.*;
//import AggregationAccountApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

AggregationAccountApi apiInstance = new AggregationAccountApi();
AggregationAccount aggregationAccount = new AggregationAccount(); // AggregationAccount | aggregation_account
UUID aggregationAccountId = new UUID(); // UUID | UUID aggregation_account_id
try {
    AggregationAccount result = apiInstance.updateAggregationAccountUsingPut(aggregationAccount, aggregationAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationAccountApi#updateAggregationAccountUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccount** | [**AggregationAccount**](AggregationAccount.md)| aggregation_account |
 **aggregationAccountId** | [**UUID**](.md)| UUID aggregation_account_id |

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

