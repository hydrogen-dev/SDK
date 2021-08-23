/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
    instance = new HydrogenNucleusApi.AllocationComposition();
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

  describe('AllocationComposition', function() {
    it('should create an instance of AllocationComposition', function() {
      // uncomment below and update the code to test AllocationComposition
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be.a(HydrogenNucleusApi.AllocationComposition);
    });

    it('should have the property allocationId (base name: "allocation_id")', function() {
      // uncomment below and update the code to test the property allocationId
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

    it('should have the property core (base name: "core")', function() {
      // uncomment below and update the code to test the property core
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

    it('should have the property currentWeight (base name: "current_weight")', function() {
      // uncomment below and update the code to test the property currentWeight
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

    it('should have the property _date (base name: "date")', function() {
      // uncomment below and update the code to test the property _date
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

    it('should have the property modelId (base name: "model_id")', function() {
      // uncomment below and update the code to test the property modelId
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

    it('should have the property strategicWeight (base name: "strategic_weight")', function() {
      // uncomment below and update the code to test the property strategicWeight
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.AllocationComposition();
      //expect(instance).to.be();
    });

  });

}));
