/**
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
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

  beforeEach(function() {
    instance = new HydrogenIntegrationApi.KycResponseVo();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('KycResponseVo', function() {
    it('should create an instance of KycResponseVo', function() {
      // uncomment below and update the code to test KycResponseVo
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be.a(HydrogenIntegrationApi.KycResponseVo);
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

    it('should have the property kycStatus (base name: "kyc_status")', function() {
      // uncomment below and update the code to test the property kycStatus
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

    it('should have the property kycType (base name: "kyc_type")', function() {
      // uncomment below and update the code to test the property kycType
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

    it('should have the property nucleusBusinessId (base name: "nucleus_business_id")', function() {
      // uncomment below and update the code to test the property nucleusBusinessId
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

    it('should have the property nucleusClientId (base name: "nucleus_client_id")', function() {
      // uncomment below and update the code to test the property nucleusClientId
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

    it('should have the property nucleusDocumentId (base name: "nucleus_document_id")', function() {
      // uncomment below and update the code to test the property nucleusDocumentId
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

    it('should have the property product (base name: "product")', function() {
      // uncomment below and update the code to test the property product
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

    it('should have the property vendorName (base name: "vendor_name")', function() {
      // uncomment below and update the code to test the property vendorName
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

    it('should have the property vendorRequestData (base name: "vendor_request_data")', function() {
      // uncomment below and update the code to test the property vendorRequestData
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

    it('should have the property vendorResponse (base name: "vendor_response")', function() {
      // uncomment below and update the code to test the property vendorResponse
      //var instane = new HydrogenIntegrationApi.KycResponseVo();
      //expect(instance).to.be();
    });

  });

}));
