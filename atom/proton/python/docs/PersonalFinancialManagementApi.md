# swagger_client.PersonalFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**budget_calculator**](PersonalFinancialManagementApi.md#budget_calculator) | **POST** /budget_calculator | Budget Calculator
[**cash_flow_analysis**](PersonalFinancialManagementApi.md#cash_flow_analysis) | **POST** /cash_flow_analysis | Cash Flow Analysis
[**fee_analysis**](PersonalFinancialManagementApi.md#fee_analysis) | **POST** /fee_analysis | RFee Analysis
[**financial_picture**](PersonalFinancialManagementApi.md#financial_picture) | **POST** /financial_picture | Financial Picture
[**recurring_transaction_analysis**](PersonalFinancialManagementApi.md#recurring_transaction_analysis) | **POST** /recurring_transaction_analysis | Recurring Transaction Analysis


# **budget_calculator**
> dict(str, object) budget_calculator(budget_calculator_request)

Budget Calculator

Analyze spending against a defined budget

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
api_instance = proton_api.PersonalFinancialManagementApi(proton_api.ApiClient(configuration))
budget_calculator_request = proton_api.BudgetCalculatorRequest() # BudgetCalculatorRequest | Request payload for Budget Calculator

try:
    # Budget Calculator
    api_response = api_instance.budget_calculator(budget_calculator_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonalFinancialManagementApi->budget_calculator: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget_calculator_request** | [**BudgetCalculatorRequest**](BudgetCalculatorRequest.md)| Request payload for Budget Calculator | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cash_flow_analysis**
> dict(str, object) cash_flow_analysis(cash_flow_analysis_request)

Cash Flow Analysis

Analyze income, expenses, and net income

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
api_instance = proton_api.PersonalFinancialManagementApi(proton_api.ApiClient(configuration))
cash_flow_analysis_request = proton_api.CashFlowAnalysisRequest() # CashFlowAnalysisRequest | Request payload for Cash Flow Analysis

try:
    # Cash Flow Analysis
    api_response = api_instance.cash_flow_analysis(cash_flow_analysis_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonalFinancialManagementApi->cash_flow_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cash_flow_analysis_request** | [**CashFlowAnalysisRequest**](CashFlowAnalysisRequest.md)| Request payload for Cash Flow Analysis | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fee_analysis**
> dict(str, object) fee_analysis(fee_analysis_request)

RFee Analysis

Analyze fee data

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
api_instance = proton_api.PersonalFinancialManagementApi(proton_api.ApiClient(configuration))
fee_analysis_request = proton_api.FeeAnalysisRequest() # FeeAnalysisRequest | Request payload for Fee Analysis

try:
    # RFee Analysis
    api_response = api_instance.fee_analysis(fee_analysis_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonalFinancialManagementApi->fee_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fee_analysis_request** | [**FeeAnalysisRequest**](FeeAnalysisRequest.md)| Request payload for Fee Analysis | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **financial_picture**
> dict(str, object) financial_picture(financial_picture_request)

Financial Picture

Assess assets, liabilities, and net worth

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
api_instance = proton_api.PersonalFinancialManagementApi(proton_api.ApiClient(configuration))
financial_picture_request = proton_api.FinancialPictureRequest() # FinancialPictureRequest | Request payload for Financial Picture

try:
    # Financial Picture
    api_response = api_instance.financial_picture(financial_picture_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonalFinancialManagementApi->financial_picture: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_picture_request** | [**FinancialPictureRequest**](FinancialPictureRequest.md)| Request payload for Financial Picture | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recurring_transaction_analysis**
> dict(str, object) recurring_transaction_analysis(recurring_transaction_analysis_request)

Recurring Transaction Analysis

Analyze recurring transactions

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
api_instance = proton_api.PersonalFinancialManagementApi(proton_api.ApiClient(configuration))
recurring_transaction_analysis_request = proton_api.RecurringTransactionAnalysisRequest() # RecurringTransactionAnalysisRequest | Request payload for Recurring Transaction Analysis

try:
    # Recurring Transaction Analysis
    api_response = api_instance.recurring_transaction_analysis(recurring_transaction_analysis_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonalFinancialManagementApi->recurring_transaction_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurring_transaction_analysis_request** | [**RecurringTransactionAnalysisRequest**](RecurringTransactionAnalysisRequest.md)| Request payload for Recurring Transaction Analysis | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

