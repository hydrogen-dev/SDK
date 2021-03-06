=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.8.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.15

=end

require 'spec_helper'
require 'json'

# Unit tests for NucleusApi::InvoiceApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'InvoiceApi' do
  before do
    # run before each test
    @instance = NucleusApi::InvoiceApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of InvoiceApi' do
    it 'should create an instance of InvoiceApi' do
      expect(@instance).to be_instance_of(NucleusApi::InvoiceApi)
    end
  end

  # unit tests for create_invoice_payment_using_post
  # Create a invoicePayment
  # Create a new invoicePayment, for tracking invoice status.
  # @param invoice_payment invoicePayment
  # @param [Hash] opts the optional parameters
  # @return [InvoicePayment]
  describe 'create_invoice_payment_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_invoice_using_post
  # Create a invoice
  # Create a new invoice, with your firm.
  # @param invoice invoice
  # @param [Hash] opts the optional parameters
  # @return [Invoice]
  describe 'create_invoice_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_invoice_payment_using_delete
  # Delete a invoicePayment
  # Delete a invoicePayment. 
  # @param invoice_payment_id UUID invoice_payment_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_invoice_payment_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_invoice_using_delete
  # Delete a invoice
  # Delete a invoice. 
  # @param invoice_id UUID invoice_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_invoice_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_invoice_all_using_get
  # List all invoices
  # List all invoice. 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion currency_conversion
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageInvoice]
  describe 'get_invoice_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_invoice_payment_all_using_get
  # List all invoice payments
  # List all invoicePayment. 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion currency_conversion
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageInvoicePayment]
  describe 'get_invoice_payment_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_invoice_payment_using_get
  # Retrieve a invoicePayment
  # Retrieve a invoicePayment. 
  # @param invoice_payment_id UUID invoice_payment_id
  # @param [Hash] opts the optional parameters
  # @option opts [String] :currency_conversion USD
  # @return [InvoicePayment]
  describe 'get_invoice_payment_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_invoice_using_get
  # Retrieve a invoice
  # Retrieve a invoice. 
  # @param invoice_id UUID invoice_idd
  # @param [Hash] opts the optional parameters
  # @option opts [String] :currency_conversion USD
  # @return [Invoice]
  describe 'get_invoice_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_invoice_payment_using_put
  # Update a invoicePayment
  # Update a invoicePayment. 
  # @param invoice_payment invoice_payment
  # @param invoice_payment_id UUID invoice_payment_id
  # @param [Hash] opts the optional parameters
  # @return [InvoicePayment]
  describe 'update_invoice_payment_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_invoice_using_put
  # Update a invoice
  # Update a invoice. 
  # @param invoice invoice
  # @param invoice_id UUID invoice_id
  # @param [Hash] opts the optional parameters
  # @return [Invoice]
  describe 'update_invoice_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
