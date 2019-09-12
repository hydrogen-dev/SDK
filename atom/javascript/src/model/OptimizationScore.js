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
    define(['ApiClient', 'model/OptConfig'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./OptConfig'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.OptimizationScore = factory(root.atom_api.ApiClient, root.atom_api.OptConfig);
  }
}(this, function(ApiClient, OptConfig) {
  'use strict';




  /**
   * The OptimizationScore model module.
   * @module model/OptimizationScore
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>OptimizationScore</code>.
   * @alias module:model/OptimizationScore
   * @class
   * @param portfolioTickers {Array.<String>} List of tickers
   * @param portfolioWeights {Array.<Number>} List of weights
   */
  var exports = function(portfolioTickers, portfolioWeights) {
    var _this = this;

    _this['portfolio_tickers'] = portfolioTickers;
    _this['portfolio_weights'] = portfolioWeights;


  };

  /**
   * Constructs a <code>OptimizationScore</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OptimizationScore} obj Optional instance to populate.
   * @return {module:model/OptimizationScore} The populated <code>OptimizationScore</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolio_tickers')) {
        obj['portfolio_tickers'] = ApiClient.convertToType(data['portfolio_tickers'], ['String']);
      }
      if (data.hasOwnProperty('portfolio_weights')) {
        obj['portfolio_weights'] = ApiClient.convertToType(data['portfolio_weights'], ['Number']);
      }
      if (data.hasOwnProperty('opt_config')) {
        obj['opt_config'] = OptConfig.constructFromObject(data['opt_config']);
      }
      if (data.hasOwnProperty('use_proxy_data')) {
        obj['use_proxy_data'] = ApiClient.convertToType(data['use_proxy_data'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * List of tickers
   * @member {Array.<String>} portfolio_tickers
   */
  exports.prototype['portfolio_tickers'] = undefined;
  /**
   * List of weights
   * @member {Array.<Number>} portfolio_weights
   */
  exports.prototype['portfolio_weights'] = undefined;
  /**
   * @member {module:model/OptConfig} opt_config
   */
  exports.prototype['opt_config'] = undefined;
  /**
   * If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false.
   * @member {Boolean} use_proxy_data
   * @default false
   */
  exports.prototype['use_proxy_data'] = false;



  return exports;
}));


