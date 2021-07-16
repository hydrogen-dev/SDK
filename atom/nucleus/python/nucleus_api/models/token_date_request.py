# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.3
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class TokenDateRequest(object):
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
        'account_id': 'str',
        'buy_transaction_code_id': 'str',
        'client_id': 'str',
        '_date': 'datetime',
        'sell_transaction_code_id': 'str',
        'tenant_id': 'str'
    }

    attribute_map = {
        'account_id': 'account_id',
        'buy_transaction_code_id': 'buy_transaction_code_id',
        'client_id': 'client_id',
        '_date': 'date',
        'sell_transaction_code_id': 'sell_transaction_code_id',
        'tenant_id': 'tenant_id'
    }

    def __init__(self, account_id=None, buy_transaction_code_id=None, client_id=None, _date=None, sell_transaction_code_id=None, tenant_id=None, _configuration=None):  # noqa: E501
        """TokenDateRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._account_id = None
        self._buy_transaction_code_id = None
        self._client_id = None
        self.__date = None
        self._sell_transaction_code_id = None
        self._tenant_id = None
        self.discriminator = None

        if account_id is not None:
            self.account_id = account_id
        if buy_transaction_code_id is not None:
            self.buy_transaction_code_id = buy_transaction_code_id
        if client_id is not None:
            self.client_id = client_id
        if _date is not None:
            self._date = _date
        if sell_transaction_code_id is not None:
            self.sell_transaction_code_id = sell_transaction_code_id
        if tenant_id is not None:
            self.tenant_id = tenant_id

    @property
    def account_id(self):
        """Gets the account_id of this TokenDateRequest.  # noqa: E501

        accountId  # noqa: E501

        :return: The account_id of this TokenDateRequest.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this TokenDateRequest.

        accountId  # noqa: E501

        :param account_id: The account_id of this TokenDateRequest.  # noqa: E501
        :type: str
        """

        self._account_id = account_id

    @property
    def buy_transaction_code_id(self):
        """Gets the buy_transaction_code_id of this TokenDateRequest.  # noqa: E501

        buyTransactionCodeId  # noqa: E501

        :return: The buy_transaction_code_id of this TokenDateRequest.  # noqa: E501
        :rtype: str
        """
        return self._buy_transaction_code_id

    @buy_transaction_code_id.setter
    def buy_transaction_code_id(self, buy_transaction_code_id):
        """Sets the buy_transaction_code_id of this TokenDateRequest.

        buyTransactionCodeId  # noqa: E501

        :param buy_transaction_code_id: The buy_transaction_code_id of this TokenDateRequest.  # noqa: E501
        :type: str
        """

        self._buy_transaction_code_id = buy_transaction_code_id

    @property
    def client_id(self):
        """Gets the client_id of this TokenDateRequest.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this TokenDateRequest.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this TokenDateRequest.

        clientId  # noqa: E501

        :param client_id: The client_id of this TokenDateRequest.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def _date(self):
        """Gets the _date of this TokenDateRequest.  # noqa: E501

        date  # noqa: E501

        :return: The _date of this TokenDateRequest.  # noqa: E501
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this TokenDateRequest.

        date  # noqa: E501

        :param _date: The _date of this TokenDateRequest.  # noqa: E501
        :type: datetime
        """

        self.__date = _date

    @property
    def sell_transaction_code_id(self):
        """Gets the sell_transaction_code_id of this TokenDateRequest.  # noqa: E501

        sellTransactionCodeId  # noqa: E501

        :return: The sell_transaction_code_id of this TokenDateRequest.  # noqa: E501
        :rtype: str
        """
        return self._sell_transaction_code_id

    @sell_transaction_code_id.setter
    def sell_transaction_code_id(self, sell_transaction_code_id):
        """Sets the sell_transaction_code_id of this TokenDateRequest.

        sellTransactionCodeId  # noqa: E501

        :param sell_transaction_code_id: The sell_transaction_code_id of this TokenDateRequest.  # noqa: E501
        :type: str
        """

        self._sell_transaction_code_id = sell_transaction_code_id

    @property
    def tenant_id(self):
        """Gets the tenant_id of this TokenDateRequest.  # noqa: E501

        tenantId  # noqa: E501

        :return: The tenant_id of this TokenDateRequest.  # noqa: E501
        :rtype: str
        """
        return self._tenant_id

    @tenant_id.setter
    def tenant_id(self, tenant_id):
        """Sets the tenant_id of this TokenDateRequest.

        tenantId  # noqa: E501

        :param tenant_id: The tenant_id of this TokenDateRequest.  # noqa: E501
        :type: str
        """

        self._tenant_id = tenant_id

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
        if issubclass(TokenDateRequest, dict):
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
        if not isinstance(other, TokenDateRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TokenDateRequest):
            return True

        return self.to_dict() != other.to_dict()
