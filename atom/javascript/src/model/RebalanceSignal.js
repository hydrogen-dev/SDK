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
    root.atom_api.RebalanceSignal = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The RebalanceSignal model module.
   * @module model/RebalanceSignal
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>RebalanceSignal</code>.
   * @alias module:model/RebalanceSignal
   * @class
   * @param _date {String} The date of the given rebalancing signal.
   * @param ticker {String} The unique identifier of a given security.
   * @param signal {module:model/RebalanceSignal.SignalEnum} The trade action, either BUY or SELL.
   * @param amount {Number} The amount of the trade as a percentage. For example, amount = 0.02 translates to selling 2% of a given ticker.
   * @param type {Number} The type of trade signal. 1 = period-based, 2 = drift-based, and 4 = downside protection.
   */
  var exports = function(_date, ticker, signal, amount, type) {
    var _this = this;

    _this['date'] = _date;
    _this['ticker'] = ticker;
    _this['signal'] = signal;
    _this['amount'] = amount;
    _this['type'] = type;
  };

  /**
   * Constructs a <code>RebalanceSignal</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RebalanceSignal} obj Optional instance to populate.
   * @return {module:model/RebalanceSignal} The populated <code>RebalanceSignal</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'String');
      }
      if (data.hasOwnProperty('ticker')) {
        obj['ticker'] = ApiClient.convertToType(data['ticker'], 'String');
      }
      if (data.hasOwnProperty('signal')) {
        obj['signal'] = ApiClient.convertToType(data['signal'], 'String');
      }
      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'Number');
      }
    }
    return obj;
  }

  /**
   * The date of the given rebalancing signal.
   * @member {String} date
   */
  exports.prototype['date'] = undefined;
  /**
   * The unique identifier of a given security.
   * @member {String} ticker
   */
  exports.prototype['ticker'] = undefined;
  /**
   * The trade action, either BUY or SELL.
   * @member {module:model/RebalanceSignal.SignalEnum} signal
   */
  exports.prototype['signal'] = undefined;
  /**
   * The amount of the trade as a percentage. For example, amount = 0.02 translates to selling 2% of a given ticker.
   * @member {Number} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * The type of trade signal. 1 = period-based, 2 = drift-based, and 4 = downside protection.
   * @member {Number} type
   */
  exports.prototype['type'] = undefined;


  /**
   * Allowed values for the <code>signal</code> property.
   * @enum {String}
   * @readonly
   */
  exports.SignalEnum = {
    /**
     * value: "SELL"
     * @const
     */
    "SELL": "SELL",
    /**
     * value: "BUY"
     * @const
     */
    "BUY": "BUY"  };


  return exports;
}));


