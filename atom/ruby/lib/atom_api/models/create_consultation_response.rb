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
  class CreateConsultationResponse
    # The ID of the account type for the account of the client who submitted the request
    attr_accessor :account_type_id

    # Any additional questions to be answered during the consultation
    attr_accessor :additional_questions

    # Asset value for a client’s account
    attr_accessor :assets

    # Internal user to whom the request is assigned
    attr_accessor :assigned

    # Indicates if the request is scheduled on the calendar. Defaults to false which indicates it has not been scheduled
    attr_accessor :calendar

    # Category for the purpose of the request such as “New Account”
    attr_accessor :category

    # Additional information on the purpose of the request such as “Would like to open a new account”
    attr_accessor :comments

    # The ID for the client that submitted the request
    attr_accessor :client_id

    # Date that the consultation is scheduled
    attr_accessor :time

    # Date that the consultation request has been resolved and closed
    attr_accessor :close_time

    # Internal user that has resolved and closed the consultation request
    attr_accessor :closed_by

    # Indicates if the consultation request has been resolved and closed. Defaults to false which indicates it has not been closed
    attr_accessor :completed

    # Name of the client that submitted the request
    attr_accessor :name

    # Contact email or the client in the format sample@example.com
    attr_accessor :email

    # Firm name for the client’s firm
    attr_accessor :firmname

    # Contact phone number for the client
    attr_accessor :phone

    # The type of investment allocation with which the client is associated
    attr_accessor :investment_allocation

    # Description of the location of the client’s investments
    attr_accessor :investment_location

    # Brief information on the client’s investment objectives
    attr_accessor :investment_objectives

    # Indicates if the consultation request is active. Defaults to true which indicates it is active
    attr_accessor :is_active

    # Indicates if a reminder of the consultation was sent to the client. Defaults to false which indicates it has not been sent
    attr_accessor :reminded

    # Information on how the client has requested the consultation
    attr_accessor :source

    attr_accessor :secondary_id

    # Custom information associated with the consultation in the format key:value
    attr_accessor :metadata

    # The ID of the consultation request
    attr_accessor :id

    # Datetime the consultation request was created
    attr_accessor :create_date

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'account_type_id' => :'account_type_id',
        :'additional_questions' => :'additional_questions',
        :'assets' => :'assets',
        :'assigned' => :'assigned',
        :'calendar' => :'calendar',
        :'category' => :'category',
        :'comments' => :'comments',
        :'client_id' => :'client_id',
        :'time' => :'time',
        :'close_time' => :'close_time',
        :'closed_by' => :'closed_by',
        :'completed' => :'completed',
        :'name' => :'name',
        :'email' => :'email',
        :'firmname' => :'firmname',
        :'phone' => :'phone',
        :'investment_allocation' => :'investment_allocation',
        :'investment_location' => :'investment_location',
        :'investment_objectives' => :'investment_objectives',
        :'is_active' => :'is_active',
        :'reminded' => :'reminded',
        :'source' => :'source',
        :'secondary_id' => :'secondary_id',
        :'metadata' => :'metadata',
        :'id' => :'id',
        :'create_date' => :'create_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'account_type_id' => :'String',
        :'additional_questions' => :'String',
        :'assets' => :'String',
        :'assigned' => :'String',
        :'calendar' => :'BOOLEAN',
        :'category' => :'String',
        :'comments' => :'String',
        :'client_id' => :'String',
        :'time' => :'Date',
        :'close_time' => :'Date',
        :'closed_by' => :'String',
        :'completed' => :'BOOLEAN',
        :'name' => :'String',
        :'email' => :'String',
        :'firmname' => :'String',
        :'phone' => :'String',
        :'investment_allocation' => :'String',
        :'investment_location' => :'String',
        :'investment_objectives' => :'String',
        :'is_active' => :'BOOLEAN',
        :'reminded' => :'BOOLEAN',
        :'source' => :'String',
        :'secondary_id' => :'SecondaryId',
        :'metadata' => :'Object',
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

      if attributes.has_key?(:'account_type_id')
        self.account_type_id = attributes[:'account_type_id']
      end

      if attributes.has_key?(:'additional_questions')
        self.additional_questions = attributes[:'additional_questions']
      end

      if attributes.has_key?(:'assets')
        self.assets = attributes[:'assets']
      end

      if attributes.has_key?(:'assigned')
        self.assigned = attributes[:'assigned']
      end

      if attributes.has_key?(:'calendar')
        self.calendar = attributes[:'calendar']
      else
        self.calendar = false
      end

      if attributes.has_key?(:'category')
        self.category = attributes[:'category']
      end

      if attributes.has_key?(:'comments')
        self.comments = attributes[:'comments']
      end

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'time')
        self.time = attributes[:'time']
      end

      if attributes.has_key?(:'close_time')
        self.close_time = attributes[:'close_time']
      end

      if attributes.has_key?(:'closed_by')
        self.closed_by = attributes[:'closed_by']
      end

      if attributes.has_key?(:'completed')
        self.completed = attributes[:'completed']
      else
        self.completed = false
      end

      if attributes.has_key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.has_key?(:'email')
        self.email = attributes[:'email']
      end

      if attributes.has_key?(:'firmname')
        self.firmname = attributes[:'firmname']
      end

      if attributes.has_key?(:'phone')
        self.phone = attributes[:'phone']
      end

      if attributes.has_key?(:'investment_allocation')
        self.investment_allocation = attributes[:'investment_allocation']
      end

      if attributes.has_key?(:'investment_location')
        self.investment_location = attributes[:'investment_location']
      end

      if attributes.has_key?(:'investment_objectives')
        self.investment_objectives = attributes[:'investment_objectives']
      end

      if attributes.has_key?(:'is_active')
        self.is_active = attributes[:'is_active']
      else
        self.is_active = true
      end

      if attributes.has_key?(:'reminded')
        self.reminded = attributes[:'reminded']
      else
        self.reminded = false
      end

      if attributes.has_key?(:'source')
        self.source = attributes[:'source']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'metadata')
        self.metadata = attributes[:'metadata']
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
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          account_type_id == o.account_type_id &&
          additional_questions == o.additional_questions &&
          assets == o.assets &&
          assigned == o.assigned &&
          calendar == o.calendar &&
          category == o.category &&
          comments == o.comments &&
          client_id == o.client_id &&
          time == o.time &&
          close_time == o.close_time &&
          closed_by == o.closed_by &&
          completed == o.completed &&
          name == o.name &&
          email == o.email &&
          firmname == o.firmname &&
          phone == o.phone &&
          investment_allocation == o.investment_allocation &&
          investment_location == o.investment_location &&
          investment_objectives == o.investment_objectives &&
          is_active == o.is_active &&
          reminded == o.reminded &&
          source == o.source &&
          secondary_id == o.secondary_id &&
          metadata == o.metadata &&
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
      [account_type_id, additional_questions, assets, assigned, calendar, category, comments, client_id, time, close_time, closed_by, completed, name, email, firmname, phone, investment_allocation, investment_location, investment_objectives, is_active, reminded, source, secondary_id, metadata, id, create_date].hash
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
