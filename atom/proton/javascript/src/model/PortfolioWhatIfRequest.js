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
    root.HydrogenProtonApi.PortfolioWhatIfRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The PortfolioWhatIfRequest model module.
   * @module model/PortfolioWhatIfRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>PortfolioWhatIfRequest</code>.
   * @alias module:model/PortfolioWhatIfRequest
   * @class
   * @param alteredPortfolioWeights {Array.<Number>} 
   */
  var exports = function(alteredPortfolioWeights) {
    this.alteredPortfolioWeights = alteredPortfolioWeights;
  };

  /**
   * Constructs a <code>PortfolioWhatIfRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioWhatIfRequest} obj Optional instance to populate.
   * @return {module:model/PortfolioWhatIfRequest} The populated <code>PortfolioWhatIfRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('allocation_id'))
        obj.allocationId = ApiClient.convertToType(data['allocation_id'], 'String');
      if (data.hasOwnProperty('end_date'))
        obj.endDate = ApiClient.convertToType(data['end_date'], 'String');
      if (data.hasOwnProperty('market_data_source'))
        obj.marketDataSource = ApiClient.convertToType(data['market_data_source'], 'String');
      if (data.hasOwnProperty('model_id'))
        obj.modelId = ApiClient.convertToType(data['model_id'], 'String');
      if (data.hasOwnProperty('account_id'))
        obj.accountId = ApiClient.convertToType(data['account_id'], 'String');
      if (data.hasOwnProperty('start_date'))
        obj.startDate = ApiClient.convertToType(data['start_date'], 'String');
      if (data.hasOwnProperty('current_portfolio_weights'))
        obj.currentPortfolioWeights = ApiClient.convertToType(data['current_portfolio_weights'], ['Number']);
      if (data.hasOwnProperty('use_proxy_data'))
        obj.useProxyData = ApiClient.convertToType(data['use_proxy_data'], 'Boolean');
      if (data.hasOwnProperty('altered_portfolio_weights'))
        obj.alteredPortfolioWeights = ApiClient.convertToType(data['altered_portfolio_weights'], ['Number']);
      if (data.hasOwnProperty('create_log'))
        obj.createLog = ApiClient.convertToType(data['create_log'], 'Boolean');
      if (data.hasOwnProperty('current_portfolio_tickers'))
        obj.currentPortfolioTickers = ApiClient.convertToType(data['current_portfolio_tickers'], ['String']);
      if (data.hasOwnProperty('aggregation_account_id'))
        obj.aggregationAccountId = ApiClient.convertToType(data['aggregation_account_id'], 'String');
      if (data.hasOwnProperty('altered_portfolio_tickers'))
        obj.alteredPortfolioTickers = ApiClient.convertToType(data['altered_portfolio_tickers'], ['String']);
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
   * @member {String} endDate
   */
  exports.prototype.endDate = undefined;

  /**
   * @member {module:model/PortfolioWhatIfRequest.MarketDataSourceEnum} marketDataSource
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
   * @member {String} startDate
   */
  exports.prototype.startDate = undefined;

  /**
   * @member {Array.<Number>} currentPortfolioWeights
   */
  exports.prototype.currentPortfolioWeights = undefined;

  /**
   * @member {Boolean} useProxyData
   * @default false
   */
  exports.prototype.useProxyData = false;

  /**
   * @member {Array.<Number>} alteredPortfolioWeights
   */
  exports.prototype.alteredPortfolioWeights = undefined;

  /**
   * @member {Boolean} createLog
   * @default false
   */
  exports.prototype.createLog = false;

  /**
   * @member {Array.<String>} currentPortfolioTickers
   */
  exports.prototype.currentPortfolioTickers = undefined;

  /**
   * @member {String} aggregationAccountId
   */
  exports.prototype.aggregationAccountId = undefined;

  /**
   * @member {Array.<String>} alteredPortfolioTickers
   */
  exports.prototype.alteredPortfolioTickers = undefined;

  /**
   * @member {String} portfolioId
   */
  exports.prototype.portfolioId = undefined;



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
