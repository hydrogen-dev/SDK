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
    instance = new HydrogenNucleusApi.SecuritiesApi();
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

  describe('SecuritiesApi', function() {
    describe('createSecurityExclusionUsingPost', function() {
      it('should call createSecurityExclusionUsingPost successfully', function(done) {
        //uncomment below and update the code to test createSecurityExclusionUsingPost
        //instance.createSecurityExclusionUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createSecurityPriceUsingPost', function() {
      it('should call createSecurityPriceUsingPost successfully', function(done) {
        //uncomment below and update the code to test createSecurityPriceUsingPost
        //instance.createSecurityPriceUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createSecurityUsingPost', function() {
      it('should call createSecurityUsingPost successfully', function(done) {
        //uncomment below and update the code to test createSecurityUsingPost
        //instance.createSecurityUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteSecurityExclusionUsingDelete', function() {
      it('should call deleteSecurityExclusionUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteSecurityExclusionUsingDelete
        //instance.deleteSecurityExclusionUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteSecurityPriceUsingDelete', function() {
      it('should call deleteSecurityPriceUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteSecurityPriceUsingDelete
        //instance.deleteSecurityPriceUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteSecurityUsingDelete', function() {
      it('should call deleteSecurityUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteSecurityUsingDelete
        //instance.deleteSecurityUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSecurityAllUsingGet', function() {
      it('should call getSecurityAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getSecurityAllUsingGet
        //instance.getSecurityAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSecurityExclusionAllUsingGet', function() {
      it('should call getSecurityExclusionAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getSecurityExclusionAllUsingGet
        //instance.getSecurityExclusionAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSecurityExclusionUsingGet', function() {
      it('should call getSecurityExclusionUsingGet successfully', function(done) {
        //uncomment below and update the code to test getSecurityExclusionUsingGet
        //instance.getSecurityExclusionUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSecurityPriceAllUsingGet', function() {
      it('should call getSecurityPriceAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getSecurityPriceAllUsingGet
        //instance.getSecurityPriceAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSecurityPriceUsingGet', function() {
      it('should call getSecurityPriceUsingGet successfully', function(done) {
        //uncomment below and update the code to test getSecurityPriceUsingGet
        //instance.getSecurityPriceUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSecurityUsingGet', function() {
      it('should call getSecurityUsingGet successfully', function(done) {
        //uncomment below and update the code to test getSecurityUsingGet
        //instance.getSecurityUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateSecurityExclusionUsingPut', function() {
      it('should call updateSecurityExclusionUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateSecurityExclusionUsingPut
        //instance.updateSecurityExclusionUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateSecurityPriceUsingPut', function() {
      it('should call updateSecurityPriceUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateSecurityPriceUsingPut
        //instance.updateSecurityPriceUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateSecurityUsingPut', function() {
      it('should call updateSecurityUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateSecurityUsingPut
        //instance.updateSecurityUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
