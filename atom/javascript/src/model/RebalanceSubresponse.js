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
    root.atom_api.RebalanceSubresponse = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The RebalanceSubresponse model module.
   * @module model/RebalanceSubresponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>RebalanceSubresponse</code>.
   * @alias module:model/RebalanceSubresponse
   * @class
   */
  var exports = function() {
    var _this = this;














  };

  /**
   * Constructs a <code>RebalanceSubresponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RebalanceSubresponse} obj Optional instance to populate.
   * @return {module:model/RebalanceSubresponse} The populated <code>RebalanceSubresponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
      if (data.hasOwnProperty('transaction_code_id')) {
        obj['transaction_code_id'] = ApiClient.convertToType(data['transaction_code_id'], 'String');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('price')) {
        obj['price'] = ApiClient.convertToType(data['price'], 'Number');
      }
      if (data.hasOwnProperty('is_read')) {
        obj['is_read'] = ApiClient.convertToType(data['is_read'], 'Boolean');
      }
      if (data.hasOwnProperty('quantity')) {
        obj['quantity'] = ApiClient.convertToType(data['quantity'], 'Number');
      }
      if (data.hasOwnProperty('security_id')) {
        obj['security_id'] = ApiClient.convertToType(data['security_id'], 'String');
      }
      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('portfolio_id')) {
        obj['portfolio_id'] = ApiClient.convertToType(data['portfolio_id'], 'String');
      }
      if (data.hasOwnProperty('model_id')) {
        obj['model_id'] = ApiClient.convertToType(data['model_id'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
      }
    }
    return obj;
  }

  /**
   * ID of the order
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Datetime the order was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * Datetime the order was last updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;
  /**
   * ID of the transaction code
   * @member {String} transaction_code_id
   */
  exports.prototype['transaction_code_id'] = undefined;
  /**
   * Date the order was generated
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * Price of the security at the time the order is created
   * @member {Number} price
   */
  exports.prototype['price'] = undefined;
  /**
   * Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read
   * @member {Boolean} is_read
   * @default false
   */
  exports.prototype['is_read'] = false;
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
   * The ID of the account that the order falls under
   * @member {String} account_id
   */
  exports.prototype['account_id'] = undefined;
  /**
   * The ID of the portfolio that the order falls under
   * @member {String} portfolio_id
   */
  exports.prototype['portfolio_id'] = undefined;
  /**
   * The ID of the model with which the order is associated
   * @member {String} model_id
   */
  exports.prototype['model_id'] = undefined;
  /**
   * Custom information associated with the order record in the format key:value
   * @member {Object} metadata
   */
  exports.prototype['metadata'] = undefined;



  return exports;
}));


