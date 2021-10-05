/* 
 * Hydrogen Integration API
 *
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.1
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Integration.Api;
using Integration.ModelEntity;
using Integration.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Integration.Test
{
    /// <summary>
    ///  Class for testing Balances
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class BalancesTests
    {
        // TODO uncomment below to declare an instance variable for Balances
        //private Balances instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of Balances
            //instance = new Balances();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of Balances
        /// </summary>
        [Test]
        public void BalancesInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" Balances
            //Assert.IsInstanceOfType<Balances> (instance, "variable 'instance' is a Balances");
        }


        /// <summary>
        /// Test the property 'CurrencyCode'
        /// </summary>
        [Test]
        public void CurrencyCodeTest()
        {
            // TODO unit test for the property 'CurrencyCode'
        }
        /// <summary>
        /// Test the property 'PayableOutstanding'
        /// </summary>
        [Test]
        public void PayableOutstandingTest()
        {
            // TODO unit test for the property 'PayableOutstanding'
        }
        /// <summary>
        /// Test the property 'PayableOverdue'
        /// </summary>
        [Test]
        public void PayableOverdueTest()
        {
            // TODO unit test for the property 'PayableOverdue'
        }
        /// <summary>
        /// Test the property 'ReceivableOutstanding'
        /// </summary>
        [Test]
        public void ReceivableOutstandingTest()
        {
            // TODO unit test for the property 'ReceivableOutstanding'
        }
        /// <summary>
        /// Test the property 'ReceivableOverdue'
        /// </summary>
        [Test]
        public void ReceivableOverdueTest()
        {
            // TODO unit test for the property 'ReceivableOverdue'
        }

    }

}
