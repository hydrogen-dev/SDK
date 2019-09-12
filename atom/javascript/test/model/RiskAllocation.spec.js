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
    instance = new atom_api.RiskAllocation();
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

  describe('RiskAllocation', function() {
    it('should create an instance of RiskAllocation', function() {
      // uncomment below and update the code to test RiskAllocation
      //var instance = new atom_api.RiskAllocation();
      //expect(instance).to.be.a(atom_api.RiskAllocation);
    });

    it('should have the property riskScore (base name: "risk_score")', function() {
      // uncomment below and update the code to test the property riskScore
      //var instance = new atom_api.RiskAllocation();
      //expect(instance).to.be();
    });

    it('should have the property allocationMethod (base name: "allocation_method")', function() {
      // uncomment below and update the code to test the property allocationMethod
      //var instance = new atom_api.RiskAllocation();
      //expect(instance).to.be();
    });

    it('should have the property optConfig (base name: "opt_config")', function() {
      // uncomment below and update the code to test the property optConfig
      //var instance = new atom_api.RiskAllocation();
      //expect(instance).to.be();
    });

    it('should have the property allocations (base name: "allocations")', function() {
      // uncomment below and update the code to test the property allocations
      //var instance = new atom_api.RiskAllocation();
      //expect(instance).to.be();
    });

    it('should have the property useProxyData (base name: "use_proxy_data")', function() {
      // uncomment below and update the code to test the property useProxyData
      //var instance = new atom_api.RiskAllocation();
      //expect(instance).to.be();
    });

  });

}));
