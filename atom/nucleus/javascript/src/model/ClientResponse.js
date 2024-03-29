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
    root.HydrogenNucleusApi.ClientResponse = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ClientResponse model module.
   * @module model/ClientResponse
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>ClientResponse</code>.
   * ClientResponse Object
   * @alias module:model/ClientResponse
   * @class
   * @param answerId {String} answerId
   * @param answerValue {String} answerValue
   */
  var exports = function(answerId, answerValue) {
    var _this = this;


    _this['answer_id'] = answerId;
    _this['answer_value'] = answerValue;







  };

  /**
   * Constructs a <code>ClientResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ClientResponse} obj Optional instance to populate.
   * @return {module:model/ClientResponse} The populated <code>ClientResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('answer_id')) {
        obj['answer_id'] = ApiClient.convertToType(data['answer_id'], 'String');
      }
      if (data.hasOwnProperty('answer_value')) {
        obj['answer_value'] = ApiClient.convertToType(data['answer_value'], 'String');
      }
      if (data.hasOwnProperty('application_id')) {
        obj['application_id'] = ApiClient.convertToType(data['application_id'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * account_id
   * @member {String} account_id
   */
  exports.prototype['account_id'] = undefined;
  /**
   * answerId
   * @member {String} answer_id
   */
  exports.prototype['answer_id'] = undefined;
  /**
   * answerValue
   * @member {String} answer_value
   */
  exports.prototype['answer_value'] = undefined;
  /**
   * application_id
   * @member {String} application_id
   */
  exports.prototype['application_id'] = undefined;
  /**
   * client_id
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


