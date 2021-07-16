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
    root.HydrogenNucleusApi.ModelHolding = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ModelHolding model module.
   * @module model/ModelHolding
   * @version 1.9.3
   */

  /**
   * Constructs a new <code>ModelHolding</code>.
   * @alias module:model/ModelHolding
   * @class
   * @param currentWeight {Number} Model Holding current weight
   * @param _date {Date} Model Holding date
   * @param modelId {String} modelId
   * @param securityId {String} securityId
   * @param strategicWeight {Number} Model Holding strategicWeight
   */
  var exports = function(currentWeight, _date, modelId, securityId, strategicWeight) {
    var _this = this;


    _this['current_weight'] = currentWeight;
    _this['date'] = _date;







    _this['model_id'] = modelId;




    _this['security_id'] = securityId;
    _this['strategic_weight'] = strategicWeight;

  };

  /**
   * Constructs a <code>ModelHolding</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ModelHolding} obj Optional instance to populate.
   * @return {module:model/ModelHolding} The populated <code>ModelHolding</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('current_weight')) {
        obj['current_weight'] = ApiClient.convertToType(data['current_weight'], 'Number');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('drift_factor')) {
        obj['drift_factor'] = ApiClient.convertToType(data['drift_factor'], 'Number');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('is_cash')) {
        obj['is_cash'] = ApiClient.convertToType(data['is_cash'], 'Boolean');
      }
      if (data.hasOwnProperty('is_initial_holding')) {
        obj['is_initial_holding'] = ApiClient.convertToType(data['is_initial_holding'], 'Boolean');
      }
      if (data.hasOwnProperty('is_safe_security')) {
        obj['is_safe_security'] = ApiClient.convertToType(data['is_safe_security'], 'Boolean');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('model_description')) {
        obj['model_description'] = ApiClient.convertToType(data['model_description'], 'String');
      }
      if (data.hasOwnProperty('model_id')) {
        obj['model_id'] = ApiClient.convertToType(data['model_id'], 'String');
      }
      if (data.hasOwnProperty('model_name')) {
        obj['model_name'] = ApiClient.convertToType(data['model_name'], 'String');
      }
      if (data.hasOwnProperty('model_weight')) {
        obj['model_weight'] = ApiClient.convertToType(data['model_weight'], 'Number');
      }
      if (data.hasOwnProperty('sec_price')) {
        obj['sec_price'] = ApiClient.convertToType(data['sec_price'], 'Number');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('security_id')) {
        obj['security_id'] = ApiClient.convertToType(data['security_id'], 'String');
      }
      if (data.hasOwnProperty('strategic_weight')) {
        obj['strategic_weight'] = ApiClient.convertToType(data['strategic_weight'], 'Number');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * Model Holding current weight
   * @member {Number} current_weight
   */
  exports.prototype['current_weight'] = undefined;
  /**
   * Model Holding date
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * driftFactor
   * @member {Number} drift_factor
   */
  exports.prototype['drift_factor'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * isCash
   * @member {Boolean} is_cash
   */
  exports.prototype['is_cash'] = undefined;
  /**
   * isInitialHolding
   * @member {Boolean} is_initial_holding
   */
  exports.prototype['is_initial_holding'] = undefined;
  /**
   * isSafeSecurity
   * @member {Boolean} is_safe_security
   */
  exports.prototype['is_safe_security'] = undefined;
  /**
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * @member {String} model_description
   */
  exports.prototype['model_description'] = undefined;
  /**
   * modelId
   * @member {String} model_id
   */
  exports.prototype['model_id'] = undefined;
  /**
   * @member {String} model_name
   */
  exports.prototype['model_name'] = undefined;
  /**
   * @member {Number} model_weight
   */
  exports.prototype['model_weight'] = undefined;
  /**
   * @member {Number} sec_price
   */
  exports.prototype['sec_price'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * securityId
   * @member {String} security_id
   */
  exports.prototype['security_id'] = undefined;
  /**
   * Model Holding strategicWeight
   * @member {Number} strategic_weight
   */
  exports.prototype['strategic_weight'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


