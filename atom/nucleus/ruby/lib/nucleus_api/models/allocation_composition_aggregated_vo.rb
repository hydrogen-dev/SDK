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
  class AllocationCompositionAggregatedVO
    attr_accessor :allocation_composition_create_date

    attr_accessor :allocation_composition_date

    attr_accessor :allocation_composition_id

    attr_accessor :allocation_composition_update_date

    attr_accessor :model_category

    attr_accessor :model_current_weight

    attr_accessor :model_description

    attr_accessor :model_holdings

    attr_accessor :model_id

    attr_accessor :model_name

    attr_accessor :model_secondary_id

    attr_accessor :model_strategic_weight

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'allocation_composition_create_date' => :'allocation_composition_create_date',
        :'allocation_composition_date' => :'allocation_composition_date',
        :'allocation_composition_id' => :'allocation_composition_id',
        :'allocation_composition_update_date' => :'allocation_composition_update_date',
        :'model_category' => :'model_category',
        :'model_current_weight' => :'model_current_weight',
        :'model_description' => :'model_description',
        :'model_holdings' => :'model_holdings',
        :'model_id' => :'model_id',
        :'model_name' => :'model_name',
        :'model_secondary_id' => :'model_secondary_id',
        :'model_strategic_weight' => :'model_strategic_weight'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'allocation_composition_create_date' => :'DateTime',
        :'allocation_composition_date' => :'Date',
        :'allocation_composition_id' => :'String',
        :'allocation_composition_update_date' => :'DateTime',
        :'model_category' => :'String',
        :'model_current_weight' => :'Float',
        :'model_description' => :'String',
        :'model_holdings' => :'Array<AllocationCompositionModelHoldingsVO>',
        :'model_id' => :'String',
        :'model_name' => :'String',
        :'model_secondary_id' => :'String',
        :'model_strategic_weight' => :'Float'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'allocation_composition_create_date')
        self.allocation_composition_create_date = attributes[:'allocation_composition_create_date']
      end

      if attributes.has_key?(:'allocation_composition_date')
        self.allocation_composition_date = attributes[:'allocation_composition_date']
      end

      if attributes.has_key?(:'allocation_composition_id')
        self.allocation_composition_id = attributes[:'allocation_composition_id']
      end

      if attributes.has_key?(:'allocation_composition_update_date')
        self.allocation_composition_update_date = attributes[:'allocation_composition_update_date']
      end

      if attributes.has_key?(:'model_category')
        self.model_category = attributes[:'model_category']
      end

      if attributes.has_key?(:'model_current_weight')
        self.model_current_weight = attributes[:'model_current_weight']
      end

      if attributes.has_key?(:'model_description')
        self.model_description = attributes[:'model_description']
      end

      if attributes.has_key?(:'model_holdings')
        if (value = attributes[:'model_holdings']).is_a?(Array)
          self.model_holdings = value
        end
      end

      if attributes.has_key?(:'model_id')
        self.model_id = attributes[:'model_id']
      end

      if attributes.has_key?(:'model_name')
        self.model_name = attributes[:'model_name']
      end

      if attributes.has_key?(:'model_secondary_id')
        self.model_secondary_id = attributes[:'model_secondary_id']
      end

      if attributes.has_key?(:'model_strategic_weight')
        self.model_strategic_weight = attributes[:'model_strategic_weight']
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
          allocation_composition_create_date == o.allocation_composition_create_date &&
          allocation_composition_date == o.allocation_composition_date &&
          allocation_composition_id == o.allocation_composition_id &&
          allocation_composition_update_date == o.allocation_composition_update_date &&
          model_category == o.model_category &&
          model_current_weight == o.model_current_weight &&
          model_description == o.model_description &&
          model_holdings == o.model_holdings &&
          model_id == o.model_id &&
          model_name == o.model_name &&
          model_secondary_id == o.model_secondary_id &&
          model_strategic_weight == o.model_strategic_weight
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [allocation_composition_create_date, allocation_composition_date, allocation_composition_id, allocation_composition_update_date, model_category, model_current_weight, model_description, model_holdings, model_id, model_name, model_secondary_id, model_strategic_weight].hash
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
