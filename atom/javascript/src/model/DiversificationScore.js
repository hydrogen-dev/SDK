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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.DiversificationScore = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The DiversificationScore model module.
   * @module model/DiversificationScore
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>DiversificationScore</code>.
   * @alias module:model/DiversificationScore
   * @class
   * @param portfolioTickers {Array.<String>} List of portfolio tickers
   * @param portfolioWeights {Array.<Number>} List of portfolio weights
   */
  var exports = function(portfolioTickers, portfolioWeights) {
    var _this = this;

    _this['portfolio_tickers'] = portfolioTickers;
    _this['portfolio_weights'] = portfolioWeights;


  };

  /**
   * Constructs a <code>DiversificationScore</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DiversificationScore} obj Optional instance to populate.
   * @return {module:model/DiversificationScore} The populated <code>DiversificationScore</code> instance.
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
      if (data.hasOwnProperty('start_date')) {
        obj['start_date'] = ApiClient.convertToType(data['start_date'], 'Date');
      }
      if (data.hasOwnProperty('end_date')) {
        obj['end_date'] = ApiClient.convertToType(data['end_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * List of portfolio tickers
   * @member {Array.<String>} portfolio_tickers
   */
  exports.prototype['portfolio_tickers'] = undefined;
  /**
   * List of portfolio weights
   * @member {Array.<Number>} portfolio_weights
   */
  exports.prototype['portfolio_weights'] = undefined;
  /**
   * @member {Date} start_date
   */
  exports.prototype['start_date'] = undefined;
  /**
   * @member {Date} end_date
   */
  exports.prototype['end_date'] = undefined;



  return exports;
}));


