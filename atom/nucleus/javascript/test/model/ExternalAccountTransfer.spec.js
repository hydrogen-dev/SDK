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
    instance = new HydrogenNucleusApi.ExternalAccountTransfer();
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

  describe('ExternalAccountTransfer', function() {
    it('should create an instance of ExternalAccountTransfer', function() {
      // uncomment below and update the code to test ExternalAccountTransfer
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be.a(HydrogenNucleusApi.ExternalAccountTransfer);
    });

    it('should have the property accountHolder (base name: "account_holder")', function() {
      // uncomment below and update the code to test the property accountHolder
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property accountId (base name: "account_id")', function() {
      // uncomment below and update the code to test the property accountId
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property accountNumber (base name: "account_number")', function() {
      // uncomment below and update the code to test the property accountNumber
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property accountTypeId (base name: "account_type_id")', function() {
      // uncomment below and update the code to test the property accountTypeId
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property amount (base name: "amount")', function() {
      // uncomment below and update the code to test the property amount
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property comment (base name: "comment")', function() {
      // uncomment below and update the code to test the property comment
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property dtcNumber (base name: "dtc_number")', function() {
      // uncomment below and update the code to test the property dtcNumber
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property firmName (base name: "firm_name")', function() {
      // uncomment below and update the code to test the property firmName
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property receivedDate (base name: "received_date")', function() {
      // uncomment below and update the code to test the property receivedDate
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property rothFiveYear (base name: "roth_five_year")', function() {
      // uncomment below and update the code to test the property rothFiveYear
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property statusTimeStamp (base name: "status_time_stamp")', function() {
      // uncomment below and update the code to test the property statusTimeStamp
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property transferAllCash (base name: "transfer_all_cash")', function() {
      // uncomment below and update the code to test the property transferAllCash
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property transferDate (base name: "transfer_date")', function() {
      // uncomment below and update the code to test the property transferDate
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property transferType (base name: "transfer_type")', function() {
      // uncomment below and update the code to test the property transferType
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.ExternalAccountTransfer();
      //expect(instance).to.be();
    });

  });

}));
