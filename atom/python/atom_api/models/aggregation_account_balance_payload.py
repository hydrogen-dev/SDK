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

from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class AggregationAccountBalancePayload(object):
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
        'aggregation_account_id': 'str',
        'currency_code': 'str',
        'balance': 'str',
        'available_balance': 'str',
        'balance_time_stamp': 'str',
        'is_active': 'bool',
        'secondary_id': 'SecondaryId'
    }

    attribute_map = {
        'aggregation_account_id': 'aggregation_account_id',
        'currency_code': 'currency_code',
        'balance': 'balance',
        'available_balance': 'available_balance',
        'balance_time_stamp': 'balance_time_stamp',
        'is_active': 'is_active',
        'secondary_id': 'secondary_id'
    }

    def __init__(self, aggregation_account_id=None, currency_code=None, balance=None, available_balance=None, balance_time_stamp=None, is_active=True, secondary_id=None):  # noqa: E501
        """AggregationAccountBalancePayload - a model defined in Swagger"""  # noqa: E501

        self._aggregation_account_id = None
        self._currency_code = None
        self._balance = None
        self._available_balance = None
        self._balance_time_stamp = None
        self._is_active = None
        self._secondary_id = None
        self.discriminator = None

        self.aggregation_account_id = aggregation_account_id
        self.currency_code = currency_code
        if balance is not None:
            self.balance = balance
        if available_balance is not None:
            self.available_balance = available_balance
        if balance_time_stamp is not None:
            self.balance_time_stamp = balance_time_stamp
        if is_active is not None:
            self.is_active = is_active
        if secondary_id is not None:
            self.secondary_id = secondary_id

    @property
    def aggregation_account_id(self):
        """Gets the aggregation_account_id of this AggregationAccountBalancePayload.  # noqa: E501

        The ID of the aggregation account to which the balance record belongs  # noqa: E501

        :return: The aggregation_account_id of this AggregationAccountBalancePayload.  # noqa: E501
        :rtype: str
        """
        return self._aggregation_account_id

    @aggregation_account_id.setter
    def aggregation_account_id(self, aggregation_account_id):
        """Sets the aggregation_account_id of this AggregationAccountBalancePayload.

        The ID of the aggregation account to which the balance record belongs  # noqa: E501

        :param aggregation_account_id: The aggregation_account_id of this AggregationAccountBalancePayload.  # noqa: E501
        :type: str
        """
        if aggregation_account_id is None:
            raise ValueError("Invalid value for `aggregation_account_id`, must not be `None`")  # noqa: E501

        self._aggregation_account_id = aggregation_account_id

    @property
    def currency_code(self):
        """Gets the currency_code of this AggregationAccountBalancePayload.  # noqa: E501

        Alphabetic currency code for the currency of the balance, limited to 3 characters  # noqa: E501

        :return: The currency_code of this AggregationAccountBalancePayload.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this AggregationAccountBalancePayload.

        Alphabetic currency code for the currency of the balance, limited to 3 characters  # noqa: E501

        :param currency_code: The currency_code of this AggregationAccountBalancePayload.  # noqa: E501
        :type: str
        """
        if currency_code is None:
            raise ValueError("Invalid value for `currency_code`, must not be `None`")  # noqa: E501

        self._currency_code = currency_code

    @property
    def balance(self):
        """Gets the balance of this AggregationAccountBalancePayload.  # noqa: E501

        Balance of the aggregation account  # noqa: E501

        :return: The balance of this AggregationAccountBalancePayload.  # noqa: E501
        :rtype: str
        """
        return self._balance

    @balance.setter
    def balance(self, balance):
        """Sets the balance of this AggregationAccountBalancePayload.

        Balance of the aggregation account  # noqa: E501

        :param balance: The balance of this AggregationAccountBalancePayload.  # noqa: E501
        :type: str
        """

        self._balance = balance

    @property
    def available_balance(self):
        """Gets the available_balance of this AggregationAccountBalancePayload.  # noqa: E501

        Available balance in the aggregation account, usually taking into consideration pending transactions or available overdraft  # noqa: E501

        :return: The available_balance of this AggregationAccountBalancePayload.  # noqa: E501
        :rtype: str
        """
        return self._available_balance

    @available_balance.setter
    def available_balance(self, available_balance):
        """Sets the available_balance of this AggregationAccountBalancePayload.

        Available balance in the aggregation account, usually taking into consideration pending transactions or available overdraft  # noqa: E501

        :param available_balance: The available_balance of this AggregationAccountBalancePayload.  # noqa: E501
        :type: str
        """

        self._available_balance = available_balance

    @property
    def balance_time_stamp(self):
        """Gets the balance_time_stamp of this AggregationAccountBalancePayload.  # noqa: E501

        Date and time for when the balance above applies, defaults to current timestamp  # noqa: E501

        :return: The balance_time_stamp of this AggregationAccountBalancePayload.  # noqa: E501
        :rtype: str
        """
        return self._balance_time_stamp

    @balance_time_stamp.setter
    def balance_time_stamp(self, balance_time_stamp):
        """Sets the balance_time_stamp of this AggregationAccountBalancePayload.

        Date and time for when the balance above applies, defaults to current timestamp  # noqa: E501

        :param balance_time_stamp: The balance_time_stamp of this AggregationAccountBalancePayload.  # noqa: E501
        :type: str
        """

        self._balance_time_stamp = balance_time_stamp

    @property
    def is_active(self):
        """Gets the is_active of this AggregationAccountBalancePayload.  # noqa: E501

        Indicates if the aggregation account balance record is active. Defaults to true which indicates it is active  # noqa: E501

        :return: The is_active of this AggregationAccountBalancePayload.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this AggregationAccountBalancePayload.

        Indicates if the aggregation account balance record is active. Defaults to true which indicates it is active  # noqa: E501

        :param is_active: The is_active of this AggregationAccountBalancePayload.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def secondary_id(self):
        """Gets the secondary_id of this AggregationAccountBalancePayload.  # noqa: E501


        :return: The secondary_id of this AggregationAccountBalancePayload.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this AggregationAccountBalancePayload.


        :param secondary_id: The secondary_id of this AggregationAccountBalancePayload.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

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
        if issubclass(AggregationAccountBalancePayload, dict):
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
        if not isinstance(other, AggregationAccountBalancePayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
