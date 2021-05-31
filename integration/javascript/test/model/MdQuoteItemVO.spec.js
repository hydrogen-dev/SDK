/**
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
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
    factory(root.expect, root.HydrogenIntegrationApi);
  }
}(this, function(expect, HydrogenIntegrationApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenIntegrationApi.MdQuoteItemVO();
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

  describe('MdQuoteItemVO', function() {
    it('should create an instance of MdQuoteItemVO', function() {
      // uncomment below and update the code to test MdQuoteItemVO
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be.a(HydrogenIntegrationApi.MdQuoteItemVO);
    });

    it('should have the property ask (base name: "ask")', function() {
      // uncomment below and update the code to test the property ask
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property askSize (base name: "ask_size")', function() {
      // uncomment below and update the code to test the property askSize
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property bid (base name: "bid")', function() {
      // uncomment below and update the code to test the property bid
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property bidSize (base name: "bid_size")', function() {
      // uncomment below and update the code to test the property bidSize
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property change (base name: "change")', function() {
      // uncomment below and update the code to test the property change
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property close (base name: "close")', function() {
      // uncomment below and update the code to test the property close
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property dayRange (base name: "day_range")', function() {
      // uncomment below and update the code to test the property dayRange
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property exchange (base name: "exchange")', function() {
      // uncomment below and update the code to test the property exchange
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property high (base name: "high")', function() {
      // uncomment below and update the code to test the property high
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property lastTrade (base name: "last_trade")', function() {
      // uncomment below and update the code to test the property lastTrade
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property lastTradeTimeStamp (base name: "last_trade_time_stamp")', function() {
      // uncomment below and update the code to test the property lastTradeTimeStamp
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property low (base name: "low")', function() {
      // uncomment below and update the code to test the property low
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property marketCap (base name: "market_cap")', function() {
      // uncomment below and update the code to test the property marketCap
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property nucleusSecurityId (base name: "nucleus_security_id")', function() {
      // uncomment below and update the code to test the property nucleusSecurityId
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property open (base name: "open")', function() {
      // uncomment below and update the code to test the property open
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property prevClose (base name: "prev_close")', function() {
      // uncomment below and update the code to test the property prevClose
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property ticker (base name: "ticker")', function() {
      // uncomment below and update the code to test the property ticker
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property volume (base name: "volume")', function() {
      // uncomment below and update the code to test the property volume
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

    it('should have the property yearRange (base name: "year_range")', function() {
      // uncomment below and update the code to test the property yearRange
      //var instane = new HydrogenIntegrationApi.MdQuoteItemVO();
      //expect(instance).to.be();
    });

  });

}));
