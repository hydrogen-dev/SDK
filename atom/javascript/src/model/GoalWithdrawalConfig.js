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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.GoalWithdrawalConfig = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The GoalWithdrawalConfig model module.
   * @module model/GoalWithdrawalConfig
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>GoalWithdrawalConfig</code>.
   * @alias module:model/GoalWithdrawalConfig
   * @class
   * @param withAmount {Number} The withdrawal amount in today's dollars
   */
  var exports = function(withAmount) {
    var _this = this;





    _this['with_amount'] = withAmount;


  };

  /**
   * Constructs a <code>GoalWithdrawalConfig</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/GoalWithdrawalConfig} obj Optional instance to populate.
   * @return {module:model/GoalWithdrawalConfig} The populated <code>GoalWithdrawalConfig</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('with_start_reference')) {
        obj['with_start_reference'] = ApiClient.convertToType(data['with_start_reference'], 'String');
      }
      if (data.hasOwnProperty('with_start_period')) {
        obj['with_start_period'] = ApiClient.convertToType(data['with_start_period'], 'Number');
      }
      if (data.hasOwnProperty('with_end_reference')) {
        obj['with_end_reference'] = ApiClient.convertToType(data['with_end_reference'], 'String');
      }
      if (data.hasOwnProperty('with_end_period')) {
        obj['with_end_period'] = ApiClient.convertToType(data['with_end_period'], 'Number');
      }
      if (data.hasOwnProperty('with_amount')) {
        obj['with_amount'] = ApiClient.convertToType(data['with_amount'], 'Number');
      }
      if (data.hasOwnProperty('with_frequency')) {
        obj['with_frequency'] = ApiClient.convertToType(data['with_frequency'], 'String');
      }
      if (data.hasOwnProperty('with_inflation')) {
        obj['with_inflation'] = ApiClient.convertToType(data['with_inflation'], 'Number');
      }
    }
    return obj;
  }

  /**
   * The reference for the starting point of the withdrawal
   * @member {module:model/GoalWithdrawalConfig.WithStartReferenceEnum} with_start_reference
   * @default 'a_end'
   */
  exports.prototype['with_start_reference'] = 'a_end';
  /**
   * The starting period for the withdrawal
   * @member {Number} with_start_period
   */
  exports.prototype['with_start_period'] = undefined;
  /**
   * The reference for the ending point of the withdrawal
   * @member {module:model/GoalWithdrawalConfig.WithEndReferenceEnum} with_end_reference
   * @default 'd_end'
   */
  exports.prototype['with_end_reference'] = 'd_end';
  /**
   * The ending point for the withdrawal
   * @member {Number} with_end_period
   */
  exports.prototype['with_end_period'] = undefined;
  /**
   * The withdrawal amount in today's dollars
   * @member {Number} with_amount
   */
  exports.prototype['with_amount'] = undefined;
  /**
   * The frequency of the withdrawal
   * @member {module:model/GoalWithdrawalConfig.WithFrequencyEnum} with_frequency
   * @default 'year'
   */
  exports.prototype['with_frequency'] = 'year';
  /**
   * The annualized inflation for the withdrawals
   * @member {Number} with_inflation
   */
  exports.prototype['with_inflation'] = undefined;


  /**
   * Allowed values for the <code>with_start_reference</code> property.
   * @enum {String}
   * @readonly
   */
  exports.WithStartReferenceEnum = {
    /**
     * value: "a_end"
     * @const
     */
    "a_end": "a_end",
    /**
     * value: "d_end"
     * @const
     */
    "d_end": "d_end"  };

  /**
   * Allowed values for the <code>with_end_reference</code> property.
   * @enum {String}
   * @readonly
   */
  exports.WithEndReferenceEnum = {
    /**
     * value: "a_end"
     * @const
     */
    "a_end": "a_end",
    /**
     * value: "d_end"
     * @const
     */
    "d_end": "d_end"  };

  /**
   * Allowed values for the <code>with_frequency</code> property.
   * @enum {String}
   * @readonly
   */
  exports.WithFrequencyEnum = {
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

