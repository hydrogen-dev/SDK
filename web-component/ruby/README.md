# Hydrogen Web Components

For more information, please visit [https://www.hydrogenplatform.com/no-code](https://www.hydrogenplatform.com/no-code)

## Requirements
1. Ruby 2.7+

## Installation

### Install the gem locally:

```shell
gem install ./app_token_api-1.0.0.gem
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

#### Setup Authorization
AdminApi.configure do |config|
  # Use one of the below method to generate oauth token        
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

#### Get App Token

api_instance = AdminApi::AppTokenApi.new

app_name = ['app_name_example'] # Array<String> | app_name

begin
  #getAppToken
  result = api_instance.get_app_token_using_get(app_name)
  p result
rescue AdminApi::ApiError => e
  puts "Exception when calling AppTokenApi->get_app_token_using_get: #{e}"
end

```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
