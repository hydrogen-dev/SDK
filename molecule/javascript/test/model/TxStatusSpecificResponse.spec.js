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
    instance = new molecule_api.TxStatusSpecificResponse();
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

  describe('TxStatusSpecificResponse', function() {
    it('should create an instance of TxStatusSpecificResponse', function() {
      // uncomment below and update the code to test TxStatusSpecificResponse
      //var instance = new molecule_api.TxStatusSpecificResponse();
      //expect(instance).to.be.a(molecule_api.TxStatusSpecificResponse);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new molecule_api.TxStatusSpecificResponse();
      //expect(instance).to.be();
    });

    it('should have the property walletId (base name: "wallet_id")', function() {
      // uncomment below and update the code to test the property walletId
      //var instance = new molecule_api.TxStatusSpecificResponse();
      //expect(instance).to.be();
    });

    it('should have the property hash (base name: "hash")', function() {
      // uncomment below and update the code to test the property hash
      //var instance = new molecule_api.TxStatusSpecificResponse();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new molecule_api.TxStatusSpecificResponse();
      //expect(instance).to.be();
    });

    it('should have the property emitsEvent (base name: "emits_event")', function() {
      // uncomment below and update the code to test the property emitsEvent
      //var instance = new molecule_api.TxStatusSpecificResponse();
      //expect(instance).to.be();
    });

    it('should have the property eventHandled (base name: "event_handled")', function() {
      // uncomment below and update the code to test the property eventHandled
      //var instance = new molecule_api.TxStatusSpecificResponse();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instance = new molecule_api.TxStatusSpecificResponse();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instance = new molecule_api.TxStatusSpecificResponse();
      //expect(instance).to.be();
    });

  });

}));
