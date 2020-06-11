# RoundupApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoundupSettingsUsingPost**](RoundupApi.md#createRoundupSettingsUsingPost) | **POST** /roundup_setting | Create a Roundup Settings
[**createRoundupUsingPost**](RoundupApi.md#createRoundupUsingPost) | **POST** /roundup | Create a roundup
[**deleteRoundupSettingsUsingDelete**](RoundupApi.md#deleteRoundupSettingsUsingDelete) | **DELETE** /roundup_setting/{roundup_setting_id} | Delete a roundup settings
[**getRoundupAllUsingGet**](RoundupApi.md#getRoundupAllUsingGet) | **GET** /roundup | List all roundups
[**getRoundupSettingsAllUsingGet**](RoundupApi.md#getRoundupSettingsAllUsingGet) | **GET** /roundup_setting | List all roundup settings
[**getRoundupSettingsUsingGet**](RoundupApi.md#getRoundupSettingsUsingGet) | **GET** /roundup_setting/{roundup_setting_id} | Retrieve a Roundup Setting
[**getRoundupUsingGet**](RoundupApi.md#getRoundupUsingGet) | **GET** /roundup/{roundup_id} | Retrieve a Roundup
[**updateRoundupSettingsUsingPut**](RoundupApi.md#updateRoundupSettingsUsingPut) | **PUT** /roundup_setting/{roundup_setting_id} | Update a roundup settings


<a name="createRoundupSettingsUsingPost"></a>
# **createRoundupSettingsUsingPost**
> RoundupSettings createRoundupSettingsUsingPost(roundupSettings)

Create a Roundup Settings

Create a Roundup Settings for Roundup amount with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RoundupApi;

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

RoundupApi apiInstance = new RoundupApi();
RoundupSettings roundupSettings = new RoundupSettings(); // RoundupSettings | roundupSettings
try {
    RoundupSettings result = apiInstance.createRoundupSettingsUsingPost(roundupSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoundupApi#createRoundupSettingsUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupSettings** | [**RoundupSettings**](RoundupSettings.md)| roundupSettings |

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createRoundupUsingPost"></a>
# **createRoundupUsingPost**
> Roundup createRoundupUsingPost(roundupCO)

Create a roundup

Create a new roundup with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RoundupApi;

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

RoundupApi apiInstance = new RoundupApi();
RoundupCO roundupCO = new RoundupCO(); // RoundupCO | roundupCO
try {
    Roundup result = apiInstance.createRoundupUsingPost(roundupCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoundupApi#createRoundupUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupCO** | [**RoundupCO**](RoundupCO.md)| roundupCO |

### Return type

[**Roundup**](Roundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteRoundupSettingsUsingDelete"></a>
# **deleteRoundupSettingsUsingDelete**
> deleteRoundupSettingsUsingDelete(roundupSettingId)

Delete a roundup settings

Permanently delete a  roundup settings registered with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RoundupApi;

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

RoundupApi apiInstance = new RoundupApi();
UUID roundupSettingId = new UUID(); // UUID | UUID roundup_setting_id
try {
    apiInstance.deleteRoundupSettingsUsingDelete(roundupSettingId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoundupApi#deleteRoundupSettingsUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupSettingId** | [**UUID**](.md)| UUID roundup_setting_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRoundupAllUsingGet"></a>
# **getRoundupAllUsingGet**
> PageRoundup getRoundupAllUsingGet(ascending, filter, orderBy, page, size)

List all roundups

Get details for all roundups.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RoundupApi;

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

RoundupApi apiInstance = new RoundupApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageRoundup result = apiInstance.getRoundupAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoundupApi#getRoundupAllUsingGet");
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

[**PageRoundup**](PageRoundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRoundupSettingsAllUsingGet"></a>
# **getRoundupSettingsAllUsingGet**
> PageRoundupSettings getRoundupSettingsAllUsingGet(ascending, filter, orderBy, page, size)

List all roundup settings

Get details for all roundup setting with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RoundupApi;

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

RoundupApi apiInstance = new RoundupApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageRoundupSettings result = apiInstance.getRoundupSettingsAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoundupApi#getRoundupSettingsAllUsingGet");
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

[**PageRoundupSettings**](PageRoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRoundupSettingsUsingGet"></a>
# **getRoundupSettingsUsingGet**
> RoundupSettings getRoundupSettingsUsingGet(roundupSettingId)

Retrieve a Roundup Setting

Retrieve the information for a Roundup Settings with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RoundupApi;

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

RoundupApi apiInstance = new RoundupApi();
UUID roundupSettingId = new UUID(); // UUID | UUID roundup_setting_id
try {
    RoundupSettings result = apiInstance.getRoundupSettingsUsingGet(roundupSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoundupApi#getRoundupSettingsUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupSettingId** | [**UUID**](.md)| UUID roundup_setting_id |

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRoundupUsingGet"></a>
# **getRoundupUsingGet**
> Roundup getRoundupUsingGet(roundupId)

Retrieve a Roundup

Retrieve the information for a Roundup.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RoundupApi;

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

RoundupApi apiInstance = new RoundupApi();
UUID roundupId = new UUID(); // UUID | UUID roundup_id
try {
    Roundup result = apiInstance.getRoundupUsingGet(roundupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoundupApi#getRoundupUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupId** | [**UUID**](.md)| UUID roundup_id |

### Return type

[**Roundup**](Roundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateRoundupSettingsUsingPut"></a>
# **updateRoundupSettingsUsingPut**
> RoundupSettings updateRoundupSettingsUsingPut(roundupSetting, roundupSettingId)

Update a roundup settings

Update the information for a roundup setting registered with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import RoundupApi;

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

RoundupApi apiInstance = new RoundupApi();
RoundupSettings roundupSetting = new RoundupSettings(); // RoundupSettings | roundup_setting
UUID roundupSettingId = new UUID(); // UUID | UUID roundup_setting_id
try {
    RoundupSettings result = apiInstance.updateRoundupSettingsUsingPut(roundupSetting, roundupSettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoundupApi#updateRoundupSettingsUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundupSetting** | [**RoundupSettings**](RoundupSettings.md)| roundup_setting |
 **roundupSettingId** | [**UUID**](.md)| UUID roundup_setting_id |

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

