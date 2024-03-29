/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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
    define(['ApiClient', 'model/CardAddress'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CardAddress'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.Card = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.CardAddress);
  }
}(this, function(ApiClient, CardAddress) {
  'use strict';




  /**
   * The Card model module.
   * @module model/Card
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>Card</code>.
   * Card Object
   * @alias module:model/Card
   * @class
   * @param cardHolderName {String} cardHolderName
   * @param cardIssuance {String} cardIssuance
   * @param cardName {String} cardName
   * @param cardType {String} cardType
   * @param portfolioId {String} portfolioId
   */
  var exports = function(cardHolderName, cardIssuance, cardName, cardType, portfolioId) {
    var _this = this;



    _this['card_holder_name'] = cardHolderName;

    _this['card_issuance'] = cardIssuance;
    _this['card_name'] = cardName;


    _this['card_type'] = cardType;
















    _this['portfolio_id'] = portfolioId;




  };

  /**
   * Constructs a <code>Card</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Card} obj Optional instance to populate.
   * @return {module:model/Card} The populated <code>Card</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], [CardAddress]);
      }
      if (data.hasOwnProperty('business_id')) {
        obj['business_id'] = ApiClient.convertToType(data['business_id'], 'String');
      }
      if (data.hasOwnProperty('card_holder_name')) {
        obj['card_holder_name'] = ApiClient.convertToType(data['card_holder_name'], 'String');
      }
      if (data.hasOwnProperty('card_image')) {
        obj['card_image'] = ApiClient.convertToType(data['card_image'], 'String');
      }
      if (data.hasOwnProperty('card_issuance')) {
        obj['card_issuance'] = ApiClient.convertToType(data['card_issuance'], 'String');
      }
      if (data.hasOwnProperty('card_name')) {
        obj['card_name'] = ApiClient.convertToType(data['card_name'], 'String');
      }
      if (data.hasOwnProperty('card_network')) {
        obj['card_network'] = ApiClient.convertToType(data['card_network'], 'String');
      }
      if (data.hasOwnProperty('card_program_id')) {
        obj['card_program_id'] = ApiClient.convertToType(data['card_program_id'], 'String');
      }
      if (data.hasOwnProperty('card_type')) {
        obj['card_type'] = ApiClient.convertToType(data['card_type'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('credit_limit')) {
        obj['credit_limit'] = ApiClient.convertToType(data['credit_limit'], 'Number');
      }
      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('expiry_date')) {
        obj['expiry_date'] = ApiClient.convertToType(data['expiry_date'], 'Date');
      }
      if (data.hasOwnProperty('fulfillment')) {
        obj['fulfillment'] = ApiClient.convertToType(data['fulfillment'], 'String');
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
      if (data.hasOwnProperty('is_pin_set')) {
        obj['is_pin_set'] = ApiClient.convertToType(data['is_pin_set'], 'Boolean');
      }
      if (data.hasOwnProperty('is_primary')) {
        obj['is_primary'] = ApiClient.convertToType(data['is_primary'], 'Boolean');
      }
      if (data.hasOwnProperty('is_reloadable')) {
        obj['is_reloadable'] = ApiClient.convertToType(data['is_reloadable'], 'Boolean');
      }
      if (data.hasOwnProperty('mask')) {
        obj['mask'] = ApiClient.convertToType(data['mask'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('phone_number')) {
        obj['phone_number'] = ApiClient.convertToType(data['phone_number'], 'String');
      }
      if (data.hasOwnProperty('portfolio_id')) {
        obj['portfolio_id'] = ApiClient.convertToType(data['portfolio_id'], 'String');
      }
      if (data.hasOwnProperty('prepaid_amount')) {
        obj['prepaid_amount'] = ApiClient.convertToType(data['prepaid_amount'], 'Number');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:model/CardAddress>} address
   */
  exports.prototype['address'] = undefined;
  /**
   * businessId
   * @member {String} business_id
   */
  exports.prototype['business_id'] = undefined;
  /**
   * cardHolderName
   * @member {String} card_holder_name
   */
  exports.prototype['card_holder_name'] = undefined;
  /**
   * card_image
   * @member {String} card_image
   */
  exports.prototype['card_image'] = undefined;
  /**
   * cardIssuance
   * @member {String} card_issuance
   */
  exports.prototype['card_issuance'] = undefined;
  /**
   * cardName
   * @member {String} card_name
   */
  exports.prototype['card_name'] = undefined;
  /**
   * cardNetwork
   * @member {String} card_network
   */
  exports.prototype['card_network'] = undefined;
  /**
   * cardProgramId
   * @member {String} card_program_id
   */
  exports.prototype['card_program_id'] = undefined;
  /**
   * cardType
   * @member {String} card_type
   */
  exports.prototype['card_type'] = undefined;
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
   * creditLimit
   * @member {Number} credit_limit
   */
  exports.prototype['credit_limit'] = undefined;
  /**
   * currencyCode
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * expiryDate
   * @member {Date} expiry_date
   */
  exports.prototype['expiry_date'] = undefined;
  /**
   * fulfillment
   * @member {String} fulfillment
   */
  exports.prototype['fulfillment'] = undefined;
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
   * is_active
   * @member {Boolean} is_active
   */
  exports.prototype['is_active'] = undefined;
  /**
   * is_pin_set
   * @member {Boolean} is_pin_set
   */
  exports.prototype['is_pin_set'] = undefined;
  /**
   * is_primary
   * @member {Boolean} is_primary
   */
  exports.prototype['is_primary'] = undefined;
  /**
   * is_reloadable
   * @member {Boolean} is_reloadable
   */
  exports.prototype['is_reloadable'] = undefined;
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
   * phoneNumber
   * @member {String} phone_number
   */
  exports.prototype['phone_number'] = undefined;
  /**
   * portfolioId
   * @member {String} portfolio_id
   */
  exports.prototype['portfolio_id'] = undefined;
  /**
   * prepaidAmount
   * @member {Number} prepaid_amount
   */
  exports.prototype['prepaid_amount'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * status
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


