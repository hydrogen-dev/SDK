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
    define(['ApiClient', 'model/CreateAggregationAccountResponse', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CreateAggregationAccountResponse'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SpecificAggregationAccountResponse = factory(root.atom_api.ApiClient, root.atom_api.CreateAggregationAccountResponse, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, CreateAggregationAccountResponse, SecondaryId) {
  'use strict';




  /**
   * The SpecificAggregationAccountResponse model module.
   * @module model/SpecificAggregationAccountResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SpecificAggregationAccountResponse</code>.
   * @alias module:model/SpecificAggregationAccountResponse
   * @class
   * @implements module:model/CreateAggregationAccountResponse
   * @param clientId {String} The ID of a client to which the aggregation account belongs
   * @param accountName {String} The name of the held-away account for this aggregation account record
   * @param institutionName {String} The name of the institution holding the held-away account for this aggregation account record
   */
  var exports = function(clientId, accountName, institutionName) {
    var _this = this;

    CreateAggregationAccountResponse.call(_this, clientId, accountName, institutionName);

  };

  /**
   * Constructs a <code>SpecificAggregationAccountResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecificAggregationAccountResponse} obj Optional instance to populate.
   * @return {module:model/SpecificAggregationAccountResponse} The populated <code>SpecificAggregationAccountResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      CreateAggregationAccountResponse.constructFromObject(data, obj);
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * Latest datetime the aggregatino account was updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;

  // Implement CreateAggregationAccountResponse interface:
  /**
   * The ID of a client to which the aggregation account belongs
   * @member {String} client_id
   */
exports.prototype['client_id'] = undefined;

  /**
   * The name of the held-away account for this aggregation account record
   * @member {String} account_name
   */
exports.prototype['account_name'] = undefined;

  /**
   * The name of the institution holding the held-away account for this aggregation account record
   * @member {String} institution_name
   */
exports.prototype['institution_name'] = undefined;

  /**
   * Category for the held-away account such as “Bank Account”
   * @member {String} category
   */
exports.prototype['category'] = undefined;

  /**
   * Subcategory for the held-away account such as “Checking Account”
   * @member {String} subcategory
   */
exports.prototype['subcategory'] = undefined;

  /**
   * The account number of the held-away account for this aggregation account record
   * @member {String} account_number
   */
exports.prototype['account_number'] = undefined;

  /**
   * The masked version of the account number of the held-away account for this aggregation account record
   * @member {String} mask
   */
exports.prototype['mask'] = undefined;

  /**
   * Alphabetic currency code for the base currency of the account linked, limited to 3 characters
   * @member {String} currency_code
   */
exports.prototype['currency_code'] = undefined;

  /**
   * Indicates if the aggregation account record is active. Defaults to true which indicates it is active
   * @member {Boolean} is_active
   * @default true
   */
exports.prototype['is_active'] = true;

  /**
   * Custom information associated with the aggregation account in the format key:value
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;

  /**
   * ID of the aggregation account
   * @member {String} id
   */
exports.prototype['id'] = undefined;

  /**
   * Datetime the aggregation account was created
   * @member {String} create_date
   */
exports.prototype['create_date'] = undefined;



  return exports;
}));


