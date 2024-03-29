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
    describe('Answer', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.Answer();
      });

      it('should create an instance of Answer', function() {
        // TODO: update the code to test Answer
        expect(instance).to.be.a(HydrogenProtonApi.Answer);
      });

      it('should have the property answerId (base name: "answer_id")', function() {
        // TODO: update the code to test the property answerId
        expect(instance).to.have.property('answerId');
        // expect(instance.answerId).to.be(expectedValueLiteral);
      });

    });
  });

}));
