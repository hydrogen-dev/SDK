# proton_api.LifeInsuranceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**life_insurance_needs_calculator**](LifeInsuranceApi.md#life_insurance_needs_calculator) | **POST** /life_insurance/needs_calculator | Life Insurance Needs Calculator


# **life_insurance_needs_calculator**
> dict(str, object) life_insurance_needs_calculator(life_insurance_needs_calculator_request)

Life Insurance Needs Calculator

Calculate life insurance needs based on existing asset and liability data

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
api_instance = proton_api.LifeInsuranceApi(proton_api.ApiClient(configuration))
life_insurance_needs_calculator_request = proton_api.LifeInsuranceNeedsCalculatorRequest() # LifeInsuranceNeedsCalculatorRequest | Request payload for Life Insurance Needs Calculator

try:
    # Life Insurance Needs Calculator
    api_response = api_instance.life_insurance_needs_calculator(life_insurance_needs_calculator_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LifeInsuranceApi->life_insurance_needs_calculator: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **life_insurance_needs_calculator_request** | [**LifeInsuranceNeedsCalculatorRequest**](LifeInsuranceNeedsCalculatorRequest.md)| Request payload for Life Insurance Needs Calculator | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

