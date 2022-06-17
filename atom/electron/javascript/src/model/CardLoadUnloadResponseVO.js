/*
 * Hydrogen Electron API
 * The Hydrogen Electron API
 *
 * OpenAPI spec version: 1.3.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.24
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
    if (!root.HydrogenElectronApi) {
      root.HydrogenElectronApi = {};
    }
    root.HydrogenElectronApi.CardLoadUnloadResponseVO = factory(root.HydrogenElectronApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The CardLoadUnloadResponseVO model module.
   * @module model/CardLoadUnloadResponseVO
   * @version 1.3.1
   */

  /**
   * Constructs a new <code>CardLoadUnloadResponseVO</code>.
   * @alias module:model/CardLoadUnloadResponseVO
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>CardLoadUnloadResponseVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CardLoadUnloadResponseVO} obj Optional instance to populate.
   * @return {module:model/CardLoadUnloadResponseVO} The populated <code>CardLoadUnloadResponseVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('amount'))
        obj.amount = ApiClient.convertToType(data['amount'], 'Number');
      if (data.hasOwnProperty('card_status'))
        obj.cardStatus = ApiClient.convertToType(data['card_status'], 'String');
      if (data.hasOwnProperty('message'))
        obj.message = ApiClient.convertToType(data['message'], 'String');
      if (data.hasOwnProperty('nucleus_card_id'))
        obj.nucleusCardId = ApiClient.convertToType(data['nucleus_card_id'], 'String');
      if (data.hasOwnProperty('nucleus_funding_id'))
        obj.nucleusFundingId = ApiClient.convertToType(data['nucleus_funding_id'], 'String');
      if (data.hasOwnProperty('vendor_name'))
        obj.vendorName = ApiClient.convertToType(data['vendor_name'], 'String');
      if (data.hasOwnProperty('vendor_response'))
        obj.vendorResponse = ApiClient.convertToType(data['vendor_response'], Object);
    }
    return obj;
  }

  /**
   * @member {Number} amount
   */
  exports.prototype.amount = undefined;

  /**
   * @member {String} cardStatus
   */
  exports.prototype.cardStatus = undefined;

  /**
   * @member {String} message
   */
  exports.prototype.message = undefined;

  /**
   * @member {String} nucleusCardId
   */
  exports.prototype.nucleusCardId = undefined;

  /**
   * @member {String} nucleusFundingId
   */
  exports.prototype.nucleusFundingId = undefined;

  /**
   * @member {String} vendorName
   */
  exports.prototype.vendorName = undefined;

  /**
   * @member {Object} vendorResponse
   */
  exports.prototype.vendorResponse = undefined;


  return exports;

}));
