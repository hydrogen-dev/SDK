/**
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
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
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.BaasBalanceVO = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The BaasBalanceVO model module.
   * @module model/BaasBalanceVO
   * @version 1.3.0
   */

  /**
   * Constructs a new <code>BaasBalanceVO</code>.
   * @alias module:model/BaasBalanceVO
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>BaasBalanceVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BaasBalanceVO} obj Optional instance to populate.
   * @return {module:model/BaasBalanceVO} The populated <code>BaasBalanceVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
      if (data.hasOwnProperty('nucleus_asset_sizes_posted')) {
        obj['nucleus_asset_sizes_posted'] = ApiClient.convertToType(data['nucleus_asset_sizes_posted'], [Object]);
      }
      if (data.hasOwnProperty('nucleus_asset_sizes_updated')) {
        obj['nucleus_asset_sizes_updated'] = ApiClient.convertToType(data['nucleus_asset_sizes_updated'], [Object]);
      }
      if (data.hasOwnProperty('nucleus_portfolio_id')) {
        obj['nucleus_portfolio_id'] = ApiClient.convertToType(data['nucleus_portfolio_id'], 'String');
      }
      if (data.hasOwnProperty('vendor_name')) {
        obj['vendor_name'] = ApiClient.convertToType(data['vendor_name'], Object);
      }
    }
    return obj;
  }

  /**
   * @member {String} message
   */
  exports.prototype['message'] = undefined;
  /**
   * @member {Array.<Object>} nucleus_asset_sizes_posted
   */
  exports.prototype['nucleus_asset_sizes_posted'] = undefined;
  /**
   * @member {Array.<Object>} nucleus_asset_sizes_updated
   */
  exports.prototype['nucleus_asset_sizes_updated'] = undefined;
  /**
   * @member {String} nucleus_portfolio_id
   */
  exports.prototype['nucleus_portfolio_id'] = undefined;
  /**
   * @member {Object} vendor_name
   */
  exports.prototype['vendor_name'] = undefined;



  return exports;
}));


