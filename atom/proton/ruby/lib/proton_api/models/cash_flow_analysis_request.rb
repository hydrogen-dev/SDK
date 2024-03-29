=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.2
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'date'

module ProtonApi
  class CashFlowAnalysisRequest
    attr_accessor :currency_code

    attr_accessor :client_id

    attr_accessor :show_history

    attr_accessor :benchmark_start_date

    attr_accessor :scope

    attr_accessor :end_date

    attr_accessor :account_ids

    attr_accessor :benchmark_end_date

    attr_accessor :currency_conversion

    attr_accessor :start_date

    attr_accessor :transaction_status_scope

    attr_accessor :show_income_details

    attr_accessor :only_cleansed

    attr_accessor :household_id

    attr_accessor :show_spending_details

    attr_accessor :aggregation_account_ids

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
        :'currency_code' => :'currency_code',
        :'client_id' => :'client_id',
        :'show_history' => :'show_history',
        :'benchmark_start_date' => :'benchmark_start_date',
        :'scope' => :'scope',
        :'end_date' => :'end_date',
        :'account_ids' => :'account_ids',
        :'benchmark_end_date' => :'benchmark_end_date',
        :'currency_conversion' => :'currency_conversion',
        :'start_date' => :'start_date',
        :'transaction_status_scope' => :'transaction_status_scope',
        :'show_income_details' => :'show_income_details',
        :'only_cleansed' => :'only_cleansed',
        :'household_id' => :'household_id',
        :'show_spending_details' => :'show_spending_details',
        :'aggregation_account_ids' => :'aggregation_account_ids'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'currency_code' => :'String',
        :'client_id' => :'String',
        :'show_history' => :'BOOLEAN',
        :'benchmark_start_date' => :'Date',
        :'scope' => :'String',
        :'end_date' => :'Date',
        :'account_ids' => :'Array<String>',
        :'benchmark_end_date' => :'Date',
        :'currency_conversion' => :'String',
        :'start_date' => :'Date',
        :'transaction_status_scope' => :'Array<String>',
        :'show_income_details' => :'BOOLEAN',
        :'only_cleansed' => :'BOOLEAN',
        :'household_id' => :'String',
        :'show_spending_details' => :'BOOLEAN',
        :'aggregation_account_ids' => :'Array<String>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'show_history')
        self.show_history = attributes[:'show_history']
      else
        self.show_history = false
      end

      if attributes.has_key?(:'benchmark_start_date')
        self.benchmark_start_date = attributes[:'benchmark_start_date']
      end

      if attributes.has_key?(:'scope')
        self.scope = attributes[:'scope']
      else
        self.scope = 'all'
      end

      if attributes.has_key?(:'end_date')
        self.end_date = attributes[:'end_date']
      end

      if attributes.has_key?(:'account_ids')
        if (value = attributes[:'account_ids']).is_a?(Array)
          self.account_ids = value
        end
      end

      if attributes.has_key?(:'benchmark_end_date')
        self.benchmark_end_date = attributes[:'benchmark_end_date']
      end

      if attributes.has_key?(:'currency_conversion')
        self.currency_conversion = attributes[:'currency_conversion']
      end

      if attributes.has_key?(:'start_date')
        self.start_date = attributes[:'start_date']
      end

      if attributes.has_key?(:'transaction_status_scope')
        if (value = attributes[:'transaction_status_scope']).is_a?(Array)
          self.transaction_status_scope = value
        end
      end

      if attributes.has_key?(:'show_income_details')
        self.show_income_details = attributes[:'show_income_details']
      else
        self.show_income_details = false
      end

      if attributes.has_key?(:'only_cleansed')
        self.only_cleansed = attributes[:'only_cleansed']
      else
        self.only_cleansed = false
      end

      if attributes.has_key?(:'household_id')
        self.household_id = attributes[:'household_id']
      end

      if attributes.has_key?(:'show_spending_details')
        self.show_spending_details = attributes[:'show_spending_details']
      else
        self.show_spending_details = false
      end

      if attributes.has_key?(:'aggregation_account_ids')
        if (value = attributes[:'aggregation_account_ids']).is_a?(Array)
          self.aggregation_account_ids = value
        end
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
      scope_validator = EnumAttributeValidator.new('String', ['all', 'external', 'internal'])
      return false unless scope_validator.valid?(@scope)
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] scope Object to be assigned
    def scope=(scope)
      validator = EnumAttributeValidator.new('String', ['all', 'external', 'internal'])
      unless validator.valid?(scope)
        fail ArgumentError, 'invalid value for "scope", must be one of #{validator.allowable_values}.'
      end
      @scope = scope
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          currency_code == o.currency_code &&
          client_id == o.client_id &&
          show_history == o.show_history &&
          benchmark_start_date == o.benchmark_start_date &&
          scope == o.scope &&
          end_date == o.end_date &&
          account_ids == o.account_ids &&
          benchmark_end_date == o.benchmark_end_date &&
          currency_conversion == o.currency_conversion &&
          start_date == o.start_date &&
          transaction_status_scope == o.transaction_status_scope &&
          show_income_details == o.show_income_details &&
          only_cleansed == o.only_cleansed &&
          household_id == o.household_id &&
          show_spending_details == o.show_spending_details &&
          aggregation_account_ids == o.aggregation_account_ids
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [currency_code, client_id, show_history, benchmark_start_date, scope, end_date, account_ids, benchmark_end_date, currency_conversion, start_date, transaction_status_scope, show_income_details, only_cleansed, household_id, show_spending_details, aggregation_account_ids].hash
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
        value
      when :Date
        value
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
        next if value.nil?
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
