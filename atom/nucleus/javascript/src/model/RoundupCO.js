/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.7.0
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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenAtomApi) {
      root.HydrogenAtomApi = {};
    }
    root.HydrogenAtomApi.RoundupCO = factory(root.HydrogenAtomApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The RoundupCO model module.
   * @module model/RoundupCO
   * @version 1.7.0
   */

  /**
   * Constructs a new <code>RoundupCO</code>.
   * @alias module:model/RoundupCO
   * @class
   * @param fundingStartDate {Date} 
   * @param roundupSettingId {String} 
   * @param transactionStartDate {Date} 
   */
  var exports = function(fundingStartDate, roundupSettingId, transactionStartDate) {
    var _this = this;

    _this['funding_start_date'] = fundingStartDate;
    _this['roundup_setting_id'] = roundupSettingId;

    _this['transaction_start_date'] = transactionStartDate;

  };

  /**
   * Constructs a <code>RoundupCO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RoundupCO} obj Optional instance to populate.
   * @return {module:model/RoundupCO} The populated <code>RoundupCO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('funding_start_date')) {
        obj['funding_start_date'] = ApiClient.convertToType(data['funding_start_date'], 'Date');
      }
      if (data.hasOwnProperty('roundup_setting_id')) {
        obj['roundup_setting_id'] = ApiClient.convertToType(data['roundup_setting_id'], 'String');
      }
      if (data.hasOwnProperty('transaction_end_date')) {
        obj['transaction_end_date'] = ApiClient.convertToType(data['transaction_end_date'], 'Date');
      }
      if (data.hasOwnProperty('transaction_start_date')) {
        obj['transaction_start_date'] = ApiClient.convertToType(data['transaction_start_date'], 'Date');
      }
      if (data.hasOwnProperty('update_transactions')) {
        obj['update_transactions'] = ApiClient.convertToType(data['update_transactions'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * @member {Date} funding_start_date
   */
  exports.prototype['funding_start_date'] = undefined;
  /**
   * @member {String} roundup_setting_id
   */
  exports.prototype['roundup_setting_id'] = undefined;
  /**
   * @member {Date} transaction_end_date
   */
  exports.prototype['transaction_end_date'] = undefined;
  /**
   * @member {Date} transaction_start_date
   */
  exports.prototype['transaction_start_date'] = undefined;
  /**
   * @member {Boolean} update_transactions
   */
  exports.prototype['update_transactions'] = undefined;



  return exports;
}));

