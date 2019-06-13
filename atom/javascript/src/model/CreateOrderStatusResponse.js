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
    define(['ApiClient', 'model/OrderStatusPayload'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./OrderStatusPayload'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.CreateOrderStatusResponse = factory(root.atom_api.ApiClient, root.atom_api.OrderStatusPayload);
  }
}(this, function(ApiClient, OrderStatusPayload) {
  'use strict';




  /**
   * The CreateOrderStatusResponse model module.
   * @module model/CreateOrderStatusResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>CreateOrderStatusResponse</code>.
   * @alias module:model/CreateOrderStatusResponse
   * @class
   * @implements module:model/OrderStatusPayload
   * @param status {String} Value of the order status such as “Passed to Agent”
   * @param description {String} Additional description of the order status
   */
  var exports = function(status, description) {
    var _this = this;

    OrderStatusPayload.call(_this, status, description);


  };

  /**
   * Constructs a <code>CreateOrderStatusResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateOrderStatusResponse} obj Optional instance to populate.
   * @return {module:model/CreateOrderStatusResponse} The populated <code>CreateOrderStatusResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      OrderStatusPayload.constructFromObject(data, obj);
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
   * ID of the order status record
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Datetime the order status record was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;

  // Implement OrderStatusPayload interface:
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


