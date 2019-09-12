=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8-SNAPSHOT

=end

require 'date'

module AtomApi
  class VariableAnnuityReturnDetail
    # The investment earnings for this period. Earnings are calculated at the beginning of each period, before contributions are made.
    attr_accessor :period_earnings

    # The deposit made for this period.
    attr_accessor :period_contribution

    # The withdrawal made for this period.
    attr_accessor :period_withdrawal

    # The tax amount for this period.
    attr_accessor :period_taxes

    # The cumulative investment earnings made up to and including this period.
    attr_accessor :cumulative_earnings

    # The cumulative deposits made up to and including this period.
    attr_accessor :cumulative_contributions

    # The cumulative withdrawals made up to and including this period.
    attr_accessor :cumulative_withdrawals

    # The cumulative taxes up to and including this period.
    attr_accessor :cumulative_taxes

    # The ending balance, inclusive of earnings and contributions for the current period.
    attr_accessor :ending_balance

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'period_earnings' => :'period_earnings',
        :'period_contribution' => :'period_contribution',
        :'period_withdrawal' => :'period_withdrawal',
        :'period_taxes' => :'period_taxes',
        :'cumulative_earnings' => :'cumulative_earnings',
        :'cumulative_contributions' => :'cumulative_contributions',
        :'cumulative_withdrawals' => :'cumulative_withdrawals',
        :'cumulative_taxes' => :'cumulative_taxes',
        :'ending_balance' => :'ending_balance'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'period_earnings' => :'Float',
        :'period_contribution' => :'Float',
        :'period_withdrawal' => :'Float',
        :'period_taxes' => :'Float',
        :'cumulative_earnings' => :'Float',
        :'cumulative_contributions' => :'Float',
        :'cumulative_withdrawals' => :'Float',
        :'cumulative_taxes' => :'Float',
        :'ending_balance' => :'Float'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'period_earnings')
        self.period_earnings = attributes[:'period_earnings']
      end

      if attributes.has_key?(:'period_contribution')
        self.period_contribution = attributes[:'period_contribution']
      end

      if attributes.has_key?(:'period_withdrawal')
        self.period_withdrawal = attributes[:'period_withdrawal']
      end

      if attributes.has_key?(:'period_taxes')
        self.period_taxes = attributes[:'period_taxes']
      end

      if attributes.has_key?(:'cumulative_earnings')
        self.cumulative_earnings = attributes[:'cumulative_earnings']
      end

      if attributes.has_key?(:'cumulative_contributions')
        self.cumulative_contributions = attributes[:'cumulative_contributions']
      end

      if attributes.has_key?(:'cumulative_withdrawals')
        self.cumulative_withdrawals = attributes[:'cumulative_withdrawals']
      end

      if attributes.has_key?(:'cumulative_taxes')
        self.cumulative_taxes = attributes[:'cumulative_taxes']
      end

      if attributes.has_key?(:'ending_balance')
        self.ending_balance = attributes[:'ending_balance']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @period_earnings.nil?
        invalid_properties.push('invalid value for "period_earnings", period_earnings cannot be nil.')
      end

      if @period_earnings < 0
        invalid_properties.push('invalid value for "period_earnings", must be greater than or equal to 0.')
      end

      if @period_contribution.nil?
        invalid_properties.push('invalid value for "period_contribution", period_contribution cannot be nil.')
      end

      if @period_contribution < 0
        invalid_properties.push('invalid value for "period_contribution", must be greater than or equal to 0.')
      end

      if @period_withdrawal.nil?
        invalid_properties.push('invalid value for "period_withdrawal", period_withdrawal cannot be nil.')
      end

      if @period_withdrawal < 0
        invalid_properties.push('invalid value for "period_withdrawal", must be greater than or equal to 0.')
      end

      if @period_taxes.nil?
        invalid_properties.push('invalid value for "period_taxes", period_taxes cannot be nil.')
      end

      if @period_taxes < 0
        invalid_properties.push('invalid value for "period_taxes", must be greater than or equal to 0.')
      end

      if @cumulative_earnings.nil?
        invalid_properties.push('invalid value for "cumulative_earnings", cumulative_earnings cannot be nil.')
      end

      if @cumulative_earnings < 0
        invalid_properties.push('invalid value for "cumulative_earnings", must be greater than or equal to 0.')
      end

      if @cumulative_contributions.nil?
        invalid_properties.push('invalid value for "cumulative_contributions", cumulative_contributions cannot be nil.')
      end

      if @cumulative_contributions < 0
        invalid_properties.push('invalid value for "cumulative_contributions", must be greater than or equal to 0.')
      end

      if @cumulative_withdrawals.nil?
        invalid_properties.push('invalid value for "cumulative_withdrawals", cumulative_withdrawals cannot be nil.')
      end

      if @cumulative_withdrawals < 0
        invalid_properties.push('invalid value for "cumulative_withdrawals", must be greater than or equal to 0.')
      end

      if @cumulative_taxes.nil?
        invalid_properties.push('invalid value for "cumulative_taxes", cumulative_taxes cannot be nil.')
      end

      if @cumulative_taxes < 0
        invalid_properties.push('invalid value for "cumulative_taxes", must be greater than or equal to 0.')
      end

      if @ending_balance.nil?
        invalid_properties.push('invalid value for "ending_balance", ending_balance cannot be nil.')
      end

      if @ending_balance < 0
        invalid_properties.push('invalid value for "ending_balance", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @period_earnings.nil?
      return false if @period_earnings < 0
      return false if @period_contribution.nil?
      return false if @period_contribution < 0
      return false if @period_withdrawal.nil?
      return false if @period_withdrawal < 0
      return false if @period_taxes.nil?
      return false if @period_taxes < 0
      return false if @cumulative_earnings.nil?
      return false if @cumulative_earnings < 0
      return false if @cumulative_contributions.nil?
      return false if @cumulative_contributions < 0
      return false if @cumulative_withdrawals.nil?
      return false if @cumulative_withdrawals < 0
      return false if @cumulative_taxes.nil?
      return false if @cumulative_taxes < 0
      return false if @ending_balance.nil?
      return false if @ending_balance < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] period_earnings Value to be assigned
    def period_earnings=(period_earnings)
      if period_earnings.nil?
        fail ArgumentError, 'period_earnings cannot be nil'
      end

      if period_earnings < 0
        fail ArgumentError, 'invalid value for "period_earnings", must be greater than or equal to 0.'
      end

      @period_earnings = period_earnings
    end

    # Custom attribute writer method with validation
    # @param [Object] period_contribution Value to be assigned
    def period_contribution=(period_contribution)
      if period_contribution.nil?
        fail ArgumentError, 'period_contribution cannot be nil'
      end

      if period_contribution < 0
        fail ArgumentError, 'invalid value for "period_contribution", must be greater than or equal to 0.'
      end

      @period_contribution = period_contribution
    end

    # Custom attribute writer method with validation
    # @param [Object] period_withdrawal Value to be assigned
    def period_withdrawal=(period_withdrawal)
      if period_withdrawal.nil?
        fail ArgumentError, 'period_withdrawal cannot be nil'
      end

      if period_withdrawal < 0
        fail ArgumentError, 'invalid value for "period_withdrawal", must be greater than or equal to 0.'
      end

      @period_withdrawal = period_withdrawal
    end

    # Custom attribute writer method with validation
    # @param [Object] period_taxes Value to be assigned
    def period_taxes=(period_taxes)
      if period_taxes.nil?
        fail ArgumentError, 'period_taxes cannot be nil'
      end

      if period_taxes < 0
        fail ArgumentError, 'invalid value for "period_taxes", must be greater than or equal to 0.'
      end

      @period_taxes = period_taxes
    end

    # Custom attribute writer method with validation
    # @param [Object] cumulative_earnings Value to be assigned
    def cumulative_earnings=(cumulative_earnings)
      if cumulative_earnings.nil?
        fail ArgumentError, 'cumulative_earnings cannot be nil'
      end

      if cumulative_earnings < 0
        fail ArgumentError, 'invalid value for "cumulative_earnings", must be greater than or equal to 0.'
      end

      @cumulative_earnings = cumulative_earnings
    end

    # Custom attribute writer method with validation
    # @param [Object] cumulative_contributions Value to be assigned
    def cumulative_contributions=(cumulative_contributions)
      if cumulative_contributions.nil?
        fail ArgumentError, 'cumulative_contributions cannot be nil'
      end

      if cumulative_contributions < 0
        fail ArgumentError, 'invalid value for "cumulative_contributions", must be greater than or equal to 0.'
      end

      @cumulative_contributions = cumulative_contributions
    end

    # Custom attribute writer method with validation
    # @param [Object] cumulative_withdrawals Value to be assigned
    def cumulative_withdrawals=(cumulative_withdrawals)
      if cumulative_withdrawals.nil?
        fail ArgumentError, 'cumulative_withdrawals cannot be nil'
      end

      if cumulative_withdrawals < 0
        fail ArgumentError, 'invalid value for "cumulative_withdrawals", must be greater than or equal to 0.'
      end

      @cumulative_withdrawals = cumulative_withdrawals
    end

    # Custom attribute writer method with validation
    # @param [Object] cumulative_taxes Value to be assigned
    def cumulative_taxes=(cumulative_taxes)
      if cumulative_taxes.nil?
        fail ArgumentError, 'cumulative_taxes cannot be nil'
      end

      if cumulative_taxes < 0
        fail ArgumentError, 'invalid value for "cumulative_taxes", must be greater than or equal to 0.'
      end

      @cumulative_taxes = cumulative_taxes
    end

    # Custom attribute writer method with validation
    # @param [Object] ending_balance Value to be assigned
    def ending_balance=(ending_balance)
      if ending_balance.nil?
        fail ArgumentError, 'ending_balance cannot be nil'
      end

      if ending_balance < 0
        fail ArgumentError, 'invalid value for "ending_balance", must be greater than or equal to 0.'
      end

      @ending_balance = ending_balance
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          period_earnings == o.period_earnings &&
          period_contribution == o.period_contribution &&
          period_withdrawal == o.period_withdrawal &&
          period_taxes == o.period_taxes &&
          cumulative_earnings == o.cumulative_earnings &&
          cumulative_contributions == o.cumulative_contributions &&
          cumulative_withdrawals == o.cumulative_withdrawals &&
          cumulative_taxes == o.cumulative_taxes &&
          ending_balance == o.ending_balance
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [period_earnings, period_contribution, period_withdrawal, period_taxes, cumulative_earnings, cumulative_contributions, cumulative_withdrawals, cumulative_taxes, ending_balance].hash
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
