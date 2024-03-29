/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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
    define(['ApiClient', 'model/PageScore', 'model/Score'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/PageScore'), require('../model/Score'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.ScoreApi = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.PageScore, root.HydrogenNucleusApi.Score);
  }
}(this, function(ApiClient, PageScore, Score) {
  'use strict';

  /**
   * Score service.
   * @module api/ScoreApi
   * @version 1.9.5
   */

  /**
   * Constructs a new ScoreApi. 
   * @alias module:api/ScoreApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createScoreUsingPost operation.
     * @callback module:api/ScoreApi~createScoreUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Score} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a score
     * Create a score for a client, account, goal, portfolio, allocation, model, benchmark or security.
     * @param {module:model/Score} score score
     * @param {module:api/ScoreApi~createScoreUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Score}
     */
    this.createScoreUsingPost = function(score, callback) {
      var postBody = score;

      // verify the required parameter 'score' is set
      if (score === undefined || score === null) {
        throw new Error("Missing the required parameter 'score' when calling createScoreUsingPost");
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
      var returnType = Score;

      return this.apiClient.callApi(
        '/nucleus/v1/score', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteScoreUsingDelete operation.
     * @callback module:api/ScoreApi~deleteScoreUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a score
     * Permanently delete a score
     * @param {String} scoreId UUID score_id
     * @param {module:api/ScoreApi~deleteScoreUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteScoreUsingDelete = function(scoreId, callback) {
      var postBody = null;

      // verify the required parameter 'scoreId' is set
      if (scoreId === undefined || scoreId === null) {
        throw new Error("Missing the required parameter 'scoreId' when calling deleteScoreUsingDelete");
      }


      var pathParams = {
        'score_id': scoreId
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
        '/nucleus/v1/score/{score_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getScoreAllUsingGet operation.
     * @callback module:api/ScoreApi~getScoreAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageScore} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all scores
     * Get information for all scores stored for your firm.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to update_date)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/ScoreApi~getScoreAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageScore}
     */
    this.getScoreAllUsingGet = function(opts, callback) {
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
      var returnType = PageScore;

      return this.apiClient.callApi(
        '/nucleus/v1/score', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getScoreUsingGet operation.
     * @callback module:api/ScoreApi~getScoreUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Score} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve a score
     * Retrieve the information for a specific score associated with a client, account, goal, portfolio, allocation, model, benchmark or security.
     * @param {String} scoreId UUID score_id
     * @param {module:api/ScoreApi~getScoreUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Score}
     */
    this.getScoreUsingGet = function(scoreId, callback) {
      var postBody = null;

      // verify the required parameter 'scoreId' is set
      if (scoreId === undefined || scoreId === null) {
        throw new Error("Missing the required parameter 'scoreId' when calling getScoreUsingGet");
      }


      var pathParams = {
        'score_id': scoreId
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
      var returnType = Score;

      return this.apiClient.callApi(
        '/nucleus/v1/score/{score_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateScoreUsingPut operation.
     * @callback module:api/ScoreApi~updateScoreUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Score} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update a score
     * Update the information for a score.
     * @param {module:model/Score} score score
     * @param {String} scoreId UUID score_id
     * @param {module:api/ScoreApi~updateScoreUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Score}
     */
    this.updateScoreUsingPut = function(score, scoreId, callback) {
      var postBody = score;

      // verify the required parameter 'score' is set
      if (score === undefined || score === null) {
        throw new Error("Missing the required parameter 'score' when calling updateScoreUsingPut");
      }

      // verify the required parameter 'scoreId' is set
      if (scoreId === undefined || scoreId === null) {
        throw new Error("Missing the required parameter 'scoreId' when calling updateScoreUsingPut");
      }


      var pathParams = {
        'score_id': scoreId
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
      var returnType = Score;

      return this.apiClient.callApi(
        '/nucleus/v1/score/{score_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
