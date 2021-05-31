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
    define(['ApiClient', 'model/BaasStatementVO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./BaasStatementVO'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.BaasStatementsVO = factory(root.HydrogenIntegrationApi.ApiClient, root.HydrogenIntegrationApi.BaasStatementVO);
  }
}(this, function(ApiClient, BaasStatementVO) {
  'use strict';




  /**
   * The BaasStatementsVO model module.
   * @module model/BaasStatementsVO
   * @version 1.3.0
   */

  /**
   * Constructs a new <code>BaasStatementsVO</code>.
   * @alias module:model/BaasStatementsVO
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>BaasStatementsVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BaasStatementsVO} obj Optional instance to populate.
   * @return {module:model/BaasStatementsVO} The populated <code>BaasStatementsVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('nucleus_account_id')) {
        obj['nucleus_account_id'] = ApiClient.convertToType(data['nucleus_account_id'], 'String');
      }
      if (data.hasOwnProperty('statements')) {
        obj['statements'] = ApiClient.convertToType(data['statements'], [BaasStatementVO]);
      }
      if (data.hasOwnProperty('vendor_name')) {
        obj['vendor_name'] = ApiClient.convertToType(data['vendor_name'], Object);
      }
    }
    return obj;
  }

  /**
   * @member {String} nucleus_account_id
   */
  exports.prototype['nucleus_account_id'] = undefined;
  /**
   * @member {Array.<module:model/BaasStatementVO>} statements
   */
  exports.prototype['statements'] = undefined;
  /**
   * @member {Object} vendor_name
   */
  exports.prototype['vendor_name'] = undefined;



  return exports;
}));


