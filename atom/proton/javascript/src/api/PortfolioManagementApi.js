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
    define(['ApiClient', 'model/RebalancingSignalRequest'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/RebalancingSignalRequest'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.PortfolioManagementApi = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.RebalancingSignalRequest);
  }
}(this, function(ApiClient, RebalancingSignalRequest) {
  'use strict';

  /**
   * PortfolioManagement service.
   * @module api/PortfolioManagementApi
   * @version 1.9.2
   */

  /**
   * Constructs a new PortfolioManagementApi. 
   * @alias module:api/PortfolioManagementApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the rebalancingSignal operation.
     * @callback module:api/PortfolioManagementApi~rebalancingSignalCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Rebalancing Signal
     * Generate rebalancing signals for a group of investments
     * @param {module:model/RebalancingSignalRequest} rebalancingSignalRequest Request payload for Rebalancing Signal
     * @param {module:api/PortfolioManagementApi~rebalancingSignalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.rebalancingSignal = function(rebalancingSignalRequest, callback) {
      var postBody = rebalancingSignalRequest;

      // verify the required parameter 'rebalancingSignalRequest' is set
      if (rebalancingSignalRequest === undefined || rebalancingSignalRequest === null) {
        throw new Error("Missing the required parameter 'rebalancingSignalRequest' when calling rebalancingSignal");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = {'String': Object};

      return this.apiClient.callApi(
        '/rebalancing_signal', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
