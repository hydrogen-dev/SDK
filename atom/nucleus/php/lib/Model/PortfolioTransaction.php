<?php
/**
 * PortfolioTransaction
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
 * OpenAPI spec version: 1.9.0
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
 * PortfolioTransaction Class Doc Comment
 *
 * @category Class
 * @description PortfolioTransaction Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class PortfolioTransaction implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'PortfolioTransaction';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'account_id' => 'string',
        'amount' => 'double',
        'balance' => 'double',
        'category' => 'string',
        'check' => '\com\hydrogen\nucleus\Model\Check',
        'create_date' => '\DateTime',
        'currency_code' => 'string',
        'date' => '\DateTime',
        'date_available' => '\DateTime',
        'description' => 'string',
        'funding_id' => 'string',
        'id' => 'string',
        'is_cleansed' => 'bool',
        'is_disputed' => 'bool',
        'is_read' => 'bool',
        'is_recurring' => 'bool',
        'location' => '\com\hydrogen\nucleus\Model\Location',
        'memo' => 'string',
        'merchant' => 'string',
        'merchant_category_code' => 'int',
        'merchant_id' => 'string',
        'metadata' => 'map[string,string]',
        'mid' => 'string',
        'model_id' => 'string',
        'portfolio_id' => 'string',
        'price' => 'double',
        'quantity' => 'double',
        'secondary_id' => 'string',
        'security_id' => 'string',
        'status' => 'string',
        'subcategory' => 'string',
        'transaction_category_id' => 'string',
        'transaction_code_id' => 'string',
        'update_date' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'account_id' => 'uuid',
        'amount' => 'double',
        'balance' => 'double',
        'category' => null,
        'check' => null,
        'create_date' => 'date-time',
        'currency_code' => null,
        'date' => 'date-time',
        'date_available' => 'date-time',
        'description' => null,
        'funding_id' => 'uuid',
        'id' => 'uuid',
        'is_cleansed' => null,
        'is_disputed' => null,
        'is_read' => null,
        'is_recurring' => null,
        'location' => null,
        'memo' => null,
        'merchant' => null,
        'merchant_category_code' => 'int32',
        'merchant_id' => 'uuid',
        'metadata' => null,
        'mid' => null,
        'model_id' => 'uuid',
        'portfolio_id' => 'uuid',
        'price' => 'double',
        'quantity' => 'double',
        'secondary_id' => null,
        'security_id' => 'uuid',
        'status' => null,
        'subcategory' => null,
        'transaction_category_id' => 'uuid',
        'transaction_code_id' => 'uuid',
        'update_date' => 'date-time'
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
        'account_id' => 'account_id',
        'amount' => 'amount',
        'balance' => 'balance',
        'category' => 'category',
        'check' => 'check',
        'create_date' => 'create_date',
        'currency_code' => 'currency_code',
        'date' => 'date',
        'date_available' => 'date_available',
        'description' => 'description',
        'funding_id' => 'funding_id',
        'id' => 'id',
        'is_cleansed' => 'is_cleansed',
        'is_disputed' => 'is_disputed',
        'is_read' => 'is_read',
        'is_recurring' => 'is_recurring',
        'location' => 'location',
        'memo' => 'memo',
        'merchant' => 'merchant',
        'merchant_category_code' => 'merchant_category_code',
        'merchant_id' => 'merchant_id',
        'metadata' => 'metadata',
        'mid' => 'mid',
        'model_id' => 'model_id',
        'portfolio_id' => 'portfolio_id',
        'price' => 'price',
        'quantity' => 'quantity',
        'secondary_id' => 'secondary_id',
        'security_id' => 'security_id',
        'status' => 'status',
        'subcategory' => 'subcategory',
        'transaction_category_id' => 'transaction_category_id',
        'transaction_code_id' => 'transaction_code_id',
        'update_date' => 'update_date'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'account_id' => 'setAccountId',
        'amount' => 'setAmount',
        'balance' => 'setBalance',
        'category' => 'setCategory',
        'check' => 'setCheck',
        'create_date' => 'setCreateDate',
        'currency_code' => 'setCurrencyCode',
        'date' => 'setDate',
        'date_available' => 'setDateAvailable',
        'description' => 'setDescription',
        'funding_id' => 'setFundingId',
        'id' => 'setId',
        'is_cleansed' => 'setIsCleansed',
        'is_disputed' => 'setIsDisputed',
        'is_read' => 'setIsRead',
        'is_recurring' => 'setIsRecurring',
        'location' => 'setLocation',
        'memo' => 'setMemo',
        'merchant' => 'setMerchant',
        'merchant_category_code' => 'setMerchantCategoryCode',
        'merchant_id' => 'setMerchantId',
        'metadata' => 'setMetadata',
        'mid' => 'setMid',
        'model_id' => 'setModelId',
        'portfolio_id' => 'setPortfolioId',
        'price' => 'setPrice',
        'quantity' => 'setQuantity',
        'secondary_id' => 'setSecondaryId',
        'security_id' => 'setSecurityId',
        'status' => 'setStatus',
        'subcategory' => 'setSubcategory',
        'transaction_category_id' => 'setTransactionCategoryId',
        'transaction_code_id' => 'setTransactionCodeId',
        'update_date' => 'setUpdateDate'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'account_id' => 'getAccountId',
        'amount' => 'getAmount',
        'balance' => 'getBalance',
        'category' => 'getCategory',
        'check' => 'getCheck',
        'create_date' => 'getCreateDate',
        'currency_code' => 'getCurrencyCode',
        'date' => 'getDate',
        'date_available' => 'getDateAvailable',
        'description' => 'getDescription',
        'funding_id' => 'getFundingId',
        'id' => 'getId',
        'is_cleansed' => 'getIsCleansed',
        'is_disputed' => 'getIsDisputed',
        'is_read' => 'getIsRead',
        'is_recurring' => 'getIsRecurring',
        'location' => 'getLocation',
        'memo' => 'getMemo',
        'merchant' => 'getMerchant',
        'merchant_category_code' => 'getMerchantCategoryCode',
        'merchant_id' => 'getMerchantId',
        'metadata' => 'getMetadata',
        'mid' => 'getMid',
        'model_id' => 'getModelId',
        'portfolio_id' => 'getPortfolioId',
        'price' => 'getPrice',
        'quantity' => 'getQuantity',
        'secondary_id' => 'getSecondaryId',
        'security_id' => 'getSecurityId',
        'status' => 'getStatus',
        'subcategory' => 'getSubcategory',
        'transaction_category_id' => 'getTransactionCategoryId',
        'transaction_code_id' => 'getTransactionCodeId',
        'update_date' => 'getUpdateDate'
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
        $this->container['account_id'] = isset($data['account_id']) ? $data['account_id'] : null;
        $this->container['amount'] = isset($data['amount']) ? $data['amount'] : null;
        $this->container['balance'] = isset($data['balance']) ? $data['balance'] : null;
        $this->container['category'] = isset($data['category']) ? $data['category'] : null;
        $this->container['check'] = isset($data['check']) ? $data['check'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['currency_code'] = isset($data['currency_code']) ? $data['currency_code'] : null;
        $this->container['date'] = isset($data['date']) ? $data['date'] : null;
        $this->container['date_available'] = isset($data['date_available']) ? $data['date_available'] : null;
        $this->container['description'] = isset($data['description']) ? $data['description'] : null;
        $this->container['funding_id'] = isset($data['funding_id']) ? $data['funding_id'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['is_cleansed'] = isset($data['is_cleansed']) ? $data['is_cleansed'] : null;
        $this->container['is_disputed'] = isset($data['is_disputed']) ? $data['is_disputed'] : null;
        $this->container['is_read'] = isset($data['is_read']) ? $data['is_read'] : null;
        $this->container['is_recurring'] = isset($data['is_recurring']) ? $data['is_recurring'] : null;
        $this->container['location'] = isset($data['location']) ? $data['location'] : null;
        $this->container['memo'] = isset($data['memo']) ? $data['memo'] : null;
        $this->container['merchant'] = isset($data['merchant']) ? $data['merchant'] : null;
        $this->container['merchant_category_code'] = isset($data['merchant_category_code']) ? $data['merchant_category_code'] : null;
        $this->container['merchant_id'] = isset($data['merchant_id']) ? $data['merchant_id'] : null;
        $this->container['metadata'] = isset($data['metadata']) ? $data['metadata'] : null;
        $this->container['mid'] = isset($data['mid']) ? $data['mid'] : null;
        $this->container['model_id'] = isset($data['model_id']) ? $data['model_id'] : null;
        $this->container['portfolio_id'] = isset($data['portfolio_id']) ? $data['portfolio_id'] : null;
        $this->container['price'] = isset($data['price']) ? $data['price'] : null;
        $this->container['quantity'] = isset($data['quantity']) ? $data['quantity'] : null;
        $this->container['secondary_id'] = isset($data['secondary_id']) ? $data['secondary_id'] : null;
        $this->container['security_id'] = isset($data['security_id']) ? $data['security_id'] : null;
        $this->container['status'] = isset($data['status']) ? $data['status'] : null;
        $this->container['subcategory'] = isset($data['subcategory']) ? $data['subcategory'] : null;
        $this->container['transaction_category_id'] = isset($data['transaction_category_id']) ? $data['transaction_category_id'] : null;
        $this->container['transaction_code_id'] = isset($data['transaction_code_id']) ? $data['transaction_code_id'] : null;
        $this->container['update_date'] = isset($data['update_date']) ? $data['update_date'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['account_id'] === null) {
            $invalidProperties[] = "'account_id' can't be null";
        }
        if ($this->container['date'] === null) {
            $invalidProperties[] = "'date' can't be null";
        }
        if ($this->container['model_id'] === null) {
            $invalidProperties[] = "'model_id' can't be null";
        }
        if ($this->container['portfolio_id'] === null) {
            $invalidProperties[] = "'portfolio_id' can't be null";
        }
        if ($this->container['transaction_code_id'] === null) {
            $invalidProperties[] = "'transaction_code_id' can't be null";
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
     * @param string $account_id accountId
     *
     * @return $this
     */
    public function setAccountId($account_id)
    {
        $this->container['account_id'] = $account_id;

        return $this;
    }

    /**
     * Gets amount
     *
     * @return double
     */
    public function getAmount()
    {
        return $this->container['amount'];
    }

    /**
     * Sets amount
     *
     * @param double $amount amount
     *
     * @return $this
     */
    public function setAmount($amount)
    {
        $this->container['amount'] = $amount;

        return $this;
    }

    /**
     * Gets balance
     *
     * @return double
     */
    public function getBalance()
    {
        return $this->container['balance'];
    }

    /**
     * Sets balance
     *
     * @param double $balance balance
     *
     * @return $this
     */
    public function setBalance($balance)
    {
        $this->container['balance'] = $balance;

        return $this;
    }

    /**
     * Gets category
     *
     * @return string
     */
    public function getCategory()
    {
        return $this->container['category'];
    }

    /**
     * Sets category
     *
     * @param string $category category
     *
     * @return $this
     */
    public function setCategory($category)
    {
        $this->container['category'] = $category;

        return $this;
    }

    /**
     * Gets check
     *
     * @return \com\hydrogen\nucleus\Model\Check
     */
    public function getCheck()
    {
        return $this->container['check'];
    }

    /**
     * Sets check
     *
     * @param \com\hydrogen\nucleus\Model\Check $check check
     *
     * @return $this
     */
    public function setCheck($check)
    {
        $this->container['check'] = $check;

        return $this;
    }

    /**
     * Gets create_date
     *
     * @return \DateTime
     */
    public function getCreateDate()
    {
        return $this->container['create_date'];
    }

    /**
     * Sets create_date
     *
     * @param \DateTime $create_date create_date
     *
     * @return $this
     */
    public function setCreateDate($create_date)
    {
        $this->container['create_date'] = $create_date;

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
     * Gets date
     *
     * @return \DateTime
     */
    public function getDate()
    {
        return $this->container['date'];
    }

    /**
     * Sets date
     *
     * @param \DateTime $date date
     *
     * @return $this
     */
    public function setDate($date)
    {
        $this->container['date'] = $date;

        return $this;
    }

    /**
     * Gets date_available
     *
     * @return \DateTime
     */
    public function getDateAvailable()
    {
        return $this->container['date_available'];
    }

    /**
     * Sets date_available
     *
     * @param \DateTime $date_available dateAvailable
     *
     * @return $this
     */
    public function setDateAvailable($date_available)
    {
        $this->container['date_available'] = $date_available;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string $description description
     *
     * @return $this
     */
    public function setDescription($description)
    {
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets funding_id
     *
     * @return string
     */
    public function getFundingId()
    {
        return $this->container['funding_id'];
    }

    /**
     * Sets funding_id
     *
     * @param string $funding_id fundingId
     *
     * @return $this
     */
    public function setFundingId($funding_id)
    {
        $this->container['funding_id'] = $funding_id;

        return $this;
    }

    /**
     * Gets id
     *
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id id
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets is_cleansed
     *
     * @return bool
     */
    public function getIsCleansed()
    {
        return $this->container['is_cleansed'];
    }

    /**
     * Sets is_cleansed
     *
     * @param bool $is_cleansed is_cleansed
     *
     * @return $this
     */
    public function setIsCleansed($is_cleansed)
    {
        $this->container['is_cleansed'] = $is_cleansed;

        return $this;
    }

    /**
     * Gets is_disputed
     *
     * @return bool
     */
    public function getIsDisputed()
    {
        return $this->container['is_disputed'];
    }

    /**
     * Sets is_disputed
     *
     * @param bool $is_disputed is_disputed
     *
     * @return $this
     */
    public function setIsDisputed($is_disputed)
    {
        $this->container['is_disputed'] = $is_disputed;

        return $this;
    }

    /**
     * Gets is_read
     *
     * @return bool
     */
    public function getIsRead()
    {
        return $this->container['is_read'];
    }

    /**
     * Sets is_read
     *
     * @param bool $is_read isRead
     *
     * @return $this
     */
    public function setIsRead($is_read)
    {
        $this->container['is_read'] = $is_read;

        return $this;
    }

    /**
     * Gets is_recurring
     *
     * @return bool
     */
    public function getIsRecurring()
    {
        return $this->container['is_recurring'];
    }

    /**
     * Sets is_recurring
     *
     * @param bool $is_recurring is_recurring
     *
     * @return $this
     */
    public function setIsRecurring($is_recurring)
    {
        $this->container['is_recurring'] = $is_recurring;

        return $this;
    }

    /**
     * Gets location
     *
     * @return \com\hydrogen\nucleus\Model\Location
     */
    public function getLocation()
    {
        return $this->container['location'];
    }

    /**
     * Sets location
     *
     * @param \com\hydrogen\nucleus\Model\Location $location location
     *
     * @return $this
     */
    public function setLocation($location)
    {
        $this->container['location'] = $location;

        return $this;
    }

    /**
     * Gets memo
     *
     * @return string
     */
    public function getMemo()
    {
        return $this->container['memo'];
    }

    /**
     * Sets memo
     *
     * @param string $memo memo
     *
     * @return $this
     */
    public function setMemo($memo)
    {
        $this->container['memo'] = $memo;

        return $this;
    }

    /**
     * Gets merchant
     *
     * @return string
     */
    public function getMerchant()
    {
        return $this->container['merchant'];
    }

    /**
     * Sets merchant
     *
     * @param string $merchant merchant
     *
     * @return $this
     */
    public function setMerchant($merchant)
    {
        $this->container['merchant'] = $merchant;

        return $this;
    }

    /**
     * Gets merchant_category_code
     *
     * @return int
     */
    public function getMerchantCategoryCode()
    {
        return $this->container['merchant_category_code'];
    }

    /**
     * Sets merchant_category_code
     *
     * @param int $merchant_category_code merchant_category_code
     *
     * @return $this
     */
    public function setMerchantCategoryCode($merchant_category_code)
    {
        $this->container['merchant_category_code'] = $merchant_category_code;

        return $this;
    }

    /**
     * Gets merchant_id
     *
     * @return string
     */
    public function getMerchantId()
    {
        return $this->container['merchant_id'];
    }

    /**
     * Sets merchant_id
     *
     * @param string $merchant_id merchantId
     *
     * @return $this
     */
    public function setMerchantId($merchant_id)
    {
        $this->container['merchant_id'] = $merchant_id;

        return $this;
    }

    /**
     * Gets metadata
     *
     * @return map[string,string]
     */
    public function getMetadata()
    {
        return $this->container['metadata'];
    }

    /**
     * Sets metadata
     *
     * @param map[string,string] $metadata metadata
     *
     * @return $this
     */
    public function setMetadata($metadata)
    {
        $this->container['metadata'] = $metadata;

        return $this;
    }

    /**
     * Gets mid
     *
     * @return string
     */
    public function getMid()
    {
        return $this->container['mid'];
    }

    /**
     * Sets mid
     *
     * @param string $mid mid
     *
     * @return $this
     */
    public function setMid($mid)
    {
        $this->container['mid'] = $mid;

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
     * @param string $model_id modelId
     *
     * @return $this
     */
    public function setModelId($model_id)
    {
        $this->container['model_id'] = $model_id;

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
     * @param string $portfolio_id portfolioId
     *
     * @return $this
     */
    public function setPortfolioId($portfolio_id)
    {
        $this->container['portfolio_id'] = $portfolio_id;

        return $this;
    }

    /**
     * Gets price
     *
     * @return double
     */
    public function getPrice()
    {
        return $this->container['price'];
    }

    /**
     * Sets price
     *
     * @param double $price price
     *
     * @return $this
     */
    public function setPrice($price)
    {
        $this->container['price'] = $price;

        return $this;
    }

    /**
     * Gets quantity
     *
     * @return double
     */
    public function getQuantity()
    {
        return $this->container['quantity'];
    }

    /**
     * Sets quantity
     *
     * @param double $quantity quantity
     *
     * @return $this
     */
    public function setQuantity($quantity)
    {
        $this->container['quantity'] = $quantity;

        return $this;
    }

    /**
     * Gets secondary_id
     *
     * @return string
     */
    public function getSecondaryId()
    {
        return $this->container['secondary_id'];
    }

    /**
     * Sets secondary_id
     *
     * @param string $secondary_id secondary_id
     *
     * @return $this
     */
    public function setSecondaryId($secondary_id)
    {
        $this->container['secondary_id'] = $secondary_id;

        return $this;
    }

    /**
     * Gets security_id
     *
     * @return string
     */
    public function getSecurityId()
    {
        return $this->container['security_id'];
    }

    /**
     * Sets security_id
     *
     * @param string $security_id securityId
     *
     * @return $this
     */
    public function setSecurityId($security_id)
    {
        $this->container['security_id'] = $security_id;

        return $this;
    }

    /**
     * Gets status
     *
     * @return string
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param string $status status
     *
     * @return $this
     */
    public function setStatus($status)
    {
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets subcategory
     *
     * @return string
     */
    public function getSubcategory()
    {
        return $this->container['subcategory'];
    }

    /**
     * Sets subcategory
     *
     * @param string $subcategory subcategory
     *
     * @return $this
     */
    public function setSubcategory($subcategory)
    {
        $this->container['subcategory'] = $subcategory;

        return $this;
    }

    /**
     * Gets transaction_category_id
     *
     * @return string
     */
    public function getTransactionCategoryId()
    {
        return $this->container['transaction_category_id'];
    }

    /**
     * Sets transaction_category_id
     *
     * @param string $transaction_category_id transactionCategoryId
     *
     * @return $this
     */
    public function setTransactionCategoryId($transaction_category_id)
    {
        $this->container['transaction_category_id'] = $transaction_category_id;

        return $this;
    }

    /**
     * Gets transaction_code_id
     *
     * @return string
     */
    public function getTransactionCodeId()
    {
        return $this->container['transaction_code_id'];
    }

    /**
     * Sets transaction_code_id
     *
     * @param string $transaction_code_id alertId
     *
     * @return $this
     */
    public function setTransactionCodeId($transaction_code_id)
    {
        $this->container['transaction_code_id'] = $transaction_code_id;

        return $this;
    }

    /**
     * Gets update_date
     *
     * @return \DateTime
     */
    public function getUpdateDate()
    {
        return $this->container['update_date'];
    }

    /**
     * Sets update_date
     *
     * @param \DateTime $update_date update_date
     *
     * @return $this
     */
    public function setUpdateDate($update_date)
    {
        $this->container['update_date'] = $update_date;

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


