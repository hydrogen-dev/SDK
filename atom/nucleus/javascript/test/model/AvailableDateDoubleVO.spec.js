/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
    instance = new HydrogenNucleusApi.AvailableDateDoubleVO();
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

  describe('AvailableDateDoubleVO', function() {
    it('should create an instance of AvailableDateDoubleVO', function() {
      // uncomment below and update the code to test AvailableDateDoubleVO
      //var instane = new HydrogenNucleusApi.AvailableDateDoubleVO();
      //expect(instance).to.be.a(HydrogenNucleusApi.AvailableDateDoubleVO);
    });

    it('should have the property additions (base name: "additions")', function() {
      // uncomment below and update the code to test the property additions
      //var instane = new HydrogenNucleusApi.AvailableDateDoubleVO();
      //expect(instance).to.be();
    });

    it('should have the property cashFlow (base name: "cash_flow")', function() {
      // uncomment below and update the code to test the property cashFlow
      //var instane = new HydrogenNucleusApi.AvailableDateDoubleVO();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instane = new HydrogenNucleusApi.AvailableDateDoubleVO();
      //expect(instance).to.be();
    });

    it('should have the property _date (base name: "date")', function() {
      // uncomment below and update the code to test the property _date
      //var instane = new HydrogenNucleusApi.AvailableDateDoubleVO();
      //expect(instance).to.be();
    });

    it('should have the property value (base name: "value")', function() {
      // uncomment below and update the code to test the property value
      //var instane = new HydrogenNucleusApi.AvailableDateDoubleVO();
      //expect(instance).to.be();
    });

    it('should have the property valueAvailable (base name: "value_available")', function() {
      // uncomment below and update the code to test the property valueAvailable
      //var instane = new HydrogenNucleusApi.AvailableDateDoubleVO();
      //expect(instance).to.be();
    });

    it('should have the property valuePending (base name: "value_pending")', function() {
      // uncomment below and update the code to test the property valuePending
      //var instane = new HydrogenNucleusApi.AvailableDateDoubleVO();
      //expect(instance).to.be();
    });

  });

}));
