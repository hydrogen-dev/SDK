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


class AggregationAccountHoldingPayload(object):
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
        'ticker': 'str',
        'ticker_name': 'str',
        'shares': 'float',
        'amount': 'float',
        'holding_type': 'str',
        'asset_class': 'str',
        'price': 'float',
        'cost_basis': 'float',
        'exchange': 'str',
        'cusip': 'str',
        'secondary_id': 'SecondaryId',
        'metadata': 'object'
    }

    attribute_map = {
        'aggregation_account_id': 'aggregation_account_id',
        'currency_code': 'currency_code',
        'ticker': 'ticker',
        'ticker_name': 'ticker_name',
        'shares': 'shares',
        'amount': 'amount',
        'holding_type': 'holding_type',
        'asset_class': 'asset_class',
        'price': 'price',
        'cost_basis': 'cost_basis',
        'exchange': 'exchange',
        'cusip': 'cusip',
        'secondary_id': 'secondary_id',
        'metadata': 'metadata'
    }

    def __init__(self, aggregation_account_id=None, currency_code=None, ticker=None, ticker_name=None, shares=None, amount=None, holding_type=None, asset_class=None, price=None, cost_basis=None, exchange=None, cusip=None, secondary_id=None, metadata=None):  # noqa: E501
        """AggregationAccountHoldingPayload - a model defined in Swagger"""  # noqa: E501

        self._aggregation_account_id = None
        self._currency_code = None
        self._ticker = None
        self._ticker_name = None
        self._shares = None
        self._amount = None
        self._holding_type = None
        self._asset_class = None
        self._price = None
        self._cost_basis = None
        self._exchange = None
        self._cusip = None
        self._secondary_id = None
        self._metadata = None
        self.discriminator = None

        self.aggregation_account_id = aggregation_account_id
        if currency_code is not None:
            self.currency_code = currency_code
        self.ticker = ticker
        self.ticker_name = ticker_name
        self.shares = shares
        if amount is not None:
            self.amount = amount
        if holding_type is not None:
            self.holding_type = holding_type
        if asset_class is not None:
            self.asset_class = asset_class
        if price is not None:
            self.price = price
        if cost_basis is not None:
            self.cost_basis = cost_basis
        if exchange is not None:
            self.exchange = exchange
        if cusip is not None:
            self.cusip = cusip
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if metadata is not None:
            self.metadata = metadata

    @property
    def aggregation_account_id(self):
        """Gets the aggregation_account_id of this AggregationAccountHoldingPayload.  # noqa: E501

        The unique identifier of the aggregation account the holding belongs  # noqa: E501

        :return: The aggregation_account_id of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: str
        """
        return self._aggregation_account_id

    @aggregation_account_id.setter
    def aggregation_account_id(self, aggregation_account_id):
        """Sets the aggregation_account_id of this AggregationAccountHoldingPayload.

        The unique identifier of the aggregation account the holding belongs  # noqa: E501

        :param aggregation_account_id: The aggregation_account_id of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: str
        """
        if aggregation_account_id is None:
            raise ValueError("Invalid value for `aggregation_account_id`, must not be `None`")  # noqa: E501

        self._aggregation_account_id = aggregation_account_id

    @property
    def currency_code(self):
        """Gets the currency_code of this AggregationAccountHoldingPayload.  # noqa: E501

        Alphabetic currency code for the currency of the holding, limited to 3 characters.  # noqa: E501

        :return: The currency_code of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this AggregationAccountHoldingPayload.

        Alphabetic currency code for the currency of the holding, limited to 3 characters.  # noqa: E501

        :param currency_code: The currency_code of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def ticker(self):
        """Gets the ticker of this AggregationAccountHoldingPayload.  # noqa: E501

        Ticker of the security holding  # noqa: E501

        :return: The ticker of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: str
        """
        return self._ticker

    @ticker.setter
    def ticker(self, ticker):
        """Sets the ticker of this AggregationAccountHoldingPayload.

        Ticker of the security holding  # noqa: E501

        :param ticker: The ticker of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: str
        """
        if ticker is None:
            raise ValueError("Invalid value for `ticker`, must not be `None`")  # noqa: E501

        self._ticker = ticker

    @property
    def ticker_name(self):
        """Gets the ticker_name of this AggregationAccountHoldingPayload.  # noqa: E501

        Ticker name of the security holding  # noqa: E501

        :return: The ticker_name of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: str
        """
        return self._ticker_name

    @ticker_name.setter
    def ticker_name(self, ticker_name):
        """Sets the ticker_name of this AggregationAccountHoldingPayload.

        Ticker name of the security holding  # noqa: E501

        :param ticker_name: The ticker_name of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: str
        """
        if ticker_name is None:
            raise ValueError("Invalid value for `ticker_name`, must not be `None`")  # noqa: E501

        self._ticker_name = ticker_name

    @property
    def shares(self):
        """Gets the shares of this AggregationAccountHoldingPayload.  # noqa: E501

        Number of shares of the security holding  # noqa: E501

        :return: The shares of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: float
        """
        return self._shares

    @shares.setter
    def shares(self, shares):
        """Sets the shares of this AggregationAccountHoldingPayload.

        Number of shares of the security holding  # noqa: E501

        :param shares: The shares of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: float
        """
        if shares is None:
            raise ValueError("Invalid value for `shares`, must not be `None`")  # noqa: E501

        self._shares = shares

    @property
    def amount(self):
        """Gets the amount of this AggregationAccountHoldingPayload.  # noqa: E501

        Monetary amount of the security holding  # noqa: E501

        :return: The amount of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this AggregationAccountHoldingPayload.

        Monetary amount of the security holding  # noqa: E501

        :param amount: The amount of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: float
        """

        self._amount = amount

    @property
    def holding_type(self):
        """Gets the holding_type of this AggregationAccountHoldingPayload.  # noqa: E501

        Describes the type of security holding such as “Equity”, “Fixed Income”, “Cash” or “Mutual Fund”  # noqa: E501

        :return: The holding_type of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: str
        """
        return self._holding_type

    @holding_type.setter
    def holding_type(self, holding_type):
        """Sets the holding_type of this AggregationAccountHoldingPayload.

        Describes the type of security holding such as “Equity”, “Fixed Income”, “Cash” or “Mutual Fund”  # noqa: E501

        :param holding_type: The holding_type of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: str
        """

        self._holding_type = holding_type

    @property
    def asset_class(self):
        """Gets the asset_class of this AggregationAccountHoldingPayload.  # noqa: E501

        Asset class of the holding such as “US Equity” or “Fixed Income”  # noqa: E501

        :return: The asset_class of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: str
        """
        return self._asset_class

    @asset_class.setter
    def asset_class(self, asset_class):
        """Sets the asset_class of this AggregationAccountHoldingPayload.

        Asset class of the holding such as “US Equity” or “Fixed Income”  # noqa: E501

        :param asset_class: The asset_class of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: str
        """

        self._asset_class = asset_class

    @property
    def price(self):
        """Gets the price of this AggregationAccountHoldingPayload.  # noqa: E501

        Price of the security holding  # noqa: E501

        :return: The price of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this AggregationAccountHoldingPayload.

        Price of the security holding  # noqa: E501

        :param price: The price of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: float
        """

        self._price = price

    @property
    def cost_basis(self):
        """Gets the cost_basis of this AggregationAccountHoldingPayload.  # noqa: E501

        The original value of the asset used for tax purposes, usually the purchase price  # noqa: E501

        :return: The cost_basis of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: float
        """
        return self._cost_basis

    @cost_basis.setter
    def cost_basis(self, cost_basis):
        """Sets the cost_basis of this AggregationAccountHoldingPayload.

        The original value of the asset used for tax purposes, usually the purchase price  # noqa: E501

        :param cost_basis: The cost_basis of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: float
        """

        self._cost_basis = cost_basis

    @property
    def exchange(self):
        """Gets the exchange of this AggregationAccountHoldingPayload.  # noqa: E501

        Financial exchange the security holding is traded on such as “NYSE or “NASDAQ”  # noqa: E501

        :return: The exchange of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: str
        """
        return self._exchange

    @exchange.setter
    def exchange(self, exchange):
        """Sets the exchange of this AggregationAccountHoldingPayload.

        Financial exchange the security holding is traded on such as “NYSE or “NASDAQ”  # noqa: E501

        :param exchange: The exchange of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: str
        """

        self._exchange = exchange

    @property
    def cusip(self):
        """Gets the cusip of this AggregationAccountHoldingPayload.  # noqa: E501

        The CUSIP of the security holding  # noqa: E501

        :return: The cusip of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: str
        """
        return self._cusip

    @cusip.setter
    def cusip(self, cusip):
        """Sets the cusip of this AggregationAccountHoldingPayload.

        The CUSIP of the security holding  # noqa: E501

        :param cusip: The cusip of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: str
        """

        self._cusip = cusip

    @property
    def secondary_id(self):
        """Gets the secondary_id of this AggregationAccountHoldingPayload.  # noqa: E501


        :return: The secondary_id of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this AggregationAccountHoldingPayload.


        :param secondary_id: The secondary_id of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def metadata(self):
        """Gets the metadata of this AggregationAccountHoldingPayload.  # noqa: E501

        Custom information associated with the aggregation account transaction in the format key:value  # noqa: E501

        :return: The metadata of this AggregationAccountHoldingPayload.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this AggregationAccountHoldingPayload.

        Custom information associated with the aggregation account transaction in the format key:value  # noqa: E501

        :param metadata: The metadata of this AggregationAccountHoldingPayload.  # noqa: E501
        :type: object
        """

        self._metadata = metadata

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
        if issubclass(AggregationAccountHoldingPayload, dict):
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
        if not isinstance(other, AggregationAccountHoldingPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
