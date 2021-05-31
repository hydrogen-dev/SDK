# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.9.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from proton_api.configuration import Configuration


class RatioTargets(object):
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
        'liquidity_ratio_liabilities': 'float',
        'current_ratio': 'float',
        'asset_allocation_ratio': 'float',
        'savings_ratio_net': 'float',
        'savings_ratio_gross': 'float',
        'liquidity_ratio_expenses': 'float'
    }

    attribute_map = {
        'liquidity_ratio_liabilities': 'liquidity_ratio_liabilities',
        'current_ratio': 'current_ratio',
        'asset_allocation_ratio': 'asset_allocation_ratio',
        'savings_ratio_net': 'savings_ratio_net',
        'savings_ratio_gross': 'savings_ratio_gross',
        'liquidity_ratio_expenses': 'liquidity_ratio_expenses'
    }

    def __init__(self, liquidity_ratio_liabilities=0.1, current_ratio=0.5, asset_allocation_ratio=1.5, savings_ratio_net=0.1, savings_ratio_gross=0.1, liquidity_ratio_expenses=2.5, _configuration=None):  # noqa: E501
        """RatioTargets - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._liquidity_ratio_liabilities = None
        self._current_ratio = None
        self._asset_allocation_ratio = None
        self._savings_ratio_net = None
        self._savings_ratio_gross = None
        self._liquidity_ratio_expenses = None
        self.discriminator = None

        if liquidity_ratio_liabilities is not None:
            self.liquidity_ratio_liabilities = liquidity_ratio_liabilities
        if current_ratio is not None:
            self.current_ratio = current_ratio
        if asset_allocation_ratio is not None:
            self.asset_allocation_ratio = asset_allocation_ratio
        if savings_ratio_net is not None:
            self.savings_ratio_net = savings_ratio_net
        if savings_ratio_gross is not None:
            self.savings_ratio_gross = savings_ratio_gross
        if liquidity_ratio_expenses is not None:
            self.liquidity_ratio_expenses = liquidity_ratio_expenses

    @property
    def liquidity_ratio_liabilities(self):
        """Gets the liquidity_ratio_liabilities of this RatioTargets.  # noqa: E501


        :return: The liquidity_ratio_liabilities of this RatioTargets.  # noqa: E501
        :rtype: float
        """
        return self._liquidity_ratio_liabilities

    @liquidity_ratio_liabilities.setter
    def liquidity_ratio_liabilities(self, liquidity_ratio_liabilities):
        """Sets the liquidity_ratio_liabilities of this RatioTargets.


        :param liquidity_ratio_liabilities: The liquidity_ratio_liabilities of this RatioTargets.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                liquidity_ratio_liabilities is not None and liquidity_ratio_liabilities < 0):  # noqa: E501
            raise ValueError("Invalid value for `liquidity_ratio_liabilities`, must be a value greater than or equal to `0`")  # noqa: E501

        self._liquidity_ratio_liabilities = liquidity_ratio_liabilities

    @property
    def current_ratio(self):
        """Gets the current_ratio of this RatioTargets.  # noqa: E501


        :return: The current_ratio of this RatioTargets.  # noqa: E501
        :rtype: float
        """
        return self._current_ratio

    @current_ratio.setter
    def current_ratio(self, current_ratio):
        """Sets the current_ratio of this RatioTargets.


        :param current_ratio: The current_ratio of this RatioTargets.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                current_ratio is not None and current_ratio < 0):  # noqa: E501
            raise ValueError("Invalid value for `current_ratio`, must be a value greater than or equal to `0`")  # noqa: E501

        self._current_ratio = current_ratio

    @property
    def asset_allocation_ratio(self):
        """Gets the asset_allocation_ratio of this RatioTargets.  # noqa: E501


        :return: The asset_allocation_ratio of this RatioTargets.  # noqa: E501
        :rtype: float
        """
        return self._asset_allocation_ratio

    @asset_allocation_ratio.setter
    def asset_allocation_ratio(self, asset_allocation_ratio):
        """Sets the asset_allocation_ratio of this RatioTargets.


        :param asset_allocation_ratio: The asset_allocation_ratio of this RatioTargets.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                asset_allocation_ratio is not None and asset_allocation_ratio < 0):  # noqa: E501
            raise ValueError("Invalid value for `asset_allocation_ratio`, must be a value greater than or equal to `0`")  # noqa: E501

        self._asset_allocation_ratio = asset_allocation_ratio

    @property
    def savings_ratio_net(self):
        """Gets the savings_ratio_net of this RatioTargets.  # noqa: E501


        :return: The savings_ratio_net of this RatioTargets.  # noqa: E501
        :rtype: float
        """
        return self._savings_ratio_net

    @savings_ratio_net.setter
    def savings_ratio_net(self, savings_ratio_net):
        """Sets the savings_ratio_net of this RatioTargets.


        :param savings_ratio_net: The savings_ratio_net of this RatioTargets.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                savings_ratio_net is not None and savings_ratio_net < 0):  # noqa: E501
            raise ValueError("Invalid value for `savings_ratio_net`, must be a value greater than or equal to `0`")  # noqa: E501

        self._savings_ratio_net = savings_ratio_net

    @property
    def savings_ratio_gross(self):
        """Gets the savings_ratio_gross of this RatioTargets.  # noqa: E501


        :return: The savings_ratio_gross of this RatioTargets.  # noqa: E501
        :rtype: float
        """
        return self._savings_ratio_gross

    @savings_ratio_gross.setter
    def savings_ratio_gross(self, savings_ratio_gross):
        """Sets the savings_ratio_gross of this RatioTargets.


        :param savings_ratio_gross: The savings_ratio_gross of this RatioTargets.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                savings_ratio_gross is not None and savings_ratio_gross < 0):  # noqa: E501
            raise ValueError("Invalid value for `savings_ratio_gross`, must be a value greater than or equal to `0`")  # noqa: E501

        self._savings_ratio_gross = savings_ratio_gross

    @property
    def liquidity_ratio_expenses(self):
        """Gets the liquidity_ratio_expenses of this RatioTargets.  # noqa: E501


        :return: The liquidity_ratio_expenses of this RatioTargets.  # noqa: E501
        :rtype: float
        """
        return self._liquidity_ratio_expenses

    @liquidity_ratio_expenses.setter
    def liquidity_ratio_expenses(self, liquidity_ratio_expenses):
        """Sets the liquidity_ratio_expenses of this RatioTargets.


        :param liquidity_ratio_expenses: The liquidity_ratio_expenses of this RatioTargets.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                liquidity_ratio_expenses is not None and liquidity_ratio_expenses < 0):  # noqa: E501
            raise ValueError("Invalid value for `liquidity_ratio_expenses`, must be a value greater than or equal to `0`")  # noqa: E501

        self._liquidity_ratio_expenses = liquidity_ratio_expenses

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
        if issubclass(RatioTargets, dict):
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
        if not isinstance(other, RatioTargets):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, RatioTargets):
            return True

        return self.to_dict() != other.to_dict()
