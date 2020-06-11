# atom_api.QuestionnaireApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_answer_using_post**](QuestionnaireApi.md#create_answer_using_post) | **POST** /answer | Create an answer
[**create_client_response_using_post**](QuestionnaireApi.md#create_client_response_using_post) | **POST** /client_response | Create a client response
[**create_question_using_post**](QuestionnaireApi.md#create_question_using_post) | **POST** /question | Create a question
[**create_questionnaire_using_post**](QuestionnaireApi.md#create_questionnaire_using_post) | **POST** /questionnaire | Create a questionnaire
[**delete_answer_using_delete**](QuestionnaireApi.md#delete_answer_using_delete) | **DELETE** /answer/{answer_id} | Delete an answer
[**delete_client_response_using_delete**](QuestionnaireApi.md#delete_client_response_using_delete) | **DELETE** /client_response/{client_response_id} | Delete a client response
[**delete_question_using_delete**](QuestionnaireApi.md#delete_question_using_delete) | **DELETE** /question/{question_id} | Delete a question
[**delete_questionnaire_using_delete**](QuestionnaireApi.md#delete_questionnaire_using_delete) | **DELETE** /questionnaire/{questionnaire_id} | Delete a questionnaire
[**get_answer_all_using_get**](QuestionnaireApi.md#get_answer_all_using_get) | **GET** /answer | List all Answers
[**get_answer_using_get**](QuestionnaireApi.md#get_answer_using_get) | **GET** /answer/{answer_id} | Retrieve an answer
[**get_client_response_all_using_get**](QuestionnaireApi.md#get_client_response_all_using_get) | **GET** /client_response | List all client responses
[**get_client_response_using_get**](QuestionnaireApi.md#get_client_response_using_get) | **GET** /client_response/{client_response_id} | Retrieve a client response
[**get_question_all_using_get**](QuestionnaireApi.md#get_question_all_using_get) | **GET** /question | List all Questions
[**get_question_using_get**](QuestionnaireApi.md#get_question_using_get) | **GET** /question/{question_id} | Retrieve a question
[**get_questionnaire_all_using_get**](QuestionnaireApi.md#get_questionnaire_all_using_get) | **GET** /questionnaire | List all questionnaires
[**get_questionnaire_using_get**](QuestionnaireApi.md#get_questionnaire_using_get) | **GET** /questionnaire/{questionnaire_id} | Retrieve a questionnaire
[**update_answer_using_put**](QuestionnaireApi.md#update_answer_using_put) | **PUT** /answer/{answer_id} | Update an answer
[**update_client_response_using_put**](QuestionnaireApi.md#update_client_response_using_put) | **PUT** /client_response/{client_response_id} | Update a client response
[**update_question_using_put**](QuestionnaireApi.md#update_question_using_put) | **PUT** /question/{question_id} | Update a question.
[**update_questionnaire_using_put**](QuestionnaireApi.md#update_questionnaire_using_put) | **PUT** /questionnaire/{questionnaire_id} | Update a questionnaire


# **create_answer_using_post**
> Answer create_answer_using_post(answer)

Create an answer

Create a new answer for question.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
answer = atom_api.Answer() # Answer | answer

try:
    # Create an answer
    api_response = api_instance.create_answer_using_post(answer)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->create_answer_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer** | [**Answer**](Answer.md)| answer | 

### Return type

[**Answer**](Answer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_client_response_using_post**
> ClientResponse create_client_response_using_post(client_response)

Create a client response

Create a new client response for a question as part of a questionnaires.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
client_response = atom_api.ClientResponse() # ClientResponse | clientResponse

try:
    # Create a client response
    api_response = api_instance.create_client_response_using_post(client_response)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->create_client_response_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response** | [**ClientResponse**](ClientResponse.md)| clientResponse | 

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_question_using_post**
> Question create_question_using_post(question)

Create a question

Create a new question for questionnaire.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
question = atom_api.Question() # Question | question

try:
    # Create a question
    api_response = api_instance.create_question_using_post(question)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->create_question_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question** | [**Question**](Question.md)| question | 

### Return type

[**Question**](Question.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_questionnaire_using_post**
> Questionnaire create_questionnaire_using_post(questionnaire)

Create a questionnaire

Create a new questionnaire for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
questionnaire = atom_api.Questionnaire() # Questionnaire | questionnaire

try:
    # Create a questionnaire
    api_response = api_instance.create_questionnaire_using_post(questionnaire)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->create_questionnaire_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire** | [**Questionnaire**](Questionnaire.md)| questionnaire | 

### Return type

[**Questionnaire**](Questionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_answer_using_delete**
> delete_answer_using_delete(answer_id)

Delete an answer

Delete an answer for the question

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
answer_id = 'answer_id_example' # str | UUID answer_id

try:
    # Delete an answer
    api_instance.delete_answer_using_delete(answer_id)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->delete_answer_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer_id** | [**str**](.md)| UUID answer_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_client_response_using_delete**
> delete_client_response_using_delete(client_response_id)

Delete a client response

Permanently delete a client response for a client.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
client_response_id = 'client_response_id_example' # str | UUID client_response_id

try:
    # Delete a client response
    api_instance.delete_client_response_using_delete(client_response_id)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->delete_client_response_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response_id** | [**str**](.md)| UUID client_response_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_question_using_delete**
> delete_question_using_delete(question_id)

Delete a question

Delete an answer for the question

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
question_id = 'question_id_example' # str | UUID question_id

try:
    # Delete a question
    api_instance.delete_question_using_delete(question_id)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->delete_question_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question_id** | [**str**](.md)| UUID question_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_questionnaire_using_delete**
> delete_questionnaire_using_delete(questionnaire_id)

Delete a questionnaire

Permanently delete a questionnaire for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
questionnaire_id = 'questionnaire_id_example' # str | UUID questionnaire_id

try:
    # Delete a questionnaire
    api_instance.delete_questionnaire_using_delete(questionnaire_id)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->delete_questionnaire_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire_id** | [**str**](.md)| UUID questionnaire_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_answer_all_using_get**
> PageAnswer get_answer_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all Answers

Get information for all Answers

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'label' # str | order_by (optional) (default to label)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all Answers
    api_response = api_instance.get_answer_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->get_answer_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to label]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageAnswer**](PageAnswer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_answer_using_get**
> Answer get_answer_using_get(answer_id)

Retrieve an answer

Retrieve the information for an answer for question

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
answer_id = 'answer_id_example' # str | UUID answer_id

try:
    # Retrieve an answer
    api_response = api_instance.get_answer_using_get(answer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->get_answer_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer_id** | [**str**](.md)| UUID answer_id | 

### Return type

[**Answer**](Answer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_response_all_using_get**
> PageClientResponse get_client_response_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all client responses

Get all the client responses for questions as part of a questionnaire defined by your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all client responses
    api_response = api_instance.get_client_response_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->get_client_response_all_using_get: %s\n" % e)
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

[**PageClientResponse**](PageClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_response_using_get**
> ClientResponse get_client_response_using_get(client_response_id)

Retrieve a client response

Retrieve the information for a client response for a client.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
client_response_id = 'client_response_id_example' # str | UUID client_response_id

try:
    # Retrieve a client response
    api_response = api_instance.get_client_response_using_get(client_response_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->get_client_response_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response_id** | [**str**](.md)| UUID client_response_id | 

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_question_all_using_get**
> PageQuestion get_question_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all Questions

Get information for all Questions

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'order_index' # str | order_by (optional) (default to order_index)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all Questions
    api_response = api_instance.get_question_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->get_question_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to order_index]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageQuestion**](PageQuestion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_question_using_get**
> Question get_question_using_get(question_id)

Retrieve a question

Retrieve the information for a question for questionnaire

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
question_id = 'question_id_example' # str | UUID question_id

try:
    # Retrieve a question
    api_response = api_instance.get_question_using_get(question_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->get_question_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question_id** | [**str**](.md)| UUID question_id | 

### Return type

[**Question**](Question.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_questionnaire_all_using_get**
> PageQuestionnaire get_questionnaire_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all questionnaires

Get the information for all questionnaires defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all questionnaires
    api_response = api_instance.get_questionnaire_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->get_questionnaire_all_using_get: %s\n" % e)
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

[**PageQuestionnaire**](PageQuestionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_questionnaire_using_get**
> Questionnaire get_questionnaire_using_get(questionnaire_id)

Retrieve a questionnaire

Retrieve the information for a questionnaire for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
questionnaire_id = 'questionnaire_id_example' # str | UUID questionnaire_id

try:
    # Retrieve a questionnaire
    api_response = api_instance.get_questionnaire_using_get(questionnaire_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->get_questionnaire_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire_id** | [**str**](.md)| UUID questionnaire_id | 

### Return type

[**Questionnaire**](Questionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_answer_using_put**
> Answer update_answer_using_put(answer, answer_id)

Update an answer

Update a answer for question.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
answer = atom_api.Answer() # Answer | answer
answer_id = 'answer_id_example' # str | UUID answer_id

try:
    # Update an answer
    api_response = api_instance.update_answer_using_put(answer, answer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->update_answer_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer** | [**Answer**](Answer.md)| answer | 
 **answer_id** | [**str**](.md)| UUID answer_id | 

### Return type

[**Answer**](Answer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_client_response_using_put**
> ClientResponse update_client_response_using_put(client_response, client_response_id)

Update a client response

Update a client response for a client.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
client_response = atom_api.ClientResponse() # ClientResponse | client_response
client_response_id = 'client_response_id_example' # str | UUID client_response_id

try:
    # Update a client response
    api_response = api_instance.update_client_response_using_put(client_response, client_response_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->update_client_response_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response** | [**ClientResponse**](ClientResponse.md)| client_response | 
 **client_response_id** | [**str**](.md)| UUID client_response_id | 

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_question_using_put**
> Question update_question_using_put(question, question_id)

Update a question.

Update a question for questionnaire.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
question = atom_api.Question() # Question | question
question_id = 'question_id_example' # str | UUID question_id

try:
    # Update a question.
    api_response = api_instance.update_question_using_put(question, question_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->update_question_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question** | [**Question**](Question.md)| question | 
 **question_id** | [**str**](.md)| UUID question_id | 

### Return type

[**Question**](Question.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_questionnaire_using_put**
> Questionnaire update_questionnaire_using_put(questionnaire, questionnaire_id)

Update a questionnaire

Update a questionnaire for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.QuestionnaireApi(atom_api.ApiClient(configuration))
questionnaire = atom_api.Questionnaire() # Questionnaire | questionnaire
questionnaire_id = 'questionnaire_id_example' # str | UUID questionnaire_id

try:
    # Update a questionnaire
    api_response = api_instance.update_questionnaire_using_put(questionnaire, questionnaire_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling QuestionnaireApi->update_questionnaire_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire** | [**Questionnaire**](Questionnaire.md)| questionnaire | 
 **questionnaire_id** | [**str**](.md)| UUID questionnaire_id | 

### Return type

[**Questionnaire**](Questionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

