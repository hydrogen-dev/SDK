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


class TokenTransferPayload(object):
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
        'sender_wallet_id': 'str',
        'receiver_wallet_id': 'str',
        'token_id': 'str',
        'amount': 'float'
    }

    attribute_map = {
        'sender_wallet_id': 'sender_wallet_id',
        'receiver_wallet_id': 'receiver_wallet_id',
        'token_id': 'token_id',
        'amount': 'amount'
    }

    def __init__(self, sender_wallet_id=None, receiver_wallet_id=None, token_id=None, amount=None):  # noqa: E501
        """TokenTransferPayload - a model defined in Swagger"""  # noqa: E501

        self._sender_wallet_id = None
        self._receiver_wallet_id = None
        self._token_id = None
        self._amount = None
        self.discriminator = None

        self.sender_wallet_id = sender_wallet_id
        self.receiver_wallet_id = receiver_wallet_id
        self.token_id = token_id
        self.amount = amount

    @property
    def sender_wallet_id(self):
        """Gets the sender_wallet_id of this TokenTransferPayload.  # noqa: E501

        The uuid of the sender wallet.  # noqa: E501

        :return: The sender_wallet_id of this TokenTransferPayload.  # noqa: E501
        :rtype: str
        """
        return self._sender_wallet_id

    @sender_wallet_id.setter
    def sender_wallet_id(self, sender_wallet_id):
        """Sets the sender_wallet_id of this TokenTransferPayload.

        The uuid of the sender wallet.  # noqa: E501

        :param sender_wallet_id: The sender_wallet_id of this TokenTransferPayload.  # noqa: E501
        :type: str
        """
        if sender_wallet_id is None:
            raise ValueError("Invalid value for `sender_wallet_id`, must not be `None`")  # noqa: E501

        self._sender_wallet_id = sender_wallet_id

    @property
    def receiver_wallet_id(self):
        """Gets the receiver_wallet_id of this TokenTransferPayload.  # noqa: E501

        The uuid of the receiver wallet.  # noqa: E501

        :return: The receiver_wallet_id of this TokenTransferPayload.  # noqa: E501
        :rtype: str
        """
        return self._receiver_wallet_id

    @receiver_wallet_id.setter
    def receiver_wallet_id(self, receiver_wallet_id):
        """Sets the receiver_wallet_id of this TokenTransferPayload.

        The uuid of the receiver wallet.  # noqa: E501

        :param receiver_wallet_id: The receiver_wallet_id of this TokenTransferPayload.  # noqa: E501
        :type: str
        """
        if receiver_wallet_id is None:
            raise ValueError("Invalid value for `receiver_wallet_id`, must not be `None`")  # noqa: E501

        self._receiver_wallet_id = receiver_wallet_id

    @property
    def token_id(self):
        """Gets the token_id of this TokenTransferPayload.  # noqa: E501

        The uuid of the token being transfered.  # noqa: E501

        :return: The token_id of this TokenTransferPayload.  # noqa: E501
        :rtype: str
        """
        return self._token_id

    @token_id.setter
    def token_id(self, token_id):
        """Sets the token_id of this TokenTransferPayload.

        The uuid of the token being transfered.  # noqa: E501

        :param token_id: The token_id of this TokenTransferPayload.  # noqa: E501
        :type: str
        """
        if token_id is None:
            raise ValueError("Invalid value for `token_id`, must not be `None`")  # noqa: E501

        self._token_id = token_id

    @property
    def amount(self):
        """Gets the amount of this TokenTransferPayload.  # noqa: E501

        Amount of tokens to be transfered.  # noqa: E501

        :return: The amount of this TokenTransferPayload.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this TokenTransferPayload.

        Amount of tokens to be transfered.  # noqa: E501

        :param amount: The amount of this TokenTransferPayload.  # noqa: E501
        :type: float
        """
        if amount is None:
            raise ValueError("Invalid value for `amount`, must not be `None`")  # noqa: E501

        self._amount = amount

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
        if issubclass(TokenTransferPayload, dict):
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
        if not isinstance(other, TokenTransferPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
