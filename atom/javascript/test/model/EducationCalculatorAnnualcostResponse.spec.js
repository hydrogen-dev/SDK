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
    instance = new atom_api.EducationCalculatorAnnualcostResponse();
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

  describe('EducationCalculatorAnnualcostResponse', function() {
    it('should create an instance of EducationCalculatorAnnualcostResponse', function() {
      // uncomment below and update the code to test EducationCalculatorAnnualcostResponse
      //var instance = new atom_api.EducationCalculatorAnnualcostResponse();
      //expect(instance).to.be.a(atom_api.EducationCalculatorAnnualcostResponse);
    });

    it('should have the property totalAnnualCost (base name: "total_annual_cost")', function() {
      // uncomment below and update the code to test the property totalAnnualCost
      //var instance = new atom_api.EducationCalculatorAnnualcostResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalAnnualCostAdjusted (base name: "total_annual_cost_adjusted")', function() {
      // uncomment below and update the code to test the property totalAnnualCostAdjusted
      //var instance = new atom_api.EducationCalculatorAnnualcostResponse();
      //expect(instance).to.be();
    });

    it('should have the property projectedAccumulationSavings (base name: "projected_accumulation_savings")', function() {
      // uncomment below and update the code to test the property projectedAccumulationSavings
      //var instance = new atom_api.EducationCalculatorAnnualcostResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalEarnings (base name: "total_earnings")', function() {
      // uncomment below and update the code to test the property totalEarnings
      //var instance = new atom_api.EducationCalculatorAnnualcostResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalContributions (base name: "total_contributions")', function() {
      // uncomment below and update the code to test the property totalContributions
      //var instance = new atom_api.EducationCalculatorAnnualcostResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalCost (base name: "total_cost")', function() {
      // uncomment below and update the code to test the property totalCost
      //var instance = new atom_api.EducationCalculatorAnnualcostResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalTaxes (base name: "total_taxes")', function() {
      // uncomment below and update the code to test the property totalTaxes
      //var instance = new atom_api.EducationCalculatorAnnualcostResponse();
      //expect(instance).to.be();
    });

    it('should have the property returnDetails (base name: "return_details")', function() {
      // uncomment below and update the code to test the property returnDetails
      //var instance = new atom_api.EducationCalculatorAnnualcostResponse();
      //expect(instance).to.be();
    });

  });

}));
