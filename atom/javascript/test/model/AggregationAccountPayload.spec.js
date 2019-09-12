/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.1
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
    factory(root.expect, root.atom_api);
  }
}(this, function(expect, atom_api) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new atom_api.AggregationAccountPayload();
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

  describe('AggregationAccountPayload', function() {
    it('should create an instance of AggregationAccountPayload', function() {
      // uncomment below and update the code to test AggregationAccountPayload
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be.a(atom_api.AggregationAccountPayload);
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

    it('should have the property accountName (base name: "account_name")', function() {
      // uncomment below and update the code to test the property accountName
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

    it('should have the property institutionName (base name: "institution_name")', function() {
      // uncomment below and update the code to test the property institutionName
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

    it('should have the property category (base name: "category")', function() {
      // uncomment below and update the code to test the property category
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

    it('should have the property subcategory (base name: "subcategory")', function() {
      // uncomment below and update the code to test the property subcategory
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

    it('should have the property accountNumber (base name: "account_number")', function() {
      // uncomment below and update the code to test the property accountNumber
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

    it('should have the property mask (base name: "mask")', function() {
      // uncomment below and update the code to test the property mask
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

    it('should have the property isActive (base name: "is_active")', function() {
      // uncomment below and update the code to test the property isActive
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instance = new atom_api.AggregationAccountPayload();
      //expect(instance).to.be();
    });

  });

}));
