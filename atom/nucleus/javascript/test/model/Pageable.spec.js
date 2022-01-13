/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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
    factory(root.expect, root.HydrogenNucleusApi);
  }
}(this, function(expect, HydrogenNucleusApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenNucleusApi.Pageable();
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

  describe('Pageable', function() {
    it('should create an instance of Pageable', function() {
      // uncomment below and update the code to test Pageable
      //var instane = new HydrogenNucleusApi.Pageable();
      //expect(instance).to.be.a(HydrogenNucleusApi.Pageable);
    });

    it('should have the property offset (base name: "offset")', function() {
      // uncomment below and update the code to test the property offset
      //var instane = new HydrogenNucleusApi.Pageable();
      //expect(instance).to.be();
    });

    it('should have the property pageNumber (base name: "page_number")', function() {
      // uncomment below and update the code to test the property pageNumber
      //var instane = new HydrogenNucleusApi.Pageable();
      //expect(instance).to.be();
    });

    it('should have the property pageSize (base name: "page_size")', function() {
      // uncomment below and update the code to test the property pageSize
      //var instane = new HydrogenNucleusApi.Pageable();
      //expect(instance).to.be();
    });

    it('should have the property paged (base name: "paged")', function() {
      // uncomment below and update the code to test the property paged
      //var instane = new HydrogenNucleusApi.Pageable();
      //expect(instance).to.be();
    });

    it('should have the property sort (base name: "sort")', function() {
      // uncomment below and update the code to test the property sort
      //var instane = new HydrogenNucleusApi.Pageable();
      //expect(instance).to.be();
    });

    it('should have the property unpaged (base name: "unpaged")', function() {
      // uncomment below and update the code to test the property unpaged
      //var instane = new HydrogenNucleusApi.Pageable();
      //expect(instance).to.be();
    });

  });

}));
