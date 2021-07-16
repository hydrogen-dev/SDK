/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.19
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
    factory(root.expect, root.HydrogenProtonApi);
  }
}(this, function(expect, HydrogenProtonApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('OptConfig', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.OptConfig();
      });

      it('should create an instance of OptConfig', function() {
        // TODO: update the code to test OptConfig
        expect(instance).to.be.a(HydrogenProtonApi.OptConfig);
      });

      it('should have the property tickers (base name: "tickers")', function() {
        // TODO: update the code to test the property tickers
        expect(instance).to.have.property('tickers');
        // expect(instance.tickers).to.be(expectedValueLiteral);
      });

      it('should have the property wConfig (base name: "w_config")', function() {
        // TODO: update the code to test the property wConfig
        expect(instance).to.have.property('wConfig');
        // expect(instance.wConfig).to.be(expectedValueLiteral);
      });

      it('should have the property minAssets (base name: "min_assets")', function() {
        // TODO: update the code to test the property minAssets
        expect(instance).to.have.property('minAssets');
        // expect(instance.minAssets).to.be(expectedValueLiteral);
      });

      it('should have the property endDate (base name: "end_date")', function() {
        // TODO: update the code to test the property endDate
        expect(instance).to.have.property('endDate');
        // expect(instance.endDate).to.be(expectedValueLiteral);
      });

      it('should have the property wAssetConfig (base name: "w_asset_config")', function() {
        // TODO: update the code to test the property wAssetConfig
        expect(instance).to.have.property('wAssetConfig');
        // expect(instance.wAssetConfig).to.be(expectedValueLiteral);
      });

      it('should have the property startDate (base name: "start_date")', function() {
        // TODO: update the code to test the property startDate
        expect(instance).to.have.property('startDate');
        // expect(instance.startDate).to.be(expectedValueLiteral);
      });

      it('should have the property secTypes (base name: "sec_types")', function() {
        // TODO: update the code to test the property secTypes
        expect(instance).to.have.property('secTypes');
        // expect(instance.secTypes).to.be(expectedValueLiteral);
      });

    });
  });

}));
