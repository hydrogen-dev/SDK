/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.19
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
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.CardAnalysisRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The CardAnalysisRequest model module.
   * @module model/CardAnalysisRequest
   * @version 1.9.0
   */

  /**
   * Constructs a new <code>CardAnalysisRequest</code>.
   * @alias module:model/CardAnalysisRequest
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>CardAnalysisRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CardAnalysisRequest} obj Optional instance to populate.
   * @return {module:model/CardAnalysisRequest} The populated <code>CardAnalysisRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('currency_code'))
        obj.currencyCode = ApiClient.convertToType(data['currency_code'], 'String');
      if (data.hasOwnProperty('client_id'))
        obj.clientId = ApiClient.convertToType(data['client_id'], 'String');
      if (data.hasOwnProperty('show_history'))
        obj.showHistory = ApiClient.convertToType(data['show_history'], 'Boolean');
      if (data.hasOwnProperty('response_limit'))
        obj.responseLimit = ApiClient.convertToType(data['response_limit'], 'Number');
      if (data.hasOwnProperty('currency_conversion'))
        obj.currencyConversion = ApiClient.convertToType(data['currency_conversion'], 'String');
      if (data.hasOwnProperty('end_date'))
        obj.endDate = ApiClient.convertToType(data['end_date'], 'Date');
      if (data.hasOwnProperty('history_frequency_interval'))
        obj.historyFrequencyInterval = ApiClient.convertToType(data['history_frequency_interval'], 'String');
      if (data.hasOwnProperty('show_top_cards'))
        obj.showTopCards = ApiClient.convertToType(data['show_top_cards'], 'Boolean');
      if (data.hasOwnProperty('start_date'))
        obj.startDate = ApiClient.convertToType(data['start_date'], 'Date');
      if (data.hasOwnProperty('business_id'))
        obj.businessId = ApiClient.convertToType(data['business_id'], 'String');
      if (data.hasOwnProperty('transaction_status_scope'))
        obj.transactionStatusScope = ApiClient.convertToType(data['transaction_status_scope'], ['String']);
      if (data.hasOwnProperty('card_status_scope'))
        obj.cardStatusScope = ApiClient.convertToType(data['card_status_scope'], ['String']);
      if (data.hasOwnProperty('show_top_cardholders'))
        obj.showTopCardholders = ApiClient.convertToType(data['show_top_cardholders'], 'Boolean');
      if (data.hasOwnProperty('card_program_id'))
        obj.cardProgramId = ApiClient.convertToType(data['card_program_id'], 'String');
      if (data.hasOwnProperty('show_top_businesses'))
        obj.showTopBusinesses = ApiClient.convertToType(data['show_top_businesses'], 'Boolean');
    }
    return obj;
  }

  /**
   * @member {String} currencyCode
   */
  exports.prototype.currencyCode = undefined;

  /**
   * @member {String} clientId
   */
  exports.prototype.clientId = undefined;

  /**
   * @member {Boolean} showHistory
   * @default false
   */
  exports.prototype.showHistory = false;

  /**
   * @member {Number} responseLimit
   * @default 10
   */
  exports.prototype.responseLimit = 10;

  /**
   * @member {String} currencyConversion
   */
  exports.prototype.currencyConversion = undefined;

  /**
   * @member {Date} endDate
   */
  exports.prototype.endDate = undefined;

  /**
   * @member {module:model/CardAnalysisRequest.HistoryFrequencyIntervalEnum} historyFrequencyInterval
   * @default 'month'
   */
  exports.prototype.historyFrequencyInterval = 'month';

  /**
   * @member {Boolean} showTopCards
   * @default false
   */
  exports.prototype.showTopCards = false;

  /**
   * @member {Date} startDate
   */
  exports.prototype.startDate = undefined;

  /**
   * @member {String} businessId
   */
  exports.prototype.businessId = undefined;

  /**
   * @member {Array.<String>} transactionStatusScope
   */
  exports.prototype.transactionStatusScope = undefined;

  /**
   * @member {Array.<String>} cardStatusScope
   */
  exports.prototype.cardStatusScope = undefined;

  /**
   * @member {Boolean} showTopCardholders
   * @default false
   */
  exports.prototype.showTopCardholders = false;

  /**
   * @member {String} cardProgramId
   */
  exports.prototype.cardProgramId = undefined;

  /**
   * @member {Boolean} showTopBusinesses
   * @default false
   */
  exports.prototype.showTopBusinesses = false;



  /**
   * Allowed values for the <code>historyFrequencyInterval</code> property.
   * @enum {String}
   * @readonly
   */
  exports.HistoryFrequencyIntervalEnum = {
    /**
     * value: "day"
     * @const
     */
    day: "day",

    /**
     * value: "week"
     * @const
     */
    week: "week",

    /**
     * value: "month"
     * @const
     */
    month: "month",

    /**
     * value: "quarter"
     * @const
     */
    quarter: "quarter",

    /**
     * value: "year"
     * @const
     */
    year: "year"
  };

  return exports;

}));
