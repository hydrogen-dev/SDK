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

from atom_api.models.purchase_calculator_return_detail import PurchaseCalculatorReturnDetail  # noqa: F401,E501


class PurchaseCalculatorPurchaseamountResponse(object):
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
        'purchase_amount': 'float',
        'purchase_amount_adjusted': 'float',
        'projected_savings_at_purchase_horizon': 'float',
        'total_earnings': 'float',
        'total_contributions': 'float',
        'return_details': 'dict(str, PurchaseCalculatorReturnDetail)'
    }

    attribute_map = {
        'purchase_amount': 'purchase_amount',
        'purchase_amount_adjusted': 'purchase_amount_adjusted',
        'projected_savings_at_purchase_horizon': 'projected_savings_at_purchase_horizon',
        'total_earnings': 'total_earnings',
        'total_contributions': 'total_contributions',
        'return_details': 'return_details'
    }

    def __init__(self, purchase_amount=None, purchase_amount_adjusted=None, projected_savings_at_purchase_horizon=None, total_earnings=None, total_contributions=None, return_details=None):  # noqa: E501
        """PurchaseCalculatorPurchaseamountResponse - a model defined in Swagger"""  # noqa: E501

        self._purchase_amount = None
        self._purchase_amount_adjusted = None
        self._projected_savings_at_purchase_horizon = None
        self._total_earnings = None
        self._total_contributions = None
        self._return_details = None
        self.discriminator = None

        self.purchase_amount = purchase_amount
        self.purchase_amount_adjusted = purchase_amount_adjusted
        self.projected_savings_at_purchase_horizon = projected_savings_at_purchase_horizon
        self.total_earnings = total_earnings
        self.total_contributions = total_contributions
        self.return_details = return_details

    @property
    def purchase_amount(self):
        """Gets the purchase_amount of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501

        The amount of the major purchase.  # noqa: E501

        :return: The purchase_amount of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :rtype: float
        """
        return self._purchase_amount

    @purchase_amount.setter
    def purchase_amount(self, purchase_amount):
        """Sets the purchase_amount of this PurchaseCalculatorPurchaseamountResponse.

        The amount of the major purchase.  # noqa: E501

        :param purchase_amount: The purchase_amount of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :type: float
        """
        if purchase_amount is None:
            raise ValueError("Invalid value for `purchase_amount`, must not be `None`")  # noqa: E501
        if purchase_amount is not None and purchase_amount < 0:  # noqa: E501
            raise ValueError("Invalid value for `purchase_amount`, must be a value greater than or equal to `0`")  # noqa: E501

        self._purchase_amount = purchase_amount

    @property
    def purchase_amount_adjusted(self):
        """Gets the purchase_amount_adjusted of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501

        The amount of the major purchase, represented in today's dollars.  # noqa: E501

        :return: The purchase_amount_adjusted of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :rtype: float
        """
        return self._purchase_amount_adjusted

    @purchase_amount_adjusted.setter
    def purchase_amount_adjusted(self, purchase_amount_adjusted):
        """Sets the purchase_amount_adjusted of this PurchaseCalculatorPurchaseamountResponse.

        The amount of the major purchase, represented in today's dollars.  # noqa: E501

        :param purchase_amount_adjusted: The purchase_amount_adjusted of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :type: float
        """
        if purchase_amount_adjusted is None:
            raise ValueError("Invalid value for `purchase_amount_adjusted`, must not be `None`")  # noqa: E501
        if purchase_amount_adjusted is not None and purchase_amount_adjusted < 0:  # noqa: E501
            raise ValueError("Invalid value for `purchase_amount_adjusted`, must be a value greater than or equal to `0`")  # noqa: E501

        self._purchase_amount_adjusted = purchase_amount_adjusted

    @property
    def projected_savings_at_purchase_horizon(self):
        """Gets the projected_savings_at_purchase_horizon of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501

        The total amount of savings that are projected to be available at the purchase horizon, expressed in today’s dollars.  # noqa: E501

        :return: The projected_savings_at_purchase_horizon of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :rtype: float
        """
        return self._projected_savings_at_purchase_horizon

    @projected_savings_at_purchase_horizon.setter
    def projected_savings_at_purchase_horizon(self, projected_savings_at_purchase_horizon):
        """Sets the projected_savings_at_purchase_horizon of this PurchaseCalculatorPurchaseamountResponse.

        The total amount of savings that are projected to be available at the purchase horizon, expressed in today’s dollars.  # noqa: E501

        :param projected_savings_at_purchase_horizon: The projected_savings_at_purchase_horizon of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :type: float
        """
        if projected_savings_at_purchase_horizon is None:
            raise ValueError("Invalid value for `projected_savings_at_purchase_horizon`, must not be `None`")  # noqa: E501
        if projected_savings_at_purchase_horizon is not None and projected_savings_at_purchase_horizon < 0:  # noqa: E501
            raise ValueError("Invalid value for `projected_savings_at_purchase_horizon`, must be a value greater than or equal to `0`")  # noqa: E501

        self._projected_savings_at_purchase_horizon = projected_savings_at_purchase_horizon

    @property
    def total_earnings(self):
        """Gets the total_earnings of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501

        The total earnings generated over the horizon.  # noqa: E501

        :return: The total_earnings of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :rtype: float
        """
        return self._total_earnings

    @total_earnings.setter
    def total_earnings(self, total_earnings):
        """Sets the total_earnings of this PurchaseCalculatorPurchaseamountResponse.

        The total earnings generated over the horizon.  # noqa: E501

        :param total_earnings: The total_earnings of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :type: float
        """
        if total_earnings is None:
            raise ValueError("Invalid value for `total_earnings`, must not be `None`")  # noqa: E501

        self._total_earnings = total_earnings

    @property
    def total_contributions(self):
        """Gets the total_contributions of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501

        The total contributions added over the horizon.  # noqa: E501

        :return: The total_contributions of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :rtype: float
        """
        return self._total_contributions

    @total_contributions.setter
    def total_contributions(self, total_contributions):
        """Sets the total_contributions of this PurchaseCalculatorPurchaseamountResponse.

        The total contributions added over the horizon.  # noqa: E501

        :param total_contributions: The total_contributions of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :type: float
        """
        if total_contributions is None:
            raise ValueError("Invalid value for `total_contributions`, must not be `None`")  # noqa: E501

        self._total_contributions = total_contributions

    @property
    def return_details(self):
        """Gets the return_details of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501


        :return: The return_details of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :rtype: dict(str, PurchaseCalculatorReturnDetail)
        """
        return self._return_details

    @return_details.setter
    def return_details(self, return_details):
        """Sets the return_details of this PurchaseCalculatorPurchaseamountResponse.


        :param return_details: The return_details of this PurchaseCalculatorPurchaseamountResponse.  # noqa: E501
        :type: dict(str, PurchaseCalculatorReturnDetail)
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
        if issubclass(PurchaseCalculatorPurchaseamountResponse, dict):
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
        if not isinstance(other, PurchaseCalculatorPurchaseamountResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
