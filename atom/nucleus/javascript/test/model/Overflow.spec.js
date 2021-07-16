/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
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
    instance = new HydrogenNucleusApi.Overflow();
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

  describe('Overflow', function() {
    it('should create an instance of Overflow', function() {
      // uncomment below and update the code to test Overflow
      //var instane = new HydrogenNucleusApi.Overflow();
      //expect(instance).to.be.a(HydrogenNucleusApi.Overflow);
    });

    it('should have the property accountId (base name: "account_id")', function() {
      // uncomment below and update the code to test the property accountId
      //var instane = new HydrogenNucleusApi.Overflow();
      //expect(instance).to.be();
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instane = new HydrogenNucleusApi.Overflow();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.Overflow();
      //expect(instance).to.be();
    });

    it('should have the property fundingRequests (base name: "funding_requests")', function() {
      // uncomment below and update the code to test the property fundingRequests
      //var instane = new HydrogenNucleusApi.Overflow();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.Overflow();
      //expect(instance).to.be();
    });

    it('should have the property overflowSettingId (base name: "overflow_setting_id")', function() {
      // uncomment below and update the code to test the property overflowSettingId
      //var instane = new HydrogenNucleusApi.Overflow();
      //expect(instance).to.be();
    });

    it('should have the property totalOverflowAmount (base name: "total_overflow_amount")', function() {
      // uncomment below and update the code to test the property totalOverflowAmount
      //var instane = new HydrogenNucleusApi.Overflow();
      //expect(instance).to.be();
    });

    it('should have the property updateBalances (base name: "update_balances")', function() {
      // uncomment below and update the code to test the property updateBalances
      //var instane = new HydrogenNucleusApi.Overflow();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.Overflow();
      //expect(instance).to.be();
    });

  });

}));
