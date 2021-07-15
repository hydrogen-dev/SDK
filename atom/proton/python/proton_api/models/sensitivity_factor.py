# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.9.2
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from proton_api.configuration import Configuration


class SensitivityFactor(object):
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
        'change_amount': 'float',
        'ticker': 'str',
        'change_duration': 'int',
        'lag': 'int'
    }

    attribute_map = {
        'change_amount': 'change_amount',
        'ticker': 'ticker',
        'change_duration': 'change_duration',
        'lag': 'lag'
    }

    def __init__(self, change_amount=None, ticker=None, change_duration=None, lag=0, _configuration=None):  # noqa: E501
        """SensitivityFactor - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._change_amount = None
        self._ticker = None
        self._change_duration = None
        self._lag = None
        self.discriminator = None

        self.change_amount = change_amount
        self.ticker = ticker
        self.change_duration = change_duration
        if lag is not None:
            self.lag = lag

    @property
    def change_amount(self):
        """Gets the change_amount of this SensitivityFactor.  # noqa: E501


        :return: The change_amount of this SensitivityFactor.  # noqa: E501
        :rtype: float
        """
        return self._change_amount

    @change_amount.setter
    def change_amount(self, change_amount):
        """Sets the change_amount of this SensitivityFactor.


        :param change_amount: The change_amount of this SensitivityFactor.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and change_amount is None:
            raise ValueError("Invalid value for `change_amount`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                change_amount is not None and change_amount < -1):  # noqa: E501
            raise ValueError("Invalid value for `change_amount`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._change_amount = change_amount

    @property
    def ticker(self):
        """Gets the ticker of this SensitivityFactor.  # noqa: E501


        :return: The ticker of this SensitivityFactor.  # noqa: E501
        :rtype: str
        """
        return self._ticker

    @ticker.setter
    def ticker(self, ticker):
        """Sets the ticker of this SensitivityFactor.


        :param ticker: The ticker of this SensitivityFactor.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and ticker is None:
            raise ValueError("Invalid value for `ticker`, must not be `None`")  # noqa: E501

        self._ticker = ticker

    @property
    def change_duration(self):
        """Gets the change_duration of this SensitivityFactor.  # noqa: E501


        :return: The change_duration of this SensitivityFactor.  # noqa: E501
        :rtype: int
        """
        return self._change_duration

    @change_duration.setter
    def change_duration(self, change_duration):
        """Sets the change_duration of this SensitivityFactor.


        :param change_duration: The change_duration of this SensitivityFactor.  # noqa: E501
        :type: int
        """
        if self._configuration.client_side_validation and change_duration is None:
            raise ValueError("Invalid value for `change_duration`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                change_duration is not None and change_duration < 1):  # noqa: E501
            raise ValueError("Invalid value for `change_duration`, must be a value greater than or equal to `1`")  # noqa: E501

        self._change_duration = change_duration

    @property
    def lag(self):
        """Gets the lag of this SensitivityFactor.  # noqa: E501


        :return: The lag of this SensitivityFactor.  # noqa: E501
        :rtype: int
        """
        return self._lag

    @lag.setter
    def lag(self, lag):
        """Sets the lag of this SensitivityFactor.


        :param lag: The lag of this SensitivityFactor.  # noqa: E501
        :type: int
        """
        if (self._configuration.client_side_validation and
                lag is not None and lag < 0):  # noqa: E501
            raise ValueError("Invalid value for `lag`, must be a value greater than or equal to `0`")  # noqa: E501

        self._lag = lag

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
        if issubclass(SensitivityFactor, dict):
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
        if not isinstance(other, SensitivityFactor):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, SensitivityFactor):
            return True

        return self.to_dict() != other.to_dict()
