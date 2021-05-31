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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.Address = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Address model module.
   * @module model/Address
   * @version 1.3.0
   */

  /**
   * Constructs a new <code>Address</code>.
   * @alias module:model/Address
   * @class
   */
  var exports = function() {
    var _this = this;









  };

  /**
   * Constructs a <code>Address</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Address} obj Optional instance to populate.
   * @return {module:model/Address} The populated <code>Address</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('address_line1')) {
        obj['address_line1'] = ApiClient.convertToType(data['address_line1'], 'String');
      }
      if (data.hasOwnProperty('address_line2')) {
        obj['address_line2'] = ApiClient.convertToType(data['address_line2'], 'String');
      }
      if (data.hasOwnProperty('city')) {
        obj['city'] = ApiClient.convertToType(data['city'], 'String');
      }
      if (data.hasOwnProperty('country')) {
        obj['country'] = ApiClient.convertToType(data['country'], 'String');
      }
      if (data.hasOwnProperty('is_primary')) {
        obj['is_primary'] = ApiClient.convertToType(data['is_primary'], 'Boolean');
      }
      if (data.hasOwnProperty('postalcode')) {
        obj['postalcode'] = ApiClient.convertToType(data['postalcode'], 'String');
      }
      if (data.hasOwnProperty('state')) {
        obj['state'] = ApiClient.convertToType(data['state'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} address_line1
   */
  exports.prototype['address_line1'] = undefined;
  /**
   * @member {String} address_line2
   */
  exports.prototype['address_line2'] = undefined;
  /**
   * @member {String} city
   */
  exports.prototype['city'] = undefined;
  /**
   * @member {String} country
   */
  exports.prototype['country'] = undefined;
  /**
   * @member {Boolean} is_primary
   */
  exports.prototype['is_primary'] = undefined;
  /**
   * @member {String} postalcode
   */
  exports.prototype['postalcode'] = undefined;
  /**
   * @member {String} state
   */
  exports.prototype['state'] = undefined;
  /**
   * @member {module:model/Address.TypeEnum} type
   */
  exports.prototype['type'] = undefined;


  /**
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "home"
     * @const
     */
    "home": "home",
    /**
     * value: "Home"
     * @const
     */
    "Home": "Home",
    /**
     * value: "Work"
     * @const
     */
    "Work": "Work",
    /**
     * value: "postal"
     * @const
     */
    "postal": "postal",
    /**
     * value: "work"
     * @const
     */
    "work": "work",
    /**
     * value: "billing"
     * @const
     */
    "billing": "billing",
    /**
     * value: "mailing"
     * @const
     */
    "mailing": "mailing",
    /**
     * value: "Mailing"
     * @const
     */
    "Mailing": "Mailing",
    /**
     * value: "Residence"
     * @const
     */
    "Residence": "Residence",
    /**
     * value: "legal"
     * @const
     */
    "legal": "legal",
    /**
     * value: "residence"
     * @const
     */
    "residence": "residence",
    /**
     * value: "null"
     * @const
     */
    "null": "null"  };


  return exports;
}));


