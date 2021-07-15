/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.19
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
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.DecumulationGoalDepositConfig = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The DecumulationGoalDepositConfig model module.
   * @module model/DecumulationGoalDepositConfig
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>DecumulationGoalDepositConfig</code>.
   * @alias module:model/DecumulationGoalDepositConfig
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>DecumulationGoalDepositConfig</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DecumulationGoalDepositConfig} obj Optional instance to populate.
   * @return {module:model/DecumulationGoalDepositConfig} The populated <code>DecumulationGoalDepositConfig</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('dep_end_period'))
        obj.depEndPeriod = ApiClient.convertToType(data['dep_end_period'], 'Number');
      if (data.hasOwnProperty('dep_amount'))
        obj.depAmount = ApiClient.convertToType(data['dep_amount'], 'Number');
      if (data.hasOwnProperty('dep_end_reference'))
        obj.depEndReference = ApiClient.convertToType(data['dep_end_reference'], 'String');
      if (data.hasOwnProperty('dep_start_period'))
        obj.depStartPeriod = ApiClient.convertToType(data['dep_start_period'], 'Number');
      if (data.hasOwnProperty('dep_frequency'))
        obj.depFrequency = ApiClient.convertToType(data['dep_frequency'], 'String');
      if (data.hasOwnProperty('dep_inflation'))
        obj.depInflation = ApiClient.convertToType(data['dep_inflation'], 'Number');
      if (data.hasOwnProperty('dep_start_reference'))
        obj.depStartReference = ApiClient.convertToType(data['dep_start_reference'], 'String');
    }
    return obj;
  }

  /**
   * @member {Number} depEndPeriod
   * @default 0
   */
  exports.prototype.depEndPeriod = 0;

  /**
   * @member {Number} depAmount
   */
  exports.prototype.depAmount = undefined;

  /**
   * @member {module:model/DecumulationGoalDepositConfig.DepEndReferenceEnum} depEndReference
   * @default 'a_end'
   */
  exports.prototype.depEndReference = 'a_end';

  /**
   * @member {Number} depStartPeriod
   * @default 0
   */
  exports.prototype.depStartPeriod = 0;

  /**
   * @member {module:model/DecumulationGoalDepositConfig.DepFrequencyEnum} depFrequency
   * @default 'year'
   */
  exports.prototype.depFrequency = 'year';

  /**
   * @member {Number} depInflation
   * @default 0.0
   */
  exports.prototype.depInflation = 0.0;

  /**
   * @member {module:model/DecumulationGoalDepositConfig.DepStartReferenceEnum} depStartReference
   * @default 'a_start'
   */
  exports.prototype.depStartReference = 'a_start';



  /**
   * Allowed values for the <code>depEndReference</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DepEndReferenceEnum = {
    /**
     * value: "a_start"
     * @const
     */
    aStart: "a_start",

    /**
     * value: "a_end"
     * @const
     */
    aEnd: "a_end",

    /**
     * value: "d_end"
     * @const
     */
    dEnd: "d_end"
  };


  /**
   * Allowed values for the <code>depFrequency</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DepFrequencyEnum = {
    /**
     * value: "year"
     * @const
     */
    year: "year",

    /**
     * value: "six_months"
     * @const
     */
    sixMonths: "six_months",

    /**
     * value: "quarter"
     * @const
     */
    quarter: "quarter",

    /**
     * value: "month"
     * @const
     */
    month: "month",

    /**
     * value: "two_weeks"
     * @const
     */
    twoWeeks: "two_weeks",

    /**
     * value: "week"
     * @const
     */
    week: "week",

    /**
     * value: "day"
     * @const
     */
    day: "day"
  };


  /**
   * Allowed values for the <code>depStartReference</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DepStartReferenceEnum = {
    /**
     * value: "a_start"
     * @const
     */
    aStart: "a_start",

    /**
     * value: "a_end"
     * @const
     */
    aEnd: "a_end",

    /**
     * value: "d_end"
     * @const
     */
    dEnd: "d_end"
  };

  return exports;

}));
