# NucleusApi::QuestionnaireApi

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
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

answer = NucleusApi::Answer.new # Answer | answer


begin
  #Create an answer
  result = api_instance.create_answer_using_post(answer)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->create_answer_using_post: #{e}"
end
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



# **create_client_response_using_post**
> ClientResponse create_client_response_using_post(client_response)

Create a client response

Create a new client response for a question as part of a questionnaires.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

client_response = NucleusApi::ClientResponse.new # ClientResponse | clientResponse


begin
  #Create a client response
  result = api_instance.create_client_response_using_post(client_response)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->create_client_response_using_post: #{e}"
end
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



# **create_question_using_post**
> Question create_question_using_post(question)

Create a question

Create a new question for questionnaire.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

question = NucleusApi::Question.new # Question | question


begin
  #Create a question
  result = api_instance.create_question_using_post(question)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->create_question_using_post: #{e}"
end
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



# **create_questionnaire_using_post**
> Questionnaire create_questionnaire_using_post(questionnaire)

Create a questionnaire

Create a new questionnaire for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

questionnaire = NucleusApi::Questionnaire.new # Questionnaire | questionnaire


begin
  #Create a questionnaire
  result = api_instance.create_questionnaire_using_post(questionnaire)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->create_questionnaire_using_post: #{e}"
end
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



# **delete_answer_using_delete**
> delete_answer_using_delete(answer_id)

Delete an answer

Delete an answer for the question

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

answer_id = 'answer_id_example' # String | UUID answer_id


