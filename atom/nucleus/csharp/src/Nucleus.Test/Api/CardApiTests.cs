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
    ///  Class for testing CardApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CardApiTests
    {
        private CardApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CardApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CardApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CardApi
            //Assert.IsInstanceOfType(typeof(CardApi), instance, "instance is a CardApi");
        }

        
        /// <summary>
        /// Test CreateCardProgramUsingPost
        /// </summary>
        [Test]
        public void CreateCardProgramUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CardProgram cardProgramRequest = null;
            //var response = instance.CreateCardProgramUsingPost(cardProgramRequest);
            //Assert.IsInstanceOf<CardProgram> (response, "response is CardProgram");
        }
        
        /// <summary>
        /// Test CreateCardUsingPost
        /// </summary>
        [Test]
        public void CreateCardUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Card cardRequest = null;
            //var response = instance.CreateCardUsingPost(cardRequest);
            //Assert.IsInstanceOf<Card> (response, "response is Card");
        }
        
        /// <summary>
        /// Test DeleteCardProgramUsingDelete
        /// </summary>
        [Test]
        public void DeleteCardProgramUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? cardProgramId = null;
            //instance.DeleteCardProgramUsingDelete(cardProgramId);
            
        }
        
        /// <summary>
        /// Test DeleteCardUsingDelete
        /// </summary>
        [Test]
        public void DeleteCardUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? cardId = null;
            //instance.DeleteCardUsingDelete(cardId);
            
        }
        
        /// <summary>
        /// Test GetAllClientCardsUsingGet
        /// </summary>
        [Test]
        public void GetAllClientCardsUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string currencyConversion = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetAllClientCardsUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageClientBusinessCardVO> (response, "response is PageClientBusinessCardVO");
        }
        
        /// <summary>
        /// Test GetCardAllUsingGet
        /// </summary>
        [Test]
        public void GetCardAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetCardAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageCard> (response, "response is PageCard");
        }
        
        /// <summary>
        /// Test GetCardAssetSizeAggAllUsingGet
        /// </summary>
        [Test]
        public void GetCardAssetSizeAggAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? cardId = null;
            //string currencyConversion = null;
            //DateTime? endDate = null;
            //bool? getLatest = null;
            //string sortType = null;
            //DateTime? startDate = null;
            //var response = instance.GetCardAssetSizeAggAllUsingGet(cardId, currencyConversion, endDate, getLatest, sortType, startDate);
            //Assert.IsInstanceOf<List<Object>> (response, "response is List<Object>");
        }
        
        /// <summary>
        /// Test GetCardProgramAllUsingGet
        /// </summary>
        [Test]
        public void GetCardProgramAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetCardProgramAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageCardProgram> (response, "response is PageCardProgram");
        }
        
        /// <summary>
        /// Test GetCardProgramUsingGet
        /// </summary>
        [Test]
        public void GetCardProgramUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? cardProgramId = null;
            //var response = instance.GetCardProgramUsingGet(cardProgramId);
            //Assert.IsInstanceOf<CardProgram> (response, "response is CardProgram");
        }
        
        /// <summary>
        /// Test GetCardTransactionAggAllUsingGet
        /// </summary>
        [Test]
        public void GetCardTransactionAggAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? cardId = null;
            //bool? ascending = null;
            //string currencyConversion = null;
            //DateTime? endDate = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //DateTime? startDate = null;
            //var response = instance.GetCardTransactionAggAllUsingGet(cardId, ascending, currencyConversion, endDate, filter, orderBy, page, size, startDate);
            //Assert.IsInstanceOf<PagePortfolioTransaction> (response, "response is PagePortfolioTransaction");
        }
        
        /// <summary>
        /// Test GetCardTransactionAggAllUsingGet1
        /// </summary>
        [Test]
        public void GetCardTransactionAggAllUsingGet1Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? cardId = null;
            //bool? ascending = null;
            //string currencyConversion = null;
            //DateTime? endDate = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //DateTime? startDate = null;
            //var response = instance.GetCardTransactionAggAllUsingGet1(cardId, ascending, currencyConversion, endDate, filter, orderBy, page, size, startDate);
            //Assert.IsInstanceOf<PagePortfolioTransaction> (response, "response is PagePortfolioTransaction");
        }
        
        /// <summary>
        /// Test GetCardUsingGet
        /// </summary>
        [Test]
        public void GetCardUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? cardId = null;
            //var response = instance.GetCardUsingGet(cardId);
            //Assert.IsInstanceOf<Card> (response, "response is Card");
        }
        
        /// <summary>
        /// Test UpdateCardProgramUsingPut
        /// </summary>
        [Test]
        public void UpdateCardProgramUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object cardProgram = null;
            //Guid? cardProgramId = null;
            //var response = instance.UpdateCardProgramUsingPut(cardProgram, cardProgramId);
            //Assert.IsInstanceOf<CardProgram> (response, "response is CardProgram");
        }
        
        /// <summary>
        /// Test UpdateCardUsingPut
        /// </summary>
        [Test]
        public void UpdateCardUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object card = null;
            //Guid? cardId = null;
            //var response = instance.UpdateCardUsingPut(card, cardId);
            //Assert.IsInstanceOf<Card> (response, "response is Card");
        }
        
    }

}
