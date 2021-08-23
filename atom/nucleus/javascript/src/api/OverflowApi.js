/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
    define(['ApiClient', 'model/Overflow', 'model/OverflowSettings', 'model/OverflowVO', 'model/PageOverflow', 'model/PageOverflowSettings'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Overflow'), require('../model/OverflowSettings'), require('../model/OverflowVO'), require('../model/PageOverflow'), require('../model/PageOverflowSettings'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.OverflowApi = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.Overflow, root.HydrogenNucleusApi.OverflowSettings, root.HydrogenNucleusApi.OverflowVO, root.HydrogenNucleusApi.PageOverflow, root.HydrogenNucleusApi.PageOverflowSettings);
  }
}(this, function(ApiClient, Overflow, OverflowSettings, OverflowVO, PageOverflow, PageOverflowSettings) {
  'use strict';

  /**
   * Overflow service.
   * @module api/OverflowApi
   * @version 1.9.4
   */

  /**
   * Constructs a new OverflowApi. 
   * @alias module:api/OverflowApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createOverflowSettingsUsingPost operation.
     * @callback module:api/OverflowApi~createOverflowSettingsUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OverflowSettings} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a Overflow Settings request
     * Create a new Overflow Settings request.
     * @param {module:model/OverflowSettings} overflowSettings overflowSettings
     * @param {module:api/OverflowApi~createOverflowSettingsUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/OverflowSettings}
     */
    this.createOverflowSettingsUsingPost = function(overflowSettings, callback) {
      var postBody = overflowSettings;

      // verify the required parameter 'overflowSettings' is set
      if (overflowSettings === undefined || overflowSettings === null) {
        throw new Error("Missing the required parameter 'overflowSettings' when calling createOverflowSettingsUsingPost");
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
      var returnType = OverflowSettings;

      return this.apiClient.callApi(
        '/nucleus/v1/overflow_setting', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createOverflowUsingPost operation.
     * @callback module:api/OverflowApi~createOverflowUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Overflow} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a Overflow request
     * Create a new Overflow request.
     * @param {module:model/OverflowVO} overflowVO overflowVO
     * @param {module:api/OverflowApi~createOverflowUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Overflow}
     */
    this.createOverflowUsingPost = function(overflowVO, callback) {
      var postBody = overflowVO;

      // verify the required parameter 'overflowVO' is set
      if (overflowVO === undefined || overflowVO === null) {
        throw new Error("Missing the required parameter 'overflowVO' when calling createOverflowUsingPost");
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
      var returnType = Overflow;

      return this.apiClient.callApi(
        '/nucleus/v1/overflow', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteOverflowSettingsUsingDelete operation.
     * @callback module:api/OverflowApi~deleteOverflowSettingsUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a overflow settings
     * Permanently delete a  overflow settings registered with your firm.
     * @param {String} overflowSettingsId UUID overflow_settings_id
     * @param {module:api/OverflowApi~deleteOverflowSettingsUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteOverflowSettingsUsingDelete = function(overflowSettingsId, callback) {
      var postBody = null;

      // verify the required parameter 'overflowSettingsId' is set
      if (overflowSettingsId === undefined || overflowSettingsId === null) {
        throw new Error("Missing the required parameter 'overflowSettingsId' when calling deleteOverflowSettingsUsingDelete");
      }


      var pathParams = {
        'overflow_settings_id': overflowSettingsId
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
        '/nucleus/v1/overflow_setting/{overflow_settings_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getOverflowAllUsingGet operation.
     * @callback module:api/OverflowApi~getOverflowAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageOverflow} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all overflow objects
     * Get details for all overflow.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to update_date)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/OverflowApi~getOverflowAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageOverflow}
     */
    this.getOverflowAllUsingGet = function(opts, callback) {
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
      var returnType = PageOverflow;

      return this.apiClient.callApi(
        '/nucleus/v1/overflow', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getOverflowSettingsAllUsingGet operation.
     * @callback module:api/OverflowApi~getOverflowSettingsAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageOverflowSettings} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all overflow settings
     * Get details for all overflow setting.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to update_date)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/OverflowApi~getOverflowSettingsAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageOverflowSettings}
     */
    this.getOverflowSettingsAllUsingGet = function(opts, callback) {
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
      var returnType = PageOverflowSettings;

      return this.apiClient.callApi(
        '/nucleus/v1/overflow_setting', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getOverflowSettingsUsingGet operation.
     * @callback module:api/OverflowApi~getOverflowSettingsUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OverflowSettings} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve a Overflow Setting
     * Retrieve the information for a Overflow Settings.
     * @param {String} overflowSettingsId UUID overflow_settings_id
     * @param {module:api/OverflowApi~getOverflowSettingsUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/OverflowSettings}
     */
    this.getOverflowSettingsUsingGet = function(overflowSettingsId, callback) {
      var postBody = null;

      // verify the required parameter 'overflowSettingsId' is set
      if (overflowSettingsId === undefined || overflowSettingsId === null) {
        throw new Error("Missing the required parameter 'overflowSettingsId' when calling getOverflowSettingsUsingGet");
      }


      var pathParams = {
        'overflow_settings_id': overflowSettingsId
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
      var returnType = OverflowSettings;

      return this.apiClient.callApi(
        '/nucleus/v1/overflow_setting/{overflow_settings_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getOverflowUsingGet operation.
     * @callback module:api/OverflowApi~getOverflowUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Overflow} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve a Overflow object
     * Retrieve the information for a Overflow.
     * @param {String} overflowId UUID overflow_id
     * @param {module:api/OverflowApi~getOverflowUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Overflow}
     */
    this.getOverflowUsingGet = function(overflowId, callback) {
      var postBody = null;

      // verify the required parameter 'overflowId' is set
      if (overflowId === undefined || overflowId === null) {
        throw new Error("Missing the required parameter 'overflowId' when calling getOverflowUsingGet");
      }


      var pathParams = {
        'overflow_id': overflowId
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
      var returnType = Overflow;

      return this.apiClient.callApi(
        '/nucleus/v1/overflow/{overflow_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateOverflowSettingsUsingPut operation.
     * @callback module:api/OverflowApi~updateOverflowSettingsUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OverflowSettings} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update a overflow settings
     * Update the information for a overflow setting registered with your firm.
     * @param {module:model/OverflowSettings} overflowSettings overflow_settings
     * @param {String} overflowSettingsId UUID overflow_settings_id
     * @param {module:api/OverflowApi~updateOverflowSettingsUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/OverflowSettings}
     */
    this.updateOverflowSettingsUsingPut = function(overflowSettings, overflowSettingsId, callback) {
      var postBody = overflowSettings;

      // verify the required parameter 'overflowSettings' is set
      if (overflowSettings === undefined || overflowSettings === null) {
        throw new Error("Missing the required parameter 'overflowSettings' when calling updateOverflowSettingsUsingPut");
      }

      // verify the required parameter 'overflowSettingsId' is set
      if (overflowSettingsId === undefined || overflowSettingsId === null) {
        throw new Error("Missing the required parameter 'overflowSettingsId' when calling updateOverflowSettingsUsingPut");
      }


      var pathParams = {
        'overflow_settings_id': overflowSettingsId
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
      var returnType = OverflowSettings;

      return this.apiClient.callApi(
        '/nucleus/v1/overflow_setting/{overflow_settings_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
