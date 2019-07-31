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

from atom_api.models.spending_analysis_response_outlier_transactions import SpendingAnalysisResponseOutlierTransactions  # noqa: F401,E501
from atom_api.models.spending_analysis_response_spending_by_merchant import SpendingAnalysisResponseSpendingByMerchant  # noqa: F401,E501
from atom_api.models.spending_analysis_response_subcategories import SpendingAnalysisResponseSubcategories  # noqa: F401,E501


class SpendingAnalysisResponseSpendingByCategory(object):
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
        'value': 'float',
        'weight': 'float',
        'benchmark_value': 'float',
        'benchmark_weight': 'float',
        'subcategories': 'list[SpendingAnalysisResponseSubcategories]',
        'spending_by_merchant': 'list[SpendingAnalysisResponseSpendingByMerchant]',
        'outlier_transactions': 'list[SpendingAnalysisResponseOutlierTransactions]'
    }

    attribute_map = {
        'category': 'category',
        'value': 'value',
        'weight': 'weight',
        'benchmark_value': 'benchmark_value',
        'benchmark_weight': 'benchmark_weight',
        'subcategories': 'subcategories',
        'spending_by_merchant': 'spending_by_merchant',
        'outlier_transactions': 'outlier_transactions'
    }

    def __init__(self, category=None, value=None, weight=None, benchmark_value=None, benchmark_weight=None, subcategories=None, spending_by_merchant=None, outlier_transactions=None):  # noqa: E501
        """SpendingAnalysisResponseSpendingByCategory - a model defined in Swagger"""  # noqa: E501

        self._category = None
        self._value = None
        self._weight = None
        self._benchmark_value = None
        self._benchmark_weight = None
        self._subcategories = None
        self._spending_by_merchant = None
        self._outlier_transactions = None
        self.discriminator = None

        if category is not None:
            self.category = category
        if value is not None:
            self.value = value
        if weight is not None:
            self.weight = weight
        if benchmark_value is not None:
            self.benchmark_value = benchmark_value
        if benchmark_weight is not None:
            self.benchmark_weight = benchmark_weight
        if subcategories is not None:
            self.subcategories = subcategories
        if spending_by_merchant is not None:
            self.spending_by_merchant = spending_by_merchant
        if outlier_transactions is not None:
            self.outlier_transactions = outlier_transactions

    @property
    def category(self):
        """Gets the category of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501

        Spending category as defined in the Nucleus transactions  # noqa: E501

        :return: The category of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this SpendingAnalysisResponseSpendingByCategory.

        Spending category as defined in the Nucleus transactions  # noqa: E501

        :param category: The category of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :type: str
        """

        self._category = category

    @property
    def value(self):
        """Gets the value of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501

        Sum of all transactions over the period for the given category  # noqa: E501

        :return: The value of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this SpendingAnalysisResponseSpendingByCategory.

        Sum of all transactions over the period for the given category  # noqa: E501

        :param value: The value of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :type: float
        """

        self._value = value

    @property
    def weight(self):
        """Gets the weight of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501

        The proportion of all spending over the period related to this category  # noqa: E501

        :return: The weight of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :rtype: float
        """
        return self._weight

    @weight.setter
    def weight(self, weight):
        """Sets the weight of this SpendingAnalysisResponseSpendingByCategory.

        The proportion of all spending over the period related to this category  # noqa: E501

        :param weight: The weight of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :type: float
        """

        self._weight = weight

    @property
    def benchmark_value(self):
        """Gets the benchmark_value of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501

        Sum of all transactions over the benchmark period for the given category  # noqa: E501

        :return: The benchmark_value of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :rtype: float
        """
        return self._benchmark_value

    @benchmark_value.setter
    def benchmark_value(self, benchmark_value):
        """Sets the benchmark_value of this SpendingAnalysisResponseSpendingByCategory.

        Sum of all transactions over the benchmark period for the given category  # noqa: E501

        :param benchmark_value: The benchmark_value of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :type: float
        """

        self._benchmark_value = benchmark_value

    @property
    def benchmark_weight(self):
        """Gets the benchmark_weight of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501

        The proportion of all spending over the benchmark period related to this category  # noqa: E501

        :return: The benchmark_weight of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :rtype: float
        """
        return self._benchmark_weight

    @benchmark_weight.setter
    def benchmark_weight(self, benchmark_weight):
        """Sets the benchmark_weight of this SpendingAnalysisResponseSpendingByCategory.

        The proportion of all spending over the benchmark period related to this category  # noqa: E501

        :param benchmark_weight: The benchmark_weight of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :type: float
        """

        self._benchmark_weight = benchmark_weight

    @property
    def subcategories(self):
        """Gets the subcategories of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501


        :return: The subcategories of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :rtype: list[SpendingAnalysisResponseSubcategories]
        """
        return self._subcategories

    @subcategories.setter
    def subcategories(self, subcategories):
        """Sets the subcategories of this SpendingAnalysisResponseSpendingByCategory.


        :param subcategories: The subcategories of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :type: list[SpendingAnalysisResponseSubcategories]
        """

        self._subcategories = subcategories

    @property
    def spending_by_merchant(self):
        """Gets the spending_by_merchant of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501


        :return: The spending_by_merchant of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :rtype: list[SpendingAnalysisResponseSpendingByMerchant]
        """
        return self._spending_by_merchant

    @spending_by_merchant.setter
    def spending_by_merchant(self, spending_by_merchant):
        """Sets the spending_by_merchant of this SpendingAnalysisResponseSpendingByCategory.


        :param spending_by_merchant: The spending_by_merchant of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :type: list[SpendingAnalysisResponseSpendingByMerchant]
        """

        self._spending_by_merchant = spending_by_merchant

    @property
    def outlier_transactions(self):
        """Gets the outlier_transactions of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501


        :return: The outlier_transactions of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :rtype: list[SpendingAnalysisResponseOutlierTransactions]
        """
        return self._outlier_transactions

    @outlier_transactions.setter
    def outlier_transactions(self, outlier_transactions):
        """Sets the outlier_transactions of this SpendingAnalysisResponseSpendingByCategory.


        :param outlier_transactions: The outlier_transactions of this SpendingAnalysisResponseSpendingByCategory.  # noqa: E501
        :type: list[SpendingAnalysisResponseOutlierTransactions]
        """

        self._outlier_transactions = outlier_transactions

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
        if issubclass(SpendingAnalysisResponseSpendingByCategory, dict):
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
        if not isinstance(other, SpendingAnalysisResponseSpendingByCategory):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
