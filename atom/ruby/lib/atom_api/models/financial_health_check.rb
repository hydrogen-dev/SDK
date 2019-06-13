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
  class FinancialHealthCheck
    # Liquid assets
    attr_accessor :liquid_assets

    # Non-liquid assets
    attr_accessor :non_liquid_assets

    # Short-term liabilities
    attr_accessor :short_term_liabilities

    # Total liabilities
    attr_accessor :total_liabilities

    # Gross annual income
    attr_accessor :gross_annual_income

    # Net monthly income
    attr_accessor :net_monthly_income

    # Monthly expenses
    attr_accessor :monthly_expenses

    attr_accessor :ratio_targets

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'liquid_assets' => :'liquid_assets',
        :'non_liquid_assets' => :'non_liquid_assets',
        :'short_term_liabilities' => :'short_term_liabilities',
        :'total_liabilities' => :'total_liabilities',
        :'gross_annual_income' => :'gross_annual_income',
        :'net_monthly_income' => :'net_monthly_income',
        :'monthly_expenses' => :'monthly_expenses',
        :'ratio_targets' => :'ratio_targets'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'liquid_assets' => :'Float',
        :'non_liquid_assets' => :'Float',
        :'short_term_liabilities' => :'Float',
        :'total_liabilities' => :'Float',
        :'gross_annual_income' => :'Float',
        :'net_monthly_income' => :'Float',
        :'monthly_expenses' => :'Float',
        :'ratio_targets' => :'RatioTargets'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'liquid_assets')
        self.liquid_assets = attributes[:'liquid_assets']
      end

      if attributes.has_key?(:'non_liquid_assets')
        self.non_liquid_assets = attributes[:'non_liquid_assets']
      end

      if attributes.has_key?(:'short_term_liabilities')
        self.short_term_liabilities = attributes[:'short_term_liabilities']
      end

      if attributes.has_key?(:'total_liabilities')
        self.total_liabilities = attributes[:'total_liabilities']
      end

      if attributes.has_key?(:'gross_annual_income')
        self.gross_annual_income = attributes[:'gross_annual_income']
      end

      if attributes.has_key?(:'net_monthly_income')
        self.net_monthly_income = attributes[:'net_monthly_income']
      end

      if attributes.has_key?(:'monthly_expenses')
        self.monthly_expenses = attributes[:'monthly_expenses']
      end

      if attributes.has_key?(:'ratio_targets')
        self.ratio_targets = attributes[:'ratio_targets']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@liquid_assets.nil? && @liquid_assets < 0
        invalid_properties.push('invalid value for "liquid_assets", must be greater than or equal to 0.')
      end

      if !@non_liquid_assets.nil? && @non_liquid_assets < 0
        invalid_properties.push('invalid value for "non_liquid_assets", must be greater than or equal to 0.')
      end

      if !@short_term_liabilities.nil? && @short_term_liabilities < 0
        invalid_properties.push('invalid value for "short_term_liabilities", must be greater than or equal to 0.')
      end

      if !@total_liabilities.nil? && @total_liabilities < 0
        invalid_properties.push('invalid value for "total_liabilities", must be greater than or equal to 0.')
      end

      if !@gross_annual_income.nil? && @gross_annual_income < 0
        invalid_properties.push('invalid value for "gross_annual_income", must be greater than or equal to 0.')
      end

      if !@net_monthly_income.nil? && @net_monthly_income < 0
        invalid_properties.push('invalid value for "net_monthly_income", must be greater than or equal to 0.')
      end

      if !@monthly_expenses.nil? && @monthly_expenses < 0
        invalid_properties.push('invalid value for "monthly_expenses", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@liquid_assets.nil? && @liquid_assets < 0
      return false if !@non_liquid_assets.nil? && @non_liquid_assets < 0
      return false if !@short_term_liabilities.nil? && @short_term_liabilities < 0
      return false if !@total_liabilities.nil? && @total_liabilities < 0
      return false if !@gross_annual_income.nil? && @gross_annual_income < 0
      return false if !@net_monthly_income.nil? && @net_monthly_income < 0
      return false if !@monthly_expenses.nil? && @monthly_expenses < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] liquid_assets Value to be assigned
    def liquid_assets=(liquid_assets)
      if !liquid_assets.nil? && liquid_assets < 0
        fail ArgumentError, 'invalid value for "liquid_assets", must be greater than or equal to 0.'
      end

      @liquid_assets = liquid_assets
    end

    # Custom attribute writer method with validation
    # @param [Object] non_liquid_assets Value to be assigned
    def non_liquid_assets=(non_liquid_assets)
      if !non_liquid_assets.nil? && non_liquid_assets < 0
        fail ArgumentError, 'invalid value for "non_liquid_assets", must be greater than or equal to 0.'
      end

      @non_liquid_assets = non_liquid_assets
    end

    # Custom attribute writer method with validation
    # @param [Object] short_term_liabilities Value to be assigned
    def short_term_liabilities=(short_term_liabilities)
      if !short_term_liabilities.nil? && short_term_liabilities < 0
        fail ArgumentError, 'invalid value for "short_term_liabilities", must be greater than or equal to 0.'
      end

      @short_term_liabilities = short_term_liabilities
    end

    # Custom attribute writer method with validation
    # @param [Object] total_liabilities Value to be assigned
    def total_liabilities=(total_liabilities)
      if !total_liabilities.nil? && total_liabilities < 0
        fail ArgumentError, 'invalid value for "total_liabilities", must be greater than or equal to 0.'
      end

      @total_liabilities = total_liabilities
    end

    # Custom attribute writer method with validation
    # @param [Object] gross_annual_income Value to be assigned
    def gross_annual_income=(gross_annual_income)
      if !gross_annual_income.nil? && gross_annual_income < 0
        fail ArgumentError, 'invalid value for "gross_annual_income", must be greater than or equal to 0.'
      end

      @gross_annual_income = gross_annual_income
    end

    # Custom attribute writer method with validation
    # @param [Object] net_monthly_income Value to be assigned
    def net_monthly_income=(net_monthly_income)
      if !net_monthly_income.nil? && net_monthly_income < 0
        fail ArgumentError, 'invalid value for "net_monthly_income", must be greater than or equal to 0.'
      end

      @net_monthly_income = net_monthly_income
    end

    # Custom attribute writer method with validation
    # @param [Object] monthly_expenses Value to be assigned
    def monthly_expenses=(monthly_expenses)
      if !monthly_expenses.nil? && monthly_expenses < 0
        fail ArgumentError, 'invalid value for "monthly_expenses", must be greater than or equal to 0.'
      end

      @monthly_expenses = monthly_expenses
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          liquid_assets == o.liquid_assets &&
          non_liquid_assets == o.non_liquid_assets &&
          short_term_liabilities == o.short_term_liabilities &&
          total_liabilities == o.total_liabilities &&
          gross_annual_income == o.gross_annual_income &&
          net_monthly_income == o.net_monthly_income &&
          monthly_expenses == o.monthly_expenses &&
          ratio_targets == o.ratio_targets
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [liquid_assets, non_liquid_assets, short_term_liabilities, total_liabilities, gross_annual_income, net_monthly_income, monthly_expenses, ratio_targets].hash
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
