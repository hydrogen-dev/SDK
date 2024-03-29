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
    root.HydrogenNucleusApi.AnswerMap = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AnswerMap model module.
   * @module model/AnswerMap
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>AnswerMap</code>.
   * @alias module:model/AnswerMap
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>AnswerMap</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AnswerMap} obj Optional instance to populate.
   * @return {module:model/AnswerMap} The populated <code>AnswerMap</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('answer_id')) {
        obj['answer_id'] = ApiClient.convertToType(data['answer_id'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} answer_id
   */
  exports.prototype['answer_id'] = undefined;



  return exports;
}));


