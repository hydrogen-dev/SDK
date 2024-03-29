/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.19
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.SpendingAnalysisRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The SpendingAnalysisRequest model module.
   * @module model/SpendingAnalysisRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>SpendingAnalysisRequest</code>.
   * @alias module:model/SpendingAnalysisRequest
   * @class
   * @param frequencyUnit {module:model/SpendingAnalysisRequest.FrequencyUnitEnum} 
   */
  var exports = function(frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
  };

  /**
   * Constructs a <code>SpendingAnalysisRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpendingAnalysisRequest} obj Optional instance to populate.
   * @return {module:model/SpendingAnalysisRequest} The populated <code>SpendingAnalysisRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('merchant_scope'))
        obj.merchantScope = ApiClient.convertToType(data['merchant_scope'], ['String']);
      if (data.hasOwnProperty('account_ids'))
        obj.accountIds = ApiClient.convertToType(data['account_ids'], ['String']);
      if (data.hasOwnProperty('business_ids'))
        obj.businessIds = ApiClient.convertToType(data['business_ids'], ['String']);
      if (data.hasOwnProperty('card_ids'))
        obj.cardIds = ApiClient.convertToType(data['card_ids'], ['String']);
      if (data.hasOwnProperty('show_by_merchant'))
        obj.showByMerchant = ApiClient.convertToType(data['show_by_merchant'], 'Boolean');
      if (data.hasOwnProperty('show_by_period'))
        obj.showByPeriod = ApiClient.convertToType(data['show_by_period'], 'Boolean');
      if (data.hasOwnProperty('only_cleansed'))
        obj.onlyCleansed = ApiClient.convertToType(data['only_cleansed'], 'Boolean');
      if (data.hasOwnProperty('frequency'))
        obj.frequency = ApiClient.convertToType(data['frequency'], 'Number');
      if (data.hasOwnProperty('end_date'))
        obj.endDate = ApiClient.convertToType(data['end_date'], 'Date');
      if (data.hasOwnProperty('as_of_date'))
        obj.asOfDate = ApiClient.convertToType(data['as_of_date'], 'Date');
      if (data.hasOwnProperty('transaction_category_scope'))
        obj.transactionCategoryScope = ApiClient.convertToType(data['transaction_category_scope'], ['String']);
      if (data.hasOwnProperty('start_date'))
        obj.startDate = ApiClient.convertToType(data['start_date'], 'Date');
      if (data.hasOwnProperty('card_status_scope'))
        obj.cardStatusScope = ApiClient.convertToType(data['card_status_scope'], ['String']);
      if (data.hasOwnProperty('only_active_clients'))
        obj.onlyActiveClients = ApiClient.convertToType(data['only_active_clients'], 'Boolean');
      if (data.hasOwnProperty('lookback_periods'))
        obj.lookbackPeriods = ApiClient.convertToType(data['lookback_periods'], 'Number');
      if (data.hasOwnProperty('frequency_unit'))
        obj.frequencyUnit = ApiClient.convertToType(data['frequency_unit'], 'String');
      if (data.hasOwnProperty('household_ids'))
        obj.householdIds = ApiClient.convertToType(data['household_ids'], ['String']);
      if (data.hasOwnProperty('aggregation_account_ids'))
        obj.aggregationAccountIds = ApiClient.convertToType(data['aggregation_account_ids'], ['String']);
      if (data.hasOwnProperty('currency_code'))
        obj.currencyCode = ApiClient.convertToType(data['currency_code'], 'String');
      if (data.hasOwnProperty('client_ids'))
        obj.clientIds = ApiClient.convertToType(data['client_ids'], ['String']);
      if (data.hasOwnProperty('scope'))
        obj.scope = ApiClient.convertToType(data['scope'], 'String');
      if (data.hasOwnProperty('currency_conversion'))
        obj.currencyConversion = ApiClient.convertToType(data['currency_conversion'], 'String');
      if (data.hasOwnProperty('transaction_status_scope'))
        obj.transactionStatusScope = ApiClient.convertToType(data['transaction_status_scope'], ['String']);
      if (data.hasOwnProperty('show_by_category'))
        obj.showByCategory = ApiClient.convertToType(data['show_by_category'], 'Boolean');
    }
    return obj;
  }

  /**
   * @member {Array.<String>} merchantScope
   */
  exports.prototype.merchantScope = undefined;

  /**
   * @member {Array.<String>} accountIds
   */
  exports.prototype.accountIds = undefined;

  /**
   * @member {Array.<String>} businessIds
   */
  exports.prototype.businessIds = undefined;

  /**
   * @member {Array.<String>} cardIds
   */
  exports.prototype.cardIds = undefined;

  /**
   * @member {Boolean} showByMerchant
   * @default false
   */
  exports.prototype.showByMerchant = false;

  /**
   * @member {Boolean} showByPeriod
   * @default false
   */
  exports.prototype.showByPeriod = false;

  /**
   * @member {Boolean} onlyCleansed
   * @default false
   */
  exports.prototype.onlyCleansed = false;

  /**
   * @member {Number} frequency
   * @default 1
   */
  exports.prototype.frequency = 1;

  /**
   * @member {Date} endDate
   */
  exports.prototype.endDate = undefined;

  /**
   * @member {Date} asOfDate
   */
  exports.prototype.asOfDate = undefined;

  /**
   * @member {Array.<String>} transactionCategoryScope
   */
  exports.prototype.transactionCategoryScope = undefined;

  /**
   * @member {Date} startDate
   */
  exports.prototype.startDate = undefined;

  /**
   * @member {Array.<String>} cardStatusScope
   */
  exports.prototype.cardStatusScope = undefined;

  /**
   * @member {Boolean} onlyActiveClients
   * @default false
   */
  exports.prototype.onlyActiveClients = false;

  /**
   * @member {Number} lookbackPeriods
   * @default 0
   */
  exports.prototype.lookbackPeriods = 0;

  /**
   * @member {module:model/SpendingAnalysisRequest.FrequencyUnitEnum} frequencyUnit
   */
  exports.prototype.frequencyUnit = undefined;

  /**
   * @member {Array.<String>} householdIds
   */
  exports.prototype.householdIds = undefined;

  /**
   * @member {Array.<String>} aggregationAccountIds
   */
  exports.prototype.aggregationAccountIds = undefined;

  /**
   * @member {String} currencyCode
   */
  exports.prototype.currencyCode = undefined;

  /**
   * @member {Array.<String>} clientIds
   */
  exports.prototype.clientIds = undefined;

  /**
   * @member {module:model/SpendingAnalysisRequest.ScopeEnum} scope
   * @default 'all'
   */
  exports.prototype.scope = 'all';

  /**
   * @member {String} currencyConversion
   */
  exports.prototype.currencyConversion = undefined;

  /**
   * @member {Array.<String>} transactionStatusScope
   */
  exports.prototype.transactionStatusScope = undefined;

  /**
   * @member {Boolean} showByCategory
   * @default false
   */
  exports.prototype.showByCategory = false;



  /**
   * Allowed values for the <code>frequencyUnit</code> property.
   * @enum {String}
   * @readonly
   */
  exports.FrequencyUnitEnum = {
    /**
     * value: "daily"
     * @const
     */
    daily: "daily",

    /**
     * value: "weekly"
     * @const
     */
    weekly: "weekly",

    /**
     * value: "bi-weekly"
     * @const
     */
    biWeekly: "bi-weekly",

    /**
     * value: "monthly"
     * @const
     */
    monthly: "monthly",

    /**
     * value: "quarterly"
     * @const
     */
    quarterly: "quarterly",

    /**
     * value: "annually"
     * @const
     */
    annually: "annually"
  };


  /**
   * Allowed values for the <code>scope</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ScopeEnum = {
    /**
     * value: "all"
     * @const
     */
    all: "all",

    /**
     * value: "external"
     * @const
     */
    external: "external",

    /**
     * value: "internal"
     * @const
     */
    internal: "internal",

    /**
     * value: "cards"
     * @const
     */
    cards: "cards"
  };

  return exports;

}));
