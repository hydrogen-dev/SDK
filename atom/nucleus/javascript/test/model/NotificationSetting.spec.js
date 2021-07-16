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
    instance = new HydrogenNucleusApi.NotificationSetting();
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

  describe('NotificationSetting', function() {
    it('should create an instance of NotificationSetting', function() {
      // uncomment below and update the code to test NotificationSetting
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be.a(HydrogenNucleusApi.NotificationSetting);
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property frequency (base name: "frequency")', function() {
      // uncomment below and update the code to test the property frequency
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property frequencyUnit (base name: "frequency_unit")', function() {
      // uncomment below and update the code to test the property frequencyUnit
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property isReceive (base name: "is_receive")', function() {
      // uncomment below and update the code to test the property isReceive
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property lastRunDate (base name: "last_run_date")', function() {
      // uncomment below and update the code to test the property lastRunDate
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property notificationId (base name: "notification_id")', function() {
      // uncomment below and update the code to test the property notificationId
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property thresholdValue (base name: "threshold_value")', function() {
      // uncomment below and update the code to test the property thresholdValue
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.NotificationSetting();
      //expect(instance).to.be();
    });

  });

}));
