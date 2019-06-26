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
    define(['ApiClient', 'model/SensitivityFactor'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SensitivityFactor'));
  } else {
    // Browser globals (root is window)
    if (!root.atom_api) {
      root.atom_api = {};
    }
    root.atom_api.SensitivityAnalysis = factory(root.atom_api.ApiClient, root.atom_api.SensitivityFactor);
  }
}(this, function(ApiClient, SensitivityFactor) {
  'use strict';




  /**
   * The SensitivityAnalysis model module.
   * @module model/SensitivityAnalysis
   * @version 1.0.1
   */

  /**
   * Constructs a new <code>SensitivityAnalysis</code>.
   * @alias module:model/SensitivityAnalysis
   * @class
   * @param portfolioTickers {Array.<String>} A list of symbols for securities in the portfolio
   * @param portfolioWeights {Array.<Number>} 
   * @param frequencyInterval {module:model/SensitivityAnalysis.FrequencyIntervalEnum} Frequency interval for returns, change_duration, and lag
   * @param sensitivityFactor {module:model/SensitivityFactor} 
   */
  var exports = function(portfolioTickers, portfolioWeights, frequencyInterval, sensitivityFactor) {
    var _this = this;

    _this['portfolio_tickers'] = portfolioTickers;
    _this['portfolio_weights'] = portfolioWeights;
    _this['frequency_interval'] = frequencyInterval;
    _this['sensitivity_factor'] = sensitivityFactor;




  };

  /**
   * Constructs a <code>SensitivityAnalysis</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SensitivityAnalysis} obj Optional instance to populate.
   * @return {module:model/SensitivityAnalysis} The populated <code>SensitivityAnalysis</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolio_tickers')) {
        obj['portfolio_tickers'] = ApiClient.convertToType(data['portfolio_tickers'], ['String']);
      }
      if (data.hasOwnProperty('portfolio_weights')) {
        obj['portfolio_weights'] = ApiClient.convertToType(data['portfolio_weights'], ['Number']);
      }
      if (data.hasOwnProperty('frequency_interval')) {
        obj['frequency_interval'] = ApiClient.convertToType(data['frequency_interval'], 'String');
      }
      if (data.hasOwnProperty('sensitivity_factor')) {
        obj['sensitivity_factor'] = SensitivityFactor.constructFromObject(data['sensitivity_factor']);
      }
      if (data.hasOwnProperty('start_date')) {
        obj['start_date'] = ApiClient.convertToType(data['start_date'], 'Date');
      }
      if (data.hasOwnProperty('end_date')) {
        obj['end_date'] = ApiClient.convertToType(data['end_date'], 'Date');
      }
      if (data.hasOwnProperty('trading_days_per_year')) {
        obj['trading_days_per_year'] = ApiClient.convertToType(data['trading_days_per_year'], 'Number');
      }
      if (data.hasOwnProperty('use_proxy_data')) {
        obj['use_proxy_data'] = ApiClient.convertToType(data['use_proxy_data'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * A list of symbols for securities in the portfolio
   * @member {Array.<String>} portfolio_tickers
   */
  exports.prototype['portfolio_tickers'] = undefined;
  /**
   * @member {Array.<Number>} portfolio_weights
   */
  exports.prototype['portfolio_weights'] = undefined;
  /**
   * Frequency interval for returns, change_duration, and lag
   * @member {module:model/SensitivityAnalysis.FrequencyIntervalEnum} frequency_interval
   */
  exports.prototype['frequency_interval'] = undefined;
  /**
   * @member {module:model/SensitivityFactor} sensitivity_factor
   */
  exports.prototype['sensitivity_factor'] = undefined;
  /**
   * Start date of data
   * @member {Date} start_date
   */
  exports.prototype['start_date'] = undefined;
  /**
   * End date of data
   * @member {Date} end_date
   */
  exports.prototype['end_date'] = undefined;
  /**
   * Number of trading days per year, used in calculations
   * @member {Number} trading_days_per_year
   */
  exports.prototype['trading_days_per_year'] = undefined;
  /**
   * If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false.
   * @member {Boolean} use_proxy_data
   * @default false
   */
  exports.prototype['use_proxy_data'] = false;


  /**
   * Allowed values for the <code>frequency_interval</code> property.
   * @enum {String}
   * @readonly
   */
  exports.FrequencyIntervalEnum = {
    /**
     * value: "year"
     * @const
     */
    "year": "year",
    /**
     * value: "quarter"
     * @const
     */
    "quarter": "quarter",
    /**
     * value: "month"
     * @const
     */
    "month": "month",
    /**
     * value: "week"
     * @const
     */
    "week": "week",
    /**
     * value: "day"
     * @const
     */
    "day": "day"  };


  return exports;
}));


