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
require 'date'

# Unit tests for ProtonApi::Answer
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'Answer' do
  before do
    # run before each test
    @instance = ProtonApi::Answer.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of Answer' do
    it 'should create an instance of Answer' do
      expect(@instance).to be_instance_of(ProtonApi::Answer)
    end
  end
  describe 'test attribute "answer_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
