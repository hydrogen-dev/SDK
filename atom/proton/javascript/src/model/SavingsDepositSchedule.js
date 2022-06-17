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
    root.HydrogenProtonApi.SavingsDepositSchedule = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The SavingsDepositSchedule model module.
   * @module model/SavingsDepositSchedule
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>SavingsDepositSchedule</code>.
   * @alias module:model/SavingsDepositSchedule
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>SavingsDepositSchedule</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SavingsDepositSchedule} obj Optional instance to populate.
   * @return {module:model/SavingsDepositSchedule} The populated <code>SavingsDepositSchedule</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('deposit_frequency_interval'))
        obj.depositFrequencyInterval = ApiClient.convertToType(data['deposit_frequency_interval'], 'String');
      if (data.hasOwnProperty('deposit_amount'))
        obj.depositAmount = ApiClient.convertToType(data['deposit_amount'], 'Number');
      if (data.hasOwnProperty('deposit_duration'))
        obj.depositDuration = ApiClient.convertToType(data['deposit_duration'], 'Number');
      if (data.hasOwnProperty('adjust_deposit_for_inflation'))
        obj.adjustDepositForInflation = ApiClient.convertToType(data['adjust_deposit_for_inflation'], 'Boolean');
    }
    return obj;
  }

  /**
   * @member {module:model/SavingsDepositSchedule.DepositFrequencyIntervalEnum} depositFrequencyInterval
   * @default 'year'
   */
  exports.prototype.depositFrequencyInterval = 'year';

  /**
   * @member {Number} depositAmount
   */
  exports.prototype.depositAmount = undefined;

  /**
   * @member {Number} depositDuration
   */
  exports.prototype.depositDuration = undefined;

  /**
   * @member {Boolean} adjustDepositForInflation
   * @default true
   */
  exports.prototype.adjustDepositForInflation = true;



  /**
   * Allowed values for the <code>depositFrequencyInterval</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DepositFrequencyIntervalEnum = {
    /**
     * value: "year"
     * @const
     */
    year: "year",

    /**
     * value: "quarter"
     * @const
     */
    quarter: "quarter",

    /**
     * value: "month"
     * @const
     */
    month: "month",

    /**
     * value: "week"
     * @const
     */
    week: "week",

    /**
     * value: "day"
     * @const
     */
    day: "day"
  };

  return exports;

}));
