# Hydrogen Web Components

For more information, please visit [https://www.hydrogenplatform.com/no-code](https://www.hydrogenplatform.com/no-code)

## Requirements
1. Ruby 2.7+

## Installation

### Install the gem locally:

```shell
gem build app_token_api.gemspec
gem install app_token_api-1.0.2.gem
```
(for development, run `gem install --dev ./app_token_api-1.0.2.gem` to install the development dependencies)

Finally add this to the Gemfile:

    gem 'app_token_api', '~> 1.0.2'

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
https://sandbox.hydrogenplatform.com

**Production Base URL**
https://api.hydrogenplatform.com

### Parameters Definition

| Parameter |  Description |
| ----------------------- | ----------------------------------------------- |
| `clientId` | This parameter is used to set the Client ID |
| `clientSecret` | This Parameter is used to set the Client Secret |
| `username` | This parameter is used to set the Username |
| `password` | This parameter is used to set the Password |
| `userAccessToken` | This parameter is used to set the User Access Token  |
| `appName` | This parameter is used to set the list of App Names |
| `authType` | This parameter is used to set the Auth type |
| `basePath` | This parameter is used to set the base path | 
| `attribMap`| This parameter is used to set the Attributes |
| `isEmbed` | This parameter accepts boolean values, you can pass `true` or `false` |

### Sample Code
Now you are ready to execute the following Ruby code:

```ruby
# Load the gem
require 'admin_api'

#### Get App Token

api_instance = AdminApi::AutoGenerateAppTokenApi.new

attribMap = [{"name" => "public-key", "value" => "xxxx"},{"name" => "client-id", "value" => "xxxx"}, {"name" => "card-id", "value" => "xxxx"}]

appTokenConfig = {}
appTokenConfig['appName'] = [{'app_name':'card_balance'}]
appTokenConfig['accessToken'] = userAuthToken
appTokenConfig['clientToken'] = clientToken
appTokenConfig['attribMap'] = attribMap
appTokenConfig['isEmbed'] = TRUE
appTokenConfig['clientId'] = "xxxx"
appTokenConfig['clientSecret'] = "xxxx"
appTokenConfig['username'] = "xxxx"
appTokenConfig['password'] = "xxxx"
appTokenConfig['basePath'] = "https://api.hydrogenplatform.com"
appTokenConfig['authType'] = "client_credentials"

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
