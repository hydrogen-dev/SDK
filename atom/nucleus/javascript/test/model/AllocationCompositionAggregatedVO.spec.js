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
    instance = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
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

  describe('AllocationCompositionAggregatedVO', function() {
    it('should create an instance of AllocationCompositionAggregatedVO', function() {
      // uncomment below and update the code to test AllocationCompositionAggregatedVO
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be.a(HydrogenNucleusApi.AllocationCompositionAggregatedVO);
    });

    it('should have the property allocationCompositionCreateDate (base name: "allocation_composition_create_date")', function() {
      // uncomment below and update the code to test the property allocationCompositionCreateDate
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property allocationCompositionDate (base name: "allocation_composition_date")', function() {
      // uncomment below and update the code to test the property allocationCompositionDate
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property allocationCompositionId (base name: "allocation_composition_id")', function() {
      // uncomment below and update the code to test the property allocationCompositionId
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property allocationCompositionUpdateDate (base name: "allocation_composition_update_date")', function() {
      // uncomment below and update the code to test the property allocationCompositionUpdateDate
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property modelCategory (base name: "model_category")', function() {
      // uncomment below and update the code to test the property modelCategory
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property modelCurrentWeight (base name: "model_current_weight")', function() {
      // uncomment below and update the code to test the property modelCurrentWeight
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property modelDescription (base name: "model_description")', function() {
      // uncomment below and update the code to test the property modelDescription
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property modelHoldings (base name: "model_holdings")', function() {
      // uncomment below and update the code to test the property modelHoldings
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property modelId (base name: "model_id")', function() {
      // uncomment below and update the code to test the property modelId
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property modelName (base name: "model_name")', function() {
      // uncomment below and update the code to test the property modelName
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property modelSecondaryId (base name: "model_secondary_id")', function() {
      // uncomment below and update the code to test the property modelSecondaryId
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

    it('should have the property modelStrategicWeight (base name: "model_strategic_weight")', function() {
      // uncomment below and update the code to test the property modelStrategicWeight
      //var instane = new HydrogenNucleusApi.AllocationCompositionAggregatedVO();
      //expect(instance).to.be();
    });

  });

}));
