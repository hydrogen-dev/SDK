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
 * Swagger Codegen version: 2.4.8-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/EducationCalculatorReturnDetail'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./EducationCalculatorReturnDetail'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.EducationCalculatorDepositamountResponse = factory(root.atom_api.ApiClient, root.atom_api.EducationCalculatorReturnDetail);
  }
}(this, function(ApiClient, EducationCalculatorReturnDetail) {
  'use strict';




  /**
   * The EducationCalculatorDepositamountResponse model module.
   * @module model/EducationCalculatorDepositamountResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>EducationCalculatorDepositamountResponse</code>.
   * @alias module:model/EducationCalculatorDepositamountResponse
   * @class
   * @param depositAmount {Number} The deposit amount to meet the education goal.
   * @param depositFrequencyInterval {module:model/EducationCalculatorDepositamountResponse.DepositFrequencyIntervalEnum} The period interval to be used in relation to deposit_duration.
   * @param projectedAccumulationSavings {Number} The projected balance at the end of accumulation_horizon.
   * @param totalEarnings {Number} The total earnings generated over the horizon.
   * @param totalContributions {Number} The total contributions added over the horizon.
   * @param totalCost {Number} The total cost of education over the decumulation horizon, represented in future dollars.
   * @param totalTaxes {Number} The total taxes paid on withdrawals over decumulation_horizon.
   * @param returnDetails {Object.<String, module:model/EducationCalculatorReturnDetail>} 
   */
  var exports = function(depositAmount, depositFrequencyInterval, projectedAccumulationSavings, totalEarnings, totalContributions, totalCost, totalTaxes, returnDetails) {
    var _this = this;

    _this['deposit_amount'] = depositAmount;
    _this['deposit_frequency_interval'] = depositFrequencyInterval;
    _this['projected_accumulation_savings'] = projectedAccumulationSavings;
    _this['total_earnings'] = totalEarnings;
    _this['total_contributions'] = totalContributions;
    _this['total_cost'] = totalCost;
    _this['total_taxes'] = totalTaxes;
    _this['return_details'] = returnDetails;
  };

  /**
   * Constructs a <code>EducationCalculatorDepositamountResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EducationCalculatorDepositamountResponse} obj Optional instance to populate.
   * @return {module:model/EducationCalculatorDepositamountResponse} The populated <code>EducationCalculatorDepositamountResponse</code> instance.
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
      if (data.hasOwnProperty('projected_accumulation_savings')) {
        obj['projected_accumulation_savings'] = ApiClient.convertToType(data['projected_accumulation_savings'], 'Number');
      }
      if (data.hasOwnProperty('total_earnings')) {
        obj['total_earnings'] = ApiClient.convertToType(data['total_earnings'], 'Number');
      }
      if (data.hasOwnProperty('total_contributions')) {
        obj['total_contributions'] = ApiClient.convertToType(data['total_contributions'], 'Number');
      }
      if (data.hasOwnProperty('total_cost')) {
        obj['total_cost'] = ApiClient.convertToType(data['total_cost'], 'Number');
      }
      if (data.hasOwnProperty('total_taxes')) {
        obj['total_taxes'] = ApiClient.convertToType(data['total_taxes'], 'Number');
      }
      if (data.hasOwnProperty('return_details')) {
        obj['return_details'] = ApiClient.convertToType(data['return_details'], {'String': EducationCalculatorReturnDetail});
      }
    }
    return obj;
  }

  /**
   * The deposit amount to meet the education goal.
   * @member {Number} deposit_amount
   */
  exports.prototype['deposit_amount'] = undefined;
  /**
   * The period interval to be used in relation to deposit_duration.
   * @member {module:model/EducationCalculatorDepositamountResponse.DepositFrequencyIntervalEnum} deposit_frequency_interval
   * @default 'year'
   */
  exports.prototype['deposit_frequency_interval'] = 'year';
  /**
   * The projected balance at the end of accumulation_horizon.
   * @member {Number} projected_accumulation_savings
   */
  exports.prototype['projected_accumulation_savings'] = undefined;
  /**
   * The total earnings generated over the horizon.
   * @member {Number} total_earnings
   */
  exports.prototype['total_earnings'] = undefined;
  /**
   * The total contributions added over the horizon.
   * @member {Number} total_contributions
   */
  exports.prototype['total_contributions'] = undefined;
  /**
   * The total cost of education over the decumulation horizon, represented in future dollars.
   * @member {Number} total_cost
   */
  exports.prototype['total_cost'] = undefined;
  /**
   * The total taxes paid on withdrawals over decumulation_horizon.
   * @member {Number} total_taxes
   */
  exports.prototype['total_taxes'] = undefined;
  /**
   * @member {Object.<String, module:model/EducationCalculatorReturnDetail>} return_details
   */
  exports.prototype['return_details'] = undefined;


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


