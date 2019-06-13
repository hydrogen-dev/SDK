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
    define(['ApiClient', 'model/AnnuityReturnDetail'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AnnuityReturnDetail'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.AnnuityDepositamountResponse = factory(root.atom_api.ApiClient, root.atom_api.AnnuityReturnDetail);
  }
}(this, function(ApiClient, AnnuityReturnDetail) {
  'use strict';




  /**
   * The AnnuityDepositamountResponse model module.
   * @module model/AnnuityDepositamountResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>AnnuityDepositamountResponse</code>.
   * @alias module:model/AnnuityDepositamountResponse
   * @class
   * @param depositAmount {Number} The amount to be deposited per period.
   * @param depositFrequencyInterval {String} The period interval to be used in relation to the deposit_amount. Defaults to year.
   * @param totalEarnings {Number} The total earnings generated over the horizon.
   * @param totalContributions {Number} The total contributinos added over the horizon.
   * @param cumulativeAnnuityAmount {Number} The total amount received from the annuity over the course of the plan.
   * @param totalTaxes {Number} The total taxes paid on annuity payments over decumulation_horizon.
   * @param returnDetails {Object.<String, module:model/AnnuityReturnDetail>} 
   */
  var exports = function(depositAmount, depositFrequencyInterval, totalEarnings, totalContributions, cumulativeAnnuityAmount, totalTaxes, returnDetails) {
    var _this = this;

    _this['deposit_amount'] = depositAmount;
    _this['deposit_frequency_interval'] = depositFrequencyInterval;
    _this['total_earnings'] = totalEarnings;
    _this['total_contributions'] = totalContributions;
    _this['cumulative_annuity_amount'] = cumulativeAnnuityAmount;
    _this['total_taxes'] = totalTaxes;
    _this['return_details'] = returnDetails;
  };

  /**
   * Constructs a <code>AnnuityDepositamountResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AnnuityDepositamountResponse} obj Optional instance to populate.
   * @return {module:model/AnnuityDepositamountResponse} The populated <code>AnnuityDepositamountResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('deposit_amount')) {
        obj['deposit_amount'] = ApiClient.convertToType(data['deposit_amount'], 'Number');
      }
      if (data.hasOwnProperty('deposit_frequency_interval')) {
        obj['deposit_frequency_interval'] = ApiClient.convertToType(data['deposit_frequency_interval'], 'String');
      }
      if (data.hasOwnProperty('total_earnings')) {
        obj['total_earnings'] = ApiClient.convertToType(data['total_earnings'], 'Number');
      }
      if (data.hasOwnProperty('total_contributions')) {
        obj['total_contributions'] = ApiClient.convertToType(data['total_contributions'], 'Number');
      }
      if (data.hasOwnProperty('cumulative_annuity_amount')) {
        obj['cumulative_annuity_amount'] = ApiClient.convertToType(data['cumulative_annuity_amount'], 'Number');
      }
      if (data.hasOwnProperty('total_taxes')) {
        obj['total_taxes'] = ApiClient.convertToType(data['total_taxes'], 'Number');
      }
      if (data.hasOwnProperty('return_details')) {
        obj['return_details'] = ApiClient.convertToType(data['return_details'], {'String': AnnuityReturnDetail});
      }
    }
    return obj;
  }

  /**
   * The amount to be deposited per period.
   * @member {Number} deposit_amount
   */
  exports.prototype['deposit_amount'] = undefined;
  /**
   * The period interval to be used in relation to the deposit_amount. Defaults to year.
   * @member {String} deposit_frequency_interval
   */
  exports.prototype['deposit_frequency_interval'] = undefined;
  /**
   * The total earnings generated over the horizon.
   * @member {Number} total_earnings
   */
  exports.prototype['total_earnings'] = undefined;
  /**
   * The total contributinos added over the horizon.
   * @member {Number} total_contributions
   */
  exports.prototype['total_contributions'] = undefined;
  /**
   * The total amount received from the annuity over the course of the plan.
   * @member {Number} cumulative_annuity_amount
   */
  exports.prototype['cumulative_annuity_amount'] = undefined;
  /**
   * The total taxes paid on annuity payments over decumulation_horizon.
   * @member {Number} total_taxes
   */
  exports.prototype['total_taxes'] = undefined;
  /**
   * @member {Object.<String, module:model/AnnuityReturnDetail>} return_details
   */
  exports.prototype['return_details'] = undefined;



  return exports;
}));


