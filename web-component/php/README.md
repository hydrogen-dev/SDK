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


$app_token_config['appName'] = array('app_name'=>'card_balance');
$app_token_config['authType'] = "password_credentials";
$app_token_config['basePath'] = \com\hydrogen\admin\Environment::PRODUCTION;
$app_token_config['accessToken'] = '';
$app_token_config['clientToken'] = '';
$app_token_config['attribMap'] = $attribMap;
$app_token_config['isEmbed'] = true;
$app_token_config['clientId'] = '****';
$app_token_config['clientSecret'] = '****';
$app_token_config['username'] = "****";
$app_token_config['password'] = "****";

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

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
