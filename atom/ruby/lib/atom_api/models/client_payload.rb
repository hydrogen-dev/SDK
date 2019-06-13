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
  class ClientPayload
    # Username for the client used on the firm’s platform
    attr_accessor :username

    attr_accessor :client_type

    # Contact email for the client in the format sample@example.com
    attr_accessor :email

    # The title of the client such as “Mr.”, “Ms.”, “Miss”, “Mx.”, etc.
    attr_accessor :title

    # First name or given name of the client
    attr_accessor :first_name

    # Middle name of the client
    attr_accessor :middle_name

    # Last name or surname of the client
    attr_accessor :last_name

    # Phone number associated with the client
    attr_accessor :phone_number

    # Date of birth of the client in the ISO 8601 format YYYY-MM-DD
    attr_accessor :date_of_birth

    # National or local identification number for a client such as Social Security Number, frequently used for Know-Your-Customer (KYC) purposes
    attr_accessor :identification_number

    # The country of residence of a client, often corresponding to the country issuing the identification number provided above using the ISO ALPHA-2 Code, frequently used for Know-Your-Customer (KYC) purposes
    attr_accessor :country_of_residence

    # Indicator if the identifying details provided by the client have been verified by a Know-Your-Customer (KYC) vendor. Defaults to false which indicates it is not verified
    attr_accessor :is_verified

    # The Hydro ID associated with the client (if applicable). Corresponds to the Client Hydro entity
    attr_accessor :hydro_id

    # Indicates if the client is currently active. Defaults to true which indicates it is active
    attr_accessor :is_active

    attr_accessor :address

    # Custom information associated with the client in the format key:value
    attr_accessor :metadata

    attr_accessor :secondary_id

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
        :'username' => :'username',
        :'client_type' => :'client_type',
        :'email' => :'email',
        :'title' => :'title',
        :'first_name' => :'first_name',
        :'middle_name' => :'middle_name',
        :'last_name' => :'last_name',
        :'phone_number' => :'phone_number',
        :'date_of_birth' => :'date_of_birth',
        :'identification_number' => :'identification_number',
        :'country_of_residence' => :'country_of_residence',
        :'is_verified' => :'is_verified',
        :'hydro_id' => :'hydro_id',
        :'is_active' => :'is_active',
        :'address' => :'address',
        :'metadata' => :'metadata',
        :'secondary_id' => :'secondary_id'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'username' => :'String',
        :'client_type' => :'String',
        :'email' => :'String',
        :'title' => :'String',
        :'first_name' => :'String',
        :'middle_name' => :'String',
        :'last_name' => :'String',
        :'phone_number' => :'String',
        :'date_of_birth' => :'Date',
        :'identification_number' => :'String',
        :'country_of_residence' => :'String',
        :'is_verified' => :'BOOLEAN',
        :'hydro_id' => :'String',
        :'is_active' => :'BOOLEAN',
        :'address' => :'Array<Address>',
        :'metadata' => :'Object',
        :'secondary_id' => :'SecondaryId'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'username')
        self.username = attributes[:'username']
      end

      if attributes.has_key?(:'client_type')
        self.client_type = attributes[:'client_type']
      end

      if attributes.has_key?(:'email')
        self.email = attributes[:'email']
      end

      if attributes.has_key?(:'title')
        self.title = attributes[:'title']
      end

      if attributes.has_key?(:'first_name')
        self.first_name = attributes[:'first_name']
      end

      if attributes.has_key?(:'middle_name')
        self.middle_name = attributes[:'middle_name']
      end

      if attributes.has_key?(:'last_name')
        self.last_name = attributes[:'last_name']
      end

      if attributes.has_key?(:'phone_number')
        self.phone_number = attributes[:'phone_number']
      end

      if attributes.has_key?(:'date_of_birth')
        self.date_of_birth = attributes[:'date_of_birth']
      end

      if attributes.has_key?(:'identification_number')
        self.identification_number = attributes[:'identification_number']
      end

      if attributes.has_key?(:'country_of_residence')
        self.country_of_residence = attributes[:'country_of_residence']
      end

      if attributes.has_key?(:'is_verified')
        self.is_verified = attributes[:'is_verified']
      else
        self.is_verified = false
      end

      if attributes.has_key?(:'hydro_id')
        self.hydro_id = attributes[:'hydro_id']
      end

      if attributes.has_key?(:'is_active')
        self.is_active = attributes[:'is_active']
      else
        self.is_active = true
      end

      if attributes.has_key?(:'address')
        if (value = attributes[:'address']).is_a?(Array)
          self.address = value
        end
      end

      if attributes.has_key?(:'metadata')
        self.metadata = attributes[:'metadata']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @username.nil?
        invalid_properties.push('invalid value for "username", username cannot be nil.')
      end

      if @client_type.nil?
        invalid_properties.push('invalid value for "client_type", client_type cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @username.nil?
      return false if @client_type.nil?
      client_type_validator = EnumAttributeValidator.new('String', ['individual', 'firm', 'admin', 'advisor'])
      return false unless client_type_validator.valid?(@client_type)
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] client_type Object to be assigned
    def client_type=(client_type)
      validator = EnumAttributeValidator.new('String', ['individual', 'firm', 'admin', 'advisor'])
      unless validator.valid?(client_type)
        fail ArgumentError, 'invalid value for "client_type", must be one of #{validator.allowable_values}.'
      end
      @client_type = client_type
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          username == o.username &&
          client_type == o.client_type &&
          email == o.email &&
          title == o.title &&
          first_name == o.first_name &&
          middle_name == o.middle_name &&
          last_name == o.last_name &&
          phone_number == o.phone_number &&
          date_of_birth == o.date_of_birth &&
          identification_number == o.identification_number &&
          country_of_residence == o.country_of_residence &&
          is_verified == o.is_verified &&
          hydro_id == o.hydro_id &&
          is_active == o.is_active &&
          address == o.address &&
          metadata == o.metadata &&
          secondary_id == o.secondary_id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [username, client_type, email, title, first_name, middle_name, last_name, phone_number, date_of_birth, identification_number, country_of_residence, is_verified, hydro_id, is_active, address, metadata, secondary_id].hash
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
