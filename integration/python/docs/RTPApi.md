# integration_api.RTPApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_rtp_transfer_using_delete**](RTPApi.md#cancel_rtp_transfer_using_delete) | **DELETE** /rtp/{nucleus_funding_id} | Cancel the RTP transfer
[**create_bank_link_using_post2**](RTPApi.md#create_bank_link_using_post2) | **POST** /rtp/bank_link | Create bank link
[**delete_bank_link_using_delete2**](RTPApi.md#delete_bank_link_using_delete2) | **DELETE** /rtp/bank_link/{nucleus_bank_link_id} | Delete bank link
[**get_bank_link_using_get2**](RTPApi.md#get_bank_link_using_get2) | **GET** /rtp/bank_link/{nucleus_bank_link_id} | Get bank link
[**get_client_bank_links_using_get1**](RTPApi.md#get_client_bank_links_using_get1) | **GET** /rtp/bank_link/client/{nucleus_client_id} | Get client bank links
[**get_list_of_rtp_transfers_using_get**](RTPApi.md#get_list_of_rtp_transfers_using_get) | **GET** /rtp/client/{nucleus_client_id} | Get a list of Rtp transfers
[**get_rtp_transfer_using_get**](RTPApi.md#get_rtp_transfer_using_get) | **GET** /rtp/{nucleus_funding_id} | Get the RTP transfer
[**submit_rtp_transfer_using_post**](RTPApi.md#submit_rtp_transfer_using_post) | **POST** /rtp | Submit a RTP transfer
[**update_bank_link_using_put2**](RTPApi.md#update_bank_link_using_put2) | **PUT** /rtp/bank_link/{nucleus_bank_link_id} | Update bank link


# **cancel_rtp_transfer_using_delete**
> RtpTransferResponseVO cancel_rtp_transfer_using_delete(nucleus_funding_id)

Cancel the RTP transfer

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
api_instance = integration_api.RTPApi(integration_api.ApiClient(configuration))
nucleus_funding_id = 'nucleus_funding_id_example' # str | nucleus_funding_id

try:
    # Cancel the RTP transfer
    api_response = api_instance.cancel_rtp_transfer_using_delete(nucleus_funding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RTPApi->cancel_rtp_transfer_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**str**](.md)| nucleus_funding_id | 

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_bank_link_using_post2**
> RtpBankLinkResponseVO create_bank_link_using_post2(request)

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
api_instance = integration_api.RTPApi(integration_api.ApiClient(configuration))
request = integration_api.RtpBankLinkRequestCO() # RtpBankLinkRequestCO | request

try:
    # Create bank link
    api_response = api_instance.create_bank_link_using_post2(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RTPApi->create_bank_link_using_post2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RtpBankLinkRequestCO**](RtpBankLinkRequestCO.md)| request | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_bank_link_using_delete2**
> RtpBankLinkResponseVO delete_bank_link_using_delete2(nucleus_bank_link_id)

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
api_instance = integration_api.RTPApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Delete bank link
    api_response = api_instance.delete_bank_link_using_delete2(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RTPApi->delete_bank_link_using_delete2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bank_link_using_get2**
> RtpBankLinkResponseVO get_bank_link_using_get2(nucleus_bank_link_id)

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
api_instance = integration_api.RTPApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Get bank link
    api_response = api_instance.get_bank_link_using_get2(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RTPApi->get_bank_link_using_get2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_bank_links_using_get1**
> list[RtpBankLinkResponseVO] get_client_bank_links_using_get1(nucleus_client_id)

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
api_instance = integration_api.RTPApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id

try:
    # Get client bank links
    api_response = api_instance.get_client_bank_links_using_get1(nucleus_client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RTPApi->get_client_bank_links_using_get1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 

### Return type

[**list[RtpBankLinkResponseVO]**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_list_of_rtp_transfers_using_get**
> list[RtpTransferResponseVO] get_list_of_rtp_transfers_using_get(nucleus_client_id)

Get a list of Rtp transfers

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
api_instance = integration_api.RTPApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id

try:
    # Get a list of Rtp transfers
    api_response = api_instance.get_list_of_rtp_transfers_using_get(nucleus_client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RTPApi->get_list_of_rtp_transfers_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 

### Return type

[**list[RtpTransferResponseVO]**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rtp_transfer_using_get**
> RtpTransferResponseVO get_rtp_transfer_using_get(nucleus_funding_id)

Get the RTP transfer

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
api_instance = integration_api.RTPApi(integration_api.ApiClient(configuration))
nucleus_funding_id = 'nucleus_funding_id_example' # str | nucleus_funding_id

try:
    # Get the RTP transfer
    api_response = api_instance.get_rtp_transfer_using_get(nucleus_funding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RTPApi->get_rtp_transfer_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**str**](.md)| nucleus_funding_id | 

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_rtp_transfer_using_post**
> RtpTransferResponseVO submit_rtp_transfer_using_post(transfer_request)

Submit a RTP transfer

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
api_instance = integration_api.RTPApi(integration_api.ApiClient(configuration))
transfer_request = integration_api.RtpTransferRequestCO() # RtpTransferRequestCO | transferRequest

try:
    # Submit a RTP transfer
    api_response = api_instance.submit_rtp_transfer_using_post(transfer_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RTPApi->submit_rtp_transfer_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**RtpTransferRequestCO**](RtpTransferRequestCO.md)| transferRequest | 

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_bank_link_using_put2**
> RtpBankLinkResponseVO update_bank_link_using_put2(nucleus_bank_link_id)

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
api_instance = integration_api.RTPApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Update bank link
    api_response = api_instance.update_bank_link_using_put2(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RTPApi->update_bank_link_using_put2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

