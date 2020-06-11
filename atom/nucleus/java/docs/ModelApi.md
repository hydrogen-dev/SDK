# ModelApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModelAssetSizeUsingPost**](ModelApi.md#createModelAssetSizeUsingPost) | **POST** /model_asset_size | Create a model asset size
[**createModelChangeUsingPost**](ModelApi.md#createModelChangeUsingPost) | **POST** /model/{model_id}/model_change | Change a model composition
[**createModelCommentUsingPost**](ModelApi.md#createModelCommentUsingPost) | **POST** /model_comment | Create a model commentary
[**createModelHoldingUsingPost**](ModelApi.md#createModelHoldingUsingPost) | **POST** /model_holding | Create a model holding
[**createModelTransactionUsingPost**](ModelApi.md#createModelTransactionUsingPost) | **POST** /model_transaction | Create a model transaction
[**createModelUsingPost**](ModelApi.md#createModelUsingPost) | **POST** /model | Create a model
[**deleteModelAssetSizeUsingDelete**](ModelApi.md#deleteModelAssetSizeUsingDelete) | **DELETE** /model_asset_size/{model_asset_size_id} | Delete a model asset size
[**deleteModelCommentUsingDelete**](ModelApi.md#deleteModelCommentUsingDelete) | **DELETE** /model_comment/{model_comment_id} | Delete a model commentary
[**deleteModelHoldingUsingDelete**](ModelApi.md#deleteModelHoldingUsingDelete) | **DELETE** /model_holding/{model_holding_id} | Delete a model holding
[**deleteModelTransactionUsingDelete**](ModelApi.md#deleteModelTransactionUsingDelete) | **DELETE** /model_transaction/{model_transaction_id} | Delete a model transaction
[**deleteModelUsingDelete**](ModelApi.md#deleteModelUsingDelete) | **DELETE** /model/{model_id} | Delete a model
[**getModelAllUsingGet**](ModelApi.md#getModelAllUsingGet) | **GET** /model | List all models
[**getModelAssetSizeAllUsingGet**](ModelApi.md#getModelAssetSizeAllUsingGet) | **GET** /model_asset_size | List all model asset sizes
[**getModelAssetSizeUsingGet**](ModelApi.md#getModelAssetSizeUsingGet) | **GET** /model_asset_size/{model_asset_size_id} | Retrieve a model asset size
[**getModelCommentAllUsingGet**](ModelApi.md#getModelCommentAllUsingGet) | **GET** /model_comment | List all model commentary
[**getModelCommentUsingGet**](ModelApi.md#getModelCommentUsingGet) | **GET** /model_comment/{model_comment_id} | Retrieve a model commentary
[**getModelHoldingAllUsingGet**](ModelApi.md#getModelHoldingAllUsingGet) | **GET** /model_holding | List all model holdings
[**getModelHoldingUsingGet**](ModelApi.md#getModelHoldingUsingGet) | **GET** /model_holding/{model_holding_id} | Retrieve a model holding
[**getModelTransactionAllUsingGet**](ModelApi.md#getModelTransactionAllUsingGet) | **GET** /model_transaction | List all model transactions
[**getModelTransactionUsingGet**](ModelApi.md#getModelTransactionUsingGet) | **GET** /model_transaction/{model_transaction_id} | Retrieve a model transaction
[**getModelUsingGet**](ModelApi.md#getModelUsingGet) | **GET** /model/{model_id} | Retrieve a model
[**updateModelAssetSizeUsingPut**](ModelApi.md#updateModelAssetSizeUsingPut) | **PUT** /model_asset_size/{model_asset_size_id} | Update a model asset size
[**updateModelCommentUsingPut**](ModelApi.md#updateModelCommentUsingPut) | **PUT** /model_comment/{model_comment_id} | Update a model commentary
[**updateModelHoldingUsingPut**](ModelApi.md#updateModelHoldingUsingPut) | **PUT** /model_holding/{model_holding_id} | Update a model holding
[**updateModelTransactionUsingPut**](ModelApi.md#updateModelTransactionUsingPut) | **PUT** /model_transaction/{model_transaction_id} | Update a model transaction
[**updateModelUsingPut**](ModelApi.md#updateModelUsingPut) | **PUT** /model/{model_id} | Update a model


<a name="createModelAssetSizeUsingPost"></a>
# **createModelAssetSizeUsingPost**
> ModelAssetSize createModelAssetSizeUsingPost(req)

Create a model asset size

Create a new asset size record for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
ModelAssetSize req = new ModelAssetSize(); // ModelAssetSize | req
try {
    ModelAssetSize result = apiInstance.createModelAssetSizeUsingPost(req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#createModelAssetSizeUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**ModelAssetSize**](ModelAssetSize.md)| req |

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createModelChangeUsingPost"></a>
# **createModelChangeUsingPost**
> List&lt;ModelTransaction&gt; createModelChangeUsingPost(changeRequest, modelId)

Change a model composition

Model composition changes represent a change in a model’s holdings.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
OrderReconcileRequest changeRequest = new OrderReconcileRequest(); // OrderReconcileRequest | changeRequest
UUID modelId = new UUID(); // UUID | UUID model_id
try {
    List<ModelTransaction> result = apiInstance.createModelChangeUsingPost(changeRequest, modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#createModelChangeUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeRequest** | [**OrderReconcileRequest**](OrderReconcileRequest.md)| changeRequest |
 **modelId** | [**UUID**](.md)| UUID model_id |

### Return type

[**List&lt;ModelTransaction&gt;**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createModelCommentUsingPost"></a>
# **createModelCommentUsingPost**
> Long createModelCommentUsingPost(modelCommentRequest)

Create a model commentary

Create a new comment for a model available for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
ModelComment modelCommentRequest = new ModelComment(); // ModelComment | modelCommentRequest
try {
    Long result = apiInstance.createModelCommentUsingPost(modelCommentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#createModelCommentUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelCommentRequest** | [**ModelComment**](ModelComment.md)| modelCommentRequest |

### Return type

**Long**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createModelHoldingUsingPost"></a>
# **createModelHoldingUsingPost**
> ModelHolding createModelHoldingUsingPost(modelHoldingRequest)

Create a model holding

Create a new model holding record for a specific model and date.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
ModelHolding modelHoldingRequest = new ModelHolding(); // ModelHolding | modelHoldingRequest
try {
    ModelHolding result = apiInstance.createModelHoldingUsingPost(modelHoldingRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#createModelHoldingUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHoldingRequest** | [**ModelHolding**](ModelHolding.md)| modelHoldingRequest |

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createModelTransactionUsingPost"></a>
# **createModelTransactionUsingPost**
> ModelTransaction createModelTransactionUsingPost(modelTransactionRequest)

Create a model transaction

Create a new transaction record for a security under a model for a specific date.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
ModelTransaction modelTransactionRequest = new ModelTransaction(); // ModelTransaction | modelTransactionRequest
try {
    ModelTransaction result = apiInstance.createModelTransactionUsingPost(modelTransactionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#createModelTransactionUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransactionRequest** | [**ModelTransaction**](ModelTransaction.md)| modelTransactionRequest |

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createModelUsingPost"></a>
# **createModelUsingPost**
> Model createModelUsingPost(modelInfoRequest)

Create a model

Create a new model for your firm to which a portfolios can later subscribe.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
Model modelInfoRequest = new Model(); // Model | modelInfoRequest
try {
    Model result = apiInstance.createModelUsingPost(modelInfoRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#createModelUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelInfoRequest** | [**Model**](Model.md)| modelInfoRequest |

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteModelAssetSizeUsingDelete"></a>
# **deleteModelAssetSizeUsingDelete**
> deleteModelAssetSizeUsingDelete(modelAssetSizeId)

Delete a model asset size

Permanently delete a model asset size record for a model. 

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
UUID modelAssetSizeId = new UUID(); // UUID | UUID model_asset_size_id
try {
    apiInstance.deleteModelAssetSizeUsingDelete(modelAssetSizeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#deleteModelAssetSizeUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelAssetSizeId** | [**UUID**](.md)| UUID model_asset_size_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteModelCommentUsingDelete"></a>
# **deleteModelCommentUsingDelete**
> deleteModelCommentUsingDelete(modelCommentId)

Delete a model commentary

Permanently delete a model comment for a model

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
UUID modelCommentId = new UUID(); // UUID | UUID model_comment_id
try {
    apiInstance.deleteModelCommentUsingDelete(modelCommentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#deleteModelCommentUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelCommentId** | [**UUID**](.md)| UUID model_comment_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteModelHoldingUsingDelete"></a>
# **deleteModelHoldingUsingDelete**
> deleteModelHoldingUsingDelete(modelHoldingId)

Delete a model holding

Permanently delete a model holding record for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
UUID modelHoldingId = new UUID(); // UUID | UUID model_holding_id
try {
    apiInstance.deleteModelHoldingUsingDelete(modelHoldingId);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#deleteModelHoldingUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHoldingId** | [**UUID**](.md)| UUID model_holding_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteModelTransactionUsingDelete"></a>
# **deleteModelTransactionUsingDelete**
> deleteModelTransactionUsingDelete(modelTransactionId)

Delete a model transaction

Permanently delete a model transaction for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
UUID modelTransactionId = new UUID(); // UUID | UUID model_transaction_id
try {
    apiInstance.deleteModelTransactionUsingDelete(modelTransactionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#deleteModelTransactionUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransactionId** | [**UUID**](.md)| UUID model_transaction_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteModelUsingDelete"></a>
# **deleteModelUsingDelete**
> deleteModelUsingDelete(modelId)

Delete a model

Permanently delete a model for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
UUID modelId = new UUID(); // UUID | UUID model_id
try {
    apiInstance.deleteModelUsingDelete(modelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#deleteModelUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**UUID**](.md)| UUID model_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelAllUsingGet"></a>
# **getModelAllUsingGet**
> PageModel getModelAllUsingGet(ascending, filter, orderBy, page, size)

List all models

Get details for all models defined for your firm to which portfolios can subscribe.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageModel result = apiInstance.getModelAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelAllUsingGet");
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

[**PageModel**](PageModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelAssetSizeAllUsingGet"></a>
# **getModelAssetSizeAllUsingGet**
> PageModelAssetSize getModelAssetSizeAllUsingGet(ascending, filter, orderBy, page, size)

List all model asset sizes

Get a list of asset sizes per date for all models defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageModelAssetSize result = apiInstance.getModelAssetSizeAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelAssetSizeAllUsingGet");
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

[**PageModelAssetSize**](PageModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelAssetSizeUsingGet"></a>
# **getModelAssetSizeUsingGet**
> ModelAssetSize getModelAssetSizeUsingGet(modelAssetSizeId)

Retrieve a model asset size

Retrieve the information for a model asset size record for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
UUID modelAssetSizeId = new UUID(); // UUID | UUID model_asset_size_id
try {
    ModelAssetSize result = apiInstance.getModelAssetSizeUsingGet(modelAssetSizeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelAssetSizeUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelAssetSizeId** | [**UUID**](.md)| UUID model_asset_size_id |

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelCommentAllUsingGet"></a>
# **getModelCommentAllUsingGet**
> PageModelComment getModelCommentAllUsingGet(ascending, filter, orderBy, page, size)

List all model commentary

List all comments for all models defined by your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageModelComment result = apiInstance.getModelCommentAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelCommentAllUsingGet");
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

[**PageModelComment**](PageModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelCommentUsingGet"></a>
# **getModelCommentUsingGet**
> ModelComment getModelCommentUsingGet(modelCommentId)

Retrieve a model commentary

Retrieve the information for a model comment for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
UUID modelCommentId = new UUID(); // UUID | UUID model_comment_id
try {
    ModelComment result = apiInstance.getModelCommentUsingGet(modelCommentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelCommentUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelCommentId** | [**UUID**](.md)| UUID model_comment_id |

### Return type

[**ModelComment**](ModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelHoldingAllUsingGet"></a>
# **getModelHoldingAllUsingGet**
> PageModelHolding getModelHoldingAllUsingGet(ascending, filter, orderBy, page, size)

List all model holdings

Get all model holding records for all models defined for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageModelHolding result = apiInstance.getModelHoldingAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelHoldingAllUsingGet");
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

[**PageModelHolding**](PageModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelHoldingUsingGet"></a>
# **getModelHoldingUsingGet**
> ModelHolding getModelHoldingUsingGet(modelHoldingId)

Retrieve a model holding

Retrieve the information for a model holding record for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
UUID modelHoldingId = new UUID(); // UUID | UUID model_holding_id
try {
    ModelHolding result = apiInstance.getModelHoldingUsingGet(modelHoldingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelHoldingUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHoldingId** | [**UUID**](.md)| UUID model_holding_id |

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelTransactionAllUsingGet"></a>
# **getModelTransactionAllUsingGet**
> PageModelTransaction getModelTransactionAllUsingGet(ascending, filter, orderBy, page, size)

List all model transactions

Get details for all transaction records for all models defined by your firm. 

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageModelTransaction result = apiInstance.getModelTransactionAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelTransactionAllUsingGet");
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

[**PageModelTransaction**](PageModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelTransactionUsingGet"></a>
# **getModelTransactionUsingGet**
> ModelTransaction getModelTransactionUsingGet(modelTransactionId)

Retrieve a model transaction

Retrieve the information for a model transaction for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
UUID modelTransactionId = new UUID(); // UUID | UUID model_transaction_id
try {
    ModelTransaction result = apiInstance.getModelTransactionUsingGet(modelTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelTransactionUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransactionId** | [**UUID**](.md)| UUID model_transaction_id |

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelUsingGet"></a>
# **getModelUsingGet**
> Model getModelUsingGet(modelId)

Retrieve a model

Get the information for a model for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
UUID modelId = new UUID(); // UUID | UUID model_id
try {
    Model result = apiInstance.getModelUsingGet(modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**UUID**](.md)| UUID model_id |

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateModelAssetSizeUsingPut"></a>
# **updateModelAssetSizeUsingPut**
> ModelAssetSize updateModelAssetSizeUsingPut(modelAssetSize, modelAssetSizeId)

Update a model asset size

Update a model asset size record for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
ModelAssetSize modelAssetSize = new ModelAssetSize(); // ModelAssetSize | model_asset_size
UUID modelAssetSizeId = new UUID(); // UUID | UUID model_asset_size_id
try {
    ModelAssetSize result = apiInstance.updateModelAssetSizeUsingPut(modelAssetSize, modelAssetSizeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#updateModelAssetSizeUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelAssetSize** | [**ModelAssetSize**](ModelAssetSize.md)| model_asset_size |
 **modelAssetSizeId** | [**UUID**](.md)| UUID model_asset_size_id |

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateModelCommentUsingPut"></a>
# **updateModelCommentUsingPut**
> ModelComment updateModelCommentUsingPut(modelComment, modelCommentId)

Update a model commentary

Update a model comment for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
ModelComment modelComment = new ModelComment(); // ModelComment | model_comment
UUID modelCommentId = new UUID(); // UUID | UUID model_comment_id
try {
    ModelComment result = apiInstance.updateModelCommentUsingPut(modelComment, modelCommentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#updateModelCommentUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelComment** | [**ModelComment**](ModelComment.md)| model_comment |
 **modelCommentId** | [**UUID**](.md)| UUID model_comment_id |

### Return type

[**ModelComment**](ModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateModelHoldingUsingPut"></a>
# **updateModelHoldingUsingPut**
> ModelHolding updateModelHoldingUsingPut(modelHolding, modelHoldingId)

Update a model holding

Update a model holding record for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
ModelHolding modelHolding = new ModelHolding(); // ModelHolding | model_holding
UUID modelHoldingId = new UUID(); // UUID | UUID model_holding_id
try {
    ModelHolding result = apiInstance.updateModelHoldingUsingPut(modelHolding, modelHoldingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#updateModelHoldingUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHolding** | [**ModelHolding**](ModelHolding.md)| model_holding |
 **modelHoldingId** | [**UUID**](.md)| UUID model_holding_id |

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateModelTransactionUsingPut"></a>
# **updateModelTransactionUsingPut**
> ModelTransaction updateModelTransactionUsingPut(modelTransaction, modelTransactionId)

Update a model transaction

Update a model transaction for a model.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
ModelTransaction modelTransaction = new ModelTransaction(); // ModelTransaction | model_transaction
UUID modelTransactionId = new UUID(); // UUID | UUID model_transaction_id
try {
    ModelTransaction result = apiInstance.updateModelTransactionUsingPut(modelTransaction, modelTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#updateModelTransactionUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransaction** | [**ModelTransaction**](ModelTransaction.md)| model_transaction |
 **modelTransactionId** | [**UUID**](.md)| UUID model_transaction_id |

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateModelUsingPut"></a>
# **updateModelUsingPut**
> Model updateModelUsingPut(model, modelId)

Update a model

Update a model for your firm.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import ModelApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");           
} catch (ApiException e) {
    e.printStackTrace();
}

ModelApi apiInstance = new ModelApi();
Model model = new Model(); // Model | model
UUID modelId = new UUID(); // UUID | UUID model_id
try {
    Model result = apiInstance.updateModelUsingPut(model, modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#updateModelUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**Model**](Model.md)| model |
 **modelId** | [**UUID**](.md)| UUID model_id |

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

