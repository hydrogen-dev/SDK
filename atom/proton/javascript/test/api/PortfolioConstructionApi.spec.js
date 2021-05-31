/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
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

  beforeEach(function() {
    instance = new HydrogenProtonApi.PortfolioConstructionApi();
  });

  describe('(package)', function() {
    describe('PortfolioConstructionApi', function() {
      describe('mvo', function() {
        it('should call mvo successfully', function(done) {
          // TODO: uncomment, update parameter values for mvo call and complete the assertions
          /*
          var mvoRequest = new HydrogenProtonApi.MvoRequest();
          mvoRequest.tickers = [""];
          mvoRequest.wConfig = new HydrogenProtonApi.WConfig();
          mvoRequest.wConfig.wMinMinor = 0.0;
          mvoRequest.wConfig.wMinMajor = 0.0;
          mvoRequest.wConfig.cashAmount = 0.0;
          mvoRequest.wConfig.wMaxMajor = 0.0;
          mvoRequest.wConfig.wMaxMinor = 0.0;
          mvoRequest.minAssets = 0;
          mvoRequest.endDate = new Date();
          mvoRequest.marketDataSource = "nucleus";
          mvoRequest.wAssetConfig = ;
          mvoRequest.startDate = new Date();
          mvoRequest.tgtType = "risk";
          mvoRequest.useProxyData = false;
          mvoRequest.tgtVal = 0.0;
          mvoRequest.secTypes = ["major"]"major";

          instance.mvo(mvoRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
