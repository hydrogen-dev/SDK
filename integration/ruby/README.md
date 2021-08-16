# Hydrogen Integration API
Hydrogen Integration API
- API version: 1.3.1
  - Build date: 16-07-2021
For more information, please visit [https://www.hydrogenplatform.com/contact](https://www.hydrogenplatform.com/contact)

## Documentation

https://www.hydrogenplatform.com/docs/integration/v1

## Requirements
1. Ruby 2.7+

## Installation

### Install via Ruby Gems

Install the gem:

```shell
gem install hydrogen-integration-api
```

The add this to the Gemfile:

    gem 'hydrogen-integration-api', '~> 1.3', '>= 1.3.1'


## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:
### Base URL


Create an object of **Environment** and use the **set_environment** method to update the environment.

**Sandbox URL**

environment_config = IntegrationApi::Environment.new

environment_config.set_environment(environment_config.SANDBOX)

**Production URL**

environment_config = IntegrationApi::Environment.new

environment_config.set_environment(environment_config.PRODUCTION)

```ruby
# Load the gem
require 'integration_api'
environment_config = IntegrationApi::Environment.new
environment_config.set_environment(environment_config.PRODUCTION)

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end


api_instance = IntegrationApi::ACHApi.new

nucleus_funding_id = 'nucleus_funding_id_example' # String | nucleus_funding_id


begin
  #Cancel the ACH transfer
  result = api_instance.cancel_ach_transfer_using_delete(nucleus_funding_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->cancel_ach_transfer_using_delete: #{e}"
end

```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*