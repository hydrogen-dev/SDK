=begin
#Hydrogen Molecule API

#The Hydrogen Molecule API

OpenAPI spec version: 1.0.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8-SNAPSHOT

=end

require 'date'

module MoleculeApi
  # The array of token restrictions applied on this token.
  class TokenRestrictionsPayload
    # Investors older than this age will be allowed to invest
    attr_accessor :min_age

    # Investors younger than this age will be allowed to invest
    attr_accessor :max_age

    # Investors with an annual income higher than this number will be allowed to invest
    attr_accessor :min_annual_income

    # Investors with an annual income lower than this number will be allowed to invest
    attr_accessor :max_annual_income

    # Investors with an household income higher than this number will be allowed to invest
    attr_accessor :min_household_income

    # Investors with an household income lower than this number will be allowed to invest
    attr_accessor :max_household_income

    # Investors with a net worth higher than this number will be allowed to invest
    attr_accessor :min_net_worth

    # Investors with a net worth lower than this number will be allowed to invest
    attr_accessor :max_net_worth

    # Investors with a credit score higher than this number will be allowed to invest
    attr_accessor :min_credit_score

    # Investors with a credit score lower than this number will be allowed to invest
    attr_accessor :max_credit_score

    # Only accredited investors will be allowed to invest
    attr_accessor :accreditation_required

    # Investors who are verified by a Know-Your-Customer vendor will be allowed to invest
    attr_accessor :kyc_required

    # Investors residing in these countries will be allowed to invest
    attr_accessor :include_country

    # Investors residing outside of these countries will be allowed to invest
    attr_accessor :exclude_country

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'min_age' => :'min_age',
        :'max_age' => :'max_age',
        :'min_annual_income' => :'min_annual_income',
        :'max_annual_income' => :'max_annual_income',
        :'min_household_income' => :'min_household_income',
        :'max_household_income' => :'max_household_income',
        :'min_net_worth' => :'min_net_worth',
        :'max_net_worth' => :'max_net_worth',
        :'min_credit_score' => :'min_credit_score',
        :'max_credit_score' => :'max_credit_score',
        :'accreditation_required' => :'accreditation_required',
        :'kyc_required' => :'kyc_required',
        :'include_country' => :'include_country',
        :'exclude_country' => :'exclude_country'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'min_age' => :'Float',
        :'max_age' => :'Float',
        :'min_annual_income' => :'Float',
        :'max_annual_income' => :'Float',
        :'min_household_income' => :'Float',
        :'max_household_income' => :'Float',
        :'min_net_worth' => :'Float',
        :'max_net_worth' => :'Float',
        :'min_credit_score' => :'Float',
        :'max_credit_score' => :'Float',
        :'accreditation_required' => :'BOOLEAN',
        :'kyc_required' => :'BOOLEAN',
        :'include_country' => :'Array<String>',
        :'exclude_country' => :'Array<String>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'min_age')
        self.min_age = attributes[:'min_age']
      end

      if attributes.has_key?(:'max_age')
        self.max_age = attributes[:'max_age']
      end

      if attributes.has_key?(:'min_annual_income')
        self.min_annual_income = attributes[:'min_annual_income']
      end

      if attributes.has_key?(:'max_annual_income')
        self.max_annual_income = attributes[:'max_annual_income']
      end

      if attributes.has_key?(:'min_household_income')
        self.min_household_income = attributes[:'min_household_income']
      end

      if attributes.has_key?(:'max_household_income')
        self.max_household_income = attributes[:'max_household_income']
      end

      if attributes.has_key?(:'min_net_worth')
        self.min_net_worth = attributes[:'min_net_worth']
      end

      if attributes.has_key?(:'max_net_worth')
        self.max_net_worth = attributes[:'max_net_worth']
      end

      if attributes.has_key?(:'min_credit_score')
        self.min_credit_score = attributes[:'min_credit_score']
      end

      if attributes.has_key?(:'max_credit_score')
        self.max_credit_score = attributes[:'max_credit_score']
      end

      if attributes.has_key?(:'accreditation_required')
        self.accreditation_required = attributes[:'accreditation_required']
      end

      if attributes.has_key?(:'kyc_required')
        self.kyc_required = attributes[:'kyc_required']
      end

      if attributes.has_key?(:'include_country')
        if (value = attributes[:'include_country']).is_a?(Array)
          self.include_country = value
        end
      end

      if attributes.has_key?(:'exclude_country')
        if (value = attributes[:'exclude_country']).is_a?(Array)
          self.exclude_country = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          min_age == o.min_age &&
          max_age == o.max_age &&
          min_annual_income == o.min_annual_income &&
          max_annual_income == o.max_annual_income &&
          min_household_income == o.min_household_income &&
          max_household_income == o.max_household_income &&
          min_net_worth == o.min_net_worth &&
          max_net_worth == o.max_net_worth &&
          min_credit_score == o.min_credit_score &&
          max_credit_score == o.max_credit_score &&
          accreditation_required == o.accreditation_required &&
          kyc_required == o.kyc_required &&
          include_country == o.include_country &&
          exclude_country == o.exclude_country
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [min_age, max_age, min_annual_income, max_annual_income, min_household_income, max_household_income, min_net_worth, max_net_worth, min_credit_score, max_credit_score, accreditation_required, kyc_required, include_country, exclude_country].hash
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
        temp_model = MoleculeApi.const_get(type).new
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
