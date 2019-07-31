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
  class SpecificAggregationAccountTransactionResponse
    # ID of the aggregation account transaction
    attr_accessor :id

    # Datetime the aggregation account transaction was created
    attr_accessor :create_date

    # The ID of the aggregation account to which the transaction record belongs
    attr_accessor :aggregation_account_id

    # Alphabetic currency code for the currency of the transaction, limited to 3 characters
    attr_accessor :currency_code

    # The date the transaction took place
    attr_accessor :transaction_date

    attr_accessor :bank_credit

    attr_accessor :investment

    # Indicates if this transaction will be excluded from any spending or income analysis done in Proton tools. Defaults to “false” which indicates it will not be excluded from Proton analyses
    attr_accessor :is_excluded_analysis

    attr_accessor :secondary_id

    # Custom information associated with the aggregation account transaction in the format key:value
    attr_accessor :metadata

    # Datetime the aggregation account transaction was last updated
    attr_accessor :update_date

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'id' => :'id',
        :'create_date' => :'create_date',
        :'aggregation_account_id' => :'aggregation_account_id',
        :'currency_code' => :'currency_code',
        :'transaction_date' => :'transaction_date',
        :'bank_credit' => :'bank_credit',
        :'investment' => :'investment',
        :'is_excluded_analysis' => :'is_excluded_analysis',
        :'secondary_id' => :'secondary_id',
        :'metadata' => :'metadata',
        :'update_date' => :'update_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'id' => :'String',
        :'create_date' => :'String',
        :'aggregation_account_id' => :'String',
        :'currency_code' => :'String',
        :'transaction_date' => :'String',
        :'bank_credit' => :'AggregationAccountTransactionPayloadBankCredit',
        :'investment' => :'AggregationAccountTransactionPayloadInvestment',
        :'is_excluded_analysis' => :'BOOLEAN',
        :'secondary_id' => :'SecondaryId',
        :'metadata' => :'Object',
        :'update_date' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'aggregation_account_id')
        self.aggregation_account_id = attributes[:'aggregation_account_id']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'transaction_date')
        self.transaction_date = attributes[:'transaction_date']
      end

      if attributes.has_key?(:'bank_credit')
        self.bank_credit = attributes[:'bank_credit']
      end

      if attributes.has_key?(:'investment')
        self.investment = attributes[:'investment']
      end

      if attributes.has_key?(:'is_excluded_analysis')
        self.is_excluded_analysis = attributes[:'is_excluded_analysis']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'metadata')
        self.metadata = attributes[:'metadata']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @aggregation_account_id.nil?
        invalid_properties.push('invalid value for "aggregation_account_id", aggregation_account_id cannot be nil.')
      end

      if @currency_code.nil?
        invalid_properties.push('invalid value for "currency_code", currency_code cannot be nil.')
      end

      if @transaction_date.nil?
        invalid_properties.push('invalid value for "transaction_date", transaction_date cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @aggregation_account_id.nil?
      return false if @currency_code.nil?
      return false if @transaction_date.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          create_date == o.create_date &&
          aggregation_account_id == o.aggregation_account_id &&
          currency_code == o.currency_code &&
          transaction_date == o.transaction_date &&
          bank_credit == o.bank_credit &&
          investment == o.investment &&
          is_excluded_analysis == o.is_excluded_analysis &&
          secondary_id == o.secondary_id &&
          metadata == o.metadata &&
          update_date == o.update_date
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [id, create_date, aggregation_account_id, currency_code, transaction_date, bank_credit, investment, is_excluded_analysis, secondary_id, metadata, update_date].hash
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
