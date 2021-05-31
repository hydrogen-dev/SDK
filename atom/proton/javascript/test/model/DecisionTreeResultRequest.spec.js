/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
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
    describe('DecisionTreeResultRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.DecisionTreeResultRequest();
      });

      it('should create an instance of DecisionTreeResultRequest', function() {
        // TODO: update the code to test DecisionTreeResultRequest
        expect(instance).to.be.a(HydrogenProtonApi.DecisionTreeResultRequest);
      });

      it('should have the property entityType (base name: "entity_type")', function() {
        // TODO: update the code to test the property entityType
        expect(instance).to.have.property('entityType');
        // expect(instance.entityType).to.be(expectedValueLiteral);
      });

      it('should have the property answers (base name: "answers")', function() {
        // TODO: update the code to test the property answers
        expect(instance).to.have.property('answers');
        // expect(instance.answers).to.be(expectedValueLiteral);
      });

    });
  });

}));
