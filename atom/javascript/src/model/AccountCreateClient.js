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
 * Swagger Codegen version: 2.4.2-SNAPSHOT
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
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.AccountCreateClient = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AccountCreateClient model module.
   * @module model/AccountCreateClient
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>AccountCreateClient</code>.
   * @alias module:model/AccountCreateClient
   * @class
   * @param clientId {String} The ID of a client associated with the account
   * @param clientAccountAssociationType {String} The role of the client as it relates to the account defined by your firm. Roles may be joint, owner, trustee, viewer, or admin. Only the owner will be able to execute transactions and trades on the account
   */
  var exports = function(clientId, clientAccountAssociationType) {
    var _this = this;

    _this['client_id'] = clientId;
    _this['client_account_association_type'] = clientAccountAssociationType;

  };

  /**
   * Constructs a <code>AccountCreateClient</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AccountCreateClient} obj Optional instance to populate.
   * @return {module:model/AccountCreateClient} The populated <code>AccountCreateClient</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('client_account_association_type')) {
        obj['client_account_association_type'] = ApiClient.convertToType(data['client_account_association_type'], 'String');
      }
      if (data.hasOwnProperty('signature_data')) {
        obj['signature_data'] = ApiClient.convertToType(data['signature_data'], 'String');
      }
    }
    return obj;
  }

  /**
   * The ID of a client associated with the account
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * The role of the client as it relates to the account defined by your firm. Roles may be joint, owner, trustee, viewer, or admin. Only the owner will be able to execute transactions and trades on the account
   * @member {String} client_account_association_type
   */
  exports.prototype['client_account_association_type'] = undefined;
  /**
   * Stored signature for the client on the account such as a Base30 or Base64 string
   * @member {String} signature_data
   */
  exports.prototype['signature_data'] = undefined;



  return exports;
}));


