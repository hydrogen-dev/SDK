=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.3
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'date'

module NucleusApi
  # FinancialStatement Object
  class FinancialStatement
    # accounting_method
    attr_accessor :accounting_method

    # businessId
    attr_accessor :business_id

    # clientId
    attr_accessor :client_id

    attr_accessor :create_date

    # currencyCode
    attr_accessor :currency_code

    attr_accessor :id

    attr_accessor :metadata

    # periodLength
    attr_accessor :period_length

    # periodMonth
    attr_accessor :period_month

    # periodQuarter
    attr_accessor :period_quarter

    # periodType
    attr_accessor :period_type

    # periodYear
    attr_accessor :period_year

    attr_accessor :secondary_id

    # statementDate
    attr_accessor :statement_date

    # statement_type
    attr_accessor :statement_type

    # stats
    attr_accessor :stats

    attr_accessor :update_date

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'accounting_method' => :'accounting_method',
        :'business_id' => :'business_id',
        :'client_id' => :'client_id',
        :'create_date' => :'create_date',
        :'currency_code' => :'currency_code',
        :'id' => :'id',
        :'metadata' => :'metadata',
        :'period_length' => :'period_length',
        :'period_month' => :'period_month',
        :'period_quarter' => :'period_quarter',
        :'period_type' => :'period_type',
        :'period_year' => :'period_year',
        :'secondary_id' => :'secondary_id',
        :'statement_date' => :'statement_date',
        :'statement_type' => :'statement_type',
        :'stats' => :'stats',
        :'update_date' => :'update_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'accounting_method' => :'String',
        :'business_id' => :'String',
        :'client_id' => :'String',
        :'create_date' => :'DateTime',
        :'currency_code' => :'String',
        :'id' => :'String',
        :'metadata' => :'Hash<String, String>',
        :'period_length' => :'String',
        :'period_month' => :'Integer',
        :'period_quarter' => :'Integer',
        :'period_type' => :'String',
        :'period_year' => :'Integer',
        :'secondary_id' => :'String',
        :'statement_date' => :'Date',
        :'statement_type' => :'String',
        :'stats' => :'Array<Stat>',
        :'update_date' => :'DateTime'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'accounting_method')
        self.accounting_method = attributes[:'accounting_method']
      end

      if attributes.has_key?(:'business_id')
        self.business_id = attributes[:'business_id']
      end

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.has_key?(:'period_length')
        self.period_length = attributes[:'period_length']
      end

      if attributes.has_key?(:'period_month')
        self.period_month = attributes[:'period_month']
      end

      if attributes.has_key?(:'period_quarter')
        self.period_quarter = attributes[:'period_quarter']
      end

      if attributes.has_key?(:'period_type')
        self.period_type = attributes[:'period_type']
      end

      if attributes.has_key?(:'period_year')
        self.period_year = attributes[:'period_year']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'statement_date')
        self.statement_date = attributes[:'statement_date']
      end

      if attributes.has_key?(:'statement_type')
        self.statement_type = attributes[:'statement_type']
      end

      if attributes.has_key?(:'stats')
        if (value = attributes[:'stats']).is_a?(Array)
          self.stats = value
        end
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @accounting_method.nil?
        invalid_properties.push('invalid value for "accounting_method", accounting_method cannot be nil.')
      end

      if @currency_code.nil?
        invalid_properties.push('invalid value for "currency_code", currency_code cannot be nil.')
      end

      if @statement_date.nil?
        invalid_properties.push('invalid value for "statement_date", statement_date cannot be nil.')
      end

      if @statement_type.nil?
        invalid_properties.push('invalid value for "statement_type", statement_type cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @accounting_method.nil?
      return false if @currency_code.nil?
      return false if @statement_date.nil?
      return false if @statement_type.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          accounting_method == o.accounting_method &&
          business_id == o.business_id &&
          client_id == o.client_id &&
          create_date == o.create_date &&
          currency_code == o.currency_code &&
          id == o.id &&
          metadata == o.metadata &&
          period_length == o.period_length &&
          period_month == o.period_month &&
          period_quarter == o.period_quarter &&
          period_type == o.period_type &&
          period_year == o.period_year &&
          secondary_id == o.secondary_id &&
          statement_date == o.statement_date &&
          statement_type == o.statement_type &&
          stats == o.stats &&
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
      [accounting_method, business_id, client_id, create_date, currency_code, id, metadata, period_length, period_month, period_quarter, period_type, period_year, secondary_id, statement_date, statement_type, stats, update_date].hash
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
