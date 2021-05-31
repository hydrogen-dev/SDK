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
    instance = new HydrogenIntegrationApi.FinancialStatement();
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

  describe('FinancialStatement', function() {
    it('should create an instance of FinancialStatement', function() {
      // uncomment below and update the code to test FinancialStatement
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be.a(HydrogenIntegrationApi.FinancialStatement);
    });

    it('should have the property accountingMethod (base name: "accounting_method")', function() {
      // uncomment below and update the code to test the property accountingMethod
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property businessId (base name: "business_id")', function() {
      // uncomment below and update the code to test the property businessId
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property periodLength (base name: "period_length")', function() {
      // uncomment below and update the code to test the property periodLength
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property periodMonth (base name: "period_month")', function() {
      // uncomment below and update the code to test the property periodMonth
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property periodQuarter (base name: "period_quarter")', function() {
      // uncomment below and update the code to test the property periodQuarter
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property periodType (base name: "period_type")', function() {
      // uncomment below and update the code to test the property periodType
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property periodYear (base name: "period_year")', function() {
      // uncomment below and update the code to test the property periodYear
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property statementDate (base name: "statement_date")', function() {
      // uncomment below and update the code to test the property statementDate
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property statementType (base name: "statement_type")', function() {
      // uncomment below and update the code to test the property statementType
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property stats (base name: "stats")', function() {
      // uncomment below and update the code to test the property stats
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenIntegrationApi.FinancialStatement();
      //expect(instance).to.be();
    });

  });

}));
