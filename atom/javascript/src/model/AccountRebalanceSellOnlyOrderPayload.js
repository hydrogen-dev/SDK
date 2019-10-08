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
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.AccountRebalanceSellOnlyOrderPayload = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AccountRebalanceSellOnlyOrderPayload model module.
   * @module model/AccountRebalanceSellOnlyOrderPayload
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>AccountRebalanceSellOnlyOrderPayload</code>.
   * @alias module:model/AccountRebalanceSellOnlyOrderPayload
   * @class
   * @param sellTransactionCodeId {String} The ID of the transaction code to denote a sell transaction
   */
  var exports = function(sellTransactionCodeId) {
    var _this = this;

    _this['sell_transaction_code_id'] = sellTransactionCodeId;









  };

  /**
   * Constructs a <code>AccountRebalanceSellOnlyOrderPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AccountRebalanceSellOnlyOrderPayload} obj Optional instance to populate.
   * @return {module:model/AccountRebalanceSellOnlyOrderPayload} The populated <code>AccountRebalanceSellOnlyOrderPayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('sell_transaction_code_id')) {
        obj['sell_transaction_code_id'] = ApiClient.convertToType(data['sell_transaction_code_id'], 'String');
      }
      if (data.hasOwnProperty('buy_transaction_code_id')) {
        obj['buy_transaction_code_id'] = ApiClient.convertToType(data['buy_transaction_code_id'], 'String');
      }
      if (data.hasOwnProperty('cash_portfolio_id')) {
        obj['cash_portfolio_id'] = ApiClient.convertToType(data['cash_portfolio_id'], 'String');
      }
      if (data.hasOwnProperty('commit_orders')) {
        obj['commit_orders'] = ApiClient.convertToType(data['commit_orders'], 'Boolean');
      }
      if (data.hasOwnProperty('non_fractional')) {
        obj['non_fractional'] = ApiClient.convertToType(data['non_fractional'], 'Boolean');
      }
      if (data.hasOwnProperty('port_threshold')) {
        obj['port_threshold'] = ApiClient.convertToType(data['port_threshold'], 'Number');
      }
      if (data.hasOwnProperty('restrictions_on')) {
        obj['restrictions_on'] = ApiClient.convertToType(data['restrictions_on'], 'Boolean');
      }
      if (data.hasOwnProperty('buy_threshold')) {
        obj['buy_threshold'] = ApiClient.convertToType(data['buy_threshold'], 'Number');
      }
      if (data.hasOwnProperty('sell_threshold')) {
        obj['sell_threshold'] = ApiClient.convertToType(data['sell_threshold'], 'Number');
      }
      if (data.hasOwnProperty('use_strategic')) {
        obj['use_strategic'] = ApiClient.convertToType(data['use_strategic'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * The ID of the transaction code to denote a sell transaction
   * @member {String} sell_transaction_code_id
   */
  exports.prototype['sell_transaction_code_id'] = undefined;
  /**
   * The ID of the transaction code to denote a buy transaction
   * @member {String} buy_transaction_code_id
   */
  exports.prototype['buy_transaction_code_id'] = undefined;
  /**
   * The ID of the cash portfolio for the account
   * @member {String} cash_portfolio_id
   */
  exports.prototype['cash_portfolio_id'] = undefined;
  /**
   * Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed
   * @member {Boolean} commit_orders
   * @default true
   */
  exports.prototype['commit_orders'] = true;
  /**
   * Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed
   * @member {Boolean} non_fractional
   * @default false
   */
  exports.prototype['non_fractional'] = false;
  /**
   * Threshold for the minimum asset size the portfolio as a monetary amount for rebalancing to take place. Defaults to 0
   * @member {Number} port_threshold
   * @default 0.0
   */
  exports.prototype['port_threshold'] = 0.0;
  /**
   * Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not
   * @member {Boolean} restrictions_on
   * @default false
   */
  exports.prototype['restrictions_on'] = false;
  /**
   * Buying threshold for the account as the number of shares. Defaults to 0
   * @member {Number} buy_threshold
   * @default 0.0
   */
  exports.prototype['buy_threshold'] = 0.0;
  /**
   * Selling threshold for the account as the number of shares. Defaults to 0
   * @member {Number} sell_threshold
   * @default 0.0
   */
  exports.prototype['sell_threshold'] = 0.0;
  /**
   * Indicates if the account should be synced to strategic weights as opposed to current weights. Defaults to false which indicates it should not
   * @member {Boolean} use_strategic
   * @default false
   */
  exports.prototype['use_strategic'] = false;



  return exports;
}));


