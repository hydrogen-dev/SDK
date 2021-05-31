/**
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
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
    define(['ApiClient', 'model/AggregationAccountHoldingResponseInternalObjectVO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AggregationAccountHoldingResponseInternalObjectVO'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.AggregationAccountHoldingResponseVO = factory(root.HydrogenIntegrationApi.ApiClient, root.HydrogenIntegrationApi.AggregationAccountHoldingResponseInternalObjectVO);
  }
}(this, function(ApiClient, AggregationAccountHoldingResponseInternalObjectVO) {
  'use strict';




  /**
   * The AggregationAccountHoldingResponseVO model module.
   * @module model/AggregationAccountHoldingResponseVO
   * @version 1.3.0
   */

  /**
   * Constructs a new <code>AggregationAccountHoldingResponseVO</code>.
   * @alias module:model/AggregationAccountHoldingResponseVO
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>AggregationAccountHoldingResponseVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AggregationAccountHoldingResponseVO} obj Optional instance to populate.
   * @return {module:model/AggregationAccountHoldingResponseVO} The populated <code>AggregationAccountHoldingResponseVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
      if (data.hasOwnProperty('nucleus_aggregation_account_id')) {
        obj['nucleus_aggregation_account_id'] = ApiClient.convertToType(data['nucleus_aggregation_account_id'], 'String');
      }
      if (data.hasOwnProperty('nucleus_holdings_posted')) {
        obj['nucleus_holdings_posted'] = ApiClient.convertToType(data['nucleus_holdings_posted'], [AggregationAccountHoldingResponseInternalObjectVO]);
      }
      if (data.hasOwnProperty('vendor_name')) {
        obj['vendor_name'] = ApiClient.convertToType(data['vendor_name'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} message
   */
  exports.prototype['message'] = undefined;
  /**
   * @member {String} nucleus_aggregation_account_id
   */
  exports.prototype['nucleus_aggregation_account_id'] = undefined;
  /**
   * @member {Array.<module:model/AggregationAccountHoldingResponseInternalObjectVO>} nucleus_holdings_posted
   */
  exports.prototype['nucleus_holdings_posted'] = undefined;
  /**
   * @member {String} vendor_name
   */
  exports.prototype['vendor_name'] = undefined;



  return exports;
}));


