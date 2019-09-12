=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8-SNAPSHOT

=end

require 'date'

module AtomApi
  class PfloOptimizationScoreResponse
    attr_accessor :current_portfolio

    attr_accessor :optimized_portfolio

    # A score from 0 to 100 indicating the relative health of the current portfolio, 100 being the most optimal.
    attr_accessor :optimization_score

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'current_portfolio' => :'current_portfolio',
        :'optimized_portfolio' => :'optimized_portfolio',
        :'optimization_score' => :'optimization_score'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'current_portfolio' => :'OptScorePortfolio',
        :'optimized_portfolio' => :'OptScorePortfolio',
        :'optimization_score' => :'Integer'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'current_portfolio')
        self.current_portfolio = attributes[:'current_portfolio']
      end

      if attributes.has_key?(:'optimized_portfolio')
        self.optimized_portfolio = attributes[:'optimized_portfolio']
      end

      if attributes.has_key?(:'optimization_score')
        self.optimization_score = attributes[:'optimization_score']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @current_portfolio.nil?
        invalid_properties.push('invalid value for "current_portfolio", current_portfolio cannot be nil.')
      end

      if @optimized_portfolio.nil?
        invalid_properties.push('invalid value for "optimized_portfolio", optimized_portfolio cannot be nil.')
      end

      if @optimization_score.nil?
        invalid_properties.push('invalid value for "optimization_score", optimization_score cannot be nil.')
      end

      if @optimization_score > 100
        invalid_properties.push('invalid value for "optimization_score", must be smaller than or equal to 100.')
      end

      if @optimization_score < 0
        invalid_properties.push('invalid value for "optimization_score", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @current_portfolio.nil?
      return false if @optimized_portfolio.nil?
      return false if @optimization_score.nil?
      return false if @optimization_score > 100
      return false if @optimization_score < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] optimization_score Value to be assigned
    def optimization_score=(optimization_score)
      if optimization_score.nil?
        fail ArgumentError, 'optimization_score cannot be nil'
      end

      if optimization_score > 100
        fail ArgumentError, 'invalid value for "optimization_score", must be smaller than or equal to 100.'
      end

      if optimization_score < 0
        fail ArgumentError, 'invalid value for "optimization_score", must be greater than or equal to 0.'
      end

      @optimization_score = optimization_score
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          current_portfolio == o.current_portfolio &&
          optimized_portfolio == o.optimized_portfolio &&
          optimization_score == o.optimization_score
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [current_portfolio, optimized_portfolio, optimization_score].hash
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
