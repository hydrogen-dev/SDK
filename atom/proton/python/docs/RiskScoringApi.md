# swagger_client.RiskScoringApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dimensional_risk_score**](RiskScoringApi.md#dimensional_risk_score) | **POST** /dimensional_risk_score | Dimensional Risk Score
[**risk_allocation**](RiskScoringApi.md#risk_allocation) | **POST** /risk_allocation | Risk Allocation
[**risk_score**](RiskScoringApi.md#risk_score) | **POST** /risk_score | Risk Score


# **dimensional_risk_score**
> dict(str, object) dimensional_risk_score(dimensional_risk_score_request)

Dimensional Risk Score

Calculate a dimensional risk score based on questionnaire responses

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
api_instance = proton_api.RiskScoringApi(proton_api.ApiClient(configuration))
dimensional_risk_score_request = proton_api.DimensionalRiskScoreRequest() # DimensionalRiskScoreRequest | Request payload for Dimensional Risk Score

try:
    # Dimensional Risk Score
    api_response = api_instance.dimensional_risk_score(dimensional_risk_score_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RiskScoringApi->dimensional_risk_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dimensional_risk_score_request** | [**DimensionalRiskScoreRequest**](DimensionalRiskScoreRequest.md)| Request payload for Dimensional Risk Score | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **risk_allocation**
> dict(str, object) risk_allocation(risk_allocation_request)

Risk Allocation

Allocate based on a risk score

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
api_instance = proton_api.RiskScoringApi(proton_api.ApiClient(configuration))
risk_allocation_request = proton_api.RiskAllocationRequest() # RiskAllocationRequest | Request payload for Risk Allocation

try:
    # Risk Allocation
    api_response = api_instance.risk_allocation(risk_allocation_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RiskScoringApi->risk_allocation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_allocation_request** | [**RiskAllocationRequest**](RiskAllocationRequest.md)| Request payload for Risk Allocation | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **risk_score**
> dict(str, object) risk_score(risk_score_request)

Risk Score

Calculate a risk score based on questionnaire responses

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
api_instance = proton_api.RiskScoringApi(proton_api.ApiClient(configuration))
risk_score_request = proton_api.RiskScoreRequest() # RiskScoreRequest | Request payload for Risk Score

try:
    # Risk Score
    api_response = api_instance.risk_score(risk_score_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RiskScoringApi->risk_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_score_request** | [**RiskScoreRequest**](RiskScoreRequest.md)| Request payload for Risk Score | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

