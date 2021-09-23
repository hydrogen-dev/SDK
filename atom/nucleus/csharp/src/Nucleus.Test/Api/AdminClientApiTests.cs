/* 
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
    ///  Class for testing AdminClientApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class AdminClientApiTests
    {
        private AdminClientApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new AdminClientApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of AdminClientApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' AdminClientApi
            //Assert.IsInstanceOfType(typeof(AdminClientApi), instance, "instance is a AdminClientApi");
        }

        
        /// <summary>
        /// Test CreateAdminClientUsingPOST
        /// </summary>
        [Test]
        public void CreateAdminClientUsingPOSTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AdminClient _client = null;
            //var response = instance.CreateAdminClientUsingPOST(_client);
            //Assert.IsInstanceOf<AdminClient> (response, "response is AdminClient");
        }
        
        /// <summary>
        /// Test DeleteAdminClientUsingDELETE
        /// </summary>
        [Test]
        public void DeleteAdminClientUsingDELETETest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? clientId = null;
            //instance.DeleteAdminClientUsingDELETE(clientId);
            
        }
        
        /// <summary>
        /// Test GetAdminClientUsingGET
        /// </summary>
        [Test]
        public void GetAdminClientUsingGETTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? clientId = null;
            //var response = instance.GetAdminClientUsingGET(clientId);
            //Assert.IsInstanceOf<AdminClient> (response, "response is AdminClient");
        }
        
        /// <summary>
        /// Test GetAllAdminClientUsingGET
        /// </summary>
        [Test]
        public void GetAllAdminClientUsingGETTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetAllAdminClientUsingGET(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageAdminClient> (response, "response is PageAdminClient");
        }
        
        /// <summary>
        /// Test UpdateAdminClientUsingPUT
        /// </summary>
        [Test]
        public void UpdateAdminClientUsingPUTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object _client = null;
            //long? clientId = null;
            //var response = instance.UpdateAdminClientUsingPUT(_client, clientId);
            //Assert.IsInstanceOf<AdminClient> (response, "response is AdminClient");
        }
        
        /// <summary>
        /// Test UpdateClientCredentialsUsingPOST
        /// </summary>
        [Test]
        public void UpdateClientCredentialsUsingPOSTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ClientCredentials clientCredentials = null;
            //string tenantName = null;
            //var response = instance.UpdateClientCredentialsUsingPOST(clientCredentials, tenantName);
            //Assert.IsInstanceOf<AdminClient> (response, "response is AdminClient");
        }
        
    }

}
