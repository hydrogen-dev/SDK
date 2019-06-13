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
  class LifeInsuranceCalculator
    # The outstanding mortgage balance
    attr_accessor :mortgage_balance

    # Other outstanding debt
    attr_accessor :other_debt

    # The interest rate earned once the benefit amount is received
    attr_accessor :interest_rate

    # End-of-life expenses
    attr_accessor :end_of_life_expenses

    # Life insurance already held
    attr_accessor :existing_life_insurance

    # Liquid assets held
    attr_accessor :liquid_assets

    # The general inflation rate
    attr_accessor :general_inflation_rate

    # The inflation rate for education
    attr_accessor :education_inflation_rate

    # The tax rate applied to earnings from the interest rate
    attr_accessor :tax_rate

    # A parameter to round the benefit amount up to a configurable number of digits
    attr_accessor :benefit_amount_rounding

    # The margin of error to apply to the life insurance needed, before rounding
    attr_accessor :margin_of_error

    # Benefit information to provide for childrens' primary, secondary, and tertiary schooling
    attr_accessor :children_education_config

    # Information on replacement income for beneficiaries
    attr_accessor :income_config

    # Information on bequests for beneficiaries
    attr_accessor :beneficiary_bequest_config

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'mortgage_balance' => :'mortgage_balance',
        :'other_debt' => :'other_debt',
        :'interest_rate' => :'interest_rate',
        :'end_of_life_expenses' => :'end_of_life_expenses',
        :'existing_life_insurance' => :'existing_life_insurance',
        :'liquid_assets' => :'liquid_assets',
        :'general_inflation_rate' => :'general_inflation_rate',
        :'education_inflation_rate' => :'education_inflation_rate',
        :'tax_rate' => :'tax_rate',
        :'benefit_amount_rounding' => :'benefit_amount_rounding',
        :'margin_of_error' => :'margin_of_error',
        :'children_education_config' => :'children_education_config',
        :'income_config' => :'income_config',
        :'beneficiary_bequest_config' => :'beneficiary_bequest_config'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'mortgage_balance' => :'Float',
        :'other_debt' => :'Float',
        :'interest_rate' => :'Float',
        :'end_of_life_expenses' => :'Float',
        :'existing_life_insurance' => :'Float',
        :'liquid_assets' => :'Float',
        :'general_inflation_rate' => :'Float',
        :'education_inflation_rate' => :'Float',
        :'tax_rate' => :'Float',
        :'benefit_amount_rounding' => :'Float',
        :'margin_of_error' => :'Float',
        :'children_education_config' => :'Array<ChildrenEducationConfig>',
        :'income_config' => :'Array<IncomeConfig>',
        :'beneficiary_bequest_config' => :'Array<BeneficiaryBequestConfig>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'mortgage_balance')
        self.mortgage_balance = attributes[:'mortgage_balance']
      end

      if attributes.has_key?(:'other_debt')
        self.other_debt = attributes[:'other_debt']
      end

      if attributes.has_key?(:'interest_rate')
        self.interest_rate = attributes[:'interest_rate']
      end

      if attributes.has_key?(:'end_of_life_expenses')
        self.end_of_life_expenses = attributes[:'end_of_life_expenses']
      end

      if attributes.has_key?(:'existing_life_insurance')
        self.existing_life_insurance = attributes[:'existing_life_insurance']
      end

      if attributes.has_key?(:'liquid_assets')
        self.liquid_assets = attributes[:'liquid_assets']
      end

      if attributes.has_key?(:'general_inflation_rate')
        self.general_inflation_rate = attributes[:'general_inflation_rate']
      end

      if attributes.has_key?(:'education_inflation_rate')
        self.education_inflation_rate = attributes[:'education_inflation_rate']
      end

      if attributes.has_key?(:'tax_rate')
        self.tax_rate = attributes[:'tax_rate']
      end

      if attributes.has_key?(:'benefit_amount_rounding')
        self.benefit_amount_rounding = attributes[:'benefit_amount_rounding']
      end

      if attributes.has_key?(:'margin_of_error')
        self.margin_of_error = attributes[:'margin_of_error']
      end

      if attributes.has_key?(:'children_education_config')
        if (value = attributes[:'children_education_config']).is_a?(Array)
          self.children_education_config = value
        end
      end

      if attributes.has_key?(:'income_config')
        if (value = attributes[:'income_config']).is_a?(Array)
          self.income_config = value
        end
      end

      if attributes.has_key?(:'beneficiary_bequest_config')
        if (value = attributes[:'beneficiary_bequest_config']).is_a?(Array)
          self.beneficiary_bequest_config = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @mortgage_balance.nil?
        invalid_properties.push('invalid value for "mortgage_balance", mortgage_balance cannot be nil.')
      end

      if @mortgage_balance < 0
        invalid_properties.push('invalid value for "mortgage_balance", must be greater than or equal to 0.')
      end

      if @other_debt.nil?
        invalid_properties.push('invalid value for "other_debt", other_debt cannot be nil.')
      end

      if @other_debt < 0
        invalid_properties.push('invalid value for "other_debt", must be greater than or equal to 0.')
      end

      if @interest_rate.nil?
        invalid_properties.push('invalid value for "interest_rate", interest_rate cannot be nil.')
      end

      if @interest_rate <= -1
        invalid_properties.push('invalid value for "interest_rate", must be greater than -1.')
      end

      if !@end_of_life_expenses.nil? && @end_of_life_expenses < 0
        invalid_properties.push('invalid value for "end_of_life_expenses", must be greater than or equal to 0.')
      end

      if !@existing_life_insurance.nil? && @existing_life_insurance <= 0
        invalid_properties.push('invalid value for "existing_life_insurance", must be greater than 0.')
      end

      if !@liquid_assets.nil? && @liquid_assets < 0
        invalid_properties.push('invalid value for "liquid_assets", must be greater than or equal to 0.')
      end

      if !@general_inflation_rate.nil? && @general_inflation_rate >= 20
        invalid_properties.push('invalid value for "general_inflation_rate", must be smaller than 20.')
      end

      if !@general_inflation_rate.nil? && @general_inflation_rate <= -1
        invalid_properties.push('invalid value for "general_inflation_rate", must be greater than -1.')
      end

      if !@education_inflation_rate.nil? && @education_inflation_rate >= 20
        invalid_properties.push('invalid value for "education_inflation_rate", must be smaller than 20.')
      end

      if !@education_inflation_rate.nil? && @education_inflation_rate <= -1
        invalid_properties.push('invalid value for "education_inflation_rate", must be greater than -1.')
      end

      if !@tax_rate.nil? && @tax_rate >= 1
        invalid_properties.push('invalid value for "tax_rate", must be smaller than 1.')
      end

      if !@tax_rate.nil? && @tax_rate < 0
        invalid_properties.push('invalid value for "tax_rate", must be greater than or equal to 0.')
      end

      if !@benefit_amount_rounding.nil? && @benefit_amount_rounding >= 12
        invalid_properties.push('invalid value for "benefit_amount_rounding", must be smaller than 12.')
      end

      if !@benefit_amount_rounding.nil? && @benefit_amount_rounding <= 0
        invalid_properties.push('invalid value for "benefit_amount_rounding", must be greater than 0.')
      end

      if !@margin_of_error.nil? && @margin_of_error < 0
        invalid_properties.push('invalid value for "margin_of_error", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @mortgage_balance.nil?
      return false if @mortgage_balance < 0
      return false if @other_debt.nil?
      return false if @other_debt < 0
      return false if @interest_rate.nil?
      return false if @interest_rate <= -1
      return false if !@end_of_life_expenses.nil? && @end_of_life_expenses < 0
      return false if !@existing_life_insurance.nil? && @existing_life_insurance <= 0
      return false if !@liquid_assets.nil? && @liquid_assets < 0
      return false if !@general_inflation_rate.nil? && @general_inflation_rate >= 20
      return false if !@general_inflation_rate.nil? && @general_inflation_rate <= -1
      return false if !@education_inflation_rate.nil? && @education_inflation_rate >= 20
      return false if !@education_inflation_rate.nil? && @education_inflation_rate <= -1
      return false if !@tax_rate.nil? && @tax_rate >= 1
      return false if !@tax_rate.nil? && @tax_rate < 0
      return false if !@benefit_amount_rounding.nil? && @benefit_amount_rounding >= 12
      return false if !@benefit_amount_rounding.nil? && @benefit_amount_rounding <= 0
      return false if !@margin_of_error.nil? && @margin_of_error < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] mortgage_balance Value to be assigned
    def mortgage_balance=(mortgage_balance)
      if mortgage_balance.nil?
        fail ArgumentError, 'mortgage_balance cannot be nil'
      end

      if mortgage_balance < 0
        fail ArgumentError, 'invalid value for "mortgage_balance", must be greater than or equal to 0.'
      end

      @mortgage_balance = mortgage_balance
    end

    # Custom attribute writer method with validation
    # @param [Object] other_debt Value to be assigned
    def other_debt=(other_debt)
      if other_debt.nil?
        fail ArgumentError, 'other_debt cannot be nil'
      end

      if other_debt < 0
        fail ArgumentError, 'invalid value for "other_debt", must be greater than or equal to 0.'
      end

      @other_debt = other_debt
    end

    # Custom attribute writer method with validation
    # @param [Object] interest_rate Value to be assigned
    def interest_rate=(interest_rate)
      if interest_rate.nil?
        fail ArgumentError, 'interest_rate cannot be nil'
      end

      if interest_rate <= -1
        fail ArgumentError, 'invalid value for "interest_rate", must be greater than -1.'
      end

      @interest_rate = interest_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] end_of_life_expenses Value to be assigned
    def end_of_life_expenses=(end_of_life_expenses)
      if !end_of_life_expenses.nil? && end_of_life_expenses < 0
        fail ArgumentError, 'invalid value for "end_of_life_expenses", must be greater than or equal to 0.'
      end

      @end_of_life_expenses = end_of_life_expenses
    end

    # Custom attribute writer method with validation
    # @param [Object] existing_life_insurance Value to be assigned
    def existing_life_insurance=(existing_life_insurance)
      if !existing_life_insurance.nil? && existing_life_insurance <= 0
        fail ArgumentError, 'invalid value for "existing_life_insurance", must be greater than 0.'
      end

      @existing_life_insurance = existing_life_insurance
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
    # @param [Object] general_inflation_rate Value to be assigned
    def general_inflation_rate=(general_inflation_rate)
      if !general_inflation_rate.nil? && general_inflation_rate >= 20
        fail ArgumentError, 'invalid value for "general_inflation_rate", must be smaller than 20.'
      end

      if !general_inflation_rate.nil? && general_inflation_rate <= -1
        fail ArgumentError, 'invalid value for "general_inflation_rate", must be greater than -1.'
      end

      @general_inflation_rate = general_inflation_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] education_inflation_rate Value to be assigned
    def education_inflation_rate=(education_inflation_rate)
      if !education_inflation_rate.nil? && education_inflation_rate >= 20
        fail ArgumentError, 'invalid value for "education_inflation_rate", must be smaller than 20.'
      end

      if !education_inflation_rate.nil? && education_inflation_rate <= -1
        fail ArgumentError, 'invalid value for "education_inflation_rate", must be greater than -1.'
      end

      @education_inflation_rate = education_inflation_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] tax_rate Value to be assigned
    def tax_rate=(tax_rate)
      if !tax_rate.nil? && tax_rate >= 1
        fail ArgumentError, 'invalid value for "tax_rate", must be smaller than 1.'
      end

      if !tax_rate.nil? && tax_rate < 0
        fail ArgumentError, 'invalid value for "tax_rate", must be greater than or equal to 0.'
      end

      @tax_rate = tax_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] benefit_amount_rounding Value to be assigned
    def benefit_amount_rounding=(benefit_amount_rounding)
      if !benefit_amount_rounding.nil? && benefit_amount_rounding >= 12
        fail ArgumentError, 'invalid value for "benefit_amount_rounding", must be smaller than 12.'
      end

      if !benefit_amount_rounding.nil? && benefit_amount_rounding <= 0
        fail ArgumentError, 'invalid value for "benefit_amount_rounding", must be greater than 0.'
      end

      @benefit_amount_rounding = benefit_amount_rounding
    end

    # Custom attribute writer method with validation
    # @param [Object] margin_of_error Value to be assigned
    def margin_of_error=(margin_of_error)
      if !margin_of_error.nil? && margin_of_error < 0
        fail ArgumentError, 'invalid value for "margin_of_error", must be greater than or equal to 0.'
      end

      @margin_of_error = margin_of_error
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          mortgage_balance == o.mortgage_balance &&
          other_debt == o.other_debt &&
          interest_rate == o.interest_rate &&
          end_of_life_expenses == o.end_of_life_expenses &&
          existing_life_insurance == o.existing_life_insurance &&
          liquid_assets == o.liquid_assets &&
          general_inflation_rate == o.general_inflation_rate &&
          education_inflation_rate == o.education_inflation_rate &&
          tax_rate == o.tax_rate &&
          benefit_amount_rounding == o.benefit_amount_rounding &&
          margin_of_error == o.margin_of_error &&
          children_education_config == o.children_education_config &&
          income_config == o.income_config &&
          beneficiary_bequest_config == o.beneficiary_bequest_config
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [mortgage_balance, other_debt, interest_rate, end_of_life_expenses, existing_life_insurance, liquid_assets, general_inflation_rate, education_inflation_rate, tax_rate, benefit_amount_rounding, margin_of_error, children_education_config, income_config, beneficiary_bequest_config].hash
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
