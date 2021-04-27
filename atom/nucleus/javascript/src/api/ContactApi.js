/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.0
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
    define(['ApiClient', 'model/Contact', 'model/CustomerRevenue', 'model/PageContact', 'model/PageCustomerRevenue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Contact'), require('../model/CustomerRevenue'), require('../model/PageContact'), require('../model/PageCustomerRevenue'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.ContactApi = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.Contact, root.HydrogenNucleusApi.CustomerRevenue, root.HydrogenNucleusApi.PageContact, root.HydrogenNucleusApi.PageCustomerRevenue);
  }
}(this, function(ApiClient, Contact, CustomerRevenue, PageContact, PageCustomerRevenue) {
  'use strict';

  /**
   * Contact service.
   * @module api/ContactApi
   * @version 1.9.0
   */

  /**
   * Constructs a new ContactApi. 
   * @alias module:api/ContactApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createContactUsingPost operation.
     * @callback module:api/ContactApi~createContactUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Contact} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a contact
     * Create a new contact, with your firm.
     * @param {module:model/Contact} contact contact
     * @param {module:api/ContactApi~createContactUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Contact}
     */
    this.createContactUsingPost = function(contact, callback) {
      var postBody = contact;

      // verify the required parameter 'contact' is set
      if (contact === undefined || contact === null) {
        throw new Error("Missing the required parameter 'contact' when calling createContactUsingPost");
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
      var returnType = Contact;

      return this.apiClient.callApi(
        '/nucleus/v1/contact', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createCustomerRevenueUsingPost operation.
     * @callback module:api/ContactApi~createCustomerRevenueUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CustomerRevenue} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a customer revenue
     * Create a new customer revenue, with your firm.
     * @param {module:model/CustomerRevenue} customerRevenue customerRevenue
     * @param {module:api/ContactApi~createCustomerRevenueUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CustomerRevenue}
     */
    this.createCustomerRevenueUsingPost = function(customerRevenue, callback) {
      var postBody = customerRevenue;

      // verify the required parameter 'customerRevenue' is set
      if (customerRevenue === undefined || customerRevenue === null) {
        throw new Error("Missing the required parameter 'customerRevenue' when calling createCustomerRevenueUsingPost");
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
      var returnType = CustomerRevenue;

      return this.apiClient.callApi(
        '/nucleus/v1/customer_revenue', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteContactUsingDelete operation.
     * @callback module:api/ContactApi~deleteContactUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a contact
     * Delete a contact. 
     * @param {String} contactId UUID contact_id
     * @param {module:api/ContactApi~deleteContactUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteContactUsingDelete = function(contactId, callback) {
      var postBody = null;

      // verify the required parameter 'contactId' is set
      if (contactId === undefined || contactId === null) {
        throw new Error("Missing the required parameter 'contactId' when calling deleteContactUsingDelete");
      }


      var pathParams = {
        'contact_id': contactId
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
        '/nucleus/v1/contact/{contact_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteCustomerRevenueUsingDelete operation.
     * @callback module:api/ContactApi~deleteCustomerRevenueUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a customer revenue
     * Delete a customer revenue. 
     * @param {String} customerRevenueId UUID customer_revenue_id
     * @param {module:api/ContactApi~deleteCustomerRevenueUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteCustomerRevenueUsingDelete = function(customerRevenueId, callback) {
      var postBody = null;

      // verify the required parameter 'customerRevenueId' is set
      if (customerRevenueId === undefined || customerRevenueId === null) {
        throw new Error("Missing the required parameter 'customerRevenueId' when calling deleteCustomerRevenueUsingDelete");
      }


      var pathParams = {
        'customer_revenue_id': customerRevenueId
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
        '/nucleus/v1/customer_revenue/{customer_revenue_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getContactAllUsingGet operation.
     * @callback module:api/ContactApi~getContactAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageContact} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all contact
     * List all contact. 
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to update_date)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/ContactApi~getContactAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageContact}
     */
    this.getContactAllUsingGet = function(opts, callback) {
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
      var returnType = PageContact;

      return this.apiClient.callApi(
        '/nucleus/v1/contact', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getContactUsingGet operation.
     * @callback module:api/ContactApi~getContactUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Contact} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve a contact
     * Retrieve a contact. 
     * @param {String} contactId UUID contact_id
     * @param {module:api/ContactApi~getContactUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Contact}
     */
    this.getContactUsingGet = function(contactId, callback) {
      var postBody = null;

      // verify the required parameter 'contactId' is set
      if (contactId === undefined || contactId === null) {
        throw new Error("Missing the required parameter 'contactId' when calling getContactUsingGet");
      }


      var pathParams = {
        'contact_id': contactId
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
      var returnType = Contact;

      return this.apiClient.callApi(
        '/nucleus/v1/contact/{contact_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getCustomerRevenueAllUsingGet operation.
     * @callback module:api/ContactApi~getCustomerRevenueAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageCustomerRevenue} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all customer revenue
     * List all customer revenue. 
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.currencyConversion currency_conversion
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to update_date)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/ContactApi~getCustomerRevenueAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageCustomerRevenue}
     */
    this.getCustomerRevenueAllUsingGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'ascending': opts['ascending'],
        'currency_conversion': opts['currencyConversion'],
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
      var returnType = PageCustomerRevenue;

      return this.apiClient.callApi(
        '/nucleus/v1/customer_revenue', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getCustomerRevenueUsingGet operation.
     * @callback module:api/ContactApi~getCustomerRevenueUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CustomerRevenue} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve a customer revenue
     * Retrieve a customer revenue. 
     * @param {String} customerRevenueId UUID customer_revenue_id
     * @param {Object} opts Optional parameters
     * @param {String} opts.currencyConversion USD
     * @param {module:api/ContactApi~getCustomerRevenueUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CustomerRevenue}
     */
    this.getCustomerRevenueUsingGet = function(customerRevenueId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'customerRevenueId' is set
      if (customerRevenueId === undefined || customerRevenueId === null) {
        throw new Error("Missing the required parameter 'customerRevenueId' when calling getCustomerRevenueUsingGet");
      }


      var pathParams = {
        'customer_revenue_id': customerRevenueId
      };
      var queryParams = {
        'currency_conversion': opts['currencyConversion']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = CustomerRevenue;

      return this.apiClient.callApi(
        '/nucleus/v1/customer_revenue/{customer_revenue_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateContactUsingPut operation.
     * @callback module:api/ContactApi~updateContactUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Contact} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update a contact
     * Update a contact. 
     * @param {module:model/Contact} contact contact
     * @param {String} contactId UUID contact_id
     * @param {module:api/ContactApi~updateContactUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Contact}
     */
    this.updateContactUsingPut = function(contact, contactId, callback) {
      var postBody = contact;

      // verify the required parameter 'contact' is set
      if (contact === undefined || contact === null) {
        throw new Error("Missing the required parameter 'contact' when calling updateContactUsingPut");
      }

      // verify the required parameter 'contactId' is set
      if (contactId === undefined || contactId === null) {
        throw new Error("Missing the required parameter 'contactId' when calling updateContactUsingPut");
      }


      var pathParams = {
        'contact_id': contactId
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
      var returnType = Contact;

      return this.apiClient.callApi(
        '/nucleus/v1/contact/{contact_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateCustomerRevenueUsingPut operation.
     * @callback module:api/ContactApi~updateCustomerRevenueUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CustomerRevenue} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update a customer revenue
     * Update a customer revenue. 
     * @param {module:model/CustomerRevenue} customerRevenue customer_revenue
     * @param {String} customerRevenueId UUID customer_revenue_id
     * @param {module:api/ContactApi~updateCustomerRevenueUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CustomerRevenue}
     */
    this.updateCustomerRevenueUsingPut = function(customerRevenue, customerRevenueId, callback) {
      var postBody = customerRevenue;

      // verify the required parameter 'customerRevenue' is set
      if (customerRevenue === undefined || customerRevenue === null) {
        throw new Error("Missing the required parameter 'customerRevenue' when calling updateCustomerRevenueUsingPut");
      }

      // verify the required parameter 'customerRevenueId' is set
      if (customerRevenueId === undefined || customerRevenueId === null) {
        throw new Error("Missing the required parameter 'customerRevenueId' when calling updateCustomerRevenueUsingPut");
      }


      var pathParams = {
        'customer_revenue_id': customerRevenueId
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
      var returnType = CustomerRevenue;

      return this.apiClient.callApi(
        '/nucleus/v1/customer_revenue/{customer_revenue_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));