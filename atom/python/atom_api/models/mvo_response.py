# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from atom_api.models.target_portfolio_response import TargetPortfolioResponse  # noqa: F401,E501


class MvoResponse(object):
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
        'target_portfolio': 'TargetPortfolioResponse'
    }

    attribute_map = {
        'target_portfolio': 'target_portfolio'
    }

    def __init__(self, target_portfolio=None):  # noqa: E501
        """MvoResponse - a model defined in Swagger"""  # noqa: E501

        self._target_portfolio = None
        self.discriminator = None

        self.target_portfolio = target_portfolio

    @property
    def target_portfolio(self):
        """Gets the target_portfolio of this MvoResponse.  # noqa: E501


        :return: The target_portfolio of this MvoResponse.  # noqa: E501
        :rtype: TargetPortfolioResponse
        """
        return self._target_portfolio

    @target_portfolio.setter
    def target_portfolio(self, target_portfolio):
        """Sets the target_portfolio of this MvoResponse.


        :param target_portfolio: The target_portfolio of this MvoResponse.  # noqa: E501
        :type: TargetPortfolioResponse
        """
        if target_portfolio is None:
            raise ValueError("Invalid value for `target_portfolio`, must not be `None`")  # noqa: E501

        self._target_portfolio = target_portfolio

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
        if issubclass(MvoResponse, dict):
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
        if not isinstance(other, MvoResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other