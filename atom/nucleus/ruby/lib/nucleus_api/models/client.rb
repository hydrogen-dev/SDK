=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.4
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.21

=end

require 'date'

module NucleusApi
  # Client Object
  class Client
    attr_accessor :address

    # business_id
    attr_accessor :business_id

    # citizenshipStatus
    attr_accessor :citizenship_status

    # clientTypeId
    attr_accessor :client_type

    # countryOfCitizenship
    attr_accessor :country_of_citizenship

    # countryOfResidence
    attr_accessor :country_of_residence

    attr_accessor :create_date

    # dateOfBirth
    attr_accessor :date_of_birth

    # email
    attr_accessor :email

    attr_accessor :employment

    # firmName
    attr_accessor :firm_name

    # firmType
    attr_accessor :firm_type

    # firstName
    attr_accessor :first_name

    # gender
    attr_accessor :gender

    # group
    attr_accessor :group

    # hydroId
    attr_accessor :hydro_id

    attr_accessor :id

    # identificationNumber
    attr_accessor :identification_number

    # identificationNumberType
    attr_accessor :identification_number_type

    # image
    attr_accessor :image

    # income
    attr_accessor :income

    # isActive
    attr_accessor :is_active

    # isVerified
    attr_accessor :is_verified

    # last_name
    attr_accessor :last_name

    # liquidNetWorth
    attr_accessor :liquid_net_worth

    # metadata
    attr_accessor :metadata

    # middleName
    attr_accessor :middle_name

    # phoneNumber
    attr_accessor :phone_number

    attr_accessor :secondary_id

    # status
    attr_accessor :status

    # suffix
    attr_accessor :suffix

    # title
    attr_accessor :title

    # totalNetWorth
    attr_accessor :total_net_worth

    attr_accessor :update_date

    # username
    attr_accessor :username

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'address' => :'address',
        :'business_id' => :'business_id',
        :'citizenship_status' => :'citizenship_status',
        :'client_type' => :'client_type',
        :'country_of_citizenship' => :'country_of_citizenship',
        :'country_of_residence' => :'country_of_residence',
        :'create_date' => :'create_date',
        :'date_of_birth' => :'date_of_birth',
        :'email' => :'email',
        :'employment' => :'employment',
        :'firm_name' => :'firm_name',
        :'firm_type' => :'firm_type',
        :'first_name' => :'first_name',
        :'gender' => :'gender',
        :'group' => :'group',
        :'hydro_id' => :'hydro_id',
        :'id' => :'id',
        :'identification_number' => :'identification_number',
        :'identification_number_type' => :'identification_number_type',
        :'image' => :'image',
        :'income' => :'income',
        :'is_active' => :'is_active',
        :'is_verified' => :'is_verified',
        :'last_name' => :'last_name',
        :'liquid_net_worth' => :'liquid_net_worth',
        :'metadata' => :'metadata',
        :'middle_name' => :'middle_name',
        :'phone_number' => :'phone_number',
        :'secondary_id' => :'secondary_id',
        :'status' => :'status',
        :'suffix' => :'suffix',
        :'title' => :'title',
        :'total_net_worth' => :'total_net_worth',
        :'update_date' => :'update_date',
        :'username' => :'username'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'address' => :'Array<ClientAddress>',
        :'business_id' => :'String',
        :'citizenship_status' => :'String',
        :'client_type' => :'String',
        :'country_of_citizenship' => :'Array<String>',
        :'country_of_residence' => :'String',
        :'create_date' => :'DateTime',
        :'date_of_birth' => :'String',
        :'email' => :'String',
        :'employment' => :'Employment',
        :'firm_name' => :'String',
        :'firm_type' => :'String',
        :'first_name' => :'String',
        :'gender' => :'String',
        :'group' => :'String',
        :'hydro_id' => :'String',
        :'id' => :'String',
        :'identification_number' => :'String',
        :'identification_number_type' => :'String',
        :'image' => :'String',
        :'income' => :'Integer',
        :'is_active' => :'BOOLEAN',
        :'is_verified' => :'BOOLEAN',
        :'last_name' => :'String',
        :'liquid_net_worth' => :'Float',
        :'metadata' => :'Hash<String, String>',
        :'middle_name' => :'String',
        :'phone_number' => :'String',
        :'secondary_id' => :'String',
        :'status' => :'String',
        :'suffix' => :'String',
        :'title' => :'String',
        :'total_net_worth' => :'Float',
        :'update_date' => :'DateTime',
        :'username' => :'String'
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

      if attributes.has_key?(:'business_id')
        self.business_id = attributes[:'business_id']
      end

      if attributes.has_key?(:'citizenship_status')
        self.citizenship_status = attributes[:'citizenship_status']
      end

      if attributes.has_key?(:'client_type')
        self.client_type = attributes[:'client_type']
      end

      if attributes.has_key?(:'country_of_citizenship')
        if (value = attributes[:'country_of_citizenship']).is_a?(Array)
          self.country_of_citizenship = value
        end
      end

      if attributes.has_key?(:'country_of_residence')
        self.country_of_residence = attributes[:'country_of_residence']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'date_of_birth')
        self.date_of_birth = attributes[:'date_of_birth']
      end

      if attributes.has_key?(:'email')
        self.email = attributes[:'email']
      end

      if attributes.has_key?(:'employment')
        self.employment = attributes[:'employment']
      end

      if attributes.has_key?(:'firm_name')
        self.firm_name = attributes[:'firm_name']
      end

      if attributes.has_key?(:'firm_type')
        self.firm_type = attributes[:'firm_type']
      end

      if attributes.has_key?(:'first_name')
        self.first_name = attributes[:'first_name']
      end

      if attributes.has_key?(:'gender')
        self.gender = attributes[:'gender']
      end

      if attributes.has_key?(:'group')
        self.group = attributes[:'group']
      end

      if attributes.has_key?(:'hydro_id')
        self.hydro_id = attributes[:'hydro_id']
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

      if attributes.has_key?(:'image')
        self.image = attributes[:'image']
      end

      if attributes.has_key?(:'income')
        self.income = attributes[:'income']
      end

      if attributes.has_key?(:'is_active')
        self.is_active = attributes[:'is_active']
      end

      if attributes.has_key?(:'is_verified')
        self.is_verified = attributes[:'is_verified']
      end

      if attributes.has_key?(:'last_name')
        self.last_name = attributes[:'last_name']
      end

      if attributes.has_key?(:'liquid_net_worth')
        self.liquid_net_worth = attributes[:'liquid_net_worth']
      end

      if attributes.has_key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.has_key?(:'middle_name')
        self.middle_name = attributes[:'middle_name']
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

      if attributes.has_key?(:'suffix')
        self.suffix = attributes[:'suffix']
      end

      if attributes.has_key?(:'title')
        self.title = attributes[:'title']
      end

      if attributes.has_key?(:'total_net_worth')
        self.total_net_worth = attributes[:'total_net_worth']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end

      if attributes.has_key?(:'username')
        self.username = attributes[:'username']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @client_type.nil?
        invalid_properties.push('invalid value for "client_type", client_type cannot be nil.')
      end

      if @username.nil?
        invalid_properties.push('invalid value for "username", username cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @client_type.nil?
      return false if @username.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          address == o.address &&
          business_id == o.business_id &&
          citizenship_status == o.citizenship_status &&
          client_type == o.client_type &&
          country_of_citizenship == o.country_of_citizenship &&
          country_of_residence == o.country_of_residence &&
          create_date == o.create_date &&
          date_of_birth == o.date_of_birth &&
          email == o.email &&
          employment == o.employment &&
          firm_name == o.firm_name &&
          firm_type == o.firm_type &&
          first_name == o.first_name &&
          gender == o.gender &&
          group == o.group &&
          hydro_id == o.hydro_id &&
          id == o.id &&
          identification_number == o.identification_number &&
          identification_number_type == o.identification_number_type &&
          image == o.image &&
          income == o.income &&
          is_active == o.is_active &&
          is_verified == o.is_verified &&
          last_name == o.last_name &&
          liquid_net_worth == o.liquid_net_worth &&
          metadata == o.metadata &&
          middle_name == o.middle_name &&
          phone_number == o.phone_number &&
          secondary_id == o.secondary_id &&
          status == o.status &&
          suffix == o.suffix &&
          title == o.title &&
          total_net_worth == o.total_net_worth &&
          update_date == o.update_date &&
          username == o.username
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [address, business_id, citizenship_status, client_type, country_of_citizenship, country_of_residence, create_date, date_of_birth, email, employment, firm_name, firm_type, first_name, gender, group, hydro_id, id, identification_number, identification_number_type, image, income, is_active, is_verified, last_name, liquid_net_worth, metadata, middle_name, phone_number, secondary_id, status, suffix, title, total_net_worth, update_date, username].hash
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
        value
      when :Date
        value
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
