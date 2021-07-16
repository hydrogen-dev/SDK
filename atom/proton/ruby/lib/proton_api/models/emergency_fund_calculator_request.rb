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
  class EmergencyFundCalculatorRequest
    attr_accessor :client_id

    attr_accessor :savings_horizon

    attr_accessor :housing_cost

    attr_accessor :other_expenses

    attr_accessor :account_ids

    attr_accessor :utility_payments

    attr_accessor :food_costs

    attr_accessor :debt_payments

    attr_accessor :lookback_periods

    attr_accessor :frequency_unit

    attr_accessor :current_emergency_fund_balance

    attr_accessor :insurance_payments

    attr_accessor :telecom_payments

    attr_accessor :transportation_costs

    attr_accessor :interest_rate

    attr_accessor :emergency_fund_duration

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
        :'client_id' => :'client_id',
        :'savings_horizon' => :'savings_horizon',
        :'housing_cost' => :'housing_cost',
        :'other_expenses' => :'other_expenses',
        :'account_ids' => :'account_ids',
        :'utility_payments' => :'utility_payments',
        :'food_costs' => :'food_costs',
        :'debt_payments' => :'debt_payments',
        :'lookback_periods' => :'lookback_periods',
        :'frequency_unit' => :'frequency_unit',
        :'current_emergency_fund_balance' => :'current_emergency_fund_balance',
        :'insurance_payments' => :'insurance_payments',
        :'telecom_payments' => :'telecom_payments',
        :'transportation_costs' => :'transportation_costs',
        :'interest_rate' => :'interest_rate',
        :'emergency_fund_duration' => :'emergency_fund_duration',
        :'aggregation_account_ids' => :'aggregation_account_ids'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'client_id' => :'String',
        :'savings_horizon' => :'Array<Integer>',
        :'housing_cost' => :'Float',
        :'other_expenses' => :'Object',
        :'account_ids' => :'Array<String>',
        :'utility_payments' => :'Float',
        :'food_costs' => :'Float',
        :'debt_payments' => :'Float',
        :'lookback_periods' => :'Integer',
        :'frequency_unit' => :'String',
        :'current_emergency_fund_balance' => :'Float',
        :'insurance_payments' => :'Float',
        :'telecom_payments' => :'Float',
        :'transportation_costs' => :'Float',
        :'interest_rate' => :'Float',
        :'emergency_fund_duration' => :'Integer',
        :'aggregation_account_ids' => :'Array<String>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'savings_horizon')
        if (value = attributes[:'savings_horizon']).is_a?(Array)
          self.savings_horizon = value
        end
      end

      if attributes.has_key?(:'housing_cost')
        self.housing_cost = attributes[:'housing_cost']
      else
        self.housing_cost = 0.0
      end

      if attributes.has_key?(:'other_expenses')
        self.other_expenses = attributes[:'other_expenses']
      end

      if attributes.has_key?(:'account_ids')
        if (value = attributes[:'account_ids']).is_a?(Array)
          self.account_ids = value
        end
      end

      if attributes.has_key?(:'utility_payments')
        self.utility_payments = attributes[:'utility_payments']
      else
        self.utility_payments = 0.0
      end

      if attributes.has_key?(:'food_costs')
        self.food_costs = attributes[:'food_costs']
      else
        self.food_costs = 0.0
      end

      if attributes.has_key?(:'debt_payments')
        self.debt_payments = attributes[:'debt_payments']
      else
        self.debt_payments = 0.0
      end

      if attributes.has_key?(:'lookback_periods')
        self.lookback_periods = attributes[:'lookback_periods']
      else
        self.lookback_periods = 3
      end

      if attributes.has_key?(:'frequency_unit')
        self.frequency_unit = attributes[:'frequency_unit']
      else
        self.frequency_unit = 'month'
      end

      if attributes.has_key?(:'current_emergency_fund_balance')
        self.current_emergency_fund_balance = attributes[:'current_emergency_fund_balance']
      else
        self.current_emergency_fund_balance = 0.0
      end

      if attributes.has_key?(:'insurance_payments')
        self.insurance_payments = attributes[:'insurance_payments']
      else
        self.insurance_payments = 0.0
      end

      if attributes.has_key?(:'telecom_payments')
        self.telecom_payments = attributes[:'telecom_payments']
      else
        self.telecom_payments = 0.0
      end

      if attributes.has_key?(:'transportation_costs')
        self.transportation_costs = attributes[:'transportation_costs']
      else
        self.transportation_costs = 0.0
      end

      if attributes.has_key?(:'interest_rate')
        self.interest_rate = attributes[:'interest_rate']
      else
        self.interest_rate = 0.0
      end

      if attributes.has_key?(:'emergency_fund_duration')
        self.emergency_fund_duration = attributes[:'emergency_fund_duration']
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
      if !@housing_cost.nil? && @housing_cost < 0
        invalid_properties.push('invalid value for "housing_cost", must be greater than or equal to 0.')
      end

      if !@utility_payments.nil? && @utility_payments < 0
        invalid_properties.push('invalid value for "utility_payments", must be greater than or equal to 0.')
      end

      if !@food_costs.nil? && @food_costs < 0
        invalid_properties.push('invalid value for "food_costs", must be greater than or equal to 0.')
      end

      if !@debt_payments.nil? && @debt_payments < 0
        invalid_properties.push('invalid value for "debt_payments", must be greater than or equal to 0.')
      end

      if !@lookback_periods.nil? && @lookback_periods < 1
        invalid_properties.push('invalid value for "lookback_periods", must be greater than or equal to 1.')
      end

      if !@current_emergency_fund_balance.nil? && @current_emergency_fund_balance < 0
        invalid_properties.push('invalid value for "current_emergency_fund_balance", must be greater than or equal to 0.')
      end

      if !@insurance_payments.nil? && @insurance_payments < 0
        invalid_properties.push('invalid value for "insurance_payments", must be greater than or equal to 0.')
      end

      if !@telecom_payments.nil? && @telecom_payments < 0
        invalid_properties.push('invalid value for "telecom_payments", must be greater than or equal to 0.')
      end

      if !@transportation_costs.nil? && @transportation_costs < 0
        invalid_properties.push('invalid value for "transportation_costs", must be greater than or equal to 0.')
      end

      if !@interest_rate.nil? && @interest_rate < 0
        invalid_properties.push('invalid value for "interest_rate", must be greater than or equal to 0.')
      end

      if @emergency_fund_duration.nil?
        invalid_properties.push('invalid value for "emergency_fund_duration", emergency_fund_duration cannot be nil.')
      end

      if @emergency_fund_duration < 1
        invalid_properties.push('invalid value for "emergency_fund_duration", must be greater than or equal to 1.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@housing_cost.nil? && @housing_cost < 0
      return false if !@utility_payments.nil? && @utility_payments < 0
      return false if !@food_costs.nil? && @food_costs < 0
      return false if !@debt_payments.nil? && @debt_payments < 0
      return false if !@lookback_periods.nil? && @lookback_periods < 1
      frequency_unit_validator = EnumAttributeValidator.new('String', ['year', 'six_months', 'quarter', 'month', 'two_weeks', 'week'])
      return false unless frequency_unit_validator.valid?(@frequency_unit)
      return false if !@current_emergency_fund_balance.nil? && @current_emergency_fund_balance < 0
      return false if !@insurance_payments.nil? && @insurance_payments < 0
      return false if !@telecom_payments.nil? && @telecom_payments < 0
      return false if !@transportation_costs.nil? && @transportation_costs < 0
      return false if !@interest_rate.nil? && @interest_rate < 0
      return false if @emergency_fund_duration.nil?
      return false if @emergency_fund_duration < 1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] housing_cost Value to be assigned
    def housing_cost=(housing_cost)
      if !housing_cost.nil? && housing_cost < 0
        fail ArgumentError, 'invalid value for "housing_cost", must be greater than or equal to 0.'
      end

      @housing_cost = housing_cost
    end

    # Custom attribute writer method with validation
    # @param [Object] utility_payments Value to be assigned
    def utility_payments=(utility_payments)
      if !utility_payments.nil? && utility_payments < 0
        fail ArgumentError, 'invalid value for "utility_payments", must be greater than or equal to 0.'
      end

      @utility_payments = utility_payments
    end

    # Custom attribute writer method with validation
    # @param [Object] food_costs Value to be assigned
    def food_costs=(food_costs)
      if !food_costs.nil? && food_costs < 0
        fail ArgumentError, 'invalid value for "food_costs", must be greater than or equal to 0.'
      end

      @food_costs = food_costs
    end

    # Custom attribute writer method with validation
    # @param [Object] debt_payments Value to be assigned
    def debt_payments=(debt_payments)
      if !debt_payments.nil? && debt_payments < 0
        fail ArgumentError, 'invalid value for "debt_payments", must be greater than or equal to 0.'
      end

      @debt_payments = debt_payments
    end

    # Custom attribute writer method with validation
    # @param [Object] lookback_periods Value to be assigned
    def lookback_periods=(lookback_periods)
      if !lookback_periods.nil? && lookback_periods < 1
        fail ArgumentError, 'invalid value for "lookback_periods", must be greater than or equal to 1.'
      end

      @lookback_periods = lookback_periods
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] frequency_unit Object to be assigned
    def frequency_unit=(frequency_unit)
      validator = EnumAttributeValidator.new('String', ['year', 'six_months', 'quarter', 'month', 'two_weeks', 'week'])
      unless validator.valid?(frequency_unit)
        fail ArgumentError, 'invalid value for "frequency_unit", must be one of #{validator.allowable_values}.'
      end
      @frequency_unit = frequency_unit
    end

    # Custom attribute writer method with validation
    # @param [Object] current_emergency_fund_balance Value to be assigned
    def current_emergency_fund_balance=(current_emergency_fund_balance)
      if !current_emergency_fund_balance.nil? && current_emergency_fund_balance < 0
        fail ArgumentError, 'invalid value for "current_emergency_fund_balance", must be greater than or equal to 0.'
      end

      @current_emergency_fund_balance = current_emergency_fund_balance
    end

    # Custom attribute writer method with validation
    # @param [Object] insurance_payments Value to be assigned
    def insurance_payments=(insurance_payments)
      if !insurance_payments.nil? && insurance_payments < 0
        fail ArgumentError, 'invalid value for "insurance_payments", must be greater than or equal to 0.'
      end

      @insurance_payments = insurance_payments
    end

    # Custom attribute writer method with validation
    # @param [Object] telecom_payments Value to be assigned
    def telecom_payments=(telecom_payments)
      if !telecom_payments.nil? && telecom_payments < 0
        fail ArgumentError, 'invalid value for "telecom_payments", must be greater than or equal to 0.'
      end

      @telecom_payments = telecom_payments
    end

    # Custom attribute writer method with validation
    # @param [Object] transportation_costs Value to be assigned
    def transportation_costs=(transportation_costs)
      if !transportation_costs.nil? && transportation_costs < 0
        fail ArgumentError, 'invalid value for "transportation_costs", must be greater than or equal to 0.'
      end

      @transportation_costs = transportation_costs
    end

    # Custom attribute writer method with validation
    # @param [Object] interest_rate Value to be assigned
    def interest_rate=(interest_rate)
      if !interest_rate.nil? && interest_rate < 0
        fail ArgumentError, 'invalid value for "interest_rate", must be greater than or equal to 0.'
      end

      @interest_rate = interest_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] emergency_fund_duration Value to be assigned
    def emergency_fund_duration=(emergency_fund_duration)
      if emergency_fund_duration.nil?
        fail ArgumentError, 'emergency_fund_duration cannot be nil'
      end

      if emergency_fund_duration < 1
        fail ArgumentError, 'invalid value for "emergency_fund_duration", must be greater than or equal to 1.'
      end

      @emergency_fund_duration = emergency_fund_duration
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          client_id == o.client_id &&
          savings_horizon == o.savings_horizon &&
          housing_cost == o.housing_cost &&
          other_expenses == o.other_expenses &&
          account_ids == o.account_ids &&
          utility_payments == o.utility_payments &&
          food_costs == o.food_costs &&
          debt_payments == o.debt_payments &&
          lookback_periods == o.lookback_periods &&
          frequency_unit == o.frequency_unit &&
          current_emergency_fund_balance == o.current_emergency_fund_balance &&
          insurance_payments == o.insurance_payments &&
          telecom_payments == o.telecom_payments &&
          transportation_costs == o.transportation_costs &&
          interest_rate == o.interest_rate &&
          emergency_fund_duration == o.emergency_fund_duration &&
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
      [client_id, savings_horizon, housing_cost, other_expenses, account_ids, utility_payments, food_costs, debt_payments, lookback_periods, frequency_unit, current_emergency_fund_balance, insurance_payments, telecom_payments, transportation_costs, interest_rate, emergency_fund_duration, aggregation_account_ids].hash
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
