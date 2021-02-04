# proton_api.AnnuitiesApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annuity_calculator_accumulation_horizon**](AnnuitiesApi.md#annuity_calculator_accumulation_horizon) | **POST** /annuity_calculator/accumulation_horizon | Annuity Calculator - Accumulation Horizon
[**annuity_calculator_annuity_amount**](AnnuitiesApi.md#annuity_calculator_annuity_amount) | **POST** /annuity_calculator/annuity_amount | Annuity Calculator - Annuity Amount
[**annuity_calculator_decumulation_horizon**](AnnuitiesApi.md#annuity_calculator_decumulation_horizon) | **POST** /annuity_calculator/decumulation_horizon | Annuity Calculator - Decumulation Horizon
[**annuity_calculator_deposit_amount**](AnnuitiesApi.md#annuity_calculator_deposit_amount) | **POST** /annuity_calculator/deposit_amount | Annuity Calculator - Deposit Amount
[**annuity_calculator_initial_balance**](AnnuitiesApi.md#annuity_calculator_initial_balance) | **POST** /annuity_calculator/initial_balance | Annuity Calculator - Initial Balance
[**variable_annuity**](AnnuitiesApi.md#variable_annuity) | **POST** /variable_annuity | Variable Annuity


# **annuity_calculator_accumulation_horizon**
> dict(str, object) annuity_calculator_accumulation_horizon(annuity_calculator_accumulation_horizon_request)

Annuity Calculator - Accumulation Horizon

Calculate the necessary fixed annuity contribution period

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
api_instance = proton_api.AnnuitiesApi(proton_api.ApiClient(configuration))
annuity_calculator_accumulation_horizon_request = proton_api.AnnuityCalculatorAccumulationHorizonRequest() # AnnuityCalculatorAccumulationHorizonRequest | Request payload for Annuity Calculator - Accumulation Horizon

try:
    # Annuity Calculator - Accumulation Horizon
    api_response = api_instance.annuity_calculator_accumulation_horizon(annuity_calculator_accumulation_horizon_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnuitiesApi->annuity_calculator_accumulation_horizon: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_accumulation_horizon_request** | [**AnnuityCalculatorAccumulationHorizonRequest**](AnnuityCalculatorAccumulationHorizonRequest.md)| Request payload for Annuity Calculator - Accumulation Horizon | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **annuity_calculator_annuity_amount**
> dict(str, object) annuity_calculator_annuity_amount(annuity_calculator_annuity_amount_request)

Annuity Calculator - Annuity Amount

Calculate the achievable fixed annuity amount

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
api_instance = proton_api.AnnuitiesApi(proton_api.ApiClient(configuration))
annuity_calculator_annuity_amount_request = proton_api.AnnuityCalculatorAnnuityAmountRequest() # AnnuityCalculatorAnnuityAmountRequest | Request payload for Annuity Calculator - Annuity Amount

try:
    # Annuity Calculator - Annuity Amount
    api_response = api_instance.annuity_calculator_annuity_amount(annuity_calculator_annuity_amount_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnuitiesApi->annuity_calculator_annuity_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_annuity_amount_request** | [**AnnuityCalculatorAnnuityAmountRequest**](AnnuityCalculatorAnnuityAmountRequest.md)| Request payload for Annuity Calculator - Annuity Amount | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **annuity_calculator_decumulation_horizon**
> dict(str, object) annuity_calculator_decumulation_horizon(annuity_calculator_decumulation_horizon_request)

Annuity Calculator - Decumulation Horizon

Calculate the achievable fixed annuity payout period

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
api_instance = proton_api.AnnuitiesApi(proton_api.ApiClient(configuration))
annuity_calculator_decumulation_horizon_request = proton_api.AnnuityCalculatorDecumulationHorizonRequest() # AnnuityCalculatorDecumulationHorizonRequest | Request payload for Annuity Calculator - Decumulation Horizon

try:
    # Annuity Calculator - Decumulation Horizon
    api_response = api_instance.annuity_calculator_decumulation_horizon(annuity_calculator_decumulation_horizon_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnuitiesApi->annuity_calculator_decumulation_horizon: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_decumulation_horizon_request** | [**AnnuityCalculatorDecumulationHorizonRequest**](AnnuityCalculatorDecumulationHorizonRequest.md)| Request payload for Annuity Calculator - Decumulation Horizon | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **annuity_calculator_deposit_amount**
> dict(str, object) annuity_calculator_deposit_amount(annuity_calculator_deposit_amount_request)

Annuity Calculator - Deposit Amount

Calculate the necessary periodic deposit amount for a fixed annuity

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
api_instance = proton_api.AnnuitiesApi(proton_api.ApiClient(configuration))
annuity_calculator_deposit_amount_request = proton_api.AnnuityCalculatorDepositAmountRequest() # AnnuityCalculatorDepositAmountRequest | Request payload for Annuity Calculator - Deposit Amount

try:
    # Annuity Calculator - Deposit Amount
    api_response = api_instance.annuity_calculator_deposit_amount(annuity_calculator_deposit_amount_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnuitiesApi->annuity_calculator_deposit_amount: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_deposit_amount_request** | [**AnnuityCalculatorDepositAmountRequest**](AnnuityCalculatorDepositAmountRequest.md)| Request payload for Annuity Calculator - Deposit Amount | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **annuity_calculator_initial_balance**
> dict(str, object) annuity_calculator_initial_balance(annuity_calculator_initial_balance_request)

Annuity Calculator - Initial Balance

Calculate the necessary initial balance for a fixed annuity

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
api_instance = proton_api.AnnuitiesApi(proton_api.ApiClient(configuration))
annuity_calculator_initial_balance_request = proton_api.AnnuityCalculatorInitialBalanceRequest() # AnnuityCalculatorInitialBalanceRequest | Request payload for Annuity Calculator - Initial Balance

try:
    # Annuity Calculator - Initial Balance
    api_response = api_instance.annuity_calculator_initial_balance(annuity_calculator_initial_balance_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnuitiesApi->annuity_calculator_initial_balance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuity_calculator_initial_balance_request** | [**AnnuityCalculatorInitialBalanceRequest**](AnnuityCalculatorInitialBalanceRequest.md)| Request payload for Annuity Calculator - Initial Balance | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **variable_annuity**
> dict(str, object) variable_annuity(variable_annuity_request)

Variable Annuity

Project the behavior of a variable annuity over time

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
api_instance = proton_api.AnnuitiesApi(proton_api.ApiClient(configuration))
variable_annuity_request = proton_api.VariableAnnuityRequest() # VariableAnnuityRequest | Request payload for Variable Annuity

try:
    # Variable Annuity
    api_response = api_instance.variable_annuity(variable_annuity_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnuitiesApi->variable_annuity: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variable_annuity_request** | [**VariableAnnuityRequest**](VariableAnnuityRequest.md)| Request payload for Variable Annuity | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

