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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.AclClientPermissionVO = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AclClientPermissionVO model module.
   * @module model/AclClientPermissionVO
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>AclClientPermissionVO</code>.
   * @alias module:model/AclClientPermissionVO
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>AclClientPermissionVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AclClientPermissionVO} obj Optional instance to populate.
   * @return {module:model/AclClientPermissionVO} The populated <code>AclClientPermissionVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('permission_type')) {
        obj['permission_type'] = ApiClient.convertToType(data['permission_type'], 'String');
      }
    }
    return obj;
  }

  /**
   * accountId
   * @member {String} account_id
   */
  exports.prototype['account_id'] = undefined;
  /**
   * clientId
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * permissionType
   * @member {module:model/AclClientPermissionVO.PermissionTypeEnum} permission_type
   */
  exports.prototype['permission_type'] = undefined;


  /**
   * Allowed values for the <code>permission_type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.PermissionTypeEnum = {
    /**
     * value: "INQUIRY_ACCESS"
     * @const
     */
    "INQUIRY_ACCESS": "INQUIRY_ACCESS",
    /**
     * value: "LIMITED_AUTHORITY"
     * @const
     */
    "LIMITED_AUTHORITY": "LIMITED_AUTHORITY",
    /**
     * value: "FULL_AUTHORITY"
     * @const
     */
    "FULL_AUTHORITY": "FULL_AUTHORITY",
    /**
     * value: "POWER_OF_ATTORNEY"
     * @const
     */
    "POWER_OF_ATTORNEY": "POWER_OF_ATTORNEY"  };


  return exports;
}));


