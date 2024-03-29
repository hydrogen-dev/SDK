/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.Application;
import com.hydrogen.nucleus.model.AuditLog;
import com.hydrogen.nucleus.model.Feature;
import com.hydrogen.nucleus.model.FeatureTrack;
import com.hydrogen.nucleus.model.Notification;
import com.hydrogen.nucleus.model.NotificationClient;
import com.hydrogen.nucleus.model.NotificationSetting;
import com.hydrogen.nucleus.model.PageApplication;
import com.hydrogen.nucleus.model.PageAuditLog;
import com.hydrogen.nucleus.model.PageFeature;
import com.hydrogen.nucleus.model.PageFeatureTrack;
import com.hydrogen.nucleus.model.PageNotification;
import com.hydrogen.nucleus.model.PageNotificationClient;
import com.hydrogen.nucleus.model.PageNotificationSetting;
import com.hydrogen.nucleus.model.PageReasonCode;
import com.hydrogen.nucleus.model.PageStage;
import com.hydrogen.nucleus.model.PageTransactionCode;
import com.hydrogen.nucleus.model.ReasonCode;
import com.hydrogen.nucleus.model.Stage;
import com.hydrogen.nucleus.model.TransactionCode;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilsApi
 */
@Ignore
public class UtilsApiTest {

