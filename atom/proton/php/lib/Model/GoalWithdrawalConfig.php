<?php
/**
 * GoalWithdrawalConfig
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
 * GoalWithdrawalConfig Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class GoalWithdrawalConfig implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'GoalWithdrawalConfig';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'with_inflation' => 'float',
        'with_frequency' => 'string',
        'with_end_reference' => 'string',
        'with_start_reference' => 'string',
        'with_end_period' => 'int',
        'with_amount' => 'float',
        'with_start_period' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'with_inflation' => 'float',
        'with_frequency' => null,
        'with_end_reference' => null,
        'with_start_reference' => null,
        'with_end_period' => 'int32',
        'with_amount' => null,
        'with_start_period' => 'int32'
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
        'with_inflation' => 'with_inflation',
        'with_frequency' => 'with_frequency',
        'with_end_reference' => 'with_end_reference',
        'with_start_reference' => 'with_start_reference',
        'with_end_period' => 'with_end_period',
        'with_amount' => 'with_amount',
        'with_start_period' => 'with_start_period'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'with_inflation' => 'setWithInflation',
        'with_frequency' => 'setWithFrequency',
        'with_end_reference' => 'setWithEndReference',
        'with_start_reference' => 'setWithStartReference',
        'with_end_period' => 'setWithEndPeriod',
        'with_amount' => 'setWithAmount',
        'with_start_period' => 'setWithStartPeriod'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'with_inflation' => 'getWithInflation',
        'with_frequency' => 'getWithFrequency',
        'with_end_reference' => 'getWithEndReference',
        'with_start_reference' => 'getWithStartReference',
        'with_end_period' => 'getWithEndPeriod',
        'with_amount' => 'getWithAmount',
        'with_start_period' => 'getWithStartPeriod'
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

    const WITH_FREQUENCY_YEAR = 'year';
    const WITH_FREQUENCY_SIX_MONTHS = 'six_months';
    const WITH_FREQUENCY_QUARTER = 'quarter';
    const WITH_FREQUENCY_MONTH = 'month';
    const WITH_FREQUENCY_TWO_WEEKS = 'two_weeks';
    const WITH_FREQUENCY_WEEK = 'week';
    const WITH_FREQUENCY_DAY = 'day';
    const WITH_END_REFERENCE_A_END = 'a_end';
    const WITH_END_REFERENCE_D_END = 'd_end';
    const WITH_START_REFERENCE_A_END = 'a_end';
    const WITH_START_REFERENCE_D_END = 'd_end';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getWithFrequencyAllowableValues()
    {
        return [
            self::WITH_FREQUENCY_YEAR,
            self::WITH_FREQUENCY_SIX_MONTHS,
            self::WITH_FREQUENCY_QUARTER,
            self::WITH_FREQUENCY_MONTH,
            self::WITH_FREQUENCY_TWO_WEEKS,
            self::WITH_FREQUENCY_WEEK,
            self::WITH_FREQUENCY_DAY,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getWithEndReferenceAllowableValues()
    {
        return [
            self::WITH_END_REFERENCE_A_END,
            self::WITH_END_REFERENCE_D_END,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getWithStartReferenceAllowableValues()
    {
        return [
            self::WITH_START_REFERENCE_A_END,
            self::WITH_START_REFERENCE_D_END,
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
        $this->container['with_inflation'] = isset($data['with_inflation']) ? $data['with_inflation'] : 0.0;
        $this->container['with_frequency'] = isset($data['with_frequency']) ? $data['with_frequency'] : 'year';
        $this->container['with_end_reference'] = isset($data['with_end_reference']) ? $data['with_end_reference'] : 'd_end';
        $this->container['with_start_reference'] = isset($data['with_start_reference']) ? $data['with_start_reference'] : 'a_end';
        $this->container['with_end_period'] = isset($data['with_end_period']) ? $data['with_end_period'] : 0;
        $this->container['with_amount'] = isset($data['with_amount']) ? $data['with_amount'] : null;
        $this->container['with_start_period'] = isset($data['with_start_period']) ? $data['with_start_period'] : 0;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['with_inflation']) && ($this->container['with_inflation'] < -1)) {
            $invalidProperties[] = "invalid value for 'with_inflation', must be bigger than or equal to -1.";
        }

        $allowedValues = $this->getWithFrequencyAllowableValues();
        if (!is_null($this->container['with_frequency']) && !in_array($this->container['with_frequency'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'with_frequency', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getWithEndReferenceAllowableValues();
        if (!is_null($this->container['with_end_reference']) && !in_array($this->container['with_end_reference'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'with_end_reference', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getWithStartReferenceAllowableValues();
        if (!is_null($this->container['with_start_reference']) && !in_array($this->container['with_start_reference'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'with_start_reference', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if (!is_null($this->container['with_amount']) && ($this->container['with_amount'] < 0)) {
            $invalidProperties[] = "invalid value for 'with_amount', must be bigger than or equal to 0.";
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
     * Gets with_inflation
     *
     * @return float
     */
    public function getWithInflation()
    {
        return $this->container['with_inflation'];
    }

    /**
     * Sets with_inflation
     *
     * @param float $with_inflation with_inflation
     *
     * @return $this
     */
    public function setWithInflation($with_inflation)
    {

        if (!is_null($with_inflation) && ($with_inflation < -1)) {
            throw new \InvalidArgumentException('invalid value for $with_inflation when calling GoalWithdrawalConfig., must be bigger than or equal to -1.');
        }

        $this->container['with_inflation'] = $with_inflation;

        return $this;
    }

    /**
     * Gets with_frequency
     *
     * @return string
     */
    public function getWithFrequency()
    {
        return $this->container['with_frequency'];
    }

    /**
     * Sets with_frequency
     *
     * @param string $with_frequency with_frequency
     *
     * @return $this
     */
    public function setWithFrequency($with_frequency)
    {
        $allowedValues = $this->getWithFrequencyAllowableValues();
        if (!is_null($with_frequency) && !in_array($with_frequency, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'with_frequency', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['with_frequency'] = $with_frequency;

        return $this;
    }

    /**
     * Gets with_end_reference
     *
     * @return string
     */
    public function getWithEndReference()
    {
        return $this->container['with_end_reference'];
    }

    /**
     * Sets with_end_reference
     *
     * @param string $with_end_reference with_end_reference
     *
     * @return $this
     */
    public function setWithEndReference($with_end_reference)
    {
        $allowedValues = $this->getWithEndReferenceAllowableValues();
        if (!is_null($with_end_reference) && !in_array($with_end_reference, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'with_end_reference', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['with_end_reference'] = $with_end_reference;

        return $this;
    }

    /**
     * Gets with_start_reference
     *
     * @return string
     */
    public function getWithStartReference()
    {
        return $this->container['with_start_reference'];
    }

    /**
     * Sets with_start_reference
     *
     * @param string $with_start_reference with_start_reference
     *
     * @return $this
     */
    public function setWithStartReference($with_start_reference)
    {
        $allowedValues = $this->getWithStartReferenceAllowableValues();
        if (!is_null($with_start_reference) && !in_array($with_start_reference, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'with_start_reference', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['with_start_reference'] = $with_start_reference;

        return $this;
    }

    /**
     * Gets with_end_period
     *
     * @return int
     */
    public function getWithEndPeriod()
    {
        return $this->container['with_end_period'];
    }

    /**
     * Sets with_end_period
     *
     * @param int $with_end_period with_end_period
     *
     * @return $this
     */
    public function setWithEndPeriod($with_end_period)
    {
        $this->container['with_end_period'] = $with_end_period;

        return $this;
    }

    /**
     * Gets with_amount
     *
     * @return float
     */
    public function getWithAmount()
    {
        return $this->container['with_amount'];
    }

    /**
     * Sets with_amount
     *
     * @param float $with_amount with_amount
     *
     * @return $this
     */
    public function setWithAmount($with_amount)
    {

        if (!is_null($with_amount) && ($with_amount < 0)) {
            throw new \InvalidArgumentException('invalid value for $with_amount when calling GoalWithdrawalConfig., must be bigger than or equal to 0.');
        }

        $this->container['with_amount'] = $with_amount;

        return $this;
    }

    /**
     * Gets with_start_period
     *
     * @return int
     */
    public function getWithStartPeriod()
    {
        return $this->container['with_start_period'];
    }

    /**
     * Sets with_start_period
     *
     * @param int $with_start_period with_start_period
     *
     * @return $this
     */
    public function setWithStartPeriod($with_start_period)
    {
        $this->container['with_start_period'] = $with_start_period;

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


