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
    instance = new HydrogenNucleusApi.ContactAddress();
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

  describe('ContactAddress', function() {
    it('should create an instance of ContactAddress', function() {
      // uncomment below and update the code to test ContactAddress
      //var instane = new HydrogenNucleusApi.ContactAddress();
      //expect(instance).to.be.a(HydrogenNucleusApi.ContactAddress);
    });

    it('should have the property addressLine1 (base name: "address_line1")', function() {
      // uncomment below and update the code to test the property addressLine1
      //var instane = new HydrogenNucleusApi.ContactAddress();
      //expect(instance).to.be();
    });

    it('should have the property addressLine2 (base name: "address_line2")', function() {
      // uncomment below and update the code to test the property addressLine2
      //var instane = new HydrogenNucleusApi.ContactAddress();
      //expect(instance).to.be();
    });

    it('should have the property city (base name: "city")', function() {
      // uncomment below and update the code to test the property city
      //var instane = new HydrogenNucleusApi.ContactAddress();
      //expect(instance).to.be();
    });

    it('should have the property country (base name: "country")', function() {
      // uncomment below and update the code to test the property country
      //var instane = new HydrogenNucleusApi.ContactAddress();
      //expect(instance).to.be();
    });

    it('should have the property postalcode (base name: "postalcode")', function() {
      // uncomment below and update the code to test the property postalcode
      //var instane = new HydrogenNucleusApi.ContactAddress();
      //expect(instance).to.be();
    });

    it('should have the property state (base name: "state")', function() {
      // uncomment below and update the code to test the property state
      //var instane = new HydrogenNucleusApi.ContactAddress();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instane = new HydrogenNucleusApi.ContactAddress();
      //expect(instance).to.be();
    });

  });

}));
