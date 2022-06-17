/*
 * Hydrogen Admin API
 * The Hydrogen Admin API
 *
 * OpenAPI spec version: 1.0.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.17
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
    if (!root.HydrogenAdminApi) {
      root.HydrogenAdminApi = {};
    }
    root.HydrogenAdminApi.ClientAddress = factory(root.HydrogenAdminApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The ClientAddress model module.
   * @module model/ClientAddress
   * @version 1.3.1
   */

  /**
   * Constructs a new <code>ClientAddress</code>.
   * ClientAddress Object
   * @alias module:model/ClientAddress
   * @class
   * @param addressLine1 {String} addressLine1
   * @param city {String} city
   * @param country {String} country
   * @param state {String} state
   * @param type {String} type
   */
  var exports = function(addressLine1, city, country, state, type) {
    this.addressLine1 = addressLine1;
    this.city = city;
    this.country = country;
    this.state = state;
    this.type = type;
  };

  /**
   * Constructs a <code>ClientAddress</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ClientAddress} obj Optional instance to populate.
   * @return {module:model/ClientAddress} The populated <code>ClientAddress</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('address_line1'))
        obj.addressLine1 = ApiClient.convertToType(data['address_line1'], 'String');
      if (data.hasOwnProperty('address_line2'))
        obj.addressLine2 = ApiClient.convertToType(data['address_line2'], 'String');
      if (data.hasOwnProperty('city'))
        obj.city = ApiClient.convertToType(data['city'], 'String');
      if (data.hasOwnProperty('country'))
        obj.country = ApiClient.convertToType(data['country'], 'String');
      if (data.hasOwnProperty('is_primary'))
        obj.isPrimary = ApiClient.convertToType(data['is_primary'], 'Boolean');
      if (data.hasOwnProperty('postalcode'))
        obj.postalcode = ApiClient.convertToType(data['postalcode'], 'String');
      if (data.hasOwnProperty('state'))
        obj.state = ApiClient.convertToType(data['state'], 'String');
      if (data.hasOwnProperty('type'))
        obj.type = ApiClient.convertToType(data['type'], 'String');
    }
    return obj;
  }

  /**
   * addressLine1
   * @member {String} addressLine1
   */
  exports.prototype.addressLine1 = undefined;

  /**
   * addressLine2
   * @member {String} addressLine2
   */
  exports.prototype.addressLine2 = undefined;

  /**
   * city
   * @member {String} city
   */
  exports.prototype.city = undefined;

  /**
   * country
   * @member {String} country
   */
  exports.prototype.country = undefined;

  /**
   *  is_primary
   * @member {Boolean} isPrimary
   */
  exports.prototype.isPrimary = undefined;

  /**
   * postalcode
   * @member {String} postalcode
   */
  exports.prototype.postalcode = undefined;

  /**
   * state
   * @member {String} state
   */
  exports.prototype.state = undefined;

  /**
   * type
   * @member {String} type
   */
  exports.prototype.type = undefined;


  return exports;

}));
