# integration_api.WireApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_wire_transfer_using_delete**](WireApi.md#cancel_wire_transfer_using_delete) | **DELETE** /wire/{nucleus_funding_id} | Cancel the Wire transfer
[**create_bank_link_using_post3**](WireApi.md#create_bank_link_using_post3) | **POST** /wire/bank_link | Create bank link
[**delete_bank_link_using_delete3**](WireApi.md#delete_bank_link_using_delete3) | **DELETE** /wire/bank_link/{nucleus_bank_link_id} | Delete bank link
[**get_bank_link_using_get3**](WireApi.md#get_bank_link_using_get3) | **GET** /wire/bank_link/{nucleus_bank_link_id} | Get bank link
[**get_client_bank_links_using_get2**](WireApi.md#get_client_bank_links_using_get2) | **GET** /wire/bank_link/client/{nucleus_client_id} | Get client bank links
[**get_list_of_wire_transfers_using_get**](WireApi.md#get_list_of_wire_transfers_using_get) | **GET** /wire/client/{nucleus_client_id} | Get a list of Wire transfers
[**get_wire_transfer_using_get**](WireApi.md#get_wire_transfer_using_get) | **GET** /wire/{nucleus_funding_id} | Get the Wire transfer
[**submit_wire_transfer_using_post**](WireApi.md#submit_wire_transfer_using_post) | **POST** /wire | Submit a Wire transfer
[**update_bank_link_using_put3**](WireApi.md#update_bank_link_using_put3) | **PUT** /wire/bank_link/{nucleus_bank_link_id} | Update bank link


# **cancel_wire_transfer_using_delete**
> WireTransferResponseVO cancel_wire_transfer_using_delete(nucleus_funding_id)

Cancel the Wire transfer

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
api_instance = integration_api.WireApi(integration_api.ApiClient(configuration))
nucleus_funding_id = 'nucleus_funding_id_example' # str | nucleus_funding_id

try:
    # Cancel the Wire transfer
    api_response = api_instance.cancel_wire_transfer_using_delete(nucleus_funding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WireApi->cancel_wire_transfer_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**str**](.md)| nucleus_funding_id | 

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_bank_link_using_post3**
> WireBankLinkResponseVO create_bank_link_using_post3(request)

Create bank link

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
api_instance = integration_api.WireApi(integration_api.ApiClient(configuration))
request = integration_api.WireBankLinkRequestCO() # WireBankLinkRequestCO | request

try:
    # Create bank link
    api_response = api_instance.create_bank_link_using_post3(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WireApi->create_bank_link_using_post3: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**WireBankLinkRequestCO**](WireBankLinkRequestCO.md)| request | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_bank_link_using_delete3**
> WireBankLinkResponseVO delete_bank_link_using_delete3(nucleus_bank_link_id)

Delete bank link

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
api_instance = integration_api.WireApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Delete bank link
    api_response = api_instance.delete_bank_link_using_delete3(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WireApi->delete_bank_link_using_delete3: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bank_link_using_get3**
> WireBankLinkResponseVO get_bank_link_using_get3(nucleus_bank_link_id)

Get bank link

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
api_instance = integration_api.WireApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Get bank link
    api_response = api_instance.get_bank_link_using_get3(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WireApi->get_bank_link_using_get3: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_bank_links_using_get2**
> list[WireBankLinkResponseVO] get_client_bank_links_using_get2(nucleus_client_id)

Get client bank links

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
api_instance = integration_api.WireApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id

try:
    # Get client bank links
    api_response = api_instance.get_client_bank_links_using_get2(nucleus_client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WireApi->get_client_bank_links_using_get2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 

### Return type

[**list[WireBankLinkResponseVO]**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_list_of_wire_transfers_using_get**
> list[WireTransferResponseVO] get_list_of_wire_transfers_using_get(nucleus_client_id)

Get a list of Wire transfers

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
api_instance = integration_api.WireApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id

try:
    # Get a list of Wire transfers
    api_response = api_instance.get_list_of_wire_transfers_using_get(nucleus_client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WireApi->get_list_of_wire_transfers_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 

### Return type

[**list[WireTransferResponseVO]**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wire_transfer_using_get**
> WireTransferResponseVO get_wire_transfer_using_get(nucleus_funding_id)

Get the Wire transfer

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
api_instance = integration_api.WireApi(integration_api.ApiClient(configuration))
nucleus_funding_id = 'nucleus_funding_id_example' # str | nucleus_funding_id

try:
    # Get the Wire transfer
    api_response = api_instance.get_wire_transfer_using_get(nucleus_funding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WireApi->get_wire_transfer_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**str**](.md)| nucleus_funding_id | 

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_wire_transfer_using_post**
> WireTransferResponseVO submit_wire_transfer_using_post(transfer_request)

Submit a Wire transfer

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
api_instance = integration_api.WireApi(integration_api.ApiClient(configuration))
transfer_request = integration_api.WireTransferRequestCO() # WireTransferRequestCO | transferRequest

try:
    # Submit a Wire transfer
    api_response = api_instance.submit_wire_transfer_using_post(transfer_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WireApi->submit_wire_transfer_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**WireTransferRequestCO**](WireTransferRequestCO.md)| transferRequest | 

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_bank_link_using_put3**
> WireBankLinkResponseVO update_bank_link_using_put3(nucleus_bank_link_id)

Update bank link

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
api_instance = integration_api.WireApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Update bank link
    api_response = api_instance.update_bank_link_using_put3(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WireApi->update_bank_link_using_put3: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

