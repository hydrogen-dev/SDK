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
 * Swagger Codegen version: 2.4.8-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/AnnuityHorizon', 'model/AnnuityReturnDetail'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AnnuityHorizon'), require('./AnnuityReturnDetail'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.AnnuityDecumulationResponse = factory(root.atom_api.ApiClient, root.atom_api.AnnuityHorizon, root.atom_api.AnnuityReturnDetail);
  }
}(this, function(ApiClient, AnnuityHorizon, AnnuityReturnDetail) {
  'use strict';




  /**
   * The AnnuityDecumulationResponse model module.
   * @module model/AnnuityDecumulationResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>AnnuityDecumulationResponse</code>.
   * @alias module:model/AnnuityDecumulationResponse
   * @class
   * @param decumulationHorizon {module:model/AnnuityHorizon} 
   * @param totalEarnings {Number} The total earnings generated over the horizon.
   * @param totalContributions {Number} The total contributinos added over the horizon.
   * @param cumulativeAnnuityAmount {Number} The total amount received from the annuity over the course of the plan.
   * @param totalTaxes {Number} The total taxes paid on annuity payments over decumulation_horizon.
   * @param returnDetails {Object.<String, module:model/AnnuityReturnDetail>} 
   */
  var exports = function(decumulationHorizon, totalEarnings, totalContributions, cumulativeAnnuityAmount, totalTaxes, returnDetails) {
    var _this = this;

    _this['decumulation_horizon'] = decumulationHorizon;
    _this['total_earnings'] = totalEarnings;
    _this['total_contributions'] = totalContributions;
    _this['cumulative_annuity_amount'] = cumulativeAnnuityAmount;
    _this['total_taxes'] = totalTaxes;
    _this['return_details'] = returnDetails;
  };

  /**
   * Constructs a <code>AnnuityDecumulationResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AnnuityDecumulationResponse} obj Optional instance to populate.
   * @return {module:model/AnnuityDecumulationResponse} The populated <code>AnnuityDecumulationResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('decumulation_horizon')) {
        obj['decumulation_horizon'] = AnnuityHorizon.constructFromObject(data['decumulation_horizon']);
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
   * @member {module:model/AnnuityHorizon} decumulation_horizon
   */
  exports.prototype['decumulation_horizon'] = undefined;
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


