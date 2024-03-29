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
    describe('BusinessFinancialHealthCheckRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.BusinessFinancialHealthCheckRequest();
      });

      it('should create an instance of BusinessFinancialHealthCheckRequest', function() {
        // TODO: update the code to test BusinessFinancialHealthCheckRequest
        expect(instance).to.be.a(HydrogenProtonApi.BusinessFinancialHealthCheckRequest);
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

      it('should have the property ratioTargets (base name: "ratio_targets")', function() {
        // TODO: update the code to test the property ratioTargets
        expect(instance).to.have.property('ratioTargets');
        // expect(instance.ratioTargets).to.be(expectedValueLiteral);
      });

      it('should have the property accountingMethod (base name: "accounting_method")', function() {
        // TODO: update the code to test the property accountingMethod
        expect(instance).to.have.property('accountingMethod');
        // expect(instance.accountingMethod).to.be(expectedValueLiteral);
      });

      it('should have the property totalLiabilities (base name: "total_liabilities")', function() {
        // TODO: update the code to test the property totalLiabilities
        expect(instance).to.have.property('totalLiabilities');
        // expect(instance.totalLiabilities).to.be(expectedValueLiteral);
      });

      it('should have the property totalAssets (base name: "total_assets")', function() {
        // TODO: update the code to test the property totalAssets
        expect(instance).to.have.property('totalAssets');
        // expect(instance.totalAssets).to.be(expectedValueLiteral);
      });

      it('should have the property currencyConversion (base name: "currency_conversion")', function() {
        // TODO: update the code to test the property currencyConversion
        expect(instance).to.have.property('currencyConversion');
        // expect(instance.currencyConversion).to.be(expectedValueLiteral);
      });

      it('should have the property periodQuarter (base name: "period_quarter")', function() {
        // TODO: update the code to test the property periodQuarter
        expect(instance).to.have.property('periodQuarter');
        // expect(instance.periodQuarter).to.be(expectedValueLiteral);
      });

      it('should have the property periodMonth (base name: "period_month")', function() {
        // TODO: update the code to test the property periodMonth
        expect(instance).to.have.property('periodMonth');
        // expect(instance.periodMonth).to.be(expectedValueLiteral);
      });

      it('should have the property totalEquity (base name: "total_equity")', function() {
        // TODO: update the code to test the property totalEquity
        expect(instance).to.have.property('totalEquity');
        // expect(instance.totalEquity).to.be(expectedValueLiteral);
      });

      it('should have the property businessId (base name: "business_id")', function() {
        // TODO: update the code to test the property businessId
        expect(instance).to.have.property('businessId');
        // expect(instance.businessId).to.be(expectedValueLiteral);
      });

      it('should have the property periodYear (base name: "period_year")', function() {
        // TODO: update the code to test the property periodYear
        expect(instance).to.have.property('periodYear');
        // expect(instance.periodYear).to.be(expectedValueLiteral);
      });

      it('should have the property totalRevenue (base name: "total_revenue")', function() {
        // TODO: update the code to test the property totalRevenue
        expect(instance).to.have.property('totalRevenue');
        // expect(instance.totalRevenue).to.be(expectedValueLiteral);
      });

      it('should have the property periodLength (base name: "period_length")', function() {
        // TODO: update the code to test the property periodLength
        expect(instance).to.have.property('periodLength');
        // expect(instance.periodLength).to.be(expectedValueLiteral);
      });

      it('should have the property netIncome (base name: "net_income")', function() {
        // TODO: update the code to test the property netIncome
        expect(instance).to.have.property('netIncome');
        // expect(instance.netIncome).to.be(expectedValueLiteral);
      });

      it('should have the property periodType (base name: "period_type")', function() {
        // TODO: update the code to test the property periodType
        expect(instance).to.have.property('periodType');
        // expect(instance.periodType).to.be(expectedValueLiteral);
      });

    });
  });

}));
