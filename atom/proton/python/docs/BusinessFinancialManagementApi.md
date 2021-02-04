# proton_api.BusinessFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**business_financial_health_check**](BusinessFinancialManagementApi.md#business_financial_health_check) | **POST** /business/financial_health_check | Business Financial Health Check
[**cash_analysis**](BusinessFinancialManagementApi.md#cash_analysis) | **POST** /business/cash_analysis | Cash Analysis
[**customer_analysis**](BusinessFinancialManagementApi.md#customer_analysis) | **POST** /business/customer_analysis | Customer Analysis
[**financial_statement_analysis**](BusinessFinancialManagementApi.md#financial_statement_analysis) | **POST** /business/financial_statement_analysis | Financial Statement Analysis
[**invoice_analysis**](BusinessFinancialManagementApi.md#invoice_analysis) | **POST** /business/invoice_analysis | Invoice Analysis


# **business_financial_health_check**
> dict(str, object) business_financial_health_check(business_financial_health_check_request)

Business Financial Health Check

Calculate a series of financial ratios to assess business financial health

### Example
```python
from __future__ import print_function
import time
import proton_api
from proton_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = proton_api.Configuration()

# create an instance of the API class
api_instance = proton_api.AuthApi(proton_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = proton_api.BusinessFinancialManagementApi(proton_api.ApiClient(configuration))
business_financial_health_check_request = proton_api.BusinessFinancialHealthCheckRequest() # BusinessFinancialHealthCheckRequest | Request payload for Business Financial Health Check

try:
    # Business Financial Health Check
    api_response = api_instance.business_financial_health_check(business_financial_health_check_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessFinancialManagementApi->business_financial_health_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_financial_health_check_request** | [**BusinessFinancialHealthCheckRequest**](BusinessFinancialHealthCheckRequest.md)| Request payload for Business Financial Health Check | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cash_analysis**
> dict(str, object) cash_analysis(cash_analysis_request)

Cash Analysis

Analyze cash activity over time

### Example
```python
from __future__ import print_function
import time
import proton_api
from proton_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = proton_api.Configuration()

# create an instance of the API class
api_instance = proton_api.AuthApi(proton_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = proton_api.BusinessFinancialManagementApi(proton_api.ApiClient(configuration))
cash_analysis_request = proton_api.CashAnalysisRequest() # CashAnalysisRequest | Request payload for Cash Analysis

try:
    # Cash Analysis
    api_response = api_instance.cash_analysis(cash_analysis_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessFinancialManagementApi->cash_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cash_analysis_request** | [**CashAnalysisRequest**](CashAnalysisRequest.md)| Request payload for Cash Analysis | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_analysis**
> dict(str, object) customer_analysis(customer_analysis_request)

Customer Analysis

Analyze customer revenues over a time period

### Example
```python
from __future__ import print_function
import time
import proton_api
from proton_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = proton_api.Configuration()

# create an instance of the API class
api_instance = proton_api.AuthApi(proton_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = proton_api.BusinessFinancialManagementApi(proton_api.ApiClient(configuration))
customer_analysis_request = proton_api.CustomerAnalysisRequest() # CustomerAnalysisRequest | Request payload for Customer Analysis

try:
    # Customer Analysis
    api_response = api_instance.customer_analysis(customer_analysis_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessFinancialManagementApi->customer_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_analysis_request** | [**CustomerAnalysisRequest**](CustomerAnalysisRequest.md)| Request payload for Customer Analysis | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **financial_statement_analysis**
> dict(str, object) financial_statement_analysis(financial_statement_analysis_request)

Financial Statement Analysis

Analyze financial statement accounting data for a business

### Example
```python
from __future__ import print_function
import time
import proton_api
from proton_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = proton_api.Configuration()

# create an instance of the API class
api_instance = proton_api.AuthApi(proton_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = proton_api.BusinessFinancialManagementApi(proton_api.ApiClient(configuration))
financial_statement_analysis_request = proton_api.FinancialStatementAnalysisRequest() # FinancialStatementAnalysisRequest | Request payload for Financial Statement Analysis

try:
    # Financial Statement Analysis
    api_response = api_instance.financial_statement_analysis(financial_statement_analysis_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessFinancialManagementApi->financial_statement_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement_analysis_request** | [**FinancialStatementAnalysisRequest**](FinancialStatementAnalysisRequest.md)| Request payload for Financial Statement Analysis | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoice_analysis**
> dict(str, object) invoice_analysis(invoice_analysis_request)

Invoice Analysis

Analyze invoices to understand the context of money owed and paid to a business

### Example
```python
from __future__ import print_function
import time
import proton_api
from proton_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = proton_api.Configuration()

# create an instance of the API class
api_instance = proton_api.AuthApi(proton_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = proton_api.BusinessFinancialManagementApi(proton_api.ApiClient(configuration))
invoice_analysis_request = proton_api.BusinessInvoiceAnalysisRequest() # BusinessInvoiceAnalysisRequest | Request payload for Invoice Analysis

try:
    # Invoice Analysis
    api_response = api_instance.invoice_analysis(invoice_analysis_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessFinancialManagementApi->invoice_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_analysis_request** | [**BusinessInvoiceAnalysisRequest**](BusinessInvoiceAnalysisRequest.md)| Request payload for Invoice Analysis | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

