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
  class SpecificFundingRequestResponse
    # ID of the funding request
    attr_accessor :id

    # Datetime the funding request was created
    attr_accessor :create_date

    # The ID for the account that will be receiving the funding request
    attr_accessor :account_id

    # The type of the funding transaction. Value may be bank_transfer, wire_transfer, cash, debit_card, credit_card, check, stock_certificate, digital_wallet, money_order, account_transfer, or other
    attr_accessor :funding_type

    # Status of the funding request. Value may be request_received, request_initiated, request_declined, request_cancelled, or request_completed. In the case of a recurring request, the status remains request_received until the end date of the request
    attr_accessor :funding_status

    # Frequency of the funding request defined by your firm. Value may be one_time, daily, weekly, monthly, quarterly, or annually
    attr_accessor :frequency_unit

    # Indicates if the funding request is a deposit. true indicates it is a deposit, false a withdrawal
    attr_accessor :is_deposit

    # The date that the funding request should start
    attr_accessor :start_date

    # In the case that the funding request is recurring, the date that the funding request should stop occurring
    attr_accessor :end_date

    # The last date a recurring deposit or withdrawal was made to/from an account
    attr_accessor :last_request_date

    # The next date a recurring deposit or withdrawal is scheduled to/from an account
    attr_accessor :next_request_date

    # Number of frequency_unit between each request. For example, if the frequency_unit is weekly and the frequency is 2, this means the funding request occurs every two weeks. Default is 1
    attr_accessor :frequency

    # Description for the request, such as “Initial Funding”
    attr_accessor :description

    # Amount that is included in the funding request
    attr_accessor :amount

    # In the case that the funding request relates to a specific bank link, the ID of the bank link providing the funds for the funding request
    attr_accessor :bank_link_id

    # In the case that the funding request relates to the transfer of an external account into the account, the ID of the transfer
    attr_accessor :transfer_id

    # In the case that the funding request is attached to a Support Ticket in the Electron API, the ID of the ticket
    attr_accessor :support_ticket_id

    # Indicates if the funding request is currently active. Defaults to true which indicates it is active.
    attr_accessor :is_active

    # Custom information associated with the funding request in the format key:value.
    attr_accessor :metadata

    attr_accessor :secondary_id

    # Datetime the funding request was last updated
    attr_accessor :update_date

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
        :'id' => :'id',
        :'create_date' => :'create_date',
        :'account_id' => :'account_id',
        :'funding_type' => :'funding_type',
        :'funding_status' => :'funding_status',
        :'frequency_unit' => :'frequency_unit',
        :'is_deposit' => :'is_deposit',
        :'start_date' => :'start_date',
        :'end_date' => :'end_date',
        :'last_request_date' => :'last_request_date',
        :'next_request_date' => :'next_request_date',
        :'frequency' => :'frequency',
        :'description' => :'description',
        :'amount' => :'amount',
        :'bank_link_id' => :'bank_link_id',
        :'transfer_id' => :'transfer_id',
        :'support_ticket_id' => :'support_ticket_id',
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
        :'account_id' => :'String',
        :'funding_type' => :'String',
        :'funding_status' => :'String',
        :'frequency_unit' => :'String',
        :'is_deposit' => :'BOOLEAN',
        :'start_date' => :'Date',
        :'end_date' => :'Date',
        :'last_request_date' => :'Date',
        :'next_request_date' => :'Date',
        :'frequency' => :'Integer',
        :'description' => :'String',
        :'amount' => :'Float',
        :'bank_link_id' => :'String',
        :'transfer_id' => :'String',
        :'support_ticket_id' => :'String',
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

      if attributes.has_key?(:'account_id')
        self.account_id = attributes[:'account_id']
      end

      if attributes.has_key?(:'funding_type')
        self.funding_type = attributes[:'funding_type']
      end

      if attributes.has_key?(:'funding_status')
        self.funding_status = attributes[:'funding_status']
      end

      if attributes.has_key?(:'frequency_unit')
        self.frequency_unit = attributes[:'frequency_unit']
      end

      if attributes.has_key?(:'is_deposit')
        self.is_deposit = attributes[:'is_deposit']
      end

      if attributes.has_key?(:'start_date')
        self.start_date = attributes[:'start_date']
      end

      if attributes.has_key?(:'end_date')
        self.end_date = attributes[:'end_date']
      end

      if attributes.has_key?(:'last_request_date')
        self.last_request_date = attributes[:'last_request_date']
      end

      if attributes.has_key?(:'next_request_date')
        self.next_request_date = attributes[:'next_request_date']
      end

      if attributes.has_key?(:'frequency')
        self.frequency = attributes[:'frequency']
      end

      if attributes.has_key?(:'description')
        self.description = attributes[:'description']
      end

      if attributes.has_key?(:'amount')
        self.amount = attributes[:'amount']
      end

      if attributes.has_key?(:'bank_link_id')
        self.bank_link_id = attributes[:'bank_link_id']
      end

      if attributes.has_key?(:'transfer_id')
        self.transfer_id = attributes[:'transfer_id']
      end

      if attributes.has_key?(:'support_ticket_id')
        self.support_ticket_id = attributes[:'support_ticket_id']
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
      if @account_id.nil?
        invalid_properties.push('invalid value for "account_id", account_id cannot be nil.')
      end

      if @funding_type.nil?
        invalid_properties.push('invalid value for "funding_type", funding_type cannot be nil.')
      end

      if @funding_status.nil?
        invalid_properties.push('invalid value for "funding_status", funding_status cannot be nil.')
      end

      if @frequency_unit.nil?
        invalid_properties.push('invalid value for "frequency_unit", frequency_unit cannot be nil.')
      end

      if @is_deposit.nil?
        invalid_properties.push('invalid value for "is_deposit", is_deposit cannot be nil.')
      end

      if @start_date.nil?
        invalid_properties.push('invalid value for "start_date", start_date cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @account_id.nil?
      return false if @funding_type.nil?
      funding_type_validator = EnumAttributeValidator.new('String', ['bank_transfer', 'wire_transfer', 'cash', 'debit_card', 'credit_card', 'check', 'stock_certificate', 'digital_wallet', 'money_order', 'account_transfer', 'other'])
      return false unless funding_type_validator.valid?(@funding_type)
      return false if @funding_status.nil?
      funding_status_validator = EnumAttributeValidator.new('String', ['request_received', 'request_initiated', 'request_cancelled', 'request_completed'])
      return false unless funding_status_validator.valid?(@funding_status)
      return false if @frequency_unit.nil?
      frequency_unit_validator = EnumAttributeValidator.new('String', ['one_time', 'daily', 'weekly', 'monthly', 'quarterly', 'annually'])
      return false unless frequency_unit_validator.valid?(@frequency_unit)
      return false if @is_deposit.nil?
      return false if @start_date.nil?
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] funding_type Object to be assigned
    def funding_type=(funding_type)
      validator = EnumAttributeValidator.new('String', ['bank_transfer', 'wire_transfer', 'cash', 'debit_card', 'credit_card', 'check', 'stock_certificate', 'digital_wallet', 'money_order', 'account_transfer', 'other'])
      unless validator.valid?(funding_type)
        fail ArgumentError, 'invalid value for "funding_type", must be one of #{validator.allowable_values}.'
      end
      @funding_type = funding_type
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] funding_status Object to be assigned
    def funding_status=(funding_status)
      validator = EnumAttributeValidator.new('String', ['request_received', 'request_initiated', 'request_cancelled', 'request_completed'])
      unless validator.valid?(funding_status)
        fail ArgumentError, 'invalid value for "funding_status", must be one of #{validator.allowable_values}.'
      end
      @funding_status = funding_status
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] frequency_unit Object to be assigned
    def frequency_unit=(frequency_unit)
      validator = EnumAttributeValidator.new('String', ['one_time', 'daily', 'weekly', 'monthly', 'quarterly', 'annually'])
      unless validator.valid?(frequency_unit)
        fail ArgumentError, 'invalid value for "frequency_unit", must be one of #{validator.allowable_values}.'
      end
      @frequency_unit = frequency_unit
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          create_date == o.create_date &&
          account_id == o.account_id &&
          funding_type == o.funding_type &&
          funding_status == o.funding_status &&
          frequency_unit == o.frequency_unit &&
          is_deposit == o.is_deposit &&
          start_date == o.start_date &&
          end_date == o.end_date &&
          last_request_date == o.last_request_date &&
          next_request_date == o.next_request_date &&
          frequency == o.frequency &&
          description == o.description &&
          amount == o.amount &&
          bank_link_id == o.bank_link_id &&
          transfer_id == o.transfer_id &&
          support_ticket_id == o.support_ticket_id &&
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
      [id, create_date, account_id, funding_type, funding_status, frequency_unit, is_deposit, start_date, end_date, last_request_date, next_request_date, frequency, description, amount, bank_link_id, transfer_id, support_ticket_id, is_active, metadata, secondary_id, update_date].hash
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
