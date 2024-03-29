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
  # Budget Object
  class Budget
    # accountId
    attr_accessor :account_id

    attr_accessor :aggregation_accounts

    attr_accessor :budget

    # cardId
    attr_accessor :card_id

    # clientId
    attr_accessor :client_id

    attr_accessor :create_date

    # currencyCode
    attr_accessor :currency_code

    # endDate
    attr_accessor :end_date

    # frequency
    attr_accessor :frequency

    # frequencyUnit
    attr_accessor :frequency_unit

    # goalId
    attr_accessor :goal_id

    attr_accessor :id

    # is_active
    attr_accessor :is_active

    attr_accessor :metadata

    # name
    attr_accessor :name

    attr_accessor :secondary_id

    # startDate
    attr_accessor :start_date

    # totalValue
    attr_accessor :total_value

    attr_accessor :update_date

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'account_id' => :'account_id',
        :'aggregation_accounts' => :'aggregation_accounts',
        :'budget' => :'budget',
        :'card_id' => :'card_id',
        :'client_id' => :'client_id',
        :'create_date' => :'create_date',
        :'currency_code' => :'currency_code',
        :'end_date' => :'end_date',
        :'frequency' => :'frequency',
        :'frequency_unit' => :'frequency_unit',
        :'goal_id' => :'goal_id',
        :'id' => :'id',
        :'is_active' => :'is_active',
        :'metadata' => :'metadata',
        :'name' => :'name',
        :'secondary_id' => :'secondary_id',
        :'start_date' => :'start_date',
        :'total_value' => :'total_value',
        :'update_date' => :'update_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'account_id' => :'String',
        :'aggregation_accounts' => :'Array<BudgetAggregationAccount>',
        :'budget' => :'Array<BudgetObject>',
        :'card_id' => :'String',
        :'client_id' => :'String',
        :'create_date' => :'DateTime',
        :'currency_code' => :'String',
        :'end_date' => :'Date',
        :'frequency' => :'Integer',
        :'frequency_unit' => :'String',
        :'goal_id' => :'String',
        :'id' => :'String',
        :'is_active' => :'BOOLEAN',
        :'metadata' => :'Hash<String, String>',
        :'name' => :'String',
        :'secondary_id' => :'String',
        :'start_date' => :'Date',
        :'total_value' => :'Float',
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

      if attributes.has_key?(:'aggregation_accounts')
        if (value = attributes[:'aggregation_accounts']).is_a?(Array)
          self.aggregation_accounts = value
        end
      end

      if attributes.has_key?(:'budget')
        if (value = attributes[:'budget']).is_a?(Array)
          self.budget = value
        end
      end

      if attributes.has_key?(:'card_id')
        self.card_id = attributes[:'card_id']
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

      if attributes.has_key?(:'end_date')
        self.end_date = attributes[:'end_date']
      end

      if attributes.has_key?(:'frequency')
        self.frequency = attributes[:'frequency']
      end

      if attributes.has_key?(:'frequency_unit')
        self.frequency_unit = attributes[:'frequency_unit']
      end

      if attributes.has_key?(:'goal_id')
        self.goal_id = attributes[:'goal_id']
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'is_active')
        self.is_active = attributes[:'is_active']
      end

      if attributes.has_key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.has_key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'start_date')
        self.start_date = attributes[:'start_date']
      end

      if attributes.has_key?(:'total_value')
        self.total_value = attributes[:'total_value']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @client_id.nil?
        invalid_properties.push('invalid value for "client_id", client_id cannot be nil.')
      end

      if @currency_code.nil?
        invalid_properties.push('invalid value for "currency_code", currency_code cannot be nil.')
      end

      if @frequency_unit.nil?
        invalid_properties.push('invalid value for "frequency_unit", frequency_unit cannot be nil.')
      end

      if @name.nil?
        invalid_properties.push('invalid value for "name", name cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @client_id.nil?
      return false if @currency_code.nil?
      return false if @frequency_unit.nil?
      return false if @name.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          account_id == o.account_id &&
          aggregation_accounts == o.aggregation_accounts &&
          budget == o.budget &&
          card_id == o.card_id &&
          client_id == o.client_id &&
          create_date == o.create_date &&
          currency_code == o.currency_code &&
          end_date == o.end_date &&
          frequency == o.frequency &&
          frequency_unit == o.frequency_unit &&
          goal_id == o.goal_id &&
          id == o.id &&
          is_active == o.is_active &&
          metadata == o.metadata &&
          name == o.name &&
          secondary_id == o.secondary_id &&
          start_date == o.start_date &&
          total_value == o.total_value &&
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
      [account_id, aggregation_accounts, budget, card_id, client_id, create_date, currency_code, end_date, frequency, frequency_unit, goal_id, id, is_active, metadata, name, secondary_id, start_date, total_value, update_date].hash
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
