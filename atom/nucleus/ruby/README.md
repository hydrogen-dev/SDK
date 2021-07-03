# Hydrogen Nucleus API

Hydrogen Nucleus API
- API version: 1.9.2
  - Build date: 01-07-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/nucleus/v1

## Requirements
1. Ruby 2.7+

## Installation

### Install via Ruby Gems

Install the gem:

```shell
gem install nucleus_api
```

The add this to the Gemfile:

    gem 'nucleus_api', '~> 1.9'

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL

1. Create an object of Environment and use the set_environment method to update the environment.
**Sandbox URL**
environment_config = NucleusApi::Environment.new
environment_config.set_environment(environment_config.SANDBOX)
**Production URL**
environment_config = NucleusApi::Environment.new
environment_config.set_environment(environment_config.PRODUCTION)

```ruby
# Load the gem
require 'nucleus_api'
environment_config = NucleusApi::Environment.new
environment_config.set_environment(environment_config.PRODUCTION)
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end
api_instance = NucleusApi::AccountApi.new
alloc_request = NucleusApi::AccountAllocationMapping.new # AccountAllocationMapping | allocRequest
begin
  #Create an account allocation
  result = api_instance.create_account_allocation_mapping_using_post(alloc_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AccountApi->create_account_allocation_mapping_using_post: #{e}"
end
```
## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
