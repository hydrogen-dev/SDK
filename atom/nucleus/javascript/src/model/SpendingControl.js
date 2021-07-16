/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
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
    root.HydrogenNucleusApi.SpendingControl = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SpendingControl model module.
   * @module model/SpendingControl
   * @version 1.9.3
   */

  /**
   * Constructs a new <code>SpendingControl</code>.
   * SpendingControl Object
   * @alias module:model/SpendingControl
   * @class
   * @param clientId {String} client_id
   * @param controlScope {String} controlScope
   * @param controlType {String} controlType
   * @param currencyCode {String} currency_code
   */
  var exports = function(clientId, controlScope, controlType, currencyCode) {
    var _this = this;

    _this['client_id'] = clientId;
    _this['control_scope'] = controlScope;
    _this['control_type'] = controlType;


    _this['currency_code'] = currencyCode;









  };

  /**
   * Constructs a <code>SpendingControl</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpendingControl} obj Optional instance to populate.
   * @return {module:model/SpendingControl} The populated <code>SpendingControl</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('control_scope')) {
        obj['control_scope'] = ApiClient.convertToType(data['control_scope'], 'String');
      }
      if (data.hasOwnProperty('control_type')) {
        obj['control_type'] = ApiClient.convertToType(data['control_type'], 'String');
      }
      if (data.hasOwnProperty('control_values')) {
        obj['control_values'] = ApiClient.convertToType(data['control_values'], ['String']);
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('frequency')) {
        obj['frequency'] = ApiClient.convertToType(data['frequency'], 'Number');
      }
      if (data.hasOwnProperty('frequency_unit')) {
        obj['frequency_unit'] = ApiClient.convertToType(data['frequency_unit'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('is_active')) {
        obj['is_active'] = ApiClient.convertToType(data['is_active'], 'Boolean');
      }
      if (data.hasOwnProperty('limit_value')) {
        obj['limit_value'] = ApiClient.convertToType(data['limit_value'], 'Number');
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
   * client_id
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * controlScope
   * @member {String} control_scope
   */
  exports.prototype['control_scope'] = undefined;
  /**
   * controlType
   * @member {String} control_type
   */
  exports.prototype['control_type'] = undefined;
  /**
   * control_values
   * @member {Array.<String>} control_values
   */
  exports.prototype['control_values'] = undefined;
  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * currency_code
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * description
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * frequency
   * @member {Number} frequency
   */
  exports.prototype['frequency'] = undefined;
  /**
   * frequency_unit
   * @member {String} frequency_unit
   */
  exports.prototype['frequency_unit'] = undefined;
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
   * limitValue
   * @member {Number} limit_value
   */
  exports.prototype['limit_value'] = undefined;
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


