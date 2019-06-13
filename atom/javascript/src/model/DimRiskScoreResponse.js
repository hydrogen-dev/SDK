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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.DimRiskScoreResponse = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The DimRiskScoreResponse model module.
   * @module model/DimRiskScoreResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>DimRiskScoreResponse</code>.
   * @alias module:model/DimRiskScoreResponse
   * @class
   * @param riskScore {Number} A multi-dimensional risk score from 0 to 100.
   * @param dimScores {Object.<String, Number>} 
   */
  var exports = function(riskScore, dimScores) {
    var _this = this;

    _this['risk_score'] = riskScore;
    _this['dim_scores'] = dimScores;
  };

  /**
   * Constructs a <code>DimRiskScoreResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DimRiskScoreResponse} obj Optional instance to populate.
   * @return {module:model/DimRiskScoreResponse} The populated <code>DimRiskScoreResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('risk_score')) {
        obj['risk_score'] = ApiClient.convertToType(data['risk_score'], 'Number');
      }
      if (data.hasOwnProperty('dim_scores')) {
        obj['dim_scores'] = ApiClient.convertToType(data['dim_scores'], {'String': 'Number'});
      }
    }
    return obj;
  }

  /**
   * A multi-dimensional risk score from 0 to 100.
   * @member {Number} risk_score
   */
  exports.prototype['risk_score'] = undefined;
  /**
   * @member {Object.<String, Number>} dim_scores
   */
  exports.prototype['dim_scores'] = undefined;



  return exports;
}));


