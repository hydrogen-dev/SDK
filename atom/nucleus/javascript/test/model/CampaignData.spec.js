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
    instance = new HydrogenNucleusApi.CampaignData();
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

  describe('CampaignData', function() {
    it('should create an instance of CampaignData', function() {
      // uncomment below and update the code to test CampaignData
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be.a(HydrogenNucleusApi.CampaignData);
    });

    it('should have the property campaignId (base name: "campaign_id")', function() {
      // uncomment below and update the code to test the property campaignId
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property clickThroughRate (base name: "click_through_rate")', function() {
      // uncomment below and update the code to test the property clickThroughRate
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property endDate (base name: "end_date")', function() {
      // uncomment below and update the code to test the property endDate
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property lineItem (base name: "line_item")', function() {
      // uncomment below and update the code to test the property lineItem
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property publisherCampaignName (base name: "publisher_campaign_name")', function() {
      // uncomment below and update the code to test the property publisherCampaignName
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property startDate (base name: "start_date")', function() {
      // uncomment below and update the code to test the property startDate
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property totalClicks (base name: "total_clicks")', function() {
      // uncomment below and update the code to test the property totalClicks
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property totalImpressions (base name: "total_impressions")', function() {
      // uncomment below and update the code to test the property totalImpressions
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.CampaignData();
      //expect(instance).to.be();
    });

  });

}));
