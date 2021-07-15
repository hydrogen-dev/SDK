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

  beforeEach(function() {
    instance = new HydrogenProtonApi.FinancialHealthApi();
  });

  describe('(package)', function() {
    describe('FinancialHealthApi', function() {
      describe('diversificationScore', function() {
        it('should call diversificationScore successfully', function(done) {
          // TODO: uncomment, update parameter values for diversificationScore call and complete the assertions
          /*
          var diversificationScoreRequest = new HydrogenProtonApi.DiversificationScoreRequest();
          diversificationScoreRequest.allocationId = """00000000-0000-0000-0000-000000000000";
          diversificationScoreRequest.endDate = new Date();
          diversificationScoreRequest.marketDataSource = "nucleus";
          diversificationScoreRequest.modelId = """00000000-0000-0000-0000-000000000000";
          diversificationScoreRequest.accountId = """00000000-0000-0000-0000-000000000000";
          diversificationScoreRequest.startDate = new Date();
          diversificationScoreRequest.useProxyData = false;
          diversificationScoreRequest.portfolioWeights = [0.0];
          diversificationScoreRequest.portfolioTickers = [""];
          diversificationScoreRequest.createLog = false;
          diversificationScoreRequest.aggregationAccountId = """00000000-0000-0000-0000-000000000000";
          diversificationScoreRequest.portfolioId = """00000000-0000-0000-0000-000000000000";

          instance.diversificationScore(diversificationScoreRequest, function(error, data, response) {
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
      describe('emergencyFundCalculator', function() {
        it('should call emergencyFundCalculator successfully', function(done) {
          // TODO: uncomment, update parameter values for emergencyFundCalculator call and complete the assertions
          /*
          var emergencyFundCalculatorRequest = new HydrogenProtonApi.EmergencyFundCalculatorRequest();
          emergencyFundCalculatorRequest.clientId = """00000000-0000-0000-0000-000000000000";
          emergencyFundCalculatorRequest.savingsHorizon = [0];
          emergencyFundCalculatorRequest.housingCost = 0.0;
          emergencyFundCalculatorRequest.otherExpenses = ;
          emergencyFundCalculatorRequest.accountIds = ["""00000000-0000-0000-0000-000000000000"];
          emergencyFundCalculatorRequest.utilityPayments = 0.0;
          emergencyFundCalculatorRequest.foodCosts = 0.0;
          emergencyFundCalculatorRequest.debtPayments = 0.0;
          emergencyFundCalculatorRequest.lookbackPeriods = 0;
          emergencyFundCalculatorRequest.frequencyUnit = "year";
          emergencyFundCalculatorRequest.currentEmergencyFundBalance = 0.0;
          emergencyFundCalculatorRequest.insurancePayments = 0.0;
          emergencyFundCalculatorRequest.telecomPayments = 0.0;
          emergencyFundCalculatorRequest.transportationCosts = 0.0;
          emergencyFundCalculatorRequest.interestRate = 0.0;
          emergencyFundCalculatorRequest.emergencyFundDuration = 0;
          emergencyFundCalculatorRequest.aggregationAccountIds = ["""00000000-0000-0000-0000-000000000000"];

          instance.emergencyFundCalculator(emergencyFundCalculatorRequest, function(error, data, response) {
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
      describe('financialHealthCheck', function() {
        it('should call financialHealthCheck successfully', function(done) {
          // TODO: uncomment, update parameter values for financialHealthCheck call and complete the assertions
          /*
          var financialHealthCheckRequest = new HydrogenProtonApi.FinancialHealthCheckRequest();
          financialHealthCheckRequest.clientId = """00000000-0000-0000-0000-000000000000";
          financialHealthCheckRequest.ratioTargets = new HydrogenProtonApi.RatioTargets();
          financialHealthCheckRequest.ratioTargets.liquidityRatioLiabilities = 0.0;
          financialHealthCheckRequest.ratioTargets.currentRatio = 0.0;
          financialHealthCheckRequest.ratioTargets.assetAllocationRatio = 0.0;
          financialHealthCheckRequest.ratioTargets.savingsRatioNet = 0.0;
          financialHealthCheckRequest.ratioTargets.savingsRatioGross = 0.0;
          financialHealthCheckRequest.ratioTargets.liquidityRatioExpenses = 0.0;
          financialHealthCheckRequest.liquidAssets = 0.0;
          financialHealthCheckRequest.totalLiabilities = 0.0;
          financialHealthCheckRequest.grossAnnualIncome = 0.0;
          financialHealthCheckRequest.shortTermLiabilities = 0.0;
          financialHealthCheckRequest.lookbackPeriods = 0;
          financialHealthCheckRequest.nonLiquidAssets = 0.0;
          financialHealthCheckRequest.monthlyExpenses = 0.0;
          financialHealthCheckRequest.netMonthlyIncome = 0.0;

          instance.financialHealthCheck(financialHealthCheckRequest, function(error, data, response) {
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
      describe('portfolioOptimizationScore', function() {
        it('should call portfolioOptimizationScore successfully', function(done) {
          // TODO: uncomment, update parameter values for portfolioOptimizationScore call and complete the assertions
          /*
          var portfolioOptimizationScoreRequest = new HydrogenProtonApi.PortfolioOptimizationScoreRequest();
          portfolioOptimizationScoreRequest.optConfig = new HydrogenProtonApi.OptConfig1();
          portfolioOptimizationScoreRequest.optConfig.tickers = [""];
          portfolioOptimizationScoreRequest.optConfig.wConfig = new HydrogenProtonApi.WConfig1();
          portfolioOptimizationScoreRequest.optConfig.wConfig.wMinMinor = 0.0;
          portfolioOptimizationScoreRequest.optConfig.wConfig.wMinMajor = 0.0;
          portfolioOptimizationScoreRequest.optConfig.wConfig.cashAmount = 0.0;
          portfolioOptimizationScoreRequest.optConfig.wConfig.wMaxMajor = 0.0;
          portfolioOptimizationScoreRequest.optConfig.wConfig.wMaxMinor = 0.0;
          portfolioOptimizationScoreRequest.optConfig.minAssets = 0;
          portfolioOptimizationScoreRequest.optConfig.wAssetConfig = ;
          portfolioOptimizationScoreRequest.optConfig.secTypes = ["major"]"major";
          portfolioOptimizationScoreRequest.allocationId = """00000000-0000-0000-0000-000000000000";
          portfolioOptimizationScoreRequest.endDate = new Date();
          portfolioOptimizationScoreRequest.marketDataSource = "nucleus";
          portfolioOptimizationScoreRequest.modelId = """00000000-0000-0000-0000-000000000000";
          portfolioOptimizationScoreRequest.accountId = """00000000-0000-0000-0000-000000000000";
          portfolioOptimizationScoreRequest.startDate = new Date();
          portfolioOptimizationScoreRequest.tgtType = "risk";
          portfolioOptimizationScoreRequest.useProxyData = false;
          portfolioOptimizationScoreRequest.portfolioWeights = [0.0];
          portfolioOptimizationScoreRequest.portfolioTickers = [""];
          portfolioOptimizationScoreRequest.createLog = false;
          portfolioOptimizationScoreRequest.aggregationAccountId = """00000000-0000-0000-0000-000000000000";
          portfolioOptimizationScoreRequest.portfolioId = """00000000-0000-0000-0000-000000000000";

          instance.portfolioOptimizationScore(portfolioOptimizationScoreRequest, function(error, data, response) {
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
