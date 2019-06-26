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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.VariableAnnuityReturnDetail = factory(root.atom_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The VariableAnnuityReturnDetail model module.
   * @module model/VariableAnnuityReturnDetail
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>VariableAnnuityReturnDetail</code>.
   * @alias module:model/VariableAnnuityReturnDetail
   * @class
   * @param periodEarnings {Number} The investment earnings for this period. Earnings are calculated at the beginning of each period, before contributions are made.
   * @param periodContribution {Number} The deposit made for this period.
   * @param periodWithdrawal {Number} The withdrawal made for this period.
   * @param periodTaxes {Number} The tax amount for this period.
   * @param cumulativeEarnings {Number} The cumulative investment earnings made up to and including this period.
   * @param cumulativeContributions {Number} The cumulative deposits made up to and including this period.
   * @param cumulativeWithdrawals {Number} The cumulative withdrawals made up to and including this period.
   * @param cumulativeTaxes {Number} The cumulative taxes up to and including this period.
   * @param endingBalance {Number} The ending balance, inclusive of earnings and contributions for the current period.
   */
  var exports = function(periodEarnings, periodContribution, periodWithdrawal, periodTaxes, cumulativeEarnings, cumulativeContributions, cumulativeWithdrawals, cumulativeTaxes, endingBalance) {
    var _this = this;

    _this['period_earnings'] = periodEarnings;
    _this['period_contribution'] = periodContribution;
    _this['period_withdrawal'] = periodWithdrawal;
    _this['period_taxes'] = periodTaxes;
    _this['cumulative_earnings'] = cumulativeEarnings;
    _this['cumulative_contributions'] = cumulativeContributions;
    _this['cumulative_withdrawals'] = cumulativeWithdrawals;
    _this['cumulative_taxes'] = cumulativeTaxes;
    _this['ending_balance'] = endingBalance;
  };

  /**
   * Constructs a <code>VariableAnnuityReturnDetail</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/VariableAnnuityReturnDetail} obj Optional instance to populate.
   * @return {module:model/VariableAnnuityReturnDetail} The populated <code>VariableAnnuityReturnDetail</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('period_earnings')) {
        obj['period_earnings'] = ApiClient.convertToType(data['period_earnings'], 'Number');
      }
      if (data.hasOwnProperty('period_contribution')) {
        obj['period_contribution'] = ApiClient.convertToType(data['period_contribution'], 'Number');
      }
      if (data.hasOwnProperty('period_withdrawal')) {
        obj['period_withdrawal'] = ApiClient.convertToType(data['period_withdrawal'], 'Number');
      }
      if (data.hasOwnProperty('period_taxes')) {
        obj['period_taxes'] = ApiClient.convertToType(data['period_taxes'], 'Number');
      }
      if (data.hasOwnProperty('cumulative_earnings')) {
        obj['cumulative_earnings'] = ApiClient.convertToType(data['cumulative_earnings'], 'Number');
      }
      if (data.hasOwnProperty('cumulative_contributions')) {
        obj['cumulative_contributions'] = ApiClient.convertToType(data['cumulative_contributions'], 'Number');
      }
      if (data.hasOwnProperty('cumulative_withdrawals')) {
        obj['cumulative_withdrawals'] = ApiClient.convertToType(data['cumulative_withdrawals'], 'Number');
      }
      if (data.hasOwnProperty('cumulative_taxes')) {
        obj['cumulative_taxes'] = ApiClient.convertToType(data['cumulative_taxes'], 'Number');
      }
      if (data.hasOwnProperty('ending_balance')) {
        obj['ending_balance'] = ApiClient.convertToType(data['ending_balance'], 'Number');
      }
    }
    return obj;
  }

  /**
   * The investment earnings for this period. Earnings are calculated at the beginning of each period, before contributions are made.
   * @member {Number} period_earnings
   */
  exports.prototype['period_earnings'] = undefined;
  /**
   * The deposit made for this period.
   * @member {Number} period_contribution
   */
  exports.prototype['period_contribution'] = undefined;
  /**
   * The withdrawal made for this period.
   * @member {Number} period_withdrawal
   */
  exports.prototype['period_withdrawal'] = undefined;
  /**
   * The tax amount for this period.
   * @member {Number} period_taxes
   */
  exports.prototype['period_taxes'] = undefined;
  /**
   * The cumulative investment earnings made up to and including this period.
   * @member {Number} cumulative_earnings
   */
  exports.prototype['cumulative_earnings'] = undefined;
  /**
   * The cumulative deposits made up to and including this period.
   * @member {Number} cumulative_contributions
   */
  exports.prototype['cumulative_contributions'] = undefined;
  /**
   * The cumulative withdrawals made up to and including this period.
   * @member {Number} cumulative_withdrawals
   */
  exports.prototype['cumulative_withdrawals'] = undefined;
  /**
   * The cumulative taxes up to and including this period.
   * @member {Number} cumulative_taxes
   */
  exports.prototype['cumulative_taxes'] = undefined;
  /**
   * The ending balance, inclusive of earnings and contributions for the current period.
   * @member {Number} ending_balance
   */
  exports.prototype['ending_balance'] = undefined;



  return exports;
}));

