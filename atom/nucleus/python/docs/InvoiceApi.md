# nucleus_api.InvoiceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_invoice_payment_using_post**](InvoiceApi.md#create_invoice_payment_using_post) | **POST** /invoice_payment | Create a invoicePayment
[**create_invoice_using_post**](InvoiceApi.md#create_invoice_using_post) | **POST** /invoice | Create a invoice
[**delete_invoice_payment_using_delete**](InvoiceApi.md#delete_invoice_payment_using_delete) | **DELETE** /invoice_payment/{invoice_payment_id} | Delete a invoicePayment
[**delete_invoice_using_delete**](InvoiceApi.md#delete_invoice_using_delete) | **DELETE** /invoice/{invoice_id} | Delete a invoice
[**get_invoice_all_using_get**](InvoiceApi.md#get_invoice_all_using_get) | **GET** /invoice | List all invoices
[**get_invoice_payment_all_using_get**](InvoiceApi.md#get_invoice_payment_all_using_get) | **GET** /invoice_payment | List all invoice payments
[**get_invoice_payment_using_get**](InvoiceApi.md#get_invoice_payment_using_get) | **GET** /invoice_payment/{invoice_payment_id} | Retrieve a invoicePayment
[**get_invoice_using_get**](InvoiceApi.md#get_invoice_using_get) | **GET** /invoice/{invoice_id} | Retrieve a invoice
[**update_invoice_payment_using_put**](InvoiceApi.md#update_invoice_payment_using_put) | **PUT** /invoice_payment/{invoice_payment_id} | Update a invoicePayment
[**update_invoice_using_put**](InvoiceApi.md#update_invoice_using_put) | **PUT** /invoice/{invoice_id} | Update a invoice


# **create_invoice_payment_using_post**
> InvoicePayment create_invoice_payment_using_post(invoice_payment)

Create a invoicePayment

Create a new invoicePayment, for tracking invoice status.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.InvoiceApi(nucleus_api.ApiClient(configuration))
invoice_payment = nucleus_api.InvoicePayment() # InvoicePayment | invoicePayment

try:
    # Create a invoicePayment
    api_response = api_instance.create_invoice_payment_using_post(invoice_payment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceApi->create_invoice_payment_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment** | [**InvoicePayment**](InvoicePayment.md)| invoicePayment | 

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_invoice_using_post**
> Invoice create_invoice_using_post(invoice)

Create a invoice

Create a new invoice, with your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.InvoiceApi(nucleus_api.ApiClient(configuration))
invoice = nucleus_api.Invoice() # Invoice | invoice

try:
    # Create a invoice
    api_response = api_instance.create_invoice_using_post(invoice)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceApi->create_invoice_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice | 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_invoice_payment_using_delete**
> delete_invoice_payment_using_delete(invoice_payment_id)

Delete a invoicePayment

Delete a invoicePayment. 

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.InvoiceApi(nucleus_api.ApiClient(configuration))
invoice_payment_id = 'invoice_payment_id_example' # str | UUID invoice_payment_id

try:
    # Delete a invoicePayment
    api_instance.delete_invoice_payment_using_delete(invoice_payment_id)
except ApiException as e:
    print("Exception when calling InvoiceApi->delete_invoice_payment_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment_id** | [**str**](.md)| UUID invoice_payment_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_invoice_using_delete**
> delete_invoice_using_delete(invoice_id)

Delete a invoice

Delete a invoice. 

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.InvoiceApi(nucleus_api.ApiClient(configuration))
invoice_id = 'invoice_id_example' # str | UUID invoice_id

try:
    # Delete a invoice
    api_instance.delete_invoice_using_delete(invoice_id)
except ApiException as e:
    print("Exception when calling InvoiceApi->delete_invoice_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | [**str**](.md)| UUID invoice_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_invoice_all_using_get**
> PageInvoice get_invoice_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all invoices

List all invoice. 

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.InvoiceApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all invoices
    api_response = api_instance.get_invoice_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceApi->get_invoice_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **str**| currency_conversion | [optional] 
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageInvoice**](PageInvoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_invoice_payment_all_using_get**
> PageInvoicePayment get_invoice_payment_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all invoice payments

List all invoicePayment. 

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.InvoiceApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all invoice payments
    api_response = api_instance.get_invoice_payment_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceApi->get_invoice_payment_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **str**| currency_conversion | [optional] 
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageInvoicePayment**](PageInvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_invoice_payment_using_get**
> InvoicePayment get_invoice_payment_using_get(invoice_payment_id, currency_conversion=currency_conversion)

Retrieve a invoicePayment

Retrieve a invoicePayment. 

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.InvoiceApi(nucleus_api.ApiClient(configuration))
invoice_payment_id = 'invoice_payment_id_example' # str | UUID invoice_payment_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve a invoicePayment
    api_response = api_instance.get_invoice_payment_using_get(invoice_payment_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceApi->get_invoice_payment_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment_id** | [**str**](.md)| UUID invoice_payment_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_invoice_using_get**
> Invoice get_invoice_using_get(invoice_id, currency_conversion=currency_conversion)

Retrieve a invoice

Retrieve a invoice. 

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.InvoiceApi(nucleus_api.ApiClient(configuration))
invoice_id = 'invoice_id_example' # str | UUID invoice_idd
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve a invoice
    api_response = api_instance.get_invoice_using_get(invoice_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceApi->get_invoice_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | [**str**](.md)| UUID invoice_idd | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_invoice_payment_using_put**
> InvoicePayment update_invoice_payment_using_put(invoice_payment, invoice_payment_id)

Update a invoicePayment

Update a invoicePayment. 

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.InvoiceApi(nucleus_api.ApiClient(configuration))
invoice_payment = nucleus_api.InvoicePayment() # InvoicePayment | invoice_payment
invoice_payment_id = 'invoice_payment_id_example' # str | UUID invoice_payment_id

try:
    # Update a invoicePayment
    api_response = api_instance.update_invoice_payment_using_put(invoice_payment, invoice_payment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceApi->update_invoice_payment_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_payment** | [**InvoicePayment**](InvoicePayment.md)| invoice_payment | 
 **invoice_payment_id** | [**str**](.md)| UUID invoice_payment_id | 

### Return type

[**InvoicePayment**](InvoicePayment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_invoice_using_put**
> Invoice update_invoice_using_put(invoice, invoice_id)

Update a invoice

Update a invoice. 

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.InvoiceApi(nucleus_api.ApiClient(configuration))
invoice = nucleus_api.Invoice() # Invoice | invoice
invoice_id = 'invoice_id_example' # str | UUID invoice_id

try:
    # Update a invoice
    api_response = api_instance.update_invoice_using_put(invoice, invoice_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InvoiceApi->update_invoice_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice | 
 **invoice_id** | [**str**](.md)| UUID invoice_id | 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

