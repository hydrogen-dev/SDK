=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'date'

module ProtonApi
  class GoalAccumulationStatusRequest
    attr_accessor :recommendation_config

    attr_accessor :compounding_rate

    attr_accessor :recommend_type

    attr_accessor :create_log

    attr_accessor :goal_config

    attr_accessor :n

    attr_accessor :p_risk

    attr_accessor :remove_outliers

    attr_accessor :adjust_for_compounding

    attr_accessor :goal_id

    attr_accessor :conf_tgt

    attr_accessor :trading_days_per_year

    attr_accessor :thresh

    attr_accessor :withdrawal_tax

    attr_accessor :client_id

    attr_accessor :thresh_type

    attr_accessor :horizon_frequency

    attr_accessor :horizon

    attr_accessor :curr_inv

    attr_accessor :deposit_config

    attr_accessor :p_ret

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
        :'recommendation_config' => :'recommendation_config',
        :'compounding_rate' => :'compounding_rate',
        :'recommend_type' => :'recommend_type',
        :'create_log' => :'create_log',
        :'goal_config' => :'goal_config',
        :'n' => :'n',
        :'p_risk' => :'p_risk',
        :'remove_outliers' => :'remove_outliers',
        :'adjust_for_compounding' => :'adjust_for_compounding',
        :'goal_id' => :'goal_id',
        :'conf_tgt' => :'conf_tgt',
        :'trading_days_per_year' => :'trading_days_per_year',
        :'thresh' => :'thresh',
        :'withdrawal_tax' => :'withdrawal_tax',
        :'client_id' => :'client_id',
        :'thresh_type' => :'thresh_type',
        :'horizon_frequency' => :'horizon_frequency',
        :'horizon' => :'horizon',
        :'curr_inv' => :'curr_inv',
        :'deposit_config' => :'deposit_config',
        :'p_ret' => :'p_ret'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'recommendation_config' => :'RecommendationConfig',
        :'compounding_rate' => :'Float',
        :'recommend_type' => :'String',
        :'create_log' => :'BOOLEAN',
        :'goal_config' => :'GoalConfig',
        :'n' => :'Integer',
        :'p_risk' => :'Array<Float>',
        :'remove_outliers' => :'BOOLEAN',
        :'adjust_for_compounding' => :'BOOLEAN',
        :'goal_id' => :'String',
        :'conf_tgt' => :'Float',
        :'trading_days_per_year' => :'Integer',
        :'thresh' => :'Float',
        :'withdrawal_tax' => :'Float',
        :'client_id' => :'String',
        :'thresh_type' => :'String',
        :'horizon_frequency' => :'String',
        :'horizon' => :'Integer',
        :'curr_inv' => :'Float',
        :'deposit_config' => :'Array<AccumulationGoalDepositConfig>',
        :'p_ret' => :'Array<Float>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'recommendation_config')
        self.recommendation_config = attributes[:'recommendation_config']
      end

      if attributes.has_key?(:'compounding_rate')
        self.compounding_rate = attributes[:'compounding_rate']
      else
        self.compounding_rate = 0.0
      end

      if attributes.has_key?(:'recommend_type')
        self.recommend_type = attributes[:'recommend_type']
      else
        self.recommend_type = 'horizon'
      end

      if attributes.has_key?(:'create_log')
        self.create_log = attributes[:'create_log']
      else
        self.create_log = false
      end

      if attributes.has_key?(:'goal_config')
        self.goal_config = attributes[:'goal_config']
      end

      if attributes.has_key?(:'n')
        self.n = attributes[:'n']
      else
        self.n = 1000
      end

      if attributes.has_key?(:'p_risk')
        if (value = attributes[:'p_risk']).is_a?(Array)
          self.p_risk = value
        end
      end

      if attributes.has_key?(:'remove_outliers')
        self.remove_outliers = attributes[:'remove_outliers']
      else
        self.remove_outliers = true
      end

      if attributes.has_key?(:'adjust_for_compounding')
        self.adjust_for_compounding = attributes[:'adjust_for_compounding']
      else
        self.adjust_for_compounding = false
      end

      if attributes.has_key?(:'goal_id')
        self.goal_id = attributes[:'goal_id']
      end

      if attributes.has_key?(:'conf_tgt')
        self.conf_tgt = attributes[:'conf_tgt']
      else
        self.conf_tgt = 0.9
      end

      if attributes.has_key?(:'trading_days_per_year')
        self.trading_days_per_year = attributes[:'trading_days_per_year']
      else
        self.trading_days_per_year = 252
      end

      if attributes.has_key?(:'thresh')
        self.thresh = attributes[:'thresh']
      end

      if attributes.has_key?(:'withdrawal_tax')
        self.withdrawal_tax = attributes[:'withdrawal_tax']
      else
        self.withdrawal_tax = 0.0
      end

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'thresh_type')
        self.thresh_type = attributes[:'thresh_type']
      else
        self.thresh_type = 'perc'
      end

      if attributes.has_key?(:'horizon_frequency')
        self.horizon_frequency = attributes[:'horizon_frequency']
      else
        self.horizon_frequency = 'year'
      end

      if attributes.has_key?(:'horizon')
        self.horizon = attributes[:'horizon']
      end

      if attributes.has_key?(:'curr_inv')
        self.curr_inv = attributes[:'curr_inv']
      end

      if attributes.has_key?(:'deposit_config')
        if (value = attributes[:'deposit_config']).is_a?(Array)
          self.deposit_config = value
        end
      end

      if attributes.has_key?(:'p_ret')
        if (value = attributes[:'p_ret']).is_a?(Array)
          self.p_ret = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@compounding_rate.nil? && @compounding_rate < -1
        invalid_properties.push('invalid value for "compounding_rate", must be greater than or equal to -1.')
      end

      if !@n.nil? && @n > 10000
        invalid_properties.push('invalid value for "n", must be smaller than or equal to 10000.')
      end

      if !@n.nil? && @n < 1
        invalid_properties.push('invalid value for "n", must be greater than or equal to 1.')
      end

      if @p_risk.nil?
        invalid_properties.push('invalid value for "p_risk", p_risk cannot be nil.')
      end

      if !@conf_tgt.nil? && @conf_tgt > 1
        invalid_properties.push('invalid value for "conf_tgt", must be smaller than or equal to 1.')
      end

      if !@conf_tgt.nil? && @conf_tgt < 0
        invalid_properties.push('invalid value for "conf_tgt", must be greater than or equal to 0.')
      end

      if !@trading_days_per_year.nil? && @trading_days_per_year > 365
        invalid_properties.push('invalid value for "trading_days_per_year", must be smaller than or equal to 365.')
      end

      if !@trading_days_per_year.nil? && @trading_days_per_year < 1
        invalid_properties.push('invalid value for "trading_days_per_year", must be greater than or equal to 1.')
      end

      if !@thresh.nil? && @thresh < 0
        invalid_properties.push('invalid value for "thresh", must be greater than or equal to 0.')
      end

      if !@withdrawal_tax.nil? && @withdrawal_tax > 1
        invalid_properties.push('invalid value for "withdrawal_tax", must be smaller than or equal to 1.')
      end

      if !@withdrawal_tax.nil? && @withdrawal_tax < 0
        invalid_properties.push('invalid value for "withdrawal_tax", must be greater than or equal to 0.')
      end

      if !@horizon.nil? && @horizon > 350
        invalid_properties.push('invalid value for "horizon", must be smaller than or equal to 350.')
      end

      if !@horizon.nil? && @horizon < 0
        invalid_properties.push('invalid value for "horizon", must be greater than or equal to 0.')
      end

      if !@curr_inv.nil? && @curr_inv < 0
        invalid_properties.push('invalid value for "curr_inv", must be greater than or equal to 0.')
      end

      if @p_ret.nil?
        invalid_properties.push('invalid value for "p_ret", p_ret cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@compounding_rate.nil? && @compounding_rate < -1
      recommend_type_validator = EnumAttributeValidator.new('String', ['recurring', 'one-time', 'combo', 'horizon'])
      return false unless recommend_type_validator.valid?(@recommend_type)
      return false if !@n.nil? && @n > 10000
      return false if !@n.nil? && @n < 1
      return false if @p_risk.nil?
      return false if !@conf_tgt.nil? && @conf_tgt > 1
      return false if !@conf_tgt.nil? && @conf_tgt < 0
      return false if !@trading_days_per_year.nil? && @trading_days_per_year > 365
      return false if !@trading_days_per_year.nil? && @trading_days_per_year < 1
      return false if !@thresh.nil? && @thresh < 0
      return false if !@withdrawal_tax.nil? && @withdrawal_tax > 1
      return false if !@withdrawal_tax.nil? && @withdrawal_tax < 0
      thresh_type_validator = EnumAttributeValidator.new('String', ['amnt', 'perc'])
      return false unless thresh_type_validator.valid?(@thresh_type)
      horizon_frequency_validator = EnumAttributeValidator.new('String', ['year', 'six_months', 'quarter', 'month', 'two_weeks', 'week', 'day'])
      return false unless horizon_frequency_validator.valid?(@horizon_frequency)
      return false if !@horizon.nil? && @horizon > 350
      return false if !@horizon.nil? && @horizon < 0
      return false if !@curr_inv.nil? && @curr_inv < 0
      return false if @p_ret.nil?
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] compounding_rate Value to be assigned
    def compounding_rate=(compounding_rate)
      if !compounding_rate.nil? && compounding_rate < -1
        fail ArgumentError, 'invalid value for "compounding_rate", must be greater than or equal to -1.'
      end

      @compounding_rate = compounding_rate
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] recommend_type Object to be assigned
    def recommend_type=(recommend_type)
      validator = EnumAttributeValidator.new('String', ['recurring', 'one-time', 'combo', 'horizon'])
      unless validator.valid?(recommend_type)
        fail ArgumentError, 'invalid value for "recommend_type", must be one of #{validator.allowable_values}.'
      end
      @recommend_type = recommend_type
    end

    # Custom attribute writer method with validation
    # @param [Object] n Value to be assigned
    def n=(n)
      if !n.nil? && n > 10000
        fail ArgumentError, 'invalid value for "n", must be smaller than or equal to 10000.'
      end

      if !n.nil? && n < 1
        fail ArgumentError, 'invalid value for "n", must be greater than or equal to 1.'
      end

      @n = n
    end

    # Custom attribute writer method with validation
    # @param [Object] conf_tgt Value to be assigned
    def conf_tgt=(conf_tgt)
      if !conf_tgt.nil? && conf_tgt > 1
        fail ArgumentError, 'invalid value for "conf_tgt", must be smaller than or equal to 1.'
      end

      if !conf_tgt.nil? && conf_tgt < 0
        fail ArgumentError, 'invalid value for "conf_tgt", must be greater than or equal to 0.'
      end

      @conf_tgt = conf_tgt
    end

    # Custom attribute writer method with validation
    # @param [Object] trading_days_per_year Value to be assigned
    def trading_days_per_year=(trading_days_per_year)
      if !trading_days_per_year.nil? && trading_days_per_year > 365
        fail ArgumentError, 'invalid value for "trading_days_per_year", must be smaller than or equal to 365.'
      end

      if !trading_days_per_year.nil? && trading_days_per_year < 1
        fail ArgumentError, 'invalid value for "trading_days_per_year", must be greater than or equal to 1.'
      end

      @trading_days_per_year = trading_days_per_year
    end

    # Custom attribute writer method with validation
    # @param [Object] thresh Value to be assigned
    def thresh=(thresh)
      if !thresh.nil? && thresh < 0
        fail ArgumentError, 'invalid value for "thresh", must be greater than or equal to 0.'
      end

      @thresh = thresh
    end

    # Custom attribute writer method with validation
    # @param [Object] withdrawal_tax Value to be assigned
    def withdrawal_tax=(withdrawal_tax)
      if !withdrawal_tax.nil? && withdrawal_tax > 1
        fail ArgumentError, 'invalid value for "withdrawal_tax", must be smaller than or equal to 1.'
      end

      if !withdrawal_tax.nil? && withdrawal_tax < 0
        fail ArgumentError, 'invalid value for "withdrawal_tax", must be greater than or equal to 0.'
      end

      @withdrawal_tax = withdrawal_tax
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] thresh_type Object to be assigned
    def thresh_type=(thresh_type)
      validator = EnumAttributeValidator.new('String', ['amnt', 'perc'])
      unless validator.valid?(thresh_type)
        fail ArgumentError, 'invalid value for "thresh_type", must be one of #{validator.allowable_values}.'
      end
      @thresh_type = thresh_type
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] horizon_frequency Object to be assigned
    def horizon_frequency=(horizon_frequency)
      validator = EnumAttributeValidator.new('String', ['year', 'six_months', 'quarter', 'month', 'two_weeks', 'week', 'day'])
      unless validator.valid?(horizon_frequency)
        fail ArgumentError, 'invalid value for "horizon_frequency", must be one of #{validator.allowable_values}.'
      end
      @horizon_frequency = horizon_frequency
    end

    # Custom attribute writer method with validation
    # @param [Object] horizon Value to be assigned
    def horizon=(horizon)
      if !horizon.nil? && horizon > 350
        fail ArgumentError, 'invalid value for "horizon", must be smaller than or equal to 350.'
      end

      if !horizon.nil? && horizon < 0
        fail ArgumentError, 'invalid value for "horizon", must be greater than or equal to 0.'
      end

      @horizon = horizon
    end

    # Custom attribute writer method with validation
    # @param [Object] curr_inv Value to be assigned
    def curr_inv=(curr_inv)
      if !curr_inv.nil? && curr_inv < 0
        fail ArgumentError, 'invalid value for "curr_inv", must be greater than or equal to 0.'
      end

      @curr_inv = curr_inv
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          recommendation_config == o.recommendation_config &&
          compounding_rate == o.compounding_rate &&
          recommend_type == o.recommend_type &&
          create_log == o.create_log &&
          goal_config == o.goal_config &&
          n == o.n &&
          p_risk == o.p_risk &&
          remove_outliers == o.remove_outliers &&
          adjust_for_compounding == o.adjust_for_compounding &&
          goal_id == o.goal_id &&
          conf_tgt == o.conf_tgt &&
          trading_days_per_year == o.trading_days_per_year &&
          thresh == o.thresh &&
          withdrawal_tax == o.withdrawal_tax &&
          client_id == o.client_id &&
          thresh_type == o.thresh_type &&
          horizon_frequency == o.horizon_frequency &&
          horizon == o.horizon &&
          curr_inv == o.curr_inv &&
          deposit_config == o.deposit_config &&
          p_ret == o.p_ret
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [recommendation_config, compounding_rate, recommend_type, create_log, goal_config, n, p_risk, remove_outliers, adjust_for_compounding, goal_id, conf_tgt, trading_days_per_year, thresh, withdrawal_tax, client_id, thresh_type, horizon_frequency, horizon, curr_inv, deposit_config, p_ret].hash
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
