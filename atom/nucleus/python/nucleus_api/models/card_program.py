# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class CardProgram(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'card_network': 'str',
        'card_processor': 'str',
        'card_type': 'str',
        'client_id': 'str',
        'code': 'str',
        'create_date': 'datetime',
        'description': 'str',
        'id': 'str',
        'is_active': 'bool',
        'is_delegated_authority': 'bool',
        'issuing_bank': 'str',
        'metadata': 'dict(str, str)',
        'name': 'str',
        'program_manager': 'str',
        'secondary_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'card_network': 'card_network',
        'card_processor': 'card_processor',
        'card_type': 'card_type',
        'client_id': 'client_id',
        'code': 'code',
        'create_date': 'create_date',
        'description': 'description',
        'id': 'id',
        'is_active': 'is_active',
        'is_delegated_authority': 'is_delegated_authority',
        'issuing_bank': 'issuing_bank',
        'metadata': 'metadata',
        'name': 'name',
        'program_manager': 'program_manager',
        'secondary_id': 'secondary_id',
        'update_date': 'update_date'
    }

    def __init__(self, card_network=None, card_processor=None, card_type=None, client_id=None, code=None, create_date=None, description=None, id=None, is_active=None, is_delegated_authority=None, issuing_bank=None, metadata=None, name=None, program_manager=None, secondary_id=None, update_date=None, _configuration=None):  # noqa: E501
        """CardProgram - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._card_network = None
        self._card_processor = None
        self._card_type = None
        self._client_id = None
        self._code = None
        self._create_date = None
        self._description = None
        self._id = None
        self._is_active = None
        self._is_delegated_authority = None
        self._issuing_bank = None
        self._metadata = None
        self._name = None
        self._program_manager = None
        self._secondary_id = None
        self._update_date = None
        self.discriminator = None

        self.card_network = card_network
        if card_processor is not None:
            self.card_processor = card_processor
        self.card_type = card_type
        if client_id is not None:
            self.client_id = client_id
        if code is not None:
            self.code = code
        if create_date is not None:
            self.create_date = create_date
        if description is not None:
            self.description = description
        if id is not None:
            self.id = id
        if is_active is not None:
            self.is_active = is_active
        if is_delegated_authority is not None:
            self.is_delegated_authority = is_delegated_authority
        self.issuing_bank = issuing_bank
        if metadata is not None:
            self.metadata = metadata
        self.name = name
        if program_manager is not None:
            self.program_manager = program_manager
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def card_network(self):
        """Gets the card_network of this CardProgram.  # noqa: E501

        cardNetwork  # noqa: E501

        :return: The card_network of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._card_network

    @card_network.setter
    def card_network(self, card_network):
        """Sets the card_network of this CardProgram.

        cardNetwork  # noqa: E501

        :param card_network: The card_network of this CardProgram.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and card_network is None:
            raise ValueError("Invalid value for `card_network`, must not be `None`")  # noqa: E501

        self._card_network = card_network

    @property
    def card_processor(self):
        """Gets the card_processor of this CardProgram.  # noqa: E501

        cardProcessor  # noqa: E501

        :return: The card_processor of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._card_processor

    @card_processor.setter
    def card_processor(self, card_processor):
        """Sets the card_processor of this CardProgram.

        cardProcessor  # noqa: E501

        :param card_processor: The card_processor of this CardProgram.  # noqa: E501
        :type: str
        """

        self._card_processor = card_processor

    @property
    def card_type(self):
        """Gets the card_type of this CardProgram.  # noqa: E501

        cardType  # noqa: E501

        :return: The card_type of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._card_type

    @card_type.setter
    def card_type(self, card_type):
        """Sets the card_type of this CardProgram.

        cardType  # noqa: E501

        :param card_type: The card_type of this CardProgram.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and card_type is None:
            raise ValueError("Invalid value for `card_type`, must not be `None`")  # noqa: E501

        self._card_type = card_type

    @property
    def client_id(self):
        """Gets the client_id of this CardProgram.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this CardProgram.

        clientId  # noqa: E501

        :param client_id: The client_id of this CardProgram.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def code(self):
        """Gets the code of this CardProgram.  # noqa: E501

        code  # noqa: E501

        :return: The code of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """Sets the code of this CardProgram.

        code  # noqa: E501

        :param code: The code of this CardProgram.  # noqa: E501
        :type: str
        """

        self._code = code

    @property
    def create_date(self):
        """Gets the create_date of this CardProgram.  # noqa: E501


        :return: The create_date of this CardProgram.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this CardProgram.


        :param create_date: The create_date of this CardProgram.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def description(self):
        """Gets the description of this CardProgram.  # noqa: E501

        description  # noqa: E501

        :return: The description of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this CardProgram.

        description  # noqa: E501

        :param description: The description of this CardProgram.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def id(self):
        """Gets the id of this CardProgram.  # noqa: E501


        :return: The id of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CardProgram.


        :param id: The id of this CardProgram.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_active(self):
        """Gets the is_active of this CardProgram.  # noqa: E501

        is_active  # noqa: E501

        :return: The is_active of this CardProgram.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this CardProgram.

        is_active  # noqa: E501

        :param is_active: The is_active of this CardProgram.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def is_delegated_authority(self):
        """Gets the is_delegated_authority of this CardProgram.  # noqa: E501

        is_delegated_authority  # noqa: E501

        :return: The is_delegated_authority of this CardProgram.  # noqa: E501
        :rtype: bool
        """
        return self._is_delegated_authority

    @is_delegated_authority.setter
    def is_delegated_authority(self, is_delegated_authority):
        """Sets the is_delegated_authority of this CardProgram.

        is_delegated_authority  # noqa: E501

        :param is_delegated_authority: The is_delegated_authority of this CardProgram.  # noqa: E501
        :type: bool
        """

        self._is_delegated_authority = is_delegated_authority

    @property
    def issuing_bank(self):
        """Gets the issuing_bank of this CardProgram.  # noqa: E501

        issuingBank  # noqa: E501

        :return: The issuing_bank of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._issuing_bank

    @issuing_bank.setter
    def issuing_bank(self, issuing_bank):
        """Sets the issuing_bank of this CardProgram.

        issuingBank  # noqa: E501

        :param issuing_bank: The issuing_bank of this CardProgram.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and issuing_bank is None:
            raise ValueError("Invalid value for `issuing_bank`, must not be `None`")  # noqa: E501

        self._issuing_bank = issuing_bank

    @property
    def metadata(self):
        """Gets the metadata of this CardProgram.  # noqa: E501


        :return: The metadata of this CardProgram.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this CardProgram.


        :param metadata: The metadata of this CardProgram.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def name(self):
        """Gets the name of this CardProgram.  # noqa: E501

        name  # noqa: E501

        :return: The name of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this CardProgram.

        name  # noqa: E501

        :param name: The name of this CardProgram.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def program_manager(self):
        """Gets the program_manager of this CardProgram.  # noqa: E501

        programManager  # noqa: E501

        :return: The program_manager of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._program_manager

    @program_manager.setter
    def program_manager(self, program_manager):
        """Sets the program_manager of this CardProgram.

        programManager  # noqa: E501

        :param program_manager: The program_manager of this CardProgram.  # noqa: E501
        :type: str
        """

        self._program_manager = program_manager

    @property
    def secondary_id(self):
        """Gets the secondary_id of this CardProgram.  # noqa: E501


        :return: The secondary_id of this CardProgram.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this CardProgram.


        :param secondary_id: The secondary_id of this CardProgram.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def update_date(self):
        """Gets the update_date of this CardProgram.  # noqa: E501


        :return: The update_date of this CardProgram.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this CardProgram.


        :param update_date: The update_date of this CardProgram.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(CardProgram, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, CardProgram):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, CardProgram):
            return True

        return self.to_dict() != other.to_dict()
