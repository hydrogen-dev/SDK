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
    instance = new atom_api.LifeInsuranceNeedsBreakdown();
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

  describe('LifeInsuranceNeedsBreakdown', function() {
    it('should create an instance of LifeInsuranceNeedsBreakdown', function() {
      // uncomment below and update the code to test LifeInsuranceNeedsBreakdown
      //var instance = new atom_api.LifeInsuranceNeedsBreakdown();
      //expect(instance).to.be.a(atom_api.LifeInsuranceNeedsBreakdown);
    });

    it('should have the property mortgage (base name: "mortgage")', function() {
      // uncomment below and update the code to test the property mortgage
      //var instance = new atom_api.LifeInsuranceNeedsBreakdown();
      //expect(instance).to.be();
    });

    it('should have the property other (base name: "other")', function() {
      // uncomment below and update the code to test the property other
      //var instance = new atom_api.LifeInsuranceNeedsBreakdown();
      //expect(instance).to.be();
    });

    it('should have the property education (base name: "education")', function() {
      // uncomment below and update the code to test the property education
      //var instance = new atom_api.LifeInsuranceNeedsBreakdown();
      //expect(instance).to.be();
    });

    it('should have the property incomeReplacement (base name: "income_replacement")', function() {
      // uncomment below and update the code to test the property incomeReplacement
      //var instance = new atom_api.LifeInsuranceNeedsBreakdown();
      //expect(instance).to.be();
    });

    it('should have the property beneficiaryBequest (base name: "beneficiary_bequest")', function() {
      // uncomment below and update the code to test the property beneficiaryBequest
      //var instance = new atom_api.LifeInsuranceNeedsBreakdown();
      //expect(instance).to.be();
    });

    it('should have the property endOfLife (base name: "end_of_life")', function() {
      // uncomment below and update the code to test the property endOfLife
      //var instance = new atom_api.LifeInsuranceNeedsBreakdown();
      //expect(instance).to.be();
    });

  });

}));
