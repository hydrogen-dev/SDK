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
 * Swagger Codegen version: 2.4.2-SNAPSHOT
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
    instance = new atom_api.AggregationAccountBalancePayload();
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

  describe('AggregationAccountBalancePayload', function() {
    it('should create an instance of AggregationAccountBalancePayload', function() {
      // uncomment below and update the code to test AggregationAccountBalancePayload
      //var instance = new atom_api.AggregationAccountBalancePayload();
      //expect(instance).to.be.a(atom_api.AggregationAccountBalancePayload);
    });

    it('should have the property aggregationAccountId (base name: "aggregation_account_id")', function() {
      // uncomment below and update the code to test the property aggregationAccountId
      //var instance = new atom_api.AggregationAccountBalancePayload();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instance = new atom_api.AggregationAccountBalancePayload();
      //expect(instance).to.be();
    });

    it('should have the property balance (base name: "balance")', function() {
      // uncomment below and update the code to test the property balance
      //var instance = new atom_api.AggregationAccountBalancePayload();
      //expect(instance).to.be();
    });

    it('should have the property availableBalance (base name: "available_balance")', function() {
      // uncomment below and update the code to test the property availableBalance
      //var instance = new atom_api.AggregationAccountBalancePayload();
      //expect(instance).to.be();
    });

    it('should have the property balanceTimeStamp (base name: "balance_time_stamp")', function() {
      // uncomment below and update the code to test the property balanceTimeStamp
      //var instance = new atom_api.AggregationAccountBalancePayload();
      //expect(instance).to.be();
    });

    it('should have the property isActive (base name: "is_active")', function() {
      // uncomment below and update the code to test the property isActive
      //var instance = new atom_api.AggregationAccountBalancePayload();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instance = new atom_api.AggregationAccountBalancePayload();
      //expect(instance).to.be();
    });

  });

}));
