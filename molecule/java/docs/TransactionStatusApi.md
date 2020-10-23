# TransactionStatusApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionStatusAllUsingGet**](TransactionStatusApi.md#getTransactionStatusAllUsingGet) | **GET** /transaction_status | Fetch Transaction Status list
[**getTransactionStatusUsingGet**](TransactionStatusApi.md#getTransactionStatusUsingGet) | **GET** /transaction_status/{transaction_id} | Fetch Transaction record details


<a name="getTransactionStatusAllUsingGet"></a>
# **getTransactionStatusAllUsingGet**
> PageTransactionSuccessResponse getTransactionStatusAllUsingGet(hash, walletId, status, page, size, orderBy, ascending, getLatest)

Fetch Transaction Status list

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TransactionStatusApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TransactionStatusApi apiInstance = new TransactionStatusApi();
String hash = "hash_example"; // String | To filter response Transaction record list by Transaction's hash
UUID walletId = new UUID(); // UUID | To filter response Transaction record list by Wallet ID
String status = "status_example"; // String | To filter response Transaction record list by Transaction's status
Integer page = 56; // Integer | To filter response Transaction record list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageTransactionSuccessResponse result = apiInstance.getTransactionStatusAllUsingGet(hash, walletId, status, page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionStatusApi#getTransactionStatusAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| To filter response Transaction record list by Transaction&#39;s hash | [optional]
 **walletId** | [**UUID**](.md)| To filter response Transaction record list by Wallet ID | [optional]
 **status** | **String**| To filter response Transaction record list by Transaction&#39;s status | [optional]
 **page** | **Integer**| To filter response Transaction record list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageTransactionSuccessResponse**](PageTransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionStatusUsingGet"></a>
# **getTransactionStatusUsingGet**
> TransactionSuccessResponse getTransactionStatusUsingGet(transactionId)

Fetch Transaction record details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TransactionStatusApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TransactionStatusApi apiInstance = new TransactionStatusApi();
UUID transactionId = new UUID(); // UUID | Transaction ID
try {
    TransactionSuccessResponse result = apiInstance.getTransactionStatusUsingGet(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionStatusApi#getTransactionStatusUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | [**UUID**](.md)| Transaction ID |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

