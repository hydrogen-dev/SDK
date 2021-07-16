# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.3
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class Currency(object):
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
        'alphabetic_code': 'str',
        'currency': 'str',
        'id': 'str',
        'numeric_code': 'str'
    }

    attribute_map = {
        'alphabetic_code': 'alphabetic_code',
        'currency': 'currency',
        'id': 'id',
        'numeric_code': 'numeric_code'
    }

    def __init__(self, alphabetic_code=None, currency=None, id=None, numeric_code=None, _configuration=None):  # noqa: E501
        """Currency - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._alphabetic_code = None
        self._currency = None
        self._id = None
        self._numeric_code = None
        self.discriminator = None

        if alphabetic_code is not None:
            self.alphabetic_code = alphabetic_code
        if currency is not None:
            self.currency = currency
        if id is not None:
            self.id = id
        if numeric_code is not None:
            self.numeric_code = numeric_code

    @property
    def alphabetic_code(self):
        """Gets the alphabetic_code of this Currency.  # noqa: E501

        alphabetic_code  # noqa: E501

        :return: The alphabetic_code of this Currency.  # noqa: E501
        :rtype: str
        """
        return self._alphabetic_code

    @alphabetic_code.setter
    def alphabetic_code(self, alphabetic_code):
        """Sets the alphabetic_code of this Currency.

        alphabetic_code  # noqa: E501

        :param alphabetic_code: The alphabetic_code of this Currency.  # noqa: E501
        :type: str
        """

        self._alphabetic_code = alphabetic_code

    @property
    def currency(self):
        """Gets the currency of this Currency.  # noqa: E501

        currency  # noqa: E501

        :return: The currency of this Currency.  # noqa: E501
        :rtype: str
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """Sets the currency of this Currency.

        currency  # noqa: E501

        :param currency: The currency of this Currency.  # noqa: E501
        :type: str
        """

        self._currency = currency

    @property
    def id(self):
        """Gets the id of this Currency.  # noqa: E501


        :return: The id of this Currency.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Currency.


        :param id: The id of this Currency.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def numeric_code(self):
        """Gets the numeric_code of this Currency.  # noqa: E501

        numeric_code  # noqa: E501

        :return: The numeric_code of this Currency.  # noqa: E501
        :rtype: str
        """
        return self._numeric_code

    @numeric_code.setter
    def numeric_code(self, numeric_code):
        """Sets the numeric_code of this Currency.

        numeric_code  # noqa: E501

        :param numeric_code: The numeric_code of this Currency.  # noqa: E501
        :type: str
        """

        self._numeric_code = numeric_code

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
        if issubclass(Currency, dict):
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
        if not isinstance(other, Currency):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Currency):
            return True

        return self.to_dict() != other.to_dict()
