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
    instance = new atom_api.RetirementCalculatorDepositamountResponse();
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

  describe('RetirementCalculatorDepositamountResponse', function() {
    it('should create an instance of RetirementCalculatorDepositamountResponse', function() {
      // uncomment below and update the code to test RetirementCalculatorDepositamountResponse
      //var instance = new atom_api.RetirementCalculatorDepositamountResponse();
      //expect(instance).to.be.a(atom_api.RetirementCalculatorDepositamountResponse);
    });

    it('should have the property depositAmount (base name: "deposit_amount")', function() {
      // uncomment below and update the code to test the property depositAmount
      //var instance = new atom_api.RetirementCalculatorDepositamountResponse();
      //expect(instance).to.be();
    });

    it('should have the property depositFrequencyInterval (base name: "deposit_frequency_interval")', function() {
      // uncomment below and update the code to test the property depositFrequencyInterval
      //var instance = new atom_api.RetirementCalculatorDepositamountResponse();
      //expect(instance).to.be();
    });

    it('should have the property projectedSavingsAtRetirement (base name: "projected_savings_at_retirement")', function() {
      // uncomment below and update the code to test the property projectedSavingsAtRetirement
      //var instance = new atom_api.RetirementCalculatorDepositamountResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalEarnings (base name: "total_earnings")', function() {
      // uncomment below and update the code to test the property totalEarnings
      //var instance = new atom_api.RetirementCalculatorDepositamountResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalContributions (base name: "total_contributions")', function() {
      // uncomment below and update the code to test the property totalContributions
      //var instance = new atom_api.RetirementCalculatorDepositamountResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalWithdrawals (base name: "total_withdrawals")', function() {
      // uncomment below and update the code to test the property totalWithdrawals
      //var instance = new atom_api.RetirementCalculatorDepositamountResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalTaxes (base name: "total_taxes")', function() {
      // uncomment below and update the code to test the property totalTaxes
      //var instance = new atom_api.RetirementCalculatorDepositamountResponse();
      //expect(instance).to.be();
    });

    it('should have the property returnDetails (base name: "return_details")', function() {
      // uncomment below and update the code to test the property returnDetails
      //var instance = new atom_api.RetirementCalculatorDepositamountResponse();
      //expect(instance).to.be();
    });

  });

}));
