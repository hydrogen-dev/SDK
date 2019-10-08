# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.0.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class DepositSchedule(object):
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
        'deposit_amount': 'float',
        'deposit_frequency_interval': 'str',
        'deposit_duration': 'int',
        'adjust_deposit_for_inflation': 'bool'
    }

    attribute_map = {
        'deposit_amount': 'deposit_amount',
        'deposit_frequency_interval': 'deposit_frequency_interval',
        'deposit_duration': 'deposit_duration',
        'adjust_deposit_for_inflation': 'adjust_deposit_for_inflation'
    }

    def __init__(self, deposit_amount=None, deposit_frequency_interval=None, deposit_duration=None, adjust_deposit_for_inflation=None):  # noqa: E501
        """DepositSchedule - a model defined in Swagger"""  # noqa: E501

        self._deposit_amount = None
        self._deposit_frequency_interval = None
        self._deposit_duration = None
        self._adjust_deposit_for_inflation = None
        self.discriminator = None

        if deposit_amount is not None:
            self.deposit_amount = deposit_amount
        if deposit_frequency_interval is not None:
            self.deposit_frequency_interval = deposit_frequency_interval
        if deposit_duration is not None:
            self.deposit_duration = deposit_duration
        if adjust_deposit_for_inflation is not None:
            self.adjust_deposit_for_inflation = adjust_deposit_for_inflation

    @property
    def deposit_amount(self):
        """Gets the deposit_amount of this DepositSchedule.  # noqa: E501

        The periodic deposit amount  # noqa: E501

        :return: The deposit_amount of this DepositSchedule.  # noqa: E501
        :rtype: float
        """
        return self._deposit_amount

    @deposit_amount.setter
    def deposit_amount(self, deposit_amount):
        """Sets the deposit_amount of this DepositSchedule.

        The periodic deposit amount  # noqa: E501

        :param deposit_amount: The deposit_amount of this DepositSchedule.  # noqa: E501
        :type: float
        """
        if deposit_amount is not None and deposit_amount <= 0:  # noqa: E501
            raise ValueError("Invalid value for `deposit_amount`, must be a value greater than `0`")  # noqa: E501

        self._deposit_amount = deposit_amount

    @property
    def deposit_frequency_interval(self):
        """Gets the deposit_frequency_interval of this DepositSchedule.  # noqa: E501

        The deposit frequency interval  # noqa: E501

        :return: The deposit_frequency_interval of this DepositSchedule.  # noqa: E501
        :rtype: str
        """
        return self._deposit_frequency_interval

    @deposit_frequency_interval.setter
    def deposit_frequency_interval(self, deposit_frequency_interval):
        """Sets the deposit_frequency_interval of this DepositSchedule.

        The deposit frequency interval  # noqa: E501

        :param deposit_frequency_interval: The deposit_frequency_interval of this DepositSchedule.  # noqa: E501
        :type: str
        """
        allowed_values = ["year", "month", "quarter", "week"]  # noqa: E501
        if deposit_frequency_interval not in allowed_values:
            raise ValueError(
                "Invalid value for `deposit_frequency_interval` ({0}), must be one of {1}"  # noqa: E501
                .format(deposit_frequency_interval, allowed_values)
            )

        self._deposit_frequency_interval = deposit_frequency_interval

    @property
    def deposit_duration(self):
        """Gets the deposit_duration of this DepositSchedule.  # noqa: E501

        The duration of the deposits  # noqa: E501

        :return: The deposit_duration of this DepositSchedule.  # noqa: E501
        :rtype: int
        """
        return self._deposit_duration

    @deposit_duration.setter
    def deposit_duration(self, deposit_duration):
        """Sets the deposit_duration of this DepositSchedule.

        The duration of the deposits  # noqa: E501

        :param deposit_duration: The deposit_duration of this DepositSchedule.  # noqa: E501
        :type: int
        """
        if deposit_duration is not None and deposit_duration <= 0:  # noqa: E501
            raise ValueError("Invalid value for `deposit_duration`, must be a value greater than `0`")  # noqa: E501

        self._deposit_duration = deposit_duration

    @property
    def adjust_deposit_for_inflation(self):
        """Gets the adjust_deposit_for_inflation of this DepositSchedule.  # noqa: E501

        T/F adjust deposit for inflation rate  # noqa: E501

        :return: The adjust_deposit_for_inflation of this DepositSchedule.  # noqa: E501
        :rtype: bool
        """
        return self._adjust_deposit_for_inflation

    @adjust_deposit_for_inflation.setter
    def adjust_deposit_for_inflation(self, adjust_deposit_for_inflation):
        """Sets the adjust_deposit_for_inflation of this DepositSchedule.

        T/F adjust deposit for inflation rate  # noqa: E501

        :param adjust_deposit_for_inflation: The adjust_deposit_for_inflation of this DepositSchedule.  # noqa: E501
        :type: bool
        """

        self._adjust_deposit_for_inflation = adjust_deposit_for_inflation

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
        if issubclass(DepositSchedule, dict):
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
        if not isinstance(other, DepositSchedule):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
