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
    instance = new HydrogenNucleusApi.DecisionTreeApi();
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

  describe('DecisionTreeApi', function() {
    describe('createDecisionTreeResultUsingPost', function() {
      it('should call createDecisionTreeResultUsingPost successfully', function(done) {
        //uncomment below and update the code to test createDecisionTreeResultUsingPost
        //instance.createDecisionTreeResultUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createDecisionTreeUsingPost', function() {
      it('should call createDecisionTreeUsingPost successfully', function(done) {
        //uncomment below and update the code to test createDecisionTreeUsingPost
        //instance.createDecisionTreeUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createNodeRelationshipUsingPost', function() {
      it('should call createNodeRelationshipUsingPost successfully', function(done) {
        //uncomment below and update the code to test createNodeRelationshipUsingPost
        //instance.createNodeRelationshipUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createNodeUsingPost', function() {
      it('should call createNodeUsingPost successfully', function(done) {
        //uncomment below and update the code to test createNodeUsingPost
        //instance.createNodeUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteDecisionTreeUsingDelete', function() {
      it('should call deleteDecisionTreeUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteDecisionTreeUsingDelete
        //instance.deleteDecisionTreeUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteNodeRelationshipUsingDelete', function() {
      it('should call deleteNodeRelationshipUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteNodeRelationshipUsingDelete
        //instance.deleteNodeRelationshipUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteNodeUsingDelete', function() {
      it('should call deleteNodeUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteNodeUsingDelete
        //instance.deleteNodeUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getDecisionTreeAllUsingGet', function() {
      it('should call getDecisionTreeAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getDecisionTreeAllUsingGet
        //instance.getDecisionTreeAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getDecisionTreeUsingGet', function() {
      it('should call getDecisionTreeUsingGet successfully', function(done) {
        //uncomment below and update the code to test getDecisionTreeUsingGet
        //instance.getDecisionTreeUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getNodeAllUsingGet', function() {
      it('should call getNodeAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getNodeAllUsingGet
        //instance.getNodeAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getNodeRelationshipAllUsingGet', function() {
      it('should call getNodeRelationshipAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getNodeRelationshipAllUsingGet
        //instance.getNodeRelationshipAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getNodeRelationshipUsingGet', function() {
      it('should call getNodeRelationshipUsingGet successfully', function(done) {
        //uncomment below and update the code to test getNodeRelationshipUsingGet
        //instance.getNodeRelationshipUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getNodeUsingGet', function() {
      it('should call getNodeUsingGet successfully', function(done) {
        //uncomment below and update the code to test getNodeUsingGet
        //instance.getNodeUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateDecisionTreeUsingPut', function() {
      it('should call updateDecisionTreeUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateDecisionTreeUsingPut
        //instance.updateDecisionTreeUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateNodeRelationshipUsingPut', function() {
      it('should call updateNodeRelationshipUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateNodeRelationshipUsingPut
        //instance.updateNodeRelationshipUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateNodeUsingPut', function() {
      it('should call updateNodeUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateNodeUsingPut
        //instance.updateNodeUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
