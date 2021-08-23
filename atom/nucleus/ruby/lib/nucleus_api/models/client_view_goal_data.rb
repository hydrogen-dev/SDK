=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.4
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'date'

module NucleusApi
  class ClientViewGoalData
    attr_accessor :accounts

    attr_accessor :accumulation_horizon

    attr_accessor :decumulation_horizon

    attr_accessor :goal_amount

    attr_accessor :goal_asset_size_by_goal

    attr_accessor :goal_asset_size_by_goal_date

    attr_accessor :goal_category

    attr_accessor :goal_create_date

    attr_accessor :goal_id

    attr_accessor :goal_name

    attr_accessor :goal_type

    attr_accessor :goal_update_date

    attr_accessor :is_decumulation

    attr_accessor :portfolios

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'accounts' => :'accounts',
        :'accumulation_horizon' => :'accumulation_horizon',
        :'decumulation_horizon' => :'decumulation_horizon',
        :'goal_amount' => :'goal_amount',
        :'goal_asset_size_by_goal' => :'goal_asset_size_by_goal',
        :'goal_asset_size_by_goal_date' => :'goal_asset_size_by_goal_date',
        :'goal_category' => :'goal_category',
        :'goal_create_date' => :'goal_create_date',
        :'goal_id' => :'goal_id',
        :'goal_name' => :'goal_name',
        :'goal_type' => :'goal_type',
        :'goal_update_date' => :'goal_update_date',
        :'is_decumulation' => :'is_decumulation',
        :'portfolios' => :'portfolios'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'accounts' => :'Array<VAccountVO>',
        :'accumulation_horizon' => :'Float',
        :'decumulation_horizon' => :'Float',
        :'goal_amount' => :'Float',
        :'goal_asset_size_by_goal' => :'Float',
        :'goal_asset_size_by_goal_date' => :'Date',
        :'goal_category' => :'String',
        :'goal_create_date' => :'DateTime',
        :'goal_id' => :'String',
        :'goal_name' => :'String',
        :'goal_type' => :'String',
        :'goal_update_date' => :'DateTime',
        :'is_decumulation' => :'BOOLEAN',
        :'portfolios' => :'Array<VPortfolioVO>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'accounts')
        if (value = attributes[:'accounts']).is_a?(Array)
          self.accounts = value
        end
      end

      if attributes.has_key?(:'accumulation_horizon')
        self.accumulation_horizon = attributes[:'accumulation_horizon']
      end

      if attributes.has_key?(:'decumulation_horizon')
        self.decumulation_horizon = attributes[:'decumulation_horizon']
      end

      if attributes.has_key?(:'goal_amount')
        self.goal_amount = attributes[:'goal_amount']
      end

      if attributes.has_key?(:'goal_asset_size_by_goal')
        self.goal_asset_size_by_goal = attributes[:'goal_asset_size_by_goal']
      end

      if attributes.has_key?(:'goal_asset_size_by_goal_date')
        self.goal_asset_size_by_goal_date = attributes[:'goal_asset_size_by_goal_date']
      end

      if attributes.has_key?(:'goal_category')
        self.goal_category = attributes[:'goal_category']
      end

      if attributes.has_key?(:'goal_create_date')
        self.goal_create_date = attributes[:'goal_create_date']
      end

      if attributes.has_key?(:'goal_id')
        self.goal_id = attributes[:'goal_id']
      end

      if attributes.has_key?(:'goal_name')
        self.goal_name = attributes[:'goal_name']
      end

      if attributes.has_key?(:'goal_type')
        self.goal_type = attributes[:'goal_type']
      end

      if attributes.has_key?(:'goal_update_date')
        self.goal_update_date = attributes[:'goal_update_date']
      end

      if attributes.has_key?(:'is_decumulation')
        self.is_decumulation = attributes[:'is_decumulation']
      end

      if attributes.has_key?(:'portfolios')
        if (value = attributes[:'portfolios']).is_a?(Array)
          self.portfolios = value
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
          accounts == o.accounts &&
          accumulation_horizon == o.accumulation_horizon &&
          decumulation_horizon == o.decumulation_horizon &&
          goal_amount == o.goal_amount &&
          goal_asset_size_by_goal == o.goal_asset_size_by_goal &&
          goal_asset_size_by_goal_date == o.goal_asset_size_by_goal_date &&
          goal_category == o.goal_category &&
          goal_create_date == o.goal_create_date &&
          goal_id == o.goal_id &&
          goal_name == o.goal_name &&
          goal_type == o.goal_type &&
          goal_update_date == o.goal_update_date &&
          is_decumulation == o.is_decumulation &&
          portfolios == o.portfolios
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [accounts, accumulation_horizon, decumulation_horizon, goal_amount, goal_asset_size_by_goal, goal_asset_size_by_goal_date, goal_category, goal_create_date, goal_id, goal_name, goal_type, goal_update_date, is_decumulation, portfolios].hash
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
