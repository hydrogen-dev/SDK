/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.14
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
    factory(root.expect, root.HydrogenIntegrationApi);
  }
}(this, function(expect, HydrogenIntegrationApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('BaasClientVendorDataVO', function() {
      beforeEach(function() {
        instance = new HydrogenIntegrationApi.BaasClientVendorDataVO();
      });

      it('should create an instance of BaasClientVendorDataVO', function() {
        // TODO: update the code to test BaasClientVendorDataVO
        expect(instance).to.be.a(HydrogenIntegrationApi.BaasClientVendorDataVO);
      });

      it('should have the property addresses (base name: "addresses")', function() {
        // TODO: update the code to test the property addresses
        expect(instance).to.have.property('addresses');
        // expect(instance.addresses).to.be(expectedValueLiteral);
      });

      it('should have the property backupWithHoldingPercent (base name: "backup_with_holding_percent")', function() {
        // TODO: update the code to test the property backupWithHoldingPercent
        expect(instance).to.have.property('backupWithHoldingPercent');
        // expect(instance.backupWithHoldingPercent).to.be(expectedValueLiteral);
      });

      it('should have the property countryOfCitizenship (base name: "country_of_citizenship")', function() {
        // TODO: update the code to test the property countryOfCitizenship
        expect(instance).to.have.property('countryOfCitizenship');
        // expect(instance.countryOfCitizenship).to.be(expectedValueLiteral);
      });

      it('should have the property dateOfBirth (base name: "date_of_birth")', function() {
        // TODO: update the code to test the property dateOfBirth
        expect(instance).to.have.property('dateOfBirth');
        // expect(instance.dateOfBirth).to.be(expectedValueLiteral);
      });

      it('should have the property email (base name: "email")', function() {
        // TODO: update the code to test the property email
        expect(instance).to.have.property('email');
        // expect(instance.email).to.be(expectedValueLiteral);
      });

      it('should have the property firstName (base name: "first_name")', function() {
        // TODO: update the code to test the property firstName
        expect(instance).to.have.property('firstName');
        // expect(instance.firstName).to.be(expectedValueLiteral);
      });

      it('should have the property gender (base name: "gender")', function() {
        // TODO: update the code to test the property gender
        expect(instance).to.have.property('gender');
        // expect(instance.gender).to.be(expectedValueLiteral);
      });

      it('should have the property identificationNumber (base name: "identification_number")', function() {
        // TODO: update the code to test the property identificationNumber
        expect(instance).to.have.property('identificationNumber');
        // expect(instance.identificationNumber).to.be(expectedValueLiteral);
      });

      it('should have the property identificationNumberType (base name: "identification_number_type")', function() {
        // TODO: update the code to test the property identificationNumberType
        expect(instance).to.have.property('identificationNumberType');
        // expect(instance.identificationNumberType).to.be(expectedValueLiteral);
      });

      it('should have the property identifications (base name: "identifications")', function() {
        // TODO: update the code to test the property identifications
        expect(instance).to.have.property('identifications');
        // expect(instance.identifications).to.be(expectedValueLiteral);
      });

      it('should have the property lastName (base name: "last_name")', function() {
        // TODO: update the code to test the property lastName
        expect(instance).to.have.property('lastName');
        // expect(instance.lastName).to.be(expectedValueLiteral);
      });

      it('should have the property metadata (base name: "metadata")', function() {
        // TODO: update the code to test the property metadata
        expect(instance).to.have.property('metadata');
        // expect(instance.metadata).to.be(expectedValueLiteral);
      });

      it('should have the property middleName (base name: "middle_name")', function() {
        // TODO: update the code to test the property middleName
        expect(instance).to.have.property('middleName');
        // expect(instance.middleName).to.be(expectedValueLiteral);
      });

      it('should have the property phoneNumber (base name: "phone_number")', function() {
        // TODO: update the code to test the property phoneNumber
        expect(instance).to.have.property('phoneNumber');
        // expect(instance.phoneNumber).to.be(expectedValueLiteral);
      });

      it('should have the property politicallyExposedPerson (base name: "politically_exposed_person")', function() {
        // TODO: update the code to test the property politicallyExposedPerson
        expect(instance).to.have.property('politicallyExposedPerson');
        // expect(instance.politicallyExposedPerson).to.be(expectedValueLiteral);
      });

      it('should have the property regO (base name: "reg_o")', function() {
        // TODO: update the code to test the property regO
        expect(instance).to.have.property('regO');
        // expect(instance.regO).to.be(expectedValueLiteral);
      });

      it('should have the property suffix (base name: "suffix")', function() {
        // TODO: update the code to test the property suffix
        expect(instance).to.have.property('suffix');
        // expect(instance.suffix).to.be(expectedValueLiteral);
      });

      it('should have the property title (base name: "title")', function() {
        // TODO: update the code to test the property title
        expect(instance).to.have.property('title');
        // expect(instance.title).to.be(expectedValueLiteral);
      });

    });
  });

}));
