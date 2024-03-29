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
    instance = new HydrogenNucleusApi.BusinessDetailsVO();
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

  describe('BusinessDetailsVO', function() {
    it('should create an instance of BusinessDetailsVO', function() {
      // uncomment below and update the code to test BusinessDetailsVO
      //var instane = new HydrogenNucleusApi.BusinessDetailsVO();
      //expect(instance).to.be.a(HydrogenNucleusApi.BusinessDetailsVO);
    });

    it('should have the property address (base name: "address")', function() {
      // uncomment below and update the code to test the property address
      //var instane = new HydrogenNucleusApi.BusinessDetailsVO();
      //expect(instance).to.be();
    });

    it('should have the property businessId (base name: "business_id")', function() {
      // uncomment below and update the code to test the property businessId
      //var instane = new HydrogenNucleusApi.BusinessDetailsVO();
      //expect(instance).to.be();
    });

    it('should have the property dbaName (base name: "dba_name")', function() {
      // uncomment below and update the code to test the property dbaName
      //var instane = new HydrogenNucleusApi.BusinessDetailsVO();
      //expect(instance).to.be();
    });

    it('should have the property email (base name: "email")', function() {
      // uncomment below and update the code to test the property email
      //var instane = new HydrogenNucleusApi.BusinessDetailsVO();
      //expect(instance).to.be();
    });

    it('should have the property legalName (base name: "legal_name")', function() {
      // uncomment below and update the code to test the property legalName
      //var instane = new HydrogenNucleusApi.BusinessDetailsVO();
      //expect(instance).to.be();
    });

    it('should have the property website (base name: "website")', function() {
      // uncomment below and update the code to test the property website
      //var instane = new HydrogenNucleusApi.BusinessDetailsVO();
      //expect(instance).to.be();
    });

  });

}));
