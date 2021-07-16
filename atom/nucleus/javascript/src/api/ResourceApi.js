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
    define(['ApiClient', 'model/Country', 'model/Currency', 'model/FxRate', 'model/FxRateView', 'model/Institution', 'model/MXMerchantRes', 'model/MerchantCategoryCode', 'model/PageInstitution', 'model/State', 'model/StatisticResourceVO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Country'), require('../model/Currency'), require('../model/FxRate'), require('../model/FxRateView'), require('../model/Institution'), require('../model/MXMerchantRes'), require('../model/MerchantCategoryCode'), require('../model/PageInstitution'), require('../model/State'), require('../model/StatisticResourceVO'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.ResourceApi = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.Country, root.HydrogenNucleusApi.Currency, root.HydrogenNucleusApi.FxRate, root.HydrogenNucleusApi.FxRateView, root.HydrogenNucleusApi.Institution, root.HydrogenNucleusApi.MXMerchantRes, root.HydrogenNucleusApi.MerchantCategoryCode, root.HydrogenNucleusApi.PageInstitution, root.HydrogenNucleusApi.State);
  }
}(this, function(ApiClient, Country, Currency, FxRate, FxRateView, Institution, MXMerchantRes, MerchantCategoryCode, PageInstitution, State, StatisticResourceVO) {
  'use strict';

  /**
   * Resource service.
   * @module api/ResourceApi
   * @version 1.9.3
   */

  /**
   * Constructs a new ResourceApi. 
   * @alias module:api/ResourceApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createFxRateBulkUsingPost operation.
     * @callback module:api/ResourceApi~createFxRateBulkUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/FxRate>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a bulk fxRate
     * Create a bulk fxRate.
     * @param {Array.<module:model/FxRate>} fxRateList fxRateList
     * @param {module:api/ResourceApi~createFxRateBulkUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/FxRate>}
     */
    this.createFxRateBulkUsingPost = function(fxRateList, callback) {
      var postBody = fxRateList;

      // verify the required parameter 'fxRateList' is set
      if (fxRateList === undefined || fxRateList === null) {
        throw new Error("Missing the required parameter 'fxRateList' when calling createFxRateBulkUsingPost");
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
      var returnType = [FxRate];

      return this.apiClient.callApi(
        '/nucleus/v1/resource/fx_rate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createInstitutionUsingPost operation.
     * @callback module:api/ResourceApi~createInstitutionUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Institution} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a institution
     * Create a new institution.
     * @param {module:model/Institution} institution institution
     * @param {module:api/ResourceApi~createInstitutionUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Institution}
     */
    this.createInstitutionUsingPost = function(institution, callback) {
      var postBody = institution;

      // verify the required parameter 'institution' is set
      if (institution === undefined || institution === null) {
        throw new Error("Missing the required parameter 'institution' when calling createInstitutionUsingPost");
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
      var returnType = Institution;

      return this.apiClient.callApi(
        '/nucleus/v1/resource/institution', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteInstitutionUsingDelete operation.
     * @callback module:api/ResourceApi~deleteInstitutionUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a institution
     * Delete a institution. 
     * @param {String} institutionId UUID institution_id
     * @param {module:api/ResourceApi~deleteInstitutionUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteInstitutionUsingDelete = function(institutionId, callback) {
      var postBody = null;

      // verify the required parameter 'institutionId' is set
      if (institutionId === undefined || institutionId === null) {
        throw new Error("Missing the required parameter 'institutionId' when calling deleteInstitutionUsingDelete");
      }


      var pathParams = {
        'institution_id': institutionId
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
        '/nucleus/v1/resource/institution/{institution_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAccountResultForMapping operation.
     * @callback module:api/ResourceApi~getAccountResultForMappingCallback
     * @param {String} error Error message, if any.
     * @param {Array.<Object>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all account category mapping
     * Get all account category mapping
     * @param {Object} opts Optional parameters
     * @param {String} opts.filter filter
     * @param {String} opts.tenantName tenant_name
     * @param {String} opts.vendorName vendor_name
     * @param {module:api/ResourceApi~getAccountResultForMappingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<Object>}
     */
    this.getAccountResultForMapping = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'filter': opts['filter'],
        'tenant_name': opts['tenantName'],
        'vendor_name': opts['vendorName']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [Object];

      return this.apiClient.callApi(
        '/nucleus/v1/resource/account_category', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAllCountryUsingGet operation.
     * @callback module:api/ResourceApi~getAllCountryUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Country>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get All Countries
     * Get All Countries. 
     * @param {module:api/ResourceApi~getAllCountryUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Country>}
     */
    this.getAllCountryUsingGet = function(callback) {
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
      var returnType = [Country];

      return this.apiClient.callApi(
        '/nucleus/v1/resource/country', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAllCurrencyUsingGet operation.
     * @callback module:api/ResourceApi~getAllCurrencyUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Currency>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get All Currencies
     * Get All Currencies. 
     * @param {module:api/ResourceApi~getAllCurrencyUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Currency>}
     */
    this.getAllCurrencyUsingGet = function(callback) {
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
      var returnType = [Currency];

      return this.apiClient.callApi(
        '/nucleus/v1/resource/currency', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAllMerchantCategoryCodeUsingGet operation.
     * @callback module:api/ResourceApi~getAllMerchantCategoryCodeUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/MerchantCategoryCode>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get All Merchant Category Codes
     * Get All Merchant Category Codes.
     * @param {Object} opts Optional parameters
     * @param {String} opts.filter filter
     * @param {module:api/ResourceApi~getAllMerchantCategoryCodeUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/MerchantCategoryCode>}
     */
    this.getAllMerchantCategoryCodeUsingGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'filter': opts['filter']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [MerchantCategoryCode];

      return this.apiClient.callApi(
        '/nucleus/v1/resource/merchant_category_code', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAllStatesUsingGet operation.
     * @callback module:api/ResourceApi~getAllStatesUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/State>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all state resource
     * Get the information for all possible state resource.
     * @param {Object} opts Optional parameters
     * @param {String} opts.countryCode country_code (default to US)
     * @param {module:api/ResourceApi~getAllStatesUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/State>}
     */
    this.getAllStatesUsingGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'country_code': opts['countryCode']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [State];

      return this.apiClient.callApi(
        '/nucleus/v1/resource/state', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAllStatisticsUsingGet operation.
     * @callback module:api/ResourceApi~getAllStatisticsUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': [StatisticResourceVO]}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all statistic resource
     * Get the information for all possible statistic resource.
     * @param {module:api/ResourceApi~getAllStatisticsUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': [StatisticResourceVO]}>}
     */
    this.getAllStatisticsUsingGet = function(callback) {
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
      var returnType = {'String': [StatisticResourceVO]};

      return this.apiClient.callApi(
        '/nucleus/v1/resource/statistic', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getCurrencyExchangeRateAllUsingGet operation.
     * @callback module:api/ResourceApi~getCurrencyExchangeRateAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/FxRateView>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all fxRates
     * Get information for all fxRates defined for your firm.
     * @param {Object} opts Optional parameters
     * @param {String} opts.filter filter
     * @param {module:api/ResourceApi~getCurrencyExchangeRateAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/FxRateView>}
     */
    this.getCurrencyExchangeRateAllUsingGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'filter': opts['filter']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['*/*'];
      var returnType = [FxRateView];

      return this.apiClient.callApi(
        '/nucleus/v1/resource/fx_rate', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getInstitutionAllUsingGet operation.
     * @callback module:api/ResourceApi~getInstitutionAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageInstitution} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all institutions
     * List all institution.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to update_date)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/ResourceApi~getInstitutionAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageInstitution}
     */
    this.getInstitutionAllUsingGet = function(opts, callback) {
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
      var returnType = PageInstitution;

      return this.apiClient.callApi(
        '/nucleus/v1/resource/institution', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getInstitutionUsingGet operation.
     * @callback module:api/ResourceApi~getInstitutionUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Institution} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve a institution
     * Retrieve a institution. 
     * @param {String} institutionId UUID institution_id
     * @param {module:api/ResourceApi~getInstitutionUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Institution}
     */
    this.getInstitutionUsingGet = function(institutionId, callback) {
      var postBody = null;

      // verify the required parameter 'institutionId' is set
      if (institutionId === undefined || institutionId === null) {
        throw new Error("Missing the required parameter 'institutionId' when calling getInstitutionUsingGet");
      }


      var pathParams = {
        'institution_id': institutionId
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
      var returnType = Institution;

      return this.apiClient.callApi(
        '/nucleus/v1/resource/institution/{institution_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getMerchantsAllUsingGet operation.
     * @callback module:api/ResourceApi~getMerchantsAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MXMerchantRes} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all merchants
     * List all merchants.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to id)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/ResourceApi~getMerchantsAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MXMerchantRes}
     */
    this.getMerchantsAllUsingGet = function(opts, callback) {
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
      var returnType = MXMerchantRes;

      return this.apiClient.callApi(
        '/nucleus/v1/resource/merchant', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTransactionResultForMapping operation.
     * @callback module:api/ResourceApi~getTransactionResultForMappingCallback
     * @param {String} error Error message, if any.
     * @param {Array.<Object>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all transaction category mapping
     * Get all transaction category mapping
     * @param {Object} opts Optional parameters
     * @param {String} opts.filter filter
     * @param {String} opts.tenantName tenant_name
     * @param {String} opts.vendorName vendor_name
     * @param {module:api/ResourceApi~getTransactionResultForMappingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<Object>}
     */
    this.getTransactionResultForMapping = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'filter': opts['filter'],
        'tenant_name': opts['tenantName'],
        'vendor_name': opts['vendorName']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [Object];

      return this.apiClient.callApi(
        '/nucleus/v1/resource/transaction_category', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateInstitutionUsingPut operation.
     * @callback module:api/ResourceApi~updateInstitutionUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Institution} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update a institution
     * Update a institution.
     * @param {module:model/Institution} institution institution
     * @param {String} institutionId UUID institution_id
     * @param {module:api/ResourceApi~updateInstitutionUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Institution}
     */
    this.updateInstitutionUsingPut = function(institution, institutionId, callback) {
      var postBody = institution;

      // verify the required parameter 'institution' is set
      if (institution === undefined || institution === null) {
        throw new Error("Missing the required parameter 'institution' when calling updateInstitutionUsingPut");
      }

      // verify the required parameter 'institutionId' is set
      if (institutionId === undefined || institutionId === null) {
        throw new Error("Missing the required parameter 'institutionId' when calling updateInstitutionUsingPut");
      }


      var pathParams = {
        'institution_id': institutionId
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
      var returnType = Institution;

      return this.apiClient.callApi(
        '/nucleus/v1/resource/institution/{institution_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
