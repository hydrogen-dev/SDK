=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.2-SNAPSHOT

=end

require 'date'

module AtomApi
  class SensitivityAnalysis
    # A list of symbols for securities in the portfolio
    attr_accessor :portfolio_tickers

    attr_accessor :portfolio_weights

    # Frequency interval for returns, change_duration, and lag
    attr_accessor :frequency_interval

    attr_accessor :sensitivity_factor

    # Start date of data
    attr_accessor :start_date

    # End date of data
    attr_accessor :end_date

    # Number of trading days per year, used in calculations
    attr_accessor :trading_days_per_year

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
        :'portfolio_tickers' => :'portfolio_tickers',
        :'portfolio_weights' => :'portfolio_weights',
        :'frequency_interval' => :'frequency_interval',
        :'sensitivity_factor' => :'sensitivity_factor',
        :'start_date' => :'start_date',
        :'end_date' => :'end_date',
        :'trading_days_per_year' => :'trading_days_per_year'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'portfolio_tickers' => :'Array<String>',
        :'portfolio_weights' => :'Array<Float>',
        :'frequency_interval' => :'String',
        :'sensitivity_factor' => :'Object',
        :'start_date' => :'Date',
        :'end_date' => :'Date',
        :'trading_days_per_year' => :'Integer'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'portfolio_tickers')
        if (value = attributes[:'portfolio_tickers']).is_a?(Array)
          self.portfolio_tickers = value
        end
      end

      if attributes.has_key?(:'portfolio_weights')
        if (value = attributes[:'portfolio_weights']).is_a?(Array)
          self.portfolio_weights = value
        end
      end

      if attributes.has_key?(:'frequency_interval')
        self.frequency_interval = attributes[:'frequency_interval']
      end

      if attributes.has_key?(:'sensitivity_factor')
        self.sensitivity_factor = attributes[:'sensitivity_factor']
      end

      if attributes.has_key?(:'start_date')
        self.start_date = attributes[:'start_date']
      end

      if attributes.has_key?(:'end_date')
        self.end_date = attributes[:'end_date']
      end

      if attributes.has_key?(:'trading_days_per_year')
        self.trading_days_per_year = attributes[:'trading_days_per_year']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @portfolio_tickers.nil?
        invalid_properties.push('invalid value for "portfolio_tickers", portfolio_tickers cannot be nil.')
      end

      if @portfolio_weights.nil?
        invalid_properties.push('invalid value for "portfolio_weights", portfolio_weights cannot be nil.')
      end

      if @frequency_interval.nil?
        invalid_properties.push('invalid value for "frequency_interval", frequency_interval cannot be nil.')
      end

      if @sensitivity_factor.nil?
        invalid_properties.push('invalid value for "sensitivity_factor", sensitivity_factor cannot be nil.')
      end

      if !@trading_days_per_year.nil? && @trading_days_per_year < 1
        invalid_properties.push('invalid value for "trading_days_per_year", must be greater than or equal to 1.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @portfolio_tickers.nil?
      return false if @portfolio_weights.nil?
      return false if @frequency_interval.nil?
      frequency_interval_validator = EnumAttributeValidator.new('String', ['year', 'quarter', 'month', 'week', 'day'])
      return false unless frequency_interval_validator.valid?(@frequency_interval)
      return false if @sensitivity_factor.nil?
      return false if !@trading_days_per_year.nil? && @trading_days_per_year < 1
      true
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

    # Custom attribute writer method with validation
    # @param [Object] trading_days_per_year Value to be assigned
    def trading_days_per_year=(trading_days_per_year)
      if !trading_days_per_year.nil? && trading_days_per_year < 1
        fail ArgumentError, 'invalid value for "trading_days_per_year", must be greater than or equal to 1.'
      end

      @trading_days_per_year = trading_days_per_year
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          portfolio_tickers == o.portfolio_tickers &&
          portfolio_weights == o.portfolio_weights &&
          frequency_interval == o.frequency_interval &&
          sensitivity_factor == o.sensitivity_factor &&
          start_date == o.start_date &&
          end_date == o.end_date &&
          trading_days_per_year == o.trading_days_per_year
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [portfolio_tickers, portfolio_weights, frequency_interval, sensitivity_factor, start_date, end_date, trading_days_per_year].hash
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