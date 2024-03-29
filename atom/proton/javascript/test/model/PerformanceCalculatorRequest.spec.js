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
    describe('PerformanceCalculatorRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.PerformanceCalculatorRequest();
      });

      it('should create an instance of PerformanceCalculatorRequest', function() {
        // TODO: update the code to test PerformanceCalculatorRequest
        expect(instance).to.be.a(HydrogenProtonApi.PerformanceCalculatorRequest);
      });

      it('should have the property annualizedReturnPeriod (base name: "annualized_return_period")', function() {
        // TODO: update the code to test the property annualizedReturnPeriod
        expect(instance).to.have.property('annualizedReturnPeriod');
        // expect(instance.annualizedReturnPeriod).to.be(expectedValueLiteral);
      });

      it('should have the property riskFreeAlpha (base name: "risk_free_alpha")', function() {
        // TODO: update the code to test the property riskFreeAlpha
        expect(instance).to.have.property('riskFreeAlpha');
        // expect(instance.riskFreeAlpha).to.be(expectedValueLiteral);
      });

      it('should have the property allocationId (base name: "allocation_id")', function() {
        // TODO: update the code to test the property allocationId
        expect(instance).to.have.property('allocationId');
        // expect(instance.allocationId).to.be(expectedValueLiteral);
      });

      it('should have the property meanPercentileMonteCarlo (base name: "mean_percentile_monte_carlo")', function() {
        // TODO: update the code to test the property meanPercentileMonteCarlo
        expect(instance).to.have.property('meanPercentileMonteCarlo');
        // expect(instance.meanPercentileMonteCarlo).to.be(expectedValueLiteral);
      });

      it('should have the property modelId (base name: "model_id")', function() {
        // TODO: update the code to test the property modelId
        expect(instance).to.have.property('modelId');
        // expect(instance.modelId).to.be(expectedValueLiteral);
      });

      it('should have the property marDownsideDeviation (base name: "mar_downside_deviation")', function() {
        // TODO: update the code to test the property marDownsideDeviation
        expect(instance).to.have.property('marDownsideDeviation');
        // expect(instance.marDownsideDeviation).to.be(expectedValueLiteral);
      });

      it('should have the property riskFreeSharpe (base name: "risk_free_sharpe")', function() {
        // TODO: update the code to test the property riskFreeSharpe
        expect(instance).to.have.property('riskFreeSharpe');
        // expect(instance.riskFreeSharpe).to.be(expectedValueLiteral);
      });

      it('should have the property benchmarkId (base name: "benchmark_id")', function() {
        // TODO: update the code to test the property benchmarkId
        expect(instance).to.have.property('benchmarkId');
        // expect(instance.benchmarkId).to.be(expectedValueLiteral);
      });

      it('should have the property riskFreeSortino (base name: "risk_free_sortino")', function() {
        // TODO: update the code to test the property riskFreeSortino
        expect(instance).to.have.property('riskFreeSortino');
        // expect(instance.riskFreeSortino).to.be(expectedValueLiteral);
      });

      it('should have the property householdId (base name: "household_id")', function() {
        // TODO: update the code to test the property householdId
        expect(instance).to.have.property('householdId');
        // expect(instance.householdId).to.be(expectedValueLiteral);
      });

      it('should have the property minPercentileMonteCarlo (base name: "min_percentile_monte_carlo")', function() {
        // TODO: update the code to test the property minPercentileMonteCarlo
        expect(instance).to.have.property('minPercentileMonteCarlo');
        // expect(instance.minPercentileMonteCarlo).to.be(expectedValueLiteral);
      });

      it('should have the property movingAverageNDay (base name: "moving_average_n_day")', function() {
        // TODO: update the code to test the property movingAverageNDay
        expect(instance).to.have.property('movingAverageNDay');
        // expect(instance.movingAverageNDay).to.be(expectedValueLiteral);
      });

      it('should have the property activePremiumPeriod (base name: "active_premium_period")', function() {
        // TODO: update the code to test the property activePremiumPeriod
        expect(instance).to.have.property('activePremiumPeriod');
        // expect(instance.activePremiumPeriod).to.be(expectedValueLiteral);
      });

      it('should have the property statName (base name: "stat_name")', function() {
        // TODO: update the code to test the property statName
        expect(instance).to.have.property('statName');
        // expect(instance.statName).to.be(expectedValueLiteral);
      });

      it('should have the property endDate (base name: "end_date")', function() {
        // TODO: update the code to test the property endDate
        expect(instance).to.have.property('endDate');
        // expect(instance.endDate).to.be(expectedValueLiteral);
      });

      it('should have the property startDate (base name: "start_date")', function() {
        // TODO: update the code to test the property startDate
        expect(instance).to.have.property('startDate');
        // expect(instance.startDate).to.be(expectedValueLiteral);
      });

      it('should have the property nDayReturns (base name: "n_day_returns")', function() {
        // TODO: update the code to test the property nDayReturns
        expect(instance).to.have.property('nDayReturns');
        // expect(instance.nDayReturns).to.be(expectedValueLiteral);
      });

      it('should have the property varConfInterval (base name: "var_conf_interval")', function() {
        // TODO: update the code to test the property varConfInterval
        expect(instance).to.have.property('varConfInterval');
        // expect(instance.varConfInterval).to.be(expectedValueLiteral);
      });

      it('should have the property periodType (base name: "period_type")', function() {
        // TODO: update the code to test the property periodType
        expect(instance).to.have.property('periodType');
        // expect(instance.periodType).to.be(expectedValueLiteral);
      });

      it('should have the property riskFreeTreynor (base name: "risk_free_treynor")', function() {
        // TODO: update the code to test the property riskFreeTreynor
        expect(instance).to.have.property('riskFreeTreynor');
        // expect(instance.riskFreeTreynor).to.be(expectedValueLiteral);
      });

      it('should have the property nRollingMaxDrawdown (base name: "n_rolling_max_drawdown")', function() {
        // TODO: update the code to test the property nRollingMaxDrawdown
        expect(instance).to.have.property('nRollingMaxDrawdown');
        // expect(instance.nRollingMaxDrawdown).to.be(expectedValueLiteral);
      });

      it('should have the property portfolioId (base name: "portfolio_id")', function() {
        // TODO: update the code to test the property portfolioId
        expect(instance).to.have.property('portfolioId');
        // expect(instance.portfolioId).to.be(expectedValueLiteral);
      });

      it('should have the property numSimMonteCarlo (base name: "num_sim_monte_carlo")', function() {
        // TODO: update the code to test the property numSimMonteCarlo
        expect(instance).to.have.property('numSimMonteCarlo');
        // expect(instance.numSimMonteCarlo).to.be(expectedValueLiteral);
      });

      it('should have the property goalId (base name: "goal_id")', function() {
        // TODO: update the code to test the property goalId
        expect(instance).to.have.property('goalId');
        // expect(instance.goalId).to.be(expectedValueLiteral);
      });

      it('should have the property accountId (base name: "account_id")', function() {
        // TODO: update the code to test the property accountId
        expect(instance).to.have.property('accountId');
        // expect(instance.accountId).to.be(expectedValueLiteral);
      });

      it('should have the property securityId (base name: "security_id")', function() {
        // TODO: update the code to test the property securityId
        expect(instance).to.have.property('securityId');
        // expect(instance.securityId).to.be(expectedValueLiteral);
      });

      it('should have the property nPathMonteCarlo (base name: "n_path_monte_carlo")', function() {
        // TODO: update the code to test the property nPathMonteCarlo
        expect(instance).to.have.property('nPathMonteCarlo');
        // expect(instance.nPathMonteCarlo).to.be(expectedValueLiteral);
      });

      it('should have the property clientId (base name: "client_id")', function() {
        // TODO: update the code to test the property clientId
        expect(instance).to.have.property('clientId');
        // expect(instance.clientId).to.be(expectedValueLiteral);
      });

      it('should have the property nRollingVolatility (base name: "n_rolling_volatility")', function() {
        // TODO: update the code to test the property nRollingVolatility
        expect(instance).to.have.property('nRollingVolatility');
        // expect(instance.nRollingVolatility).to.be(expectedValueLiteral);
      });

      it('should have the property histFactor (base name: "hist_factor")', function() {
        // TODO: update the code to test the property histFactor
        expect(instance).to.have.property('histFactor');
        // expect(instance.histFactor).to.be(expectedValueLiteral);
      });

      it('should have the property maxPercentileMonteCarlo (base name: "max_percentile_monte_carlo")', function() {
        // TODO: update the code to test the property maxPercentileMonteCarlo
        expect(instance).to.have.property('maxPercentileMonteCarlo');
        // expect(instance.maxPercentileMonteCarlo).to.be(expectedValueLiteral);
      });

    });
  });

}));
