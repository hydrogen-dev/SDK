<?php

namespace com\hydrogen\nucleus;

use GuzzleHttp\Client;
use GuzzleHttp\Exception\ClientException;
use GuzzleHttp\Exception\RequestException;

class AuthApiClient
{
    private static $defaultConfiguration;
    protected $authorization = 'Authorization';
    protected $grantTypeKey = 'grant_type';
    protected $clientCredential = 'client_credentials';
    protected $password = 'password';
    protected $username = 'username';
    protected $message = 'message';
    protected $applicationJsonValue = 'application/json';
    protected $requestPostMethod = 'POST';
    protected $headers = 'headers';
    protected $accept = 'Content-type';
    protected $query = 'query';
    private $authUri = '';
    private $clientTokenUri = '';
    private $client_token = 'Client-Token';

    public static function getDefaultConfiguration($url)
    {
        if (self::$defaultConfiguration === null) {
            self::$defaultConfiguration = new AuthApiClient($url);
        }
        return self::$defaultConfiguration;
    }

    function __construct($url)
    {
        Configuration::getDefaultConfiguration()->setHost($url);
        $uri = parse_url(Configuration::getDefaultConfiguration()->getHost());
        $this->authUri = $uri['scheme'] . "://" . $uri['host'] . '/authorization/v1/oauth/token';
        $this->clientTokenUri = $uri['scheme'] . "://" . $uri['host'] . '/authorization/v1/client-token';
    }

    function createClientTokenCredential($clientId, $clientSecret, $clientToken) {
        $baseCred = base64_encode($clientId . ':' . $clientSecret);
        $client = new Client();
        try {
            $params = [
                $this->headers => [
                    $this->accept => $this->applicationJsonValue,
                    $this->authorization => 'Basic ' . $baseCred,
                    $this->client_token => 'Bearer ' . $clientToken
                ]
            ];
            $res = $client->request(
                $this->requestPostMethod,
                $this->clientTokenUri,
                $params
            );
            $jsonDecode = json_decode($res->getBody()->__toString());
            $accessToken = $jsonDecode->access_token;
            $this->accessToken = $accessToken;
            return Configuration::getDefaultConfiguration()->setAccessToken($accessToken);
        } catch (ClientException $e) {
            throw new ApiException($e->getMessage(), $e->getCode(), null, null);
        } catch (RequestException $e) {
            throw new ApiException($e->getMessage(), $e->getCode(), null, null);
        }
    }

    function createClientCredential($clientId, $clientSecret)
    {
        $baseCred = base64_encode($clientId . ':' . $clientSecret);
        $client = new Client();
        $params = [
            $this->headers => [
                $this->accept => $this->applicationJsonValue,
                $this->authorization => 'Basic ' . $baseCred
            ],
            $this->query => [
                $this->grantTypeKey => $this->clientCredential
            ]
        ];
        try {
            $res = $client->request(
                $this->requestPostMethod,
                $this->authUri,
                $params
            );
            $jsonDecode = json_decode($res->getBody()->__toString());
            $this->accessToken = $jsonDecode->access_token;
            return Configuration::getDefaultConfiguration()->setAccessToken($this->accessToken);
        } catch (ClientException $e) {
            throw new ApiException($e->getMessage(), $e->getCode(), null, null);
        } catch (RequestException $e) {
            throw new ApiException($e->getMessage(), $e->getCode(), null, null);
        }
    }

    function createPasswordCredential($clientId, $clientSecret, $userName, $password)
    {
        $baseCred = base64_encode($clientId.':'. $clientSecret);
        $client = new Client();
        $params = [
            $this->headers => [
                $this->accept => $this->applicationJsonValue,
                $this->authorization => 'Basic ' . $baseCred
            ],
            $this->query => [
                $this->grantTypeKey => $this->clientCredential,
                $this->username => $userName,
                $this->password => $password
                ]
        ];
        try {
            $res = $client->request(
                $this->requestPostMethod,
                $this->authUri,
                $params
            );
            $jsonDecode = json_decode($res->getBody()->__toString());
            $this->accessToken = $jsonDecode->access_token;
            return Configuration::getDefaultConfiguration()->setAccessToken($this->accessToken);
        } catch (ClientException $e) {
            throw new ApiException($e->getMessage(), $e->getCode(), null, null);
        } catch (RequestException $e) {
            throw new ApiException($e->getMessage(), $e->getCode(), null, null);
        }
    }

    function setAccessToken($token) {
        return Configuration::getDefaultConfiguration()->setAccessToken($token);
    }
}

?>
