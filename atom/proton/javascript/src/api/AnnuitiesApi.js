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
    define(['ApiClient', 'model/AnnuityCalculatorAccumulationHorizonRequest', 'model/AnnuityCalculatorAnnuityAmountRequest', 'model/AnnuityCalculatorDecumulationHorizonRequest', 'model/AnnuityCalculatorDepositAmountRequest', 'model/AnnuityCalculatorInitialBalanceRequest', 'model/VariableAnnuityRequest'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/AnnuityCalculatorAccumulationHorizonRequest'), require('../model/AnnuityCalculatorAnnuityAmountRequest'), require('../model/AnnuityCalculatorDecumulationHorizonRequest'), require('../model/AnnuityCalculatorDepositAmountRequest'), require('../model/AnnuityCalculatorInitialBalanceRequest'), require('../model/VariableAnnuityRequest'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.AnnuitiesApi = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.AnnuityCalculatorAccumulationHorizonRequest, root.HydrogenProtonApi.AnnuityCalculatorAnnuityAmountRequest, root.HydrogenProtonApi.AnnuityCalculatorDecumulationHorizonRequest, root.HydrogenProtonApi.AnnuityCalculatorDepositAmountRequest, root.HydrogenProtonApi.AnnuityCalculatorInitialBalanceRequest, root.HydrogenProtonApi.VariableAnnuityRequest);
  }
}(this, function(ApiClient, AnnuityCalculatorAccumulationHorizonRequest, AnnuityCalculatorAnnuityAmountRequest, AnnuityCalculatorDecumulationHorizonRequest, AnnuityCalculatorDepositAmountRequest, AnnuityCalculatorInitialBalanceRequest, VariableAnnuityRequest) {
  'use strict';

  /**
   * Annuities service.
   * @module api/AnnuitiesApi
   * @version 1.9.2
   */

  /**
   * Constructs a new AnnuitiesApi. 
   * @alias module:api/AnnuitiesApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the annuityCalculatorAccumulationHorizon operation.
     * @callback module:api/AnnuitiesApi~annuityCalculatorAccumulationHorizonCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Annuity Calculator - Accumulation Horizon
     * Calculate the necessary fixed annuity contribution period
     * @param {module:model/AnnuityCalculatorAccumulationHorizonRequest} annuityCalculatorAccumulationHorizonRequest Request payload for Annuity Calculator - Accumulation Horizon
     * @param {module:api/AnnuitiesApi~annuityCalculatorAccumulationHorizonCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.annuityCalculatorAccumulationHorizon = function(annuityCalculatorAccumulationHorizonRequest, callback) {
      var postBody = annuityCalculatorAccumulationHorizonRequest;

      // verify the required parameter 'annuityCalculatorAccumulationHorizonRequest' is set
      if (annuityCalculatorAccumulationHorizonRequest === undefined || annuityCalculatorAccumulationHorizonRequest === null) {
        throw new Error("Missing the required parameter 'annuityCalculatorAccumulationHorizonRequest' when calling annuityCalculatorAccumulationHorizon");
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
        '/annuity_calculator/accumulation_horizon', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the annuityCalculatorAnnuityAmount operation.
     * @callback module:api/AnnuitiesApi~annuityCalculatorAnnuityAmountCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Annuity Calculator - Annuity Amount
     * Calculate the achievable fixed annuity amount
     * @param {module:model/AnnuityCalculatorAnnuityAmountRequest} annuityCalculatorAnnuityAmountRequest Request payload for Annuity Calculator - Annuity Amount
     * @param {module:api/AnnuitiesApi~annuityCalculatorAnnuityAmountCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.annuityCalculatorAnnuityAmount = function(annuityCalculatorAnnuityAmountRequest, callback) {
      var postBody = annuityCalculatorAnnuityAmountRequest;

      // verify the required parameter 'annuityCalculatorAnnuityAmountRequest' is set
      if (annuityCalculatorAnnuityAmountRequest === undefined || annuityCalculatorAnnuityAmountRequest === null) {
        throw new Error("Missing the required parameter 'annuityCalculatorAnnuityAmountRequest' when calling annuityCalculatorAnnuityAmount");
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
        '/annuity_calculator/annuity_amount', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the annuityCalculatorDecumulationHorizon operation.
     * @callback module:api/AnnuitiesApi~annuityCalculatorDecumulationHorizonCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Annuity Calculator - Decumulation Horizon
     * Calculate the achievable fixed annuity payout period
     * @param {module:model/AnnuityCalculatorDecumulationHorizonRequest} annuityCalculatorDecumulationHorizonRequest Request payload for Annuity Calculator - Decumulation Horizon
     * @param {module:api/AnnuitiesApi~annuityCalculatorDecumulationHorizonCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.annuityCalculatorDecumulationHorizon = function(annuityCalculatorDecumulationHorizonRequest, callback) {
      var postBody = annuityCalculatorDecumulationHorizonRequest;

      // verify the required parameter 'annuityCalculatorDecumulationHorizonRequest' is set
      if (annuityCalculatorDecumulationHorizonRequest === undefined || annuityCalculatorDecumulationHorizonRequest === null) {
        throw new Error("Missing the required parameter 'annuityCalculatorDecumulationHorizonRequest' when calling annuityCalculatorDecumulationHorizon");
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
        '/annuity_calculator/decumulation_horizon', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the annuityCalculatorDepositAmount operation.
     * @callback module:api/AnnuitiesApi~annuityCalculatorDepositAmountCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Annuity Calculator - Deposit Amount
     * Calculate the necessary periodic deposit amount for a fixed annuity
     * @param {module:model/AnnuityCalculatorDepositAmountRequest} annuityCalculatorDepositAmountRequest Request payload for Annuity Calculator - Deposit Amount
     * @param {module:api/AnnuitiesApi~annuityCalculatorDepositAmountCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.annuityCalculatorDepositAmount = function(annuityCalculatorDepositAmountRequest, callback) {
      var postBody = annuityCalculatorDepositAmountRequest;

      // verify the required parameter 'annuityCalculatorDepositAmountRequest' is set
      if (annuityCalculatorDepositAmountRequest === undefined || annuityCalculatorDepositAmountRequest === null) {
        throw new Error("Missing the required parameter 'annuityCalculatorDepositAmountRequest' when calling annuityCalculatorDepositAmount");
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
        '/annuity_calculator/deposit_amount', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the annuityCalculatorInitialBalance operation.
     * @callback module:api/AnnuitiesApi~annuityCalculatorInitialBalanceCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Annuity Calculator - Initial Balance
     * Calculate the necessary initial balance for a fixed annuity
     * @param {module:model/AnnuityCalculatorInitialBalanceRequest} annuityCalculatorInitialBalanceRequest Request payload for Annuity Calculator - Initial Balance
     * @param {module:api/AnnuitiesApi~annuityCalculatorInitialBalanceCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.annuityCalculatorInitialBalance = function(annuityCalculatorInitialBalanceRequest, callback) {
      var postBody = annuityCalculatorInitialBalanceRequest;

      // verify the required parameter 'annuityCalculatorInitialBalanceRequest' is set
      if (annuityCalculatorInitialBalanceRequest === undefined || annuityCalculatorInitialBalanceRequest === null) {
        throw new Error("Missing the required parameter 'annuityCalculatorInitialBalanceRequest' when calling annuityCalculatorInitialBalance");
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
        '/annuity_calculator/initial_balance', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the variableAnnuity operation.
     * @callback module:api/AnnuitiesApi~variableAnnuityCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Variable Annuity
     * Project the behavior of a variable annuity over time
     * @param {module:model/VariableAnnuityRequest} variableAnnuityRequest Request payload for Variable Annuity
     * @param {module:api/AnnuitiesApi~variableAnnuityCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.variableAnnuity = function(variableAnnuityRequest, callback) {
      var postBody = variableAnnuityRequest;

      // verify the required parameter 'variableAnnuityRequest' is set
      if (variableAnnuityRequest === undefined || variableAnnuityRequest === null) {
        throw new Error("Missing the required parameter 'variableAnnuityRequest' when calling variableAnnuity");
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
        '/variable_annuity', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
