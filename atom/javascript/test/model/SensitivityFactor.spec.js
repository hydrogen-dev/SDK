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
    instance = new atom_api.SensitivityFactor();
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

  describe('SensitivityFactor', function() {
    it('should create an instance of SensitivityFactor', function() {
      // uncomment below and update the code to test SensitivityFactor
      //var instance = new atom_api.SensitivityFactor();
      //expect(instance).to.be.a(atom_api.SensitivityFactor);
    });

    it('should have the property ticker (base name: "ticker")', function() {
      // uncomment below and update the code to test the property ticker
      //var instance = new atom_api.SensitivityFactor();
      //expect(instance).to.be();
    });

    it('should have the property changeAmount (base name: "change_amount")', function() {
      // uncomment below and update the code to test the property changeAmount
      //var instance = new atom_api.SensitivityFactor();
      //expect(instance).to.be();
    });

    it('should have the property changeDuration (base name: "change_duration")', function() {
      // uncomment below and update the code to test the property changeDuration
      //var instance = new atom_api.SensitivityFactor();
      //expect(instance).to.be();
    });

    it('should have the property lag (base name: "lag")', function() {
      // uncomment below and update the code to test the property lag
      //var instance = new atom_api.SensitivityFactor();
      //expect(instance).to.be();
    });

  });

}));
