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
    define(['ApiClient', 'model/CreateGoalTrackResponse', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CreateGoalTrackResponse'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SpecificGoalTrackResponse = factory(root.atom_api.ApiClient, root.atom_api.CreateGoalTrackResponse, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, CreateGoalTrackResponse, SecondaryId) {
  'use strict';




  /**
   * The SpecificGoalTrackResponse model module.
   * @module model/SpecificGoalTrackResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SpecificGoalTrackResponse</code>.
   * @alias module:model/SpecificGoalTrackResponse
   * @class
   * @implements module:model/CreateGoalTrackResponse
   * @param goalId {String} The ID of a goal to which the goal track record pertains
   */
  var exports = function(goalId) {
    var _this = this;

    CreateGoalTrackResponse.call(_this, goalId);

  };

  /**
   * Constructs a <code>SpecificGoalTrackResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecificGoalTrackResponse} obj Optional instance to populate.
   * @return {module:model/SpecificGoalTrackResponse} The populated <code>SpecificGoalTrackResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      CreateGoalTrackResponse.constructFromObject(data, obj);
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * Datetime the goal track record was last updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;

  // Implement CreateGoalTrackResponse interface:
  /**
   * The ID of a goal to which the goal track record pertains
   * @member {String} goal_id
   */
exports.prototype['goal_id'] = undefined;

  /**
   * The ID of a client to whom the goal for the goal track record belongs
   * @member {String} client_id
   */
exports.prototype['client_id'] = undefined;

  /**
   * Target amount for the goal
   * @member {Number} goal_amount
   */
exports.prototype['goal_amount'] = undefined;

  /**
   * The time horizon of the goal during the accumulation phase, in years
   * @member {Number} accumulation_horizon
   */
exports.prototype['accumulation_horizon'] = undefined;

  /**
   * The time horizon of the goal during the decumulation phase, in years
   * @member {Number} decumulation_horizon
   */
exports.prototype['decumulation_horizon'] = undefined;

  /**
   * List of accounts linked to the goal
   * @member {Array.<String>} accounts
   */
exports.prototype['accounts'] = undefined;

  /**
   * The current amount invested toward the goal
   * @member {Number} current_investment
   */
exports.prototype['current_investment'] = undefined;

  /**
   * Indicator for whether or not the goal is on track to be met. true indicates it is on track (no default)
   * @member {Boolean} on_track
   */
exports.prototype['on_track'] = undefined;

  /**
   * The goal progress percentage as a decimal
   * @member {Number} progress
   */
exports.prototype['progress'] = undefined;

  /**
   * The probability of achieving the goal with the client’s given investments
   * @member {Number} goal_probability
   */
exports.prototype['goal_probability'] = undefined;

  /**
   * Probability of achieving the goal in relation to the confidence target of a simulation
   * @member {Number} goal_achievement_score
   */
exports.prototype['goal_achievement_score'] = undefined;

  /**
   * The projected balance of the goal
   * @member {Number} projection_balance
   */
exports.prototype['projection_balance'] = undefined;

  /**
   * The date of the projected balance of the goal
   * @member {Date} projection_date
   */
exports.prototype['projection_date'] = undefined;

  /**
   * Date and time to which this goal track record applies, defaults to the current timestamp
   * @member {String} status_time_stamp
   */
exports.prototype['status_time_stamp'] = undefined;

  /**
   * Custom information associated with the goal track record in the format key:value
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;

  /**
   * ID of the goal track record
   * @member {String} id
   */
exports.prototype['id'] = undefined;

  /**
   * Datetime the goal track record was created
   * @member {String} create_date
   */
exports.prototype['create_date'] = undefined;



  return exports;
}));


