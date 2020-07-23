# swagger_client.DocumentApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_document_using_post**](DocumentApi.md#create_document_using_post) | **POST** /document | Create a new Document
[**get_document_using_get**](DocumentApi.md#get_document_using_get) | **GET** /document/{document_id} | Retrieve a Document
[**verify_document_using_post**](DocumentApi.md#verify_document_using_post) | **POST** /document/verify | Verify a Document


# **create_document_using_post**
> TransactionSuccessResponse create_document_using_post(document_params)

Create a new Document

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.DocumentApi(molecule_api.ApiClient(configuration))
document_params = molecule_api.DocumentParams() # DocumentParams | Enables a user to store a Document hash on the blockchain

try:
    # Create a new Document
    api_response = api_instance.create_document_using_post(document_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DocumentApi->create_document_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_params** | [**DocumentParams**](DocumentParams.md)| Enables a user to store a Document hash on the blockchain | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document_using_get**
> DocumentResponse get_document_using_get(document_id)

Retrieve a Document

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.DocumentApi(molecule_api.ApiClient(configuration))
document_id = 'document_id_example' # str | Document ID

try:
    # Retrieve a Document
    api_response = api_instance.get_document_using_get(document_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DocumentApi->get_document_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | [**str**](.md)| Document ID | 

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_document_using_post**
> DocumentVerifyResponse verify_document_using_post(document_params)

Verify a Document

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.DocumentApi(molecule_api.ApiClient(configuration))
document_params = molecule_api.DocumentParams() # DocumentParams | Enables a user to verify a Document has not been changed

try:
    # Verify a Document
    api_response = api_instance.verify_document_using_post(document_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DocumentApi->verify_document_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_params** | [**DocumentParams**](DocumentParams.md)| Enables a user to verify a Document has not been changed | 

### Return type

[**DocumentVerifyResponse**](DocumentVerifyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

