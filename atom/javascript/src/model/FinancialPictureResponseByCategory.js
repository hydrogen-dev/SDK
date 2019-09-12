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
    define(['ApiClient', 'model/FinancialPictureResponseSubcategories'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./FinancialPictureResponseSubcategories'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.FinancialPictureResponseByCategory = factory(root.atom_api.ApiClient, root.atom_api.FinancialPictureResponseSubcategories);
  }
}(this, function(ApiClient, FinancialPictureResponseSubcategories) {
  'use strict';




  /**
   * The FinancialPictureResponseByCategory model module.
   * @module model/FinancialPictureResponseByCategory
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>FinancialPictureResponseByCategory</code>.
   * @alias module:model/FinancialPictureResponseByCategory
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>FinancialPictureResponseByCategory</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FinancialPictureResponseByCategory} obj Optional instance to populate.
   * @return {module:model/FinancialPictureResponseByCategory} The populated <code>FinancialPictureResponseByCategory</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('category')) {
        obj['category'] = ApiClient.convertToType(data['category'], 'String');
      }
      if (data.hasOwnProperty('balance')) {
        obj['balance'] = ApiClient.convertToType(data['balance'], 'Number');
      }
      if (data.hasOwnProperty('subcategories')) {
        obj['subcategories'] = ApiClient.convertToType(data['subcategories'], [FinancialPictureResponseSubcategories]);
      }
    }
    return obj;
  }

  /**
   * Category of the aggregation accounts. These accounts are dependent on the `category` fields within the Nucleus Aggregation Account.
   * @member {String} category
   */
  exports.prototype['category'] = undefined;
  /**
   * Total balance for this category on this date
   * @member {Number} balance
   */
  exports.prototype['balance'] = undefined;
  /**
   * @member {Array.<module:model/FinancialPictureResponseSubcategories>} subcategories
   */
  exports.prototype['subcategories'] = undefined;



  return exports;
}));


