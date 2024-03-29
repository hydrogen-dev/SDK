/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.OrderReconcileRequest = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The OrderReconcileRequest model module.
   * @module model/OrderReconcileRequest
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>OrderReconcileRequest</code>.
   * OrderReconcileRequest Object
   * @alias module:model/OrderReconcileRequest
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>OrderReconcileRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OrderReconcileRequest} obj Optional instance to populate.
   * @return {module:model/OrderReconcileRequest} The populated <code>OrderReconcileRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('non_fractional')) {
        obj['non_fractional'] = ApiClient.convertToType(data['non_fractional'], 'Boolean');
      }
      if (data.hasOwnProperty('order_track_ids')) {
        obj['order_track_ids'] = ApiClient.convertToType(data['order_track_ids'], ['String']);
      }
      if (data.hasOwnProperty('portfolio_id')) {
        obj['portfolio_id'] = ApiClient.convertToType(data['portfolio_id'], 'String');
      }
      if (data.hasOwnProperty('tenant_id')) {
        obj['tenant_id'] = ApiClient.convertToType(data['tenant_id'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} account_id
   */
  exports.prototype['account_id'] = undefined;
  /**
   * @member {Boolean} non_fractional
   */
  exports.prototype['non_fractional'] = undefined;
  /**
   * @member {Array.<String>} order_track_ids
   */
  exports.prototype['order_track_ids'] = undefined;
  /**
   * @member {String} portfolio_id
   */
  exports.prototype['portfolio_id'] = undefined;
  /**
   * @member {String} tenant_id
   */
  exports.prototype['tenant_id'] = undefined;



  return exports;
}));


