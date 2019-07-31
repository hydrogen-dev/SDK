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
    root.atom_api.FinancialPictureResponseTotalLiabilities = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The FinancialPictureResponseTotalLiabilities model module.
   * @module model/FinancialPictureResponseTotalLiabilities
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>FinancialPictureResponseTotalLiabilities</code>.
   * @alias module:model/FinancialPictureResponseTotalLiabilities
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>FinancialPictureResponseTotalLiabilities</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FinancialPictureResponseTotalLiabilities} obj Optional instance to populate.
   * @return {module:model/FinancialPictureResponseTotalLiabilities} The populated <code>FinancialPictureResponseTotalLiabilities</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('balance')) {
        obj['balance'] = ApiClient.convertToType(data['balance'], 'Number');
      }
      if (data.hasOwnProperty('latest_balance_time_stamp')) {
        obj['latest_balance_time_stamp'] = ApiClient.convertToType(data['latest_balance_time_stamp'], 'String');
      }
    }
    return obj;
  }

  /**
   * Value of the total liabilities
   * @member {Number} balance
   */
  exports.prototype['balance'] = undefined;
  /**
   * Date and time of the total liabilities record
   * @member {String} latest_balance_time_stamp
   */
  exports.prototype['latest_balance_time_stamp'] = undefined;



  return exports;
}));


