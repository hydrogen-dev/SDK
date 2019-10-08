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
    instance = new molecule_api.CurrencyTransferPayload();
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

  describe('CurrencyTransferPayload', function() {
    it('should create an instance of CurrencyTransferPayload', function() {
      // uncomment below and update the code to test CurrencyTransferPayload
      //var instance = new molecule_api.CurrencyTransferPayload();
      //expect(instance).to.be.a(molecule_api.CurrencyTransferPayload);
    });

    it('should have the property senderWalletId (base name: "sender_wallet_id")', function() {
      // uncomment below and update the code to test the property senderWalletId
      //var instance = new molecule_api.CurrencyTransferPayload();
      //expect(instance).to.be();
    });

    it('should have the property receiverWalletId (base name: "receiver_wallet_id")', function() {
      // uncomment below and update the code to test the property receiverWalletId
      //var instance = new molecule_api.CurrencyTransferPayload();
      //expect(instance).to.be();
    });

    it('should have the property currencySymbol (base name: "currency_symbol")', function() {
      // uncomment below and update the code to test the property currencySymbol
      //var instance = new molecule_api.CurrencyTransferPayload();
      //expect(instance).to.be();
    });

    it('should have the property amount (base name: "amount")', function() {
      // uncomment below and update the code to test the property amount
      //var instance = new molecule_api.CurrencyTransferPayload();
      //expect(instance).to.be();
    });

  });

}));
