/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.2-SNAPSHOT
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
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.EducationCalculatorDepositScheduleNoDepAmt = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The EducationCalculatorDepositScheduleNoDepAmt model module.
   * @module model/EducationCalculatorDepositScheduleNoDepAmt
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>EducationCalculatorDepositScheduleNoDepAmt</code>.
   * @alias module:model/EducationCalculatorDepositScheduleNoDepAmt
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>EducationCalculatorDepositScheduleNoDepAmt</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EducationCalculatorDepositScheduleNoDepAmt} obj Optional instance to populate.
   * @return {module:model/EducationCalculatorDepositScheduleNoDepAmt} The populated <code>EducationCalculatorDepositScheduleNoDepAmt</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('deposit_frequency_interval')) {
        obj['deposit_frequency_interval'] = ApiClient.convertToType(data['deposit_frequency_interval'], 'String');
      }
      if (data.hasOwnProperty('adjust_deposit_for_inflation')) {
        obj['adjust_deposit_for_inflation'] = ApiClient.convertToType(data['adjust_deposit_for_inflation'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * The period interval to be used in relation to the deposit_amount.
   * @member {module:model/EducationCalculatorDepositScheduleNoDepAmt.DepositFrequencyIntervalEnum} deposit_frequency_interval
   * @default 'year'
   */
  exports.prototype['deposit_frequency_interval'] = 'year';
  /**
   * If true, the deposits should be increased over time with the rate of inflation. If excluded, defaults to true.
   * @member {Boolean} adjust_deposit_for_inflation
   * @default true
   */
  exports.prototype['adjust_deposit_for_inflation'] = true;


  /**
   * Allowed values for the <code>deposit_frequency_interval</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DepositFrequencyIntervalEnum = {
    /**
     * value: "year"
     * @const
     */
    "year": "year",
    /**
     * value: "quarter"
     * @const
     */
    "quarter": "quarter",
    /**
     * value: "month"
     * @const
     */
    "month": "month",
    /**
     * value: "week"
     * @const
     */
    "week": "week"  };


  return exports;
}));


