# GoalApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGoalTrackUsingPost**](GoalApi.md#createGoalTrackUsingPost) | **POST** /goal_track | Create a goal track record
[**createGoalUsingPost**](GoalApi.md#createGoalUsingPost) | **POST** /goal | Create a goal
[**deleteGoalTrackUsingDelete**](GoalApi.md#deleteGoalTrackUsingDelete) | **DELETE** /goal_track/{goal_track_id} | Delete a goal track record
[**deleteGoalUsingDelete**](GoalApi.md#deleteGoalUsingDelete) | **DELETE** /goal/{goal_id} | Delete a goal
[**getGoalAllUsingGet**](GoalApi.md#getGoalAllUsingGet) | **GET** /goal | List all goals
[**getGoalAssetSizeAllUsingGet**](GoalApi.md#getGoalAssetSizeAllUsingGet) | **GET** /goal/{goal_id}/asset_size | List goal asset sizes
[**getGoalHoldingAllUsingGet**](GoalApi.md#getGoalHoldingAllUsingGet) | **GET** /goal/{goal_id}/holding | List goal holdings
[**getGoalTrackAllUsingGet**](GoalApi.md#getGoalTrackAllUsingGet) | **GET** /goal_track | List all goal track records
[**getGoalTrackUsingGet**](GoalApi.md#getGoalTrackUsingGet) | **GET** /goal_track/{goal_track_id} | Retrieve a goal track record
[**getGoalTransactionAllUsingGet**](GoalApi.md#getGoalTransactionAllUsingGet) | **GET** /goal/{goal_id}/transaction | List goal transactions
[**getGoalUsingGet**](GoalApi.md#getGoalUsingGet) | **GET** /goal/{goal_id} | Retrieve a goal
[**updateGoalTrackUsingPut**](GoalApi.md#updateGoalTrackUsingPut) | **PUT** /goal_track/{goal_track_id} | Update a goal track record
[**updateGoalUsingPut**](GoalApi.md#updateGoalUsingPut) | **PUT** /goal/{goal_id} | Update a goal


<a name="createGoalTrackUsingPost"></a>
# **createGoalTrackUsingPost**
> GoalTrack createGoalTrackUsingPost(goalTrack)

Create a goal track record

Create a goal track record for a goal under a client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
GoalTrack goalTrack = new GoalTrack(); // GoalTrack | goalTrack
try {
    GoalTrack result = apiInstance.createGoalTrackUsingPost(goalTrack);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#createGoalTrackUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrack** | [**GoalTrack**](GoalTrack.md)| goalTrack |

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createGoalUsingPost"></a>
# **createGoalUsingPost**
> Goal createGoalUsingPost(goalRequest)

Create a goal

Create a new goal for your firm that clients can customize for themselves.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
Goal goalRequest = new Goal(); // Goal | goalRequest
try {
    Goal result = apiInstance.createGoalUsingPost(goalRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#createGoalUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalRequest** | [**Goal**](Goal.md)| goalRequest |

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteGoalTrackUsingDelete"></a>
# **deleteGoalTrackUsingDelete**
> deleteGoalTrackUsingDelete(goalTrackId, goalTrackId2)

Delete a goal track record

Permanently delete an goal track record for a goal under a client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
UUID goalTrackId = new UUID(); // UUID | UUID goal_track_id
UUID goalTrackId2 = new UUID(); // UUID | goal_track_id
try {
    apiInstance.deleteGoalTrackUsingDelete(goalTrackId, goalTrackId2);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#deleteGoalTrackUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrackId** | [**UUID**](.md)| UUID goal_track_id |
 **goalTrackId2** | [**UUID**](.md)| goal_track_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteGoalUsingDelete"></a>
# **deleteGoalUsingDelete**
> deleteGoalUsingDelete(goalId)

Delete a goal

Permanently delete a goal for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
UUID goalId = new UUID(); // UUID | UUID goal_id
try {
    apiInstance.deleteGoalUsingDelete(goalId);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#deleteGoalUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | [**UUID**](.md)| UUID goal_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalAllUsingGet"></a>
# **getGoalAllUsingGet**
> PageGoal getGoalAllUsingGet(ascending, filter, orderBy, page, size)

List all goals

Get the details for all goals defined by your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageGoal result = apiInstance.getGoalAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#getGoalAllUsingGet");
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

[**PageGoal**](PageGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalAssetSizeAllUsingGet"></a>
# **getGoalAssetSizeAllUsingGet**
> List&lt;AvailableDateDoubleVO&gt; getGoalAssetSizeAllUsingGet(clientId, goalId, endDate, getLatest, portfolioGoal, sortType, startDate)

List goal asset sizes

Get a list of asset sizes per date for a goal for a specified client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
UUID clientId = new UUID(); // UUID | client_id
UUID goalId = new UUID(); // UUID | UUID goal_id
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
Boolean getLatest = false; // Boolean | get_latest
Boolean portfolioGoal = false; // Boolean | portfolio_goal
String sortType = "sortType_example"; // String | sort_type
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
try {
    List<AvailableDateDoubleVO> result = apiInstance.getGoalAssetSizeAllUsingGet(clientId, goalId, endDate, getLatest, portfolioGoal, sortType, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#getGoalAssetSizeAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| client_id |
 **goalId** | [**UUID**](.md)| UUID goal_id |
 **endDate** | **OffsetDateTime**| end_date | [optional]
 **getLatest** | **Boolean**| get_latest | [optional] [default to false]
 **portfolioGoal** | **Boolean**| portfolio_goal | [optional] [default to false]
 **sortType** | **String**| sort_type | [optional]
 **startDate** | **OffsetDateTime**| start_date | [optional]

### Return type

[**List&lt;AvailableDateDoubleVO&gt;**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalHoldingAllUsingGet"></a>
# **getGoalHoldingAllUsingGet**
> List&lt;PortfolioHoldingAgg&gt; getGoalHoldingAllUsingGet(clientId, goalId, endDate, portfolioGoal, startDate)

List goal holdings

Get the information for all the securities that are currently being held in portfolios associated with a particular goal.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
UUID clientId = new UUID(); // UUID | client_id
UUID goalId = new UUID(); // UUID | UUID goal_id
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
Boolean portfolioGoal = false; // Boolean | portfolio_goal
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
try {
    List<PortfolioHoldingAgg> result = apiInstance.getGoalHoldingAllUsingGet(clientId, goalId, endDate, portfolioGoal, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#getGoalHoldingAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| client_id |
 **goalId** | [**UUID**](.md)| UUID goal_id |
 **endDate** | **OffsetDateTime**| end_date | [optional]
 **portfolioGoal** | **Boolean**| portfolio_goal | [optional] [default to false]
 **startDate** | **OffsetDateTime**| start_date | [optional]

### Return type

[**List&lt;PortfolioHoldingAgg&gt;**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalTrackAllUsingGet"></a>
# **getGoalTrackAllUsingGet**
> PageGoalTrack getGoalTrackAllUsingGet(ascending, endDate, filter, getLatest, orderBy, page, size, startDate)

List all goal track records

Get information for all goal track records stored for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
Boolean ascending = false; // Boolean | ascending
String endDate = "endDate_example"; // String | end date 
String filter = "filter_example"; // String | filter
Boolean getLatest = true; // Boolean | true or false
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
String startDate = "startDate_example"; // String | start date 
try {
    PageGoalTrack result = apiInstance.getGoalTrackAllUsingGet(ascending, endDate, filter, getLatest, orderBy, page, size, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#getGoalTrackAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **endDate** | **String**| end date  | [optional]
 **filter** | **String**| filter | [optional]
 **getLatest** | **Boolean**| true or false | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **String**| start date  | [optional]

### Return type

[**PageGoalTrack**](PageGoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalTrackUsingGet"></a>
# **getGoalTrackUsingGet**
> GoalTrack getGoalTrackUsingGet(goalTrackId, goalTrackId2)

Retrieve a goal track record

Retrieve the information for a specific goal track record for a goal under a client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
UUID goalTrackId = new UUID(); // UUID | UUID goal_track_id
UUID goalTrackId2 = new UUID(); // UUID | goal_track_id
try {
    GoalTrack result = apiInstance.getGoalTrackUsingGet(goalTrackId, goalTrackId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#getGoalTrackUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrackId** | [**UUID**](.md)| UUID goal_track_id |
 **goalTrackId2** | [**UUID**](.md)| goal_track_id |

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalTransactionAllUsingGet"></a>
# **getGoalTransactionAllUsingGet**
> PagePortfolioTransaction getGoalTransactionAllUsingGet(clientId, goalId, ascending, endDate, orderBy, page, portfolioGoal, size, startDate)

List goal transactions

Get the information for all transactions under portfolios associated with a particular goal.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
UUID clientId = new UUID(); // UUID | client_id
UUID goalId = new UUID(); // UUID | UUID goal_id
Boolean ascending = false; // Boolean | ascending
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Boolean portfolioGoal = false; // Boolean | portfolio_goal
Integer size = 25; // Integer | size
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
try {
    PagePortfolioTransaction result = apiInstance.getGoalTransactionAllUsingGet(clientId, goalId, ascending, endDate, orderBy, page, portfolioGoal, size, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#getGoalTransactionAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| client_id |
 **goalId** | [**UUID**](.md)| UUID goal_id |
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **endDate** | **OffsetDateTime**| end_date | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **portfolioGoal** | **Boolean**| portfolio_goal | [optional] [default to false]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **OffsetDateTime**| start_date | [optional]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalUsingGet"></a>
# **getGoalUsingGet**
> Goal getGoalUsingGet(goalId)

Retrieve a goal

Retrieve the information for a goal defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
UUID goalId = new UUID(); // UUID | UUID goal_id
try {
    Goal result = apiInstance.getGoalUsingGet(goalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#getGoalUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | [**UUID**](.md)| UUID goal_id |

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateGoalTrackUsingPut"></a>
# **updateGoalTrackUsingPut**
> GoalTrack updateGoalTrackUsingPut(goalTrack, goalTrackId)

Update a goal track record

Update the information for a goal track record.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
GoalTrack goalTrack = new GoalTrack(); // GoalTrack | goal_track
UUID goalTrackId = new UUID(); // UUID | UUID goal_track_id
try {
    GoalTrack result = apiInstance.updateGoalTrackUsingPut(goalTrack, goalTrackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#updateGoalTrackUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrack** | [**GoalTrack**](GoalTrack.md)| goal_track |
 **goalTrackId** | [**UUID**](.md)| UUID goal_track_id |

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateGoalUsingPut"></a>
# **updateGoalUsingPut**
> Goal updateGoalUsingPut(goal, goalId)

Update a goal

Update a goal defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import GoalApi;

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

GoalApi apiInstance = new GoalApi();
Goal goal = new Goal(); // Goal | goal
UUID goalId = new UUID(); // UUID | UUID goal_id
try {
    Goal result = apiInstance.updateGoalUsingPut(goal, goalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalApi#updateGoalUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal** | [**Goal**](Goal.md)| goal |
 **goalId** | [**UUID**](.md)| UUID goal_id |

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

