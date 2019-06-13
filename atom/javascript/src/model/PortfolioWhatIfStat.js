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
    root.atom_api.PortfolioWhatIfStat = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The PortfolioWhatIfStat model module.
   * @module model/PortfolioWhatIfStat
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>PortfolioWhatIfStat</code>.
   * @alias module:model/PortfolioWhatIfStat
   * @class
   * @param currentPortfolio {Number} 
   * @param alteredPortfolio {Number} 
   * @param delta {Number} 
   */
  var exports = function(currentPortfolio, alteredPortfolio, delta) {
    var _this = this;

    _this['current_portfolio'] = currentPortfolio;
    _this['altered_portfolio'] = alteredPortfolio;
    _this['delta'] = delta;
  };

  /**
   * Constructs a <code>PortfolioWhatIfStat</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioWhatIfStat} obj Optional instance to populate.
   * @return {module:model/PortfolioWhatIfStat} The populated <code>PortfolioWhatIfStat</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('current_portfolio')) {
        obj['current_portfolio'] = ApiClient.convertToType(data['current_portfolio'], 'Number');
      }
      if (data.hasOwnProperty('altered_portfolio')) {
        obj['altered_portfolio'] = ApiClient.convertToType(data['altered_portfolio'], 'Number');
      }
      if (data.hasOwnProperty('delta')) {
        obj['delta'] = ApiClient.convertToType(data['delta'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {Number} current_portfolio
   */
  exports.prototype['current_portfolio'] = undefined;
  /**
   * @member {Number} altered_portfolio
   */
  exports.prototype['altered_portfolio'] = undefined;
  /**
   * @member {Number} delta
   */
  exports.prototype['delta'] = undefined;



  return exports;
}));


