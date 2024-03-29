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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.HydrogenNucleusApi);
  }
}(this, function(expect, HydrogenNucleusApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenNucleusApi.Score();
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

  describe('Score', function() {
    it('should create an instance of Score', function() {
      // uncomment below and update the code to test Score
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be.a(HydrogenNucleusApi.Score);
    });

    it('should have the property accountId (base name: "account_id")', function() {
      // uncomment below and update the code to test the property accountId
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property allocationId (base name: "allocation_id")', function() {
      // uncomment below and update the code to test the property allocationId
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property benchmarkId (base name: "benchmark_id")', function() {
      // uncomment below and update the code to test the property benchmarkId
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property goalId (base name: "goal_id")', function() {
      // uncomment below and update the code to test the property goalId
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property modelId (base name: "model_id")', function() {
      // uncomment below and update the code to test the property modelId
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property portfolioId (base name: "portfolio_id")', function() {
      // uncomment below and update the code to test the property portfolioId
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property scoreTimeStamp (base name: "score_time_stamp")', function() {
      // uncomment below and update the code to test the property scoreTimeStamp
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property scoreType (base name: "score_type")', function() {
      // uncomment below and update the code to test the property scoreType
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property scoreValue (base name: "score_value")', function() {
      // uncomment below and update the code to test the property scoreValue
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property securityId (base name: "security_id")', function() {
      // uncomment below and update the code to test the property securityId
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.Score();
      //expect(instance).to.be();
    });

  });

}));
