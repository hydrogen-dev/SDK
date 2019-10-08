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
    define(['ApiClient', 'model/CreateFinancialOfferResponse', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CreateFinancialOfferResponse'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SpecificFinancialOfferResponse = factory(root.atom_api.ApiClient, root.atom_api.CreateFinancialOfferResponse, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, CreateFinancialOfferResponse, SecondaryId) {
  'use strict';




  /**
   * The SpecificFinancialOfferResponse model module.
   * @module model/SpecificFinancialOfferResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SpecificFinancialOfferResponse</code>.
   * @alias module:model/SpecificFinancialOfferResponse
   * @class
   * @implements module:model/CreateFinancialOfferResponse
   * @param name {String} Name of the financial offer
   * @param institutionName {String} Name of the financial institution
   * @param offerLink {String} Link to the associated financial offer
   */
  var exports = function(name, institutionName, offerLink) {
    var _this = this;

    CreateFinancialOfferResponse.call(_this, name, institutionName, offerLink);

  };

  /**
   * Constructs a <code>SpecificFinancialOfferResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecificFinancialOfferResponse} obj Optional instance to populate.
   * @return {module:model/SpecificFinancialOfferResponse} The populated <code>SpecificFinancialOfferResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      CreateFinancialOfferResponse.constructFromObject(data, obj);
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * Datetime the financial offer was last updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;

  // Implement CreateFinancialOfferResponse interface:
  /**
   * Name of the financial offer
   * @member {String} name
   */
exports.prototype['name'] = undefined;

  /**
   * Name of the financial institution
   * @member {String} institution_name
   */
exports.prototype['institution_name'] = undefined;

  /**
   * Link to the associated financial offer
   * @member {String} offer_link
   */
exports.prototype['offer_link'] = undefined;

  /**
   * Category of the financial offer. Value may be credit_card, savings, mortgage, loan, investment, tax, real_estate, brokerage, and other.
   * @member {module:model/FinancialOfferPayload.CategoryEnum} category
   */
exports.prototype['category'] = undefined;

  /**
   * Subcategory of the financial offer
   * @member {String} subcategory
   */
exports.prototype['subcategory'] = undefined;

  /**
   * Description of the financial offer
   * @member {String} description
   */
exports.prototype['description'] = undefined;

  /**
   * An image associated with the financial offer
   * @member {String} image
   */
exports.prototype['image'] = undefined;

  /**
   * Alphabetic currency code for the base currency of the entity, limited to 3 characters.
   * @member {String} currency_code
   */
exports.prototype['currency_code'] = undefined;

  /**
   * The financial rate associated with the financial offer
   * @member {Number} financial_rate
   */
exports.prototype['financial_rate'] = undefined;

  /**
   * The financial rate type associated with the financial offer (i.e. percentage/ dollar amount)
   * @member {String} financial_rate_type
   */
exports.prototype['financial_rate_type'] = undefined;

  /**
   * The fixed time period of the financial rate associated with the financial offer (i.e. 90)
   * @member {Number} financial_rate_term
   */
exports.prototype['financial_rate_term'] = undefined;

  /**
   * The term unit of the financial rate. Value may be year, quarter, month, week, day
   * @member {module:model/FinancialOfferPayload.FinancialRateTermUnitEnum} financial_rate_term_unit
   */
exports.prototype['financial_rate_term_unit'] = undefined;

  /**
   * Amount of the financial offer fee
   * @member {Number} fee_amount
   */
exports.prototype['fee_amount'] = undefined;

  /**
   * Type of financial offer fee
   * @member {String} fee_type
   */
exports.prototype['fee_type'] = undefined;

  /**
   * The fixed time period for which the offer is intended to last, once it is accepted
   * @member {Number} offer_term
   */
exports.prototype['offer_term'] = undefined;

  /**
   * The term unit of the offer term. Value may be year, quarter, month, week, day
   * @member {module:model/FinancialOfferPayload.OfferTermUnitEnum} offer_term_unit
   */
exports.prototype['offer_term_unit'] = undefined;

  /**
   * The minimum contribution amount in order to receive the financial_incentive associated with the financial offer
   * @member {Number} minimum_contribution
   */
exports.prototype['minimum_contribution'] = undefined;

  /**
   * The fixed time period in which the customer must contribute the minimum contribution, in order to receive the financial incentive associated with the financial offer (i.e. 90)
   * @member {Number} minimum_contribution_term
   */
exports.prototype['minimum_contribution_term'] = undefined;

  /**
   * The term unit of the minimum contribution. Value may be year, quarter, month, week, day
   * @member {module:model/FinancialOfferPayload.MinimumContributionTermUnitEnum} minimum_contribution_term_unit
   */
exports.prototype['minimum_contribution_term_unit'] = undefined;

  /**
   * Prerequisite associated with the financial offer
   * @member {String} prerequisite
   */
exports.prototype['prerequisite'] = undefined;

  /**
   * Prerequisite associated with the financial offer (i.e. credit score threshold, income threshold)
   * @member {String} prerequisite_type
   */
exports.prototype['prerequisite_type'] = undefined;

  /**
   * The payment value which will be received from the affiliate when the user purchases the offer
   * @member {Number} affiliate_rate
   */
exports.prototype['affiliate_rate'] = undefined;

  /**
   * Average of client reviews of the product
   * @member {String} client_review
   */
exports.prototype['client_review'] = undefined;

  /**
   * The rating of the product by the site displaying the offer
   * @member {String} rating
   */
exports.prototype['rating'] = undefined;

  /**
   * Unique ID of the document associated with the financial offer
   * @member {String} document_id
   */
exports.prototype['document_id'] = undefined;

  /**
   * Unique ID of the marketing campaign associated with the financial offer
   * @member {String} campaign_id
   */
exports.prototype['campaign_id'] = undefined;

  /**
   * Custom information associated with the budget in the format key:value
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;

  /**
   * ID of the financial offer
   * @member {String} id
   */
exports.prototype['id'] = undefined;

  /**
   * Datetime the financial offer was created
   * @member {String} create_date
   */
exports.prototype['create_date'] = undefined;



  return exports;
}));


