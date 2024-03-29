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
 * Swagger Codegen version: 2.4.21
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
    describe('CardTransactionAuthorizationRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.CardTransactionAuthorizationRequest();
      });

      it('should create an instance of CardTransactionAuthorizationRequest', function() {
        // TODO: update the code to test CardTransactionAuthorizationRequest
        expect(instance).to.be.a(HydrogenProtonApi.CardTransactionAuthorizationRequest);
      });

      it('should have the property currencyCode (base name: "currency_code")', function() {
        // TODO: update the code to test the property currencyCode
        expect(instance).to.have.property('currencyCode');
        // expect(instance.currencyCode).to.be(expectedValueLiteral);
      });

      it('should have the property memo (base name: "memo")', function() {
        // TODO: update the code to test the property memo
        expect(instance).to.have.property('memo');
        // expect(instance.memo).to.be(expectedValueLiteral);
      });

      it('should have the property partialAuth (base name: "partial_auth")', function() {
        // TODO: update the code to test the property partialAuth
        expect(instance).to.have.property('partialAuth');
        // expect(instance.partialAuth).to.be(expectedValueLiteral);
      });

      it('should have the property transactionType (base name: "transaction_type")', function() {
        // TODO: update the code to test the property transactionType
        expect(instance).to.have.property('transactionType');
        // expect(instance.transactionType).to.be(expectedValueLiteral);
      });

      it('should have the property description (base name: "description")', function() {
        // TODO: update the code to test the property description
        expect(instance).to.have.property('description');
        // expect(instance.description).to.be(expectedValueLiteral);
      });

      it('should have the property transactionCategoryId (base name: "transaction_category_id")', function() {
        // TODO: update the code to test the property transactionCategoryId
        expect(instance).to.have.property('transactionCategoryId');
        // expect(instance.transactionCategoryId).to.be(expectedValueLiteral);
      });

      it('should have the property useAuditLog (base name: "use_audit_log")', function() {
        // TODO: update the code to test the property useAuditLog
        expect(instance).to.have.property('useAuditLog');
        // expect(instance.useAuditLog).to.be(expectedValueLiteral);
      });

      it('should have the property merchantCategoryCode (base name: "merchant_category_code")', function() {
        // TODO: update the code to test the property merchantCategoryCode
        expect(instance).to.have.property('merchantCategoryCode');
        // expect(instance.merchantCategoryCode).to.be(expectedValueLiteral);
      });

      it('should have the property cardId (base name: "card_id")', function() {
        // TODO: update the code to test the property cardId
        expect(instance).to.have.property('cardId');
        // expect(instance.cardId).to.be(expectedValueLiteral);
      });

      it('should have the property transactionCategory (base name: "transaction_category")', function() {
        // TODO: update the code to test the property transactionCategory
        expect(instance).to.have.property('transactionCategory');
        // expect(instance.transactionCategory).to.be(expectedValueLiteral);
      });

      it('should have the property cleanseData (base name: "cleanse_data")', function() {
        // TODO: update the code to test the property cleanseData
        expect(instance).to.have.property('cleanseData');
        // expect(instance.cleanseData).to.be(expectedValueLiteral);
      });

      it('should have the property authType (base name: "auth_type")', function() {
        // TODO: update the code to test the property authType
        expect(instance).to.have.property('authType');
        // expect(instance.authType).to.be(expectedValueLiteral);
      });

      it('should have the property mid (base name: "mid")', function() {
        // TODO: update the code to test the property mid
        expect(instance).to.have.property('mid');
        // expect(instance.mid).to.be(expectedValueLiteral);
      });

      it('should have the property transactionStatusScope (base name: "transaction_status_scope")', function() {
        // TODO: update the code to test the property transactionStatusScope
        expect(instance).to.have.property('transactionStatusScope');
        // expect(instance.transactionStatusScope).to.be(expectedValueLiteral);
      });

      it('should have the property location (base name: "location")', function() {
        // TODO: update the code to test the property location
        expect(instance).to.have.property('location');
        // expect(instance.location).to.be(expectedValueLiteral);
      });

      it('should have the property merchant (base name: "merchant")', function() {
        // TODO: update the code to test the property merchant
        expect(instance).to.have.property('merchant');
        // expect(instance.merchant).to.be(expectedValueLiteral);
      });

      it('should have the property amount (base name: "amount")', function() {
        // TODO: update the code to test the property amount
        expect(instance).to.have.property('amount');
        // expect(instance.amount).to.be(expectedValueLiteral);
      });

      it('should have the property _date (base name: "date")', function() {
        // TODO: update the code to test the property _date
        expect(instance).to.have.property('_date');
        // expect(instance._date).to.be(expectedValueLiteral);
      });

      it('should have the property merchantId (base name: "merchant_id")', function() {
        // TODO: update the code to test the property merchantId
        expect(instance).to.have.property('merchantId');
        // expect(instance.merchantId).to.be(expectedValueLiteral);
      });

    });
  });

}));
