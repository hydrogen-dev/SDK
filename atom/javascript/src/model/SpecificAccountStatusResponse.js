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
    define(['ApiClient', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SpecificAccountStatusResponse = factory(root.atom_api.ApiClient, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, SecondaryId) {
  'use strict';




  /**
   * The SpecificAccountStatusResponse model module.
   * @module model/SpecificAccountStatusResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SpecificAccountStatusResponse</code>.
   * @alias module:model/SpecificAccountStatusResponse
   * @class
   */
  var exports = function() {
    var _this = this;









  };

  /**
   * Constructs a <code>SpecificAccountStatusResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecificAccountStatusResponse} obj Optional instance to populate.
   * @return {module:model/SpecificAccountStatusResponse} The populated <code>SpecificAccountStatusResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('stage_id')) {
        obj['stage_id'] = ApiClient.convertToType(data['stage_id'], 'String');
      }
      if (data.hasOwnProperty('comments')) {
        obj['comments'] = ApiClient.convertToType(data['comments'], 'String');
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
   * The ID for the specific account status record for the account_id provided
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * The ID of the account to which the status belongs
   * @member {String} account_id
   */
  exports.prototype['account_id'] = undefined;
  /**
   * Status of the account such as “Signed Up” or “Awaiting Payment”
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * Refers to the stage the client is in. Useful for sign-up funnels
   * @member {String} stage_id
   */
  exports.prototype['stage_id'] = undefined;
  /**
   * Comments for the client regarding the status of their account
   * @member {String} comments
   */
  exports.prototype['comments'] = undefined;
  /**
   * @member {module:model/SecondaryId} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


