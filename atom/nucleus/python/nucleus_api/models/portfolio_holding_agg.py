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


class PortfolioHoldingAgg(object):
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
        'amount': 'float',
        'cost_basis': 'float',
        'currency_code': 'str',
        '_date': 'date',
        'security_id': 'str',
        'shares': 'float',
        'weight': 'float'
    }

    attribute_map = {
        'amount': 'amount',
        'cost_basis': 'cost_basis',
        'currency_code': 'currency_code',
        '_date': 'date',
        'security_id': 'security_id',
        'shares': 'shares',
        'weight': 'weight'
    }

    def __init__(self, amount=None, cost_basis=None, currency_code=None, _date=None, security_id=None, shares=None, weight=None, _configuration=None):  # noqa: E501
        """PortfolioHoldingAgg - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._amount = None
        self._cost_basis = None
        self._currency_code = None
        self.__date = None
        self._security_id = None
        self._shares = None
        self._weight = None
        self.discriminator = None

        if amount is not None:
            self.amount = amount
        if cost_basis is not None:
            self.cost_basis = cost_basis
        if currency_code is not None:
            self.currency_code = currency_code
        if _date is not None:
            self._date = _date
        if security_id is not None:
            self.security_id = security_id
        if shares is not None:
            self.shares = shares
        if weight is not None:
            self.weight = weight

    @property
    def amount(self):
        """Gets the amount of this PortfolioHoldingAgg.  # noqa: E501

        amount  # noqa: E501

        :return: The amount of this PortfolioHoldingAgg.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this PortfolioHoldingAgg.

        amount  # noqa: E501

        :param amount: The amount of this PortfolioHoldingAgg.  # noqa: E501
        :type: float
        """

        self._amount = amount

    @property
    def cost_basis(self):
        """Gets the cost_basis of this PortfolioHoldingAgg.  # noqa: E501

        costBasis  # noqa: E501

        :return: The cost_basis of this PortfolioHoldingAgg.  # noqa: E501
        :rtype: float
        """
        return self._cost_basis

    @cost_basis.setter
    def cost_basis(self, cost_basis):
        """Sets the cost_basis of this PortfolioHoldingAgg.

        costBasis  # noqa: E501

        :param cost_basis: The cost_basis of this PortfolioHoldingAgg.  # noqa: E501
        :type: float
        """

        self._cost_basis = cost_basis

    @property
    def currency_code(self):
        """Gets the currency_code of this PortfolioHoldingAgg.  # noqa: E501

        currencyCode  # noqa: E501

        :return: The currency_code of this PortfolioHoldingAgg.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this PortfolioHoldingAgg.

        currencyCode  # noqa: E501

        :param currency_code: The currency_code of this PortfolioHoldingAgg.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def _date(self):
        """Gets the _date of this PortfolioHoldingAgg.  # noqa: E501

        date  # noqa: E501

        :return: The _date of this PortfolioHoldingAgg.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this PortfolioHoldingAgg.

        date  # noqa: E501

        :param _date: The _date of this PortfolioHoldingAgg.  # noqa: E501
        :type: date
        """

        self.__date = _date

    @property
    def security_id(self):
        """Gets the security_id of this PortfolioHoldingAgg.  # noqa: E501

        securityId  # noqa: E501

        :return: The security_id of this PortfolioHoldingAgg.  # noqa: E501
        :rtype: str
        """
        return self._security_id

    @security_id.setter
    def security_id(self, security_id):
        """Sets the security_id of this PortfolioHoldingAgg.

        securityId  # noqa: E501

        :param security_id: The security_id of this PortfolioHoldingAgg.  # noqa: E501
        :type: str
        """

        self._security_id = security_id

    @property
    def shares(self):
        """Gets the shares of this PortfolioHoldingAgg.  # noqa: E501

        shares  # noqa: E501

        :return: The shares of this PortfolioHoldingAgg.  # noqa: E501
        :rtype: float
        """
        return self._shares

    @shares.setter
    def shares(self, shares):
        """Sets the shares of this PortfolioHoldingAgg.

        shares  # noqa: E501

        :param shares: The shares of this PortfolioHoldingAgg.  # noqa: E501
        :type: float
        """

        self._shares = shares

    @property
    def weight(self):
        """Gets the weight of this PortfolioHoldingAgg.  # noqa: E501

        weight  # noqa: E501

        :return: The weight of this PortfolioHoldingAgg.  # noqa: E501
        :rtype: float
        """
        return self._weight

    @weight.setter
    def weight(self, weight):
        """Sets the weight of this PortfolioHoldingAgg.

        weight  # noqa: E501

        :param weight: The weight of this PortfolioHoldingAgg.  # noqa: E501
        :type: float
        """

        self._weight = weight

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
        if issubclass(PortfolioHoldingAgg, dict):
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
        if not isinstance(other, PortfolioHoldingAgg):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PortfolioHoldingAgg):
            return True

        return self.to_dict() != other.to_dict()
