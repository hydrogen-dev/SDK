/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.LifeInsuranceNeedsBreakdown = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The LifeInsuranceNeedsBreakdown model module.
   * @module model/LifeInsuranceNeedsBreakdown
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>LifeInsuranceNeedsBreakdown</code>.
   * @alias module:model/LifeInsuranceNeedsBreakdown
   * @class
   * @param mortgage {Number} Insurance required to cover existing mortgage balance, paid immediately.
   * @param other {Number} Insurance required to cover other debt.
   * @param education {Number} Insurance required to cover future education expenses.
   * @param incomeReplacement {Number} Insurance required to cover loss of income.
   * @param beneficiaryBequest {Number} Insurance required to cover amount being bequested.
   * @param endOfLife {Number} Insurance required to cover end of life expenses.
   */
  var exports = function(mortgage, other, education, incomeReplacement, beneficiaryBequest, endOfLife) {
    var _this = this;

    _this['mortgage'] = mortgage;
    _this['other'] = other;
    _this['education'] = education;
    _this['income_replacement'] = incomeReplacement;
    _this['beneficiary_bequest'] = beneficiaryBequest;
    _this['end_of_life'] = endOfLife;
  };

  /**
   * Constructs a <code>LifeInsuranceNeedsBreakdown</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LifeInsuranceNeedsBreakdown} obj Optional instance to populate.
   * @return {module:model/LifeInsuranceNeedsBreakdown} The populated <code>LifeInsuranceNeedsBreakdown</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('mortgage')) {
        obj['mortgage'] = ApiClient.convertToType(data['mortgage'], 'Number');
      }
      if (data.hasOwnProperty('other')) {
        obj['other'] = ApiClient.convertToType(data['other'], 'Number');
      }
      if (data.hasOwnProperty('education')) {
        obj['education'] = ApiClient.convertToType(data['education'], 'Number');
      }
      if (data.hasOwnProperty('income_replacement')) {
        obj['income_replacement'] = ApiClient.convertToType(data['income_replacement'], 'Number');
      }
      if (data.hasOwnProperty('beneficiary_bequest')) {
        obj['beneficiary_bequest'] = ApiClient.convertToType(data['beneficiary_bequest'], 'Number');
      }
      if (data.hasOwnProperty('end_of_life')) {
        obj['end_of_life'] = ApiClient.convertToType(data['end_of_life'], 'Number');
      }
    }
    return obj;
  }

  /**
   * Insurance required to cover existing mortgage balance, paid immediately.
   * @member {Number} mortgage
   */
  exports.prototype['mortgage'] = undefined;
  /**
   * Insurance required to cover other debt.
   * @member {Number} other
   */
  exports.prototype['other'] = undefined;
  /**
   * Insurance required to cover future education expenses.
   * @member {Number} education
   */
  exports.prototype['education'] = undefined;
  /**
   * Insurance required to cover loss of income.
   * @member {Number} income_replacement
   */
  exports.prototype['income_replacement'] = undefined;
  /**
   * Insurance required to cover amount being bequested.
   * @member {Number} beneficiary_bequest
   */
  exports.prototype['beneficiary_bequest'] = undefined;
  /**
   * Insurance required to cover end of life expenses.
   * @member {Number} end_of_life
   */
  exports.prototype['end_of_life'] = undefined;



  return exports;
}));

