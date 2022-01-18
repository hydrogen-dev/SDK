=begin
#Hydrogen Admin API

#The Hydrogen Admin API

OpenAPI spec version: 1.0.2
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.15

=end

require 'spec_helper'

describe AdminApi::Configuration do
  let(:config) { AdminApi::Configuration.default }

  before(:each) do
    # uncomment below to setup host and base_path
    # require 'URI'
    # uri = URI.parse("https://sandbox.hydrogenplatform.com/component/v1")
    # AdminApi.configure do |c|
    #   c.host = uri.host
    #   c.base_path = uri.path
    # end
  end

  describe '#base_url' do
    it 'should have the default value' do
      # uncomment below to test default value of the base path
      # expect(config.base_url).to eq("https://sandbox.hydrogenplatform.com/component/v1")
    end

    it 'should remove trailing slashes' do
      [nil, '', '/', '//'].each do |base_path|
        config.base_path = base_path
        # uncomment below to test trailing slashes
        # expect(config.base_url).to eq("https://sandbox.hydrogenplatform.com/component/v1")
      end
    end
  end
end
