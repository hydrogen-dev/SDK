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
    instance = new molecule_api.WalletKeyCreateResponse();
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

  describe('WalletKeyCreateResponse', function() {
    it('should create an instance of WalletKeyCreateResponse', function() {
      // uncomment below and update the code to test WalletKeyCreateResponse
      //var instance = new molecule_api.WalletKeyCreateResponse();
      //expect(instance).to.be.a(molecule_api.WalletKeyCreateResponse);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new molecule_api.WalletKeyCreateResponse();
      //expect(instance).to.be();
    });

    it('should have the property keyId (base name: "key_id")', function() {
      // uncomment below and update the code to test the property keyId
      //var instance = new molecule_api.WalletKeyCreateResponse();
      //expect(instance).to.be();
    });

    it('should have the property keyServer (base name: "key_server")', function() {
      // uncomment below and update the code to test the property keyServer
      //var instance = new molecule_api.WalletKeyCreateResponse();
      //expect(instance).to.be();
    });

    it('should have the property address (base name: "address")', function() {
      // uncomment below and update the code to test the property address
      //var instance = new molecule_api.WalletKeyCreateResponse();
      //expect(instance).to.be();
    });

    it('should have the property privateKey (base name: "private_key")', function() {
      // uncomment below and update the code to test the property privateKey
      //var instance = new molecule_api.WalletKeyCreateResponse();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instance = new molecule_api.WalletKeyCreateResponse();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instance = new molecule_api.WalletKeyCreateResponse();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instance = new molecule_api.WalletKeyCreateResponse();
      //expect(instance).to.be();
    });

  });

}));
