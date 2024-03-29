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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.AccountPortfolioRebalanceRequest = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AccountPortfolioRebalanceRequest model module.
   * @module model/AccountPortfolioRebalanceRequest
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>AccountPortfolioRebalanceRequest</code>.
   * AccountPortfolioRebalanceRequest Object
   * @alias module:model/AccountPortfolioRebalanceRequest
   * @class
   */
  var exports = function() {
    var _this = this;















  };

  /**
   * Constructs a <code>AccountPortfolioRebalanceRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AccountPortfolioRebalanceRequest} obj Optional instance to populate.
   * @return {module:model/AccountPortfolioRebalanceRequest} The populated <code>AccountPortfolioRebalanceRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('buy_threshold')) {
        obj['buy_threshold'] = ApiClient.convertToType(data['buy_threshold'], 'Number');
      }
      if (data.hasOwnProperty('buy_transaction_code_id')) {
        obj['buy_transaction_code_id'] = ApiClient.convertToType(data['buy_transaction_code_id'], 'String');
      }
      if (data.hasOwnProperty('cash_portfolio_id')) {
        obj['cash_portfolio_id'] = ApiClient.convertToType(data['cash_portfolio_id'], 'String');
      }
      if (data.hasOwnProperty('cash_sec_id')) {
        obj['cash_sec_id'] = ApiClient.convertToType(data['cash_sec_id'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
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
      if (data.hasOwnProperty('sell_threshold')) {
        obj['sell_threshold'] = ApiClient.convertToType(data['sell_threshold'], 'Number');
      }
      if (data.hasOwnProperty('sell_transaction_code_id')) {
        obj['sell_transaction_code_id'] = ApiClient.convertToType(data['sell_transaction_code_id'], 'String');
      }
      if (data.hasOwnProperty('tenant_id')) {
        obj['tenant_id'] = ApiClient.convertToType(data['tenant_id'], 'String');
      }
      if (data.hasOwnProperty('use_cash_available')) {
        obj['use_cash_available'] = ApiClient.convertToType(data['use_cash_available'], 'Boolean');
      }
      if (data.hasOwnProperty('use_strategic')) {
        obj['use_strategic'] = ApiClient.convertToType(data['use_strategic'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * buyThreshold
   * @member {Number} buy_threshold
   */
  exports.prototype['buy_threshold'] = undefined;
  /**
   * buyTransactionCodeId
   * @member {String} buy_transaction_code_id
   */
  exports.prototype['buy_transaction_code_id'] = undefined;
  /**
   * cashPortfolioId
   * @member {String} cash_portfolio_id
   */
  exports.prototype['cash_portfolio_id'] = undefined;
  /**
   * cashSecId
   * @member {String} cash_sec_id
   */
  exports.prototype['cash_sec_id'] = undefined;
  /**
   * clientId
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * commitOrders
   * @member {Boolean} commit_orders
   */
  exports.prototype['commit_orders'] = undefined;
  /**
   * nonFractional
   * @member {Boolean} non_fractional
   */
  exports.prototype['non_fractional'] = undefined;
  /**
   * portThreshold
   * @member {Number} port_threshold
   */
  exports.prototype['port_threshold'] = undefined;
  /**
   * restrictionsOn
   * @member {Boolean} restrictions_on
   */
  exports.prototype['restrictions_on'] = undefined;
  /**
   * sellThreshold
   * @member {Number} sell_threshold
   */
  exports.prototype['sell_threshold'] = undefined;
  /**
   * sellTransactionCodeId
   * @member {String} sell_transaction_code_id
   */
  exports.prototype['sell_transaction_code_id'] = undefined;
  /**
   * tenantId
   * @member {String} tenant_id
   */
  exports.prototype['tenant_id'] = undefined;
  /**
   * useCashAvailable
   * @member {Boolean} use_cash_available
   */
  exports.prototype['use_cash_available'] = undefined;
  /**
   * useStrategic
   * @member {Boolean} use_strategic
   */
  exports.prototype['use_strategic'] = undefined;



  return exports;
}));


