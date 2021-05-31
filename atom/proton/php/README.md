# Hydrogen Proton API

Hydrogen Proton API
- API version: 1.9.0
  - Build date: 04-15-2021
For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/proton/v1

## Requirements

1. PHP 5.5 and later

## Installation

### Install via Composer

Please run `composer require hydrogenplatform/proton`


## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL

1. Go to Configuration file located under lib folder.
2. Search for $host and change/verify the URL according to the environment.  

**Sandbox Base URL**
https://sandbox.hydrogenplatform.com/proton/v1

**Production Base URL**
https://api.hydrogenplatform.com/proton/v1

### Sample Code
Now you are ready to execute the following PHP code:

```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\proton\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\proton\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\proton\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\proton\Api\AnnuitiesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$annuity_calculator_accumulation_horizon_request = new \com\hydrogen\proton\Model\AnnuityCalculatorAccumulationHorizonRequest(); // \com\hydrogen\proton\Model\AnnuityCalculatorAccumulationHorizonRequest | Request payload for Annuity Calculator - Accumulation Horizon

try {
    $result = $apiInstance->annuityCalculatorAccumulationHorizon($annuity_calculator_accumulation_horizon_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnnuitiesApi->annuityCalculatorAccumulationHorizon: ', $e->getMessage(), PHP_EOL;
}

?>
```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*