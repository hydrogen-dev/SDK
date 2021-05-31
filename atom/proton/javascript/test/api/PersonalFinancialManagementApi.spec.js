/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.HydrogenProtonApi);
  }
}(this, function(expect, HydrogenProtonApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenProtonApi.PersonalFinancialManagementApi();
  });

  describe('(package)', function() {
    describe('PersonalFinancialManagementApi', function() {
      describe('budgetCalculator', function() {
        it('should call budgetCalculator successfully', function(done) {
          // TODO: uncomment, update parameter values for budgetCalculator call and complete the assertions
          /*
          var budgetCalculatorRequest = new HydrogenProtonApi.BudgetCalculatorRequest();
          budgetCalculatorRequest.scope = "all";
          budgetCalculatorRequest.currencyConversion = "";
          budgetCalculatorRequest.relativeLookback = false;
          budgetCalculatorRequest.budgetId = """00000000-0000-0000-0000-000000000000";
          budgetCalculatorRequest.asOfDate = new Date();
          budgetCalculatorRequest.showAverageSpend = false;
          budgetCalculatorRequest.lookbackPeriods = 0;
          budgetCalculatorRequest.budgetDetails = new HydrogenProtonApi.BudgetDetails();
          budgetCalculatorRequest.budgetDetails.currencyCode = "";
          budgetCalculatorRequest.budgetDetails.clientId = """00000000-0000-0000-0000-000000000000";
          budgetCalculatorRequest.budgetDetails.frequency = 0;
          budgetCalculatorRequest.budgetDetails.endDate = new Date();
          budgetCalculatorRequest.budgetDetails.totalValue = 0.0;
          budgetCalculatorRequest.budgetDetails.budget = [new HydrogenProtonApi.BudgetComponent()];
          budgetCalculatorRequest.budgetDetails.budget[0].value = ;
          budgetCalculatorRequest.budgetDetails.budget[0].category = "";
          budgetCalculatorRequest.budgetDetails.budget[0].subcategory = "";
          budgetCalculatorRequest.budgetDetails.accountId = """00000000-0000-0000-0000-000000000000";
          budgetCalculatorRequest.budgetDetails.startDate = new Date();
          budgetCalculatorRequest.budgetDetails.aggregationAccounts = [new HydrogenProtonApi.BudgetAggregationAccount()];
          budgetCalculatorRequest.budgetDetails.aggregationAccounts[0].aggregationAccountId = """00000000-0000-0000-0000-000000000000";
          budgetCalculatorRequest.budgetDetails.frequencyUnit = "daily";
          budgetCalculatorRequest.transactionStatusScope = [""];
          budgetCalculatorRequest.onlyCleansed = false;
          budgetCalculatorRequest.showBudgetTrack = false;

          instance.budgetCalculator(budgetCalculatorRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('cashFlowAnalysis', function() {
        it('should call cashFlowAnalysis successfully', function(done) {
          // TODO: uncomment, update parameter values for cashFlowAnalysis call and complete the assertions
          /*
          var cashFlowAnalysisRequest = new HydrogenProtonApi.CashFlowAnalysisRequest();
          cashFlowAnalysisRequest.currencyCode = "";
          cashFlowAnalysisRequest.clientId = """00000000-0000-0000-0000-000000000000";
          cashFlowAnalysisRequest.showHistory = false;
          cashFlowAnalysisRequest.benchmarkStartDate = new Date();
          cashFlowAnalysisRequest.scope = "all";
          cashFlowAnalysisRequest.endDate = new Date();
          cashFlowAnalysisRequest.accountIds = ["""00000000-0000-0000-0000-000000000000"];
          cashFlowAnalysisRequest.benchmarkEndDate = new Date();
          cashFlowAnalysisRequest.currencyConversion = "";
          cashFlowAnalysisRequest.startDate = new Date();
          cashFlowAnalysisRequest.transactionStatusScope = [""];
          cashFlowAnalysisRequest.showIncomeDetails = false;
          cashFlowAnalysisRequest.onlyCleansed = false;
          cashFlowAnalysisRequest.householdId = """00000000-0000-0000-0000-000000000000";
          cashFlowAnalysisRequest.showSpendingDetails = false;
          cashFlowAnalysisRequest.aggregationAccountIds = ["""00000000-0000-0000-0000-000000000000"];

          instance.cashFlowAnalysis(cashFlowAnalysisRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('feeAnalysis', function() {
        it('should call feeAnalysis successfully', function(done) {
          // TODO: uncomment, update parameter values for feeAnalysis call and complete the assertions
          /*
          var feeAnalysisRequest = new HydrogenProtonApi.FeeAnalysisRequest();
          feeAnalysisRequest.currencyCode = "";
          feeAnalysisRequest.clientId = """00000000-0000-0000-0000-000000000000";
          feeAnalysisRequest.endDate = new Date();
          feeAnalysisRequest.currencyConversion = "";
          feeAnalysisRequest.startDate = new Date();
          feeAnalysisRequest.transactionStatusScope = [""];
          feeAnalysisRequest.aggregationAccountIds = ["""00000000-0000-0000-0000-000000000000"];

          instance.feeAnalysis(feeAnalysisRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('financialPicture', function() {
        it('should call financialPicture successfully', function(done) {
          // TODO: uncomment, update parameter values for financialPicture call and complete the assertions
          /*
          var financialPictureRequest = new HydrogenProtonApi.FinancialPictureRequest();
          financialPictureRequest.currencyCode = "";
          financialPictureRequest.clientId = """00000000-0000-0000-0000-000000000000";
          financialPictureRequest.showHistory = false;
          financialPictureRequest.endDate = new Date();
          financialPictureRequest.currencyConversion = "";
          financialPictureRequest.startDate = new Date();
          financialPictureRequest.showCategoryBreakdown = false;
          financialPictureRequest.showChange = false;
          financialPictureRequest.householdId = """00000000-0000-0000-0000-000000000000";
          financialPictureRequest.createLog = false;

          instance.financialPicture(financialPictureRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('recurringTransactionAnalysis', function() {
        it('should call recurringTransactionAnalysis successfully', function(done) {
          // TODO: uncomment, update parameter values for recurringTransactionAnalysis call and complete the assertions
          /*
          var recurringTransactionAnalysisRequest = new HydrogenProtonApi.RecurringTransactionAnalysisRequest();
          recurringTransactionAnalysisRequest.currencyCode = "";
          recurringTransactionAnalysisRequest.clientId = """00000000-0000-0000-0000-000000000000";
          recurringTransactionAnalysisRequest.scope = "all";
          recurringTransactionAnalysisRequest.endDate = new Date();
          recurringTransactionAnalysisRequest.accountIds = ["""00000000-0000-0000-0000-000000000000"];
          recurringTransactionAnalysisRequest.currencyConversion = "";
          recurringTransactionAnalysisRequest.intervalDeviationThreshold = 0;
          recurringTransactionAnalysisRequest.amountDeviationThreshold = 0.0;
          recurringTransactionAnalysisRequest.analyzeTransactions = false;
          recurringTransactionAnalysisRequest.startDate = new Date();
          recurringTransactionAnalysisRequest.flagTransactions = false;
          recurringTransactionAnalysisRequest.transactionStatusScope = [""];
          recurringTransactionAnalysisRequest.onlyCleansed = false;
          recurringTransactionAnalysisRequest.aggregationAccountIds = ["""00000000-0000-0000-0000-000000000000"];
          recurringTransactionAnalysisRequest.showRecurringDetails = false;

          instance.recurringTransactionAnalysis(recurringTransactionAnalysisRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('spendingAnalysis', function() {
        it('should call spendingAnalysis successfully', function(done) {
          // TODO: uncomment, update parameter values for spendingAnalysis call and complete the assertions
          /*
          var spendingAnalysisRequest = new HydrogenProtonApi.SpendingAnalysisRequest();
          spendingAnalysisRequest.merchantScope = ["""00000000-0000-0000-0000-000000000000"];
          spendingAnalysisRequest.accountIds = ["""00000000-0000-0000-0000-000000000000"];
          spendingAnalysisRequest.businessIds = ["""00000000-0000-0000-0000-000000000000"];
          spendingAnalysisRequest.cardIds = ["""00000000-0000-0000-0000-000000000000"];
          spendingAnalysisRequest.showByMerchant = false;
          spendingAnalysisRequest.showByPeriod = false;
          spendingAnalysisRequest.onlyCleansed = false;
          spendingAnalysisRequest.frequency = 0;
          spendingAnalysisRequest.endDate = new Date();
          spendingAnalysisRequest.asOfDate = new Date();
          spendingAnalysisRequest.transactionCategoryScope = ["""00000000-0000-0000-0000-000000000000"];
          spendingAnalysisRequest.startDate = new Date();
          spendingAnalysisRequest.cardStatusScope = [""];
          spendingAnalysisRequest.onlyActiveClients = false;
          spendingAnalysisRequest.lookbackPeriods = 0;
          spendingAnalysisRequest.frequencyUnit = "daily";
          spendingAnalysisRequest.householdIds = ["""00000000-0000-0000-0000-000000000000"];
          spendingAnalysisRequest.aggregationAccountIds = ["""00000000-0000-0000-0000-000000000000"];
          spendingAnalysisRequest.currencyCode = "";
          spendingAnalysisRequest.clientIds = ["""00000000-0000-0000-0000-000000000000"];
          spendingAnalysisRequest.scope = "all";
          spendingAnalysisRequest.currencyConversion = "";
          spendingAnalysisRequest.transactionStatusScope = [""];
          spendingAnalysisRequest.showByCategory = false;

          instance.spendingAnalysis(spendingAnalysisRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
