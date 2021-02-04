/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.18
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/RtpBankLinkRequestCO', 'model/RtpBankLinkResponseVO', 'model/RtpTransferRequestCO', 'model/RtpTransferResponseVO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/RtpBankLinkRequestCO'), require('../model/RtpBankLinkResponseVO'), require('../model/RtpTransferRequestCO'), require('../model/RtpTransferResponseVO'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.RTPApi = factory(root.HydrogenIntegrationApi.ApiClient, root.HydrogenIntegrationApi.RtpBankLinkRequestCO, root.HydrogenIntegrationApi.RtpBankLinkResponseVO, root.HydrogenIntegrationApi.RtpTransferRequestCO, root.HydrogenIntegrationApi.RtpTransferResponseVO);
  }
}(this, function(ApiClient, RtpBankLinkRequestCO, RtpBankLinkResponseVO, RtpTransferRequestCO, RtpTransferResponseVO) {
  'use strict';

  /**
   * RTP service.
   * @module api/RTPApi
   * @version 1.2.1
   */

  /**
   * Constructs a new RTPApi. 
   * @alias module:api/RTPApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the cancelRtpTransferUsingDelete operation.
     * @callback module:api/RTPApi~cancelRtpTransferUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RtpTransferResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel the RTP transfer
     * @param {String} nucleusFundingId nucleus_funding_id
     * @param {module:api/RTPApi~cancelRtpTransferUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RtpTransferResponseVO}
     */
    this.cancelRtpTransferUsingDelete = function(nucleusFundingId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusFundingId' is set
      if (nucleusFundingId === undefined || nucleusFundingId === null) {
        throw new Error("Missing the required parameter 'nucleusFundingId' when calling cancelRtpTransferUsingDelete");
      }


      var pathParams = {
        'nucleus_funding_id': nucleusFundingId
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
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = RtpTransferResponseVO;

      return this.apiClient.callApi(
        '/rtp/{nucleus_funding_id}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createBankLinkUsingPost2 operation.
     * @callback module:api/RTPApi~createBankLinkUsingPost2Callback
     * @param {String} error Error message, if any.
     * @param {module:model/RtpBankLinkResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create bank link
     * @param {module:model/RtpBankLinkRequestCO} request request
     * @param {module:api/RTPApi~createBankLinkUsingPost2Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RtpBankLinkResponseVO}
     */
    this.createBankLinkUsingPost2 = function(request, callback) {
      var postBody = request;

      // verify the required parameter 'request' is set
      if (request === undefined || request === null) {
        throw new Error("Missing the required parameter 'request' when calling createBankLinkUsingPost2");
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
      var returnType = RtpBankLinkResponseVO;

      return this.apiClient.callApi(
        '/rtp/bank_link', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteBankLinkUsingDelete2 operation.
     * @callback module:api/RTPApi~deleteBankLinkUsingDelete2Callback
     * @param {String} error Error message, if any.
     * @param {module:model/RtpBankLinkResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete bank link
     * @param {String} nucleusBankLinkId nucleus_bank_link_id
     * @param {module:api/RTPApi~deleteBankLinkUsingDelete2Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RtpBankLinkResponseVO}
     */
    this.deleteBankLinkUsingDelete2 = function(nucleusBankLinkId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusBankLinkId' is set
      if (nucleusBankLinkId === undefined || nucleusBankLinkId === null) {
        throw new Error("Missing the required parameter 'nucleusBankLinkId' when calling deleteBankLinkUsingDelete2");
      }


      var pathParams = {
        'nucleus_bank_link_id': nucleusBankLinkId
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
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = RtpBankLinkResponseVO;

      return this.apiClient.callApi(
        '/rtp/bank_link/{nucleus_bank_link_id}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getBankLinkUsingGet2 operation.
     * @callback module:api/RTPApi~getBankLinkUsingGet2Callback
     * @param {String} error Error message, if any.
     * @param {module:model/RtpBankLinkResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get bank link
     * @param {String} nucleusBankLinkId nucleus_bank_link_id
     * @param {module:api/RTPApi~getBankLinkUsingGet2Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RtpBankLinkResponseVO}
     */
    this.getBankLinkUsingGet2 = function(nucleusBankLinkId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusBankLinkId' is set
      if (nucleusBankLinkId === undefined || nucleusBankLinkId === null) {
        throw new Error("Missing the required parameter 'nucleusBankLinkId' when calling getBankLinkUsingGet2");
      }


      var pathParams = {
        'nucleus_bank_link_id': nucleusBankLinkId
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
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = RtpBankLinkResponseVO;

      return this.apiClient.callApi(
        '/rtp/bank_link/{nucleus_bank_link_id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getClientBankLinksUsingGet1 operation.
     * @callback module:api/RTPApi~getClientBankLinksUsingGet1Callback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RtpBankLinkResponseVO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get client bank links
     * @param {String} nucleusClientId nucleus_client_id
     * @param {module:api/RTPApi~getClientBankLinksUsingGet1Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RtpBankLinkResponseVO>}
     */
    this.getClientBankLinksUsingGet1 = function(nucleusClientId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusClientId' is set
      if (nucleusClientId === undefined || nucleusClientId === null) {
        throw new Error("Missing the required parameter 'nucleusClientId' when calling getClientBankLinksUsingGet1");
      }


      var pathParams = {
        'nucleus_client_id': nucleusClientId
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
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [RtpBankLinkResponseVO];

      return this.apiClient.callApi(
        '/rtp/bank_link/client/{nucleus_client_id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getListOfRtpTransfersUsingGet operation.
     * @callback module:api/RTPApi~getListOfRtpTransfersUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RtpTransferResponseVO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get a list of Rtp transfers
     * @param {String} nucleusClientId nucleus_client_id
     * @param {module:api/RTPApi~getListOfRtpTransfersUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RtpTransferResponseVO>}
     */
    this.getListOfRtpTransfersUsingGet = function(nucleusClientId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusClientId' is set
      if (nucleusClientId === undefined || nucleusClientId === null) {
        throw new Error("Missing the required parameter 'nucleusClientId' when calling getListOfRtpTransfersUsingGet");
      }


      var pathParams = {
        'nucleus_client_id': nucleusClientId
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
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [RtpTransferResponseVO];

      return this.apiClient.callApi(
        '/rtp/client/{nucleus_client_id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getRtpTransferUsingGet operation.
     * @callback module:api/RTPApi~getRtpTransferUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RtpTransferResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the RTP transfer
     * @param {String} nucleusFundingId nucleus_funding_id
     * @param {module:api/RTPApi~getRtpTransferUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RtpTransferResponseVO}
     */
    this.getRtpTransferUsingGet = function(nucleusFundingId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusFundingId' is set
      if (nucleusFundingId === undefined || nucleusFundingId === null) {
        throw new Error("Missing the required parameter 'nucleusFundingId' when calling getRtpTransferUsingGet");
      }


      var pathParams = {
        'nucleus_funding_id': nucleusFundingId
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
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = RtpTransferResponseVO;

      return this.apiClient.callApi(
        '/rtp/{nucleus_funding_id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the submitRtpTransferUsingPost operation.
     * @callback module:api/RTPApi~submitRtpTransferUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RtpTransferResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Submit a RTP transfer
     * @param {module:model/RtpTransferRequestCO} transferRequest transferRequest
     * @param {module:api/RTPApi~submitRtpTransferUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RtpTransferResponseVO}
     */
    this.submitRtpTransferUsingPost = function(transferRequest, callback) {
      var postBody = transferRequest;

      // verify the required parameter 'transferRequest' is set
      if (transferRequest === undefined || transferRequest === null) {
        throw new Error("Missing the required parameter 'transferRequest' when calling submitRtpTransferUsingPost");
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
      var returnType = RtpTransferResponseVO;

      return this.apiClient.callApi(
        '/rtp', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateBankLinkUsingPut2 operation.
     * @callback module:api/RTPApi~updateBankLinkUsingPut2Callback
     * @param {String} error Error message, if any.
     * @param {module:model/RtpBankLinkResponseVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update bank link
     * @param {String} nucleusBankLinkId nucleus_bank_link_id
     * @param {module:api/RTPApi~updateBankLinkUsingPut2Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RtpBankLinkResponseVO}
     */
    this.updateBankLinkUsingPut2 = function(nucleusBankLinkId, callback) {
      var postBody = null;

      // verify the required parameter 'nucleusBankLinkId' is set
      if (nucleusBankLinkId === undefined || nucleusBankLinkId === null) {
        throw new Error("Missing the required parameter 'nucleusBankLinkId' when calling updateBankLinkUsingPut2");
      }


      var pathParams = {
        'nucleus_bank_link_id': nucleusBankLinkId
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
      var returnType = RtpBankLinkResponseVO;

      return this.apiClient.callApi(
        '/rtp/bank_link/{nucleus_bank_link_id}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));