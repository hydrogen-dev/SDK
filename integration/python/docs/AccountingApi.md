# integration_api.AccountingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_or_update_customer**](AccountingApi.md#create_or_update_customer) | **GET** /accounting/customer | Update/Create all customers in Nucleus for a given nucleus_client_id
[**create_or_update_customer_revenue**](AccountingApi.md#create_or_update_customer_revenue) | **GET** /accounting/customer_revenue/{nucleus_customer_id} | Update/Create all customers revenue in Nucleus for a given nucleus_customer_id
[**create_or_update_invoice_payment**](AccountingApi.md#create_or_update_invoice_payment) | **GET** /accounting/invoice_payment/{nucleus_invoice_id} | Create/Update invoice payment in Nucleus for a given nucleus_invoice_id
[**create_or_update_invoices**](AccountingApi.md#create_or_update_invoices) | **GET** /accounting/invoice | Update/Create all invoices in Nucleus for a given nucleus_client_id
[**delete_accounting_vendor_access_config_is_active_by_id**](AccountingApi.md#delete_accounting_vendor_access_config_is_active_by_id) | **DELETE** /accounting/vendor/{id} | Permanently delete relation with particular accounting vendor.
[**get_accounting_stats**](AccountingApi.md#get_accounting_stats) | **GET** /accounting/report | Get accounting stats from financial statements at the vendor for the business provided
[**get_accounting_vendor_info_using_client_id**](AccountingApi.md#get_accounting_vendor_info_using_client_id) | **GET** /accounting/vendor/{nucleus_client_id} | Get Accounting Vendor Config
[**update_accounting_vendor_access_config_is_active_by_id**](AccountingApi.md#update_accounting_vendor_access_config_is_active_by_id) | **PUT** /accounting/vendor/{id} | Enable/Disable relation with particular accounting vendor.
[**update_customer**](AccountingApi.md#update_customer) | **GET** /accounting/customer/{nucleus_customer_id} | Update customer in Nucleus for a given nucleus_customer_id
[**update_invoice**](AccountingApi.md#update_invoice) | **GET** /accounting/invoice/{nucleus_invoice_id} | Update invoice in Nucleus for a given nucleus_invoice_id


# **create_or_update_customer**
> AccountingFinalResponseVO create_or_update_customer(nucleus_client_id)

Update/Create all customers in Nucleus for a given nucleus_client_id

Update/Create all customers in Nucleus for a given nucleus_client_id

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
api_instance = integration_api.AccountingApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id

try:
    # Update/Create all customers in Nucleus for a given nucleus_client_id
    api_response = api_instance.create_or_update_customer(nucleus_client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->create_or_update_customer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_or_update_customer_revenue**
> AccountingFinalResponseVO create_or_update_customer_revenue(nucleus_customer_id, start_date, accounting_method=accounting_method, end_date=end_date)

Update/Create all customers revenue in Nucleus for a given nucleus_customer_id

Update/Create all customers revenue in Nucleus for a given nucleus_customer_id

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
api_instance = integration_api.AccountingApi(integration_api.ApiClient(configuration))
nucleus_customer_id = 'nucleus_customer_id_example' # str | nucleus_customer_id
start_date = '2013-10-20T19:20:30+01:00' # datetime | start_date
accounting_method = 'accrual' # str | accounting_method (optional) (default to accrual)
end_date = 'null' # datetime | end_date (optional) (default to null)

try:
    # Update/Create all customers revenue in Nucleus for a given nucleus_customer_id
    api_response = api_instance.create_or_update_customer_revenue(nucleus_customer_id, start_date, accounting_method=accounting_method, end_date=end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->create_or_update_customer_revenue: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_customer_id** | [**str**](.md)| nucleus_customer_id | 
 **start_date** | **datetime**| start_date | 
 **accounting_method** | **str**| accounting_method | [optional] [default to accrual]
 **end_date** | **datetime**| end_date | [optional] [default to null]

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_or_update_invoice_payment**
> AccountingFinalResponseVO create_or_update_invoice_payment(nucleus_invoice_id)

Create/Update invoice payment in Nucleus for a given nucleus_invoice_id

Create/Update invoice payment in Nucleus for a given nucleus_invoice_id

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
api_instance = integration_api.AccountingApi(integration_api.ApiClient(configuration))
nucleus_invoice_id = 'nucleus_invoice_id_example' # str | nucleus_invoice_id

try:
    # Create/Update invoice payment in Nucleus for a given nucleus_invoice_id
    api_response = api_instance.create_or_update_invoice_payment(nucleus_invoice_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->create_or_update_invoice_payment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_invoice_id** | [**str**](.md)| nucleus_invoice_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_or_update_invoices**
> AccountingFinalResponseVO create_or_update_invoices(nucleus_customer_id, start_date, end_date=end_date)

Update/Create all invoices in Nucleus for a given nucleus_client_id

Update/Create all invoices in Nucleus for a given nucleus_client_id

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
api_instance = integration_api.AccountingApi(integration_api.ApiClient(configuration))
nucleus_customer_id = 'nucleus_customer_id_example' # str | nucleus_customer_id
start_date = '2013-10-20T19:20:30+01:00' # datetime | start_date
end_date = 'null' # datetime | end_date (optional) (default to null)

try:
    # Update/Create all invoices in Nucleus for a given nucleus_client_id
    api_response = api_instance.create_or_update_invoices(nucleus_customer_id, start_date, end_date=end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->create_or_update_invoices: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_customer_id** | [**str**](.md)| nucleus_customer_id | 
 **start_date** | **datetime**| start_date | 
 **end_date** | **datetime**| end_date | [optional] [default to null]

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_accounting_vendor_access_config_is_active_by_id**
> delete_accounting_vendor_access_config_is_active_by_id(id)

Permanently delete relation with particular accounting vendor.

Permanently delete relation with particular accounting vendor.

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
api_instance = integration_api.AccountingApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | id

try:
    # Permanently delete relation with particular accounting vendor.
    api_instance.delete_accounting_vendor_access_config_is_active_by_id(id)
except ApiException as e:
    print("Exception when calling AccountingApi->delete_accounting_vendor_access_config_is_active_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_accounting_stats**
> AccountingFinalResponseVO get_accounting_stats(accounting_method=accounting_method, nucleus_client_id=nucleus_client_id, period_length=period_length, period_month=period_month, period_quarter=period_quarter, period_type=period_type, period_year=period_year, report=report, statement_date=statement_date)

Get accounting stats from financial statements at the vendor for the business provided

Get accounting stats from financial statements at the vendor for the business provided

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
api_instance = integration_api.AccountingApi(integration_api.ApiClient(configuration))
accounting_method = 'accrual' # str | accounting_method (optional) (default to accrual)
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id (optional)
period_length = 'period_length_example' # str | period_length (optional)
period_month = 56 # int | period_month (optional)
period_quarter = 56 # int | period_quarter (optional)
period_type = 'period_type_example' # str | period_type (optional)
period_year = 56 # int | period_year (optional)
report = 'report_example' # str | report (optional)
statement_date = '2013-10-20T19:20:30+01:00' # datetime | statement_date (optional)

try:
    # Get accounting stats from financial statements at the vendor for the business provided
    api_response = api_instance.get_accounting_stats(accounting_method=accounting_method, nucleus_client_id=nucleus_client_id, period_length=period_length, period_month=period_month, period_quarter=period_quarter, period_type=period_type, period_year=period_year, report=report, statement_date=statement_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->get_accounting_stats: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting_method** | **str**| accounting_method | [optional] [default to accrual]
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | [optional] 
 **period_length** | **str**| period_length | [optional] 
 **period_month** | **int**| period_month | [optional] 
 **period_quarter** | **int**| period_quarter | [optional] 
 **period_type** | **str**| period_type | [optional] 
 **period_year** | **int**| period_year | [optional] 
 **report** | **str**| report | [optional] 
 **statement_date** | **datetime**| statement_date | [optional] 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_accounting_vendor_info_using_client_id**
> VendorAccessConfigVO get_accounting_vendor_info_using_client_id(nucleus_client_id)

Get Accounting Vendor Config

Get Accounting vendor config information with its status.

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
api_instance = integration_api.AccountingApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id

try:
    # Get Accounting Vendor Config
    api_response = api_instance.get_accounting_vendor_info_using_client_id(nucleus_client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->get_accounting_vendor_info_using_client_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 

### Return type

[**VendorAccessConfigVO**](VendorAccessConfigVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_accounting_vendor_access_config_is_active_by_id**
> VendorAccessConfigVO update_accounting_vendor_access_config_is_active_by_id(id, is_active)

Enable/Disable relation with particular accounting vendor.

Enable/Disable link with particular accounting vendor.

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
api_instance = integration_api.AccountingApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | id
is_active = true # bool | is_active

try:
    # Enable/Disable relation with particular accounting vendor.
    api_response = api_instance.update_accounting_vendor_access_config_is_active_by_id(id, is_active)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->update_accounting_vendor_access_config_is_active_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 
 **is_active** | **bool**| is_active | 

### Return type

[**VendorAccessConfigVO**](VendorAccessConfigVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_customer**
> AccountingFinalResponseVO update_customer(nucleus_customer_id)

Update customer in Nucleus for a given nucleus_customer_id

Update customer in Nucleus for a given nucleus_customer_id

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
api_instance = integration_api.AccountingApi(integration_api.ApiClient(configuration))
nucleus_customer_id = 'nucleus_customer_id_example' # str | nucleus_customer_id

try:
    # Update customer in Nucleus for a given nucleus_customer_id
    api_response = api_instance.update_customer(nucleus_customer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->update_customer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_customer_id** | [**str**](.md)| nucleus_customer_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_invoice**
> AccountingFinalResponseVO update_invoice(nucleus_invoice_id)

Update invoice in Nucleus for a given nucleus_invoice_id

Update invoice in Nucleus for a given nucleus_invoice_id

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
api_instance = integration_api.AccountingApi(integration_api.ApiClient(configuration))
nucleus_invoice_id = 'nucleus_invoice_id_example' # str | nucleus_invoice_id

try:
    # Update invoice in Nucleus for a given nucleus_invoice_id
    api_response = api_instance.update_invoice(nucleus_invoice_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->update_invoice: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_invoice_id** | [**str**](.md)| nucleus_invoice_id | 

### Return type

[**AccountingFinalResponseVO**](AccountingFinalResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

