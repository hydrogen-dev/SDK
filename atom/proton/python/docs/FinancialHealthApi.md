# proton_api.FinancialHealthApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**diversification_score**](FinancialHealthApi.md#diversification_score) | **POST** /diversification_score | Diversification Score
[**emergency_fund_calculator**](FinancialHealthApi.md#emergency_fund_calculator) | **POST** /emergency_fund_calculator | Emergency Fund Calculator
[**financial_health_check**](FinancialHealthApi.md#financial_health_check) | **POST** /financial_health_check | Financial Health Check
[**portfolio_optimization_score**](FinancialHealthApi.md#portfolio_optimization_score) | **POST** /portfolio_optimization_score | Portfolio Optimization Score


# **diversification_score**
> dict(str, object) diversification_score(diversification_score_request)

Diversification Score

Assess how well a group of investments is diversified

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
api_instance = proton_api.FinancialHealthApi(proton_api.ApiClient(configuration))
diversification_score_request = proton_api.DiversificationScoreRequest() # DiversificationScoreRequest | Request payload for Diversification Score

try:
    # Diversification Score
    api_response = api_instance.diversification_score(diversification_score_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialHealthApi->diversification_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diversification_score_request** | [**DiversificationScoreRequest**](DiversificationScoreRequest.md)| Request payload for Diversification Score | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emergency_fund_calculator**
> dict(str, object) emergency_fund_calculator(emergency_fund_calculator_request)

Emergency Fund Calculator

Calculate a target emergency fund amount and savings plan

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
api_instance = proton_api.FinancialHealthApi(proton_api.ApiClient(configuration))
emergency_fund_calculator_request = proton_api.EmergencyFundCalculatorRequest() # EmergencyFundCalculatorRequest | Request payload for Emergency Fund Calculator

try:
    # Emergency Fund Calculator
    api_response = api_instance.emergency_fund_calculator(emergency_fund_calculator_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialHealthApi->emergency_fund_calculator: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emergency_fund_calculator_request** | [**EmergencyFundCalculatorRequest**](EmergencyFundCalculatorRequest.md)| Request payload for Emergency Fund Calculator | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **financial_health_check**
> dict(str, object) financial_health_check(financial_health_check_request)

Financial Health Check

Calculate a series of financial ratios to assess financial health

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
api_instance = proton_api.FinancialHealthApi(proton_api.ApiClient(configuration))
financial_health_check_request = proton_api.FinancialHealthCheckRequest() # FinancialHealthCheckRequest | Request payload for Financial Health Check

try:
    # Financial Health Check
    api_response = api_instance.financial_health_check(financial_health_check_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialHealthApi->financial_health_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_health_check_request** | [**FinancialHealthCheckRequest**](FinancialHealthCheckRequest.md)| Request payload for Financial Health Check | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **portfolio_optimization_score**
> dict(str, object) portfolio_optimization_score(portfolio_optimization_score_request)

Portfolio Optimization Score

Analyze a group of investments against the optimized result

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
api_instance = proton_api.FinancialHealthApi(proton_api.ApiClient(configuration))
portfolio_optimization_score_request = proton_api.PortfolioOptimizationScoreRequest() # PortfolioOptimizationScoreRequest | Request payload for Portfolio Optimization Score

try:
    # Portfolio Optimization Score
    api_response = api_instance.portfolio_optimization_score(portfolio_optimization_score_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialHealthApi->portfolio_optimization_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_optimization_score_request** | [**PortfolioOptimizationScoreRequest**](PortfolioOptimizationScoreRequest.md)| Request payload for Portfolio Optimization Score | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

