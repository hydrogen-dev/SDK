# proton_api.GoalsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goal_accumulation_allocation**](GoalsApi.md#goal_accumulation_allocation) | **POST** /goal_accumulation/allocation | Goal Accumulation Allocation
[**goal_accumulation_recommendation**](GoalsApi.md#goal_accumulation_recommendation) | **POST** /goal_accumulation/recommendation | Goal Accumulation Recommendation
[**goal_accumulation_status**](GoalsApi.md#goal_accumulation_status) | **POST** /goal_accumulation/status | Goal Accumulation Status
[**goal_decumulation_allocation**](GoalsApi.md#goal_decumulation_allocation) | **POST** /goal_decumulation/allocation | Goal Decumulation Allocation
[**goal_decumulation_recommendation**](GoalsApi.md#goal_decumulation_recommendation) | **POST** /goal_decumulation/recommendation | Goal Decumulation Recommendation
[**goal_decumulation_status**](GoalsApi.md#goal_decumulation_status) | **POST** /goal_decumulation/status | Goal Decumulation Status


# **goal_accumulation_allocation**
> dict(str, object) goal_accumulation_allocation(goal_accumulation_allocation_request)

Goal Accumulation Allocation

Allocate based on an accumulation goal

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
api_instance = proton_api.GoalsApi(proton_api.ApiClient(configuration))
goal_accumulation_allocation_request = proton_api.GoalAccumulationAllocationRequest() # GoalAccumulationAllocationRequest | Request payload for Goal Accumulation Allocation

try:
    # Goal Accumulation Allocation
    api_response = api_instance.goal_accumulation_allocation(goal_accumulation_allocation_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalsApi->goal_accumulation_allocation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_accumulation_allocation_request** | [**GoalAccumulationAllocationRequest**](GoalAccumulationAllocationRequest.md)| Request payload for Goal Accumulation Allocation | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_accumulation_recommendation**
> dict(str, object) goal_accumulation_recommendation(goal_accumulation_recommendation_request)

Goal Accumulation Recommendation

Generate recommendations to achieve an accumulation goal

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
api_instance = proton_api.GoalsApi(proton_api.ApiClient(configuration))
goal_accumulation_recommendation_request = proton_api.GoalAccumulationRecommendationRequest() # GoalAccumulationRecommendationRequest | Request payload for Goal Accumulation Recommendation

try:
    # Goal Accumulation Recommendation
    api_response = api_instance.goal_accumulation_recommendation(goal_accumulation_recommendation_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalsApi->goal_accumulation_recommendation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_accumulation_recommendation_request** | [**GoalAccumulationRecommendationRequest**](GoalAccumulationRecommendationRequest.md)| Request payload for Goal Accumulation Recommendation | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_accumulation_status**
> dict(str, object) goal_accumulation_status(goal_accumulation_status_request)

Goal Accumulation Status

Track the status of an accumulation goal

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
api_instance = proton_api.GoalsApi(proton_api.ApiClient(configuration))
goal_accumulation_status_request = proton_api.GoalAccumulationStatusRequest() # GoalAccumulationStatusRequest | Request payload for Goal Accumulation Status

try:
    # Goal Accumulation Status
    api_response = api_instance.goal_accumulation_status(goal_accumulation_status_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalsApi->goal_accumulation_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_accumulation_status_request** | [**GoalAccumulationStatusRequest**](GoalAccumulationStatusRequest.md)| Request payload for Goal Accumulation Status | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_decumulation_allocation**
> dict(str, object) goal_decumulation_allocation(goal_decumulation_allocation_request)

Goal Decumulation Allocation

Allocate based on a decumulation goal

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
api_instance = proton_api.GoalsApi(proton_api.ApiClient(configuration))
goal_decumulation_allocation_request = proton_api.GoalDecumulationAllocationRequest() # GoalDecumulationAllocationRequest | Request payload for Goal Decumulation Allocation

try:
    # Goal Decumulation Allocation
    api_response = api_instance.goal_decumulation_allocation(goal_decumulation_allocation_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalsApi->goal_decumulation_allocation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_decumulation_allocation_request** | [**GoalDecumulationAllocationRequest**](GoalDecumulationAllocationRequest.md)| Request payload for Goal Decumulation Allocation | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_decumulation_recommendation**
> dict(str, object) goal_decumulation_recommendation(goal_decumulation_recommendation_request)

Goal Decumulation Recommendation

Generate recommendations to achieve a decumulation goal

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
api_instance = proton_api.GoalsApi(proton_api.ApiClient(configuration))
goal_decumulation_recommendation_request = proton_api.GoalDecumulationRecommendationRequest() # GoalDecumulationRecommendationRequest | Request payload for Goal Decumulation Recommendation

try:
    # Goal Decumulation Recommendation
    api_response = api_instance.goal_decumulation_recommendation(goal_decumulation_recommendation_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalsApi->goal_decumulation_recommendation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_decumulation_recommendation_request** | [**GoalDecumulationRecommendationRequest**](GoalDecumulationRecommendationRequest.md)| Request payload for Goal Decumulation Recommendation | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **goal_decumulation_status**
> dict(str, object) goal_decumulation_status(goal_decumulation_status_request)

Goal Decumulation Status

Track the status of a decumulation goal

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
api_instance = proton_api.GoalsApi(proton_api.ApiClient(configuration))
goal_decumulation_status_request = proton_api.GoalDecumulationStatusRequest() # GoalDecumulationStatusRequest | Request payload for Goal Decumulation Status

try:
    # Goal Decumulation Status
    api_response = api_instance.goal_decumulation_status(goal_decumulation_status_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalsApi->goal_decumulation_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_decumulation_status_request** | [**GoalDecumulationStatusRequest**](GoalDecumulationStatusRequest.md)| Request payload for Goal Decumulation Status | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

