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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.molecule_api) {
      root.molecule_api = {};
    }
    root.molecule_api.CurrencyTransferSpecificResponse = factory(root.molecule_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CurrencyTransferSpecificResponse model module.
   * @module model/CurrencyTransferSpecificResponse
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>CurrencyTransferSpecificResponse</code>.
   * @alias module:model/CurrencyTransferSpecificResponse
   * @class
   */
  var exports = function() {
    var _this = this;









  };

  /**
   * Constructs a <code>CurrencyTransferSpecificResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CurrencyTransferSpecificResponse} obj Optional instance to populate.
   * @return {module:model/CurrencyTransferSpecificResponse} The populated <code>CurrencyTransferSpecificResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('sender_wallet_id')) {
        obj['sender_wallet_id'] = ApiClient.convertToType(data['sender_wallet_id'], 'String');
      }
      if (data.hasOwnProperty('receiver_wallet_id')) {
        obj['receiver_wallet_id'] = ApiClient.convertToType(data['receiver_wallet_id'], 'String');
      }
      if (data.hasOwnProperty('currency_symbol')) {
        obj['currency_symbol'] = ApiClient.convertToType(data['currency_symbol'], 'String');
      }
      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
      }
      if (data.hasOwnProperty('tx_hash')) {
        obj['tx_hash'] = ApiClient.convertToType(data['tx_hash'], 'String');
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
   * ID of the token supply
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * ID of the sender wallet
   * @member {String} sender_wallet_id
   */
  exports.prototype['sender_wallet_id'] = undefined;
  /**
   * ID of the receiver wallet
   * @member {String} receiver_wallet_id
   */
  exports.prototype['receiver_wallet_id'] = undefined;
  /**
   * Symbol of the currency being transferred
   * @member {String} currency_symbol
   */
  exports.prototype['currency_symbol'] = undefined;
  /**
   * Amount of currencies being transferred
   * @member {Number} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * Hash of the transfer transaction
   * @member {String} tx_hash
   */
  exports.prototype['tx_hash'] = undefined;
  /**
   * Datetime the currency transfer record was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * Datetime the currency transfer record was updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));

