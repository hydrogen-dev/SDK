/**
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
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
    factory(root.expect, root.molecule_api);
  }
}(this, function(expect, molecule_api) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new molecule_api.TokenUpdatePayload();
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

  describe('TokenUpdatePayload', function() {
    it('should create an instance of TokenUpdatePayload', function() {
      // uncomment below and update the code to test TokenUpdatePayload
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be.a(molecule_api.TokenUpdatePayload);
    });

    it('should have the property symbol (base name: "symbol")', function() {
      // uncomment below and update the code to test the property symbol
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property nucleusModelId (base name: "nucleus_model_id")', function() {
      // uncomment below and update the code to test the property nucleusModelId
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property ownerWalletId (base name: "owner_wallet_id")', function() {
      // uncomment below and update the code to test the property ownerWalletId
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property totalSupply (base name: "total_supply")', function() {
      // uncomment below and update the code to test the property totalSupply
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property circulatingSupply (base name: "circulating_supply")', function() {
      // uncomment below and update the code to test the property circulatingSupply
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property conractAddress (base name: "conract_address")', function() {
      // uncomment below and update the code to test the property conractAddress
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property crowdsaleAddress (base name: "crowdsale_address")', function() {
      // uncomment below and update the code to test the property crowdsaleAddress
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property restrictions (base name: "restrictions")', function() {
      // uncomment below and update the code to test the property restrictions
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property offeringSettings (base name: "offering_settings")', function() {
      // uncomment below and update the code to test the property offeringSettings
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instance = new molecule_api.TokenUpdatePayload();
      //expect(instance).to.be();
    });

  });

}));
