# FundingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankLinkUsingPost**](FundingApi.md#createBankLinkUsingPost) | **POST** /bank_link | Create a bank link
[**createDepositUsingPost**](FundingApi.md#createDepositUsingPost) | **POST** /deposit | Create a deposit request
[**createFundingUsingPost**](FundingApi.md#createFundingUsingPost) | **POST** /funding | Create a funding request
[**createTransferUsingPost**](FundingApi.md#createTransferUsingPost) | **POST** /transfer | Create a transfer requests
[**createWithdrawalUsingPost**](FundingApi.md#createWithdrawalUsingPost) | **POST** /withdrawal | Create a withdrawal request
[**deleteBankLinkUsingDelete**](FundingApi.md#deleteBankLinkUsingDelete) | **DELETE** /bank_link/{bank_link_id} | Delete a bank link
[**deleteDepositUsingDelete**](FundingApi.md#deleteDepositUsingDelete) | **DELETE** /deposit/{deposit_id} | Delete a deposit request
[**deleteFundingUsingDelete**](FundingApi.md#deleteFundingUsingDelete) | **DELETE** /funding/{funding_id} | Delete a funding request
[**deleteTransferUsingDelete**](FundingApi.md#deleteTransferUsingDelete) | **DELETE** /transfer/{transfer_id} | Delete a transfer request
[**deleteWithdrawalUsingDelete**](FundingApi.md#deleteWithdrawalUsingDelete) | **DELETE** /withdrawal/{withdrawal_id} | Delete a withdrawal request
[**getBankLinkAllUsingGet**](FundingApi.md#getBankLinkAllUsingGet) | **GET** /bank_link | List all bank links
[**getBankLinkUsingGet**](FundingApi.md#getBankLinkUsingGet) | **GET** /bank_link/{bank_link_id} | Retrieve a bank link
[**getDepositAllUsingGet**](FundingApi.md#getDepositAllUsingGet) | **GET** /deposit | List all deposit requests
[**getDepositUsingGet**](FundingApi.md#getDepositUsingGet) | **GET** /deposit/{deposit_id} | Retrieve a deposit request
[**getFundingAllUsingGet**](FundingApi.md#getFundingAllUsingGet) | **GET** /funding | List all funding requests 
[**getFundingUsingGet**](FundingApi.md#getFundingUsingGet) | **GET** /funding/{funding_id} | Retrieve a funding request
[**getTransferAllUsingGet**](FundingApi.md#getTransferAllUsingGet) | **GET** /transfer | List all transfer requests
[**getTransferUsingGet**](FundingApi.md#getTransferUsingGet) | **GET** /transfer/{transfer_id} | Retrieve a transfer request
[**getWithdrawalAllUsingGet**](FundingApi.md#getWithdrawalAllUsingGet) | **GET** /withdrawal | List all withdrawal requests
[**getWithdrawalUsingGet**](FundingApi.md#getWithdrawalUsingGet) | **GET** /withdrawal/{withdrawal_id} | Retrieve a withdrawal request
[**updateBankLinkBulkUsingPut**](FundingApi.md#updateBankLinkBulkUsingPut) | **PUT** /bulk_bank_link | Update list of bank link
[**updateBankLinkUsingPut**](FundingApi.md#updateBankLinkUsingPut) | **PUT** /bank_link/{bank_link_id} | Update a bank link
[**updateDepositUsingPut**](FundingApi.md#updateDepositUsingPut) | **PUT** /deposit/{deposit_id} | Update a deposit request
[**updateFundingUsingPut**](FundingApi.md#updateFundingUsingPut) | **PUT** /funding/{funding_id} | Update a funding request
[**updateTransferUsingPut**](FundingApi.md#updateTransferUsingPut) | **PUT** /transfer/{transfer_id} | Update a transfer request
[**updateWithdrawalUsingPut**](FundingApi.md#updateWithdrawalUsingPut) | **PUT** /withdrawal/{withdrawal_id} | Update a withdrawal request


<a name="createBankLinkUsingPost"></a>
# **createBankLinkUsingPost**
> BankLink createBankLinkUsingPost(bankLinkInfoRequest)

Create a bank link

Create a new bank link for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
BankLink bankLinkInfoRequest = new BankLink(); // BankLink | bankLinkInfoRequest
try {
    BankLink result = apiInstance.createBankLinkUsingPost(bankLinkInfoRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#createBankLinkUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkInfoRequest** | [**BankLink**](BankLink.md)| bankLinkInfoRequest |

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createDepositUsingPost"></a>
# **createDepositUsingPost**
> DailyDeposit createDepositUsingPost(dailyDepositRequest)

Create a deposit request

Create a new deposit request for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
DailyDeposit dailyDepositRequest = new DailyDeposit(); // DailyDeposit | dailyDepositRequest
try {
    DailyDeposit result = apiInstance.createDepositUsingPost(dailyDepositRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#createDepositUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dailyDepositRequest** | [**DailyDeposit**](DailyDeposit.md)| dailyDepositRequest |

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createFundingUsingPost"></a>
# **createFundingUsingPost**
> Funding createFundingUsingPost(fundingRequest)

Create a funding request

Create a new funding request for an account. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Funding fundingRequest = new Funding(); // Funding | fundingRequest
try {
    Funding result = apiInstance.createFundingUsingPost(fundingRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#createFundingUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingRequest** | [**Funding**](Funding.md)| fundingRequest |

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createTransferUsingPost"></a>
# **createTransferUsingPost**
> ExternalAccountTransfer createTransferUsingPost(externalAccountTransferRequest)

Create a transfer requests

Create a new external account transfer for a client account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
ExternalAccountTransfer externalAccountTransferRequest = new ExternalAccountTransfer(); // ExternalAccountTransfer | externalAccountTransferRequest
try {
    ExternalAccountTransfer result = apiInstance.createTransferUsingPost(externalAccountTransferRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#createTransferUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountTransferRequest** | [**ExternalAccountTransfer**](ExternalAccountTransfer.md)| externalAccountTransferRequest |

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createWithdrawalUsingPost"></a>
# **createWithdrawalUsingPost**
> DailyWithdrawal createWithdrawalUsingPost(dailyWithdrawalRequest)

Create a withdrawal request

Create a new withdrawal request for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
DailyWithdrawal dailyWithdrawalRequest = new DailyWithdrawal(); // DailyWithdrawal | dailyWithdrawalRequest
try {
    DailyWithdrawal result = apiInstance.createWithdrawalUsingPost(dailyWithdrawalRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#createWithdrawalUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dailyWithdrawalRequest** | [**DailyWithdrawal**](DailyWithdrawal.md)| dailyWithdrawalRequest |

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBankLinkUsingDelete"></a>
# **deleteBankLinkUsingDelete**
> deleteBankLinkUsingDelete(bankLinkId)

Delete a bank link

Permanently delete a bank link defined for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
UUID bankLinkId = new UUID(); // UUID | UUID bank_link_id
try {
    apiInstance.deleteBankLinkUsingDelete(bankLinkId);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#deleteBankLinkUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkId** | [**UUID**](.md)| UUID bank_link_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteDepositUsingDelete"></a>
# **deleteDepositUsingDelete**
> deleteDepositUsingDelete(depositId)

Delete a deposit request

Permanently delete a deposit request for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
UUID depositId = new UUID(); // UUID | UUID deposit_id
try {
    apiInstance.deleteDepositUsingDelete(depositId);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#deleteDepositUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositId** | [**UUID**](.md)| UUID deposit_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteFundingUsingDelete"></a>
# **deleteFundingUsingDelete**
> deleteFundingUsingDelete(fundingId)

Delete a funding request

Permanently delete a funding request defined for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
UUID fundingId = new UUID(); // UUID | UUID funding_id
try {
    apiInstance.deleteFundingUsingDelete(fundingId);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#deleteFundingUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingId** | [**UUID**](.md)| UUID funding_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteTransferUsingDelete"></a>
# **deleteTransferUsingDelete**
> deleteTransferUsingDelete(transferId)

Delete a transfer request

Permanently delete a external account transfer from a client account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
UUID transferId = new UUID(); // UUID | UUID external_account_transfer_id
try {
    apiInstance.deleteTransferUsingDelete(transferId);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#deleteTransferUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferId** | [**UUID**](.md)| UUID external_account_transfer_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteWithdrawalUsingDelete"></a>
# **deleteWithdrawalUsingDelete**
> deleteWithdrawalUsingDelete(withdrawalId)

Delete a withdrawal request

Permanently delete a withdrawal request from an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
UUID withdrawalId = new UUID(); // UUID | UUID withdrawal_id
try {
    apiInstance.deleteWithdrawalUsingDelete(withdrawalId);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#deleteWithdrawalUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawalId** | [**UUID**](.md)| UUID withdrawal_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankLinkAllUsingGet"></a>
# **getBankLinkAllUsingGet**
> PageBankLink getBankLinkAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all bank links

Get all bank links defined for all clients defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageBankLink result = apiInstance.getBankLinkAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#getBankLinkAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageBankLink**](PageBankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankLinkUsingGet"></a>
# **getBankLinkUsingGet**
> BankLink getBankLinkUsingGet(bankLinkId, currencyConversion)

Retrieve a bank link

Retrieve the information for a bank link for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
UUID bankLinkId = new UUID(); // UUID | UUID bank_link_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    BankLink result = apiInstance.getBankLinkUsingGet(bankLinkId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#getBankLinkUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkId** | [**UUID**](.md)| UUID bank_link_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDepositAllUsingGet"></a>
# **getDepositAllUsingGet**
> PageDailyDeposit getDepositAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all deposit requests

Get the information for all deposit requests for all clients.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageDailyDeposit result = apiInstance.getDepositAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#getDepositAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageDailyDeposit**](PageDailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDepositUsingGet"></a>
# **getDepositUsingGet**
> DailyDeposit getDepositUsingGet(depositId, currencyConversion)

Retrieve a deposit request

Retrieve the information for a deposit request for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
UUID depositId = new UUID(); // UUID | UUID deposit_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    DailyDeposit result = apiInstance.getDepositUsingGet(depositId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#getDepositUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositId** | [**UUID**](.md)| UUID deposit_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFundingAllUsingGet"></a>
# **getFundingAllUsingGet**
> PageFunding getFundingAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all funding requests 

Get the information for all funding requests defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageFunding result = apiInstance.getFundingAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#getFundingAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageFunding**](PageFunding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFundingUsingGet"></a>
# **getFundingUsingGet**
> Funding getFundingUsingGet(fundingId, currencyConversion)

Retrieve a funding request

Retrieve the information for a funding request for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
UUID fundingId = new UUID(); // UUID | UUID funding_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    Funding result = apiInstance.getFundingUsingGet(fundingId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#getFundingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingId** | [**UUID**](.md)| UUID funding_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTransferAllUsingGet"></a>
# **getTransferAllUsingGet**
> PageExternalAccountTransfer getTransferAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all transfer requests

Get the information for all external account transfers defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageExternalAccountTransfer result = apiInstance.getTransferAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#getTransferAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageExternalAccountTransfer**](PageExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTransferUsingGet"></a>
# **getTransferUsingGet**
> ExternalAccountTransfer getTransferUsingGet(transferId, currencyConversion)

Retrieve a transfer request

Retrieve the information for a external account transfer for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
UUID transferId = new UUID(); // UUID | UUID external_account_transfer_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    ExternalAccountTransfer result = apiInstance.getTransferUsingGet(transferId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#getTransferUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferId** | [**UUID**](.md)| UUID external_account_transfer_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWithdrawalAllUsingGet"></a>
# **getWithdrawalAllUsingGet**
> PageDailyWithdrawal getWithdrawalAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size)

List all withdrawal requests

Get the information for all withdrawal requests for all clients.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | currency_conversion
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageDailyWithdrawal result = apiInstance.getWithdrawalAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#getWithdrawalAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageDailyWithdrawal**](PageDailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWithdrawalUsingGet"></a>
# **getWithdrawalUsingGet**
> DailyWithdrawal getWithdrawalUsingGet(withdrawalId, currencyConversion)

Retrieve a withdrawal request

Retrieve the information for a withdrawal request for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
UUID withdrawalId = new UUID(); // UUID | UUID withdrawal_id
String currencyConversion = "currencyConversion_example"; // String | USD
try {
    DailyWithdrawal result = apiInstance.getWithdrawalUsingGet(withdrawalId, currencyConversion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#getWithdrawalUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawalId** | [**UUID**](.md)| UUID withdrawal_id |
 **currencyConversion** | **String**| USD | [optional]

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBankLinkBulkUsingPut"></a>
# **updateBankLinkBulkUsingPut**
> List&lt;BankLink&gt; updateBankLinkBulkUsingPut(bankLinkList)

Update list of bank link

Update bank link list for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
List<Object> bankLinkList = Arrays.asList(new List<Object>()); // List<Object> | bankLinkList
try {
    List<BankLink> result = apiInstance.updateBankLinkBulkUsingPut(bankLinkList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#updateBankLinkBulkUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkList** | **List&lt;Object&gt;**| bankLinkList |

### Return type

[**List&lt;BankLink&gt;**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateBankLinkUsingPut"></a>
# **updateBankLinkUsingPut**
> BankLink updateBankLinkUsingPut(bankLink, bankLinkId)

Update a bank link

Update the information for a bank link for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Object bankLink = null; // Object | bank_link
UUID bankLinkId = new UUID(); // UUID | UUID bank_link_id
try {
    BankLink result = apiInstance.updateBankLinkUsingPut(bankLink, bankLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#updateBankLinkUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLink** | **Object**| bank_link |
 **bankLinkId** | [**UUID**](.md)| UUID bank_link_id |

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateDepositUsingPut"></a>
# **updateDepositUsingPut**
> DailyDeposit updateDepositUsingPut(deposit, depositId)

Update a deposit request

Update the information for a deposit request for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Object deposit = null; // Object | deposit
UUID depositId = new UUID(); // UUID | UUID deposit_id
try {
    DailyDeposit result = apiInstance.updateDepositUsingPut(deposit, depositId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#updateDepositUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit** | **Object**| deposit |
 **depositId** | [**UUID**](.md)| UUID deposit_id |

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateFundingUsingPut"></a>
# **updateFundingUsingPut**
> Funding updateFundingUsingPut(funding, fundingId)

Update a funding request

Update the information for a funding request for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Object funding = null; // Object | funding
UUID fundingId = new UUID(); // UUID | UUID funding_id
try {
    Funding result = apiInstance.updateFundingUsingPut(funding, fundingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#updateFundingUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding** | **Object**| funding |
 **fundingId** | [**UUID**](.md)| UUID funding_id |

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateTransferUsingPut"></a>
# **updateTransferUsingPut**
> ExternalAccountTransfer updateTransferUsingPut(transfer, transferId)

Update a transfer request

Update the information for a external account transfer for a client account. 

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Object transfer = null; // Object | transfer
UUID transferId = new UUID(); // UUID | UUID external_account_transfer_id
try {
    ExternalAccountTransfer result = apiInstance.updateTransferUsingPut(transfer, transferId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#updateTransferUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer** | **Object**| transfer |
 **transferId** | [**UUID**](.md)| UUID external_account_transfer_id |

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateWithdrawalUsingPut"></a>
# **updateWithdrawalUsingPut**
> DailyWithdrawal updateWithdrawalUsingPut(withdrawal, withdrawalId)

Update a withdrawal request

Update the information for a withdrawal request for an account.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import FundingApi;

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
FundingApi apiInstance = new FundingApi();
Object withdrawal = null; // Object | withdrawal
UUID withdrawalId = new UUID(); // UUID | UUID withdrawal_id
try {
    DailyWithdrawal result = apiInstance.updateWithdrawalUsingPut(withdrawal, withdrawalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingApi#updateWithdrawalUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal** | **Object**| withdrawal |
 **withdrawalId** | [**UUID**](.md)| UUID withdrawal_id |

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

