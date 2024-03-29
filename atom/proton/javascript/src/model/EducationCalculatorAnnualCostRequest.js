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
    root.HydrogenProtonApi.EducationCalculatorAnnualCostRequest = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.CalculatorDepositSchedule1);
  }
}(this, function(ApiClient, CalculatorDepositSchedule1) {
  'use strict';

  /**
   * The EducationCalculatorAnnualCostRequest model module.
   * @module model/EducationCalculatorAnnualCostRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>EducationCalculatorAnnualCostRequest</code>.
   * @alias module:model/EducationCalculatorAnnualCostRequest
   * @class
   * @param decumulationHorizon {Number} 
   * @param accumulationHorizon {Number} 
   * @param portfolioReturn {Number} 
   */
  var exports = function(decumulationHorizon, accumulationHorizon, portfolioReturn) {
    this.decumulationHorizon = decumulationHorizon;
    this.accumulationHorizon = accumulationHorizon;
    this.portfolioReturn = portfolioReturn;
  };

  /**
   * Constructs a <code>EducationCalculatorAnnualCostRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EducationCalculatorAnnualCostRequest} obj Optional instance to populate.
   * @return {module:model/EducationCalculatorAnnualCostRequest} The populated <code>EducationCalculatorAnnualCostRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('education_inflation_rate'))
        obj.educationInflationRate = ApiClient.convertToType(data['education_inflation_rate'], 'Number');
      if (data.hasOwnProperty('decumulation_horizon'))
        obj.decumulationHorizon = ApiClient.convertToType(data['decumulation_horizon'], 'Number');
      if (data.hasOwnProperty('accumulation_horizon'))
        obj.accumulationHorizon = ApiClient.convertToType(data['accumulation_horizon'], 'Number');
      if (data.hasOwnProperty('account_ids'))
        obj.accountIds = ApiClient.convertToType(data['account_ids'], ['String']);
      if (data.hasOwnProperty('tax_rate'))
        obj.taxRate = ApiClient.convertToType(data['tax_rate'], 'Number');
      if (data.hasOwnProperty('general_inflation_rate'))
        obj.generalInflationRate = ApiClient.convertToType(data['general_inflation_rate'], 'Number');
      if (data.hasOwnProperty('portfolio_return'))
        obj.portfolioReturn = ApiClient.convertToType(data['portfolio_return'], 'Number');
      if (data.hasOwnProperty('deposit_schedule'))
        obj.depositSchedule = CalculatorDepositSchedule1.constructFromObject(data['deposit_schedule']);
      if (data.hasOwnProperty('initial_balance'))
        obj.initialBalance = ApiClient.convertToType(data['initial_balance'], 'Number');
      if (data.hasOwnProperty('percent_of_costs_covered'))
        obj.percentOfCostsCovered = ApiClient.convertToType(data['percent_of_costs_covered'], 'Number');
      if (data.hasOwnProperty('aggregation_account_ids'))
        obj.aggregationAccountIds = ApiClient.convertToType(data['aggregation_account_ids'], ['String']);
    }
    return obj;
  }

  /**
   * @member {Number} educationInflationRate
   * @default 0.05
   */
  exports.prototype.educationInflationRate = 0.05;

  /**
   * @member {Number} decumulationHorizon
   */
  exports.prototype.decumulationHorizon = undefined;

  /**
   * @member {Number} accumulationHorizon
   */
  exports.prototype.accumulationHorizon = undefined;

  /**
   * @member {Array.<String>} accountIds
   */
  exports.prototype.accountIds = undefined;

  /**
   * @member {Number} taxRate
   * @default 0.0
   */
  exports.prototype.taxRate = 0.0;

  /**
   * @member {Number} generalInflationRate
   * @default 0.0
   */
  exports.prototype.generalInflationRate = 0.0;

  /**
   * @member {Number} portfolioReturn
   */
  exports.prototype.portfolioReturn = undefined;

  /**
   * @member {module:model/CalculatorDepositSchedule1} depositSchedule
   */
  exports.prototype.depositSchedule = undefined;

  /**
   * @member {Number} initialBalance
   * @default 0.0
   */
  exports.prototype.initialBalance = 0.0;

  /**
   * @member {Number} percentOfCostsCovered
   * @default 1.0
   */
  exports.prototype.percentOfCostsCovered = 1.0;

  /**
   * @member {Array.<String>} aggregationAccountIds
   */
  exports.prototype.aggregationAccountIds = undefined;


  return exports;

}));
