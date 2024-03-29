<?php
/**
 * CustomerAnalysisRequest
 *
 * PHP version 5
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Hydrogen Proton API
 *
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.19
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace com\hydrogen\proton\Model;

use \ArrayAccess;
use \com\hydrogen\proton\ObjectSerializer;

/**
 * CustomerAnalysisRequest Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class CustomerAnalysisRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'customerAnalysisRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'currency_code' => 'string',
        'client_id' => 'string',
        'response_limit' => 'int',
        'end_date' => '\DateTime',
        'benchmark_end_date' => '\DateTime',
        'currency_conversion' => 'string',
        'start_date' => '\DateTime',
        'customer_ids' => 'string[]',
        'business_id' => 'string',
        'benchmark_start_date' => '\DateTime',
        'only_active_customers' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'currency_code' => null,
        'client_id' => 'uuid',
        'response_limit' => 'int32',
        'end_date' => 'date',
        'benchmark_end_date' => 'date',
        'currency_conversion' => null,
        'start_date' => 'date',
        'customer_ids' => 'uuid',
        'business_id' => 'uuid',
        'benchmark_start_date' => 'date',
        'only_active_customers' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'currency_code' => 'currency_code',
        'client_id' => 'client_id',
        'response_limit' => 'response_limit',
        'end_date' => 'end_date',
        'benchmark_end_date' => 'benchmark_end_date',
        'currency_conversion' => 'currency_conversion',
        'start_date' => 'start_date',
        'customer_ids' => 'customer_ids',
        'business_id' => 'business_id',
        'benchmark_start_date' => 'benchmark_start_date',
        'only_active_customers' => 'only_active_customers'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'currency_code' => 'setCurrencyCode',
        'client_id' => 'setClientId',
        'response_limit' => 'setResponseLimit',
        'end_date' => 'setEndDate',
        'benchmark_end_date' => 'setBenchmarkEndDate',
        'currency_conversion' => 'setCurrencyConversion',
        'start_date' => 'setStartDate',
        'customer_ids' => 'setCustomerIds',
        'business_id' => 'setBusinessId',
        'benchmark_start_date' => 'setBenchmarkStartDate',
        'only_active_customers' => 'setOnlyActiveCustomers'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'currency_code' => 'getCurrencyCode',
        'client_id' => 'getClientId',
        'response_limit' => 'getResponseLimit',
        'end_date' => 'getEndDate',
        'benchmark_end_date' => 'getBenchmarkEndDate',
        'currency_conversion' => 'getCurrencyConversion',
        'start_date' => 'getStartDate',
        'customer_ids' => 'getCustomerIds',
        'business_id' => 'getBusinessId',
        'benchmark_start_date' => 'getBenchmarkStartDate',
        'only_active_customers' => 'getOnlyActiveCustomers'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['currency_code'] = isset($data['currency_code']) ? $data['currency_code'] : null;
        $this->container['client_id'] = isset($data['client_id']) ? $data['client_id'] : null;
        $this->container['response_limit'] = isset($data['response_limit']) ? $data['response_limit'] : 10;
        $this->container['end_date'] = isset($data['end_date']) ? $data['end_date'] : null;
        $this->container['benchmark_end_date'] = isset($data['benchmark_end_date']) ? $data['benchmark_end_date'] : null;
        $this->container['currency_conversion'] = isset($data['currency_conversion']) ? $data['currency_conversion'] : null;
        $this->container['start_date'] = isset($data['start_date']) ? $data['start_date'] : null;
        $this->container['customer_ids'] = isset($data['customer_ids']) ? $data['customer_ids'] : null;
        $this->container['business_id'] = isset($data['business_id']) ? $data['business_id'] : null;
        $this->container['benchmark_start_date'] = isset($data['benchmark_start_date']) ? $data['benchmark_start_date'] : null;
        $this->container['only_active_customers'] = isset($data['only_active_customers']) ? $data['only_active_customers'] : false;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['response_limit']) && ($this->container['response_limit'] < 1)) {
            $invalidProperties[] = "invalid value for 'response_limit', must be bigger than or equal to 1.";
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets currency_code
     *
     * @return string
     */
    public function getCurrencyCode()
    {
        return $this->container['currency_code'];
    }

    /**
     * Sets currency_code
     *
     * @param string $currency_code currency_code
     *
     * @return $this
     */
    public function setCurrencyCode($currency_code)
    {
        $this->container['currency_code'] = $currency_code;

        return $this;
    }

    /**
     * Gets client_id
     *
     * @return string
     */
    public function getClientId()
    {
        return $this->container['client_id'];
    }

    /**
     * Sets client_id
     *
     * @param string $client_id client_id
     *
     * @return $this
     */
    public function setClientId($client_id)
    {
        $this->container['client_id'] = $client_id;

        return $this;
    }

    /**
     * Gets response_limit
     *
     * @return int
     */
    public function getResponseLimit()
    {
        return $this->container['response_limit'];
    }

    /**
     * Sets response_limit
     *
     * @param int $response_limit response_limit
     *
     * @return $this
     */
    public function setResponseLimit($response_limit)
    {

        if (!is_null($response_limit) && ($response_limit < 1)) {
            throw new \InvalidArgumentException('invalid value for $response_limit when calling CustomerAnalysisRequest., must be bigger than or equal to 1.');
        }

        $this->container['response_limit'] = $response_limit;

        return $this;
    }

    /**
     * Gets end_date
     *
     * @return \DateTime
     */
    public function getEndDate()
    {
        return $this->container['end_date'];
    }

    /**
     * Sets end_date
     *
     * @param \DateTime $end_date end_date
     *
     * @return $this
     */
    public function setEndDate($end_date)
    {
        $this->container['end_date'] = $end_date;

        return $this;
    }

    /**
     * Gets benchmark_end_date
     *
     * @return \DateTime
     */
    public function getBenchmarkEndDate()
    {
        return $this->container['benchmark_end_date'];
    }

    /**
     * Sets benchmark_end_date
     *
     * @param \DateTime $benchmark_end_date benchmark_end_date
     *
     * @return $this
     */
    public function setBenchmarkEndDate($benchmark_end_date)
    {
        $this->container['benchmark_end_date'] = $benchmark_end_date;

        return $this;
    }

    /**
     * Gets currency_conversion
     *
     * @return string
     */
    public function getCurrencyConversion()
    {
        return $this->container['currency_conversion'];
    }

    /**
     * Sets currency_conversion
     *
     * @param string $currency_conversion currency_conversion
     *
     * @return $this
     */
    public function setCurrencyConversion($currency_conversion)
    {
        $this->container['currency_conversion'] = $currency_conversion;

        return $this;
    }

    /**
     * Gets start_date
     *
     * @return \DateTime
     */
    public function getStartDate()
    {
        return $this->container['start_date'];
    }

    /**
     * Sets start_date
     *
     * @param \DateTime $start_date start_date
     *
     * @return $this
     */
    public function setStartDate($start_date)
    {
        $this->container['start_date'] = $start_date;

        return $this;
    }

    /**
     * Gets customer_ids
     *
     * @return string[]
     */
    public function getCustomerIds()
    {
        return $this->container['customer_ids'];
    }

    /**
     * Sets customer_ids
     *
     * @param string[] $customer_ids customer_ids
     *
     * @return $this
     */
    public function setCustomerIds($customer_ids)
    {
        $this->container['customer_ids'] = $customer_ids;

        return $this;
    }

    /**
     * Gets business_id
     *
     * @return string
     */
    public function getBusinessId()
    {
        return $this->container['business_id'];
    }

    /**
     * Sets business_id
     *
     * @param string $business_id business_id
     *
     * @return $this
     */
    public function setBusinessId($business_id)
    {
        $this->container['business_id'] = $business_id;

        return $this;
    }

    /**
     * Gets benchmark_start_date
     *
     * @return \DateTime
     */
    public function getBenchmarkStartDate()
    {
        return $this->container['benchmark_start_date'];
    }

    /**
     * Sets benchmark_start_date
     *
     * @param \DateTime $benchmark_start_date benchmark_start_date
     *
     * @return $this
     */
    public function setBenchmarkStartDate($benchmark_start_date)
    {
        $this->container['benchmark_start_date'] = $benchmark_start_date;

        return $this;
    }

    /**
     * Gets only_active_customers
     *
     * @return bool
     */
    public function getOnlyActiveCustomers()
    {
        return $this->container['only_active_customers'];
    }

    /**
     * Sets only_active_customers
     *
     * @param bool $only_active_customers only_active_customers
     *
     * @return $this
     */
    public function setOnlyActiveCustomers($only_active_customers)
    {
        $this->container['only_active_customers'] = $only_active_customers;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


