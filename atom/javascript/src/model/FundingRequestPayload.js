/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
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
    define(['ApiClient', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.FundingRequestPayload = factory(root.atom_api.ApiClient, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, SecondaryId) {
  'use strict';




  /**
   * The FundingRequestPayload model module.
   * @module model/FundingRequestPayload
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>FundingRequestPayload</code>.
   * @alias module:model/FundingRequestPayload
   * @class
   * @param accountId {String} The ID for the account that will be receiving the funding request
   * @param fundingType {module:model/FundingRequestPayload.FundingTypeEnum} The type of the funding transaction. Value may be bank_transfer, wire_transfer, cash, debit_card, credit_card, check, stock_certificate, digital_wallet, money_order, account_transfer, or other
   * @param fundingStatus {module:model/FundingRequestPayload.FundingStatusEnum} Status of the funding request. Value may be request_received, request_initiated, request_declined, request_cancelled, or request_completed. In the case of a recurring request, the status remains request_received until the end date of the request
   * @param frequencyUnit {module:model/FundingRequestPayload.FrequencyUnitEnum} Frequency of the funding request defined by your firm. Value may be one_time, daily, weekly, monthly, quarterly, or annually
   * @param isDeposit {Boolean} Indicates if the funding request is a deposit. true indicates it is a deposit, false a withdrawal
   * @param startDate {Date} The date that the funding request should start
   */
  var exports = function(accountId, fundingType, fundingStatus, frequencyUnit, isDeposit, startDate) {
    var _this = this;

    _this['account_id'] = accountId;
    _this['funding_type'] = fundingType;
    _this['funding_status'] = fundingStatus;
    _this['frequency_unit'] = frequencyUnit;
    _this['is_deposit'] = isDeposit;
    _this['start_date'] = startDate;










  };

  /**
   * Constructs a <code>FundingRequestPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FundingRequestPayload} obj Optional instance to populate.
   * @return {module:model/FundingRequestPayload} The populated <code>FundingRequestPayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('funding_type')) {
        obj['funding_type'] = ApiClient.convertToType(data['funding_type'], 'String');
      }
      if (data.hasOwnProperty('funding_status')) {
        obj['funding_status'] = ApiClient.convertToType(data['funding_status'], 'String');
      }
      if (data.hasOwnProperty('frequency_unit')) {
        obj['frequency_unit'] = ApiClient.convertToType(data['frequency_unit'], 'String');
      }
      if (data.hasOwnProperty('is_deposit')) {
        obj['is_deposit'] = ApiClient.convertToType(data['is_deposit'], 'Boolean');
      }
      if (data.hasOwnProperty('start_date')) {
        obj['start_date'] = ApiClient.convertToType(data['start_date'], 'Date');
      }
      if (data.hasOwnProperty('end_date')) {
        obj['end_date'] = ApiClient.convertToType(data['end_date'], 'Date');
      }
      if (data.hasOwnProperty('frequency')) {
        obj['frequency'] = ApiClient.convertToType(data['frequency'], 'Number');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
      }
      if (data.hasOwnProperty('bank_link_id')) {
        obj['bank_link_id'] = ApiClient.convertToType(data['bank_link_id'], 'String');
      }
      if (data.hasOwnProperty('transfer_id')) {
        obj['transfer_id'] = ApiClient.convertToType(data['transfer_id'], 'String');
      }
      if (data.hasOwnProperty('support_ticket_id')) {
        obj['support_ticket_id'] = ApiClient.convertToType(data['support_ticket_id'], 'String');
      }
      if (data.hasOwnProperty('is_active')) {
        obj['is_active'] = ApiClient.convertToType(data['is_active'], 'Boolean');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = SecondaryId.constructFromObject(data['secondary_id']);
      }
    }
    return obj;
  }

  /**
   * The ID for the account that will be receiving the funding request
   * @member {String} account_id
   */
  exports.prototype['account_id'] = undefined;
  /**
   * The type of the funding transaction. Value may be bank_transfer, wire_transfer, cash, debit_card, credit_card, check, stock_certificate, digital_wallet, money_order, account_transfer, or other
   * @member {module:model/FundingRequestPayload.FundingTypeEnum} funding_type
   */
  exports.prototype['funding_type'] = undefined;
  /**
   * Status of the funding request. Value may be request_received, request_initiated, request_declined, request_cancelled, or request_completed. In the case of a recurring request, the status remains request_received until the end date of the request
   * @member {module:model/FundingRequestPayload.FundingStatusEnum} funding_status
   */
  exports.prototype['funding_status'] = undefined;
  /**
   * Frequency of the funding request defined by your firm. Value may be one_time, daily, weekly, monthly, quarterly, or annually
   * @member {module:model/FundingRequestPayload.FrequencyUnitEnum} frequency_unit
   */
  exports.prototype['frequency_unit'] = undefined;
  /**
   * Indicates if the funding request is a deposit. true indicates it is a deposit, false a withdrawal
   * @member {Boolean} is_deposit
   */
  exports.prototype['is_deposit'] = undefined;
  /**
   * The date that the funding request should start
   * @member {Date} start_date
   */
  exports.prototype['start_date'] = undefined;
  /**
   * In the case that the funding request is recurring, the date that the funding request should stop occurring
   * @member {Date} end_date
   */
  exports.prototype['end_date'] = undefined;
  /**
   * Number of frequency_unit between each request. For example, if the frequency_unit is weekly and the frequency is 2, this means the funding request occurs every two weeks. Default is 1
   * @member {Number} frequency
   */
  exports.prototype['frequency'] = undefined;
  /**
   * Description for the request, such as “Initial Funding”
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * Amount that is included in the funding request
   * @member {Number} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * In the case that the funding request relates to a specific bank link, the ID of the bank link providing the funds for the funding request
   * @member {String} bank_link_id
   */
  exports.prototype['bank_link_id'] = undefined;
  /**
   * In the case that the funding request relates to the transfer of an external account into the account, the ID of the transfer
   * @member {String} transfer_id
   */
  exports.prototype['transfer_id'] = undefined;
  /**
   * In the case that the funding request is attached to a Support Ticket in the Electron API, the ID of the ticket
   * @member {String} support_ticket_id
   */
  exports.prototype['support_ticket_id'] = undefined;
  /**
   * Indicates if the funding request is currently active. Defaults to true which indicates it is active.
   * @member {Boolean} is_active
   * @default true
   */
  exports.prototype['is_active'] = true;
  /**
   * Custom information associated with the funding request in the format key:value.
   * @member {Object} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * @member {module:model/SecondaryId} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;


  /**
   * Allowed values for the <code>funding_type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.FundingTypeEnum = {
    /**
     * value: "bank_transfer"
     * @const
     */
    "bank_transfer": "bank_transfer",
    /**
     * value: "wire_transfer"
     * @const
     */
    "wire_transfer": "wire_transfer",
    /**
     * value: "cash"
     * @const
     */
    "cash": "cash",
    /**
     * value: "debit_card"
     * @const
     */
    "debit_card": "debit_card",
    /**
     * value: "credit_card"
     * @const
     */
    "credit_card": "credit_card",
    /**
     * value: "check"
     * @const
     */
    "check": "check",
    /**
     * value: "stock_certificate"
     * @const
     */
    "stock_certificate": "stock_certificate",
    /**
     * value: "digital_wallet"
     * @const
     */
    "digital_wallet": "digital_wallet",
    /**
     * value: "money_order"
     * @const
     */
    "money_order": "money_order",
    /**
     * value: "account_transfer"
     * @const
     */
    "account_transfer": "account_transfer",
    /**
     * value: "other"
     * @const
     */
    "other": "other"  };

  /**
   * Allowed values for the <code>funding_status</code> property.
   * @enum {String}
   * @readonly
   */
  exports.FundingStatusEnum = {
    /**
     * value: "request_received"
     * @const
     */
    "received": "request_received",
    /**
     * value: "request_initiated"
     * @const
     */
    "initiated": "request_initiated",
    /**
     * value: "request_cancelled"
     * @const
     */
    "cancelled": "request_cancelled",
    /**
     * value: "request_completed"
     * @const
     */
    "completed": "request_completed"  };

  /**
   * Allowed values for the <code>frequency_unit</code> property.
   * @enum {String}
   * @readonly
   */
  exports.FrequencyUnitEnum = {
    /**
     * value: "one_time"
     * @const
     */
    "one_time": "one_time",
    /**
     * value: "daily"
     * @const
     */
    "daily": "daily",
    /**
     * value: "weekly"
     * @const
     */
    "weekly": "weekly",
    /**
     * value: "monthly"
     * @const
     */
    "monthly": "monthly",
    /**
     * value: "quarterly"
     * @const
     */
    "quarterly": "quarterly",
    /**
     * value: "annually"
     * @const
     */
    "annually": "annually"  };


  return exports;
}));

