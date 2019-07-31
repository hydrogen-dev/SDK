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
    root.atom_api.BulkOrderAccountPayload = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The BulkOrderAccountPayload model module.
   * @module model/BulkOrderAccountPayload
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>BulkOrderAccountPayload</code>.
   * @alias module:model/BulkOrderAccountPayload
   * @class
   * @param _date {Date} Date for all the orders that should be aggregated together in the bulk order record
   * @param buyTransactionCodeId {String} The ID of the transaction code that will ultimately be used to denote the buy transactions
   * @param sellTransactionCodeId {String} The ID of the transaction code that will ultimately be used to denote the sell transactions
   */
  var exports = function(_date, buyTransactionCodeId, sellTransactionCodeId) {
    var _this = this;

    _this['date'] = _date;
    _this['buy_transaction_code_id'] = buyTransactionCodeId;
    _this['sell_transaction_code_id'] = sellTransactionCodeId;

  };

  /**
   * Constructs a <code>BulkOrderAccountPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BulkOrderAccountPayload} obj Optional instance to populate.
   * @return {module:model/BulkOrderAccountPayload} The populated <code>BulkOrderAccountPayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('buy_transaction_code_id')) {
        obj['buy_transaction_code_id'] = ApiClient.convertToType(data['buy_transaction_code_id'], 'String');
      }
      if (data.hasOwnProperty('sell_transaction_code_id')) {
        obj['sell_transaction_code_id'] = ApiClient.convertToType(data['sell_transaction_code_id'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
      }
    }
    return obj;
  }

  /**
   * Date for all the orders that should be aggregated together in the bulk order record
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * The ID of the transaction code that will ultimately be used to denote the buy transactions
   * @member {String} buy_transaction_code_id
   */
  exports.prototype['buy_transaction_code_id'] = undefined;
  /**
   * The ID of the transaction code that will ultimately be used to denote the sell transactions
   * @member {String} sell_transaction_code_id
   */
  exports.prototype['sell_transaction_code_id'] = undefined;
  /**
   * Custom information associated with the bulk order in the format key:value
   * @member {Object} metadata
   */
  exports.prototype['metadata'] = undefined;



  return exports;
}));


