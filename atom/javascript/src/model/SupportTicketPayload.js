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
    define(['ApiClient', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SupportTicketPayload = factory(root.atom_api.ApiClient, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, SecondaryId) {
  'use strict';




  /**
   * The SupportTicketPayload model module.
   * @module model/SupportTicketPayload
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SupportTicketPayload</code>.
   * @alias module:model/SupportTicketPayload
   * @class
   * @param description {String} Details and description of the support ticket issue
   * @param clientId {String} The ID for the client associated with the support ticket
   * @param accountId {String} The ID for the account associated with the support ticket
   * @param openTime {Date} Date that the support ticket was opened
   */
  var exports = function(description, clientId, accountId, openTime) {
    var _this = this;

    _this['description'] = description;
    _this['client_id'] = clientId;
    _this['account_id'] = accountId;
    _this['open_time'] = openTime;






  };

  /**
   * Constructs a <code>SupportTicketPayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SupportTicketPayload} obj Optional instance to populate.
   * @return {module:model/SupportTicketPayload} The populated <code>SupportTicketPayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('open_time')) {
        obj['open_time'] = ApiClient.convertToType(data['open_time'], 'Date');
      }
      if (data.hasOwnProperty('close_time')) {
        obj['close_time'] = ApiClient.convertToType(data['close_time'], 'Date');
      }
      if (data.hasOwnProperty('assigned_to')) {
        obj['assigned_to'] = ApiClient.convertToType(data['assigned_to'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('subject')) {
        obj['subject'] = ApiClient.convertToType(data['subject'], 'String');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = SecondaryId.constructFromObject(data['secondary_id']);
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
      }
    }
    return obj;
  }

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


