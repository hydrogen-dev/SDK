/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
    define(['ApiClient', 'model/GoalTrackAccounts'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./GoalTrackAccounts'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.GoalTrack = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.GoalTrackAccounts);
  }
}(this, function(ApiClient, GoalTrackAccounts) {
  'use strict';




  /**
   * The GoalTrack model module.
   * @module model/GoalTrack
   * @version 1.9.4
   */

  /**
   * Constructs a new <code>GoalTrack</code>.
   * Goal Simulation Result Object
   * @alias module:model/GoalTrack
   * @class
   * @param goalId {String} goalId
   * @param statusTimeStamp {Date} statusTimeStamp
   */
  var exports = function(goalId, statusTimeStamp) {
    var _this = this;









    _this['goal_id'] = goalId;








    _this['status_time_stamp'] = statusTimeStamp;

  };

  /**
   * Constructs a <code>GoalTrack</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/GoalTrack} obj Optional instance to populate.
   * @return {module:model/GoalTrack} The populated <code>GoalTrack</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('accounts')) {
        obj['accounts'] = ApiClient.convertToType(data['accounts'], [GoalTrackAccounts]);
      }
      if (data.hasOwnProperty('accumulation_horizon')) {
        obj['accumulation_horizon'] = ApiClient.convertToType(data['accumulation_horizon'], 'Number');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('current_investment')) {
        obj['current_investment'] = ApiClient.convertToType(data['current_investment'], 'Number');
      }
      if (data.hasOwnProperty('decumulation_horizon')) {
        obj['decumulation_horizon'] = ApiClient.convertToType(data['decumulation_horizon'], 'Number');
      }
      if (data.hasOwnProperty('goal_achievement_score')) {
        obj['goal_achievement_score'] = ApiClient.convertToType(data['goal_achievement_score'], 'Number');
      }
      if (data.hasOwnProperty('goal_amount')) {
        obj['goal_amount'] = ApiClient.convertToType(data['goal_amount'], 'Number');
      }
      if (data.hasOwnProperty('goal_id')) {
        obj['goal_id'] = ApiClient.convertToType(data['goal_id'], 'String');
      }
      if (data.hasOwnProperty('goal_probability')) {
        obj['goal_probability'] = ApiClient.convertToType(data['goal_probability'], 'Number');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('on_track')) {
        obj['on_track'] = ApiClient.convertToType(data['on_track'], 'Boolean');
      }
      if (data.hasOwnProperty('progress')) {
        obj['progress'] = ApiClient.convertToType(data['progress'], 'Number');
      }
      if (data.hasOwnProperty('projection_balance')) {
        obj['projection_balance'] = ApiClient.convertToType(data['projection_balance'], 'Number');
      }
      if (data.hasOwnProperty('projection_date')) {
        obj['projection_date'] = ApiClient.convertToType(data['projection_date'], 'Date');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('status_time_stamp')) {
        obj['status_time_stamp'] = ApiClient.convertToType(data['status_time_stamp'], 'Date');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:model/GoalTrackAccounts>} accounts
   */
  exports.prototype['accounts'] = undefined;
  /**
   * accumulationHorizon
   * @member {Number} accumulation_horizon
   */
  exports.prototype['accumulation_horizon'] = undefined;
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
   * currentInvestment
   * @member {Number} current_investment
   */
  exports.prototype['current_investment'] = undefined;
  /**
   * decumulationHorizon
   * @member {Number} decumulation_horizon
   */
  exports.prototype['decumulation_horizon'] = undefined;
  /**
   * goalAchievementScore
   * @member {Number} goal_achievement_score
   */
  exports.prototype['goal_achievement_score'] = undefined;
  /**
   * goalAmount
   * @member {Number} goal_amount
   */
  exports.prototype['goal_amount'] = undefined;
  /**
   * goalId
   * @member {String} goal_id
   */
  exports.prototype['goal_id'] = undefined;
  /**
   * goalProbability
   * @member {Number} goal_probability
   */
  exports.prototype['goal_probability'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * metadata
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * onTrack
   * @member {Boolean} on_track
   */
  exports.prototype['on_track'] = undefined;
  /**
   * progress
   * @member {Number} progress
   */
  exports.prototype['progress'] = undefined;
  /**
   * projectionBalance
   * @member {Number} projection_balance
   */
  exports.prototype['projection_balance'] = undefined;
  /**
   * projectionDate
   * @member {Date} projection_date
   */
  exports.prototype['projection_date'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * statusTimeStamp
   * @member {Date} status_time_stamp
   */
  exports.prototype['status_time_stamp'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


