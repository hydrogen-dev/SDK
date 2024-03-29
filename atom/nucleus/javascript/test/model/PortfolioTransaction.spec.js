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
    instance = new HydrogenNucleusApi.PortfolioTransaction();
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

  describe('PortfolioTransaction', function() {
    it('should create an instance of PortfolioTransaction', function() {
      // uncomment below and update the code to test PortfolioTransaction
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be.a(HydrogenNucleusApi.PortfolioTransaction);
    });

    it('should have the property accountId (base name: "account_id")', function() {
      // uncomment below and update the code to test the property accountId
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property amount (base name: "amount")', function() {
      // uncomment below and update the code to test the property amount
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property balance (base name: "balance")', function() {
      // uncomment below and update the code to test the property balance
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property category (base name: "category")', function() {
      // uncomment below and update the code to test the property category
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property check (base name: "check")', function() {
      // uncomment below and update the code to test the property check
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property _date (base name: "date")', function() {
      // uncomment below and update the code to test the property _date
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property dateAvailable (base name: "date_available")', function() {
      // uncomment below and update the code to test the property dateAvailable
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property fundingId (base name: "funding_id")', function() {
      // uncomment below and update the code to test the property fundingId
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property isCleansed (base name: "is_cleansed")', function() {
      // uncomment below and update the code to test the property isCleansed
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property isDisputed (base name: "is_disputed")', function() {
      // uncomment below and update the code to test the property isDisputed
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property isRead (base name: "is_read")', function() {
      // uncomment below and update the code to test the property isRead
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property isRecurring (base name: "is_recurring")', function() {
      // uncomment below and update the code to test the property isRecurring
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property location (base name: "location")', function() {
      // uncomment below and update the code to test the property location
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property memo (base name: "memo")', function() {
      // uncomment below and update the code to test the property memo
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property merchant (base name: "merchant")', function() {
      // uncomment below and update the code to test the property merchant
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property merchantCategoryCode (base name: "merchant_category_code")', function() {
      // uncomment below and update the code to test the property merchantCategoryCode
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property merchantId (base name: "merchant_id")', function() {
      // uncomment below and update the code to test the property merchantId
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property mid (base name: "mid")', function() {
      // uncomment below and update the code to test the property mid
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property modelId (base name: "model_id")', function() {
      // uncomment below and update the code to test the property modelId
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property portfolioId (base name: "portfolio_id")', function() {
      // uncomment below and update the code to test the property portfolioId
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property price (base name: "price")', function() {
      // uncomment below and update the code to test the property price
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property quantity (base name: "quantity")', function() {
      // uncomment below and update the code to test the property quantity
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property securityId (base name: "security_id")', function() {
      // uncomment below and update the code to test the property securityId
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property subcategory (base name: "subcategory")', function() {
      // uncomment below and update the code to test the property subcategory
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property transactionCategoryId (base name: "transaction_category_id")', function() {
      // uncomment below and update the code to test the property transactionCategoryId
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property transactionCodeId (base name: "transaction_code_id")', function() {
      // uncomment below and update the code to test the property transactionCodeId
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.PortfolioTransaction();
      //expect(instance).to.be();
    });

  });

}));
