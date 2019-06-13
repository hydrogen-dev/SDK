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
    define(['ApiClient', 'model/ClientHoldingsResponseInner'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ClientHoldingsResponseInner'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.ClientHoldingsResponse = factory(root.atom_api.ApiClient, root.atom_api.ClientHoldingsResponseInner);
  }
}(this, function(ApiClient, ClientHoldingsResponseInner) {
  'use strict';




  /**
   * The ClientHoldingsResponse model module.
   * @module model/ClientHoldingsResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>ClientHoldingsResponse</code>.
   * @alias module:model/ClientHoldingsResponse
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
   * Constructs a <code>ClientHoldingsResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ClientHoldingsResponse} obj Optional instance to populate.
   * @return {module:model/ClientHoldingsResponse} The populated <code>ClientHoldingsResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      ApiClient.constructFromObject(data, obj, 'ClientHoldingsResponseInner');

    }
    return obj;
  }




  return exports;
}));


