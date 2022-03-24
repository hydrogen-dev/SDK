<?php
/**
 * AppTokenApi
 * PHP version 5
 *
 * @category Class
 * @package  com\hydrogen\admin
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Hydrogen Admin API
 *
 * The Hydrogen Admin API
 *
 * OpenAPI spec version: 1.0.2
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.15
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace com\hydrogen\admin\Api;

use GuzzleHttp\Client;
use GuzzleHttp\ClientInterface;
use GuzzleHttp\Exception\RequestException;
use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\RequestOptions;
use com\hydrogen\admin\ApiException;
use com\hydrogen\admin\Configuration;
use com\hydrogen\admin\HeaderSelector;
use com\hydrogen\admin\ObjectSerializer;
//use com\hydrogen\admin\AuthApiClient;

/**
 * AutoGenerateAppTokenApi Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\admin
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AutoGenerateAppTokenApi
{
    /**
     * @var ClientInterface
     */
    protected $client;

    /**
     * @var Configuration
     */
    protected $config;

    /**
     * @var HeaderSelector
     */
    protected $headerSelector;

    protected $auth_client_api;

    /**
     * @param ClientInterface $client
     * @param Configuration   $config
     * @param HeaderSelector  $selector
     */
    public function __construct(
        ClientInterface $client = null,
        Configuration $config = null,
        HeaderSelector $selector = null
    ) {
        $this->client = $client ?: new Client();
        $this->config = $config ?: Configuration::getDefaultConfiguration();
        $this->headerSelector = $selector ?: new HeaderSelector();
        //$this->auth_client_api = new AuthApiClient();
    }

    /**
     * @return Configuration
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation getAppTokenUsingGET
     *
     * getAppToken
     *
     * @param  string[] $app_name app_name (required)
     *
     * @throws \com\hydrogen\admin\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \com\hydrogen\admin\Model\AppToken[]
     */
    public function getAppTokenUsingGET($app_token_config)
    {
        $template  = "<tag app-token='##app_token##' ##attrib_map##></tag>";

        if ($app_token_config['basePath'] === null) {
            throw new Error("Missing the required parameter 'basePath' when calling getAppTokenUsingGET");
        }

        $this->config->setHost($app_token_config['basePath']);
        Configuration::getDefaultConfiguration()->setHost($app_token_config['basePath']);


        $finalAttribMap = array();
        if($app_token_config['attribMap'] !==null){
            foreach ($app_token_config['attribMap'] as $row) {
                $data = (object) $row;
                array_push($finalAttribMap, $data->name . "='".$data->value."'");
            }
        }

        $client_credential_token = \com\hydrogen\admin\AuthApiClient::getDefaultConfiguration()->createClientCredential($app_token_config['clientId'],$app_token_config['clientSecret']);
        $this->config->setAccessToken($client_credential_token->getAccessToken());
        $applicationMap = array();
        $response = [];
        if($app_token_config['appName']){
            foreach ($app_token_config['appName'] as $row) {
              $item = [];
              $app = $row;
                if($app['auth_type'] && strtolower($app['auth_type']) === "client_credentials"){
                    $this->config->setAccessToken($client_credential_token->getAccessToken());

                }else if($app['auth_type'] && strtolower($app['auth_type']) === "password_credentials") {
                  if(isset($app_token_config['accessToken']))
                    $this->config->setAccessToken($app_token_config['accessToken']);
                  if($app_token_config['accessToken'] === null){
                    $passwordTokenData = \com\hydrogen\admin\AuthApiClient::getDefaultConfiguration()->createPasswordCredential($app_token_config['clientId'],$app_token_config['clientSecret'], $app_token_config['username'], $app_token_config['password']);
                    $this->config->setAccessToken($passwordTokenData->getAccessToken());
                  }
                }else if ($app['auth_type'] && strtolower($app['auth_type']) === "client_token_credentials") {
                    \com\hydrogen\admin\AuthApiClient::getDefaultConfiguration()->createClientTokenCredential($app_token_config['clientId'],$app_token_config['clientSecret'], $app_token_config['clientToken']);
                }
                $appTokenData =  $this->getAppTokenUsingGETWithHttpInfo($app_token_config, $app['app_name']);
                

                foreach ($appTokenData[0] as $appTokenRow) {
                    
                    $appTokenValue = isset($appTokenRow)? $appTokenRow['app_token'] : '';
                    $tagValue = str_replace("_", '-', strtolower($app['app_name']));
                    $fillTemplateValue = str_replace("tag", $tagValue, $template);
                    $fillTemplateValue = str_replace("##app_token##", $appTokenValue, $fillTemplateValue);
                    $fillTemplateValue = str_replace("##attrib_map##", isset($finalAttribMap) ?  implode(' ', $finalAttribMap): '', $fillTemplateValue);
                    
                    $item[$app['app_name']] = $appTokenValue;
                    if($app_token_config['isEmbed']){
                      $item[$app['app_name']] = $fillTemplateValue;
                    }
                    array_push($response, $item);
                }
            }
          }
        return $response;
    }

    /**
     * Operation getAppTokenUsingGETWithHttpInfo
     *
     * getAppToken
     *
     * @param  string[] $app_name app_name (required)
     *
     * @throws \com\hydrogen\admin\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \com\hydrogen\admin\Model\AppToken[], HTTP status code, HTTP response headers (array of strings)
     */
    public function getAppTokenUsingGETWithHttpInfo($app_token_config, $app)
    {
        $returnType = '\com\hydrogen\admin\Model\AppToken[]';
        $request = $this->getAppTokenUsingGETRequest($app_token_config, $app);
       
        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? $e->getResponse()->getBody()->getContents() : null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    $response->getBody()
                );
            }

            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
                if ($returnType !== 'string') {
                    $content = json_decode($content);
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\com\hydrogen\admin\Model\AppToken[]',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getAppTokenUsingGETAsync
     *
     * getAppToken
     *
     * @param  string[] $app_name app_name (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAppTokenUsingGETAsync($app_name)
    {
        return $this->getAppTokenUsingGETAsyncWithHttpInfo($app_name)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getAppTokenUsingGETAsyncWithHttpInfo
     *
     * getAppToken
     *
     * @param  string[] $app_name app_name (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAppTokenUsingGETAsyncWithHttpInfo($app_name)
    {
        $returnType = '\com\hydrogen\admin\Model\AppToken[]';
        $request = $this->getAppTokenUsingGETRequest($app_name);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                        if ($returnType !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        $response->getBody()
                    );
                }
            );
    }

    protected function getWhiteLabelUsingGETRequest($app_token_config)
    {
       
        $resourcePath = '/component/v1/white_label/application?size=10000';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

    
        // body params
        $_tempBody = null;

        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                ['*/*']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['*/*'],
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            $httpBody = $_tempBody;
            
            if($headers['Content-Type'] === 'application/json') {
                // \stdClass has no __toString(), so we should encode it manually
                if ($httpBody instanceof \stdClass) {
                    $httpBody = \GuzzleHttp\json_encode($httpBody);
                }
                // array has no __toString(), so we should encode it manually
                if(is_array($httpBody)) {
                    $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($httpBody));
                }
            }
        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($formParams);

            } else {
                // for HTTP post (form)
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams);
            }
        }

        // this endpoint requires OAuth (access token)
        if ($this->config->getAccessToken() !== null) {
            $headers['Authorization'] = 'Bearer ' . $this->config->getAccessToken();
        }

        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        return new Request(
            'GET',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }


    /**
     * Create request for operation 'getAppTokenUsingGET'
     *
     * @param  string[] $app_name app_name (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getAppTokenUsingGETRequest($app_token_config, $app)
    {
        // verify the required parameter 'app_name' is set
        if ($app_token_config === null || (is_array($app_token_config['appName']) && count($app_token_config['appName']) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $app_name when calling getAppTokenUsingGET'
            );
        }

        $resourcePath = '/component/v1/app_token';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        $queryParams['app_name'] = $app;

        // body params
        $_tempBody = null;

        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                ['*/*']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['*/*'],
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            $httpBody = $_tempBody;
            
            if($headers['Content-Type'] === 'application/json') {
                // \stdClass has no __toString(), so we should encode it manually
                if ($httpBody instanceof \stdClass) {
                    $httpBody = \GuzzleHttp\json_encode($httpBody);
                }
                // array has no __toString(), so we should encode it manually
                if(is_array($httpBody)) {
                    $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($httpBody));
                }
            }
        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($formParams);

            } else {
                // for HTTP post (form)
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams);
            }
        }

        // this endpoint requires OAuth (access token)
        if ($this->config->getAccessToken() !== null) {
            $headers['Authorization'] = 'Bearer ' . $this->config->getAccessToken();
        }

        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        return new Request(
            'GET',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Create http client option
     *
     * @throws \RuntimeException on file opening failure
     * @return array of http client options
     */
    protected function createHttpClientOption()
    {
        $options = [];
        if ($this->config->getDebug()) {
            $options[RequestOptions::DEBUG] = fopen($this->config->getDebugFile(), 'a');
            if (!$options[RequestOptions::DEBUG]) {
                throw new \RuntimeException('Failed to open the debug file: ' . $this->config->getDebugFile());
            }
        }

        return $options;
    }
}
