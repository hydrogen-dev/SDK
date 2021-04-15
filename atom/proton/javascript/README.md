# Hydrogen Proton API

Hydrogen Proton API
- API version: 1.8.0
  - Build date: 12-03-2020

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/proton/v1

## Requirements

Building the API client library requires:
1. [Node.js](https://nodejs.org/)

## Installation

### Install via NPM

```shell
npm install hydrogen_proton_api --save
```

### Install Locally

To use the library locally without pulling from the remote npm registry, first install the dependencies by changing 
into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

Finally, switch to the directory you want to use your hydrogen_proton_api from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

You should now be able to `require('hydrogen_proton_api')` in javascript files from the directory you ran the last 
command above from.

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL
1. Go to ApiClient file located under src folder.
2. Search for basePath, adminPath and change/verify the URL according to the environment.

**Sandbox Base URL**
https://sandbox.hydrogenplatform.com/proton/v1

**Production Base URL**
https://api.hydrogenplatform.com/proton/v1

### Sample Code
Now you are ready to execute the following Javascript code:

```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');

var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenProtonApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createAnnuityCalculatorAccumulationHorizon();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createAnnuityCalculatorAccumulationHorizon = () => {
    var api = new HydrogenProtonApi.AnnuitiesApi()
    var annuityCalculatorAccumulationHorizonRequest = new HydrogenProtonApi.AnnuityCalculatorAccumulationHorizonRequest(); // {AnnuityCalculatorAccumulationHorizonRequest} Request payload for Annuity Calculator - Accumulation Horizon
    api.annuityCalculatorAccumulationHorizon(annuityCalculatorAccumulationHorizonRequest, callback);
}
```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
