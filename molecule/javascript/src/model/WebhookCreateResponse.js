/**
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
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
    define(['ApiClient', 'model/WebhookCreatePayload'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./WebhookCreatePayload'));
  } else {
    // Browser globals (root is window)
    if (!root.molecule_api) {
      root.molecule_api = {};
    }
    root.molecule_api.WebhookCreateResponse = factory(root.molecule_api.ApiClient, root.molecule_api.WebhookCreatePayload);
  }
}(this, function(ApiClient, WebhookCreatePayload) {
  'use strict';




  /**
   * The WebhookCreateResponse model module.
   * @module model/WebhookCreateResponse
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>WebhookCreateResponse</code>.
   * @alias module:model/WebhookCreateResponse
   * @class
   * @implements module:model/WebhookCreatePayload
   * @param url {String} The url you want to receive the payloads to.
   * @param isActive {Boolean} Indicates if this webhook is active.
   */
  var exports = function(url, isActive) {
    var _this = this;

    WebhookCreatePayload.call(_this, url, isActive);


  };

  /**
   * Constructs a <code>WebhookCreateResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WebhookCreateResponse} obj Optional instance to populate.
   * @return {module:model/WebhookCreateResponse} The populated <code>WebhookCreateResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      WebhookCreatePayload.constructFromObject(data, obj);
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * ID of the webhook record
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Datetime the webhook record was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;

  // Implement WebhookCreatePayload interface:
  /**
   * The array of webhook codes for a webhook to notify.
   * @member {Array.<String>} webhook_codes
   */
exports.prototype['webhook_codes'] = undefined;

  /**
   * The url you want to receive the payloads to.
   * @member {String} url
   */
exports.prototype['url'] = undefined;

  /**
   * Indicates if this webhook is active.
   * @member {Boolean} is_active
   */
exports.prototype['is_active'] = undefined;



  return exports;
}));


