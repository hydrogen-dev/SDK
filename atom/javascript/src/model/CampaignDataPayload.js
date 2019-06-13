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
    define(['ApiClient', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.CampaignDataPayload = factory(root.atom_api.ApiClient, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, SecondaryId) {
  'use strict';




  /**
   * The CampaignDataPayload model module.
   * @module model/CampaignDataPayload
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>CampaignDataPayload</code>.
   * @alias module:model/CampaignDataPayload
   * @class
   * @param campaignId {String} The ID of the campaign to which the campaign data record belongs
   * @param startDate {Date} Date for when the period being measured by the campaign data record began
   * @param endDate {Date} Date for when the period being measured by the campaign data record ended
   */
  var exports = function(campaignId, startDate, endDate) {
    var _this = this;

    _this['campaign_id'] = campaignId;
    _this['start_date'] = startDate;
    _this['end_date'] = endDate;






  };

  /**
   * Constructs a <code>CampaignDataPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CampaignDataPayload} obj Optional instance to populate.
   * @return {module:model/CampaignDataPayload} The populated <code>CampaignDataPayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('campaign_id')) {
        obj['campaign_id'] = ApiClient.convertToType(data['campaign_id'], 'String');
      }
      if (data.hasOwnProperty('start_date')) {
        obj['start_date'] = ApiClient.convertToType(data['start_date'], 'Date');
      }
      if (data.hasOwnProperty('end_date')) {
        obj['end_date'] = ApiClient.convertToType(data['end_date'], 'Date');
      }
      if (data.hasOwnProperty('click_through_rate')) {
        obj['click_through_rate'] = ApiClient.convertToType(data['click_through_rate'], 'Number');
      }
      if (data.hasOwnProperty('line_item')) {
        obj['line_item'] = ApiClient.convertToType(data['line_item'], 'String');
      }
      if (data.hasOwnProperty('publisher_campaign_name')) {
        obj['publisher_campaign_name'] = ApiClient.convertToType(data['publisher_campaign_name'], 'String');
      }
      if (data.hasOwnProperty('total_clicks')) {
        obj['total_clicks'] = ApiClient.convertToType(data['total_clicks'], 'Number');
      }
      if (data.hasOwnProperty('total_impressions')) {
        obj['total_impressions'] = ApiClient.convertToType(data['total_impressions'], 'Number');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = SecondaryId.constructFromObject(data['secondary_id']);
      }
    }
    return obj;
  }

  /**
   * The ID of the campaign to which the campaign data record belongs
   * @member {String} campaign_id
   */
  exports.prototype['campaign_id'] = undefined;
  /**
   * Date for when the period being measured by the campaign data record began
   * @member {Date} start_date
   */
  exports.prototype['start_date'] = undefined;
  /**
   * Date for when the period being measured by the campaign data record ended
   * @member {Date} end_date
   */
  exports.prototype['end_date'] = undefined;
  /**
   * Rate of clicks measured in the campaign data record for a specific feature as a whole number
   * @member {Number} click_through_rate
   */
  exports.prototype['click_through_rate'] = undefined;
  /**
   * Name of the campaign data record indicating the feature that it is measuring such as banner click through
   * @member {String} line_item
   */
  exports.prototype['line_item'] = undefined;
  /**
   * Name of the campaign publisher
   * @member {String} publisher_campaign_name
   */
  exports.prototype['publisher_campaign_name'] = undefined;
  /**
   * Total number of clicks measured in the campaign data record for a specific feature as a whole number
   * @member {Number} total_clicks
   */
  exports.prototype['total_clicks'] = undefined;
  /**
   * Total number of impressions measured in the campaign data record for a specific feature as a whole number
   * @member {Number} total_impressions
   */
  exports.prototype['total_impressions'] = undefined;
  /**
   * @member {module:model/SecondaryId} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;



  return exports;
}));


