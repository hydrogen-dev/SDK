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
    root.molecule_api.CurrencyTransferPayload = factory(root.molecule_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CurrencyTransferPayload model module.
   * @module model/CurrencyTransferPayload
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>CurrencyTransferPayload</code>.
   * @alias module:model/CurrencyTransferPayload
   * @class
   * @param senderWalletId {String} The uuid of the sender wallet.
   * @param receiverWalletId {String} The uuid of the receiver wallet.
   * @param currencyId {String} The uuid of the currency being transferred.
   * @param amount {Number} Amount of currencies to be transferred.
   */
  var exports = function(senderWalletId, receiverWalletId, currencyId, amount) {
    var _this = this;

    _this['sender_wallet_id'] = senderWalletId;
    _this['receiver_wallet_id'] = receiverWalletId;
    _this['currency_id'] = currencyId;
    _this['amount'] = amount;
  };

  /**
   * Constructs a <code>CurrencyTransferPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CurrencyTransferPayload} obj Optional instance to populate.
   * @return {module:model/CurrencyTransferPayload} The populated <code>CurrencyTransferPayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('sender_wallet_id')) {
        obj['sender_wallet_id'] = ApiClient.convertToType(data['sender_wallet_id'], 'String');
      }
      if (data.hasOwnProperty('receiver_wallet_id')) {
        obj['receiver_wallet_id'] = ApiClient.convertToType(data['receiver_wallet_id'], 'String');
      }
      if (data.hasOwnProperty('currency_id')) {
        obj['currency_id'] = ApiClient.convertToType(data['currency_id'], 'String');
      }
      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
      }
    }
    return obj;
  }

  /**
   * The uuid of the sender wallet.
   * @member {String} sender_wallet_id
   */
  exports.prototype['sender_wallet_id'] = undefined;
  /**
   * The uuid of the receiver wallet.
   * @member {String} receiver_wallet_id
   */
  exports.prototype['receiver_wallet_id'] = undefined;
  /**
   * The uuid of the currency being transferred.
   * @member {String} currency_id
   */
  exports.prototype['currency_id'] = undefined;
  /**
   * Amount of currencies to be transferred.
   * @member {Number} amount
   */
  exports.prototype['amount'] = undefined;



  return exports;
}));


