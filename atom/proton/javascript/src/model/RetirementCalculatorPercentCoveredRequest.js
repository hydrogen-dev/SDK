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
    define(['ApiClient', 'model/CalculatorDepositSchedule1'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CalculatorDepositSchedule1'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.RetirementCalculatorPercentCoveredRequest = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.CalculatorDepositSchedule1);
  }
}(this, function(ApiClient, CalculatorDepositSchedule1) {
  'use strict';

  /**
   * The RetirementCalculatorPercentCoveredRequest model module.
   * @module model/RetirementCalculatorPercentCoveredRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>RetirementCalculatorPercentCoveredRequest</code>.
   * @alias module:model/RetirementCalculatorPercentCoveredRequest
   * @class
   * @param currentAge {Number} 
   * @param deathAge {Number} 
   * @param portfolioReturn {Number} 
   * @param retirementExpenses {Number} 
   */
  var exports = function(currentAge, deathAge, portfolioReturn, retirementExpenses) {
    this.currentAge = currentAge;
    this.deathAge = deathAge;
    this.portfolioReturn = portfolioReturn;
    this.retirementExpenses = retirementExpenses;
  };

  /**
   * Constructs a <code>RetirementCalculatorPercentCoveredRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RetirementCalculatorPercentCoveredRequest} obj Optional instance to populate.
   * @return {module:model/RetirementCalculatorPercentCoveredRequest} The populated <code>RetirementCalculatorPercentCoveredRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('retirement_savings'))
        obj.retirementSavings = ApiClient.convertToType(data['retirement_savings'], 'Number');
      if (data.hasOwnProperty('current_age'))
        obj.currentAge = ApiClient.convertToType(data['current_age'], 'Number');
      if (data.hasOwnProperty('account_ids'))
        obj.accountIds = ApiClient.convertToType(data['account_ids'], ['String']);
      if (data.hasOwnProperty('retirement_income'))
        obj.retirementIncome = ApiClient.convertToType(data['retirement_income'], 'Number');
      if (data.hasOwnProperty('retirement_tax'))
        obj.retirementTax = ApiClient.convertToType(data['retirement_tax'], 'Number');
      if (data.hasOwnProperty('death_age'))
        obj.deathAge = ApiClient.convertToType(data['death_age'], 'Number');
      if (data.hasOwnProperty('retirement_age'))
        obj.retirementAge = ApiClient.convertToType(data['retirement_age'], 'Number');
      if (data.hasOwnProperty('portfolio_return'))
        obj.portfolioReturn = ApiClient.convertToType(data['portfolio_return'], 'Number');
      if (data.hasOwnProperty('retirement_expenses'))
        obj.retirementExpenses = ApiClient.convertToType(data['retirement_expenses'], 'Number');
      if (data.hasOwnProperty('deposit_schedule'))
        obj.depositSchedule = CalculatorDepositSchedule1.constructFromObject(data['deposit_schedule']);
      if (data.hasOwnProperty('inflation_rate'))
        obj.inflationRate = ApiClient.convertToType(data['inflation_rate'], 'Number');
      if (data.hasOwnProperty('aggregation_account_ids'))
        obj.aggregationAccountIds = ApiClient.convertToType(data['aggregation_account_ids'], ['String']);
    }
    return obj;
  }

  /**
   * @member {Number} retirementSavings
   * @default 0.0
   */
  exports.prototype.retirementSavings = 0.0;

  /**
   * @member {Number} currentAge
   */
  exports.prototype.currentAge = undefined;

  /**
   * @member {Array.<String>} accountIds
   */
  exports.prototype.accountIds = undefined;

  /**
   * @member {Number} retirementIncome
   * @default 0.0
   */
  exports.prototype.retirementIncome = 0.0;

  /**
   * @member {Number} retirementTax
   * @default 0.0
   */
  exports.prototype.retirementTax = 0.0;

  /**
   * @member {Number} deathAge
   */
  exports.prototype.deathAge = undefined;

  /**
   * @member {Number} retirementAge
   * @default 65
   */
  exports.prototype.retirementAge = 65;

  /**
   * @member {Number} portfolioReturn
   */
  exports.prototype.portfolioReturn = undefined;

  /**
   * @member {Number} retirementExpenses
   */
  exports.prototype.retirementExpenses = undefined;

  /**
   * @member {module:model/CalculatorDepositSchedule1} depositSchedule
   */
  exports.prototype.depositSchedule = undefined;

  /**
   * @member {Number} inflationRate
   * @default 0.0
   */
  exports.prototype.inflationRate = 0.0;

  /**
   * @member {Array.<String>} aggregationAccountIds
   */
  exports.prototype.aggregationAccountIds = undefined;


  return exports;

}));
