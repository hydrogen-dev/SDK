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
    root.HydrogenProtonApi.EventStudyRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The EventStudyRequest model module.
   * @module model/EventStudyRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>EventStudyRequest</code>.
   * @alias module:model/EventStudyRequest
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>EventStudyRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EventStudyRequest} obj Optional instance to populate.
   * @return {module:model/EventStudyRequest} The populated <code>EventStudyRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('allocation_id'))
        obj.allocationId = ApiClient.convertToType(data['allocation_id'], 'String');
      if (data.hasOwnProperty('events'))
        obj.events = ApiClient.convertToType(data['events'], ['String']);
      if (data.hasOwnProperty('market_data_source'))
        obj.marketDataSource = ApiClient.convertToType(data['market_data_source'], 'String');
      if (data.hasOwnProperty('model_id'))
        obj.modelId = ApiClient.convertToType(data['model_id'], 'String');
      if (data.hasOwnProperty('account_id'))
        obj.accountId = ApiClient.convertToType(data['account_id'], 'String');
      if (data.hasOwnProperty('use_proxy_data'))
        obj.useProxyData = ApiClient.convertToType(data['use_proxy_data'], 'Boolean');
      if (data.hasOwnProperty('portfolio_weights'))
        obj.portfolioWeights = ApiClient.convertToType(data['portfolio_weights'], ['Number']);
      if (data.hasOwnProperty('portfolio_tickers'))
        obj.portfolioTickers = ApiClient.convertToType(data['portfolio_tickers'], ['String']);
      if (data.hasOwnProperty('create_log'))
        obj.createLog = ApiClient.convertToType(data['create_log'], 'Boolean');
      if (data.hasOwnProperty('aggregation_account_id'))
        obj.aggregationAccountId = ApiClient.convertToType(data['aggregation_account_id'], 'String');
      if (data.hasOwnProperty('portfolio_id'))
        obj.portfolioId = ApiClient.convertToType(data['portfolio_id'], 'String');
    }
    return obj;
  }

  /**
   * @member {String} allocationId
   */
  exports.prototype.allocationId = undefined;

  /**
   * @member {Array.<module:model/EventStudyRequest.EventsEnum>} events
   */
  exports.prototype.events = undefined;

  /**
   * @member {module:model/EventStudyRequest.MarketDataSourceEnum} marketDataSource
   * @default 'nucleus'
   */
  exports.prototype.marketDataSource = 'nucleus';

  /**
   * @member {String} modelId
   */
  exports.prototype.modelId = undefined;

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
   * @member {Array.<Number>} portfolioWeights
   */
  exports.prototype.portfolioWeights = undefined;

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
   * @member {String} aggregationAccountId
   */
  exports.prototype.aggregationAccountId = undefined;

  /**
   * @member {String} portfolioId
   */
  exports.prototype.portfolioId = undefined;



  /**
   * Allowed values for the <code>events</code> property.
   * @enum {String}
   * @readonly
   */
  exports.EventsEnum = {
    /**
     * value: "dot_com_bubble"
     * @const
     */
    dotComBubble: "dot_com_bubble",

    /**
     * value: "2008_financial_crisis"
     * @const
     */
    _2008FinancialCrisis: "2008_financial_crisis",

    /**
     * value: "brexit"
     * @const
     */
    brexit: "brexit",

    /**
     * value: "2011_black_monday"
     * @const
     */
    _2011BlackMonday: "2011_black_monday",

    /**
     * value: "september_eleventh"
     * @const
     */
    septemberEleventh: "september_eleventh",

    /**
     * value: "1987_black_monday"
     * @const
     */
    _1987BlackMonday: "1987_black_monday",

    /**
     * value: "1992_black_wednesday"
     * @const
     */
    _1992BlackWednesday: "1992_black_wednesday",

    /**
     * value: "1997_asian_financial_crisis"
     * @const
     */
    _1997AsianFinancialCrisis: "1997_asian_financial_crisis"
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

  return exports;

}));
