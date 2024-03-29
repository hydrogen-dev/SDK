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


class RatioTargets1(object):
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
        'return_on_equity': 'float',
        'return_on_assets': 'float',
        'debt_to_equity': 'float',
        'profit_margin': 'float',
        'debt_ratio': 'float',
        'asset_turnover': 'float'
    }

    attribute_map = {
        'return_on_equity': 'return_on_equity',
        'return_on_assets': 'return_on_assets',
        'debt_to_equity': 'debt_to_equity',
        'profit_margin': 'profit_margin',
        'debt_ratio': 'debt_ratio',
        'asset_turnover': 'asset_turnover'
    }

    def __init__(self, return_on_equity=0.15, return_on_assets=0.05, debt_to_equity=1.5, profit_margin=0.1, debt_ratio=0.5, asset_turnover=1.0, _configuration=None):  # noqa: E501
        """RatioTargets1 - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._return_on_equity = None
        self._return_on_assets = None
        self._debt_to_equity = None
        self._profit_margin = None
        self._debt_ratio = None
        self._asset_turnover = None
        self.discriminator = None

        if return_on_equity is not None:
            self.return_on_equity = return_on_equity
        if return_on_assets is not None:
            self.return_on_assets = return_on_assets
        if debt_to_equity is not None:
            self.debt_to_equity = debt_to_equity
        if profit_margin is not None:
            self.profit_margin = profit_margin
        if debt_ratio is not None:
            self.debt_ratio = debt_ratio
        if asset_turnover is not None:
            self.asset_turnover = asset_turnover

    @property
    def return_on_equity(self):
        """Gets the return_on_equity of this RatioTargets1.  # noqa: E501


        :return: The return_on_equity of this RatioTargets1.  # noqa: E501
        :rtype: float
        """
        return self._return_on_equity

    @return_on_equity.setter
    def return_on_equity(self, return_on_equity):
        """Sets the return_on_equity of this RatioTargets1.


        :param return_on_equity: The return_on_equity of this RatioTargets1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                return_on_equity is not None and return_on_equity < 0):  # noqa: E501
            raise ValueError("Invalid value for `return_on_equity`, must be a value greater than or equal to `0`")  # noqa: E501

        self._return_on_equity = return_on_equity

    @property
    def return_on_assets(self):
        """Gets the return_on_assets of this RatioTargets1.  # noqa: E501


        :return: The return_on_assets of this RatioTargets1.  # noqa: E501
        :rtype: float
        """
        return self._return_on_assets

    @return_on_assets.setter
    def return_on_assets(self, return_on_assets):
        """Sets the return_on_assets of this RatioTargets1.


        :param return_on_assets: The return_on_assets of this RatioTargets1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                return_on_assets is not None and return_on_assets < 0):  # noqa: E501
            raise ValueError("Invalid value for `return_on_assets`, must be a value greater than or equal to `0`")  # noqa: E501

        self._return_on_assets = return_on_assets

    @property
    def debt_to_equity(self):
        """Gets the debt_to_equity of this RatioTargets1.  # noqa: E501


        :return: The debt_to_equity of this RatioTargets1.  # noqa: E501
        :rtype: float
        """
        return self._debt_to_equity

    @debt_to_equity.setter
    def debt_to_equity(self, debt_to_equity):
        """Sets the debt_to_equity of this RatioTargets1.


        :param debt_to_equity: The debt_to_equity of this RatioTargets1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                debt_to_equity is not None and debt_to_equity < 0):  # noqa: E501
            raise ValueError("Invalid value for `debt_to_equity`, must be a value greater than or equal to `0`")  # noqa: E501

        self._debt_to_equity = debt_to_equity

    @property
    def profit_margin(self):
        """Gets the profit_margin of this RatioTargets1.  # noqa: E501


        :return: The profit_margin of this RatioTargets1.  # noqa: E501
        :rtype: float
        """
        return self._profit_margin

    @profit_margin.setter
    def profit_margin(self, profit_margin):
        """Sets the profit_margin of this RatioTargets1.


        :param profit_margin: The profit_margin of this RatioTargets1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                profit_margin is not None and profit_margin < 0):  # noqa: E501
            raise ValueError("Invalid value for `profit_margin`, must be a value greater than or equal to `0`")  # noqa: E501

        self._profit_margin = profit_margin

    @property
    def debt_ratio(self):
        """Gets the debt_ratio of this RatioTargets1.  # noqa: E501


        :return: The debt_ratio of this RatioTargets1.  # noqa: E501
        :rtype: float
        """
        return self._debt_ratio

    @debt_ratio.setter
    def debt_ratio(self, debt_ratio):
        """Sets the debt_ratio of this RatioTargets1.


        :param debt_ratio: The debt_ratio of this RatioTargets1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                debt_ratio is not None and debt_ratio < 0):  # noqa: E501
            raise ValueError("Invalid value for `debt_ratio`, must be a value greater than or equal to `0`")  # noqa: E501

        self._debt_ratio = debt_ratio

    @property
    def asset_turnover(self):
        """Gets the asset_turnover of this RatioTargets1.  # noqa: E501


        :return: The asset_turnover of this RatioTargets1.  # noqa: E501
        :rtype: float
        """
        return self._asset_turnover

    @asset_turnover.setter
    def asset_turnover(self, asset_turnover):
        """Sets the asset_turnover of this RatioTargets1.


        :param asset_turnover: The asset_turnover of this RatioTargets1.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                asset_turnover is not None and asset_turnover < 0):  # noqa: E501
            raise ValueError("Invalid value for `asset_turnover`, must be a value greater than or equal to `0`")  # noqa: E501

        self._asset_turnover = asset_turnover

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
        if issubclass(RatioTargets1, dict):
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
        if not isinstance(other, RatioTargets1):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, RatioTargets1):
            return True

        return self.to_dict() != other.to_dict()
