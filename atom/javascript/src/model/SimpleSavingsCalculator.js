/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
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
    define(['ApiClient', 'model/DepositSchedule'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DepositSchedule'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SimpleSavingsCalculator = factory(root.atom_api.ApiClient, root.atom_api.DepositSchedule);
  }
}(this, function(ApiClient, DepositSchedule) {
  'use strict';




  /**
   * The SimpleSavingsCalculator model module.
   * @module model/SimpleSavingsCalculator
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>SimpleSavingsCalculator</code>.
   * @alias module:model/SimpleSavingsCalculator
   * @class
   * @param initialBalance {Number} The initial savings balance
   * @param horizon {Number} The savings horizon
   * @param returnSchedule {Array.<Number>} The return schedule for the given horizon
   */
  var exports = function(initialBalance, horizon, returnSchedule) {
    var _this = this;

    _this['initial_balance'] = initialBalance;
    _this['horizon'] = horizon;
    _this['return_schedule'] = returnSchedule;




  };

  /**
   * Constructs a <code>SimpleSavingsCalculator</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SimpleSavingsCalculator} obj Optional instance to populate.
   * @return {module:model/SimpleSavingsCalculator} The populated <code>SimpleSavingsCalculator</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('initial_balance')) {
        obj['initial_balance'] = ApiClient.convertToType(data['initial_balance'], 'Number');
      }
      if (data.hasOwnProperty('horizon')) {
        obj['horizon'] = ApiClient.convertToType(data['horizon'], 'Number');
      }
      if (data.hasOwnProperty('return_schedule')) {
        obj['return_schedule'] = ApiClient.convertToType(data['return_schedule'], ['Number']);
      }
      if (data.hasOwnProperty('horizon_frequency_interval')) {
        obj['horizon_frequency_interval'] = ApiClient.convertToType(data['horizon_frequency_interval'], 'String');
      }
      if (data.hasOwnProperty('deposit_schedule')) {
        obj['deposit_schedule'] = ApiClient.convertToType(data['deposit_schedule'], [DepositSchedule]);
      }
      if (data.hasOwnProperty('tax_rate')) {
        obj['tax_rate'] = ApiClient.convertToType(data['tax_rate'], 'Number');
      }
      if (data.hasOwnProperty('inflation_rate')) {
        obj['inflation_rate'] = ApiClient.convertToType(data['inflation_rate'], 'Number');
      }
    }
    return obj;
  }

  /**
   * The initial savings balance
   * @member {Number} initial_balance
   */
  exports.prototype['initial_balance'] = undefined;
  /**
   * The savings horizon
   * @member {Number} horizon
   */
  exports.prototype['horizon'] = undefined;
  /**
   * The return schedule for the given horizon
   * @member {Array.<Number>} return_schedule
   */
  exports.prototype['return_schedule'] = undefined;
  /**
   * The frequency interval for the horizon
   * @member {module:model/SimpleSavingsCalculator.HorizonFrequencyIntervalEnum} horizon_frequency_interval
   * @default 'year'
   */
  exports.prototype['horizon_frequency_interval'] = 'year';
  /**
   * The deposit schedule
   * @member {Array.<module:model/DepositSchedule>} deposit_schedule
   */
  exports.prototype['deposit_schedule'] = undefined;
  /**
   * The tax rate to be applied to investment earnings
   * @member {Number} tax_rate
   */
  exports.prototype['tax_rate'] = undefined;
  /**
   * The inflation rate
   * @member {Number} inflation_rate
   */
  exports.prototype['inflation_rate'] = undefined;


  /**
   * Allowed values for the <code>horizon_frequency_interval</code> property.
   * @enum {String}
   * @readonly
   */
  exports.HorizonFrequencyIntervalEnum = {
    /**
     * value: "year"
     * @const
     */
    "year": "year",
    /**
     * value: "six_months"
     * @const
     */
    "six_months": "six_months",
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
     * value: "two_weeks"
     * @const
     */
    "two_weeks": "two_weeks",
    /**
     * value: "week"
     * @const
     */
    "week": "week",
    /**
     * value: "day"
     * @const
     */
    "day": "day"  };


  return exports;
}));

