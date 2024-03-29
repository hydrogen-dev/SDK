# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class VPortfolioVO(object):
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
        'goal_asset_size_by_portfolio': 'float',
        'goal_asset_size_by_portfolio_date': 'date',
        'portfolio_id': 'str',
        'portfolio_name': 'str'
    }

    attribute_map = {
        'goal_asset_size_by_portfolio': 'goal_asset_size_by_portfolio',
        'goal_asset_size_by_portfolio_date': 'goal_asset_size_by_portfolio_date',
        'portfolio_id': 'portfolio_id',
        'portfolio_name': 'portfolio_name'
    }

    def __init__(self, goal_asset_size_by_portfolio=None, goal_asset_size_by_portfolio_date=None, portfolio_id=None, portfolio_name=None, _configuration=None):  # noqa: E501
        """VPortfolioVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._goal_asset_size_by_portfolio = None
        self._goal_asset_size_by_portfolio_date = None
        self._portfolio_id = None
        self._portfolio_name = None
        self.discriminator = None

        if goal_asset_size_by_portfolio is not None:
            self.goal_asset_size_by_portfolio = goal_asset_size_by_portfolio
        if goal_asset_size_by_portfolio_date is not None:
            self.goal_asset_size_by_portfolio_date = goal_asset_size_by_portfolio_date
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if portfolio_name is not None:
            self.portfolio_name = portfolio_name

    @property
    def goal_asset_size_by_portfolio(self):
        """Gets the goal_asset_size_by_portfolio of this VPortfolioVO.  # noqa: E501


        :return: The goal_asset_size_by_portfolio of this VPortfolioVO.  # noqa: E501
        :rtype: float
        """
        return self._goal_asset_size_by_portfolio

    @goal_asset_size_by_portfolio.setter
    def goal_asset_size_by_portfolio(self, goal_asset_size_by_portfolio):
        """Sets the goal_asset_size_by_portfolio of this VPortfolioVO.


        :param goal_asset_size_by_portfolio: The goal_asset_size_by_portfolio of this VPortfolioVO.  # noqa: E501
        :type: float
        """

        self._goal_asset_size_by_portfolio = goal_asset_size_by_portfolio

    @property
    def goal_asset_size_by_portfolio_date(self):
        """Gets the goal_asset_size_by_portfolio_date of this VPortfolioVO.  # noqa: E501


        :return: The goal_asset_size_by_portfolio_date of this VPortfolioVO.  # noqa: E501
        :rtype: date
        """
        return self._goal_asset_size_by_portfolio_date

    @goal_asset_size_by_portfolio_date.setter
    def goal_asset_size_by_portfolio_date(self, goal_asset_size_by_portfolio_date):
        """Sets the goal_asset_size_by_portfolio_date of this VPortfolioVO.


        :param goal_asset_size_by_portfolio_date: The goal_asset_size_by_portfolio_date of this VPortfolioVO.  # noqa: E501
        :type: date
        """

        self._goal_asset_size_by_portfolio_date = goal_asset_size_by_portfolio_date

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this VPortfolioVO.  # noqa: E501


        :return: The portfolio_id of this VPortfolioVO.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this VPortfolioVO.


        :param portfolio_id: The portfolio_id of this VPortfolioVO.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def portfolio_name(self):
        """Gets the portfolio_name of this VPortfolioVO.  # noqa: E501


        :return: The portfolio_name of this VPortfolioVO.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_name

    @portfolio_name.setter
    def portfolio_name(self, portfolio_name):
        """Sets the portfolio_name of this VPortfolioVO.


        :param portfolio_name: The portfolio_name of this VPortfolioVO.  # noqa: E501
        :type: str
        """

        self._portfolio_name = portfolio_name

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
        if issubclass(VPortfolioVO, dict):
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
        if not isinstance(other, VPortfolioVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, VPortfolioVO):
            return True

        return self.to_dict() != other.to_dict()
