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
    define(['ApiClient', 'model/TokenRestrictionCreateResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TokenRestrictionCreateResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.molecule_api) {
      root.molecule_api = {};
    }
    root.molecule_api.TokenRestrictionSpecificResponse = factory(root.molecule_api.ApiClient, root.molecule_api.TokenRestrictionCreateResponse);
  }
}(this, function(ApiClient, TokenRestrictionCreateResponse) {
  'use strict';




  /**
   * The TokenRestrictionSpecificResponse model module.
   * @module model/TokenRestrictionSpecificResponse
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>TokenRestrictionSpecificResponse</code>.
   * @alias module:model/TokenRestrictionSpecificResponse
   * @class
   * @implements module:model/TokenRestrictionCreateResponse
   * @param type {String} The type of the token restriction.
   * @param value {String} The value assigned for the restriction
   */
  var exports = function(type, value) {
    var _this = this;

    TokenRestrictionCreateResponse.call(_this, type, value);

  };

  /**
   * Constructs a <code>TokenRestrictionSpecificResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TokenRestrictionSpecificResponse} obj Optional instance to populate.
   * @return {module:model/TokenRestrictionSpecificResponse} The populated <code>TokenRestrictionSpecificResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      TokenRestrictionCreateResponse.constructFromObject(data, obj);
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * Datetime the token restriction record was updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;

  // Implement TokenRestrictionCreateResponse interface:
  /**
   * The type of the token restriction.
   * @member {String} type
   */
exports.prototype['type'] = undefined;

  /**
   * The value assigned for the restriction
   * @member {String} value
   */
exports.prototype['value'] = undefined;

  /**
   * ID of the wallet record
   * @member {String} id
   */
exports.prototype['id'] = undefined;

  /**
   * The unique label for the token restriction
   * @member {String} label
   */
exports.prototype['label'] = undefined;

  /**
   * Datetime the wallet record was created
   * @member {String} create_date
   */
exports.prototype['create_date'] = undefined;



  return exports;
}));


