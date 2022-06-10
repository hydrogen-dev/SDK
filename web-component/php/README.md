# Hydrogen Web Components

For more information, please visit [https://www.hydrogenplatform.com/no-code](https://www.hydrogenplatform.com/no-code)

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

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL
Follow steps to verify the base URL path:

1. Go to Configuration file located under lib folder.
2.  Search for $host and change/verify the URL according to the environment.

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


$appTokenConfig['appName'] = array(array('app_name'=>'pfm_cash_flow', 'auth_type'=>'password_credentials'))
$appTokenConfig['basePath'] = \com\hydrogen\admin\Environment::PRODUCTION;
$appTokenConfig['userAccessToken'] = '';
$appTokenConfig['attribMap'] = $attribMap;
$appTokenConfig['isEmbed'] = true;
$appTokenConfig['isCredsPassed'] = true;
$appTokenConfig['clientId'] = '****';
$appTokenConfig['clientSecret'] = '****';
$appTokenConfig['username'] = "****";
$appTokenConfig['password'] = "****";

try {
    $result = $apiInstance->getAppTokenUsingGET($appTokenConfig);
    print_r($result);
} catch (Exception $e) {
    print_r($e->getMessage());
}

?>
```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
