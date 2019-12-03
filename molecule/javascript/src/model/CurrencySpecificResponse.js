/**
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
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
    if (!root.molecule_api) {
      root.molecule_api = {};
    }
    root.molecule_api.CurrencySpecificResponse = factory(root.molecule_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CurrencySpecificResponse model module.
   * @module model/CurrencySpecificResponse
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>CurrencySpecificResponse</code>.
   * @alias module:model/CurrencySpecificResponse
   * @class
   */
  var exports = function() {
    var _this = this;









  };

  /**
   * Constructs a <code>CurrencySpecificResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CurrencySpecificResponse} obj Optional instance to populate.
   * @return {module:model/CurrencySpecificResponse} The populated <code>CurrencySpecificResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('decimal_points')) {
        obj['decimal_points'] = ApiClient.convertToType(data['decimal_points'], 'Number');
      }
      if (data.hasOwnProperty('symbol')) {
        obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
      }
      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
      if (data.hasOwnProperty('logo')) {
        obj['logo'] = ApiClient.convertToType(data['logo'], 'String');
      }
      if (data.hasOwnProperty('network')) {
        obj['network'] = ApiClient.convertToType(data['network'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * The name of the currency
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Decimal points of the currency
   * @member {Number} decimal_points
   */
  exports.prototype['decimal_points'] = undefined;
  /**
   * Symbol of the currency
   * @member {String} symbol
   */
  exports.prototype['symbol'] = undefined;
  /**
   * The blockchain contract address of the currency
   * @member {String} address
   */
  exports.prototype['address'] = undefined;
  /**
   * The url for the currency logo
   * @member {String} logo
   */
  exports.prototype['logo'] = undefined;
  /**
   * The network the currency is available on. Can be mainnet, ropsten etc.
   * @member {String} network
   */
  exports.prototype['network'] = undefined;
  /**
   * Datetime the currency record was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * Datetime the currency record was updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));

