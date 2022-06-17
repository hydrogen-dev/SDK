/*
 * Hydrogen Electron API
 * The Hydrogen Electron API
 *
 * OpenAPI spec version: 1.3.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.24
 *
 * Do not edit the class manually.
 *
 */

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'api/AuthApi', 'model/AchCardRequestCO', 'model/AchCardResponseVO', 'model/BaseResponseVO', 'model/CardBaseRequestCO', 'model/CardClientRequestCO', 'model/CardLoadRequestCO', 'model/CardLoadUnloadResponseVO', 'model/CardReplaceResponseVO', 'model/CardReserveAccountResponseVO', 'model/CardSpendingControlRequestCO', 'model/CardSpendingControlResponseVO', 'model/CardUnloadRequestCO', 'model/CreateCardClientResponseVO', 'model/SpendingControlVendorRequestDataVO', 'model/UpdateCardClientResponseVO', 'api/ACHApi', 'api/CardApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./api/AuthApi'), require('./model/AchCardRequestCO'), require('./model/AchCardResponseVO'), require('./model/BaseResponseVO'), require('./model/CardBaseRequestCO'), require('./model/CardClientRequestCO'), require('./model/CardLoadRequestCO'), require('./model/CardLoadUnloadResponseVO'), require('./model/CardReplaceResponseVO'), require('./model/CardReserveAccountResponseVO'), require('./model/CardSpendingControlRequestCO'), require('./model/CardSpendingControlResponseVO'), require('./model/CardUnloadRequestCO'), require('./model/CreateCardClientResponseVO'), require('./model/SpendingControlVendorRequestDataVO'), require('./model/UpdateCardClientResponseVO'), require('./api/ACHApi'), require('./api/CardApi'));
  }
}(function(ApiClient, AuthApi, AchCardRequestCO, AchCardResponseVO, BaseResponseVO, CardBaseRequestCO, CardClientRequestCO, CardLoadRequestCO, CardLoadUnloadResponseVO, CardReplaceResponseVO, CardReserveAccountResponseVO, CardSpendingControlRequestCO, CardSpendingControlResponseVO, CardUnloadRequestCO, CreateCardClientResponseVO, SpendingControlVendorRequestDataVO, UpdateCardClientResponseVO, ACHApi, CardApi) {
  'use strict';

  /**
   * The_Hydrogen_Electron_API.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var HydrogenElectronApi = require('index'); // See note below*.
   * var xxxSvc = new HydrogenElectronApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new HydrogenElectronApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new HydrogenElectronApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new HydrogenElectronApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 1.3.1
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The AuthApi Constructor
     * @property {api:AuthAPi}
     */
    AuthApi: AuthApi,
    /**
     * The AchCardRequestCO model constructor.
     * @property {module:model/AchCardRequestCO}
     */
    AchCardRequestCO: AchCardRequestCO,
    /**
     * The AchCardResponseVO model constructor.
     * @property {module:model/AchCardResponseVO}
     */
    AchCardResponseVO: AchCardResponseVO,
    /**
     * The BaseResponseVO model constructor.
     * @property {module:model/BaseResponseVO}
     */
    BaseResponseVO: BaseResponseVO,
    /**
     * The CardBaseRequestCO model constructor.
     * @property {module:model/CardBaseRequestCO}
     */
    CardBaseRequestCO: CardBaseRequestCO,
    /**
     * The CardClientRequestCO model constructor.
     * @property {module:model/CardClientRequestCO}
     */
    CardClientRequestCO: CardClientRequestCO,
    /**
     * The CardLoadRequestCO model constructor.
     * @property {module:model/CardLoadRequestCO}
     */
    CardLoadRequestCO: CardLoadRequestCO,
    /**
     * The CardLoadUnloadResponseVO model constructor.
     * @property {module:model/CardLoadUnloadResponseVO}
     */
    CardLoadUnloadResponseVO: CardLoadUnloadResponseVO,
    /**
     * The CardReplaceResponseVO model constructor.
     * @property {module:model/CardReplaceResponseVO}
     */
    CardReplaceResponseVO: CardReplaceResponseVO,
    /**
     * The CardReserveAccountResponseVO model constructor.
     * @property {module:model/CardReserveAccountResponseVO}
     */
    CardReserveAccountResponseVO: CardReserveAccountResponseVO,
    /**
     * The CardSpendingControlRequestCO model constructor.
     * @property {module:model/CardSpendingControlRequestCO}
     */
    CardSpendingControlRequestCO: CardSpendingControlRequestCO,
    /**
     * The CardSpendingControlResponseVO model constructor.
     * @property {module:model/CardSpendingControlResponseVO}
     */
    CardSpendingControlResponseVO: CardSpendingControlResponseVO,
    /**
     * The CardUnloadRequestCO model constructor.
     * @property {module:model/CardUnloadRequestCO}
     */
    CardUnloadRequestCO: CardUnloadRequestCO,
    /**
     * The CreateCardClientResponseVO model constructor.
     * @property {module:model/CreateCardClientResponseVO}
     */
    CreateCardClientResponseVO: CreateCardClientResponseVO,
    /**
     * The SpendingControlVendorRequestDataVO model constructor.
     * @property {module:model/SpendingControlVendorRequestDataVO}
     */
    SpendingControlVendorRequestDataVO: SpendingControlVendorRequestDataVO,
    /**
     * The UpdateCardClientResponseVO model constructor.
     * @property {module:model/UpdateCardClientResponseVO}
     */
    UpdateCardClientResponseVO: UpdateCardClientResponseVO,
    /**
     * The ACHApi service constructor.
     * @property {module:api/ACHApi}
     */
    ACHApi: ACHApi,
    /**
     * The CardApi service constructor.
     * @property {module:api/CardApi}
     */
    CardApi: CardApi
  };

  return exports;
}));
