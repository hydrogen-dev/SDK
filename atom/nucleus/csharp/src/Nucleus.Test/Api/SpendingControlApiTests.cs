/* 
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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

using Nucleus.Client;
using Nucleus.Api;
using Nucleus.ModelEntity;

namespace Nucleus.Test
{
    /// <summary>
    ///  Class for testing SpendingControlApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class SpendingControlApiTests
    {
        private SpendingControlApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new SpendingControlApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SpendingControlApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' SpendingControlApi
            //Assert.IsInstanceOfType(typeof(SpendingControlApi), instance, "instance is a SpendingControlApi");
        }

        
        /// <summary>
        /// Test CreateSpendingControlUsingPost
        /// </summary>
        [Test]
        public void CreateSpendingControlUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //SpendingControl spendingControl = null;
            //var response = instance.CreateSpendingControlUsingPost(spendingControl);
            //Assert.IsInstanceOf<SpendingControl> (response, "response is SpendingControl");
        }
        
        /// <summary>
        /// Test DeleteSpendingControlUsingDelete
        /// </summary>
        [Test]
        public void DeleteSpendingControlUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? spendingControlId = null;
            //instance.DeleteSpendingControlUsingDelete(spendingControlId);
            
        }
        
        /// <summary>
        /// Test GetSpendingControlAllUsingGet
        /// </summary>
        [Test]
        public void GetSpendingControlAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetSpendingControlAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageSpendingControl> (response, "response is PageSpendingControl");
        }
        
        /// <summary>
        /// Test GetSpendingControlUsingGet
        /// </summary>
        [Test]
        public void GetSpendingControlUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? spendingControlId = null;
            //var response = instance.GetSpendingControlUsingGet(spendingControlId);
            //Assert.IsInstanceOf<SpendingControl> (response, "response is SpendingControl");
        }
        
        /// <summary>
        /// Test UpdateSpendingControlUsingPut
        /// </summary>
        [Test]
        public void UpdateSpendingControlUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object spendingControl = null;
            //Guid? spendingControlId = null;
            //var response = instance.UpdateSpendingControlUsingPut(spendingControl, spendingControlId);
            //Assert.IsInstanceOf<SpendingControl> (response, "response is SpendingControl");
        }
        
    }

}
