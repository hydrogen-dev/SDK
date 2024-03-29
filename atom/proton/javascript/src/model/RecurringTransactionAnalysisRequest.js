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
    root.HydrogenProtonApi.RecurringTransactionAnalysisRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The RecurringTransactionAnalysisRequest model module.
   * @module model/RecurringTransactionAnalysisRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>RecurringTransactionAnalysisRequest</code>.
   * @alias module:model/RecurringTransactionAnalysisRequest
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>RecurringTransactionAnalysisRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RecurringTransactionAnalysisRequest} obj Optional instance to populate.
   * @return {module:model/RecurringTransactionAnalysisRequest} The populated <code>RecurringTransactionAnalysisRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('currency_code'))
        obj.currencyCode = ApiClient.convertToType(data['currency_code'], 'String');
      if (data.hasOwnProperty('client_id'))
        obj.clientId = ApiClient.convertToType(data['client_id'], 'String');
      if (data.hasOwnProperty('scope'))
        obj.scope = ApiClient.convertToType(data['scope'], 'String');
      if (data.hasOwnProperty('end_date'))
        obj.endDate = ApiClient.convertToType(data['end_date'], 'Date');
      if (data.hasOwnProperty('account_ids'))
        obj.accountIds = ApiClient.convertToType(data['account_ids'], ['String']);
      if (data.hasOwnProperty('currency_conversion'))
        obj.currencyConversion = ApiClient.convertToType(data['currency_conversion'], 'String');
      if (data.hasOwnProperty('interval_deviation_threshold'))
        obj.intervalDeviationThreshold = ApiClient.convertToType(data['interval_deviation_threshold'], 'Number');
      if (data.hasOwnProperty('amount_deviation_threshold'))
        obj.amountDeviationThreshold = ApiClient.convertToType(data['amount_deviation_threshold'], 'Number');
      if (data.hasOwnProperty('analyze_transactions'))
        obj.analyzeTransactions = ApiClient.convertToType(data['analyze_transactions'], 'Boolean');
      if (data.hasOwnProperty('start_date'))
        obj.startDate = ApiClient.convertToType(data['start_date'], 'Date');
      if (data.hasOwnProperty('flag_transactions'))
        obj.flagTransactions = ApiClient.convertToType(data['flag_transactions'], 'Boolean');
      if (data.hasOwnProperty('transaction_status_scope'))
        obj.transactionStatusScope = ApiClient.convertToType(data['transaction_status_scope'], ['String']);
      if (data.hasOwnProperty('only_cleansed'))
        obj.onlyCleansed = ApiClient.convertToType(data['only_cleansed'], 'Boolean');
      if (data.hasOwnProperty('aggregation_account_ids'))
        obj.aggregationAccountIds = ApiClient.convertToType(data['aggregation_account_ids'], ['String']);
      if (data.hasOwnProperty('show_recurring_details'))
        obj.showRecurringDetails = ApiClient.convertToType(data['show_recurring_details'], 'Boolean');
    }
    return obj;
  }

  /**
   * @member {String} currencyCode
   */
  exports.prototype.currencyCode = undefined;

  /**
   * @member {String} clientId
   */
  exports.prototype.clientId = undefined;

  /**
   * @member {module:model/RecurringTransactionAnalysisRequest.ScopeEnum} scope
   * @default 'all'
   */
  exports.prototype.scope = 'all';

  /**
   * @member {Date} endDate
   */
  exports.prototype.endDate = undefined;

  /**
   * @member {Array.<String>} accountIds
   */
  exports.prototype.accountIds = undefined;

  /**
   * @member {String} currencyConversion
   */
  exports.prototype.currencyConversion = undefined;

  /**
   * @member {Number} intervalDeviationThreshold
   * @default 3
   */
  exports.prototype.intervalDeviationThreshold = 3;

  /**
   * @member {Number} amountDeviationThreshold
   * @default 0.05
   */
  exports.prototype.amountDeviationThreshold = 0.05;

  /**
   * @member {Boolean} analyzeTransactions
   * @default true
   */
  exports.prototype.analyzeTransactions = true;

  /**
   * @member {Date} startDate
   */
  exports.prototype.startDate = undefined;

  /**
   * @member {Boolean} flagTransactions
   * @default false
   */
  exports.prototype.flagTransactions = false;

  /**
   * @member {Array.<String>} transactionStatusScope
   */
  exports.prototype.transactionStatusScope = undefined;

  /**
   * @member {Boolean} onlyCleansed
   * @default false
   */
  exports.prototype.onlyCleansed = false;

  /**
   * @member {Array.<String>} aggregationAccountIds
   */
  exports.prototype.aggregationAccountIds = undefined;

  /**
   * @member {Boolean} showRecurringDetails
   * @default false
   */
  exports.prototype.showRecurringDetails = false;



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
    internal: "internal"
  };

  return exports;

}));
