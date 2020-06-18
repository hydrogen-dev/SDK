# HydrogenNucleusApi.QuestionnaireApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAnswerUsingPost**](QuestionnaireApi.md#createAnswerUsingPost) | **POST** /answer | Create an answer
[**createClientResponseUsingPost**](QuestionnaireApi.md#createClientResponseUsingPost) | **POST** /client_response | Create a client response
[**createQuestionUsingPost**](QuestionnaireApi.md#createQuestionUsingPost) | **POST** /question | Create a question
[**createQuestionnaireUsingPost**](QuestionnaireApi.md#createQuestionnaireUsingPost) | **POST** /questionnaire | Create a questionnaire
[**deleteAnswerUsingDelete**](QuestionnaireApi.md#deleteAnswerUsingDelete) | **DELETE** /answer/{answer_id} | Delete an answer
[**deleteClientResponseUsingDelete**](QuestionnaireApi.md#deleteClientResponseUsingDelete) | **DELETE** /client_response/{client_response_id} | Delete a client response
[**deleteQuestionUsingDelete**](QuestionnaireApi.md#deleteQuestionUsingDelete) | **DELETE** /question/{question_id} | Delete a question
[**deleteQuestionnaireUsingDelete**](QuestionnaireApi.md#deleteQuestionnaireUsingDelete) | **DELETE** /questionnaire/{questionnaire_id} | Delete a questionnaire
[**getAnswerAllUsingGet**](QuestionnaireApi.md#getAnswerAllUsingGet) | **GET** /answer | List all Answers
[**getAnswerUsingGet**](QuestionnaireApi.md#getAnswerUsingGet) | **GET** /answer/{answer_id} | Retrieve an answer
[**getClientResponseAllUsingGet**](QuestionnaireApi.md#getClientResponseAllUsingGet) | **GET** /client_response | List all client responses
[**getClientResponseUsingGet**](QuestionnaireApi.md#getClientResponseUsingGet) | **GET** /client_response/{client_response_id} | Retrieve a client response
[**getQuestionAllUsingGet**](QuestionnaireApi.md#getQuestionAllUsingGet) | **GET** /question | List all Questions
[**getQuestionUsingGet**](QuestionnaireApi.md#getQuestionUsingGet) | **GET** /question/{question_id} | Retrieve a question
[**getQuestionnaireAllUsingGet**](QuestionnaireApi.md#getQuestionnaireAllUsingGet) | **GET** /questionnaire | List all questionnaires
[**getQuestionnaireUsingGet**](QuestionnaireApi.md#getQuestionnaireUsingGet) | **GET** /questionnaire/{questionnaire_id} | Retrieve a questionnaire
[**updateAnswerUsingPut**](QuestionnaireApi.md#updateAnswerUsingPut) | **PUT** /answer/{answer_id} | Update an answer
[**updateClientResponseUsingPut**](QuestionnaireApi.md#updateClientResponseUsingPut) | **PUT** /client_response/{client_response_id} | Update a client response
[**updateQuestionUsingPut**](QuestionnaireApi.md#updateQuestionUsingPut) | **PUT** /question/{question_id} | Update a question.
[**updateQuestionnaireUsingPut**](QuestionnaireApi.md#updateQuestionnaireUsingPut) | **PUT** /questionnaire/{questionnaire_id} | Update a questionnaire


<a name="createAnswerUsingPost"></a>
# **createAnswerUsingPost**
> Answer createAnswerUsingPost(answer)

Create an answer

Create a new answer for question.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var answer = new HydrogenNucleusApi.Answer(); // Answer | answer


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAnswerUsingPost(answer, callback);
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

<a name="createClientResponseUsingPost"></a>
# **createClientResponseUsingPost**
> ClientResponse createClientResponseUsingPost(clientResponse)

Create a client response

Create a new client response for a question as part of a questionnaires.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var clientResponse = new HydrogenNucleusApi.ClientResponse(); // ClientResponse | clientResponse


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createClientResponseUsingPost(clientResponse, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResponse** | [**ClientResponse**](ClientResponse.md)| clientResponse | 

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createQuestionUsingPost"></a>
# **createQuestionUsingPost**
> Question createQuestionUsingPost(question)

Create a question

Create a new question for questionnaire.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var question = new HydrogenNucleusApi.Question(); // Question | question


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createQuestionUsingPost(question, callback);
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

<a name="createQuestionnaireUsingPost"></a>
# **createQuestionnaireUsingPost**
> Questionnaire createQuestionnaireUsingPost(questionnaire)

Create a questionnaire

Create a new questionnaire for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var questionnaire = new HydrogenNucleusApi.Questionnaire(); // Questionnaire | questionnaire


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createQuestionnaireUsingPost(questionnaire, callback);
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

<a name="deleteAnswerUsingDelete"></a>
# **deleteAnswerUsingDelete**
> deleteAnswerUsingDelete(answerId)

Delete an answer

Delete an answer for the question

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var answerId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID answer_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAnswerUsingDelete(answerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answerId** | **String**| UUID answer_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteClientResponseUsingDelete"></a>
# **deleteClientResponseUsingDelete**
> deleteClientResponseUsingDelete(clientResponseId)

Delete a client response

Permanently delete a client response for a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var clientResponseId = "7960419c-c098-4450-8cc5-866b7385230b"; // String | UUID client_response_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteClientResponseUsingDelete(clientResponseId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResponseId** | **String**| UUID client_response_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteQuestionUsingDelete"></a>
# **deleteQuestionUsingDelete**
> deleteQuestionUsingDelete(questionId)

Delete a question

Delete an answer for the question

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var questionId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID question_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteQuestionUsingDelete(questionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **String**| UUID question_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteQuestionnaireUsingDelete"></a>
# **deleteQuestionnaireUsingDelete**
> deleteQuestionnaireUsingDelete(questionnaireId)

Delete a questionnaire

Permanently delete a questionnaire for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var questionnaireId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID questionnaire_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteQuestionnaireUsingDelete(questionnaireId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaireId** | **String**| UUID questionnaire_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAnswerAllUsingGet"></a>
# **getAnswerAllUsingGet**
> PageAnswer getAnswerAllUsingGet(opts)

List all Answers

Get information for all Answers

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "label", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAnswerAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to label]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageAnswer**](PageAnswer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAnswerUsingGet"></a>
# **getAnswerUsingGet**
> Answer getAnswerUsingGet(answerId)

Retrieve an answer

Retrieve the information for an answer for question

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var answerId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID answer_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAnswerUsingGet(answerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answerId** | **String**| UUID answer_id | 

### Return type

[**Answer**](Answer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientResponseAllUsingGet"></a>
# **getClientResponseAllUsingGet**
> PageClientResponse getClientResponseAllUsingGet(opts)

List all client responses

Get all the client responses for questions as part of a questionnaire defined by your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientResponseAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageClientResponse**](PageClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientResponseUsingGet"></a>
# **getClientResponseUsingGet**
> ClientResponse getClientResponseUsingGet(clientResponseId)

Retrieve a client response

Retrieve the information for a client response for a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var clientResponseId = "7960419c-c098-4450-8cc5-866b7385230b"; // String | UUID client_response_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientResponseUsingGet(clientResponseId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResponseId** | **String**| UUID client_response_id | 

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getQuestionAllUsingGet"></a>
# **getQuestionAllUsingGet**
> PageQuestion getQuestionAllUsingGet(opts)

List all Questions

Get information for all Questions

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "order_index", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getQuestionAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to order_index]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageQuestion**](PageQuestion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getQuestionUsingGet"></a>
# **getQuestionUsingGet**
> Question getQuestionUsingGet(questionId)

Retrieve a question

Retrieve the information for a question for questionnaire

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var questionId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID question_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getQuestionUsingGet(questionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **String**| UUID question_id | 

### Return type

[**Question**](Question.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuestionnaireAllUsingGet"></a>
# **getQuestionnaireAllUsingGet**
> PageQuestionnaire getQuestionnaireAllUsingGet(opts)

List all questionnaires

Get the information for all questionnaires defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getQuestionnaireAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageQuestionnaire**](PageQuestionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getQuestionnaireUsingGet"></a>
# **getQuestionnaireUsingGet**
> Questionnaire getQuestionnaireUsingGet(questionnaireId)

Retrieve a questionnaire

Retrieve the information for a questionnaire for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var questionnaireId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID questionnaire_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getQuestionnaireUsingGet(questionnaireId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaireId** | **String**| UUID questionnaire_id | 

### Return type

[**Questionnaire**](Questionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAnswerUsingPut"></a>
# **updateAnswerUsingPut**
> Answer updateAnswerUsingPut(answer, answerId)

Update an answer

Update a answer for question.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var answer = new HydrogenNucleusApi.Answer(); // Answer | answer

var answerId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID answer_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAnswerUsingPut(answer, answerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer** | [**Answer**](Answer.md)| answer | 
 **answerId** | **String**| UUID answer_id | 

### Return type

[**Answer**](Answer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateClientResponseUsingPut"></a>
# **updateClientResponseUsingPut**
> ClientResponse updateClientResponseUsingPut(clientResponse, clientResponseId)

Update a client response

Update a client response for a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var clientResponse = new HydrogenNucleusApi.ClientResponse(); // ClientResponse | client_response

var clientResponseId = "7960419c-c098-4450-8cc5-866b7385230b"; // String | UUID client_response_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateClientResponseUsingPut(clientResponse, clientResponseId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResponse** | [**ClientResponse**](ClientResponse.md)| client_response | 
 **clientResponseId** | **String**| UUID client_response_id | 

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateQuestionUsingPut"></a>
# **updateQuestionUsingPut**
> Question updateQuestionUsingPut(question, questionId)

Update a question.

Update a question for questionnaire.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var question = new HydrogenNucleusApi.Question(); // Question | question

var questionId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID question_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateQuestionUsingPut(question, questionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question** | [**Question**](Question.md)| question | 
 **questionId** | **String**| UUID question_id | 

### Return type

[**Question**](Question.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateQuestionnaireUsingPut"></a>
# **updateQuestionnaireUsingPut**
> Questionnaire updateQuestionnaireUsingPut(questionnaire, questionnaireId)

Update a questionnaire

Update a questionnaire for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.QuestionnaireApi();

var questionnaire = new HydrogenNucleusApi.Questionnaire(); // Questionnaire | questionnaire

var questionnaireId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID questionnaire_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateQuestionnaireUsingPut(questionnaire, questionnaireId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire** | [**Questionnaire**](Questionnaire.md)| questionnaire | 
 **questionnaireId** | **String**| UUID questionnaire_id | 

### Return type

[**Questionnaire**](Questionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

