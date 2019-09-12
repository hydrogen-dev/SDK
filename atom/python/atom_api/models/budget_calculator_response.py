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

from atom_api.models.budget_calculator_response_budget_track import BudgetCalculatorResponseBudgetTrack  # noqa: F401,E501


class BudgetCalculatorResponse(object):
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
        'currency_code': 'str',
        'budget_track': 'list[BudgetCalculatorResponseBudgetTrack]'
    }

    attribute_map = {
        'currency_code': 'currency_code',
        'budget_track': 'budget_track'
    }

    def __init__(self, currency_code=None, budget_track=None):  # noqa: E501
        """BudgetCalculatorResponse - a model defined in Swagger"""  # noqa: E501

        self._currency_code = None
        self._budget_track = None
        self.discriminator = None

        self.currency_code = currency_code
        self.budget_track = budget_track

    @property
    def currency_code(self):
        """Gets the currency_code of this BudgetCalculatorResponse.  # noqa: E501

        Currency code associated with monetary response values  # noqa: E501

        :return: The currency_code of this BudgetCalculatorResponse.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this BudgetCalculatorResponse.

        Currency code associated with monetary response values  # noqa: E501

        :param currency_code: The currency_code of this BudgetCalculatorResponse.  # noqa: E501
        :type: str
        """
        if currency_code is None:
            raise ValueError("Invalid value for `currency_code`, must not be `None`")  # noqa: E501

        self._currency_code = currency_code

    @property
    def budget_track(self):
        """Gets the budget_track of this BudgetCalculatorResponse.  # noqa: E501

        Analysis of spending versus budget for each budget period  # noqa: E501

        :return: The budget_track of this BudgetCalculatorResponse.  # noqa: E501
        :rtype: list[BudgetCalculatorResponseBudgetTrack]
        """
        return self._budget_track

    @budget_track.setter
    def budget_track(self, budget_track):
        """Sets the budget_track of this BudgetCalculatorResponse.

        Analysis of spending versus budget for each budget period  # noqa: E501

        :param budget_track: The budget_track of this BudgetCalculatorResponse.  # noqa: E501
        :type: list[BudgetCalculatorResponseBudgetTrack]
        """
        if budget_track is None:
            raise ValueError("Invalid value for `budget_track`, must not be `None`")  # noqa: E501

        self._budget_track = budget_track

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
        if issubclass(BudgetCalculatorResponse, dict):
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
        if not isinstance(other, BudgetCalculatorResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
