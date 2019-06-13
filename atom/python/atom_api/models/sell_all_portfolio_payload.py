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


class SellAllPortfolioPayload(object):
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
        'sell_transaction_code_id': 'str',
        'buy_transaction_code_id': 'str',
        'buy_threshold': 'float',
        'cash_sec_id': 'str',
        'commit_orders': 'bool',
        'non_fractional': 'bool',
        'port_threshold': 'float',
        'restrictions_on': 'bool',
        'sell_threshold': 'float'
    }

    attribute_map = {
        'sell_transaction_code_id': 'sell_transaction_code_id',
        'buy_transaction_code_id': 'buy_transaction_code_id',
        'buy_threshold': 'buy_threshold',
        'cash_sec_id': 'cash_sec_id',
        'commit_orders': 'commit_orders',
        'non_fractional': 'non_fractional',
        'port_threshold': 'port_threshold',
        'restrictions_on': 'restrictions_on',
        'sell_threshold': 'sell_threshold'
    }

    def __init__(self, sell_transaction_code_id=None, buy_transaction_code_id=None, buy_threshold=0.0, cash_sec_id=None, commit_orders=True, non_fractional=False, port_threshold=0.0, restrictions_on=False, sell_threshold=0.0):  # noqa: E501
        """SellAllPortfolioPayload - a model defined in Swagger"""  # noqa: E501

        self._sell_transaction_code_id = None
        self._buy_transaction_code_id = None
        self._buy_threshold = None
        self._cash_sec_id = None
        self._commit_orders = None
        self._non_fractional = None
        self._port_threshold = None
        self._restrictions_on = None
        self._sell_threshold = None
        self.discriminator = None

        self.sell_transaction_code_id = sell_transaction_code_id
        if buy_transaction_code_id is not None:
            self.buy_transaction_code_id = buy_transaction_code_id
        if buy_threshold is not None:
            self.buy_threshold = buy_threshold
        if cash_sec_id is not None:
            self.cash_sec_id = cash_sec_id
        if commit_orders is not None:
            self.commit_orders = commit_orders
        if non_fractional is not None:
            self.non_fractional = non_fractional
        if port_threshold is not None:
            self.port_threshold = port_threshold
        if restrictions_on is not None:
            self.restrictions_on = restrictions_on
        if sell_threshold is not None:
            self.sell_threshold = sell_threshold

    @property
    def sell_transaction_code_id(self):
        """Gets the sell_transaction_code_id of this SellAllPortfolioPayload.  # noqa: E501

        The ID of the transaction code to denote a sell transaction  # noqa: E501

        :return: The sell_transaction_code_id of this SellAllPortfolioPayload.  # noqa: E501
        :rtype: str
        """
        return self._sell_transaction_code_id

    @sell_transaction_code_id.setter
    def sell_transaction_code_id(self, sell_transaction_code_id):
        """Sets the sell_transaction_code_id of this SellAllPortfolioPayload.

        The ID of the transaction code to denote a sell transaction  # noqa: E501

        :param sell_transaction_code_id: The sell_transaction_code_id of this SellAllPortfolioPayload.  # noqa: E501
        :type: str
        """
        if sell_transaction_code_id is None:
            raise ValueError("Invalid value for `sell_transaction_code_id`, must not be `None`")  # noqa: E501

        self._sell_transaction_code_id = sell_transaction_code_id

    @property
    def buy_transaction_code_id(self):
        """Gets the buy_transaction_code_id of this SellAllPortfolioPayload.  # noqa: E501

        The ID of the transaction code to denote a buy transaction  # noqa: E501

        :return: The buy_transaction_code_id of this SellAllPortfolioPayload.  # noqa: E501
        :rtype: str
        """
        return self._buy_transaction_code_id

    @buy_transaction_code_id.setter
    def buy_transaction_code_id(self, buy_transaction_code_id):
        """Sets the buy_transaction_code_id of this SellAllPortfolioPayload.

        The ID of the transaction code to denote a buy transaction  # noqa: E501

        :param buy_transaction_code_id: The buy_transaction_code_id of this SellAllPortfolioPayload.  # noqa: E501
        :type: str
        """

        self._buy_transaction_code_id = buy_transaction_code_id

    @property
    def buy_threshold(self):
        """Gets the buy_threshold of this SellAllPortfolioPayload.  # noqa: E501

        Buying threshold for the account as a monetary amount. Defaults to 0  # noqa: E501

        :return: The buy_threshold of this SellAllPortfolioPayload.  # noqa: E501
        :rtype: float
        """
        return self._buy_threshold

    @buy_threshold.setter
    def buy_threshold(self, buy_threshold):
        """Sets the buy_threshold of this SellAllPortfolioPayload.

        Buying threshold for the account as a monetary amount. Defaults to 0  # noqa: E501

        :param buy_threshold: The buy_threshold of this SellAllPortfolioPayload.  # noqa: E501
        :type: float
        """

        self._buy_threshold = buy_threshold

    @property
    def cash_sec_id(self):
        """Gets the cash_sec_id of this SellAllPortfolioPayload.  # noqa: E501

        The ID of the cash security for the portfolio  # noqa: E501

        :return: The cash_sec_id of this SellAllPortfolioPayload.  # noqa: E501
        :rtype: str
        """
        return self._cash_sec_id

    @cash_sec_id.setter
    def cash_sec_id(self, cash_sec_id):
        """Sets the cash_sec_id of this SellAllPortfolioPayload.

        The ID of the cash security for the portfolio  # noqa: E501

        :param cash_sec_id: The cash_sec_id of this SellAllPortfolioPayload.  # noqa: E501
        :type: str
        """

        self._cash_sec_id = cash_sec_id

    @property
    def commit_orders(self):
        """Gets the commit_orders of this SellAllPortfolioPayload.  # noqa: E501

        Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed  # noqa: E501

        :return: The commit_orders of this SellAllPortfolioPayload.  # noqa: E501
        :rtype: bool
        """
        return self._commit_orders

    @commit_orders.setter
    def commit_orders(self, commit_orders):
        """Sets the commit_orders of this SellAllPortfolioPayload.

        Indicates if the orders should be committed for execution. Defaults to true which indicates they should be committed  # noqa: E501

        :param commit_orders: The commit_orders of this SellAllPortfolioPayload.  # noqa: E501
        :type: bool
        """

        self._commit_orders = commit_orders

    @property
    def non_fractional(self):
        """Gets the non_fractional of this SellAllPortfolioPayload.  # noqa: E501

        Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed  # noqa: E501

        :return: The non_fractional of this SellAllPortfolioPayload.  # noqa: E501
        :rtype: bool
        """
        return self._non_fractional

    @non_fractional.setter
    def non_fractional(self, non_fractional):
        """Sets the non_fractional of this SellAllPortfolioPayload.

        Indicates if purchasing/selling fractional shares of securities is allowed. Defaults to false which indicates it is allowed  # noqa: E501

        :param non_fractional: The non_fractional of this SellAllPortfolioPayload.  # noqa: E501
        :type: bool
        """

        self._non_fractional = non_fractional

    @property
    def port_threshold(self):
        """Gets the port_threshold of this SellAllPortfolioPayload.  # noqa: E501

        Threshold for the portfolio as a monetary amount. Defaults to 0  # noqa: E501

        :return: The port_threshold of this SellAllPortfolioPayload.  # noqa: E501
        :rtype: float
        """
        return self._port_threshold

    @port_threshold.setter
    def port_threshold(self, port_threshold):
        """Sets the port_threshold of this SellAllPortfolioPayload.

        Threshold for the portfolio as a monetary amount. Defaults to 0  # noqa: E501

        :param port_threshold: The port_threshold of this SellAllPortfolioPayload.  # noqa: E501
        :type: float
        """

        self._port_threshold = port_threshold

    @property
    def restrictions_on(self):
        """Gets the restrictions_on of this SellAllPortfolioPayload.  # noqa: E501

        Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not  # noqa: E501

        :return: The restrictions_on of this SellAllPortfolioPayload.  # noqa: E501
        :rtype: bool
        """
        return self._restrictions_on

    @restrictions_on.setter
    def restrictions_on(self, restrictions_on):
        """Sets the restrictions_on of this SellAllPortfolioPayload.

        Indicates if there are restrictions on the account that should be followed. Defaults to false which indicates there are not  # noqa: E501

        :param restrictions_on: The restrictions_on of this SellAllPortfolioPayload.  # noqa: E501
        :type: bool
        """

        self._restrictions_on = restrictions_on

    @property
    def sell_threshold(self):
        """Gets the sell_threshold of this SellAllPortfolioPayload.  # noqa: E501

        Selling threshold for the account as a monetary amount. Defaults to 0  # noqa: E501

        :return: The sell_threshold of this SellAllPortfolioPayload.  # noqa: E501
        :rtype: float
        """
        return self._sell_threshold

    @sell_threshold.setter
    def sell_threshold(self, sell_threshold):
        """Sets the sell_threshold of this SellAllPortfolioPayload.

        Selling threshold for the account as a monetary amount. Defaults to 0  # noqa: E501

        :param sell_threshold: The sell_threshold of this SellAllPortfolioPayload.  # noqa: E501
        :type: float
        """

        self._sell_threshold = sell_threshold

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
        if issubclass(SellAllPortfolioPayload, dict):
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
        if not isinstance(other, SellAllPortfolioPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
