# Hydrogen Proton API

Hydrogen Proton API
- API version: 1.9.1
  - Build date: 01-07-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/proton/v1

## Requirements
1. Ruby 2.7+

## Installation

### Install via Ruby Gems

Install the gem:

```shell
gem install hydrogen-proton-api
```

The add this to the Gemfile:

    gem 'hydrogen-proton-api', '~> 1.9.1'

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL

1. Create an object of Environment and use the set_environment method to update the environment.
**Sandbox URL**
environment_config = ProtonApi::Environment.new
environment_config.set_environment(environment_config.SANDBOX)
**Production URL**
environment_config = ProtonApi::Environment.new
environment_config.set_environment(environment_config.PRODUCTION)

```ruby
# Load the gem
require 'proton_api'
environment_config = ProtonApi::Environment.new
environment_config.set_environment(environment_config.PRODUCTION)
# Setup authorization
ProtonApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end
api_instance = ProtonApi::AnnuitiesApi.new

annuity_calculator_accumulation_horizon_request = ProtonApi::AnnuityCalculatorAccumulationHorizonRequest.new # AnnuityCalculatorAccumulationHorizonRequest | Request payload for Annuity Calculator - Accumulation Horizon
begin
  #Annuity Calculator - Accumulation Horizon
  result = api_instance.annuity_calculator_accumulation_horizon(annuity_calculator_accumulation_horizon_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling AnnuitiesApi->annuity_calculator_accumulation_horizon: #{e}"
end

```
## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*