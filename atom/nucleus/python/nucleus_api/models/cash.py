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


class Cash(object):
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
        'amount': 'float',
        'name': 'str',
        'transaction_type': 'str'
    }

    attribute_map = {
        'amount': 'amount',
        'name': 'name',
        'transaction_type': 'transaction_type'
    }

    def __init__(self, amount=None, name=None, transaction_type=None, _configuration=None):  # noqa: E501
        """Cash - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._amount = None
        self._name = None
        self._transaction_type = None
        self.discriminator = None

        self.amount = amount
        if name is not None:
            self.name = name
        self.transaction_type = transaction_type

    @property
    def amount(self):
        """Gets the amount of this Cash.  # noqa: E501

        cashAmount  # noqa: E501

        :return: The amount of this Cash.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this Cash.

        cashAmount  # noqa: E501

        :param amount: The amount of this Cash.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and amount is None:
            raise ValueError("Invalid value for `amount`, must not be `None`")  # noqa: E501

        self._amount = amount

    @property
    def name(self):
        """Gets the name of this Cash.  # noqa: E501

        cashName  # noqa: E501

        :return: The name of this Cash.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Cash.

        cashName  # noqa: E501

        :param name: The name of this Cash.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def transaction_type(self):
        """Gets the transaction_type of this Cash.  # noqa: E501

        cashTransactionType  # noqa: E501

        :return: The transaction_type of this Cash.  # noqa: E501
        :rtype: str
        """
        return self._transaction_type

    @transaction_type.setter
    def transaction_type(self, transaction_type):
        """Sets the transaction_type of this Cash.

        cashTransactionType  # noqa: E501

        :param transaction_type: The transaction_type of this Cash.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and transaction_type is None:
            raise ValueError("Invalid value for `transaction_type`, must not be `None`")  # noqa: E501

        self._transaction_type = transaction_type

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
        if issubclass(Cash, dict):
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
        if not isinstance(other, Cash):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Cash):
            return True

        return self.to_dict() != other.to_dict()
