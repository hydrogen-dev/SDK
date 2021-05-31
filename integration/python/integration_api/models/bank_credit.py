# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.3.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from integration_api.configuration import Configuration


class BankCredit(object):
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
        'category': 'str',
        'description': 'str',
        'location': 'Location',
        'memo': 'str',
        'merchant': 'str',
        'merchant_id': 'str',
        'subcategory': 'str',
        'transaction_category_id': 'str',
        'transaction_type': 'str'
    }

    attribute_map = {
        'amount': 'amount',
        'category': 'category',
        'description': 'description',
        'location': 'location',
        'memo': 'memo',
        'merchant': 'merchant',
        'merchant_id': 'merchant_id',
        'subcategory': 'subcategory',
        'transaction_category_id': 'transaction_category_id',
        'transaction_type': 'transaction_type'
    }

    def __init__(self, amount=None, category=None, description=None, location=None, memo=None, merchant=None, merchant_id=None, subcategory=None, transaction_category_id=None, transaction_type=None, _configuration=None):  # noqa: E501
        """BankCredit - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._amount = None
        self._category = None
        self._description = None
        self._location = None
        self._memo = None
        self._merchant = None
        self._merchant_id = None
        self._subcategory = None
        self._transaction_category_id = None
        self._transaction_type = None
        self.discriminator = None

        self.amount = amount
        if category is not None:
            self.category = category
        if description is not None:
            self.description = description
        if location is not None:
            self.location = location
        if memo is not None:
            self.memo = memo
        if merchant is not None:
            self.merchant = merchant
        if merchant_id is not None:
            self.merchant_id = merchant_id
        if subcategory is not None:
            self.subcategory = subcategory
        if transaction_category_id is not None:
            self.transaction_category_id = transaction_category_id
        self.transaction_type = transaction_type

    @property
    def amount(self):
        """Gets the amount of this BankCredit.  # noqa: E501

        amount  # noqa: E501

        :return: The amount of this BankCredit.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this BankCredit.

        amount  # noqa: E501

        :param amount: The amount of this BankCredit.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and amount is None:
            raise ValueError("Invalid value for `amount`, must not be `None`")  # noqa: E501

        self._amount = amount

    @property
    def category(self):
        """Gets the category of this BankCredit.  # noqa: E501

        category  # noqa: E501

        :return: The category of this BankCredit.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this BankCredit.

        category  # noqa: E501

        :param category: The category of this BankCredit.  # noqa: E501
        :type: str
        """

        self._category = category

    @property
    def description(self):
        """Gets the description of this BankCredit.  # noqa: E501

        description  # noqa: E501

        :return: The description of this BankCredit.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this BankCredit.

        description  # noqa: E501

        :param description: The description of this BankCredit.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def location(self):
        """Gets the location of this BankCredit.  # noqa: E501


        :return: The location of this BankCredit.  # noqa: E501
        :rtype: Location
        """
        return self._location

    @location.setter
    def location(self, location):
        """Sets the location of this BankCredit.


        :param location: The location of this BankCredit.  # noqa: E501
        :type: Location
        """

        self._location = location

    @property
    def memo(self):
        """Gets the memo of this BankCredit.  # noqa: E501

        memo  # noqa: E501

        :return: The memo of this BankCredit.  # noqa: E501
        :rtype: str
        """
        return self._memo

    @memo.setter
    def memo(self, memo):
        """Sets the memo of this BankCredit.

        memo  # noqa: E501

        :param memo: The memo of this BankCredit.  # noqa: E501
        :type: str
        """

        self._memo = memo

    @property
    def merchant(self):
        """Gets the merchant of this BankCredit.  # noqa: E501

        merchant  # noqa: E501

        :return: The merchant of this BankCredit.  # noqa: E501
        :rtype: str
        """
        return self._merchant

    @merchant.setter
    def merchant(self, merchant):
        """Sets the merchant of this BankCredit.

        merchant  # noqa: E501

        :param merchant: The merchant of this BankCredit.  # noqa: E501
        :type: str
        """

        self._merchant = merchant

    @property
    def merchant_id(self):
        """Gets the merchant_id of this BankCredit.  # noqa: E501

        merchantId  # noqa: E501

        :return: The merchant_id of this BankCredit.  # noqa: E501
        :rtype: str
        """
        return self._merchant_id

    @merchant_id.setter
    def merchant_id(self, merchant_id):
        """Sets the merchant_id of this BankCredit.

        merchantId  # noqa: E501

        :param merchant_id: The merchant_id of this BankCredit.  # noqa: E501
        :type: str
        """

        self._merchant_id = merchant_id

    @property
    def subcategory(self):
        """Gets the subcategory of this BankCredit.  # noqa: E501

        subcategory  # noqa: E501

        :return: The subcategory of this BankCredit.  # noqa: E501
        :rtype: str
        """
        return self._subcategory

    @subcategory.setter
    def subcategory(self, subcategory):
        """Sets the subcategory of this BankCredit.

        subcategory  # noqa: E501

        :param subcategory: The subcategory of this BankCredit.  # noqa: E501
        :type: str
        """

        self._subcategory = subcategory

    @property
    def transaction_category_id(self):
        """Gets the transaction_category_id of this BankCredit.  # noqa: E501

        transactionCategoryId  # noqa: E501

        :return: The transaction_category_id of this BankCredit.  # noqa: E501
        :rtype: str
        """
        return self._transaction_category_id

    @transaction_category_id.setter
    def transaction_category_id(self, transaction_category_id):
        """Sets the transaction_category_id of this BankCredit.

        transactionCategoryId  # noqa: E501

        :param transaction_category_id: The transaction_category_id of this BankCredit.  # noqa: E501
        :type: str
        """

        self._transaction_category_id = transaction_category_id

    @property
    def transaction_type(self):
        """Gets the transaction_type of this BankCredit.  # noqa: E501

        transactionType  # noqa: E501

        :return: The transaction_type of this BankCredit.  # noqa: E501
        :rtype: str
        """
        return self._transaction_type

    @transaction_type.setter
    def transaction_type(self, transaction_type):
        """Sets the transaction_type of this BankCredit.

        transactionType  # noqa: E501

        :param transaction_type: The transaction_type of this BankCredit.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and transaction_type is None:
            raise ValueError("Invalid value for `transaction_type`, must not be `None`")  # noqa: E501

        self._transaction_type = transaction_type

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
        if issubclass(BankCredit, dict):
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
        if not isinstance(other, BankCredit):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, BankCredit):
            return True

        return self.to_dict() != other.to_dict()
