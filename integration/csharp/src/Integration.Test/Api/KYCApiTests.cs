/* 
 * Hydrogen Integration API
 *
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.1
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

using Integration.Client;
using Integration.Api;
using Integration.ModelEntity;

namespace Integration.Test
{
    /// <summary>
    ///  Class for testing KYCApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class KYCApiTests
    {
        private KYCApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new KYCApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of KYCApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' KYCApi
            //Assert.IsInstanceOfType(typeof(KYCApi), instance, "instance is a KYCApi");
        }

        
        /// <summary>
        /// Test CreateKYCUsingPost
        /// </summary>
        [Test]
        public void CreateKYCUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //KycRequestCO kycRequestCO = null;
            //var response = instance.CreateKYCUsingPost(kycRequestCO);
            //Assert.IsInstanceOf<KycResponseVo> (response, "response is KycResponseVo");
        }
        
        /// <summary>
        /// Test GetKYCStatusUsingGet
        /// </summary>
        [Test]
        public void GetKYCStatusUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? getLatest = null;
            //string kycType = null;
            //Guid? nucleusBusinessId = null;
            //Guid? nucleusClientId = null;
            //string product = null;
            //var response = instance.GetKYCStatusUsingGet(getLatest, kycType, nucleusBusinessId, nucleusClientId, product);
            //Assert.IsInstanceOf<List<KycResponseVo>> (response, "response is List<KycResponseVo>");
        }
        
    }

}