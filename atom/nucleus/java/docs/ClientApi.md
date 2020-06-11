# ClientApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClientHydroUsingPost**](ClientApi.md#createClientHydroUsingPost) | **POST** /client_hydro | Create a client-hydro relationship
[**createClientStatusUsingPost**](ClientApi.md#createClientStatusUsingPost) | **POST** /client_status | Create an client status
[**createClientUsingPost**](ClientApi.md#createClientUsingPost) | **POST** /client | Create a client
[**deleteClientHydroUsingDelete**](ClientApi.md#deleteClientHydroUsingDelete) | **DELETE** /client_hydro/{client_hydro_id} | Delete a client-hydro relationship
[**deleteClientStatusUsingDelete**](ClientApi.md#deleteClientStatusUsingDelete) | **DELETE** /client_status/{client_status_id} | Delete an client status
[**deleteClientUsingDelete**](ClientApi.md#deleteClientUsingDelete) | **DELETE** /client/{client_id} | Delete a client
[**getClientAccountOverviewUsingGet**](ClientApi.md#getClientAccountOverviewUsingGet) | **GET** /client/{client_id}/account_overview | List all client Account overview
[**getClientAdvisorOverviewUsingGet**](ClientApi.md#getClientAdvisorOverviewUsingGet) | **GET** /client/{client_id}/advisor_overview | Advisor overview
[**getClientAllUsingGet**](ClientApi.md#getClientAllUsingGet) | **GET** /client | List all clients
[**getClientAssetSizeUsingGet**](ClientApi.md#getClientAssetSizeUsingGet) | **GET** /client/{client_id}/asset_size | List all client asset sizes
[**getClientGoalOverviewUsingGet**](ClientApi.md#getClientGoalOverviewUsingGet) | **GET** /client/{client_id}/goal_overview | Retrieve client&#39;s goal details 
[**getClientHoldingUsingGet**](ClientApi.md#getClientHoldingUsingGet) | **GET** /client/{client_id}/holding | List all client holdings
[**getClientHydroAllUsingGet**](ClientApi.md#getClientHydroAllUsingGet) | **GET** /client_hydro | List all client-hydro relationship
[**getClientHydroUsingGet**](ClientApi.md#getClientHydroUsingGet) | **GET** /client_hydro/{client_hydro_id} | Retrieve a client-hydro relationship
[**getClientStatusAllUsingGet**](ClientApi.md#getClientStatusAllUsingGet) | **GET** /client_status | List all client statuses
[**getClientStatusUsingGet**](ClientApi.md#getClientStatusUsingGet) | **GET** /client_status/{client_status_id} | Retrieve an client status
[**getClientTransactionUsingGet**](ClientApi.md#getClientTransactionUsingGet) | **GET** /client/{client_id}/transaction | List all client transactions
[**getClientUsingGet**](ClientApi.md#getClientUsingGet) | **GET** /client/{client_id} | Retrieve a client
[**getTotalClientsUsingGet**](ClientApi.md#getTotalClientsUsingGet) | **GET** /client/total_clients | total clients
[**updateClientHydroUsingPut**](ClientApi.md#updateClientHydroUsingPut) | **PUT** /client_hydro/{client_hydro_id} | Update a client-hydro relationship
[**updateClientStatusUsingPut**](ClientApi.md#updateClientStatusUsingPut) | **PUT** /client_status/{client_status_id} | Update an client status
[**updateClientUsingPut**](ClientApi.md#updateClientUsingPut) | **PUT** /client/{client_id} | Update a client


<a name="createClientHydroUsingPost"></a>
# **createClientHydroUsingPost**
> ClientHydro createClientHydroUsingPost(clientHydro)

Create a client-hydro relationship

Create an client-hydro relationship under a client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
ClientHydro clientHydro = new ClientHydro(); // ClientHydro | clientHydro
try {
    ClientHydro result = apiInstance.createClientHydroUsingPost(clientHydro);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClientHydroUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientHydro** | [**ClientHydro**](ClientHydro.md)| clientHydro |

### Return type

[**ClientHydro**](ClientHydro.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createClientStatusUsingPost"></a>
# **createClientStatusUsingPost**
> ClientStatus createClientStatusUsingPost(clientStatusRequest)

Create an client status

Create an client status record for an client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
ClientStatus clientStatusRequest = new ClientStatus(); // ClientStatus | clientStatusRequest
try {
    ClientStatus result = apiInstance.createClientStatusUsingPost(clientStatusRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClientStatusUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientStatusRequest** | [**ClientStatus**](ClientStatus.md)| clientStatusRequest |

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createClientUsingPost"></a>
# **createClientUsingPost**
> Client createClientUsingPost(clientRequest)

Create a client

Create a new client, or register a new user, with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
Client clientRequest = new Client(); // Client | clientRequest
try {
    Client result = apiInstance.createClientUsingPost(clientRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClientUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientRequest** | [**Client**](Client.md)| clientRequest |

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteClientHydroUsingDelete"></a>
# **deleteClientHydroUsingDelete**
> deleteClientHydroUsingDelete(clientHydroId)

Delete a client-hydro relationship

Permanently delete a client-hydro relationship for a Hydro ID and a client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientHydroId = new UUID(); // UUID | UUID client_hydro_id
try {
    apiInstance.deleteClientHydroUsingDelete(clientHydroId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#deleteClientHydroUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientHydroId** | [**UUID**](.md)| UUID client_hydro_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteClientStatusUsingDelete"></a>
# **deleteClientStatusUsingDelete**
> deleteClientStatusUsingDelete(clientStatusId)

Delete an client status

Permanently delete an client status record from an client’s history.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientStatusId = new UUID(); // UUID | UUID client_status_id
try {
    apiInstance.deleteClientStatusUsingDelete(clientStatusId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#deleteClientStatusUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientStatusId** | [**UUID**](.md)| UUID client_status_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteClientUsingDelete"></a>
# **deleteClientUsingDelete**
> deleteClientUsingDelete(clientId)

Delete a client

Permanently delete a client registered with your firm. Turns the client&#39;s is_active  &#x3D; 0

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientId = new UUID(); // UUID | UUID client_id
try {
    apiInstance.deleteClientUsingDelete(clientId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#deleteClientUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| UUID client_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientAccountOverviewUsingGet"></a>
# **getClientAccountOverviewUsingGet**
> ClientAccountVO getClientAccountOverviewUsingGet(clientId, ascending, orderBy)

List all client Account overview

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientId = new UUID(); // UUID | UUID client_id
Boolean ascending = false; // Boolean | ascending
String orderBy = "update_date"; // String | order_by
try {
    ClientAccountVO result = apiInstance.getClientAccountOverviewUsingGet(clientId, ascending, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientAccountOverviewUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| UUID client_id |
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **orderBy** | **String**| order_by | [optional] [default to update_date]

### Return type

[**ClientAccountVO**](ClientAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientAdvisorOverviewUsingGet"></a>
# **getClientAdvisorOverviewUsingGet**
> AdvisorOverviewVO getClientAdvisorOverviewUsingGet(clientId, showClients)

Advisor overview

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientId = new UUID(); // UUID | UUID client_id
Boolean showClients = false; // Boolean | show_clients
try {
    AdvisorOverviewVO result = apiInstance.getClientAdvisorOverviewUsingGet(clientId, showClients);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientAdvisorOverviewUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| UUID client_id |
 **showClients** | **Boolean**| show_clients | [optional] [default to false]

### Return type

[**AdvisorOverviewVO**](AdvisorOverviewVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientAllUsingGet"></a>
# **getClientAllUsingGet**
> PageClient getClientAllUsingGet(ascending, filter, orderBy, page, size)

List all clients

Get details for all clients registered with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageClient result = apiInstance.getClientAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientAllUsingGet");
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

[**PageClient**](PageClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientAssetSizeUsingGet"></a>
# **getClientAssetSizeUsingGet**
> List&lt;AvailableDateDoubleVO&gt; getClientAssetSizeUsingGet(clientId, endDate, excludeSubledger, getLatest, sortType, startDate)

List all client asset sizes

Get a list of asset sizes per date for a client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientId = new UUID(); // UUID | UUID client_id
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Boolean excludeSubledger = false; // Boolean | exclude_subledger
Boolean getLatest = true; // Boolean | true or false
String sortType = "sortType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    List<AvailableDateDoubleVO> result = apiInstance.getClientAssetSizeUsingGet(clientId, endDate, excludeSubledger, getLatest, sortType, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientAssetSizeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| UUID client_id |
 **endDate** | **LocalDate**| end date | [optional] [default to null]
 **excludeSubledger** | **Boolean**| exclude_subledger | [optional] [default to false]
 **getLatest** | **Boolean**| true or false | [optional]
 **sortType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional]
 **startDate** | **LocalDate**| start date | [optional] [default to null]

### Return type

[**List&lt;AvailableDateDoubleVO&gt;**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientGoalOverviewUsingGet"></a>
# **getClientGoalOverviewUsingGet**
> VClientGoalViewData getClientGoalOverviewUsingGet(clientId, portfolioGoal)

Retrieve client&#39;s goal details 

Retrieve client&#39;s goal details

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientId = new UUID(); // UUID | UUID client_id
Boolean portfolioGoal = false; // Boolean | portfolio_goal
try {
    VClientGoalViewData result = apiInstance.getClientGoalOverviewUsingGet(clientId, portfolioGoal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientGoalOverviewUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| UUID client_id |
 **portfolioGoal** | **Boolean**| portfolio_goal | [optional] [default to false]

### Return type

[**VClientGoalViewData**](VClientGoalViewData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientHoldingUsingGet"></a>
# **getClientHoldingUsingGet**
> List&lt;PortfolioHoldingAgg&gt; getClientHoldingUsingGet(clientId, endDate, getLatest, startDate)

List all client holdings

Get the information for all the securities that are currently being held by a client registered with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientId = new UUID(); // UUID | UUID client_id
String endDate = "endDate_example"; // String | end date - yyyy-mm-dd
Boolean getLatest = true; // Boolean | true or false
String startDate = "startDate_example"; // String | start date - yyyy-mm-dd
try {
    List<PortfolioHoldingAgg> result = apiInstance.getClientHoldingUsingGet(clientId, endDate, getLatest, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientHoldingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| UUID client_id |
 **endDate** | **String**| end date - yyyy-mm-dd | [optional]
 **getLatest** | **Boolean**| true or false | [optional]
 **startDate** | **String**| start date - yyyy-mm-dd | [optional]

### Return type

[**List&lt;PortfolioHoldingAgg&gt;**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientHydroAllUsingGet"></a>
# **getClientHydroAllUsingGet**
> PageClientHydro getClientHydroAllUsingGet(ascending, filter, orderBy, page, size)

List all client-hydro relationship

Get information for all client-hydro relationships for all clients defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageClientHydro result = apiInstance.getClientHydroAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientHydroAllUsingGet");
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

[**PageClientHydro**](PageClientHydro.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientHydroUsingGet"></a>
# **getClientHydroUsingGet**
> ClientHydro getClientHydroUsingGet(clientHydroId)

Retrieve a client-hydro relationship

Retrieve the information for a specific client-hydro relationship.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientHydroId = new UUID(); // UUID | UUID client_hydro_id
try {
    ClientHydro result = apiInstance.getClientHydroUsingGet(clientHydroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientHydroUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientHydroId** | [**UUID**](.md)| UUID client_hydro_id |

### Return type

[**ClientHydro**](ClientHydro.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientStatusAllUsingGet"></a>
# **getClientStatusAllUsingGet**
> PageClientStatus getClientStatusAllUsingGet(ascending, filter, orderBy, page, size)

List all client statuses

Get the client status history information for all clients.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageClientStatus result = apiInstance.getClientStatusAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientStatusAllUsingGet");
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

[**PageClientStatus**](PageClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientStatusUsingGet"></a>
# **getClientStatusUsingGet**
> ClientStatus getClientStatusUsingGet(clientStatusId)

Retrieve an client status

Retrieve the information for a specific client status record for an client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientStatusId = new UUID(); // UUID | UUID client_status_id
try {
    ClientStatus result = apiInstance.getClientStatusUsingGet(clientStatusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientStatusUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientStatusId** | [**UUID**](.md)| UUID client_status_id |

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientTransactionUsingGet"></a>
# **getClientTransactionUsingGet**
> PagePortfolioTransaction getClientTransactionUsingGet(clientId, ascending, endDate, orderBy, page, size, startDate)

List all client transactions

Get the information for all transactions under a client registered with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientId = new UUID(); // UUID | UUID client_id
Boolean ascending = false; // Boolean | ascending
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
try {
    PagePortfolioTransaction result = apiInstance.getClientTransactionUsingGet(clientId, ascending, endDate, orderBy, page, size, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientTransactionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| UUID client_id |
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **endDate** | **OffsetDateTime**| end_date | [optional] [default to null]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **OffsetDateTime**| start_date | [optional] [default to null]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientUsingGet"></a>
# **getClientUsingGet**
> Client getClientUsingGet(clientId)

Retrieve a client

Retrieve the information for a client registered with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
UUID clientId = new UUID(); // UUID | UUID client_id
try {
    Client result = apiInstance.getClientUsingGet(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| UUID client_id |

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTotalClientsUsingGet"></a>
# **getTotalClientsUsingGet**
> ClientAnalyticsResponse getTotalClientsUsingGet(asOfDate, clientId, endDate, showHistory, startDate)

total clients

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
OffsetDateTime asOfDate = OffsetDateTime.now(); // OffsetDateTime | as_of_date
String clientId = "clientId_example"; // String | client_id
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
Boolean showHistory = false; // Boolean | show_history
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
try {
    ClientAnalyticsResponse result = apiInstance.getTotalClientsUsingGet(asOfDate, clientId, endDate, showHistory, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getTotalClientsUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asOfDate** | **OffsetDateTime**| as_of_date | [optional] [default to #{new java.util.Date()}]
 **clientId** | **String**| client_id | [optional]
 **endDate** | **OffsetDateTime**| end_date | [optional]
 **showHistory** | **Boolean**| show_history | [optional] [default to false]
 **startDate** | **OffsetDateTime**| start_date | [optional]

### Return type

[**ClientAnalyticsResponse**](ClientAnalyticsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateClientHydroUsingPut"></a>
# **updateClientHydroUsingPut**
> ClientHydro updateClientHydroUsingPut(clientHydro, clientHydroId)

Update a client-hydro relationship

Update the information for a client-hydro relationship.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
ClientHydro clientHydro = new ClientHydro(); // ClientHydro | client_hydro
UUID clientHydroId = new UUID(); // UUID | UUID client_hydro_id
try {
    ClientHydro result = apiInstance.updateClientHydroUsingPut(clientHydro, clientHydroId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#updateClientHydroUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientHydro** | [**ClientHydro**](ClientHydro.md)| client_hydro |
 **clientHydroId** | [**UUID**](.md)| UUID client_hydro_id |

### Return type

[**ClientHydro**](ClientHydro.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateClientStatusUsingPut"></a>
# **updateClientStatusUsingPut**
> ClientStatus updateClientStatusUsingPut(clientStatus, clientStatusId)

Update an client status

Update an client status record for an client.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
ClientStatus clientStatus = new ClientStatus(); // ClientStatus | client_status
UUID clientStatusId = new UUID(); // UUID | UUID client_status_id
try {
    ClientStatus result = apiInstance.updateClientStatusUsingPut(clientStatus, clientStatusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#updateClientStatusUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientStatus** | [**ClientStatus**](ClientStatus.md)| client_status |
 **clientStatusId** | [**UUID**](.md)| UUID client_status_id |

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateClientUsingPut"></a>
# **updateClientUsingPut**
> Client updateClientUsingPut(client, clientId)

Update a client

Update the information for a client registered with your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ClientApi;

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

ClientApi apiInstance = new ClientApi();
Client client = new Client(); // Client | client
UUID clientId = new UUID(); // UUID | UUID client_id
try {
    Client result = apiInstance.updateClientUsingPut(client, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#updateClientUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**Client**](Client.md)| client |
 **clientId** | [**UUID**](.md)| UUID client_id |

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

