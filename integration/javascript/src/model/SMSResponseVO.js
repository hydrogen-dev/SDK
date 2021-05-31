/**
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
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
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.SMSResponseVO = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SMSResponseVO model module.
   * @module model/SMSResponseVO
   * @version 1.3.0
   */

  /**
   * Constructs a new <code>SMSResponseVO</code>.
   * @alias module:model/SMSResponseVO
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>SMSResponseVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SMSResponseVO} obj Optional instance to populate.
   * @return {module:model/SMSResponseVO} The populated <code>SMSResponseVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
      if (data.hasOwnProperty('nucleus_business_id')) {
        obj['nucleus_business_id'] = ApiClient.convertToType(data['nucleus_business_id'], 'String');
      }
      if (data.hasOwnProperty('nucleus_client_id')) {
        obj['nucleus_client_id'] = ApiClient.convertToType(data['nucleus_client_id'], 'String');
      }
      if (data.hasOwnProperty('sms_id')) {
        obj['sms_id'] = ApiClient.convertToType(data['sms_id'], 'String');
      }
      if (data.hasOwnProperty('vendor_name')) {
        obj['vendor_name'] = ApiClient.convertToType(data['vendor_name'], 'String');
      }
      if (data.hasOwnProperty('vendor_response')) {
        obj['vendor_response'] = ApiClient.convertToType(data['vendor_response'], Object);
      }
    }
    return obj;
  }

  /**
   * @member {String} message
   */
  exports.prototype['message'] = undefined;
  /**
   * @member {String} nucleus_business_id
   */
  exports.prototype['nucleus_business_id'] = undefined;
  /**
   * @member {String} nucleus_client_id
   */
  exports.prototype['nucleus_client_id'] = undefined;
  /**
   * @member {String} sms_id
   */
  exports.prototype['sms_id'] = undefined;
  /**
   * @member {String} vendor_name
   */
  exports.prototype['vendor_name'] = undefined;
  /**
   * @member {Object} vendor_response
   */
  exports.prototype['vendor_response'] = undefined;



  return exports;
}));


