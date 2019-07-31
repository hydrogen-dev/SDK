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
    define(['ApiClient', 'model/AllocationCompositionPayload'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AllocationCompositionPayload'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.CreateAllocationCompositionResponse = factory(root.atom_api.ApiClient, root.atom_api.AllocationCompositionPayload);
  }
}(this, function(ApiClient, AllocationCompositionPayload) {
  'use strict';




  /**
   * The CreateAllocationCompositionResponse model module.
   * @module model/CreateAllocationCompositionResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>CreateAllocationCompositionResponse</code>.
   * @alias module:model/CreateAllocationCompositionResponse
   * @class
   * @implements module:model/AllocationCompositionPayload
   * @param allocationId {String} The ID of the allocation for which you are adding a composition record
   * @param modelId {String} The ID of the model that is assigned to the allocation
   * @param currentWeight {Number} The current weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The current weights of all the models must add up to 100. If the model is the only one, enter 100
   * @param strategicWeight {Number} The strategic weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The strategic weights of all the models must add up to 100. If the model is the only one, enter 100
   * @param _date {Date} The date for this allocation composition record
   */
  var exports = function(allocationId, modelId, currentWeight, strategicWeight, _date) {
    var _this = this;

    AllocationCompositionPayload.call(_this, allocationId, modelId, currentWeight, strategicWeight, _date);


  };

  /**
   * Constructs a <code>CreateAllocationCompositionResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateAllocationCompositionResponse} obj Optional instance to populate.
   * @return {module:model/CreateAllocationCompositionResponse} The populated <code>CreateAllocationCompositionResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      AllocationCompositionPayload.constructFromObject(data, obj);
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * ID of the allocation composition
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Datetime the allocation composition was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;

  // Implement AllocationCompositionPayload interface:
  /**
   * The ID of the allocation for which you are adding a composition record
   * @member {String} allocation_id
   */
exports.prototype['allocation_id'] = undefined;

  /**
   * The ID of the model that is assigned to the allocation
   * @member {String} model_id
   */
exports.prototype['model_id'] = undefined;

  /**
   * The current weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The current weights of all the models must add up to 100. If the model is the only one, enter 100
   * @member {Number} current_weight
   */
exports.prototype['current_weight'] = undefined;

  /**
   * The strategic weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The strategic weights of all the models must add up to 100. If the model is the only one, enter 100
   * @member {Number} strategic_weight
   */
exports.prototype['strategic_weight'] = undefined;

  /**
   * The date for this allocation composition record
   * @member {Date} date
   */
exports.prototype['date'] = undefined;

  /**
   * Indicator if the model_id is a core model for core-satellite investing. Defaults to false which means it is not a core model
   * @member {Boolean} core
   * @default false
   */
exports.prototype['core'] = false;

  /**
   * Custom information associated with the allocation composition in the format key:value
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;



  return exports;
}));


