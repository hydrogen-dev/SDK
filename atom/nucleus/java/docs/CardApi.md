# CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCardProgramUsingPost**](CardApi.md#createCardProgramUsingPost) | **POST** /card_program | Create a cardProgram request
[**createCardUsingPost**](CardApi.md#createCardUsingPost) | **POST** /card | Create a card request
[**deleteCardProgramUsingDelete**](CardApi.md#deleteCardProgramUsingDelete) | **DELETE** /card_program/{card_program_id} | Delete an cardProgram
[**deleteCardUsingDelete**](CardApi.md#deleteCardUsingDelete) | **DELETE** /card/{card_id} | Delete a card request
[**getCardAllUsingGet**](CardApi.md#getCardAllUsingGet) | **GET** /card | List all card requests
[**getCardProgramAllUsingGet**](CardApi.md#getCardProgramAllUsingGet) | **GET** /card_program | List all cardProgram
[**getCardProgramUsingGet**](CardApi.md#getCardProgramUsingGet) | **GET** /card_program/{card_program_id} | Retrieve an cardProgram
[**getCardUsingGet**](CardApi.md#getCardUsingGet) | **GET** /card/{card_id} | Retrieve a card request
[**updateCardProgramUsingPut**](CardApi.md#updateCardProgramUsingPut) | **PUT** /card_program/{card_program_id} | Update an cardProgram
[**updateCardUsingPut**](CardApi.md#updateCardUsingPut) | **PUT** /card/{card_id} | Update a card request


<a name="createCardProgramUsingPost"></a>
# **createCardProgramUsingPost**
> CardProgram createCardProgramUsingPost(cardProgramRequest)

Create a cardProgram request

Create a new cardProgram request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import CardApi;

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

CardApi apiInstance = new CardApi();
CardProgram cardProgramRequest = new CardProgram(); // CardProgram | cardProgramRequest
try {
    CardProgram result = apiInstance.createCardProgramUsingPost(cardProgramRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardProgramUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProgramRequest** | [**CardProgram**](CardProgram.md)| cardProgramRequest |

### Return type

[**CardProgram**](CardProgram.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createCardUsingPost"></a>
# **createCardUsingPost**
> Card createCardUsingPost(cardRequest, authorization)

Create a card request

Create a new card request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import CardApi;

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

CardApi apiInstance = new CardApi();
Card cardRequest = new Card(); // Card | cardRequest
String authorization = "authorization_example"; // String | Authorization
try {
    Card result = apiInstance.createCardUsingPost(cardRequest, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#createCardUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardRequest** | [**Card**](Card.md)| cardRequest |
 **authorization** | **String**| Authorization | [optional]

### Return type

[**Card**](Card.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCardProgramUsingDelete"></a>
# **deleteCardProgramUsingDelete**
> deleteCardProgramUsingDelete(cardProgramId)

Delete an cardProgram

Permanently delete an cardProgram.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import CardApi;

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

CardApi apiInstance = new CardApi();
UUID cardProgramId = new UUID(); // UUID | UUID card_program_id
try {
    apiInstance.deleteCardProgramUsingDelete(cardProgramId);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardProgramUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProgramId** | [**UUID**](.md)| UUID card_program_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteCardUsingDelete"></a>
# **deleteCardUsingDelete**
> deleteCardUsingDelete(cardId)

Delete a card request

Permanently delete a card request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import CardApi;

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

CardApi apiInstance = new CardApi();
UUID cardId = new UUID(); // UUID | UUID card_id
try {
    apiInstance.deleteCardUsingDelete(cardId);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#deleteCardUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**UUID**](.md)| UUID card_id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCardAllUsingGet"></a>
# **getCardAllUsingGet**
> PageCard getCardAllUsingGet(ascending, filter, orderBy, page, size)

List all card requests

Get the information for all card requests.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import CardApi;

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

CardApi apiInstance = new CardApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageCard result = apiInstance.getCardAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardAllUsingGet");
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

[**PageCard**](PageCard.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCardProgramAllUsingGet"></a>
# **getCardProgramAllUsingGet**
> PageCardProgram getCardProgramAllUsingGet(ascending, filter, orderBy, page, size)

List all cardProgram

Get information for all cardProgram.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import CardApi;

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

CardApi apiInstance = new CardApi();
Boolean ascending = false; // Boolean | ascending
String filter = "filter_example"; // String | filter
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
try {
    PageCardProgram result = apiInstance.getCardProgramAllUsingGet(ascending, filter, orderBy, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardProgramAllUsingGet");
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

[**PageCardProgram**](PageCardProgram.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCardProgramUsingGet"></a>
# **getCardProgramUsingGet**
> CardProgram getCardProgramUsingGet(cardProgramId)

Retrieve an cardProgram

Retrieve the information for a specific cardProgram.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import CardApi;

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

CardApi apiInstance = new CardApi();
UUID cardProgramId = new UUID(); // UUID | UUID card_program_id
try {
    CardProgram result = apiInstance.getCardProgramUsingGet(cardProgramId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardProgramUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProgramId** | [**UUID**](.md)| UUID card_program_id |

### Return type

[**CardProgram**](CardProgram.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCardUsingGet"></a>
# **getCardUsingGet**
> Card getCardUsingGet(cardId)

Retrieve a card request

Retrieve the information for a card request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import CardApi;

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

CardApi apiInstance = new CardApi();
UUID cardId = new UUID(); // UUID | UUID card_id
try {
    Card result = apiInstance.getCardUsingGet(cardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**UUID**](.md)| UUID card_id |

### Return type

[**Card**](Card.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCardProgramUsingPut"></a>
# **updateCardProgramUsingPut**
> CardProgram updateCardProgramUsingPut(cardProgram, cardProgramId)

Update an cardProgram

Update the information for an cardProgram.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import CardApi;

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

CardApi apiInstance = new CardApi();
CardProgram cardProgram = new CardProgram(); // CardProgram | card_program
UUID cardProgramId = new UUID(); // UUID | UUID card_program_id
try {
    CardProgram result = apiInstance.updateCardProgramUsingPut(cardProgram, cardProgramId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardProgramUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProgram** | [**CardProgram**](CardProgram.md)| card_program |
 **cardProgramId** | [**UUID**](.md)| UUID card_program_id |

### Return type

[**CardProgram**](CardProgram.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateCardUsingPut"></a>
# **updateCardUsingPut**
> Card updateCardUsingPut(card, cardId)

Update a card request

Update the information for a card request.

### Example
```java
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;
//import com.hydrogen.auth.*;
//import CardApi;

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

CardApi apiInstance = new CardApi();
Card card = new Card(); // Card | card
UUID cardId = new UUID(); // UUID | UUID card_id
try {
    Card result = apiInstance.updateCardUsingPut(card, cardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#updateCardUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card** | [**Card**](Card.md)| card |
 **cardId** | [**UUID**](.md)| UUID card_id |

### Return type

[**Card**](Card.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

