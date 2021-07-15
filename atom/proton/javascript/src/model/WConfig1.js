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
    root.HydrogenProtonApi.WConfig1 = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The WConfig1 model module.
   * @module model/WConfig1
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>WConfig1</code>.
   * @alias module:model/WConfig1
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>WConfig1</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WConfig1} obj Optional instance to populate.
   * @return {module:model/WConfig1} The populated <code>WConfig1</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('w_min_minor'))
        obj.wMinMinor = ApiClient.convertToType(data['w_min_minor'], 'Number');
      if (data.hasOwnProperty('w_min_major'))
        obj.wMinMajor = ApiClient.convertToType(data['w_min_major'], 'Number');
      if (data.hasOwnProperty('cash_amount'))
        obj.cashAmount = ApiClient.convertToType(data['cash_amount'], 'Number');
      if (data.hasOwnProperty('w_max_major'))
        obj.wMaxMajor = ApiClient.convertToType(data['w_max_major'], 'Number');
      if (data.hasOwnProperty('w_max_minor'))
        obj.wMaxMinor = ApiClient.convertToType(data['w_max_minor'], 'Number');
    }
    return obj;
  }

  /**
   * @member {Number} wMinMinor
   * @default 0.05
   */
  exports.prototype.wMinMinor = 0.05;

  /**
   * @member {Number} wMinMajor
   * @default 0.05
   */
  exports.prototype.wMinMajor = 0.05;

  /**
   * @member {Number} cashAmount
   * @default 0.0
   */
  exports.prototype.cashAmount = 0.0;

  /**
   * @member {Number} wMaxMajor
   * @default 1.0
   */
  exports.prototype.wMaxMajor = 1.0;

  /**
   * @member {Number} wMaxMinor
   * @default 1.0
   */
  exports.prototype.wMaxMinor = 1.0;


  return exports;

}));
