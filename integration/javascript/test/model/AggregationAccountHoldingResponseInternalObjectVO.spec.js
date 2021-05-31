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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.HydrogenIntegrationApi);
  }
}(this, function(expect, HydrogenIntegrationApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenIntegrationApi.AggregationAccountHoldingResponseInternalObjectVO();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AggregationAccountHoldingResponseInternalObjectVO', function() {
    it('should create an instance of AggregationAccountHoldingResponseInternalObjectVO', function() {
      // uncomment below and update the code to test AggregationAccountHoldingResponseInternalObjectVO
      //var instane = new HydrogenIntegrationApi.AggregationAccountHoldingResponseInternalObjectVO();
      //expect(instance).to.be.a(HydrogenIntegrationApi.AggregationAccountHoldingResponseInternalObjectVO);
    });

    it('should have the property body (base name: "body")', function() {
      // uncomment below and update the code to test the property body
      //var instane = new HydrogenIntegrationApi.AggregationAccountHoldingResponseInternalObjectVO();
      //expect(instance).to.be();
    });

    it('should have the property statusCode (base name: "status_code")', function() {
      // uncomment below and update the code to test the property statusCode
      //var instane = new HydrogenIntegrationApi.AggregationAccountHoldingResponseInternalObjectVO();
      //expect(instance).to.be();
    });

  });

}));
