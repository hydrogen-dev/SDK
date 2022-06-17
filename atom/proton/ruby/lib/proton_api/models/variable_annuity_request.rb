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
  class VariableAnnuityRequest
    attr_accessor :p

    attr_accessor :allocation_id

    attr_accessor :decumulation_horizon

    attr_accessor :accumulation_horizon

    attr_accessor :annuitization_rate

    attr_accessor :guaranteed_rate_benefit

    attr_accessor :model_id

    attr_accessor :portfolio_tickers

    attr_accessor :create_log

    attr_accessor :inflation_rate

    attr_accessor :aggregation_account_id

    attr_accessor :n

    attr_accessor :guaranteed_accumulation_benefit

    attr_accessor :end_date

    attr_accessor :tax_rate

    attr_accessor :start_date

    attr_accessor :remove_outliers

    attr_accessor :portfolio_weights

    attr_accessor :portfolio_id

    attr_accessor :result_type

    attr_accessor :account_id

    attr_accessor :trading_days_per_year

    attr_accessor :use_proxy_data

    attr_accessor :initial_balance

    attr_accessor :market_data_source

    attr_accessor :frequency_interval

    attr_accessor :deposit_schedule

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
        :'p' => :'p',
        :'allocation_id' => :'allocation_id',
        :'decumulation_horizon' => :'decumulation_horizon',
        :'accumulation_horizon' => :'accumulation_horizon',
        :'annuitization_rate' => :'annuitization_rate',
        :'guaranteed_rate_benefit' => :'guaranteed_rate_benefit',
        :'model_id' => :'model_id',
        :'portfolio_tickers' => :'portfolio_tickers',
        :'create_log' => :'create_log',
        :'inflation_rate' => :'inflation_rate',
        :'aggregation_account_id' => :'aggregation_account_id',
        :'n' => :'n',
        :'guaranteed_accumulation_benefit' => :'guaranteed_accumulation_benefit',
        :'end_date' => :'end_date',
        :'tax_rate' => :'tax_rate',
        :'start_date' => :'start_date',
        :'remove_outliers' => :'remove_outliers',
        :'portfolio_weights' => :'portfolio_weights',
        :'portfolio_id' => :'portfolio_id',
        :'result_type' => :'result_type',
        :'account_id' => :'account_id',
        :'trading_days_per_year' => :'trading_days_per_year',
        :'use_proxy_data' => :'use_proxy_data',
        :'initial_balance' => :'initial_balance',
        :'market_data_source' => :'market_data_source',
        :'frequency_interval' => :'frequency_interval',
        :'deposit_schedule' => :'deposit_schedule'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'p' => :'Float',
        :'allocation_id' => :'String',
        :'decumulation_horizon' => :'Integer',
        :'accumulation_horizon' => :'Integer',
        :'annuitization_rate' => :'Float',
        :'guaranteed_rate_benefit' => :'Array<GuaranteedRateBenefit>',
        :'model_id' => :'String',
        :'portfolio_tickers' => :'Array<String>',
        :'create_log' => :'BOOLEAN',
        :'inflation_rate' => :'Float',
        :'aggregation_account_id' => :'String',
        :'n' => :'Integer',
        :'guaranteed_accumulation_benefit' => :'Float',
        :'end_date' => :'String',
        :'tax_rate' => :'Float',
        :'start_date' => :'String',
        :'remove_outliers' => :'BOOLEAN',
        :'portfolio_weights' => :'Array<Float>',
        :'portfolio_id' => :'String',
        :'result_type' => :'String',
        :'account_id' => :'String',
        :'trading_days_per_year' => :'Integer',
        :'use_proxy_data' => :'BOOLEAN',
        :'initial_balance' => :'Float',
        :'market_data_source' => :'String',
        :'frequency_interval' => :'String',
        :'deposit_schedule' => :'AnnuityDepositSchedule'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'p')
        self.p = attributes[:'p']
      end

      if attributes.has_key?(:'allocation_id')
        self.allocation_id = attributes[:'allocation_id']
      end

      if attributes.has_key?(:'decumulation_horizon')
        self.decumulation_horizon = attributes[:'decumulation_horizon']
      end

      if attributes.has_key?(:'accumulation_horizon')
        self.accumulation_horizon = attributes[:'accumulation_horizon']
      end

      if attributes.has_key?(:'annuitization_rate')
        self.annuitization_rate = attributes[:'annuitization_rate']
      else
        self.annuitization_rate = 0.0
      end

      if attributes.has_key?(:'guaranteed_rate_benefit')
        if (value = attributes[:'guaranteed_rate_benefit']).is_a?(Array)
          self.guaranteed_rate_benefit = value
        end
      end

      if attributes.has_key?(:'model_id')
        self.model_id = attributes[:'model_id']
      end

      if attributes.has_key?(:'portfolio_tickers')
        if (value = attributes[:'portfolio_tickers']).is_a?(Array)
          self.portfolio_tickers = value
        end
      end

      if attributes.has_key?(:'create_log')
        self.create_log = attributes[:'create_log']
      else
        self.create_log = false
      end

      if attributes.has_key?(:'inflation_rate')
        self.inflation_rate = attributes[:'inflation_rate']
      else
        self.inflation_rate = 0.0
      end

      if attributes.has_key?(:'aggregation_account_id')
        self.aggregation_account_id = attributes[:'aggregation_account_id']
      end

      if attributes.has_key?(:'n')
        self.n = attributes[:'n']
      else
        self.n = 1000
      end

      if attributes.has_key?(:'guaranteed_accumulation_benefit')
        self.guaranteed_accumulation_benefit = attributes[:'guaranteed_accumulation_benefit']
      else
        self.guaranteed_accumulation_benefit = 0.0
      end

      if attributes.has_key?(:'end_date')
        self.end_date = attributes[:'end_date']
      end

      if attributes.has_key?(:'tax_rate')
        self.tax_rate = attributes[:'tax_rate']
      else
        self.tax_rate = 0.0
      end

      if attributes.has_key?(:'start_date')
        self.start_date = attributes[:'start_date']
      end

      if attributes.has_key?(:'remove_outliers')
        self.remove_outliers = attributes[:'remove_outliers']
      else
        self.remove_outliers = false
      end

      if attributes.has_key?(:'portfolio_weights')
        if (value = attributes[:'portfolio_weights']).is_a?(Array)
          self.portfolio_weights = value
        end
      end

      if attributes.has_key?(:'portfolio_id')
        self.portfolio_id = attributes[:'portfolio_id']
      end

      if attributes.has_key?(:'result_type')
        self.result_type = attributes[:'result_type']
      else
        self.result_type = 'median'
      end

      if attributes.has_key?(:'account_id')
        self.account_id = attributes[:'account_id']
      end

      if attributes.has_key?(:'trading_days_per_year')
        self.trading_days_per_year = attributes[:'trading_days_per_year']
      else
        self.trading_days_per_year = 252
      end

      if attributes.has_key?(:'use_proxy_data')
        self.use_proxy_data = attributes[:'use_proxy_data']
      else
        self.use_proxy_data = false
      end

      if attributes.has_key?(:'initial_balance')
        self.initial_balance = attributes[:'initial_balance']
      else
        self.initial_balance = 0.0
      end

      if attributes.has_key?(:'market_data_source')
        self.market_data_source = attributes[:'market_data_source']
      else
        self.market_data_source = 'nucleus'
      end

      if attributes.has_key?(:'frequency_interval')
        self.frequency_interval = attributes[:'frequency_interval']
      else
        self.frequency_interval = 'year'
      end

      if attributes.has_key?(:'deposit_schedule')
        self.deposit_schedule = attributes[:'deposit_schedule']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@p.nil? && @p > 100
        invalid_properties.push('invalid value for "p", must be smaller than or equal to 100.')
      end

      if !@p.nil? && @p < 0
        invalid_properties.push('invalid value for "p", must be greater than or equal to 0.')
      end

      if @decumulation_horizon.nil?
        invalid_properties.push('invalid value for "decumulation_horizon", decumulation_horizon cannot be nil.')
      end

      if @decumulation_horizon < 1
        invalid_properties.push('invalid value for "decumulation_horizon", must be greater than or equal to 1.')
      end

      if @accumulation_horizon.nil?
        invalid_properties.push('invalid value for "accumulation_horizon", accumulation_horizon cannot be nil.')
      end

      if @accumulation_horizon < 0
        invalid_properties.push('invalid value for "accumulation_horizon", must be greater than or equal to 0.')
      end

      if !@annuitization_rate.nil? && @annuitization_rate < -1
        invalid_properties.push('invalid value for "annuitization_rate", must be greater than or equal to -1.')
      end

      if !@inflation_rate.nil? && @inflation_rate > 20
        invalid_properties.push('invalid value for "inflation_rate", must be smaller than or equal to 20.')
      end

      if !@inflation_rate.nil? && @inflation_rate < -1
        invalid_properties.push('invalid value for "inflation_rate", must be greater than or equal to -1.')
      end

      if !@n.nil? && @n < 1
        invalid_properties.push('invalid value for "n", must be greater than or equal to 1.')
      end

      if !@guaranteed_accumulation_benefit.nil? && @guaranteed_accumulation_benefit < 0
        invalid_properties.push('invalid value for "guaranteed_accumulation_benefit", must be greater than or equal to 0.')
      end

      if !@tax_rate.nil? && @tax_rate > 1
        invalid_properties.push('invalid value for "tax_rate", must be smaller than or equal to 1.')
      end

      if !@tax_rate.nil? && @tax_rate < 0
        invalid_properties.push('invalid value for "tax_rate", must be greater than or equal to 0.')
      end

      if !@trading_days_per_year.nil? && @trading_days_per_year < 1
        invalid_properties.push('invalid value for "trading_days_per_year", must be greater than or equal to 1.')
      end

      if !@initial_balance.nil? && @initial_balance < 0
        invalid_properties.push('invalid value for "initial_balance", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@p.nil? && @p > 100
      return false if !@p.nil? && @p < 0
      return false if @decumulation_horizon.nil?
      return false if @decumulation_horizon < 1
      return false if @accumulation_horizon.nil?
      return false if @accumulation_horizon < 0
      return false if !@annuitization_rate.nil? && @annuitization_rate < -1
      return false if !@inflation_rate.nil? && @inflation_rate > 20
      return false if !@inflation_rate.nil? && @inflation_rate < -1
      return false if !@n.nil? && @n < 1
      return false if !@guaranteed_accumulation_benefit.nil? && @guaranteed_accumulation_benefit < 0
      return false if !@tax_rate.nil? && @tax_rate > 1
      return false if !@tax_rate.nil? && @tax_rate < 0
      result_type_validator = EnumAttributeValidator.new('String', ['mean', 'median', 'custom'])
      return false unless result_type_validator.valid?(@result_type)
      return false if !@trading_days_per_year.nil? && @trading_days_per_year < 1
      return false if !@initial_balance.nil? && @initial_balance < 0
      market_data_source_validator = EnumAttributeValidator.new('String', ['nucleus', 'integration'])
      return false unless market_data_source_validator.valid?(@market_data_source)
      frequency_interval_validator = EnumAttributeValidator.new('String', ['year', 'quarter', 'month', 'week', 'day'])
      return false unless frequency_interval_validator.valid?(@frequency_interval)
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] p Value to be assigned
    def p=(p)
      if !p.nil? && p > 100
        fail ArgumentError, 'invalid value for "p", must be smaller than or equal to 100.'
      end

      if !p.nil? && p < 0
        fail ArgumentError, 'invalid value for "p", must be greater than or equal to 0.'
      end

      @p = p
    end

    # Custom attribute writer method with validation
    # @param [Object] decumulation_horizon Value to be assigned
    def decumulation_horizon=(decumulation_horizon)
      if decumulation_horizon.nil?
        fail ArgumentError, 'decumulation_horizon cannot be nil'
      end

      if decumulation_horizon < 1
        fail ArgumentError, 'invalid value for "decumulation_horizon", must be greater than or equal to 1.'
      end

      @decumulation_horizon = decumulation_horizon
    end

    # Custom attribute writer method with validation
    # @param [Object] accumulation_horizon Value to be assigned
    def accumulation_horizon=(accumulation_horizon)
      if accumulation_horizon.nil?
        fail ArgumentError, 'accumulation_horizon cannot be nil'
      end

      if accumulation_horizon < 0
        fail ArgumentError, 'invalid value for "accumulation_horizon", must be greater than or equal to 0.'
      end

      @accumulation_horizon = accumulation_horizon
    end

    # Custom attribute writer method with validation
    # @param [Object] annuitization_rate Value to be assigned
    def annuitization_rate=(annuitization_rate)
      if !annuitization_rate.nil? && annuitization_rate < -1
        fail ArgumentError, 'invalid value for "annuitization_rate", must be greater than or equal to -1.'
      end

      @annuitization_rate = annuitization_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] inflation_rate Value to be assigned
    def inflation_rate=(inflation_rate)
      if !inflation_rate.nil? && inflation_rate > 20
        fail ArgumentError, 'invalid value for "inflation_rate", must be smaller than or equal to 20.'
      end

      if !inflation_rate.nil? && inflation_rate < -1
        fail ArgumentError, 'invalid value for "inflation_rate", must be greater than or equal to -1.'
      end

      @inflation_rate = inflation_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] n Value to be assigned
    def n=(n)
      if !n.nil? && n < 1
        fail ArgumentError, 'invalid value for "n", must be greater than or equal to 1.'
      end

      @n = n
    end

    # Custom attribute writer method with validation
    # @param [Object] guaranteed_accumulation_benefit Value to be assigned
    def guaranteed_accumulation_benefit=(guaranteed_accumulation_benefit)
      if !guaranteed_accumulation_benefit.nil? && guaranteed_accumulation_benefit < 0
        fail ArgumentError, 'invalid value for "guaranteed_accumulation_benefit", must be greater than or equal to 0.'
      end

      @guaranteed_accumulation_benefit = guaranteed_accumulation_benefit
    end

    # Custom attribute writer method with validation
    # @param [Object] tax_rate Value to be assigned
    def tax_rate=(tax_rate)
      if !tax_rate.nil? && tax_rate > 1
        fail ArgumentError, 'invalid value for "tax_rate", must be smaller than or equal to 1.'
      end

      if !tax_rate.nil? && tax_rate < 0
        fail ArgumentError, 'invalid value for "tax_rate", must be greater than or equal to 0.'
      end

      @tax_rate = tax_rate
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] result_type Object to be assigned
    def result_type=(result_type)
      validator = EnumAttributeValidator.new('String', ['mean', 'median', 'custom'])
      unless validator.valid?(result_type)
        fail ArgumentError, 'invalid value for "result_type", must be one of #{validator.allowable_values}.'
      end
      @result_type = result_type
    end

    # Custom attribute writer method with validation
    # @param [Object] trading_days_per_year Value to be assigned
    def trading_days_per_year=(trading_days_per_year)
      if !trading_days_per_year.nil? && trading_days_per_year < 1
        fail ArgumentError, 'invalid value for "trading_days_per_year", must be greater than or equal to 1.'
      end

      @trading_days_per_year = trading_days_per_year
    end

    # Custom attribute writer method with validation
    # @param [Object] initial_balance Value to be assigned
    def initial_balance=(initial_balance)
      if !initial_balance.nil? && initial_balance < 0
        fail ArgumentError, 'invalid value for "initial_balance", must be greater than or equal to 0.'
      end

      @initial_balance = initial_balance
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] market_data_source Object to be assigned
    def market_data_source=(market_data_source)
      validator = EnumAttributeValidator.new('String', ['nucleus', 'integration'])
      unless validator.valid?(market_data_source)
        fail ArgumentError, 'invalid value for "market_data_source", must be one of #{validator.allowable_values}.'
      end
      @market_data_source = market_data_source
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] frequency_interval Object to be assigned
    def frequency_interval=(frequency_interval)
      validator = EnumAttributeValidator.new('String', ['year', 'quarter', 'month', 'week', 'day'])
      unless validator.valid?(frequency_interval)
        fail ArgumentError, 'invalid value for "frequency_interval", must be one of #{validator.allowable_values}.'
      end
      @frequency_interval = frequency_interval
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          p == o.p &&
          allocation_id == o.allocation_id &&
          decumulation_horizon == o.decumulation_horizon &&
          accumulation_horizon == o.accumulation_horizon &&
          annuitization_rate == o.annuitization_rate &&
          guaranteed_rate_benefit == o.guaranteed_rate_benefit &&
          model_id == o.model_id &&
          portfolio_tickers == o.portfolio_tickers &&
          create_log == o.create_log &&
          inflation_rate == o.inflation_rate &&
          aggregation_account_id == o.aggregation_account_id &&
          n == o.n &&
          guaranteed_accumulation_benefit == o.guaranteed_accumulation_benefit &&
          end_date == o.end_date &&
          tax_rate == o.tax_rate &&
          start_date == o.start_date &&
          remove_outliers == o.remove_outliers &&
          portfolio_weights == o.portfolio_weights &&
          portfolio_id == o.portfolio_id &&
          result_type == o.result_type &&
          account_id == o.account_id &&
          trading_days_per_year == o.trading_days_per_year &&
          use_proxy_data == o.use_proxy_data &&
          initial_balance == o.initial_balance &&
          market_data_source == o.market_data_source &&
          frequency_interval == o.frequency_interval &&
          deposit_schedule == o.deposit_schedule
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [p, allocation_id, decumulation_horizon, accumulation_horizon, annuitization_rate, guaranteed_rate_benefit, model_id, portfolio_tickers, create_log, inflation_rate, aggregation_account_id, n, guaranteed_accumulation_benefit, end_date, tax_rate, start_date, remove_outliers, portfolio_weights, portfolio_id, result_type, account_id, trading_days_per_year, use_proxy_data, initial_balance, market_data_source, frequency_interval, deposit_schedule].hash
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
