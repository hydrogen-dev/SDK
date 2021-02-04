# QuestionnaireApi

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Answer answer = new Answer(); // Answer | answer
try {
    Answer result = apiInstance.createAnswerUsingPost(answer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#createAnswerUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
ClientResponse clientResponse = new ClientResponse(); // ClientResponse | clientResponse
try {
    ClientResponse result = apiInstance.createClientResponseUsingPost(clientResponse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#createClientResponseUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Question question = new Question(); // Question | question
try {
    Question result = apiInstance.createQuestionUsingPost(question);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#createQuestionUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Questionnaire questionnaire = new Questionnaire(); // Questionnaire | questionnaire
try {
    Questionnaire result = apiInstance.createQuestionnaireUsingPost(questionnaire);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#createQuestionnaireUsingPost");
    e.printStackTrace();
}
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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
UUID answerId = new UUID(); // UUID | UUID answer_id
try {
    apiInstance.deleteAnswerUsingDelete(answerId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#deleteAnswerUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answerId** | [**UUID**](.md)| UUID answer_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
UUID clientResponseId = new UUID(); // UUID | UUID client_response_id
try {
    apiInstance.deleteClientResponseUsingDelete(clientResponseId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#deleteClientResponseUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResponseId** | [**UUID**](.md)| UUID client_response_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
UUID questionId = new UUID(); // UUID | UUID question_id
try {
    apiInstance.deleteQuestionUsingDelete(questionId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#deleteQuestionUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | [**UUID**](.md)| UUID question_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
UUID questionnaireId = new UUID(); // UUID | UUID questionnaire_id
try {
    apiInstance.deleteQuestionnaireUsingDelete(questionnaireId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#deleteQuestionnaireUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaireId** | [**UUID**](.md)| UUID questionnaire_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAnswerAllUsingGet"></a>
# **getAnswerAllUsingGet**
> PageAnswer getAnswerAllUsingGet(ascending, filter, orderBy, page, size)

List all Answers

Get information for all Answers

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "label"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageAnswer result = apiInstance.getAnswerAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#getAnswerAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to label]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
UUID answerId = new UUID(); // UUID | UUID answer_id
try {
    Answer result = apiInstance.getAnswerUsingGet(answerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#getAnswerUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answerId** | [**UUID**](.md)| UUID answer_id |

### Return type

[**Answer**](Answer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientResponseAllUsingGet"></a>
# **getClientResponseAllUsingGet**
> PageClientResponse getClientResponseAllUsingGet(ascending, filter, orderBy, page, size)

List all client responses

Get all the client responses for questions as part of a questionnaire defined by your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageClientResponse result = apiInstance.getClientResponseAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#getClientResponseAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
UUID clientResponseId = new UUID(); // UUID | UUID client_response_id
try {
    ClientResponse result = apiInstance.getClientResponseUsingGet(clientResponseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#getClientResponseUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResponseId** | [**UUID**](.md)| UUID client_response_id |

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getQuestionAllUsingGet"></a>
# **getQuestionAllUsingGet**
> PageQuestion getQuestionAllUsingGet(ascending, filter, orderBy, page, size)

List all Questions

Get information for all Questions

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "order_index"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageQuestion result = apiInstance.getQuestionAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#getQuestionAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to order_index]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
UUID questionId = new UUID(); // UUID | UUID question_id
try {
    Question result = apiInstance.getQuestionUsingGet(questionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#getQuestionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | [**UUID**](.md)| UUID question_id |

### Return type

[**Question**](Question.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuestionnaireAllUsingGet"></a>
# **getQuestionnaireAllUsingGet**
> PageQuestionnaire getQuestionnaireAllUsingGet(ascending, filter, orderBy, page, size)

List all questionnaires

Get the information for all questionnaires defined for your firm.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageQuestionnaire result = apiInstance.getQuestionnaireAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#getQuestionnaireAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
UUID questionnaireId = new UUID(); // UUID | UUID questionnaire_id
try {
    Questionnaire result = apiInstance.getQuestionnaireUsingGet(questionnaireId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#getQuestionnaireUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaireId** | [**UUID**](.md)| UUID questionnaire_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Object answer = null; // Object | answer
UUID answerId = new UUID(); // UUID | UUID answer_id
try {
    Answer result = apiInstance.updateAnswerUsingPut(answer, answerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#updateAnswerUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **answer** | **Object**| answer |
 **answerId** | [**UUID**](.md)| UUID answer_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Object clientResponse = null; // Object | client_response
UUID clientResponseId = new UUID(); // UUID | UUID client_response_id
try {
    ClientResponse result = apiInstance.updateClientResponseUsingPut(clientResponse, clientResponseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#updateClientResponseUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResponse** | **Object**| client_response |
 **clientResponseId** | [**UUID**](.md)| UUID client_response_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Object question = null; // Object | question
UUID questionId = new UUID(); // UUID | UUID question_id
try {
    Question result = apiInstance.updateQuestionUsingPut(question, questionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#updateQuestionUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **question** | **Object**| question |
 **questionId** | [**UUID**](.md)| UUID question_id |

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
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import QuestionnaireApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
QuestionnaireApi apiInstance = new QuestionnaireApi();
Object questionnaire = null; // Object | questionnaire
UUID questionnaireId = new UUID(); // UUID | UUID questionnaire_id
try {
    Questionnaire result = apiInstance.updateQuestionnaireUsingPut(questionnaire, questionnaireId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuestionnaireApi#updateQuestionnaireUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaire** | **Object**| questionnaire |
 **questionnaireId** | [**UUID**](.md)| UUID questionnaire_id |

### Return type

[**Questionnaire**](Questionnaire.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

