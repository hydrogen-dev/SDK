=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'date'

module NucleusApi
  # OrderVoClone Object
  class OrderVoClone
    # accountId
    attr_accessor :account_id

    # date
    attr_accessor :date

    # isRead
    attr_accessor :is_read

    # metadata
    attr_accessor :metadata

    # modelId
    attr_accessor :model_id

    # orderBulkId
    attr_accessor :order_bulk_id

    # orderTicketId
    attr_accessor :order_ticket_id

    # orderType
    attr_accessor :order_type

    # portfolioId
    attr_accessor :portfolio_id

    attr_accessor :price

    # quantity
    attr_accessor :quantity

    # securityId
    attr_accessor :security_id

    # transactionCodeId
    attr_accessor :transaction_code_id

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'account_id' => :'account_id',
        :'date' => :'date',
        :'is_read' => :'is_read',
        :'metadata' => :'metadata',
        :'model_id' => :'model_id',
        :'order_bulk_id' => :'order_bulk_id',
        :'order_ticket_id' => :'order_ticket_id',
        :'order_type' => :'order_type',
        :'portfolio_id' => :'portfolio_id',
        :'price' => :'price',
        :'quantity' => :'quantity',
        :'security_id' => :'security_id',
        :'transaction_code_id' => :'transaction_code_id'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'account_id' => :'String',
        :'date' => :'DateTime',
        :'is_read' => :'BOOLEAN',
        :'metadata' => :'Hash<String, String>',
        :'model_id' => :'String',
        :'order_bulk_id' => :'String',
        :'order_ticket_id' => :'String',
        :'order_type' => :'String',
        :'portfolio_id' => :'String',
        :'price' => :'Float',
        :'quantity' => :'Float',
        :'security_id' => :'String',
        :'transaction_code_id' => :'String'
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

      if attributes.has_key?(:'date')
        self.date = attributes[:'date']
      end

      if attributes.has_key?(:'is_read')
        self.is_read = attributes[:'is_read']
      end

      if attributes.has_key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.has_key?(:'model_id')
        self.model_id = attributes[:'model_id']
      end

      if attributes.has_key?(:'order_bulk_id')
        self.order_bulk_id = attributes[:'order_bulk_id']
      end

      if attributes.has_key?(:'order_ticket_id')
        self.order_ticket_id = attributes[:'order_ticket_id']
      end

      if attributes.has_key?(:'order_type')
        self.order_type = attributes[:'order_type']
      end

      if attributes.has_key?(:'portfolio_id')
        self.portfolio_id = attributes[:'portfolio_id']
      end

      if attributes.has_key?(:'price')
        self.price = attributes[:'price']
      end

      if attributes.has_key?(:'quantity')
        self.quantity = attributes[:'quantity']
      end

      if attributes.has_key?(:'security_id')
        self.security_id = attributes[:'security_id']
      end

      if attributes.has_key?(:'transaction_code_id')
        self.transaction_code_id = attributes[:'transaction_code_id']
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
          account_id == o.account_id &&
          date == o.date &&
          is_read == o.is_read &&
          metadata == o.metadata &&
          model_id == o.model_id &&
          order_bulk_id == o.order_bulk_id &&
          order_ticket_id == o.order_ticket_id &&
          order_type == o.order_type &&
          portfolio_id == o.portfolio_id &&
          price == o.price &&
          quantity == o.quantity &&
          security_id == o.security_id &&
          transaction_code_id == o.transaction_code_id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [account_id, date, is_read, metadata, model_id, order_bulk_id, order_ticket_id, order_type, portfolio_id, price, quantity, security_id, transaction_code_id].hash
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
