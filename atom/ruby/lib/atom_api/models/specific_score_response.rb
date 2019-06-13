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
  class SpecificScoreResponse
    # ID of the score
    attr_accessor :id

    # Datetime the score was created
    attr_accessor :create_date

    # The type of score. Values may be risk_score, dimensional_risk_score, diversification_score, portfolio_optimization_score, goal_achievement_score, and credit_score
    attr_accessor :score_type

    # The value of the score, which may be a number, a label, etc.
    attr_accessor :score_value

    # The ID of a client to which the score applies (if client-specific)
    attr_accessor :client_id

    # The ID of an account to which the score applies (if account-specific)
    attr_accessor :account_id

    # The ID of a portfolio to which the score applies (if portfolio-specific)
    attr_accessor :portfolio_id

    # The ID of a goal to which the score applies (if goal-specific)
    attr_accessor :goal_id

    # The ID of an allocation to which the score applies (if allocation-specific)
    attr_accessor :allocation_id

    # The ID of a model to which the score applies (if model-specific)
    attr_accessor :model_id

    # The ID of a benchmark to which the score applies (if benchmark-specific)
    attr_accessor :benchmark_id

    # The ID of a security to which the score applies (if security-specific)
    attr_accessor :security_id

    # Date and time for the score
    attr_accessor :score_time_stamp

    # Custom information associated with the score in the format key:value
    attr_accessor :metadata

    attr_accessor :secondary_id

    # Datetime the score was last updated
    attr_accessor :update_date

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
        :'id' => :'id',
        :'create_date' => :'create_date',
        :'score_type' => :'score_type',
        :'score_value' => :'score_value',
        :'client_id' => :'client_id',
        :'account_id' => :'account_id',
        :'portfolio_id' => :'portfolio_id',
        :'goal_id' => :'goal_id',
        :'allocation_id' => :'allocation_id',
        :'model_id' => :'model_id',
        :'benchmark_id' => :'benchmark_id',
        :'security_id' => :'security_id',
        :'score_time_stamp' => :'score_time_stamp',
        :'metadata' => :'metadata',
        :'secondary_id' => :'secondary_id',
        :'update_date' => :'update_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'id' => :'String',
        :'create_date' => :'String',
        :'score_type' => :'String',
        :'score_value' => :'String',
        :'client_id' => :'String',
        :'account_id' => :'String',
        :'portfolio_id' => :'String',
        :'goal_id' => :'String',
        :'allocation_id' => :'String',
        :'model_id' => :'String',
        :'benchmark_id' => :'String',
        :'security_id' => :'String',
        :'score_time_stamp' => :'String',
        :'metadata' => :'Object',
        :'secondary_id' => :'SecondaryId',
        :'update_date' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'score_type')
        self.score_type = attributes[:'score_type']
      end

      if attributes.has_key?(:'score_value')
        self.score_value = attributes[:'score_value']
      end

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'account_id')
        self.account_id = attributes[:'account_id']
      end

      if attributes.has_key?(:'portfolio_id')
        self.portfolio_id = attributes[:'portfolio_id']
      end

      if attributes.has_key?(:'goal_id')
        self.goal_id = attributes[:'goal_id']
      end

      if attributes.has_key?(:'allocation_id')
        self.allocation_id = attributes[:'allocation_id']
      end

      if attributes.has_key?(:'model_id')
        self.model_id = attributes[:'model_id']
      end

      if attributes.has_key?(:'benchmark_id')
        self.benchmark_id = attributes[:'benchmark_id']
      end

      if attributes.has_key?(:'security_id')
        self.security_id = attributes[:'security_id']
      end

      if attributes.has_key?(:'score_time_stamp')
        self.score_time_stamp = attributes[:'score_time_stamp']
      end

      if attributes.has_key?(:'metadata')
        self.metadata = attributes[:'metadata']
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
      if @score_type.nil?
        invalid_properties.push('invalid value for "score_type", score_type cannot be nil.')
      end

      if @score_value.nil?
        invalid_properties.push('invalid value for "score_value", score_value cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @score_type.nil?
      score_type_validator = EnumAttributeValidator.new('String', ['risk_score', 'dimensional_risk_score', 'diversification_score', 'portfolio_optimization_score', 'goal_achievement_score', 'credit_score'])
      return false unless score_type_validator.valid?(@score_type)
      return false if @score_value.nil?
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] score_type Object to be assigned
    def score_type=(score_type)
      validator = EnumAttributeValidator.new('String', ['risk_score', 'dimensional_risk_score', 'diversification_score', 'portfolio_optimization_score', 'goal_achievement_score', 'credit_score'])
      unless validator.valid?(score_type)
        fail ArgumentError, 'invalid value for "score_type", must be one of #{validator.allowable_values}.'
      end
      @score_type = score_type
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          create_date == o.create_date &&
          score_type == o.score_type &&
          score_value == o.score_value &&
          client_id == o.client_id &&
          account_id == o.account_id &&
          portfolio_id == o.portfolio_id &&
          goal_id == o.goal_id &&
          allocation_id == o.allocation_id &&
          model_id == o.model_id &&
          benchmark_id == o.benchmark_id &&
          security_id == o.security_id &&
          score_time_stamp == o.score_time_stamp &&
          metadata == o.metadata &&
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
      [id, create_date, score_type, score_value, client_id, account_id, portfolio_id, goal_id, allocation_id, model_id, benchmark_id, security_id, score_time_stamp, metadata, secondary_id, update_date].hash
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
