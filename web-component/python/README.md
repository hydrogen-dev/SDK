# Hydrogen Web Components - Python SDK

Installing this SDK in your project will give you the following functionality:

- [OAuth 2.0 Authorization](https://www.hydrogenplatform.com/docs/nucleus/v1/#OAuth-2-0-Authorization) of Web Components and WebViews
- Generate [App Tokens](https://www.hydrogenplatform.com/docs/web-component/v1/#App-Tokens) to authenticate Web Components and WebViews
- Retrieve Nucleus [Client](https://www.hydrogenplatform.com/docs/nucleus/v1/#Client) and [Card](https://www.hydrogenplatform.com/docs/nucleus/v1/#Card) data used in Web Component and WebView embed codes as data attributes

For more information, please visit our documentation [https://www.hydrogenplatform.com/docs/web-component/v1](https://www.hydrogenplatform.com/docs/web-component/v1)

## Requirements
Python 2.7 and 3.4+

## Installation

Download directly from Github

Run setup.py

Then import the package:
```python
import admin_api
```

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL.

### Base URL
Follow steps to verify the base URL path:

1. Go to configuration.py file located under admin_api folder.
2. Search for self.host and change/verify the URL according to the environment.

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
| `clientSecret` |  This Parameter is used to set your OAuth `client_secret` to authenticate if you don't pass in the JWT Access Token |
| `username` | This parameter is used to pass in the Nucleus Client `username` of the user to authenticate `password` grant apps |
| `password` |  This parameter is used to pass in the Nucleus Client `password` of the user to authenticate `password` grant apps |
| `isEmbed` | This parameter is used to return an HTML embed code in the response, including all passed data attributes. Valid values are `true` or `false` |

### Sample Code
Now you are ready to execute the following Python code:

```python
from __future__ import absolute_import
from __future__ import print_function
import time
import admin_api
from admin_api.rest import ApiException
from pprint import pprint

attribMap = [{"name" : "public-key", "value" : "public_key"},{"name" : "client-id", "value" : "xxxx"}, {"name" : "card-id", "value" : "xxxx"}]

appTokenConfig = {}
appTokenConfig['attribMap'] = attribMap
appTokenConfig['appName'] = [{'app_name':'card_balance'}]
appTokenConfig['authType'] = "password_credentials"
appTokenConfig['basePath'] = "https://api.hydrogenplatform.com"
appTokenConfig['clientId'] = "xxxx"
appTokenConfig['clientSecret'] = "xxxx"
appTokenConfig['username'] = "xxxx"
appTokenConfig['password'] = "xxxx"
appTokenConfig['accessToken'] = "xxxx"
appTokenConfig['clientToken'] = "xxxx"
appTokenConfig['isEmbed'] = True

#pprint(appTokenConfig)

try:
    api_instance = admin_api.AutoGenerateAppTokenApi()
    # getAppToken
    api_response = api_instance.get_app_token_using_get(appTokenConfig)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppTokenApi->get_app_token_using_get: %s\n" % e)
```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com
