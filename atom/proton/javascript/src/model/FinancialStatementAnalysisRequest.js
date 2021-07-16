/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.19
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.FinancialStatementAnalysisRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The FinancialStatementAnalysisRequest model module.
   * @module model/FinancialStatementAnalysisRequest
   * @version 1.9.2
   */

  /**
   * Constructs a new <code>FinancialStatementAnalysisRequest</code>.
   * @alias module:model/FinancialStatementAnalysisRequest
   * @class
   * @param accountingMethod {module:model/FinancialStatementAnalysisRequest.AccountingMethodEnum} 
   */
  var exports = function(accountingMethod) {
    this.accountingMethod = accountingMethod;
  };

  /**
   * Constructs a <code>FinancialStatementAnalysisRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FinancialStatementAnalysisRequest} obj Optional instance to populate.
   * @return {module:model/FinancialStatementAnalysisRequest} The populated <code>FinancialStatementAnalysisRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('currency_code'))
        obj.currencyCode = ApiClient.convertToType(data['currency_code'], 'String');
      if (data.hasOwnProperty('client_id'))
        obj.clientId = ApiClient.convertToType(data['client_id'], 'String');
      if (data.hasOwnProperty('show_history'))
        obj.showHistory = ApiClient.convertToType(data['show_history'], 'Boolean');
      if (data.hasOwnProperty('accounting_method'))
        obj.accountingMethod = ApiClient.convertToType(data['accounting_method'], 'String');
      if (data.hasOwnProperty('end_date'))
        obj.endDate = ApiClient.convertToType(data['end_date'], 'Date');
      if (data.hasOwnProperty('history_frequency_interval'))
        obj.historyFrequencyInterval = ApiClient.convertToType(data['history_frequency_interval'], 'String');
      if (data.hasOwnProperty('currency_conversion'))
        obj.currencyConversion = ApiClient.convertToType(data['currency_conversion'], 'String');
      if (data.hasOwnProperty('period_quarter'))
        obj.periodQuarter = ApiClient.convertToType(data['period_quarter'], 'Number');
      if (data.hasOwnProperty('statement_type'))
        obj.statementType = ApiClient.convertToType(data['statement_type'], 'String');
      if (data.hasOwnProperty('period_month'))
        obj.periodMonth = ApiClient.convertToType(data['period_month'], 'Number');
      if (data.hasOwnProperty('start_date'))
        obj.startDate = ApiClient.convertToType(data['start_date'], 'Date');
      if (data.hasOwnProperty('business_id'))
        obj.businessId = ApiClient.convertToType(data['business_id'], 'String');
      if (data.hasOwnProperty('period_year'))
        obj.periodYear = ApiClient.convertToType(data['period_year'], 'Number');
      if (data.hasOwnProperty('period_length'))
        obj.periodLength = ApiClient.convertToType(data['period_length'], 'String');
      if (data.hasOwnProperty('stat_names'))
        obj.statNames = ApiClient.convertToType(data['stat_names'], ['String']);
      if (data.hasOwnProperty('period_type'))
        obj.periodType = ApiClient.convertToType(data['period_type'], 'String');
    }
    return obj;
  }

  /**
   * @member {String} currencyCode
   */
  exports.prototype.currencyCode = undefined;

  /**
   * @member {String} clientId
   */
  exports.prototype.clientId = undefined;

  /**
   * @member {Boolean} showHistory
   * @default false
   */
  exports.prototype.showHistory = false;

  /**
   * @member {module:model/FinancialStatementAnalysisRequest.AccountingMethodEnum} accountingMethod
   */
  exports.prototype.accountingMethod = undefined;

  /**
   * @member {Date} endDate
   */
  exports.prototype.endDate = undefined;

  /**
   * @member {module:model/FinancialStatementAnalysisRequest.HistoryFrequencyIntervalEnum} historyFrequencyInterval
   * @default 'month'
   */
  exports.prototype.historyFrequencyInterval = 'month';

  /**
   * @member {String} currencyConversion
   */
  exports.prototype.currencyConversion = undefined;

  /**
   * @member {Number} periodQuarter
   */
  exports.prototype.periodQuarter = undefined;

  /**
   * @member {module:model/FinancialStatementAnalysisRequest.StatementTypeEnum} statementType
   * @default 'all'
   */
  exports.prototype.statementType = 'all';

  /**
   * @member {Number} periodMonth
   */
  exports.prototype.periodMonth = undefined;

  /**
   * @member {Date} startDate
   */
  exports.prototype.startDate = undefined;

  /**
   * @member {String} businessId
   */
  exports.prototype.businessId = undefined;

  /**
   * @member {Number} periodYear
   */
  exports.prototype.periodYear = undefined;

  /**
   * @member {module:model/FinancialStatementAnalysisRequest.PeriodLengthEnum} periodLength
   * @default 'quarterly'
   */
  exports.prototype.periodLength = 'quarterly';

  /**
   * @member {Array.<module:model/FinancialStatementAnalysisRequest.StatNamesEnum>} statNames
   */
  exports.prototype.statNames = undefined;

  /**
   * @member {module:model/FinancialStatementAnalysisRequest.PeriodTypeEnum} periodType
   */
  exports.prototype.periodType = undefined;



  /**
   * Allowed values for the <code>accountingMethod</code> property.
   * @enum {String}
   * @readonly
   */
  exports.AccountingMethodEnum = {
    /**
     * value: "accrual"
     * @const
     */
    accrual: "accrual",

    /**
     * value: "cash"
     * @const
     */
    cash: "cash"
  };


  /**
   * Allowed values for the <code>historyFrequencyInterval</code> property.
   * @enum {String}
   * @readonly
   */
  exports.HistoryFrequencyIntervalEnum = {
    /**
     * value: "day"
     * @const
     */
    day: "day",

    /**
     * value: "week"
     * @const
     */
    week: "week",

    /**
     * value: "month"
     * @const
     */
    month: "month",

    /**
     * value: "quarter"
     * @const
     */
    quarter: "quarter",

    /**
     * value: "year"
     * @const
     */
    year: "year"
  };


  /**
   * Allowed values for the <code>statementType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StatementTypeEnum = {
    /**
     * value: "income_statement"
     * @const
     */
    incomeStatement: "income_statement",

    /**
     * value: "balance_sheet"
     * @const
     */
    balanceSheet: "balance_sheet",

    /**
     * value: "all"
     * @const
     */
    all: "all"
  };


  /**
   * Allowed values for the <code>periodLength</code> property.
   * @enum {String}
   * @readonly
   */
  exports.PeriodLengthEnum = {
    /**
     * value: "annual"
     * @const
     */
    annual: "annual",

    /**
     * value: "quarterly"
     * @const
     */
    quarterly: "quarterly",

    /**
     * value: "monthly"
     * @const
     */
    monthly: "monthly",

    /**
     * value: "ytd"
     * @const
     */
    ytd: "ytd",

    /**
     * value: "qtd"
     * @const
     */
    qtd: "qtd",

    /**
     * value: "mtd"
     * @const
     */
    mtd: "mtd"
  };


  /**
   * Allowed values for the <code>statNames</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StatNamesEnum = {
    /**
     * value: "cash"
     * @const
     */
    cash: "cash",

    /**
     * value: "accounts_receivable"
     * @const
     */
    accountsReceivable: "accounts_receivable",

    /**
     * value: "total_assets"
     * @const
     */
    totalAssets: "total_assets",

    /**
     * value: "accounts_payable"
     * @const
     */
    accountsPayable: "accounts_payable",

    /**
     * value: "total_liabilities"
     * @const
     */
    totalLiabilities: "total_liabilities",

    /**
     * value: "total_equity"
     * @const
     */
    totalEquity: "total_equity",

    /**
     * value: "total_revenue"
     * @const
     */
    totalRevenue: "total_revenue",

    /**
     * value: "cogs"
     * @const
     */
    cogs: "cogs",

    /**
     * value: "total_expenses"
     * @const
     */
    totalExpenses: "total_expenses",

    /**
     * value: "operating_income"
     * @const
     */
    operatingIncome: "operating_income",

    /**
     * value: "gross_profit"
     * @const
     */
    grossProfit: "gross_profit",

    /**
     * value: "net_income"
     * @const
     */
    netIncome: "net_income",

    /**
     * value: "ebitda"
     * @const
     */
    ebitda: "ebitda"
  };


  /**
   * Allowed values for the <code>periodType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.PeriodTypeEnum = {
    /**
     * value: "calendar"
     * @const
     */
    calendar: "calendar",

    /**
     * value: "fiscal"
     * @const
     */
    fiscal: "fiscal"
  };

  return exports;

}));
