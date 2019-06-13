/**
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.2-SNAPSHOT
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
    factory(root.expect, root.atom_api);
  }
}(this, function(expect, atom_api) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new atom_api.PaginationSort();
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

  describe('PaginationSort', function() {
    it('should create an instance of PaginationSort', function() {
      // uncomment below and update the code to test PaginationSort
      //var instance = new atom_api.PaginationSort();
      //expect(instance).to.be.a(atom_api.PaginationSort);
    });

    it('should have the property direction (base name: "direction")', function() {
      // uncomment below and update the code to test the property direction
      //var instance = new atom_api.PaginationSort();
      //expect(instance).to.be();
    });

    it('should have the property property (base name: "property")', function() {
      // uncomment below and update the code to test the property property
      //var instance = new atom_api.PaginationSort();
      //expect(instance).to.be();
    });

    it('should have the property ignoreCase (base name: "ignore_case")', function() {
      // uncomment below and update the code to test the property ignoreCase
      //var instance = new atom_api.PaginationSort();
      //expect(instance).to.be();
    });

    it('should have the property nullHandling (base name: "null_handling")', function() {
      // uncomment below and update the code to test the property nullHandling
      //var instance = new atom_api.PaginationSort();
      //expect(instance).to.be();
    });

    it('should have the property descending (base name: "descending")', function() {
      // uncomment below and update the code to test the property descending
      //var instance = new atom_api.PaginationSort();
      //expect(instance).to.be();
    });

    it('should have the property ascending (base name: "ascending")', function() {
      // uncomment below and update the code to test the property ascending
      //var instance = new atom_api.PaginationSort();
      //expect(instance).to.be();
    });

  });

}));
