/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
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
    define(['ApiClient', 'model/PageRoundup', 'model/PageRoundupSettings', 'model/Roundup', 'model/RoundupCO', 'model/RoundupSettings'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/PageRoundup'), require('../model/PageRoundupSettings'), require('../model/Roundup'), require('../model/RoundupCO'), require('../model/RoundupSettings'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.RoundupApi = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.PageRoundup, root.HydrogenNucleusApi.PageRoundupSettings, root.HydrogenNucleusApi.Roundup, root.HydrogenNucleusApi.RoundupCO, root.HydrogenNucleusApi.RoundupSettings);
  }
}(this, function(ApiClient, PageRoundup, PageRoundupSettings, Roundup, RoundupCO, RoundupSettings) {
  'use strict';

  /**
   * Roundup service.
   * @module api/RoundupApi
   * @version 1.9.3
   */

  /**
   * Constructs a new RoundupApi. 
   * @alias module:api/RoundupApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createRoundupSettingsUsingPost operation.
     * @callback module:api/RoundupApi~createRoundupSettingsUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RoundupSettings} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a Roundup Settings
     * Create a Roundup Settings for Roundup amount with your firm.
     * @param {module:model/RoundupSettings} roundupSettings roundupSettings
     * @param {module:api/RoundupApi~createRoundupSettingsUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RoundupSettings}
     */
    this.createRoundupSettingsUsingPost = function(roundupSettings, callback) {
      var postBody = roundupSettings;

      // verify the required parameter 'roundupSettings' is set
      if (roundupSettings === undefined || roundupSettings === null) {
        throw new Error("Missing the required parameter 'roundupSettings' when calling createRoundupSettingsUsingPost");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = RoundupSettings;

      return this.apiClient.callApi(
        '/nucleus/v1/roundup_setting', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createRoundupUsingPost operation.
     * @callback module:api/RoundupApi~createRoundupUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Roundup} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a roundup
     * Create a new roundup with your firm.
     * @param {module:model/RoundupCO} roundupCO roundupCO
     * @param {module:api/RoundupApi~createRoundupUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Roundup}
     */
    this.createRoundupUsingPost = function(roundupCO, callback) {
      var postBody = roundupCO;

      // verify the required parameter 'roundupCO' is set
      if (roundupCO === undefined || roundupCO === null) {
        throw new Error("Missing the required parameter 'roundupCO' when calling createRoundupUsingPost");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = Roundup;

      return this.apiClient.callApi(
        '/nucleus/v1/roundup', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteRoundupSettingsUsingDelete operation.
     * @callback module:api/RoundupApi~deleteRoundupSettingsUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a roundup settings
     * Permanently delete a  roundup settings registered with your firm.
     * @param {String} roundupSettingId UUID roundup_setting_id
     * @param {module:api/RoundupApi~deleteRoundupSettingsUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteRoundupSettingsUsingDelete = function(roundupSettingId, callback) {
      var postBody = null;

      // verify the required parameter 'roundupSettingId' is set
      if (roundupSettingId === undefined || roundupSettingId === null) {
        throw new Error("Missing the required parameter 'roundupSettingId' when calling deleteRoundupSettingsUsingDelete");
      }


      var pathParams = {
        'roundup_setting_id': roundupSettingId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['*/*'];
      var returnType = null;

      return this.apiClient.callApi(
        '/nucleus/v1/roundup_setting/{roundup_setting_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getRoundupAllUsingGet operation.
     * @callback module:api/RoundupApi~getRoundupAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageRoundup} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all roundups
     * Get details for all roundups.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to update_date)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/RoundupApi~getRoundupAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageRoundup}
     */
    this.getRoundupAllUsingGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'ascending': opts['ascending'],
        'filter': opts['filter'],
        'order_by': opts['orderBy'],
        'page': opts['page'],
        'size': opts['size']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['*/*'];
      var returnType = PageRoundup;

      return this.apiClient.callApi(
        '/nucleus/v1/roundup', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getRoundupSettingsAllUsingGet operation.
     * @callback module:api/RoundupApi~getRoundupSettingsAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageRoundupSettings} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all roundup settings
     * Get details for all roundup setting with your firm.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to update_date)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/RoundupApi~getRoundupSettingsAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageRoundupSettings}
     */
    this.getRoundupSettingsAllUsingGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'ascending': opts['ascending'],
        'filter': opts['filter'],
        'order_by': opts['orderBy'],
        'page': opts['page'],
        'size': opts['size']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['*/*'];
      var returnType = PageRoundupSettings;

      return this.apiClient.callApi(
        '/nucleus/v1/roundup_setting', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getRoundupSettingsUsingGet operation.
     * @callback module:api/RoundupApi~getRoundupSettingsUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RoundupSettings} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve a Roundup Setting
     * Retrieve the information for a Roundup Settings with your firm.
     * @param {String} roundupSettingId UUID roundup_setting_id
     * @param {module:api/RoundupApi~getRoundupSettingsUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RoundupSettings}
     */
    this.getRoundupSettingsUsingGet = function(roundupSettingId, callback) {
      var postBody = null;

      // verify the required parameter 'roundupSettingId' is set
      if (roundupSettingId === undefined || roundupSettingId === null) {
        throw new Error("Missing the required parameter 'roundupSettingId' when calling getRoundupSettingsUsingGet");
      }


      var pathParams = {
        'roundup_setting_id': roundupSettingId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['*/*'];
      var returnType = RoundupSettings;

      return this.apiClient.callApi(
        '/nucleus/v1/roundup_setting/{roundup_setting_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getRoundupUsingGet operation.
     * @callback module:api/RoundupApi~getRoundupUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Roundup} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve a Roundup
     * Retrieve the information for a Roundup.
     * @param {String} roundupId UUID roundup_id
     * @param {module:api/RoundupApi~getRoundupUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Roundup}
     */
    this.getRoundupUsingGet = function(roundupId, callback) {
      var postBody = null;

      // verify the required parameter 'roundupId' is set
      if (roundupId === undefined || roundupId === null) {
        throw new Error("Missing the required parameter 'roundupId' when calling getRoundupUsingGet");
      }


      var pathParams = {
        'roundup_id': roundupId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['*/*'];
      var returnType = Roundup;

      return this.apiClient.callApi(
        '/nucleus/v1/roundup/{roundup_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateRoundupSettingsUsingPut operation.
     * @callback module:api/RoundupApi~updateRoundupSettingsUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RoundupSettings} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update a roundup settings
     * Update the information for a roundup setting registered with your firm.
     * @param {module:model/RoundupSettings} roundupSetting roundup_setting
     * @param {String} roundupSettingId UUID roundup_setting_id
     * @param {module:api/RoundupApi~updateRoundupSettingsUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RoundupSettings}
     */
    this.updateRoundupSettingsUsingPut = function(roundupSetting, roundupSettingId, callback) {
      var postBody = roundupSetting;

      // verify the required parameter 'roundupSetting' is set
      if (roundupSetting === undefined || roundupSetting === null) {
        throw new Error("Missing the required parameter 'roundupSetting' when calling updateRoundupSettingsUsingPut");
      }

      // verify the required parameter 'roundupSettingId' is set
      if (roundupSettingId === undefined || roundupSettingId === null) {
        throw new Error("Missing the required parameter 'roundupSettingId' when calling updateRoundupSettingsUsingPut");
      }


      var pathParams = {
        'roundup_setting_id': roundupSettingId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = RoundupSettings;

      return this.apiClient.callApi(
        '/nucleus/v1/roundup_setting/{roundup_setting_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
