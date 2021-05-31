/**
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Acquiree', 'model/Acquirer'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Acquiree'), require('./Acquirer'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.MergerAcquisition = factory(root.HydrogenIntegrationApi.ApiClient, root.HydrogenIntegrationApi.Acquiree, root.HydrogenIntegrationApi.Acquirer);
  }
}(this, function(ApiClient, Acquiree, Acquirer) {
  'use strict';




  /**
   * The MergerAcquisition model module.
   * @module model/MergerAcquisition
   * @version 1.3.0
   */

  /**
   * Constructs a new <code>MergerAcquisition</code>.
   * @alias module:model/MergerAcquisition
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>MergerAcquisition</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MergerAcquisition} obj Optional instance to populate.
   * @return {module:model/MergerAcquisition} The populated <code>MergerAcquisition</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('acquiree')) {
        obj['acquiree'] = Acquiree.constructFromObject(data['acquiree']);
      }
      if (data.hasOwnProperty('acquirer')) {
        obj['acquirer'] = Acquirer.constructFromObject(data['acquirer']);
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {module:model/Acquiree} acquiree
   */
  exports.prototype['acquiree'] = undefined;
  /**
   * @member {module:model/Acquirer} acquirer
   */
  exports.prototype['acquirer'] = undefined;
  /**
   * @member {String} type
   */
  exports.prototype['type'] = undefined;



  return exports;
}));


