/*
 * Hydrogen Admin API
 * The Hydrogen Admin API
 *
 * OpenAPI spec version: 1.0.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.17
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
    factory(root.expect, root.HydrogenAdminApi);
  }
}(this, function(expect, HydrogenAdminApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('AppToken', function() {
      beforeEach(function() {
        instance = new HydrogenAdminApi.AppToken();
      });

      it('should create an instance of AppToken', function() {
        // TODO: update the code to test AppToken
        expect(instance).to.be.a(HydrogenAdminApi.AppToken);
      });

      it('should have the property appName (base name: "app_name")', function() {
        // TODO: update the code to test the property appName
        expect(instance).to.have.property('appName');
        // expect(instance.appName).to.be(expectedValueLiteral);
      });

      it('should have the property appToken (base name: "app_token")', function() {
        // TODO: update the code to test the property appToken
        expect(instance).to.have.property('appToken');
        // expect(instance.appToken).to.be(expectedValueLiteral);
      });

      it('should have the property createDate (base name: "create_date")', function() {
        // TODO: update the code to test the property createDate
        expect(instance).to.have.property('createDate');
        // expect(instance.createDate).to.be(expectedValueLiteral);
      });

      it('should have the property id (base name: "id")', function() {
        // TODO: update the code to test the property id
        expect(instance).to.have.property('id');
        // expect(instance.id).to.be(expectedValueLiteral);
      });

      it('should have the property isValid (base name: "is_valid")', function() {
        // TODO: update the code to test the property isValid
        expect(instance).to.have.property('isValid');
        // expect(instance.isValid).to.be(expectedValueLiteral);
      });

      it('should have the property tenantName (base name: "tenant_name")', function() {
        // TODO: update the code to test the property tenantName
        expect(instance).to.have.property('tenantName');
        // expect(instance.tenantName).to.be(expectedValueLiteral);
      });

      it('should have the property updateDate (base name: "update_date")', function() {
        // TODO: update the code to test the property updateDate
        expect(instance).to.have.property('updateDate');
        // expect(instance.updateDate).to.be(expectedValueLiteral);
      });

      it('should have the property username (base name: "username")', function() {
        // TODO: update the code to test the property username
        expect(instance).to.have.property('username');
        // expect(instance.username).to.be(expectedValueLiteral);
      });

    });
  });

}));
