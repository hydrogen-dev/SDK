/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.RiskScoreResponse = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The RiskScoreResponse model module.
   * @module model/RiskScoreResponse
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>RiskScoreResponse</code>.
   * @alias module:model/RiskScoreResponse
   * @class
   * @param riskScore {Number} A risk score from 0 to 100.
   */
  var exports = function(riskScore) {
    var _this = this;

    _this['risk_score'] = riskScore;
  };

  /**
   * Constructs a <code>RiskScoreResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RiskScoreResponse} obj Optional instance to populate.
   * @return {module:model/RiskScoreResponse} The populated <code>RiskScoreResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('risk_score')) {
        obj['risk_score'] = ApiClient.convertToType(data['risk_score'], 'Number');
      }
    }
    return obj;
  }

  /**
   * A risk score from 0 to 100.
   * @member {Number} risk_score
   */
  exports.prototype['risk_score'] = undefined;



  return exports;
}));

