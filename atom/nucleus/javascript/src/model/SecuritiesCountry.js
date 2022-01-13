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
    root.HydrogenNucleusApi.SecuritiesCountry = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SecuritiesCountry model module.
   * @module model/SecuritiesCountry
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>SecuritiesCountry</code>.
   * @alias module:model/SecuritiesCountry
   * @class
   * @param country {String} country
   * @param weight {Number} Securities Country weight
   */
  var exports = function(country, weight) {
    var _this = this;

    _this['country'] = country;
    _this['weight'] = weight;
  };

  /**
   * Constructs a <code>SecuritiesCountry</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SecuritiesCountry} obj Optional instance to populate.
   * @return {module:model/SecuritiesCountry} The populated <code>SecuritiesCountry</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('country')) {
        obj['country'] = ApiClient.convertToType(data['country'], 'String');
      }
      if (data.hasOwnProperty('weight')) {
        obj['weight'] = ApiClient.convertToType(data['weight'], 'Number');
      }
    }
    return obj;
  }

  /**
   * country
   * @member {String} country
   */
  exports.prototype['country'] = undefined;
  /**
   * Securities Country weight
   * @member {Number} weight
   */
  exports.prototype['weight'] = undefined;



  return exports;
}));


