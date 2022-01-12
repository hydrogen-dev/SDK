# Hydrogen Electron API
Hydrogen Electron API
- API version: 1.3.1
  - Build date: 27-12-2021
For more information, please visit [https://www.hydrogenplatform.com/contact](https://www.hydrogenplatform.com/contact)

## Documentation

https://www.hydrogenplatform.com/docs/electron/v1

## Requirements
1. Ruby 2.7+

## Installation

### Install via Ruby Gems

Install the gem:

```shell
gem install hydrogen-electron-api
```

The add this to the Gemfile:

    gem 'hydrogen-electron-api', '~> 1.3', '>= 1.3.1'


## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:
### Base URL


Create an object of **Environment** and use the **set_environment** method to update the environment.

**Sandbox URL**

environment_config = ElectronApi::Environment.new

environment_config.set_environment(environment_config.SANDBOX)

**Production URL**

environment_config = ElectronApi::Environment.new

environment_config.set_environment(environment_config.PRODUCTION)

```ruby
# Load the gem
require 'electron_api'
environment_config = ElectronApi::Environment.new
environment_config.set_environment(environment_config.PRODUCTION)

# Setup authorization
ElectronApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = ElectronApi::ACHApi.new

ach_card_request_co = ElectronApi::AchCardRequestCO.new # AchCardRequestCO | achCardRequestCO


begin
  #Fund card
  result = api_instance.fund_card_using_post(ach_card_request_co)
  p result
rescue ElectronApi::ApiError => e
  puts "Exception when calling ACHApi->fund_card_using_post: #{e}"
end

```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*