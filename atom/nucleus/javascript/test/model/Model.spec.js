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
    instance = new HydrogenNucleusApi.Model();
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

  describe('Model', function() {
    it('should create an instance of Model', function() {
      // uncomment below and update the code to test Model
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be.a(HydrogenNucleusApi.Model);
    });

    it('should have the property benchmarkId (base name: "benchmark_id")', function() {
      // uncomment below and update the code to test the property benchmarkId
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property cashSec (base name: "cash_sec")', function() {
      // uncomment below and update the code to test the property cashSec
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property category (base name: "category")', function() {
      // uncomment below and update the code to test the property category
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property defaultDriftFactor (base name: "default_drift_factor")', function() {
      // uncomment below and update the code to test the property defaultDriftFactor
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property downside (base name: "downside")', function() {
      // uncomment below and update the code to test the property downside
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property driftRebal (base name: "drift_rebal")', function() {
      // uncomment below and update the code to test the property driftRebal
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property isActive (base name: "is_active")', function() {
      // uncomment below and update the code to test the property isActive
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property nodeMap (base name: "node_map")', function() {
      // uncomment below and update the code to test the property nodeMap
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property periodRebal (base name: "period_rebal")', function() {
      // uncomment below and update the code to test the property periodRebal
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property rebalancePeriod (base name: "rebalance_period")', function() {
      // uncomment below and update the code to test the property rebalancePeriod
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property safeSec (base name: "safe_sec")', function() {
      // uncomment below and update the code to test the property safeSec
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property secRotation (base name: "sec_rotation")', function() {
      // uncomment below and update the code to test the property secRotation
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property taxEfficiencyId (base name: "tax_efficiency_id")', function() {
      // uncomment below and update the code to test the property taxEfficiencyId
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.Model();
      //expect(instance).to.be();
    });

  });

}));
