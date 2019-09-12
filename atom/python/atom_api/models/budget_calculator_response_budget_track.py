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

from atom_api.models.budget_calculator_response_budget_components import BudgetCalculatorResponseBudgetComponents  # noqa: F401,E501


class BudgetCalculatorResponseBudgetTrack(object):
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
        'period_start': 'date',
        'period_end': 'date',
        'total_funds_budgeted': 'float',
        'total_funds_spent': 'float',
        'total_funds_remaining': 'float',
        'budget_components': 'list[BudgetCalculatorResponseBudgetComponents]'
    }

    attribute_map = {
        'period_start': 'period_start',
        'period_end': 'period_end',
        'total_funds_budgeted': 'total_funds_budgeted',
        'total_funds_spent': 'total_funds_spent',
        'total_funds_remaining': 'total_funds_remaining',
        'budget_components': 'budget_components'
    }

    def __init__(self, period_start=None, period_end=None, total_funds_budgeted=None, total_funds_spent=None, total_funds_remaining=None, budget_components=None):  # noqa: E501
        """BudgetCalculatorResponseBudgetTrack - a model defined in Swagger"""  # noqa: E501

        self._period_start = None
        self._period_end = None
        self._total_funds_budgeted = None
        self._total_funds_spent = None
        self._total_funds_remaining = None
        self._budget_components = None
        self.discriminator = None

        if period_start is not None:
            self.period_start = period_start
        if period_end is not None:
            self.period_end = period_end
        if total_funds_budgeted is not None:
            self.total_funds_budgeted = total_funds_budgeted
        if total_funds_spent is not None:
            self.total_funds_spent = total_funds_spent
        if total_funds_remaining is not None:
            self.total_funds_remaining = total_funds_remaining
        if budget_components is not None:
            self.budget_components = budget_components

    @property
    def period_start(self):
        """Gets the period_start of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501

        Start date of the budget period  # noqa: E501

        :return: The period_start of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :rtype: date
        """
        return self._period_start

    @period_start.setter
    def period_start(self, period_start):
        """Sets the period_start of this BudgetCalculatorResponseBudgetTrack.

        Start date of the budget period  # noqa: E501

        :param period_start: The period_start of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :type: date
        """

        self._period_start = period_start

    @property
    def period_end(self):
        """Gets the period_end of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501

        End date of the budget period  # noqa: E501

        :return: The period_end of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :rtype: date
        """
        return self._period_end

    @period_end.setter
    def period_end(self, period_end):
        """Sets the period_end of this BudgetCalculatorResponseBudgetTrack.

        End date of the budget period  # noqa: E501

        :param period_end: The period_end of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :type: date
        """

        self._period_end = period_end

    @property
    def total_funds_budgeted(self):
        """Gets the total_funds_budgeted of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501

        Total amount of funds originally budgeted  # noqa: E501

        :return: The total_funds_budgeted of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :rtype: float
        """
        return self._total_funds_budgeted

    @total_funds_budgeted.setter
    def total_funds_budgeted(self, total_funds_budgeted):
        """Sets the total_funds_budgeted of this BudgetCalculatorResponseBudgetTrack.

        Total amount of funds originally budgeted  # noqa: E501

        :param total_funds_budgeted: The total_funds_budgeted of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :type: float
        """

        self._total_funds_budgeted = total_funds_budgeted

    @property
    def total_funds_spent(self):
        """Gets the total_funds_spent of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501

        Total amount of funds spent  # noqa: E501

        :return: The total_funds_spent of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :rtype: float
        """
        return self._total_funds_spent

    @total_funds_spent.setter
    def total_funds_spent(self, total_funds_spent):
        """Sets the total_funds_spent of this BudgetCalculatorResponseBudgetTrack.

        Total amount of funds spent  # noqa: E501

        :param total_funds_spent: The total_funds_spent of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :type: float
        """

        self._total_funds_spent = total_funds_spent

    @property
    def total_funds_remaining(self):
        """Gets the total_funds_remaining of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501

        Total amount of funds remaining; delta of total_funds_budgeted - total_funds_spent  # noqa: E501

        :return: The total_funds_remaining of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :rtype: float
        """
        return self._total_funds_remaining

    @total_funds_remaining.setter
    def total_funds_remaining(self, total_funds_remaining):
        """Sets the total_funds_remaining of this BudgetCalculatorResponseBudgetTrack.

        Total amount of funds remaining; delta of total_funds_budgeted - total_funds_spent  # noqa: E501

        :param total_funds_remaining: The total_funds_remaining of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :type: float
        """

        self._total_funds_remaining = total_funds_remaining

    @property
    def budget_components(self):
        """Gets the budget_components of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501

        Details about each item defined in the budget  # noqa: E501

        :return: The budget_components of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :rtype: list[BudgetCalculatorResponseBudgetComponents]
        """
        return self._budget_components

    @budget_components.setter
    def budget_components(self, budget_components):
        """Sets the budget_components of this BudgetCalculatorResponseBudgetTrack.

        Details about each item defined in the budget  # noqa: E501

        :param budget_components: The budget_components of this BudgetCalculatorResponseBudgetTrack.  # noqa: E501
        :type: list[BudgetCalculatorResponseBudgetComponents]
        """

        self._budget_components = budget_components

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
        if issubclass(BudgetCalculatorResponseBudgetTrack, dict):
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
        if not isinstance(other, BudgetCalculatorResponseBudgetTrack):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
