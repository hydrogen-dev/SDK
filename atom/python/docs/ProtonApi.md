# atom_api.ProtonApi

All URIs are relative to *https://sandbox.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annuity_calculator_accumulation_horizon**](ProtonApi.md#annuity_calculator_accumulation_horizon) | **POST** /proton/v1/annuity_calculator/accumulation_horizon | Annuity calculator - accumulation horizon
[**annuity_calculator_annuity_amount**](ProtonApi.md#annuity_calculator_annuity_amount) | **POST** /proton/v1/annuity_calculator/annuity_amount | Annuity calculator - annuity amount
[**annuity_calculator_decumulation_horizon**](ProtonApi.md#annuity_calculator_decumulation_horizon) | **POST** /proton/v1/annuity_calculator/decumulation_horizon | Annuity calculator - decumulation horizon
[**annuity_calculator_deposit_amount**](ProtonApi.md#annuity_calculator_deposit_amount) | **POST** /proton/v1/annuity_calculator/deposit_amount | Annuity calculator - deposit amount
[**annuity_calculator_initial_balance**](ProtonApi.md#annuity_calculator_initial_balance) | **POST** /proton/v1/annuity_calculator/initial_balance | Annuity calculator - initial balance
[**dimensional_risk_score**](ProtonApi.md#dimensional_risk_score) | **POST** /proton/v1/dimensional_risk_score | Dimensional risk score
[**education_calculator_annual_cost**](ProtonApi.md#education_calculator_annual_cost) | **POST** /proton/v1/education_calculator/annual_cost | Education calculator - total annual cost
[**education_calculator_deposit_amount**](ProtonApi.md#education_calculator_deposit_amount) | **POST** /proton/v1/education_calculator/deposit_amount | Education calculator - deposit amount
[**education_calculator_percent_covered**](ProtonApi.md#education_calculator_percent_covered) | **POST** /proton/v1/education_calculator/percent_covered | Education calculator - percent covered
[**emergency_fund_calculator**](ProtonApi.md#emergency_fund_calculator) | **POST** /proton/v1/emergency_fund_calculator | Emergency fund calculator
[**event_study**](ProtonApi.md#event_study) | **POST** /proton/v1/event_study | Event study
[**financial_health_check**](ProtonApi.md#financial_health_check) | **POST** /proton/v1/financial_health_check | Financial health check
[**goal_accumulation_allocation**](ProtonApi.md#goal_accumulation_allocation) | **POST** /proton/v1/goal_accumulation/allocation | Goal accumulation allocation
[**goal_accumulation_recommendation**](ProtonApi.md#goal_accumulation_recommendation) | **POST** /proton/v1/goal_accumulation/recommendation | Goal accumulation recommendation
[**goal_accumulation_status**](ProtonApi.md#goal_accumulation_status) | **POST** /proton/v1/goal_accumulation/status | Goal accumulation status
[**goal_decumulation_allocation**](ProtonApi.md#goal_decumulation_allocation) | **POST** /proton/v1/goal_decumulation/allocation | Goal decumulation allocation
[**goal_decumulation_recommendation**](ProtonApi.md#goal_decumulation_recommendation) | **POST** /proton/v1/goal_decumulation/recommendation | Goal decumulation recommendation
[**goal_decumulation_status**](ProtonApi.md#goal_decumulation_status) | **POST** /proton/v1/goal_decumulation/status | Goal decumulation status
[**life_insurance_needs_calculator**](ProtonApi.md#life_insurance_needs_calculator) | **POST** /proton/v1/life_insurance/needs_calculator | Life insurance needs calculator
[**model_backtest**](ProtonApi.md#model_backtest) | **POST** /proton/v1/backtest | Model backtest
[**monte_carlo**](ProtonApi.md#monte_carlo) | **POST** /proton/v1/monte_carlo | Monte Carlo
[**mortgage_calculator_down_payment**](ProtonApi.md#mortgage_calculator_down_payment) | **POST** /proton/v1/mortgage_calculator/down_payment | Mortgage calculator - down payment
[**mortgage_calculator_home_price**](ProtonApi.md#mortgage_calculator_home_price) | **POST** /proton/v1/mortgage_calculator/home_price | Mortgage calculator - home price
[**mortgage_calculator_periodic_payment**](ProtonApi.md#mortgage_calculator_periodic_payment) | **POST** /proton/v1/mortgage_calculator/periodic_payment | Mortgage calculator - periodic payment
[**mvo**](ProtonApi.md#mvo) | **POST** /proton/v1/mvo | Mean-variance optimization
[**portfolio_diversification_score**](ProtonApi.md#portfolio_diversification_score) | **POST** /proton/v1/diversification_score | Portfolio diversification score
[**portfolio_optimization_score**](ProtonApi.md#portfolio_optimization_score) | **POST** /proton/v1/portfolio_optimization_score | Portfolio optimization score
[**portfolio_what_if**](ProtonApi.md#portfolio_what_if) | **POST** /proton/v1/portfolio_what_if | Portfolio what-if
[**purchase_calculator_deposit_amount**](ProtonApi.md#purchase_calculator_deposit_amount) | **POST** /proton/v1/purchase_calculator/deposit_amount | Purchase calculator - deposit amount
[**purchase_calculator_horizon**](ProtonApi.md#purchase_calculator_horizon) | **POST** /proton/v1/purchase_calculator/horizon | Purchase calculator - horizon
[**purchase_calculator_purchase_amount**](ProtonApi.md#purchase_calculator_purchase_amount) | **POST** /proton/v1/purchase_calculator/amount | Purchase calculator - purchase amount
[**rebalancing_signal**](ProtonApi.md#rebalancing_signal) | **POST** /proton/v1/rebalancing_signal | Rebalancing
[**retirement_calculator_deposit_amount**](ProtonApi.md#retirement_calculator_deposit_amount) | **POST** /proton/v1/retirement_calculator/deposit_amount | Retirement calculator - deposit amount
[**retirement_calculator_expenses**](ProtonApi.md#retirement_calculator_expenses) | **POST** /proton/v1/retirement_calculator/expenses | Retirement calculator - expenses
[**retirement_calculator_percent_covered**](ProtonApi.md#retirement_calculator_percent_covered) | **POST** /proton/v1/retirement_calculator/percent_covered | Retirement calculator - percent of costs covered
[**risk_allocation**](ProtonApi.md#risk_allocation) | **POST** /proton/v1/risk_allocation | Risk allocation
[**risk_score**](ProtonApi.md#risk_score) | **POST** /proton/v1/risk_score | Risk score
[**savings_calculator**](ProtonApi.md#savings_calculator) | **POST** /proton/v1/savings_calculator | Savings calculator
[**scenario_analysis**](ProtonApi.md#scenario_analysis) | **POST** /proton/v1/scenario_analysis | Scenario analysis
[**sensitivity_analysis**](ProtonApi.md#sensitivity_analysis) | **POST** /proton/v1/sensitivity_analysis | Sensitivity analysis
[**variable_annuity**](ProtonApi.md#variable_annuity) | **POST** /proton/v1/variable_annuity | Variable annuity


# **annuity_calculator_accumulation_horizon**
> AnnuityAccumulationResponse annuity_calculator_accumulation_horizon(payload)

Annuity calculator - accumulation horizon

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.AnnuityCalculatorAccumulationHorizon() # AnnuityCalculatorAccumulationHorizon | 

try:
    # Annuity calculator - accumulation horizon
    api_response = api_instance.annuity_calculator_accumulation_horizon(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->annuity_calculator_accumulation_horizon: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorAccumulationHorizon**](AnnuityCalculatorAccumulationHorizon.md)|  | 

### Return type

[**AnnuityAccumulationResponse**](AnnuityAccumulationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **annuity_calculator_annuity_amount**
> AnnuityAmountResponse annuity_calculator_annuity_amount(payload)

Annuity calculator - annuity amount

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.AnnuityCalculatorAnnuityAmount() # AnnuityCalculatorAnnuityAmount | 

try:
    # Annuity calculator - annuity amount
    api_response = api_instance.annuity_calculator_annuity_amount(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->annuity_calculator_annuity_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorAnnuityAmount**](AnnuityCalculatorAnnuityAmount.md)|  | 

### Return type

[**AnnuityAmountResponse**](AnnuityAmountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **annuity_calculator_decumulation_horizon**
> AnnuityDecumulationResponse annuity_calculator_decumulation_horizon(payload)

Annuity calculator - decumulation horizon

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.AnnuityCalculatorDecumulationHorizon() # AnnuityCalculatorDecumulationHorizon | 

try:
    # Annuity calculator - decumulation horizon
    api_response = api_instance.annuity_calculator_decumulation_horizon(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->annuity_calculator_decumulation_horizon: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorDecumulationHorizon**](AnnuityCalculatorDecumulationHorizon.md)|  | 

### Return type

[**AnnuityDecumulationResponse**](AnnuityDecumulationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **annuity_calculator_deposit_amount**
> AnnuityDepositamountResponse annuity_calculator_deposit_amount(payload)

Annuity calculator - deposit amount

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.AnnuityCalculatorDepositAmount() # AnnuityCalculatorDepositAmount | 

try:
    # Annuity calculator - deposit amount
    api_response = api_instance.annuity_calculator_deposit_amount(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->annuity_calculator_deposit_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorDepositAmount**](AnnuityCalculatorDepositAmount.md)|  | 

### Return type

[**AnnuityDepositamountResponse**](AnnuityDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **annuity_calculator_initial_balance**
> AnnuityInitialbalanceResponse annuity_calculator_initial_balance(payload)

Annuity calculator - initial balance

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.AnnuityCalculatorInitialBalance() # AnnuityCalculatorInitialBalance | 

try:
    # Annuity calculator - initial balance
    api_response = api_instance.annuity_calculator_initial_balance(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->annuity_calculator_initial_balance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorInitialBalance**](AnnuityCalculatorInitialBalance.md)|  | 

### Return type

[**AnnuityInitialbalanceResponse**](AnnuityInitialbalanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dimensional_risk_score**
> DimRiskScoreResponse dimensional_risk_score(payload)

Dimensional risk score

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.DimensionalRiskScore() # DimensionalRiskScore | 

try:
    # Dimensional risk score
    api_response = api_instance.dimensional_risk_score(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->dimensional_risk_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**DimensionalRiskScore**](DimensionalRiskScore.md)|  | 

### Return type

[**DimRiskScoreResponse**](DimRiskScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **education_calculator_annual_cost**
> EducationCalculatorAnnualcostResponse education_calculator_annual_cost(payload)

Education calculator - total annual cost

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.EducationCalculatorAnnualCost() # EducationCalculatorAnnualCost | 

try:
    # Education calculator - total annual cost
    api_response = api_instance.education_calculator_annual_cost(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->education_calculator_annual_cost: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EducationCalculatorAnnualCost**](EducationCalculatorAnnualCost.md)|  | 

### Return type

[**EducationCalculatorAnnualcostResponse**](EducationCalculatorAnnualcostResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **education_calculator_deposit_amount**
> EducationCalculatorDepositamountResponse education_calculator_deposit_amount(payload)

Education calculator - deposit amount

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.EducationCalculatorDepositAmount() # EducationCalculatorDepositAmount | 

try:
    # Education calculator - deposit amount
    api_response = api_instance.education_calculator_deposit_amount(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->education_calculator_deposit_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EducationCalculatorDepositAmount**](EducationCalculatorDepositAmount.md)|  | 

### Return type

[**EducationCalculatorDepositamountResponse**](EducationCalculatorDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **education_calculator_percent_covered**
> EducationCalculatorPctcoveredResponse education_calculator_percent_covered(payload)

Education calculator - percent covered

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.EducationCalculatorPercentCovered() # EducationCalculatorPercentCovered | 

try:
    # Education calculator - percent covered
    api_response = api_instance.education_calculator_percent_covered(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->education_calculator_percent_covered: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EducationCalculatorPercentCovered**](EducationCalculatorPercentCovered.md)|  | 

### Return type

[**EducationCalculatorPctcoveredResponse**](EducationCalculatorPctcoveredResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **emergency_fund_calculator**
> EmergencyFundResponse emergency_fund_calculator(payload)

Emergency fund calculator

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.EmergencyFundCalculator() # EmergencyFundCalculator | 

try:
    # Emergency fund calculator
    api_response = api_instance.emergency_fund_calculator(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->emergency_fund_calculator: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EmergencyFundCalculator**](EmergencyFundCalculator.md)|  | 

### Return type

[**EmergencyFundResponse**](EmergencyFundResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **event_study**
> EventStudyResponse event_study(payload)

Event study

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.EventStudy() # EventStudy | 

try:
    # Event study
    api_response = api_instance.event_study(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->event_study: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EventStudy**](EventStudy.md)|  | 

### Return type

[**EventStudyResponse**](EventStudyResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **financial_health_check**
> HealthCheckResponse financial_health_check(payload)

Financial health check

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.FinancialHealthCheck() # FinancialHealthCheck | 

try:
    # Financial health check
    api_response = api_instance.financial_health_check(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->financial_health_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**FinancialHealthCheck**](FinancialHealthCheck.md)|  | 

### Return type

[**HealthCheckResponse**](HealthCheckResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_accumulation_allocation**
> GoalAllocationResponse goal_accumulation_allocation(payload)

Goal accumulation allocation

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.GoalAccumulationAllocation() # GoalAccumulationAllocation | 

try:
    # Goal accumulation allocation
    api_response = api_instance.goal_accumulation_allocation(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->goal_accumulation_allocation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalAccumulationAllocation**](GoalAccumulationAllocation.md)|  | 

### Return type

[**GoalAllocationResponse**](GoalAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_accumulation_recommendation**
> GoalRecommendationResponse goal_accumulation_recommendation(payload)

Goal accumulation recommendation

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.GoalAccumulationRecommendation() # GoalAccumulationRecommendation | 

try:
    # Goal accumulation recommendation
    api_response = api_instance.goal_accumulation_recommendation(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->goal_accumulation_recommendation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalAccumulationRecommendation**](GoalAccumulationRecommendation.md)|  | 

### Return type

[**GoalRecommendationResponse**](GoalRecommendationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_accumulation_status**
> GoalStatusResponse goal_accumulation_status(payload)

Goal accumulation status

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.GoalAccumulationStatus() # GoalAccumulationStatus | 

try:
    # Goal accumulation status
    api_response = api_instance.goal_accumulation_status(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->goal_accumulation_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalAccumulationStatus**](GoalAccumulationStatus.md)|  | 

### Return type

[**GoalStatusResponse**](GoalStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_decumulation_allocation**
> GoalAllocationResponse goal_decumulation_allocation(payload)

Goal decumulation allocation

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.GoalDecumulationAllocation() # GoalDecumulationAllocation | 

try:
    # Goal decumulation allocation
    api_response = api_instance.goal_decumulation_allocation(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->goal_decumulation_allocation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalDecumulationAllocation**](GoalDecumulationAllocation.md)|  | 

### Return type

[**GoalAllocationResponse**](GoalAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_decumulation_recommendation**
> GoalRecommendationResponse goal_decumulation_recommendation(payload)

Goal decumulation recommendation

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.GoalDecumulationRecommendation() # GoalDecumulationRecommendation | 

try:
    # Goal decumulation recommendation
    api_response = api_instance.goal_decumulation_recommendation(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->goal_decumulation_recommendation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalDecumulationRecommendation**](GoalDecumulationRecommendation.md)|  | 

### Return type

[**GoalRecommendationResponse**](GoalRecommendationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_decumulation_status**
> GoalStatusResponse goal_decumulation_status(payload)

Goal decumulation status

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.GoalDecumulationStatus() # GoalDecumulationStatus | 

try:
    # Goal decumulation status
    api_response = api_instance.goal_decumulation_status(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->goal_decumulation_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalDecumulationStatus**](GoalDecumulationStatus.md)|  | 

### Return type

[**GoalStatusResponse**](GoalStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **life_insurance_needs_calculator**
> LifeInsuranceNeedsResponse life_insurance_needs_calculator(payload)

Life insurance needs calculator

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.LifeInsuranceCalculator() # LifeInsuranceCalculator | 

try:
    # Life insurance needs calculator
    api_response = api_instance.life_insurance_needs_calculator(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->life_insurance_needs_calculator: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**LifeInsuranceCalculator**](LifeInsuranceCalculator.md)|  | 

### Return type

[**LifeInsuranceNeedsResponse**](LifeInsuranceNeedsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_backtest**
> BacktestResponse model_backtest(payload)

Model backtest

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.Backtest() # Backtest | 

try:
    # Model backtest
    api_response = api_instance.model_backtest(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->model_backtest: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Backtest**](Backtest.md)|  | 

### Return type

[**BacktestResponse**](BacktestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **monte_carlo**
> MonteCarloResponse monte_carlo(payload)

Monte Carlo

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.MonteCarlo() # MonteCarlo | 

try:
    # Monte Carlo
    api_response = api_instance.monte_carlo(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->monte_carlo: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MonteCarlo**](MonteCarlo.md)|  | 

### Return type

[**MonteCarloResponse**](MonteCarloResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mortgage_calculator_down_payment**
> MortgageCalculatorDownpaymentResponse mortgage_calculator_down_payment(payload)

Mortgage calculator - down payment

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.MortgageCalculatorDownPayment() # MortgageCalculatorDownPayment | 

try:
    # Mortgage calculator - down payment
    api_response = api_instance.mortgage_calculator_down_payment(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->mortgage_calculator_down_payment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MortgageCalculatorDownPayment**](MortgageCalculatorDownPayment.md)|  | 

### Return type

[**MortgageCalculatorDownpaymentResponse**](MortgageCalculatorDownpaymentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mortgage_calculator_home_price**
> MortgageCalculatorHomepriceResponse mortgage_calculator_home_price(payload)

Mortgage calculator - home price

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.MortgageCalculatorHomePrice() # MortgageCalculatorHomePrice | 

try:
    # Mortgage calculator - home price
    api_response = api_instance.mortgage_calculator_home_price(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->mortgage_calculator_home_price: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MortgageCalculatorHomePrice**](MortgageCalculatorHomePrice.md)|  | 

### Return type

[**MortgageCalculatorHomepriceResponse**](MortgageCalculatorHomepriceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mortgage_calculator_periodic_payment**
> MortgageCalculatorPeriodicpaymentResponse mortgage_calculator_periodic_payment(payload)

Mortgage calculator - periodic payment

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.MortgageCalculatorPeriodicPayment() # MortgageCalculatorPeriodicPayment | 

try:
    # Mortgage calculator - periodic payment
    api_response = api_instance.mortgage_calculator_periodic_payment(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->mortgage_calculator_periodic_payment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MortgageCalculatorPeriodicPayment**](MortgageCalculatorPeriodicPayment.md)|  | 

### Return type

[**MortgageCalculatorPeriodicpaymentResponse**](MortgageCalculatorPeriodicpaymentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mvo**
> MvoResponse mvo(payload)

Mean-variance optimization

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.OptConfigPortfolio() # OptConfigPortfolio | 

try:
    # Mean-variance optimization
    api_response = api_instance.mvo(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->mvo: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**OptConfigPortfolio**](OptConfigPortfolio.md)|  | 

### Return type

[**MvoResponse**](MvoResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **portfolio_diversification_score**
> PfloDiversificationScoreResponse portfolio_diversification_score(payload)

Portfolio diversification score

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.DiversificationScore() # DiversificationScore | 

try:
    # Portfolio diversification score
    api_response = api_instance.portfolio_diversification_score(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->portfolio_diversification_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**DiversificationScore**](DiversificationScore.md)|  | 

### Return type

[**PfloDiversificationScoreResponse**](PfloDiversificationScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **portfolio_optimization_score**
> PfloOptimizationScoreResponse portfolio_optimization_score(payload)

Portfolio optimization score

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.OptimizationScore() # OptimizationScore | 

try:
    # Portfolio optimization score
    api_response = api_instance.portfolio_optimization_score(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->portfolio_optimization_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**OptimizationScore**](OptimizationScore.md)|  | 

### Return type

[**PfloOptimizationScoreResponse**](PfloOptimizationScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **portfolio_what_if**
> PortfolioWhatIfResponse portfolio_what_if(payload)

Portfolio what-if

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.WhatIfPortfolio() # WhatIfPortfolio | 

try:
    # Portfolio what-if
    api_response = api_instance.portfolio_what_if(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->portfolio_what_if: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WhatIfPortfolio**](WhatIfPortfolio.md)|  | 

### Return type

[**PortfolioWhatIfResponse**](PortfolioWhatIfResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **purchase_calculator_deposit_amount**
> PurchaseCalculatorDepositamountResponse purchase_calculator_deposit_amount(payload)

Purchase calculator - deposit amount

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.PurchaseCalculatorDepositAmount() # PurchaseCalculatorDepositAmount | 

try:
    # Purchase calculator - deposit amount
    api_response = api_instance.purchase_calculator_deposit_amount(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->purchase_calculator_deposit_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PurchaseCalculatorDepositAmount**](PurchaseCalculatorDepositAmount.md)|  | 

### Return type

[**PurchaseCalculatorDepositamountResponse**](PurchaseCalculatorDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **purchase_calculator_horizon**
> PurchaseCalculatorPurchasehorizonResponse purchase_calculator_horizon(payload)

Purchase calculator - horizon

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.PurchaseCalculatorHorizon() # PurchaseCalculatorHorizon | 

try:
    # Purchase calculator - horizon
    api_response = api_instance.purchase_calculator_horizon(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->purchase_calculator_horizon: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PurchaseCalculatorHorizon**](PurchaseCalculatorHorizon.md)|  | 

### Return type

[**PurchaseCalculatorPurchasehorizonResponse**](PurchaseCalculatorPurchasehorizonResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **purchase_calculator_purchase_amount**
> PurchaseCalculatorPurchaseamountResponse purchase_calculator_purchase_amount(payload)

Purchase calculator - purchase amount

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.PurchaseCalculatorAmount() # PurchaseCalculatorAmount | 

try:
    # Purchase calculator - purchase amount
    api_response = api_instance.purchase_calculator_purchase_amount(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->purchase_calculator_purchase_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PurchaseCalculatorAmount**](PurchaseCalculatorAmount.md)|  | 

### Return type

[**PurchaseCalculatorPurchaseamountResponse**](PurchaseCalculatorPurchaseamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rebalancing_signal**
> RebalanceResponse rebalancing_signal(payload)

Rebalancing

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.Rebalance() # Rebalance | 

try:
    # Rebalancing
    api_response = api_instance.rebalancing_signal(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->rebalancing_signal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Rebalance**](Rebalance.md)|  | 

### Return type

[**RebalanceResponse**](RebalanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retirement_calculator_deposit_amount**
> RetirementCalculatorDepositamountResponse retirement_calculator_deposit_amount(payload)

Retirement calculator - deposit amount

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.RetirementCalculatorDepositAmount() # RetirementCalculatorDepositAmount | 

try:
    # Retirement calculator - deposit amount
    api_response = api_instance.retirement_calculator_deposit_amount(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->retirement_calculator_deposit_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RetirementCalculatorDepositAmount**](RetirementCalculatorDepositAmount.md)|  | 

### Return type

[**RetirementCalculatorDepositamountResponse**](RetirementCalculatorDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retirement_calculator_expenses**
> RetirementCalculatorExpensesResponse retirement_calculator_expenses(payload)

Retirement calculator - expenses

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.RetirementCalculatorExpenses() # RetirementCalculatorExpenses | 

try:
    # Retirement calculator - expenses
    api_response = api_instance.retirement_calculator_expenses(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->retirement_calculator_expenses: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RetirementCalculatorExpenses**](RetirementCalculatorExpenses.md)|  | 

### Return type

[**RetirementCalculatorExpensesResponse**](RetirementCalculatorExpensesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retirement_calculator_percent_covered**
> RetirementCalculatorPctcoveredResponse retirement_calculator_percent_covered(payload)

Retirement calculator - percent of costs covered

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.RetirementCalculatorPercentCovered() # RetirementCalculatorPercentCovered | 

try:
    # Retirement calculator - percent of costs covered
    api_response = api_instance.retirement_calculator_percent_covered(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->retirement_calculator_percent_covered: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RetirementCalculatorPercentCovered**](RetirementCalculatorPercentCovered.md)|  | 

### Return type

[**RetirementCalculatorPctcoveredResponse**](RetirementCalculatorPctcoveredResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **risk_allocation**
> RiskAllocationResponse risk_allocation(payload)

Risk allocation

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.RiskAllocation() # RiskAllocation | 

try:
    # Risk allocation
    api_response = api_instance.risk_allocation(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->risk_allocation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RiskAllocation**](RiskAllocation.md)|  | 

### Return type

[**RiskAllocationResponse**](RiskAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **risk_score**
> RiskScoreResponse risk_score(payload)

Risk score

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.RiskScore() # RiskScore | 

try:
    # Risk score
    api_response = api_instance.risk_score(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->risk_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RiskScore**](RiskScore.md)|  | 

### Return type

[**RiskScoreResponse**](RiskScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **savings_calculator**
> SavingsCalculatorResponse savings_calculator(payload)

Savings calculator

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.SimpleSavingsCalculator() # SimpleSavingsCalculator | 

try:
    # Savings calculator
    api_response = api_instance.savings_calculator(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->savings_calculator: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SimpleSavingsCalculator**](SimpleSavingsCalculator.md)|  | 

### Return type

[**SavingsCalculatorResponse**](SavingsCalculatorResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scenario_analysis**
> ScenarioAnalysisResponse scenario_analysis(payload)

Scenario analysis

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.ScenarioAnalysis() # ScenarioAnalysis | 

try:
    # Scenario analysis
    api_response = api_instance.scenario_analysis(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->scenario_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ScenarioAnalysis**](ScenarioAnalysis.md)|  | 

### Return type

[**ScenarioAnalysisResponse**](ScenarioAnalysisResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sensitivity_analysis**
> SensitivityAnalysisResponse sensitivity_analysis(payload)

Sensitivity analysis

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.SensitivityAnalysis() # SensitivityAnalysis | 

try:
    # Sensitivity analysis
    api_response = api_instance.sensitivity_analysis(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->sensitivity_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SensitivityAnalysis**](SensitivityAnalysis.md)|  | 

### Return type

[**SensitivityAnalysisResponse**](SensitivityAnalysisResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **variable_annuity**
> VariableAnnuityResponse variable_annuity(payload)

Variable annuity

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = atom_api.ProtonApi(atom_api.ApiClient(configuration))
payload = atom_api.VariableAnnuityPayload() # VariableAnnuityPayload | 

try:
    # Variable annuity
    api_response = api_instance.variable_annuity(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProtonApi->variable_annuity: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**VariableAnnuityPayload**](VariableAnnuityPayload.md)|  | 

### Return type

[**VariableAnnuityResponse**](VariableAnnuityResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

