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
  class EducationCalculatorAnnualcostResponse
    # The total education cost per year that can be afforded, represented in today’s dollars.
    attr_accessor :total_annual_cost

    # The total education cost per year that can be afforded, represented in today's dollars.
    attr_accessor :total_annual_cost_adjusted

    # The projected balance at the end of accumulation_horizon.
    attr_accessor :projected_accumulation_savings

    # The total earnings generated over the horizon.
    attr_accessor :total_earnings

    # The total contributions added over the horizon.
    attr_accessor :total_contributions

    # The total cost of education over the decumulation horizon, represented in future dollars.
    attr_accessor :total_cost

    # The total taxes paid on withdrawals over decumulation_horizon.
    attr_accessor :total_taxes

    attr_accessor :return_details

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'total_annual_cost' => :'total_annual_cost',
        :'total_annual_cost_adjusted' => :'total_annual_cost_adjusted',
        :'projected_accumulation_savings' => :'projected_accumulation_savings',
        :'total_earnings' => :'total_earnings',
        :'total_contributions' => :'total_contributions',
        :'total_cost' => :'total_cost',
        :'total_taxes' => :'total_taxes',
        :'return_details' => :'return_details'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'total_annual_cost' => :'Float',
        :'total_annual_cost_adjusted' => :'Float',
        :'projected_accumulation_savings' => :'Float',
        :'total_earnings' => :'Float',
        :'total_contributions' => :'Float',
        :'total_cost' => :'Float',
        :'total_taxes' => :'Float',
        :'return_details' => :'Hash<String, EducationCalculatorReturnDetail>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'total_annual_cost')
        self.total_annual_cost = attributes[:'total_annual_cost']
      end

      if attributes.has_key?(:'total_annual_cost_adjusted')
        self.total_annual_cost_adjusted = attributes[:'total_annual_cost_adjusted']
      end

      if attributes.has_key?(:'projected_accumulation_savings')
        self.projected_accumulation_savings = attributes[:'projected_accumulation_savings']
      end

      if attributes.has_key?(:'total_earnings')
        self.total_earnings = attributes[:'total_earnings']
      end

      if attributes.has_key?(:'total_contributions')
        self.total_contributions = attributes[:'total_contributions']
      end

      if attributes.has_key?(:'total_cost')
        self.total_cost = attributes[:'total_cost']
      end

      if attributes.has_key?(:'total_taxes')
        self.total_taxes = attributes[:'total_taxes']
      end

      if attributes.has_key?(:'return_details')
        if (value = attributes[:'return_details']).is_a?(Hash)
          self.return_details = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @total_annual_cost.nil?
        invalid_properties.push('invalid value for "total_annual_cost", total_annual_cost cannot be nil.')
      end

      if @total_annual_cost < 0
        invalid_properties.push('invalid value for "total_annual_cost", must be greater than or equal to 0.')
      end

      if @total_annual_cost_adjusted.nil?
        invalid_properties.push('invalid value for "total_annual_cost_adjusted", total_annual_cost_adjusted cannot be nil.')
      end

      if @projected_accumulation_savings.nil?
        invalid_properties.push('invalid value for "projected_accumulation_savings", projected_accumulation_savings cannot be nil.')
      end

      if @total_earnings.nil?
        invalid_properties.push('invalid value for "total_earnings", total_earnings cannot be nil.')
      end

      if @total_contributions.nil?
        invalid_properties.push('invalid value for "total_contributions", total_contributions cannot be nil.')
      end

      if @total_cost.nil?
        invalid_properties.push('invalid value for "total_cost", total_cost cannot be nil.')
      end

      if @total_cost < 0
        invalid_properties.push('invalid value for "total_cost", must be greater than or equal to 0.')
      end

      if @total_taxes.nil?
        invalid_properties.push('invalid value for "total_taxes", total_taxes cannot be nil.')
      end

      if @return_details.nil?
        invalid_properties.push('invalid value for "return_details", return_details cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @total_annual_cost.nil?
      return false if @total_annual_cost < 0
      return false if @total_annual_cost_adjusted.nil?
      return false if @projected_accumulation_savings.nil?
      return false if @total_earnings.nil?
      return false if @total_contributions.nil?
      return false if @total_cost.nil?
      return false if @total_cost < 0
      return false if @total_taxes.nil?
      return false if @return_details.nil?
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] total_annual_cost Value to be assigned
    def total_annual_cost=(total_annual_cost)
      if total_annual_cost.nil?
        fail ArgumentError, 'total_annual_cost cannot be nil'
      end

      if total_annual_cost < 0
        fail ArgumentError, 'invalid value for "total_annual_cost", must be greater than or equal to 0.'
      end

      @total_annual_cost = total_annual_cost
    end

    # Custom attribute writer method with validation
    # @param [Object] total_cost Value to be assigned
    def total_cost=(total_cost)
      if total_cost.nil?
        fail ArgumentError, 'total_cost cannot be nil'
      end

      if total_cost < 0
        fail ArgumentError, 'invalid value for "total_cost", must be greater than or equal to 0.'
      end

      @total_cost = total_cost
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          total_annual_cost == o.total_annual_cost &&
          total_annual_cost_adjusted == o.total_annual_cost_adjusted &&
          projected_accumulation_savings == o.projected_accumulation_savings &&
          total_earnings == o.total_earnings &&
          total_contributions == o.total_contributions &&
          total_cost == o.total_cost &&
          total_taxes == o.total_taxes &&
          return_details == o.return_details
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [total_annual_cost, total_annual_cost_adjusted, projected_accumulation_savings, total_earnings, total_contributions, total_cost, total_taxes, return_details].hash
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
