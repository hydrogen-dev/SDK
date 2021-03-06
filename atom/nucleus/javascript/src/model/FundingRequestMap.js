/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: unset
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
    root.HydrogenNucleusApi.FundingRequestMap = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The FundingRequestMap model module.
   * @module model/FundingRequestMap
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>FundingRequestMap</code>.
   * @alias module:model/FundingRequestMap
   * @class
   * @param fundingId {String} funding_id
   */
  var exports = function(fundingId) {
    var _this = this;

    _this['funding_id'] = fundingId;
  };

  /**
   * Constructs a <code>FundingRequestMap</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FundingRequestMap} obj Optional instance to populate.
   * @return {module:model/FundingRequestMap} The populated <code>FundingRequestMap</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('funding_id')) {
        obj['funding_id'] = ApiClient.convertToType(data['funding_id'], 'String');
      }
    }
    return obj;
  }

  /**
   * funding_id
   * @member {String} funding_id
   */
  exports.prototype['funding_id'] = undefined;



  return exports;
}));


