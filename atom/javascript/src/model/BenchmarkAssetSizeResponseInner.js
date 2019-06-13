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
    root.atom_api.BenchmarkAssetSizeResponseInner = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The BenchmarkAssetSizeResponseInner model module.
   * @module model/BenchmarkAssetSizeResponseInner
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>BenchmarkAssetSizeResponseInner</code>.
   * @alias module:model/BenchmarkAssetSizeResponseInner
   * @class
   * @param _date {String} Date for this asset size record
   * @param value {Number} “Growth of a dollar” within the benchmark on the particular date
   */
  var exports = function(_date, value) {
    var _this = this;

    _this['date'] = _date;
    _this['value'] = value;
  };

  /**
   * Constructs a <code>BenchmarkAssetSizeResponseInner</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BenchmarkAssetSizeResponseInner} obj Optional instance to populate.
   * @return {module:model/BenchmarkAssetSizeResponseInner} The populated <code>BenchmarkAssetSizeResponseInner</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'String');
      }
      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'Number');
      }
    }
    return obj;
  }

  /**
   * Date for this asset size record
   * @member {String} date
   */
  exports.prototype['date'] = undefined;
  /**
   * “Growth of a dollar” within the benchmark on the particular date
   * @member {Number} value
   */
  exports.prototype['value'] = undefined;



  return exports;
}));


