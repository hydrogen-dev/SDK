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
    define(['ApiClient', 'model/CreateSecurityPriceResponse', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CreateSecurityPriceResponse'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SpecificSecurityPriceResponse = factory(root.atom_api.ApiClient, root.atom_api.CreateSecurityPriceResponse, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, CreateSecurityPriceResponse, SecondaryId) {
  'use strict';




  /**
   * The SpecificSecurityPriceResponse model module.
   * @module model/SpecificSecurityPriceResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SpecificSecurityPriceResponse</code>.
   * @alias module:model/SpecificSecurityPriceResponse
   * @class
   * @implements module:model/CreateSecurityPriceResponse
   * @param securityId {String} The ID of the security
   * @param price {Number} Value for the price of the security
   * @param _date {String} Date and for when the particular price was applicable for this security
   */
  var exports = function(securityId, price, _date) {
    var _this = this;

    CreateSecurityPriceResponse.call(_this, securityId, price, _date);

  };

  /**
   * Constructs a <code>SpecificSecurityPriceResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecificSecurityPriceResponse} obj Optional instance to populate.
   * @return {module:model/SpecificSecurityPriceResponse} The populated <code>SpecificSecurityPriceResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      CreateSecurityPriceResponse.constructFromObject(data, obj);
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * Datetime the security price was last updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;

  // Implement CreateSecurityPriceResponse interface:
  /**
   * The ID of the security
   * @member {String} security_id
   */
exports.prototype['security_id'] = undefined;

  /**
   * Value for the price of the security
   * @member {Number} price
   */
exports.prototype['price'] = undefined;

  /**
   * Date and for when the particular price was applicable for this security
   * @member {String} date
   */
exports.prototype['date'] = undefined;

  /**
   * Value for the adjusted price of the security
   * @member {Number} adjusted_price
   */
exports.prototype['adjusted_price'] = undefined;

  /**
   * Alphabetic currency code for the base currency of the security, limited to 3 characters
   * @member {String} currency_code
   */
exports.prototype['currency_code'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;

  /**
   * ID of the security price
   * @member {String} id
   */
exports.prototype['id'] = undefined;

  /**
   * Datetime the security price was created
   * @member {String} create_date
   */
exports.prototype['create_date'] = undefined;



  return exports;
}));


