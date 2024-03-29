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
    describe('BusinessInvoiceAnalysisRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.BusinessInvoiceAnalysisRequest();
      });

      it('should create an instance of BusinessInvoiceAnalysisRequest', function() {
        // TODO: update the code to test BusinessInvoiceAnalysisRequest
        expect(instance).to.be.a(HydrogenProtonApi.BusinessInvoiceAnalysisRequest);
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

      it('should have the property showOutstandingInvoices (base name: "show_outstanding_invoices")', function() {
        // TODO: update the code to test the property showOutstandingInvoices
        expect(instance).to.have.property('showOutstandingInvoices');
        // expect(instance.showOutstandingInvoices).to.be(expectedValueLiteral);
      });

      it('should have the property responseLimit (base name: "response_limit")', function() {
        // TODO: update the code to test the property responseLimit
        expect(instance).to.have.property('responseLimit');
        // expect(instance.responseLimit).to.be(expectedValueLiteral);
      });

      it('should have the property endDate (base name: "end_date")', function() {
        // TODO: update the code to test the property endDate
        expect(instance).to.have.property('endDate');
        // expect(instance.endDate).to.be(expectedValueLiteral);
      });

      it('should have the property historyFrequencyInterval (base name: "history_frequency_interval")', function() {
        // TODO: update the code to test the property historyFrequencyInterval
        expect(instance).to.have.property('historyFrequencyInterval');
        // expect(instance.historyFrequencyInterval).to.be(expectedValueLiteral);
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

      it('should have the property futureDuePeriods (base name: "future_due_periods")', function() {
        // TODO: update the code to test the property futureDuePeriods
        expect(instance).to.have.property('futureDuePeriods');
        // expect(instance.futureDuePeriods).to.be(expectedValueLiteral);
      });

      it('should have the property overduePeriods (base name: "overdue_periods")', function() {
        // TODO: update the code to test the property overduePeriods
        expect(instance).to.have.property('overduePeriods');
        // expect(instance.overduePeriods).to.be(expectedValueLiteral);
      });

      it('should have the property businessId (base name: "business_id")', function() {
        // TODO: update the code to test the property businessId
        expect(instance).to.have.property('businessId');
        // expect(instance.businessId).to.be(expectedValueLiteral);
      });

      it('should have the property invoiceIds (base name: "invoice_ids")', function() {
        // TODO: update the code to test the property invoiceIds
        expect(instance).to.have.property('invoiceIds');
        // expect(instance.invoiceIds).to.be(expectedValueLiteral);
      });

      it('should have the property customerId (base name: "customer_id")', function() {
        // TODO: update the code to test the property customerId
        expect(instance).to.have.property('customerId');
        // expect(instance.customerId).to.be(expectedValueLiteral);
      });

    });
  });

}));
