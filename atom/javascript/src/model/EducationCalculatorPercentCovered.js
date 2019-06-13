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
    define(['ApiClient', 'model/EducationCalculatorDepositScheduleDepAmt'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./EducationCalculatorDepositScheduleDepAmt'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.EducationCalculatorPercentCovered = factory(root.atom_api.ApiClient, root.atom_api.EducationCalculatorDepositScheduleDepAmt);
  }
}(this, function(ApiClient, EducationCalculatorDepositScheduleDepAmt) {
  'use strict';




  /**
   * The EducationCalculatorPercentCovered model module.
   * @module model/EducationCalculatorPercentCovered
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>EducationCalculatorPercentCovered</code>.
   * @alias module:model/EducationCalculatorPercentCovered
   * @class
   * @param initialBalance {Number} The amount currently saved for the goal
   * @param accumulationHorizon {Number} The amount of years until funds are needed
   * @param decumulationHorizon {Number} The amount of years funds will be used
   * @param totalAnnualCost {Number} The total annual education cost
   * @param portfolioReturn {Number} The annualized portfolio return
   */
  var exports = function(initialBalance, accumulationHorizon, decumulationHorizon, totalAnnualCost, portfolioReturn) {
    var _this = this;

    _this['initial_balance'] = initialBalance;
    _this['accumulation_horizon'] = accumulationHorizon;
    _this['decumulation_horizon'] = decumulationHorizon;
    _this['total_annual_cost'] = totalAnnualCost;
    _this['portfolio_return'] = portfolioReturn;




  };

  /**
   * Constructs a <code>EducationCalculatorPercentCovered</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EducationCalculatorPercentCovered} obj Optional instance to populate.
   * @return {module:model/EducationCalculatorPercentCovered} The populated <code>EducationCalculatorPercentCovered</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('initial_balance')) {
        obj['initial_balance'] = ApiClient.convertToType(data['initial_balance'], 'Number');
      }
      if (data.hasOwnProperty('accumulation_horizon')) {
        obj['accumulation_horizon'] = ApiClient.convertToType(data['accumulation_horizon'], 'Number');
      }
      if (data.hasOwnProperty('decumulation_horizon')) {
        obj['decumulation_horizon'] = ApiClient.convertToType(data['decumulation_horizon'], 'Number');
      }
      if (data.hasOwnProperty('total_annual_cost')) {
        obj['total_annual_cost'] = ApiClient.convertToType(data['total_annual_cost'], 'Number');
      }
      if (data.hasOwnProperty('portfolio_return')) {
        obj['portfolio_return'] = ApiClient.convertToType(data['portfolio_return'], 'Number');
      }
      if (data.hasOwnProperty('education_inflation_rate')) {
        obj['education_inflation_rate'] = ApiClient.convertToType(data['education_inflation_rate'], 'Number');
      }
      if (data.hasOwnProperty('general_inflation_rate')) {
        obj['general_inflation_rate'] = ApiClient.convertToType(data['general_inflation_rate'], 'Number');
      }
      if (data.hasOwnProperty('tax_rate')) {
        obj['tax_rate'] = ApiClient.convertToType(data['tax_rate'], 'Number');
      }
      if (data.hasOwnProperty('deposit_schedule')) {
        obj['deposit_schedule'] = EducationCalculatorDepositScheduleDepAmt.constructFromObject(data['deposit_schedule']);
      }
    }
    return obj;
  }

  /**
   * The amount currently saved for the goal
   * @member {Number} initial_balance
   */
  exports.prototype['initial_balance'] = undefined;
  /**
   * The amount of years until funds are needed
   * @member {Number} accumulation_horizon
   */
  exports.prototype['accumulation_horizon'] = undefined;
  /**
   * The amount of years funds will be used
   * @member {Number} decumulation_horizon
   */
  exports.prototype['decumulation_horizon'] = undefined;
  /**
   * The total annual education cost
   * @member {Number} total_annual_cost
   */
  exports.prototype['total_annual_cost'] = undefined;
  /**
   * The annualized portfolio return
   * @member {Number} portfolio_return
   */
  exports.prototype['portfolio_return'] = undefined;
  /**
   * The inflation rate for education prices
   * @member {Number} education_inflation_rate
   */
  exports.prototype['education_inflation_rate'] = undefined;
  /**
   * The annualized general inflation rate
   * @member {Number} general_inflation_rate
   */
  exports.prototype['general_inflation_rate'] = undefined;
  /**
   * The tax rate for withdrawals from the account
   * @member {Number} tax_rate
   */
  exports.prototype['tax_rate'] = undefined;
  /**
   * @member {module:model/EducationCalculatorDepositScheduleDepAmt} deposit_schedule
   */
  exports.prototype['deposit_schedule'] = undefined;



  return exports;
}));


