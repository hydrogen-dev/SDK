/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BankCredit', 'model/Cash', 'model/Investment'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./BankCredit'), require('./Cash'), require('./Investment'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.AggregationAccountTransaction = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.BankCredit, root.HydrogenNucleusApi.Cash, root.HydrogenNucleusApi.Investment);
  }
}(this, function(ApiClient, BankCredit, Cash, Investment) {
  'use strict';




  /**
   * The AggregationAccountTransaction model module.
   * @module model/AggregationAccountTransaction
   * @version 1.9.3
   */

  /**
   * Constructs a new <code>AggregationAccountTransaction</code>.
   * Aggregation Account Transaction Object
   * @alias module:model/AggregationAccountTransaction
   * @class
   * @param currencyCode {String} currencyCode
   * @param transactionDate {Date} transactionDate
   */
  var exports = function(currencyCode, transactionDate) {
    var _this = this;





    _this['currency_code'] = currencyCode;









    _this['transaction_date'] = transactionDate;

  };

  /**
   * Constructs a <code>AggregationAccountTransaction</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AggregationAccountTransaction} obj Optional instance to populate.
   * @return {module:model/AggregationAccountTransaction} The populated <code>AggregationAccountTransaction</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('aggregation_account_id')) {
        obj['aggregation_account_id'] = ApiClient.convertToType(data['aggregation_account_id'], 'String');
      }
      if (data.hasOwnProperty('bank_credit')) {
        obj['bank_credit'] = BankCredit.constructFromObject(data['bank_credit']);
      }
      if (data.hasOwnProperty('cash')) {
        obj['cash'] = Cash.constructFromObject(data['cash']);
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('investment')) {
        obj['investment'] = Investment.constructFromObject(data['investment']);
      }
      if (data.hasOwnProperty('is_excluded_analysis')) {
        obj['is_excluded_analysis'] = ApiClient.convertToType(data['is_excluded_analysis'], 'Boolean');
      }
      if (data.hasOwnProperty('is_fee')) {
        obj['is_fee'] = ApiClient.convertToType(data['is_fee'], 'Boolean');
      }
      if (data.hasOwnProperty('is_recurring')) {
        obj['is_recurring'] = ApiClient.convertToType(data['is_recurring'], 'Boolean');
      }
      if (data.hasOwnProperty('is_transfer')) {
        obj['is_transfer'] = ApiClient.convertToType(data['is_transfer'], 'Boolean');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('transaction_date')) {
        obj['transaction_date'] = ApiClient.convertToType(data['transaction_date'], 'Date');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * aggregationAccountId
   * @member {String} aggregation_account_id
   */
  exports.prototype['aggregation_account_id'] = undefined;
  /**
   * @member {module:model/BankCredit} bank_credit
   */
  exports.prototype['bank_credit'] = undefined;
  /**
   * @member {module:model/Cash} cash
   */
  exports.prototype['cash'] = undefined;
  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * currencyCode
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {module:model/Investment} investment
   */
  exports.prototype['investment'] = undefined;
  /**
   * @member {Boolean} is_excluded_analysis
   */
  exports.prototype['is_excluded_analysis'] = undefined;
  /**
   * @member {Boolean} is_fee
   */
  exports.prototype['is_fee'] = undefined;
  /**
   * @member {Boolean} is_recurring
   */
  exports.prototype['is_recurring'] = undefined;
  /**
   * @member {Boolean} is_transfer
   */
  exports.prototype['is_transfer'] = undefined;
  /**
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * status
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * transactionDate
   * @member {Date} transaction_date
   */
  exports.prototype['transaction_date'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


