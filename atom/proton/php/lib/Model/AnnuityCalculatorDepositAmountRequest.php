<?php
/**
 * AnnuityCalculatorDepositAmountRequest
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
 * AnnuityCalculatorDepositAmountRequest Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AnnuityCalculatorDepositAmountRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'annuityCalculatorDepositAmountRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'inflation_rate' => 'float',
        'decumulation_horizon' => 'int',
        'account_ids' => 'string[]',
        'tax_rate' => 'float',
        'accumulation_horizon' => 'int',
        'annuity_amount' => 'float',
        'portfolio_return' => 'float',
        'deposit_schedule' => '\com\hydrogen\proton\Model\AnnuityDepositSchedule',
        'annuity_frequency_interval' => 'string',
        'initial_balance' => 'float',
        'aggregation_account_ids' => 'string[]',
        'create_log' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'inflation_rate' => 'float',
        'decumulation_horizon' => 'int32',
        'account_ids' => 'uuid',
        'tax_rate' => 'float',
        'accumulation_horizon' => 'int32',
        'annuity_amount' => 'float',
        'portfolio_return' => 'float',
        'deposit_schedule' => null,
        'annuity_frequency_interval' => null,
        'initial_balance' => 'float',
        'aggregation_account_ids' => 'uuid',
        'create_log' => null
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
        'inflation_rate' => 'inflation_rate',
        'decumulation_horizon' => 'decumulation_horizon',
        'account_ids' => 'account_ids',
        'tax_rate' => 'tax_rate',
        'accumulation_horizon' => 'accumulation_horizon',
        'annuity_amount' => 'annuity_amount',
        'portfolio_return' => 'portfolio_return',
        'deposit_schedule' => 'deposit_schedule',
        'annuity_frequency_interval' => 'annuity_frequency_interval',
        'initial_balance' => 'initial_balance',
        'aggregation_account_ids' => 'aggregation_account_ids',
        'create_log' => 'create_log'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'inflation_rate' => 'setInflationRate',
        'decumulation_horizon' => 'setDecumulationHorizon',
        'account_ids' => 'setAccountIds',
        'tax_rate' => 'setTaxRate',
        'accumulation_horizon' => 'setAccumulationHorizon',
        'annuity_amount' => 'setAnnuityAmount',
        'portfolio_return' => 'setPortfolioReturn',
        'deposit_schedule' => 'setDepositSchedule',
        'annuity_frequency_interval' => 'setAnnuityFrequencyInterval',
        'initial_balance' => 'setInitialBalance',
        'aggregation_account_ids' => 'setAggregationAccountIds',
        'create_log' => 'setCreateLog'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'inflation_rate' => 'getInflationRate',
        'decumulation_horizon' => 'getDecumulationHorizon',
        'account_ids' => 'getAccountIds',
        'tax_rate' => 'getTaxRate',
        'accumulation_horizon' => 'getAccumulationHorizon',
        'annuity_amount' => 'getAnnuityAmount',
        'portfolio_return' => 'getPortfolioReturn',
        'deposit_schedule' => 'getDepositSchedule',
        'annuity_frequency_interval' => 'getAnnuityFrequencyInterval',
        'initial_balance' => 'getInitialBalance',
        'aggregation_account_ids' => 'getAggregationAccountIds',
        'create_log' => 'getCreateLog'
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

    const ANNUITY_FREQUENCY_INTERVAL_YEAR = 'year';
    const ANNUITY_FREQUENCY_INTERVAL_QUARTER = 'quarter';
    const ANNUITY_FREQUENCY_INTERVAL_MONTH = 'month';
    const ANNUITY_FREQUENCY_INTERVAL_WEEK = 'week';
    const ANNUITY_FREQUENCY_INTERVAL_DAY = 'day';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getAnnuityFrequencyIntervalAllowableValues()
    {
        return [
            self::ANNUITY_FREQUENCY_INTERVAL_YEAR,
            self::ANNUITY_FREQUENCY_INTERVAL_QUARTER,
            self::ANNUITY_FREQUENCY_INTERVAL_MONTH,
            self::ANNUITY_FREQUENCY_INTERVAL_WEEK,
            self::ANNUITY_FREQUENCY_INTERVAL_DAY,
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
        $this->container['inflation_rate'] = isset($data['inflation_rate']) ? $data['inflation_rate'] : 0.0;
        $this->container['decumulation_horizon'] = isset($data['decumulation_horizon']) ? $data['decumulation_horizon'] : null;
        $this->container['account_ids'] = isset($data['account_ids']) ? $data['account_ids'] : null;
        $this->container['tax_rate'] = isset($data['tax_rate']) ? $data['tax_rate'] : 0.0;
        $this->container['accumulation_horizon'] = isset($data['accumulation_horizon']) ? $data['accumulation_horizon'] : null;
        $this->container['annuity_amount'] = isset($data['annuity_amount']) ? $data['annuity_amount'] : null;
        $this->container['portfolio_return'] = isset($data['portfolio_return']) ? $data['portfolio_return'] : null;
        $this->container['deposit_schedule'] = isset($data['deposit_schedule']) ? $data['deposit_schedule'] : null;
        $this->container['annuity_frequency_interval'] = isset($data['annuity_frequency_interval']) ? $data['annuity_frequency_interval'] : 'year';
        $this->container['initial_balance'] = isset($data['initial_balance']) ? $data['initial_balance'] : 0.0;
        $this->container['aggregation_account_ids'] = isset($data['aggregation_account_ids']) ? $data['aggregation_account_ids'] : null;
        $this->container['create_log'] = isset($data['create_log']) ? $data['create_log'] : false;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['inflation_rate']) && ($this->container['inflation_rate'] > 20)) {
            $invalidProperties[] = "invalid value for 'inflation_rate', must be smaller than or equal to 20.";
        }

        if (!is_null($this->container['inflation_rate']) && ($this->container['inflation_rate'] < -1)) {
            $invalidProperties[] = "invalid value for 'inflation_rate', must be bigger than or equal to -1.";
        }

        if ($this->container['decumulation_horizon'] === null) {
            $invalidProperties[] = "'decumulation_horizon' can't be null";
        }
        if (($this->container['decumulation_horizon'] < 1)) {
            $invalidProperties[] = "invalid value for 'decumulation_horizon', must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['tax_rate']) && ($this->container['tax_rate'] > 1)) {
            $invalidProperties[] = "invalid value for 'tax_rate', must be smaller than or equal to 1.";
        }

        if (!is_null($this->container['tax_rate']) && ($this->container['tax_rate'] < 0)) {
            $invalidProperties[] = "invalid value for 'tax_rate', must be bigger than or equal to 0.";
        }

        if ($this->container['accumulation_horizon'] === null) {
            $invalidProperties[] = "'accumulation_horizon' can't be null";
        }
        if (($this->container['accumulation_horizon'] < 0)) {
            $invalidProperties[] = "invalid value for 'accumulation_horizon', must be bigger than or equal to 0.";
        }

        if ($this->container['annuity_amount'] === null) {
            $invalidProperties[] = "'annuity_amount' can't be null";
        }
        if (($this->container['annuity_amount'] < 0)) {
            $invalidProperties[] = "invalid value for 'annuity_amount', must be bigger than or equal to 0.";
        }

        if ($this->container['portfolio_return'] === null) {
            $invalidProperties[] = "'portfolio_return' can't be null";
        }
        $allowedValues = $this->getAnnuityFrequencyIntervalAllowableValues();
        if (!is_null($this->container['annuity_frequency_interval']) && !in_array($this->container['annuity_frequency_interval'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'annuity_frequency_interval', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if (!is_null($this->container['initial_balance']) && ($this->container['initial_balance'] < 0)) {
            $invalidProperties[] = "invalid value for 'initial_balance', must be bigger than or equal to 0.";
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
     * Gets inflation_rate
     *
     * @return float
     */
    public function getInflationRate()
    {
        return $this->container['inflation_rate'];
    }

    /**
     * Sets inflation_rate
     *
     * @param float $inflation_rate inflation_rate
     *
     * @return $this
     */
    public function setInflationRate($inflation_rate)
    {

        if (!is_null($inflation_rate) && ($inflation_rate > 20)) {
            throw new \InvalidArgumentException('invalid value for $inflation_rate when calling AnnuityCalculatorDepositAmountRequest., must be smaller than or equal to 20.');
        }
        if (!is_null($inflation_rate) && ($inflation_rate < -1)) {
            throw new \InvalidArgumentException('invalid value for $inflation_rate when calling AnnuityCalculatorDepositAmountRequest., must be bigger than or equal to -1.');
        }

        $this->container['inflation_rate'] = $inflation_rate;

        return $this;
    }

    /**
     * Gets decumulation_horizon
     *
     * @return int
     */
    public function getDecumulationHorizon()
    {
        return $this->container['decumulation_horizon'];
    }

    /**
     * Sets decumulation_horizon
     *
     * @param int $decumulation_horizon decumulation_horizon
     *
     * @return $this
     */
    public function setDecumulationHorizon($decumulation_horizon)
    {

        if (($decumulation_horizon < 1)) {
            throw new \InvalidArgumentException('invalid value for $decumulation_horizon when calling AnnuityCalculatorDepositAmountRequest., must be bigger than or equal to 1.');
        }

        $this->container['decumulation_horizon'] = $decumulation_horizon;

        return $this;
    }

    /**
     * Gets account_ids
     *
     * @return string[]
     */
    public function getAccountIds()
    {
        return $this->container['account_ids'];
    }

    /**
     * Sets account_ids
     *
     * @param string[] $account_ids account_ids
     *
     * @return $this
     */
    public function setAccountIds($account_ids)
    {
        $this->container['account_ids'] = $account_ids;

        return $this;
    }

    /**
     * Gets tax_rate
     *
     * @return float
     */
    public function getTaxRate()
    {
        return $this->container['tax_rate'];
    }

    /**
     * Sets tax_rate
     *
     * @param float $tax_rate tax_rate
     *
     * @return $this
     */
    public function setTaxRate($tax_rate)
    {

        if (!is_null($tax_rate) && ($tax_rate > 1)) {
            throw new \InvalidArgumentException('invalid value for $tax_rate when calling AnnuityCalculatorDepositAmountRequest., must be smaller than or equal to 1.');
        }
        if (!is_null($tax_rate) && ($tax_rate < 0)) {
            throw new \InvalidArgumentException('invalid value for $tax_rate when calling AnnuityCalculatorDepositAmountRequest., must be bigger than or equal to 0.');
        }

        $this->container['tax_rate'] = $tax_rate;

        return $this;
    }

    /**
     * Gets accumulation_horizon
     *
     * @return int
     */
    public function getAccumulationHorizon()
    {
        return $this->container['accumulation_horizon'];
    }

    /**
     * Sets accumulation_horizon
     *
     * @param int $accumulation_horizon accumulation_horizon
     *
     * @return $this
     */
    public function setAccumulationHorizon($accumulation_horizon)
    {

        if (($accumulation_horizon < 0)) {
            throw new \InvalidArgumentException('invalid value for $accumulation_horizon when calling AnnuityCalculatorDepositAmountRequest., must be bigger than or equal to 0.');
        }

        $this->container['accumulation_horizon'] = $accumulation_horizon;

        return $this;
    }

    /**
     * Gets annuity_amount
     *
     * @return float
     */
    public function getAnnuityAmount()
    {
        return $this->container['annuity_amount'];
    }

    /**
     * Sets annuity_amount
     *
     * @param float $annuity_amount annuity_amount
     *
     * @return $this
     */
    public function setAnnuityAmount($annuity_amount)
    {

        if (($annuity_amount < 0)) {
            throw new \InvalidArgumentException('invalid value for $annuity_amount when calling AnnuityCalculatorDepositAmountRequest., must be bigger than or equal to 0.');
        }

        $this->container['annuity_amount'] = $annuity_amount;

        return $this;
    }

    /**
     * Gets portfolio_return
     *
     * @return float
     */
    public function getPortfolioReturn()
    {
        return $this->container['portfolio_return'];
    }

    /**
     * Sets portfolio_return
     *
     * @param float $portfolio_return portfolio_return
     *
     * @return $this
     */
    public function setPortfolioReturn($portfolio_return)
    {
        $this->container['portfolio_return'] = $portfolio_return;

        return $this;
    }

    /**
     * Gets deposit_schedule
     *
     * @return \com\hydrogen\proton\Model\AnnuityDepositSchedule
     */
    public function getDepositSchedule()
    {
        return $this->container['deposit_schedule'];
    }

    /**
     * Sets deposit_schedule
     *
     * @param \com\hydrogen\proton\Model\AnnuityDepositSchedule $deposit_schedule deposit_schedule
     *
     * @return $this
     */
    public function setDepositSchedule($deposit_schedule)
    {
        $this->container['deposit_schedule'] = $deposit_schedule;

        return $this;
    }

    /**
     * Gets annuity_frequency_interval
     *
     * @return string
     */
    public function getAnnuityFrequencyInterval()
    {
        return $this->container['annuity_frequency_interval'];
    }

    /**
     * Sets annuity_frequency_interval
     *
     * @param string $annuity_frequency_interval annuity_frequency_interval
     *
     * @return $this
     */
    public function setAnnuityFrequencyInterval($annuity_frequency_interval)
    {
        $allowedValues = $this->getAnnuityFrequencyIntervalAllowableValues();
        if (!is_null($annuity_frequency_interval) && !in_array($annuity_frequency_interval, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'annuity_frequency_interval', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['annuity_frequency_interval'] = $annuity_frequency_interval;

        return $this;
    }

    /**
     * Gets initial_balance
     *
     * @return float
     */
    public function getInitialBalance()
    {
        return $this->container['initial_balance'];
    }

    /**
     * Sets initial_balance
     *
     * @param float $initial_balance initial_balance
     *
     * @return $this
     */
    public function setInitialBalance($initial_balance)
    {

        if (!is_null($initial_balance) && ($initial_balance < 0)) {
            throw new \InvalidArgumentException('invalid value for $initial_balance when calling AnnuityCalculatorDepositAmountRequest., must be bigger than or equal to 0.');
        }

        $this->container['initial_balance'] = $initial_balance;

        return $this;
    }

    /**
     * Gets aggregation_account_ids
     *
     * @return string[]
     */
    public function getAggregationAccountIds()
    {
        return $this->container['aggregation_account_ids'];
    }

    /**
     * Sets aggregation_account_ids
     *
     * @param string[] $aggregation_account_ids aggregation_account_ids
     *
     * @return $this
     */
    public function setAggregationAccountIds($aggregation_account_ids)
    {
        $this->container['aggregation_account_ids'] = $aggregation_account_ids;

        return $this;
    }

    /**
     * Gets create_log
     *
     * @return bool
     */
    public function getCreateLog()
    {
        return $this->container['create_log'];
    }

    /**
     * Sets create_log
     *
     * @param bool $create_log create_log
     *
     * @return $this
     */
    public function setCreateLog($create_log)
    {
        $this->container['create_log'] = $create_log;

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


