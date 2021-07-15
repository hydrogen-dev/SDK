=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.3
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'date'

module NucleusApi
  class SecurityPrice
    # Security adjusted price
    attr_accessor :adjusted_price

    attr_accessor :create_date

    # currency_code
    attr_accessor :currency_code

    # Security date
    attr_accessor :date

    # high
    attr_accessor :high

    attr_accessor :id

    # low
    attr_accessor :low

    # open
    attr_accessor :open

    # Security price
    attr_accessor :price

    attr_accessor :secondary_id

    # Security id
    attr_accessor :security_id

    attr_accessor :update_date

    # volume
    attr_accessor :volume

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'adjusted_price' => :'adjusted_price',
        :'create_date' => :'create_date',
        :'currency_code' => :'currency_code',
        :'date' => :'date',
        :'high' => :'high',
        :'id' => :'id',
        :'low' => :'low',
        :'open' => :'open',
        :'price' => :'price',
        :'secondary_id' => :'secondary_id',
        :'security_id' => :'security_id',
        :'update_date' => :'update_date',
        :'volume' => :'volume'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'adjusted_price' => :'Float',
        :'create_date' => :'DateTime',
        :'currency_code' => :'String',
        :'date' => :'DateTime',
        :'high' => :'Float',
        :'id' => :'String',
        :'low' => :'Float',
        :'open' => :'Float',
        :'price' => :'Float',
        :'secondary_id' => :'String',
        :'security_id' => :'String',
        :'update_date' => :'DateTime',
        :'volume' => :'Float'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'adjusted_price')
        self.adjusted_price = attributes[:'adjusted_price']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'date')
        self.date = attributes[:'date']
      end

      if attributes.has_key?(:'high')
        self.high = attributes[:'high']
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'low')
        self.low = attributes[:'low']
      end

      if attributes.has_key?(:'open')
        self.open = attributes[:'open']
      end

      if attributes.has_key?(:'price')
        self.price = attributes[:'price']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'security_id')
        self.security_id = attributes[:'security_id']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end

      if attributes.has_key?(:'volume')
        self.volume = attributes[:'volume']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @date.nil?
        invalid_properties.push('invalid value for "date", date cannot be nil.')
      end

      if @price.nil?
        invalid_properties.push('invalid value for "price", price cannot be nil.')
      end

      if @security_id.nil?
        invalid_properties.push('invalid value for "security_id", security_id cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @date.nil?
      return false if @price.nil?
      return false if @security_id.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          adjusted_price == o.adjusted_price &&
          create_date == o.create_date &&
          currency_code == o.currency_code &&
          date == o.date &&
          high == o.high &&
          id == o.id &&
          low == o.low &&
          open == o.open &&
          price == o.price &&
          secondary_id == o.secondary_id &&
          security_id == o.security_id &&
          update_date == o.update_date &&
          volume == o.volume
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [adjusted_price, create_date, currency_code, date, high, id, low, open, price, secondary_id, security_id, update_date, volume].hash
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
