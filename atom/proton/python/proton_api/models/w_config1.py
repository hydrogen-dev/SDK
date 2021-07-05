# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.9.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from proton_api.configuration import Configuration


class WConfig1(object):
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
        'w_min_minor': 'float',
        'w_min_major': 'float',
        'cash_amount': 'float',
        'w_max_major': 'float',
        'w_max_minor': 'float'
    }

    attribute_map = {
        'w_min_minor': 'w_min_minor',
        'w_min_major': 'w_min_major',
        'cash_amount': 'cash_amount',
        'w_max_major': 'w_max_major',
        'w_max_minor': 'w_max_minor'
    }

    def __init__(self, w_min_minor=0.05, w_min_major=0.05, cash_amount=0.0, w_max_major=1.0, w_max_minor=1.0, _configuration=None):  # noqa: E501
        """WConfig1 - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._w_min_minor = None
        self._w_min_major = None
        self._cash_amount = None
        self._w_max_major = None
        self._w_max_minor = None
        self.discriminator = None

        if w_min_minor is not None:
            self.w_min_minor = w_min_minor
        if w_min_major is not None:
            self.w_min_major = w_min_major
        if cash_amount is not None:
            self.cash_amount = cash_amount
        if w_max_major is not None:
            self.w_max_major = w_max_major
        if w_max_minor is not None:
            self.w_max_minor = w_max_minor

    @property
    def w_min_minor(self):
        """Gets the w_min_minor of this WConfig1.  # noqa: E501


        :return: The w_min_minor of this WConfig1.  # noqa: E501
        :rtype: float
        """
        return self._w_min_minor

    @w_min_minor.setter
    def w_min_minor(self, w_min_minor):
        """Sets the w_min_minor of this WConfig1.


        :param w_min_minor: The w_min_minor of this WConfig1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                w_min_minor is not None and w_min_minor > 1):  # noqa: E501
            raise ValueError("Invalid value for `w_min_minor`, must be a value less than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                w_min_minor is not None and w_min_minor < 0):  # noqa: E501
            raise ValueError("Invalid value for `w_min_minor`, must be a value greater than or equal to `0`")  # noqa: E501

        self._w_min_minor = w_min_minor

    @property
    def w_min_major(self):
        """Gets the w_min_major of this WConfig1.  # noqa: E501


        :return: The w_min_major of this WConfig1.  # noqa: E501
        :rtype: float
        """
        return self._w_min_major

    @w_min_major.setter
    def w_min_major(self, w_min_major):
        """Sets the w_min_major of this WConfig1.


        :param w_min_major: The w_min_major of this WConfig1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                w_min_major is not None and w_min_major > 1):  # noqa: E501
            raise ValueError("Invalid value for `w_min_major`, must be a value less than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                w_min_major is not None and w_min_major < 0):  # noqa: E501
            raise ValueError("Invalid value for `w_min_major`, must be a value greater than or equal to `0`")  # noqa: E501

        self._w_min_major = w_min_major

    @property
    def cash_amount(self):
        """Gets the cash_amount of this WConfig1.  # noqa: E501


        :return: The cash_amount of this WConfig1.  # noqa: E501
        :rtype: float
        """
        return self._cash_amount

    @cash_amount.setter
    def cash_amount(self, cash_amount):
        """Sets the cash_amount of this WConfig1.


        :param cash_amount: The cash_amount of this WConfig1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                cash_amount is not None and cash_amount > 1):  # noqa: E501
            raise ValueError("Invalid value for `cash_amount`, must be a value less than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                cash_amount is not None and cash_amount < 0):  # noqa: E501
            raise ValueError("Invalid value for `cash_amount`, must be a value greater than or equal to `0`")  # noqa: E501

        self._cash_amount = cash_amount

    @property
    def w_max_major(self):
        """Gets the w_max_major of this WConfig1.  # noqa: E501


        :return: The w_max_major of this WConfig1.  # noqa: E501
        :rtype: float
        """
        return self._w_max_major

    @w_max_major.setter
    def w_max_major(self, w_max_major):
        """Sets the w_max_major of this WConfig1.


        :param w_max_major: The w_max_major of this WConfig1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                w_max_major is not None and w_max_major > 1):  # noqa: E501
            raise ValueError("Invalid value for `w_max_major`, must be a value less than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                w_max_major is not None and w_max_major < 0):  # noqa: E501
            raise ValueError("Invalid value for `w_max_major`, must be a value greater than or equal to `0`")  # noqa: E501

        self._w_max_major = w_max_major

    @property
    def w_max_minor(self):
        """Gets the w_max_minor of this WConfig1.  # noqa: E501


        :return: The w_max_minor of this WConfig1.  # noqa: E501
        :rtype: float
        """
        return self._w_max_minor

    @w_max_minor.setter
    def w_max_minor(self, w_max_minor):
        """Sets the w_max_minor of this WConfig1.


        :param w_max_minor: The w_max_minor of this WConfig1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                w_max_minor is not None and w_max_minor > 1):  # noqa: E501
            raise ValueError("Invalid value for `w_max_minor`, must be a value less than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                w_max_minor is not None and w_max_minor < 0):  # noqa: E501
            raise ValueError("Invalid value for `w_max_minor`, must be a value greater than or equal to `0`")  # noqa: E501

        self._w_max_minor = w_max_minor

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
        if issubclass(WConfig1, dict):
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
        if not isinstance(other, WConfig1):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, WConfig1):
            return True

        return self.to_dict() != other.to_dict()
