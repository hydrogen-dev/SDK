/* 
 * Hydrogen Proton API
 *
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Proton.Client;
using Proton.Api;

namespace Proton.Test
{
    /// <summary>
    ///  Class for testing PersonalFinancialManagementApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class PersonalFinancialManagementApiTests
    {
        private PersonalFinancialManagementApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new PersonalFinancialManagementApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of PersonalFinancialManagementApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' PersonalFinancialManagementApi
            //Assert.IsInstanceOfType(typeof(PersonalFinancialManagementApi), instance, "instance is a PersonalFinancialManagementApi");
        }

        
        /// <summary>
        /// Test BudgetCalculator
        /// </summary>
        [Test]
        public void BudgetCalculatorTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //BudgetCalculatorRequest budgetCalculatorRequest = null;
            //var response = instance.BudgetCalculator(budgetCalculatorRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test CashFlowAnalysis
        /// </summary>
        [Test]
        public void CashFlowAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CashFlowAnalysisRequest cashFlowAnalysisRequest = null;
            //var response = instance.CashFlowAnalysis(cashFlowAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test FeeAnalysis
        /// </summary>
        [Test]
        public void FeeAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //FeeAnalysisRequest feeAnalysisRequest = null;
            //var response = instance.FeeAnalysis(feeAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test FinancialPicture
        /// </summary>
        [Test]
        public void FinancialPictureTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //FinancialPictureRequest financialPictureRequest = null;
            //var response = instance.FinancialPicture(financialPictureRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test RecurringTransactionAnalysis
        /// </summary>
        [Test]
        public void RecurringTransactionAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //RecurringTransactionAnalysisRequest recurringTransactionAnalysisRequest = null;
            //var response = instance.RecurringTransactionAnalysis(recurringTransactionAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test SpendingAnalysis
        /// </summary>
        [Test]
        public void SpendingAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //SpendingAnalysisRequest spendingAnalysisRequest = null;
            //var response = instance.SpendingAnalysis(spendingAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
    }

}
