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
  class LifeInsuranceNeedsBreakdown
    # Insurance required to cover existing mortgage balance, paid immediately.
    attr_accessor :mortgage

    # Insurance required to cover other debt.
    attr_accessor :other

    # Insurance required to cover future education expenses.
    attr_accessor :education

    # Insurance required to cover loss of income.
    attr_accessor :income_replacement

    # Insurance required to cover amount being bequested.
    attr_accessor :beneficiary_bequest

    # Insurance required to cover end of life expenses.
    attr_accessor :end_of_life

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'mortgage' => :'mortgage',
        :'other' => :'other',
        :'education' => :'education',
        :'income_replacement' => :'income_replacement',
        :'beneficiary_bequest' => :'beneficiary_bequest',
        :'end_of_life' => :'end_of_life'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'mortgage' => :'Float',
        :'other' => :'Float',
        :'education' => :'Float',
        :'income_replacement' => :'Float',
        :'beneficiary_bequest' => :'Float',
        :'end_of_life' => :'Float'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'mortgage')
        self.mortgage = attributes[:'mortgage']
      end

      if attributes.has_key?(:'other')
        self.other = attributes[:'other']
      end

      if attributes.has_key?(:'education')
        self.education = attributes[:'education']
      end

      if attributes.has_key?(:'income_replacement')
        self.income_replacement = attributes[:'income_replacement']
      end

      if attributes.has_key?(:'beneficiary_bequest')
        self.beneficiary_bequest = attributes[:'beneficiary_bequest']
      end

      if attributes.has_key?(:'end_of_life')
        self.end_of_life = attributes[:'end_of_life']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @mortgage.nil?
        invalid_properties.push('invalid value for "mortgage", mortgage cannot be nil.')
      end

      if @mortgage < 0
        invalid_properties.push('invalid value for "mortgage", must be greater than or equal to 0.')
      end

      if @other.nil?
        invalid_properties.push('invalid value for "other", other cannot be nil.')
      end

      if @other < 0
        invalid_properties.push('invalid value for "other", must be greater than or equal to 0.')
      end

      if @education.nil?
        invalid_properties.push('invalid value for "education", education cannot be nil.')
      end

      if @education < 0
        invalid_properties.push('invalid value for "education", must be greater than or equal to 0.')
      end

      if @income_replacement.nil?
        invalid_properties.push('invalid value for "income_replacement", income_replacement cannot be nil.')
      end

      if @income_replacement < 0
        invalid_properties.push('invalid value for "income_replacement", must be greater than or equal to 0.')
      end

      if @beneficiary_bequest.nil?
        invalid_properties.push('invalid value for "beneficiary_bequest", beneficiary_bequest cannot be nil.')
      end

      if @beneficiary_bequest < 0
        invalid_properties.push('invalid value for "beneficiary_bequest", must be greater than or equal to 0.')
      end

      if @end_of_life.nil?
        invalid_properties.push('invalid value for "end_of_life", end_of_life cannot be nil.')
      end

      if @end_of_life < 0
        invalid_properties.push('invalid value for "end_of_life", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @mortgage.nil?
      return false if @mortgage < 0
      return false if @other.nil?
      return false if @other < 0
      return false if @education.nil?
      return false if @education < 0
      return false if @income_replacement.nil?
      return false if @income_replacement < 0
      return false if @beneficiary_bequest.nil?
      return false if @beneficiary_bequest < 0
      return false if @end_of_life.nil?
      return false if @end_of_life < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] mortgage Value to be assigned
    def mortgage=(mortgage)
      if mortgage.nil?
        fail ArgumentError, 'mortgage cannot be nil'
      end

      if mortgage < 0
        fail ArgumentError, 'invalid value for "mortgage", must be greater than or equal to 0.'
      end

      @mortgage = mortgage
    end

    # Custom attribute writer method with validation
    # @param [Object] other Value to be assigned
    def other=(other)
      if other.nil?
        fail ArgumentError, 'other cannot be nil'
      end

      if other < 0
        fail ArgumentError, 'invalid value for "other", must be greater than or equal to 0.'
      end

      @other = other
    end

    # Custom attribute writer method with validation
    # @param [Object] education Value to be assigned
    def education=(education)
      if education.nil?
        fail ArgumentError, 'education cannot be nil'
      end

      if education < 0
        fail ArgumentError, 'invalid value for "education", must be greater than or equal to 0.'
      end

      @education = education
    end

    # Custom attribute writer method with validation
    # @param [Object] income_replacement Value to be assigned
    def income_replacement=(income_replacement)
      if income_replacement.nil?
        fail ArgumentError, 'income_replacement cannot be nil'
      end

      if income_replacement < 0
        fail ArgumentError, 'invalid value for "income_replacement", must be greater than or equal to 0.'
      end

      @income_replacement = income_replacement
    end

    # Custom attribute writer method with validation
    # @param [Object] beneficiary_bequest Value to be assigned
    def beneficiary_bequest=(beneficiary_bequest)
      if beneficiary_bequest.nil?
        fail ArgumentError, 'beneficiary_bequest cannot be nil'
      end

      if beneficiary_bequest < 0
        fail ArgumentError, 'invalid value for "beneficiary_bequest", must be greater than or equal to 0.'
      end

      @beneficiary_bequest = beneficiary_bequest
    end

    # Custom attribute writer method with validation
    # @param [Object] end_of_life Value to be assigned
    def end_of_life=(end_of_life)
      if end_of_life.nil?
        fail ArgumentError, 'end_of_life cannot be nil'
      end

      if end_of_life < 0
        fail ArgumentError, 'invalid value for "end_of_life", must be greater than or equal to 0.'
      end

      @end_of_life = end_of_life
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          mortgage == o.mortgage &&
          other == o.other &&
          education == o.education &&
          income_replacement == o.income_replacement &&
          beneficiary_bequest == o.beneficiary_bequest &&
          end_of_life == o.end_of_life
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [mortgage, other, education, income_replacement, beneficiary_bequest, end_of_life].hash
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
