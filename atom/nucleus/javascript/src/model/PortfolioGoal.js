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
    define(['ApiClient', 'model/PortfolioGoalMap'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PortfolioGoalMap'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.PortfolioGoal = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.PortfolioGoalMap);
  }
}(this, function(ApiClient, PortfolioGoalMap) {
  'use strict';




  /**
   * The PortfolioGoal model module.
   * @module model/PortfolioGoal
   * @version 1.9.5
   */

  /**
   * Constructs a new <code>PortfolioGoal</code>.
   * PortfolioGoal Object
   * @alias module:model/PortfolioGoal
   * @class
   * @param _date {Date} date
   * @param goals {Array.<module:model/PortfolioGoalMap>} 
   * @param portfolioId {String} portfolioId
   */
  var exports = function(_date, goals, portfolioId) {
    var _this = this;


    _this['date'] = _date;
    _this['goals'] = goals;

    _this['portfolio_id'] = portfolioId;


  };

  /**
   * Constructs a <code>PortfolioGoal</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioGoal} obj Optional instance to populate.
   * @return {module:model/PortfolioGoal} The populated <code>PortfolioGoal</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('goals')) {
        obj['goals'] = ApiClient.convertToType(data['goals'], [PortfolioGoalMap]);
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('portfolio_id')) {
        obj['portfolio_id'] = ApiClient.convertToType(data['portfolio_id'], 'String');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
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
   * date
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * @member {Array.<module:model/PortfolioGoalMap>} goals
   */
  exports.prototype['goals'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * portfolioId
   * @member {String} portfolio_id
   */
  exports.prototype['portfolio_id'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


