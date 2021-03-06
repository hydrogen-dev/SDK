/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: unset
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
    instance = new HydrogenNucleusApi.SupportTicketComment();
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

  describe('SupportTicketComment', function() {
    it('should create an instance of SupportTicketComment', function() {
      // uncomment below and update the code to test SupportTicketComment
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be.a(HydrogenNucleusApi.SupportTicketComment);
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

    it('should have the property hasAttachment (base name: "has_attachment")', function() {
      // uncomment below and update the code to test the property hasAttachment
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

    it('should have the property isAdmin (base name: "is_admin")', function() {
      // uncomment below and update the code to test the property isAdmin
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

    it('should have the property isRead (base name: "is_read")', function() {
      // uncomment below and update the code to test the property isRead
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

    it('should have the property supportTicketDocuments (base name: "support_ticket_documents")', function() {
      // uncomment below and update the code to test the property supportTicketDocuments
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

    it('should have the property supportTicketId (base name: "support_ticket_id")', function() {
      // uncomment below and update the code to test the property supportTicketId
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.SupportTicketComment();
      //expect(instance).to.be();
    });

  });

}));
