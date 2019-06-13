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
    define(['ApiClient', 'model/AllocationAssetSizeResponseInner'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AllocationAssetSizeResponseInner'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.AllocationAssetSizeResponse = factory(root.atom_api.ApiClient, root.atom_api.AllocationAssetSizeResponseInner);
  }
}(this, function(ApiClient, AllocationAssetSizeResponseInner) {
  'use strict';




  /**
   * The AllocationAssetSizeResponse model module.
   * @module model/AllocationAssetSizeResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>AllocationAssetSizeResponse</code>.
   * @alias module:model/AllocationAssetSizeResponse
   * @class
   * @extends Array
   */
  var exports = function() {
    var _this = this;
    _this = new Array();
    Object.setPrototypeOf(_this, exports);

    return _this;
  };

  /**
   * Constructs a <code>AllocationAssetSizeResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AllocationAssetSizeResponse} obj Optional instance to populate.
   * @return {module:model/AllocationAssetSizeResponse} The populated <code>AllocationAssetSizeResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      ApiClient.constructFromObject(data, obj, 'AllocationAssetSizeResponseInner');

    }
    return obj;
  }




  return exports;
}));


