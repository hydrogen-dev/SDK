/*
 * Hydrogen Electron API
 * The Hydrogen Electron API
 *
 * OpenAPI spec version: 1.3.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.24
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
    factory(root.expect, root.HydrogenElectronApi);
  }
}(this, function(expect, HydrogenElectronApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('CardSpendingControlRequestCO', function() {
      beforeEach(function() {
        instance = new HydrogenElectronApi.CardSpendingControlRequestCO();
      });

      it('should create an instance of CardSpendingControlRequestCO', function() {
        // TODO: update the code to test CardSpendingControlRequestCO
        expect(instance).to.be.a(HydrogenElectronApi.CardSpendingControlRequestCO);
      });

      it('should have the property nucleusSpendingControlId (base name: "nucleus_spending_control_id")', function() {
        // TODO: update the code to test the property nucleusSpendingControlId
        expect(instance).to.have.property('nucleusSpendingControlId');
        // expect(instance.nucleusSpendingControlId).to.be(expectedValueLiteral);
      });

    });
  });

}));
