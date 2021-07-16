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
    define(['ApiClient', 'model/Answer', 'model/PageAnswer', 'model/PageQuestion', 'model/PageQuestionnaire', 'model/Question', 'model/Questionnaire'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Answer'), require('../model/PageAnswer'), require('../model/PageQuestion'), require('../model/PageQuestionnaire'), require('../model/Question'), require('../model/Questionnaire'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.QuestionnaireApi = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.Answer, root.HydrogenNucleusApi.PageAnswer, root.HydrogenNucleusApi.PageQuestion, root.HydrogenNucleusApi.PageQuestionnaire, root.HydrogenNucleusApi.Question, root.HydrogenNucleusApi.Questionnaire);
  }
}(this, function(ApiClient, Answer, PageAnswer, PageQuestion, PageQuestionnaire, Question, Questionnaire) {
  'use strict';

  /**
   * Questionnaire service.
   * @module api/QuestionnaireApi
   * @version 1.9.3
   */

  /**
   * Constructs a new QuestionnaireApi. 
   * @alias module:api/QuestionnaireApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createAnswerUsingPost operation.
     * @callback module:api/QuestionnaireApi~createAnswerUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Answer} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an answer
     * Create a new answer for question.
     * @param {module:model/Answer} answer answer
     * @param {module:api/QuestionnaireApi~createAnswerUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Answer}
     */
    this.createAnswerUsingPost = function(answer, callback) {
      var postBody = answer;

      // verify the required parameter 'answer' is set
      if (answer === undefined || answer === null) {
        throw new Error("Missing the required parameter 'answer' when calling createAnswerUsingPost");
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
      var returnType = Answer;

      return this.apiClient.callApi(
        '/nucleus/v1/answer', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createQuestionUsingPost operation.
     * @callback module:api/QuestionnaireApi~createQuestionUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Question} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a question
     * Create a new question for questionnaire.
     * @param {module:model/Question} question question
     * @param {module:api/QuestionnaireApi~createQuestionUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Question}
     */
    this.createQuestionUsingPost = function(question, callback) {
      var postBody = question;

      // verify the required parameter 'question' is set
      if (question === undefined || question === null) {
        throw new Error("Missing the required parameter 'question' when calling createQuestionUsingPost");
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
      var returnType = Question;

      return this.apiClient.callApi(
        '/nucleus/v1/question', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createQuestionnaireUsingPost operation.
     * @callback module:api/QuestionnaireApi~createQuestionnaireUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Questionnaire} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a questionnaire
     * Create a new questionnaire for your firm.
     * @param {module:model/Questionnaire} questionnaire questionnaire
     * @param {module:api/QuestionnaireApi~createQuestionnaireUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Questionnaire}
     */
    this.createQuestionnaireUsingPost = function(questionnaire, callback) {
      var postBody = questionnaire;

      // verify the required parameter 'questionnaire' is set
      if (questionnaire === undefined || questionnaire === null) {
        throw new Error("Missing the required parameter 'questionnaire' when calling createQuestionnaireUsingPost");
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
      var returnType = Questionnaire;

      return this.apiClient.callApi(
        '/nucleus/v1/questionnaire', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteAnswerUsingDelete operation.
     * @callback module:api/QuestionnaireApi~deleteAnswerUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete an answer
     * Delete an answer for the question
     * @param {String} answerId UUID answer_id
     * @param {module:api/QuestionnaireApi~deleteAnswerUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteAnswerUsingDelete = function(answerId, callback) {
      var postBody = null;

      // verify the required parameter 'answerId' is set
      if (answerId === undefined || answerId === null) {
        throw new Error("Missing the required parameter 'answerId' when calling deleteAnswerUsingDelete");
      }


      var pathParams = {
        'answer_id': answerId
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
        '/nucleus/v1/answer/{answer_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteQuestionUsingDelete operation.
     * @callback module:api/QuestionnaireApi~deleteQuestionUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a question
     * Delete an answer for the question
     * @param {String} questionId UUID question_id
     * @param {module:api/QuestionnaireApi~deleteQuestionUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteQuestionUsingDelete = function(questionId, callback) {
      var postBody = null;

      // verify the required parameter 'questionId' is set
      if (questionId === undefined || questionId === null) {
        throw new Error("Missing the required parameter 'questionId' when calling deleteQuestionUsingDelete");
      }


      var pathParams = {
        'question_id': questionId
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
        '/nucleus/v1/question/{question_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteQuestionnaireUsingDelete operation.
     * @callback module:api/QuestionnaireApi~deleteQuestionnaireUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a questionnaire
     * Permanently delete a questionnaire for your firm.
     * @param {String} questionnaireId UUID questionnaire_id
     * @param {module:api/QuestionnaireApi~deleteQuestionnaireUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteQuestionnaireUsingDelete = function(questionnaireId, callback) {
      var postBody = null;

      // verify the required parameter 'questionnaireId' is set
      if (questionnaireId === undefined || questionnaireId === null) {
        throw new Error("Missing the required parameter 'questionnaireId' when calling deleteQuestionnaireUsingDelete");
      }


      var pathParams = {
        'questionnaire_id': questionnaireId
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
        '/nucleus/v1/questionnaire/{questionnaire_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAnswerAllUsingGet operation.
     * @callback module:api/QuestionnaireApi~getAnswerAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageAnswer} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all Answers
     * Get information for all Answers
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to label)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/QuestionnaireApi~getAnswerAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageAnswer}
     */
    this.getAnswerAllUsingGet = function(opts, callback) {
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
      var returnType = PageAnswer;

      return this.apiClient.callApi(
        '/nucleus/v1/answer', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAnswerUsingGet operation.
     * @callback module:api/QuestionnaireApi~getAnswerUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Answer} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve an answer
     * Retrieve the information for an answer for question
     * @param {String} answerId UUID answer_id
     * @param {module:api/QuestionnaireApi~getAnswerUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Answer}
     */
    this.getAnswerUsingGet = function(answerId, callback) {
      var postBody = null;

      // verify the required parameter 'answerId' is set
      if (answerId === undefined || answerId === null) {
        throw new Error("Missing the required parameter 'answerId' when calling getAnswerUsingGet");
      }


      var pathParams = {
        'answer_id': answerId
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
      var returnType = Answer;

      return this.apiClient.callApi(
        '/nucleus/v1/answer/{answer_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getQuestionAllUsingGet operation.
     * @callback module:api/QuestionnaireApi~getQuestionAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageQuestion} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all Questions
     * Get information for all Questions
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to order_index)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/QuestionnaireApi~getQuestionAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageQuestion}
     */
    this.getQuestionAllUsingGet = function(opts, callback) {
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
      var returnType = PageQuestion;

      return this.apiClient.callApi(
        '/nucleus/v1/question', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getQuestionUsingGet operation.
     * @callback module:api/QuestionnaireApi~getQuestionUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Question} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve a question
     * Retrieve the information for a question for questionnaire
     * @param {String} questionId UUID question_id
     * @param {module:api/QuestionnaireApi~getQuestionUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Question}
     */
    this.getQuestionUsingGet = function(questionId, callback) {
      var postBody = null;

      // verify the required parameter 'questionId' is set
      if (questionId === undefined || questionId === null) {
        throw new Error("Missing the required parameter 'questionId' when calling getQuestionUsingGet");
      }


      var pathParams = {
        'question_id': questionId
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
      var returnType = Question;

      return this.apiClient.callApi(
        '/nucleus/v1/question/{question_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getQuestionnaireAllUsingGet operation.
     * @callback module:api/QuestionnaireApi~getQuestionnaireAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageQuestionnaire} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all questionnaires
     * Get the information for all questionnaires defined for your firm.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to update_date)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/QuestionnaireApi~getQuestionnaireAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageQuestionnaire}
     */
    this.getQuestionnaireAllUsingGet = function(opts, callback) {
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
      var returnType = PageQuestionnaire;

      return this.apiClient.callApi(
        '/nucleus/v1/questionnaire', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getQuestionnaireUsingGet operation.
     * @callback module:api/QuestionnaireApi~getQuestionnaireUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Questionnaire} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve a questionnaire
     * Retrieve the information for a questionnaire for your firm.
     * @param {String} questionnaireId UUID questionnaire_id
     * @param {module:api/QuestionnaireApi~getQuestionnaireUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Questionnaire}
     */
    this.getQuestionnaireUsingGet = function(questionnaireId, callback) {
      var postBody = null;

      // verify the required parameter 'questionnaireId' is set
      if (questionnaireId === undefined || questionnaireId === null) {
        throw new Error("Missing the required parameter 'questionnaireId' when calling getQuestionnaireUsingGet");
      }


      var pathParams = {
        'questionnaire_id': questionnaireId
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
      var returnType = Questionnaire;

      return this.apiClient.callApi(
        '/nucleus/v1/questionnaire/{questionnaire_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateAnswerUsingPut operation.
     * @callback module:api/QuestionnaireApi~updateAnswerUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Answer} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update an answer
     * Update a answer for question.
     * @param {module:model/Answer} answer answer
     * @param {String} answerId UUID answer_id
     * @param {module:api/QuestionnaireApi~updateAnswerUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Answer}
     */
    this.updateAnswerUsingPut = function(answer, answerId, callback) {
      var postBody = answer;

      // verify the required parameter 'answer' is set
      if (answer === undefined || answer === null) {
        throw new Error("Missing the required parameter 'answer' when calling updateAnswerUsingPut");
      }

      // verify the required parameter 'answerId' is set
      if (answerId === undefined || answerId === null) {
        throw new Error("Missing the required parameter 'answerId' when calling updateAnswerUsingPut");
      }


      var pathParams = {
        'answer_id': answerId
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
      var returnType = Answer;

      return this.apiClient.callApi(
        '/nucleus/v1/answer/{answer_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateQuestionUsingPut operation.
     * @callback module:api/QuestionnaireApi~updateQuestionUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Question} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update a question.
     * Update a question for questionnaire.
     * @param {module:model/Question} question question
     * @param {String} questionId UUID question_id
     * @param {module:api/QuestionnaireApi~updateQuestionUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Question}
     */
    this.updateQuestionUsingPut = function(question, questionId, callback) {
      var postBody = question;

      // verify the required parameter 'question' is set
      if (question === undefined || question === null) {
        throw new Error("Missing the required parameter 'question' when calling updateQuestionUsingPut");
      }

      // verify the required parameter 'questionId' is set
      if (questionId === undefined || questionId === null) {
        throw new Error("Missing the required parameter 'questionId' when calling updateQuestionUsingPut");
      }


      var pathParams = {
        'question_id': questionId
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
      var returnType = Question;

      return this.apiClient.callApi(
        '/nucleus/v1/question/{question_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateQuestionnaireUsingPut operation.
     * @callback module:api/QuestionnaireApi~updateQuestionnaireUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Questionnaire} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update a questionnaire
     * Update a questionnaire for your firm.
     * @param {module:model/Questionnaire} questionnaire questionnaire
     * @param {String} questionnaireId UUID questionnaire_id
     * @param {module:api/QuestionnaireApi~updateQuestionnaireUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Questionnaire}
     */
    this.updateQuestionnaireUsingPut = function(questionnaire, questionnaireId, callback) {
      var postBody = questionnaire;

      // verify the required parameter 'questionnaire' is set
      if (questionnaire === undefined || questionnaire === null) {
        throw new Error("Missing the required parameter 'questionnaire' when calling updateQuestionnaireUsingPut");
      }

      // verify the required parameter 'questionnaireId' is set
      if (questionnaireId === undefined || questionnaireId === null) {
        throw new Error("Missing the required parameter 'questionnaireId' when calling updateQuestionnaireUsingPut");
      }


      var pathParams = {
        'questionnaire_id': questionnaireId
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
      var returnType = Questionnaire;

      return this.apiClient.callApi(
        '/nucleus/v1/questionnaire/{questionnaire_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
