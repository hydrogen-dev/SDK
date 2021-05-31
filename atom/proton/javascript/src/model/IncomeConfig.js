/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
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
    root.HydrogenProtonApi.IncomeConfig = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The IncomeConfig model module.
   * @module model/IncomeConfig
   * @version 1.9.0
   */

  /**
   * Constructs a new <code>IncomeConfig</code>.
   * @alias module:model/IncomeConfig
   * @class
   * @param annualNetTakeHomePay {Number} 
   */
  var exports = function(annualNetTakeHomePay) {
    this.annualNetTakeHomePay = annualNetTakeHomePay;
  };

  /**
   * Constructs a <code>IncomeConfig</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/IncomeConfig} obj Optional instance to populate.
   * @return {module:model/IncomeConfig} The populated <code>IncomeConfig</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('annual_net_take_home_pay'))
        obj.annualNetTakeHomePay = ApiClient.convertToType(data['annual_net_take_home_pay'], 'Number');
      if (data.hasOwnProperty('income_benefit_duration'))
        obj.incomeBenefitDuration = ApiClient.convertToType(data['income_benefit_duration'], 'Number');
      if (data.hasOwnProperty('percentage_of_income_covered'))
        obj.percentageOfIncomeCovered = ApiClient.convertToType(data['percentage_of_income_covered'], 'Number');
    }
    return obj;
  }

  /**
   * @member {Number} annualNetTakeHomePay
   */
  exports.prototype.annualNetTakeHomePay = undefined;

  /**
   * @member {Number} incomeBenefitDuration
   * @default 10
   */
  exports.prototype.incomeBenefitDuration = 10;

  /**
   * @member {Number} percentageOfIncomeCovered
   * @default 1.0
   */
  exports.prototype.percentageOfIncomeCovered = 1.0;


  return exports;

}));
