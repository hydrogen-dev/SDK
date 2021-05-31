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
    root.HydrogenIntegrationApi.Dividend = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Dividend model module.
   * @module model/Dividend
   * @version 1.3.0
   */

  /**
   * Constructs a new <code>Dividend</code>.
   * @alias module:model/Dividend
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>Dividend</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Dividend} obj Optional instance to populate.
   * @return {module:model/Dividend} The populated <code>Dividend</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('amount_per_share')) {
        obj['amount_per_share'] = ApiClient.convertToType(data['amount_per_share'], 'Number');
      }
      if (data.hasOwnProperty('tax_code')) {
        obj['tax_code'] = ApiClient.convertToType(data['tax_code'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Number} amount_per_share
   */
  exports.prototype['amount_per_share'] = undefined;
  /**
   * @member {String} tax_code
   */
  exports.prototype['tax_code'] = undefined;
  /**
   * @member {String} type
   */
  exports.prototype['type'] = undefined;



  return exports;
}));


