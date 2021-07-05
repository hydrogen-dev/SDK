=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'

# Unit tests for ProtonApi::PortfolioConstructionApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PortfolioConstructionApi' do
  before do
    # run before each test
    @instance = ProtonApi::PortfolioConstructionApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PortfolioConstructionApi' do
    it 'should create an instance of PortfolioConstructionApi' do
      expect(@instance).to be_instance_of(ProtonApi::PortfolioConstructionApi)
    end
  end

  # unit tests for mvo
  # MVO
  # Run a mean-variance optimization for a group of potential investments
  # @param mvo_request Request payload for MVO
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'mvo test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
