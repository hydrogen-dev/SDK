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


class MortgageCalculatorPeriodicPayment(object):
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
        'home_price': 'float',
        'down_payment': 'float',
        'interest_rate': 'float',
        'mortgage_term': 'int'
    }

    attribute_map = {
        'home_price': 'home_price',
        'down_payment': 'down_payment',
        'interest_rate': 'interest_rate',
        'mortgage_term': 'mortgage_term'
    }

    def __init__(self, home_price=None, down_payment=None, interest_rate=None, mortgage_term=None):  # noqa: E501
        """MortgageCalculatorPeriodicPayment - a model defined in Swagger"""  # noqa: E501

        self._home_price = None
        self._down_payment = None
        self._interest_rate = None
        self._mortgage_term = None
        self.discriminator = None

        self.home_price = home_price
        self.down_payment = down_payment
        if interest_rate is not None:
            self.interest_rate = interest_rate
        if mortgage_term is not None:
            self.mortgage_term = mortgage_term

    @property
    def home_price(self):
        """Gets the home_price of this MortgageCalculatorPeriodicPayment.  # noqa: E501

        The home price  # noqa: E501

        :return: The home_price of this MortgageCalculatorPeriodicPayment.  # noqa: E501
        :rtype: float
        """
        return self._home_price

    @home_price.setter
    def home_price(self, home_price):
        """Sets the home_price of this MortgageCalculatorPeriodicPayment.

        The home price  # noqa: E501

        :param home_price: The home_price of this MortgageCalculatorPeriodicPayment.  # noqa: E501
        :type: float
        """
        if home_price is None:
            raise ValueError("Invalid value for `home_price`, must not be `None`")  # noqa: E501
        if home_price is not None and home_price <= 0:  # noqa: E501
            raise ValueError("Invalid value for `home_price`, must be a value greater than `0`")  # noqa: E501

        self._home_price = home_price

    @property
    def down_payment(self):
        """Gets the down_payment of this MortgageCalculatorPeriodicPayment.  # noqa: E501

        The mortgage down payment  # noqa: E501

        :return: The down_payment of this MortgageCalculatorPeriodicPayment.  # noqa: E501
        :rtype: float
        """
        return self._down_payment

    @down_payment.setter
    def down_payment(self, down_payment):
        """Sets the down_payment of this MortgageCalculatorPeriodicPayment.

        The mortgage down payment  # noqa: E501

        :param down_payment: The down_payment of this MortgageCalculatorPeriodicPayment.  # noqa: E501
        :type: float
        """
        if down_payment is None:
            raise ValueError("Invalid value for `down_payment`, must not be `None`")  # noqa: E501
        if down_payment is not None and down_payment < 0:  # noqa: E501
            raise ValueError("Invalid value for `down_payment`, must be a value greater than or equal to `0`")  # noqa: E501

        self._down_payment = down_payment

    @property
    def interest_rate(self):
        """Gets the interest_rate of this MortgageCalculatorPeriodicPayment.  # noqa: E501

        The annualized interest rate  # noqa: E501

        :return: The interest_rate of this MortgageCalculatorPeriodicPayment.  # noqa: E501
        :rtype: float
        """
        return self._interest_rate

    @interest_rate.setter
    def interest_rate(self, interest_rate):
        """Sets the interest_rate of this MortgageCalculatorPeriodicPayment.

        The annualized interest rate  # noqa: E501

        :param interest_rate: The interest_rate of this MortgageCalculatorPeriodicPayment.  # noqa: E501
        :type: float
        """
        if interest_rate is not None and interest_rate >= 1:  # noqa: E501
            raise ValueError("Invalid value for `interest_rate`, must be a value less than `1`")  # noqa: E501
        if interest_rate is not None and interest_rate < 0:  # noqa: E501
            raise ValueError("Invalid value for `interest_rate`, must be a value greater than or equal to `0`")  # noqa: E501

        self._interest_rate = interest_rate

    @property
    def mortgage_term(self):
        """Gets the mortgage_term of this MortgageCalculatorPeriodicPayment.  # noqa: E501

        The mortgage term, in months  # noqa: E501

        :return: The mortgage_term of this MortgageCalculatorPeriodicPayment.  # noqa: E501
        :rtype: int
        """
        return self._mortgage_term

    @mortgage_term.setter
    def mortgage_term(self, mortgage_term):
        """Sets the mortgage_term of this MortgageCalculatorPeriodicPayment.

        The mortgage term, in months  # noqa: E501

        :param mortgage_term: The mortgage_term of this MortgageCalculatorPeriodicPayment.  # noqa: E501
        :type: int
        """
        if mortgage_term is not None and mortgage_term > 600:  # noqa: E501
            raise ValueError("Invalid value for `mortgage_term`, must be a value less than or equal to `600`")  # noqa: E501
        if mortgage_term is not None and mortgage_term <= 0:  # noqa: E501
            raise ValueError("Invalid value for `mortgage_term`, must be a value greater than `0`")  # noqa: E501

        self._mortgage_term = mortgage_term

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
        if issubclass(MortgageCalculatorPeriodicPayment, dict):
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
        if not isinstance(other, MortgageCalculatorPeriodicPayment):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other