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
    ///  Class for testing CardsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CardsApiTests
    {
        private CardsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CardsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CardsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CardsApi
            //Assert.IsInstanceOfType(typeof(CardsApi), instance, "instance is a CardsApi");
        }

        
        /// <summary>
        /// Test CardAnalysis
        /// </summary>
        [Test]
        public void CardAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CardAnalysisRequest cardAnalysisRequest = null;
            //var response = instance.CardAnalysis(cardAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test CardLimitCheck
        /// </summary>
        [Test]
        public void CardLimitCheckTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CardLimitCheckRequest cardLimitCheckRequest = null;
            //var response = instance.CardLimitCheck(cardLimitCheckRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test CardTransactionAuthorization
        /// </summary>
        [Test]
        public void CardTransactionAuthorizationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CardTransactionAuthorizationRequest cardTransactionAuthorizationRequest = null;
            //var response = instance.CardTransactionAuthorization(cardTransactionAuthorizationRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
    }

}