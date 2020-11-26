# WebhookApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhookUsingPost**](WebhookApi.md#createWebhookUsingPost) | **POST** /webhook | Create a webhook
[**deleteWebhookUsingDelete**](WebhookApi.md#deleteWebhookUsingDelete) | **DELETE** /webhook/{webhook_id} | Delete a webhook
[**getWebhookAllUsingGet**](WebhookApi.md#getWebhookAllUsingGet) | **GET** /webhook | List all webhooks
[**getWebhookUsingGet**](WebhookApi.md#getWebhookUsingGet) | **GET** /webhook/{webhook_id} | Retrieve a webhook
[**updateWebhookUsingPut**](WebhookApi.md#updateWebhookUsingPut) | **PUT** /webhook/{webhook_id} | Update a webhook


<a name="createWebhookUsingPost"></a>
# **createWebhookUsingPost**
> Webhook createWebhookUsingPost(webhookRequest)

Create a webhook

One active webhook service is allowed at all times.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import WebhookApi;

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


WebhookApi apiInstance = new WebhookApi();
Webhook webhookRequest = new Webhook(); // Webhook | webhookRequest
try {
    Webhook result = apiInstance.createWebhookUsingPost(webhookRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#createWebhookUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRequest** | [**Webhook**](Webhook.md)| webhookRequest |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteWebhookUsingDelete"></a>
# **deleteWebhookUsingDelete**
> deleteWebhookUsingDelete(webhookId)

Delete a webhook

Permanently delete a webhook for your firm. The webhook_id must be provided.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import WebhookApi;

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


WebhookApi apiInstance = new WebhookApi();
UUID webhookId = new UUID(); // UUID | UUID webhook_id
try {
    apiInstance.deleteWebhookUsingDelete(webhookId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#deleteWebhookUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**UUID**](.md)| UUID webhook_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebhookAllUsingGet"></a>
# **getWebhookAllUsingGet**
> PageWebhook getWebhookAllUsingGet(ascending, filter, orderBy, page, size)

List all webhooks

Get information for all webhooks defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import WebhookApi;

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


WebhookApi apiInstance = new WebhookApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageWebhook result = apiInstance.getWebhookAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#getWebhookAllUsingGet");
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

[**PageWebhook**](PageWebhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebhookUsingGet"></a>
# **getWebhookUsingGet**
> Webhook getWebhookUsingGet(webhookId)

Retrieve a webhook

Retrieve the information for a specific webhook. The webhook_id must be provided.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import WebhookApi;

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


WebhookApi apiInstance = new WebhookApi();
UUID webhookId = new UUID(); // UUID | UUID webhook_id
try {
    Webhook result = apiInstance.getWebhookUsingGet(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#getWebhookUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**UUID**](.md)| UUID webhook_id |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateWebhookUsingPut"></a>
# **updateWebhookUsingPut**
> Webhook updateWebhookUsingPut(webhook, webhookId)

Update a webhook

Update a webhook for your firm. The webhook_id must be provided

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import WebhookApi;

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


WebhookApi apiInstance = new WebhookApi();
Webhook webhook = new Webhook(); // Webhook | webhook
UUID webhookId = new UUID(); // UUID | UUID webhook_id
try {
    Webhook result = apiInstance.updateWebhookUsingPut(webhook, webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#updateWebhookUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook** | [**Webhook**](Webhook.md)| webhook |
 **webhookId** | [**UUID**](.md)| UUID webhook_id |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

