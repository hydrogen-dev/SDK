<?php
/**
 * VariableAnnuityRequest
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
 * VariableAnnuityRequest Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class VariableAnnuityRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'variableAnnuityRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'p' => 'float',
        'allocation_id' => 'string',
        'decumulation_horizon' => 'int',
        'accumulation_horizon' => 'int',
        'annuitization_rate' => 'float',
        'guaranteed_rate_benefit' => '\com\hydrogen\proton\Model\GuaranteedRateBenefit[]',
        'model_id' => 'string',
        'portfolio_tickers' => 'string[]',
        'create_log' => 'bool',
        'inflation_rate' => 'float',
        'aggregation_account_id' => 'string',
        'n' => 'int',
        'guaranteed_accumulation_benefit' => 'float',
        'end_date' => 'string',
        'tax_rate' => 'float',
        'start_date' => 'string',
        'remove_outliers' => 'bool',
        'portfolio_weights' => 'float[]',
        'portfolio_id' => 'string',
        'result_type' => 'string',
        'account_id' => 'string',
        'trading_days_per_year' => 'int',
        'use_proxy_data' => 'bool',
        'initial_balance' => 'float',
        'market_data_source' => 'string',
        'frequency_interval' => 'string',
        'deposit_schedule' => '\com\hydrogen\proton\Model\AnnuityDepositSchedule'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'p' => null,
        'allocation_id' => 'uuid',
        'decumulation_horizon' => 'int32',
        'accumulation_horizon' => 'int32',
        'annuitization_rate' => 'float',
        'guaranteed_rate_benefit' => null,
        'model_id' => 'uuid',
        'portfolio_tickers' => null,
        'create_log' => null,
        'inflation_rate' => 'float',
        'aggregation_account_id' => 'uuid',
        'n' => 'int32',
        'guaranteed_accumulation_benefit' => 'float',
        'end_date' => null,
        'tax_rate' => 'float',
        'start_date' => null,
        'remove_outliers' => null,
        'portfolio_weights' => 'float',
        'portfolio_id' => 'uuid',
        'result_type' => null,
        'account_id' => 'uuid',
        'trading_days_per_year' => 'int32',
        'use_proxy_data' => null,
        'initial_balance' => 'float',
        'market_data_source' => null,
        'frequency_interval' => null,
        'deposit_schedule' => null
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
        'p' => 'p',
        'allocation_id' => 'allocation_id',
        'decumulation_horizon' => 'decumulation_horizon',
        'accumulation_horizon' => 'accumulation_horizon',
        'annuitization_rate' => 'annuitization_rate',
        'guaranteed_rate_benefit' => 'guaranteed_rate_benefit',
        'model_id' => 'model_id',
        'portfolio_tickers' => 'portfolio_tickers',
        'create_log' => 'create_log',
        'inflation_rate' => 'inflation_rate',
        'aggregation_account_id' => 'aggregation_account_id',
        'n' => 'n',
        'guaranteed_accumulation_benefit' => 'guaranteed_accumulation_benefit',
        'end_date' => 'end_date',
        'tax_rate' => 'tax_rate',
        'start_date' => 'start_date',
        'remove_outliers' => 'remove_outliers',
        'portfolio_weights' => 'portfolio_weights',
        'portfolio_id' => 'portfolio_id',
        'result_type' => 'result_type',
        'account_id' => 'account_id',
        'trading_days_per_year' => 'trading_days_per_year',
        'use_proxy_data' => 'use_proxy_data',
        'initial_balance' => 'initial_balance',
        'market_data_source' => 'market_data_source',
        'frequency_interval' => 'frequency_interval',
        'deposit_schedule' => 'deposit_schedule'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'p' => 'setP',
        'allocation_id' => 'setAllocationId',
        'decumulation_horizon' => 'setDecumulationHorizon',
        'accumulation_horizon' => 'setAccumulationHorizon',
        'annuitization_rate' => 'setAnnuitizationRate',
        'guaranteed_rate_benefit' => 'setGuaranteedRateBenefit',
        'model_id' => 'setModelId',
        'portfolio_tickers' => 'setPortfolioTickers',
        'create_log' => 'setCreateLog',
        'inflation_rate' => 'setInflationRate',
        'aggregation_account_id' => 'setAggregationAccountId',
        'n' => 'setN',
        'guaranteed_accumulation_benefit' => 'setGuaranteedAccumulationBenefit',
        'end_date' => 'setEndDate',
        'tax_rate' => 'setTaxRate',
        'start_date' => 'setStartDate',
        'remove_outliers' => 'setRemoveOutliers',
        'portfolio_weights' => 'setPortfolioWeights',
        'portfolio_id' => 'setPortfolioId',
        'result_type' => 'setResultType',
        'account_id' => 'setAccountId',
        'trading_days_per_year' => 'setTradingDaysPerYear',
        'use_proxy_data' => 'setUseProxyData',
        'initial_balance' => 'setInitialBalance',
        'market_data_source' => 'setMarketDataSource',
        'frequency_interval' => 'setFrequencyInterval',
        'deposit_schedule' => 'setDepositSchedule'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'p' => 'getP',
        'allocation_id' => 'getAllocationId',
        'decumulation_horizon' => 'getDecumulationHorizon',
        'accumulation_horizon' => 'getAccumulationHorizon',
        'annuitization_rate' => 'getAnnuitizationRate',
        'guaranteed_rate_benefit' => 'getGuaranteedRateBenefit',
        'model_id' => 'getModelId',
        'portfolio_tickers' => 'getPortfolioTickers',
        'create_log' => 'getCreateLog',
        'inflation_rate' => 'getInflationRate',
        'aggregation_account_id' => 'getAggregationAccountId',
        'n' => 'getN',
        'guaranteed_accumulation_benefit' => 'getGuaranteedAccumulationBenefit',
        'end_date' => 'getEndDate',
        'tax_rate' => 'getTaxRate',
        'start_date' => 'getStartDate',
        'remove_outliers' => 'getRemoveOutliers',
        'portfolio_weights' => 'getPortfolioWeights',
        'portfolio_id' => 'getPortfolioId',
        'result_type' => 'getResultType',
        'account_id' => 'getAccountId',
        'trading_days_per_year' => 'getTradingDaysPerYear',
        'use_proxy_data' => 'getUseProxyData',
        'initial_balance' => 'getInitialBalance',
        'market_data_source' => 'getMarketDataSource',
        'frequency_interval' => 'getFrequencyInterval',
        'deposit_schedule' => 'getDepositSchedule'
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

    const RESULT_TYPE_MEAN = 'mean';
    const RESULT_TYPE_MEDIAN = 'median';
    const RESULT_TYPE_CUSTOM = 'custom';
    const MARKET_DATA_SOURCE_NUCLEUS = 'nucleus';
    const MARKET_DATA_SOURCE_INTEGRATION = 'integration';
    const FREQUENCY_INTERVAL_YEAR = 'year';
    const FREQUENCY_INTERVAL_QUARTER = 'quarter';
    const FREQUENCY_INTERVAL_MONTH = 'month';
    const FREQUENCY_INTERVAL_WEEK = 'week';
    const FREQUENCY_INTERVAL_DAY = 'day';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getResultTypeAllowableValues()
    {
        return [
            self::RESULT_TYPE_MEAN,
            self::RESULT_TYPE_MEDIAN,
            self::RESULT_TYPE_CUSTOM,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getMarketDataSourceAllowableValues()
    {
        return [
            self::MARKET_DATA_SOURCE_NUCLEUS,
            self::MARKET_DATA_SOURCE_INTEGRATION,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getFrequencyIntervalAllowableValues()
    {
        return [
            self::FREQUENCY_INTERVAL_YEAR,
            self::FREQUENCY_INTERVAL_QUARTER,
            self::FREQUENCY_INTERVAL_MONTH,
            self::FREQUENCY_INTERVAL_WEEK,
            self::FREQUENCY_INTERVAL_DAY,
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
        $this->container['p'] = isset($data['p']) ? $data['p'] : null;
        $this->container['allocation_id'] = isset($data['allocation_id']) ? $data['allocation_id'] : null;
        $this->container['decumulation_horizon'] = isset($data['decumulation_horizon']) ? $data['decumulation_horizon'] : null;
        $this->container['accumulation_horizon'] = isset($data['accumulation_horizon']) ? $data['accumulation_horizon'] : null;
        $this->container['annuitization_rate'] = isset($data['annuitization_rate']) ? $data['annuitization_rate'] : 0.0;
        $this->container['guaranteed_rate_benefit'] = isset($data['guaranteed_rate_benefit']) ? $data['guaranteed_rate_benefit'] : null;
        $this->container['model_id'] = isset($data['model_id']) ? $data['model_id'] : null;
        $this->container['portfolio_tickers'] = isset($data['portfolio_tickers']) ? $data['portfolio_tickers'] : null;
        $this->container['create_log'] = isset($data['create_log']) ? $data['create_log'] : false;
        $this->container['inflation_rate'] = isset($data['inflation_rate']) ? $data['inflation_rate'] : 0.0;
        $this->container['aggregation_account_id'] = isset($data['aggregation_account_id']) ? $data['aggregation_account_id'] : null;
        $this->container['n'] = isset($data['n']) ? $data['n'] : 1000;
        $this->container['guaranteed_accumulation_benefit'] = isset($data['guaranteed_accumulation_benefit']) ? $data['guaranteed_accumulation_benefit'] : 0.0;
        $this->container['end_date'] = isset($data['end_date']) ? $data['end_date'] : null;
        $this->container['tax_rate'] = isset($data['tax_rate']) ? $data['tax_rate'] : 0.0;
        $this->container['start_date'] = isset($data['start_date']) ? $data['start_date'] : null;
        $this->container['remove_outliers'] = isset($data['remove_outliers']) ? $data['remove_outliers'] : false;
        $this->container['portfolio_weights'] = isset($data['portfolio_weights']) ? $data['portfolio_weights'] : null;
        $this->container['portfolio_id'] = isset($data['portfolio_id']) ? $data['portfolio_id'] : null;
        $this->container['result_type'] = isset($data['result_type']) ? $data['result_type'] : 'median';
        $this->container['account_id'] = isset($data['account_id']) ? $data['account_id'] : null;
        $this->container['trading_days_per_year'] = isset($data['trading_days_per_year']) ? $data['trading_days_per_year'] : 252;
        $this->container['use_proxy_data'] = isset($data['use_proxy_data']) ? $data['use_proxy_data'] : false;
        $this->container['initial_balance'] = isset($data['initial_balance']) ? $data['initial_balance'] : 0.0;
        $this->container['market_data_source'] = isset($data['market_data_source']) ? $data['market_data_source'] : 'nucleus';
        $this->container['frequency_interval'] = isset($data['frequency_interval']) ? $data['frequency_interval'] : 'year';
        $this->container['deposit_schedule'] = isset($data['deposit_schedule']) ? $data['deposit_schedule'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['p']) && ($this->container['p'] > 100)) {
            $invalidProperties[] = "invalid value for 'p', must be smaller than or equal to 100.";
        }

        if (!is_null($this->container['p']) && ($this->container['p'] < 0)) {
            $invalidProperties[] = "invalid value for 'p', must be bigger than or equal to 0.";
        }

        if ($this->container['decumulation_horizon'] === null) {
            $invalidProperties[] = "'decumulation_horizon' can't be null";
        }
        if (($this->container['decumulation_horizon'] < 1)) {
            $invalidProperties[] = "invalid value for 'decumulation_horizon', must be bigger than or equal to 1.";
        }

        if ($this->container['accumulation_horizon'] === null) {
            $invalidProperties[] = "'accumulation_horizon' can't be null";
        }
        if (($this->container['accumulation_horizon'] < 0)) {
            $invalidProperties[] = "invalid value for 'accumulation_horizon', must be bigger than or equal to 0.";
        }

        if (!is_null($this->container['annuitization_rate']) && ($this->container['annuitization_rate'] < -1)) {
            $invalidProperties[] = "invalid value for 'annuitization_rate', must be bigger than or equal to -1.";
        }

        if (!is_null($this->container['inflation_rate']) && ($this->container['inflation_rate'] > 20)) {
            $invalidProperties[] = "invalid value for 'inflation_rate', must be smaller than or equal to 20.";
        }

        if (!is_null($this->container['inflation_rate']) && ($this->container['inflation_rate'] < -1)) {
            $invalidProperties[] = "invalid value for 'inflation_rate', must be bigger than or equal to -1.";
        }

        if (!is_null($this->container['n']) && ($this->container['n'] < 1)) {
            $invalidProperties[] = "invalid value for 'n', must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['guaranteed_accumulation_benefit']) && ($this->container['guaranteed_accumulation_benefit'] < 0)) {
            $invalidProperties[] = "invalid value for 'guaranteed_accumulation_benefit', must be bigger than or equal to 0.";
        }

        if (!is_null($this->container['tax_rate']) && ($this->container['tax_rate'] > 1)) {
            $invalidProperties[] = "invalid value for 'tax_rate', must be smaller than or equal to 1.";
        }

        if (!is_null($this->container['tax_rate']) && ($this->container['tax_rate'] < 0)) {
            $invalidProperties[] = "invalid value for 'tax_rate', must be bigger than or equal to 0.";
        }

        $allowedValues = $this->getResultTypeAllowableValues();
        if (!is_null($this->container['result_type']) && !in_array($this->container['result_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'result_type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if (!is_null($this->container['trading_days_per_year']) && ($this->container['trading_days_per_year'] < 1)) {
            $invalidProperties[] = "invalid value for 'trading_days_per_year', must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['initial_balance']) && ($this->container['initial_balance'] < 0)) {
            $invalidProperties[] = "invalid value for 'initial_balance', must be bigger than or equal to 0.";
        }

        $allowedValues = $this->getMarketDataSourceAllowableValues();
        if (!is_null($this->container['market_data_source']) && !in_array($this->container['market_data_source'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'market_data_source', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getFrequencyIntervalAllowableValues();
        if (!is_null($this->container['frequency_interval']) && !in_array($this->container['frequency_interval'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'frequency_interval', must be one of '%s'",
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
     * Gets p
     *
     * @return float
     */
    public function getP()
    {
        return $this->container['p'];
    }

    /**
     * Sets p
     *
     * @param float $p p
     *
     * @return $this
     */
    public function setP($p)
    {

        if (!is_null($p) && ($p > 100)) {
            throw new \InvalidArgumentException('invalid value for $p when calling VariableAnnuityRequest., must be smaller than or equal to 100.');
        }
        if (!is_null($p) && ($p < 0)) {
            throw new \InvalidArgumentException('invalid value for $p when calling VariableAnnuityRequest., must be bigger than or equal to 0.');
        }

        $this->container['p'] = $p;

        return $this;
    }

    /**
     * Gets allocation_id
     *
     * @return string
     */
    public function getAllocationId()
    {
        return $this->container['allocation_id'];
    }

    /**
     * Sets allocation_id
     *
     * @param string $allocation_id allocation_id
     *
     * @return $this
     */
    public function setAllocationId($allocation_id)
    {
        $this->container['allocation_id'] = $allocation_id;

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
            throw new \InvalidArgumentException('invalid value for $decumulation_horizon when calling VariableAnnuityRequest., must be bigger than or equal to 1.');
        }

        $this->container['decumulation_horizon'] = $decumulation_horizon;

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
            throw new \InvalidArgumentException('invalid value for $accumulation_horizon when calling VariableAnnuityRequest., must be bigger than or equal to 0.');
        }

        $this->container['accumulation_horizon'] = $accumulation_horizon;

        return $this;
    }

    /**
     * Gets annuitization_rate
     *
     * @return float
     */
    public function getAnnuitizationRate()
    {
        return $this->container['annuitization_rate'];
    }

    /**
     * Sets annuitization_rate
     *
     * @param float $annuitization_rate annuitization_rate
     *
     * @return $this
     */
    public function setAnnuitizationRate($annuitization_rate)
    {

        if (!is_null($annuitization_rate) && ($annuitization_rate < -1)) {
            throw new \InvalidArgumentException('invalid value for $annuitization_rate when calling VariableAnnuityRequest., must be bigger than or equal to -1.');
        }

        $this->container['annuitization_rate'] = $annuitization_rate;

        return $this;
    }

    /**
     * Gets guaranteed_rate_benefit
     *
     * @return \com\hydrogen\proton\Model\GuaranteedRateBenefit[]
     */
    public function getGuaranteedRateBenefit()
    {
        return $this->container['guaranteed_rate_benefit'];
    }

    /**
     * Sets guaranteed_rate_benefit
     *
     * @param \com\hydrogen\proton\Model\GuaranteedRateBenefit[] $guaranteed_rate_benefit guaranteed_rate_benefit
     *
     * @return $this
     */
    public function setGuaranteedRateBenefit($guaranteed_rate_benefit)
    {
        $this->container['guaranteed_rate_benefit'] = $guaranteed_rate_benefit;

        return $this;
    }

    /**
     * Gets model_id
     *
     * @return string
     */
    public function getModelId()
    {
        return $this->container['model_id'];
    }

    /**
     * Sets model_id
     *
     * @param string $model_id model_id
     *
     * @return $this
     */
    public function setModelId($model_id)
    {
        $this->container['model_id'] = $model_id;

        return $this;
    }

    /**
     * Gets portfolio_tickers
     *
     * @return string[]
     */
    public function getPortfolioTickers()
    {
        return $this->container['portfolio_tickers'];
    }

    /**
     * Sets portfolio_tickers
     *
     * @param string[] $portfolio_tickers portfolio_tickers
     *
     * @return $this
     */
    public function setPortfolioTickers($portfolio_tickers)
    {
        $this->container['portfolio_tickers'] = $portfolio_tickers;

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
            throw new \InvalidArgumentException('invalid value for $inflation_rate when calling VariableAnnuityRequest., must be smaller than or equal to 20.');
        }
        if (!is_null($inflation_rate) && ($inflation_rate < -1)) {
            throw new \InvalidArgumentException('invalid value for $inflation_rate when calling VariableAnnuityRequest., must be bigger than or equal to -1.');
        }

        $this->container['inflation_rate'] = $inflation_rate;

        return $this;
    }

    /**
     * Gets aggregation_account_id
     *
     * @return string
     */
    public function getAggregationAccountId()
    {
        return $this->container['aggregation_account_id'];
    }

    /**
     * Sets aggregation_account_id
     *
     * @param string $aggregation_account_id aggregation_account_id
     *
     * @return $this
     */
    public function setAggregationAccountId($aggregation_account_id)
    {
        $this->container['aggregation_account_id'] = $aggregation_account_id;

        return $this;
    }

    /**
     * Gets n
     *
     * @return int
     */
    public function getN()
    {
        return $this->container['n'];
    }

    /**
     * Sets n
     *
     * @param int $n n
     *
     * @return $this
     */
    public function setN($n)
    {

        if (!is_null($n) && ($n < 1)) {
            throw new \InvalidArgumentException('invalid value for $n when calling VariableAnnuityRequest., must be bigger than or equal to 1.');
        }

        $this->container['n'] = $n;

        return $this;
    }

    /**
     * Gets guaranteed_accumulation_benefit
     *
     * @return float
     */
    public function getGuaranteedAccumulationBenefit()
    {
        return $this->container['guaranteed_accumulation_benefit'];
    }

    /**
     * Sets guaranteed_accumulation_benefit
     *
     * @param float $guaranteed_accumulation_benefit guaranteed_accumulation_benefit
     *
     * @return $this
     */
    public function setGuaranteedAccumulationBenefit($guaranteed_accumulation_benefit)
    {

        if (!is_null($guaranteed_accumulation_benefit) && ($guaranteed_accumulation_benefit < 0)) {
            throw new \InvalidArgumentException('invalid value for $guaranteed_accumulation_benefit when calling VariableAnnuityRequest., must be bigger than or equal to 0.');
        }

        $this->container['guaranteed_accumulation_benefit'] = $guaranteed_accumulation_benefit;

        return $this;
    }

    /**
     * Gets end_date
     *
     * @return string
     */
    public function getEndDate()
    {
        return $this->container['end_date'];
    }

    /**
     * Sets end_date
     *
     * @param string $end_date end_date
     *
     * @return $this
     */
    public function setEndDate($end_date)
    {
        $this->container['end_date'] = $end_date;

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
            throw new \InvalidArgumentException('invalid value for $tax_rate when calling VariableAnnuityRequest., must be smaller than or equal to 1.');
        }
        if (!is_null($tax_rate) && ($tax_rate < 0)) {
            throw new \InvalidArgumentException('invalid value for $tax_rate when calling VariableAnnuityRequest., must be bigger than or equal to 0.');
        }

        $this->container['tax_rate'] = $tax_rate;

        return $this;
    }

    /**
     * Gets start_date
     *
     * @return string
     */
    public function getStartDate()
    {
        return $this->container['start_date'];
    }

    /**
     * Sets start_date
     *
     * @param string $start_date start_date
     *
     * @return $this
     */
    public function setStartDate($start_date)
    {
        $this->container['start_date'] = $start_date;

        return $this;
    }

    /**
     * Gets remove_outliers
     *
     * @return bool
     */
    public function getRemoveOutliers()
    {
        return $this->container['remove_outliers'];
    }

    /**
     * Sets remove_outliers
     *
     * @param bool $remove_outliers remove_outliers
     *
     * @return $this
     */
    public function setRemoveOutliers($remove_outliers)
    {
        $this->container['remove_outliers'] = $remove_outliers;

        return $this;
    }

    /**
     * Gets portfolio_weights
     *
     * @return float[]
     */
    public function getPortfolioWeights()
    {
        return $this->container['portfolio_weights'];
    }

    /**
     * Sets portfolio_weights
     *
     * @param float[] $portfolio_weights portfolio_weights
     *
     * @return $this
     */
    public function setPortfolioWeights($portfolio_weights)
    {
        $this->container['portfolio_weights'] = $portfolio_weights;

        return $this;
    }

    /**
     * Gets portfolio_id
     *
     * @return string
     */
    public function getPortfolioId()
    {
        return $this->container['portfolio_id'];
    }

    /**
     * Sets portfolio_id
     *
     * @param string $portfolio_id portfolio_id
     *
     * @return $this
     */
    public function setPortfolioId($portfolio_id)
    {
        $this->container['portfolio_id'] = $portfolio_id;

        return $this;
    }

    /**
     * Gets result_type
     *
     * @return string
     */
    public function getResultType()
    {
        return $this->container['result_type'];
    }

    /**
     * Sets result_type
     *
     * @param string $result_type result_type
     *
     * @return $this
     */
    public function setResultType($result_type)
    {
        $allowedValues = $this->getResultTypeAllowableValues();
        if (!is_null($result_type) && !in_array($result_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'result_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['result_type'] = $result_type;

        return $this;
    }

    /**
     * Gets account_id
     *
     * @return string
     */
    public function getAccountId()
    {
        return $this->container['account_id'];
    }

    /**
     * Sets account_id
     *
     * @param string $account_id account_id
     *
     * @return $this
     */
    public function setAccountId($account_id)
    {
        $this->container['account_id'] = $account_id;

        return $this;
    }

    /**
     * Gets trading_days_per_year
     *
     * @return int
     */
    public function getTradingDaysPerYear()
    {
        return $this->container['trading_days_per_year'];
    }

    /**
     * Sets trading_days_per_year
     *
     * @param int $trading_days_per_year trading_days_per_year
     *
     * @return $this
     */
    public function setTradingDaysPerYear($trading_days_per_year)
    {

        if (!is_null($trading_days_per_year) && ($trading_days_per_year < 1)) {
            throw new \InvalidArgumentException('invalid value for $trading_days_per_year when calling VariableAnnuityRequest., must be bigger than or equal to 1.');
        }

        $this->container['trading_days_per_year'] = $trading_days_per_year;

        return $this;
    }

    /**
     * Gets use_proxy_data
     *
     * @return bool
     */
    public function getUseProxyData()
    {
        return $this->container['use_proxy_data'];
    }

    /**
     * Sets use_proxy_data
     *
     * @param bool $use_proxy_data use_proxy_data
     *
     * @return $this
     */
    public function setUseProxyData($use_proxy_data)
    {
        $this->container['use_proxy_data'] = $use_proxy_data;

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
            throw new \InvalidArgumentException('invalid value for $initial_balance when calling VariableAnnuityRequest., must be bigger than or equal to 0.');
        }

        $this->container['initial_balance'] = $initial_balance;

        return $this;
    }

    /**
     * Gets market_data_source
     *
     * @return string
     */
    public function getMarketDataSource()
    {
        return $this->container['market_data_source'];
    }

    /**
     * Sets market_data_source
     *
     * @param string $market_data_source market_data_source
     *
     * @return $this
     */
    public function setMarketDataSource($market_data_source)
    {
        $allowedValues = $this->getMarketDataSourceAllowableValues();
        if (!is_null($market_data_source) && !in_array($market_data_source, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'market_data_source', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['market_data_source'] = $market_data_source;

        return $this;
    }

    /**
     * Gets frequency_interval
     *
     * @return string
     */
    public function getFrequencyInterval()
    {
        return $this->container['frequency_interval'];
    }

    /**
     * Sets frequency_interval
     *
     * @param string $frequency_interval frequency_interval
     *
     * @return $this
     */
    public function setFrequencyInterval($frequency_interval)
    {
        $allowedValues = $this->getFrequencyIntervalAllowableValues();
        if (!is_null($frequency_interval) && !in_array($frequency_interval, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'frequency_interval', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['frequency_interval'] = $frequency_interval;

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


