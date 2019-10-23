# coding: utf-8

"""
    Hydrogen Molecule API

    The Hydrogen Molecule API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class CurrencyTransferSpecificResponse(object):
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
        'id': 'str',
        'sender_wallet_id': 'str',
        'receiver_wallet_id': 'str',
        'currency_symbol': 'str',
        'amount': 'float',
        'tx_hash': 'str',
        'create_date': 'str',
        'update_date': 'str'
    }

    attribute_map = {
        'id': 'id',
        'sender_wallet_id': 'sender_wallet_id',
        'receiver_wallet_id': 'receiver_wallet_id',
        'currency_symbol': 'currency_symbol',
        'amount': 'amount',
        'tx_hash': 'tx_hash',
        'create_date': 'create_date',
        'update_date': 'update_date'
    }

    def __init__(self, id=None, sender_wallet_id=None, receiver_wallet_id=None, currency_symbol=None, amount=None, tx_hash=None, create_date=None, update_date=None):  # noqa: E501
        """CurrencyTransferSpecificResponse - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._sender_wallet_id = None
        self._receiver_wallet_id = None
        self._currency_symbol = None
        self._amount = None
        self._tx_hash = None
        self._create_date = None
        self._update_date = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if sender_wallet_id is not None:
            self.sender_wallet_id = sender_wallet_id
        if receiver_wallet_id is not None:
            self.receiver_wallet_id = receiver_wallet_id
        if currency_symbol is not None:
            self.currency_symbol = currency_symbol
        if amount is not None:
            self.amount = amount
        if tx_hash is not None:
            self.tx_hash = tx_hash
        if create_date is not None:
            self.create_date = create_date
        if update_date is not None:
            self.update_date = update_date

    @property
    def id(self):
        """Gets the id of this CurrencyTransferSpecificResponse.  # noqa: E501

        ID of the token supply  # noqa: E501

        :return: The id of this CurrencyTransferSpecificResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CurrencyTransferSpecificResponse.

        ID of the token supply  # noqa: E501

        :param id: The id of this CurrencyTransferSpecificResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def sender_wallet_id(self):
        """Gets the sender_wallet_id of this CurrencyTransferSpecificResponse.  # noqa: E501

        ID of the sender wallet  # noqa: E501

        :return: The sender_wallet_id of this CurrencyTransferSpecificResponse.  # noqa: E501
        :rtype: str
        """
        return self._sender_wallet_id

    @sender_wallet_id.setter
    def sender_wallet_id(self, sender_wallet_id):
        """Sets the sender_wallet_id of this CurrencyTransferSpecificResponse.

        ID of the sender wallet  # noqa: E501

        :param sender_wallet_id: The sender_wallet_id of this CurrencyTransferSpecificResponse.  # noqa: E501
        :type: str
        """

        self._sender_wallet_id = sender_wallet_id

    @property
    def receiver_wallet_id(self):
        """Gets the receiver_wallet_id of this CurrencyTransferSpecificResponse.  # noqa: E501

        ID of the receiver wallet  # noqa: E501

        :return: The receiver_wallet_id of this CurrencyTransferSpecificResponse.  # noqa: E501
        :rtype: str
        """
        return self._receiver_wallet_id

    @receiver_wallet_id.setter
    def receiver_wallet_id(self, receiver_wallet_id):
        """Sets the receiver_wallet_id of this CurrencyTransferSpecificResponse.

        ID of the receiver wallet  # noqa: E501

        :param receiver_wallet_id: The receiver_wallet_id of this CurrencyTransferSpecificResponse.  # noqa: E501
        :type: str
        """

        self._receiver_wallet_id = receiver_wallet_id

    @property
    def currency_symbol(self):
        """Gets the currency_symbol of this CurrencyTransferSpecificResponse.  # noqa: E501

        Symbol of the currency being transferred  # noqa: E501

        :return: The currency_symbol of this CurrencyTransferSpecificResponse.  # noqa: E501
        :rtype: str
        """
        return self._currency_symbol

    @currency_symbol.setter
    def currency_symbol(self, currency_symbol):
        """Sets the currency_symbol of this CurrencyTransferSpecificResponse.

        Symbol of the currency being transferred  # noqa: E501

        :param currency_symbol: The currency_symbol of this CurrencyTransferSpecificResponse.  # noqa: E501
        :type: str
        """

        self._currency_symbol = currency_symbol

    @property
    def amount(self):
        """Gets the amount of this CurrencyTransferSpecificResponse.  # noqa: E501

        Amount of currencies being transferred  # noqa: E501

        :return: The amount of this CurrencyTransferSpecificResponse.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this CurrencyTransferSpecificResponse.

        Amount of currencies being transferred  # noqa: E501

        :param amount: The amount of this CurrencyTransferSpecificResponse.  # noqa: E501
        :type: float
        """

        self._amount = amount

    @property
    def tx_hash(self):
        """Gets the tx_hash of this CurrencyTransferSpecificResponse.  # noqa: E501

        Hash of the transfer transaction  # noqa: E501

        :return: The tx_hash of this CurrencyTransferSpecificResponse.  # noqa: E501
        :rtype: str
        """
        return self._tx_hash

    @tx_hash.setter
    def tx_hash(self, tx_hash):
        """Sets the tx_hash of this CurrencyTransferSpecificResponse.

        Hash of the transfer transaction  # noqa: E501

        :param tx_hash: The tx_hash of this CurrencyTransferSpecificResponse.  # noqa: E501
        :type: str
        """

        self._tx_hash = tx_hash

    @property
    def create_date(self):
        """Gets the create_date of this CurrencyTransferSpecificResponse.  # noqa: E501

        Datetime the currency transfer record was created  # noqa: E501

        :return: The create_date of this CurrencyTransferSpecificResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this CurrencyTransferSpecificResponse.

        Datetime the currency transfer record was created  # noqa: E501

        :param create_date: The create_date of this CurrencyTransferSpecificResponse.  # noqa: E501
        :type: str
        """

        self._create_date = create_date

    @property
    def update_date(self):
        """Gets the update_date of this CurrencyTransferSpecificResponse.  # noqa: E501

        Datetime the currency transfer record was updated  # noqa: E501

        :return: The update_date of this CurrencyTransferSpecificResponse.  # noqa: E501
        :rtype: str
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this CurrencyTransferSpecificResponse.

        Datetime the currency transfer record was updated  # noqa: E501

        :param update_date: The update_date of this CurrencyTransferSpecificResponse.  # noqa: E501
        :type: str
        """

        self._update_date = update_date

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
        if issubclass(CurrencyTransferSpecificResponse, dict):
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
        if not isinstance(other, CurrencyTransferSpecificResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other