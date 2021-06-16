# Hydrogen Web Components

For more information, please visit [https://www.hydrogenplatform.com/no-code](https://www.hydrogenplatform.com/no-code)

## Requirements
1. Ruby 2.7+

## Installation

### Install the gem locally:

```shell
gem build app_token_api.gemspec
gem install app_token_api-1.0.0.gem
```
(for development, run `gem install --dev ./app_token_api-1.0.0.gem` to install the development dependencies)

Finally add this to the Gemfile:

    gem 'app_token_api', '~> 1.0.0'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL
Follow steps to verify the base URL path:

1. Go to configuration file located under lib folder.
2. Search for @host and change/verify the URL according to the environment.

**Sandbox Base URL**
https://sandbox.hydrogenplatform.com/admin/v1

**Production Base URL**
https://api.hydrogenplatform.com/admin/v1

### Sample Code
Now you are ready to execute the following Ruby code:

```ruby
# Load the gem
require 'admin_api'

#### Get App Token

api_instance = AdminApi::AutoGenerateAppTokenApi.new

attribMap = [{"name" => "public-key", "value" => "xxxx"},{"name" => "client-id", "value" => "xxxx"}, {"name" => "card-id", "value" => "xxxx"}]

appTokenConfig = {}
appTokenConfig['appName'] = [{'app_name':'pfm_cash_flow', 'auth_type':'password_credentials'}]
appTokenConfig['userAccessToken'] = userAuthToken
appTokenConfig['attribMap'] = attribMap
appTokenConfig['isEmbed'] = TRUE
appTokenConfig['isCredsPassed'] = TRUE
appTokenConfig['clientId'] = "xxxx"
appTokenConfig['clientSecret'] = "xxxx"
appTokenConfig['username'] = "xxxx"
appTokenConfig['password'] = "xxxx"
appTokenConfig['basePath'] = "https://api.hydrogenplatform.com/admin/v1"


begin
  #getAppToken
  result = api_instance.get_app_token_using_get(appTokenConfig)
  p result
rescue AdminApi::ApiError => e
  puts "Exception when calling AppTokenApi->get_app_token_using_get: #{e}"
end

```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
