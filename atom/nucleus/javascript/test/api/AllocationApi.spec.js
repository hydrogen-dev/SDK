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
    instance = new HydrogenNucleusApi.AllocationApi();
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

  describe('AllocationApi', function() {
    describe('createAllocationCompositionUsingPost', function() {
      it('should call createAllocationCompositionUsingPost successfully', function(done) {
        //uncomment below and update the code to test createAllocationCompositionUsingPost
        //instance.createAllocationCompositionUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createAllocationUsingPost', function() {
      it('should call createAllocationUsingPost successfully', function(done) {
        //uncomment below and update the code to test createAllocationUsingPost
        //instance.createAllocationUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteAllocationCompositionUsingDelete', function() {
      it('should call deleteAllocationCompositionUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteAllocationCompositionUsingDelete
        //instance.deleteAllocationCompositionUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteAllocationUsingDelete', function() {
      it('should call deleteAllocationUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteAllocationUsingDelete
        //instance.deleteAllocationUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAllocationAllAggregateDataUsingGet', function() {
      it('should call getAllocationAllAggregateDataUsingGet successfully', function(done) {
        //uncomment below and update the code to test getAllocationAllAggregateDataUsingGet
        //instance.getAllocationAllAggregateDataUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAllocationAllAssetSizeAllUsingGet', function() {
      it('should call getAllocationAllAssetSizeAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getAllocationAllAssetSizeAllUsingGet
        //instance.getAllocationAllAssetSizeAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAllocationAllHoldingAllUsingGet', function() {
      it('should call getAllocationAllHoldingAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getAllocationAllHoldingAllUsingGet
        //instance.getAllocationAllHoldingAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAllocationAllTransactionAllUsingGet', function() {
      it('should call getAllocationAllTransactionAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getAllocationAllTransactionAllUsingGet
        //instance.getAllocationAllTransactionAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAllocationAllUsingGet', function() {
      it('should call getAllocationAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getAllocationAllUsingGet
        //instance.getAllocationAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAllocationCompositionAllUsingGet', function() {
      it('should call getAllocationCompositionAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getAllocationCompositionAllUsingGet
        //instance.getAllocationCompositionAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAllocationCompositionUsingGet', function() {
      it('should call getAllocationCompositionUsingGet successfully', function(done) {
        //uncomment below and update the code to test getAllocationCompositionUsingGet
        //instance.getAllocationCompositionUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAllocationUsingGet', function() {
      it('should call getAllocationUsingGet successfully', function(done) {
        //uncomment below and update the code to test getAllocationUsingGet
        //instance.getAllocationUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateAllocationCompositionUsingPut', function() {
      it('should call updateAllocationCompositionUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateAllocationCompositionUsingPut
        //instance.updateAllocationCompositionUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateAllocationUsingPut', function() {
      it('should call updateAllocationUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateAllocationUsingPut
        //instance.updateAllocationUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
