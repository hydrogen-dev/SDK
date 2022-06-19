# Hydrogen Web Components - Ruby SDK

Installing this SDK in your project will give you the following functionality:

- (OAuth 2.0 Authorization)(https://www.hydrogenplatform.com/docs/nucleus/v1/#OAuth-2-0-Authorization) of Web Components and WebViews
- Generate [App Tokens](https://www.hydrogenplatform.com/docs/web-component/v1/#App-Tokens) to authenticate Web Components and WebViews
- Retrieve Nucleus [Client](https://www.hydrogenplatform.com/docs/nucleus/v1/#Client) and [Card](https://www.hydrogenplatform.com/docs/nucleus/v1/#Card) data used in Web Component and WebView embed codes as data attributes

For more information, please visit our documentation [https://www.hydrogenplatform.com/docs/web-component/v1](https://www.hydrogenplatform.com/docs/web-component/v1)

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

**Base URL**
https://api.hydrogenplatform.com

### Parameters Definition

| Parameter |  Description |
| ----------------------- | ----------------------------------------------- |
| `attribMap`| This parameter is used to set the Attributes |
| `appName` | This parameter is used to set the list of apps you are retrieving a token for, such as `card_balance` or `card_issuance` |
| `basePath` | This parameter is used to set the base path. Valid values are `https://api.hydrogenplatform.com` |
| `authType` | This parameter is used to set the OAuth grant type. Valid values are `client_credentials`, `password_credentials`, `client_token`  |
| `accessToken` | This parameter is used to pass in the JWT Access Token if you authenticate outside of the SDK |
| `clientToken` | This parameter is used to pass in the JWT Access Token for Custom Client Token apps if you authenticate outside of the SDK |
| `clientId` | This parameter is used to set your OAuth `client_id` to authenticate if you don't pass in the JWT Access Token |
| `clientSecret` |  This Parameter is used to set your OAuth `client_secret` to authenticate if you don't pass in the JWT Access Token |
| `username` | This parameter is used to pass in the Nucleus Client `username` of the user to authenticate `password` grant apps |
| `password` |  This parameter is used to pass in the Nucleus Client `password` of the user to authenticate `password` grant apps |
| `isEmbed` | This parameter is used to return an HTML embed code in the response, including all passed data attributes. Valid values are `true` or `false` |

### Sample Code
Now you are ready to execute the following Ruby code:

```ruby
# Load the gem
require 'admin_api'

#### Get App Token

api_instance = AdminApi::AutoGenerateAppTokenApi.new

attribMap = [{"name" => "public-key", "value" => "xxxx"},{"name" => "client-id", "value" => "xxxx"}, {"name" => "card-id", "value" => "xxxx"}]

appTokenConfig = {}
appTokenConfig['attribMap'] = attribMap
appTokenConfig['appName'] = [{'app_name':'card_balance'}]
appTokenConfig['basePath'] = "https://api.hydrogenplatform.com"
appTokenConfig['authType'] = "password_credentials"
appTokenConfig['clientId'] = "xxxx"
appTokenConfig['clientSecret'] = "xxxx"
appTokenConfig['accessToken'] = "xxxx"
appTokenConfig['clientToken'] = "xxxx"
appTokenConfig['username'] = "xxxx"
appTokenConfig['password'] = "xxxx"
appTokenConfig['isEmbed'] = TRUE

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
