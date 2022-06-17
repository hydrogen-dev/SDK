=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.2
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.21

=end

require 'date'

module ProtonApi
  class CardTransactionAuthorizationRequest
    attr_accessor :currency_code

    attr_accessor :memo

    attr_accessor :partial_auth

    attr_accessor :transaction_type

    attr_accessor :description

    attr_accessor :transaction_category_id

    attr_accessor :use_audit_log

    attr_accessor :merchant_category_code

    attr_accessor :card_id

    attr_accessor :transaction_category

    attr_accessor :cleanse_data

    attr_accessor :auth_type

    attr_accessor :mid

    attr_accessor :transaction_status_scope

    attr_accessor :location

    attr_accessor :merchant

    attr_accessor :amount

    attr_accessor :date

    attr_accessor :merchant_id

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'currency_code' => :'currency_code',
        :'memo' => :'memo',
        :'partial_auth' => :'partial_auth',
        :'transaction_type' => :'transaction_type',
        :'description' => :'description',
        :'transaction_category_id' => :'transaction_category_id',
        :'use_audit_log' => :'use_audit_log',
        :'merchant_category_code' => :'merchant_category_code',
        :'card_id' => :'card_id',
        :'transaction_category' => :'transaction_category',
        :'cleanse_data' => :'cleanse_data',
        :'auth_type' => :'auth_type',
        :'mid' => :'mid',
        :'transaction_status_scope' => :'transaction_status_scope',
        :'location' => :'location',
        :'merchant' => :'merchant',
        :'amount' => :'amount',
        :'date' => :'date',
        :'merchant_id' => :'merchant_id'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'currency_code' => :'String',
        :'memo' => :'String',
        :'partial_auth' => :'BOOLEAN',
        :'transaction_type' => :'String',
        :'description' => :'String',
        :'transaction_category_id' => :'String',
        :'use_audit_log' => :'BOOLEAN',
        :'merchant_category_code' => :'String',
        :'card_id' => :'String',
        :'transaction_category' => :'String',
        :'cleanse_data' => :'BOOLEAN',
        :'auth_type' => :'Array<String>',
        :'mid' => :'String',
        :'transaction_status_scope' => :'Array<String>',
        :'location' => :'Location',
        :'merchant' => :'String',
        :'amount' => :'Float',
        :'date' => :'DateTime',
        :'merchant_id' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'memo')
        self.memo = attributes[:'memo']
      else
        self.memo = 'null'
      end

      if attributes.has_key?(:'partial_auth')
        self.partial_auth = attributes[:'partial_auth']
      else
        self.partial_auth = false
      end

      if attributes.has_key?(:'transaction_type')
        self.transaction_type = attributes[:'transaction_type']
      end

      if attributes.has_key?(:'description')
        self.description = attributes[:'description']
      else
        self.description = 'null'
      end

      if attributes.has_key?(:'transaction_category_id')
        self.transaction_category_id = attributes[:'transaction_category_id']
      end

      if attributes.has_key?(:'use_audit_log')
        self.use_audit_log = attributes[:'use_audit_log']
      else
        self.use_audit_log = false
      end

      if attributes.has_key?(:'merchant_category_code')
        self.merchant_category_code = attributes[:'merchant_category_code']
      end

      if attributes.has_key?(:'card_id')
        self.card_id = attributes[:'card_id']
      end

      if attributes.has_key?(:'transaction_category')
        self.transaction_category = attributes[:'transaction_category']
      else
        self.transaction_category = 'null'
      end

      if attributes.has_key?(:'cleanse_data')
        self.cleanse_data = attributes[:'cleanse_data']
      else
        self.cleanse_data = false
      end

      if attributes.has_key?(:'auth_type')
        if (value = attributes[:'auth_type']).is_a?(Array)
          self.auth_type = value
        end
      end

      if attributes.has_key?(:'mid')
        self.mid = attributes[:'mid']
      else
        self.mid = 'null'
      end

      if attributes.has_key?(:'transaction_status_scope')
        if (value = attributes[:'transaction_status_scope']).is_a?(Array)
          self.transaction_status_scope = value
        end
      end

      if attributes.has_key?(:'location')
        self.location = attributes[:'location']
      end

      if attributes.has_key?(:'merchant')
        self.merchant = attributes[:'merchant']
      else
        self.merchant = 'null'
      end

      if attributes.has_key?(:'amount')
        self.amount = attributes[:'amount']
      end

      if attributes.has_key?(:'date')
        self.date = attributes[:'date']
      end

      if attributes.has_key?(:'merchant_id')
        self.merchant_id = attributes[:'merchant_id']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @currency_code.nil?
        invalid_properties.push('invalid value for "currency_code", currency_code cannot be nil.')
      end

      if @transaction_type.nil?
        invalid_properties.push('invalid value for "transaction_type", transaction_type cannot be nil.')
      end

      if @card_id.nil?
        invalid_properties.push('invalid value for "card_id", card_id cannot be nil.')
      end

      if @amount.nil?
        invalid_properties.push('invalid value for "amount", amount cannot be nil.')
      end

      if @date.nil?
        invalid_properties.push('invalid value for "date", date cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @currency_code.nil?
      return false if @transaction_type.nil?
      transaction_type_validator = EnumAttributeValidator.new('String', ['atm_withdrawal', 'purchase', 'other'])
      return false unless transaction_type_validator.valid?(@transaction_type)
      return false if @card_id.nil?
      return false if @amount.nil?
      return false if @date.nil?
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] transaction_type Object to be assigned
    def transaction_type=(transaction_type)
      validator = EnumAttributeValidator.new('String', ['atm_withdrawal', 'purchase', 'other'])
      unless validator.valid?(transaction_type)
        fail ArgumentError, 'invalid value for "transaction_type", must be one of #{validator.allowable_values}.'
      end
      @transaction_type = transaction_type
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          currency_code == o.currency_code &&
          memo == o.memo &&
          partial_auth == o.partial_auth &&
          transaction_type == o.transaction_type &&
          description == o.description &&
          transaction_category_id == o.transaction_category_id &&
          use_audit_log == o.use_audit_log &&
          merchant_category_code == o.merchant_category_code &&
          card_id == o.card_id &&
          transaction_category == o.transaction_category &&
          cleanse_data == o.cleanse_data &&
          auth_type == o.auth_type &&
          mid == o.mid &&
          transaction_status_scope == o.transaction_status_scope &&
          location == o.location &&
          merchant == o.merchant &&
          amount == o.amount &&
          date == o.date &&
          merchant_id == o.merchant_id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [currency_code, memo, partial_auth, transaction_type, description, transaction_category_id, use_audit_log, merchant_category_code, card_id, transaction_category, cleanse_data, auth_type, mid, transaction_status_scope, location, merchant, amount, date, merchant_id].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
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
        temp_model = ProtonApi.const_get(type).new
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
