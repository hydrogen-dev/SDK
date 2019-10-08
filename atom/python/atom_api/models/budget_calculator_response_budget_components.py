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


class BudgetCalculatorResponseBudgetComponents(object):
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
        'category': 'str',
        'subcategory': 'str',
        'funds_budgeted': 'float',
        'funds_spent': 'float',
        'funds_remaining': 'float'
    }

    attribute_map = {
        'category': 'category',
        'subcategory': 'subcategory',
        'funds_budgeted': 'funds_budgeted',
        'funds_spent': 'funds_spent',
        'funds_remaining': 'funds_remaining'
    }

    def __init__(self, category=None, subcategory=None, funds_budgeted=None, funds_spent=None, funds_remaining=None):  # noqa: E501
        """BudgetCalculatorResponseBudgetComponents - a model defined in Swagger"""  # noqa: E501

        self._category = None
        self._subcategory = None
        self._funds_budgeted = None
        self._funds_spent = None
        self._funds_remaining = None
        self.discriminator = None

        if category is not None:
            self.category = category
        if subcategory is not None:
            self.subcategory = subcategory
        if funds_budgeted is not None:
            self.funds_budgeted = funds_budgeted
        if funds_spent is not None:
            self.funds_spent = funds_spent
        if funds_remaining is not None:
            self.funds_remaining = funds_remaining

    @property
    def category(self):
        """Gets the category of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501

        Name of the category  # noqa: E501

        :return: The category of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this BudgetCalculatorResponseBudgetComponents.

        Name of the category  # noqa: E501

        :param category: The category of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501
        :type: str
        """

        self._category = category

    @property
    def subcategory(self):
        """Gets the subcategory of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501

        Name of the subcategory  # noqa: E501

        :return: The subcategory of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501
        :rtype: str
        """
        return self._subcategory

    @subcategory.setter
    def subcategory(self, subcategory):
        """Sets the subcategory of this BudgetCalculatorResponseBudgetComponents.

        Name of the subcategory  # noqa: E501

        :param subcategory: The subcategory of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501
        :type: str
        """

        self._subcategory = subcategory

    @property
    def funds_budgeted(self):
        """Gets the funds_budgeted of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501

        Amount of funds originally budgeted in the category  # noqa: E501

        :return: The funds_budgeted of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501
        :rtype: float
        """
        return self._funds_budgeted

    @funds_budgeted.setter
    def funds_budgeted(self, funds_budgeted):
        """Sets the funds_budgeted of this BudgetCalculatorResponseBudgetComponents.

        Amount of funds originally budgeted in the category  # noqa: E501

        :param funds_budgeted: The funds_budgeted of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501
        :type: float
        """

        self._funds_budgeted = funds_budgeted

    @property
    def funds_spent(self):
        """Gets the funds_spent of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501

        Amount of funds spent in the category  # noqa: E501

        :return: The funds_spent of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501
        :rtype: float
        """
        return self._funds_spent

    @funds_spent.setter
    def funds_spent(self, funds_spent):
        """Sets the funds_spent of this BudgetCalculatorResponseBudgetComponents.

        Amount of funds spent in the category  # noqa: E501

        :param funds_spent: The funds_spent of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501
        :type: float
        """

        self._funds_spent = funds_spent

    @property
    def funds_remaining(self):
        """Gets the funds_remaining of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501

        Amount of funds remaining in the category; delta of funds_budgeted - funds_spent  # noqa: E501

        :return: The funds_remaining of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501
        :rtype: float
        """
        return self._funds_remaining

    @funds_remaining.setter
    def funds_remaining(self, funds_remaining):
        """Sets the funds_remaining of this BudgetCalculatorResponseBudgetComponents.

        Amount of funds remaining in the category; delta of funds_budgeted - funds_spent  # noqa: E501

        :param funds_remaining: The funds_remaining of this BudgetCalculatorResponseBudgetComponents.  # noqa: E501
        :type: float
        """

        self._funds_remaining = funds_remaining

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
        if issubclass(BudgetCalculatorResponseBudgetComponents, dict):
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
        if not isinstance(other, BudgetCalculatorResponseBudgetComponents):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
