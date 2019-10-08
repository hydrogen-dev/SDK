=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8-SNAPSHOT

=end

require 'spec_helper'
require 'json'

# Unit tests for AtomApi::ElectronApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ElectronApi' do
  before do
    # run before each test
    @instance = AtomApi::ElectronApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ElectronApi' do
    it 'should create an instance of ElectronApi' do
      expect(@instance).to be_instance_of(AtomApi::ElectronApi)
    end
  end

  # unit tests for delete_campaign
  # Delete a marketing campaign
  # @param campaign_id UUID of a marketing campaign
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_campaign test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_campaign_data_record
  # Delete a marketing campaign data record
  # @param campaign_data_id UUID of a campaign data record
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_campaign_data_record test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_campaign_plan
  # Delete a marketing campaign plan
  # @param campaign_plan_id UUID of a campaign plan
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_campaign_plan test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_chat_log
  # Delete a chat log
  # @param chat_id UUID of a chat record
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_chat_log test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_client_campaign
  # Remove a client from a campaign
  # @param client_campaign_id UUID of a client campaign record
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_client_campaign test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_consultation
  # Delete a consultation
  # @param consultation_id UUID of a consultation record
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_consultation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_document
  # Delete a document
  # @param document_id UUID of a document
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_document test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_faq
  # Delete a FAQ
  # @param faq_id UUID of a FAQ
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_faq test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_sales_inquiry
  # Delete a sales inquiry
  # @param sales_id UUID of a sales record
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_sales_inquiry test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_support_ticket
  # Delete a support ticket
  # @param support_ticket_id UUID of a support ticket
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_support_ticket test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_support_ticket_comment
  # Delete a support ticket comment
  # @param support_ticket_comment_id UUID of a support ticket comment
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_support_ticket_comment test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_campaign
  # Retrieve a marketing campaign
  # @param campaign_id UUID of a marketing campaign
  # @param [Hash] opts the optional parameters
  # @return [SpecificCampaignResponse]
  describe 'get_campaign test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_campaign_data_record
  # Retrieve a marketing campaign data record
  # @param campaign_data_id UUID of a campaign data record
  # @param [Hash] opts the optional parameters
  # @return [SpecificCampaignDataResponse]
  describe 'get_campaign_data_record test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_campaign_data_records
  # List all marketing campaign data records
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetCampaignDataResponse]
  describe 'get_campaign_data_records test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_campaign_plan
  # Retrieve a marketing campaign plan
  # @param campaign_plan_id UUID of a campaign plan
  # @param [Hash] opts the optional parameters
  # @return [SpecificCampaignPlanResponse]
  describe 'get_campaign_plan test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_campaign_plans
  # List all marketing campaign plans
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetCampaignPlanResponse]
  describe 'get_campaign_plans test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_campaigns
  # List all marketing campaigns
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetCampaignResponse]
  describe 'get_campaigns test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_chat_log
  # Retrieve a chat log
  # @param chat_id UUID of a chat record
  # @param [Hash] opts the optional parameters
  # @return [SpecificChatResponse]
  describe 'get_chat_log test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_chat_logs
  # List all chat logs
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetChatResponse]
  describe 'get_chat_logs test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_campaign
  # Retrieve a client assigned to a campaign
  # @param client_campaign_id UUID of a client campaign record
  # @param [Hash] opts the optional parameters
  # @return [SpecificClientCampaignResponse]
  describe 'get_client_campaign test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_campaigns
  # List information for all clients that are assigned to a marketing campaign defined for your firm
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetClientCampaignResponse]
  describe 'get_client_campaigns test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_consultation
  # Retrieve a consultation
  # @param consultation_id UUID of a consultation record
  # @param [Hash] opts the optional parameters
  # @return [SpecificConsultationResponse]
  describe 'get_consultation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_consultations
  # List all consultations
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetConsultationResponse]
  describe 'get_consultations test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_document
  # Retrieve a document
  # @param document_id UUID of a document
  # @param [Hash] opts the optional parameters
  # @return [SpecificDocumentResponse]
  describe 'get_document test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_documents
  # List all documents
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetDocumentResponse]
  describe 'get_documents test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_faq
  # Retrieve a FAQ
  # @param faq_id UUID of a FAQ
  # @param [Hash] opts the optional parameters
  # @return [SpecificFaqResponse]
  describe 'get_faq test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_faqs
  # List all FAQs
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetFaqResponse]
  describe 'get_faqs test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_sales_inquiries
  # List all sales inquiries
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetSalesResponse]
  describe 'get_sales_inquiries test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_sales_inquiry
  # Retrieve a sales inquiry
  # @param sales_id UUID of a sales record
  # @param [Hash] opts the optional parameters
  # @return [SpecificSalesResponse]
  describe 'get_sales_inquiry test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_support_ticket
  # Retrieve a support ticket
  # @param support_ticket_id UUID of a support ticket
  # @param [Hash] opts the optional parameters
  # @return [SpecificSupportTicketResponse]
  describe 'get_support_ticket test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_support_ticket_comment
  # Retrieve a support ticket comment
  # @param support_ticket_comment_id UUID of a support ticket comment
  # @param [Hash] opts the optional parameters
  # @return [SpecificSupportTicketCommentResponse]
  describe 'get_support_ticket_comment test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_support_ticket_comments
  # List all support ticket comments
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetSupportTicketCommentResponse]
  describe 'get_support_ticket_comments test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_support_tickets
  # List all support tickets
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @option opts [String] :filter Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
  # @return [GetSupportTicketResponse]
  describe 'get_support_tickets test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_campaign
  # Create a marketing campaign
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateCampaignResponse]
  describe 'post_campaign test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_campaign_data_record
  # Create a marketing campaign data record
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateCampaignDataResponse]
  describe 'post_campaign_data_record test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_campaign_plan
  # Create a marketing campaign plan
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateCampaignPlanResponse]
  describe 'post_campaign_plan test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_chat_log
  # Create a chat log
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateChatResponse]
  describe 'post_chat_log test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_client_campaign
  # Assign a client to a campaign to indicate the client has registered through the campaign specified
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateClientCampaignResponse]
  describe 'post_client_campaign test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_consultation
  # Create a consultation
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateConsultationResponse]
  describe 'post_consultation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_document
  # Create a document
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateDocumentResponse]
  describe 'post_document test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_faq
  # Create a faq
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateFaqResponse]
  describe 'post_faq test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_sales_inquiry
  # Create a sales inquiry
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateSalesResponse]
  describe 'post_sales_inquiry test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_support_ticket
  # Create a support ticket
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateSupportTicketResponse]
  describe 'post_support_ticket test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_support_ticket_comment
  # Create a support ticket comment
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [CreateSupportTicketCommentResponse]
  describe 'post_support_ticket_comment test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_campaign
  # Update a marketing campaign
  # @param campaign_id UUID of a marketing campaign
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificCampaignResponse]
  describe 'update_campaign test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_campaign_data_record
  # Update a marketing campaign data record
  # @param campaign_data_id UUID of a campaign data record
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificCampaignDataResponse]
  describe 'update_campaign_data_record test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_campaign_plan
  # Update a marketing campaign plan
  # @param campaign_plan_id UUID of a campaign plan
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificCampaignPlanResponse]
  describe 'update_campaign_plan test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_chat_log
  # Update a chat log
  # @param chat_id UUID of a chat record
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificChatResponse]
  describe 'update_chat_log test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_client_campaign
  # Update a client assigned to a campaign
  # @param client_campaign_id UUID of a client campaign record
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificClientCampaignResponse]
  describe 'update_client_campaign test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_consultation
  # Update a consultation
  # @param consultation_id UUID of a consultation record
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificConsultationResponse]
  describe 'update_consultation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_document
  # Update a document
  # @param document_id UUID of a document
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificDocumentResponse]
  describe 'update_document test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_faq
  # Update a FAQ
  # @param faq_id UUID of a FAQ
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificFaqResponse]
  describe 'update_faq test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_sales_inquiry
  # Update a sales inquiry
  # @param sales_id UUID of a sales record
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificSalesResponse]
  describe 'update_sales_inquiry test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_support_ticket
  # Update a support ticket
  # @param support_ticket_id UUID of a support ticket
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificSupportTicketResponse]
  describe 'update_support_ticket test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_support_ticket_comment
  # Update a support ticket comment
  # @param support_ticket_comment_id UUID of a support ticket comment
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SpecificSupportTicketCommentResponse]
  describe 'update_support_ticket_comment test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
