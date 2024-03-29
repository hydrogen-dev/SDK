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
    instance = new HydrogenNucleusApi.VPortfolioVO();
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

  describe('VPortfolioVO', function() {
    it('should create an instance of VPortfolioVO', function() {
      // uncomment below and update the code to test VPortfolioVO
      //var instane = new HydrogenNucleusApi.VPortfolioVO();
      //expect(instance).to.be.a(HydrogenNucleusApi.VPortfolioVO);
    });

    it('should have the property goalAssetSizeByPortfolio (base name: "goal_asset_size_by_portfolio")', function() {
      // uncomment below and update the code to test the property goalAssetSizeByPortfolio
      //var instane = new HydrogenNucleusApi.VPortfolioVO();
      //expect(instance).to.be();
    });

    it('should have the property goalAssetSizeByPortfolioDate (base name: "goal_asset_size_by_portfolio_date")', function() {
      // uncomment below and update the code to test the property goalAssetSizeByPortfolioDate
      //var instane = new HydrogenNucleusApi.VPortfolioVO();
      //expect(instance).to.be();
    });

    it('should have the property portfolioId (base name: "portfolio_id")', function() {
      // uncomment below and update the code to test the property portfolioId
      //var instane = new HydrogenNucleusApi.VPortfolioVO();
      //expect(instance).to.be();
    });

    it('should have the property portfolioName (base name: "portfolio_name")', function() {
      // uncomment below and update the code to test the property portfolioName
      //var instane = new HydrogenNucleusApi.VPortfolioVO();
      //expect(instance).to.be();
    });

  });

}));
