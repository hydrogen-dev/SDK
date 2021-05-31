# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.9.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from proton_api.configuration import Configuration


class OrderRebalanceRequest(object):
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
        'non_fractional': 'bool',
        'order_scope': 'str',
        'buy_threshold': 'float',
        'commit_orders': 'bool',
        'account_id': 'str',
        'port_threshold': 'float',
        'use_cash_available': 'bool',
        'use_strategic': 'bool',
        'sell_transaction_code_id': 'str',
        'buy_transaction_code_id': 'str',
        'cash_portfolio_id': 'str',
        'restrictions_on': 'bool',
        'sell_threshold': 'float',
        'portfolio_id': 'str'
    }

    attribute_map = {
        'non_fractional': 'non_fractional',
        'order_scope': 'order_scope',
        'buy_threshold': 'buy_threshold',
        'commit_orders': 'commit_orders',
        'account_id': 'account_id',
        'port_threshold': 'port_threshold',
        'use_cash_available': 'use_cash_available',
        'use_strategic': 'use_strategic',
        'sell_transaction_code_id': 'sell_transaction_code_id',
        'buy_transaction_code_id': 'buy_transaction_code_id',
        'cash_portfolio_id': 'cash_portfolio_id',
        'restrictions_on': 'restrictions_on',
        'sell_threshold': 'sell_threshold',
        'portfolio_id': 'portfolio_id'
    }

    def __init__(self, non_fractional=False, order_scope=None, buy_threshold=0.0, commit_orders=True, account_id=None, port_threshold=0.0, use_cash_available=False, use_strategic=False, sell_transaction_code_id=None, buy_transaction_code_id=None, cash_portfolio_id=None, restrictions_on=False, sell_threshold=0.0, portfolio_id=None, _configuration=None):  # noqa: E501
        """OrderRebalanceRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._non_fractional = None
        self._order_scope = None
        self._buy_threshold = None
        self._commit_orders = None
        self._account_id = None
        self._port_threshold = None
        self._use_cash_available = None
        self._use_strategic = None
        self._sell_transaction_code_id = None
        self._buy_transaction_code_id = None
        self._cash_portfolio_id = None
        self._restrictions_on = None
        self._sell_threshold = None
        self._portfolio_id = None
        self.discriminator = None

        if non_fractional is not None:
            self.non_fractional = non_fractional
        self.order_scope = order_scope
        if buy_threshold is not None:
            self.buy_threshold = buy_threshold
        if commit_orders is not None:
            self.commit_orders = commit_orders
        if account_id is not None:
            self.account_id = account_id
        if port_threshold is not None:
            self.port_threshold = port_threshold
        if use_cash_available is not None:
            self.use_cash_available = use_cash_available
        if use_strategic is not None:
            self.use_strategic = use_strategic
        if sell_transaction_code_id is not None:
            self.sell_transaction_code_id = sell_transaction_code_id
        if buy_transaction_code_id is not None:
            self.buy_transaction_code_id = buy_transaction_code_id
        if cash_portfolio_id is not None:
            self.cash_portfolio_id = cash_portfolio_id
        if restrictions_on is not None:
            self.restrictions_on = restrictions_on
        if sell_threshold is not None:
            self.sell_threshold = sell_threshold
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id

    @property
    def non_fractional(self):
        """Gets the non_fractional of this OrderRebalanceRequest.  # noqa: E501


        :return: The non_fractional of this OrderRebalanceRequest.  # noqa: E501
        :rtype: bool
        """
        return self._non_fractional

    @non_fractional.setter
    def non_fractional(self, non_fractional):
        """Sets the non_fractional of this OrderRebalanceRequest.


        :param non_fractional: The non_fractional of this OrderRebalanceRequest.  # noqa: E501
        :type: bool
        """

        self._non_fractional = non_fractional

    @property
    def order_scope(self):
        """Gets the order_scope of this OrderRebalanceRequest.  # noqa: E501


        :return: The order_scope of this OrderRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._order_scope

    @order_scope.setter
    def order_scope(self, order_scope):
        """Sets the order_scope of this OrderRebalanceRequest.


        :param order_scope: The order_scope of this OrderRebalanceRequest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and order_scope is None:
            raise ValueError("Invalid value for `order_scope`, must not be `None`")  # noqa: E501
        allowed_values = ["all", "buy_only", "sell_only"]  # noqa: E501
        if (self._configuration.client_side_validation and
                order_scope not in allowed_values):
            raise ValueError(
                "Invalid value for `order_scope` ({0}), must be one of {1}"  # noqa: E501
                .format(order_scope, allowed_values)
            )

        self._order_scope = order_scope

    @property
    def buy_threshold(self):
        """Gets the buy_threshold of this OrderRebalanceRequest.  # noqa: E501


        :return: The buy_threshold of this OrderRebalanceRequest.  # noqa: E501
        :rtype: float
        """
        return self._buy_threshold

    @buy_threshold.setter
    def buy_threshold(self, buy_threshold):
        """Sets the buy_threshold of this OrderRebalanceRequest.


        :param buy_threshold: The buy_threshold of this OrderRebalanceRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                buy_threshold is not None and buy_threshold < 0):  # noqa: E501
            raise ValueError("Invalid value for `buy_threshold`, must be a value greater than or equal to `0`")  # noqa: E501

        self._buy_threshold = buy_threshold

    @property
    def commit_orders(self):
        """Gets the commit_orders of this OrderRebalanceRequest.  # noqa: E501


        :return: The commit_orders of this OrderRebalanceRequest.  # noqa: E501
        :rtype: bool
        """
        return self._commit_orders

    @commit_orders.setter
    def commit_orders(self, commit_orders):
        """Sets the commit_orders of this OrderRebalanceRequest.


        :param commit_orders: The commit_orders of this OrderRebalanceRequest.  # noqa: E501
        :type: bool
        """

        self._commit_orders = commit_orders

    @property
    def account_id(self):
        """Gets the account_id of this OrderRebalanceRequest.  # noqa: E501


        :return: The account_id of this OrderRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this OrderRebalanceRequest.


        :param account_id: The account_id of this OrderRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._account_id = account_id

    @property
    def port_threshold(self):
        """Gets the port_threshold of this OrderRebalanceRequest.  # noqa: E501


        :return: The port_threshold of this OrderRebalanceRequest.  # noqa: E501
        :rtype: float
        """
        return self._port_threshold

    @port_threshold.setter
    def port_threshold(self, port_threshold):
        """Sets the port_threshold of this OrderRebalanceRequest.


        :param port_threshold: The port_threshold of this OrderRebalanceRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                port_threshold is not None and port_threshold < 0):  # noqa: E501
            raise ValueError("Invalid value for `port_threshold`, must be a value greater than or equal to `0`")  # noqa: E501

        self._port_threshold = port_threshold

    @property
    def use_cash_available(self):
        """Gets the use_cash_available of this OrderRebalanceRequest.  # noqa: E501


        :return: The use_cash_available of this OrderRebalanceRequest.  # noqa: E501
        :rtype: bool
        """
        return self._use_cash_available

    @use_cash_available.setter
    def use_cash_available(self, use_cash_available):
        """Sets the use_cash_available of this OrderRebalanceRequest.


        :param use_cash_available: The use_cash_available of this OrderRebalanceRequest.  # noqa: E501
        :type: bool
        """

        self._use_cash_available = use_cash_available

    @property
    def use_strategic(self):
        """Gets the use_strategic of this OrderRebalanceRequest.  # noqa: E501


        :return: The use_strategic of this OrderRebalanceRequest.  # noqa: E501
        :rtype: bool
        """
        return self._use_strategic

    @use_strategic.setter
    def use_strategic(self, use_strategic):
        """Sets the use_strategic of this OrderRebalanceRequest.


        :param use_strategic: The use_strategic of this OrderRebalanceRequest.  # noqa: E501
        :type: bool
        """

        self._use_strategic = use_strategic

    @property
    def sell_transaction_code_id(self):
        """Gets the sell_transaction_code_id of this OrderRebalanceRequest.  # noqa: E501


        :return: The sell_transaction_code_id of this OrderRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._sell_transaction_code_id

    @sell_transaction_code_id.setter
    def sell_transaction_code_id(self, sell_transaction_code_id):
        """Sets the sell_transaction_code_id of this OrderRebalanceRequest.


        :param sell_transaction_code_id: The sell_transaction_code_id of this OrderRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._sell_transaction_code_id = sell_transaction_code_id

    @property
    def buy_transaction_code_id(self):
        """Gets the buy_transaction_code_id of this OrderRebalanceRequest.  # noqa: E501


        :return: The buy_transaction_code_id of this OrderRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._buy_transaction_code_id

    @buy_transaction_code_id.setter
    def buy_transaction_code_id(self, buy_transaction_code_id):
        """Sets the buy_transaction_code_id of this OrderRebalanceRequest.


        :param buy_transaction_code_id: The buy_transaction_code_id of this OrderRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._buy_transaction_code_id = buy_transaction_code_id

    @property
    def cash_portfolio_id(self):
        """Gets the cash_portfolio_id of this OrderRebalanceRequest.  # noqa: E501


        :return: The cash_portfolio_id of this OrderRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._cash_portfolio_id

    @cash_portfolio_id.setter
    def cash_portfolio_id(self, cash_portfolio_id):
        """Sets the cash_portfolio_id of this OrderRebalanceRequest.


        :param cash_portfolio_id: The cash_portfolio_id of this OrderRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._cash_portfolio_id = cash_portfolio_id

    @property
    def restrictions_on(self):
        """Gets the restrictions_on of this OrderRebalanceRequest.  # noqa: E501


        :return: The restrictions_on of this OrderRebalanceRequest.  # noqa: E501
        :rtype: bool
        """
        return self._restrictions_on

    @restrictions_on.setter
    def restrictions_on(self, restrictions_on):
        """Sets the restrictions_on of this OrderRebalanceRequest.


        :param restrictions_on: The restrictions_on of this OrderRebalanceRequest.  # noqa: E501
        :type: bool
        """

        self._restrictions_on = restrictions_on

    @property
    def sell_threshold(self):
        """Gets the sell_threshold of this OrderRebalanceRequest.  # noqa: E501


        :return: The sell_threshold of this OrderRebalanceRequest.  # noqa: E501
        :rtype: float
        """
        return self._sell_threshold

    @sell_threshold.setter
    def sell_threshold(self, sell_threshold):
        """Sets the sell_threshold of this OrderRebalanceRequest.


        :param sell_threshold: The sell_threshold of this OrderRebalanceRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                sell_threshold is not None and sell_threshold < 1):  # noqa: E501
            raise ValueError("Invalid value for `sell_threshold`, must be a value greater than or equal to `1`")  # noqa: E501

        self._sell_threshold = sell_threshold

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this OrderRebalanceRequest.  # noqa: E501


        :return: The portfolio_id of this OrderRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this OrderRebalanceRequest.


        :param portfolio_id: The portfolio_id of this OrderRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

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
        if issubclass(OrderRebalanceRequest, dict):
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
        if not isinstance(other, OrderRebalanceRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, OrderRebalanceRequest):
            return True

        return self.to_dict() != other.to_dict()
