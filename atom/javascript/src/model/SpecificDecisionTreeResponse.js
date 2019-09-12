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
    define(['ApiClient', 'model/CreateDecisionTreeResponse', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CreateDecisionTreeResponse'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SpecificDecisionTreeResponse = factory(root.atom_api.ApiClient, root.atom_api.CreateDecisionTreeResponse, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, CreateDecisionTreeResponse, SecondaryId) {
  'use strict';




  /**
   * The SpecificDecisionTreeResponse model module.
   * @module model/SpecificDecisionTreeResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SpecificDecisionTreeResponse</code>.
   * @alias module:model/SpecificDecisionTreeResponse
   * @class
   * @implements module:model/CreateDecisionTreeResponse
   * @param name {String} Name of the decision tree
   */
  var exports = function(name) {
    var _this = this;

    CreateDecisionTreeResponse.call(_this, name);

  };

  /**
   * Constructs a <code>SpecificDecisionTreeResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecificDecisionTreeResponse} obj Optional instance to populate.
   * @return {module:model/SpecificDecisionTreeResponse} The populated <code>SpecificDecisionTreeResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      CreateDecisionTreeResponse.constructFromObject(data, obj);
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * Datetime the decision tree was last updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;

  // Implement CreateDecisionTreeResponse interface:
  /**
   * Name of the decision tree
   * @member {String} name
   */
exports.prototype['name'] = undefined;

  /**
   * Description for the decision tree such as “Tree to allocate clients to taxable portfolios”
   * @member {String} description
   */
exports.prototype['description'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;

  /**
   * Custom information associated with the decision tree in the format key:value
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;

  /**
   * ID of the decision tree
   * @member {String} id
   */
exports.prototype['id'] = undefined;

  /**
   * Datetime the decision tree was created
   * @member {String} create_date
   */
exports.prototype['create_date'] = undefined;



  return exports;
}));


