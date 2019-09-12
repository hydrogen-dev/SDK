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
    define(['ApiClient', 'model/ClientResponsePayload', 'model/SecondaryId'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ClientResponsePayload'), require('./SecondaryId'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.CreateClientResponseResponse = factory(root.atom_api.ApiClient, root.atom_api.ClientResponsePayload, root.atom_api.SecondaryId);
  }
}(this, function(ApiClient, ClientResponsePayload, SecondaryId) {
  'use strict';




  /**
   * The CreateClientResponseResponse model module.
   * @module model/CreateClientResponseResponse
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>CreateClientResponseResponse</code>.
   * @alias module:model/CreateClientResponseResponse
   * @class
   * @implements module:model/ClientResponsePayload
   * @param answerId {String} The ID of the answer provided to link the response to a question
   * @param answerValue {String} Body of the client’s response
   */
  var exports = function(answerId, answerValue) {
    var _this = this;

    ClientResponsePayload.call(_this, answerId, answerValue);


  };

  /**
   * Constructs a <code>CreateClientResponseResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CreateClientResponseResponse} obj Optional instance to populate.
   * @return {module:model/CreateClientResponseResponse} The populated <code>CreateClientResponseResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      ClientResponsePayload.constructFromObject(data, obj);
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
   * ID of the client response
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Datetime the client response was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;

  // Implement ClientResponsePayload interface:
  /**
   * The ID of the answer provided to link the response to a question
   * @member {String} answer_id
   */
exports.prototype['answer_id'] = undefined;

  /**
   * Body of the client’s response
   * @member {String} answer_value
   */
exports.prototype['answer_value'] = undefined;

  /**
   * The ID of the client to whom the response belongs
   * @member {String} client_id
   */
exports.prototype['client_id'] = undefined;

  /**
   * In the case that the response applies to only one of a client’s accounts and not the client as a whole, the ID of the account to which the response belongs
   * @member {String} account_id
   */
exports.prototype['account_id'] = undefined;

  /**
   * @member {module:model/SecondaryId} secondary_id
   */
exports.prototype['secondary_id'] = undefined;

  /**
   * Custom information associated with the client response in the format key:value
   * @member {Object} metadata
   */
exports.prototype['metadata'] = undefined;



  return exports;
}));


