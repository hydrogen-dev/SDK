# Hydrogen Electron API

Hydrogen Electron API
- API version: 1.3.1
  - Build date: 24-11-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/electron/v1

## Requirements

1. Python 2.7 and 3.4+

## Installation

### Install via Pip

```
pip install hydrogen-electron-api==1.3.1
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com//.git`)

Then import the package:
```python
import electron_api 
```

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL
Create an configuration object(**Configuration**) with environment parameter.

**Sandbox URL**

configuration = electron_api.Configuration(Environment.SANDBOX)

**Production URL**

configuration = electron_api.Configuration(Environment.PRODUCTION)

### Sample Code
Now you are ready to execute the following Python code:

```python
import electron_api
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import electron_api
from electron_api.rest import ApiException
from electron_api.environment import Environment
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = electron_api.Configuration(Environment.PRODUCTION)

# create an instance of the API class
api_instance = electron_api.AuthApi(electron_api.ApiClient(configuration))

api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = electron_api.ACHApi(electron_api.ApiClient(configuration))
ach_card_request_co = electron_api.AchCardRequestCO() # AchCardRequestCO | achCardRequestCO

try:
    # Fund card
    api_response = api_instance.fund_card_using_post(ach_card_request_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->fund_card_using_post: %s\n" % e)

```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*