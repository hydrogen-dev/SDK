# swagger_client.TokenCrowdsaleApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deploy_crowdsale_using_post**](TokenCrowdsaleApi.md#deploy_crowdsale_using_post) | **POST** /crowdsale/deploy | Deploy token for Crowdsale
[**fund_crowdsale_using_post**](TokenCrowdsaleApi.md#fund_crowdsale_using_post) | **POST** /crowdsale/fund | Fund/add Tokens supply to Crowdsale
[**purchase_crowdsale_using_post**](TokenCrowdsaleApi.md#purchase_crowdsale_using_post) | **POST** /crowdsale/purchase | Purchase Tokens from Crowdsale


# **deploy_crowdsale_using_post**
> TransactionSuccessResponse deploy_crowdsale_using_post(crowdsale_deploy_params)

Deploy token for Crowdsale

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.TokenCrowdsaleApi(molecule_api.ApiClient(configuration))
crowdsale_deploy_params = molecule_api.CrowdsaleDeployParams() # CrowdsaleDeployParams | Deploy token for Crowdsale

try:
    # Deploy token for Crowdsale
    api_response = api_instance.deploy_crowdsale_using_post(crowdsale_deploy_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenCrowdsaleApi->deploy_crowdsale_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsale_deploy_params** | [**CrowdsaleDeployParams**](CrowdsaleDeployParams.md)| Deploy token for Crowdsale | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fund_crowdsale_using_post**
> TransactionSuccessResponse fund_crowdsale_using_post(crowdsale_fund_params)

Fund/add Tokens supply to Crowdsale

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.TokenCrowdsaleApi(molecule_api.ApiClient(configuration))
crowdsale_fund_params = molecule_api.CrowdsaleFundParams() # CrowdsaleFundParams | Fund provided Token's supply to Crowdsale

try:
    # Fund/add Tokens supply to Crowdsale
    api_response = api_instance.fund_crowdsale_using_post(crowdsale_fund_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenCrowdsaleApi->fund_crowdsale_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsale_fund_params** | [**CrowdsaleFundParams**](CrowdsaleFundParams.md)| Fund provided Token&#39;s supply to Crowdsale | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **purchase_crowdsale_using_post**
> TransactionSuccessResponse purchase_crowdsale_using_post(crowdsale_purchase_params)

Purchase Tokens from Crowdsale

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.TokenCrowdsaleApi(molecule_api.ApiClient(configuration))
crowdsale_purchase_params = molecule_api.CrowdsalePurchaseParams() # CrowdsalePurchaseParams | Purchase Tokens

try:
    # Purchase Tokens from Crowdsale
    api_response = api_instance.purchase_crowdsale_using_post(crowdsale_purchase_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenCrowdsaleApi->purchase_crowdsale_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsale_purchase_params** | [**CrowdsalePurchaseParams**](CrowdsalePurchaseParams.md)| Purchase Tokens | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

