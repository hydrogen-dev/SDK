<?php
/**
 * AuditLogApi
 * PHP version 5
 *
 * @category Class
 * @package  com\hydrogen\integration
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Hydrogen Integration API
 *
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.14
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace com\hydrogen\integration\Api;

use GuzzleHttp\Client;
use GuzzleHttp\ClientInterface;
use GuzzleHttp\Exception\RequestException;
use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\RequestOptions;
use com\hydrogen\integration\ApiException;
use com\hydrogen\integration\Configuration;
use com\hydrogen\integration\HeaderSelector;
use com\hydrogen\integration\ObjectSerializer;

/**
 * AuditLogApi Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\integration
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AuditLogApi
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
        $this->config = $config ?: new Configuration();
        $this->headerSelector = $selector ?: new HeaderSelector();
    }

    /**
     * @return Configuration
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation getAuditLogAllUsingGet
     *
     * Gel all audit log
     *
     * @param  bool $ascending ascending (optional, default to false)
     * @param  \DateTime $end_date end_date (optional, default to null)
     * @param  string $event event (optional)
     * @param  string $integration_type integration_type (optional)
     * @param  bool $is_request is_request (optional, default to false)
     * @param  string $nucleus_client_id nucleus_client_id (optional)
     * @param  string $order_by order_by (optional, default to update_date)
     * @param  int $page page (optional, default to 0)
     * @param  string $request_type request_type (optional)
     * @param  int $size size (optional, default to 25)
     * @param  \DateTime $start_date start_date (optional, default to null)
     * @param  string $vendor_name vendor_name (optional)
     *
     * @throws \com\hydrogen\integration\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \com\hydrogen\integration\Model\PageObject_
     */
    public function getAuditLogAllUsingGet($ascending = 'false', $end_date = 'null', $event = null, $integration_type = null, $is_request = 'false', $nucleus_client_id = null, $order_by = 'update_date', $page = '0', $request_type = null, $size = '25', $start_date = 'null', $vendor_name = null)
    {
        list($response) = $this->getAuditLogAllUsingGetWithHttpInfo($ascending, $end_date, $event, $integration_type, $is_request, $nucleus_client_id, $order_by, $page, $request_type, $size, $start_date, $vendor_name);
        return $response;
    }

    /**
     * Operation getAuditLogAllUsingGetWithHttpInfo
     *
     * Gel all audit log
     *
     * @param  bool $ascending ascending (optional, default to false)
     * @param  \DateTime $end_date end_date (optional, default to null)
     * @param  string $event event (optional)
     * @param  string $integration_type integration_type (optional)
     * @param  bool $is_request is_request (optional, default to false)
     * @param  string $nucleus_client_id nucleus_client_id (optional)
     * @param  string $order_by order_by (optional, default to update_date)
     * @param  int $page page (optional, default to 0)
     * @param  string $request_type request_type (optional)
     * @param  int $size size (optional, default to 25)
     * @param  \DateTime $start_date start_date (optional, default to null)
     * @param  string $vendor_name vendor_name (optional)
     *
     * @throws \com\hydrogen\integration\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \com\hydrogen\integration\Model\PageObject_, HTTP status code, HTTP response headers (array of strings)
     */
    public function getAuditLogAllUsingGetWithHttpInfo($ascending = 'false', $end_date = 'null', $event = null, $integration_type = null, $is_request = 'false', $nucleus_client_id = null, $order_by = 'update_date', $page = '0', $request_type = null, $size = '25', $start_date = 'null', $vendor_name = null)
    {
        $returnType = '\com\hydrogen\integration\Model\PageObject_';
        $request = $this->getAuditLogAllUsingGetRequest($ascending, $end_date, $event, $integration_type, $is_request, $nucleus_client_id, $order_by, $page, $request_type, $size, $start_date, $vendor_name);

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
                        '\com\hydrogen\integration\Model\PageObject_',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getAuditLogAllUsingGetAsync
     *
     * Gel all audit log
     *
     * @param  bool $ascending ascending (optional, default to false)
     * @param  \DateTime $end_date end_date (optional, default to null)
     * @param  string $event event (optional)
     * @param  string $integration_type integration_type (optional)
     * @param  bool $is_request is_request (optional, default to false)
     * @param  string $nucleus_client_id nucleus_client_id (optional)
     * @param  string $order_by order_by (optional, default to update_date)
     * @param  int $page page (optional, default to 0)
     * @param  string $request_type request_type (optional)
     * @param  int $size size (optional, default to 25)
     * @param  \DateTime $start_date start_date (optional, default to null)
     * @param  string $vendor_name vendor_name (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAuditLogAllUsingGetAsync($ascending = 'false', $end_date = 'null', $event = null, $integration_type = null, $is_request = 'false', $nucleus_client_id = null, $order_by = 'update_date', $page = '0', $request_type = null, $size = '25', $start_date = 'null', $vendor_name = null)
    {
        return $this->getAuditLogAllUsingGetAsyncWithHttpInfo($ascending, $end_date, $event, $integration_type, $is_request, $nucleus_client_id, $order_by, $page, $request_type, $size, $start_date, $vendor_name)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getAuditLogAllUsingGetAsyncWithHttpInfo
     *
     * Gel all audit log
     *
     * @param  bool $ascending ascending (optional, default to false)
     * @param  \DateTime $end_date end_date (optional, default to null)
     * @param  string $event event (optional)
     * @param  string $integration_type integration_type (optional)
     * @param  bool $is_request is_request (optional, default to false)
     * @param  string $nucleus_client_id nucleus_client_id (optional)
     * @param  string $order_by order_by (optional, default to update_date)
     * @param  int $page page (optional, default to 0)
     * @param  string $request_type request_type (optional)
     * @param  int $size size (optional, default to 25)
     * @param  \DateTime $start_date start_date (optional, default to null)
     * @param  string $vendor_name vendor_name (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getAuditLogAllUsingGetAsyncWithHttpInfo($ascending = 'false', $end_date = 'null', $event = null, $integration_type = null, $is_request = 'false', $nucleus_client_id = null, $order_by = 'update_date', $page = '0', $request_type = null, $size = '25', $start_date = 'null', $vendor_name = null)
    {
        $returnType = '\com\hydrogen\integration\Model\PageObject_';
        $request = $this->getAuditLogAllUsingGetRequest($ascending, $end_date, $event, $integration_type, $is_request, $nucleus_client_id, $order_by, $page, $request_type, $size, $start_date, $vendor_name);

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

    /**
     * Create request for operation 'getAuditLogAllUsingGet'
     *
     * @param  bool $ascending ascending (optional, default to false)
     * @param  \DateTime $end_date end_date (optional, default to null)
     * @param  string $event event (optional)
     * @param  string $integration_type integration_type (optional)
     * @param  bool $is_request is_request (optional, default to false)
     * @param  string $nucleus_client_id nucleus_client_id (optional)
     * @param  string $order_by order_by (optional, default to update_date)
     * @param  int $page page (optional, default to 0)
     * @param  string $request_type request_type (optional)
     * @param  int $size size (optional, default to 25)
     * @param  \DateTime $start_date start_date (optional, default to null)
     * @param  string $vendor_name vendor_name (optional)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getAuditLogAllUsingGetRequest($ascending = 'false', $end_date = 'null', $event = null, $integration_type = null, $is_request = 'false', $nucleus_client_id = null, $order_by = 'update_date', $page = '0', $request_type = null, $size = '25', $start_date = 'null', $vendor_name = null)
    {

        $resourcePath = '/audit_log';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($ascending !== null) {
            $queryParams['ascending'] = ObjectSerializer::toQueryValue($ascending);
        }
        // query params
        if ($end_date !== null) {
            $queryParams['end_date'] = ObjectSerializer::toQueryValue($end_date);
        }
        // query params
        if ($event !== null) {
            $queryParams['event'] = ObjectSerializer::toQueryValue($event);
        }
        // query params
        if ($integration_type !== null) {
            $queryParams['integration_type'] = ObjectSerializer::toQueryValue($integration_type);
        }
        // query params
        if ($is_request !== null) {
            $queryParams['is_request'] = ObjectSerializer::toQueryValue($is_request);
        }
        // query params
        if ($nucleus_client_id !== null) {
            $queryParams['nucleus_client_id'] = ObjectSerializer::toQueryValue($nucleus_client_id);
        }
        // query params
        if ($order_by !== null) {
            $queryParams['order_by'] = ObjectSerializer::toQueryValue($order_by);
        }
        // query params
        if ($page !== null) {
            $queryParams['page'] = ObjectSerializer::toQueryValue($page);
        }
        // query params
        if ($request_type !== null) {
            $queryParams['request_type'] = ObjectSerializer::toQueryValue($request_type);
        }
        // query params
        if ($size !== null) {
            $queryParams['size'] = ObjectSerializer::toQueryValue($size);
        }
        // query params
        if ($start_date !== null) {
            $queryParams['start_date'] = ObjectSerializer::toQueryValue($start_date);
        }
        // query params
        if ($vendor_name !== null) {
            $queryParams['vendor_name'] = ObjectSerializer::toQueryValue($vendor_name);
        }


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
