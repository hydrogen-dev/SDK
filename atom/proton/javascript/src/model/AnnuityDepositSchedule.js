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
    root.HydrogenProtonApi.AnnuityDepositSchedule = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The AnnuityDepositSchedule model module.
   * @module model/AnnuityDepositSchedule
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>AnnuityDepositSchedule</code>.
   * @alias module:model/AnnuityDepositSchedule
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>AnnuityDepositSchedule</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AnnuityDepositSchedule} obj Optional instance to populate.
   * @return {module:model/AnnuityDepositSchedule} The populated <code>AnnuityDepositSchedule</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('deposit_amount'))
        obj.depositAmount = ApiClient.convertToType(data['deposit_amount'], 'Number');
      if (data.hasOwnProperty('deposit_frequency_interval'))
        obj.depositFrequencyInterval = ApiClient.convertToType(data['deposit_frequency_interval'], 'String');
      if (data.hasOwnProperty('adjust_deposit_for_inflation'))
        obj.adjustDepositForInflation = ApiClient.convertToType(data['adjust_deposit_for_inflation'], 'Boolean');
    }
    return obj;
  }

  /**
   * @member {Number} depositAmount
   * @default 0.0
   */
  exports.prototype.depositAmount = 0.0;

  /**
   * @member {module:model/AnnuityDepositSchedule.DepositFrequencyIntervalEnum} depositFrequencyInterval
   * @default 'year'
   */
  exports.prototype.depositFrequencyInterval = 'year';

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
