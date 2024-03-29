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
    root.HydrogenNucleusApi.Document = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Document model module.
   * @module model/Document
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>Document</code>.
   * Document Object
   * @alias module:model/Document
   * @class
   * @param docName {String} doc_name
   */
  var exports = function(docName) {
    var _this = this;









    _this['doc_name'] = docName;














  };

  /**
   * Constructs a <code>Document</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Document} obj Optional instance to populate.
   * @return {module:model/Document} The populated <code>Document</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('business_id')) {
        obj['business_id'] = ApiClient.convertToType(data['business_id'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('country_of_issue')) {
        obj['country_of_issue'] = ApiClient.convertToType(data['country_of_issue'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('doc_file')) {
        obj['doc_file'] = ApiClient.convertToType(data['doc_file'], 'String');
      }
      if (data.hasOwnProperty('doc_image_back')) {
        obj['doc_image_back'] = ApiClient.convertToType(data['doc_image_back'], 'String');
      }
      if (data.hasOwnProperty('doc_image_front')) {
        obj['doc_image_front'] = ApiClient.convertToType(data['doc_image_front'], 'String');
      }
      if (data.hasOwnProperty('doc_name')) {
        obj['doc_name'] = ApiClient.convertToType(data['doc_name'], 'String');
      }
      if (data.hasOwnProperty('doc_number')) {
        obj['doc_number'] = ApiClient.convertToType(data['doc_number'], 'String');
      }
      if (data.hasOwnProperty('doc_size')) {
        obj['doc_size'] = ApiClient.convertToType(data['doc_size'], 'Number');
      }
      if (data.hasOwnProperty('doc_type')) {
        obj['doc_type'] = ApiClient.convertToType(data['doc_type'], 'String');
      }
      if (data.hasOwnProperty('expiry_date')) {
        obj['expiry_date'] = ApiClient.convertToType(data['expiry_date'], 'Date');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('is_active')) {
        obj['is_active'] = ApiClient.convertToType(data['is_active'], 'Boolean');
      }
      if (data.hasOwnProperty('is_sensitive')) {
        obj['is_sensitive'] = ApiClient.convertToType(data['is_sensitive'], 'Boolean');
      }
      if (data.hasOwnProperty('is_verified')) {
        obj['is_verified'] = ApiClient.convertToType(data['is_verified'], 'Boolean');
      }
      if (data.hasOwnProperty('issue_date')) {
        obj['issue_date'] = ApiClient.convertToType(data['issue_date'], 'Date');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('state_of_issue')) {
        obj['state_of_issue'] = ApiClient.convertToType(data['state_of_issue'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
      if (data.hasOwnProperty('url_path')) {
        obj['url_path'] = ApiClient.convertToType(data['url_path'], 'String');
      }
    }
    return obj;
  }

  /**
   * accountId
   * @member {String} account_id
   */
  exports.prototype['account_id'] = undefined;
  /**
   * businessId
   * @member {String} business_id
   */
  exports.prototype['business_id'] = undefined;
  /**
   * clientId
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * country_of_issue
   * @member {String} country_of_issue
   */
  exports.prototype['country_of_issue'] = undefined;
  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * doc_file
   * @member {String} doc_file
   */
  exports.prototype['doc_file'] = undefined;
  /**
   * doc_image_back
   * @member {String} doc_image_back
   */
  exports.prototype['doc_image_back'] = undefined;
  /**
   * doc_image_front
   * @member {String} doc_image_front
   */
  exports.prototype['doc_image_front'] = undefined;
  /**
   * doc_name
   * @member {String} doc_name
   */
  exports.prototype['doc_name'] = undefined;
  /**
   * doc_number
   * @member {String} doc_number
   */
  exports.prototype['doc_number'] = undefined;
  /**
   * doc_size
   * @member {Number} doc_size
   */
  exports.prototype['doc_size'] = undefined;
  /**
   * doc_type
   * @member {String} doc_type
   */
  exports.prototype['doc_type'] = undefined;
  /**
   * expiry_date
   * @member {Date} expiry_date
   */
  exports.prototype['expiry_date'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * is_active
   * @member {Boolean} is_active
   */
  exports.prototype['is_active'] = undefined;
  /**
   * is_sensitive
   * @member {Boolean} is_sensitive
   */
  exports.prototype['is_sensitive'] = undefined;
  /**
   * is_verified
   * @member {Boolean} is_verified
   */
  exports.prototype['is_verified'] = undefined;
  /**
   * issue_date
   * @member {Date} issue_date
   */
  exports.prototype['issue_date'] = undefined;
  /**
   * metadata
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * state_of_issue
   * @member {String} state_of_issue
   */
  exports.prototype['state_of_issue'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;
  /**
   * url_path
   * @member {String} url_path
   */
  exports.prototype['url_path'] = undefined;



  return exports;
}));


