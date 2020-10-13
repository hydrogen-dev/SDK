# TokenApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**burnTokenUsingPost**](TokenApi.md#burnTokenUsingPost) | **POST** /token/burn | Burn tokens
[**createTokenUsingPost**](TokenApi.md#createTokenUsingPost) | **POST** /token | Creates a new Token
[**deleteTokenUsingDelete**](TokenApi.md#deleteTokenUsingDelete) | **DELETE** /token/{token_id} | Delete Token
[**deployTokenUsingPost**](TokenApi.md#deployTokenUsingPost) | **POST** /token/deploy | Deploys provided Token to network
[**getTokenAllUsingGet**](TokenApi.md#getTokenAllUsingGet) | **GET** /token | Fetch Token list
[**getTokenUsingGet**](TokenApi.md#getTokenUsingGet) | **GET** /token/{token_id} | Fetch Token details
[**mintTokenUsingPost**](TokenApi.md#mintTokenUsingPost) | **POST** /token/mint | Mint new tokens
[**updateTokenUsingPut**](TokenApi.md#updateTokenUsingPut) | **PUT** /token/{token_id} | Update Token details
[**whitelistTokenUsingPost**](TokenApi.md#whitelistTokenUsingPost) | **POST** /token/whitelist | Whitelist token for provided wallet


<a name="burnTokenUsingPost"></a>
# **burnTokenUsingPost**
> TransactionSuccessResponse burnTokenUsingPost(tokenBurnParams)

Burn tokens

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TokenApi apiInstance = new TokenApi();
TokenBurnParams tokenBurnParams = new TokenBurnParams(); // TokenBurnParams | Burns provided amount of existing tokens
try {
    TransactionSuccessResponse result = apiInstance.burnTokenUsingPost(tokenBurnParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#burnTokenUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenBurnParams** | [**TokenBurnParams**](TokenBurnParams.md)| Burns provided amount of existing tokens |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTokenUsingPost"></a>
# **createTokenUsingPost**
> TokenResponse createTokenUsingPost(tokenParams)

Creates a new Token

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TokenApi apiInstance = new TokenApi();
TokenParams tokenParams = new TokenParams(); // TokenParams | It enables a user to create a Token
try {
    TokenResponse result = apiInstance.createTokenUsingPost(tokenParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#createTokenUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenParams** | [**TokenParams**](TokenParams.md)| It enables a user to create a Token |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTokenUsingDelete"></a>
# **deleteTokenUsingDelete**
> deleteTokenUsingDelete(tokenId)

Delete Token

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TokenApi apiInstance = new TokenApi();
UUID tokenId = new UUID(); // UUID | Token ID
try {
    apiInstance.deleteTokenUsingDelete(tokenId);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#deleteTokenUsingDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**UUID**](.md)| Token ID |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deployTokenUsingPost"></a>
# **deployTokenUsingPost**
> TransactionSuccessResponse deployTokenUsingPost(tokenDeployParams)

Deploys provided Token to network

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TokenApi apiInstance = new TokenApi();
TokenDeployParams tokenDeployParams = new TokenDeployParams(); // TokenDeployParams | Deploys provided Token to network
try {
    TransactionSuccessResponse result = apiInstance.deployTokenUsingPost(tokenDeployParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#deployTokenUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenDeployParams** | [**TokenDeployParams**](TokenDeployParams.md)| Deploys provided Token to network |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenAllUsingGet"></a>
# **getTokenAllUsingGet**
> PageTokenResponse getTokenAllUsingGet(page, size, orderBy, ascending, getLatest)

Fetch Token list

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TokenApi apiInstance = new TokenApi();
Integer page = 56; // Integer | To filter response Token list by page number
Integer size = 56; // Integer | Number of records per page
String orderBy = "orderBy_example"; // String | Field to sort record list
Boolean ascending = true; // Boolean | Sorting order
Boolean getLatest = true; // Boolean | To fetch latest (one) record
try {
    PageTokenResponse result = apiInstance.getTokenAllUsingGet(page, size, orderBy, ascending, getLatest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#getTokenAllUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| To filter response Token list by page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **orderBy** | **String**| Field to sort record list | [optional]
 **ascending** | **Boolean**| Sorting order | [optional]
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional]

### Return type

[**PageTokenResponse**](PageTokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenUsingGet"></a>
# **getTokenUsingGet**
> TokenResponse getTokenUsingGet(tokenId)

Fetch Token details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TokenApi apiInstance = new TokenApi();
UUID tokenId = new UUID(); // UUID | Token ID
try {
    TokenResponse result = apiInstance.getTokenUsingGet(tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#getTokenUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**UUID**](.md)| Token ID |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mintTokenUsingPost"></a>
# **mintTokenUsingPost**
> TransactionSuccessResponse mintTokenUsingPost(tokenMintParams)

Mint new tokens

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TokenApi apiInstance = new TokenApi();
TokenMintParams tokenMintParams = new TokenMintParams(); // TokenMintParams | Mint new tokens
try {
    TransactionSuccessResponse result = apiInstance.mintTokenUsingPost(tokenMintParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#mintTokenUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenMintParams** | [**TokenMintParams**](TokenMintParams.md)| Mint new tokens |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTokenUsingPut"></a>
# **updateTokenUsingPut**
> TokenResponse updateTokenUsingPut(tokenId, tokenUpdateParams)

Update Token details

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TokenApi apiInstance = new TokenApi();
UUID tokenId = new UUID(); // UUID | Token ID
TokenUpdateParams tokenUpdateParams = new TokenUpdateParams(); // TokenUpdateParams | Token details to be updated
try {
    TokenResponse result = apiInstance.updateTokenUsingPut(tokenId, tokenUpdateParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#updateTokenUsingPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**UUID**](.md)| Token ID |
 **tokenUpdateParams** | [**TokenUpdateParams**](TokenUpdateParams.md)| Token details to be updated | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="whitelistTokenUsingPost"></a>
# **whitelistTokenUsingPost**
> TransactionSuccessResponse whitelistTokenUsingPost(tokenWhitelistParams)

Whitelist token for provided wallet

### Example
```java
// Import classes:
//import com.hydrogen.molecule.AuthApiClient;
//import com.hydrogen.molecule.ApiException;
//import TokenApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          You can use any one of them to access an API.
//          Creating a token for grant_type=client_credentials            
authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
//          Creating a token for grant_type=password
authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                       "USERNAME", "PASSWORD");           
} catch (ApiException e) {
e.printStackTrace();
}

TokenApi apiInstance = new TokenApi();
TokenWhitelistParams tokenWhitelistParams = new TokenWhitelistParams(); // TokenWhitelistParams | Whitelist token for provided wallet
try {
    TransactionSuccessResponse result = apiInstance.whitelistTokenUsingPost(tokenWhitelistParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#whitelistTokenUsingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenWhitelistParams** | [**TokenWhitelistParams**](TokenWhitelistParams.md)| Whitelist token for provided wallet |

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

