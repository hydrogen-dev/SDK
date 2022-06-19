# Hydrogen Web Components - JS SDK

Installing this SDK in your project will give you the following functionality:

- (OAuth 2.0 Authorization)(https://www.hydrogenplatform.com/docs/nucleus/v1/#OAuth-2-0-Authorization) of Web Components and WebViews
- Generate [App Tokens](https://www.hydrogenplatform.com/docs/web-component/v1/#App-Tokens) to authenticate Web Components and WebViews
- Retrieve Nucleus [Client](https://www.hydrogenplatform.com/docs/nucleus/v1/#Client) and [Card](https://www.hydrogenplatform.com/docs/nucleus/v1/#Card) data used in Web Component and WebView embed codes as data attributes

For more information, please visit our documentation [https://www.hydrogenplatform.com/docs/web-component/v1](https://www.hydrogenplatform.com/docs/web-component/v1)

## Requirements

Building the API client library requires:
1. [Node.js](https://nodejs.org/)

## Installation

### Local Installation

First install the dependencies by changing into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

Finally, switch to the directory you want to use your app_token_api from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

You should now be able to `require('@hydrogenplatform/app_token_api')` in javascript files from the directory you ran the last command above from.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error: Cannot resolve module." You should disable AMD loader if you encounter this error. Add/merge the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL.

### Base URL
Follow steps to verify the base URL path:

1. Go to ApiClient file located under src folder.
2. Search for **this.basePath** and change/verify the URL according to the environment.

**Base URL**
https://api.hydrogenplatform.com

### Parameters

| Parameter |  Description |
| ----------------------- | ----------------------------------------------- |
| `attribMap`| This parameter is used to set the Attributes |
| `appName` | This parameter is used to set the list of apps you are retrieving a token for, such as `card_balance` or `card_issuance` |
| `authType` | This parameter is used to set the OAuth grant type. Valid values are `client_credentials`, `password_credentials`, `client_token`  |
| `basePath` | This parameter is used to set the base path. Valid values are `https://api.hydrogenplatform.com` |
| `accessToken` | This parameter is used to pass in the JWT Access Token if you authenticate outside of the SDK |
| `clientToken` | This parameter is used to pass in the JWT Access Token for Custom Client Token apps if you authenticate outside of the SDK |
| `clientId` | This parameter is used to set your OAuth `client_id` to authenticate if you don't pass in the JWT Access Token |
| `clientSecret` | This Parameter is used to set your OAuth `client_secret` to authenticate if you don't pass in the JWT Access Token |
| `username` | This parameter is used to pass in the Nucleus Client `username` of the user to authenticate `password` grant apps |
| `password` |  This parameter is used to pass in the Nucleus Client `password` of the user to authenticate `password` grant apps |
| `isEmbed` | This parameter is used to return an HTML embed code in the response, including all passed data attributes. Valid values are `true` or `false` |

### Sample Code
Now you are ready to execute the following Javascript code:

```javascript
const dotenv = require('dotenv').config();
const HydrogenAppTokenApi = require('@hydrogenplatform/app_token_api');

var callback = function(error, data, response) {
    if (error) {
      console.error(error);
    } else {
      console.log('API called successfully. Returned data: ' + JSON.stringify(data));
    }
  };

let attribMap = [{"name" : "public-key", "value" : "xxxx"},{"name" : "client-id", "value" : "xxxx9"}]

let appTokenConfig = {};
appTokenConfig['attribMap'] = attribMap
appTokenConfig['appName'] = [{'app_name':'card_balance'}]
appTokenConfig['authType'] = "password_credentials"
appTokenConfig['basePath'] = "https://api.hydrogenplatform.com/"
appTokenConfig['accessToken'] = "xxxx";
appTokenConfig['clientToken'] = "xxxx";
appTokenConfig['clientId'] = "xxxx"
appTokenConfig['clientSecret'] = "xxxx"
appTokenConfig['username'] = "xxxx"
appTokenConfig['password'] = "xxxx"
appTokenConfig['isEmbed'] = true

var api = new HydrogenAppTokenApi.AutoGenerateAppTokenApi()
api.getAppTokenUsingGET(appTokenConfig = appTokenConfig, callback);
```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com
