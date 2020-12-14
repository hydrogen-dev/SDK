=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.8.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.16

=end

require 'date'

module ProtonApi
  class BudgetDetails
    attr_accessor :aggregation_accounts

    attr_accessor :total_value

    attr_accessor :client_id

    attr_accessor :start_date

    attr_accessor :budget

    attr_accessor :end_date

    attr_accessor :currency_code

    attr_accessor :frequency

    attr_accessor :account_id

    attr_accessor :frequency_unit

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'aggregation_accounts' => :'aggregation_accounts',
        :'total_value' => :'total_value',
        :'client_id' => :'client_id',
        :'start_date' => :'start_date',
        :'budget' => :'budget',
        :'end_date' => :'end_date',
        :'currency_code' => :'currency_code',
        :'frequency' => :'frequency',
        :'account_id' => :'account_id',
        :'frequency_unit' => :'frequency_unit'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'aggregation_accounts' => :'Array<BudgetAggregationAccount>',
        :'total_value' => :'Float',
        :'client_id' => :'String',
        :'start_date' => :'Date',
        :'budget' => :'Array<BudgetComponent>',
        :'end_date' => :'Date',
        :'currency_code' => :'String',
        :'frequency' => :'Integer',
        :'account_id' => :'String',
        :'frequency_unit' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'aggregation_accounts')
        if (value = attributes[:'aggregation_accounts']).is_a?(Array)
          self.aggregation_accounts = value
        end
      end

      if attributes.has_key?(:'total_value')
        self.total_value = attributes[:'total_value']
      end

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'start_date')
        self.start_date = attributes[:'start_date']
      end

      if attributes.has_key?(:'budget')
        if (value = attributes[:'budget']).is_a?(Array)
          self.budget = value
        end
      end

      if attributes.has_key?(:'end_date')
        self.end_date = attributes[:'end_date']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'frequency')
        self.frequency = attributes[:'frequency']
      else
        self.frequency = 1
      end

      if attributes.has_key?(:'account_id')
        self.account_id = attributes[:'account_id']
      end

      if attributes.has_key?(:'frequency_unit')
        self.frequency_unit = attributes[:'frequency_unit']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@total_value.nil? && @total_value < 0
        invalid_properties.push('invalid value for "total_value", must be greater than or equal to 0.')
      end

      if !@frequency.nil? && @frequency < 1
        invalid_properties.push('invalid value for "frequency", must be greater than or equal to 1.')
      end

      if @frequency_unit.nil?
        invalid_properties.push('invalid value for "frequency_unit", frequency_unit cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@total_value.nil? && @total_value < 0
      return false if !@frequency.nil? && @frequency < 1
      return false if @frequency_unit.nil?
      frequency_unit_validator = EnumAttributeValidator.new('String', ['daily', 'weekly', 'bi-weekly', 'monthly', 'quarterly', 'annually'])
      return false unless frequency_unit_validator.valid?(@frequency_unit)
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] total_value Value to be assigned
    def total_value=(total_value)
      if !total_value.nil? && total_value < 0
        fail ArgumentError, 'invalid value for "total_value", must be greater than or equal to 0.'
      end

      @total_value = total_value
    end

    # Custom attribute writer method with validation
    # @param [Object] frequency Value to be assigned
    def frequency=(frequency)
      if !frequency.nil? && frequency < 1
        fail ArgumentError, 'invalid value for "frequency", must be greater than or equal to 1.'
      end

      @frequency = frequency
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] frequency_unit Object to be assigned
    def frequency_unit=(frequency_unit)
      validator = EnumAttributeValidator.new('String', ['daily', 'weekly', 'bi-weekly', 'monthly', 'quarterly', 'annually'])
      unless validator.valid?(frequency_unit)
        fail ArgumentError, 'invalid value for "frequency_unit", must be one of #{validator.allowable_values}.'
      end
      @frequency_unit = frequency_unit
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          aggregation_accounts == o.aggregation_accounts &&
          total_value == o.total_value &&
          client_id == o.client_id &&
          start_date == o.start_date &&
          budget == o.budget &&
          end_date == o.end_date &&
          currency_code == o.currency_code &&
          frequency == o.frequency &&
          account_id == o.account_id &&
          frequency_unit == o.frequency_unit
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [aggregation_accounts, total_value, client_id, start_date, budget, end_date, currency_code, frequency, account_id, frequency_unit].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        elsif attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", attributes[self.class.attribute_map[key]])
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
        temp_model = ProtonApi.const_get(type).new
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