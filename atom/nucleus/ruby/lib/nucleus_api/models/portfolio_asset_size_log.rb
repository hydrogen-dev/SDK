=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.5
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'date'

module NucleusApi
  # PortfolioAssetSizeLog Object
  class PortfolioAssetSizeLog
    # accountId
    attr_accessor :account_id

    # asset_size
    attr_accessor :asset_size

    # asset_size_available
    attr_accessor :asset_size_available

    # asset_size_pending
    attr_accessor :asset_size_pending

    # cash_flow
    attr_accessor :cash_flow

    attr_accessor :create_date

    # currency_code
    attr_accessor :currency_code

    # date
    attr_accessor :date

    attr_accessor :id

    # modelId
    attr_accessor :model_id

    # portfolioId
    attr_accessor :portfolio_id

    attr_accessor :secondary_id

    attr_accessor :update_date

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'account_id' => :'account_id',
        :'asset_size' => :'asset_size',
        :'asset_size_available' => :'asset_size_available',
        :'asset_size_pending' => :'asset_size_pending',
        :'cash_flow' => :'cash_flow',
        :'create_date' => :'create_date',
        :'currency_code' => :'currency_code',
        :'date' => :'date',
        :'id' => :'id',
        :'model_id' => :'model_id',
        :'portfolio_id' => :'portfolio_id',
        :'secondary_id' => :'secondary_id',
        :'update_date' => :'update_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'account_id' => :'String',
        :'asset_size' => :'Float',
        :'asset_size_available' => :'Float',
        :'asset_size_pending' => :'Float',
        :'cash_flow' => :'Float',
        :'create_date' => :'DateTime',
        :'currency_code' => :'String',
        :'date' => :'DateTime',
        :'id' => :'String',
        :'model_id' => :'String',
        :'portfolio_id' => :'String',
        :'secondary_id' => :'String',
        :'update_date' => :'DateTime'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'account_id')
        self.account_id = attributes[:'account_id']
      end

      if attributes.has_key?(:'asset_size')
        self.asset_size = attributes[:'asset_size']
      end

      if attributes.has_key?(:'asset_size_available')
        self.asset_size_available = attributes[:'asset_size_available']
      end

      if attributes.has_key?(:'asset_size_pending')
        self.asset_size_pending = attributes[:'asset_size_pending']
      end

      if attributes.has_key?(:'cash_flow')
        self.cash_flow = attributes[:'cash_flow']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'date')
        self.date = attributes[:'date']
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'model_id')
        self.model_id = attributes[:'model_id']
      end

      if attributes.has_key?(:'portfolio_id')
        self.portfolio_id = attributes[:'portfolio_id']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @account_id.nil?
        invalid_properties.push('invalid value for "account_id", account_id cannot be nil.')
      end

      if @asset_size.nil?
        invalid_properties.push('invalid value for "asset_size", asset_size cannot be nil.')
      end

      if @cash_flow.nil?
        invalid_properties.push('invalid value for "cash_flow", cash_flow cannot be nil.')
      end

      if @date.nil?
        invalid_properties.push('invalid value for "date", date cannot be nil.')
      end

      if @model_id.nil?
        invalid_properties.push('invalid value for "model_id", model_id cannot be nil.')
      end

      if @portfolio_id.nil?
        invalid_properties.push('invalid value for "portfolio_id", portfolio_id cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @account_id.nil?
      return false if @asset_size.nil?
      return false if @cash_flow.nil?
      return false if @date.nil?
      return false if @model_id.nil?
      return false if @portfolio_id.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          account_id == o.account_id &&
          asset_size == o.asset_size &&
          asset_size_available == o.asset_size_available &&
          asset_size_pending == o.asset_size_pending &&
          cash_flow == o.cash_flow &&
          create_date == o.create_date &&
          currency_code == o.currency_code &&
          date == o.date &&
          id == o.id &&
          model_id == o.model_id &&
          portfolio_id == o.portfolio_id &&
          secondary_id == o.secondary_id &&
          update_date == o.update_date
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [account_id, asset_size, asset_size_available, asset_size_pending, cash_flow, create_date, currency_code, date, id, model_id, portfolio_id, secondary_id, update_date].hash
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
        temp_model = NucleusApi.const_get(type).new
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
