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
    define(['ApiClient', 'model/ClientViewGoalData'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ClientViewGoalData'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.VClientGoalViewData = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.ClientViewGoalData);
  }
}(this, function(ApiClient, ClientViewGoalData) {
  'use strict';




  /**
   * The VClientGoalViewData model module.
   * @module model/VClientGoalViewData
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>VClientGoalViewData</code>.
   * @alias module:model/VClientGoalViewData
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>VClientGoalViewData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/VClientGoalViewData} obj Optional instance to populate.
   * @return {module:model/VClientGoalViewData} The populated <code>VClientGoalViewData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('client_asset_size')) {
        obj['client_asset_size'] = ApiClient.convertToType(data['client_asset_size'], 'Number');
      }
      if (data.hasOwnProperty('client_asset_size_date')) {
        obj['client_asset_size_date'] = ApiClient.convertToType(data['client_asset_size_date'], 'Date');
      }
      if (data.hasOwnProperty('client_first_name')) {
        obj['client_first_name'] = ApiClient.convertToType(data['client_first_name'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('client_last_name')) {
        obj['client_last_name'] = ApiClient.convertToType(data['client_last_name'], 'String');
      }
      if (data.hasOwnProperty('client_view_goal_data')) {
        obj['client_view_goal_data'] = ApiClient.convertToType(data['client_view_goal_data'], [ClientViewGoalData]);
      }
    }
    return obj;
  }

  /**
   * @member {Number} client_asset_size
   */
  exports.prototype['client_asset_size'] = undefined;
  /**
   * @member {Date} client_asset_size_date
   */
  exports.prototype['client_asset_size_date'] = undefined;
  /**
   * @member {String} client_first_name
   */
  exports.prototype['client_first_name'] = undefined;
  /**
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * @member {String} client_last_name
   */
  exports.prototype['client_last_name'] = undefined;
  /**
   * @member {Array.<module:model/ClientViewGoalData>} client_view_goal_data
   */
  exports.prototype['client_view_goal_data'] = undefined;



  return exports;
}));


