# Hydrogen Proton API

Hydrogen Proton API
- API version: 1.9.2
  - Build date: 01-07-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/proton/v1

## Requirements

1. Python 2.7 and 3.4+

## Installation

### Install via Pip

```
pip install hydrogen-proton-api==1.9.2
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com//.git`)

Then import the package:
```python
import proton_api 
```

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL

Create an configuration object(**Configuration**) with environment parameter.

**Sandbox URL**

configuration = proton_api.Configuration(Environment.SANDBOX)

**Production URL**

configuration = proton_api.Configuration(Environment.PRODUCTION)

### Sample Code
Now you are ready to execute the following Python code:


```python
from __future__ import print_function
import time
import proton_api
from proton_api.environment import Environment
from proton_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = proton_api.Configuration(Environment.PRODUCTION)

# create an instance of the API class
api_instance = proton_api.AuthApi(proton_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = proton_api.AnnuitiesApi(proton_api.ApiClient(configuration))
annuity_calculator_accumulation_horizon_request = proton_api.AnnuityCalculatorAccumulationHorizonRequest() # AnnuityCalculatorAccumulationHorizonRequest | Request payload for Annuity Calculator - Accumulation Horizon

try:
    # Annuity Calculator - Accumulation Horizon
    api_response = api_instance.annuity_calculator_accumulation_horizon(annuity_calculator_accumulation_horizon_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnuitiesApi->annuity_calculator_accumulation_horizon: %s\n" % e)

```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
