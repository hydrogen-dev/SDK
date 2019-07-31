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
    define(['ApiClient', 'model/FinancialPictureResponseChangeTotalAssets180Day', 'model/FinancialPictureResponseChangeTotalAssets1Day', 'model/FinancialPictureResponseChangeTotalAssets30Day', 'model/FinancialPictureResponseChangeTotalAssets365Day', 'model/FinancialPictureResponseChangeTotalAssets7Day', 'model/FinancialPictureResponseChangeTotalAssets90Day', 'model/FinancialPictureResponseChangeTotalAssetsTotal'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./FinancialPictureResponseChangeTotalAssets180Day'), require('./FinancialPictureResponseChangeTotalAssets1Day'), require('./FinancialPictureResponseChangeTotalAssets30Day'), require('./FinancialPictureResponseChangeTotalAssets365Day'), require('./FinancialPictureResponseChangeTotalAssets7Day'), require('./FinancialPictureResponseChangeTotalAssets90Day'), require('./FinancialPictureResponseChangeTotalAssetsTotal'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.FinancialPictureResponseChangeTotalAssets = factory(root.atom_api.ApiClient, root.atom_api.FinancialPictureResponseChangeTotalAssets180Day, root.atom_api.FinancialPictureResponseChangeTotalAssets1Day, root.atom_api.FinancialPictureResponseChangeTotalAssets30Day, root.atom_api.FinancialPictureResponseChangeTotalAssets365Day, root.atom_api.FinancialPictureResponseChangeTotalAssets7Day, root.atom_api.FinancialPictureResponseChangeTotalAssets90Day, root.atom_api.FinancialPictureResponseChangeTotalAssetsTotal);
  }
}(this, function(ApiClient, FinancialPictureResponseChangeTotalAssets180Day, FinancialPictureResponseChangeTotalAssets1Day, FinancialPictureResponseChangeTotalAssets30Day, FinancialPictureResponseChangeTotalAssets365Day, FinancialPictureResponseChangeTotalAssets7Day, FinancialPictureResponseChangeTotalAssets90Day, FinancialPictureResponseChangeTotalAssetsTotal) {
  'use strict';




  /**
   * The FinancialPictureResponseChangeTotalAssets model module.
   * @module model/FinancialPictureResponseChangeTotalAssets
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>FinancialPictureResponseChangeTotalAssets</code>.
   * @alias module:model/FinancialPictureResponseChangeTotalAssets
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>FinancialPictureResponseChangeTotalAssets</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FinancialPictureResponseChangeTotalAssets} obj Optional instance to populate.
   * @return {module:model/FinancialPictureResponseChangeTotalAssets} The populated <code>FinancialPictureResponseChangeTotalAssets</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('1_day')) {
        obj['1_day'] = FinancialPictureResponseChangeTotalAssets1Day.constructFromObject(data['1_day']);
      }
      if (data.hasOwnProperty('7_day')) {
        obj['7_day'] = FinancialPictureResponseChangeTotalAssets7Day.constructFromObject(data['7_day']);
      }
      if (data.hasOwnProperty('30_day')) {
        obj['30_day'] = FinancialPictureResponseChangeTotalAssets30Day.constructFromObject(data['30_day']);
      }
      if (data.hasOwnProperty('90_day')) {
        obj['90_day'] = FinancialPictureResponseChangeTotalAssets90Day.constructFromObject(data['90_day']);
      }
      if (data.hasOwnProperty('180_day')) {
        obj['180_day'] = FinancialPictureResponseChangeTotalAssets180Day.constructFromObject(data['180_day']);
      }
      if (data.hasOwnProperty('365_day')) {
        obj['365_day'] = FinancialPictureResponseChangeTotalAssets365Day.constructFromObject(data['365_day']);
      }
      if (data.hasOwnProperty('total')) {
        obj['total'] = FinancialPictureResponseChangeTotalAssetsTotal.constructFromObject(data['total']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/FinancialPictureResponseChangeTotalAssets1Day} 1_day
   */
  exports.prototype['1_day'] = undefined;
  /**
   * @member {module:model/FinancialPictureResponseChangeTotalAssets7Day} 7_day
   */
  exports.prototype['7_day'] = undefined;
  /**
   * @member {module:model/FinancialPictureResponseChangeTotalAssets30Day} 30_day
   */
  exports.prototype['30_day'] = undefined;
  /**
   * @member {module:model/FinancialPictureResponseChangeTotalAssets90Day} 90_day
   */
  exports.prototype['90_day'] = undefined;
  /**
   * @member {module:model/FinancialPictureResponseChangeTotalAssets180Day} 180_day
   */
  exports.prototype['180_day'] = undefined;
  /**
   * @member {module:model/FinancialPictureResponseChangeTotalAssets365Day} 365_day
   */
  exports.prototype['365_day'] = undefined;
  /**
   * @member {module:model/FinancialPictureResponseChangeTotalAssetsTotal} total
   */
  exports.prototype['total'] = undefined;



  return exports;
}));

