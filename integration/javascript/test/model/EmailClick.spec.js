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
    instance = new HydrogenIntegrationApi.EmailClick();
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

  describe('EmailClick', function() {
    it('should create an instance of EmailClick', function() {
      // uncomment below and update the code to test EmailClick
      //var instane = new HydrogenIntegrationApi.EmailClick();
      //expect(instance).to.be.a(HydrogenIntegrationApi.EmailClick);
    });

    it('should have the property clickTimestamp (base name: "click_timestamp")', function() {
      // uncomment below and update the code to test the property clickTimestamp
      //var instane = new HydrogenIntegrationApi.EmailClick();
      //expect(instance).to.be();
    });

    it('should have the property email (base name: "email")', function() {
      // uncomment below and update the code to test the property email
      //var instane = new HydrogenIntegrationApi.EmailClick();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenIntegrationApi.EmailClick();
      //expect(instance).to.be();
    });

    it('should have the property url (base name: "url")', function() {
      // uncomment below and update the code to test the property url
      //var instane = new HydrogenIntegrationApi.EmailClick();
      //expect(instance).to.be();
    });

  });

}));
