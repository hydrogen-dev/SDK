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


class CurrencyTransferPayload(object):
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
        'currency_symbol': 'str',
        'amount': 'float'
    }

    attribute_map = {
        'sender_wallet_id': 'sender_wallet_id',
        'receiver_wallet_id': 'receiver_wallet_id',
        'currency_symbol': 'currency_symbol',
        'amount': 'amount'
    }

    def __init__(self, sender_wallet_id=None, receiver_wallet_id=None, currency_symbol=None, amount=None):  # noqa: E501
        """CurrencyTransferPayload - a model defined in Swagger"""  # noqa: E501

        self._sender_wallet_id = None
        self._receiver_wallet_id = None
        self._currency_symbol = None
        self._amount = None
        self.discriminator = None

        self.sender_wallet_id = sender_wallet_id
        self.receiver_wallet_id = receiver_wallet_id
        self.currency_symbol = currency_symbol
        self.amount = amount

    @property
    def sender_wallet_id(self):
        """Gets the sender_wallet_id of this CurrencyTransferPayload.  # noqa: E501

        The uuid of the sender wallet.  # noqa: E501

        :return: The sender_wallet_id of this CurrencyTransferPayload.  # noqa: E501
        :rtype: str
        """
        return self._sender_wallet_id

    @sender_wallet_id.setter
    def sender_wallet_id(self, sender_wallet_id):
        """Sets the sender_wallet_id of this CurrencyTransferPayload.

        The uuid of the sender wallet.  # noqa: E501

        :param sender_wallet_id: The sender_wallet_id of this CurrencyTransferPayload.  # noqa: E501
        :type: str
        """
        if sender_wallet_id is None:
            raise ValueError("Invalid value for `sender_wallet_id`, must not be `None`")  # noqa: E501

        self._sender_wallet_id = sender_wallet_id

    @property
    def receiver_wallet_id(self):
        """Gets the receiver_wallet_id of this CurrencyTransferPayload.  # noqa: E501

        The uuid of the receiver wallet.  # noqa: E501

        :return: The receiver_wallet_id of this CurrencyTransferPayload.  # noqa: E501
        :rtype: str
        """
        return self._receiver_wallet_id

    @receiver_wallet_id.setter
    def receiver_wallet_id(self, receiver_wallet_id):
        """Sets the receiver_wallet_id of this CurrencyTransferPayload.

        The uuid of the receiver wallet.  # noqa: E501

        :param receiver_wallet_id: The receiver_wallet_id of this CurrencyTransferPayload.  # noqa: E501
        :type: str
        """
        if receiver_wallet_id is None:
            raise ValueError("Invalid value for `receiver_wallet_id`, must not be `None`")  # noqa: E501

        self._receiver_wallet_id = receiver_wallet_id

    @property
    def currency_symbol(self):
        """Gets the currency_symbol of this CurrencyTransferPayload.  # noqa: E501

        The uuid of the token being transferred.  # noqa: E501

        :return: The currency_symbol of this CurrencyTransferPayload.  # noqa: E501
        :rtype: str
        """
        return self._currency_symbol

    @currency_symbol.setter
    def currency_symbol(self, currency_symbol):
        """Sets the currency_symbol of this CurrencyTransferPayload.

        The uuid of the token being transferred.  # noqa: E501

        :param currency_symbol: The currency_symbol of this CurrencyTransferPayload.  # noqa: E501
        :type: str
        """
        if currency_symbol is None:
            raise ValueError("Invalid value for `currency_symbol`, must not be `None`")  # noqa: E501

        self._currency_symbol = currency_symbol

    @property
    def amount(self):
        """Gets the amount of this CurrencyTransferPayload.  # noqa: E501

        Amount of tokens to be transferred.  # noqa: E501

        :return: The amount of this CurrencyTransferPayload.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this CurrencyTransferPayload.

        Amount of tokens to be transferred.  # noqa: E501

        :param amount: The amount of this CurrencyTransferPayload.  # noqa: E501
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
        if issubclass(CurrencyTransferPayload, dict):
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
        if not isinstance(other, CurrencyTransferPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
