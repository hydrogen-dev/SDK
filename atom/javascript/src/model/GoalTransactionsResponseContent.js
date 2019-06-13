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
    root.atom_api.GoalTransactionsResponseContent = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The GoalTransactionsResponseContent model module.
   * @module model/GoalTransactionsResponseContent
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>GoalTransactionsResponseContent</code>.
   * @alias module:model/GoalTransactionsResponseContent
   * @class
   */
  var exports = function() {
    var _this = this;













  };

  /**
   * Constructs a <code>GoalTransactionsResponseContent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/GoalTransactionsResponseContent} obj Optional instance to populate.
   * @return {module:model/GoalTransactionsResponseContent} The populated <code>GoalTransactionsResponseContent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('is_read')) {
        obj['is_read'] = ApiClient.convertToType(data['is_read'], 'Boolean');
      }
      if (data.hasOwnProperty('portfolio_id')) {
        obj['portfolio_id'] = ApiClient.convertToType(data['portfolio_id'], 'String');
      }
      if (data.hasOwnProperty('model_id')) {
        obj['model_id'] = ApiClient.convertToType(data['model_id'], 'String');
      }
      if (data.hasOwnProperty('price')) {
        obj['price'] = ApiClient.convertToType(data['price'], 'Number');
      }
      if (data.hasOwnProperty('quantity')) {
        obj['quantity'] = ApiClient.convertToType(data['quantity'], 'Number');
      }
      if (data.hasOwnProperty('security_id')) {
        obj['security_id'] = ApiClient.convertToType(data['security_id'], 'String');
      }
      if (data.hasOwnProperty('transaction_code_id')) {
        obj['transaction_code_id'] = ApiClient.convertToType(data['transaction_code_id'], 'String');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * The ID for the transaction record
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Date of the transaction record
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * Indicator to show whether or not the transaction has been read. Defaults to true which indicates it has been read.
   * @member {Boolean} is_read
   * @default true
   */
  exports.prototype['is_read'] = true;
  /**
   * The ID of the portfolio that the transaction falls under
   * @member {String} portfolio_id
   */
  exports.prototype['portfolio_id'] = undefined;
  /**
   * The ID of the model to which the portfolio that the transaction falls under subscribes
   * @member {String} model_id
   */
  exports.prototype['model_id'] = undefined;
  /**
   * Price for the security included in the transaction at which is was sold or purchased
   * @member {Number} price
   */
  exports.prototype['price'] = undefined;
  /**
   * Quantity of shares of the security purchased
   * @member {Number} quantity
   */
  exports.prototype['quantity'] = undefined;
  /**
   * The ID of the security included in the transaction
   * @member {String} security_id
   */
  exports.prototype['security_id'] = undefined;
  /**
   * The ID referring to the transaction codes defined by your firm
   * @member {String} transaction_code_id
   */
  exports.prototype['transaction_code_id'] = undefined;
  /**
   * Alternate ID that can be used to identify the object such as an internal id
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * Timestamp for the date and time that the record was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * Timestamp for the date and time that the record was last updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


