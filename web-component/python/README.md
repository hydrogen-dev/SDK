# Hydrogen Web Components

For more information, please visit [https://www.hydrogenplatform.com/no-code](https://www.hydrogenplatform.com/no-code)

## Requirements
Python 2.7 and 3.4+

## Installation

Download directly from Github

Then import the package:
```python
import admin_api
```

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL
Follow steps to verify the base URL path:

1. Go to configuration.py file located under admin_api folder.
2. Search for self.host and change/verify the URL according to the environment.

**Sandbox Base URL**
https://sandbox.hydrogenplatform.com

**Production Base URL**
https://api.hydrogenplatform.com

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

userAuthToken = "xxxx"

appTokenConfig = {}
appTokenConfig['appName'] = [{'app_name':'pfm_cash_flow', 'auth_type':'password_credentials'}]
appTokenConfig['userAccessToken'] = userAuthToken
appTokenConfig['attribMap'] = attribMap
appTokenConfig['isEmbed'] = True
appTokenConfig['isCredsPassed'] = True
appTokenConfig['clientId'] = "xxxx"
appTokenConfig['clientSecret'] = "xxxx"
appTokenConfig['username'] = "xxxx"
appTokenConfig['password'] = "xxxx"
appTokenConfig['authType'] = "client_credentials"
appTokenConfig['basePath'] = "https://api.hydrogenplatform.com"

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

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
