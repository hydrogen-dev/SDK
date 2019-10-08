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
    define(['ApiClient', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.PortfolioTransactionPayload = factory(root.atom_api.ApiClient, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, SecondaryId) {
  'use strict';




  /**
   * The PortfolioTransactionPayload model module.
   * @module model/PortfolioTransactionPayload
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>PortfolioTransactionPayload</code>.
   * @alias module:model/PortfolioTransactionPayload
   * @class
   * @param portfolioId {String} The ID of the portfolio that the transaction record falls under
   * @param securityId {String} The ID of the security that was bought or sold in the transaction
   * @param transactionCodeId {String} The ID of the transaction code for the type of transaction
   * @param _date {Date} Date for this transaction record
   */
  var exports = function(portfolioId, securityId, transactionCodeId, _date) {
    var _this = this;

    _this['portfolio_id'] = portfolioId;
    _this['security_id'] = securityId;
    _this['transaction_code_id'] = transactionCodeId;
    _this['date'] = _date;




  };

  /**
   * Constructs a <code>PortfolioTransactionPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioTransactionPayload} obj Optional instance to populate.
   * @return {module:model/PortfolioTransactionPayload} The populated <code>PortfolioTransactionPayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolio_id')) {
        obj['portfolio_id'] = ApiClient.convertToType(data['portfolio_id'], 'String');
      }
      if (data.hasOwnProperty('security_id')) {
        obj['security_id'] = ApiClient.convertToType(data['security_id'], 'String');
      }
      if (data.hasOwnProperty('transaction_code_id')) {
        obj['transaction_code_id'] = ApiClient.convertToType(data['transaction_code_id'], 'String');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('is_read')) {
        obj['is_read'] = ApiClient.convertToType(data['is_read'], 'Boolean');
      }
      if (data.hasOwnProperty('price')) {
        obj['price'] = ApiClient.convertToType(data['price'], 'Number');
      }
      if (data.hasOwnProperty('quantity')) {
        obj['quantity'] = ApiClient.convertToType(data['quantity'], 'Number');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = SecondaryId.constructFromObject(data['secondary_id']);
      }
    }
    return obj;
  }

  /**
   * The ID of the portfolio that the transaction record falls under
   * @member {String} portfolio_id
   */
  exports.prototype['portfolio_id'] = undefined;
  /**
   * The ID of the security that was bought or sold in the transaction
   * @member {String} security_id
   */
  exports.prototype['security_id'] = undefined;
  /**
   * The ID of the transaction code for the type of transaction
   * @member {String} transaction_code_id
   */
  exports.prototype['transaction_code_id'] = undefined;
  /**
   * Date for this transaction record
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * Indicates if the transaction has been read. Defaults to false which indicates that it has not been read
   * @member {Boolean} is_read
   * @default false
   */
  exports.prototype['is_read'] = false;
  /**
   * Price at which the security was bought or sold
   * @member {Number} price
   */
  exports.prototype['price'] = undefined;
  /**
   * Quantity of units of a security that were bought or sold
   * @member {Number} quantity
   */
  exports.prototype['quantity'] = undefined;
  /**
   * @member {module:model/SecondaryId} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;



  return exports;
}));


