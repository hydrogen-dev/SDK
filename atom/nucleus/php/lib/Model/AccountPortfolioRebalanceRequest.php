<?php
/**
 * AccountPortfolioRebalanceRequest
 *
 * PHP version 5
 *
 * @category Class
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.19
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace com\hydrogen\nucleus\Model;

use \ArrayAccess;
use \com\hydrogen\nucleus\ObjectSerializer;

/**
 * AccountPortfolioRebalanceRequest Class Doc Comment
 *
 * @category Class
 * @description AccountPortfolioRebalanceRequest Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AccountPortfolioRebalanceRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'AccountPortfolioRebalanceRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'buy_threshold' => 'double',
        'buy_transaction_code_id' => 'string',
        'cash_portfolio_id' => 'string',
        'cash_sec_id' => 'string',
        'client_id' => 'string',
        'commit_orders' => 'bool',
        'non_fractional' => 'bool',
        'port_threshold' => 'double',
        'restrictions_on' => 'bool',
        'sell_threshold' => 'double',
        'sell_transaction_code_id' => 'string',
        'tenant_id' => 'string',
        'use_cash_available' => 'bool',
        'use_strategic' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'buy_threshold' => 'double',
        'buy_transaction_code_id' => 'uuid',
        'cash_portfolio_id' => 'uuid',
        'cash_sec_id' => 'uuid',
        'client_id' => 'uuid',
        'commit_orders' => null,
        'non_fractional' => null,
        'port_threshold' => 'double',
        'restrictions_on' => null,
        'sell_threshold' => 'double',
        'sell_transaction_code_id' => 'uuid',
        'tenant_id' => 'uuid',
        'use_cash_available' => null,
        'use_strategic' => null
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
        'buy_threshold' => 'buy_threshold',
        'buy_transaction_code_id' => 'buy_transaction_code_id',
        'cash_portfolio_id' => 'cash_portfolio_id',
        'cash_sec_id' => 'cash_sec_id',
        'client_id' => 'client_id',
        'commit_orders' => 'commit_orders',
        'non_fractional' => 'non_fractional',
        'port_threshold' => 'port_threshold',
        'restrictions_on' => 'restrictions_on',
        'sell_threshold' => 'sell_threshold',
        'sell_transaction_code_id' => 'sell_transaction_code_id',
        'tenant_id' => 'tenant_id',
        'use_cash_available' => 'use_cash_available',
        'use_strategic' => 'use_strategic'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'buy_threshold' => 'setBuyThreshold',
        'buy_transaction_code_id' => 'setBuyTransactionCodeId',
        'cash_portfolio_id' => 'setCashPortfolioId',
        'cash_sec_id' => 'setCashSecId',
        'client_id' => 'setClientId',
        'commit_orders' => 'setCommitOrders',
        'non_fractional' => 'setNonFractional',
        'port_threshold' => 'setPortThreshold',
        'restrictions_on' => 'setRestrictionsOn',
        'sell_threshold' => 'setSellThreshold',
        'sell_transaction_code_id' => 'setSellTransactionCodeId',
        'tenant_id' => 'setTenantId',
        'use_cash_available' => 'setUseCashAvailable',
        'use_strategic' => 'setUseStrategic'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'buy_threshold' => 'getBuyThreshold',
        'buy_transaction_code_id' => 'getBuyTransactionCodeId',
        'cash_portfolio_id' => 'getCashPortfolioId',
        'cash_sec_id' => 'getCashSecId',
        'client_id' => 'getClientId',
        'commit_orders' => 'getCommitOrders',
        'non_fractional' => 'getNonFractional',
        'port_threshold' => 'getPortThreshold',
        'restrictions_on' => 'getRestrictionsOn',
        'sell_threshold' => 'getSellThreshold',
        'sell_transaction_code_id' => 'getSellTransactionCodeId',
        'tenant_id' => 'getTenantId',
        'use_cash_available' => 'getUseCashAvailable',
        'use_strategic' => 'getUseStrategic'
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
        $this->container['buy_threshold'] = isset($data['buy_threshold']) ? $data['buy_threshold'] : null;
        $this->container['buy_transaction_code_id'] = isset($data['buy_transaction_code_id']) ? $data['buy_transaction_code_id'] : null;
        $this->container['cash_portfolio_id'] = isset($data['cash_portfolio_id']) ? $data['cash_portfolio_id'] : null;
        $this->container['cash_sec_id'] = isset($data['cash_sec_id']) ? $data['cash_sec_id'] : null;
        $this->container['client_id'] = isset($data['client_id']) ? $data['client_id'] : null;
        $this->container['commit_orders'] = isset($data['commit_orders']) ? $data['commit_orders'] : null;
        $this->container['non_fractional'] = isset($data['non_fractional']) ? $data['non_fractional'] : null;
        $this->container['port_threshold'] = isset($data['port_threshold']) ? $data['port_threshold'] : null;
        $this->container['restrictions_on'] = isset($data['restrictions_on']) ? $data['restrictions_on'] : null;
        $this->container['sell_threshold'] = isset($data['sell_threshold']) ? $data['sell_threshold'] : null;
        $this->container['sell_transaction_code_id'] = isset($data['sell_transaction_code_id']) ? $data['sell_transaction_code_id'] : null;
        $this->container['tenant_id'] = isset($data['tenant_id']) ? $data['tenant_id'] : null;
        $this->container['use_cash_available'] = isset($data['use_cash_available']) ? $data['use_cash_available'] : null;
        $this->container['use_strategic'] = isset($data['use_strategic']) ? $data['use_strategic'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

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
     * Gets buy_threshold
     *
     * @return double
     */
    public function getBuyThreshold()
    {
        return $this->container['buy_threshold'];
    }

    /**
     * Sets buy_threshold
     *
     * @param double $buy_threshold buyThreshold
     *
     * @return $this
     */
    public function setBuyThreshold($buy_threshold)
    {
        $this->container['buy_threshold'] = $buy_threshold;

        return $this;
    }

    /**
     * Gets buy_transaction_code_id
     *
     * @return string
     */
    public function getBuyTransactionCodeId()
    {
        return $this->container['buy_transaction_code_id'];
    }

    /**
     * Sets buy_transaction_code_id
     *
     * @param string $buy_transaction_code_id buyTransactionCodeId
     *
     * @return $this
     */
    public function setBuyTransactionCodeId($buy_transaction_code_id)
    {
        $this->container['buy_transaction_code_id'] = $buy_transaction_code_id;

        return $this;
    }

    /**
     * Gets cash_portfolio_id
     *
     * @return string
     */
    public function getCashPortfolioId()
    {
        return $this->container['cash_portfolio_id'];
    }

    /**
     * Sets cash_portfolio_id
     *
     * @param string $cash_portfolio_id cashPortfolioId
     *
     * @return $this
     */
    public function setCashPortfolioId($cash_portfolio_id)
    {
        $this->container['cash_portfolio_id'] = $cash_portfolio_id;

        return $this;
    }

    /**
     * Gets cash_sec_id
     *
     * @return string
     */
    public function getCashSecId()
    {
        return $this->container['cash_sec_id'];
    }

    /**
     * Sets cash_sec_id
     *
     * @param string $cash_sec_id cashSecId
     *
     * @return $this
     */
    public function setCashSecId($cash_sec_id)
    {
        $this->container['cash_sec_id'] = $cash_sec_id;

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
     * @param string $client_id clientId
     *
     * @return $this
     */
    public function setClientId($client_id)
    {
        $this->container['client_id'] = $client_id;

        return $this;
    }

    /**
     * Gets commit_orders
     *
     * @return bool
     */
    public function getCommitOrders()
    {
        return $this->container['commit_orders'];
    }

    /**
     * Sets commit_orders
     *
     * @param bool $commit_orders commitOrders
     *
     * @return $this
     */
    public function setCommitOrders($commit_orders)
    {
        $this->container['commit_orders'] = $commit_orders;

        return $this;
    }

    /**
     * Gets non_fractional
     *
     * @return bool
     */
    public function getNonFractional()
    {
        return $this->container['non_fractional'];
    }

    /**
     * Sets non_fractional
     *
     * @param bool $non_fractional nonFractional
     *
     * @return $this
     */
    public function setNonFractional($non_fractional)
    {
        $this->container['non_fractional'] = $non_fractional;

        return $this;
    }

    /**
     * Gets port_threshold
     *
     * @return double
     */
    public function getPortThreshold()
    {
        return $this->container['port_threshold'];
    }

    /**
     * Sets port_threshold
     *
     * @param double $port_threshold portThreshold
     *
     * @return $this
     */
    public function setPortThreshold($port_threshold)
    {
        $this->container['port_threshold'] = $port_threshold;

        return $this;
    }

    /**
     * Gets restrictions_on
     *
     * @return bool
     */
    public function getRestrictionsOn()
    {
        return $this->container['restrictions_on'];
    }

    /**
     * Sets restrictions_on
     *
     * @param bool $restrictions_on restrictionsOn
     *
     * @return $this
     */
    public function setRestrictionsOn($restrictions_on)
    {
        $this->container['restrictions_on'] = $restrictions_on;

        return $this;
    }

    /**
     * Gets sell_threshold
     *
     * @return double
     */
    public function getSellThreshold()
    {
        return $this->container['sell_threshold'];
    }

    /**
     * Sets sell_threshold
     *
     * @param double $sell_threshold sellThreshold
     *
     * @return $this
     */
    public function setSellThreshold($sell_threshold)
    {
        $this->container['sell_threshold'] = $sell_threshold;

        return $this;
    }

    /**
     * Gets sell_transaction_code_id
     *
     * @return string
     */
    public function getSellTransactionCodeId()
    {
        return $this->container['sell_transaction_code_id'];
    }

    /**
     * Sets sell_transaction_code_id
     *
     * @param string $sell_transaction_code_id sellTransactionCodeId
     *
     * @return $this
     */
    public function setSellTransactionCodeId($sell_transaction_code_id)
    {
        $this->container['sell_transaction_code_id'] = $sell_transaction_code_id;

        return $this;
    }

    /**
     * Gets tenant_id
     *
     * @return string
     */
    public function getTenantId()
    {
        return $this->container['tenant_id'];
    }

    /**
     * Sets tenant_id
     *
     * @param string $tenant_id tenantId
     *
     * @return $this
     */
    public function setTenantId($tenant_id)
    {
        $this->container['tenant_id'] = $tenant_id;

        return $this;
    }

    /**
     * Gets use_cash_available
     *
     * @return bool
     */
    public function getUseCashAvailable()
    {
        return $this->container['use_cash_available'];
    }

    /**
     * Sets use_cash_available
     *
     * @param bool $use_cash_available useCashAvailable
     *
     * @return $this
     */
    public function setUseCashAvailable($use_cash_available)
    {
        $this->container['use_cash_available'] = $use_cash_available;

        return $this;
    }

    /**
     * Gets use_strategic
     *
     * @return bool
     */
    public function getUseStrategic()
    {
        return $this->container['use_strategic'];
    }

    /**
     * Sets use_strategic
     *
     * @param bool $use_strategic useStrategic
     *
     * @return $this
     */
    public function setUseStrategic($use_strategic)
    {
        $this->container['use_strategic'] = $use_strategic;

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


