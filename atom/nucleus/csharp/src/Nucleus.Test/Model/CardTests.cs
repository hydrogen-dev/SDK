/* 
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Nucleus.Api;
using Nucleus.ModelEntity;
using Nucleus.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Nucleus.Test
{
    /// <summary>
    ///  Class for testing Card
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class CardTests
    {
        // TODO uncomment below to declare an instance variable for Card
        //private Card instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of Card
            //instance = new Card();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of Card
        /// </summary>
        [Test]
        public void CardInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" Card
            //Assert.IsInstanceOfType<Card> (instance, "variable 'instance' is a Card");
        }


        /// <summary>
        /// Test the property 'Address'
        /// </summary>
        [Test]
        public void AddressTest()
        {
            // TODO unit test for the property 'Address'
        }
        /// <summary>
        /// Test the property 'BusinessId'
        /// </summary>
        [Test]
        public void BusinessIdTest()
        {
            // TODO unit test for the property 'BusinessId'
        }
        /// <summary>
        /// Test the property 'CardHolderName'
        /// </summary>
        [Test]
        public void CardHolderNameTest()
        {
            // TODO unit test for the property 'CardHolderName'
        }
        /// <summary>
        /// Test the property 'CardImage'
        /// </summary>
        [Test]
        public void CardImageTest()
        {
            // TODO unit test for the property 'CardImage'
        }
        /// <summary>
        /// Test the property 'CardIssuance'
        /// </summary>
        [Test]
        public void CardIssuanceTest()
        {
            // TODO unit test for the property 'CardIssuance'
        }
        /// <summary>
        /// Test the property 'CardName'
        /// </summary>
        [Test]
        public void CardNameTest()
        {
            // TODO unit test for the property 'CardName'
        }
        /// <summary>
        /// Test the property 'CardNetwork'
        /// </summary>
        [Test]
        public void CardNetworkTest()
        {
            // TODO unit test for the property 'CardNetwork'
        }
        /// <summary>
        /// Test the property 'CardProgramId'
        /// </summary>
        [Test]
        public void CardProgramIdTest()
        {
            // TODO unit test for the property 'CardProgramId'
        }
        /// <summary>
        /// Test the property 'CardType'
        /// </summary>
        [Test]
        public void CardTypeTest()
        {
            // TODO unit test for the property 'CardType'
        }
        /// <summary>
        /// Test the property 'ClientId'
        /// </summary>
        [Test]
        public void ClientIdTest()
        {
            // TODO unit test for the property 'ClientId'
        }
        /// <summary>
        /// Test the property 'CreateDate'
        /// </summary>
        [Test]
        public void CreateDateTest()
        {
            // TODO unit test for the property 'CreateDate'
        }
        /// <summary>
        /// Test the property 'CreditLimit'
        /// </summary>
        [Test]
        public void CreditLimitTest()
        {
            // TODO unit test for the property 'CreditLimit'
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
        /// Test the property 'ExpiryDate'
        /// </summary>
        [Test]
        public void ExpiryDateTest()
        {
            // TODO unit test for the property 'ExpiryDate'
        }
        /// <summary>
        /// Test the property 'Fulfillment'
        /// </summary>
        [Test]
        public void FulfillmentTest()
        {
            // TODO unit test for the property 'Fulfillment'
        }
        /// <summary>
        /// Test the property 'Id'
        /// </summary>
        [Test]
        public void IdTest()
        {
            // TODO unit test for the property 'Id'
        }
        /// <summary>
        /// Test the property 'InstitutionId'
        /// </summary>
        [Test]
        public void InstitutionIdTest()
        {
            // TODO unit test for the property 'InstitutionId'
        }
        /// <summary>
        /// Test the property 'InstitutionName'
        /// </summary>
        [Test]
        public void InstitutionNameTest()
        {
            // TODO unit test for the property 'InstitutionName'
        }
        /// <summary>
        /// Test the property 'IsActive'
        /// </summary>
        [Test]
        public void IsActiveTest()
        {
            // TODO unit test for the property 'IsActive'
        }
        /// <summary>
        /// Test the property 'IsPinSet'
        /// </summary>
        [Test]
        public void IsPinSetTest()
        {
            // TODO unit test for the property 'IsPinSet'
        }
        /// <summary>
        /// Test the property 'IsPrimary'
        /// </summary>
        [Test]
        public void IsPrimaryTest()
        {
            // TODO unit test for the property 'IsPrimary'
        }
        /// <summary>
        /// Test the property 'IsReloadable'
        /// </summary>
        [Test]
        public void IsReloadableTest()
        {
            // TODO unit test for the property 'IsReloadable'
        }
        /// <summary>
        /// Test the property 'Mask'
        /// </summary>
        [Test]
        public void MaskTest()
        {
            // TODO unit test for the property 'Mask'
        }
        /// <summary>
        /// Test the property 'Metadata'
        /// </summary>
        [Test]
        public void MetadataTest()
        {
            // TODO unit test for the property 'Metadata'
        }
        /// <summary>
        /// Test the property 'PhoneNumber'
        /// </summary>
        [Test]
        public void PhoneNumberTest()
        {
            // TODO unit test for the property 'PhoneNumber'
        }
        /// <summary>
        /// Test the property 'PortfolioId'
        /// </summary>
        [Test]
        public void PortfolioIdTest()
        {
            // TODO unit test for the property 'PortfolioId'
        }
        /// <summary>
        /// Test the property 'PrepaidAmount'
        /// </summary>
        [Test]
        public void PrepaidAmountTest()
        {
            // TODO unit test for the property 'PrepaidAmount'
        }
        /// <summary>
        /// Test the property 'SecondaryId'
        /// </summary>
        [Test]
        public void SecondaryIdTest()
        {
            // TODO unit test for the property 'SecondaryId'
        }
        /// <summary>
        /// Test the property 'Status'
        /// </summary>
        [Test]
        public void StatusTest()
        {
            // TODO unit test for the property 'Status'
        }
        /// <summary>
        /// Test the property 'UpdateDate'
        /// </summary>
        [Test]
        public void UpdateDateTest()
        {
            // TODO unit test for the property 'UpdateDate'
        }

    }

}
