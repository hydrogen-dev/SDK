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
    define(['ApiClient', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.AggregationAccountHoldingPayload = factory(root.atom_api.ApiClient, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, SecondaryId) {
  'use strict';




  /**
   * The AggregationAccountHoldingPayload model module.
   * @module model/AggregationAccountHoldingPayload
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>AggregationAccountHoldingPayload</code>.
   * @alias module:model/AggregationAccountHoldingPayload
   * @class
   * @param aggregationAccountId {String} The unique identifier of the aggregation account the holding belongs
   * @param ticker {String} Ticker of the security holding
   * @param tickerName {String} Ticker name of the security holding
   * @param shares {Number} Number of shares of the security holding
   */
  var exports = function(aggregationAccountId, ticker, tickerName, shares) {
    var _this = this;

    _this['aggregation_account_id'] = aggregationAccountId;

    _this['ticker'] = ticker;
    _this['ticker_name'] = tickerName;
    _this['shares'] = shares;









  };

  /**
   * Constructs a <code>AggregationAccountHoldingPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AggregationAccountHoldingPayload} obj Optional instance to populate.
   * @return {module:model/AggregationAccountHoldingPayload} The populated <code>AggregationAccountHoldingPayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('aggregation_account_id')) {
        obj['aggregation_account_id'] = ApiClient.convertToType(data['aggregation_account_id'], 'String');
      }
      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('ticker')) {
        obj['ticker'] = ApiClient.convertToType(data['ticker'], 'String');
      }
      if (data.hasOwnProperty('ticker_name')) {
        obj['ticker_name'] = ApiClient.convertToType(data['ticker_name'], 'String');
      }
      if (data.hasOwnProperty('shares')) {
        obj['shares'] = ApiClient.convertToType(data['shares'], 'Number');
      }
      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
      }
      if (data.hasOwnProperty('holding_type')) {
        obj['holding_type'] = ApiClient.convertToType(data['holding_type'], 'String');
      }
      if (data.hasOwnProperty('asset_class')) {
        obj['asset_class'] = ApiClient.convertToType(data['asset_class'], 'String');
      }
      if (data.hasOwnProperty('price')) {
        obj['price'] = ApiClient.convertToType(data['price'], 'Number');
      }
      if (data.hasOwnProperty('cost_basis')) {
        obj['cost_basis'] = ApiClient.convertToType(data['cost_basis'], 'Number');
      }
      if (data.hasOwnProperty('exchange')) {
        obj['exchange'] = ApiClient.convertToType(data['exchange'], 'String');
      }
      if (data.hasOwnProperty('cusip')) {
        obj['cusip'] = ApiClient.convertToType(data['cusip'], 'String');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = SecondaryId.constructFromObject(data['secondary_id']);
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
      }
    }
    return obj;
  }

  /**
   * The unique identifier of the aggregation account the holding belongs
   * @member {String} aggregation_account_id
   */
  exports.prototype['aggregation_account_id'] = undefined;
  /**
   * Alphabetic currency code for the currency of the holding, limited to 3 characters.
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * Ticker of the security holding
   * @member {String} ticker
   */
  exports.prototype['ticker'] = undefined;
  /**
   * Ticker name of the security holding
   * @member {String} ticker_name
   */
  exports.prototype['ticker_name'] = undefined;
  /**
   * Number of shares of the security holding
   * @member {Number} shares
   */
  exports.prototype['shares'] = undefined;
  /**
   * Monetary amount of the security holding
   * @member {Number} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * Describes the type of security holding such as “Equity”, “Fixed Income”, “Cash” or “Mutual Fund”
   * @member {String} holding_type
   */
  exports.prototype['holding_type'] = undefined;
  /**
   * Asset class of the holding such as “US Equity” or “Fixed Income”
   * @member {String} asset_class
   */
  exports.prototype['asset_class'] = undefined;
  /**
   * Price of the security holding
   * @member {Number} price
   */
  exports.prototype['price'] = undefined;
  /**
   * The original value of the asset used for tax purposes, usually the purchase price
   * @member {Number} cost_basis
   */
  exports.prototype['cost_basis'] = undefined;
  /**
   * Financial exchange the security holding is traded on such as “NYSE or “NASDAQ”
   * @member {String} exchange
   */
  exports.prototype['exchange'] = undefined;
  /**
   * The CUSIP of the security holding
   * @member {String} cusip
   */
  exports.prototype['cusip'] = undefined;
  /**
   * @member {module:model/SecondaryId} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * Custom information associated with the aggregation account transaction in the format key:value
   * @member {Object} metadata
   */
  exports.prototype['metadata'] = undefined;



  return exports;
}));


