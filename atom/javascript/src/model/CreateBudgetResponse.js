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
    define(['ApiClient', 'model/BudgetPayload', 'model/BudgetPayloadBudget', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./BudgetPayload'), require('./BudgetPayloadBudget'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.CreateBudgetResponse = factory(root.atom_api.ApiClient, root.atom_api.BudgetPayload, root.atom_api.BudgetPayloadBudget, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, BudgetPayload, BudgetPayloadBudget, SecondaryId) {
  'use strict';




  /**
   * The CreateBudgetResponse model module.
   * @module model/CreateBudgetResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>CreateBudgetResponse</code>.
   * @alias module:model/CreateBudgetResponse
   * @class
   * @implements module:model/BudgetPayload
   * @param name {String} Name of the budget
   * @param clientId {String} The ID of the client the budget belongs to
   * @param currencyCode {String} Alphabetic currency code for the base currency of the budget, limited to 3 characters.
   * @param budget {Array.<module:model/BudgetPayloadBudget>} 
   * @param frequencyUnit {module:model/BudgetPayload.FrequencyUnitEnum} Frequency of the budget. Value may be daily, weekly, bi-weekly, monthly, semi-monthly, quarterly, or annually
   */
  var exports = function(name, clientId, currencyCode, budget, frequencyUnit) {
    var _this = this;

    BudgetPayload.call(_this, name, clientId, currencyCode, budget, frequencyUnit);


  };

  /**
   * Constructs a <code>CreateBudgetResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateBudgetResponse} obj Optional instance to populate.
   * @return {module:model/CreateBudgetResponse} The populated <code>CreateBudgetResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      BudgetPayload.constructFromObject(data, obj);
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * ID of the budget
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Datetime the budget was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;

  // Implement BudgetPayload interface:
  /**
   * Name of the budget
   * @member {String} name
   */
exports.prototype['name'] = undefined;

  /**
   * The ID of the client the budget belongs to
   * @member {String} client_id
   */
exports.prototype['client_id'] = undefined;

  /**
   * Alphabetic currency code for the base currency of the budget, limited to 3 characters.
   * @member {String} currency_code
   */
exports.prototype['currency_code'] = undefined;

  /**
   * @member {Array.<module:model/BudgetPayloadBudget>} budget
   */
exports.prototype['budget'] = undefined;

  /**
   * Frequency of the budget. Value may be daily, weekly, bi-weekly, monthly, semi-monthly, quarterly, or annually
   * @member {module:model/BudgetPayload.FrequencyUnitEnum} frequency_unit
   */
exports.prototype['frequency_unit'] = undefined;

  /**
   * Number of frequency_unit between each budget. For example, if the frequency_unit is weekly and the frequency is 2, this means the budget occurs every two weeks. Default is 1
   * @member {Number} frequency
   */
exports.prototype['frequency'] = undefined;

  /**
   * The ID of the account the budget belongs to
   * @member {String} account_id
   */
exports.prototype['account_id'] = undefined;

  /**
   * The ID of a goal mapped to the budget
   * @member {String} goal_id
   */
exports.prototype['goal_id'] = undefined;

  /**
   * The start date for the budget
   * @member {Date} start_date
   */
exports.prototype['start_date'] = undefined;

  /**
   * The end date for the budget
   * @member {Date} end date
   */
exports.prototype['end date'] = undefined;

  /**
   * Custom information associated with the budget in the format key:value
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;



  return exports;
}));

