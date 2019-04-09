=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.2-SNAPSHOT

=end

require 'date'

module AtomApi
  class SupportTicketCommentPayload
    # The ID of the support ticket to which the comment belongs
    attr_accessor :support_ticket_id

    # Details and description of the information included in the support ticket comment
    attr_accessor :description

    # Indicates if the comment has a document attached. Defaults to false which indicates it does not have an attachment
    attr_accessor :has_attachment

    # Indicates if the support ticket comment has been added by an internal administrator (as opposed to a client). Defaults to false which indicates that it has not been added by an administrator
    attr_accessor :is_admin

    # Indicates if the support ticket comment has been read by the internal user to whom the support ticket is assigned for resolution. Defaults to false which indicates that it has not been read
    attr_accessor :is_read

    attr_accessor :support_ticket_document

    attr_accessor :secondary_id

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'support_ticket_id' => :'support_ticket_id',
        :'description' => :'description',
        :'has_attachment' => :'has_attachment',
        :'is_admin' => :'is_admin',
        :'is_read' => :'is_read',
        :'support_ticket_document' => :'support_ticket_document',
        :'secondary_id' => :'secondary_id'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'support_ticket_id' => :'String',
        :'description' => :'String',
        :'has_attachment' => :'BOOLEAN',
        :'is_admin' => :'BOOLEAN',
        :'is_read' => :'BOOLEAN',
        :'support_ticket_document' => :'Array<SupportTicketCommentPayloadSupportTicketDocument>',
        :'secondary_id' => :'SecondaryId'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'support_ticket_id')
        self.support_ticket_id = attributes[:'support_ticket_id']
      end

      if attributes.has_key?(:'description')
        self.description = attributes[:'description']
      end

      if attributes.has_key?(:'has_attachment')
        self.has_attachment = attributes[:'has_attachment']
      else
        self.has_attachment = false
      end

      if attributes.has_key?(:'is_admin')
        self.is_admin = attributes[:'is_admin']
      else
        self.is_admin = false
      end

      if attributes.has_key?(:'is_read')
        self.is_read = attributes[:'is_read']
      else
        self.is_read = false
      end

      if attributes.has_key?(:'support_ticket_document')
        if (value = attributes[:'support_ticket_document']).is_a?(Array)
          self.support_ticket_document = value
        end
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @support_ticket_id.nil?
        invalid_properties.push('invalid value for "support_ticket_id", support_ticket_id cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @support_ticket_id.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          support_ticket_id == o.support_ticket_id &&
          description == o.description &&
          has_attachment == o.has_attachment &&
          is_admin == o.is_admin &&
          is_read == o.is_read &&
          support_ticket_document == o.support_ticket_document &&
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
      [support_ticket_id, description, has_attachment, is_admin, is_read, support_ticket_document, secondary_id].hash
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