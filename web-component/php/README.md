# Hydrogen Web Components - PHP SDK

Installing this SDK in your project will give you the following functionality:

- [OAuth 2.0 Authorization](https://www.hydrogenplatform.com/docs/nucleus/v1/#OAuth-2-0-Authorization) of Web Components and WebViews
- Generate [App Tokens](https://www.hydrogenplatform.com/docs/web-component/v1/#App-Tokens) to authenticate Web Components and WebViews
- Retrieve Nucleus [Client](https://www.hydrogenplatform.com/docs/nucleus/v1/#Client) and [Card](https://www.hydrogenplatform.com/docs/nucleus/v1/#Card) data used in Web Component and WebView embed codes as data attributes

For more information, please visit our documentation [https://www.hydrogenplatform.com/docs/web-component/v1](https://www.hydrogenplatform.com/docs/web-component/v1)

## Requirements
PHP 5.5 and later

## Installation

### Manual Installation

Download the files and include `autoload.php`:

```php
    require_once('/path/to/SwaggerClient-php/vendor/autoload.php');
```

## Tests

To run the unit tests:

```
composer install
./vendor/bin/phpunit
```

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL.

### Base URL
Follow steps to verify the base URL path:

1. Go to Configuration file located under lib folder.
2. Search for $host and change/verify the URL according to the environment.

**Base URL**
https://api.hydrogenplatform.com

### Parameters

| Parameter |  Description |
| ----------------------- | ----------------------------------------------- |
| `attribMap`| This parameter is used to set the Attributes |
| `appName` | This parameter is used to set the list of apps you are retrieving a token for, such as `card_balance` or `card_issuance` |
| `authType` | This parameter is used to set the OAuth grant type. Valid values are `client_credentials`, `password_credentials`, `client_token`  |
| `basePath` | This parameter is used to set the base path. Valid values may be `\com\hydrogen\admin\Environment::PRODUCTION` (https://api.hydrogenplatform.com) |
| `accessToken` | This parameter is used to pass in the JWT Access Token if you authenticate outside of the SDK |
| `clientToken` | This parameter is used to pass in the JWT Access Token for Custom Client Token apps if you authenticate outside of the SDK |
| `clientId` | This parameter is used to set your OAuth `client_id` to authenticate if you don't pass in the JWT Access Token |
| `clientSecret` | This Parameter is used to set your OAuth `client_secret` to authenticate if you don't pass in the JWT Access Token |
| `username` | This parameter is used to pass in the Nucleus Client `username` of the user to authenticate `password` grant apps |
| `password` |  This parameter is used to pass in the Nucleus Client `password` of the user to authenticate `password` grant apps |
| `isEmbed` | This parameter is used to return an HTML embed code in the response, including all passed data attributes. Valid values are `true` or `false` |

### Sample Code
Now you are ready to execute the following PHP code:

```php
<?php
require_once('./vendor/autoload.php');

$apiInstance = new com\hydrogen\admin\Api\AutoGenerateAppTokenApi(
    new GuzzleHttp\Client()
);

$attribMap = array (
    array(
        "name" => "public-key",
        "value" => "****"
    ),
    array(
        "name" => "client-id",
        "value" => "****"
    ),
    array(
        "name" => "card-id",
        "value" => "****"
    )
);

$app_token_config['attribMap'] = $attribMap;
$app_token_config['appName'] = array('app_name'=>'card_balance');
$app_token_config['authType'] = "password_credentials";
$app_token_config['basePath'] = \com\hydrogen\admin\Environment::PRODUCTION;
$app_token_config['accessToken'] = '****';
$app_token_config['clientToken'] = '****';
$app_token_config['clientId'] = '****';
$app_token_config['clientSecret'] = '****';
$app_token_config['username'] = "****";
$app_token_config['password'] = "****";
$app_token_config['isEmbed'] = true;

try {
    $result = $apiInstance->getAppTokenUsingGET($app_token_config);
    print_r($result);
} catch (Exception $e) {
    print_r($e->getMessage());
}
?>
```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com
