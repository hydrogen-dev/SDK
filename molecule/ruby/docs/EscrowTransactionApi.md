# MoleculeApi::EscrowTransactionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_escrow_transaction_using_post**](EscrowTransactionApi.md#create_escrow_transaction_using_post) | **POST** /escrow_transaction | Create a new Escrow Transaction
[**get_escrow_transaction_all_using_get**](EscrowTransactionApi.md#get_escrow_transaction_all_using_get) | **GET** /escrow_transaction | List all Escrow Transaction
[**get_escrow_transaction_using_get**](EscrowTransactionApi.md#get_escrow_transaction_using_get) | **GET** /escrow_transaction/{escrow_transaction_id} | Fetch Escrow Transaction
[**update_escrow_transaction_using_put**](EscrowTransactionApi.md#update_escrow_transaction_using_put) | **PUT** /escrow_transaction/{escrow_transaction_id} | Update Escrow Transaction


# **create_escrow_transaction_using_post**
> EscrowTransactionResponse create_escrow_transaction_using_post(escrow_deposit_params)

Create a new Escrow Transaction

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::EscrowTransactionApi.new

escrow_deposit_params = MoleculeApi::EscrowDepositParams.new # EscrowDepositParams | It enables a user to create a escrow transaction


begin
  #Create a new Escrow Transaction
  result = api_instance.create_escrow_transaction_using_post(escrow_deposit_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling EscrowTransactionApi->create_escrow_transaction_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_deposit_params** | [**EscrowDepositParams**](EscrowDepositParams.md)| It enables a user to create a escrow transaction | 

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_escrow_transaction_all_using_get**
> PageEscrowTransactionResponse get_escrow_transaction_all_using_get(opts)

List all Escrow Transaction

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::EscrowTransactionApi.new

opts = { 
  page: 56, # Integer | To filter response Escrow Transaction list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #List all Escrow Transaction
  result = api_instance.get_escrow_transaction_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling EscrowTransactionApi->get_escrow_transaction_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| To filter response Escrow Transaction list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageEscrowTransactionResponse**](PageEscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_escrow_transaction_using_get**
> EscrowTransactionResponse get_escrow_transaction_using_get(escrow_transaction_id)

Fetch Escrow Transaction

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::EscrowTransactionApi.new

escrow_transaction_id = 'escrow_transaction_id_example' # String | Escrow Transaction ID


begin
  #Fetch Escrow Transaction
  result = api_instance.get_escrow_transaction_using_get(escrow_transaction_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling EscrowTransactionApi->get_escrow_transaction_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_transaction_id** | [**String**](.md)| Escrow Transaction ID | 

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_escrow_transaction_using_put**
> EscrowTransactionResponse update_escrow_transaction_using_put(escrow_transaction_id, opts)

Update Escrow Transaction

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::EscrowTransactionApi.new

escrow_transaction_id = 'escrow_transaction_id_example' # String | Escrow Transaction ID

opts = { 
  escrow_deposit_params: MoleculeApi::EscrowDepositParams.new # EscrowDepositParams | It enables a user to create a escrow transaction
}

begin
  #Update Escrow Transaction
  result = api_instance.update_escrow_transaction_using_put(escrow_transaction_id, opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling EscrowTransactionApi->update_escrow_transaction_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_transaction_id** | [**String**](.md)| Escrow Transaction ID | 
 **escrow_deposit_params** | [**EscrowDepositParams**](EscrowDepositParams.md)| It enables a user to create a escrow transaction | [optional] 

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



