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
    define(['ApiClient', 'model/GoalConfig', 'model/GoalDepositConfig', 'model/GoalRecommendationConfigStatus'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./GoalConfig'), require('./GoalDepositConfig'), require('./GoalRecommendationConfigStatus'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.GoalAccumulationStatus = factory(root.atom_api.ApiClient, root.atom_api.GoalConfig, root.atom_api.GoalDepositConfig, root.atom_api.GoalRecommendationConfigStatus);
  }
}(this, function(ApiClient, GoalConfig, GoalDepositConfig, GoalRecommendationConfigStatus) {
  'use strict';




  /**
   * The GoalAccumulationStatus model module.
   * @module model/GoalAccumulationStatus
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>GoalAccumulationStatus</code>.
   * @alias module:model/GoalAccumulationStatus
   * @class
   * @param pRet {Array.<Number>} The annualized portfolio return
   * @param pRisk {Array.<Number>} The annualized portfolio standard deviation
   * @param currInv {Number} The current amount invested
   * @param horizon {Number} The accumulation goal horizon
   * @param horizonFrequency {module:model/GoalAccumulationStatus.HorizonFrequencyEnum} Frequency in relation to the horizon
   * @param goalConfig {module:model/GoalConfig} 
   */
  var exports = function(pRet, pRisk, currInv, horizon, horizonFrequency, goalConfig) {
    var _this = this;

    _this['p_ret'] = pRet;
    _this['p_risk'] = pRisk;
    _this['curr_inv'] = currInv;
    _this['horizon'] = horizon;
    _this['horizon_frequency'] = horizonFrequency;
    _this['goal_config'] = goalConfig;












  };

  /**
   * Constructs a <code>GoalAccumulationStatus</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/GoalAccumulationStatus} obj Optional instance to populate.
   * @return {module:model/GoalAccumulationStatus} The populated <code>GoalAccumulationStatus</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('p_ret')) {
        obj['p_ret'] = ApiClient.convertToType(data['p_ret'], ['Number']);
      }
      if (data.hasOwnProperty('p_risk')) {
        obj['p_risk'] = ApiClient.convertToType(data['p_risk'], ['Number']);
      }
      if (data.hasOwnProperty('curr_inv')) {
        obj['curr_inv'] = ApiClient.convertToType(data['curr_inv'], 'Number');
      }
      if (data.hasOwnProperty('horizon')) {
        obj['horizon'] = ApiClient.convertToType(data['horizon'], 'Number');
      }
      if (data.hasOwnProperty('horizon_frequency')) {
        obj['horizon_frequency'] = ApiClient.convertToType(data['horizon_frequency'], 'String');
      }
      if (data.hasOwnProperty('goal_config')) {
        obj['goal_config'] = GoalConfig.constructFromObject(data['goal_config']);
      }
      if (data.hasOwnProperty('deposit_config')) {
        obj['deposit_config'] = ApiClient.convertToType(data['deposit_config'], [GoalDepositConfig]);
      }
      if (data.hasOwnProperty('recommendation_config')) {
        obj['recommendation_config'] = GoalRecommendationConfigStatus.constructFromObject(data['recommendation_config']);
      }
      if (data.hasOwnProperty('recommend_type')) {
        obj['recommend_type'] = ApiClient.convertToType(data['recommend_type'], 'String');
      }
      if (data.hasOwnProperty('conf_tgt')) {
        obj['conf_tgt'] = ApiClient.convertToType(data['conf_tgt'], 'Number');
      }
      if (data.hasOwnProperty('n')) {
        obj['n'] = ApiClient.convertToType(data['n'], 'Number');
      }
      if (data.hasOwnProperty('remove_outliers')) {
        obj['remove_outliers'] = ApiClient.convertToType(data['remove_outliers'], 'Boolean');
      }
      if (data.hasOwnProperty('thresh_type')) {
        obj['thresh_type'] = ApiClient.convertToType(data['thresh_type'], 'String');
      }
      if (data.hasOwnProperty('thresh')) {
        obj['thresh'] = ApiClient.convertToType(data['thresh'], 'Number');
      }
      if (data.hasOwnProperty('withdrawal_tax')) {
        obj['withdrawal_tax'] = ApiClient.convertToType(data['withdrawal_tax'], 'Number');
      }
      if (data.hasOwnProperty('trading_days_per_year')) {
        obj['trading_days_per_year'] = ApiClient.convertToType(data['trading_days_per_year'], 'Number');
      }
      if (data.hasOwnProperty('adjust_for_compounding')) {
        obj['adjust_for_compounding'] = ApiClient.convertToType(data['adjust_for_compounding'], 'Boolean');
      }
      if (data.hasOwnProperty('compounding_rate')) {
        obj['compounding_rate'] = ApiClient.convertToType(data['compounding_rate'], 'Number');
      }
    }
    return obj;
  }

  /**
   * The annualized portfolio return
   * @member {Array.<Number>} p_ret
   */
  exports.prototype['p_ret'] = undefined;
  /**
   * The annualized portfolio standard deviation
   * @member {Array.<Number>} p_risk
   */
  exports.prototype['p_risk'] = undefined;
  /**
   * The current amount invested
   * @member {Number} curr_inv
   */
  exports.prototype['curr_inv'] = undefined;
  /**
   * The accumulation goal horizon
   * @member {Number} horizon
   */
  exports.prototype['horizon'] = undefined;
  /**
   * Frequency in relation to the horizon
   * @member {module:model/GoalAccumulationStatus.HorizonFrequencyEnum} horizon_frequency
   */
  exports.prototype['horizon_frequency'] = undefined;
  /**
   * @member {module:model/GoalConfig} goal_config
   */
  exports.prototype['goal_config'] = undefined;
  /**
   * The deposit attributes
   * @member {Array.<module:model/GoalDepositConfig>} deposit_config
   */
  exports.prototype['deposit_config'] = undefined;
  /**
   * @member {module:model/GoalRecommendationConfigStatus} recommendation_config
   */
  exports.prototype['recommendation_config'] = undefined;
  /**
   * The type of recommended action
   * @member {module:model/GoalAccumulationStatus.RecommendTypeEnum} recommend_type
   * @default 'horizon'
   */
  exports.prototype['recommend_type'] = 'horizon';
  /**
   * The confidence target
   * @member {Number} conf_tgt
   */
  exports.prototype['conf_tgt'] = undefined;
  /**
   * The number of Monte Carlo simulations to run
   * @member {Number} n
   */
  exports.prototype['n'] = undefined;
  /**
   * If TRUE, remove outlying results
   * @member {Boolean} remove_outliers
   * @default true
   */
  exports.prototype['remove_outliers'] = true;
  /**
   * The goal deviation threshold type
   * @member {module:model/GoalAccumulationStatus.ThreshTypeEnum} thresh_type
   * @default 'perc'
   */
  exports.prototype['thresh_type'] = 'perc';
  /**
   * The goal deviation threshold value
   * @member {Number} thresh
   */
  exports.prototype['thresh'] = undefined;
  /**
   * The tax rate for withdrawals
   * @member {Number} withdrawal_tax
   */
  exports.prototype['withdrawal_tax'] = undefined;
  /**
   * Days per year a portfolio trades
   * @member {Number} trading_days_per_year
   */
  exports.prototype['trading_days_per_year'] = undefined;
  /**
   * If true, adjust periodic deposit amounts for compounding based on compounding_rate. This applies when a deposit’s dep_frequency is shorter than horizon_frequency. Defaults to false.
   * @member {Boolean} adjust_for_compounding
   * @default false
   */
  exports.prototype['adjust_for_compounding'] = false;
  /**
   * The annualized rate to use when approximating a compounding effect on deposits. This value must be defined and adjust_for_compounding must be true in order to activate compounding adjustment. Defaults to 0.
   * @member {Number} compounding_rate
   */
  exports.prototype['compounding_rate'] = undefined;


  /**
   * Allowed values for the <code>horizon_frequency</code> property.
   * @enum {String}
   * @readonly
   */
  exports.HorizonFrequencyEnum = {
    /**
     * value: "year"
     * @const
     */
    "year": "year",
    /**
     * value: "six_months"
     * @const
     */
    "six_months": "six_months",
    /**
     * value: "quarter"
     * @const
     */
    "quarter": "quarter",
    /**
     * value: "month"
     * @const
     */
    "month": "month",
    /**
     * value: "two_weeks"
     * @const
     */
    "two_weeks": "two_weeks",
    /**
     * value: "week"
     * @const
     */
    "week": "week",
    /**
     * value: "day"
     * @const
     */
    "day": "day"  };

  /**
   * Allowed values for the <code>recommend_type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.RecommendTypeEnum = {
    /**
     * value: "recurring"
     * @const
     */
    "recurring": "recurring",
    /**
     * value: "one-time"
     * @const
     */
    "one-time": "one-time",
    /**
     * value: "combo"
     * @const
     */
    "combo": "combo",
    /**
     * value: "horizon"
     * @const
     */
    "horizon": "horizon"  };

  /**
   * Allowed values for the <code>thresh_type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ThreshTypeEnum = {
    /**
     * value: "amnt"
     * @const
     */
    "amnt": "amnt",
    /**
     * value: "perc"
     * @const
     */
    "perc": "perc"  };


  return exports;
}));


