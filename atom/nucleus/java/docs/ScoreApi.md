# ScoreApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScoreUsingPost**](ScoreApi.md#createScoreUsingPost) | **POST** /score | Create a score
[**deleteScoreUsingDelete**](ScoreApi.md#deleteScoreUsingDelete) | **DELETE** /score/{score_id} | Delete a score
[**getScoreAllUsingGet**](ScoreApi.md#getScoreAllUsingGet) | **GET** /score | List all scores
[**getScoreUsingGet**](ScoreApi.md#getScoreUsingGet) | **GET** /score/{score_id} | Retrieve a score
[**updateScoreUsingPut**](ScoreApi.md#updateScoreUsingPut) | **PUT** /score/{score_id} | Update a score


<a name="createScoreUsingPost"></a>
# **createScoreUsingPost**
> Score createScoreUsingPost(score)

Create a score

Create a score for a client, account, goal, portfolio, allocation, model, benchmark or security.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ScoreApi;

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


ScoreApi apiInstance = new ScoreApi();
Score score = new Score(); // Score | score
try {
    Score result = apiInstance.createScoreUsingPost(score);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScoreApi#createScoreUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score** | [**Score**](Score.md)| score |

### Return type

[**Score**](Score.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteScoreUsingDelete"></a>
# **deleteScoreUsingDelete**
> deleteScoreUsingDelete(scoreId)

Delete a score

Permanently delete a score

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ScoreApi;

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


ScoreApi apiInstance = new ScoreApi();
UUID scoreId = new UUID(); // UUID | UUID score_id
try {
    apiInstance.deleteScoreUsingDelete(scoreId);
} catch (ApiException e) {
    System.err.println("Exception when calling ScoreApi#deleteScoreUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scoreId** | [**UUID**](.md)| UUID score_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getScoreAllUsingGet"></a>
# **getScoreAllUsingGet**
> PageScore getScoreAllUsingGet(ascending, filter, orderBy, page, size)

List all scores

Get information for all scores stored for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ScoreApi;

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


ScoreApi apiInstance = new ScoreApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageScore result = apiInstance.getScoreAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScoreApi#getScoreAllUsingGet");
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

[**PageScore**](PageScore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getScoreUsingGet"></a>
# **getScoreUsingGet**
> Score getScoreUsingGet(scoreId)

Retrieve a score

Retrieve the information for a specific score associated with a client, account, goal, portfolio, allocation, model, benchmark or security.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ScoreApi;

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


ScoreApi apiInstance = new ScoreApi();
UUID scoreId = new UUID(); // UUID | UUID score_id
try {
    Score result = apiInstance.getScoreUsingGet(scoreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScoreApi#getScoreUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scoreId** | [**UUID**](.md)| UUID score_id |

### Return type

[**Score**](Score.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateScoreUsingPut"></a>
# **updateScoreUsingPut**
> Score updateScoreUsingPut(score, scoreId)

Update a score

Update the information for a score.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import ScoreApi;

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


ScoreApi apiInstance = new ScoreApi();
Score score = new Score(); // Score | score
UUID scoreId = new UUID(); // UUID | UUID score_id
try {
    Score result = apiInstance.updateScoreUsingPut(score, scoreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScoreApi#updateScoreUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score** | [**Score**](Score.md)| score |
 **scoreId** | [**UUID**](.md)| UUID score_id |

### Return type

[**Score**](Score.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

