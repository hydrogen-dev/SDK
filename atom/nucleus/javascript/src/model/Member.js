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
    define(['ApiClient', 'model/ClientRelationship', 'model/Household'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ClientRelationship'), require('./Household'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.Member = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.ClientRelationship, root.HydrogenNucleusApi.Household);
  }
}(this, function(ApiClient, ClientRelationship, Household) {
  'use strict';




  /**
   * The Member model module.
   * @module model/Member
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>Member</code>.
   * @alias module:model/Member
   * @class
   * @param clientId {String} clientId
   */
  var exports = function(clientId) {
    var _this = this;

    _this['client_id'] = clientId;



  };

  /**
   * Constructs a <code>Member</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Member} obj Optional instance to populate.
   * @return {module:model/Member} The populated <code>Member</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('client_relationships')) {
        obj['client_relationships'] = ApiClient.convertToType(data['client_relationships'], [ClientRelationship]);
      }
      if (data.hasOwnProperty('household')) {
        obj['household'] = Household.constructFromObject(data['household']);
      }
      if (data.hasOwnProperty('is_primary')) {
        obj['is_primary'] = ApiClient.convertToType(data['is_primary'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * clientId
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * @member {Array.<module:model/ClientRelationship>} client_relationships
   */
  exports.prototype['client_relationships'] = undefined;
  /**
   * @member {module:model/Household} household
   */
  exports.prototype['household'] = undefined;
  /**
   * isPrimary
   * @member {Boolean} is_primary
   */
  exports.prototype['is_primary'] = undefined;



  return exports;
}));


