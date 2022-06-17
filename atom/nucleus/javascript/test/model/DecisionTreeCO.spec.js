/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
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
    factory(root.expect, root.HydrogenNucleusApi);
  }
}(this, function(expect, HydrogenNucleusApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenNucleusApi.DecisionTreeCO();
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

  describe('DecisionTreeCO', function() {
    it('should create an instance of DecisionTreeCO', function() {
      // uncomment below and update the code to test DecisionTreeCO
      //var instane = new HydrogenNucleusApi.DecisionTreeCO();
      //expect(instance).to.be.a(HydrogenNucleusApi.DecisionTreeCO);
    });

    it('should have the property answers (base name: "answers")', function() {
      // uncomment below and update the code to test the property answers
      //var instane = new HydrogenNucleusApi.DecisionTreeCO();
      //expect(instance).to.be();
    });

    it('should have the property entityType (base name: "entity_type")', function() {
      // uncomment below and update the code to test the property entityType
      //var instane = new HydrogenNucleusApi.DecisionTreeCO();
      //expect(instance).to.be();
    });

  });

}));
