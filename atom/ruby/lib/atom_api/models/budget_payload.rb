=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.2-SNAPSHOT

=end

require 'date'

module AtomApi
  class BudgetPayload
    # Name of the budget
    attr_accessor :name

    # The ID of the client the budget belongs to
    attr_accessor :client_id

    # Alphabetic currency code for the base currency of the budget, limited to 3 characters.
    attr_accessor :currency_code

    attr_accessor :budget

    # Frequency of the budget. Value may be daily, weekly, bi-weekly, monthly, semi-monthly, quarterly, or annually
    attr_accessor :frequency_unit

    # Number of frequency_unit between each budget. For example, if the frequency_unit is weekly and the frequency is 2, this means the budget occurs every two weeks. Default is 1
    attr_accessor :frequency

    # The ID of the account the budget belongs to
    attr_accessor :account_id

    # The ID of a goal mapped to the budget
    attr_accessor :goal_id

    # The start date for the budget
    attr_accessor :start_date

    # The end date for the budget
    attr_accessor :end_date

    # Custom information associated with the budget in the format key:value
    attr_accessor :metadata

    attr_accessor :secondary_id

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
        :'name' => :'name',
        :'client_id' => :'client_id',
        :'currency_code' => :'currency_code',
        :'budget' => :'budget',
        :'frequency_unit' => :'frequency_unit',
        :'frequency' => :'frequency',
        :'account_id' => :'account_id',
        :'goal_id' => :'goal_id',
        :'start_date' => :'start_date',
        :'end_date' => :'end date',
        :'metadata' => :'metadata',
        :'secondary_id' => :'secondary_id'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'name' => :'String',
        :'client_id' => :'String',
        :'currency_code' => :'String',
        :'budget' => :'Array<BudgetPayloadBudget>',
        :'frequency_unit' => :'String',
        :'frequency' => :'Float',
        :'account_id' => :'String',
        :'goal_id' => :'String',
        :'start_date' => :'Date',
        :'end_date' => :'Date',
        :'metadata' => :'Object',
        :'secondary_id' => :'SecondaryId'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'budget')
        if (value = attributes[:'budget']).is_a?(Array)
          self.budget = value
        end
      end

      if attributes.has_key?(:'frequency_unit')
        self.frequency_unit = attributes[:'frequency_unit']
      end

      if attributes.has_key?(:'frequency')
        self.frequency = attributes[:'frequency']
      end

      if attributes.has_key?(:'account_id')
        self.account_id = attributes[:'account_id']
      end

      if attributes.has_key?(:'goal_id')
        self.goal_id = attributes[:'goal_id']
      end

      if attributes.has_key?(:'start_date')
        self.start_date = attributes[:'start_date']
      end

      if attributes.has_key?(:'end date')
        self.end_date = attributes[:'end date']
      end

      if attributes.has_key?(:'metadata')
        self.metadata = attributes[:'metadata']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @name.nil?
        invalid_properties.push('invalid value for "name", name cannot be nil.')
      end

      if @client_id.nil?
        invalid_properties.push('invalid value for "client_id", client_id cannot be nil.')
      end

      if @currency_code.nil?
        invalid_properties.push('invalid value for "currency_code", currency_code cannot be nil.')
      end

      if @budget.nil?
        invalid_properties.push('invalid value for "budget", budget cannot be nil.')
      end

      if @frequency_unit.nil?
        invalid_properties.push('invalid value for "frequency_unit", frequency_unit cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @name.nil?
      return false if @client_id.nil?
      return false if @currency_code.nil?
      return false if @budget.nil?
      return false if @frequency_unit.nil?
      frequency_unit_validator = EnumAttributeValidator.new('String', ['daily', 'weekly', 'bi-weekly', 'monthly', 'semi-monthly', 'quarterly', 'annually'])
      return false unless frequency_unit_validator.valid?(@frequency_unit)
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] frequency_unit Object to be assigned
    def frequency_unit=(frequency_unit)
      validator = EnumAttributeValidator.new('String', ['daily', 'weekly', 'bi-weekly', 'monthly', 'semi-monthly', 'quarterly', 'annually'])
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
          name == o.name &&
          client_id == o.client_id &&
          currency_code == o.currency_code &&
          budget == o.budget &&
          frequency_unit == o.frequency_unit &&
          frequency == o.frequency &&
          account_id == o.account_id &&
          goal_id == o.goal_id &&
          start_date == o.start_date &&
          end_date == o.end_date &&
          metadata == o.metadata &&
          secondary_id == o.secondary_id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [name, client_id, currency_code, budget, frequency_unit, frequency, account_id, goal_id, start_date, end_date, metadata, secondary_id].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
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
        DateTime.parse(value)
      when :Date
        Date.parse(value)
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
        temp_model = AtomApi.const_get(type).new
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
