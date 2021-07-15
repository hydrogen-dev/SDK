/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
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
    instance = new HydrogenNucleusApi.BenchmarkApi();
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

  describe('BenchmarkApi', function() {
    describe('createBenchmarkUsingPost', function() {
      it('should call createBenchmarkUsingPost successfully', function(done) {
        //uncomment below and update the code to test createBenchmarkUsingPost
        //instance.createBenchmarkUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteBenchmarkUsingDelete', function() {
      it('should call deleteBenchmarkUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteBenchmarkUsingDelete
        //instance.deleteBenchmarkUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBenchmarkAllUsingGet', function() {
      it('should call getBenchmarkAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getBenchmarkAllUsingGet
        //instance.getBenchmarkAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBenchmarkAssetSizeAllUsingGet', function() {
      it('should call getBenchmarkAssetSizeAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getBenchmarkAssetSizeAllUsingGet
        //instance.getBenchmarkAssetSizeAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBenchmarkUsingGet', function() {
      it('should call getBenchmarkUsingGet successfully', function(done) {
        //uncomment below and update the code to test getBenchmarkUsingGet
        //instance.getBenchmarkUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateBenchmarkUsingPut', function() {
      it('should call updateBenchmarkUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateBenchmarkUsingPut
        //instance.updateBenchmarkUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
