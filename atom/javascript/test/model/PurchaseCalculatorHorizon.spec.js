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
    instance = new atom_api.PurchaseCalculatorHorizon();
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

  describe('PurchaseCalculatorHorizon', function() {
    it('should create an instance of PurchaseCalculatorHorizon', function() {
      // uncomment below and update the code to test PurchaseCalculatorHorizon
      //var instance = new atom_api.PurchaseCalculatorHorizon();
      //expect(instance).to.be.a(atom_api.PurchaseCalculatorHorizon);
    });

    it('should have the property purchaseAmount (base name: "purchase_amount")', function() {
      // uncomment below and update the code to test the property purchaseAmount
      //var instance = new atom_api.PurchaseCalculatorHorizon();
      //expect(instance).to.be();
    });

    it('should have the property portfolioReturn (base name: "portfolio_return")', function() {
      // uncomment below and update the code to test the property portfolioReturn
      //var instance = new atom_api.PurchaseCalculatorHorizon();
      //expect(instance).to.be();
    });

    it('should have the property horizonFrequencyInterval (base name: "horizon_frequency_interval")', function() {
      // uncomment below and update the code to test the property horizonFrequencyInterval
      //var instance = new atom_api.PurchaseCalculatorHorizon();
      //expect(instance).to.be();
    });

    it('should have the property currentSavings (base name: "current_savings")', function() {
      // uncomment below and update the code to test the property currentSavings
      //var instance = new atom_api.PurchaseCalculatorHorizon();
      //expect(instance).to.be();
    });

    it('should have the property depositSchedule (base name: "deposit_schedule")', function() {
      // uncomment below and update the code to test the property depositSchedule
      //var instance = new atom_api.PurchaseCalculatorHorizon();
      //expect(instance).to.be();
    });

    it('should have the property inflationRate (base name: "inflation_rate")', function() {
      // uncomment below and update the code to test the property inflationRate
      //var instance = new atom_api.PurchaseCalculatorHorizon();
      //expect(instance).to.be();
    });

    it('should have the property investmentTax (base name: "investment_tax")', function() {
      // uncomment below and update the code to test the property investmentTax
      //var instance = new atom_api.PurchaseCalculatorHorizon();
      //expect(instance).to.be();
    });

  });

}));
