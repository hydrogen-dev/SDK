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
    define(['ApiClient', 'model/RetirementReturnDetail'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./RetirementReturnDetail'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.RetirementCalculatorExpensesResponse = factory(root.atom_api.ApiClient, root.atom_api.RetirementReturnDetail);
  }
}(this, function(ApiClient, RetirementReturnDetail) {
  'use strict';




  /**
   * The RetirementCalculatorExpensesResponse model module.
   * @module model/RetirementCalculatorExpensesResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>RetirementCalculatorExpensesResponse</code>.
   * @alias module:model/RetirementCalculatorExpensesResponse
   * @class
   * @param projectedRetirementExpenses {Number} The after-tax retirement expenses available expressed in today’s dollars.
   * @param projectedRetirementExpensesAdjusted {Number} The after-tax retirement expenses available, expressed in today's dollars.
   * @param projectedSavingsAtRetirement {Number} The total amount of savings projected to be available at retirement, expressed in today’s dollars.
   * @param totalEarnings {Number} The total earnings generated over the horizon.
   * @param totalContributions {Number} The total contributions added over the horizon.
   * @param totalWithdrawals {Number} The total amount of withdrawals taken over decumulation_horizon.
   * @param totalTaxes {Number} The total taxes paid on withdrawals over decumulation_horizon.
   * @param returnDetails {Object.<String, module:model/RetirementReturnDetail>} 
   */
  var exports = function(projectedRetirementExpenses, projectedRetirementExpensesAdjusted, projectedSavingsAtRetirement, totalEarnings, totalContributions, totalWithdrawals, totalTaxes, returnDetails) {
    var _this = this;

    _this['projected_retirement_expenses'] = projectedRetirementExpenses;
    _this['projected_retirement_expenses_adjusted'] = projectedRetirementExpensesAdjusted;
    _this['projected_savings_at_retirement'] = projectedSavingsAtRetirement;
    _this['total_earnings'] = totalEarnings;
    _this['total_contributions'] = totalContributions;
    _this['total_withdrawals'] = totalWithdrawals;
    _this['total_taxes'] = totalTaxes;
    _this['return_details'] = returnDetails;
  };

  /**
   * Constructs a <code>RetirementCalculatorExpensesResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RetirementCalculatorExpensesResponse} obj Optional instance to populate.
   * @return {module:model/RetirementCalculatorExpensesResponse} The populated <code>RetirementCalculatorExpensesResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('projected_retirement_expenses')) {
        obj['projected_retirement_expenses'] = ApiClient.convertToType(data['projected_retirement_expenses'], 'Number');
      }
      if (data.hasOwnProperty('projected_retirement_expenses_adjusted')) {
        obj['projected_retirement_expenses_adjusted'] = ApiClient.convertToType(data['projected_retirement_expenses_adjusted'], 'Number');
      }
      if (data.hasOwnProperty('projected_savings_at_retirement')) {
        obj['projected_savings_at_retirement'] = ApiClient.convertToType(data['projected_savings_at_retirement'], 'Number');
      }
      if (data.hasOwnProperty('total_earnings')) {
        obj['total_earnings'] = ApiClient.convertToType(data['total_earnings'], 'Number');
      }
      if (data.hasOwnProperty('total_contributions')) {
        obj['total_contributions'] = ApiClient.convertToType(data['total_contributions'], 'Number');
      }
      if (data.hasOwnProperty('total_withdrawals')) {
        obj['total_withdrawals'] = ApiClient.convertToType(data['total_withdrawals'], 'Number');
      }
      if (data.hasOwnProperty('total_taxes')) {
        obj['total_taxes'] = ApiClient.convertToType(data['total_taxes'], 'Number');
      }
      if (data.hasOwnProperty('return_details')) {
        obj['return_details'] = ApiClient.convertToType(data['return_details'], {'String': RetirementReturnDetail});
      }
    }
    return obj;
  }

  /**
   * The after-tax retirement expenses available expressed in today’s dollars.
   * @member {Number} projected_retirement_expenses
   */
  exports.prototype['projected_retirement_expenses'] = undefined;
  /**
   * The after-tax retirement expenses available, expressed in today's dollars.
   * @member {Number} projected_retirement_expenses_adjusted
   */
  exports.prototype['projected_retirement_expenses_adjusted'] = undefined;
  /**
   * The total amount of savings projected to be available at retirement, expressed in today’s dollars.
   * @member {Number} projected_savings_at_retirement
   */
  exports.prototype['projected_savings_at_retirement'] = undefined;
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
   * The total amount of withdrawals taken over decumulation_horizon.
   * @member {Number} total_withdrawals
   */
  exports.prototype['total_withdrawals'] = undefined;
  /**
   * The total taxes paid on withdrawals over decumulation_horizon.
   * @member {Number} total_taxes
   */
  exports.prototype['total_taxes'] = undefined;
  /**
   * @member {Object.<String, module:model/RetirementReturnDetail>} return_details
   */
  exports.prototype['return_details'] = undefined;



  return exports;
}));


