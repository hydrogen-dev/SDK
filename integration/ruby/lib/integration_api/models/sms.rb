=begin
#Hydrogen Integration API

#The Hydrogen Integration API

OpenAPI spec version: 1.3.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'date'

module IntegrationApi
  # SMS Object
  class SMS
    attr_accessor :create_date

    # deliveryStatus
    attr_accessor :delivery_status

    # deliveryStatusTimestamp
    attr_accessor :delivery_status_timestamp

    # from
    attr_accessor :from

    attr_accessor :id

    # nucleusBusinessId
    attr_accessor :nucleus_business_id

    # nucleusClientId
    attr_accessor :nucleus_client_id

    # replyMessage
    attr_accessor :reply_message

    attr_accessor :secondary_id

    attr_accessor :sms_id

    # to
    attr_accessor :to

    # type
    attr_accessor :type

    attr_accessor :update_date

    attr_accessor :vendor_account_id

    # vendorId
    attr_accessor :vendor_id

    attr_accessor :vendor_name

    attr_accessor :vendor_sms_id

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'create_date' => :'create_date',
        :'delivery_status' => :'delivery_status',
        :'delivery_status_timestamp' => :'delivery_status_timestamp',
        :'from' => :'from',
        :'id' => :'id',
        :'nucleus_business_id' => :'nucleus_business_id',
        :'nucleus_client_id' => :'nucleus_client_id',
        :'reply_message' => :'reply_message',
        :'secondary_id' => :'secondary_id',
        :'sms_id' => :'sms_id',
        :'to' => :'to',
        :'type' => :'type',
        :'update_date' => :'update_date',
        :'vendor_account_id' => :'vendor_account_id',
        :'vendor_id' => :'vendor_id',
        :'vendor_name' => :'vendor_name',
        :'vendor_sms_id' => :'vendor_sms_id'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'create_date' => :'DateTime',
        :'delivery_status' => :'String',
        :'delivery_status_timestamp' => :'DateTime',
        :'from' => :'String',
        :'id' => :'String',
        :'nucleus_business_id' => :'String',
        :'nucleus_client_id' => :'String',
        :'reply_message' => :'String',
        :'secondary_id' => :'String',
        :'sms_id' => :'String',
        :'to' => :'String',
        :'type' => :'String',
        :'update_date' => :'DateTime',
        :'vendor_account_id' => :'String',
        :'vendor_id' => :'String',
        :'vendor_name' => :'String',
        :'vendor_sms_id' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'delivery_status')
        self.delivery_status = attributes[:'delivery_status']
      end

      if attributes.has_key?(:'delivery_status_timestamp')
        self.delivery_status_timestamp = attributes[:'delivery_status_timestamp']
      end

      if attributes.has_key?(:'from')
        self.from = attributes[:'from']
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'nucleus_business_id')
        self.nucleus_business_id = attributes[:'nucleus_business_id']
      end

      if attributes.has_key?(:'nucleus_client_id')
        self.nucleus_client_id = attributes[:'nucleus_client_id']
      end

      if attributes.has_key?(:'reply_message')
        self.reply_message = attributes[:'reply_message']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'sms_id')
        self.sms_id = attributes[:'sms_id']
      end

      if attributes.has_key?(:'to')
        self.to = attributes[:'to']
      end

      if attributes.has_key?(:'type')
        self.type = attributes[:'type']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end

      if attributes.has_key?(:'vendor_account_id')
        self.vendor_account_id = attributes[:'vendor_account_id']
      end

      if attributes.has_key?(:'vendor_id')
        self.vendor_id = attributes[:'vendor_id']
      end

      if attributes.has_key?(:'vendor_name')
        self.vendor_name = attributes[:'vendor_name']
      end

      if attributes.has_key?(:'vendor_sms_id')
        self.vendor_sms_id = attributes[:'vendor_sms_id']
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
          create_date == o.create_date &&
          delivery_status == o.delivery_status &&
          delivery_status_timestamp == o.delivery_status_timestamp &&
          from == o.from &&
          id == o.id &&
          nucleus_business_id == o.nucleus_business_id &&
          nucleus_client_id == o.nucleus_client_id &&
          reply_message == o.reply_message &&
          secondary_id == o.secondary_id &&
          sms_id == o.sms_id &&
          to == o.to &&
          type == o.type &&
          update_date == o.update_date &&
          vendor_account_id == o.vendor_account_id &&
          vendor_id == o.vendor_id &&
          vendor_name == o.vendor_name &&
          vendor_sms_id == o.vendor_sms_id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [create_date, delivery_status, delivery_status_timestamp, from, id, nucleus_business_id, nucleus_client_id, reply_message, secondary_id, sms_id, to, type, update_date, vendor_account_id, vendor_id, vendor_name, vendor_sms_id].hash
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
        temp_model = IntegrationApi.const_get(type).new
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
