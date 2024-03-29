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
    define(['ApiClient', 'model/AllocationNodeMap'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AllocationNodeMap'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.Allocation = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.AllocationNodeMap);
  }
}(this, function(ApiClient, AllocationNodeMap) {
  'use strict';




  /**
   * The Allocation model module.
   * @module model/Allocation
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>Allocation</code>.
   * Allocation Object
   * @alias module:model/Allocation
   * @class
   * @param name {String} name
   */
  var exports = function(name) {
    var _this = this;










    _this['name'] = name;





  };

  /**
   * Constructs a <code>Allocation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Allocation} obj Optional instance to populate.
   * @return {module:model/Allocation} The populated <code>Allocation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('benchmark_id')) {
        obj['benchmark_id'] = ApiClient.convertToType(data['benchmark_id'], 'String');
      }
      if (data.hasOwnProperty('category')) {
        obj['category'] = ApiClient.convertToType(data['category'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('inception_date')) {
        obj['inception_date'] = ApiClient.convertToType(data['inception_date'], 'Date');
      }
      if (data.hasOwnProperty('is_active')) {
        obj['is_active'] = ApiClient.convertToType(data['is_active'], 'Boolean');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('node_map')) {
        obj['node_map'] = ApiClient.convertToType(data['node_map'], [AllocationNodeMap]);
      }
      if (data.hasOwnProperty('performance')) {
        obj['performance'] = ApiClient.convertToType(data['performance'], 'Number');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
      if (data.hasOwnProperty('volatility')) {
        obj['volatility'] = ApiClient.convertToType(data['volatility'], 'Number');
      }
    }
    return obj;
  }

  /**
   * benchmarkId
   * @member {String} benchmark_id
   */
  exports.prototype['benchmark_id'] = undefined;
  /**
   * @member {String} category
   */
  exports.prototype['category'] = undefined;
  /**
   * clientId
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * description
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * inceptionDate
   * @member {Date} inception_date
   */
  exports.prototype['inception_date'] = undefined;
  /**
   * isActive
   * @member {Boolean} is_active
   */
  exports.prototype['is_active'] = undefined;
  /**
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * name
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {Array.<module:model/AllocationNodeMap>} node_map
   */
  exports.prototype['node_map'] = undefined;
  /**
   * performance
   * @member {Number} performance
   */
  exports.prototype['performance'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;
  /**
   * volatility
   * @member {Number} volatility
   */
  exports.prototype['volatility'] = undefined;



  return exports;
}));


