# swagger_client.SimulationsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backtest**](SimulationsApi.md#backtest) | **POST** /backtest | Backtest
[**event_study**](SimulationsApi.md#event_study) | **POST** /event_study | Event Study
[**monte_carlo**](SimulationsApi.md#monte_carlo) | **POST** /monte_carlo | Monte Carlo
[**portfolio_what_if**](SimulationsApi.md#portfolio_what_if) | **POST** /portfolio_what_if | Porfolio What-If
[**savings_calculator**](SimulationsApi.md#savings_calculator) | **POST** /savings_calculator | Savings Calculator
[**scenario_analysis**](SimulationsApi.md#scenario_analysis) | **POST** /scenario_analysis | Scenario Analysis
[**sensitivity_analysis**](SimulationsApi.md#sensitivity_analysis) | **POST** /sensitivity_analysis | Sensitivity Analysis


# **backtest**
> dict(str, object) backtest(backtest_request)

Backtest

Run a historical analysis for a group of investments

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
api_instance = proton_api.SimulationsApi(proton_api.ApiClient(configuration))
backtest_request = proton_api.BacktestRequest() # BacktestRequest | Request payload for Backtest

try:
    # Backtest
    api_response = api_instance.backtest(backtest_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SimulationsApi->backtest: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backtest_request** | [**BacktestRequest**](BacktestRequest.md)| Request payload for Backtest | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **event_study**
> dict(str, object) event_study(event_study_request)

Event Study

Analyze a group of investments against key historical events

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
api_instance = proton_api.SimulationsApi(proton_api.ApiClient(configuration))
event_study_request = proton_api.EventStudyRequest() # EventStudyRequest | Request payload for Event Study

try:
    # Event Study
    api_response = api_instance.event_study(event_study_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SimulationsApi->event_study: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_study_request** | [**EventStudyRequest**](EventStudyRequest.md)| Request payload for Event Study | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **monte_carlo**
> dict(str, object) monte_carlo(monte_carlo_request)

Monte Carlo

Simulate the future growth of a group of investments

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
api_instance = proton_api.SimulationsApi(proton_api.ApiClient(configuration))
monte_carlo_request = proton_api.MonteCarloRequest() # MonteCarloRequest | Request payload for Monte Carlo

try:
    # Monte Carlo
    api_response = api_instance.monte_carlo(monte_carlo_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SimulationsApi->monte_carlo: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monte_carlo_request** | [**MonteCarloRequest**](MonteCarloRequest.md)| Request payload for Monte Carlo | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **portfolio_what_if**
> dict(str, object) portfolio_what_if(portfolio_what_if_request)

Porfolio What-If

Simulate the impact of adding, removing, reducing, or increasing various positions in a group of investments

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
api_instance = proton_api.SimulationsApi(proton_api.ApiClient(configuration))
portfolio_what_if_request = proton_api.PortfolioWhatIfRequest() # PortfolioWhatIfRequest | Request payload for Portfolio What-If

try:
    # Porfolio What-If
    api_response = api_instance.portfolio_what_if(portfolio_what_if_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SimulationsApi->portfolio_what_if: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_what_if_request** | [**PortfolioWhatIfRequest**](PortfolioWhatIfRequest.md)| Request payload for Portfolio What-If | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **savings_calculator**
> dict(str, object) savings_calculator(savings_calculator_request)

Savings Calculator

Simulate the future growth of a simple savings account

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
api_instance = proton_api.SimulationsApi(proton_api.ApiClient(configuration))
savings_calculator_request = proton_api.SavingsCalculatorRequest() # SavingsCalculatorRequest | Request payload for Savings Calculator

try:
    # Savings Calculator
    api_response = api_instance.savings_calculator(savings_calculator_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SimulationsApi->savings_calculator: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savings_calculator_request** | [**SavingsCalculatorRequest**](SavingsCalculatorRequest.md)| Request payload for Savings Calculator | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scenario_analysis**
> dict(str, object) scenario_analysis(scneario_analysis_request)

Scenario Analysis

Analyze a group of investments against a series of external economic factors

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
api_instance = proton_api.SimulationsApi(proton_api.ApiClient(configuration))
scneario_analysis_request = proton_api.ScenarioAnalysisRequest() # ScenarioAnalysisRequest | Request payload for Scenario Analysis

try:
    # Scenario Analysis
    api_response = api_instance.scenario_analysis(scneario_analysis_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SimulationsApi->scenario_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scneario_analysis_request** | [**ScenarioAnalysisRequest**](ScenarioAnalysisRequest.md)| Request payload for Scenario Analysis | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sensitivity_analysis**
> dict(str, object) sensitivity_analysis(sensitivity_analysis_request)

Sensitivity Analysis

Analyze a group of investments against an external economic factor

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
api_instance = proton_api.SimulationsApi(proton_api.ApiClient(configuration))
sensitivity_analysis_request = proton_api.SensitivityAnalysisRequest() # SensitivityAnalysisRequest | Request payload for Sensitivity Analysis

try:
    # Sensitivity Analysis
    api_response = api_instance.sensitivity_analysis(sensitivity_analysis_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SimulationsApi->sensitivity_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensitivity_analysis_request** | [**SensitivityAnalysisRequest**](SensitivityAnalysisRequest.md)| Request payload for Sensitivity Analysis | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

