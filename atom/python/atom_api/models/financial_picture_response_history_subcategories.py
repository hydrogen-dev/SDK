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


class FinancialPictureResponseHistorySubcategories(object):
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
        'subcategory': 'str',
        'balance': 'float'
    }

    attribute_map = {
        'subcategory': 'subcategory',
        'balance': 'balance'
    }

    def __init__(self, subcategory=None, balance=None):  # noqa: E501
        """FinancialPictureResponseHistorySubcategories - a model defined in Swagger"""  # noqa: E501

        self._subcategory = None
        self._balance = None
        self.discriminator = None

        if subcategory is not None:
            self.subcategory = subcategory
        if balance is not None:
            self.balance = balance

    @property
    def subcategory(self):
        """Gets the subcategory of this FinancialPictureResponseHistorySubcategories.  # noqa: E501

        Subcategory of the aggregation accounts. These accounts are dependent on the `subcategory` fields within the Nucleus Aggregation Account.  # noqa: E501

        :return: The subcategory of this FinancialPictureResponseHistorySubcategories.  # noqa: E501
        :rtype: str
        """
        return self._subcategory

    @subcategory.setter
    def subcategory(self, subcategory):
        """Sets the subcategory of this FinancialPictureResponseHistorySubcategories.

        Subcategory of the aggregation accounts. These accounts are dependent on the `subcategory` fields within the Nucleus Aggregation Account.  # noqa: E501

        :param subcategory: The subcategory of this FinancialPictureResponseHistorySubcategories.  # noqa: E501
        :type: str
        """

        self._subcategory = subcategory

    @property
    def balance(self):
        """Gets the balance of this FinancialPictureResponseHistorySubcategories.  # noqa: E501

        Total balance for this subcategory on this date.  # noqa: E501

        :return: The balance of this FinancialPictureResponseHistorySubcategories.  # noqa: E501
        :rtype: float
        """
        return self._balance

    @balance.setter
    def balance(self, balance):
        """Sets the balance of this FinancialPictureResponseHistorySubcategories.

        Total balance for this subcategory on this date.  # noqa: E501

        :param balance: The balance of this FinancialPictureResponseHistorySubcategories.  # noqa: E501
        :type: float
        """

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
        if issubclass(FinancialPictureResponseHistorySubcategories, dict):
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
        if not isinstance(other, FinancialPictureResponseHistorySubcategories):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other