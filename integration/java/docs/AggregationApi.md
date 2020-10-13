# AggregationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAggregationAccountUsingPost**](AggregationApi.md#createAggregationAccountUsingPost) | **POST** /aggregation/account | Create mapping between client,vendor,tenant
[**createPropertyValueUsingPost**](AggregationApi.md#createPropertyValueUsingPost) | **POST** /property_value | Create mapping between client,vendor,tenant for the property
[**deleteAggregationAccountUsingDelete**](AggregationApi.md#deleteAggregationAccountUsingDelete) | **DELETE** /aggregation/account/{nucleus_aggregation_account_id} | De-Link mapping between client,vendor,tenant
[**getAggregationAccountAllUsingGet**](AggregationApi.md#getAggregationAccountAllUsingGet) | **GET** /aggregation/account | Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client
[**getAggregationAccountBalanceAllUsingGet**](AggregationApi.md#getAggregationAccountBalanceAllUsingGet) | **GET** /aggregation/balance | Fetch all aggregation account balance details with for the given aggregation accounts 
[**getAggregationAccountBalanceUsingGet**](AggregationApi.md#getAggregationAccountBalanceUsingGet) | **GET** /aggregation/balance/{nucleus_aggregation_account_id} | Fetch aggregation account balance details with the mapping created in POST endpoint
[**getAggregationAccountHoldingAllUsingGet**](AggregationApi.md#getAggregationAccountHoldingAllUsingGet) | **GET** /aggregation/holding | Fetch all aggregation account(s) holding details with the mapping created in POST endpoint
[**getAggregationAccountHoldingUsingGet**](AggregationApi.md#getAggregationAccountHoldingUsingGet) | **GET** /aggregation/holding/{nucleus_aggregation_account_id} | Fetch aggregation account holding details with the mapping created in POST endpoint
[**getAggregationAccountTransactionAllUsingGet**](AggregationApi.md#getAggregationAccountTransactionAllUsingGet) | **GET** /aggregation/transaction | Fetch all aggregation account balance details with for the given aggregation accounts 
[**getAggregationAccountTransactionUsingGet**](AggregationApi.md#getAggregationAccountTransactionUsingGet) | **GET** /aggregation/transaction/{nucleus_aggregation_account_id} | Fetch aggregation account transaction details with the mapping created in POST endpoint
[**getAggregationAccountUsingGet**](AggregationApi.md#getAggregationAccountUsingGet) | **GET** /aggregation/account/{nucleus_aggregation_account_id} | Fetch aggregation account details with the mapping created in POST endpoint


<a name="createAggregationAccountUsingPost"></a>
# **createAggregationAccountUsingPost**
> AggregationAccountsResponseVO createAggregationAccountUsingPost(aggregationRequestObject)

Create mapping between client,vendor,tenant

Create mapping between client,vendor,tenant

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
AggregationRequestObject aggregationRequestObject = new AggregationRequestObject(); // AggregationRequestObject | aggregationRequestObject
try {
    AggregationAccountsResponseVO result = apiInstance.createAggregationAccountUsingPost(aggregationRequestObject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#createAggregationAccountUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationRequestObject** | [**AggregationRequestObject**](AggregationRequestObject.md)| aggregationRequestObject |

### Return type

[**AggregationAccountsResponseVO**](AggregationAccountsResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPropertyValueUsingPost"></a>
# **createPropertyValueUsingPost**
> PropertyValueResponseVO createPropertyValueUsingPost(aggregationRequestObject)

Create mapping between client,vendor,tenant for the property

Create mapping between client,vendor,tenant for property

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
AggregationRequestObject aggregationRequestObject = new AggregationRequestObject(); // AggregationRequestObject | aggregationRequestObject
try {
    PropertyValueResponseVO result = apiInstance.createPropertyValueUsingPost(aggregationRequestObject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#createPropertyValueUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationRequestObject** | [**AggregationRequestObject**](AggregationRequestObject.md)| aggregationRequestObject |

### Return type

[**PropertyValueResponseVO**](PropertyValueResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAggregationAccountUsingDelete"></a>
# **deleteAggregationAccountUsingDelete**
> deleteAggregationAccountUsingDelete(nucleusAggregationAccountId)

De-Link mapping between client,vendor,tenant

De-Link mapping between client,vendor,tenant

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
UUID nucleusAggregationAccountId = new UUID(); // UUID | nucleus_aggregation_account_id
try {
    apiInstance.deleteAggregationAccountUsingDelete(nucleusAggregationAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#deleteAggregationAccountUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusAggregationAccountId** | [**UUID**](.md)| nucleus_aggregation_account_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountAllUsingGet"></a>
# **getAggregationAccountAllUsingGet**
> List&lt;AggregationAccountResponseVO&gt; getAggregationAccountAllUsingGet(aggregationAccountIdList)

Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client

Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
List<UUID> aggregationAccountIdList = Arrays.asList(new UUID()); // List<UUID> | aggregation_account_id_list
try {
    List<AggregationAccountResponseVO> result = apiInstance.getAggregationAccountAllUsingGet(aggregationAccountIdList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#getAggregationAccountAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountIdList** | [**List&lt;UUID&gt;**](UUID.md)| aggregation_account_id_list |

### Return type

[**List&lt;AggregationAccountResponseVO&gt;**](AggregationAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountBalanceAllUsingGet"></a>
# **getAggregationAccountBalanceAllUsingGet**
> List&lt;AggregationAccountBalanceResponseVO&gt; getAggregationAccountBalanceAllUsingGet(aggregationAccountIdList)

Fetch all aggregation account balance details with for the given aggregation accounts 

Fetch all aggregation account balance details with for the given aggregation accounts

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
List<UUID> aggregationAccountIdList = Arrays.asList(new UUID()); // List<UUID> | aggregation_account_id_list
try {
    List<AggregationAccountBalanceResponseVO> result = apiInstance.getAggregationAccountBalanceAllUsingGet(aggregationAccountIdList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#getAggregationAccountBalanceAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountIdList** | [**List&lt;UUID&gt;**](UUID.md)| aggregation_account_id_list |

### Return type

[**List&lt;AggregationAccountBalanceResponseVO&gt;**](AggregationAccountBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountBalanceUsingGet"></a>
# **getAggregationAccountBalanceUsingGet**
> AggregationAccountBalanceResponseVO getAggregationAccountBalanceUsingGet(nucleusAggregationAccountId)

Fetch aggregation account balance details with the mapping created in POST endpoint

Fetch aggregation account balance details with the mapping created in POST endpoint

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
UUID nucleusAggregationAccountId = new UUID(); // UUID | nucleus_aggregation_account_id
try {
    AggregationAccountBalanceResponseVO result = apiInstance.getAggregationAccountBalanceUsingGet(nucleusAggregationAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#getAggregationAccountBalanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusAggregationAccountId** | [**UUID**](.md)| nucleus_aggregation_account_id |

### Return type

[**AggregationAccountBalanceResponseVO**](AggregationAccountBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountHoldingAllUsingGet"></a>
# **getAggregationAccountHoldingAllUsingGet**
> List&lt;AggregationAccountHoldingResponseVO&gt; getAggregationAccountHoldingAllUsingGet(aggregationAccountIdList)

Fetch all aggregation account(s) holding details with the mapping created in POST endpoint

Fetch all aggregation account(s) holding details with the mapping created in POST endpoint

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
List<UUID> aggregationAccountIdList = Arrays.asList(new UUID()); // List<UUID> | aggregation_account_id_list
try {
    List<AggregationAccountHoldingResponseVO> result = apiInstance.getAggregationAccountHoldingAllUsingGet(aggregationAccountIdList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#getAggregationAccountHoldingAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountIdList** | [**List&lt;UUID&gt;**](UUID.md)| aggregation_account_id_list |

### Return type

[**List&lt;AggregationAccountHoldingResponseVO&gt;**](AggregationAccountHoldingResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountHoldingUsingGet"></a>
# **getAggregationAccountHoldingUsingGet**
> AggregationAccountHoldingResponseVO getAggregationAccountHoldingUsingGet(nucleusAggregationAccountId)

Fetch aggregation account holding details with the mapping created in POST endpoint

Fetch aggregation account holding details with the mapping created in POST endpoint

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
UUID nucleusAggregationAccountId = new UUID(); // UUID | nucleus_aggregation_account_id
try {
    AggregationAccountHoldingResponseVO result = apiInstance.getAggregationAccountHoldingUsingGet(nucleusAggregationAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#getAggregationAccountHoldingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusAggregationAccountId** | [**UUID**](.md)| nucleus_aggregation_account_id |

### Return type

[**AggregationAccountHoldingResponseVO**](AggregationAccountHoldingResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountTransactionAllUsingGet"></a>
# **getAggregationAccountTransactionAllUsingGet**
> List&lt;AggregationAccountTransactionResponseVO&gt; getAggregationAccountTransactionAllUsingGet(aggregationAccountIdList)

Fetch all aggregation account balance details with for the given aggregation accounts 

Fetch all aggregation account balance details with for the given aggregation accounts

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
List<UUID> aggregationAccountIdList = Arrays.asList(new UUID()); // List<UUID> | aggregation_account_id_list
try {
    List<AggregationAccountTransactionResponseVO> result = apiInstance.getAggregationAccountTransactionAllUsingGet(aggregationAccountIdList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#getAggregationAccountTransactionAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountIdList** | [**List&lt;UUID&gt;**](UUID.md)| aggregation_account_id_list |

### Return type

[**List&lt;AggregationAccountTransactionResponseVO&gt;**](AggregationAccountTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountTransactionUsingGet"></a>
# **getAggregationAccountTransactionUsingGet**
> AggregationAccountTransactionResponseVO getAggregationAccountTransactionUsingGet(nucleusAggregationAccountId)

Fetch aggregation account transaction details with the mapping created in POST endpoint

Fetch aggregation account transaction details with the mapping created in POST endpoint

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
UUID nucleusAggregationAccountId = new UUID(); // UUID | nucleus_aggregation_account_id
try {
    AggregationAccountTransactionResponseVO result = apiInstance.getAggregationAccountTransactionUsingGet(nucleusAggregationAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#getAggregationAccountTransactionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusAggregationAccountId** | [**UUID**](.md)| nucleus_aggregation_account_id |

### Return type

[**AggregationAccountTransactionResponseVO**](AggregationAccountTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountUsingGet"></a>
# **getAggregationAccountUsingGet**
> AggregationAccountResponseVO getAggregationAccountUsingGet(nucleusAggregationAccountId)

Fetch aggregation account details with the mapping created in POST endpoint

Fetch aggregation account details with the mapping created in POST endpoint

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AggregationApi;

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

AggregationApi apiInstance = new AggregationApi();
UUID nucleusAggregationAccountId = new UUID(); // UUID | nucleus_aggregation_account_id
try {
    AggregationAccountResponseVO result = apiInstance.getAggregationAccountUsingGet(nucleusAggregationAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregationApi#getAggregationAccountUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusAggregationAccountId** | [**UUID**](.md)| nucleus_aggregation_account_id |

### Return type

[**AggregationAccountResponseVO**](AggregationAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

