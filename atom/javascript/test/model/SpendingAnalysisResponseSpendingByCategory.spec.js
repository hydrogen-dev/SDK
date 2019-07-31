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
    instance = new atom_api.SpendingAnalysisResponseSpendingByCategory();
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

  describe('SpendingAnalysisResponseSpendingByCategory', function() {
    it('should create an instance of SpendingAnalysisResponseSpendingByCategory', function() {
      // uncomment below and update the code to test SpendingAnalysisResponseSpendingByCategory
      //var instance = new atom_api.SpendingAnalysisResponseSpendingByCategory();
      //expect(instance).to.be.a(atom_api.SpendingAnalysisResponseSpendingByCategory);
    });

    it('should have the property category (base name: "category")', function() {
      // uncomment below and update the code to test the property category
      //var instance = new atom_api.SpendingAnalysisResponseSpendingByCategory();
      //expect(instance).to.be();
    });

    it('should have the property value (base name: "value")', function() {
      // uncomment below and update the code to test the property value
      //var instance = new atom_api.SpendingAnalysisResponseSpendingByCategory();
      //expect(instance).to.be();
    });

    it('should have the property weight (base name: "weight")', function() {
      // uncomment below and update the code to test the property weight
      //var instance = new atom_api.SpendingAnalysisResponseSpendingByCategory();
      //expect(instance).to.be();
    });

    it('should have the property benchmarkValue (base name: "benchmark_value")', function() {
      // uncomment below and update the code to test the property benchmarkValue
      //var instance = new atom_api.SpendingAnalysisResponseSpendingByCategory();
      //expect(instance).to.be();
    });

    it('should have the property benchmarkWeight (base name: "benchmark_weight")', function() {
      // uncomment below and update the code to test the property benchmarkWeight
      //var instance = new atom_api.SpendingAnalysisResponseSpendingByCategory();
      //expect(instance).to.be();
    });

    it('should have the property subcategories (base name: "subcategories")', function() {
      // uncomment below and update the code to test the property subcategories
      //var instance = new atom_api.SpendingAnalysisResponseSpendingByCategory();
      //expect(instance).to.be();
    });

    it('should have the property spendingByMerchant (base name: "spending_by_merchant")', function() {
      // uncomment below and update the code to test the property spendingByMerchant
      //var instance = new atom_api.SpendingAnalysisResponseSpendingByCategory();
      //expect(instance).to.be();
    });

    it('should have the property outlierTransactions (base name: "outlier_transactions")', function() {
      // uncomment below and update the code to test the property outlierTransactions
      //var instance = new atom_api.SpendingAnalysisResponseSpendingByCategory();
      //expect(instance).to.be();
    });

  });

}));
