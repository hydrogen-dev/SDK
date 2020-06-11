# atom_api.SupportApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_chat_using_post**](SupportApi.md#create_chat_using_post) | **POST** /chat | Create a Chat
[**create_consultation_using_post**](SupportApi.md#create_consultation_using_post) | **POST** /consultation | Create a CIO Consultation
[**create_sale_using_post**](SupportApi.md#create_sale_using_post) | **POST** /sales | Create a sales inquiry
[**create_support_ticket_comment_using_post**](SupportApi.md#create_support_ticket_comment_using_post) | **POST** /support_ticket_comment | Create a support ticket comment
[**create_support_ticket_using_post**](SupportApi.md#create_support_ticket_using_post) | **POST** /support_ticket | Create a support ticket
[**delete_chat_using_delete**](SupportApi.md#delete_chat_using_delete) | **DELETE** /chat/{chat_id} | Delete a Chat
[**delete_consultation_using_delete**](SupportApi.md#delete_consultation_using_delete) | **DELETE** /consultation/{consultation_id} | Delete a CIO Consultation
[**delete_sale_using_delete**](SupportApi.md#delete_sale_using_delete) | **DELETE** /sales/{sales_id} | Delete a sales inquiry
[**delete_support_ticket_comment_using_delete**](SupportApi.md#delete_support_ticket_comment_using_delete) | **DELETE** /support_ticket_comment/{support_ticket_comment_id} | Delete a support ticket comment
[**delete_support_ticket_using_delete**](SupportApi.md#delete_support_ticket_using_delete) | **DELETE** /support_ticket/{support_ticket_id} | Delete a support ticket
[**get_chat_all_using_get**](SupportApi.md#get_chat_all_using_get) | **GET** /chat | List all open chats
[**get_chat_using_get**](SupportApi.md#get_chat_using_get) | **GET** /chat/{chat_id} | Retrieve a Chat
[**get_consultation_all_using_get**](SupportApi.md#get_consultation_all_using_get) | **GET** /consultation | List all CIO Consultation
[**get_consultation_using_get**](SupportApi.md#get_consultation_using_get) | **GET** /consultation/{consultation_id} | Retrieve a CIO Consultation
[**get_sale_all_using_get**](SupportApi.md#get_sale_all_using_get) | **GET** /sales | List all sales inquiries
[**get_sale_using_get**](SupportApi.md#get_sale_using_get) | **GET** /sales/{sales_id} | Retrieve a sales record
[**get_support_ticket_all_using_get**](SupportApi.md#get_support_ticket_all_using_get) | **GET** /support_ticket | List all support tickets
[**get_support_ticket_comment_all_using_get**](SupportApi.md#get_support_ticket_comment_all_using_get) | **GET** /support_ticket_comment | List all support ticket comments
[**get_support_ticket_comment_using_get**](SupportApi.md#get_support_ticket_comment_using_get) | **GET** /support_ticket_comment/{support_ticket_comment_id} | Retrieve a support ticket comment
[**get_support_ticket_using_get**](SupportApi.md#get_support_ticket_using_get) | **GET** /support_ticket/{support_ticket_id} | Retrieve a support ticket
[**update_chat_using_put**](SupportApi.md#update_chat_using_put) | **PUT** /chat/{chat_id} | Update a Chat
[**update_consultation_using_put**](SupportApi.md#update_consultation_using_put) | **PUT** /consultation/{consultation_id} | Update a CIO Consultation
[**update_sale_using_put**](SupportApi.md#update_sale_using_put) | **PUT** /sales/{sales_id} | Update a sales inquiry
[**update_support_ticket_comment_using_put**](SupportApi.md#update_support_ticket_comment_using_put) | **PUT** /support_ticket_comment/{support_ticket_comment_id} | Update a support ticket comment
[**update_support_ticket_using_put**](SupportApi.md#update_support_ticket_using_put) | **PUT** /support_ticket/{support_ticket_id} | Update a support ticket


# **create_chat_using_post**
> ChatInfo create_chat_using_post(chat_info_request)

Create a Chat

Create a Chat

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
chat_info_request = atom_api.ChatInfo() # ChatInfo | chatInfoRequest

try:
    # Create a Chat
    api_response = api_instance.create_chat_using_post(chat_info_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->create_chat_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_info_request** | [**ChatInfo**](ChatInfo.md)| chatInfoRequest | 

### Return type

[**ChatInfo**](ChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_consultation_using_post**
> Consultation create_consultation_using_post(cio_consultation_request)

Create a CIO Consultation

Create a new CIO Consultation

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
cio_consultation_request = atom_api.Consultation() # Consultation | cioConsultationRequest

try:
    # Create a CIO Consultation
    api_response = api_instance.create_consultation_using_post(cio_consultation_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->create_consultation_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cio_consultation_request** | [**Consultation**](Consultation.md)| cioConsultationRequest | 

### Return type

[**Consultation**](Consultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_sale_using_post**
> Sale create_sale_using_post(sale_request)

Create a sales inquiry

Create a new sales inquiry for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
sale_request = atom_api.Sale() # Sale | saleRequest

try:
    # Create a sales inquiry
    api_response = api_instance.create_sale_using_post(sale_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->create_sale_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sale_request** | [**Sale**](Sale.md)| saleRequest | 

### Return type

[**Sale**](Sale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_support_ticket_comment_using_post**
> SupportTicket create_support_ticket_comment_using_post(support_ticker_comment_request)

Create a support ticket comment

Create a new support ticket comment for a support ticket.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
support_ticker_comment_request = atom_api.SupportTicketComment() # SupportTicketComment | supportTickerCommentRequest

try:
    # Create a support ticket comment
    api_response = api_instance.create_support_ticket_comment_using_post(support_ticker_comment_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->create_support_ticket_comment_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticker_comment_request** | [**SupportTicketComment**](SupportTicketComment.md)| supportTickerCommentRequest | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_support_ticket_using_post**
> SupportTicket create_support_ticket_using_post(support_ticket_request)

Create a support ticket

Create a new support ticket for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
support_ticket_request = atom_api.SupportTicket() # SupportTicket | supportTicketRequest

try:
    # Create a support ticket
    api_response = api_instance.create_support_ticket_using_post(support_ticket_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->create_support_ticket_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_request** | [**SupportTicket**](SupportTicket.md)| supportTicketRequest | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_chat_using_delete**
> delete_chat_using_delete(chat_id)

Delete a Chat

Permanently delete a Chat

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
chat_id = 'chat_id_example' # str | UUID chat_info_id

try:
    # Delete a Chat
    api_instance.delete_chat_using_delete(chat_id)
except ApiException as e:
    print("Exception when calling SupportApi->delete_chat_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**str**](.md)| UUID chat_info_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_consultation_using_delete**
> delete_consultation_using_delete(consultation_id)

Delete a CIO Consultation

Permanently delete a CIO Consultation

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
consultation_id = 'consultation_id_example' # str | UUID consultation_id

try:
    # Delete a CIO Consultation
    api_instance.delete_consultation_using_delete(consultation_id)
except ApiException as e:
    print("Exception when calling SupportApi->delete_consultation_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation_id** | [**str**](.md)| UUID consultation_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_sale_using_delete**
> delete_sale_using_delete(sales_id)

Delete a sales inquiry

Permanently delete a sales inquiry.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
sales_id = 'sales_id_example' # str | UUID sales_id

try:
    # Delete a sales inquiry
    api_instance.delete_sale_using_delete(sales_id)
except ApiException as e:
    print("Exception when calling SupportApi->delete_sale_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales_id** | [**str**](.md)| UUID sales_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_support_ticket_comment_using_delete**
> delete_support_ticket_comment_using_delete(support_ticket_comment_id)

Delete a support ticket comment

Permanently delete a support ticket comment for a support ticket.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
support_ticket_comment_id = 'support_ticket_comment_id_example' # str | UUID support_ticket_comment_id

try:
    # Delete a support ticket comment
    api_instance.delete_support_ticket_comment_using_delete(support_ticket_comment_id)
except ApiException as e:
    print("Exception when calling SupportApi->delete_support_ticket_comment_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment_id** | [**str**](.md)| UUID support_ticket_comment_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_support_ticket_using_delete**
> delete_support_ticket_using_delete(support_ticket_id)

Delete a support ticket

Permanently delete a support ticket for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
support_ticket_id = 'support_ticket_id_example' # str | UUID support_ticket_id

try:
    # Delete a support ticket
    api_instance.delete_support_ticket_using_delete(support_ticket_id)
except ApiException as e:
    print("Exception when calling SupportApi->delete_support_ticket_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_id** | [**str**](.md)| UUID support_ticket_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chat_all_using_get**
> PageChatInfo get_chat_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all open chats

Get details for all open chat

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all open chats
    api_response = api_instance.get_chat_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->get_chat_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageChatInfo**](PageChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chat_using_get**
> ChatInfo get_chat_using_get(chat_id)

Retrieve a Chat

Retrieve the information for a Chat

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
chat_id = 'chat_id_example' # str | UUID chat_info_id

try:
    # Retrieve a Chat
    api_response = api_instance.get_chat_using_get(chat_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->get_chat_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**str**](.md)| UUID chat_info_id | 

### Return type

[**ChatInfo**](ChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_consultation_all_using_get**
> PageConsultation get_consultation_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all CIO Consultation

Get details for all CIO Consultation

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all CIO Consultation
    api_response = api_instance.get_consultation_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->get_consultation_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageConsultation**](PageConsultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_consultation_using_get**
> Consultation get_consultation_using_get(consultation_id)

Retrieve a CIO Consultation

Retrieve the information for a CIO Consultation

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
consultation_id = 'consultation_id_example' # str | UUID consultation_id

try:
    # Retrieve a CIO Consultation
    api_response = api_instance.get_consultation_using_get(consultation_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->get_consultation_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation_id** | [**str**](.md)| UUID consultation_id | 

### Return type

[**Consultation**](Consultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sale_all_using_get**
> PageSale get_sale_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all sales inquiries

Get all sales inquiries defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all sales inquiries
    api_response = api_instance.get_sale_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->get_sale_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageSale**](PageSale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sale_using_get**
> Sale get_sale_using_get(sales_id)

Retrieve a sales record

Retrieve the information for a sales record

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
sales_id = 'sales_id_example' # str | UUID sales_id

try:
    # Retrieve a sales record
    api_response = api_instance.get_sale_using_get(sales_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->get_sale_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales_id** | [**str**](.md)| UUID sales_id | 

### Return type

[**Sale**](Sale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_support_ticket_all_using_get**
> PageSupportTicket get_support_ticket_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all support tickets

Get the information for all support tickets defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all support tickets
    api_response = api_instance.get_support_ticket_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->get_support_ticket_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageSupportTicket**](PageSupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_support_ticket_comment_all_using_get**
> PageSupportTicketComment get_support_ticket_comment_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all support ticket comments

Get the information for all support ticket comments defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all support ticket comments
    api_response = api_instance.get_support_ticket_comment_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->get_support_ticket_comment_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageSupportTicketComment**](PageSupportTicketComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_support_ticket_comment_using_get**
> SupportTicketComment get_support_ticket_comment_using_get(support_ticket_comment_id)

Retrieve a support ticket comment

Retrieve the information for a support ticket comment defined for a support ticket.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
support_ticket_comment_id = 'support_ticket_comment_id_example' # str | UUID support_ticket_comment_id

try:
    # Retrieve a support ticket comment
    api_response = api_instance.get_support_ticket_comment_using_get(support_ticket_comment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->get_support_ticket_comment_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment_id** | [**str**](.md)| UUID support_ticket_comment_id | 

### Return type

[**SupportTicketComment**](SupportTicketComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_support_ticket_using_get**
> SupportTicket get_support_ticket_using_get(support_ticket_id)

Retrieve a support ticket

Retrieve the information for a support ticket defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
support_ticket_id = 'support_ticket_id_example' # str | UUID support_ticket_id

try:
    # Retrieve a support ticket
    api_response = api_instance.get_support_ticket_using_get(support_ticket_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->get_support_ticket_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_id** | [**str**](.md)| UUID support_ticket_id | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_chat_using_put**
> ChatInfo update_chat_using_put(chat_id, chat_info)

Update a Chat

Updated the information for a Chat

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
chat_id = 'chat_id_example' # str | UUID chat_id
chat_info = atom_api.ChatInfo() # ChatInfo | chat_info

try:
    # Update a Chat
    api_response = api_instance.update_chat_using_put(chat_id, chat_info)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->update_chat_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**str**](.md)| UUID chat_id | 
 **chat_info** | [**ChatInfo**](ChatInfo.md)| chat_info | 

### Return type

[**ChatInfo**](ChatInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_consultation_using_put**
> Consultation update_consultation_using_put(consultation, consultation_id)

Update a CIO Consultation

Updated the information CIO Consultation

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
consultation = atom_api.Consultation() # Consultation | consultation
consultation_id = 'consultation_id_example' # str | UUID consultation_id

try:
    # Update a CIO Consultation
    api_response = api_instance.update_consultation_using_put(consultation, consultation_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->update_consultation_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation** | [**Consultation**](Consultation.md)| consultation | 
 **consultation_id** | [**str**](.md)| UUID consultation_id | 

### Return type

[**Consultation**](Consultation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_sale_using_put**
> Sale update_sale_using_put(sales, sales_id)

Update a sales inquiry

Update the information for a sales inquiry. 

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
sales = atom_api.Sale() # Sale | sales
sales_id = 'sales_id_example' # str | UUID sales_id

try:
    # Update a sales inquiry
    api_response = api_instance.update_sale_using_put(sales, sales_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->update_sale_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales** | [**Sale**](Sale.md)| sales | 
 **sales_id** | [**str**](.md)| UUID sales_id | 

### Return type

[**Sale**](Sale.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_support_ticket_comment_using_put**
> SupportTicketComment update_support_ticket_comment_using_put(support_ticket_comment, support_ticket_comment_id)

Update a support ticket comment

Update the information for a support ticket comments defined for a support ticket.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
support_ticket_comment = atom_api.SupportTicketComment() # SupportTicketComment | support_ticket_comment
support_ticket_comment_id = 'support_ticket_comment_id_example' # str | UUID support_ticket_comment_id

try:
    # Update a support ticket comment
    api_response = api_instance.update_support_ticket_comment_using_put(support_ticket_comment, support_ticket_comment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->update_support_ticket_comment_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment** | [**SupportTicketComment**](SupportTicketComment.md)| support_ticket_comment | 
 **support_ticket_comment_id** | [**str**](.md)| UUID support_ticket_comment_id | 

### Return type

[**SupportTicketComment**](SupportTicketComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_support_ticket_using_put**
> SupportTicket update_support_ticket_using_put(support_ticket, support_ticket_id)

Update a support ticket

Update the information for a support ticket defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SupportApi(atom_api.ApiClient(configuration))
support_ticket = atom_api.SupportTicket() # SupportTicket | support_ticket
support_ticket_id = 'support_ticket_id_example' # str | UUID support_ticket_id

try:
    # Update a support ticket
    api_response = api_instance.update_support_ticket_using_put(support_ticket, support_ticket_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SupportApi->update_support_ticket_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket** | [**SupportTicket**](SupportTicket.md)| support_ticket | 
 **support_ticket_id** | [**str**](.md)| UUID support_ticket_id | 

### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

