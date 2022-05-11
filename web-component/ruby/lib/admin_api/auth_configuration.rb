=begin
#Hydrogen Admin API

#The Hydrogen Admin API

OpenAPI spec version: 1.0.2
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.15

=end
require 'date'
require 'json'
require 'logger'
require 'tempfile'
require 'typhoeus'
require 'uri'
module AdminApi
  class AuthConfiguration < Configuration
    attr_accessor :authorization
    attr_accessor :client_token
    attr_accessor :grant_type_key
    attr_accessor :client_credentials
    attr_accessor :password
    attr_accessor :username
    attr_accessor :application_json_value
    attr_accessor :auth_uri
    attr_accessor :client_token_auth_uri
    attr_accessor :config
    attr_accessor :bearer

    def initialize
      super
      @authorization = 'Authorization'
      @client_token = 'client_token'
      @grant_type_key = 'grant_type'
      @client_credentials = 'client_credentials'
      @password = 'password'
      @username = 'username'
      @application_json_value = 'application/json'
      @auth_uri = '/authorization/v1/oauth/token'
      @client_token_auth_uri = '/authorization/v1/client-token'
      @bearer = 'Bearer '
      @config = Configuration.default
      yield(self) if block_given?
    end

    def self.default
      @@default ||= AuthConfiguration.new
    end

    def configure
      yield(self) if block_given?
    end

    def auth_url
      url = "#{scheme}://#{[@config.host, auth_uri].join('/').gsub(/\/+/, '/')}".sub(/\/+\z/, '')
      URI.encode(url)
    end

    def client_token_auth_url
      url = "#{scheme}://#{[@config.host, client_token_auth_uri].join('/').gsub(/\/+/, '/')}".sub(/\/+\z/, '')
      URI.encode(url)
    end

    def create_client_token_credential(client_id, client_secret, client_token)
      self.create_client_credential(client_id, client_secret)
      access_token = @config.access_token
      @config.access_token = nil
      header_params = {}
      header_params[@authorization] = @bearer + access_token;
      header_params[@client_token] = @bearer + client_token;
      response = Typhoeus::Request.new(
          client_token_auth_url,
          :method => :post,
          :headers => header_params,
          :params => nil
      ).run

      if @debugging
        @logger.debug "HTTP response body ~BEGIN~\n#{response.body}\n~END~\n"
      end
      body = JSON.parse(response.body)
      unless response.success?
        if response.timed_out?
          raise ApiError.new('Connection timed out')
        elsif response.code == 0
          # Errors from libcurl will be made visible here
          raise ApiError.new(:code => 0,
                             :message => response.return_message)
        else
          raise ApiError.new(:code => response.code,
                             :response_headers => response.headers,
                             :response_body => response.body), response.body
        end
      end
      @config.access_token = body['access_token']
      return body['access_token']
    end

    def create_client_credential(client_id, client_secret)
      basic_cred = 'Basic ' + ["#{client_id}:#{client_secret}"].pack('m').delete("\r\n")
      # Request Params
      params = {}
      params[@grant_type_key] = @client_credentials
      # Header parameters
      header_params = {}
      header_params['Accept'] = '*/*'
      header_params['Content-Type'] = 'application/json'
      header_params[@authorization] = basic_cred
      response = Typhoeus::Request.new(
          auth_url,
          :method => :post,
          :headers => header_params,
          :params => params
      ).run

      if @debugging
        @logger.debug "HTTP response body ~BEGIN~\n#{response.body}\n~END~\n"
      end
      body = JSON.parse(response.body)
      unless response.success?
        if response.timed_out?
          raise ApiError.new('Connection timed out')
        elsif response.code == 0
          # Errors from libcurl will be made visible here
          raise ApiError.new(:code => 0,
                             :message => response.return_message)
        else
          raise ApiError.new(:code => response.code,
                             :response_headers => response.headers,
                             :response_body => response.body), response.body
        end
      end
      @config.access_token = body['access_token']
    end

    def create_client_credential_return(client_id, client_secret)
      @logger.debug auth_url
      basic_cred = 'Basic ' + ["#{client_id}:#{client_secret}"].pack('m').delete("\r\n")
      # Request Params
      params = {}
      params[@grant_type_key] = @client_credentials
      # Header parameters
      header_params = {}
      header_params['Accept'] = '*/*'
      header_params['Content-Type'] = 'application/json'
      header_params[@authorization] = basic_cred
      response = Typhoeus::Request.new(
          auth_url,
          :method => :post,
          :headers => header_params,
          :params => params
      ).run

 
      if @debugging
        @logger.debug "HTTP response body ~BEGIN~\n#{response.body}\n~END~\n"
      end
      body = JSON.parse(response.body)
      unless response.success?
        if response.timed_out?
          raise ApiError.new('Connection timed out')
        elsif response.code == 0
          # Errors from libcurl will be made visible here
          raise ApiError.new(:code => 0,
                             :message => response.return_message)
        else
          raise ApiError.new(:code => response.code,
                             :response_headers => response.headers,
                             :response_body => response.body), response.body
        end
      end
      return body['access_token']
    end

    def set_access_token(token)
      @config.access_token = token
    end

    def create_password_credential(client_id, client_secret, username, password)
      basic_cred = 'Basic ' + ["#{client_id}:#{client_secret}"].pack('m').delete("\r\n")
      # Request Params
      params = {}
      params[@grant_type_key] = @password
      params[@username] = username
      params[@password] = password
      # header parameters
      header_params = {}
      header_params['Accept'] = '*/*'
      header_params['Content-Type'] = 'application/json'
      header_params[@authorization] = basic_cred
      response = Typhoeus::Request.new(
          auth_url,
          :method => :post,
          :headers => header_params,
          :params => params
      ).run
      if @debugging
        @logger.debug "HTTP response body ~BEGIN~\n#{response.body}\n~END~\n"
      end
      body = JSON.parse(response.body)
      unless response.success?
        if response.timed_out?
          raise ApiError.new('Connection timed out')
        elsif response.code == 0
          # Errors from libcurl will be made visible here
          raise ApiError.new(:code => 0,
                             :message => response.return_message)
        else
          raise ApiError.new(:code => response.code,
                             :response_headers => response.headers,
                             :response_body => response.body), body
        end
      end
      @config.access_token = body['access_token']
    end

    def create_password_credential_return(client_id, client_secret, username, password)
      basic_cred = 'Basic ' + ["#{client_id}:#{client_secret}"].pack('m').delete("\r\n")
      # Request Params
      params = {}
      params[@grant_type_key] = @password
      params[@username] = username
      params[@password] = password
      # header parameters
      header_params = {}
      header_params['Accept'] = '*/*'
      header_params['Content-Type'] = 'application/json'
      header_params[@authorization] = basic_cred
      response = Typhoeus::Request.new(
          auth_url,
          :method => :post,
          :headers => header_params,
          :params => params
      ).run
      if @debugging
        @logger.debug "HTTP response body ~BEGIN~\n#{response.body}\n~END~\n"
      end
      body = JSON.parse(response.body)
      unless response.success?
        if response.timed_out?
          raise ApiError.new('Connection timed out')
        elsif response.code == 0
          # Errors from libcurl will be made visible here
          raise ApiError.new(:code => 0,
                             :message => response.return_message)
        else
          raise ApiError.new(:code => response.code,
                             :response_headers => response.headers,
                             :response_body => response.body), body
        end
      end
      return body['access_token']
    end
  end
end
