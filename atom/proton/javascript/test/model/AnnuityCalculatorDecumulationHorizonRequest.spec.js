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
    describe('AnnuityCalculatorDecumulationHorizonRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.AnnuityCalculatorDecumulationHorizonRequest();
      });

      it('should create an instance of AnnuityCalculatorDecumulationHorizonRequest', function() {
        // TODO: update the code to test AnnuityCalculatorDecumulationHorizonRequest
        expect(instance).to.be.a(HydrogenProtonApi.AnnuityCalculatorDecumulationHorizonRequest);
      });

      it('should have the property inflationRate (base name: "inflation_rate")', function() {
        // TODO: update the code to test the property inflationRate
        expect(instance).to.have.property('inflationRate');
        // expect(instance.inflationRate).to.be(expectedValueLiteral);
      });

      it('should have the property decumulationHorizon (base name: "decumulation_horizon")', function() {
        // TODO: update the code to test the property decumulationHorizon
        expect(instance).to.have.property('decumulationHorizon');
        // expect(instance.decumulationHorizon).to.be(expectedValueLiteral);
      });

      it('should have the property accountIds (base name: "account_ids")', function() {
        // TODO: update the code to test the property accountIds
        expect(instance).to.have.property('accountIds');
        // expect(instance.accountIds).to.be(expectedValueLiteral);
      });

      it('should have the property taxRate (base name: "tax_rate")', function() {
        // TODO: update the code to test the property taxRate
        expect(instance).to.have.property('taxRate');
        // expect(instance.taxRate).to.be(expectedValueLiteral);
      });

      it('should have the property accumulationHorizon (base name: "accumulation_horizon")', function() {
        // TODO: update the code to test the property accumulationHorizon
        expect(instance).to.have.property('accumulationHorizon');
        // expect(instance.accumulationHorizon).to.be(expectedValueLiteral);
      });

      it('should have the property annuityAmount (base name: "annuity_amount")', function() {
        // TODO: update the code to test the property annuityAmount
        expect(instance).to.have.property('annuityAmount');
        // expect(instance.annuityAmount).to.be(expectedValueLiteral);
      });

      it('should have the property portfolioReturn (base name: "portfolio_return")', function() {
        // TODO: update the code to test the property portfolioReturn
        expect(instance).to.have.property('portfolioReturn');
        // expect(instance.portfolioReturn).to.be(expectedValueLiteral);
      });

      it('should have the property depositSchedule (base name: "deposit_schedule")', function() {
        // TODO: update the code to test the property depositSchedule
        expect(instance).to.have.property('depositSchedule');
        // expect(instance.depositSchedule).to.be(expectedValueLiteral);
      });

      it('should have the property annuityFrequencyInterval (base name: "annuity_frequency_interval")', function() {
        // TODO: update the code to test the property annuityFrequencyInterval
        expect(instance).to.have.property('annuityFrequencyInterval');
        // expect(instance.annuityFrequencyInterval).to.be(expectedValueLiteral);
      });

      it('should have the property initialBalance (base name: "initial_balance")', function() {
        // TODO: update the code to test the property initialBalance
        expect(instance).to.have.property('initialBalance');
        // expect(instance.initialBalance).to.be(expectedValueLiteral);
      });

      it('should have the property aggregationAccountIds (base name: "aggregation_account_ids")', function() {
        // TODO: update the code to test the property aggregationAccountIds
        expect(instance).to.have.property('aggregationAccountIds');
        // expect(instance.aggregationAccountIds).to.be(expectedValueLiteral);
      });

      it('should have the property createLog (base name: "create_log")', function() {
        // TODO: update the code to test the property createLog
        expect(instance).to.have.property('createLog');
        // expect(instance.createLog).to.be(expectedValueLiteral);
      });

    });
  });

}));
