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
    describe('ChildrenEducationConfig', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.ChildrenEducationConfig();
      });

      it('should create an instance of ChildrenEducationConfig', function() {
        // TODO: update the code to test ChildrenEducationConfig
        expect(instance).to.be.a(HydrogenProtonApi.ChildrenEducationConfig);
      });

      it('should have the property educationConfig (base name: "education_config")', function() {
        // TODO: update the code to test the property educationConfig
        expect(instance).to.have.property('educationConfig');
        // expect(instance.educationConfig).to.be(expectedValueLiteral);
      });

      it('should have the property currentAge (base name: "current_age")', function() {
        // TODO: update the code to test the property currentAge
        expect(instance).to.have.property('currentAge');
        // expect(instance.currentAge).to.be(expectedValueLiteral);
      });

    });
  });

}));
