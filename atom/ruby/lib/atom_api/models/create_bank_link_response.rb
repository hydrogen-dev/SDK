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
  class CreateBankLinkResponse
    # The ID for the account to which the bank link belongs
    attr_accessor :account_id

    # Name of the individual that owns the bank account
    attr_accessor :bank_account_holder

    # Account number of the bank account
    attr_accessor :bank_account_number

    # Name of the bank for the bank link, e.g. HSBC
    attr_accessor :name

    # Routing number of the bank for the bank link
    attr_accessor :routing

    # Routing number of the bank for the bank link used for wire transfers
    attr_accessor :routing_wire

    # Name of the bank account, e.g. Mike’s HSBC Checking
    attr_accessor :bank_account_name

    # Alphabetic currency code for the base currency of the bank account linked, limited to 3 characters
    attr_accessor :currency_code

    # Current balance of the bank account
    attr_accessor :balance

    # Available balance of the bank account, usually taking into consideration pending transactions or available overdraft
    attr_accessor :available_balance

    # Used to indicate the type of bank account for this bank link such as a ‘savings’ account
    attr_accessor :type

    # Indicates if the bank link is active. Defaults to true which indicates it is active
    attr_accessor :is_active

    # Indicates if the bank link has been verified. Defaults to false which indicates it has not been verified
    attr_accessor :is_link_verified

    # Date and time that the bank link was verified
    attr_accessor :link_verified_date

    # Custom information associated with the bank link in the format key:value
    attr_accessor :metadata

    attr_accessor :secondary_id

    # ID of the bank link
    attr_accessor :id

    # Datetime the bank link was created
    attr_accessor :create_date

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'account_id' => :'account_id',
        :'bank_account_holder' => :'bank_account_holder',
        :'bank_account_number' => :'bank_account_number',
        :'name' => :'name',
        :'routing' => :'routing',
        :'routing_wire' => :'routing_wire',
        :'bank_account_name' => :'bank_account_name',
        :'currency_code' => :'currency_code',
        :'balance' => :'balance',
        :'available_balance' => :'available_balance',
        :'type' => :'type',
        :'is_active' => :'is_active',
        :'is_link_verified' => :'is_link_verified',
        :'link_verified_date' => :'link_verified_date',
        :'metadata' => :'metadata',
        :'secondary_id' => :'secondary_id',
        :'id' => :'id',
        :'create_date' => :'create_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'account_id' => :'String',
        :'bank_account_holder' => :'String',
        :'bank_account_number' => :'String',
        :'name' => :'String',
        :'routing' => :'String',
        :'routing_wire' => :'String',
        :'bank_account_name' => :'String',
        :'currency_code' => :'String',
        :'balance' => :'String',
        :'available_balance' => :'String',
        :'type' => :'String',
        :'is_active' => :'BOOLEAN',
        :'is_link_verified' => :'BOOLEAN',
        :'link_verified_date' => :'Date',
        :'metadata' => :'Object',
        :'secondary_id' => :'SecondaryId',
        :'id' => :'String',
        :'create_date' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'account_id')
        self.account_id = attributes[:'account_id']
      end

      if attributes.has_key?(:'bank_account_holder')
        self.bank_account_holder = attributes[:'bank_account_holder']
      end

      if attributes.has_key?(:'bank_account_number')
        self.bank_account_number = attributes[:'bank_account_number']
      end

      if attributes.has_key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.has_key?(:'routing')
        self.routing = attributes[:'routing']
      end

      if attributes.has_key?(:'routing_wire')
        self.routing_wire = attributes[:'routing_wire']
      end

      if attributes.has_key?(:'bank_account_name')
        self.bank_account_name = attributes[:'bank_account_name']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'balance')
        self.balance = attributes[:'balance']
      end

      if attributes.has_key?(:'available_balance')
        self.available_balance = attributes[:'available_balance']
      end

      if attributes.has_key?(:'type')
        self.type = attributes[:'type']
      end

      if attributes.has_key?(:'is_active')
        self.is_active = attributes[:'is_active']
      else
        self.is_active = true
      end

      if attributes.has_key?(:'is_link_verified')
        self.is_link_verified = attributes[:'is_link_verified']
      else
        self.is_link_verified = false
      end

      if attributes.has_key?(:'link_verified_date')
        self.link_verified_date = attributes[:'link_verified_date']
      end

      if attributes.has_key?(:'metadata')
        self.metadata = attributes[:'metadata']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @account_id.nil?
        invalid_properties.push('invalid value for "account_id", account_id cannot be nil.')
      end

      if @bank_account_holder.nil?
        invalid_properties.push('invalid value for "bank_account_holder", bank_account_holder cannot be nil.')
      end

      if @bank_account_number.nil?
        invalid_properties.push('invalid value for "bank_account_number", bank_account_number cannot be nil.')
      end

      if @name.nil?
        invalid_properties.push('invalid value for "name", name cannot be nil.')
      end

      if @routing.nil?
        invalid_properties.push('invalid value for "routing", routing cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @account_id.nil?
      return false if @bank_account_holder.nil?
      return false if @bank_account_number.nil?
      return false if @name.nil?
      return false if @routing.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          account_id == o.account_id &&
          bank_account_holder == o.bank_account_holder &&
          bank_account_number == o.bank_account_number &&
          name == o.name &&
          routing == o.routing &&
          routing_wire == o.routing_wire &&
          bank_account_name == o.bank_account_name &&
          currency_code == o.currency_code &&
          balance == o.balance &&
          available_balance == o.available_balance &&
          type == o.type &&
          is_active == o.is_active &&
          is_link_verified == o.is_link_verified &&
          link_verified_date == o.link_verified_date &&
          metadata == o.metadata &&
          secondary_id == o.secondary_id &&
          id == o.id &&
          create_date == o.create_date
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [account_id, bank_account_holder, bank_account_number, name, routing, routing_wire, bank_account_name, currency_code, balance, available_balance, type, is_active, is_link_verified, link_verified_date, metadata, secondary_id, id, create_date].hash
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
