/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
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
    instance = new HydrogenNucleusApi.PortfolioAssetSizeLog();
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

  describe('PortfolioAssetSizeLog', function() {
    it('should create an instance of PortfolioAssetSizeLog', function() {
      // uncomment below and update the code to test PortfolioAssetSizeLog
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be.a(HydrogenNucleusApi.PortfolioAssetSizeLog);
    });

    it('should have the property accountId (base name: "account_id")', function() {
      // uncomment below and update the code to test the property accountId
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property assetSize (base name: "asset_size")', function() {
      // uncomment below and update the code to test the property assetSize
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property assetSizeAvailable (base name: "asset_size_available")', function() {
      // uncomment below and update the code to test the property assetSizeAvailable
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property assetSizePending (base name: "asset_size_pending")', function() {
      // uncomment below and update the code to test the property assetSizePending
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property cashFlow (base name: "cash_flow")', function() {
      // uncomment below and update the code to test the property cashFlow
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property _date (base name: "date")', function() {
      // uncomment below and update the code to test the property _date
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property modelId (base name: "model_id")', function() {
      // uncomment below and update the code to test the property modelId
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property portfolioId (base name: "portfolio_id")', function() {
      // uncomment below and update the code to test the property portfolioId
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.PortfolioAssetSizeLog();
      //expect(instance).to.be();
    });

  });

}));
