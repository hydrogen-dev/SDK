=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.2-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for AtomApi::EventStudy
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'EventStudy' do
  before do
    # run before each test
    @instance = AtomApi::EventStudy.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of EventStudy' do
    it 'should create an instance of EventStudy' do
      expect(@instance).to be_instance_of(AtomApi::EventStudy)
    end
  end
  describe 'test attribute "portfolio_tickers"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "portfolio_weights"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "events"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('Array<String>', ["dot_com_bubble", "2008_financial_crisis", "brexit", "2011_black_monday", "september_eleventh", "1987_black_monday", "1992_black_wednesday", "1997_asian_financial_crisis"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.events = value }.not_to raise_error
      # end
    end
  end

end
