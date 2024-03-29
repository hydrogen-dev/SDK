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
    define(['ApiClient', 'model/AnnuityDepositSchedule', 'model/GuaranteedRateBenefit'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AnnuityDepositSchedule'), require('./GuaranteedRateBenefit'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.VariableAnnuityRequest = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.AnnuityDepositSchedule, root.HydrogenProtonApi.GuaranteedRateBenefit);
  }
}(this, function(ApiClient, AnnuityDepositSchedule, GuaranteedRateBenefit) {
  'use strict';

  /**
   * The VariableAnnuityRequest model module.
   * @module model/VariableAnnuityRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>VariableAnnuityRequest</code>.
   * @alias module:model/VariableAnnuityRequest
   * @class
   * @param decumulationHorizon {Number} 
   * @param accumulationHorizon {Number} 
   */
  var exports = function(decumulationHorizon, accumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
    this.accumulationHorizon = accumulationHorizon;
  };

  /**
   * Constructs a <code>VariableAnnuityRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/VariableAnnuityRequest} obj Optional instance to populate.
   * @return {module:model/VariableAnnuityRequest} The populated <code>VariableAnnuityRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('p'))
        obj.p = ApiClient.convertToType(data['p'], 'Number');
      if (data.hasOwnProperty('allocation_id'))
        obj.allocationId = ApiClient.convertToType(data['allocation_id'], 'String');
      if (data.hasOwnProperty('decumulation_horizon'))
        obj.decumulationHorizon = ApiClient.convertToType(data['decumulation_horizon'], 'Number');
      if (data.hasOwnProperty('accumulation_horizon'))
        obj.accumulationHorizon = ApiClient.convertToType(data['accumulation_horizon'], 'Number');
      if (data.hasOwnProperty('annuitization_rate'))
        obj.annuitizationRate = ApiClient.convertToType(data['annuitization_rate'], 'Number');
      if (data.hasOwnProperty('guaranteed_rate_benefit'))
        obj.guaranteedRateBenefit = ApiClient.convertToType(data['guaranteed_rate_benefit'], [GuaranteedRateBenefit]);
      if (data.hasOwnProperty('model_id'))
        obj.modelId = ApiClient.convertToType(data['model_id'], 'String');
      if (data.hasOwnProperty('portfolio_tickers'))
        obj.portfolioTickers = ApiClient.convertToType(data['portfolio_tickers'], ['String']);
      if (data.hasOwnProperty('create_log'))
        obj.createLog = ApiClient.convertToType(data['create_log'], 'Boolean');
      if (data.hasOwnProperty('inflation_rate'))
        obj.inflationRate = ApiClient.convertToType(data['inflation_rate'], 'Number');
      if (data.hasOwnProperty('aggregation_account_id'))
        obj.aggregationAccountId = ApiClient.convertToType(data['aggregation_account_id'], 'String');
      if (data.hasOwnProperty('n'))
        obj.n = ApiClient.convertToType(data['n'], 'Number');
      if (data.hasOwnProperty('guaranteed_accumulation_benefit'))
        obj.guaranteedAccumulationBenefit = ApiClient.convertToType(data['guaranteed_accumulation_benefit'], 'Number');
      if (data.hasOwnProperty('end_date'))
        obj.endDate = ApiClient.convertToType(data['end_date'], 'String');
      if (data.hasOwnProperty('tax_rate'))
        obj.taxRate = ApiClient.convertToType(data['tax_rate'], 'Number');
      if (data.hasOwnProperty('start_date'))
        obj.startDate = ApiClient.convertToType(data['start_date'], 'String');
      if (data.hasOwnProperty('remove_outliers'))
        obj.removeOutliers = ApiClient.convertToType(data['remove_outliers'], 'Boolean');
      if (data.hasOwnProperty('portfolio_weights'))
        obj.portfolioWeights = ApiClient.convertToType(data['portfolio_weights'], ['Number']);
      if (data.hasOwnProperty('portfolio_id'))
        obj.portfolioId = ApiClient.convertToType(data['portfolio_id'], 'String');
      if (data.hasOwnProperty('result_type'))
        obj.resultType = ApiClient.convertToType(data['result_type'], 'String');
      if (data.hasOwnProperty('account_id'))
        obj.accountId = ApiClient.convertToType(data['account_id'], 'String');
      if (data.hasOwnProperty('trading_days_per_year'))
        obj.tradingDaysPerYear = ApiClient.convertToType(data['trading_days_per_year'], 'Number');
      if (data.hasOwnProperty('use_proxy_data'))
        obj.useProxyData = ApiClient.convertToType(data['use_proxy_data'], 'Boolean');
      if (data.hasOwnProperty('initial_balance'))
        obj.initialBalance = ApiClient.convertToType(data['initial_balance'], 'Number');
      if (data.hasOwnProperty('market_data_source'))
        obj.marketDataSource = ApiClient.convertToType(data['market_data_source'], 'String');
      if (data.hasOwnProperty('frequency_interval'))
        obj.frequencyInterval = ApiClient.convertToType(data['frequency_interval'], 'String');
      if (data.hasOwnProperty('deposit_schedule'))
        obj.depositSchedule = AnnuityDepositSchedule.constructFromObject(data['deposit_schedule']);
    }
    return obj;
  }

  /**
   * @member {Number} p
   */
  exports.prototype.p = undefined;

  /**
   * @member {String} allocationId
   */
  exports.prototype.allocationId = undefined;

  /**
   * @member {Number} decumulationHorizon
   */
  exports.prototype.decumulationHorizon = undefined;

  /**
   * @member {Number} accumulationHorizon
   */
  exports.prototype.accumulationHorizon = undefined;

  /**
   * @member {Number} annuitizationRate
   * @default 0.0
   */
  exports.prototype.annuitizationRate = 0.0;

  /**
   * @member {Array.<module:model/GuaranteedRateBenefit>} guaranteedRateBenefit
   */
  exports.prototype.guaranteedRateBenefit = undefined;

  /**
   * @member {String} modelId
   */
  exports.prototype.modelId = undefined;

  /**
   * @member {Array.<String>} portfolioTickers
   */
  exports.prototype.portfolioTickers = undefined;

  /**
   * @member {Boolean} createLog
   * @default false
   */
  exports.prototype.createLog = false;

  /**
   * @member {Number} inflationRate
   * @default 0.0
   */
  exports.prototype.inflationRate = 0.0;

  /**
   * @member {String} aggregationAccountId
   */
  exports.prototype.aggregationAccountId = undefined;

  /**
   * @member {Number} n
   * @default 1000
   */
  exports.prototype.n = 1000;

  /**
   * @member {Number} guaranteedAccumulationBenefit
   * @default 0.0
   */
  exports.prototype.guaranteedAccumulationBenefit = 0.0;

  /**
   * @member {String} endDate
   */
  exports.prototype.endDate = undefined;

  /**
   * @member {Number} taxRate
   * @default 0.0
   */
  exports.prototype.taxRate = 0.0;

  /**
   * @member {String} startDate
   */
  exports.prototype.startDate = undefined;

  /**
   * @member {Boolean} removeOutliers
   * @default false
   */
  exports.prototype.removeOutliers = false;

  /**
   * @member {Array.<Number>} portfolioWeights
   */
  exports.prototype.portfolioWeights = undefined;

  /**
   * @member {String} portfolioId
   */
  exports.prototype.portfolioId = undefined;

  /**
   * @member {module:model/VariableAnnuityRequest.ResultTypeEnum} resultType
   * @default 'median'
   */
  exports.prototype.resultType = 'median';

  /**
   * @member {String} accountId
   */
  exports.prototype.accountId = undefined;

  /**
   * @member {Number} tradingDaysPerYear
   * @default 252
   */
  exports.prototype.tradingDaysPerYear = 252;

  /**
   * @member {Boolean} useProxyData
   * @default false
   */
  exports.prototype.useProxyData = false;

  /**
   * @member {Number} initialBalance
   * @default 0.0
   */
  exports.prototype.initialBalance = 0.0;

  /**
   * @member {module:model/VariableAnnuityRequest.MarketDataSourceEnum} marketDataSource
   * @default 'nucleus'
   */
  exports.prototype.marketDataSource = 'nucleus';

  /**
   * @member {module:model/VariableAnnuityRequest.FrequencyIntervalEnum} frequencyInterval
   * @default 'year'
   */
  exports.prototype.frequencyInterval = 'year';

  /**
   * @member {module:model/AnnuityDepositSchedule} depositSchedule
   */
  exports.prototype.depositSchedule = undefined;



  /**
   * Allowed values for the <code>resultType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ResultTypeEnum = {
    /**
     * value: "mean"
     * @const
     */
    mean: "mean",

    /**
     * value: "median"
     * @const
     */
    median: "median",

    /**
     * value: "custom"
     * @const
     */
    custom: "custom"
  };


  /**
   * Allowed values for the <code>marketDataSource</code> property.
   * @enum {String}
   * @readonly
   */
  exports.MarketDataSourceEnum = {
    /**
     * value: "nucleus"
     * @const
     */
    nucleus: "nucleus",

    /**
     * value: "integration"
     * @const
     */
    integration: "integration"
  };


  /**
   * Allowed values for the <code>frequencyInterval</code> property.
   * @enum {String}
   * @readonly
   */
  exports.FrequencyIntervalEnum = {
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
    week: "week",

    /**
     * value: "day"
     * @const
     */
    day: "day"
  };

  return exports;

}));
