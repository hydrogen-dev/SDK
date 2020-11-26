# swagger_client.FinancialPlanningApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**education_calculator_annual_cost**](FinancialPlanningApi.md#education_calculator_annual_cost) | **POST** /education_calculator/annual_cost | Education Calculator - Annual Cost
[**education_calculator_deposit_amount**](FinancialPlanningApi.md#education_calculator_deposit_amount) | **POST** /education_calculator/deposit_amount | Education Calculator - Deposit Amount
[**education_calculator_percent_covered**](FinancialPlanningApi.md#education_calculator_percent_covered) | **POST** /education_calculator/percent_covered | Education Calculator - Percent Covered
[**mortgage_calculator_down_payment**](FinancialPlanningApi.md#mortgage_calculator_down_payment) | **POST** /mortgage_calculator/down_payment | Mortgage Calculator - Down Payment
[**mortgage_calculator_home_price**](FinancialPlanningApi.md#mortgage_calculator_home_price) | **POST** /mortgage_calculator/home_price | Mortgage Calculator - Home Price
[**mortgage_calculator_periodic_payment**](FinancialPlanningApi.md#mortgage_calculator_periodic_payment) | **POST** /mortgage_calculator/periodic_payment | Mortgage Calculator - Periodic Payment
[**purchase_calculator_amount**](FinancialPlanningApi.md#purchase_calculator_amount) | **POST** /purchase_calculator/amount | Purchase Calculator - Amount
[**purchase_calculator_deposit_amount**](FinancialPlanningApi.md#purchase_calculator_deposit_amount) | **POST** /purchase_calculator/deposit_amount | Purchase Calculator - Deposit Amount
[**purchase_calculator_horizon**](FinancialPlanningApi.md#purchase_calculator_horizon) | **POST** /purchase_calculator/horizon | Purchase Calculator - Horizon
[**retirement_calculator_deposit_amount**](FinancialPlanningApi.md#retirement_calculator_deposit_amount) | **POST** /retirement_calculator/deposit_amount | Retirement Calculator - Deposit Amount
[**retirement_calculator_expenses**](FinancialPlanningApi.md#retirement_calculator_expenses) | **POST** /retirement_calculator/expenses | Retirement Calculator - Expenses
[**retirement_calculator_percent_covered**](FinancialPlanningApi.md#retirement_calculator_percent_covered) | **POST** /retirement_calculator/percent_covered | Retirement Calculator - Percent Covered


# **education_calculator_annual_cost**
> dict(str, object) education_calculator_annual_cost(education_calculator_annual_cost_request)

Education Calculator - Annual Cost

Calculate the achievable education costs

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
education_calculator_annual_cost_request = proton_api.EducationCalculatorAnnualCostRequest() # EducationCalculatorAnnualCostRequest | Request payload for Education Calculator - Annual Cost

try:
    # Education Calculator - Annual Cost
    api_response = api_instance.education_calculator_annual_cost(education_calculator_annual_cost_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->education_calculator_annual_cost: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **education_calculator_annual_cost_request** | [**EducationCalculatorAnnualCostRequest**](EducationCalculatorAnnualCostRequest.md)| Request payload for Education Calculator - Annual Cost | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **education_calculator_deposit_amount**
> dict(str, object) education_calculator_deposit_amount(education_calculator_deposit_amount_request)

Education Calculator - Deposit Amount

Calculate the necessary periodic deposit amount to achieve education costs

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
education_calculator_deposit_amount_request = proton_api.EducationCalculatorDepositAmountRequest() # EducationCalculatorDepositAmountRequest | Request payload for Education Calculator - Deposit Amount

try:
    # Education Calculator - Deposit Amount
    api_response = api_instance.education_calculator_deposit_amount(education_calculator_deposit_amount_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->education_calculator_deposit_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **education_calculator_deposit_amount_request** | [**EducationCalculatorDepositAmountRequest**](EducationCalculatorDepositAmountRequest.md)| Request payload for Education Calculator - Deposit Amount | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **education_calculator_percent_covered**
> dict(str, object) education_calculator_percent_covered(education_calculator_percent_covered_request)

Education Calculator - Percent Covered

Calculate the achievable percentage of education costs that can be covered

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
education_calculator_percent_covered_request = proton_api.EducationCalculatorPercentCoveredRequest() # EducationCalculatorPercentCoveredRequest | Request payload for Education Calculator - Percent Covered

try:
    # Education Calculator - Percent Covered
    api_response = api_instance.education_calculator_percent_covered(education_calculator_percent_covered_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->education_calculator_percent_covered: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **education_calculator_percent_covered_request** | [**EducationCalculatorPercentCoveredRequest**](EducationCalculatorPercentCoveredRequest.md)| Request payload for Education Calculator - Percent Covered | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mortgage_calculator_down_payment**
> dict(str, object) mortgage_calculator_down_payment(mortgage_calculator_down_payment_request)

Mortgage Calculator - Down Payment

Calculate the necessary down payment for the mortgage

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
mortgage_calculator_down_payment_request = proton_api.MortgageCalculatorDownPaymentRequest() # MortgageCalculatorDownPaymentRequest | Request payload for Mortgage Calculator - Down Payment

try:
    # Mortgage Calculator - Down Payment
    api_response = api_instance.mortgage_calculator_down_payment(mortgage_calculator_down_payment_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->mortgage_calculator_down_payment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgage_calculator_down_payment_request** | [**MortgageCalculatorDownPaymentRequest**](MortgageCalculatorDownPaymentRequest.md)| Request payload for Mortgage Calculator - Down Payment | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mortgage_calculator_home_price**
> dict(str, object) mortgage_calculator_home_price(mortgage_calculator_home_price_request)

Mortgage Calculator - Home Price

Calculate the achievable home price for the mortgage

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
mortgage_calculator_home_price_request = proton_api.MortgageCalculatorHomePriceRequest() # MortgageCalculatorHomePriceRequest | Request payload for Mortgage Calculator - Home Price

try:
    # Mortgage Calculator - Home Price
    api_response = api_instance.mortgage_calculator_home_price(mortgage_calculator_home_price_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->mortgage_calculator_home_price: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgage_calculator_home_price_request** | [**MortgageCalculatorHomePriceRequest**](MortgageCalculatorHomePriceRequest.md)| Request payload for Mortgage Calculator - Home Price | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mortgage_calculator_periodic_payment**
> dict(str, object) mortgage_calculator_periodic_payment(mortgage_calculator_periodic_payment_request)

Mortgage Calculator - Periodic Payment

Calculate the periodic payment for the mortgage

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
mortgage_calculator_periodic_payment_request = proton_api.MortgageCalculatorPeriodicPaymentRequest() # MortgageCalculatorPeriodicPaymentRequest | Request payload for Mortgage Calculator - Periodic Payment

try:
    # Mortgage Calculator - Periodic Payment
    api_response = api_instance.mortgage_calculator_periodic_payment(mortgage_calculator_periodic_payment_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->mortgage_calculator_periodic_payment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgage_calculator_periodic_payment_request** | [**MortgageCalculatorPeriodicPaymentRequest**](MortgageCalculatorPeriodicPaymentRequest.md)| Request payload for Mortgage Calculator - Periodic Payment | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **purchase_calculator_amount**
> dict(str, object) purchase_calculator_amount(purchase_calculator_amount_request)

Purchase Calculator - Amount

Calculate the achievable purchase amount

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
purchase_calculator_amount_request = proton_api.PurchaseCalculatorAmountRequest() # PurchaseCalculatorAmountRequest | Request payload for Purchase Calculator - Amount

try:
    # Purchase Calculator - Amount
    api_response = api_instance.purchase_calculator_amount(purchase_calculator_amount_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->purchase_calculator_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchase_calculator_amount_request** | [**PurchaseCalculatorAmountRequest**](PurchaseCalculatorAmountRequest.md)| Request payload for Purchase Calculator - Amount | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **purchase_calculator_deposit_amount**
> dict(str, object) purchase_calculator_deposit_amount(purchase_calculator_deposit_amount_request)

Purchase Calculator - Deposit Amount

Calculate the necessary periodic deposit amount to achieve the purchase amount

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
purchase_calculator_deposit_amount_request = proton_api.PurchaseCalculatorDepositAmountRequest() # PurchaseCalculatorDepositAmountRequest | Request payload for Purchase Calculator - Deposit Amount

try:
    # Purchase Calculator - Deposit Amount
    api_response = api_instance.purchase_calculator_deposit_amount(purchase_calculator_deposit_amount_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->purchase_calculator_deposit_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchase_calculator_deposit_amount_request** | [**PurchaseCalculatorDepositAmountRequest**](PurchaseCalculatorDepositAmountRequest.md)| Request payload for Purchase Calculator - Deposit Amount | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **purchase_calculator_horizon**
> dict(str, object) purchase_calculator_horizon(purchase_calculator_horizon_request)

Purchase Calculator - Horizon

Calculate the necessary time horizon to achieve the purchase amount

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
purchase_calculator_horizon_request = proton_api.PurchaseCalculatorHorizonRequest() # PurchaseCalculatorHorizonRequest | Request payload for Purchase Calculator - Horizon

try:
    # Purchase Calculator - Horizon
    api_response = api_instance.purchase_calculator_horizon(purchase_calculator_horizon_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->purchase_calculator_horizon: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchase_calculator_horizon_request** | [**PurchaseCalculatorHorizonRequest**](PurchaseCalculatorHorizonRequest.md)| Request payload for Purchase Calculator - Horizon | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retirement_calculator_deposit_amount**
> dict(str, object) retirement_calculator_deposit_amount(retirement_calculator_deposit_amount_request)

Retirement Calculator - Deposit Amount

Calculate the necessary period deposit amount to achieve the retirement expenses

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
retirement_calculator_deposit_amount_request = proton_api.RetirementCalculatorDepositAmountRequest() # RetirementCalculatorDepositAmountRequest | Request payload for Retirement Calculator - Deposit AMount

try:
    # Retirement Calculator - Deposit Amount
    api_response = api_instance.retirement_calculator_deposit_amount(retirement_calculator_deposit_amount_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->retirement_calculator_deposit_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirement_calculator_deposit_amount_request** | [**RetirementCalculatorDepositAmountRequest**](RetirementCalculatorDepositAmountRequest.md)| Request payload for Retirement Calculator - Deposit AMount | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retirement_calculator_expenses**
> dict(str, object) retirement_calculator_expenses(retirement_calculator_expenses_request)

Retirement Calculator - Expenses

Calculate the achievable retirement expenses

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
retirement_calculator_expenses_request = proton_api.RetirementCalculatorExpensesRequest() # RetirementCalculatorExpensesRequest | Request payload for Retirement Calculator - Expenses

try:
    # Retirement Calculator - Expenses
    api_response = api_instance.retirement_calculator_expenses(retirement_calculator_expenses_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->retirement_calculator_expenses: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirement_calculator_expenses_request** | [**RetirementCalculatorExpensesRequest**](RetirementCalculatorExpensesRequest.md)| Request payload for Retirement Calculator - Expenses | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retirement_calculator_percent_covered**
> dict(str, object) retirement_calculator_percent_covered(retirement_calculator_percent_covered_request)

Retirement Calculator - Percent Covered

Calculate the achievable percentage of retirement expenses that can be covered

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
api_instance = proton_api.FinancialPlanningApi(proton_api.ApiClient(configuration))
retirement_calculator_percent_covered_request = proton_api.RetirementCalculatorPercentCoveredRequest() # RetirementCalculatorPercentCoveredRequest | Request payload for Retirement Calculator - Percent Covered

try:
    # Retirement Calculator - Percent Covered
    api_response = api_instance.retirement_calculator_percent_covered(retirement_calculator_percent_covered_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialPlanningApi->retirement_calculator_percent_covered: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirement_calculator_percent_covered_request** | [**RetirementCalculatorPercentCoveredRequest**](RetirementCalculatorPercentCoveredRequest.md)| Request payload for Retirement Calculator - Percent Covered | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

