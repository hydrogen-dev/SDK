# BrokerageApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankLinkUsingPost**](BrokerageApi.md#createBankLinkUsingPost) | **POST** /brokerage/bank_link | create a Bank Link
[**createBrokerageAccountUsingPost**](BrokerageApi.md#createBrokerageAccountUsingPost) | **POST** /brokerage/account | create a Brokerage account
[**createBrokerageClientUsingPost**](BrokerageApi.md#createBrokerageClientUsingPost) | **POST** /brokerage/client | Create a Brokerage Client
[**createOrderUsingPost**](BrokerageApi.md#createOrderUsingPost) | **POST** /brokerage/order | Create an Order
[**deleteBankLinkUsingDelete**](BrokerageApi.md#deleteBankLinkUsingDelete) | **DELETE** /brokerage/bank_link/{nucleus_bank_link_id} | Delete a Bank Link
[**deleteOrderUsingDelete**](BrokerageApi.md#deleteOrderUsingDelete) | **DELETE** /brokerage/order | Delete an Order
[**getBankLinkUsingGet**](BrokerageApi.md#getBankLinkUsingGet) | **GET** /brokerage/bank_link/{nucleus_bank_link_id} | Get a Bank Link
[**getBrokerageAccountStatementUsingGet**](BrokerageApi.md#getBrokerageAccountStatementUsingGet) | **GET** /brokerage/{nucleus_account_id}/statement | Get a Brokerage account statement
[**getOrderUsingGet**](BrokerageApi.md#getOrderUsingGet) | **GET** /brokerage/order | Get an Order
[**updateBankLinkUsingPut**](BrokerageApi.md#updateBankLinkUsingPut) | **PUT** /brokerage/bank_link/{nucleus_bank_link_id} | Update a Bank Link
[**updateBrokerageClientUsingPut**](BrokerageApi.md#updateBrokerageClientUsingPut) | **PUT** /brokerage/client | Update a Brokerage client


<a name="createBankLinkUsingPost"></a>
# **createBankLinkUsingPost**
> BrokerageBankLinkVO createBankLinkUsingPost(brokerageBankLinkCO)

create a Bank Link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
BrokerageBankLinkCO brokerageBankLinkCO = new BrokerageBankLinkCO(); // BrokerageBankLinkCO | brokerageBankLinkCO
try {
    BrokerageBankLinkVO result = apiInstance.createBankLinkUsingPost(brokerageBankLinkCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createBankLinkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageBankLinkCO** | [**BrokerageBankLinkCO**](BrokerageBankLinkCO.md)| brokerageBankLinkCO |

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBrokerageAccountUsingPost"></a>
# **createBrokerageAccountUsingPost**
> BrokerageAccountVO createBrokerageAccountUsingPost(brokerageAccountCO)

create a Brokerage account

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
BrokerageAccountCO brokerageAccountCO = new BrokerageAccountCO(); // BrokerageAccountCO | brokerageAccountCO
try {
    BrokerageAccountVO result = apiInstance.createBrokerageAccountUsingPost(brokerageAccountCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createBrokerageAccountUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageAccountCO** | [**BrokerageAccountCO**](BrokerageAccountCO.md)| brokerageAccountCO |

### Return type

[**BrokerageAccountVO**](BrokerageAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBrokerageClientUsingPost"></a>
# **createBrokerageClientUsingPost**
> BrokerageCreateClientVO createBrokerageClientUsingPost(clientCO)

Create a Brokerage Client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
BrokerageClientCO clientCO = new BrokerageClientCO(); // BrokerageClientCO | clientCO
try {
    BrokerageCreateClientVO result = apiInstance.createBrokerageClientUsingPost(clientCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createBrokerageClientUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCO** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO |

### Return type

[**BrokerageCreateClientVO**](BrokerageCreateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOrderUsingPost"></a>
# **createOrderUsingPost**
> CreateOrderResponse createOrderUsingPost(nucleusOrderId)

Create an Order

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusOrderId = new UUID(); // UUID | nucleus_order_id
try {
    CreateOrderResponse result = apiInstance.createOrderUsingPost(nucleusOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#createOrderUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusOrderId** | [**UUID**](.md)| nucleus_order_id |

### Return type

[**CreateOrderResponse**](CreateOrderResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBankLinkUsingDelete"></a>
# **deleteBankLinkUsingDelete**
> ResponseEntity deleteBankLinkUsingDelete(nucleusBankLinkId)

Delete a Bank Link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    ResponseEntity result = apiInstance.deleteBankLinkUsingDelete(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#deleteBankLinkUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteOrderUsingDelete"></a>
# **deleteOrderUsingDelete**
> deleteOrderUsingDelete(nucleusOrderId)

Delete an Order

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusOrderId = new UUID(); // UUID | nucleus_order_id
try {
    apiInstance.deleteOrderUsingDelete(nucleusOrderId);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#deleteOrderUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusOrderId** | [**UUID**](.md)| nucleus_order_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankLinkUsingGet"></a>
# **getBankLinkUsingGet**
> BrokerageBankLinkVO getBankLinkUsingGet(nucleusBankLinkId)

Get a Bank Link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    BrokerageBankLinkVO result = apiInstance.getBankLinkUsingGet(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getBankLinkUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBrokerageAccountStatementUsingGet"></a>
# **getBrokerageAccountStatementUsingGet**
> BrokerageStatementVO getBrokerageAccountStatementUsingGet(endDate, nucleusAccountId, startDate, statementType)

Get a Brokerage account statement

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | end_date
UUID nucleusAccountId = new UUID(); // UUID | nucleus_account_id
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | start_date
String statementType = "statementType_example"; // String | statement_type
try {
    BrokerageStatementVO result = apiInstance.getBrokerageAccountStatementUsingGet(endDate, nucleusAccountId, startDate, statementType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getBrokerageAccountStatementUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | **OffsetDateTime**| end_date |
 **nucleusAccountId** | [**UUID**](.md)| nucleus_account_id |
 **startDate** | **OffsetDateTime**| start_date |
 **statementType** | **String**| statement_type |

### Return type

[**BrokerageStatementVO**](BrokerageStatementVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderUsingGet"></a>
# **getOrderUsingGet**
> GetOrderResponse getOrderUsingGet(nucleusOrderId)

Get an Order

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusOrderId = new UUID(); // UUID | nucleus_order_id
try {
    GetOrderResponse result = apiInstance.getOrderUsingGet(nucleusOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#getOrderUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusOrderId** | [**UUID**](.md)| nucleus_order_id |

### Return type

[**GetOrderResponse**](GetOrderResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBankLinkUsingPut"></a>
# **updateBankLinkUsingPut**
> BrokerageBankLinkVO updateBankLinkUsingPut(nucleusBankLinkId)

Update a Bank Link

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
UUID nucleusBankLinkId = new UUID(); // UUID | nucleus_bank_link_id
try {
    BrokerageBankLinkVO result = apiInstance.updateBankLinkUsingPut(nucleusBankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#updateBankLinkUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**UUID**](.md)| nucleus_bank_link_id |

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateBrokerageClientUsingPut"></a>
# **updateBrokerageClientUsingPut**
> BrokerageUpdateClientVO updateBrokerageClientUsingPut(clientCO)

Update a Brokerage client

### Example
```java
// Import classes:
//import com.hydrogen.integration.ApiException;
//import com.hydrogen.integration.AuthApiClient;
//import BrokerageApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
   authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
   authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                           "USERNAME", "PASSWORD");           
} catch (ApiException e) {
   e.printStackTrace();
}
BrokerageApi apiInstance = new BrokerageApi();
BrokerageClientCO clientCO = new BrokerageClientCO(); // BrokerageClientCO | clientCO
try {
    BrokerageUpdateClientVO result = apiInstance.updateBrokerageClientUsingPut(clientCO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BrokerageApi#updateBrokerageClientUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCO** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO |

### Return type

[**BrokerageUpdateClientVO**](BrokerageUpdateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

