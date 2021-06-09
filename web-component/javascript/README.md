# Hydrogen Web Components

For more information, please visit [https://www.hydrogenplatform.com/no-code](https://www.hydrogenplatform.com/no-code)

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

You should now be able to `require('app_token_api')` in javascript files from the directory you ran the last
command above from.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

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

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL
Follow steps to verify the base URL path:

1. Go to ApiClient file located under src folder.
2. Search for **this.basePath** and change/verify the URL according to the environment.

**Sandbox Base URL**
https://sandbox.hydrogenplatform.com/admin/v1

**Production Base URL**
https://api.hydrogenplatform.com/admin/v1

### Sample Code
Now you are ready to execute the following Javascript code:

```javascript
const dotenv = require('dotenv').config();
const HydrogenAppTokenApi = require('app_token_api');

var callback = function(error, data, response) {
    if (error) {
      console.error(error);
    } else {
      console.log('API called successfully. Returned data: ' + JSON.stringify(data));
    }
  };

let attribMap = [{"name" : "public-key", "value" : "xxxx"},{"name" : "client-id", "value" : "xxxx9"}]

const userAuthToken = "xxxx";

let appTokenConfig = {};
appTokenConfig['appName'] = [{'app_name':'pfm_cash_flow', 'auth_type':'password_credentials'}]
appTokenConfig['userAccessToken'] = userAuthToken
appTokenConfig['attribMap'] = attribMap
appTokenConfig['isEmbed'] = true
appTokenConfig['isCredsPassed'] = true
appTokenConfig['clientId'] = "xxxx"
appTokenConfig['clientSecret'] = "xxxx"
appTokenConfig['username'] = "xxxx"
appTokenConfig['password'] = "xxxx"
appTokenConfig['basePath'] = "xxxx"

var api = new HydrogenAppTokenApi.AutoGenerateAppTokenApi()
api.getAppTokenUsingGET(appTokenConfig = appTokenConfig, callback);
```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
