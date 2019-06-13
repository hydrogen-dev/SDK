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
  class CreateSalesResponse
    # Details on the questions received within the inquiry
    attr_accessor :questions

    # Short title for the subject of the inquiry
    attr_accessor :subject

    # The ID of the internal user assigned to the sales inquiry
    attr_accessor :assigned

    # Date that the inquiry was opened
    attr_accessor :open_time

    # Date that the inquiry was closed
    attr_accessor :close_time

    # The ID for the internal user that closed the inquiry
    attr_accessor :closed_by

    # Any comments associated with the sales inquiry for background
    attr_accessor :comments

    # Indicates if the individual associated with the inquiry was contacted. Defaults to false which indicates that he/she was not contacted
    attr_accessor :contacted

    # Contact email for the individual associated with the inquiry such as sample@example.com
    attr_accessor :email

    # Name of the firm associated with the inquiry
    attr_accessor :firm_name

    # First name of the individual associated with the inquiry
    attr_accessor :first_name

    # Last name of the individual associated with the inquiry
    attr_accessor :last_name

    # IP address for the individual associated with the inquiry
    attr_accessor :ip

    # Method with which the inquiry was received such as “email” or “phone”
    attr_accessor :method

    # Phone number for the individual associated with the inquiry
    attr_accessor :phone

    # Title of the individual associated with the inquiry
    attr_accessor :title

    # Details on the resolution of the inquiry
    attr_accessor :solution

    # Details on how the individual associated with the inquiry was referred
    attr_accessor :referral_source

    # Indicates if a notification is issued for inquiry. Defaults to true which indicates that there is a notification
    attr_accessor :notification

    # Custom information associated with the sales inquiry in the format key:value. See Metadata
    attr_accessor :metadata

    attr_accessor :secondary_id

    # The ID of the sales inquiry
    attr_accessor :id

    # Datetime the sales inquiry was created
    attr_accessor :create_date

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'questions' => :'questions',
        :'subject' => :'subject',
        :'assigned' => :'assigned',
        :'open_time' => :'open_time',
        :'close_time' => :'close_time',
        :'closed_by' => :'closed_by',
        :'comments' => :'comments',
        :'contacted' => :'contacted',
        :'email' => :'email',
        :'firm_name' => :'firm_name',
        :'first_name' => :'first_name',
        :'last_name' => :'last_name',
        :'ip' => :'ip',
        :'method' => :'method',
        :'phone' => :'phone',
        :'title' => :'title',
        :'solution' => :'solution',
        :'referral_source' => :'referral_source',
        :'notification' => :'notification',
        :'metadata' => :'metadata',
        :'secondary_id' => :'secondary_id',
        :'id' => :'id',
        :'create_date' => :'create_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'questions' => :'String',
        :'subject' => :'String',
        :'assigned' => :'String',
        :'open_time' => :'Date',
        :'close_time' => :'Date',
        :'closed_by' => :'String',
        :'comments' => :'String',
        :'contacted' => :'BOOLEAN',
        :'email' => :'String',
        :'firm_name' => :'String',
        :'first_name' => :'String',
        :'last_name' => :'String',
        :'ip' => :'String',
        :'method' => :'String',
        :'phone' => :'String',
        :'title' => :'String',
        :'solution' => :'String',
        :'referral_source' => :'String',
        :'notification' => :'BOOLEAN',
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

      if attributes.has_key?(:'questions')
        self.questions = attributes[:'questions']
      end

      if attributes.has_key?(:'subject')
        self.subject = attributes[:'subject']
      end

      if attributes.has_key?(:'assigned')
        self.assigned = attributes[:'assigned']
      end

      if attributes.has_key?(:'open_time')
        self.open_time = attributes[:'open_time']
      end

      if attributes.has_key?(:'close_time')
        self.close_time = attributes[:'close_time']
      end

      if attributes.has_key?(:'closed_by')
        self.closed_by = attributes[:'closed_by']
      end

      if attributes.has_key?(:'comments')
        self.comments = attributes[:'comments']
      end

      if attributes.has_key?(:'contacted')
        self.contacted = attributes[:'contacted']
      else
        self.contacted = false
      end

      if attributes.has_key?(:'email')
        self.email = attributes[:'email']
      end

      if attributes.has_key?(:'firm_name')
        self.firm_name = attributes[:'firm_name']
      end

      if attributes.has_key?(:'first_name')
        self.first_name = attributes[:'first_name']
      end

      if attributes.has_key?(:'last_name')
        self.last_name = attributes[:'last_name']
      end

      if attributes.has_key?(:'ip')
        self.ip = attributes[:'ip']
      end

      if attributes.has_key?(:'method')
        self.method = attributes[:'method']
      end

      if attributes.has_key?(:'phone')
        self.phone = attributes[:'phone']
      end

      if attributes.has_key?(:'title')
        self.title = attributes[:'title']
      end

      if attributes.has_key?(:'solution')
        self.solution = attributes[:'solution']
      end

      if attributes.has_key?(:'referral_source')
        self.referral_source = attributes[:'referral_source']
      end

      if attributes.has_key?(:'notification')
        self.notification = attributes[:'notification']
      else
        self.notification = true
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
      if @questions.nil?
        invalid_properties.push('invalid value for "questions", questions cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @questions.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          questions == o.questions &&
          subject == o.subject &&
          assigned == o.assigned &&
          open_time == o.open_time &&
          close_time == o.close_time &&
          closed_by == o.closed_by &&
          comments == o.comments &&
          contacted == o.contacted &&
          email == o.email &&
          firm_name == o.firm_name &&
          first_name == o.first_name &&
          last_name == o.last_name &&
          ip == o.ip &&
          method == o.method &&
          phone == o.phone &&
          title == o.title &&
          solution == o.solution &&
          referral_source == o.referral_source &&
          notification == o.notification &&
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
      [questions, subject, assigned, open_time, close_time, closed_by, comments, contacted, email, firm_name, first_name, last_name, ip, method, phone, title, solution, referral_source, notification, metadata, secondary_id, id, create_date].hash
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
