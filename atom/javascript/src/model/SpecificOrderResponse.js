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
 * Swagger Codegen version: 2.4.8-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/CreateOrderResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CreateOrderResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SpecificOrderResponse = factory(root.atom_api.ApiClient, root.atom_api.CreateOrderResponse);
  }
}(this, function(ApiClient, CreateOrderResponse) {
  'use strict';




  /**
   * The SpecificOrderResponse model module.
   * @module model/SpecificOrderResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SpecificOrderResponse</code>.
   * @alias module:model/SpecificOrderResponse
   * @class
   * @implements module:model/CreateOrderResponse
   * @param transactionCodeId {String} The ID referring to the transaction codes defined by your firm
   * @param quantity {Number} The number of shares of security being bought or sold
   * @param securityId {String} The ID of the security being bought or sold
   * @param _date {Date} Date for when the order was generated
   */
  var exports = function(transactionCodeId, quantity, securityId, _date) {
    var _this = this;

    CreateOrderResponse.call(_this, transactionCodeId, quantity, securityId, _date);

  };

  /**
   * Constructs a <code>SpecificOrderResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecificOrderResponse} obj Optional instance to populate.
   * @return {module:model/SpecificOrderResponse} The populated <code>SpecificOrderResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      CreateOrderResponse.constructFromObject(data, obj);
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * Datetime the order record was last updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;

  // Implement CreateOrderResponse interface:
  /**
   * The ID referring to the transaction codes defined by your firm
   * @member {String} transaction_code_id
   */
exports.prototype['transaction_code_id'] = undefined;

  /**
   * The number of shares of security being bought or sold
   * @member {Number} quantity
   */
exports.prototype['quantity'] = undefined;

  /**
   * The ID of the security being bought or sold
   * @member {String} security_id
   */
exports.prototype['security_id'] = undefined;

  /**
   * Date for when the order was generated
   * @member {Date} date
   */
exports.prototype['date'] = undefined;

  /**
   * Price of the security at the time the order is created. Should be provided to use the rebalancing functionality
   * @member {Number} price
   */
exports.prototype['price'] = undefined;

  /**
   * In the case that the order is part of a bulk order, the ID of the bulk order
   * @member {String} order_bulk_id
   */
exports.prototype['order_bulk_id'] = undefined;

  /**
   * Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read
   * @member {Boolean} is_read
   * @default false
   */
exports.prototype['is_read'] = false;

  /**
   * Type of the order transaction
   * @member {String} order_type
   */
exports.prototype['order_type'] = undefined;

  /**
   * The ID that reflects all orders generated during a rebalance
   * @member {String} order_ticket_id
   */
exports.prototype['order_ticket_id'] = undefined;

  /**
   * The ID of the portfolio that the order falls under. Used when aggregating order records into Bulk Order
   * @member {String} portfolio_id
   */
exports.prototype['portfolio_id'] = undefined;

  /**
   * The ID of the account that the order falls under. Used when aggregating order records into Bulk Order
   * @member {String} account_id
   */
exports.prototype['account_id'] = undefined;

  /**
   * The ID of the model with which the order is associated. Used when aggregating order records into Bulk Order
   * @member {String} model_id
   */
exports.prototype['model_id'] = undefined;

  /**
   * Custom information associated with the order record in the format key:value
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;

  /**
   * ID of the order record
   * @member {String} id
   */
exports.prototype['id'] = undefined;

  /**
   * Datetime the order record was created
   * @member {String} create_date
   */
exports.prototype['create_date'] = undefined;



  return exports;
}));


