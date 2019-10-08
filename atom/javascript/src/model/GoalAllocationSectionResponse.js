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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.GoalAllocationSectionResponse = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The GoalAllocationSectionResponse model module.
   * @module model/GoalAllocationSectionResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>GoalAllocationSectionResponse</code>.
   * @alias module:model/GoalAllocationSectionResponse
   * @class
   * @param ret {Number} The portfolio annualized return.
   * @param risk {Number} The portfolio annualized standard deviation.
   */
  var exports = function(ret, risk) {
    var _this = this;

    _this['ret'] = ret;
    _this['risk'] = risk;



  };

  /**
   * Constructs a <code>GoalAllocationSectionResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/GoalAllocationSectionResponse} obj Optional instance to populate.
   * @return {module:model/GoalAllocationSectionResponse} The populated <code>GoalAllocationSectionResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('ret')) {
        obj['ret'] = ApiClient.convertToType(data['ret'], 'Number');
      }
      if (data.hasOwnProperty('risk')) {
        obj['risk'] = ApiClient.convertToType(data['risk'], 'Number');
      }
      if (data.hasOwnProperty('assets')) {
        obj['assets'] = ApiClient.convertToType(data['assets'], ['String']);
      }
      if (data.hasOwnProperty('weights')) {
        obj['weights'] = ApiClient.convertToType(data['weights'], ['Number']);
      }
      if (data.hasOwnProperty('identifier')) {
        obj['identifier'] = ApiClient.convertToType(data['identifier'], 'String');
      }
    }
    return obj;
  }

  /**
   * The portfolio annualized return.
   * @member {Number} ret
   */
  exports.prototype['ret'] = undefined;
  /**
   * The portfolio annualized standard deviation.
   * @member {Number} risk
   */
  exports.prototype['risk'] = undefined;
  /**
   * The securities in the created portfolio, returned if allocation_method = create.
   * @member {Array.<String>} assets
   */
  exports.prototype['assets'] = undefined;
  /**
   * The weights for each of the securities in the created portfolio, returned if allocation_method = create.
   * @member {Array.<Number>} weights
   */
  exports.prototype['weights'] = undefined;
  /**
   * The allocation’s id, returned if allocation_method = select.
   * @member {String} identifier
   */
  exports.prototype['identifier'] = undefined;



  return exports;
}));


