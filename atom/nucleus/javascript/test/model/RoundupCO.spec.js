/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: unset
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
    instance = new HydrogenNucleusApi.RoundupCO();
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

  describe('RoundupCO', function() {
    it('should create an instance of RoundupCO', function() {
      // uncomment below and update the code to test RoundupCO
      //var instane = new HydrogenNucleusApi.RoundupCO();
      //expect(instance).to.be.a(HydrogenNucleusApi.RoundupCO);
    });

    it('should have the property fundingStartDate (base name: "funding_start_date")', function() {
      // uncomment below and update the code to test the property fundingStartDate
      //var instane = new HydrogenNucleusApi.RoundupCO();
      //expect(instance).to.be();
    });

    it('should have the property roundupSettingId (base name: "roundup_setting_id")', function() {
      // uncomment below and update the code to test the property roundupSettingId
      //var instane = new HydrogenNucleusApi.RoundupCO();
      //expect(instance).to.be();
    });

    it('should have the property transactionEndDate (base name: "transaction_end_date")', function() {
      // uncomment below and update the code to test the property transactionEndDate
      //var instane = new HydrogenNucleusApi.RoundupCO();
      //expect(instance).to.be();
    });

    it('should have the property transactionStartDate (base name: "transaction_start_date")', function() {
      // uncomment below and update the code to test the property transactionStartDate
      //var instane = new HydrogenNucleusApi.RoundupCO();
      //expect(instance).to.be();
    });

    it('should have the property updateTransactions (base name: "update_transactions")', function() {
      // uncomment below and update the code to test the property updateTransactions
      //var instane = new HydrogenNucleusApi.RoundupCO();
      //expect(instance).to.be();
    });

  });

}));
