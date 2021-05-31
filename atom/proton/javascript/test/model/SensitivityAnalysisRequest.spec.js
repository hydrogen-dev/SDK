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

  describe('(package)', function() {
    describe('SensitivityAnalysisRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.SensitivityAnalysisRequest();
      });

      it('should create an instance of SensitivityAnalysisRequest', function() {
        // TODO: update the code to test SensitivityAnalysisRequest
        expect(instance).to.be.a(HydrogenProtonApi.SensitivityAnalysisRequest);
      });

      it('should have the property allocationId (base name: "allocation_id")', function() {
        // TODO: update the code to test the property allocationId
        expect(instance).to.have.property('allocationId');
        // expect(instance.allocationId).to.be(expectedValueLiteral);
      });

      it('should have the property endDate (base name: "end_date")', function() {
        // TODO: update the code to test the property endDate
        expect(instance).to.have.property('endDate');
        // expect(instance.endDate).to.be(expectedValueLiteral);
      });

      it('should have the property marketDataSource (base name: "market_data_source")', function() {
        // TODO: update the code to test the property marketDataSource
        expect(instance).to.have.property('marketDataSource');
        // expect(instance.marketDataSource).to.be(expectedValueLiteral);
      });

      it('should have the property modelId (base name: "model_id")', function() {
        // TODO: update the code to test the property modelId
        expect(instance).to.have.property('modelId');
        // expect(instance.modelId).to.be(expectedValueLiteral);
      });

      it('should have the property accountId (base name: "account_id")', function() {
        // TODO: update the code to test the property accountId
        expect(instance).to.have.property('accountId');
        // expect(instance.accountId).to.be(expectedValueLiteral);
      });

      it('should have the property startDate (base name: "start_date")', function() {
        // TODO: update the code to test the property startDate
        expect(instance).to.have.property('startDate');
        // expect(instance.startDate).to.be(expectedValueLiteral);
      });

      it('should have the property frequencyInterval (base name: "frequency_interval")', function() {
        // TODO: update the code to test the property frequencyInterval
        expect(instance).to.have.property('frequencyInterval');
        // expect(instance.frequencyInterval).to.be(expectedValueLiteral);
      });

      it('should have the property tradingDaysPerYear (base name: "trading_days_per_year")', function() {
        // TODO: update the code to test the property tradingDaysPerYear
        expect(instance).to.have.property('tradingDaysPerYear');
        // expect(instance.tradingDaysPerYear).to.be(expectedValueLiteral);
      });

      it('should have the property sensitivityFactor (base name: "sensitivity_factor")', function() {
        // TODO: update the code to test the property sensitivityFactor
        expect(instance).to.have.property('sensitivityFactor');
        // expect(instance.sensitivityFactor).to.be(expectedValueLiteral);
      });

      it('should have the property useProxyData (base name: "use_proxy_data")', function() {
        // TODO: update the code to test the property useProxyData
        expect(instance).to.have.property('useProxyData');
        // expect(instance.useProxyData).to.be(expectedValueLiteral);
      });

      it('should have the property portfolioWeights (base name: "portfolio_weights")', function() {
        // TODO: update the code to test the property portfolioWeights
        expect(instance).to.have.property('portfolioWeights');
        // expect(instance.portfolioWeights).to.be(expectedValueLiteral);
      });

      it('should have the property portfolioTickers (base name: "portfolio_tickers")', function() {
        // TODO: update the code to test the property portfolioTickers
        expect(instance).to.have.property('portfolioTickers');
        // expect(instance.portfolioTickers).to.be(expectedValueLiteral);
      });

      it('should have the property createLog (base name: "create_log")', function() {
        // TODO: update the code to test the property createLog
        expect(instance).to.have.property('createLog');
        // expect(instance.createLog).to.be(expectedValueLiteral);
      });

      it('should have the property aggregationAccountId (base name: "aggregation_account_id")', function() {
        // TODO: update the code to test the property aggregationAccountId
        expect(instance).to.have.property('aggregationAccountId');
        // expect(instance.aggregationAccountId).to.be(expectedValueLiteral);
      });

      it('should have the property portfolioId (base name: "portfolio_id")', function() {
        // TODO: update the code to test the property portfolioId
        expect(instance).to.have.property('portfolioId');
        // expect(instance.portfolioId).to.be(expectedValueLiteral);
      });

    });
  });

}));
