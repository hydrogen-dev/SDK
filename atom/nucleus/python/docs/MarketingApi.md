# nucleus_api.MarketingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_campaign_data_using_post**](MarketingApi.md#create_campaign_data_using_post) | **POST** /campaign_data | Create a campaign data record
[**create_campaign_plan_using_post**](MarketingApi.md#create_campaign_plan_using_post) | **POST** /campaign_plan | Create a campaign plan
[**create_campaign_using_post**](MarketingApi.md#create_campaign_using_post) | **POST** /campaign | Create a campaign
[**create_client_campaign_using_post**](MarketingApi.md#create_client_campaign_using_post) | **POST** /client_campaign | Mark a client signing up through a campaign
[**delete_campaign_data_using_delete**](MarketingApi.md#delete_campaign_data_using_delete) | **DELETE** /campaign_data/{campaign_data_id} | Delete a campaign data record
[**delete_campaign_plan_using_delete**](MarketingApi.md#delete_campaign_plan_using_delete) | **DELETE** /campaign_plan/{campaign_plan_id} | Delete a campaign plan
[**delete_campaign_using_delete**](MarketingApi.md#delete_campaign_using_delete) | **DELETE** /campaign/{campaign_id} | Delete a campaign
[**delete_client_campaign_using_delete**](MarketingApi.md#delete_client_campaign_using_delete) | **DELETE** /client_campaign/{client_campaign_id} | Delete a clients/ips pair under a campaign
[**get_campaign_all_using_get**](MarketingApi.md#get_campaign_all_using_get) | **GET** /campaign | List all campaigns
[**get_campaign_data_all_using_get**](MarketingApi.md#get_campaign_data_all_using_get) | **GET** /campaign_data | List all campaign data
[**get_campaign_data_using_get**](MarketingApi.md#get_campaign_data_using_get) | **GET** /campaign_data/{campaign_data_id} | Retrieve a campaign data record
[**get_campaign_plan_all_using_get**](MarketingApi.md#get_campaign_plan_all_using_get) | **GET** /campaign_plan | List all campaign plans
[**get_campaign_plan_using_get**](MarketingApi.md#get_campaign_plan_using_get) | **GET** /campaign_plan/{campaign_plan_id} | Retrieve a campaign plan
[**get_campaign_using_get**](MarketingApi.md#get_campaign_using_get) | **GET** /campaign/{campaign_id} | Retrieve a campaign
[**get_client_campaign_all_using_get**](MarketingApi.md#get_client_campaign_all_using_get) | **GET** /client_campaign | List all clients/ips under a campaign
[**get_client_campaign_using_get**](MarketingApi.md#get_client_campaign_using_get) | **GET** /client_campaign/{client_campaign_id} | Retrieve a clients/ips pair under a campaign
[**update_campaign_data_using_put**](MarketingApi.md#update_campaign_data_using_put) | **PUT** /campaign_data/{campaign_data_id} | Update a campaign data record
[**update_campaign_plan_using_put**](MarketingApi.md#update_campaign_plan_using_put) | **PUT** /campaign_plan/{campaign_plan_id} | Update a campaign plan
[**update_campaign_using_put**](MarketingApi.md#update_campaign_using_put) | **PUT** /campaign/{campaign_id} | Update a campaign
[**update_client_campaign_using_put**](MarketingApi.md#update_client_campaign_using_put) | **PUT** /client_campaign/{client_campaign_id} | Update a clients/ips pair under a campaign


# **create_campaign_data_using_post**
> CampaignData create_campaign_data_using_post(campaign_data_request)

Create a campaign data record

Create a new  campaign data record for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_data_request = nucleus_api.CampaignData() # CampaignData | campaignDataRequest

try:
    # Create a campaign data record
    api_response = api_instance.create_campaign_data_using_post(campaign_data_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->create_campaign_data_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_request** | [**CampaignData**](CampaignData.md)| campaignDataRequest | 

### Return type

[**CampaignData**](CampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_campaign_plan_using_post**
> CampaignPlan create_campaign_plan_using_post(campaign_plan_request)

Create a campaign plan

Create a new campaign plan for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_plan_request = nucleus_api.CampaignPlan() # CampaignPlan | campaignPlanRequest

try:
    # Create a campaign plan
    api_response = api_instance.create_campaign_plan_using_post(campaign_plan_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->create_campaign_plan_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_request** | [**CampaignPlan**](CampaignPlan.md)| campaignPlanRequest | 

### Return type

[**CampaignPlan**](CampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_campaign_using_post**
> Campaign create_campaign_using_post(campaign_request)

Create a campaign

Create a new campaign for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_request = nucleus_api.Campaign() # Campaign | campaignRequest

try:
    # Create a campaign
    api_response = api_instance.create_campaign_using_post(campaign_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->create_campaign_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_request** | [**Campaign**](Campaign.md)| campaignRequest | 

### Return type

[**Campaign**](Campaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_client_campaign_using_post**
> ClientCampaignMapping create_client_campaign_using_post(campaign_mapping_request)

Mark a client signing up through a campaign

We are adding a campaign association to a clientId or ip.  We create this association because we are trying to measure how affective a campaign is in directing traffic to our website.  

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_mapping_request = nucleus_api.ClientCampaignMapping() # ClientCampaignMapping | campaignMappingRequest

try:
    # Mark a client signing up through a campaign
    api_response = api_instance.create_client_campaign_using_post(campaign_mapping_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->create_client_campaign_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_mapping_request** | [**ClientCampaignMapping**](ClientCampaignMapping.md)| campaignMappingRequest | 

### Return type

[**ClientCampaignMapping**](ClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_campaign_data_using_delete**
> delete_campaign_data_using_delete(campaign_data_id)

Delete a campaign data record

Permanently delete a campaign data record

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_data_id = 'campaign_data_id_example' # str | UUID campaign_data_id

try:
    # Delete a campaign data record
    api_instance.delete_campaign_data_using_delete(campaign_data_id)
except ApiException as e:
    print("Exception when calling MarketingApi->delete_campaign_data_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_id** | [**str**](.md)| UUID campaign_data_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_campaign_plan_using_delete**
> delete_campaign_plan_using_delete(campaign_plan_id)

Delete a campaign plan

Permanently delete a campaign plan

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_plan_id = 'campaign_plan_id_example' # str | UUID campaign_plan_id

try:
    # Delete a campaign plan
    api_instance.delete_campaign_plan_using_delete(campaign_plan_id)
except ApiException as e:
    print("Exception when calling MarketingApi->delete_campaign_plan_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_id** | [**str**](.md)| UUID campaign_plan_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_campaign_using_delete**
> delete_campaign_using_delete(campaign_id)

Delete a campaign

Permanently delete a campaign

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_id = 'campaign_id_example' # str | Campaign Id

try:
    # Delete a campaign
    api_instance.delete_campaign_using_delete(campaign_id)
except ApiException as e:
    print("Exception when calling MarketingApi->delete_campaign_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | [**str**](.md)| Campaign Id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_client_campaign_using_delete**
> delete_client_campaign_using_delete(client_campaign_id)

Delete a clients/ips pair under a campaign

Permanently delete a clients/ips pair under a campaign

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
client_campaign_id = 'client_campaign_id_example' # str | UUID client_campaign_id

try:
    # Delete a clients/ips pair under a campaign
    api_instance.delete_client_campaign_using_delete(client_campaign_id)
except ApiException as e:
    print("Exception when calling MarketingApi->delete_client_campaign_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**str**](.md)| UUID client_campaign_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_all_using_get**
> PageCampaign get_campaign_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all campaigns

Get details for all campaigns defined for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all campaigns
    api_response = api_instance.get_campaign_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->get_campaign_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageCampaign**](PageCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_data_all_using_get**
> PageCampaignData get_campaign_data_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all campaign data

Get details for all campaign data defined for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all campaign data
    api_response = api_instance.get_campaign_data_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->get_campaign_data_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageCampaignData**](PageCampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_data_using_get**
> CampaignData get_campaign_data_using_get(campaign_data_id)

Retrieve a campaign data record

Retrieve the information for a campaign data record

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_data_id = 'campaign_data_id_example' # str | UUID campaign_data_id

try:
    # Retrieve a campaign data record
    api_response = api_instance.get_campaign_data_using_get(campaign_data_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->get_campaign_data_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_id** | [**str**](.md)| UUID campaign_data_id | 

### Return type

[**CampaignData**](CampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_plan_all_using_get**
> PageCampaignPlan get_campaign_plan_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all campaign plans

Get details for all campaign plans defined for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all campaign plans
    api_response = api_instance.get_campaign_plan_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->get_campaign_plan_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageCampaignPlan**](PageCampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_plan_using_get**
> CampaignPlan get_campaign_plan_using_get(campaign_plan_id)

Retrieve a campaign plan

Retrieve the information for a campaign plan

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_plan_id = 'campaign_plan_id_example' # str | UUID campaign_plan_id

try:
    # Retrieve a campaign plan
    api_response = api_instance.get_campaign_plan_using_get(campaign_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->get_campaign_plan_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_id** | [**str**](.md)| UUID campaign_plan_id | 

### Return type

[**CampaignPlan**](CampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_using_get**
> Campaign get_campaign_using_get(campaign_id)

Retrieve a campaign

Retrieve the information for a campaign.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_id = 'campaign_id_example' # str | Campaign Id

try:
    # Retrieve a campaign
    api_response = api_instance.get_campaign_using_get(campaign_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->get_campaign_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | [**str**](.md)| Campaign Id | 

### Return type

[**Campaign**](Campaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_campaign_all_using_get**
> PageClientCampaignMapping get_client_campaign_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all clients/ips under a campaign

Get details for all clients/ips under a campaign

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all clients/ips under a campaign
    api_response = api_instance.get_client_campaign_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->get_client_campaign_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageClientCampaignMapping**](PageClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_campaign_using_get**
> ClientCampaignMapping get_client_campaign_using_get(client_campaign_id)

Retrieve a clients/ips pair under a campaign

Retrieve the information for a clients/ips pair under a campaign

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
client_campaign_id = 'client_campaign_id_example' # str | UUID client_campaign_id

try:
    # Retrieve a clients/ips pair under a campaign
    api_response = api_instance.get_client_campaign_using_get(client_campaign_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->get_client_campaign_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**str**](.md)| UUID client_campaign_id | 

### Return type

[**ClientCampaignMapping**](ClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_campaign_data_using_put**
> CampaignData update_campaign_data_using_put(campaign_data, campaign_data_id)

Update a campaign data record

Updated the information for a campaign data record

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_data = nucleus_api.CampaignPlan() # CampaignPlan | campaign_data
campaign_data_id = 'campaign_data_id_example' # str | UUID campaign_data_id

try:
    # Update a campaign data record
    api_response = api_instance.update_campaign_data_using_put(campaign_data, campaign_data_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->update_campaign_data_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data** | [**CampaignPlan**](CampaignPlan.md)| campaign_data | 
 **campaign_data_id** | [**str**](.md)| UUID campaign_data_id | 

### Return type

[**CampaignData**](CampaignData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_campaign_plan_using_put**
> CampaignPlan update_campaign_plan_using_put(campaign_plan, campaign_plan_id)

Update a campaign plan

Updated the information for a campaign plan

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign_plan = nucleus_api.CampaignPlan() # CampaignPlan | campaign_plan
campaign_plan_id = 'campaign_plan_id_example' # str | UUID campaign_plan_id

try:
    # Update a campaign plan
    api_response = api_instance.update_campaign_plan_using_put(campaign_plan, campaign_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->update_campaign_plan_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan** | [**CampaignPlan**](CampaignPlan.md)| campaign_plan | 
 **campaign_plan_id** | [**str**](.md)| UUID campaign_plan_id | 

### Return type

[**CampaignPlan**](CampaignPlan.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_campaign_using_put**
> Campaign update_campaign_using_put(campaign, campaign_id)

Update a campaign

Updated the information for a campaign

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
campaign = nucleus_api.Campaign() # Campaign | campaign
campaign_id = 'campaign_id_example' # str | UUID campaign_id

try:
    # Update a campaign
    api_response = api_instance.update_campaign_using_put(campaign, campaign_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->update_campaign_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign** | [**Campaign**](Campaign.md)| campaign | 
 **campaign_id** | [**str**](.md)| UUID campaign_id | 

### Return type

[**Campaign**](Campaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_client_campaign_using_put**
> ClientCampaignMapping update_client_campaign_using_put(client_campaign_id, json_node)

Update a clients/ips pair under a campaign

Updated the information for clients/ips pair under a campaign

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.MarketingApi(nucleus_api.ApiClient(configuration))
client_campaign_id = 'client_campaign_id_example' # str | UUID client_campaign_id
json_node = nucleus_api.JsonNode() # JsonNode | jsonNode

try:
    # Update a clients/ips pair under a campaign
    api_response = api_instance.update_client_campaign_using_put(client_campaign_id, json_node)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketingApi->update_client_campaign_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**str**](.md)| UUID client_campaign_id | 
 **json_node** | [**JsonNode**](JsonNode.md)| jsonNode | 

### Return type

[**ClientCampaignMapping**](ClientCampaignMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

