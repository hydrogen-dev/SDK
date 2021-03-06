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
    root.HydrogenNucleusApi.JsonNode = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The JsonNode model module.
   * @module model/JsonNode
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>JsonNode</code>.
   * @alias module:model/JsonNode
   * @class
   */
  var exports = function() {
    var _this = this;























  };

  /**
   * Constructs a <code>JsonNode</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/JsonNode} obj Optional instance to populate.
   * @return {module:model/JsonNode} The populated <code>JsonNode</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('array')) {
        obj['array'] = ApiClient.convertToType(data['array'], 'Boolean');
      }
      if (data.hasOwnProperty('big_decimal')) {
        obj['big_decimal'] = ApiClient.convertToType(data['big_decimal'], 'Boolean');
      }
      if (data.hasOwnProperty('big_integer')) {
        obj['big_integer'] = ApiClient.convertToType(data['big_integer'], 'Boolean');
      }
      if (data.hasOwnProperty('binary')) {
        obj['binary'] = ApiClient.convertToType(data['binary'], 'Boolean');
      }
      if (data.hasOwnProperty('boolean')) {
        obj['boolean'] = ApiClient.convertToType(data['boolean'], 'Boolean');
      }
      if (data.hasOwnProperty('container_node')) {
        obj['container_node'] = ApiClient.convertToType(data['container_node'], 'Boolean');
      }
      if (data.hasOwnProperty('double')) {
        obj['double'] = ApiClient.convertToType(data['double'], 'Boolean');
      }
      if (data.hasOwnProperty('empty')) {
        obj['empty'] = ApiClient.convertToType(data['empty'], 'Boolean');
      }
      if (data.hasOwnProperty('float')) {
        obj['float'] = ApiClient.convertToType(data['float'], 'Boolean');
      }
      if (data.hasOwnProperty('floating_point_number')) {
        obj['floating_point_number'] = ApiClient.convertToType(data['floating_point_number'], 'Boolean');
      }
      if (data.hasOwnProperty('int')) {
        obj['int'] = ApiClient.convertToType(data['int'], 'Boolean');
      }
      if (data.hasOwnProperty('integral_number')) {
        obj['integral_number'] = ApiClient.convertToType(data['integral_number'], 'Boolean');
      }
      if (data.hasOwnProperty('long')) {
        obj['long'] = ApiClient.convertToType(data['long'], 'Boolean');
      }
      if (data.hasOwnProperty('missing_node')) {
        obj['missing_node'] = ApiClient.convertToType(data['missing_node'], 'Boolean');
      }
      if (data.hasOwnProperty('node_type')) {
        obj['node_type'] = ApiClient.convertToType(data['node_type'], 'String');
      }
      if (data.hasOwnProperty('null')) {
        obj['null'] = ApiClient.convertToType(data['null'], 'Boolean');
      }
      if (data.hasOwnProperty('number')) {
        obj['number'] = ApiClient.convertToType(data['number'], 'Boolean');
      }
      if (data.hasOwnProperty('object')) {
        obj['object'] = ApiClient.convertToType(data['object'], 'Boolean');
      }
      if (data.hasOwnProperty('pojo')) {
        obj['pojo'] = ApiClient.convertToType(data['pojo'], 'Boolean');
      }
      if (data.hasOwnProperty('short')) {
        obj['short'] = ApiClient.convertToType(data['short'], 'Boolean');
      }
      if (data.hasOwnProperty('textual')) {
        obj['textual'] = ApiClient.convertToType(data['textual'], 'Boolean');
      }
      if (data.hasOwnProperty('value_node')) {
        obj['value_node'] = ApiClient.convertToType(data['value_node'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * @member {Boolean} array
   */
  exports.prototype['array'] = undefined;
  /**
   * @member {Boolean} big_decimal
   */
  exports.prototype['big_decimal'] = undefined;
  /**
   * @member {Boolean} big_integer
   */
  exports.prototype['big_integer'] = undefined;
  /**
   * @member {Boolean} binary
   */
  exports.prototype['binary'] = undefined;
  /**
   * @member {Boolean} boolean
   */
  exports.prototype['boolean'] = undefined;
  /**
   * @member {Boolean} container_node
   */
  exports.prototype['container_node'] = undefined;
  /**
   * @member {Boolean} double
   */
  exports.prototype['double'] = undefined;
  /**
   * @member {Boolean} empty
   */
  exports.prototype['empty'] = undefined;
  /**
   * @member {Boolean} float
   */
  exports.prototype['float'] = undefined;
  /**
   * @member {Boolean} floating_point_number
   */
  exports.prototype['floating_point_number'] = undefined;
  /**
   * @member {Boolean} int
   */
  exports.prototype['int'] = undefined;
  /**
   * @member {Boolean} integral_number
   */
  exports.prototype['integral_number'] = undefined;
  /**
   * @member {Boolean} long
   */
  exports.prototype['long'] = undefined;
  /**
   * @member {Boolean} missing_node
   */
  exports.prototype['missing_node'] = undefined;
  /**
   * @member {module:model/JsonNode.NodeTypeEnum} node_type
   */
  exports.prototype['node_type'] = undefined;
  /**
   * @member {Boolean} null
   */
  exports.prototype['null'] = undefined;
  /**
   * @member {Boolean} number
   */
  exports.prototype['number'] = undefined;
  /**
   * @member {Boolean} object
   */
  exports.prototype['object'] = undefined;
  /**
   * @member {Boolean} pojo
   */
  exports.prototype['pojo'] = undefined;
  /**
   * @member {Boolean} short
   */
  exports.prototype['short'] = undefined;
  /**
   * @member {Boolean} textual
   */
  exports.prototype['textual'] = undefined;
  /**
   * @member {Boolean} value_node
   */
  exports.prototype['value_node'] = undefined;


  /**
   * Allowed values for the <code>node_type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.NodeTypeEnum = {
    /**
     * value: "ARRAY"
     * @const
     */
    "ARRAY": "ARRAY",
    /**
     * value: "BINARY"
     * @const
     */
    "BINARY": "BINARY",
    /**
     * value: "BOOLEAN"
     * @const
     */
    "BOOLEAN": "BOOLEAN",
    /**
     * value: "MISSING"
     * @const
     */
    "MISSING": "MISSING",
    /**
     * value: "NULL"
     * @const
     */
    "NULL": "NULL",
    /**
     * value: "NUMBER"
     * @const
     */
    "NUMBER": "NUMBER",
    /**
     * value: "OBJECT"
     * @const
     */
    "OBJECT": "OBJECT",
    /**
     * value: "POJO"
     * @const
     */
    "POJO": "POJO",
    /**
     * value: "STRING"
     * @const
     */
    "STRING": "STRING"  };


  return exports;
}));


