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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.MonteCarloRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The MonteCarloRequest model module.
   * @module model/MonteCarloRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>MonteCarloRequest</code>.
   * @alias module:model/MonteCarloRequest
   * @class
   * @param cf {Array.<Array.<Number>>} 
   */
  var exports = function(cf) {
    this.cf = cf;
  };

  /**
   * Constructs a <code>MonteCarloRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MonteCarloRequest} obj Optional instance to populate.
   * @return {module:model/MonteCarloRequest} The populated <code>MonteCarloRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('min_bal'))
        obj.minBal = ApiClient.convertToType(data['min_bal'], ['Number']);
      if (data.hasOwnProperty('max_bal'))
        obj.maxBal = ApiClient.convertToType(data['max_bal'], ['Number']);
      if (data.hasOwnProperty('p'))
        obj.p = ApiClient.convertToType(data['p'], ['Number']);
      if (data.hasOwnProperty('allocation_id'))
        obj.allocationId = ApiClient.convertToType(data['allocation_id'], 'String');
      if (data.hasOwnProperty('init_bal'))
        obj.initBal = ApiClient.convertToType(data['init_bal'], 'Number');
      if (data.hasOwnProperty('max_sample'))
        obj.maxSample = ApiClient.convertToType(data['max_sample'], ['Number']);
      if (data.hasOwnProperty('model_id'))
        obj.modelId = ApiClient.convertToType(data['model_id'], 'String');
      if (data.hasOwnProperty('cf'))
        obj.cf = ApiClient.convertToType(data['cf'], [['Number']]);
      if (data.hasOwnProperty('create_log'))
        obj.createLog = ApiClient.convertToType(data['create_log'], 'Boolean');
      if (data.hasOwnProperty('aggregation_account_id'))
        obj.aggregationAccountId = ApiClient.convertToType(data['aggregation_account_id'], 'String');
      if (data.hasOwnProperty('n'))
        obj.n = ApiClient.convertToType(data['n'], 'Number');
      if (data.hasOwnProperty('remove_outliers'))
        obj.removeOutliers = ApiClient.convertToType(data['remove_outliers'], 'Boolean');
      if (data.hasOwnProperty('sigma'))
        obj.sigma = ApiClient.convertToType(data['sigma'], ['Number']);
      if (data.hasOwnProperty('mu'))
        obj.mu = ApiClient.convertToType(data['mu'], ['Number']);
      if (data.hasOwnProperty('portfolio_id'))
        obj.portfolioId = ApiClient.convertToType(data['portfolio_id'], 'String');
      if (data.hasOwnProperty('result_type'))
        obj.resultType = ApiClient.convertToType(data['result_type'], 'String');
      if (data.hasOwnProperty('account_id'))
        obj.accountId = ApiClient.convertToType(data['account_id'], 'String');
      if (data.hasOwnProperty('use_proxy_data'))
        obj.useProxyData = ApiClient.convertToType(data['use_proxy_data'], 'Boolean');
      if (data.hasOwnProperty('market_data_source'))
        obj.marketDataSource = ApiClient.convertToType(data['market_data_source'], 'String');
      if (data.hasOwnProperty('ret_mod'))
        obj.retMod = ApiClient.convertToType(data['ret_mod'], ['Number']);
      if (data.hasOwnProperty('frequency_interval'))
        obj.frequencyInterval = ApiClient.convertToType(data['frequency_interval'], 'String');
      if (data.hasOwnProperty('min_sample'))
        obj.minSample = ApiClient.convertToType(data['min_sample'], ['Number']);
    }
    return obj;
  }

  /**
   * @member {Array.<Number>} minBal
   */
  exports.prototype.minBal = undefined;

  /**
   * @member {Array.<Number>} maxBal
   */
  exports.prototype.maxBal = undefined;

  /**
   * @member {Array.<Number>} p
   */
  exports.prototype.p = undefined;

  /**
   * @member {String} allocationId
   */
  exports.prototype.allocationId = undefined;

  /**
   * @member {Number} initBal
   */
  exports.prototype.initBal = undefined;

  /**
   * @member {Array.<Number>} maxSample
   */
  exports.prototype.maxSample = undefined;

  /**
   * @member {String} modelId
   */
  exports.prototype.modelId = undefined;

  /**
   * @member {Array.<Array.<Number>>} cf
   */
  exports.prototype.cf = undefined;

  /**
   * @member {Boolean} createLog
   * @default false
   */
  exports.prototype.createLog = false;

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
   * @member {Boolean} removeOutliers
   * @default false
   */
  exports.prototype.removeOutliers = false;

  /**
   * @member {Array.<Number>} sigma
   */
  exports.prototype.sigma = undefined;

  /**
   * @member {Array.<Number>} mu
   */
  exports.prototype.mu = undefined;

  /**
   * @member {String} portfolioId
   */
  exports.prototype.portfolioId = undefined;

  /**
   * @member {module:model/MonteCarloRequest.ResultTypeEnum} resultType
   * @default 'raw'
   */
  exports.prototype.resultType = 'raw';

  /**
   * @member {String} accountId
   */
  exports.prototype.accountId = undefined;

  /**
   * @member {Boolean} useProxyData
   * @default false
   */
  exports.prototype.useProxyData = false;

  /**
   * @member {module:model/MonteCarloRequest.MarketDataSourceEnum} marketDataSource
   * @default 'nucleus'
   */
  exports.prototype.marketDataSource = 'nucleus';

  /**
   * @member {Array.<Number>} retMod
   */
  exports.prototype.retMod = undefined;

  /**
   * @member {module:model/MonteCarloRequest.FrequencyIntervalEnum} frequencyInterval
   * @default 'year'
   */
  exports.prototype.frequencyInterval = 'year';

  /**
   * @member {Array.<Number>} minSample
   */
  exports.prototype.minSample = undefined;



  /**
   * Allowed values for the <code>resultType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ResultTypeEnum = {
    /**
     * value: "raw"
     * @const
     */
    raw: "raw",

    /**
     * value: "custom"
     * @const
     */
    custom: "custom",

    /**
     * value: "median"
     * @const
     */
    median: "median",

    /**
     * value: "mean"
     * @const
     */
    mean: "mean",

    /**
     * value: "tens"
     * @const
     */
    tens: "tens"
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
     * value: "six_months"
     * @const
     */
    sixMonths: "six_months",

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
     * value: "two_weeks"
     * @const
     */
    twoWeeks: "two_weeks",

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
