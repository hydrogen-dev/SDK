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
    ///  Class for testing FundingApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class FundingApiTests
    {
        private FundingApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new FundingApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of FundingApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' FundingApi
            //Assert.IsInstanceOfType(typeof(FundingApi), instance, "instance is a FundingApi");
        }

        
        /// <summary>
        /// Test CreateBankLinkUsingPost
        /// </summary>
        [Test]
        public void CreateBankLinkUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //BankLink bankLinkInfoRequest = null;
            //var response = instance.CreateBankLinkUsingPost(bankLinkInfoRequest);
            //Assert.IsInstanceOf<BankLink> (response, "response is BankLink");
        }
        
        /// <summary>
        /// Test CreateFundingTransactionUsingPost
        /// </summary>
        [Test]
        public void CreateFundingTransactionUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //FundingTransaction fundingTransactionRequest = null;
            //var response = instance.CreateFundingTransactionUsingPost(fundingTransactionRequest);
            //Assert.IsInstanceOf<FundingTransaction> (response, "response is FundingTransaction");
        }
        
        /// <summary>
        /// Test CreateFundingUsingPost
        /// </summary>
        [Test]
        public void CreateFundingUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Funding fundingRequest = null;
            //var response = instance.CreateFundingUsingPost(fundingRequest);
            //Assert.IsInstanceOf<Funding> (response, "response is Funding");
        }
        
        /// <summary>
        /// Test CreateTransferUsingPost
        /// </summary>
        [Test]
        public void CreateTransferUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ExternalAccountTransfer externalAccountTransferRequest = null;
            //var response = instance.CreateTransferUsingPost(externalAccountTransferRequest);
            //Assert.IsInstanceOf<ExternalAccountTransfer> (response, "response is ExternalAccountTransfer");
        }
        
        /// <summary>
        /// Test DeleteBankLinkUsingDelete
        /// </summary>
        [Test]
        public void DeleteBankLinkUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? bankLinkId = null;
            //instance.DeleteBankLinkUsingDelete(bankLinkId);
            
        }
        
        /// <summary>
        /// Test DeleteFundingTransactionUsingDelete
        /// </summary>
        [Test]
        public void DeleteFundingTransactionUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? fundingTransactionId = null;
            //instance.DeleteFundingTransactionUsingDelete(fundingTransactionId);
            
        }
        
        /// <summary>
        /// Test DeleteFundingUsingDelete
        /// </summary>
        [Test]
        public void DeleteFundingUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? fundingId = null;
            //instance.DeleteFundingUsingDelete(fundingId);
            
        }
        
        /// <summary>
        /// Test DeleteTransferUsingDelete
        /// </summary>
        [Test]
        public void DeleteTransferUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? transferId = null;
            //instance.DeleteTransferUsingDelete(transferId);
            
        }
        
        /// <summary>
        /// Test GetBankLinkAllUsingGet
        /// </summary>
        [Test]
        public void GetBankLinkAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string currencyConversion = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetBankLinkAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageBankLink> (response, "response is PageBankLink");
        }
        
        /// <summary>
        /// Test GetBankLinkUsingGet
        /// </summary>
        [Test]
        public void GetBankLinkUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? bankLinkId = null;
            //string currencyConversion = null;
            //var response = instance.GetBankLinkUsingGet(bankLinkId, currencyConversion);
            //Assert.IsInstanceOf<BankLink> (response, "response is BankLink");
        }
        
        /// <summary>
        /// Test GetFundingAllUsingGet
        /// </summary>
        [Test]
        public void GetFundingAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string currencyConversion = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetFundingAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageFunding> (response, "response is PageFunding");
        }
        
        /// <summary>
        /// Test GetFundingTransactionAllUsingGet
        /// </summary>
        [Test]
        public void GetFundingTransactionAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string currencyConversion = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetFundingTransactionAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageFundingTransaction> (response, "response is PageFundingTransaction");
        }
        
        /// <summary>
        /// Test GetFundingTransactionUsingGet
        /// </summary>
        [Test]
        public void GetFundingTransactionUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? fundingTransactionId = null;
            //string currencyConversion = null;
            //var response = instance.GetFundingTransactionUsingGet(fundingTransactionId, currencyConversion);
            //Assert.IsInstanceOf<FundingTransaction> (response, "response is FundingTransaction");
        }
        
        /// <summary>
        /// Test GetFundingUsingGet
        /// </summary>
        [Test]
        public void GetFundingUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? fundingId = null;
            //string currencyConversion = null;
            //var response = instance.GetFundingUsingGet(fundingId, currencyConversion);
            //Assert.IsInstanceOf<Funding> (response, "response is Funding");
        }
        
        /// <summary>
        /// Test GetTransferAllUsingGet
        /// </summary>
        [Test]
        public void GetTransferAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string currencyConversion = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetTransferAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageExternalAccountTransfer> (response, "response is PageExternalAccountTransfer");
        }
        
        /// <summary>
        /// Test GetTransferUsingGet
        /// </summary>
        [Test]
        public void GetTransferUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? transferId = null;
            //string currencyConversion = null;
            //var response = instance.GetTransferUsingGet(transferId, currencyConversion);
            //Assert.IsInstanceOf<ExternalAccountTransfer> (response, "response is ExternalAccountTransfer");
        }
        
        /// <summary>
        /// Test UpdateBankLinkBulkUsingPut
        /// </summary>
        [Test]
        public void UpdateBankLinkBulkUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<Object> bankLinkList = null;
            //var response = instance.UpdateBankLinkBulkUsingPut(bankLinkList);
            //Assert.IsInstanceOf<List<BankLink>> (response, "response is List<BankLink>");
        }
        
        /// <summary>
        /// Test UpdateBankLinkUsingPut
        /// </summary>
        [Test]
        public void UpdateBankLinkUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object bankLink = null;
            //Guid? bankLinkId = null;
            //var response = instance.UpdateBankLinkUsingPut(bankLink, bankLinkId);
            //Assert.IsInstanceOf<BankLink> (response, "response is BankLink");
        }
        
        /// <summary>
        /// Test UpdateFundingTransactionUsingPut
        /// </summary>
        [Test]
        public void UpdateFundingTransactionUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object fundingTransaction = null;
            //Guid? fundingTransactionId = null;
            //var response = instance.UpdateFundingTransactionUsingPut(fundingTransaction, fundingTransactionId);
            //Assert.IsInstanceOf<FundingTransaction> (response, "response is FundingTransaction");
        }
        
        /// <summary>
        /// Test UpdateFundingUsingPut
        /// </summary>
        [Test]
        public void UpdateFundingUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object funding = null;
            //Guid? fundingId = null;
            //var response = instance.UpdateFundingUsingPut(funding, fundingId);
            //Assert.IsInstanceOf<Funding> (response, "response is Funding");
        }
        
        /// <summary>
        /// Test UpdateTransferUsingPut
        /// </summary>
        [Test]
        public void UpdateTransferUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object transfer = null;
            //Guid? transferId = null;
            //var response = instance.UpdateTransferUsingPut(transfer, transferId);
            //Assert.IsInstanceOf<ExternalAccountTransfer> (response, "response is ExternalAccountTransfer");
        }
        
    }

}