begin
  #Delete an answer
  api_instance.delete_answer_using_delete(answer_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->delete_answer_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer_id** | [**String**](.md)| UUID answer_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_client_response_using_delete**
> delete_client_response_using_delete(client_response_id)

Delete a client response

Permanently delete a client response for a client.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

client_response_id = 'client_response_id_example' # String | UUID client_response_id


begin
  #Delete a client response
  api_instance.delete_client_response_using_delete(client_response_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->delete_client_response_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response_id** | [**String**](.md)| UUID client_response_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_question_using_delete**
> delete_question_using_delete(question_id)

Delete a question

Delete an answer for the question

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

question_id = 'question_id_example' # String | UUID question_id


begin
  #Delete a question
  api_instance.delete_question_using_delete(question_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->delete_question_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question_id** | [**String**](.md)| UUID question_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_questionnaire_using_delete**
> delete_questionnaire_using_delete(questionnaire_id)

Delete a questionnaire

Permanently delete a questionnaire for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

questionnaire_id = 'questionnaire_id_example' # String | UUID questionnaire_id


begin
  #Delete a questionnaire
  api_instance.delete_questionnaire_using_delete(questionnaire_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->delete_questionnaire_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire_id** | [**String**](.md)| UUID questionnaire_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_answer_all_using_get**
> PageAnswer get_answer_all_using_get(opts)

List all Answers

Get information for all Answers

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'label', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all Answers
  result = api_instance.get_answer_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->get_answer_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to label]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAnswer**](PageAnswer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_answer_using_get**
> Answer get_answer_using_get(answer_id)

Retrieve an answer

Retrieve the information for an answer for question

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

answer_id = 'answer_id_example' # String | UUID answer_id


begin
  #Retrieve an answer
  result = api_instance.get_answer_using_get(answer_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->get_answer_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer_id** | [**String**](.md)| UUID answer_id | 

### Return type

[**Answer**](Answer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_client_response_all_using_get**
> PageClientResponse get_client_response_all_using_get(opts)

List all client responses

Get all the client responses for questions as part of a questionnaire defined by your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all client responses
  result = api_instance.get_client_response_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->get_client_response_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageClientResponse**](PageClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_response_using_get**
> ClientResponse get_client_response_using_get(client_response_id)

Retrieve a client response

Retrieve the information for a client response for a client.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

client_response_id = 'client_response_id_example' # String | UUID client_response_id


begin
  #Retrieve a client response
  result = api_instance.get_client_response_using_get(client_response_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->get_client_response_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response_id** | [**String**](.md)| UUID client_response_id | 

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_question_all_using_get**
> PageQuestion get_question_all_using_get(opts)

List all Questions

Get information for all Questions

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'order_index', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all Questions
  result = api_instance.get_question_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->get_question_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to order_index]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageQuestion**](PageQuestion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_question_using_get**
> Question get_question_using_get(question_id)

Retrieve a question

Retrieve the information for a question for questionnaire

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

question_id = 'question_id_example' # String | UUID question_id


begin
  #Retrieve a question
  result = api_instance.get_question_using_get(question_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->get_question_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question_id** | [**String**](.md)| UUID question_id | 

### Return type

[**Question**](Question.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_questionnaire_all_using_get**
> PageQuestionnaire get_questionnaire_all_using_get(opts)

List all questionnaires

Get the information for all questionnaires defined for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all questionnaires
  result = api_instance.get_questionnaire_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->get_questionnaire_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageQuestionnaire**](PageQuestionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_questionnaire_using_get**
> Questionnaire get_questionnaire_using_get(questionnaire_id)

Retrieve a questionnaire

Retrieve the information for a questionnaire for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

questionnaire_id = 'questionnaire_id_example' # String | UUID questionnaire_id


begin
  #Retrieve a questionnaire
  result = api_instance.get_questionnaire_using_get(questionnaire_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->get_questionnaire_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire_id** | [**String**](.md)| UUID questionnaire_id | 

### Return type

[**Questionnaire**](Questionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_answer_using_put**
> Answer update_answer_using_put(answer, answer_id)

Update an answer

Update a answer for question.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

answer = NucleusApi::Answer.new # Answer | answer

answer_id = 'answer_id_example' # String | UUID answer_id


begin
  #Update an answer
  result = api_instance.update_answer_using_put(answer, answer_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->update_answer_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer** | [**Answer**](Answer.md)| answer | 
 **answer_id** | [**String**](.md)| UUID answer_id | 

### Return type

[**Answer**](Answer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_client_response_using_put**
> ClientResponse update_client_response_using_put(client_response, client_response_id)

Update a client response

Update a client response for a client.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

client_response = NucleusApi::ClientResponse.new # ClientResponse | client_response

client_response_id = 'client_response_id_example' # String | UUID client_response_id


begin
  #Update a client response
  result = api_instance.update_client_response_using_put(client_response, client_response_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->update_client_response_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_response** | [**ClientResponse**](ClientResponse.md)| client_response | 
 **client_response_id** | [**String**](.md)| UUID client_response_id | 

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_question_using_put**
> Question update_question_using_put(question, question_id)

Update a question.

Update a question for questionnaire.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

question = NucleusApi::Question.new # Question | question

question_id = 'question_id_example' # String | UUID question_id


begin
  #Update a question.
  result = api_instance.update_question_using_put(question, question_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->update_question_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question** | [**Question**](Question.md)| question | 
 **question_id** | [**String**](.md)| UUID question_id | 

### Return type

[**Question**](Question.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_questionnaire_using_put**
> Questionnaire update_questionnaire_using_put(questionnaire, questionnaire_id)

Update a questionnaire

Update a questionnaire for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::QuestionnaireApi.new

questionnaire = NucleusApi::Questionnaire.new # Questionnaire | questionnaire

questionnaire_id = 'questionnaire_id_example' # String | UUID questionnaire_id


begin
  #Update a questionnaire
  result = api_instance.update_questionnaire_using_put(questionnaire, questionnaire_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling QuestionnaireApi->update_questionnaire_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire** | [**Questionnaire**](Questionnaire.md)| questionnaire | 
 **questionnaire_id** | [**String**](.md)| UUID questionnaire_id | 

### Return type

[**Questionnaire**](Questionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



