=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'

# Unit tests for ProtonApi::GoalsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'GoalsApi' do
  before do
    # run before each test
    @instance = ProtonApi::GoalsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of GoalsApi' do
    it 'should create an instance of GoalsApi' do
      expect(@instance).to be_instance_of(ProtonApi::GoalsApi)
    end
  end

  # unit tests for goal_accumulation_allocation
  # Goal Accumulation Allocation
  # Allocate based on an accumulation goal
  # @param goal_accumulation_allocation_request Request payload for Goal Accumulation Allocation
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'goal_accumulation_allocation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_accumulation_recommendation
  # Goal Accumulation Recommendation
  # Generate recommendations to achieve an accumulation goal
  # @param goal_accumulation_recommendation_request Request payload for Goal Accumulation Recommendation
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'goal_accumulation_recommendation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_accumulation_status
  # Goal Accumulation Status
  # Track the status of an accumulation goal
  # @param goal_accumulation_status_request Request payload for Goal Accumulation Status
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'goal_accumulation_status test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_decumulation_allocation
  # Goal Decumulation Allocation
  # Allocate based on a decumulation goal
  # @param goal_decumulation_allocation_request Request payload for Goal Decumulation Allocation
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'goal_decumulation_allocation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_decumulation_recommendation
  # Goal Decumulation Recommendation
  # Generate recommendations to achieve a decumulation goal
  # @param goal_decumulation_recommendation_request Request payload for Goal Decumulation Recommendation
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'goal_decumulation_recommendation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_decumulation_status
  # Goal Decumulation Status
  # Track the status of a decumulation goal
  # @param goal_decumulation_status_request Request payload for Goal Decumulation Status
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'goal_decumulation_status test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
