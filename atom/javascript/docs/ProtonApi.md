# atom_api.ProtonApi

All URIs are relative to *https://api.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annuityCalculatorAccumulationHorizon**](ProtonApi.md#annuityCalculatorAccumulationHorizon) | **POST** /proton/v1/annuity_calculator/accumulation_horizon | Annuity calculator - accumulation horizon
[**annuityCalculatorAnnuityAmount**](ProtonApi.md#annuityCalculatorAnnuityAmount) | **POST** /proton/v1/annuity_calculator/annuity_amount | Annuity calculator - annuity amount
[**annuityCalculatorDecumulationHorizon**](ProtonApi.md#annuityCalculatorDecumulationHorizon) | **POST** /proton/v1/annuity_calculator/decumulation_horizon | Annuity calculator - decumulation horizon
[**annuityCalculatorDepositAmount**](ProtonApi.md#annuityCalculatorDepositAmount) | **POST** /proton/v1/annuity_calculator/deposit_amount | Annuity calculator - deposit amount
[**annuityCalculatorInitialBalance**](ProtonApi.md#annuityCalculatorInitialBalance) | **POST** /proton/v1/annuity_calculator/initial_balance | Annuity calculator - initial balance
[**dimensionalRiskScore**](ProtonApi.md#dimensionalRiskScore) | **POST** /proton/v1/dimensional_risk_score | Dimensional risk score
[**educationCalculatorAnnualCost**](ProtonApi.md#educationCalculatorAnnualCost) | **POST** /proton/v1/education_calculator/annual_cost | Education calculator - total annual cost
[**educationCalculatorDepositAmount**](ProtonApi.md#educationCalculatorDepositAmount) | **POST** /proton/v1/education_calculator/deposit_amount | Education calculator - deposit amount
[**educationCalculatorPercentCovered**](ProtonApi.md#educationCalculatorPercentCovered) | **POST** /proton/v1/education_calculator/percent_covered | Education calculator - percent covered
[**emergencyFundCalculator**](ProtonApi.md#emergencyFundCalculator) | **POST** /proton/v1/emergency_fund_calculator | Emergency fund calculator
[**eventStudy**](ProtonApi.md#eventStudy) | **POST** /proton/v1/event_study | Event study
[**financialHealthCheck**](ProtonApi.md#financialHealthCheck) | **POST** /proton/v1/financial_health_check | Financial health check
[**goalAccumulationAllocation**](ProtonApi.md#goalAccumulationAllocation) | **POST** /proton/v1/goal_accumulation/allocation | Goal accumulation allocation
[**goalAccumulationRecommendation**](ProtonApi.md#goalAccumulationRecommendation) | **POST** /proton/v1/goal_accumulation/recommendation | Goal accumulation recommendation
[**goalAccumulationStatus**](ProtonApi.md#goalAccumulationStatus) | **POST** /proton/v1/goal_accumulation/status | Goal accumulation status
[**goalDecumulationAllocation**](ProtonApi.md#goalDecumulationAllocation) | **POST** /proton/v1/goal_decumulation/allocation | Goal decumulation allocation
[**goalDecumulationRecommendation**](ProtonApi.md#goalDecumulationRecommendation) | **POST** /proton/v1/goal_decumulation/recommendation | Goal decumulation recommendation
[**goalDecumulationStatus**](ProtonApi.md#goalDecumulationStatus) | **POST** /proton/v1/goal_decumulation/status | Goal decumulation status
[**lifeInsuranceNeedsCalculator**](ProtonApi.md#lifeInsuranceNeedsCalculator) | **POST** /proton/v1/life_insurance/needs_calculator | Life insurance needs calculator
[**modelBacktest**](ProtonApi.md#modelBacktest) | **POST** /proton/v1/backtest | Model backtest
[**monteCarlo**](ProtonApi.md#monteCarlo) | **POST** /proton/v1/monte_carlo | Monte Carlo
[**mortgageCalculatorDownPayment**](ProtonApi.md#mortgageCalculatorDownPayment) | **POST** /proton/v1/mortgage_calculator/down_payment | Mortgage calculator - down payment
[**mortgageCalculatorHomePrice**](ProtonApi.md#mortgageCalculatorHomePrice) | **POST** /proton/v1/mortgage_calculator/home_price | Mortgage calculator - home price
[**mortgageCalculatorPeriodicPayment**](ProtonApi.md#mortgageCalculatorPeriodicPayment) | **POST** /proton/v1/mortgage_calculator/periodic_payment | Mortgage calculator - periodic payment
[**mvo**](ProtonApi.md#mvo) | **POST** /proton/v1/mvo | Mean-variance optimization
[**portfolioDiversificationScore**](ProtonApi.md#portfolioDiversificationScore) | **POST** /proton/v1/diversification_score | Portfolio diversification score
[**portfolioOptimizationScore**](ProtonApi.md#portfolioOptimizationScore) | **POST** /proton/v1/portfolio_optimization_score | Portfolio optimization score
[**portfolioWhatIf**](ProtonApi.md#portfolioWhatIf) | **POST** /proton/v1/portfolio_what_if | Portfolio what-if
[**purchaseCalculatorDepositAmount**](ProtonApi.md#purchaseCalculatorDepositAmount) | **POST** /proton/v1/purchase_calculator/deposit_amount | Purchase calculator - deposit amount
[**purchaseCalculatorHorizon**](ProtonApi.md#purchaseCalculatorHorizon) | **POST** /proton/v1/purchase_calculator/horizon | Purchase calculator - horizon
[**purchaseCalculatorPurchaseAmount**](ProtonApi.md#purchaseCalculatorPurchaseAmount) | **POST** /proton/v1/purchase_calculator/amount | Purchase calculator - purchase amount
[**rebalancingSignal**](ProtonApi.md#rebalancingSignal) | **POST** /proton/v1/rebalancing_signal | Rebalancing
[**retirementCalculatorDepositAmount**](ProtonApi.md#retirementCalculatorDepositAmount) | **POST** /proton/v1/retirement_calculator/deposit_amount | Retirement calculator - deposit amount
[**retirementCalculatorExpenses**](ProtonApi.md#retirementCalculatorExpenses) | **POST** /proton/v1/retirement_calculator/expenses | Retirement calculator - expenses
[**retirementCalculatorPercentCovered**](ProtonApi.md#retirementCalculatorPercentCovered) | **POST** /proton/v1/retirement_calculator/percent_covered | Retirement calculator - percent of costs covered
[**riskAllocation**](ProtonApi.md#riskAllocation) | **POST** /proton/v1/risk_allocation | Risk allocation
[**riskScore**](ProtonApi.md#riskScore) | **POST** /proton/v1/risk_score | Risk score
[**savingsCalculator**](ProtonApi.md#savingsCalculator) | **POST** /proton/v1/savings_calculator | Savings calculator
[**scenarioAnalysis**](ProtonApi.md#scenarioAnalysis) | **POST** /proton/v1/scenario_analysis | Scenario analysis
[**sensitivityAnalysis**](ProtonApi.md#sensitivityAnalysis) | **POST** /proton/v1/sensitivity_analysis | Sensitivity analysis


<a name="annuityCalculatorAccumulationHorizon"></a>
# **annuityCalculatorAccumulationHorizon**
> AnnuityAccumulationResponse annuityCalculatorAccumulationHorizon(payload)

Annuity calculator - accumulation horizon

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.AnnuityCalculatorAccumulationHorizon(); // AnnuityCalculatorAccumulationHorizon | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.annuityCalculatorAccumulationHorizon(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorAccumulationHorizon**](AnnuityCalculatorAccumulationHorizon.md)|  | 

### Return type

[**AnnuityAccumulationResponse**](AnnuityAccumulationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorAnnuityAmount"></a>
# **annuityCalculatorAnnuityAmount**
> AnnuityAmountResponse annuityCalculatorAnnuityAmount(payload)

Annuity calculator - annuity amount

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.AnnuityCalculatorAnnuityAmount(); // AnnuityCalculatorAnnuityAmount | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.annuityCalculatorAnnuityAmount(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorAnnuityAmount**](AnnuityCalculatorAnnuityAmount.md)|  | 

### Return type

[**AnnuityAmountResponse**](AnnuityAmountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorDecumulationHorizon"></a>
# **annuityCalculatorDecumulationHorizon**
> AnnuityDecumulationResponse annuityCalculatorDecumulationHorizon(payload)

Annuity calculator - decumulation horizon

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.AnnuityCalculatorDecumulationHorizon(); // AnnuityCalculatorDecumulationHorizon | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.annuityCalculatorDecumulationHorizon(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorDecumulationHorizon**](AnnuityCalculatorDecumulationHorizon.md)|  | 

### Return type

[**AnnuityDecumulationResponse**](AnnuityDecumulationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorDepositAmount"></a>
# **annuityCalculatorDepositAmount**
> AnnuityDepositamountResponse annuityCalculatorDepositAmount(payload)

Annuity calculator - deposit amount

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.AnnuityCalculatorDepositAmount(); // AnnuityCalculatorDepositAmount | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.annuityCalculatorDepositAmount(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorDepositAmount**](AnnuityCalculatorDepositAmount.md)|  | 

### Return type

[**AnnuityDepositamountResponse**](AnnuityDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorInitialBalance"></a>
# **annuityCalculatorInitialBalance**
> AnnuityInitialbalanceResponse annuityCalculatorInitialBalance(payload)

Annuity calculator - initial balance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.AnnuityCalculatorInitialBalance(); // AnnuityCalculatorInitialBalance | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.annuityCalculatorInitialBalance(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorInitialBalance**](AnnuityCalculatorInitialBalance.md)|  | 

### Return type

[**AnnuityInitialbalanceResponse**](AnnuityInitialbalanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dimensionalRiskScore"></a>
# **dimensionalRiskScore**
> DimRiskScoreResponse dimensionalRiskScore(payload)

Dimensional risk score

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.DimensionalRiskScore(); // DimensionalRiskScore | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.dimensionalRiskScore(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**DimensionalRiskScore**](DimensionalRiskScore.md)|  | 

### Return type

[**DimRiskScoreResponse**](DimRiskScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="educationCalculatorAnnualCost"></a>
# **educationCalculatorAnnualCost**
> EducationCalculatorAnnualcostResponse educationCalculatorAnnualCost(payload)

Education calculator - total annual cost

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.EducationCalculatorAnnualCost(); // EducationCalculatorAnnualCost | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.educationCalculatorAnnualCost(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EducationCalculatorAnnualCost**](EducationCalculatorAnnualCost.md)|  | 

### Return type

[**EducationCalculatorAnnualcostResponse**](EducationCalculatorAnnualcostResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="educationCalculatorDepositAmount"></a>
# **educationCalculatorDepositAmount**
> EducationCalculatorDepositamountResponse educationCalculatorDepositAmount(payload)

Education calculator - deposit amount

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.EducationCalculatorDepositAmount(); // EducationCalculatorDepositAmount | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.educationCalculatorDepositAmount(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EducationCalculatorDepositAmount**](EducationCalculatorDepositAmount.md)|  | 

### Return type

[**EducationCalculatorDepositamountResponse**](EducationCalculatorDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="educationCalculatorPercentCovered"></a>
# **educationCalculatorPercentCovered**
> EducationCalculatorPctcoveredResponse educationCalculatorPercentCovered(payload)

Education calculator - percent covered

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.EducationCalculatorPercentCovered(); // EducationCalculatorPercentCovered | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.educationCalculatorPercentCovered(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EducationCalculatorPercentCovered**](EducationCalculatorPercentCovered.md)|  | 

### Return type

[**EducationCalculatorPctcoveredResponse**](EducationCalculatorPctcoveredResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emergencyFundCalculator"></a>
# **emergencyFundCalculator**
> EmergencyFundResponse emergencyFundCalculator(payload)

Emergency fund calculator

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.EmergencyFundCalculator(); // EmergencyFundCalculator | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.emergencyFundCalculator(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EmergencyFundCalculator**](EmergencyFundCalculator.md)|  | 

### Return type

[**EmergencyFundResponse**](EmergencyFundResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventStudy"></a>
# **eventStudy**
> EventStudyResponse eventStudy(payload)

Event study

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.EventStudy(); // EventStudy | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.eventStudy(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EventStudy**](EventStudy.md)|  | 

### Return type

[**EventStudyResponse**](EventStudyResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="financialHealthCheck"></a>
# **financialHealthCheck**
> HealthCheckResponse financialHealthCheck(payload)

Financial health check

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.FinancialHealthCheck(); // FinancialHealthCheck | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.financialHealthCheck(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**FinancialHealthCheck**](FinancialHealthCheck.md)|  | 

### Return type

[**HealthCheckResponse**](HealthCheckResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalAccumulationAllocation"></a>
# **goalAccumulationAllocation**
> GoalAllocationResponse goalAccumulationAllocation(payload)

Goal accumulation allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.GoalAccumulationAllocation(); // GoalAccumulationAllocation | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalAccumulationAllocation(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalAccumulationAllocation**](GoalAccumulationAllocation.md)|  | 

### Return type

[**GoalAllocationResponse**](GoalAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalAccumulationRecommendation"></a>
# **goalAccumulationRecommendation**
> GoalRecommendationResponse goalAccumulationRecommendation(payload)

Goal accumulation recommendation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.GoalAccumulationRecommendation(); // GoalAccumulationRecommendation | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalAccumulationRecommendation(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalAccumulationRecommendation**](GoalAccumulationRecommendation.md)|  | 

### Return type

[**GoalRecommendationResponse**](GoalRecommendationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalAccumulationStatus"></a>
# **goalAccumulationStatus**
> GoalStatusResponse goalAccumulationStatus(payload)

Goal accumulation status

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.GoalAccumulationStatus(); // GoalAccumulationStatus | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalAccumulationStatus(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalAccumulationStatus**](GoalAccumulationStatus.md)|  | 

### Return type

[**GoalStatusResponse**](GoalStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationAllocation"></a>
# **goalDecumulationAllocation**
> GoalAllocationResponse goalDecumulationAllocation(payload)

Goal decumulation allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.GoalDecumulationAllocation(); // GoalDecumulationAllocation | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalDecumulationAllocation(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalDecumulationAllocation**](GoalDecumulationAllocation.md)|  | 

### Return type

[**GoalAllocationResponse**](GoalAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationRecommendation"></a>
# **goalDecumulationRecommendation**
> GoalRecommendationResponse goalDecumulationRecommendation(payload)

Goal decumulation recommendation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.GoalDecumulationRecommendation(); // GoalDecumulationRecommendation | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalDecumulationRecommendation(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalDecumulationRecommendation**](GoalDecumulationRecommendation.md)|  | 

### Return type

[**GoalRecommendationResponse**](GoalRecommendationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationStatus"></a>
# **goalDecumulationStatus**
> GoalStatusResponse goalDecumulationStatus(payload)

Goal decumulation status

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.GoalDecumulationStatus(); // GoalDecumulationStatus | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalDecumulationStatus(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalDecumulationStatus**](GoalDecumulationStatus.md)|  | 

### Return type

[**GoalStatusResponse**](GoalStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lifeInsuranceNeedsCalculator"></a>
# **lifeInsuranceNeedsCalculator**
> LifeInsuranceNeedsResponse lifeInsuranceNeedsCalculator(payload)

Life insurance needs calculator

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.LifeInsuranceCalculator(); // LifeInsuranceCalculator | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.lifeInsuranceNeedsCalculator(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**LifeInsuranceCalculator**](LifeInsuranceCalculator.md)|  | 

### Return type

[**LifeInsuranceNeedsResponse**](LifeInsuranceNeedsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modelBacktest"></a>
# **modelBacktest**
> BacktestResponse modelBacktest(payload)

Model backtest

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.Backtest(); // Backtest | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.modelBacktest(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Backtest**](Backtest.md)|  | 

### Return type

[**BacktestResponse**](BacktestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="monteCarlo"></a>
# **monteCarlo**
> MonteCarloResponse monteCarlo(payload)

Monte Carlo

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.MonteCarlo(); // MonteCarlo | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.monteCarlo(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MonteCarlo**](MonteCarlo.md)|  | 

### Return type

[**MonteCarloResponse**](MonteCarloResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorDownPayment"></a>
# **mortgageCalculatorDownPayment**
> MortgageCalculatorDownpaymentResponse mortgageCalculatorDownPayment(payload)

Mortgage calculator - down payment

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.MortgageCalculatorDownPayment(); // MortgageCalculatorDownPayment | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.mortgageCalculatorDownPayment(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MortgageCalculatorDownPayment**](MortgageCalculatorDownPayment.md)|  | 

### Return type

[**MortgageCalculatorDownpaymentResponse**](MortgageCalculatorDownpaymentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorHomePrice"></a>
# **mortgageCalculatorHomePrice**
> MortgageCalculatorHomepriceResponse mortgageCalculatorHomePrice(payload)

Mortgage calculator - home price

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.MortgageCalculatorHomePrice(); // MortgageCalculatorHomePrice | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.mortgageCalculatorHomePrice(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MortgageCalculatorHomePrice**](MortgageCalculatorHomePrice.md)|  | 

### Return type

[**MortgageCalculatorHomepriceResponse**](MortgageCalculatorHomepriceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorPeriodicPayment"></a>
# **mortgageCalculatorPeriodicPayment**
> MortgageCalculatorPeriodicpaymentResponse mortgageCalculatorPeriodicPayment(payload)

Mortgage calculator - periodic payment

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.MortgageCalculatorPeriodicPayment(); // MortgageCalculatorPeriodicPayment | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.mortgageCalculatorPeriodicPayment(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MortgageCalculatorPeriodicPayment**](MortgageCalculatorPeriodicPayment.md)|  | 

### Return type

[**MortgageCalculatorPeriodicpaymentResponse**](MortgageCalculatorPeriodicpaymentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mvo"></a>
# **mvo**
> MvoResponse mvo(payload)

Mean-variance optimization

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.OptConfigPortfolio(); // OptConfigPortfolio | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.mvo(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**OptConfigPortfolio**](OptConfigPortfolio.md)|  | 

### Return type

[**MvoResponse**](MvoResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="portfolioDiversificationScore"></a>
# **portfolioDiversificationScore**
> PfloDiversificationScoreResponse portfolioDiversificationScore(payload)

Portfolio diversification score

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.DiversificationScore(); // DiversificationScore | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.portfolioDiversificationScore(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**DiversificationScore**](DiversificationScore.md)|  | 

### Return type

[**PfloDiversificationScoreResponse**](PfloDiversificationScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="portfolioOptimizationScore"></a>
# **portfolioOptimizationScore**
> PfloOptimizationScoreResponse portfolioOptimizationScore(payload)

Portfolio optimization score

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.OptimizationScore(); // OptimizationScore | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.portfolioOptimizationScore(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**OptimizationScore**](OptimizationScore.md)|  | 

### Return type

[**PfloOptimizationScoreResponse**](PfloOptimizationScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="portfolioWhatIf"></a>
# **portfolioWhatIf**
> PortfolioWhatIfResponse portfolioWhatIf(payload)

Portfolio what-if

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.WhatIfPortfolio(); // WhatIfPortfolio | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.portfolioWhatIf(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WhatIfPortfolio**](WhatIfPortfolio.md)|  | 

### Return type

[**PortfolioWhatIfResponse**](PortfolioWhatIfResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorDepositAmount"></a>
# **purchaseCalculatorDepositAmount**
> PurchaseCalculatorDepositamountResponse purchaseCalculatorDepositAmount(payload)

Purchase calculator - deposit amount

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.PurchaseCalculatorDepositAmount(); // PurchaseCalculatorDepositAmount | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.purchaseCalculatorDepositAmount(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PurchaseCalculatorDepositAmount**](PurchaseCalculatorDepositAmount.md)|  | 

### Return type

[**PurchaseCalculatorDepositamountResponse**](PurchaseCalculatorDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorHorizon"></a>
# **purchaseCalculatorHorizon**
> PurchaseCalculatorPurchasehorizonResponse purchaseCalculatorHorizon(payload)

Purchase calculator - horizon

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.PurchaseCalculatorHorizon(); // PurchaseCalculatorHorizon | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.purchaseCalculatorHorizon(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PurchaseCalculatorHorizon**](PurchaseCalculatorHorizon.md)|  | 

### Return type

[**PurchaseCalculatorPurchasehorizonResponse**](PurchaseCalculatorPurchasehorizonResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorPurchaseAmount"></a>
# **purchaseCalculatorPurchaseAmount**
> PurchaseCalculatorPurchaseamountResponse purchaseCalculatorPurchaseAmount(payload)

Purchase calculator - purchase amount

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.PurchaseCalculatorAmount(); // PurchaseCalculatorAmount | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.purchaseCalculatorPurchaseAmount(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PurchaseCalculatorAmount**](PurchaseCalculatorAmount.md)|  | 

### Return type

[**PurchaseCalculatorPurchaseamountResponse**](PurchaseCalculatorPurchaseamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rebalancingSignal"></a>
# **rebalancingSignal**
> RebalanceResponse rebalancingSignal(payload)

Rebalancing

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.Rebalance(); // Rebalance | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.rebalancingSignal(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Rebalance**](Rebalance.md)|  | 

### Return type

[**RebalanceResponse**](RebalanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorDepositAmount"></a>
# **retirementCalculatorDepositAmount**
> RetirementCalculatorDepositamountResponse retirementCalculatorDepositAmount(payload)

Retirement calculator - deposit amount

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.RetirementCalculatorDepositAmount(); // RetirementCalculatorDepositAmount | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retirementCalculatorDepositAmount(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RetirementCalculatorDepositAmount**](RetirementCalculatorDepositAmount.md)|  | 

### Return type

[**RetirementCalculatorDepositamountResponse**](RetirementCalculatorDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorExpenses"></a>
# **retirementCalculatorExpenses**
> RetirementCalculatorExpensesResponse retirementCalculatorExpenses(payload)

Retirement calculator - expenses

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.RetirementCalculatorExpenses(); // RetirementCalculatorExpenses | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retirementCalculatorExpenses(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RetirementCalculatorExpenses**](RetirementCalculatorExpenses.md)|  | 

### Return type

[**RetirementCalculatorExpensesResponse**](RetirementCalculatorExpensesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorPercentCovered"></a>
# **retirementCalculatorPercentCovered**
> RetirementCalculatorPctcoveredResponse retirementCalculatorPercentCovered(payload)

Retirement calculator - percent of costs covered

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.RetirementCalculatorPercentCovered(); // RetirementCalculatorPercentCovered | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retirementCalculatorPercentCovered(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RetirementCalculatorPercentCovered**](RetirementCalculatorPercentCovered.md)|  | 

### Return type

[**RetirementCalculatorPctcoveredResponse**](RetirementCalculatorPctcoveredResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="riskAllocation"></a>
# **riskAllocation**
> RiskAllocationResponse riskAllocation(payload)

Risk allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.RiskAllocation(); // RiskAllocation | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.riskAllocation(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RiskAllocation**](RiskAllocation.md)|  | 

### Return type

[**RiskAllocationResponse**](RiskAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="riskScore"></a>
# **riskScore**
> RiskScoreResponse riskScore(payload)

Risk score

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.RiskScore(); // RiskScore | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.riskScore(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RiskScore**](RiskScore.md)|  | 

### Return type

[**RiskScoreResponse**](RiskScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="savingsCalculator"></a>
# **savingsCalculator**
> SavingsCalculatorResponse savingsCalculator(payload)

Savings calculator

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.SimpleSavingsCalculator(); // SimpleSavingsCalculator | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.savingsCalculator(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SimpleSavingsCalculator**](SimpleSavingsCalculator.md)|  | 

### Return type

[**SavingsCalculatorResponse**](SavingsCalculatorResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scenarioAnalysis"></a>
# **scenarioAnalysis**
> ScenarioAnalysisResponse scenarioAnalysis(payload)

Scenario analysis

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.ScenarioAnalysis(); // ScenarioAnalysis | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.scenarioAnalysis(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ScenarioAnalysis**](ScenarioAnalysis.md)|  | 

### Return type

[**ScenarioAnalysisResponse**](ScenarioAnalysisResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sensitivityAnalysis"></a>
# **sensitivityAnalysis**
> SensitivityAnalysisResponse sensitivityAnalysis(payload)

Sensitivity analysis

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.ProtonApi();

var payload = new atom_api.SensitivityAnalysis(); // SensitivityAnalysis | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.sensitivityAnalysis(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SensitivityAnalysis**](SensitivityAnalysis.md)|  | 

### Return type

[**SensitivityAnalysisResponse**](SensitivityAnalysisResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

