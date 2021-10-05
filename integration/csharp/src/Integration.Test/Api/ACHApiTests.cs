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
    ///  Class for testing ACHApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ACHApiTests
    {
        private ACHApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ACHApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ACHApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ACHApi
            //Assert.IsInstanceOfType(typeof(ACHApi), instance, "instance is a ACHApi");
        }

        
        /// <summary>
        /// Test CancelAchTransferUsingDelete
        /// </summary>
        [Test]
        public void CancelAchTransferUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? nucleusFundingId = null;
            //var response = instance.CancelAchTransferUsingDelete(nucleusFundingId);
            //Assert.IsInstanceOf<AchTransferResponseVO> (response, "response is AchTransferResponseVO");
        }
        
        /// <summary>
        /// Test CreateAchBankLinkUsingPost
        /// </summary>
        [Test]
        public void CreateAchBankLinkUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AchBankLinkRequestCO achBankLinkRequestCO = null;
            //var response = instance.CreateAchBankLinkUsingPost(achBankLinkRequestCO);
            //Assert.IsInstanceOf<AchBankLinkResponseVO> (response, "response is AchBankLinkResponseVO");
        }
        
        /// <summary>
        /// Test CreateAchBeneficialOwnerUsingPost
        /// </summary>
        [Test]
        public void CreateAchBeneficialOwnerUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AchBeneficialOwnerRequestCO beneficialOwnerRequest = null;
            //var response = instance.CreateAchBeneficialOwnerUsingPost(beneficialOwnerRequest);
            //Assert.IsInstanceOf<AchBeneficialOwnerResponseVO> (response, "response is AchBeneficialOwnerResponseVO");
        }
        
        /// <summary>
        /// Test CreateAchBusinessUsingPost
        /// </summary>
        [Test]
        public void CreateAchBusinessUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AchBusinessRequestCO businessRequest = null;
            //var response = instance.CreateAchBusinessUsingPost(businessRequest);
            //Assert.IsInstanceOf<AchBusinessResponseVO> (response, "response is AchBusinessResponseVO");
        }
        
        /// <summary>
        /// Test CreateAchCardLinkUsingPost
        /// </summary>
        [Test]
        public void CreateAchCardLinkUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AchCardLinkRequestCO cardLinkRequestCO = null;
            //var response = instance.CreateAchCardLinkUsingPost(cardLinkRequestCO);
            //Assert.IsInstanceOf<AchCardLinkResponseVO> (response, "response is AchCardLinkResponseVO");
        }
        
        /// <summary>
        /// Test CreateAchCardReserveUsingPost
        /// </summary>
        [Test]
        public void CreateAchCardReserveUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AchCardReserveRequestCO cardReserveRequestCO = null;
            //var response = instance.CreateAchCardReserveUsingPost(cardReserveRequestCO);
            //Assert.IsInstanceOf<AchCardReserveResponseVO> (response, "response is AchCardReserveResponseVO");
        }
        
        /// <summary>
        /// Test CreateAchClientUsingPost
        /// </summary>
        [Test]
        public void CreateAchClientUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AchClientRequestCO clientRequest = null;
            //var response = instance.CreateAchClientUsingPost(clientRequest);
            //Assert.IsInstanceOf<AchClientResponseVO> (response, "response is AchClientResponseVO");
        }
        
        /// <summary>
        /// Test CreateAchReserveLinkUsingPost
        /// </summary>
        [Test]
        public void CreateAchReserveLinkUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AchReserveLinkRequestCO reserveLinkRequestCO = null;
            //var response = instance.CreateAchReserveLinkUsingPost(reserveLinkRequestCO);
            //Assert.IsInstanceOf<AchReserveLinkResponseVO> (response, "response is AchReserveLinkResponseVO");
        }
        
        /// <summary>
        /// Test DeleteAchBankLinkUsingDelete
        /// </summary>
        [Test]
        public void DeleteAchBankLinkUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? nucleusBankLinkId = null;
            //var response = instance.DeleteAchBankLinkUsingDelete(nucleusBankLinkId);
            //Assert.IsInstanceOf<AchBankLinkResponseVO> (response, "response is AchBankLinkResponseVO");
        }
        
        /// <summary>
        /// Test FundCardUsingPost
        /// </summary>
        [Test]
        public void FundCardUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AchCardRequestCO achCardRequestCO = null;
            //var response = instance.FundCardUsingPost(achCardRequestCO);
            //Assert.IsInstanceOf<AchCardResponseVO> (response, "response is AchCardResponseVO");
        }
        
        /// <summary>
        /// Test GetAchBalanceUsingGet
        /// </summary>
        [Test]
        public void GetAchBalanceUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? portfolioId = null;
            //DateTime? endDate = null;
            //DateTime? startDate = null;
            //var response = instance.GetAchBalanceUsingGet(portfolioId, endDate, startDate);
            //Assert.IsInstanceOf<AchBalanceResponseVO> (response, "response is AchBalanceResponseVO");
        }
        
        /// <summary>
        /// Test GetAchBankLinkUsingGet
        /// </summary>
        [Test]
        public void GetAchBankLinkUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? nucleusBankLinkId = null;
            //var response = instance.GetAchBankLinkUsingGet(nucleusBankLinkId);
            //Assert.IsInstanceOf<AchBankLinkResponseVO> (response, "response is AchBankLinkResponseVO");
        }
        
        /// <summary>
        /// Test GetAchBankLinksForReserveAccountUsingGet
        /// </summary>
        [Test]
        public void GetAchBankLinksForReserveAccountUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetAchBankLinksForReserveAccountUsingGet();
            //Assert.IsInstanceOf<List<AchBankLinkResponseVO>> (response, "response is List<AchBankLinkResponseVO>");
        }
        
        /// <summary>
        /// Test GetAchBusinessBalanceUsingGet
        /// </summary>
        [Test]
        public void GetAchBusinessBalanceUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? businessId = null;
            //var response = instance.GetAchBusinessBalanceUsingGet(businessId);
            //Assert.IsInstanceOf<AchBalanceResponseVO> (response, "response is AchBalanceResponseVO");
        }
        
        /// <summary>
        /// Test GetAchClientBankLinksUsingGet
        /// </summary>
        [Test]
        public void GetAchClientBankLinksUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? nucleusClientId = null;
            //var response = instance.GetAchClientBankLinksUsingGet(nucleusClientId);
            //Assert.IsInstanceOf<List<AchBankLinkResponseVO>> (response, "response is List<AchBankLinkResponseVO>");
        }
        
        /// <summary>
        /// Test GetAchStatusUsingGet
        /// </summary>
        [Test]
        public void GetAchStatusUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? nucleusBusinessId = null;
            //var response = instance.GetAchStatusUsingGet(nucleusBusinessId);
            //Assert.IsInstanceOf<AchTransferResponseVO> (response, "response is AchTransferResponseVO");
        }
        
        /// <summary>
        /// Test GetAchTransferUsingGet
        /// </summary>
        [Test]
        public void GetAchTransferUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? nucleusFundingId = null;
            //var response = instance.GetAchTransferUsingGet(nucleusFundingId);
            //Assert.IsInstanceOf<AchTransferResponseVO> (response, "response is AchTransferResponseVO");
        }
        
        /// <summary>
        /// Test GetListOfClientAchTransfersUsingGet
        /// </summary>
        [Test]
        public void GetListOfClientAchTransfersUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? nucleusClientId = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetListOfClientAchTransfersUsingGet(nucleusClientId, page, size);
            //Assert.IsInstanceOf<PageAchTransferResponseVO> (response, "response is PageAchTransferResponseVO");
        }
        
        /// <summary>
        /// Test GetListOfTenantAchTransfersUsingGet
        /// </summary>
        [Test]
        public void GetListOfTenantAchTransfersUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //DateTime? endDate = null;
            //int? page = null;
            //int? size = null;
            //DateTime? startDate = null;
            //string status = null;
            //var response = instance.GetListOfTenantAchTransfersUsingGet(endDate, page, size, startDate, status);
            //Assert.IsInstanceOf<PageAchTransferResponseVO> (response, "response is PageAchTransferResponseVO");
        }
        
        /// <summary>
        /// Test SubmitAchTransferUsingPost
        /// </summary>
        [Test]
        public void SubmitAchTransferUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AchTransferRequestCO transferRequest = null;
            //var response = instance.SubmitAchTransferUsingPost(transferRequest);
            //Assert.IsInstanceOf<AchTransferResponseVO> (response, "response is AchTransferResponseVO");
        }
        
        /// <summary>
        /// Test UpdateAchBankLinkUsingPut
        /// </summary>
        [Test]
        public void UpdateAchBankLinkUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? nucleusBankLinkId = null;
            //var response = instance.UpdateAchBankLinkUsingPut(nucleusBankLinkId);
            //Assert.IsInstanceOf<AchBankLinkResponseVO> (response, "response is AchBankLinkResponseVO");
        }
        
    }

}
