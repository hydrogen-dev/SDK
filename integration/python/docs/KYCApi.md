# integration_api.KYCApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_kyc_using_post**](KYCApi.md#create_kyc_using_post) | **POST** /kyc | Do kyc for the client.
[**get_kyc_status_using_get**](KYCApi.md#get_kyc_status_using_get) | **GET** /kyc_status/{nucleus_client_id} | Fetch kyc_status for the given nucleus_client_id


# **create_kyc_using_post**
> KycResponseVo create_kyc_using_post(kyc_request_co)

Do kyc for the client.

Do kyc for the client.

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.KYCApi(integration_api.ApiClient(configuration))
kyc_request_co = integration_api.KycRequestCO() # KycRequestCO | kycRequestCO

try:
    # Do kyc for the client.
    api_response = api_instance.create_kyc_using_post(kyc_request_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling KYCApi->create_kyc_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kyc_request_co** | [**KycRequestCO**](KycRequestCO.md)| kycRequestCO | 

### Return type

[**KycResponseVo**](KycResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_kyc_status_using_get**
> list[KycResponseVo] get_kyc_status_using_get(nucleus_client_id, get_latest=get_latest, kyc_type=kyc_type, product=product)

Fetch kyc_status for the given nucleus_client_id

Fetch kyc_status for the given nucleus_client_id

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.KYCApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id
get_latest = false # bool | get_latest (optional) (default to false)
kyc_type = 'all' # str | kyc_type (optional) (default to all)
product = 'atom' # str | product (optional) (default to atom)

try:
    # Fetch kyc_status for the given nucleus_client_id
    api_response = api_instance.get_kyc_status_using_get(nucleus_client_id, get_latest=get_latest, kyc_type=kyc_type, product=product)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling KYCApi->get_kyc_status_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 
 **get_latest** | **bool**| get_latest | [optional] [default to false]
 **kyc_type** | **str**| kyc_type | [optional] [default to all]
 **product** | **str**| product | [optional] [default to atom]

### Return type

[**list[KycResponseVo]**](KycResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

