# FeatureApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFeatureTrackUsingPost**](FeatureApi.md#createFeatureTrackUsingPost) | **POST** /feature_track | Create a Feature Track
[**createFeatureUsingPost**](FeatureApi.md#createFeatureUsingPost) | **POST** /feature | Create a  Feature
[**deleteFeatureTrackUsingDelete**](FeatureApi.md#deleteFeatureTrackUsingDelete) | **DELETE** /feature_track/{feature_track_id} | Delete a Feature Track
[**deleteFeatureUsingDelete**](FeatureApi.md#deleteFeatureUsingDelete) | **DELETE** /feature/{feature_id} | Delete a Feature
[**getFeatureAllUsingGet**](FeatureApi.md#getFeatureAllUsingGet) | **GET** /feature | List all Feature
[**getFeatureTrackAllUsingGet**](FeatureApi.md#getFeatureTrackAllUsingGet) | **GET** /feature_track | List all Feature track
[**getFeatureTrackUsingGet**](FeatureApi.md#getFeatureTrackUsingGet) | **GET** /feature_track/{feature_track_id} | Retrieve a Feature track
[**getFeatureUsingGet**](FeatureApi.md#getFeatureUsingGet) | **GET** /feature/{feature_id} | Retrieve a Feature
[**updateFeatureTrackUsingPut**](FeatureApi.md#updateFeatureTrackUsingPut) | **PUT** /feature_track/{feature_track_id} | Update a Feature Track
[**updateFeatureUsingPut**](FeatureApi.md#updateFeatureUsingPut) | **PUT** /feature/{feature_id} | Update a Feature


<a name="createFeatureTrackUsingPost"></a>
# **createFeatureTrackUsingPost**
> FeatureTrack createFeatureTrackUsingPost(featureTrack)

Create a Feature Track

Create a new feature track.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FeatureApi;

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


FeatureApi apiInstance = new FeatureApi();
FeatureTrack featureTrack = new FeatureTrack(); // FeatureTrack | featureTrack
try {
    FeatureTrack result = apiInstance.createFeatureTrackUsingPost(featureTrack);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#createFeatureTrackUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureTrack** | [**FeatureTrack**](FeatureTrack.md)| featureTrack |

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createFeatureUsingPost"></a>
# **createFeatureUsingPost**
> Feature createFeatureUsingPost(feature)

Create a  Feature

Create a new feature.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FeatureApi;

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


FeatureApi apiInstance = new FeatureApi();
Feature feature = new Feature(); // Feature | feature
try {
    Feature result = apiInstance.createFeatureUsingPost(feature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#createFeatureUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature** | [**Feature**](Feature.md)| feature |

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteFeatureTrackUsingDelete"></a>
# **deleteFeatureTrackUsingDelete**
> deleteFeatureTrackUsingDelete(featureTrackId)

Delete a Feature Track

Permanently delete a feature track registered with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FeatureApi;

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


FeatureApi apiInstance = new FeatureApi();
UUID featureTrackId = new UUID(); // UUID | UUID feature_track_id
try {
    apiInstance.deleteFeatureTrackUsingDelete(featureTrackId);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#deleteFeatureTrackUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureTrackId** | [**UUID**](.md)| UUID feature_track_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteFeatureUsingDelete"></a>
# **deleteFeatureUsingDelete**
> deleteFeatureUsingDelete(featureId)

Delete a Feature

Permanently delete a  feature registered with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FeatureApi;

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


FeatureApi apiInstance = new FeatureApi();
UUID featureId = new UUID(); // UUID | UUID feature_id
try {
    apiInstance.deleteFeatureUsingDelete(featureId);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#deleteFeatureUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureId** | [**UUID**](.md)| UUID feature_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFeatureAllUsingGet"></a>
# **getFeatureAllUsingGet**
> PageFeature getFeatureAllUsingGet(ascending, filter, orderBy, page, size)

List all Feature

Get details for all features.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FeatureApi;

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


FeatureApi apiInstance = new FeatureApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageFeature result = apiInstance.getFeatureAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#getFeatureAllUsingGet");
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

[**PageFeature**](PageFeature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFeatureTrackAllUsingGet"></a>
# **getFeatureTrackAllUsingGet**
> PageFeatureTrack getFeatureTrackAllUsingGet(ascending, filter, orderBy, page, size)

List all Feature track

Get details for all feature track.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FeatureApi;

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


FeatureApi apiInstance = new FeatureApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageFeatureTrack result = apiInstance.getFeatureTrackAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#getFeatureTrackAllUsingGet");
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

[**PageFeatureTrack**](PageFeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFeatureTrackUsingGet"></a>
# **getFeatureTrackUsingGet**
> FeatureTrack getFeatureTrackUsingGet(featureTrackId)

Retrieve a Feature track

Retrieve the information for a Feature track.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FeatureApi;

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


FeatureApi apiInstance = new FeatureApi();
UUID featureTrackId = new UUID(); // UUID | UUID feature_track_id
try {
    FeatureTrack result = apiInstance.getFeatureTrackUsingGet(featureTrackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#getFeatureTrackUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureTrackId** | [**UUID**](.md)| UUID feature_track_id |

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFeatureUsingGet"></a>
# **getFeatureUsingGet**
> Feature getFeatureUsingGet(featureId)

Retrieve a Feature

Retrieve the information for a Feature.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FeatureApi;

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


FeatureApi apiInstance = new FeatureApi();
UUID featureId = new UUID(); // UUID | UUID feature_id
try {
    Feature result = apiInstance.getFeatureUsingGet(featureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#getFeatureUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureId** | [**UUID**](.md)| UUID feature_id |

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateFeatureTrackUsingPut"></a>
# **updateFeatureTrackUsingPut**
> FeatureTrack updateFeatureTrackUsingPut(featureTrack, featureTrackId)

Update a Feature Track

Update the information for a Feature track registered with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FeatureApi;

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


FeatureApi apiInstance = new FeatureApi();
FeatureTrack featureTrack = new FeatureTrack(); // FeatureTrack | feature_track
UUID featureTrackId = new UUID(); // UUID | UUID feature_track_id
try {
    FeatureTrack result = apiInstance.updateFeatureTrackUsingPut(featureTrack, featureTrackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#updateFeatureTrackUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureTrack** | [**FeatureTrack**](FeatureTrack.md)| feature_track |
 **featureTrackId** | [**UUID**](.md)| UUID feature_track_id |

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateFeatureUsingPut"></a>
# **updateFeatureUsingPut**
> Feature updateFeatureUsingPut(feature, featureId)

Update a Feature

Update the information for a Feature registered with your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import FeatureApi;

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


FeatureApi apiInstance = new FeatureApi();
Feature feature = new Feature(); // Feature | feature
UUID featureId = new UUID(); // UUID | UUID feature_id
try {
    Feature result = apiInstance.updateFeatureUsingPut(feature, featureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#updateFeatureUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature** | [**Feature**](Feature.md)| feature |
 **featureId** | [**UUID**](.md)| UUID feature_id |

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

