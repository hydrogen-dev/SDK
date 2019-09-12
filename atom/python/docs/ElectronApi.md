# atom_api.ElectronApi

All URIs are relative to *https://sandbox.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_campaign**](ElectronApi.md#delete_campaign) | **DELETE** /electron/v1/campaign/{campaign_id} | Delete a marketing campaign
[**delete_campaign_data_record**](ElectronApi.md#delete_campaign_data_record) | **DELETE** /electron/v1/campaign_data/{campaign_data_id} | Delete a marketing campaign data record
[**delete_campaign_plan**](ElectronApi.md#delete_campaign_plan) | **DELETE** /electron/v1/campaign_plan/{campaign_plan_id} | Delete a marketing campaign plan
[**delete_chat_log**](ElectronApi.md#delete_chat_log) | **DELETE** /electron/v1/chat/{chat_id} | Delete a chat log
[**delete_client_campaign**](ElectronApi.md#delete_client_campaign) | **DELETE** /electron/v1/client_campaign/{client_campaign_id} | Remove a client from a campaign
[**delete_consultation**](ElectronApi.md#delete_consultation) | **DELETE** /electron/v1/consultation/{consultation_id} | Delete a consultation
[**delete_document**](ElectronApi.md#delete_document) | **DELETE** /electron/v1/document/{document_id} | Delete a document
[**delete_faq**](ElectronApi.md#delete_faq) | **DELETE** /electron/v1/faq/{faq_id} | Delete a FAQ
[**delete_sales_inquiry**](ElectronApi.md#delete_sales_inquiry) | **DELETE** /electron/v1/sales/{sales_id} | Delete a sales inquiry
[**delete_support_ticket**](ElectronApi.md#delete_support_ticket) | **DELETE** /electron/v1/support_ticket/{support_ticket_id} | Delete a support ticket
[**delete_support_ticket_comment**](ElectronApi.md#delete_support_ticket_comment) | **DELETE** /electron/v1/support_ticket_comment/{support_ticket_comment_id} | Delete a support ticket comment
[**get_campaign**](ElectronApi.md#get_campaign) | **GET** /electron/v1/campaign/{campaign_id} | Retrieve a marketing campaign
[**get_campaign_data_record**](ElectronApi.md#get_campaign_data_record) | **GET** /electron/v1/campaign_data/{campaign_data_id} | Retrieve a marketing campaign data record
[**get_campaign_data_records**](ElectronApi.md#get_campaign_data_records) | **GET** /electron/v1/campaign_data | List all marketing campaign data records
[**get_campaign_plan**](ElectronApi.md#get_campaign_plan) | **GET** /electron/v1/campaign_plan/{campaign_plan_id} | Retrieve a marketing campaign plan
[**get_campaign_plans**](ElectronApi.md#get_campaign_plans) | **GET** /electron/v1/campaign_plan | List all marketing campaign plans
[**get_campaigns**](ElectronApi.md#get_campaigns) | **GET** /electron/v1/campaign | List all marketing campaigns
[**get_chat_log**](ElectronApi.md#get_chat_log) | **GET** /electron/v1/chat/{chat_id} | Retrieve a chat log
[**get_chat_logs**](ElectronApi.md#get_chat_logs) | **GET** /electron/v1/chat | List all chat logs
[**get_client_campaign**](ElectronApi.md#get_client_campaign) | **GET** /electron/v1/client_campaign/{client_campaign_id} | Retrieve a client assigned to a campaign
[**get_client_campaigns**](ElectronApi.md#get_client_campaigns) | **GET** /electron/v1/client_campaign | List information for all clients that are assigned to a marketing campaign defined for your firm
[**get_consultation**](ElectronApi.md#get_consultation) | **GET** /electron/v1/consultation/{consultation_id} | Retrieve a consultation
[**get_consultations**](ElectronApi.md#get_consultations) | **GET** /electron/v1/consultation | List all consultations
[**get_document**](ElectronApi.md#get_document) | **GET** /electron/v1/document/{document_id} | Retrieve a document
[**get_documents**](ElectronApi.md#get_documents) | **GET** /electron/v1/document | List all documents
[**get_faq**](ElectronApi.md#get_faq) | **GET** /electron/v1/faq/{faq_id} | Retrieve a FAQ
[**get_faqs**](ElectronApi.md#get_faqs) | **GET** /electron/v1/faq | List all FAQs
[**get_sales_inquiries**](ElectronApi.md#get_sales_inquiries) | **GET** /electron/v1/sales | List all sales inquiries
[**get_sales_inquiry**](ElectronApi.md#get_sales_inquiry) | **GET** /electron/v1/sales/{sales_id} | Retrieve a sales inquiry
[**get_support_ticket**](ElectronApi.md#get_support_ticket) | **GET** /electron/v1/support_ticket/{support_ticket_id} | Retrieve a support ticket
[**get_support_ticket_comment**](ElectronApi.md#get_support_ticket_comment) | **GET** /electron/v1/support_ticket_comment/{support_ticket_comment_id} | Retrieve a support ticket comment
[**get_support_ticket_comments**](ElectronApi.md#get_support_ticket_comments) | **GET** /electron/v1/support_ticket_comment | List all support ticket comments
[**get_support_tickets**](ElectronApi.md#get_support_tickets) | **GET** /electron/v1/support_ticket | List all support tickets
[**post_campaign**](ElectronApi.md#post_campaign) | **POST** /electron/v1/campaign | Create a marketing campaign
[**post_campaign_data_record**](ElectronApi.md#post_campaign_data_record) | **POST** /electron/v1/campaign_data | Create a marketing campaign data record
[**post_campaign_plan**](ElectronApi.md#post_campaign_plan) | **POST** /electron/v1/campaign_plan | Create a marketing campaign plan
[**post_chat_log**](ElectronApi.md#post_chat_log) | **POST** /electron/v1/chat | Create a chat log
[**post_client_campaign**](ElectronApi.md#post_client_campaign) | **POST** /electron/v1/client_campaign | Assign a client to a campaign to indicate the client has registered through the campaign specified
[**post_consultation**](ElectronApi.md#post_consultation) | **POST** /electron/v1/consultation | Create a consultation
[**post_document**](ElectronApi.md#post_document) | **POST** /electron/v1/document | Create a document
[**post_faq**](ElectronApi.md#post_faq) | **POST** /electron/v1/faq | Create a faq
[**post_sales_inquiry**](ElectronApi.md#post_sales_inquiry) | **POST** /electron/v1/sales | Create a sales inquiry
[**post_support_ticket**](ElectronApi.md#post_support_ticket) | **POST** /electron/v1/support_ticket | Create a support ticket
[**post_support_ticket_comment**](ElectronApi.md#post_support_ticket_comment) | **POST** /electron/v1/support_ticket_comment | Create a support ticket comment
[**update_campaign**](ElectronApi.md#update_campaign) | **PUT** /electron/v1/campaign/{campaign_id} | Update a marketing campaign
[**update_campaign_data_record**](ElectronApi.md#update_campaign_data_record) | **PUT** /electron/v1/campaign_data/{campaign_data_id} | Update a marketing campaign data record
[**update_campaign_plan**](ElectronApi.md#update_campaign_plan) | **PUT** /electron/v1/campaign_plan/{campaign_plan_id} | Update a marketing campaign plan
[**update_chat_log**](ElectronApi.md#update_chat_log) | **PUT** /electron/v1/chat/{chat_id} | Update a chat log
[**update_client_campaign**](ElectronApi.md#update_client_campaign) | **PUT** /electron/v1/client_campaign/{client_campaign_id} | Update a client assigned to a campaign
[**update_consultation**](ElectronApi.md#update_consultation) | **PUT** /electron/v1/consultation/{consultation_id} | Update a consultation
[**update_document**](ElectronApi.md#update_document) | **PUT** /electron/v1/document/{document_id} | Update a document
[**update_faq**](ElectronApi.md#update_faq) | **PUT** /electron/v1/faq/{faq_id} | Update a FAQ
[**update_sales_inquiry**](ElectronApi.md#update_sales_inquiry) | **PUT** /electron/v1/sales/{sales_id} | Update a sales inquiry
[**update_support_ticket**](ElectronApi.md#update_support_ticket) | **PUT** /electron/v1/support_ticket/{support_ticket_id} | Update a support ticket
[**update_support_ticket_comment**](ElectronApi.md#update_support_ticket_comment) | **PUT** /electron/v1/support_ticket_comment/{support_ticket_comment_id} | Update a support ticket comment


# **delete_campaign**
> delete_campaign(campaign_id)

Delete a marketing campaign

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
campaign_id = 'campaign_id_example' # str | UUID of a marketing campaign

try:
    # Delete a marketing campaign
    api_instance.delete_campaign(campaign_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_campaign: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | [**str**](.md)| UUID of a marketing campaign | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_campaign_data_record**
> delete_campaign_data_record(campaign_data_id)

Delete a marketing campaign data record

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
campaign_data_id = 'campaign_data_id_example' # str | UUID of a campaign data record

try:
    # Delete a marketing campaign data record
    api_instance.delete_campaign_data_record(campaign_data_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_campaign_data_record: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_id** | [**str**](.md)| UUID of a campaign data record | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_campaign_plan**
> delete_campaign_plan(campaign_plan_id)

Delete a marketing campaign plan

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
campaign_plan_id = 'campaign_plan_id_example' # str | UUID of a campaign plan

try:
    # Delete a marketing campaign plan
    api_instance.delete_campaign_plan(campaign_plan_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_campaign_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_id** | [**str**](.md)| UUID of a campaign plan | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_chat_log**
> delete_chat_log(chat_id)

Delete a chat log

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
chat_id = 'chat_id_example' # str | UUID of a chat record

try:
    # Delete a chat log
    api_instance.delete_chat_log(chat_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_chat_log: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**str**](.md)| UUID of a chat record | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_client_campaign**
> delete_client_campaign(client_campaign_id)

Remove a client from a campaign

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
client_campaign_id = 'client_campaign_id_example' # str | UUID of a client campaign record

try:
    # Remove a client from a campaign
    api_instance.delete_client_campaign(client_campaign_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_client_campaign: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**str**](.md)| UUID of a client campaign record | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_consultation**
> delete_consultation(consultation_id)

Delete a consultation

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
consultation_id = 'consultation_id_example' # str | UUID of a consultation record

try:
    # Delete a consultation
    api_instance.delete_consultation(consultation_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_consultation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation_id** | [**str**](.md)| UUID of a consultation record | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_document**
> delete_document(document_id)

Delete a document

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
document_id = 'document_id_example' # str | UUID of a document

try:
    # Delete a document
    api_instance.delete_document(document_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_document: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | [**str**](.md)| UUID of a document | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_faq**
> delete_faq(faq_id)

Delete a FAQ

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
faq_id = 'faq_id_example' # str | UUID of a FAQ

try:
    # Delete a FAQ
    api_instance.delete_faq(faq_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_faq: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq_id** | [**str**](.md)| UUID of a FAQ | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_sales_inquiry**
> delete_sales_inquiry(sales_id)

Delete a sales inquiry

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
sales_id = 'sales_id_example' # str | UUID of a sales record

try:
    # Delete a sales inquiry
    api_instance.delete_sales_inquiry(sales_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_sales_inquiry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales_id** | [**str**](.md)| UUID of a sales record | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_support_ticket**
> delete_support_ticket(support_ticket_id)

Delete a support ticket

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
support_ticket_id = 'support_ticket_id_example' # str | UUID of a support ticket

try:
    # Delete a support ticket
    api_instance.delete_support_ticket(support_ticket_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_support_ticket: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_id** | [**str**](.md)| UUID of a support ticket | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_support_ticket_comment**
> delete_support_ticket_comment(support_ticket_comment_id)

Delete a support ticket comment

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
support_ticket_comment_id = 'support_ticket_comment_id_example' # str | UUID of a support ticket comment

try:
    # Delete a support ticket comment
    api_instance.delete_support_ticket_comment(support_ticket_comment_id)
except ApiException as e:
    print("Exception when calling ElectronApi->delete_support_ticket_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment_id** | [**str**](.md)| UUID of a support ticket comment | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign**
> SpecificCampaignResponse get_campaign(campaign_id)

Retrieve a marketing campaign

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
campaign_id = 'campaign_id_example' # str | UUID of a marketing campaign

try:
    # Retrieve a marketing campaign
    api_response = api_instance.get_campaign(campaign_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_campaign: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | [**str**](.md)| UUID of a marketing campaign | 

### Return type

[**SpecificCampaignResponse**](SpecificCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_data_record**
> SpecificCampaignDataResponse get_campaign_data_record(campaign_data_id)

Retrieve a marketing campaign data record

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
campaign_data_id = 'campaign_data_id_example' # str | UUID of a campaign data record

try:
    # Retrieve a marketing campaign data record
    api_response = api_instance.get_campaign_data_record(campaign_data_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_campaign_data_record: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_id** | [**str**](.md)| UUID of a campaign data record | 

### Return type

[**SpecificCampaignDataResponse**](SpecificCampaignDataResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_data_records**
> GetCampaignDataResponse get_campaign_data_records(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List all marketing campaign data records

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List all marketing campaign data records
    api_response = api_instance.get_campaign_data_records(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_campaign_data_records: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetCampaignDataResponse**](GetCampaignDataResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_plan**
> SpecificCampaignPlanResponse get_campaign_plan(campaign_plan_id)

Retrieve a marketing campaign plan

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
campaign_plan_id = 'campaign_plan_id_example' # str | UUID of a campaign plan

try:
    # Retrieve a marketing campaign plan
    api_response = api_instance.get_campaign_plan(campaign_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_campaign_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_id** | [**str**](.md)| UUID of a campaign plan | 

### Return type

[**SpecificCampaignPlanResponse**](SpecificCampaignPlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_plans**
> GetCampaignPlanResponse get_campaign_plans(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List all marketing campaign plans

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List all marketing campaign plans
    api_response = api_instance.get_campaign_plans(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_campaign_plans: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetCampaignPlanResponse**](GetCampaignPlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaigns**
> GetCampaignResponse get_campaigns(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List all marketing campaigns

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List all marketing campaigns
    api_response = api_instance.get_campaigns(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_campaigns: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chat_log**
> SpecificChatResponse get_chat_log(chat_id)

Retrieve a chat log

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
chat_id = 'chat_id_example' # str | UUID of a chat record

try:
    # Retrieve a chat log
    api_response = api_instance.get_chat_log(chat_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_chat_log: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**str**](.md)| UUID of a chat record | 

### Return type

[**SpecificChatResponse**](SpecificChatResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chat_logs**
> GetChatResponse get_chat_logs(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List all chat logs

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List all chat logs
    api_response = api_instance.get_chat_logs(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_chat_logs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetChatResponse**](GetChatResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_campaign**
> SpecificClientCampaignResponse get_client_campaign(client_campaign_id)

Retrieve a client assigned to a campaign

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
client_campaign_id = 'client_campaign_id_example' # str | UUID of a client campaign record

try:
    # Retrieve a client assigned to a campaign
    api_response = api_instance.get_client_campaign(client_campaign_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_client_campaign: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**str**](.md)| UUID of a client campaign record | 

### Return type

[**SpecificClientCampaignResponse**](SpecificClientCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_campaigns**
> GetClientCampaignResponse get_client_campaigns(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List information for all clients that are assigned to a marketing campaign defined for your firm

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List information for all clients that are assigned to a marketing campaign defined for your firm
    api_response = api_instance.get_client_campaigns(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_client_campaigns: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetClientCampaignResponse**](GetClientCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_consultation**
> SpecificConsultationResponse get_consultation(consultation_id)

Retrieve a consultation

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
consultation_id = 'consultation_id_example' # str | UUID of a consultation record

try:
    # Retrieve a consultation
    api_response = api_instance.get_consultation(consultation_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_consultation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation_id** | [**str**](.md)| UUID of a consultation record | 

### Return type

[**SpecificConsultationResponse**](SpecificConsultationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_consultations**
> GetConsultationResponse get_consultations(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List all consultations

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List all consultations
    api_response = api_instance.get_consultations(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_consultations: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetConsultationResponse**](GetConsultationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document**
> SpecificDocumentResponse get_document(document_id)

Retrieve a document

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
document_id = 'document_id_example' # str | UUID of a document

try:
    # Retrieve a document
    api_response = api_instance.get_document(document_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_document: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | [**str**](.md)| UUID of a document | 

### Return type

[**SpecificDocumentResponse**](SpecificDocumentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_documents**
> GetDocumentResponse get_documents(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List all documents

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List all documents
    api_response = api_instance.get_documents(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_documents: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetDocumentResponse**](GetDocumentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_faq**
> SpecificFaqResponse get_faq(faq_id)

Retrieve a FAQ

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
faq_id = 'faq_id_example' # str | UUID of a FAQ

try:
    # Retrieve a FAQ
    api_response = api_instance.get_faq(faq_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_faq: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq_id** | [**str**](.md)| UUID of a FAQ | 

### Return type

[**SpecificFaqResponse**](SpecificFaqResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_faqs**
> GetFaqResponse get_faqs(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List all FAQs

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List all FAQs
    api_response = api_instance.get_faqs(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_faqs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetFaqResponse**](GetFaqResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sales_inquiries**
> GetSalesResponse get_sales_inquiries(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List all sales inquiries

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List all sales inquiries
    api_response = api_instance.get_sales_inquiries(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_sales_inquiries: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetSalesResponse**](GetSalesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sales_inquiry**
> SpecificSalesResponse get_sales_inquiry(sales_id)

Retrieve a sales inquiry

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
sales_id = 'sales_id_example' # str | UUID of a sales record

try:
    # Retrieve a sales inquiry
    api_response = api_instance.get_sales_inquiry(sales_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_sales_inquiry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales_id** | [**str**](.md)| UUID of a sales record | 

### Return type

[**SpecificSalesResponse**](SpecificSalesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_support_ticket**
> SpecificSupportTicketResponse get_support_ticket(support_ticket_id)

Retrieve a support ticket

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
support_ticket_id = 'support_ticket_id_example' # str | UUID of a support ticket

try:
    # Retrieve a support ticket
    api_response = api_instance.get_support_ticket(support_ticket_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_support_ticket: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_id** | [**str**](.md)| UUID of a support ticket | 

### Return type

[**SpecificSupportTicketResponse**](SpecificSupportTicketResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_support_ticket_comment**
> SpecificSupportTicketCommentResponse get_support_ticket_comment(support_ticket_comment_id)

Retrieve a support ticket comment

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
support_ticket_comment_id = 'support_ticket_comment_id_example' # str | UUID of a support ticket comment

try:
    # Retrieve a support ticket comment
    api_response = api_instance.get_support_ticket_comment(support_ticket_comment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_support_ticket_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment_id** | [**str**](.md)| UUID of a support ticket comment | 

### Return type

[**SpecificSupportTicketCommentResponse**](SpecificSupportTicketCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_support_ticket_comments**
> GetSupportTicketCommentResponse get_support_ticket_comments(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List all support ticket comments

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List all support ticket comments
    api_response = api_instance.get_support_ticket_comments(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_support_ticket_comments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetSupportTicketCommentResponse**](GetSupportTicketCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_support_tickets**
> GetSupportTicketResponse get_support_tickets(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)

List all support tickets

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
filter = 'filter_example' # str | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. (optional)

try:
    # List all support tickets
    api_response = api_instance.get_support_tickets(page=page, size=size, order_by=order_by, ascending=ascending, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->get_support_tickets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **str**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetSupportTicketResponse**](GetSupportTicketResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_campaign**
> CreateCampaignResponse post_campaign(payload)

Create a marketing campaign

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.CampaignManagementPayload() # CampaignManagementPayload | 

try:
    # Create a marketing campaign
    api_response = api_instance.post_campaign(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_campaign: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CampaignManagementPayload**](CampaignManagementPayload.md)|  | 

### Return type

[**CreateCampaignResponse**](CreateCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_campaign_data_record**
> CreateCampaignDataResponse post_campaign_data_record(payload)

Create a marketing campaign data record

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.CampaignDataPayload() # CampaignDataPayload | 

try:
    # Create a marketing campaign data record
    api_response = api_instance.post_campaign_data_record(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_campaign_data_record: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CampaignDataPayload**](CampaignDataPayload.md)|  | 

### Return type

[**CreateCampaignDataResponse**](CreateCampaignDataResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_campaign_plan**
> CreateCampaignPlanResponse post_campaign_plan(payload)

Create a marketing campaign plan

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.CampaignPlanPayload() # CampaignPlanPayload | 

try:
    # Create a marketing campaign plan
    api_response = api_instance.post_campaign_plan(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_campaign_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CampaignPlanPayload**](CampaignPlanPayload.md)|  | 

### Return type

[**CreateCampaignPlanResponse**](CreateCampaignPlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_chat_log**
> CreateChatResponse post_chat_log(payload)

Create a chat log

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.ChatPayload() # ChatPayload | 

try:
    # Create a chat log
    api_response = api_instance.post_chat_log(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_chat_log: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ChatPayload**](ChatPayload.md)|  | 

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_client_campaign**
> CreateClientCampaignResponse post_client_campaign(payload)

Assign a client to a campaign to indicate the client has registered through the campaign specified

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.ClientCampaignPayload() # ClientCampaignPayload | 

try:
    # Assign a client to a campaign to indicate the client has registered through the campaign specified
    api_response = api_instance.post_client_campaign(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_client_campaign: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ClientCampaignPayload**](ClientCampaignPayload.md)|  | 

### Return type

[**CreateClientCampaignResponse**](CreateClientCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_consultation**
> CreateConsultationResponse post_consultation(payload)

Create a consultation

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.ConsultationPayload() # ConsultationPayload | 

try:
    # Create a consultation
    api_response = api_instance.post_consultation(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_consultation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ConsultationPayload**](ConsultationPayload.md)|  | 

### Return type

[**CreateConsultationResponse**](CreateConsultationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_document**
> CreateDocumentResponse post_document(payload)

Create a document

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.DocumentPayload() # DocumentPayload | 

try:
    # Create a document
    api_response = api_instance.post_document(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_document: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**DocumentPayload**](DocumentPayload.md)|  | 

### Return type

[**CreateDocumentResponse**](CreateDocumentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_faq**
> CreateFaqResponse post_faq(payload)

Create a faq

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.FaqPayload() # FaqPayload | 

try:
    # Create a faq
    api_response = api_instance.post_faq(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_faq: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**FaqPayload**](FaqPayload.md)|  | 

### Return type

[**CreateFaqResponse**](CreateFaqResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_sales_inquiry**
> CreateSalesResponse post_sales_inquiry(payload)

Create a sales inquiry

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.SalesPayload() # SalesPayload | 

try:
    # Create a sales inquiry
    api_response = api_instance.post_sales_inquiry(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_sales_inquiry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SalesPayload**](SalesPayload.md)|  | 

### Return type

[**CreateSalesResponse**](CreateSalesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_support_ticket**
> CreateSupportTicketResponse post_support_ticket(payload)

Create a support ticket

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.SupportTicketPayload() # SupportTicketPayload | 

try:
    # Create a support ticket
    api_response = api_instance.post_support_ticket(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_support_ticket: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SupportTicketPayload**](SupportTicketPayload.md)|  | 

### Return type

[**CreateSupportTicketResponse**](CreateSupportTicketResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_support_ticket_comment**
> CreateSupportTicketCommentResponse post_support_ticket_comment(payload)

Create a support ticket comment

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
payload = atom_api.SupportTicketCommentPayload() # SupportTicketCommentPayload | 

try:
    # Create a support ticket comment
    api_response = api_instance.post_support_ticket_comment(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->post_support_ticket_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SupportTicketCommentPayload**](SupportTicketCommentPayload.md)|  | 

### Return type

[**CreateSupportTicketCommentResponse**](CreateSupportTicketCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_campaign**
> SpecificCampaignResponse update_campaign(campaign_id, payload)

Update a marketing campaign

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
campaign_id = 'campaign_id_example' # str | UUID of a marketing campaign
payload = atom_api.ClientCampaignPayload() # ClientCampaignPayload | 

try:
    # Update a marketing campaign
    api_response = api_instance.update_campaign(campaign_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_campaign: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | [**str**](.md)| UUID of a marketing campaign | 
 **payload** | [**ClientCampaignPayload**](ClientCampaignPayload.md)|  | 

### Return type

[**SpecificCampaignResponse**](SpecificCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_campaign_data_record**
> SpecificCampaignDataResponse update_campaign_data_record(campaign_data_id, payload)

Update a marketing campaign data record

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
campaign_data_id = 'campaign_data_id_example' # str | UUID of a campaign data record
payload = atom_api.CampaignDataPayload() # CampaignDataPayload | 

try:
    # Update a marketing campaign data record
    api_response = api_instance.update_campaign_data_record(campaign_data_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_campaign_data_record: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_data_id** | [**str**](.md)| UUID of a campaign data record | 
 **payload** | [**CampaignDataPayload**](CampaignDataPayload.md)|  | 

### Return type

[**SpecificCampaignDataResponse**](SpecificCampaignDataResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_campaign_plan**
> SpecificCampaignPlanResponse update_campaign_plan(campaign_plan_id, payload)

Update a marketing campaign plan

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
campaign_plan_id = 'campaign_plan_id_example' # str | UUID of a campaign plan
payload = atom_api.CampaignPlanPayload() # CampaignPlanPayload | 

try:
    # Update a marketing campaign plan
    api_response = api_instance.update_campaign_plan(campaign_plan_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_campaign_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_plan_id** | [**str**](.md)| UUID of a campaign plan | 
 **payload** | [**CampaignPlanPayload**](CampaignPlanPayload.md)|  | 

### Return type

[**SpecificCampaignPlanResponse**](SpecificCampaignPlanResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_chat_log**
> SpecificChatResponse update_chat_log(chat_id, payload)

Update a chat log

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
chat_id = 'chat_id_example' # str | UUID of a chat record
payload = atom_api.ChatPayload() # ChatPayload | 

try:
    # Update a chat log
    api_response = api_instance.update_chat_log(chat_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_chat_log: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chat_id** | [**str**](.md)| UUID of a chat record | 
 **payload** | [**ChatPayload**](ChatPayload.md)|  | 

### Return type

[**SpecificChatResponse**](SpecificChatResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_client_campaign**
> SpecificClientCampaignResponse update_client_campaign(client_campaign_id, payload)

Update a client assigned to a campaign

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
client_campaign_id = 'client_campaign_id_example' # str | UUID of a client campaign record
payload = atom_api.ClientCampaignPayload() # ClientCampaignPayload | 

try:
    # Update a client assigned to a campaign
    api_response = api_instance.update_client_campaign(client_campaign_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_client_campaign: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_campaign_id** | [**str**](.md)| UUID of a client campaign record | 
 **payload** | [**ClientCampaignPayload**](ClientCampaignPayload.md)|  | 

### Return type

[**SpecificClientCampaignResponse**](SpecificClientCampaignResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_consultation**
> SpecificConsultationResponse update_consultation(consultation_id, payload)

Update a consultation

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
consultation_id = 'consultation_id_example' # str | UUID of a consultation record
payload = atom_api.ConsultationPayload() # ConsultationPayload | 

try:
    # Update a consultation
    api_response = api_instance.update_consultation(consultation_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_consultation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consultation_id** | [**str**](.md)| UUID of a consultation record | 
 **payload** | [**ConsultationPayload**](ConsultationPayload.md)|  | 

### Return type

[**SpecificConsultationResponse**](SpecificConsultationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_document**
> SpecificDocumentResponse update_document(document_id, payload)

Update a document

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
document_id = 'document_id_example' # str | UUID of a document
payload = atom_api.DocumentPayload() # DocumentPayload | 

try:
    # Update a document
    api_response = api_instance.update_document(document_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_document: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | [**str**](.md)| UUID of a document | 
 **payload** | [**DocumentPayload**](DocumentPayload.md)|  | 

### Return type

[**SpecificDocumentResponse**](SpecificDocumentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_faq**
> SpecificFaqResponse update_faq(faq_id, payload)

Update a FAQ

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
faq_id = 'faq_id_example' # str | UUID of a FAQ
payload = atom_api.FaqPayload() # FaqPayload | 

try:
    # Update a FAQ
    api_response = api_instance.update_faq(faq_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_faq: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq_id** | [**str**](.md)| UUID of a FAQ | 
 **payload** | [**FaqPayload**](FaqPayload.md)|  | 

### Return type

[**SpecificFaqResponse**](SpecificFaqResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_sales_inquiry**
> SpecificSalesResponse update_sales_inquiry(sales_id, payload)

Update a sales inquiry

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
sales_id = 'sales_id_example' # str | UUID of a sales record
payload = atom_api.SalesPayload() # SalesPayload | 

try:
    # Update a sales inquiry
    api_response = api_instance.update_sales_inquiry(sales_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_sales_inquiry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sales_id** | [**str**](.md)| UUID of a sales record | 
 **payload** | [**SalesPayload**](SalesPayload.md)|  | 

### Return type

[**SpecificSalesResponse**](SpecificSalesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_support_ticket**
> SpecificSupportTicketResponse update_support_ticket(support_ticket_id, payload)

Update a support ticket

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
support_ticket_id = 'support_ticket_id_example' # str | UUID of a support ticket
payload = atom_api.SupportTicketPayload() # SupportTicketPayload | 

try:
    # Update a support ticket
    api_response = api_instance.update_support_ticket(support_ticket_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_support_ticket: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_id** | [**str**](.md)| UUID of a support ticket | 
 **payload** | [**SupportTicketPayload**](SupportTicketPayload.md)|  | 

### Return type

[**SpecificSupportTicketResponse**](SpecificSupportTicketResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_support_ticket_comment**
> SpecificSupportTicketCommentResponse update_support_ticket_comment(support_ticket_comment_id, payload)

Update a support ticket comment

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
api_instance = atom_api.ElectronApi(atom_api.ApiClient(configuration))
support_ticket_comment_id = 'support_ticket_comment_id_example' # str | UUID of a support ticket comment
payload = atom_api.SupportTicketCommentPayload() # SupportTicketCommentPayload | 

try:
    # Update a support ticket comment
    api_response = api_instance.update_support_ticket_comment(support_ticket_comment_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ElectronApi->update_support_ticket_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **support_ticket_comment_id** | [**str**](.md)| UUID of a support ticket comment | 
 **payload** | [**SupportTicketCommentPayload**](SupportTicketCommentPayload.md)|  | 

### Return type

[**SpecificSupportTicketCommentResponse**](SpecificSupportTicketCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

