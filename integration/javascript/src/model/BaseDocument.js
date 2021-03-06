/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.14
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/DigitalDocumentData'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DigitalDocumentData'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.BaseDocument = factory(root.HydrogenIntegrationApi.ApiClient, root.HydrogenIntegrationApi.DigitalDocumentData);
  }
}(this, function(ApiClient, DigitalDocumentData) {
  'use strict';

  /**
   * The BaseDocument model module.
   * @module model/BaseDocument
   * @version 1.2.1
   */

  /**
   * Constructs a new <code>BaseDocument</code>.
   * @alias module:model/BaseDocument
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>BaseDocument</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BaseDocument} obj Optional instance to populate.
   * @return {module:model/BaseDocument} The populated <code>BaseDocument</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('data'))
        obj.data = DigitalDocumentData.constructFromObject(data['data']);
      if (data.hasOwnProperty('type'))
        obj.type = ApiClient.convertToType(data['type'], 'String');
    }
    return obj;
  }

  /**
   * @member {module:model/DigitalDocumentData} data
   */
  exports.prototype.data = undefined;

  /**
   * @member {module:model/BaseDocument.TypeEnum} type
   */
  exports.prototype.type = undefined;


  /**
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "BASIC_INFO"
     * @const
     */
    BASIC_INFO: "BASIC_INFO",

    /**
     * value: "ADDRESS_INFO"
     * @const
     */
    ADDRESS_INFO: "ADDRESS_INFO",

    /**
     * value: "PERSONAL_INFO"
     * @const
     */
    PERSONAL_INFO: "PERSONAL_INFO",

    /**
     * value: "IDENTIFICATION_INFO"
     * @const
     */
    IDENTIFICATION_INFO: "IDENTIFICATION_INFO",

    /**
     * value: "EMPLOYMENT_INFO"
     * @const
     */
    EMPLOYMENT_INFO: "EMPLOYMENT_INFO",

    /**
     * value: "INVESTOR_PROFILE_INFO"
     * @const
     */
    INVESTOR_PROFILE_INFO: "INVESTOR_PROFILE_INFO",

    /**
     * value: "COMPLIANCE_AML_INFO"
     * @const
     */
    COMPLIANCE_AML_INFO: "COMPLIANCE_AML_INFO",

    /**
     * value: "DISCLOSURES"
     * @const
     */
    DISCLOSURES: "DISCLOSURES",

    /**
     * value: "MARGIN_DISCLOSURE"
     * @const
     */
    MARGIN_DISCLOSURE: "MARGIN_DISCLOSURE",

    /**
     * value: "MARKETING_INFO"
     * @const
     */
    MARKETING_INFO: "MARKETING_INFO",

    /**
     * value: "CUSTODIAN_INFO"
     * @const
     */
    CUSTODIAN_INFO: "CUSTODIAN_INFO",

    /**
     * value: "INSTITUTIONAL_INFO"
     * @const
     */
    INSTITUTIONAL_INFO: "INSTITUTIONAL_INFO",

    /**
     * value: "DIRECTOR_INFO"
     * @const
     */
    DIRECTOR_INFO: "DIRECTOR_INFO",

    /**
     * value: "TRUST_INFO"
     * @const
     */
    TRUST_INFO: "TRUST_INFO",

    /**
     * value: "JOINT_BASIC_INFO"
     * @const
     */
    JOINT_BASIC_INFO: "JOINT_BASIC_INFO",

    /**
     * value: "JOINT_ADDRESS_INFO"
     * @const
     */
    JOINT_ADDRESS_INFO: "JOINT_ADDRESS_INFO",

    /**
     * value: "JOINT_PERSONAL_INFO"
     * @const
     */
    JOINT_PERSONAL_INFO: "JOINT_PERSONAL_INFO",

    /**
     * value: "JOINT_IDENTIFICATION_INFO"
     * @const
     */
    JOINT_IDENTIFICATION_INFO: "JOINT_IDENTIFICATION_INFO",

    /**
     * value: "JOINT_EMPLOYMENT_INFO"
     * @const
     */
    JOINT_EMPLOYMENT_INFO: "JOINT_EMPLOYMENT_INFO",

    /**
     * value: "JOINT_INVESTOR_PROFILE_INFO"
     * @const
     */
    JOINT_INVESTOR_PROFILE_INFO: "JOINT_INVESTOR_PROFILE_INFO",

    /**
     * value: "JOINT_COMPLIANCE_AML_INFO"
     * @const
     */
    JOINT_COMPLIANCE_AML_INFO: "JOINT_COMPLIANCE_AML_INFO",

    /**
     * value: "JOINT_DISCLOSURES"
     * @const
     */
    JOINT_DISCLOSURES: "JOINT_DISCLOSURES",

    /**
     * value: "JOINT_MARGIN_DISCLOSURE"
     * @const
     */
    JOINT_MARGIN_DISCLOSURE: "JOINT_MARGIN_DISCLOSURE",

    /**
     * value: "JOINT_MARKETING_INFO"
     * @const
     */
    JOINT_MARKETING_INFO: "JOINT_MARKETING_INFO",

    /**
     * value: "JOINT_CUSTODIAN_INFO"
     * @const
     */
    JOINT_CUSTODIAN_INFO: "JOINT_CUSTODIAN_INFO",

    /**
     * value: "JOINT_INSTITUTIONAL_INFO"
     * @const
     */
    JOINT_INSTITUTIONAL_INFO: "JOINT_INSTITUTIONAL_INFO",

    /**
     * value: "JOINT_DIRECTOR_INFO"
     * @const
     */
    JOINT_DIRECTOR_INFO: "JOINT_DIRECTOR_INFO",

    /**
     * value: "JOINT_TRUST_INFO"
     * @const
     */
    JOINT_TRUST_INFO: "JOINT_TRUST_INFO"
  };

  return exports;

}));
