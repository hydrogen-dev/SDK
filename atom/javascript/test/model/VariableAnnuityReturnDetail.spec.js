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
 * Swagger Codegen version: 2.4.8-SNAPSHOT
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
    instance = new atom_api.VariableAnnuityReturnDetail();
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

  describe('VariableAnnuityReturnDetail', function() {
    it('should create an instance of VariableAnnuityReturnDetail', function() {
      // uncomment below and update the code to test VariableAnnuityReturnDetail
      //var instance = new atom_api.VariableAnnuityReturnDetail();
      //expect(instance).to.be.a(atom_api.VariableAnnuityReturnDetail);
    });

    it('should have the property periodEarnings (base name: "period_earnings")', function() {
      // uncomment below and update the code to test the property periodEarnings
      //var instance = new atom_api.VariableAnnuityReturnDetail();
      //expect(instance).to.be();
    });

    it('should have the property periodContribution (base name: "period_contribution")', function() {
      // uncomment below and update the code to test the property periodContribution
      //var instance = new atom_api.VariableAnnuityReturnDetail();
      //expect(instance).to.be();
    });

    it('should have the property periodWithdrawal (base name: "period_withdrawal")', function() {
      // uncomment below and update the code to test the property periodWithdrawal
      //var instance = new atom_api.VariableAnnuityReturnDetail();
      //expect(instance).to.be();
    });

    it('should have the property periodTaxes (base name: "period_taxes")', function() {
      // uncomment below and update the code to test the property periodTaxes
      //var instance = new atom_api.VariableAnnuityReturnDetail();
      //expect(instance).to.be();
    });

    it('should have the property cumulativeEarnings (base name: "cumulative_earnings")', function() {
      // uncomment below and update the code to test the property cumulativeEarnings
      //var instance = new atom_api.VariableAnnuityReturnDetail();
      //expect(instance).to.be();
    });

    it('should have the property cumulativeContributions (base name: "cumulative_contributions")', function() {
      // uncomment below and update the code to test the property cumulativeContributions
      //var instance = new atom_api.VariableAnnuityReturnDetail();
      //expect(instance).to.be();
    });

    it('should have the property cumulativeWithdrawals (base name: "cumulative_withdrawals")', function() {
      // uncomment below and update the code to test the property cumulativeWithdrawals
      //var instance = new atom_api.VariableAnnuityReturnDetail();
      //expect(instance).to.be();
    });

    it('should have the property cumulativeTaxes (base name: "cumulative_taxes")', function() {
      // uncomment below and update the code to test the property cumulativeTaxes
      //var instance = new atom_api.VariableAnnuityReturnDetail();
      //expect(instance).to.be();
    });

    it('should have the property endingBalance (base name: "ending_balance")', function() {
      // uncomment below and update the code to test the property endingBalance
      //var instance = new atom_api.VariableAnnuityReturnDetail();
      //expect(instance).to.be();
    });

  });

}));
