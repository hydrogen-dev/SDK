/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
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
    define(['ApiClient', 'model/CreateOrderStatusResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CreateOrderStatusResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SpecificOrderStatusResponse = factory(root.atom_api.ApiClient, root.atom_api.CreateOrderStatusResponse);
  }
}(this, function(ApiClient, CreateOrderStatusResponse) {
  'use strict';




  /**
   * The SpecificOrderStatusResponse model module.
   * @module model/SpecificOrderStatusResponse
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>SpecificOrderStatusResponse</code>.
   * @alias module:model/SpecificOrderStatusResponse
   * @class
   * @implements module:model/CreateOrderStatusResponse
   * @param status {String} Value of the order status such as “Passed to Agent”
   * @param description {String} Additional description of the order status
   */
  var exports = function(status, description) {
    var _this = this;

    CreateOrderStatusResponse.call(_this, status, description);

  };

  /**
   * Constructs a <code>SpecificOrderStatusResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecificOrderStatusResponse} obj Optional instance to populate.
   * @return {module:model/SpecificOrderStatusResponse} The populated <code>SpecificOrderStatusResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      CreateOrderStatusResponse.constructFromObject(data, obj);
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * Datetime the order status was last updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;

  // Implement CreateOrderStatusResponse interface:
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



  return exports;
}));

