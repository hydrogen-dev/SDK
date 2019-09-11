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
    define(['ApiClient', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.molecule_api) {
      root.molecule_api = {};
    }
    root.molecule_api.WalletKeyCreateResponse = factory(root.molecule_api.ApiClient, root.molecule_api.SecondaryId);
  }
}(this, function(ApiClient, SecondaryId) {
  'use strict';




  /**
   * The WalletKeyCreateResponse model module.
   * @module model/WalletKeyCreateResponse
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>WalletKeyCreateResponse</code>.
   * @alias module:model/WalletKeyCreateResponse
   * @class
   */
  var exports = function() {
    var _this = this;










  };

  /**
   * Constructs a <code>WalletKeyCreateResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WalletKeyCreateResponse} obj Optional instance to populate.
   * @return {module:model/WalletKeyCreateResponse} The populated <code>WalletKeyCreateResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('key_id')) {
        obj['key_id'] = ApiClient.convertToType(data['key_id'], 'String');
      }
      if (data.hasOwnProperty('key_server')) {
        obj['key_server'] = ApiClient.convertToType(data['key_server'], 'String');
      }
      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
      if (data.hasOwnProperty('private_key')) {
        obj['private_key'] = ApiClient.convertToType(data['private_key'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = SecondaryId.constructFromObject(data['secondary_id']);
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
   * ID of the wallet key record
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * The ID of the associated key within the Key Server
   * @member {String} key_id
   */
  exports.prototype['key_id'] = undefined;
  /**
   * Name of the Key Server in use by the client
   * @member {String} key_server
   */
  exports.prototype['key_server'] = undefined;
  /**
   * Public address of the key pair getting stored
   * @member {String} address
   */
  exports.prototype['address'] = undefined;
  /**
   * Private key of the key pair getting stored
   * @member {String} private_key
   */
  exports.prototype['private_key'] = undefined;
  /**
   * Custom information associated with the account in the format key:value
   * @member {Object} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * @member {module:model/SecondaryId} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * Datetime the wallet key record was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * Datetime the wallet key record was updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


