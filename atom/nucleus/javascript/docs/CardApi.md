# HydrogenNucleusApi.CardApi

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

var cardProgramRequest = new HydrogenNucleusApi.CardProgram(); // CardProgram | cardProgramRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardProgramUsingPost(cardProgramRequest, callback);
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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

var cardRequest = new HydrogenNucleusApi.Card(); // Card | cardRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardUsingPost(cardRequest, callback);
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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

var cardProgramId = "\"f96fad3e-a8cf-4915-bc0c-da4d9693ab83\""; // String | UUID card_program_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCardProgramUsingDelete(cardProgramId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProgramId** | [**String**](.md)| UUID card_program_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

var cardId = "\"1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c\""; // String | UUID card_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCardUsingDelete(cardId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**String**](.md)| UUID card_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCardAllUsingGet"></a>
# **getCardAllUsingGet**
> PageCard getCardAllUsingGet(opts)

List all card requests

Get the information for all card requests.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

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
apiInstance.getCardAllUsingGet(opts, callback);
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

[**PageCard**](PageCard.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCardAssetSizeAggAllUsingGet"></a>
# **getCardAssetSizeAggAllUsingGet**
> [Object] getCardAssetSizeAggAllUsingGet(cardId, opts)

List all card asset sizes

Get a list of asset sizes by date for an card.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

var cardId = "\"11c28dade-8679-4df5-9b9d-c508d04fcb0c\""; // String | Card Id

var opts = { 
  'currencyConversion': "currencyConversion_example", // String | USD
  'endDate': new Date("2013-10-20"), // Date | end date
  'getLatest': true, // Boolean | true or false
  'sortType': "sortType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
  'startDate': new Date("2013-10-20") // Date | start date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardAssetSizeAggAllUsingGet(cardId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**String**](.md)| Card Id | 
 **currencyConversion** | **String**| USD | [optional] 
 **endDate** | **Date**| end date | [optional] 
 **getLatest** | **Boolean**| true or false | [optional] 
 **sortType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional] 
 **startDate** | **Date**| start date | [optional] 

### Return type

**[Object]**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCardProgramAllUsingGet"></a>
# **getCardProgramAllUsingGet**
> PageCardProgram getCardProgramAllUsingGet(opts)

List all cardProgram

Get information for all cardProgram.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

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
apiInstance.getCardProgramAllUsingGet(opts, callback);
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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

var cardProgramId = "\"f96fad3e-a8cf-4915-bc0c-da4d9693ab83\""; // String | UUID card_program_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardProgramUsingGet(cardProgramId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProgramId** | [**String**](.md)| UUID card_program_id | 

### Return type

[**CardProgram**](CardProgram.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCardTransactionAggAllUsingGet"></a>
# **getCardTransactionAggAllUsingGet**
> PagePortfolioTransaction getCardTransactionAggAllUsingGet(cardId, opts)

List all card transactions

Get the information for all transactions for an card.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

var cardId = "cardId_example"; // String | UUID card_id

var opts = { 
  'ascending': false, // Boolean | ascending
  'currencyConversion': "currencyConversion_example", // String | USD
  'endDate': new Date("2013-10-20"), // Date | end date
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25, // Number | size
  'startDate': new Date("2013-10-20") // Date | start date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardTransactionAggAllUsingGet(cardId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**String**](.md)| UUID card_id | 
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| USD | [optional] 
 **endDate** | **Date**| end date | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]
 **startDate** | **Date**| start date | [optional] 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

var cardId = "\"1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c\""; // String | UUID card_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardUsingGet(cardId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**String**](.md)| UUID card_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

var cardProgram = null; // Object | card_program

var cardProgramId = "\"d79bb3a3-f259-430c-8fa8-a93f87cc3bdf\""; // String | UUID card_program_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCardProgramUsingPut(cardProgram, cardProgramId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProgram** | **Object**| card_program | 
 **cardProgramId** | [**String**](.md)| UUID card_program_id | 

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
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.CardApi();

var card = null; // Object | card

var cardId = "\"d79bb3a3-f259-430c-8fa8-a93f87cc3bdf\""; // String | UUID card_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCardUsingPut(card, cardId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card** | **Object**| card | 
 **cardId** | [**String**](.md)| UUID card_id | 

### Return type

[**Card**](Card.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

