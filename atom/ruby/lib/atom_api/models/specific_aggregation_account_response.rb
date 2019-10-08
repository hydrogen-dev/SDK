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
  class SpecificAggregationAccountResponse
    # ID of the aggregation account
    attr_accessor :id

    # Datetime the aggregation account was created
    attr_accessor :create_date

    # The ID of a client to which the aggregation account belongs
    attr_accessor :client_id

    # The name of the held-away account for this aggregation account record
    attr_accessor :account_name

    # The name of the institution holding the held-away account for this aggregation account record
    attr_accessor :institution_name

    # Category for the held-away account such as “Bank Account”
    attr_accessor :category

    # Subcategory for the held-away account such as “Checking Account”
    attr_accessor :subcategory

    # The account number of the held-away account for this aggregation account record
    attr_accessor :account_number

    # The owner of the held-away account
    attr_accessor :account_holder

    # The masked version of the account number of the held-away account for this aggregation account record
    attr_accessor :mask

    # Alphabetic currency code for the base currency of the account linked, limited to 3 characters
    attr_accessor :currency_code

    # A flag to represent if this account is an asset or liability. Defaults to true which indicates it is an asset. If false this account is categorized as a liability
    attr_accessor :is_asset

    # ID of the financial offer this account matches. Useful so you don’t show clients offers for accounts they already have
    attr_accessor :financial_offer_id

    # Indicates if the aggregation account record is active. Defaults to true which indicates it is active
    attr_accessor :is_active

    # Custom information associated with the aggregation account in the format key:value
    attr_accessor :metadata

    attr_accessor :secondary_id

    # Latest datetime the aggregatino account was updated
    attr_accessor :update_date

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'id' => :'id',
        :'create_date' => :'create_date',
        :'client_id' => :'client_id',
        :'account_name' => :'account_name',
        :'institution_name' => :'institution_name',
        :'category' => :'category',
        :'subcategory' => :'subcategory',
        :'account_number' => :'account_number',
        :'account_holder' => :'account_holder',
        :'mask' => :'mask',
        :'currency_code' => :'currency_code',
        :'is_asset' => :'is_asset',
        :'financial_offer_id' => :'financial_offer_id',
        :'is_active' => :'is_active',
        :'metadata' => :'metadata',
        :'secondary_id' => :'secondary_id',
        :'update_date' => :'update_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'id' => :'String',
        :'create_date' => :'String',
        :'client_id' => :'String',
        :'account_name' => :'String',
        :'institution_name' => :'String',
        :'category' => :'String',
        :'subcategory' => :'String',
        :'account_number' => :'String',
        :'account_holder' => :'String',
        :'mask' => :'String',
        :'currency_code' => :'String',
        :'is_asset' => :'BOOLEAN',
        :'financial_offer_id' => :'String',
        :'is_active' => :'BOOLEAN',
        :'metadata' => :'Object',
        :'secondary_id' => :'SecondaryId',
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

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'account_name')
        self.account_name = attributes[:'account_name']
      end

      if attributes.has_key?(:'institution_name')
        self.institution_name = attributes[:'institution_name']
      end

      if attributes.has_key?(:'category')
        self.category = attributes[:'category']
      end

      if attributes.has_key?(:'subcategory')
        self.subcategory = attributes[:'subcategory']
      end

      if attributes.has_key?(:'account_number')
        self.account_number = attributes[:'account_number']
      end

      if attributes.has_key?(:'account_holder')
        self.account_holder = attributes[:'account_holder']
      end

      if attributes.has_key?(:'mask')
        self.mask = attributes[:'mask']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'is_asset')
        self.is_asset = attributes[:'is_asset']
      end

      if attributes.has_key?(:'financial_offer_id')
        self.financial_offer_id = attributes[:'financial_offer_id']
      end

      if attributes.has_key?(:'is_active')
        self.is_active = attributes[:'is_active']
      else
        self.is_active = true
      end

      if attributes.has_key?(:'metadata')
        self.metadata = attributes[:'metadata']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @client_id.nil?
        invalid_properties.push('invalid value for "client_id", client_id cannot be nil.')
      end

      if @account_name.nil?
        invalid_properties.push('invalid value for "account_name", account_name cannot be nil.')
      end

      if @institution_name.nil?
        invalid_properties.push('invalid value for "institution_name", institution_name cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @client_id.nil?
      return false if @account_name.nil?
      return false if @institution_name.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          create_date == o.create_date &&
          client_id == o.client_id &&
          account_name == o.account_name &&
          institution_name == o.institution_name &&
          category == o.category &&
          subcategory == o.subcategory &&
          account_number == o.account_number &&
          account_holder == o.account_holder &&
          mask == o.mask &&
          currency_code == o.currency_code &&
          is_asset == o.is_asset &&
          financial_offer_id == o.financial_offer_id &&
          is_active == o.is_active &&
          metadata == o.metadata &&
          secondary_id == o.secondary_id &&
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
      [id, create_date, client_id, account_name, institution_name, category, subcategory, account_number, account_holder, mask, currency_code, is_asset, financial_offer_id, is_active, metadata, secondary_id, update_date].hash
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
