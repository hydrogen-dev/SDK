# NotificationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNotificationClientUsingPost**](NotificationApi.md#createNotificationClientUsingPost) | **POST** /notification_client | Create a Notification Client
[**createNotificationSettingUsingPost**](NotificationApi.md#createNotificationSettingUsingPost) | **POST** /notification_setting | Create a Notification Setting
[**createNotificationUsingPost**](NotificationApi.md#createNotificationUsingPost) | **POST** /notification | Create a Notification
[**deleteNotificationClientUsingDelete**](NotificationApi.md#deleteNotificationClientUsingDelete) | **DELETE** /notification_client/{notification_client_id} | Delete a Notification Client
[**deleteNotificationSettingUsingDelete**](NotificationApi.md#deleteNotificationSettingUsingDelete) | **DELETE** /notification_setting/{notification_setting_id} | Delete a Notification Setting
[**deleteNotificationUsingDelete**](NotificationApi.md#deleteNotificationUsingDelete) | **DELETE** /notification/{notification_id} | Delete a Notification
[**getNotificationAllUsingGet**](NotificationApi.md#getNotificationAllUsingGet) | **GET** /notification | Get All Notifications
[**getNotificationClientAllUsingGet**](NotificationApi.md#getNotificationClientAllUsingGet) | **GET** /notification_client | List all Notification Client
[**getNotificationClientUsingGet**](NotificationApi.md#getNotificationClientUsingGet) | **GET** /notification_client/{notification_client_id} | Retrieve a Notification Client
[**getNotificationSettingAllUsingGet**](NotificationApi.md#getNotificationSettingAllUsingGet) | **GET** /notification_setting | List all Notification Setting
[**getNotificationSettingUsingGet**](NotificationApi.md#getNotificationSettingUsingGet) | **GET** /notification_setting/{notification_setting_id} | Retrieve a Notification Setting
[**getNotificationUsingGet**](NotificationApi.md#getNotificationUsingGet) | **GET** /notification/{notification_id} | Get a Notification
[**updateNotificationClientUsingPut**](NotificationApi.md#updateNotificationClientUsingPut) | **PUT** /notification_client/{notification_client_id} | Update a Notification Client
[**updateNotificationSettingUsingPut**](NotificationApi.md#updateNotificationSettingUsingPut) | **PUT** /notification_setting/{notification_setting_id} | Update a Notification Setting
[**updateNotificationUsingPut**](NotificationApi.md#updateNotificationUsingPut) | **PUT** /notification/{notification_id} | Update a Notification


<a name="createNotificationClientUsingPost"></a>
# **createNotificationClientUsingPost**
> NotificationClient createNotificationClientUsingPost(notificationClient)

Create a Notification Client

Create a new Notification Client. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
NotificationClient notificationClient = new NotificationClient(); // NotificationClient | notificationClient
try {
    NotificationClient result = apiInstance.createNotificationClientUsingPost(notificationClient);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#createNotificationClientUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationClient** | [**NotificationClient**](NotificationClient.md)| notificationClient |

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createNotificationSettingUsingPost"></a>
# **createNotificationSettingUsingPost**
> NotificationSetting createNotificationSettingUsingPost(notificationSetting)

Create a Notification Setting

Create a new Notification Setting. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
NotificationSetting notificationSetting = new NotificationSetting(); // NotificationSetting | notificationSetting
try {
    NotificationSetting result = apiInstance.createNotificationSettingUsingPost(notificationSetting);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#createNotificationSettingUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationSetting** | [**NotificationSetting**](NotificationSetting.md)| notificationSetting |

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createNotificationUsingPost"></a>
# **createNotificationUsingPost**
> Notification createNotificationUsingPost(notification)

Create a Notification

Create a new Notification. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
Notification notification = new Notification(); // Notification | notification
try {
    Notification result = apiInstance.createNotificationUsingPost(notification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#createNotificationUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification** | [**Notification**](Notification.md)| notification |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteNotificationClientUsingDelete"></a>
# **deleteNotificationClientUsingDelete**
> deleteNotificationClientUsingDelete(notificationClientId)

Delete a Notification Client

Permanently Delete Notification Client.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
UUID notificationClientId = new UUID(); // UUID | notification_client_id
try {
    apiInstance.deleteNotificationClientUsingDelete(notificationClientId);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#deleteNotificationClientUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationClientId** | [**UUID**](.md)| notification_client_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteNotificationSettingUsingDelete"></a>
# **deleteNotificationSettingUsingDelete**
> deleteNotificationSettingUsingDelete(notificationSettingId)

Delete a Notification Setting

Permanently Delete Notification Setting. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
UUID notificationSettingId = new UUID(); // UUID | notification_setting_id
try {
    apiInstance.deleteNotificationSettingUsingDelete(notificationSettingId);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#deleteNotificationSettingUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationSettingId** | [**UUID**](.md)| notification_setting_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteNotificationUsingDelete"></a>
# **deleteNotificationUsingDelete**
> deleteNotificationUsingDelete(notificationId)

Delete a Notification

Permanently Delete a Notification. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
UUID notificationId = new UUID(); // UUID | UUID notification_id
try {
    apiInstance.deleteNotificationUsingDelete(notificationId);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#deleteNotificationUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | [**UUID**](.md)| UUID notification_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNotificationAllUsingGet"></a>
# **getNotificationAllUsingGet**
> PageNotification getNotificationAllUsingGet(ascending, filter, orderBy, page, size)

Get All Notifications

Get All Notification. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageNotification result = apiInstance.getNotificationAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotificationAllUsingGet");
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

[**PageNotification**](PageNotification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotificationClientAllUsingGet"></a>
# **getNotificationClientAllUsingGet**
> PageNotificationClient getNotificationClientAllUsingGet(ascending, filter, orderBy, page, size)

List all Notification Client

List all Notification Client. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageNotificationClient result = apiInstance.getNotificationClientAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotificationClientAllUsingGet");
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

[**PageNotificationClient**](PageNotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotificationClientUsingGet"></a>
# **getNotificationClientUsingGet**
> NotificationClient getNotificationClientUsingGet(notificationClientId)

Retrieve a Notification Client

Retrieve a  Notification Client. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
UUID notificationClientId = new UUID(); // UUID | notification_client_id
try {
    NotificationClient result = apiInstance.getNotificationClientUsingGet(notificationClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotificationClientUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationClientId** | [**UUID**](.md)| notification_client_id |

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNotificationSettingAllUsingGet"></a>
# **getNotificationSettingAllUsingGet**
> PageNotificationSetting getNotificationSettingAllUsingGet(ascending, filter, orderBy, page, size)

List all Notification Setting

List all Notification Setting. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageNotificationSetting result = apiInstance.getNotificationSettingAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotificationSettingAllUsingGet");
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

[**PageNotificationSetting**](PageNotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotificationSettingUsingGet"></a>
# **getNotificationSettingUsingGet**
> NotificationSetting getNotificationSettingUsingGet(notificationSettingId)

Retrieve a Notification Setting

Retrieve a  Notification Setting. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
UUID notificationSettingId = new UUID(); // UUID | notification_setting_id
try {
    NotificationSetting result = apiInstance.getNotificationSettingUsingGet(notificationSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotificationSettingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationSettingId** | [**UUID**](.md)| notification_setting_id |

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getNotificationUsingGet"></a>
# **getNotificationUsingGet**
> Notification getNotificationUsingGet(notificationId)

Get a Notification

Get a Notification. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
UUID notificationId = new UUID(); // UUID | notification_id
try {
    Notification result = apiInstance.getNotificationUsingGet(notificationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getNotificationUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | [**UUID**](.md)| notification_id |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNotificationClientUsingPut"></a>
# **updateNotificationClientUsingPut**
> NotificationClient updateNotificationClientUsingPut(notificationClient, notificationClientId)

Update a Notification Client

Update a  Notification Client. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
Object notificationClient = null; // Object | notification_client
UUID notificationClientId = new UUID(); // UUID | UUID notification_client_id
try {
    NotificationClient result = apiInstance.updateNotificationClientUsingPut(notificationClient, notificationClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#updateNotificationClientUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationClient** | **Object**| notification_client |
 **notificationClientId** | [**UUID**](.md)| UUID notification_client_id |

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateNotificationSettingUsingPut"></a>
# **updateNotificationSettingUsingPut**
> NotificationSetting updateNotificationSettingUsingPut(notificationSetting, notificationSettingId)

Update a Notification Setting

Update a  Notification Setting. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
Object notificationSetting = null; // Object | notification_setting
UUID notificationSettingId = new UUID(); // UUID | UUID notification_setting_id
try {
    NotificationSetting result = apiInstance.updateNotificationSettingUsingPut(notificationSetting, notificationSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#updateNotificationSettingUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationSetting** | **Object**| notification_setting |
 **notificationSettingId** | [**UUID**](.md)| UUID notification_setting_id |

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateNotificationUsingPut"></a>
# **updateNotificationUsingPut**
> Notification updateNotificationUsingPut(notification, notificationId)

Update a Notification

Update a Notification. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import NotificationApi;

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
NotificationApi apiInstance = new NotificationApi();
Object notification = null; // Object | notification
UUID notificationId = new UUID(); // UUID | UUID notification_id
try {
    Notification result = apiInstance.updateNotificationUsingPut(notification, notificationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#updateNotificationUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification** | **Object**| notification |
 **notificationId** | [**UUID**](.md)| UUID notification_id |

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

