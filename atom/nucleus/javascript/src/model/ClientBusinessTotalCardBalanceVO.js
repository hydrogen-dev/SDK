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
    root.HydrogenNucleusApi.ClientBusinessTotalCardBalanceVO = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ClientBusinessTotalCardBalanceVO model module.
   * @module model/ClientBusinessTotalCardBalanceVO
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>ClientBusinessTotalCardBalanceVO</code>.
   * Client/Business Total CardBalance Mapping Object
   * @alias module:model/ClientBusinessTotalCardBalanceVO
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>ClientBusinessTotalCardBalanceVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ClientBusinessTotalCardBalanceVO} obj Optional instance to populate.
   * @return {module:model/ClientBusinessTotalCardBalanceVO} The populated <code>ClientBusinessTotalCardBalanceVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('total_balance')) {
        obj['total_balance'] = ApiClient.convertToType(data['total_balance'], 'Number');
      }
      if (data.hasOwnProperty('total_balance_available')) {
        obj['total_balance_available'] = ApiClient.convertToType(data['total_balance_available'], 'Number');
      }
    }
    return obj;
  }

  /**
   * currencyCode
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * totalBalance
   * @member {Number} total_balance
   */
  exports.prototype['total_balance'] = undefined;
  /**
   * totalBalanceAvailable
   * @member {Number} total_balance_available
   */
  exports.prototype['total_balance_available'] = undefined;



  return exports;
}));


