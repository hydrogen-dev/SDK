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
    root.atom_api.AccountStagePayload = factory(root.atom_api.ApiClient, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, SecondaryId) {
  'use strict';




  /**
   * The AccountStagePayload model module.
   * @module model/AccountStagePayload
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>AccountStagePayload</code>.
   * @alias module:model/AccountStagePayload
   * @class
   * @param name {String} Name or label of the account stage such as “Pending Funding” or “Fully Funded”
   */
  var exports = function(name) {
    var _this = this;

    _this['name'] = name;




  };

  /**
   * Constructs a <code>AccountStagePayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AccountStagePayload} obj Optional instance to populate.
   * @return {module:model/AccountStagePayload} The populated <code>AccountStagePayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('order_index')) {
        obj['order_index'] = ApiClient.convertToType(data['order_index'], 'Number');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = SecondaryId.constructFromObject(data['secondary_id']);
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
      }
    }
    return obj;
  }

  /**
   * Name or label of the account stage such as “Pending Funding” or “Fully Funded”
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Description of what the step along the registration process that the account stage represents
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * Indicator for where along the process the account stage falls. Generally, the higher the order index, the further along the process
   * @member {Number} order_index
   */
  exports.prototype['order_index'] = undefined;
  /**
   * @member {module:model/SecondaryId} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * Custom information associated with the account stage in the format key:value
   * @member {Object} metadata
   */
  exports.prototype['metadata'] = undefined;



  return exports;
}));


