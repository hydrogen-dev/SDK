# MoleculeApi::TransactionStatusApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_transaction_status_all_using_get**](TransactionStatusApi.md#get_transaction_status_all_using_get) | **GET** /transaction_status | Fetch Transaction Status list
[**get_transaction_status_using_get**](TransactionStatusApi.md#get_transaction_status_using_get) | **GET** /transaction_status/{transaction_id} | Fetch Transaction record details


# **get_transaction_status_all_using_get**
> PageTransactionSuccessResponse get_transaction_status_all_using_get(opts)

Fetch Transaction Status list

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::TransactionStatusApi.new

opts = { 
  hash: 'hash_example', # String | To filter response Transaction record list by Transaction's hash
  wallet_id: 'wallet_id_example', # String | To filter response Transaction record list by Wallet ID
  status: 'status_example', # String | To filter response Transaction record list by Transaction's status
  page: 56, # Integer | To filter response Transaction record list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Transaction Status list
  result = api_instance.get_transaction_status_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TransactionStatusApi->get_transaction_status_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| To filter response Transaction record list by Transaction&#39;s hash | [optional] 
 **wallet_id** | [**String**](.md)| To filter response Transaction record list by Wallet ID | [optional] 
 **status** | **String**| To filter response Transaction record list by Transaction&#39;s status | [optional] 
 **page** | **Integer**| To filter response Transaction record list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageTransactionSuccessResponse**](PageTransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_transaction_status_using_get**
> TransactionSuccessResponse get_transaction_status_using_get(transaction_id)

Fetch Transaction record details

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::TransactionStatusApi.new

transaction_id = 'transaction_id_example' # String | Transaction ID


begin
  #Fetch Transaction record details
  result = api_instance.get_transaction_status_using_get(transaction_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TransactionStatusApi->get_transaction_status_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_id** | [**String**](.md)| Transaction ID | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



