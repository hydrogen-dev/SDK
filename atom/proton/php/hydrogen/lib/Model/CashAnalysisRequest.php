<?php
/**
 * CashAnalysisRequest
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
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.16
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
 * CashAnalysisRequest Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class CashAnalysisRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'cashAnalysisRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'scope' => 'string',
        'show_outflow_details' => 'bool',
        'show_history' => 'bool',
        'client_id' => 'string',
        'show_inflow_details' => 'bool',
        'currency_conversion' => 'string',
        'end_date' => '\DateTime',
        'currency_code' => 'string',
        'start_date' => '\DateTime',
        'history_frequency_interval' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'scope' => null,
        'show_outflow_details' => null,
        'show_history' => null,
        'client_id' => 'uuid',
        'show_inflow_details' => null,
        'currency_conversion' => null,
        'end_date' => 'date',
        'currency_code' => null,
        'start_date' => 'date',
        'history_frequency_interval' => null
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
        'scope' => 'scope',
        'show_outflow_details' => 'show_outflow_details',
        'show_history' => 'show_history',
        'client_id' => 'client_id',
        'show_inflow_details' => 'show_inflow_details',
        'currency_conversion' => 'currency_conversion',
        'end_date' => 'end_date',
        'currency_code' => 'currency_code',
        'start_date' => 'start_date',
        'history_frequency_interval' => 'history_frequency_interval'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'scope' => 'setScope',
        'show_outflow_details' => 'setShowOutflowDetails',
        'show_history' => 'setShowHistory',
        'client_id' => 'setClientId',
        'show_inflow_details' => 'setShowInflowDetails',
        'currency_conversion' => 'setCurrencyConversion',
        'end_date' => 'setEndDate',
        'currency_code' => 'setCurrencyCode',
        'start_date' => 'setStartDate',
        'history_frequency_interval' => 'setHistoryFrequencyInterval'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'scope' => 'getScope',
        'show_outflow_details' => 'getShowOutflowDetails',
        'show_history' => 'getShowHistory',
        'client_id' => 'getClientId',
        'show_inflow_details' => 'getShowInflowDetails',
        'currency_conversion' => 'getCurrencyConversion',
        'end_date' => 'getEndDate',
        'currency_code' => 'getCurrencyCode',
        'start_date' => 'getStartDate',
        'history_frequency_interval' => 'getHistoryFrequencyInterval'
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

    const SCOPE_ALL = 'all';
    const SCOPE_EXTERNAL = 'external';
    const SCOPE_INTERNAL = 'internal';
    const HISTORY_FREQUENCY_INTERVAL_DAY = 'day';
    const HISTORY_FREQUENCY_INTERVAL_WEEK = 'week';
    const HISTORY_FREQUENCY_INTERVAL_MONTH = 'month';
    const HISTORY_FREQUENCY_INTERVAL_QUARTER = 'quarter';
    const HISTORY_FREQUENCY_INTERVAL_YEAR = 'year';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getScopeAllowableValues()
    {
        return [
            self::SCOPE_ALL,
            self::SCOPE_EXTERNAL,
            self::SCOPE_INTERNAL,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getHistoryFrequencyIntervalAllowableValues()
    {
        return [
            self::HISTORY_FREQUENCY_INTERVAL_DAY,
            self::HISTORY_FREQUENCY_INTERVAL_WEEK,
            self::HISTORY_FREQUENCY_INTERVAL_MONTH,
            self::HISTORY_FREQUENCY_INTERVAL_QUARTER,
            self::HISTORY_FREQUENCY_INTERVAL_YEAR,
        ];
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
        $this->container['scope'] = isset($data['scope']) ? $data['scope'] : 'all';
        $this->container['show_outflow_details'] = isset($data['show_outflow_details']) ? $data['show_outflow_details'] : false;
        $this->container['show_history'] = isset($data['show_history']) ? $data['show_history'] : false;
        $this->container['client_id'] = isset($data['client_id']) ? $data['client_id'] : null;
        $this->container['show_inflow_details'] = isset($data['show_inflow_details']) ? $data['show_inflow_details'] : false;
        $this->container['currency_conversion'] = isset($data['currency_conversion']) ? $data['currency_conversion'] : null;
        $this->container['end_date'] = isset($data['end_date']) ? $data['end_date'] : null;
        $this->container['currency_code'] = isset($data['currency_code']) ? $data['currency_code'] : null;
        $this->container['start_date'] = isset($data['start_date']) ? $data['start_date'] : null;
        $this->container['history_frequency_interval'] = isset($data['history_frequency_interval']) ? $data['history_frequency_interval'] : 'month';
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getScopeAllowableValues();
        if (!is_null($this->container['scope']) && !in_array($this->container['scope'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'scope', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getHistoryFrequencyIntervalAllowableValues();
        if (!is_null($this->container['history_frequency_interval']) && !in_array($this->container['history_frequency_interval'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'history_frequency_interval', must be one of '%s'",
                implode("', '", $allowedValues)
            );
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
     * Gets scope
     *
     * @return string
     */
    public function getScope()
    {
        return $this->container['scope'];
    }

    /**
     * Sets scope
     *
     * @param string $scope scope
     *
     * @return $this
     */
    public function setScope($scope)
    {
        $allowedValues = $this->getScopeAllowableValues();
        if (!is_null($scope) && !in_array($scope, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'scope', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['scope'] = $scope;

        return $this;
    }

    /**
     * Gets show_outflow_details
     *
     * @return bool
     */
    public function getShowOutflowDetails()
    {
        return $this->container['show_outflow_details'];
    }

    /**
     * Sets show_outflow_details
     *
     * @param bool $show_outflow_details show_outflow_details
     *
     * @return $this
     */
    public function setShowOutflowDetails($show_outflow_details)
    {
        $this->container['show_outflow_details'] = $show_outflow_details;

        return $this;
    }

    /**
     * Gets show_history
     *
     * @return bool
     */
    public function getShowHistory()
    {
        return $this->container['show_history'];
    }

    /**
     * Sets show_history
     *
     * @param bool $show_history show_history
     *
     * @return $this
     */
    public function setShowHistory($show_history)
    {
        $this->container['show_history'] = $show_history;

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
     * Gets show_inflow_details
     *
     * @return bool
     */
    public function getShowInflowDetails()
    {
        return $this->container['show_inflow_details'];
    }

    /**
     * Sets show_inflow_details
     *
     * @param bool $show_inflow_details show_inflow_details
     *
     * @return $this
     */
    public function setShowInflowDetails($show_inflow_details)
    {
        $this->container['show_inflow_details'] = $show_inflow_details;

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
     * Gets history_frequency_interval
     *
     * @return string
     */
    public function getHistoryFrequencyInterval()
    {
        return $this->container['history_frequency_interval'];
    }

    /**
     * Sets history_frequency_interval
     *
     * @param string $history_frequency_interval history_frequency_interval
     *
     * @return $this
     */
    public function setHistoryFrequencyInterval($history_frequency_interval)
    {
        $allowedValues = $this->getHistoryFrequencyIntervalAllowableValues();
        if (!is_null($history_frequency_interval) && !in_array($history_frequency_interval, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'history_frequency_interval', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['history_frequency_interval'] = $history_frequency_interval;

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


