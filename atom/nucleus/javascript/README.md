# Hydrogen Nucleus API

Hydrogen Nucleus API
- API version: 1.9.1
  - Build date: 09-06-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/nucleus/v1

## Requirements

Building the API client library requires:
1. [Node.js](https://nodejs.org/)

## Installation

### Install via NPM

```shell
npm i @hydrogenplatform/hydrogen_nucleus_api --save
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

Finally, switch to the directory you want to use your hydrogen_nucleus_api from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

You should now be able to `require('@hydrogenplatform/hydrogen_nucleus_api')` in javascript files from the directory you ran the last 
command above from.

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL

1. Create an object of AuthApi and update the environment using setEnvironment method.

**Sandbox Base URL**
var api = new HydrogenNucleusApi.AuthApi();
api.setEnvironment(defaultClient.SANDBOX);
**Production Base URL**
var api = new HydrogenNucleusApi.AuthApi();
api.setEnvironment(defaultClient.PRODUCTION);

```javascript
var HydrogenNucleusApi = require('@hydrogenplatform/hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();
api.setEnvironment(defaultClient.PRODUCTION);

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createAccountAllocationMapping();
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
    'Client-Token' : 'Client-Token'
}, tokenGenerationCallback);


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createAccountAllocationMapping = () => {
    var api = new HydrogenNucleusApi.AccountApi()
    var allocRequest = new HydrogenNucleusApi.AccountAllocationMapping(); // {AccountAllocationMapping} allocRequest
    api.createAccountAllocationMappingUsingPost(allocRequest, callback);
}
```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
