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
    instance = new HydrogenNucleusApi.ClientHydro();
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

  describe('ClientHydro', function() {
    it('should create an instance of ClientHydro', function() {
      // uncomment below and update the code to test ClientHydro
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be.a(HydrogenNucleusApi.ClientHydro);
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be();
    });

    it('should have the property hydroId (base name: "hydro_id")', function() {
      // uncomment below and update the code to test the property hydroId
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be();
    });

    it('should have the property isClientRaindropEnabled (base name: "is_client_raindrop_enabled")', function() {
      // uncomment below and update the code to test the property isClientRaindropEnabled
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be();
    });

    it('should have the property isClientRaindropLinked (base name: "is_client_raindrop_linked")', function() {
      // uncomment below and update the code to test the property isClientRaindropLinked
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be();
    });

    it('should have the property isHydroIdVerified (base name: "is_hydro_id_verified")', function() {
      // uncomment below and update the code to test the property isHydroIdVerified
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.ClientHydro();
      //expect(instance).to.be();
    });

  });

}));
