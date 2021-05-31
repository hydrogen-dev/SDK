/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
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
    define(['ApiClient', 'model/CalculatorDepositSchedule'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CalculatorDepositSchedule'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.PurchaseCalculatorDepositAmountRequest = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.CalculatorDepositSchedule);
  }
}(this, function(ApiClient, CalculatorDepositSchedule) {
  'use strict';

  /**
   * The PurchaseCalculatorDepositAmountRequest model module.
   * @module model/PurchaseCalculatorDepositAmountRequest
   * @version 1.9.0
   */

  /**
   * Constructs a new <code>PurchaseCalculatorDepositAmountRequest</code>.
   * @alias module:model/PurchaseCalculatorDepositAmountRequest
   * @class
   * @param purchaseHorizon {Number} 
   * @param portfolioReturn {Number} 
   * @param purchaseAmount {Number} 
   */
  var exports = function(purchaseHorizon, portfolioReturn, purchaseAmount) {
    this.purchaseHorizon = purchaseHorizon;
    this.portfolioReturn = portfolioReturn;
    this.purchaseAmount = purchaseAmount;
  };

  /**
   * Constructs a <code>PurchaseCalculatorDepositAmountRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PurchaseCalculatorDepositAmountRequest} obj Optional instance to populate.
   * @return {module:model/PurchaseCalculatorDepositAmountRequest} The populated <code>PurchaseCalculatorDepositAmountRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('account_ids'))
        obj.accountIds = ApiClient.convertToType(data['account_ids'], ['String']);
      if (data.hasOwnProperty('horizon_frequency_interval'))
        obj.horizonFrequencyInterval = ApiClient.convertToType(data['horizon_frequency_interval'], 'String');
      if (data.hasOwnProperty('purchase_horizon'))
        obj.purchaseHorizon = ApiClient.convertToType(data['purchase_horizon'], 'Number');
      if (data.hasOwnProperty('investment_tax'))
        obj.investmentTax = ApiClient.convertToType(data['investment_tax'], 'Number');
      if (data.hasOwnProperty('portfolio_return'))
        obj.portfolioReturn = ApiClient.convertToType(data['portfolio_return'], 'Number');
      if (data.hasOwnProperty('deposit_schedule'))
        obj.depositSchedule = CalculatorDepositSchedule.constructFromObject(data['deposit_schedule']);
      if (data.hasOwnProperty('current_savings'))
        obj.currentSavings = ApiClient.convertToType(data['current_savings'], 'Number');
      if (data.hasOwnProperty('purchase_amount'))
        obj.purchaseAmount = ApiClient.convertToType(data['purchase_amount'], 'Number');
      if (data.hasOwnProperty('inflation_rate'))
        obj.inflationRate = ApiClient.convertToType(data['inflation_rate'], 'Number');
      if (data.hasOwnProperty('aggregation_account_ids'))
        obj.aggregationAccountIds = ApiClient.convertToType(data['aggregation_account_ids'], ['String']);
    }
    return obj;
  }

  /**
   * @member {Array.<String>} accountIds
   */
  exports.prototype.accountIds = undefined;

  /**
   * @member {module:model/PurchaseCalculatorDepositAmountRequest.HorizonFrequencyIntervalEnum} horizonFrequencyInterval
   * @default 'year'
   */
  exports.prototype.horizonFrequencyInterval = 'year';

  /**
   * @member {Number} purchaseHorizon
   */
  exports.prototype.purchaseHorizon = undefined;

  /**
   * @member {Number} investmentTax
   * @default 0.0
   */
  exports.prototype.investmentTax = 0.0;

  /**
   * @member {Number} portfolioReturn
   */
  exports.prototype.portfolioReturn = undefined;

  /**
   * @member {module:model/CalculatorDepositSchedule} depositSchedule
   */
  exports.prototype.depositSchedule = undefined;

  /**
   * @member {Number} currentSavings
   * @default 0.0
   */
  exports.prototype.currentSavings = 0.0;

  /**
   * @member {Number} purchaseAmount
   */
  exports.prototype.purchaseAmount = undefined;

  /**
   * @member {Number} inflationRate
   * @default 0.0
   */
  exports.prototype.inflationRate = 0.0;

  /**
   * @member {Array.<String>} aggregationAccountIds
   */
  exports.prototype.aggregationAccountIds = undefined;



  /**
   * Allowed values for the <code>horizonFrequencyInterval</code> property.
   * @enum {String}
   * @readonly
   */
  exports.HorizonFrequencyIntervalEnum = {
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
    week: "week"
  };

  return exports;

}));
