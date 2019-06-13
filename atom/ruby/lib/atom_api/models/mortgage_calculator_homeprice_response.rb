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
  class MortgageCalculatorHomepriceResponse
    # The total cost of the home that can be afforded, given the other inputs provided by the user.
    attr_accessor :home_price

    # The total mortgage payments made over mortgage_term.
    attr_accessor :total_payment

    # The total amount that went toward the mortgage principal.
    attr_accessor :total_principal

    # The total amount that went toward the mortgage interest.
    attr_accessor :total_interest

    # The total cost of the home, including down payment and all mortgage payments. The value is greater than home_price when interest_rate is greater than 0.
    attr_accessor :total_home_cost

    attr_accessor :schedule

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'home_price' => :'home_price',
        :'total_payment' => :'total_payment',
        :'total_principal' => :'total_principal',
        :'total_interest' => :'total_interest',
        :'total_home_cost' => :'total_home_cost',
        :'schedule' => :'schedule'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'home_price' => :'Float',
        :'total_payment' => :'Float',
        :'total_principal' => :'Float',
        :'total_interest' => :'Float',
        :'total_home_cost' => :'Float',
        :'schedule' => :'Hash<String, MortgageSchedulePeriod>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'home_price')
        self.home_price = attributes[:'home_price']
      end

      if attributes.has_key?(:'total_payment')
        self.total_payment = attributes[:'total_payment']
      end

      if attributes.has_key?(:'total_principal')
        self.total_principal = attributes[:'total_principal']
      end

      if attributes.has_key?(:'total_interest')
        self.total_interest = attributes[:'total_interest']
      end

      if attributes.has_key?(:'total_home_cost')
        self.total_home_cost = attributes[:'total_home_cost']
      end

      if attributes.has_key?(:'schedule')
        if (value = attributes[:'schedule']).is_a?(Hash)
          self.schedule = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @home_price.nil?
        invalid_properties.push('invalid value for "home_price", home_price cannot be nil.')
      end

      if @home_price < 0
        invalid_properties.push('invalid value for "home_price", must be greater than or equal to 0.')
      end

      if @total_payment.nil?
        invalid_properties.push('invalid value for "total_payment", total_payment cannot be nil.')
      end

      if @total_principal.nil?
        invalid_properties.push('invalid value for "total_principal", total_principal cannot be nil.')
      end

      if @total_interest.nil?
        invalid_properties.push('invalid value for "total_interest", total_interest cannot be nil.')
      end

      if @total_home_cost.nil?
        invalid_properties.push('invalid value for "total_home_cost", total_home_cost cannot be nil.')
      end

      if @schedule.nil?
        invalid_properties.push('invalid value for "schedule", schedule cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @home_price.nil?
      return false if @home_price < 0
      return false if @total_payment.nil?
      return false if @total_principal.nil?
      return false if @total_interest.nil?
      return false if @total_home_cost.nil?
      return false if @schedule.nil?
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] home_price Value to be assigned
    def home_price=(home_price)
      if home_price.nil?
        fail ArgumentError, 'home_price cannot be nil'
      end

      if home_price < 0
        fail ArgumentError, 'invalid value for "home_price", must be greater than or equal to 0.'
      end

      @home_price = home_price
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          home_price == o.home_price &&
          total_payment == o.total_payment &&
          total_principal == o.total_principal &&
          total_interest == o.total_interest &&
          total_home_cost == o.total_home_cost &&
          schedule == o.schedule
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [home_price, total_payment, total_principal, total_interest, total_home_cost, schedule].hash
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
