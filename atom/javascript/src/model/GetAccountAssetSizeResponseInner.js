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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.GetAccountAssetSizeResponseInner = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The GetAccountAssetSizeResponseInner model module.
   * @module model/GetAccountAssetSizeResponseInner
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>GetAccountAssetSizeResponseInner</code>.
   * @alias module:model/GetAccountAssetSizeResponseInner
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>GetAccountAssetSizeResponseInner</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/GetAccountAssetSizeResponseInner} obj Optional instance to populate.
   * @return {module:model/GetAccountAssetSizeResponseInner} The populated <code>GetAccountAssetSizeResponseInner</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'Number');
      }
      if (data.hasOwnProperty('additions')) {
        obj['additions'] = ApiClient.convertToType(data['additions'], 'Number');
      }
    }
    return obj;
  }

  /**
   * Date for this asset size record
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * Monetary value of the account on the particular date
   * @member {Number} value
   */
  exports.prototype['value'] = undefined;
  /**
   * Amount added to the account value since the last asset size date, usually via deposit
   * @member {Number} additions
   */
  exports.prototype['additions'] = undefined;



  return exports;
}));


