/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
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
    instance = new atom_api.GoalAssetWeightConfig();
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

  describe('GoalAssetWeightConfig', function() {
    it('should create an instance of GoalAssetWeightConfig', function() {
      // uncomment below and update the code to test GoalAssetWeightConfig
      //var instance = new atom_api.GoalAssetWeightConfig();
      //expect(instance).to.be.a(atom_api.GoalAssetWeightConfig);
    });

    it('should have the property uSEquities (base name: "US_Equities")', function() {
      // uncomment below and update the code to test the property uSEquities
      //var instance = new atom_api.GoalAssetWeightConfig();
      //expect(instance).to.be();
    });

    it('should have the property fixedIncome (base name: "Fixed_Income")', function() {
      // uncomment below and update the code to test the property fixedIncome
      //var instance = new atom_api.GoalAssetWeightConfig();
      //expect(instance).to.be();
    });

    it('should have the property intlEquities (base name: "Intl_Equities")', function() {
      // uncomment below and update the code to test the property intlEquities
      //var instance = new atom_api.GoalAssetWeightConfig();
      //expect(instance).to.be();
    });

    it('should have the property eMEquities (base name: "EM_Equities")', function() {
      // uncomment below and update the code to test the property eMEquities
      //var instance = new atom_api.GoalAssetWeightConfig();
      //expect(instance).to.be();
    });

    it('should have the property commodities (base name: "Commodities")', function() {
      // uncomment below and update the code to test the property commodities
      //var instance = new atom_api.GoalAssetWeightConfig();
      //expect(instance).to.be();
    });

  });

}));