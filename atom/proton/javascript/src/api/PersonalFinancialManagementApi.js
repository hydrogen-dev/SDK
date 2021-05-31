/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
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
    define(['ApiClient', 'model/BudgetCalculatorRequest', 'model/CashFlowAnalysisRequest', 'model/FeeAnalysisRequest', 'model/FinancialPictureRequest', 'model/RecurringTransactionAnalysisRequest', 'model/SpendingAnalysisRequest'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BudgetCalculatorRequest'), require('../model/CashFlowAnalysisRequest'), require('../model/FeeAnalysisRequest'), require('../model/FinancialPictureRequest'), require('../model/RecurringTransactionAnalysisRequest'), require('../model/SpendingAnalysisRequest'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.PersonalFinancialManagementApi = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.BudgetCalculatorRequest, root.HydrogenProtonApi.CashFlowAnalysisRequest, root.HydrogenProtonApi.FeeAnalysisRequest, root.HydrogenProtonApi.FinancialPictureRequest, root.HydrogenProtonApi.RecurringTransactionAnalysisRequest, root.HydrogenProtonApi.SpendingAnalysisRequest);
  }
}(this, function(ApiClient, BudgetCalculatorRequest, CashFlowAnalysisRequest, FeeAnalysisRequest, FinancialPictureRequest, RecurringTransactionAnalysisRequest, SpendingAnalysisRequest) {
  'use strict';

  /**
   * PersonalFinancialManagement service.
   * @module api/PersonalFinancialManagementApi
   * @version 1.9.0
   */

  /**
   * Constructs a new PersonalFinancialManagementApi. 
   * @alias module:api/PersonalFinancialManagementApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the budgetCalculator operation.
     * @callback module:api/PersonalFinancialManagementApi~budgetCalculatorCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Budget Calculator
     * Analyze spending against a defined budget
     * @param {module:model/BudgetCalculatorRequest} budgetCalculatorRequest Request payload for Budget Calculator
     * @param {module:api/PersonalFinancialManagementApi~budgetCalculatorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.budgetCalculator = function(budgetCalculatorRequest, callback) {
      var postBody = budgetCalculatorRequest;

      // verify the required parameter 'budgetCalculatorRequest' is set
      if (budgetCalculatorRequest === undefined || budgetCalculatorRequest === null) {
        throw new Error("Missing the required parameter 'budgetCalculatorRequest' when calling budgetCalculator");
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
        '/budget_calculator', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the cashFlowAnalysis operation.
     * @callback module:api/PersonalFinancialManagementApi~cashFlowAnalysisCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cash Flow Analysis
     * Analyze income, expenses, and net income
     * @param {module:model/CashFlowAnalysisRequest} cashFlowAnalysisRequest Request payload for Cash Flow Analysis
     * @param {module:api/PersonalFinancialManagementApi~cashFlowAnalysisCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.cashFlowAnalysis = function(cashFlowAnalysisRequest, callback) {
      var postBody = cashFlowAnalysisRequest;

      // verify the required parameter 'cashFlowAnalysisRequest' is set
      if (cashFlowAnalysisRequest === undefined || cashFlowAnalysisRequest === null) {
        throw new Error("Missing the required parameter 'cashFlowAnalysisRequest' when calling cashFlowAnalysis");
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
        '/cash_flow_analysis', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the feeAnalysis operation.
     * @callback module:api/PersonalFinancialManagementApi~feeAnalysisCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * RFee Analysis
     * Analyze fee data
     * @param {module:model/FeeAnalysisRequest} feeAnalysisRequest Request payload for Fee Analysis
     * @param {module:api/PersonalFinancialManagementApi~feeAnalysisCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.feeAnalysis = function(feeAnalysisRequest, callback) {
      var postBody = feeAnalysisRequest;

      // verify the required parameter 'feeAnalysisRequest' is set
      if (feeAnalysisRequest === undefined || feeAnalysisRequest === null) {
        throw new Error("Missing the required parameter 'feeAnalysisRequest' when calling feeAnalysis");
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
        '/fee_analysis', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the financialPicture operation.
     * @callback module:api/PersonalFinancialManagementApi~financialPictureCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Financial Picture
     * Assess assets, liabilities, and net worth
     * @param {module:model/FinancialPictureRequest} financialPictureRequest Request payload for Financial Picture
     * @param {module:api/PersonalFinancialManagementApi~financialPictureCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.financialPicture = function(financialPictureRequest, callback) {
      var postBody = financialPictureRequest;

      // verify the required parameter 'financialPictureRequest' is set
      if (financialPictureRequest === undefined || financialPictureRequest === null) {
        throw new Error("Missing the required parameter 'financialPictureRequest' when calling financialPicture");
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
        '/financial_picture', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the recurringTransactionAnalysis operation.
     * @callback module:api/PersonalFinancialManagementApi~recurringTransactionAnalysisCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Recurring Transaction Analysis
     * Analyze recurring transactions
     * @param {module:model/RecurringTransactionAnalysisRequest} recurringTransactionAnalysisRequest Request payload for Recurring Transaction Analysis
     * @param {module:api/PersonalFinancialManagementApi~recurringTransactionAnalysisCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.recurringTransactionAnalysis = function(recurringTransactionAnalysisRequest, callback) {
      var postBody = recurringTransactionAnalysisRequest;

      // verify the required parameter 'recurringTransactionAnalysisRequest' is set
      if (recurringTransactionAnalysisRequest === undefined || recurringTransactionAnalysisRequest === null) {
        throw new Error("Missing the required parameter 'recurringTransactionAnalysisRequest' when calling recurringTransactionAnalysis");
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
        '/recurring_transaction_analysis', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the spendingAnalysis operation.
     * @callback module:api/PersonalFinancialManagementApi~spendingAnalysisCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Spending Analysis
     * Analyze spending transaction activity
     * @param {module:model/SpendingAnalysisRequest} spendingAnalysisRequest Request payload for Spending Analysis
     * @param {module:api/PersonalFinancialManagementApi~spendingAnalysisCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.spendingAnalysis = function(spendingAnalysisRequest, callback) {
      var postBody = spendingAnalysisRequest;

      // verify the required parameter 'spendingAnalysisRequest' is set
      if (spendingAnalysisRequest === undefined || spendingAnalysisRequest === null) {
        throw new Error("Missing the required parameter 'spendingAnalysisRequest' when calling spendingAnalysis");
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
        '/spending_analysis', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
