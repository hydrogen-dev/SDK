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
    instance = new molecule_api.WalletCreateWhitelist();
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

  describe('WalletCreateWhitelist', function() {
    it('should create an instance of WalletCreateWhitelist', function() {
      // uncomment below and update the code to test WalletCreateWhitelist
      //var instance = new molecule_api.WalletCreateWhitelist();
      //expect(instance).to.be.a(molecule_api.WalletCreateWhitelist);
    });

    it('should have the property tokenId (base name: "token_id")', function() {
      // uncomment below and update the code to test the property tokenId
      //var instance = new molecule_api.WalletCreateWhitelist();
      //expect(instance).to.be();
    });

    it('should have the property role (base name: "role")', function() {
      // uncomment below and update the code to test the property role
      //var instance = new molecule_api.WalletCreateWhitelist();
      //expect(instance).to.be();
    });

    it('should have the property sellRestriction (base name: "sell_restriction")', function() {
      // uncomment below and update the code to test the property sellRestriction
      //var instance = new molecule_api.WalletCreateWhitelist();
      //expect(instance).to.be();
    });

    it('should have the property buyRestriction (base name: "buy_restriction")', function() {
      // uncomment below and update the code to test the property buyRestriction
      //var instance = new molecule_api.WalletCreateWhitelist();
      //expect(instance).to.be();
    });

  });

}));
