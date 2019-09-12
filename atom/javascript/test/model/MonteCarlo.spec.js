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
    instance = new atom_api.MonteCarlo();
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

  describe('MonteCarlo', function() {
    it('should create an instance of MonteCarlo', function() {
      // uncomment below and update the code to test MonteCarlo
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be.a(atom_api.MonteCarlo);
    });

    it('should have the property cf (base name: "cf")', function() {
      // uncomment below and update the code to test the property cf
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property mu (base name: "mu")', function() {
      // uncomment below and update the code to test the property mu
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property sigma (base name: "sigma")', function() {
      // uncomment below and update the code to test the property sigma
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property retMod (base name: "ret_mod")', function() {
      // uncomment below and update the code to test the property retMod
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property initBal (base name: "init_bal")', function() {
      // uncomment below and update the code to test the property initBal
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property n (base name: "n")', function() {
      // uncomment below and update the code to test the property n
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property removeOutliers (base name: "remove_outliers")', function() {
      // uncomment below and update the code to test the property removeOutliers
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property resultType (base name: "result_type")', function() {
      // uncomment below and update the code to test the property resultType
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property p (base name: "p")', function() {
      // uncomment below and update the code to test the property p
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property minBal (base name: "min_bal")', function() {
      // uncomment below and update the code to test the property minBal
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property maxBal (base name: "max_bal")', function() {
      // uncomment below and update the code to test the property maxBal
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property minSample (base name: "min_sample")', function() {
      // uncomment below and update the code to test the property minSample
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

    it('should have the property maxSample (base name: "max_sample")', function() {
      // uncomment below and update the code to test the property maxSample
      //var instance = new atom_api.MonteCarlo();
      //expect(instance).to.be();
    });

  });

}));
