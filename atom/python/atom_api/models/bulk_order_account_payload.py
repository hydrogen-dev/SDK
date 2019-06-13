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


class BulkOrderAccountPayload(object):
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
        '_date': 'date',
        'buy_transaction_code_id': 'str',
        'sell_transaction_code_id': 'str'
    }

    attribute_map = {
        '_date': 'date',
        'buy_transaction_code_id': 'buy_transaction_code_id',
        'sell_transaction_code_id': 'sell_transaction_code_id'
    }

    def __init__(self, _date=None, buy_transaction_code_id=None, sell_transaction_code_id=None):  # noqa: E501
        """BulkOrderAccountPayload - a model defined in Swagger"""  # noqa: E501

        self.__date = None
        self._buy_transaction_code_id = None
        self._sell_transaction_code_id = None
        self.discriminator = None

        self._date = _date
        self.buy_transaction_code_id = buy_transaction_code_id
        self.sell_transaction_code_id = sell_transaction_code_id

    @property
    def _date(self):
        """Gets the _date of this BulkOrderAccountPayload.  # noqa: E501

        Date for all the orders that should be aggregated together in the bulk order record  # noqa: E501

        :return: The _date of this BulkOrderAccountPayload.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this BulkOrderAccountPayload.

        Date for all the orders that should be aggregated together in the bulk order record  # noqa: E501

        :param _date: The _date of this BulkOrderAccountPayload.  # noqa: E501
        :type: date
        """
        if _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def buy_transaction_code_id(self):
        """Gets the buy_transaction_code_id of this BulkOrderAccountPayload.  # noqa: E501

        The ID of the transaction code that will ultimately be used to denote the buy transactions  # noqa: E501

        :return: The buy_transaction_code_id of this BulkOrderAccountPayload.  # noqa: E501
        :rtype: str
        """
        return self._buy_transaction_code_id

    @buy_transaction_code_id.setter
    def buy_transaction_code_id(self, buy_transaction_code_id):
        """Sets the buy_transaction_code_id of this BulkOrderAccountPayload.

        The ID of the transaction code that will ultimately be used to denote the buy transactions  # noqa: E501

        :param buy_transaction_code_id: The buy_transaction_code_id of this BulkOrderAccountPayload.  # noqa: E501
        :type: str
        """
        if buy_transaction_code_id is None:
            raise ValueError("Invalid value for `buy_transaction_code_id`, must not be `None`")  # noqa: E501

        self._buy_transaction_code_id = buy_transaction_code_id

    @property
    def sell_transaction_code_id(self):
        """Gets the sell_transaction_code_id of this BulkOrderAccountPayload.  # noqa: E501

        The ID of the transaction code that will ultimately be used to denote the sell transactions  # noqa: E501

        :return: The sell_transaction_code_id of this BulkOrderAccountPayload.  # noqa: E501
        :rtype: str
        """
        return self._sell_transaction_code_id

    @sell_transaction_code_id.setter
    def sell_transaction_code_id(self, sell_transaction_code_id):
        """Sets the sell_transaction_code_id of this BulkOrderAccountPayload.

        The ID of the transaction code that will ultimately be used to denote the sell transactions  # noqa: E501

        :param sell_transaction_code_id: The sell_transaction_code_id of this BulkOrderAccountPayload.  # noqa: E501
        :type: str
        """
        if sell_transaction_code_id is None:
            raise ValueError("Invalid value for `sell_transaction_code_id`, must not be `None`")  # noqa: E501

        self._sell_transaction_code_id = sell_transaction_code_id

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
        if issubclass(BulkOrderAccountPayload, dict):
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
        if not isinstance(other, BulkOrderAccountPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
