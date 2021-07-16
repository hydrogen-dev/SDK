=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.3
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'

# Unit tests for NucleusApi::UtilsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'UtilsApi' do
  before do
    # run before each test
    @instance = NucleusApi::UtilsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UtilsApi' do
    it 'should create an instance of UtilsApi' do
      expect(@instance).to be_instance_of(NucleusApi::UtilsApi)
    end
  end

  # unit tests for create_application_using_post
  # Create an application
  # Create an application
  # @param application application
  # @param [Hash] opts the optional parameters
  # @return [Application]
  describe 'create_application_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_audit_log_using_post
  # Create a audit log
  # Create a new audit log.
  # @param audit_log auditLog
  # @param [Hash] opts the optional parameters
  # @return [AuditLog]
  describe 'create_audit_log_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_feature_track_using_post
  # Create a Feature Track
  # Create a new feature track.
  # @param feature_track featureTrack
  # @param [Hash] opts the optional parameters
  # @return [FeatureTrack]
  describe 'create_feature_track_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_feature_using_post
  # Create a  Feature
  # Create a new feature.
  # @param feature feature
  # @param [Hash] opts the optional parameters
  # @return [Feature]
  describe 'create_feature_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_notification_client_using_post
  # Create a Notification Client
  # Create a new Notification Client. 
  # @param notification_client notificationClient
  # @param [Hash] opts the optional parameters
  # @return [NotificationClient]
  describe 'create_notification_client_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_notification_setting_using_post
  # Create a Notification Setting
  # Create a new Notification Setting. 
  # @param notification_setting notificationSetting
  # @param [Hash] opts the optional parameters
  # @return [NotificationSetting]
  describe 'create_notification_setting_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_notification_using_post
  # Create a Notification
  # Create a new Notification. 
  # @param notification notification
  # @param [Hash] opts the optional parameters
  # @return [Notification]
  describe 'create_notification_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_reason_code_using_post
  # Create a reason code
  # Create a new reason code for your firm.
  # @param reason_code_request reasonCodeRequest
  # @param [Hash] opts the optional parameters
  # @return [ReasonCode]
  describe 'create_reason_code_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_stage_using_post
  # Create an account stage
  # Create a new account stage
  # @param stage_request stageRequest
  # @param [Hash] opts the optional parameters
  # @return [Stage]
  describe 'create_stage_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_transaction_code_using_post
  # Create a transaction code
  # Create a new transaction code for your firm.
  # @param transaction_request transactionRequest
  # @param [Hash] opts the optional parameters
  # @return [TransactionCode]
  describe 'create_transaction_code_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_application_using_delete
  # Delete an Application
  # Permanently delete an Application.
  # @param application_id UUID application_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_application_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_feature_track_using_delete
  # Delete a Feature Track
  # Permanently delete a feature track registered with your firm.
  # @param feature_track_id UUID feature_track_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_feature_track_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_feature_using_delete
  # Delete a Feature
  # Permanently delete a  feature registered with your firm.
  # @param feature_id UUID feature_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_feature_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_notification_client_using_delete
  # Delete a Notification Client
  # Permanently Delete Notification Client.
  # @param notification_client_id notification_client_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_notification_client_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_notification_setting_using_delete
  # Delete a Notification Setting
  # Permanently Delete Notification Setting. 
  # @param notification_setting_id notification_setting_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_notification_setting_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_notification_using_delete
  # Delete a Notification
  # Permanently Delete a Notification. 
  # @param notification_id UUID notification_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_notification_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_reason_code_using_delete
  # Delete a reason code
  # Permanently delete a reason code for your firm.
  # @param reason_code_id UUID reason_code_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_reason_code_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_stage_using_delete
  # Delete an account stage
  # Permanently delete an account stage.
  # @param stage_id UUID stage_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_stage_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_transaction_code_using_delete
  # Delete a transaction code
  # Permanently delete a transaction code for your firm.
  # @param transaction_code_id UUID transaction_code_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_transaction_code_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_application_all_using_get
  # List all Application
  # Get details for all Application.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageApplication]
  describe 'get_application_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_application_using_get
  # Retrieve an Application
  # Retrieve the information for an Application.
  # @param application_id UUID application_id
  # @param [Hash] opts the optional parameters
  # @return [Application]
  describe 'get_application_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_audit_log_all_using_get
  # List all audit log
  # Get details for all audit log.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageAuditLog]
  describe 'get_audit_log_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_audit_log_using_get
  # Retrieve a audit log
  # Retrieve the information for a audit log.
  # @param audit_log_id UUID audit_log_id
  # @param [Hash] opts the optional parameters
  # @return [AuditLog]
  describe 'get_audit_log_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_feature_all_using_get
  # List all Feature
  # Get details for all features.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageFeature]
  describe 'get_feature_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_feature_track_all_using_get
  # List all Feature track
  # Get details for all feature track.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageFeatureTrack]
  describe 'get_feature_track_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_feature_track_using_get
  # Retrieve a Feature track
  # Retrieve the information for a Feature track.
  # @param feature_track_id UUID feature_track_id
  # @param [Hash] opts the optional parameters
  # @return [FeatureTrack]
  describe 'get_feature_track_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_feature_using_get
  # Retrieve a Feature
  # Retrieve the information for a Feature.
  # @param feature_id UUID feature_id
  # @param [Hash] opts the optional parameters
  # @return [Feature]
  describe 'get_feature_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_notification_all_using_get
  # Get All Notifications
  # Get All Notification. 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageNotification]
  describe 'get_notification_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_notification_client_all_using_get
  # List all Notification Client
  # List all Notification Client. 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageNotificationClient]
  describe 'get_notification_client_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_notification_client_using_get
  # Retrieve a Notification Client
  # Retrieve a  Notification Client. 
  # @param notification_client_id notification_client_id
  # @param [Hash] opts the optional parameters
  # @return [NotificationClient]
  describe 'get_notification_client_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_notification_setting_all_using_get
  # List all Notification Setting
  # List all Notification Setting. 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageNotificationSetting]
  describe 'get_notification_setting_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_notification_setting_using_get
  # Retrieve a Notification Setting
  # Retrieve a  Notification Setting. 
  # @param notification_setting_id notification_setting_id
  # @param [Hash] opts the optional parameters
  # @return [NotificationSetting]
  describe 'get_notification_setting_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_notification_using_get
  # Get a Notification
  # Get a Notification. 
  # @param notification_id notification_id
  # @param [Hash] opts the optional parameters
  # @return [Notification]
  describe 'get_notification_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_reason_code_all_using_get
  # List all reason codes
  # Get the information for all reason codes defined by your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageReasonCode]
  describe 'get_reason_code_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_reason_code_using_get
  # Retrieve a reason code
  # Retrieve the information for a reason code defined by your firm.
  # @param reason_code_id UUID reason_code_id
  # @param [Hash] opts the optional parameters
  # @return [ReasonCode]
  describe 'get_reason_code_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_stage_all_using_get
  # List all account stages
  # Get the information for all possible account stages.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageStage]
  describe 'get_stage_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_stage_using_get
  # Retrieve an account stage
  # Retrieve the information for a specific account stage.
  # @param stage_id UUID stage_id
  # @param [Hash] opts the optional parameters
  # @return [Stage]
  describe 'get_stage_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_transaction_code_all_using_get
  # List all transaction codes
  # Get the information for all transaction codes defined by your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageTransactionCode]
  describe 'get_transaction_code_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_transaction_code_using_get
  # Retrieve a transaction code
  # Retrieve the information for a transaction code defined by your firm.
  # @param transaction_code_id UUID transaction_code_id
  # @param [Hash] opts the optional parameters
  # @return [TransactionCode]
  describe 'get_transaction_code_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_application_using_put
  # Update an Application
  # Update the information for an Application
  # @param application application
  # @param application_id UUID application_id
  # @param [Hash] opts the optional parameters
  # @return [Application]
  describe 'update_application_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_feature_track_using_put
  # Update a Feature Track
  # Update the information for a Feature track registered with your firm.
  # @param feature_track feature_track
  # @param feature_track_id UUID feature_track_id
  # @param [Hash] opts the optional parameters
  # @return [FeatureTrack]
  describe 'update_feature_track_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_feature_using_put
  # Update a Feature
  # Update the information for a Feature registered with your firm.
  # @param feature feature
  # @param feature_id UUID feature_id
  # @param [Hash] opts the optional parameters
  # @return [Feature]
  describe 'update_feature_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_notification_client_using_put
  # Update a Notification Client
  # Update a  Notification Client. 
  # @param notification_client notification_client
  # @param notification_client_id UUID notification_client_id
  # @param [Hash] opts the optional parameters
  # @return [NotificationClient]
  describe 'update_notification_client_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_notification_setting_using_put
  # Update a Notification Setting
  # Update a  Notification Setting. 
  # @param notification_setting notification_setting
  # @param notification_setting_id UUID notification_setting_id
  # @param [Hash] opts the optional parameters
  # @return [NotificationSetting]
  describe 'update_notification_setting_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_notification_using_put
  # Update a Notification
  # Update a Notification. 
  # @param notification notification
  # @param notification_id UUID notification_id
  # @param [Hash] opts the optional parameters
  # @return [Notification]
  describe 'update_notification_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_reason_code_using_put
  # Update a reason code
  # Update a reason code for your firm.
  # @param reason_code reason_code
  # @param reason_code_id UUID reason_code_id
  # @param [Hash] opts the optional parameters
  # @return [ReasonCode]
  describe 'update_reason_code_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_stage_using_put
  # Update an account stage
  # Update the information for an account stage.
  # @param stage stage
  # @param stage_id UUID stage_id
  # @param [Hash] opts the optional parameters
  # @return [Stage]
  describe 'update_stage_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_transaction_code_using_put
  # Update a transaction code
  # Update a transaction code for your firm.
  # @param transaction_code transaction_code
  # @param transaction_code_id UUID transaction_code_id
  # @param [Hash] opts the optional parameters
  # @return [TransactionCode]
  describe 'update_transaction_code_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
