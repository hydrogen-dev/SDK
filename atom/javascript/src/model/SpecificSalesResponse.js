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
    define(['ApiClient', 'model/CreateSalesResponse', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CreateSalesResponse'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SpecificSalesResponse = factory(root.atom_api.ApiClient, root.atom_api.CreateSalesResponse, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, CreateSalesResponse, SecondaryId) {
  'use strict';




  /**
   * The SpecificSalesResponse model module.
   * @module model/SpecificSalesResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SpecificSalesResponse</code>.
   * @alias module:model/SpecificSalesResponse
   * @class
   * @implements module:model/CreateSalesResponse
   * @param questions {String} Details on the questions received within the inquiry
   */
  var exports = function(questions) {
    var _this = this;

    CreateSalesResponse.call(_this, questions);

  };

  /**
   * Constructs a <code>SpecificSalesResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpecificSalesResponse} obj Optional instance to populate.
   * @return {module:model/SpecificSalesResponse} The populated <code>SpecificSalesResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      CreateSalesResponse.constructFromObject(data, obj);
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * Datetime the sales inquiry was last updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;

  // Implement CreateSalesResponse interface:
  /**
   * Details on the questions received within the inquiry
   * @member {String} questions
   */
exports.prototype['questions'] = undefined;

  /**
   * Short title for the subject of the inquiry
   * @member {String} subject
   */
exports.prototype['subject'] = undefined;

  /**
   * The ID of the internal user assigned to the sales inquiry
   * @member {String} assigned
   */
exports.prototype['assigned'] = undefined;

  /**
   * Date that the inquiry was opened
   * @member {Date} open_time
   */
exports.prototype['open_time'] = undefined;

  /**
   * Date that the inquiry was closed
   * @member {Date} close_time
   */
exports.prototype['close_time'] = undefined;

  /**
   * The ID for the internal user that closed the inquiry
   * @member {String} closed_by
   */
exports.prototype['closed_by'] = undefined;

  /**
   * Any comments associated with the sales inquiry for background
   * @member {String} comments
   */
exports.prototype['comments'] = undefined;

  /**
   * Indicates if the individual associated with the inquiry was contacted. Defaults to false which indicates that he/she was not contacted
   * @member {Boolean} contacted
   * @default false
   */
exports.prototype['contacted'] = false;

  /**
   * Contact email for the individual associated with the inquiry such as sample@example.com
   * @member {String} email
   */
exports.prototype['email'] = undefined;

  /**
   * Name of the firm associated with the inquiry
   * @member {String} firm_name
   */
exports.prototype['firm_name'] = undefined;

  /**
   * First name of the individual associated with the inquiry
   * @member {String} first_name
   */
exports.prototype['first_name'] = undefined;

  /**
   * Last name of the individual associated with the inquiry
   * @member {String} last_name
   */
exports.prototype['last_name'] = undefined;

  /**
   * IP address for the individual associated with the inquiry
   * @member {String} ip
   */
exports.prototype['ip'] = undefined;

  /**
   * Method with which the inquiry was received such as “email” or “phone”
   * @member {String} method
   */
exports.prototype['method'] = undefined;

  /**
   * Phone number for the individual associated with the inquiry
   * @member {String} phone
   */
exports.prototype['phone'] = undefined;

  /**
   * Title of the individual associated with the inquiry
   * @member {String} title
   */
exports.prototype['title'] = undefined;

  /**
   * Details on the resolution of the inquiry
   * @member {String} solution
   */
exports.prototype['solution'] = undefined;

  /**
   * Details on how the individual associated with the inquiry was referred
   * @member {String} referral_source
   */
exports.prototype['referral_source'] = undefined;

  /**
   * Indicates if a notification is issued for inquiry. Defaults to true which indicates that there is a notification
   * @member {Boolean} notification
   * @default true
   */
exports.prototype['notification'] = true;

  /**
   * Custom information associated with the sales inquiry in the format key:value. See Metadata
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;

  /**
   * The ID of the sales inquiry
   * @member {String} id
   */
exports.prototype['id'] = undefined;

  /**
   * Datetime the sales inquiry was created
   * @member {String} create_date
   */
exports.prototype['create_date'] = undefined;



  return exports;
}));


