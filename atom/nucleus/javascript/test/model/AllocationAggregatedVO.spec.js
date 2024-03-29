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
    instance = new HydrogenNucleusApi.AllocationAggregatedVO();
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

  describe('AllocationAggregatedVO', function() {
    it('should create an instance of AllocationAggregatedVO', function() {
      // uncomment below and update the code to test AllocationAggregatedVO
      //var instane = new HydrogenNucleusApi.AllocationAggregatedVO();
      //expect(instance).to.be.a(HydrogenNucleusApi.AllocationAggregatedVO);
    });

    it('should have the property allocationCategory (base name: "allocation_category")', function() {
      // uncomment below and update the code to test the property allocationCategory
      //var instane = new HydrogenNucleusApi.AllocationAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property allocationCompositions (base name: "allocation_compositions")', function() {
      // uncomment below and update the code to test the property allocationCompositions
      //var instane = new HydrogenNucleusApi.AllocationAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property allocationDescription (base name: "allocation_description")', function() {
      // uncomment below and update the code to test the property allocationDescription
      //var instane = new HydrogenNucleusApi.AllocationAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property allocationId (base name: "allocation_id")', function() {
      // uncomment below and update the code to test the property allocationId
      //var instane = new HydrogenNucleusApi.AllocationAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property allocationName (base name: "allocation_name")', function() {
      // uncomment below and update the code to test the property allocationName
      //var instane = new HydrogenNucleusApi.AllocationAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property allocationSecondaryId (base name: "allocation_secondary_id")', function() {
      // uncomment below and update the code to test the property allocationSecondaryId
      //var instane = new HydrogenNucleusApi.AllocationAggregatedVO();
      //expect(instance).to.be();
    });

  });

}));
