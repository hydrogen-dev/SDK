/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.2-SNAPSHOT
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
    factory(root.expect, root.atom_api);
  }
}(this, function(expect, atom_api) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new atom_api.BudgetPayload();
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

  describe('BudgetPayload', function() {
    it('should create an instance of BudgetPayload', function() {
      // uncomment below and update the code to test BudgetPayload
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be.a(atom_api.BudgetPayload);
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property budget (base name: "budget")', function() {
      // uncomment below and update the code to test the property budget
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property frequencyUnit (base name: "frequency_unit")', function() {
      // uncomment below and update the code to test the property frequencyUnit
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property frequency (base name: "frequency")', function() {
      // uncomment below and update the code to test the property frequency
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property accountId (base name: "account_id")', function() {
      // uncomment below and update the code to test the property accountId
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property goalId (base name: "goal_id")', function() {
      // uncomment below and update the code to test the property goalId
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property startDate (base name: "start_date")', function() {
      // uncomment below and update the code to test the property startDate
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property endDate (base name: "end date")', function() {
      // uncomment below and update the code to test the property endDate
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instance = new atom_api.BudgetPayload();
      //expect(instance).to.be();
    });

  });

}));
