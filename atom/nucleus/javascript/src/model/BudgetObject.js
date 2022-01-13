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
    root.HydrogenNucleusApi.BudgetObject = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The BudgetObject model module.
   * @module model/BudgetObject
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>BudgetObject</code>.
   * BudgetObject Object
   * @alias module:model/BudgetObject
   * @class
   * @param category {String} category
   * @param value {Number} value
   */
  var exports = function(category, value) {
    var _this = this;

    _this['category'] = category;

    _this['value'] = value;
  };

  /**
   * Constructs a <code>BudgetObject</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BudgetObject} obj Optional instance to populate.
   * @return {module:model/BudgetObject} The populated <code>BudgetObject</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('category')) {
        obj['category'] = ApiClient.convertToType(data['category'], 'String');
      }
      if (data.hasOwnProperty('subcategory')) {
        obj['subcategory'] = ApiClient.convertToType(data['subcategory'], 'String');
      }
      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'Number');
      }
    }
    return obj;
  }

  /**
   * category
   * @member {String} category
   */
  exports.prototype['category'] = undefined;
  /**
   * subcategory
   * @member {String} subcategory
   */
  exports.prototype['subcategory'] = undefined;
  /**
   * value
   * @member {Number} value
   */
  exports.prototype['value'] = undefined;



  return exports;
}));


