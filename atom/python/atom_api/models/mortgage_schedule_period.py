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


class MortgageSchedulePeriod(object):
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
        'payment': 'float',
        'principal': 'float',
        'interest': 'float',
        'cumulative_payment': 'float',
        'cumulative_principal': 'float',
        'cumulative_interest': 'float',
        'balance': 'float'
    }

    attribute_map = {
        'payment': 'Payment',
        'principal': 'Principal',
        'interest': 'Interest',
        'cumulative_payment': 'Cumulative_Payment',
        'cumulative_principal': 'Cumulative_Principal',
        'cumulative_interest': 'Cumulative_Interest',
        'balance': 'Balance'
    }

    def __init__(self, payment=None, principal=None, interest=None, cumulative_payment=None, cumulative_principal=None, cumulative_interest=None, balance=None):  # noqa: E501
        """MortgageSchedulePeriod - a model defined in Swagger"""  # noqa: E501

        self._payment = None
        self._principal = None
        self._interest = None
        self._cumulative_payment = None
        self._cumulative_principal = None
        self._cumulative_interest = None
        self._balance = None
        self.discriminator = None

        self.payment = payment
        self.principal = principal
        self.interest = interest
        self.cumulative_payment = cumulative_payment
        self.cumulative_principal = cumulative_principal
        self.cumulative_interest = cumulative_interest
        self.balance = balance

    @property
    def payment(self):
        """Gets the payment of this MortgageSchedulePeriod.  # noqa: E501

        The total payment made for this period, consisting of interest and principal.  # noqa: E501

        :return: The payment of this MortgageSchedulePeriod.  # noqa: E501
        :rtype: float
        """
        return self._payment

    @payment.setter
    def payment(self, payment):
        """Sets the payment of this MortgageSchedulePeriod.

        The total payment made for this period, consisting of interest and principal.  # noqa: E501

        :param payment: The payment of this MortgageSchedulePeriod.  # noqa: E501
        :type: float
        """
        if payment is None:
            raise ValueError("Invalid value for `payment`, must not be `None`")  # noqa: E501
        if payment is not None and payment < 0:  # noqa: E501
            raise ValueError("Invalid value for `payment`, must be a value greater than or equal to `0`")  # noqa: E501

        self._payment = payment

    @property
    def principal(self):
        """Gets the principal of this MortgageSchedulePeriod.  # noqa: E501

        The principal payment made for this period.  # noqa: E501

        :return: The principal of this MortgageSchedulePeriod.  # noqa: E501
        :rtype: float
        """
        return self._principal

    @principal.setter
    def principal(self, principal):
        """Sets the principal of this MortgageSchedulePeriod.

        The principal payment made for this period.  # noqa: E501

        :param principal: The principal of this MortgageSchedulePeriod.  # noqa: E501
        :type: float
        """
        if principal is None:
            raise ValueError("Invalid value for `principal`, must not be `None`")  # noqa: E501
        if principal is not None and principal < 0:  # noqa: E501
            raise ValueError("Invalid value for `principal`, must be a value greater than or equal to `0`")  # noqa: E501

        self._principal = principal

    @property
    def interest(self):
        """Gets the interest of this MortgageSchedulePeriod.  # noqa: E501

        The interest payment made for this period.  # noqa: E501

        :return: The interest of this MortgageSchedulePeriod.  # noqa: E501
        :rtype: float
        """
        return self._interest

    @interest.setter
    def interest(self, interest):
        """Sets the interest of this MortgageSchedulePeriod.

        The interest payment made for this period.  # noqa: E501

        :param interest: The interest of this MortgageSchedulePeriod.  # noqa: E501
        :type: float
        """
        if interest is None:
            raise ValueError("Invalid value for `interest`, must not be `None`")  # noqa: E501
        if interest is not None and interest < 0:  # noqa: E501
            raise ValueError("Invalid value for `interest`, must be a value greater than or equal to `0`")  # noqa: E501

        self._interest = interest

    @property
    def cumulative_payment(self):
        """Gets the cumulative_payment of this MortgageSchedulePeriod.  # noqa: E501

        The cumulative total payment made up to and including this period.  # noqa: E501

        :return: The cumulative_payment of this MortgageSchedulePeriod.  # noqa: E501
        :rtype: float
        """
        return self._cumulative_payment

    @cumulative_payment.setter
    def cumulative_payment(self, cumulative_payment):
        """Sets the cumulative_payment of this MortgageSchedulePeriod.

        The cumulative total payment made up to and including this period.  # noqa: E501

        :param cumulative_payment: The cumulative_payment of this MortgageSchedulePeriod.  # noqa: E501
        :type: float
        """
        if cumulative_payment is None:
            raise ValueError("Invalid value for `cumulative_payment`, must not be `None`")  # noqa: E501
        if cumulative_payment is not None and cumulative_payment < 0:  # noqa: E501
            raise ValueError("Invalid value for `cumulative_payment`, must be a value greater than or equal to `0`")  # noqa: E501

        self._cumulative_payment = cumulative_payment

    @property
    def cumulative_principal(self):
        """Gets the cumulative_principal of this MortgageSchedulePeriod.  # noqa: E501

        The cumulative principal payment made up to and including this period.  # noqa: E501

        :return: The cumulative_principal of this MortgageSchedulePeriod.  # noqa: E501
        :rtype: float
        """
        return self._cumulative_principal

    @cumulative_principal.setter
    def cumulative_principal(self, cumulative_principal):
        """Sets the cumulative_principal of this MortgageSchedulePeriod.

        The cumulative principal payment made up to and including this period.  # noqa: E501

        :param cumulative_principal: The cumulative_principal of this MortgageSchedulePeriod.  # noqa: E501
        :type: float
        """
        if cumulative_principal is None:
            raise ValueError("Invalid value for `cumulative_principal`, must not be `None`")  # noqa: E501
        if cumulative_principal is not None and cumulative_principal < 0:  # noqa: E501
            raise ValueError("Invalid value for `cumulative_principal`, must be a value greater than or equal to `0`")  # noqa: E501

        self._cumulative_principal = cumulative_principal

    @property
    def cumulative_interest(self):
        """Gets the cumulative_interest of this MortgageSchedulePeriod.  # noqa: E501

        The cumulative interest payment made up to and including this period.  # noqa: E501

        :return: The cumulative_interest of this MortgageSchedulePeriod.  # noqa: E501
        :rtype: float
        """
        return self._cumulative_interest

    @cumulative_interest.setter
    def cumulative_interest(self, cumulative_interest):
        """Sets the cumulative_interest of this MortgageSchedulePeriod.

        The cumulative interest payment made up to and including this period.  # noqa: E501

        :param cumulative_interest: The cumulative_interest of this MortgageSchedulePeriod.  # noqa: E501
        :type: float
        """
        if cumulative_interest is None:
            raise ValueError("Invalid value for `cumulative_interest`, must not be `None`")  # noqa: E501
        if cumulative_interest is not None and cumulative_interest < 0:  # noqa: E501
            raise ValueError("Invalid value for `cumulative_interest`, must be a value greater than or equal to `0`")  # noqa: E501

        self._cumulative_interest = cumulative_interest

    @property
    def balance(self):
        """Gets the balance of this MortgageSchedulePeriod.  # noqa: E501

        The remaining mortgage balance at the end of the period.  # noqa: E501

        :return: The balance of this MortgageSchedulePeriod.  # noqa: E501
        :rtype: float
        """
        return self._balance

    @balance.setter
    def balance(self, balance):
        """Sets the balance of this MortgageSchedulePeriod.

        The remaining mortgage balance at the end of the period.  # noqa: E501

        :param balance: The balance of this MortgageSchedulePeriod.  # noqa: E501
        :type: float
        """
        if balance is None:
            raise ValueError("Invalid value for `balance`, must not be `None`")  # noqa: E501
        if balance is not None and balance < 0:  # noqa: E501
            raise ValueError("Invalid value for `balance`, must be a value greater than or equal to `0`")  # noqa: E501

        self._balance = balance

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
        if issubclass(MortgageSchedulePeriod, dict):
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
        if not isinstance(other, MortgageSchedulePeriod):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
