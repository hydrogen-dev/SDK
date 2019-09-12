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
    instance = new atom_api.VariableAnnuityPayload();
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

  describe('VariableAnnuityPayload', function() {
    it('should create an instance of VariableAnnuityPayload', function() {
      // uncomment below and update the code to test VariableAnnuityPayload
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be.a(atom_api.VariableAnnuityPayload);
    });

    it('should have the property portfolioTickers (base name: "portfolio_tickers")', function() {
      // uncomment below and update the code to test the property portfolioTickers
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property portfolioWeights (base name: "portfolio_weights")', function() {
      // uncomment below and update the code to test the property portfolioWeights
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property accumulationHorizon (base name: "accumulation_horizon")', function() {
      // uncomment below and update the code to test the property accumulationHorizon
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property decumulationHorizon (base name: "decumulation_horizon")', function() {
      // uncomment below and update the code to test the property decumulationHorizon
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property initialBalance (base name: "initial_balance")', function() {
      // uncomment below and update the code to test the property initialBalance
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property frequencyInterval (base name: "frequency_interval")', function() {
      // uncomment below and update the code to test the property frequencyInterval
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property depositSchedule (base name: "deposit_schedule")', function() {
      // uncomment below and update the code to test the property depositSchedule
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property inflationRate (base name: "inflation_rate")', function() {
      // uncomment below and update the code to test the property inflationRate
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property taxRate (base name: "tax_rate")', function() {
      // uncomment below and update the code to test the property taxRate
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property annuitizationRate (base name: "annuitization_rate")', function() {
      // uncomment below and update the code to test the property annuitizationRate
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property guaranteedRateBenefit (base name: "guaranteed_rate_benefit")', function() {
      // uncomment below and update the code to test the property guaranteedRateBenefit
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property guaranteedAccumulationBenefit (base name: "guaranteed_accumulation_benefit")', function() {
      // uncomment below and update the code to test the property guaranteedAccumulationBenefit
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property n (base name: "n")', function() {
      // uncomment below and update the code to test the property n
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property resultType (base name: "result_type")', function() {
      // uncomment below and update the code to test the property resultType
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property p (base name: "p")', function() {
      // uncomment below and update the code to test the property p
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property removeOutliers (base name: "remove_outliers")', function() {
      // uncomment below and update the code to test the property removeOutliers
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property startDate (base name: "start_date")', function() {
      // uncomment below and update the code to test the property startDate
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property endDate (base name: "end_date")', function() {
      // uncomment below and update the code to test the property endDate
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property tradingDaysPerYear (base name: "trading_days_per_year")', function() {
      // uncomment below and update the code to test the property tradingDaysPerYear
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

    it('should have the property useProxyData (base name: "use_proxy_data")', function() {
      // uncomment below and update the code to test the property useProxyData
      //var instance = new atom_api.VariableAnnuityPayload();
      //expect(instance).to.be();
    });

  });

}));
