# Hydrogen Integration API
The Hydrogen Integration API
- API version: 1.3.0
  - Build date: 05-20-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/integration/v1

## Requirements

PHP 5.5 and later

## Installation

### Install via Composer

Please run `composer require hydrogenplatform/integration`


## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL

1. Go to Configuration file located under lib folder.
2. Search for $host and change/verify the URL according to the environment.  

**Sandbox Base URL**
https://sandbox.hydrogenplatform.com/integration/v1

**Production Base URL**
https://api.hydrogenplatform.com/integration/v1

### Sample Code
Now you are ready to execute the following PHP code:

```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\integration\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\integration\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\integration\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\integration\Api\ACHApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$nucleus_funding_id = "nucleus_funding_id_example"; // string | nucleus_funding_id

try {
    $result = $apiInstance->cancelAchTransferUsingDelete($nucleus_funding_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ACHApi->cancelAchTransferUsingDelete: ', $e->getMessage(), PHP_EOL;
}

?>
```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*