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
    describe('FinancialPictureRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.FinancialPictureRequest();
      });

      it('should create an instance of FinancialPictureRequest', function() {
        // TODO: update the code to test FinancialPictureRequest
        expect(instance).to.be.a(HydrogenProtonApi.FinancialPictureRequest);
      });

      it('should have the property currencyCode (base name: "currency_code")', function() {
        // TODO: update the code to test the property currencyCode
        expect(instance).to.have.property('currencyCode');
        // expect(instance.currencyCode).to.be(expectedValueLiteral);
      });

      it('should have the property clientId (base name: "client_id")', function() {
        // TODO: update the code to test the property clientId
        expect(instance).to.have.property('clientId');
        // expect(instance.clientId).to.be(expectedValueLiteral);
      });

      it('should have the property showHistory (base name: "show_history")', function() {
        // TODO: update the code to test the property showHistory
        expect(instance).to.have.property('showHistory');
        // expect(instance.showHistory).to.be(expectedValueLiteral);
      });

      it('should have the property endDate (base name: "end_date")', function() {
        // TODO: update the code to test the property endDate
        expect(instance).to.have.property('endDate');
        // expect(instance.endDate).to.be(expectedValueLiteral);
      });

      it('should have the property currencyConversion (base name: "currency_conversion")', function() {
        // TODO: update the code to test the property currencyConversion
        expect(instance).to.have.property('currencyConversion');
        // expect(instance.currencyConversion).to.be(expectedValueLiteral);
      });

      it('should have the property startDate (base name: "start_date")', function() {
        // TODO: update the code to test the property startDate
        expect(instance).to.have.property('startDate');
        // expect(instance.startDate).to.be(expectedValueLiteral);
      });

      it('should have the property showCategoryBreakdown (base name: "show_category_breakdown")', function() {
        // TODO: update the code to test the property showCategoryBreakdown
        expect(instance).to.have.property('showCategoryBreakdown');
        // expect(instance.showCategoryBreakdown).to.be(expectedValueLiteral);
      });

      it('should have the property showChange (base name: "show_change")', function() {
        // TODO: update the code to test the property showChange
        expect(instance).to.have.property('showChange');
        // expect(instance.showChange).to.be(expectedValueLiteral);
      });

      it('should have the property householdId (base name: "household_id")', function() {
        // TODO: update the code to test the property householdId
        expect(instance).to.have.property('householdId');
        // expect(instance.householdId).to.be(expectedValueLiteral);
      });

      it('should have the property createLog (base name: "create_log")', function() {
        // TODO: update the code to test the property createLog
        expect(instance).to.have.property('createLog');
        // expect(instance.createLog).to.be(expectedValueLiteral);
      });

    });
  });

}));
