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
    define(['ApiClient', 'model/CreatePortfolioAssetSizeResponse', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CreatePortfolioAssetSizeResponse'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SpecificPortfolioAssetSizeResponse = factory(root.atom_api.ApiClient, root.atom_api.CreatePortfolioAssetSizeResponse, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, CreatePortfolioAssetSizeResponse, SecondaryId) {
  'use strict';




  /**
   * The SpecificPortfolioAssetSizeResponse model module.
   * @module model/SpecificPortfolioAssetSizeResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SpecificPortfolioAssetSizeResponse</code>.
   * @alias module:model/SpecificPortfolioAssetSizeResponse
   * @class
   * @implements module:model/CreatePortfolioAssetSizeResponse
   * @param _date {Date} Date for this asset size record
   * @param assetSize {Number} Monetary value of the portfolio on the particular date. Can be less than, greater than or equal to 0
   * @param cashFlow {Number} Net monetary value that has flowed in or out of the portfolio since the last asset size date, usually via deposits or withdrawals. Can be less than, greater than or equal to 0
   * @param portfolioId {String} The ID of the portfolio that the asset size record falls under
   */
  var exports = function(_date, assetSize, cashFlow, portfolioId) {
    var _this = this;

    CreatePortfolioAssetSizeResponse.call(_this, _date, assetSize, cashFlow, portfolioId);

  };

  /**
   * Constructs a <code>SpecificPortfolioAssetSizeResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecificPortfolioAssetSizeResponse} obj Optional instance to populate.
   * @return {module:model/SpecificPortfolioAssetSizeResponse} The populated <code>SpecificPortfolioAssetSizeResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      CreatePortfolioAssetSizeResponse.constructFromObject(data, obj);
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * Datetime the portfolio asset size record was last updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;

  // Implement CreatePortfolioAssetSizeResponse interface:
  /**
   * Date for this asset size record
   * @member {Date} date
   */
exports.prototype['date'] = undefined;

  /**
   * Monetary value of the portfolio on the particular date. Can be less than, greater than or equal to 0
   * @member {Number} asset_size
   */
exports.prototype['asset_size'] = undefined;

  /**
   * Net monetary value that has flowed in or out of the portfolio since the last asset size date, usually via deposits or withdrawals. Can be less than, greater than or equal to 0
   * @member {Number} cash_flow
   */
exports.prototype['cash_flow'] = undefined;

  /**
   * The ID of the portfolio that the asset size record falls under
   * @member {String} portfolio_id
   */
exports.prototype['portfolio_id'] = undefined;

  /**
   * Alphabetic currency code for the base currency of the portfolio, limited to 3 characters
   * @member {String} currency_code
   */
exports.prototype['currency_code'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;

  /**
   * ID of the portfolio asset size record
   * @member {String} id
   */
exports.prototype['id'] = undefined;

  /**
   * Datetime the portfolio asset size record was created
   * @member {String} create_date
   */
exports.prototype['create_date'] = undefined;



  return exports;
}));


