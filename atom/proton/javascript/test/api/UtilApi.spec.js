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
    instance = new HydrogenProtonApi.UtilApi();
  });

  describe('(package)', function() {
    describe('UtilApi', function() {
      describe('decisionTreeResult', function() {
        it('should call decisionTreeResult successfully', function(done) {
          // TODO: uncomment, update parameter values for decisionTreeResult call and complete the assertions
          /*
          var decisionTreeResultRequest = new HydrogenProtonApi.DecisionTreeResultRequest();
          decisionTreeResultRequest.entityType = "model";
          decisionTreeResultRequest.answers = [new HydrogenProtonApi.Answer()];
          decisionTreeResultRequest.answers[0].answerId = """00000000-0000-0000-0000-000000000000";

          instance.decisionTreeResult(decisionTreeResultRequest, function(error, data, response) {
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
      describe('orderRebalance', function() {
        it('should call orderRebalance successfully', function(done) {
          // TODO: uncomment, update parameter values for orderRebalance call and complete the assertions
          /*
          var orderRebalanceRequest = new HydrogenProtonApi.OrderRebalanceRequest();
          orderRebalanceRequest.nonFractional = false;
          orderRebalanceRequest.orderScope = "all";
          orderRebalanceRequest.buyThreshold = 0.0;
          orderRebalanceRequest.commitOrders = false;
          orderRebalanceRequest.accountId = """00000000-0000-0000-0000-000000000000";
          orderRebalanceRequest.portThreshold = 0.0;
          orderRebalanceRequest.useCashAvailable = false;
          orderRebalanceRequest.useStrategic = false;
          orderRebalanceRequest.sellTransactionCodeId = """00000000-0000-0000-0000-000000000000";
          orderRebalanceRequest.buyTransactionCodeId = """00000000-0000-0000-0000-000000000000";
          orderRebalanceRequest.cashPortfolioId = """00000000-0000-0000-0000-000000000000";
          orderRebalanceRequest.restrictionsOn = false;
          orderRebalanceRequest.sellThreshold = 0.0;
          orderRebalanceRequest.portfolioId = """00000000-0000-0000-0000-000000000000";

          instance.orderRebalance(orderRebalanceRequest, function(error, data, response) {
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
      describe('performanceCalculator', function() {
        it('should call performanceCalculator successfully', function(done) {
          // TODO: uncomment, update parameter values for performanceCalculator call and complete the assertions
          /*
          var performanceCalculatorRequest = new HydrogenProtonApi.PerformanceCalculatorRequest();
          performanceCalculatorRequest.annualizedReturnPeriod = "Y";
          performanceCalculatorRequest.riskFreeAlpha = 0.0;
          performanceCalculatorRequest.allocationId = """00000000-0000-0000-0000-000000000000";
          performanceCalculatorRequest.meanPercentileMonteCarlo = 0.0;
          performanceCalculatorRequest.modelId = """00000000-0000-0000-0000-000000000000";
          performanceCalculatorRequest.marDownsideDeviation = 0.0;
          performanceCalculatorRequest.riskFreeSharpe = 0.0;
          performanceCalculatorRequest.benchmarkId = """00000000-0000-0000-0000-000000000000";
          performanceCalculatorRequest.riskFreeSortino = 0.0;
          performanceCalculatorRequest.householdId = """00000000-0000-0000-0000-000000000000";
          performanceCalculatorRequest.minPercentileMonteCarlo = 0.0;
          performanceCalculatorRequest.movingAverageNDay = 0;
          performanceCalculatorRequest.activePremiumPeriod = "Y";
          performanceCalculatorRequest.statName = "";
          performanceCalculatorRequest.endDate = new Date();
          performanceCalculatorRequest.startDate = new Date();
          performanceCalculatorRequest.nDayReturns = 0;
          performanceCalculatorRequest.varConfInterval = 0.0;
          performanceCalculatorRequest.periodType = "Y";
          performanceCalculatorRequest.riskFreeTreynor = 0.0;
          performanceCalculatorRequest.nRollingMaxDrawdown = 0;
          performanceCalculatorRequest.portfolioId = """00000000-0000-0000-0000-000000000000";
          performanceCalculatorRequest.numSimMonteCarlo = 0;
          performanceCalculatorRequest.goalId = """00000000-0000-0000-0000-000000000000";
          performanceCalculatorRequest.accountId = """00000000-0000-0000-0000-000000000000";
          performanceCalculatorRequest.securityId = """00000000-0000-0000-0000-000000000000";
          performanceCalculatorRequest.nPathMonteCarlo = 0;
          performanceCalculatorRequest.clientId = """00000000-0000-0000-0000-000000000000";
          performanceCalculatorRequest.nRollingVolatility = 0;
          performanceCalculatorRequest.histFactor = 0.0;
          performanceCalculatorRequest.maxPercentileMonteCarlo = 0.0;

          instance.performanceCalculator(performanceCalculatorRequest, function(error, data, response) {
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
