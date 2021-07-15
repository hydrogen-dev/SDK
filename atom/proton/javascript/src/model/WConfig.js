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
    root.HydrogenProtonApi.WConfig = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The WConfig model module.
   * @module model/WConfig
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>WConfig</code>.
   * @alias module:model/WConfig
   * @class
   * @param wMinMinor {Number} 
   * @param wMinMajor {Number} 
   * @param cashAmount {Number} 
   * @param wMaxMajor {Number} 
   * @param wMaxMinor {Number} 
   */
  var exports = function(wMinMinor, wMinMajor, cashAmount, wMaxMajor, wMaxMinor) {
    this.wMinMinor = wMinMinor;
    this.wMinMajor = wMinMajor;
    this.cashAmount = cashAmount;
    this.wMaxMajor = wMaxMajor;
    this.wMaxMinor = wMaxMinor;
  };

  /**
   * Constructs a <code>WConfig</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WConfig} obj Optional instance to populate.
   * @return {module:model/WConfig} The populated <code>WConfig</code> instance.
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
   */
  exports.prototype.wMinMinor = undefined;

  /**
   * @member {Number} wMinMajor
   */
  exports.prototype.wMinMajor = undefined;

  /**
   * @member {Number} cashAmount
   */
  exports.prototype.cashAmount = undefined;

  /**
   * @member {Number} wMaxMajor
   */
  exports.prototype.wMaxMajor = undefined;

  /**
   * @member {Number} wMaxMinor
   */
  exports.prototype.wMaxMinor = undefined;


  return exports;

}));
