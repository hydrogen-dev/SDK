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
    instance = new atom_api.HealthCheckResponse();
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

  describe('HealthCheckResponse', function() {
    it('should create an instance of HealthCheckResponse', function() {
      // uncomment below and update the code to test HealthCheckResponse
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be.a(atom_api.HealthCheckResponse);
    });

    it('should have the property liquidityRatioExpenses (base name: "liquidity_ratio_expenses")', function() {
      // uncomment below and update the code to test the property liquidityRatioExpenses
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be();
    });

    it('should have the property liquidityRatioLiabilities (base name: "liquidity_ratio_liabilities")', function() {
      // uncomment below and update the code to test the property liquidityRatioLiabilities
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be();
    });

    it('should have the property currentRatio (base name: "current_ratio")', function() {
      // uncomment below and update the code to test the property currentRatio
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be();
    });

    it('should have the property assetAllocationRatio (base name: "asset_allocation_ratio")', function() {
      // uncomment below and update the code to test the property assetAllocationRatio
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be();
    });

    it('should have the property savingsRatioGross (base name: "savings_ratio_gross")', function() {
      // uncomment below and update the code to test the property savingsRatioGross
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be();
    });

    it('should have the property savingsRatioNet (base name: "savings_ratio_net")', function() {
      // uncomment below and update the code to test the property savingsRatioNet
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalAssets (base name: "total_assets")', function() {
      // uncomment below and update the code to test the property totalAssets
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be();
    });

    it('should have the property netWorth (base name: "net_worth")', function() {
      // uncomment below and update the code to test the property netWorth
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be();
    });

    it('should have the property grossMonthlyIncome (base name: "gross_monthly_income")', function() {
      // uncomment below and update the code to test the property grossMonthlyIncome
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be();
    });

    it('should have the property monthlySurplus (base name: "monthly_surplus")', function() {
      // uncomment below and update the code to test the property monthlySurplus
      //var instance = new atom_api.HealthCheckResponse();
      //expect(instance).to.be();
    });

  });

}));
