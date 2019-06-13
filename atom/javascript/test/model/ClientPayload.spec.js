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
    instance = new atom_api.ClientPayload();
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

  describe('ClientPayload', function() {
    it('should create an instance of ClientPayload', function() {
      // uncomment below and update the code to test ClientPayload
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be.a(atom_api.ClientPayload);
    });

    it('should have the property username (base name: "username")', function() {
      // uncomment below and update the code to test the property username
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property clientType (base name: "client_type")', function() {
      // uncomment below and update the code to test the property clientType
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property email (base name: "email")', function() {
      // uncomment below and update the code to test the property email
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property title (base name: "title")', function() {
      // uncomment below and update the code to test the property title
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property firstName (base name: "first_name")', function() {
      // uncomment below and update the code to test the property firstName
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property middleName (base name: "middle_name")', function() {
      // uncomment below and update the code to test the property middleName
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property lastName (base name: "last_name")', function() {
      // uncomment below and update the code to test the property lastName
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property phoneNumber (base name: "phone_number")', function() {
      // uncomment below and update the code to test the property phoneNumber
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property dateOfBirth (base name: "date_of_birth")', function() {
      // uncomment below and update the code to test the property dateOfBirth
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property identificationNumber (base name: "identification_number")', function() {
      // uncomment below and update the code to test the property identificationNumber
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property countryOfResidence (base name: "country_of_residence")', function() {
      // uncomment below and update the code to test the property countryOfResidence
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property isVerified (base name: "is_verified")', function() {
      // uncomment below and update the code to test the property isVerified
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property hydroId (base name: "hydro_id")', function() {
      // uncomment below and update the code to test the property hydroId
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property isActive (base name: "is_active")', function() {
      // uncomment below and update the code to test the property isActive
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property address (base name: "address")', function() {
      // uncomment below and update the code to test the property address
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instance = new atom_api.ClientPayload();
      //expect(instance).to.be();
    });

  });

}));
