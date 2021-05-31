/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
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
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.BankLink = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The BankLink model module.
   * @module model/BankLink
   * @version 1.9.0
   */

  /**
   * Constructs a new <code>BankLink</code>.
   * BankLink Object
   * @alias module:model/BankLink
   * @class
   * @param bankAccountHolder {String} bankAccountHolder
   * @param bankAccountNumber {String} bankAccountNumber
   * @param institutionName {String} institutionName
   * @param routing {String} routing
   */
  var exports = function(bankAccountHolder, bankAccountNumber, institutionName, routing) {
    var _this = this;




    _this['bank_account_holder'] = bankAccountHolder;

    _this['bank_account_number'] = bankAccountNumber;






    _this['institution_name'] = institutionName;






    _this['routing'] = routing;




  };

  /**
   * Constructs a <code>BankLink</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BankLink} obj Optional instance to populate.
   * @return {module:model/BankLink} The populated <code>BankLink</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('available_balance')) {
        obj['available_balance'] = ApiClient.convertToType(data['available_balance'], 'Number');
      }
      if (data.hasOwnProperty('balance')) {
        obj['balance'] = ApiClient.convertToType(data['balance'], 'Number');
      }
      if (data.hasOwnProperty('bank_account_holder')) {
        obj['bank_account_holder'] = ApiClient.convertToType(data['bank_account_holder'], 'String');
      }
      if (data.hasOwnProperty('bank_account_name')) {
        obj['bank_account_name'] = ApiClient.convertToType(data['bank_account_name'], 'String');
      }
      if (data.hasOwnProperty('bank_account_number')) {
        obj['bank_account_number'] = ApiClient.convertToType(data['bank_account_number'], 'String');
      }
      if (data.hasOwnProperty('business_id')) {
        obj['business_id'] = ApiClient.convertToType(data['business_id'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('institution_id')) {
        obj['institution_id'] = ApiClient.convertToType(data['institution_id'], 'String');
      }
      if (data.hasOwnProperty('institution_name')) {
        obj['institution_name'] = ApiClient.convertToType(data['institution_name'], 'String');
      }
      if (data.hasOwnProperty('is_active')) {
        obj['is_active'] = ApiClient.convertToType(data['is_active'], 'Boolean');
      }
      if (data.hasOwnProperty('is_default')) {
        obj['is_default'] = ApiClient.convertToType(data['is_default'], 'Boolean');
      }
      if (data.hasOwnProperty('is_link_verified')) {
        obj['is_link_verified'] = ApiClient.convertToType(data['is_link_verified'], 'Boolean');
      }
      if (data.hasOwnProperty('link_verified_date')) {
        obj['link_verified_date'] = ApiClient.convertToType(data['link_verified_date'], 'Date');
      }
      if (data.hasOwnProperty('mask')) {
        obj['mask'] = ApiClient.convertToType(data['mask'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('routing')) {
        obj['routing'] = ApiClient.convertToType(data['routing'], 'String');
      }
      if (data.hasOwnProperty('routing_wire')) {
        obj['routing_wire'] = ApiClient.convertToType(data['routing_wire'], 'String');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * accountId
   * @member {String} account_id
   */
  exports.prototype['account_id'] = undefined;
  /**
   * availableBalance
   * @member {Number} available_balance
   */
  exports.prototype['available_balance'] = undefined;
  /**
   * balance
   * @member {Number} balance
   */
  exports.prototype['balance'] = undefined;
  /**
   * bankAccountHolder
   * @member {String} bank_account_holder
   */
  exports.prototype['bank_account_holder'] = undefined;
  /**
   * bankAccountName
   * @member {String} bank_account_name
   */
  exports.prototype['bank_account_name'] = undefined;
  /**
   * bankAccountNumber
   * @member {String} bank_account_number
   */
  exports.prototype['bank_account_number'] = undefined;
  /**
   * businessId
   * @member {String} business_id
   */
  exports.prototype['business_id'] = undefined;
  /**
   * clientId
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * currencyCode
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * institutionId
   * @member {String} institution_id
   */
  exports.prototype['institution_id'] = undefined;
  /**
   * institutionName
   * @member {String} institution_name
   */
  exports.prototype['institution_name'] = undefined;
  /**
   * isActive
   * @member {Boolean} is_active
   */
  exports.prototype['is_active'] = undefined;
  /**
   * isDefault
   * @member {Boolean} is_default
   */
  exports.prototype['is_default'] = undefined;
  /**
   * isLinkVerified
   * @member {Boolean} is_link_verified
   */
  exports.prototype['is_link_verified'] = undefined;
  /**
   * linkVerifiedDate
   * @member {Date} link_verified_date
   */
  exports.prototype['link_verified_date'] = undefined;
  /**
   * mask
   * @member {String} mask
   */
  exports.prototype['mask'] = undefined;
  /**
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * routing
   * @member {String} routing
   */
  exports.prototype['routing'] = undefined;
  /**
   * routingWire
   * @member {String} routing_wire
   */
  exports.prototype['routing_wire'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * type
   * @member {String} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


