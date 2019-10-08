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
    instance = new atom_api.MortgageSchedulePeriod();
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

  describe('MortgageSchedulePeriod', function() {
    it('should create an instance of MortgageSchedulePeriod', function() {
      // uncomment below and update the code to test MortgageSchedulePeriod
      //var instance = new atom_api.MortgageSchedulePeriod();
      //expect(instance).to.be.a(atom_api.MortgageSchedulePeriod);
    });

    it('should have the property payment (base name: "Payment")', function() {
      // uncomment below and update the code to test the property payment
      //var instance = new atom_api.MortgageSchedulePeriod();
      //expect(instance).to.be();
    });

    it('should have the property principal (base name: "Principal")', function() {
      // uncomment below and update the code to test the property principal
      //var instance = new atom_api.MortgageSchedulePeriod();
      //expect(instance).to.be();
    });

    it('should have the property interest (base name: "Interest")', function() {
      // uncomment below and update the code to test the property interest
      //var instance = new atom_api.MortgageSchedulePeriod();
      //expect(instance).to.be();
    });

    it('should have the property cumulativePayment (base name: "Cumulative_Payment")', function() {
      // uncomment below and update the code to test the property cumulativePayment
      //var instance = new atom_api.MortgageSchedulePeriod();
      //expect(instance).to.be();
    });

    it('should have the property cumulativePrincipal (base name: "Cumulative_Principal")', function() {
      // uncomment below and update the code to test the property cumulativePrincipal
      //var instance = new atom_api.MortgageSchedulePeriod();
      //expect(instance).to.be();
    });

    it('should have the property cumulativeInterest (base name: "Cumulative_Interest")', function() {
      // uncomment below and update the code to test the property cumulativeInterest
      //var instance = new atom_api.MortgageSchedulePeriod();
      //expect(instance).to.be();
    });

    it('should have the property balance (base name: "Balance")', function() {
      // uncomment below and update the code to test the property balance
      //var instance = new atom_api.MortgageSchedulePeriod();
      //expect(instance).to.be();
    });

  });

}));
