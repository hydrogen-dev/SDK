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
  # Business Object
  class Business
    attr_accessor :address

    # category
    attr_accessor :category

    attr_accessor :create_date

    # dbaName
    attr_accessor :dba_name

    # email
    attr_accessor :email

    attr_accessor :id

    # identificationNumber
    attr_accessor :identification_number

    # identificationNumberType
    attr_accessor :identification_number_type

    # incorporationCountry
    attr_accessor :incorporation_country

    # incorporationDate
    attr_accessor :incorporation_date

    # incorporationState
    attr_accessor :incorporation_state

    # is_active
    attr_accessor :is_active

    # is_public
    attr_accessor :is_public

    # is_verified
    attr_accessor :is_verified

    # legalName
    attr_accessor :legal_name

    # legalStructure
    attr_accessor :legal_structure

    # metadata
    attr_accessor :metadata

    # ownership
    attr_accessor :ownership

    # phoneNumber
    attr_accessor :phone_number

    attr_accessor :secondary_id

    # status
    attr_accessor :status

    # subcategory
    attr_accessor :subcategory

    # ticker
    attr_accessor :ticker

    attr_accessor :update_date

    # website
    attr_accessor :website

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'address' => :'address',
        :'category' => :'category',
        :'create_date' => :'create_date',
        :'dba_name' => :'dba_name',
        :'email' => :'email',
        :'id' => :'id',
        :'identification_number' => :'identification_number',
        :'identification_number_type' => :'identification_number_type',
        :'incorporation_country' => :'incorporation_country',
        :'incorporation_date' => :'incorporation_date',
        :'incorporation_state' => :'incorporation_state',
        :'is_active' => :'is_active',
        :'is_public' => :'is_public',
        :'is_verified' => :'is_verified',
        :'legal_name' => :'legal_name',
        :'legal_structure' => :'legal_structure',
        :'metadata' => :'metadata',
        :'ownership' => :'ownership',
        :'phone_number' => :'phone_number',
        :'secondary_id' => :'secondary_id',
        :'status' => :'status',
        :'subcategory' => :'subcategory',
        :'ticker' => :'ticker',
        :'update_date' => :'update_date',
        :'website' => :'website'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'address' => :'Array<BusinessAddress>',
        :'category' => :'String',
        :'create_date' => :'DateTime',
        :'dba_name' => :'String',
        :'email' => :'String',
        :'id' => :'String',
        :'identification_number' => :'String',
        :'identification_number_type' => :'String',
        :'incorporation_country' => :'String',
        :'incorporation_date' => :'Date',
        :'incorporation_state' => :'String',
        :'is_active' => :'BOOLEAN',
        :'is_public' => :'BOOLEAN',
        :'is_verified' => :'BOOLEAN',
        :'legal_name' => :'String',
        :'legal_structure' => :'String',
        :'metadata' => :'Hash<String, String>',
        :'ownership' => :'Array<Ownership>',
        :'phone_number' => :'String',
        :'secondary_id' => :'String',
        :'status' => :'String',
        :'subcategory' => :'String',
        :'ticker' => :'String',
        :'update_date' => :'DateTime',
        :'website' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'address')
        if (value = attributes[:'address']).is_a?(Array)
          self.address = value
        end
      end

      if attributes.has_key?(:'category')
        self.category = attributes[:'category']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'dba_name')
        self.dba_name = attributes[:'dba_name']
      end

      if attributes.has_key?(:'email')
        self.email = attributes[:'email']
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'identification_number')
        self.identification_number = attributes[:'identification_number']
      end

      if attributes.has_key?(:'identification_number_type')
        self.identification_number_type = attributes[:'identification_number_type']
      end

      if attributes.has_key?(:'incorporation_country')
        self.incorporation_country = attributes[:'incorporation_country']
      end

      if attributes.has_key?(:'incorporation_date')
        self.incorporation_date = attributes[:'incorporation_date']
      end

      if attributes.has_key?(:'incorporation_state')
        self.incorporation_state = attributes[:'incorporation_state']
      end

      if attributes.has_key?(:'is_active')
        self.is_active = attributes[:'is_active']
      end

      if attributes.has_key?(:'is_public')
        self.is_public = attributes[:'is_public']
      end

      if attributes.has_key?(:'is_verified')
        self.is_verified = attributes[:'is_verified']
      end

      if attributes.has_key?(:'legal_name')
        self.legal_name = attributes[:'legal_name']
      end

      if attributes.has_key?(:'legal_structure')
        self.legal_structure = attributes[:'legal_structure']
      end

      if attributes.has_key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.has_key?(:'ownership')
        if (value = attributes[:'ownership']).is_a?(Array)
          self.ownership = value
        end
      end

      if attributes.has_key?(:'phone_number')
        self.phone_number = attributes[:'phone_number']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'status')
        self.status = attributes[:'status']
      end

      if attributes.has_key?(:'subcategory')
        self.subcategory = attributes[:'subcategory']
      end

      if attributes.has_key?(:'ticker')
        self.ticker = attributes[:'ticker']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end

      if attributes.has_key?(:'website')
        self.website = attributes[:'website']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @legal_name.nil?
        invalid_properties.push('invalid value for "legal_name", legal_name cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @legal_name.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          address == o.address &&
          category == o.category &&
          create_date == o.create_date &&
          dba_name == o.dba_name &&
          email == o.email &&
          id == o.id &&
          identification_number == o.identification_number &&
          identification_number_type == o.identification_number_type &&
          incorporation_country == o.incorporation_country &&
          incorporation_date == o.incorporation_date &&
          incorporation_state == o.incorporation_state &&
          is_active == o.is_active &&
          is_public == o.is_public &&
          is_verified == o.is_verified &&
          legal_name == o.legal_name &&
          legal_structure == o.legal_structure &&
          metadata == o.metadata &&
          ownership == o.ownership &&
          phone_number == o.phone_number &&
          secondary_id == o.secondary_id &&
          status == o.status &&
          subcategory == o.subcategory &&
          ticker == o.ticker &&
          update_date == o.update_date &&
          website == o.website
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [address, category, create_date, dba_name, email, id, identification_number, identification_number_type, incorporation_country, incorporation_date, incorporation_state, is_active, is_public, is_verified, legal_name, legal_structure, metadata, ownership, phone_number, secondary_id, status, subcategory, ticker, update_date, website].hash
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
