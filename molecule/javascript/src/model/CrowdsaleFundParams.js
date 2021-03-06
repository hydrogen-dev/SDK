/*
 * Molecule API Documentation
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.14
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
    if (!root.MoleculeApiDocumentation) {
      root.MoleculeApiDocumentation = {};
    }
    root.MoleculeApiDocumentation.CrowdsaleFundParams = factory(root.MoleculeApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The CrowdsaleFundParams model module.
   * @module model/CrowdsaleFundParams
   * @version 1.3.0
   */

  /**
   * Constructs a new <code>CrowdsaleFundParams</code>.
   * @alias module:model/CrowdsaleFundParams
   * @class
   * @param tokenId {String} 
   * @param supply {String} 
   */
  var exports = function(tokenId, supply) {
    this.tokenId = tokenId;
    this.supply = supply;
  };

  /**
   * Constructs a <code>CrowdsaleFundParams</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CrowdsaleFundParams} obj Optional instance to populate.
   * @return {module:model/CrowdsaleFundParams} The populated <code>CrowdsaleFundParams</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('token_id'))
        obj.tokenId = ApiClient.convertToType(data['token_id'], 'String');
      if (data.hasOwnProperty('supply'))
        obj.supply = ApiClient.convertToType(data['supply'], 'Number');
    }
    return obj;
  }

  /**
   * @member {String} tokenId
   */
  exports.prototype.tokenId = undefined;

  /**
   * @member {String} supply
   */
  exports.prototype.supply = undefined;

  return exports;

}));