    private final UtilsApi api = new UtilsApi();

    
    /**
     * Create an application
     *
     * Create an application
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createApplicationUsingPostTest() throws ApiException {
        Application application = null;
        Application response = api.createApplicationUsingPost(application);

        // TODO: test validations
    }
    
    /**
     * Create a audit log
     *
     * Create a new audit log.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAuditLogUsingPostTest() throws ApiException {
        AuditLog auditLog = null;
        AuditLog response = api.createAuditLogUsingPost(auditLog);

        // TODO: test validations
    }
    
    /**
     * Create a Feature Track
     *
     * Create a new feature track.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFeatureTrackUsingPostTest() throws ApiException {
        FeatureTrack featureTrack = null;
        FeatureTrack response = api.createFeatureTrackUsingPost(featureTrack);

        // TODO: test validations
    }
    
    /**
     * Create a  Feature
     *
     * Create a new feature.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFeatureUsingPostTest() throws ApiException {
        Feature feature = null;
        Feature response = api.createFeatureUsingPost(feature);

        // TODO: test validations
    }
    
    /**
     * Create a Notification Client
     *
     * Create a new Notification Client. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNotificationClientUsingPostTest() throws ApiException {
        NotificationClient notificationClient = null;
        NotificationClient response = api.createNotificationClientUsingPost(notificationClient);

        // TODO: test validations
    }
    
    /**
     * Create a Notification Setting
     *
     * Create a new Notification Setting. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNotificationSettingUsingPostTest() throws ApiException {
        NotificationSetting notificationSetting = null;
        NotificationSetting response = api.createNotificationSettingUsingPost(notificationSetting);

        // TODO: test validations
    }
    
    /**
     * Create a Notification
     *
     * Create a new Notification. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNotificationUsingPostTest() throws ApiException {
        Notification notification = null;
        Notification response = api.createNotificationUsingPost(notification);

        // TODO: test validations
    }
    
    /**
     * Create a reason code
     *
     * Create a new reason code for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReasonCodeUsingPostTest() throws ApiException {
        ReasonCode reasonCodeRequest = null;
        ReasonCode response = api.createReasonCodeUsingPost(reasonCodeRequest);

        // TODO: test validations
    }
    
    /**
     * Create an account stage
     *
     * Create a new account stage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createStageUsingPostTest() throws ApiException {
        Stage stageRequest = null;
        Stage response = api.createStageUsingPost(stageRequest);

        // TODO: test validations
    }
    
    /**
     * Create a transaction code
     *
     * Create a new transaction code for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTransactionCodeUsingPostTest() throws ApiException {
        TransactionCode transactionRequest = null;
        TransactionCode response = api.createTransactionCodeUsingPost(transactionRequest);

        // TODO: test validations
    }
    
    /**
     * Delete an Application
     *
     * Permanently delete an Application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteApplicationUsingDeleteTest() throws ApiException {
        UUID applicationId = null;
        api.deleteApplicationUsingDelete(applicationId);

        // TODO: test validations
    }
    
    /**
     * Delete a Feature Track
     *
     * Permanently delete a feature track registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFeatureTrackUsingDeleteTest() throws ApiException {
        UUID featureTrackId = null;
        api.deleteFeatureTrackUsingDelete(featureTrackId);

        // TODO: test validations
    }
    
    /**
     * Delete a Feature
     *
     * Permanently delete a  feature registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFeatureUsingDeleteTest() throws ApiException {
        UUID featureId = null;
        api.deleteFeatureUsingDelete(featureId);

        // TODO: test validations
    }
    
    /**
     * Delete a Notification Client
     *
     * Permanently Delete Notification Client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotificationClientUsingDeleteTest() throws ApiException {
        UUID notificationClientId = null;
        api.deleteNotificationClientUsingDelete(notificationClientId);

        // TODO: test validations
    }
    
    /**
     * Delete a Notification Setting
     *
     * Permanently Delete Notification Setting. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotificationSettingUsingDeleteTest() throws ApiException {
        UUID notificationSettingId = null;
        api.deleteNotificationSettingUsingDelete(notificationSettingId);

        // TODO: test validations
    }
    
    /**
     * Delete a Notification
     *
     * Permanently Delete a Notification. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotificationUsingDeleteTest() throws ApiException {
        UUID notificationId = null;
        api.deleteNotificationUsingDelete(notificationId);

        // TODO: test validations
    }
    
    /**
     * Delete a reason code
     *
     * Permanently delete a reason code for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReasonCodeUsingDeleteTest() throws ApiException {
        UUID reasonCodeId = null;
        api.deleteReasonCodeUsingDelete(reasonCodeId);

        // TODO: test validations
    }
    
    /**
     * Delete an account stage
     *
     * Permanently delete an account stage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStageUsingDeleteTest() throws ApiException {
        UUID stageId = null;
        api.deleteStageUsingDelete(stageId);

        // TODO: test validations
    }
    
    /**
     * Delete a transaction code
     *
     * Permanently delete a transaction code for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTransactionCodeUsingDeleteTest() throws ApiException {
        UUID transactionCodeId = null;
        api.deleteTransactionCodeUsingDelete(transactionCodeId);

        // TODO: test validations
    }
    
    /**
     * List all Application
     *
     * Get details for all Application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApplicationAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageApplication response = api.getApplicationAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve an Application
     *
     * Retrieve the information for an Application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApplicationUsingGetTest() throws ApiException {
        UUID applicationId = null;
        Application response = api.getApplicationUsingGet(applicationId);

        // TODO: test validations
    }
    
    /**
     * List all audit log
     *
     * Get details for all audit log.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditLogAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAuditLog response = api.getAuditLogAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a audit log
     *
     * Retrieve the information for a audit log.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditLogUsingGetTest() throws ApiException {
        UUID auditLogId = null;
        AuditLog response = api.getAuditLogUsingGet(auditLogId);

        // TODO: test validations
    }
    
    /**
     * List all Feature
     *
     * Get details for all features.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageFeature response = api.getFeatureAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all Feature track
     *
     * Get details for all feature track.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureTrackAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageFeatureTrack response = api.getFeatureTrackAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Feature track
     *
     * Retrieve the information for a Feature track.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureTrackUsingGetTest() throws ApiException {
        UUID featureTrackId = null;
        FeatureTrack response = api.getFeatureTrackUsingGet(featureTrackId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Feature
     *
     * Retrieve the information for a Feature.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureUsingGetTest() throws ApiException {
        UUID featureId = null;
        Feature response = api.getFeatureUsingGet(featureId);

        // TODO: test validations
    }
    
    /**
     * Get All Notifications
     *
     * Get All Notification. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageNotification response = api.getNotificationAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all Notification Client
     *
     * List all Notification Client. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationClientAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageNotificationClient response = api.getNotificationClientAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Notification Client
     *
     * Retrieve a  Notification Client. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationClientUsingGetTest() throws ApiException {
        UUID notificationClientId = null;
        NotificationClient response = api.getNotificationClientUsingGet(notificationClientId);

        // TODO: test validations
    }
    
    /**
     * List all Notification Setting
     *
     * List all Notification Setting. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationSettingAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageNotificationSetting response = api.getNotificationSettingAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Notification Setting
     *
     * Retrieve a  Notification Setting. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationSettingUsingGetTest() throws ApiException {
        UUID notificationSettingId = null;
        NotificationSetting response = api.getNotificationSettingUsingGet(notificationSettingId);

        // TODO: test validations
    }
    
    /**
     * Get a Notification
     *
     * Get a Notification. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationUsingGetTest() throws ApiException {
        UUID notificationId = null;
        Notification response = api.getNotificationUsingGet(notificationId);

        // TODO: test validations
    }
    
    /**
     * List all reason codes
     *
     * Get the information for all reason codes defined by your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReasonCodeAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageReasonCode response = api.getReasonCodeAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a reason code
     *
     * Retrieve the information for a reason code defined by your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReasonCodeUsingGetTest() throws ApiException {
        UUID reasonCodeId = null;
        ReasonCode response = api.getReasonCodeUsingGet(reasonCodeId);

        // TODO: test validations
    }
    
    /**
     * List all account stages
     *
     * Get the information for all possible account stages.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStageAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageStage response = api.getStageAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve an account stage
     *
     * Retrieve the information for a specific account stage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStageUsingGetTest() throws ApiException {
        UUID stageId = null;
        Stage response = api.getStageUsingGet(stageId);

        // TODO: test validations
    }
    
    /**
     * List all transaction codes
     *
     * Get the information for all transaction codes defined by your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionCodeAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageTransactionCode response = api.getTransactionCodeAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a transaction code
     *
     * Retrieve the information for a transaction code defined by your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionCodeUsingGetTest() throws ApiException {
        UUID transactionCodeId = null;
        TransactionCode response = api.getTransactionCodeUsingGet(transactionCodeId);

        // TODO: test validations
    }
    
    /**
     * Update an Application
     *
     * Update the information for an Application
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateApplicationUsingPutTest() throws ApiException {
        Object application = null;
        UUID applicationId = null;
        Application response = api.updateApplicationUsingPut(application, applicationId);

        // TODO: test validations
    }
    
    /**
     * Update a Feature Track
     *
     * Update the information for a Feature track registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFeatureTrackUsingPutTest() throws ApiException {
        Object featureTrack = null;
        UUID featureTrackId = null;
        FeatureTrack response = api.updateFeatureTrackUsingPut(featureTrack, featureTrackId);

        // TODO: test validations
    }
    
    /**
     * Update a Feature
     *
     * Update the information for a Feature registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFeatureUsingPutTest() throws ApiException {
        Object feature = null;
        UUID featureId = null;
        Feature response = api.updateFeatureUsingPut(feature, featureId);

        // TODO: test validations
    }
    
    /**
     * Update a Notification Client
     *
     * Update a  Notification Client. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNotificationClientUsingPutTest() throws ApiException {
        Object notificationClient = null;
        UUID notificationClientId = null;
        NotificationClient response = api.updateNotificationClientUsingPut(notificationClient, notificationClientId);

        // TODO: test validations
    }
    
    /**
     * Update a Notification Setting
     *
     * Update a  Notification Setting. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNotificationSettingUsingPutTest() throws ApiException {
        Object notificationSetting = null;
        UUID notificationSettingId = null;
        NotificationSetting response = api.updateNotificationSettingUsingPut(notificationSetting, notificationSettingId);

        // TODO: test validations
    }
    
    /**
     * Update a Notification
     *
     * Update a Notification. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNotificationUsingPutTest() throws ApiException {
        Object notification = null;
        UUID notificationId = null;
        Notification response = api.updateNotificationUsingPut(notification, notificationId);

        // TODO: test validations
    }
    
    /**
     * Update a reason code
     *
     * Update a reason code for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReasonCodeUsingPutTest() throws ApiException {
        Object reasonCode = null;
        UUID reasonCodeId = null;
        ReasonCode response = api.updateReasonCodeUsingPut(reasonCode, reasonCodeId);

        // TODO: test validations
    }
    
    /**
     * Update an account stage
     *
     * Update the information for an account stage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStageUsingPutTest() throws ApiException {
        Object stage = null;
        UUID stageId = null;
        Stage response = api.updateStageUsingPut(stage, stageId);

        // TODO: test validations
    }
    
    /**
     * Update a transaction code
     *
     * Update a transaction code for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTransactionCodeUsingPutTest() throws ApiException {
        Object transactionCode = null;
        UUID transactionCodeId = null;
        TransactionCode response = api.updateTransactionCodeUsingPut(transactionCode, transactionCodeId);

        // TODO: test validations
    }
    
}
