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

from atom_api.models.retirement_return_detail import RetirementReturnDetail  # noqa: F401,E501


class RetirementCalculatorExpensesResponse(object):
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
        'projected_retirement_expenses': 'float',
        'projected_retirement_expenses_adjusted': 'float',
        'projected_savings_at_retirement': 'float',
        'total_earnings': 'float',
        'total_contributions': 'float',
        'total_withdrawals': 'float',
        'total_taxes': 'float',
        'return_details': 'dict(str, RetirementReturnDetail)'
    }

    attribute_map = {
        'projected_retirement_expenses': 'projected_retirement_expenses',
        'projected_retirement_expenses_adjusted': 'projected_retirement_expenses_adjusted',
        'projected_savings_at_retirement': 'projected_savings_at_retirement',
        'total_earnings': 'total_earnings',
        'total_contributions': 'total_contributions',
        'total_withdrawals': 'total_withdrawals',
        'total_taxes': 'total_taxes',
        'return_details': 'return_details'
    }

    def __init__(self, projected_retirement_expenses=None, projected_retirement_expenses_adjusted=None, projected_savings_at_retirement=None, total_earnings=None, total_contributions=None, total_withdrawals=None, total_taxes=None, return_details=None):  # noqa: E501
        """RetirementCalculatorExpensesResponse - a model defined in Swagger"""  # noqa: E501

        self._projected_retirement_expenses = None
        self._projected_retirement_expenses_adjusted = None
        self._projected_savings_at_retirement = None
        self._total_earnings = None
        self._total_contributions = None
        self._total_withdrawals = None
        self._total_taxes = None
        self._return_details = None
        self.discriminator = None

        self.projected_retirement_expenses = projected_retirement_expenses
        self.projected_retirement_expenses_adjusted = projected_retirement_expenses_adjusted
        self.projected_savings_at_retirement = projected_savings_at_retirement
        self.total_earnings = total_earnings
        self.total_contributions = total_contributions
        self.total_withdrawals = total_withdrawals
        self.total_taxes = total_taxes
        self.return_details = return_details

    @property
    def projected_retirement_expenses(self):
        """Gets the projected_retirement_expenses of this RetirementCalculatorExpensesResponse.  # noqa: E501

        The after-tax retirement expenses available expressed in today’s dollars.  # noqa: E501

        :return: The projected_retirement_expenses of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :rtype: float
        """
        return self._projected_retirement_expenses

    @projected_retirement_expenses.setter
    def projected_retirement_expenses(self, projected_retirement_expenses):
        """Sets the projected_retirement_expenses of this RetirementCalculatorExpensesResponse.

        The after-tax retirement expenses available expressed in today’s dollars.  # noqa: E501

        :param projected_retirement_expenses: The projected_retirement_expenses of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :type: float
        """
        if projected_retirement_expenses is None:
            raise ValueError("Invalid value for `projected_retirement_expenses`, must not be `None`")  # noqa: E501

        self._projected_retirement_expenses = projected_retirement_expenses

    @property
    def projected_retirement_expenses_adjusted(self):
        """Gets the projected_retirement_expenses_adjusted of this RetirementCalculatorExpensesResponse.  # noqa: E501

        The after-tax retirement expenses available, expressed in today's dollars.  # noqa: E501

        :return: The projected_retirement_expenses_adjusted of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :rtype: float
        """
        return self._projected_retirement_expenses_adjusted

    @projected_retirement_expenses_adjusted.setter
    def projected_retirement_expenses_adjusted(self, projected_retirement_expenses_adjusted):
        """Sets the projected_retirement_expenses_adjusted of this RetirementCalculatorExpensesResponse.

        The after-tax retirement expenses available, expressed in today's dollars.  # noqa: E501

        :param projected_retirement_expenses_adjusted: The projected_retirement_expenses_adjusted of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :type: float
        """
        if projected_retirement_expenses_adjusted is None:
            raise ValueError("Invalid value for `projected_retirement_expenses_adjusted`, must not be `None`")  # noqa: E501

        self._projected_retirement_expenses_adjusted = projected_retirement_expenses_adjusted

    @property
    def projected_savings_at_retirement(self):
        """Gets the projected_savings_at_retirement of this RetirementCalculatorExpensesResponse.  # noqa: E501

        The total amount of savings projected to be available at retirement, expressed in today’s dollars.  # noqa: E501

        :return: The projected_savings_at_retirement of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :rtype: float
        """
        return self._projected_savings_at_retirement

    @projected_savings_at_retirement.setter
    def projected_savings_at_retirement(self, projected_savings_at_retirement):
        """Sets the projected_savings_at_retirement of this RetirementCalculatorExpensesResponse.

        The total amount of savings projected to be available at retirement, expressed in today’s dollars.  # noqa: E501

        :param projected_savings_at_retirement: The projected_savings_at_retirement of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :type: float
        """
        if projected_savings_at_retirement is None:
            raise ValueError("Invalid value for `projected_savings_at_retirement`, must not be `None`")  # noqa: E501

        self._projected_savings_at_retirement = projected_savings_at_retirement

    @property
    def total_earnings(self):
        """Gets the total_earnings of this RetirementCalculatorExpensesResponse.  # noqa: E501

        The total earnings generated over the horizon.  # noqa: E501

        :return: The total_earnings of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :rtype: float
        """
        return self._total_earnings

    @total_earnings.setter
    def total_earnings(self, total_earnings):
        """Sets the total_earnings of this RetirementCalculatorExpensesResponse.

        The total earnings generated over the horizon.  # noqa: E501

        :param total_earnings: The total_earnings of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :type: float
        """
        if total_earnings is None:
            raise ValueError("Invalid value for `total_earnings`, must not be `None`")  # noqa: E501

        self._total_earnings = total_earnings

    @property
    def total_contributions(self):
        """Gets the total_contributions of this RetirementCalculatorExpensesResponse.  # noqa: E501

        The total contributions added over the horizon.  # noqa: E501

        :return: The total_contributions of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :rtype: float
        """
        return self._total_contributions

    @total_contributions.setter
    def total_contributions(self, total_contributions):
        """Sets the total_contributions of this RetirementCalculatorExpensesResponse.

        The total contributions added over the horizon.  # noqa: E501

        :param total_contributions: The total_contributions of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :type: float
        """
        if total_contributions is None:
            raise ValueError("Invalid value for `total_contributions`, must not be `None`")  # noqa: E501

        self._total_contributions = total_contributions

    @property
    def total_withdrawals(self):
        """Gets the total_withdrawals of this RetirementCalculatorExpensesResponse.  # noqa: E501

        The total amount of withdrawals taken over decumulation_horizon.  # noqa: E501

        :return: The total_withdrawals of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :rtype: float
        """
        return self._total_withdrawals

    @total_withdrawals.setter
    def total_withdrawals(self, total_withdrawals):
        """Sets the total_withdrawals of this RetirementCalculatorExpensesResponse.

        The total amount of withdrawals taken over decumulation_horizon.  # noqa: E501

        :param total_withdrawals: The total_withdrawals of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :type: float
        """
        if total_withdrawals is None:
            raise ValueError("Invalid value for `total_withdrawals`, must not be `None`")  # noqa: E501

        self._total_withdrawals = total_withdrawals

    @property
    def total_taxes(self):
        """Gets the total_taxes of this RetirementCalculatorExpensesResponse.  # noqa: E501

        The total taxes paid on withdrawals over decumulation_horizon.  # noqa: E501

        :return: The total_taxes of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :rtype: float
        """
        return self._total_taxes

    @total_taxes.setter
    def total_taxes(self, total_taxes):
        """Sets the total_taxes of this RetirementCalculatorExpensesResponse.

        The total taxes paid on withdrawals over decumulation_horizon.  # noqa: E501

        :param total_taxes: The total_taxes of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :type: float
        """
        if total_taxes is None:
            raise ValueError("Invalid value for `total_taxes`, must not be `None`")  # noqa: E501

        self._total_taxes = total_taxes

    @property
    def return_details(self):
        """Gets the return_details of this RetirementCalculatorExpensesResponse.  # noqa: E501


        :return: The return_details of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :rtype: dict(str, RetirementReturnDetail)
        """
        return self._return_details

    @return_details.setter
    def return_details(self, return_details):
        """Sets the return_details of this RetirementCalculatorExpensesResponse.


        :param return_details: The return_details of this RetirementCalculatorExpensesResponse.  # noqa: E501
        :type: dict(str, RetirementReturnDetail)
        """
        if return_details is None:
            raise ValueError("Invalid value for `return_details`, must not be `None`")  # noqa: E501

        self._return_details = return_details

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
        if issubclass(RetirementCalculatorExpensesResponse, dict):
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
        if not isinstance(other, RetirementCalculatorExpensesResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
