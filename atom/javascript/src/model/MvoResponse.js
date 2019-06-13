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
    define(['ApiClient', 'model/TargetPortfolioResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TargetPortfolioResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.MvoResponse = factory(root.atom_api.ApiClient, root.atom_api.TargetPortfolioResponse);
  }
}(this, function(ApiClient, TargetPortfolioResponse) {
  'use strict';




  /**
   * The MvoResponse model module.
   * @module model/MvoResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>MvoResponse</code>.
   * @alias module:model/MvoResponse
   * @class
   * @param targetPortfolio {module:model/TargetPortfolioResponse} 
   */
  var exports = function(targetPortfolio) {
    var _this = this;

    _this['target_portfolio'] = targetPortfolio;
  };

  /**
   * Constructs a <code>MvoResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MvoResponse} obj Optional instance to populate.
   * @return {module:model/MvoResponse} The populated <code>MvoResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('target_portfolio')) {
        obj['target_portfolio'] = TargetPortfolioResponse.constructFromObject(data['target_portfolio']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/TargetPortfolioResponse} target_portfolio
   */
  exports.prototype['target_portfolio'] = undefined;



  return exports;
}));


