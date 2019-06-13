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
    root.atom_api.OrderStatusPayload = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The OrderStatusPayload model module.
   * @module model/OrderStatusPayload
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>OrderStatusPayload</code>.
   * @alias module:model/OrderStatusPayload
   * @class
   * @param status {String} Value of the order status such as “Passed to Agent”
   * @param description {String} Additional description of the order status
   */
  var exports = function(status, description) {
    var _this = this;

    _this['status'] = status;
    _this['description'] = description;
  };

  /**
   * Constructs a <code>OrderStatusPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OrderStatusPayload} obj Optional instance to populate.
   * @return {module:model/OrderStatusPayload} The populated <code>OrderStatusPayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
    }
    return obj;
  }

  /**
   * Value of the order status such as “Passed to Agent”
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * Additional description of the order status
   * @member {String} description
   */
  exports.prototype['description'] = undefined;



  return exports;
}));


