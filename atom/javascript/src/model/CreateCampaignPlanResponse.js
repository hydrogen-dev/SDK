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
    define(['ApiClient', 'model/CampaignPlanPayload', 'model/CampaignPlanPayloadPlanRates', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CampaignPlanPayload'), require('./CampaignPlanPayloadPlanRates'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.CreateCampaignPlanResponse = factory(root.atom_api.ApiClient, root.atom_api.CampaignPlanPayload, root.atom_api.CampaignPlanPayloadPlanRates, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, CampaignPlanPayload, CampaignPlanPayloadPlanRates, SecondaryId) {
  'use strict';




  /**
   * The CreateCampaignPlanResponse model module.
   * @module model/CreateCampaignPlanResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>CreateCampaignPlanResponse</code>.
   * @alias module:model/CreateCampaignPlanResponse
   * @class
   * @implements module:model/CampaignPlanPayload
   * @param description {String} Description for the campaign plan
   */
  var exports = function(description) {
    var _this = this;

    CampaignPlanPayload.call(_this, description);


  };

  /**
   * Constructs a <code>CreateCampaignPlanResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateCampaignPlanResponse} obj Optional instance to populate.
   * @return {module:model/CreateCampaignPlanResponse} The populated <code>CreateCampaignPlanResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      CampaignPlanPayload.constructFromObject(data, obj);
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
   * ID of the marketing campaign plan
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Datetime the marketing campaign plan was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;

  // Implement CampaignPlanPayload interface:
  /**
   * Description for the campaign plan
   * @member {String} description
   */
exports.prototype['description'] = undefined;

  /**
   * Indicates if the campaign plan is currently active. Defaults to true which indicates that it is active
   * @member {Boolean} is_active
   * @default true
   */
exports.prototype['is_active'] = true;

  /**
   * @member {Array.<module:model/CampaignPlanPayloadPlanRates>} plan_rates
   */
exports.prototype['plan_rates'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;



  return exports;
}));


