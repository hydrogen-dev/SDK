/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.19
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Settings'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Settings'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.BacktestRequest = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.Settings);
  }
}(this, function(ApiClient, Settings) {
  'use strict';

  /**
   * The BacktestRequest model module.
   * @module model/BacktestRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>BacktestRequest</code>.
   * @alias module:model/BacktestRequest
   * @class
   * @param endDate {Date} 
   * @param startDate {Date} 
   */
  var exports = function(endDate, startDate) {
    this.endDate = endDate;
    this.startDate = startDate;
  };

  /**
   * Constructs a <code>BacktestRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BacktestRequest} obj Optional instance to populate.
   * @return {module:model/BacktestRequest} The populated <code>BacktestRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('end_date'))
        obj.endDate = ApiClient.convertToType(data['end_date'], 'Date');
      if (data.hasOwnProperty('trades'))
        obj.trades = ApiClient.convertToType(data['trades'], 'Boolean');
      if (data.hasOwnProperty('model_id'))
        obj.modelId = ApiClient.convertToType(data['model_id'], 'String');
      if (data.hasOwnProperty('start_date'))
        obj.startDate = ApiClient.convertToType(data['start_date'], 'Date');
      if (data.hasOwnProperty('stats'))
        obj.stats = ApiClient.convertToType(data['stats'], 'Boolean');
      if (data.hasOwnProperty('initial_weights'))
        obj.initialWeights = ApiClient.convertToType(data['initial_weights'], Object);
      if (data.hasOwnProperty('settings'))
        obj.settings = Settings.constructFromObject(data['settings']);
      if (data.hasOwnProperty('asset_size'))
        obj.assetSize = ApiClient.convertToType(data['asset_size'], 'Number');
      if (data.hasOwnProperty('asset_sizes'))
        obj.assetSizes = ApiClient.convertToType(data['asset_sizes'], 'Boolean');
      if (data.hasOwnProperty('holdings'))
        obj.holdings = ApiClient.convertToType(data['holdings'], 'Boolean');
    }
    return obj;
  }

  /**
   * @member {Date} endDate
   */
  exports.prototype.endDate = undefined;

  /**
   * @member {Boolean} trades
   * @default true
   */
  exports.prototype.trades = true;

  /**
   * @member {String} modelId
   */
  exports.prototype.modelId = undefined;

  /**
   * @member {Date} startDate
   */
  exports.prototype.startDate = undefined;

  /**
   * @member {Boolean} stats
   * @default true
   */
  exports.prototype.stats = true;

  /**
   * @member {Object} initialWeights
   */
  exports.prototype.initialWeights = undefined;

  /**
   * @member {module:model/Settings} settings
   */
  exports.prototype.settings = undefined;

  /**
   * @member {Number} assetSize
   */
  exports.prototype.assetSize = undefined;

  /**
   * @member {Boolean} assetSizes
   * @default true
   */
  exports.prototype.assetSizes = true;

  /**
   * @member {Boolean} holdings
   * @default true
   */
  exports.prototype.holdings = true;


  return exports;

}));
