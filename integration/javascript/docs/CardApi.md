# HydrogenIntegrationApi.CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutoReloadUsingPost**](CardApi.md#createAutoReloadUsingPost) | **POST** /card/auto_reload | Card auto reload
[**createCardActivateUsingPost**](CardApi.md#createCardActivateUsingPost) | **POST** /card/activate | Activate card
[**createCardBusinessUsingPost**](CardApi.md#createCardBusinessUsingPost) | **POST** /card/business | Create a card business
[**createCardCloseUsingPost**](CardApi.md#createCardCloseUsingPost) | **POST** /card/close | close a card
[**createCardIssueUsingPost**](CardApi.md#createCardIssueUsingPost) | **POST** /card/issue | issue a card
[**createCardLoadUsingPost**](CardApi.md#createCardLoadUsingPost) | **POST** /card/load | Create a card load
[**createCardPinUsingPost**](CardApi.md#createCardPinUsingPost) | **POST** /card/pin | pin card
[**createCardReactivateUsingPost**](CardApi.md#createCardReactivateUsingPost) | **POST** /card/reactivate | reactivate card
[**createCardReissueUsingPost**](CardApi.md#createCardReissueUsingPost) | **POST** /card/reissue | Reissue a card
[**createCardReplaceUsingPost**](CardApi.md#createCardReplaceUsingPost) | **POST** /card/replace | Create card replace
[**createCardSpendingControlUsingPost**](CardApi.md#createCardSpendingControlUsingPost) | **POST** /card/spending_control | Create card spending control
[**createCardSuspendUsingPost**](CardApi.md#createCardSuspendUsingPost) | **POST** /card/suspend | suspend card
[**createCardTokenUsingPost**](CardApi.md#createCardTokenUsingPost) | **POST** /card/token | token card
[**createCardUnloadUsingPost**](CardApi.md#createCardUnloadUsingPost) | **POST** /card/unload | Create a card upload
[**createClientCardUsingPost**](CardApi.md#createClientCardUsingPost) | **POST** /card/client | Create a card client
[**getCardBalanceUsingGet**](CardApi.md#getCardBalanceUsingGet) | **GET** /card/balance/{id} | Get a Card Balance
[**getCardImage**](CardApi.md#getCardImage) | **GET** /card/image/{card_id} | Get card image
[**getCardPciDetails**](CardApi.md#getCardPciDetails) | **GET** /card/pci_details/{card_id} | Get card pci details
[**getCardReserveAccountDetailsUsingGet**](CardApi.md#getCardReserveAccountDetailsUsingGet) | **GET** /card/reserve | Card reserve account
[**getCardStatementUsingGet**](CardApi.md#getCardStatementUsingGet) | **GET** /card/statement/{card_id} | Get card statement
[**getCardTokenUsingToken**](CardApi.md#getCardTokenUsingToken) | **GET** /card/token/{id} | Get a card token
[**getCardTransactionUsingGet**](CardApi.md#getCardTransactionUsingGet) | **GET** /card/transaction/{id} | Get a card transaction
[**getCardUsingGet**](CardApi.md#getCardUsingGet) | **GET** /card/{id} | Get a card information
[**updateCardBusinessUsingPut**](CardApi.md#updateCardBusinessUsingPut) | **PUT** /card/business/{nucleus_business_id} | Update a card business
[**updateCardPinUsingPost**](CardApi.md#updateCardPinUsingPost) | **PUT** /card/pin/{id} | update a pin card
[**updateCardSpendingControlUsingPut**](CardApi.md#updateCardSpendingControlUsingPut) | **PUT** /card/spending_control/{nucleus_spending_control_id} | Update a card spending control
[**updateCardUsingPut**](CardApi.md#updateCardUsingPut) | **PUT** /card/{id} | Update a card information
[**updateClientCardUsingPut**](CardApi.md#updateClientCardUsingPut) | **PUT** /card/client/{id} | Update a card client
[**verifyCardPinUsingPost**](CardApi.md#verifyCardPinUsingPost) | **POST** /card/pin/verify | verify card pin


<a name="createAutoReloadUsingPost"></a>
# **createAutoReloadUsingPost**
> CardAutoReloadResponseVO createAutoReloadUsingPost(request)

Card auto reload

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var request = new HydrogenIntegrationApi.CardAutoReloadRequestCO(); // CardAutoReloadRequestCO | request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAutoReloadUsingPost(request, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardAutoReloadRequestCO**](CardAutoReloadRequestCO.md)| request | 

### Return type

[**CardAutoReloadResponseVO**](CardAutoReloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardActivateUsingPost"></a>
# **createCardActivateUsingPost**
> BaseResponseVO createCardActivateUsingPost(activateRequest)

Activate card

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var activateRequest = new HydrogenIntegrationApi.CardBaseRequestCO(); // CardBaseRequestCO | activateRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardActivateUsingPost(activateRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activateRequest** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| activateRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardBusinessUsingPost"></a>
# **createCardBusinessUsingPost**
> CreateBusinessResponseVO createCardBusinessUsingPost(cardBusinessRequestCO)

Create a card business

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var cardBusinessRequestCO = new HydrogenIntegrationApi.CardBusinessRequestCO(); // CardBusinessRequestCO | cardBusinessRequestCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardBusinessUsingPost(cardBusinessRequestCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardBusinessRequestCO** | [**CardBusinessRequestCO**](CardBusinessRequestCO.md)| cardBusinessRequestCO | 

### Return type

[**CreateBusinessResponseVO**](CreateBusinessResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardCloseUsingPost"></a>
# **createCardCloseUsingPost**
> BaseResponseVO createCardCloseUsingPost(closeRequest)

close a card

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var closeRequest = new HydrogenIntegrationApi.CardBaseRequestCO(); // CardBaseRequestCO | closeRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardCloseUsingPost(closeRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **closeRequest** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| closeRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardIssueUsingPost"></a>
# **createCardIssueUsingPost**
> BaseResponseVO createCardIssueUsingPost(issueRequest)

issue a card

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var issueRequest = new HydrogenIntegrationApi.CardBaseRequestCO(); // CardBaseRequestCO | issueRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardIssueUsingPost(issueRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueRequest** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| issueRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardLoadUsingPost"></a>
# **createCardLoadUsingPost**
> CardLoadUnloadResponseVO createCardLoadUsingPost(loadRequest)

Create a card load

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var loadRequest = new HydrogenIntegrationApi.CardLoadRequestCO(); // CardLoadRequestCO | loadRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardLoadUsingPost(loadRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadRequest** | [**CardLoadRequestCO**](CardLoadRequestCO.md)| loadRequest | 

### Return type

[**CardLoadUnloadResponseVO**](CardLoadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardPinUsingPost"></a>
# **createCardPinUsingPost**
> BaseResponseVO createCardPinUsingPost(cardPinRequestCO)

pin card

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var cardPinRequestCO = new HydrogenIntegrationApi.CardPinRequestCO(); // CardPinRequestCO | cardPinRequestCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardPinUsingPost(cardPinRequestCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardPinRequestCO** | [**CardPinRequestCO**](CardPinRequestCO.md)| cardPinRequestCO | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardReactivateUsingPost"></a>
# **createCardReactivateUsingPost**
> BaseResponseVO createCardReactivateUsingPost(reactivateRequest)

reactivate card

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var reactivateRequest = new HydrogenIntegrationApi.CardBaseRequestCO(); // CardBaseRequestCO | reactivateRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardReactivateUsingPost(reactivateRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reactivateRequest** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| reactivateRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardReissueUsingPost"></a>
# **createCardReissueUsingPost**
> BaseResponseVO createCardReissueUsingPost(request)

Reissue a card

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var request = new HydrogenIntegrationApi.CardBaseRequestCO(); // CardBaseRequestCO | request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardReissueUsingPost(request, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| request | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardReplaceUsingPost"></a>
# **createCardReplaceUsingPost**
> CardReplaceResponseVO createCardReplaceUsingPost(request)

Create card replace

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var request = new HydrogenIntegrationApi.CardBaseRequestCO(); // CardBaseRequestCO | request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardReplaceUsingPost(request, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| request | 

### Return type

[**CardReplaceResponseVO**](CardReplaceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardSpendingControlUsingPost"></a>
# **createCardSpendingControlUsingPost**
> CardSpendingControlResponseVO createCardSpendingControlUsingPost(request)

Create card spending control

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var request = new HydrogenIntegrationApi.CardSpendingControlRequestCO(); // CardSpendingControlRequestCO | request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardSpendingControlUsingPost(request, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardSpendingControlRequestCO**](CardSpendingControlRequestCO.md)| request | 

### Return type

[**CardSpendingControlResponseVO**](CardSpendingControlResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardSuspendUsingPost"></a>
# **createCardSuspendUsingPost**
> BaseResponseVO createCardSuspendUsingPost(suspendRequest)

suspend card

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var suspendRequest = new HydrogenIntegrationApi.CardBaseRequestCO(); // CardBaseRequestCO | suspendRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardSuspendUsingPost(suspendRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suspendRequest** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| suspendRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardTokenUsingPost"></a>
# **createCardTokenUsingPost**
> CardTokenResponseVO createCardTokenUsingPost(tokenizeRequest)

token card

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var tokenizeRequest = new HydrogenIntegrationApi.CardTokenRequestCO(); // CardTokenRequestCO | tokenizeRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardTokenUsingPost(tokenizeRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenizeRequest** | [**CardTokenRequestCO**](CardTokenRequestCO.md)| tokenizeRequest | 

### Return type

[**CardTokenResponseVO**](CardTokenResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCardUnloadUsingPost"></a>
# **createCardUnloadUsingPost**
> CardLoadUnloadResponseVO createCardUnloadUsingPost(reloadRequest)

Create a card upload

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var reloadRequest = new HydrogenIntegrationApi.CardUnloadRequestCO(); // CardUnloadRequestCO | reloadRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCardUnloadUsingPost(reloadRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reloadRequest** | [**CardUnloadRequestCO**](CardUnloadRequestCO.md)| reloadRequest | 

### Return type

[**CardLoadUnloadResponseVO**](CardLoadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientCardUsingPost"></a>
# **createClientCardUsingPost**
> CreateCardClientResponseVO createClientCardUsingPost(cardClientRequestCO)

Create a card client

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var cardClientRequestCO = new HydrogenIntegrationApi.CardClientRequestCO(); // CardClientRequestCO | cardClientRequestCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createClientCardUsingPost(cardClientRequestCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardClientRequestCO** | [**CardClientRequestCO**](CardClientRequestCO.md)| cardClientRequestCO | 

### Return type

[**CreateCardClientResponseVO**](CreateCardClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardBalanceUsingGet"></a>
# **getCardBalanceUsingGet**
> CardBalanceResponseVO getCardBalanceUsingGet(id, opts)

Get a Card Balance

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var id = "id_example"; // String | id

var opts = { 
  'endDate': new Date("2013-10-20"), // Date | end_date
  'startDate': new Date("2013-10-20") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardBalanceUsingGet(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 
 **endDate** | **Date**| end_date | [optional] 
 **startDate** | **Date**| start_date | [optional] 

### Return type

[**CardBalanceResponseVO**](CardBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardImage"></a>
# **getCardImage**
> GetCardImageResponseVO getCardImage(cardId)

Get card image

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var cardId = "cardId_example"; // String | card_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardImage(cardId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**String**](.md)| card_id | 

### Return type

[**GetCardImageResponseVO**](GetCardImageResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardPciDetails"></a>
# **getCardPciDetails**
> GetCardPciDetailsResponseVO getCardPciDetails(cardId)

Get card pci details

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var cardId = "cardId_example"; // String | card_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardPciDetails(cardId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**String**](.md)| card_id | 

### Return type

[**GetCardPciDetailsResponseVO**](GetCardPciDetailsResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardReserveAccountDetailsUsingGet"></a>
# **getCardReserveAccountDetailsUsingGet**
> CardReserveAccountResponseVO getCardReserveAccountDetailsUsingGet()

Card reserve account

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardReserveAccountDetailsUsingGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CardReserveAccountResponseVO**](CardReserveAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardStatementUsingGet"></a>
# **getCardStatementUsingGet**
> GetCardStatementResponseVO getCardStatementUsingGet(cardId, opts)

Get card statement

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var cardId = "cardId_example"; // String | card_id

var opts = { 
  'endDate': new Date("2013-10-20"), // Date | end_date
  'startDate': new Date("2013-10-20") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardStatementUsingGet(cardId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | [**String**](.md)| card_id | 
 **endDate** | **Date**| end_date | [optional] 
 **startDate** | **Date**| start_date | [optional] 

### Return type

[**GetCardStatementResponseVO**](GetCardStatementResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardTokenUsingToken"></a>
# **getCardTokenUsingToken**
> [GetCardTokenResponseVO] getCardTokenUsingToken(id, opts)

Get a card token

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var id = "id_example"; // String | id

var opts = { 
  'deviceId': "deviceId_example", // String | device_id
  'deviceType': "deviceType_example", // String | device_type
  'wallet': "wallet_example" // String | wallet
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardTokenUsingToken(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 
 **deviceId** | **String**| device_id | [optional] 
 **deviceType** | **String**| device_type | [optional] 
 **wallet** | **String**| wallet | [optional] 

### Return type

[**[GetCardTokenResponseVO]**](GetCardTokenResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardTransactionUsingGet"></a>
# **getCardTransactionUsingGet**
> CardTransactionResponseVO getCardTransactionUsingGet(id, opts)

Get a card transaction

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var id = "id_example"; // String | id

var opts = { 
  'endDate': new Date("2013-10-20"), // Date | end_date
  'startDate': new Date("2013-10-20") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardTransactionUsingGet(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 
 **endDate** | **Date**| end_date | [optional] 
 **startDate** | **Date**| start_date | [optional] 

### Return type

[**CardTransactionResponseVO**](CardTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCardUsingGet"></a>
# **getCardUsingGet**
> BaseResponseVO getCardUsingGet(id)

Get a card information

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var id = "id_example"; // String | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCardUsingGet(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCardBusinessUsingPut"></a>
# **updateCardBusinessUsingPut**
> UpdateBusinessResponseVO updateCardBusinessUsingPut(nucleusBusinessId)

Update a card business

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var nucleusBusinessId = "nucleusBusinessId_example"; // String | nucleus_business_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCardBusinessUsingPut(nucleusBusinessId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBusinessId** | [**String**](.md)| nucleus_business_id | 

### Return type

[**UpdateBusinessResponseVO**](UpdateBusinessResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCardPinUsingPost"></a>
# **updateCardPinUsingPost**
> BaseResponseVO updateCardPinUsingPost(cardPinRequestCO, id)

update a pin card

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var cardPinRequestCO = new HydrogenIntegrationApi.CardUpdatePinRequestCO(); // CardUpdatePinRequestCO | cardPinRequestCO

var id = "id_example"; // String | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCardPinUsingPost(cardPinRequestCO, id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardPinRequestCO** | [**CardUpdatePinRequestCO**](CardUpdatePinRequestCO.md)| cardPinRequestCO | 
 **id** | [**String**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCardSpendingControlUsingPut"></a>
# **updateCardSpendingControlUsingPut**
> CardSpendingControlResponseVO updateCardSpendingControlUsingPut(nucleusSpendingControlId)

Update a card spending control

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var nucleusSpendingControlId = "nucleusSpendingControlId_example"; // String | nucleus_spending_control_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCardSpendingControlUsingPut(nucleusSpendingControlId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusSpendingControlId** | [**String**](.md)| nucleus_spending_control_id | 

### Return type

[**CardSpendingControlResponseVO**](CardSpendingControlResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCardUsingPut"></a>
# **updateCardUsingPut**
> BaseResponseVO updateCardUsingPut(id)

Update a card information

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var id = "id_example"; // String | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCardUsingPut(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClientCardUsingPut"></a>
# **updateClientCardUsingPut**
> UpdateCardClientResponseVO updateClientCardUsingPut(id)

Update a card client

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var id = "id_example"; // String | id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateClientCardUsingPut(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| id | 

### Return type

[**UpdateCardClientResponseVO**](UpdateCardClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyCardPinUsingPost"></a>
# **verifyCardPinUsingPost**
> BaseResponseVO verifyCardPinUsingPost(cardPinRequestCO)

verify card pin

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.CardApi();

var cardPinRequestCO = new HydrogenIntegrationApi.CardPinRequestCO(); // CardPinRequestCO | cardPinRequestCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.verifyCardPinUsingPost(cardPinRequestCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardPinRequestCO** | [**CardPinRequestCO**](CardPinRequestCO.md)| cardPinRequestCO | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

