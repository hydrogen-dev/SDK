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


class SavingsCalculatorReturnDetailsPeriodResponse(object):
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
        'period_earnings': 'float',
        'period_contribution': 'float',
        'period_withdrawal': 'float',
        'cumulative_earnings': 'float',
        'ending_balance': 'float'
    }

    attribute_map = {
        'period_earnings': 'period_earnings',
        'period_contribution': 'period_contribution',
        'period_withdrawal': 'period_withdrawal',
        'cumulative_earnings': 'cumulative_earnings',
        'ending_balance': 'ending_balance'
    }

    def __init__(self, period_earnings=None, period_contribution=None, period_withdrawal=None, cumulative_earnings=None, ending_balance=None):  # noqa: E501
        """SavingsCalculatorReturnDetailsPeriodResponse - a model defined in Swagger"""  # noqa: E501

        self._period_earnings = None
        self._period_contribution = None
        self._period_withdrawal = None
        self._cumulative_earnings = None
        self._ending_balance = None
        self.discriminator = None

        self.period_earnings = period_earnings
        self.period_contribution = period_contribution
        self.period_withdrawal = period_withdrawal
        self.cumulative_earnings = cumulative_earnings
        self.ending_balance = ending_balance

    @property
    def period_earnings(self):
        """Gets the period_earnings of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501

        The investment earnings for this period. Earnings are calculated at the beginning of each period, before contributions or withdrawals are made.  # noqa: E501

        :return: The period_earnings of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501
        :rtype: float
        """
        return self._period_earnings

    @period_earnings.setter
    def period_earnings(self, period_earnings):
        """Sets the period_earnings of this SavingsCalculatorReturnDetailsPeriodResponse.

        The investment earnings for this period. Earnings are calculated at the beginning of each period, before contributions or withdrawals are made.  # noqa: E501

        :param period_earnings: The period_earnings of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501
        :type: float
        """
        if period_earnings is None:
            raise ValueError("Invalid value for `period_earnings`, must not be `None`")  # noqa: E501

        self._period_earnings = period_earnings

    @property
    def period_contribution(self):
        """Gets the period_contribution of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501

        The deposit made for this period.  # noqa: E501

        :return: The period_contribution of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501
        :rtype: float
        """
        return self._period_contribution

    @period_contribution.setter
    def period_contribution(self, period_contribution):
        """Sets the period_contribution of this SavingsCalculatorReturnDetailsPeriodResponse.

        The deposit made for this period.  # noqa: E501

        :param period_contribution: The period_contribution of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501
        :type: float
        """
        if period_contribution is None:
            raise ValueError("Invalid value for `period_contribution`, must not be `None`")  # noqa: E501
        if period_contribution is not None and period_contribution < 0:  # noqa: E501
            raise ValueError("Invalid value for `period_contribution`, must be a value greater than or equal to `0`")  # noqa: E501

        self._period_contribution = period_contribution

    @property
    def period_withdrawal(self):
        """Gets the period_withdrawal of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501

        The withdrawal made for this period.  # noqa: E501

        :return: The period_withdrawal of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501
        :rtype: float
        """
        return self._period_withdrawal

    @period_withdrawal.setter
    def period_withdrawal(self, period_withdrawal):
        """Sets the period_withdrawal of this SavingsCalculatorReturnDetailsPeriodResponse.

        The withdrawal made for this period.  # noqa: E501

        :param period_withdrawal: The period_withdrawal of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501
        :type: float
        """
        if period_withdrawal is None:
            raise ValueError("Invalid value for `period_withdrawal`, must not be `None`")  # noqa: E501

        self._period_withdrawal = period_withdrawal

    @property
    def cumulative_earnings(self):
        """Gets the cumulative_earnings of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501

        The cumulative investment earnings made up to and including this period.  # noqa: E501

        :return: The cumulative_earnings of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501
        :rtype: float
        """
        return self._cumulative_earnings

    @cumulative_earnings.setter
    def cumulative_earnings(self, cumulative_earnings):
        """Sets the cumulative_earnings of this SavingsCalculatorReturnDetailsPeriodResponse.

        The cumulative investment earnings made up to and including this period.  # noqa: E501

        :param cumulative_earnings: The cumulative_earnings of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501
        :type: float
        """
        if cumulative_earnings is None:
            raise ValueError("Invalid value for `cumulative_earnings`, must not be `None`")  # noqa: E501

        self._cumulative_earnings = cumulative_earnings

    @property
    def ending_balance(self):
        """Gets the ending_balance of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501

        The ending balance, inclusive of earnings and contributions for the current period.  # noqa: E501

        :return: The ending_balance of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501
        :rtype: float
        """
        return self._ending_balance

    @ending_balance.setter
    def ending_balance(self, ending_balance):
        """Sets the ending_balance of this SavingsCalculatorReturnDetailsPeriodResponse.

        The ending balance, inclusive of earnings and contributions for the current period.  # noqa: E501

        :param ending_balance: The ending_balance of this SavingsCalculatorReturnDetailsPeriodResponse.  # noqa: E501
        :type: float
        """
        if ending_balance is None:
            raise ValueError("Invalid value for `ending_balance`, must not be `None`")  # noqa: E501

        self._ending_balance = ending_balance

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
        if issubclass(SavingsCalculatorReturnDetailsPeriodResponse, dict):
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
        if not isinstance(other, SavingsCalculatorReturnDetailsPeriodResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
