=begin
#Hydrogen Integration API

#The Hydrogen Integration API

OpenAPI spec version: 1.3.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'date'

module IntegrationApi
  class IavRequestCO
    attr_accessor :auth_token

    attr_accessor :is_cash

    attr_accessor :nucleus_account_id

    attr_accessor :nucleus_business_id

    attr_accessor :nucleus_client_id

    attr_accessor :nucleus_transfer_fields

    attr_accessor :product

    attr_accessor :vendor_request

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'auth_token' => :'auth_token',
        :'is_cash' => :'is_cash',
        :'nucleus_account_id' => :'nucleus_account_id',
        :'nucleus_business_id' => :'nucleus_business_id',
        :'nucleus_client_id' => :'nucleus_client_id',
        :'nucleus_transfer_fields' => :'nucleus_transfer_fields',
        :'product' => :'product',
        :'vendor_request' => :'vendor_request'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'auth_token' => :'String',
        :'is_cash' => :'BOOLEAN',
        :'nucleus_account_id' => :'String',
        :'nucleus_business_id' => :'String',
        :'nucleus_client_id' => :'String',
        :'nucleus_transfer_fields' => :'NucleusTransferFieldsCO',
        :'product' => :'String',
        :'vendor_request' => :'IavVendorRequestCO'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'auth_token')
        self.auth_token = attributes[:'auth_token']
      end

      if attributes.has_key?(:'is_cash')
        self.is_cash = attributes[:'is_cash']
      end

      if attributes.has_key?(:'nucleus_account_id')
        self.nucleus_account_id = attributes[:'nucleus_account_id']
      end

      if attributes.has_key?(:'nucleus_business_id')
        self.nucleus_business_id = attributes[:'nucleus_business_id']
      end

      if attributes.has_key?(:'nucleus_client_id')
        self.nucleus_client_id = attributes[:'nucleus_client_id']
      end

      if attributes.has_key?(:'nucleus_transfer_fields')
        self.nucleus_transfer_fields = attributes[:'nucleus_transfer_fields']
      end

      if attributes.has_key?(:'product')
        self.product = attributes[:'product']
      end

      if attributes.has_key?(:'vendor_request')
        self.vendor_request = attributes[:'vendor_request']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          auth_token == o.auth_token &&
          is_cash == o.is_cash &&
          nucleus_account_id == o.nucleus_account_id &&
          nucleus_business_id == o.nucleus_business_id &&
          nucleus_client_id == o.nucleus_client_id &&
          nucleus_transfer_fields == o.nucleus_transfer_fields &&
          product == o.product &&
          vendor_request == o.vendor_request
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [auth_token, is_cash, nucleus_account_id, nucleus_business_id, nucleus_client_id, nucleus_transfer_fields, product, vendor_request].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        (value)
      when :Date
        (value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = IntegrationApi.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end
# Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
   def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end
end
