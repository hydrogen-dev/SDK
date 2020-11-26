# CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCardProgramUsingPost**](CardApi.md#createCardProgramUsingPost) | **POST** /card_program | Create a cardProgram request
[**createCardUsingPost**](CardApi.md#createCardUsingPost) | **POST** /card | Create a card request
[**deleteCardProgramUsingDelete**](CardApi.md#deleteCardProgramUsingDelete) | **DELETE** /card_program/{card_program_id} | Delete an cardProgram
[**deleteCardUsingDelete**](CardApi.md#deleteCardUsingDelete) | **DELETE** /card/{card_id} | Delete a card request
[**getCardAllUsingGet**](CardApi.md#getCardAllUsingGet) | **GET** /card | List all card requests
[**getCardAssetSizeAggAllUsingGet**](CardApi.md#getCardAssetSizeAggAllUsingGet) | **GET** /card/{card_id}/asset_size | List all card asset sizes
[**getCardProgramAllUsingGet**](CardApi.md#getCardProgramAllUsingGet) | **GET** /card_program | List all cardProgram
[**getCardProgramUsingGet**](CardApi.md#getCardProgramUsingGet) | **GET** /card_program/{card_program_id} | Retrieve an cardProgram
[**getCardTransactionAggAllUsingGet**](CardApi.md#getCardTransactionAggAllUsingGet) | **GET** /card/{card_id}/transaction | List all card transactions
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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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
> Card createCardUsingPost(cardRequest)

Create a card request

Create a new card request.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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


CardApi apiInstance = new CardApi();
Card cardRequest = new Card(); // Card | cardRequest
try {
    Card result = apiInstance.createCardUsingPost(cardRequest);
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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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

<a name="getCardAssetSizeAggAllUsingGet"></a>
# **getCardAssetSizeAggAllUsingGet**
> List&lt;Object&gt; getCardAssetSizeAggAllUsingGet(cardId, currencyConversion, endDate, getLatest, sortType, startDate)

List all card asset sizes

Get a list of asset sizes by date for an card.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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


CardApi apiInstance = new CardApi();
UUID cardId = new UUID(); // UUID | Card Id
String currencyConversion = "currencyConversion_example"; // String | USD
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Boolean getLatest = true; // Boolean | true or false
String sortType = "sortType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    List<Object> result = apiInstance.getCardAssetSizeAggAllUsingGet(cardId, currencyConversion, endDate, getLatest, sortType, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardAssetSizeAggAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**UUID**](.md)| Card Id |
 **currencyConversion** | **String**| USD | [optional]
 **endDate** | **LocalDate**| end date | [optional]
 **getLatest** | **Boolean**| true or false | [optional]
 **sortType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional]
 **startDate** | **LocalDate**| start date | [optional]

### Return type

**List&lt;Object&gt;**

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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

<a name="getCardTransactionAggAllUsingGet"></a>
# **getCardTransactionAggAllUsingGet**
> PagePortfolioTransaction getCardTransactionAggAllUsingGet(cardId, ascending, currencyConversion, endDate, orderBy, page, size, startDate)

List all card transactions

Get the information for all transactions for an card.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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


CardApi apiInstance = new CardApi();
UUID cardId = new UUID(); // UUID | UUID card_id
Boolean ascending = false; // Boolean | ascending
String currencyConversion = "currencyConversion_example"; // String | USD
LocalDate endDate = LocalDate.now(); // LocalDate | end date
String orderBy = "update_date"; // String | order_by
Integer page = 0; // Integer | page
Integer size = 25; // Integer | size
LocalDate startDate = LocalDate.now(); // LocalDate | start date
try {
    PagePortfolioTransaction result = apiInstance.getCardTransactionAggAllUsingGet(cardId, ascending, currencyConversion, endDate, orderBy, page, size, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardApi#getCardTransactionAggAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**UUID**](.md)| UUID card_id |
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| USD | [optional]
 **endDate** | **LocalDate**| end date | [optional]
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **startDate** | **LocalDate**| start date | [optional]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import com.hydrogen.nucleus.auth.*;
//import CardApi;

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

