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
    root.HydrogenNucleusApi.AvailableDateDoubleVO = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AvailableDateDoubleVO model module.
   * @module model/AvailableDateDoubleVO
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>AvailableDateDoubleVO</code>.
   * Available Date-Double Mapping Object
   * @alias module:model/AvailableDateDoubleVO
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>AvailableDateDoubleVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AvailableDateDoubleVO} obj Optional instance to populate.
   * @return {module:model/AvailableDateDoubleVO} The populated <code>AvailableDateDoubleVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('additions')) {
        obj['additions'] = ApiClient.convertToType(data['additions'], 'Number');
      }
      if (data.hasOwnProperty('cash_flow')) {
        obj['cash_flow'] = ApiClient.convertToType(data['cash_flow'], 'Number');
      }
      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'String');
      }
      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'Number');
      }
      if (data.hasOwnProperty('value_available')) {
        obj['value_available'] = ApiClient.convertToType(data['value_available'], 'Number');
      }
      if (data.hasOwnProperty('value_pending')) {
        obj['value_pending'] = ApiClient.convertToType(data['value_pending'], 'Number');
      }
    }
    return obj;
  }

  /**
   * additions
   * @member {Number} additions
   */
  exports.prototype['additions'] = undefined;
  /**
   * cashFlow
   * @member {Number} cash_flow
   */
  exports.prototype['cash_flow'] = undefined;
  /**
   * currencyCode
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * date
   * @member {String} date
   */
  exports.prototype['date'] = undefined;
  /**
   * value
   * @member {Number} value
   */
  exports.prototype['value'] = undefined;
  /**
   * valueAvailable
   * @member {Number} value_available
   */
  exports.prototype['value_available'] = undefined;
  /**
   * valuePending
   * @member {Number} value_pending
   */
  exports.prototype['value_pending'] = undefined;



  return exports;
}));


