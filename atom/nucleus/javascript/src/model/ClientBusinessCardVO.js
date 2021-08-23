/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BusinessDetailsVO', 'model/CardDetailsVO', 'model/ClientBusinessTotalCardBalanceVO', 'model/ClientCardVO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./BusinessDetailsVO'), require('./CardDetailsVO'), require('./ClientBusinessTotalCardBalanceVO'), require('./ClientCardVO'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.ClientBusinessCardVO = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.BusinessDetailsVO, root.HydrogenNucleusApi.CardDetailsVO, root.HydrogenNucleusApi.ClientBusinessTotalCardBalanceVO, root.HydrogenNucleusApi.ClientCardVO);
  }
}(this, function(ApiClient, BusinessDetailsVO, CardDetailsVO, ClientBusinessTotalCardBalanceVO, ClientCardVO) {
  'use strict';




  /**
   * The ClientBusinessCardVO model module.
   * @module model/ClientBusinessCardVO
   * @version 1.9.4
   */

  /**
   * Constructs a new <code>ClientBusinessCardVO</code>.
   * Client/Business Card Mapping Object
   * @alias module:model/ClientBusinessCardVO
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>ClientBusinessCardVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ClientBusinessCardVO} obj Optional instance to populate.
   * @return {module:model/ClientBusinessCardVO} The populated <code>ClientBusinessCardVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('business_details')) {
        obj['business_details'] = BusinessDetailsVO.constructFromObject(data['business_details']);
      }
      if (data.hasOwnProperty('card_details')) {
        obj['card_details'] = ApiClient.convertToType(data['card_details'], [CardDetailsVO]);
      }
      if (data.hasOwnProperty('client_details')) {
        obj['client_details'] = ClientCardVO.constructFromObject(data['client_details']);
      }
      if (data.hasOwnProperty('total_balance')) {
        obj['total_balance'] = ApiClient.convertToType(data['total_balance'], [ClientBusinessTotalCardBalanceVO]);
      }
    }
    return obj;
  }

  /**
   * businessDetails
   * @member {module:model/BusinessDetailsVO} business_details
   */
  exports.prototype['business_details'] = undefined;
  /**
   * cardDetails
   * @member {Array.<module:model/CardDetailsVO>} card_details
   */
  exports.prototype['card_details'] = undefined;
  /**
   * clientDetails
   * @member {module:model/ClientCardVO} client_details
   */
  exports.prototype['client_details'] = undefined;
  /**
   * totalBalance
   * @member {Array.<module:model/ClientBusinessTotalCardBalanceVO>} total_balance
   */
  exports.prototype['total_balance'] = undefined;



  return exports;
}));


