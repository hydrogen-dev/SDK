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
    root.HydrogenProtonApi.FinancialPictureRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The FinancialPictureRequest model module.
   * @module model/FinancialPictureRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>FinancialPictureRequest</code>.
   * @alias module:model/FinancialPictureRequest
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>FinancialPictureRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FinancialPictureRequest} obj Optional instance to populate.
   * @return {module:model/FinancialPictureRequest} The populated <code>FinancialPictureRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('currency_code'))
        obj.currencyCode = ApiClient.convertToType(data['currency_code'], 'String');
      if (data.hasOwnProperty('client_id'))
        obj.clientId = ApiClient.convertToType(data['client_id'], 'String');
      if (data.hasOwnProperty('show_history'))
        obj.showHistory = ApiClient.convertToType(data['show_history'], 'Boolean');
      if (data.hasOwnProperty('end_date'))
        obj.endDate = ApiClient.convertToType(data['end_date'], 'Date');
      if (data.hasOwnProperty('currency_conversion'))
        obj.currencyConversion = ApiClient.convertToType(data['currency_conversion'], 'String');
      if (data.hasOwnProperty('start_date'))
        obj.startDate = ApiClient.convertToType(data['start_date'], 'Date');
      if (data.hasOwnProperty('show_category_breakdown'))
        obj.showCategoryBreakdown = ApiClient.convertToType(data['show_category_breakdown'], 'Boolean');
      if (data.hasOwnProperty('show_change'))
        obj.showChange = ApiClient.convertToType(data['show_change'], 'Boolean');
      if (data.hasOwnProperty('household_id'))
        obj.householdId = ApiClient.convertToType(data['household_id'], 'String');
      if (data.hasOwnProperty('create_log'))
        obj.createLog = ApiClient.convertToType(data['create_log'], 'Boolean');
    }
    return obj;
  }

  /**
   * @member {String} currencyCode
   */
  exports.prototype.currencyCode = undefined;

  /**
   * @member {String} clientId
   */
  exports.prototype.clientId = undefined;

  /**
   * @member {Boolean} showHistory
   * @default false
   */
  exports.prototype.showHistory = false;

  /**
   * @member {Date} endDate
   */
  exports.prototype.endDate = undefined;

  /**
   * @member {String} currencyConversion
   */
  exports.prototype.currencyConversion = undefined;

  /**
   * @member {Date} startDate
   */
  exports.prototype.startDate = undefined;

  /**
   * @member {Boolean} showCategoryBreakdown
   * @default true
   */
  exports.prototype.showCategoryBreakdown = true;

  /**
   * @member {Boolean} showChange
   * @default false
   */
  exports.prototype.showChange = false;

  /**
   * @member {String} householdId
   */
  exports.prototype.householdId = undefined;

  /**
   * @member {Boolean} createLog
   * @default false
   */
  exports.prototype.createLog = false;


  return exports;

}));
