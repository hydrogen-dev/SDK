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
    define(['ApiClient', 'model/AggregationAccountBalanceResponseVO', 'model/AggregationAccountHoldingResponseVO', 'model/AggregationAccountResponseVO', 'model/AggregationAccountTransactionResponseVO', 'model/AggregationAccountsResponseVO', 'model/AggregationRequestObject', 'model/PropertyValueResponseVO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/AggregationAccountBalanceResponseVO'), require('../model/AggregationAccountHoldingResponseVO'), require('../model/AggregationAccountResponseVO'), require('../model/AggregationAccountTransactionResponseVO'), require('../model/AggregationAccountsResponseVO'), require('../model/AggregationRequestObject'), require('../model/PropertyValueResponseVO'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.AggregationApi = factory(root.HydrogenIntegrationApi.ApiClient, root.HydrogenIntegrationApi.AggregationAccountBalanceResponseVO, root.HydrogenIntegrationApi.AggregationAccountHoldingResponseVO, root.HydrogenIntegrationApi.AggregationAccountResponseVO, root.HydrogenIntegrationApi.AggregationAccountTransactionResponseVO, root.HydrogenIntegrationApi.AggregationAccountsResponseVO, root.HydrogenIntegrationApi.AggregationRequestObject, root.HydrogenIntegrationApi.PropertyValueResponseVO);
  }
}(this, function(ApiClient, AggregationAccountBalanceResponseVO, AggregationAccountHoldingResponseVO, AggregationAccountResponseVO, AggregationAccountTransactionResponseVO, AggregationAccountsResponseVO, AggregationRequestObject, PropertyValueResponseVO) {
  'use strict';

  /**
   * Aggregation service.
   * @module api/AggregationApi
   * @version 1.3.0
   */

  /**
   * Constructs a new AggregationApi. 
   * @alias module:api/AggregationApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createAggregationAccountUsingPost operation.
     * @callback module:api/AggregationApi~createAggregationAccountUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AggregationAccountsResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create mapping between client,vendor,tenant
     * Create mapping between client,vendor,tenant
     * @param {module:model/AggregationRequestObject} aggregationRequestObject aggregationRequestObject
     * @param {module:api/AggregationApi~createAggregationAccountUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AggregationAccountsResponseVO}
     */
    this.createAggregationAccountUsingPost = function(aggregationRequestObject, callback) {
      var postBody = aggregationRequestObject;

      // verify the required parameter 'aggregationRequestObject' is set
      if (aggregationRequestObject === undefined || aggregationRequestObject === null) {
        throw new Error("Missing the required parameter 'aggregationRequestObject' when calling createAggregationAccountUsingPost");
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
      var accepts = ['application/json'];
      var returnType = AggregationAccountsResponseVO;

      return this.apiClient.callApi(
        '/aggregation/account', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createPropertyValueUsingPost operation.
     * @callback module:api/AggregationApi~createPropertyValueUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PropertyValueResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create mapping between client,vendor,tenant for the property
     * Create mapping between client,vendor,tenant for property
     * @param {module:model/AggregationRequestObject} aggregationRequestObject aggregationRequestObject
     * @param {module:api/AggregationApi~createPropertyValueUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PropertyValueResponseVO}
     */
    this.createPropertyValueUsingPost = function(aggregationRequestObject, callback) {
      var postBody = aggregationRequestObject;

      // verify the required parameter 'aggregationRequestObject' is set
      if (aggregationRequestObject === undefined || aggregationRequestObject === null) {
        throw new Error("Missing the required parameter 'aggregationRequestObject' when calling createPropertyValueUsingPost");
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
      var accepts = ['application/json'];
      var returnType = PropertyValueResponseVO;

      return this.apiClient.callApi(
        '/property_value', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteAggregationAccountUsingDelete operation.
     * @callback module:api/AggregationApi~deleteAggregationAccountUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * De-Link mapping between client,vendor,tenant
     * De-Link mapping between client,vendor,tenant
     * @param {String} nucleusAggregationAccountId nucleus_aggregation_account_id
     * @param {Object} opts Optional parameters
     * @param {String} opts.deleteType delete_type (default to delink)
     * @param {String} opts.nucleusData nucleus_data
     * @param {module:api/AggregationApi~deleteAggregationAccountUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteAggregationAccountUsingDelete = function(nucleusAggregationAccountId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'nucleusAggregationAccountId' is set
      if (nucleusAggregationAccountId === undefined || nucleusAggregationAccountId === null) {
        throw new Error("Missing the required parameter 'nucleusAggregationAccountId' when calling deleteAggregationAccountUsingDelete");
      }


      var pathParams = {
        'nucleus_aggregation_account_id': nucleusAggregationAccountId
      };
      var queryParams = {
        'delete_type': opts['deleteType'],
        'nucleus_data': opts['nucleusData']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/aggregation/account/{nucleus_aggregation_account_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAggregationAccountAllUsingGet operation.
     * @callback module:api/AggregationApi~getAggregationAccountAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/AggregationAccountResponseVO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client
     * Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client
     * @param {Array.<String>} aggregationAccountIdList aggregation_account_id_list
     * @param {module:api/AggregationApi~getAggregationAccountAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/AggregationAccountResponseVO>}
     */
    this.getAggregationAccountAllUsingGet = function(aggregationAccountIdList, callback) {
      var postBody = null;

      // verify the required parameter 'aggregationAccountIdList' is set
      if (aggregationAccountIdList === undefined || aggregationAccountIdList === null) {
        throw new Error("Missing the required parameter 'aggregationAccountIdList' when calling getAggregationAccountAllUsingGet");
      }


      var pathParams = {
      };
      var queryParams = {
        'aggregation_account_id_list': this.apiClient.buildCollectionParam(aggregationAccountIdList, 'multi')
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [AggregationAccountResponseVO];

      return this.apiClient.callApi(
        '/aggregation/account', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAggregationAccountBalanceAllUsingGet operation.
     * @callback module:api/AggregationApi~getAggregationAccountBalanceAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/AggregationAccountBalanceResponseVO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch all aggregation account balance details with for the given aggregation accounts 
     * Fetch all aggregation account balance details with for the given aggregation accounts
     * @param {Array.<String>} aggregationAccountIdList aggregation_account_id_list
     * @param {module:api/AggregationApi~getAggregationAccountBalanceAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/AggregationAccountBalanceResponseVO>}
     */
    this.getAggregationAccountBalanceAllUsingGet = function(aggregationAccountIdList, callback) {
      var postBody = null;

      // verify the required parameter 'aggregationAccountIdList' is set
      if (aggregationAccountIdList === undefined || aggregationAccountIdList === null) {
        throw new Error("Missing the required parameter 'aggregationAccountIdList' when calling getAggregationAccountBalanceAllUsingGet");
      }


      var pathParams = {
      };
      var queryParams = {
        'aggregation_account_id_list': this.apiClient.buildCollectionParam(aggregationAccountIdList, 'multi')
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [AggregationAccountBalanceResponseVO];

      return this.apiClient.callApi(
        '/aggregation/balance', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAggregationAccountBalanceUsingGet operation.
     * @callback module:api/AggregationApi~getAggregationAccountBalanceUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AggregationAccountBalanceResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch aggregation account balance details with the mapping created in POST endpoint
     * Fetch aggregation account balance details with the mapping created in POST endpoint
     * @param {String} nucleusAggregationAccountId nucleus_aggregation_account_id
     * @param {module:api/AggregationApi~getAggregationAccountBalanceUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AggregationAccountBalanceResponseVO}
     */
    this.getAggregationAccountBalanceUsingGet = function(nucleusAggregationAccountId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusAggregationAccountId' is set
      if (nucleusAggregationAccountId === undefined || nucleusAggregationAccountId === null) {
        throw new Error("Missing the required parameter 'nucleusAggregationAccountId' when calling getAggregationAccountBalanceUsingGet");
      }


      var pathParams = {
        'nucleus_aggregation_account_id': nucleusAggregationAccountId
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
      var returnType = AggregationAccountBalanceResponseVO;

      return this.apiClient.callApi(
        '/aggregation/balance/{nucleus_aggregation_account_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAggregationAccountHoldingAllUsingGet operation.
     * @callback module:api/AggregationApi~getAggregationAccountHoldingAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/AggregationAccountHoldingResponseVO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch all aggregation account(s) holding details with the mapping created in POST endpoint
     * Fetch all aggregation account(s) holding details with the mapping created in POST endpoint
     * @param {Array.<String>} aggregationAccountIdList aggregation_account_id_list
     * @param {module:api/AggregationApi~getAggregationAccountHoldingAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/AggregationAccountHoldingResponseVO>}
     */
    this.getAggregationAccountHoldingAllUsingGet = function(aggregationAccountIdList, callback) {
      var postBody = null;

      // verify the required parameter 'aggregationAccountIdList' is set
      if (aggregationAccountIdList === undefined || aggregationAccountIdList === null) {
        throw new Error("Missing the required parameter 'aggregationAccountIdList' when calling getAggregationAccountHoldingAllUsingGet");
      }


      var pathParams = {
      };
      var queryParams = {
        'aggregation_account_id_list': this.apiClient.buildCollectionParam(aggregationAccountIdList, 'multi')
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [AggregationAccountHoldingResponseVO];

      return this.apiClient.callApi(
        '/aggregation/holding', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAggregationAccountHoldingUsingGet operation.
     * @callback module:api/AggregationApi~getAggregationAccountHoldingUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AggregationAccountHoldingResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch aggregation account holding details with the mapping created in POST endpoint
     * Fetch aggregation account holding details with the mapping created in POST endpoint
     * @param {String} nucleusAggregationAccountId nucleus_aggregation_account_id
     * @param {module:api/AggregationApi~getAggregationAccountHoldingUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AggregationAccountHoldingResponseVO}
     */
    this.getAggregationAccountHoldingUsingGet = function(nucleusAggregationAccountId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusAggregationAccountId' is set
      if (nucleusAggregationAccountId === undefined || nucleusAggregationAccountId === null) {
        throw new Error("Missing the required parameter 'nucleusAggregationAccountId' when calling getAggregationAccountHoldingUsingGet");
      }


      var pathParams = {
        'nucleus_aggregation_account_id': nucleusAggregationAccountId
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
      var returnType = AggregationAccountHoldingResponseVO;

      return this.apiClient.callApi(
        '/aggregation/holding/{nucleus_aggregation_account_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAggregationAccountTransactionAllUsingGet operation.
     * @callback module:api/AggregationApi~getAggregationAccountTransactionAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/AggregationAccountTransactionResponseVO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch all aggregation account balance details with for the given aggregation accounts 
     * Fetch all aggregation account balance details with for the given aggregation accounts
     * @param {Array.<String>} aggregationAccountIdList aggregation_account_id_list
     * @param {module:api/AggregationApi~getAggregationAccountTransactionAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/AggregationAccountTransactionResponseVO>}
     */
    this.getAggregationAccountTransactionAllUsingGet = function(aggregationAccountIdList, callback) {
      var postBody = null;

      // verify the required parameter 'aggregationAccountIdList' is set
      if (aggregationAccountIdList === undefined || aggregationAccountIdList === null) {
        throw new Error("Missing the required parameter 'aggregationAccountIdList' when calling getAggregationAccountTransactionAllUsingGet");
      }


      var pathParams = {
      };
      var queryParams = {
        'aggregation_account_id_list': this.apiClient.buildCollectionParam(aggregationAccountIdList, 'multi')
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [AggregationAccountTransactionResponseVO];

      return this.apiClient.callApi(
        '/aggregation/transaction', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAggregationAccountTransactionUsingGet operation.
     * @callback module:api/AggregationApi~getAggregationAccountTransactionUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AggregationAccountTransactionResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch aggregation account transaction details with the mapping created in POST endpoint
     * Fetch aggregation account transaction details with the mapping created in POST endpoint
     * @param {String} nucleusAggregationAccountId nucleus_aggregation_account_id
     * @param {module:api/AggregationApi~getAggregationAccountTransactionUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AggregationAccountTransactionResponseVO}
     */
    this.getAggregationAccountTransactionUsingGet = function(nucleusAggregationAccountId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusAggregationAccountId' is set
      if (nucleusAggregationAccountId === undefined || nucleusAggregationAccountId === null) {
        throw new Error("Missing the required parameter 'nucleusAggregationAccountId' when calling getAggregationAccountTransactionUsingGet");
      }


      var pathParams = {
        'nucleus_aggregation_account_id': nucleusAggregationAccountId
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
      var returnType = AggregationAccountTransactionResponseVO;

      return this.apiClient.callApi(
        '/aggregation/transaction/{nucleus_aggregation_account_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAggregationAccountUsingGet operation.
     * @callback module:api/AggregationApi~getAggregationAccountUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AggregationAccountResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch aggregation account details with the mapping created in POST endpoint
     * Fetch aggregation account details with the mapping created in POST endpoint
     * @param {String} nucleusAggregationAccountId nucleus_aggregation_account_id
     * @param {module:api/AggregationApi~getAggregationAccountUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AggregationAccountResponseVO}
     */
    this.getAggregationAccountUsingGet = function(nucleusAggregationAccountId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusAggregationAccountId' is set
      if (nucleusAggregationAccountId === undefined || nucleusAggregationAccountId === null) {
        throw new Error("Missing the required parameter 'nucleusAggregationAccountId' when calling getAggregationAccountUsingGet");
      }


      var pathParams = {
        'nucleus_aggregation_account_id': nucleusAggregationAccountId
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
      var returnType = AggregationAccountResponseVO;

      return this.apiClient.callApi(
        '/aggregation/account/{nucleus_aggregation_account_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getPropertyValue operation.
     * @callback module:api/AggregationApi~getPropertyValueCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PropertyValueResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Value of the given property
     * Get Value of the given property
     * @param {String} nucleusAggregationAccountId nucleus_aggregation_account_id
     * @param {Object} opts Optional parameters
     * @param {String} opts.nucleusBusinessId nucleus_business_id
     * @param {String} opts.nucleusClientId nucleus_client_id
     * @param {String} opts.product product (default to atom)
     * @param {module:api/AggregationApi~getPropertyValueCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PropertyValueResponseVO}
     */
    this.getPropertyValue = function(nucleusAggregationAccountId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'nucleusAggregationAccountId' is set
      if (nucleusAggregationAccountId === undefined || nucleusAggregationAccountId === null) {
        throw new Error("Missing the required parameter 'nucleusAggregationAccountId' when calling getPropertyValue");
      }


      var pathParams = {
      };
      var queryParams = {
        'nucleus_aggregation_account_id': nucleusAggregationAccountId,
        'nucleus_business_id': opts['nucleusBusinessId'],
        'nucleus_client_id': opts['nucleusClientId'],
        'product': opts['product']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = PropertyValueResponseVO;

      return this.apiClient.callApi(
        '/property_value', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
