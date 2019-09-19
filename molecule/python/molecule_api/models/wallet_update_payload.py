# coding: utf-8

"""
    Hydrogen Molecule API

    The Hydrogen Molecule API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from molecule_api.models.secondary_id import SecondaryId  # noqa: F401,E501
from molecule_api.models.wallet_create_client import WalletCreateClient  # noqa: F401,E501
from molecule_api.models.wallet_create_whitelist import WalletCreateWhitelist  # noqa: F401,E501


class WalletUpdatePayload(object):
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
        'name': 'str',
        'type': 'str',
        'clients': 'list[WalletCreateClient]',
        'token_whitelists': 'list[WalletCreateWhitelist]',
        'is_active': 'bool',
        'metadata': 'object',
        'secondary_id': 'SecondaryId'
    }

    attribute_map = {
        'name': 'name',
        'type': 'type',
        'clients': 'clients',
        'token_whitelists': 'token_whitelists',
        'is_active': 'is_active',
        'metadata': 'metadata',
        'secondary_id': 'secondary_id'
    }

    def __init__(self, name=None, type=None, clients=None, token_whitelists=None, is_active=True, metadata=None, secondary_id=None):  # noqa: E501
        """WalletUpdatePayload - a model defined in Swagger"""  # noqa: E501

        self._name = None
        self._type = None
        self._clients = None
        self._token_whitelists = None
        self._is_active = None
        self._metadata = None
        self._secondary_id = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if type is not None:
            self.type = type
        if clients is not None:
            self.clients = clients
        if token_whitelists is not None:
            self.token_whitelists = token_whitelists
        if is_active is not None:
            self.is_active = is_active
        if metadata is not None:
            self.metadata = metadata
        if secondary_id is not None:
            self.secondary_id = secondary_id

    @property
    def name(self):
        """Gets the name of this WalletUpdatePayload.  # noqa: E501

        Name of the wallet  # noqa: E501

        :return: The name of this WalletUpdatePayload.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this WalletUpdatePayload.

        Name of the wallet  # noqa: E501

        :param name: The name of this WalletUpdatePayload.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def type(self):
        """Gets the type of this WalletUpdatePayload.  # noqa: E501

        Type of the wallet. Can be individual, business, trust, or contract  # noqa: E501

        :return: The type of this WalletUpdatePayload.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this WalletUpdatePayload.

        Type of the wallet. Can be individual, business, trust, or contract  # noqa: E501

        :param type: The type of this WalletUpdatePayload.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def clients(self):
        """Gets the clients of this WalletUpdatePayload.  # noqa: E501

        List of nucleus clients associated with the wallet and their association type  # noqa: E501

        :return: The clients of this WalletUpdatePayload.  # noqa: E501
        :rtype: list[WalletCreateClient]
        """
        return self._clients

    @clients.setter
    def clients(self, clients):
        """Sets the clients of this WalletUpdatePayload.

        List of nucleus clients associated with the wallet and their association type  # noqa: E501

        :param clients: The clients of this WalletUpdatePayload.  # noqa: E501
        :type: list[WalletCreateClient]
        """

        self._clients = clients

    @property
    def token_whitelists(self):
        """Gets the token_whitelists of this WalletUpdatePayload.  # noqa: E501

        List of tokens where the wallet is whitelisted  # noqa: E501

        :return: The token_whitelists of this WalletUpdatePayload.  # noqa: E501
        :rtype: list[WalletCreateWhitelist]
        """
        return self._token_whitelists

    @token_whitelists.setter
    def token_whitelists(self, token_whitelists):
        """Sets the token_whitelists of this WalletUpdatePayload.

        List of tokens where the wallet is whitelisted  # noqa: E501

        :param token_whitelists: The token_whitelists of this WalletUpdatePayload.  # noqa: E501
        :type: list[WalletCreateWhitelist]
        """

        self._token_whitelists = token_whitelists

    @property
    def is_active(self):
        """Gets the is_active of this WalletUpdatePayload.  # noqa: E501

        Indicates if the wallet is active. Defaults to true which indicates it is active and available to be used  # noqa: E501

        :return: The is_active of this WalletUpdatePayload.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this WalletUpdatePayload.

        Indicates if the wallet is active. Defaults to true which indicates it is active and available to be used  # noqa: E501

        :param is_active: The is_active of this WalletUpdatePayload.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def metadata(self):
        """Gets the metadata of this WalletUpdatePayload.  # noqa: E501

        Custom information associated with the account in the format key:value  # noqa: E501

        :return: The metadata of this WalletUpdatePayload.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this WalletUpdatePayload.

        Custom information associated with the account in the format key:value  # noqa: E501

        :param metadata: The metadata of this WalletUpdatePayload.  # noqa: E501
        :type: object
        """

        self._metadata = metadata

    @property
    def secondary_id(self):
        """Gets the secondary_id of this WalletUpdatePayload.  # noqa: E501


        :return: The secondary_id of this WalletUpdatePayload.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this WalletUpdatePayload.


        :param secondary_id: The secondary_id of this WalletUpdatePayload.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

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
        if issubclass(WalletUpdatePayload, dict):
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
        if not isinstance(other, WalletUpdatePayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
