# AuditLogApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuditLogAllUsingGet**](AuditLogApi.md#getAuditLogAllUsingGet) | **GET** /audit_log | Gel all audit log


<a name="getAuditLogAllUsingGet"></a>
# **getAuditLogAllUsingGet**
> Pageobject getAuditLogAllUsingGet(ascending, endDate, event, integrationType, isRequest, nucleusClientId, orderBy, page, requestType, size, startDate, vendorName)

Gel all audit log

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import AuditLogApi;

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

AuditLogApi apiInstance = new AuditLogApi();
Boolean ascending = false; // Boolean | ascending
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
String event = "event_example"; // String | event
String integrationType = "integrationType_example"; // String | integration_type
Boolean isRequest = false; // Boolean | is_request
UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
String requestType = "requestType_example"; // String | request_type
Integer size = 25; // Integer | size
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
String vendorName = "vendorName_example"; // String | vendor_name
try {
    Pageobject result = apiInstance.getAuditLogAllUsingGet(ascending, endDate, event, integrationType, isRequest, nucleusClientId, orderBy, page, requestType, size, startDate, vendorName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogApi#getAuditLogAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **endDate** | **OffsetDateTime**| end_date | [optional] [default to null]
 **event** | **String**| event | [optional]
 **integrationType** | **String**| integration_type | [optional]
 **isRequest** | **Boolean**| is_request | [optional] [default to false]
 **nucleusClientId** | [**UUID**](.md)| nucleus_client_id | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **requestType** | **String**| request_type | [optional]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **OffsetDateTime**| start_date | [optional] [default to null]
 **vendorName** | **String**| vendor_name | [optional]

### Return type

[**Pageobject**](Pageobject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

