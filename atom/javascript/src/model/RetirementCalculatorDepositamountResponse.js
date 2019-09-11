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
    define(['ApiClient', 'model/RetirementReturnDetail'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./RetirementReturnDetail'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.RetirementCalculatorDepositamountResponse = factory(root.atom_api.ApiClient, root.atom_api.RetirementReturnDetail);
  }
}(this, function(ApiClient, RetirementReturnDetail) {
  'use strict';




  /**
   * The RetirementCalculatorDepositamountResponse model module.
   * @module model/RetirementCalculatorDepositamountResponse
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>RetirementCalculatorDepositamountResponse</code>.
   * @alias module:model/RetirementCalculatorDepositamountResponse
   * @class
   * @param depositAmount {Number} The amount to deposit in order to meet the retirement goal.
   * @param depositFrequencyInterval {String} The frequency interval of the deposit.
   * @param projectedSavingsAtRetirement {Number} The total amount of savings projected to be available at retirement, expressed in today’s dollars.
   * @param returnDetails {Object.<String, module:model/RetirementReturnDetail>} 
   */
  var exports = function(depositAmount, depositFrequencyInterval, projectedSavingsAtRetirement, returnDetails) {
    var _this = this;

    _this['deposit_amount'] = depositAmount;
    _this['deposit_frequency_interval'] = depositFrequencyInterval;
    _this['projected_savings_at_retirement'] = projectedSavingsAtRetirement;
    _this['return_details'] = returnDetails;
  };

  /**
   * Constructs a <code>RetirementCalculatorDepositamountResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RetirementCalculatorDepositamountResponse} obj Optional instance to populate.
   * @return {module:model/RetirementCalculatorDepositamountResponse} The populated <code>RetirementCalculatorDepositamountResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('deposit_amount')) {
        obj['deposit_amount'] = ApiClient.convertToType(data['deposit_amount'], 'Number');
      }
      if (data.hasOwnProperty('deposit_frequency_interval')) {
        obj['deposit_frequency_interval'] = ApiClient.convertToType(data['deposit_frequency_interval'], 'String');
      }
      if (data.hasOwnProperty('projected_savings_at_retirement')) {
        obj['projected_savings_at_retirement'] = ApiClient.convertToType(data['projected_savings_at_retirement'], 'Number');
      }
      if (data.hasOwnProperty('return_details')) {
        obj['return_details'] = ApiClient.convertToType(data['return_details'], {'String': RetirementReturnDetail});
      }
    }
    return obj;
  }

  /**
   * The amount to deposit in order to meet the retirement goal.
   * @member {Number} deposit_amount
   */
  exports.prototype['deposit_amount'] = undefined;
  /**
   * The frequency interval of the deposit.
   * @member {String} deposit_frequency_interval
   */
  exports.prototype['deposit_frequency_interval'] = undefined;
  /**
   * The total amount of savings projected to be available at retirement, expressed in today’s dollars.
   * @member {Number} projected_savings_at_retirement
   */
  exports.prototype['projected_savings_at_retirement'] = undefined;
  /**
   * @member {Object.<String, module:model/RetirementReturnDetail>} return_details
   */
  exports.prototype['return_details'] = undefined;



  return exports;
}));

