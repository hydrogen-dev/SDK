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
    define(['ApiClient', 'model/SecondaryId', 'model/SupportTicketPayload'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecondaryId'), require('./SupportTicketPayload'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.CreateSupportTicketResponse = factory(root.atom_api.ApiClient, root.atom_api.SecondaryId, root.atom_api.SupportTicketPayload);
  }
}(this, function(ApiClient, SecondaryId, SupportTicketPayload) {
  'use strict';




  /**
   * The CreateSupportTicketResponse model module.
   * @module model/CreateSupportTicketResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>CreateSupportTicketResponse</code>.
   * @alias module:model/CreateSupportTicketResponse
   * @class
   * @implements module:model/SupportTicketPayload
   * @param description {String} Details and description of the support ticket issue
   * @param clientId {String} The ID for the client associated with the support ticket
   * @param accountId {String} The ID for the account associated with the support ticket
   * @param openTime {Date} Date that the support ticket was opened
   */
  var exports = function(description, clientId, accountId, openTime) {
    var _this = this;

    SupportTicketPayload.call(_this, description, clientId, accountId, openTime);


  };

  /**
   * Constructs a <code>CreateSupportTicketResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateSupportTicketResponse} obj Optional instance to populate.
   * @return {module:model/CreateSupportTicketResponse} The populated <code>CreateSupportTicketResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      SupportTicketPayload.constructFromObject(data, obj);
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
   * The ID of the support ticket
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Datetime the support ticket was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;

  // Implement SupportTicketPayload interface:
  /**
   * Details and description of the support ticket issue
   * @member {String} description
   */
exports.prototype['description'] = undefined;

  /**
   * The ID for the client associated with the support ticket
   * @member {String} client_id
   */
exports.prototype['client_id'] = undefined;

  /**
   * The ID for the account associated with the support ticket
   * @member {String} account_id
   */
exports.prototype['account_id'] = undefined;

  /**
   * Date that the support ticket was opened
   * @member {Date} open_time
   */
exports.prototype['open_time'] = undefined;

  /**
   * Date that the support ticket was resolved and closed
   * @member {Date} close_time
   */
exports.prototype['close_time'] = undefined;

  /**
   * The ID of the internal user to whom the support ticket is assigned to be resolved
   * @member {String} assigned_to
   */
exports.prototype['assigned_to'] = undefined;

  /**
   * Status of the support ticket such as closed
   * @member {String} status
   */
exports.prototype['status'] = undefined;

  /**
   * Title of the support ticket relating to the underlying issue
   * @member {String} subject
   */
exports.prototype['subject'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;

  /**
   * Custom information associated with the support ticket in the format key:value
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;



  return exports;
}));


