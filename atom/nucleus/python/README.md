# Hydrogen Nucleus API

Hydrogen Nucleus API
- API version: 1.9.5
  - Build date: 01-07-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/nucleus/v1

## Requirements

1. Python 2.7 and 3.4+

## Installation

### Install via Pip

```
pip install hydrogen-nucleus-api==1.9.5
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com//.git`)

Then import the package:
```python
import nucleus_api 
```

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL

Create an configuration object(**Configuration**) with environment parameter.

**Sandbox URL**

configuration = nucleus_api.Configuration(Environment.SANDBOX)

**Production URL**

configuration = nucleus_api.Configuration(Environment.PRODUCTION)

### Sample Code
Now you are ready to execute the following Python code:

```python
from __future__ import print_function
import time
from nucleus_api.environment import Environment
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration(Environment.PRODUCTION)

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.AccountApi(nucleus_api.ApiClient(configuration))
alloc_request = nucleus_api.AccountAllocationMapping() # AccountAllocationMapping | allocRequest

try:
    # Create an account allocation
    api_response = api_instance.create_account_allocation_mapping_using_post(alloc_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->create_account_allocation_mapping_using_post: %s\n" % e)

```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
