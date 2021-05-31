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
    define(['ApiClient', 'model/AchBalanceResponseVO', 'model/AchBankLinkRequestCO', 'model/AchBankLinkResponseVO', 'model/AchBusinessRequestCO', 'model/AchCardLinkRequestCO', 'model/AchCardLinkResponseVO', 'model/AchCardReserveRequestCO', 'model/AchCardReserveResponseVO', 'model/AchClientRequestCO', 'model/AchClientResponseVO', 'model/AchTransferRequestCO', 'model/AchTransferResponseVO', 'model/BaseResponseVO', 'model/PageAchTransferResponseVO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/AchBalanceResponseVO'), require('../model/AchBankLinkRequestCO'), require('../model/AchBankLinkResponseVO'), require('../model/AchBusinessRequestCO'), require('../model/AchCardLinkRequestCO'), require('../model/AchCardLinkResponseVO'), require('../model/AchCardReserveRequestCO'), require('../model/AchCardReserveResponseVO'), require('../model/AchClientRequestCO'), require('../model/AchClientResponseVO'), require('../model/AchTransferRequestCO'), require('../model/AchTransferResponseVO'), require('../model/BaseResponseVO'), require('../model/PageAchTransferResponseVO'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.ACHApi = factory(root.HydrogenIntegrationApi.ApiClient, root.HydrogenIntegrationApi.AchBalanceResponseVO, root.HydrogenIntegrationApi.AchBankLinkRequestCO, root.HydrogenIntegrationApi.AchBankLinkResponseVO, root.HydrogenIntegrationApi.AchBusinessRequestCO, root.HydrogenIntegrationApi.AchCardLinkRequestCO, root.HydrogenIntegrationApi.AchCardLinkResponseVO, root.HydrogenIntegrationApi.AchCardReserveRequestCO, root.HydrogenIntegrationApi.AchCardReserveResponseVO, root.HydrogenIntegrationApi.AchClientRequestCO, root.HydrogenIntegrationApi.AchClientResponseVO, root.HydrogenIntegrationApi.AchTransferRequestCO, root.HydrogenIntegrationApi.AchTransferResponseVO, root.HydrogenIntegrationApi.BaseResponseVO, root.HydrogenIntegrationApi.PageAchTransferResponseVO);
  }
}(this, function(ApiClient, AchBalanceResponseVO, AchBankLinkRequestCO, AchBankLinkResponseVO, AchBusinessRequestCO, AchCardLinkRequestCO, AchCardLinkResponseVO, AchCardReserveRequestCO, AchCardReserveResponseVO, AchClientRequestCO, AchClientResponseVO, AchTransferRequestCO, AchTransferResponseVO, BaseResponseVO, PageAchTransferResponseVO) {
  'use strict';

  /**
   * ACH service.
   * @module api/ACHApi
   * @version 1.3.0
   */

  /**
   * Constructs a new ACHApi. 
   * @alias module:api/ACHApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the cancelAchTransferUsingDelete operation.
     * @callback module:api/ACHApi~cancelAchTransferUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchTransferResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel the ACH transfer
     * @param {String} nucleusFundingId nucleus_funding_id
     * @param {module:api/ACHApi~cancelAchTransferUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchTransferResponseVO}
     */
    this.cancelAchTransferUsingDelete = function(nucleusFundingId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusFundingId' is set
      if (nucleusFundingId === undefined || nucleusFundingId === null) {
        throw new Error("Missing the required parameter 'nucleusFundingId' when calling cancelAchTransferUsingDelete");
      }


      var pathParams = {
        'nucleus_funding_id': nucleusFundingId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = AchTransferResponseVO;

      return this.apiClient.callApi(
        '/ach/{nucleus_funding_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createAchCardLinkUsingPost operation.
     * @callback module:api/ACHApi~createAchCardLinkUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchCardLinkResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an ACH card link
     * @param {module:model/AchCardLinkRequestCO} cardLinkRequestCO cardLinkRequestCO
     * @param {module:api/ACHApi~createAchCardLinkUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchCardLinkResponseVO}
     */
    this.createAchCardLinkUsingPost = function(cardLinkRequestCO, callback) {
      var postBody = cardLinkRequestCO;

      // verify the required parameter 'cardLinkRequestCO' is set
      if (cardLinkRequestCO === undefined || cardLinkRequestCO === null) {
        throw new Error("Missing the required parameter 'cardLinkRequestCO' when calling createAchCardLinkUsingPost");
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
      var returnType = AchCardLinkResponseVO;

      return this.apiClient.callApi(
        '/ach/card_link', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createAchCardReserveUsingPost operation.
     * @callback module:api/ACHApi~createAchCardReserveUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchCardReserveResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an ACH card reserve
     * @param {module:model/AchCardReserveRequestCO} cardReserveRequestCO cardReserveRequestCO
     * @param {module:api/ACHApi~createAchCardReserveUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchCardReserveResponseVO}
     */
    this.createAchCardReserveUsingPost = function(cardReserveRequestCO, callback) {
      var postBody = cardReserveRequestCO;

      // verify the required parameter 'cardReserveRequestCO' is set
      if (cardReserveRequestCO === undefined || cardReserveRequestCO === null) {
        throw new Error("Missing the required parameter 'cardReserveRequestCO' when calling createAchCardReserveUsingPost");
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
      var returnType = AchCardReserveResponseVO;

      return this.apiClient.callApi(
        '/ach/card_reserve', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createBankLinkUsingPost operation.
     * @callback module:api/ACHApi~createBankLinkUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchBankLinkResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create bank link
     * @param {module:model/AchBankLinkRequestCO} achBankLinkRequestCO achBankLinkRequestCO
     * @param {module:api/ACHApi~createBankLinkUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchBankLinkResponseVO}
     */
    this.createBankLinkUsingPost = function(achBankLinkRequestCO, callback) {
      var postBody = achBankLinkRequestCO;

      // verify the required parameter 'achBankLinkRequestCO' is set
      if (achBankLinkRequestCO === undefined || achBankLinkRequestCO === null) {
        throw new Error("Missing the required parameter 'achBankLinkRequestCO' when calling createBankLinkUsingPost");
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
      var returnType = AchBankLinkResponseVO;

      return this.apiClient.callApi(
        '/ach/bank_link', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createBusinessUsingPost operation.
     * @callback module:api/ACHApi~createBusinessUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BaseResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a business
     * @param {module:model/AchBusinessRequestCO} businessRequest businessRequest
     * @param {module:api/ACHApi~createBusinessUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BaseResponseVO}
     */
    this.createBusinessUsingPost = function(businessRequest, callback) {
      var postBody = businessRequest;

      // verify the required parameter 'businessRequest' is set
      if (businessRequest === undefined || businessRequest === null) {
        throw new Error("Missing the required parameter 'businessRequest' when calling createBusinessUsingPost");
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
      var returnType = BaseResponseVO;

      return this.apiClient.callApi(
        '/ach/business', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createClientUsingPost operation.
     * @callback module:api/ACHApi~createClientUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchClientResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a client
     * @param {module:model/AchClientRequestCO} clientRequest clientRequest
     * @param {module:api/ACHApi~createClientUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchClientResponseVO}
     */
    this.createClientUsingPost = function(clientRequest, callback) {
      var postBody = clientRequest;

      // verify the required parameter 'clientRequest' is set
      if (clientRequest === undefined || clientRequest === null) {
        throw new Error("Missing the required parameter 'clientRequest' when calling createClientUsingPost");
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
      var returnType = AchClientResponseVO;

      return this.apiClient.callApi(
        '/ach/client', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteBankLinkUsingDelete operation.
     * @callback module:api/ACHApi~deleteBankLinkUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchBankLinkResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete bank link
     * @param {String} nucleusBankLinkId nucleus_bank_link_id
     * @param {module:api/ACHApi~deleteBankLinkUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchBankLinkResponseVO}
     */
    this.deleteBankLinkUsingDelete = function(nucleusBankLinkId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusBankLinkId' is set
      if (nucleusBankLinkId === undefined || nucleusBankLinkId === null) {
        throw new Error("Missing the required parameter 'nucleusBankLinkId' when calling deleteBankLinkUsingDelete");
      }


      var pathParams = {
        'nucleus_bank_link_id': nucleusBankLinkId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = AchBankLinkResponseVO;

      return this.apiClient.callApi(
        '/ach/bank_link/{nucleus_bank_link_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAchStatusUsingGet operation.
     * @callback module:api/ACHApi~getAchStatusUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchTransferResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the ACH status
     * @param {String} nucleusBusinessId nucleus_business_id
     * @param {module:api/ACHApi~getAchStatusUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchTransferResponseVO}
     */
    this.getAchStatusUsingGet = function(nucleusBusinessId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusBusinessId' is set
      if (nucleusBusinessId === undefined || nucleusBusinessId === null) {
        throw new Error("Missing the required parameter 'nucleusBusinessId' when calling getAchStatusUsingGet");
      }


      var pathParams = {
      };
      var queryParams = {
        'nucleus_business_id': nucleusBusinessId
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = AchTransferResponseVO;

      return this.apiClient.callApi(
        '/ach/status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAchTransferUsingGet operation.
     * @callback module:api/ACHApi~getAchTransferUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchTransferResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the ACH transfer
     * @param {String} nucleusFundingId nucleus_funding_id
     * @param {module:api/ACHApi~getAchTransferUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchTransferResponseVO}
     */
    this.getAchTransferUsingGet = function(nucleusFundingId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusFundingId' is set
      if (nucleusFundingId === undefined || nucleusFundingId === null) {
        throw new Error("Missing the required parameter 'nucleusFundingId' when calling getAchTransferUsingGet");
      }


      var pathParams = {
        'nucleus_funding_id': nucleusFundingId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = AchTransferResponseVO;

      return this.apiClient.callApi(
        '/ach/{nucleus_funding_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getBalanceUsingGet operation.
     * @callback module:api/ACHApi~getBalanceUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchBalanceResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get balance
     * @param {String} portfolioId portfolio_id
     * @param {Object} opts Optional parameters
     * @param {Date} opts.endDate end_date
     * @param {Date} opts.startDate start_date
     * @param {module:api/ACHApi~getBalanceUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchBalanceResponseVO}
     */
    this.getBalanceUsingGet = function(portfolioId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'portfolioId' is set
      if (portfolioId === undefined || portfolioId === null) {
        throw new Error("Missing the required parameter 'portfolioId' when calling getBalanceUsingGet");
      }


      var pathParams = {
        'portfolio_id': portfolioId
      };
      var queryParams = {
        'end_date': opts['endDate'],
        'start_date': opts['startDate']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = AchBalanceResponseVO;

      return this.apiClient.callApi(
        '/ach/balance/{portfolio_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getBankLinkUsingGet operation.
     * @callback module:api/ACHApi~getBankLinkUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchBankLinkResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get bank link
     * @param {String} nucleusBankLinkId nucleus_bank_link_id
     * @param {module:api/ACHApi~getBankLinkUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchBankLinkResponseVO}
     */
    this.getBankLinkUsingGet = function(nucleusBankLinkId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusBankLinkId' is set
      if (nucleusBankLinkId === undefined || nucleusBankLinkId === null) {
        throw new Error("Missing the required parameter 'nucleusBankLinkId' when calling getBankLinkUsingGet");
      }


      var pathParams = {
        'nucleus_bank_link_id': nucleusBankLinkId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = AchBankLinkResponseVO;

      return this.apiClient.callApi(
        '/ach/bank_link/{nucleus_bank_link_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getBankLinksForReserveAccountUsingGet operation.
     * @callback module:api/ACHApi~getBankLinksForReserveAccountUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/AchBankLinkResponseVO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get bank links for a reserve account
     * @param {module:api/ACHApi~getBankLinksForReserveAccountUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/AchBankLinkResponseVO>}
     */
    this.getBankLinksForReserveAccountUsingGet = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [AchBankLinkResponseVO];

      return this.apiClient.callApi(
        '/ach/bank_link/reserve', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getBusinessBalanceUsingGet operation.
     * @callback module:api/ACHApi~getBusinessBalanceUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchBalanceResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get business balance
     * @param {String} businessId business_id
     * @param {module:api/ACHApi~getBusinessBalanceUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchBalanceResponseVO}
     */
    this.getBusinessBalanceUsingGet = function(businessId, callback) {
      var postBody = null;

      // verify the required parameter 'businessId' is set
      if (businessId === undefined || businessId === null) {
        throw new Error("Missing the required parameter 'businessId' when calling getBusinessBalanceUsingGet");
      }


      var pathParams = {
        'business_id': businessId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = AchBalanceResponseVO;

      return this.apiClient.callApi(
        '/ach/business/balance/{business_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getClientBankLinksUsingGet operation.
     * @callback module:api/ACHApi~getClientBankLinksUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/AchBankLinkResponseVO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get client bank links
     * @param {String} nucleusClientId nucleus_client_id
     * @param {module:api/ACHApi~getClientBankLinksUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/AchBankLinkResponseVO>}
     */
    this.getClientBankLinksUsingGet = function(nucleusClientId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusClientId' is set
      if (nucleusClientId === undefined || nucleusClientId === null) {
        throw new Error("Missing the required parameter 'nucleusClientId' when calling getClientBankLinksUsingGet");
      }


      var pathParams = {
        'nucleus_client_id': nucleusClientId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [AchBankLinkResponseVO];

      return this.apiClient.callApi(
        '/ach/bank_link/client/{nucleus_client_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getListOfClientAchTransfersUsingGet operation.
     * @callback module:api/ACHApi~getListOfClientAchTransfersUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageAchTransferResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get a list of client&#39;s ACH transfers
     * @param {String} nucleusClientId nucleus_client_id
     * @param {Object} opts Optional parameters
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/ACHApi~getListOfClientAchTransfersUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageAchTransferResponseVO}
     */
    this.getListOfClientAchTransfersUsingGet = function(nucleusClientId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'nucleusClientId' is set
      if (nucleusClientId === undefined || nucleusClientId === null) {
        throw new Error("Missing the required parameter 'nucleusClientId' when calling getListOfClientAchTransfersUsingGet");
      }


      var pathParams = {
        'nucleus_client_id': nucleusClientId
      };
      var queryParams = {
        'page': opts['page'],
        'size': opts['size']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = PageAchTransferResponseVO;

      return this.apiClient.callApi(
        '/ach/client/{nucleus_client_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getListOfTenantAchTransfersUsingGet operation.
     * @callback module:api/ACHApi~getListOfTenantAchTransfersUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageAchTransferResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get a list of tenant&#39;s ACH transfers
     * @param {Object} opts Optional parameters
     * @param {Date} opts.endDate end_date
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {Date} opts.startDate start_date
     * @param {String} opts.status status
     * @param {module:api/ACHApi~getListOfTenantAchTransfersUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageAchTransferResponseVO}
     */
    this.getListOfTenantAchTransfersUsingGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'end_date': opts['endDate'],
        'page': opts['page'],
        'size': opts['size'],
        'start_date': opts['startDate'],
        'status': opts['status']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = PageAchTransferResponseVO;

      return this.apiClient.callApi(
        '/ach', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the submitAchTransferUsingPost operation.
     * @callback module:api/ACHApi~submitAchTransferUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchTransferResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Submit an ACH transfer
     * @param {module:model/AchTransferRequestCO} transferRequest transferRequest
     * @param {module:api/ACHApi~submitAchTransferUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchTransferResponseVO}
     */
    this.submitAchTransferUsingPost = function(transferRequest, callback) {
      var postBody = transferRequest;

      // verify the required parameter 'transferRequest' is set
      if (transferRequest === undefined || transferRequest === null) {
        throw new Error("Missing the required parameter 'transferRequest' when calling submitAchTransferUsingPost");
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
      var returnType = AchTransferResponseVO;

      return this.apiClient.callApi(
        '/ach', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateBankLinkUsingPut operation.
     * @callback module:api/ACHApi~updateBankLinkUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AchBankLinkResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update bank link
     * @param {String} nucleusBankLinkId nucleus_bank_link_id
     * @param {module:api/ACHApi~updateBankLinkUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AchBankLinkResponseVO}
     */
    this.updateBankLinkUsingPut = function(nucleusBankLinkId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusBankLinkId' is set
      if (nucleusBankLinkId === undefined || nucleusBankLinkId === null) {
        throw new Error("Missing the required parameter 'nucleusBankLinkId' when calling updateBankLinkUsingPut");
      }


      var pathParams = {
        'nucleus_bank_link_id': nucleusBankLinkId
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
      var returnType = AchBankLinkResponseVO;

      return this.apiClient.callApi(
        '/ach/bank_link/{nucleus_bank_link_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
