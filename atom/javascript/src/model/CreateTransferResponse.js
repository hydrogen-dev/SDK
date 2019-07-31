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
    define(['ApiClient', 'model/SecondaryId', 'model/TransferRequestPayload'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecondaryId'), require('./TransferRequestPayload'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.CreateTransferResponse = factory(root.atom_api.ApiClient, root.atom_api.SecondaryId, root.atom_api.TransferRequestPayload);
  }
}(this, function(ApiClient, SecondaryId, TransferRequestPayload) {
  'use strict';




  /**
   * The CreateTransferResponse model module.
   * @module model/CreateTransferResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>CreateTransferResponse</code>.
   * @alias module:model/CreateTransferResponse
   * @class
   * @implements module:model/TransferRequestPayload
   * @param accountId {String} The ID of the account to which the transfer belongs
   * @param accountHolder {String} Name of the individual that is the owner of the external account
   * @param accountNumber {String} Account number for the external account that is the source of the funds
   * @param accountTypeId {String} The ID for the type of the account on your platform
   * @param firmName {String} Name of the firm that previously held or holds the external account
   * @param transferAllCash {Boolean} Indicator if the external account should be entirely converted to cash to be transferred.
   */
  var exports = function(accountId, accountHolder, accountNumber, accountTypeId, firmName, transferAllCash) {
    var _this = this;

    TransferRequestPayload.call(_this, accountId, accountHolder, accountNumber, accountTypeId, firmName, transferAllCash);


  };

  /**
   * Constructs a <code>CreateTransferResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateTransferResponse} obj Optional instance to populate.
   * @return {module:model/CreateTransferResponse} The populated <code>CreateTransferResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      TransferRequestPayload.constructFromObject(data, obj);
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
   * ID of the transfer request
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Datetime the transfer request was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;

  // Implement TransferRequestPayload interface:
  /**
   * The ID of the account to which the transfer belongs
   * @member {String} account_id
   */
exports.prototype['account_id'] = undefined;

  /**
   * Name of the individual that is the owner of the external account
   * @member {String} account_holder
   */
exports.prototype['account_holder'] = undefined;

  /**
   * Account number for the external account that is the source of the funds
   * @member {String} account_number
   */
exports.prototype['account_number'] = undefined;

  /**
   * The ID for the type of the account on your platform
   * @member {String} account_type_id
   */
exports.prototype['account_type_id'] = undefined;

  /**
   * Name of the firm that previously held or holds the external account
   * @member {String} firm_name
   */
exports.prototype['firm_name'] = undefined;

  /**
   * Indicator if the external account should be entirely converted to cash to be transferred.
   * @member {Boolean} transfer_all_cash
   */
exports.prototype['transfer_all_cash'] = undefined;

  /**
   * Amount that is transferred
   * @member {Number} amount
   */
exports.prototype['amount'] = undefined;

  /**
   * Comment for the transfer such as “Funded”
   * @member {String} comment
   */
exports.prototype['comment'] = undefined;

  /**
   * Number of the Deposit Trust Company (DTC)’s that held or holds the external account usually in the case of an Individual Retirement Account (IRA) in the United States
   * @member {String} dtc_number
   */
exports.prototype['dtc_number'] = undefined;

  /**
   * In the case that the account is a United States Roth IRA account, the year it was opened (e.g. 2010)
   * @member {Number} roth_five_year
   */
exports.prototype['roth_five_year'] = undefined;

  /**
   * Status of the transfer such as “Pending”
   * @member {String} status
   */
exports.prototype['status'] = undefined;

  /**
   * Type of transaction being made such as “wire” or “check”
   * @member {String} transfer_type
   */
exports.prototype['transfer_type'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;

  /**
   * Custom information associated with the transfer in the format key:value
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;



  return exports;
}));


