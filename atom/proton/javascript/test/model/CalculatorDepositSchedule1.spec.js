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
    describe('CalculatorDepositSchedule1', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.CalculatorDepositSchedule1();
      });

      it('should create an instance of CalculatorDepositSchedule1', function() {
        // TODO: update the code to test CalculatorDepositSchedule1
        expect(instance).to.be.a(HydrogenProtonApi.CalculatorDepositSchedule1);
      });

      it('should have the property depositAmount (base name: "deposit_amount")', function() {
        // TODO: update the code to test the property depositAmount
        expect(instance).to.have.property('depositAmount');
        // expect(instance.depositAmount).to.be(expectedValueLiteral);
      });

      it('should have the property depositFrequencyInterval (base name: "deposit_frequency_interval")', function() {
        // TODO: update the code to test the property depositFrequencyInterval
        expect(instance).to.have.property('depositFrequencyInterval');
        // expect(instance.depositFrequencyInterval).to.be(expectedValueLiteral);
      });

      it('should have the property adjustDepositForInflation (base name: "adjust_deposit_for_inflation")', function() {
        // TODO: update the code to test the property adjustDepositForInflation
        expect(instance).to.have.property('adjustDepositForInflation');
        // expect(instance.adjustDepositForInflation).to.be(expectedValueLiteral);
      });

    });
  });

}));
