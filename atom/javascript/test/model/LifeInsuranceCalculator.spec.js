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
 * Swagger Codegen version: 2.4.8-SNAPSHOT
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
    instance = new atom_api.LifeInsuranceCalculator();
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

  describe('LifeInsuranceCalculator', function() {
    it('should create an instance of LifeInsuranceCalculator', function() {
      // uncomment below and update the code to test LifeInsuranceCalculator
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be.a(atom_api.LifeInsuranceCalculator);
    });

    it('should have the property mortgageBalance (base name: "mortgage_balance")', function() {
      // uncomment below and update the code to test the property mortgageBalance
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property otherDebt (base name: "other_debt")', function() {
      // uncomment below and update the code to test the property otherDebt
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property interestRate (base name: "interest_rate")', function() {
      // uncomment below and update the code to test the property interestRate
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property endOfLifeExpenses (base name: "end_of_life_expenses")', function() {
      // uncomment below and update the code to test the property endOfLifeExpenses
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property existingLifeInsurance (base name: "existing_life_insurance")', function() {
      // uncomment below and update the code to test the property existingLifeInsurance
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property liquidAssets (base name: "liquid_assets")', function() {
      // uncomment below and update the code to test the property liquidAssets
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property generalInflationRate (base name: "general_inflation_rate")', function() {
      // uncomment below and update the code to test the property generalInflationRate
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property educationInflationRate (base name: "education_inflation_rate")', function() {
      // uncomment below and update the code to test the property educationInflationRate
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property taxRate (base name: "tax_rate")', function() {
      // uncomment below and update the code to test the property taxRate
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property benefitAmountRounding (base name: "benefit_amount_rounding")', function() {
      // uncomment below and update the code to test the property benefitAmountRounding
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property marginOfError (base name: "margin_of_error")', function() {
      // uncomment below and update the code to test the property marginOfError
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property childrenEducationConfig (base name: "children_education_config")', function() {
      // uncomment below and update the code to test the property childrenEducationConfig
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property incomeConfig (base name: "income_config")', function() {
      // uncomment below and update the code to test the property incomeConfig
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

    it('should have the property beneficiaryBequestConfig (base name: "beneficiary_bequest_config")', function() {
      // uncomment below and update the code to test the property beneficiaryBequestConfig
      //var instance = new atom_api.LifeInsuranceCalculator();
      //expect(instance).to.be();
    });

  });

}));
