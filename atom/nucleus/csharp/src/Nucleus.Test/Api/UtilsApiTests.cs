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
    ///  Class for testing UtilsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class UtilsApiTests
    {
        private UtilsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new UtilsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of UtilsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' UtilsApi
            //Assert.IsInstanceOfType(typeof(UtilsApi), instance, "instance is a UtilsApi");
        }

        
        /// <summary>
        /// Test CreateApplicationUsingPost
        /// </summary>
        [Test]
        public void CreateApplicationUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Application application = null;
            //var response = instance.CreateApplicationUsingPost(application);
            //Assert.IsInstanceOf<Application> (response, "response is Application");
        }
        
        /// <summary>
        /// Test CreateAuditLogUsingPost
        /// </summary>
        [Test]
        public void CreateAuditLogUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //AuditLog auditLog = null;
            //var response = instance.CreateAuditLogUsingPost(auditLog);
            //Assert.IsInstanceOf<AuditLog> (response, "response is AuditLog");
        }
        
        /// <summary>
        /// Test CreateFeatureTrackUsingPost
        /// </summary>
        [Test]
        public void CreateFeatureTrackUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //FeatureTrack featureTrack = null;
            //var response = instance.CreateFeatureTrackUsingPost(featureTrack);
            //Assert.IsInstanceOf<FeatureTrack> (response, "response is FeatureTrack");
        }
        
        /// <summary>
        /// Test CreateFeatureUsingPost
        /// </summary>
        [Test]
        public void CreateFeatureUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Feature feature = null;
            //var response = instance.CreateFeatureUsingPost(feature);
            //Assert.IsInstanceOf<Feature> (response, "response is Feature");
        }
        
        /// <summary>
        /// Test CreateNotificationClientUsingPost
        /// </summary>
        [Test]
        public void CreateNotificationClientUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //NotificationClient notificationClient = null;
            //var response = instance.CreateNotificationClientUsingPost(notificationClient);
            //Assert.IsInstanceOf<NotificationClient> (response, "response is NotificationClient");
        }
        
        /// <summary>
        /// Test CreateNotificationSettingUsingPost
        /// </summary>
        [Test]
        public void CreateNotificationSettingUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //NotificationSetting notificationSetting = null;
            //var response = instance.CreateNotificationSettingUsingPost(notificationSetting);
            //Assert.IsInstanceOf<NotificationSetting> (response, "response is NotificationSetting");
        }
        
        /// <summary>
        /// Test CreateNotificationUsingPost
        /// </summary>
        [Test]
        public void CreateNotificationUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Notification notification = null;
            //var response = instance.CreateNotificationUsingPost(notification);
            //Assert.IsInstanceOf<Notification> (response, "response is Notification");
        }
        
        /// <summary>
        /// Test CreateReasonCodeUsingPost
        /// </summary>
        [Test]
        public void CreateReasonCodeUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ReasonCode reasonCodeRequest = null;
            //var response = instance.CreateReasonCodeUsingPost(reasonCodeRequest);
            //Assert.IsInstanceOf<ReasonCode> (response, "response is ReasonCode");
        }
        
        /// <summary>
        /// Test CreateStageUsingPost
        /// </summary>
        [Test]
        public void CreateStageUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Stage stageRequest = null;
            //var response = instance.CreateStageUsingPost(stageRequest);
            //Assert.IsInstanceOf<Stage> (response, "response is Stage");
        }
        
        /// <summary>
        /// Test CreateTransactionCodeUsingPost
        /// </summary>
        [Test]
        public void CreateTransactionCodeUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //TransactionCode transactionRequest = null;
            //var response = instance.CreateTransactionCodeUsingPost(transactionRequest);
            //Assert.IsInstanceOf<TransactionCode> (response, "response is TransactionCode");
        }
        
        /// <summary>
        /// Test DeleteApplicationUsingDelete
        /// </summary>
        [Test]
        public void DeleteApplicationUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? applicationId = null;
            //instance.DeleteApplicationUsingDelete(applicationId);
            
        }
        
        /// <summary>
        /// Test DeleteFeatureTrackUsingDelete
        /// </summary>
        [Test]
        public void DeleteFeatureTrackUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? featureTrackId = null;
            //instance.DeleteFeatureTrackUsingDelete(featureTrackId);
            
        }
        
        /// <summary>
        /// Test DeleteFeatureUsingDelete
        /// </summary>
        [Test]
        public void DeleteFeatureUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? featureId = null;
            //instance.DeleteFeatureUsingDelete(featureId);
            
        }
        
        /// <summary>
        /// Test DeleteNotificationClientUsingDelete
        /// </summary>
        [Test]
        public void DeleteNotificationClientUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? notificationClientId = null;
            //instance.DeleteNotificationClientUsingDelete(notificationClientId);
            
        }
        
        /// <summary>
        /// Test DeleteNotificationSettingUsingDelete
        /// </summary>
        [Test]
        public void DeleteNotificationSettingUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? notificationSettingId = null;
            //instance.DeleteNotificationSettingUsingDelete(notificationSettingId);
            
        }
        
        /// <summary>
        /// Test DeleteNotificationUsingDelete
        /// </summary>
        [Test]
        public void DeleteNotificationUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? notificationId = null;
            //instance.DeleteNotificationUsingDelete(notificationId);
            
        }
        
        /// <summary>
        /// Test DeleteReasonCodeUsingDelete
        /// </summary>
        [Test]
        public void DeleteReasonCodeUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? reasonCodeId = null;
            //instance.DeleteReasonCodeUsingDelete(reasonCodeId);
            
        }
        
        /// <summary>
        /// Test DeleteStageUsingDelete
        /// </summary>
        [Test]
        public void DeleteStageUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? stageId = null;
            //instance.DeleteStageUsingDelete(stageId);
            
        }
        
        /// <summary>
        /// Test DeleteTransactionCodeUsingDelete
        /// </summary>
        [Test]
        public void DeleteTransactionCodeUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? transactionCodeId = null;
            //instance.DeleteTransactionCodeUsingDelete(transactionCodeId);
            
        }
        
        /// <summary>
        /// Test GetApplicationAllUsingGet
        /// </summary>
        [Test]
        public void GetApplicationAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetApplicationAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageApplication> (response, "response is PageApplication");
        }
        
        /// <summary>
        /// Test GetApplicationUsingGet
        /// </summary>
        [Test]
        public void GetApplicationUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? applicationId = null;
            //var response = instance.GetApplicationUsingGet(applicationId);
            //Assert.IsInstanceOf<Application> (response, "response is Application");
        }
        
        /// <summary>
        /// Test GetAuditLogAllUsingGet
        /// </summary>
        [Test]
        public void GetAuditLogAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetAuditLogAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageAuditLog> (response, "response is PageAuditLog");
        }
        
        /// <summary>
        /// Test GetAuditLogUsingGet
        /// </summary>
        [Test]
        public void GetAuditLogUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? auditLogId = null;
            //var response = instance.GetAuditLogUsingGet(auditLogId);
            //Assert.IsInstanceOf<AuditLog> (response, "response is AuditLog");
        }
        
        /// <summary>
        /// Test GetFeatureAllUsingGet
        /// </summary>
        [Test]
        public void GetFeatureAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetFeatureAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageFeature> (response, "response is PageFeature");
        }
        
        /// <summary>
        /// Test GetFeatureTrackAllUsingGet
        /// </summary>
        [Test]
        public void GetFeatureTrackAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetFeatureTrackAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageFeatureTrack> (response, "response is PageFeatureTrack");
        }
        
        /// <summary>
        /// Test GetFeatureTrackUsingGet
        /// </summary>
        [Test]
        public void GetFeatureTrackUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? featureTrackId = null;
            //var response = instance.GetFeatureTrackUsingGet(featureTrackId);
            //Assert.IsInstanceOf<FeatureTrack> (response, "response is FeatureTrack");
        }
        
        /// <summary>
        /// Test GetFeatureUsingGet
        /// </summary>
        [Test]
        public void GetFeatureUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? featureId = null;
            //var response = instance.GetFeatureUsingGet(featureId);
            //Assert.IsInstanceOf<Feature> (response, "response is Feature");
        }
        
        /// <summary>
        /// Test GetNotificationAllUsingGet
        /// </summary>
        [Test]
        public void GetNotificationAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetNotificationAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageNotification> (response, "response is PageNotification");
        }
        
        /// <summary>
        /// Test GetNotificationClientAllUsingGet
        /// </summary>
        [Test]
        public void GetNotificationClientAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetNotificationClientAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageNotificationClient> (response, "response is PageNotificationClient");
        }
        
        /// <summary>
        /// Test GetNotificationClientUsingGet
        /// </summary>
        [Test]
        public void GetNotificationClientUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? notificationClientId = null;
            //var response = instance.GetNotificationClientUsingGet(notificationClientId);
            //Assert.IsInstanceOf<NotificationClient> (response, "response is NotificationClient");
        }
        
        /// <summary>
        /// Test GetNotificationSettingAllUsingGet
        /// </summary>
        [Test]
        public void GetNotificationSettingAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetNotificationSettingAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageNotificationSetting> (response, "response is PageNotificationSetting");
        }
        
        /// <summary>
        /// Test GetNotificationSettingUsingGet
        /// </summary>
        [Test]
        public void GetNotificationSettingUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? notificationSettingId = null;
            //var response = instance.GetNotificationSettingUsingGet(notificationSettingId);
            //Assert.IsInstanceOf<NotificationSetting> (response, "response is NotificationSetting");
        }
        
        /// <summary>
        /// Test GetNotificationUsingGet
        /// </summary>
        [Test]
        public void GetNotificationUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? notificationId = null;
            //var response = instance.GetNotificationUsingGet(notificationId);
            //Assert.IsInstanceOf<Notification> (response, "response is Notification");
        }
        
        /// <summary>
        /// Test GetReasonCodeAllUsingGet
        /// </summary>
        [Test]
        public void GetReasonCodeAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetReasonCodeAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageReasonCode> (response, "response is PageReasonCode");
        }
        
        /// <summary>
        /// Test GetReasonCodeUsingGet
        /// </summary>
        [Test]
        public void GetReasonCodeUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? reasonCodeId = null;
            //var response = instance.GetReasonCodeUsingGet(reasonCodeId);
            //Assert.IsInstanceOf<ReasonCode> (response, "response is ReasonCode");
        }
        
        /// <summary>
        /// Test GetStageAllUsingGet
        /// </summary>
        [Test]
        public void GetStageAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetStageAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageStage> (response, "response is PageStage");
        }
        
        /// <summary>
        /// Test GetStageUsingGet
        /// </summary>
        [Test]
        public void GetStageUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? stageId = null;
            //var response = instance.GetStageUsingGet(stageId);
            //Assert.IsInstanceOf<Stage> (response, "response is Stage");
        }
        
        /// <summary>
        /// Test GetTransactionCodeAllUsingGet
        /// </summary>
        [Test]
        public void GetTransactionCodeAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetTransactionCodeAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageTransactionCode> (response, "response is PageTransactionCode");
        }
        
        /// <summary>
        /// Test GetTransactionCodeUsingGet
        /// </summary>
        [Test]
        public void GetTransactionCodeUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? transactionCodeId = null;
            //var response = instance.GetTransactionCodeUsingGet(transactionCodeId);
            //Assert.IsInstanceOf<TransactionCode> (response, "response is TransactionCode");
        }
        
        /// <summary>
        /// Test UpdateApplicationUsingPut
        /// </summary>
        [Test]
        public void UpdateApplicationUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object application = null;
            //Guid? applicationId = null;
            //var response = instance.UpdateApplicationUsingPut(application, applicationId);
            //Assert.IsInstanceOf<Application> (response, "response is Application");
        }
        
        /// <summary>
        /// Test UpdateFeatureTrackUsingPut
        /// </summary>
        [Test]
        public void UpdateFeatureTrackUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object featureTrack = null;
            //Guid? featureTrackId = null;
            //var response = instance.UpdateFeatureTrackUsingPut(featureTrack, featureTrackId);
            //Assert.IsInstanceOf<FeatureTrack> (response, "response is FeatureTrack");
        }
        
        /// <summary>
        /// Test UpdateFeatureUsingPut
        /// </summary>
        [Test]
        public void UpdateFeatureUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object feature = null;
            //Guid? featureId = null;
            //var response = instance.UpdateFeatureUsingPut(feature, featureId);
            //Assert.IsInstanceOf<Feature> (response, "response is Feature");
        }
        
        /// <summary>
        /// Test UpdateNotificationClientUsingPut
        /// </summary>
        [Test]
        public void UpdateNotificationClientUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object notificationClient = null;
            //Guid? notificationClientId = null;
            //var response = instance.UpdateNotificationClientUsingPut(notificationClient, notificationClientId);
            //Assert.IsInstanceOf<NotificationClient> (response, "response is NotificationClient");
        }
        
        /// <summary>
        /// Test UpdateNotificationSettingUsingPut
        /// </summary>
        [Test]
        public void UpdateNotificationSettingUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object notificationSetting = null;
            //Guid? notificationSettingId = null;
            //var response = instance.UpdateNotificationSettingUsingPut(notificationSetting, notificationSettingId);
            //Assert.IsInstanceOf<NotificationSetting> (response, "response is NotificationSetting");
        }
        
        /// <summary>
        /// Test UpdateNotificationUsingPut
        /// </summary>
        [Test]
        public void UpdateNotificationUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object notification = null;
            //Guid? notificationId = null;
            //var response = instance.UpdateNotificationUsingPut(notification, notificationId);
            //Assert.IsInstanceOf<Notification> (response, "response is Notification");
        }
        
        /// <summary>
        /// Test UpdateReasonCodeUsingPut
        /// </summary>
        [Test]
        public void UpdateReasonCodeUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object reasonCode = null;
            //Guid? reasonCodeId = null;
            //var response = instance.UpdateReasonCodeUsingPut(reasonCode, reasonCodeId);
            //Assert.IsInstanceOf<ReasonCode> (response, "response is ReasonCode");
        }
        
        /// <summary>
        /// Test UpdateStageUsingPut
        /// </summary>
        [Test]
        public void UpdateStageUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object stage = null;
            //Guid? stageId = null;
            //var response = instance.UpdateStageUsingPut(stage, stageId);
            //Assert.IsInstanceOf<Stage> (response, "response is Stage");
        }
        
        /// <summary>
        /// Test UpdateTransactionCodeUsingPut
        /// </summary>
        [Test]
        public void UpdateTransactionCodeUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object transactionCode = null;
            //Guid? transactionCodeId = null;
            //var response = instance.UpdateTransactionCodeUsingPut(transactionCode, transactionCodeId);
            //Assert.IsInstanceOf<TransactionCode> (response, "response is TransactionCode");
        }
        
    }

}
