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
  class WConfig
    attr_accessor :w_min_minor

    attr_accessor :w_min_major

    attr_accessor :cash_amount

    attr_accessor :w_max_major

    attr_accessor :w_max_minor

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'w_min_minor' => :'w_min_minor',
        :'w_min_major' => :'w_min_major',
        :'cash_amount' => :'cash_amount',
        :'w_max_major' => :'w_max_major',
        :'w_max_minor' => :'w_max_minor'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'w_min_minor' => :'Float',
        :'w_min_major' => :'Float',
        :'cash_amount' => :'Float',
        :'w_max_major' => :'Float',
        :'w_max_minor' => :'Float'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'w_min_minor')
        self.w_min_minor = attributes[:'w_min_minor']
      end

      if attributes.has_key?(:'w_min_major')
        self.w_min_major = attributes[:'w_min_major']
      end

      if attributes.has_key?(:'cash_amount')
        self.cash_amount = attributes[:'cash_amount']
      end

      if attributes.has_key?(:'w_max_major')
        self.w_max_major = attributes[:'w_max_major']
      end

      if attributes.has_key?(:'w_max_minor')
        self.w_max_minor = attributes[:'w_max_minor']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @w_min_minor.nil?
        invalid_properties.push('invalid value for "w_min_minor", w_min_minor cannot be nil.')
      end

      if @w_min_minor > 1
        invalid_properties.push('invalid value for "w_min_minor", must be smaller than or equal to 1.')
      end

      if @w_min_minor < 0
        invalid_properties.push('invalid value for "w_min_minor", must be greater than or equal to 0.')
      end

      if @w_min_major.nil?
        invalid_properties.push('invalid value for "w_min_major", w_min_major cannot be nil.')
      end

      if @w_min_major > 1
        invalid_properties.push('invalid value for "w_min_major", must be smaller than or equal to 1.')
      end

      if @w_min_major < 0
        invalid_properties.push('invalid value for "w_min_major", must be greater than or equal to 0.')
      end

      if @cash_amount.nil?
        invalid_properties.push('invalid value for "cash_amount", cash_amount cannot be nil.')
      end

      if @cash_amount > 1
        invalid_properties.push('invalid value for "cash_amount", must be smaller than or equal to 1.')
      end

      if @cash_amount < 0
        invalid_properties.push('invalid value for "cash_amount", must be greater than or equal to 0.')
      end

      if @w_max_major.nil?
        invalid_properties.push('invalid value for "w_max_major", w_max_major cannot be nil.')
      end

      if @w_max_major > 1
        invalid_properties.push('invalid value for "w_max_major", must be smaller than or equal to 1.')
      end

      if @w_max_major < 0
        invalid_properties.push('invalid value for "w_max_major", must be greater than or equal to 0.')
      end

      if @w_max_minor.nil?
        invalid_properties.push('invalid value for "w_max_minor", w_max_minor cannot be nil.')
      end

      if @w_max_minor > 1
        invalid_properties.push('invalid value for "w_max_minor", must be smaller than or equal to 1.')
      end

      if @w_max_minor < 0
        invalid_properties.push('invalid value for "w_max_minor", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @w_min_minor.nil?
      return false if @w_min_minor > 1
      return false if @w_min_minor < 0
      return false if @w_min_major.nil?
      return false if @w_min_major > 1
      return false if @w_min_major < 0
      return false if @cash_amount.nil?
      return false if @cash_amount > 1
      return false if @cash_amount < 0
      return false if @w_max_major.nil?
      return false if @w_max_major > 1
      return false if @w_max_major < 0
      return false if @w_max_minor.nil?
      return false if @w_max_minor > 1
      return false if @w_max_minor < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] w_min_minor Value to be assigned
    def w_min_minor=(w_min_minor)
      if w_min_minor.nil?
        fail ArgumentError, 'w_min_minor cannot be nil'
      end

      if w_min_minor > 1
        fail ArgumentError, 'invalid value for "w_min_minor", must be smaller than or equal to 1.'
      end

      if w_min_minor < 0
        fail ArgumentError, 'invalid value for "w_min_minor", must be greater than or equal to 0.'
      end

      @w_min_minor = w_min_minor
    end

    # Custom attribute writer method with validation
    # @param [Object] w_min_major Value to be assigned
    def w_min_major=(w_min_major)
      if w_min_major.nil?
        fail ArgumentError, 'w_min_major cannot be nil'
      end

      if w_min_major > 1
        fail ArgumentError, 'invalid value for "w_min_major", must be smaller than or equal to 1.'
      end

      if w_min_major < 0
        fail ArgumentError, 'invalid value for "w_min_major", must be greater than or equal to 0.'
      end

      @w_min_major = w_min_major
    end

    # Custom attribute writer method with validation
    # @param [Object] cash_amount Value to be assigned
    def cash_amount=(cash_amount)
      if cash_amount.nil?
        fail ArgumentError, 'cash_amount cannot be nil'
      end

      if cash_amount > 1
        fail ArgumentError, 'invalid value for "cash_amount", must be smaller than or equal to 1.'
      end

      if cash_amount < 0
        fail ArgumentError, 'invalid value for "cash_amount", must be greater than or equal to 0.'
      end

      @cash_amount = cash_amount
    end

    # Custom attribute writer method with validation
    # @param [Object] w_max_major Value to be assigned
    def w_max_major=(w_max_major)
      if w_max_major.nil?
        fail ArgumentError, 'w_max_major cannot be nil'
      end

      if w_max_major > 1
        fail ArgumentError, 'invalid value for "w_max_major", must be smaller than or equal to 1.'
      end

      if w_max_major < 0
        fail ArgumentError, 'invalid value for "w_max_major", must be greater than or equal to 0.'
      end

      @w_max_major = w_max_major
    end

    # Custom attribute writer method with validation
    # @param [Object] w_max_minor Value to be assigned
    def w_max_minor=(w_max_minor)
      if w_max_minor.nil?
        fail ArgumentError, 'w_max_minor cannot be nil'
      end

      if w_max_minor > 1
        fail ArgumentError, 'invalid value for "w_max_minor", must be smaller than or equal to 1.'
      end

      if w_max_minor < 0
        fail ArgumentError, 'invalid value for "w_max_minor", must be greater than or equal to 0.'
      end

      @w_max_minor = w_max_minor
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          w_min_minor == o.w_min_minor &&
          w_min_major == o.w_min_major &&
          cash_amount == o.cash_amount &&
          w_max_major == o.w_max_major &&
          w_max_minor == o.w_max_minor
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [w_min_minor, w_min_major, cash_amount, w_max_major, w_max_minor].hash
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
