# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.9.2
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from proton_api.configuration import Configuration


class CardTransactionAuthorizationRequest(object):
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
        'currency_code': 'str',
        'memo': 'str',
        'partial_auth': 'bool',
        'transaction_type': 'str',
        'description': 'str',
        'transaction_category_id': 'str',
        'use_audit_log': 'bool',
        'merchant_category_code': 'int',
        'card_id': 'str',
        'transaction_category': 'str',
        'cleanse_data': 'bool',
        'auth_type': 'list[str]',
        'mid': 'str',
        'transaction_status_scope': 'list[str]',
        'location': 'Location',
        'merchant': 'str',
        'amount': 'float',
        '_date': 'datetime',
        'merchant_id': 'str'
    }

    attribute_map = {
        'currency_code': 'currency_code',
        'memo': 'memo',
        'partial_auth': 'partial_auth',
        'transaction_type': 'transaction_type',
        'description': 'description',
        'transaction_category_id': 'transaction_category_id',
        'use_audit_log': 'use_audit_log',
        'merchant_category_code': 'merchant_category_code',
        'card_id': 'card_id',
        'transaction_category': 'transaction_category',
        'cleanse_data': 'cleanse_data',
        'auth_type': 'auth_type',
        'mid': 'mid',
        'transaction_status_scope': 'transaction_status_scope',
        'location': 'location',
        'merchant': 'merchant',
        'amount': 'amount',
        '_date': 'date',
        'merchant_id': 'merchant_id'
    }

    def __init__(self, currency_code=None, memo='null', partial_auth=False, transaction_type=None, description='null', transaction_category_id=None, use_audit_log=False, merchant_category_code=None, card_id=None, transaction_category='null', cleanse_data=False, auth_type=None, mid='null', transaction_status_scope=None, location=None, merchant='null', amount=None, _date=None, merchant_id=None, _configuration=None):  # noqa: E501
        """CardTransactionAuthorizationRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._currency_code = None
        self._memo = None
        self._partial_auth = None
        self._transaction_type = None
        self._description = None
        self._transaction_category_id = None
        self._use_audit_log = None
        self._merchant_category_code = None
        self._card_id = None
        self._transaction_category = None
        self._cleanse_data = None
        self._auth_type = None
        self._mid = None
        self._transaction_status_scope = None
        self._location = None
        self._merchant = None
        self._amount = None
        self.__date = None
        self._merchant_id = None
        self.discriminator = None

        self.currency_code = currency_code
        if memo is not None:
            self.memo = memo
        if partial_auth is not None:
            self.partial_auth = partial_auth
        self.transaction_type = transaction_type
        if description is not None:
            self.description = description
        if transaction_category_id is not None:
            self.transaction_category_id = transaction_category_id
        if use_audit_log is not None:
            self.use_audit_log = use_audit_log
        if merchant_category_code is not None:
            self.merchant_category_code = merchant_category_code
        self.card_id = card_id
        if transaction_category is not None:
            self.transaction_category = transaction_category
        if cleanse_data is not None:
            self.cleanse_data = cleanse_data
        if auth_type is not None:
            self.auth_type = auth_type
        if mid is not None:
            self.mid = mid
        if transaction_status_scope is not None:
            self.transaction_status_scope = transaction_status_scope
        if location is not None:
            self.location = location
        if merchant is not None:
            self.merchant = merchant
        self.amount = amount
        self._date = _date
        if merchant_id is not None:
            self.merchant_id = merchant_id

    @property
    def currency_code(self):
        """Gets the currency_code of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The currency_code of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this CardTransactionAuthorizationRequest.


        :param currency_code: The currency_code of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and currency_code is None:
            raise ValueError("Invalid value for `currency_code`, must not be `None`")  # noqa: E501

        self._currency_code = currency_code

    @property
    def memo(self):
        """Gets the memo of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The memo of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: str
        """
        return self._memo

    @memo.setter
    def memo(self, memo):
        """Sets the memo of this CardTransactionAuthorizationRequest.


        :param memo: The memo of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: str
        """

        self._memo = memo

    @property
    def partial_auth(self):
        """Gets the partial_auth of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The partial_auth of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: bool
        """
        return self._partial_auth

    @partial_auth.setter
    def partial_auth(self, partial_auth):
        """Sets the partial_auth of this CardTransactionAuthorizationRequest.


        :param partial_auth: The partial_auth of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: bool
        """

        self._partial_auth = partial_auth

    @property
    def transaction_type(self):
        """Gets the transaction_type of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The transaction_type of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: str
        """
        return self._transaction_type

    @transaction_type.setter
    def transaction_type(self, transaction_type):
        """Sets the transaction_type of this CardTransactionAuthorizationRequest.


        :param transaction_type: The transaction_type of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and transaction_type is None:
            raise ValueError("Invalid value for `transaction_type`, must not be `None`")  # noqa: E501
        allowed_values = ["atm_withdrawal", "purchase", "other"]  # noqa: E501
        if (self._configuration.client_side_validation and
                transaction_type not in allowed_values):
            raise ValueError(
                "Invalid value for `transaction_type` ({0}), must be one of {1}"  # noqa: E501
                .format(transaction_type, allowed_values)
            )

        self._transaction_type = transaction_type

    @property
    def description(self):
        """Gets the description of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The description of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this CardTransactionAuthorizationRequest.


        :param description: The description of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def transaction_category_id(self):
        """Gets the transaction_category_id of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The transaction_category_id of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: str
        """
        return self._transaction_category_id

    @transaction_category_id.setter
    def transaction_category_id(self, transaction_category_id):
        """Sets the transaction_category_id of this CardTransactionAuthorizationRequest.


        :param transaction_category_id: The transaction_category_id of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: str
        """

        self._transaction_category_id = transaction_category_id

    @property
    def use_audit_log(self):
        """Gets the use_audit_log of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The use_audit_log of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: bool
        """
        return self._use_audit_log

    @use_audit_log.setter
    def use_audit_log(self, use_audit_log):
        """Sets the use_audit_log of this CardTransactionAuthorizationRequest.


        :param use_audit_log: The use_audit_log of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: bool
        """

        self._use_audit_log = use_audit_log

    @property
    def merchant_category_code(self):
        """Gets the merchant_category_code of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The merchant_category_code of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: int
        """
        return self._merchant_category_code

    @merchant_category_code.setter
    def merchant_category_code(self, merchant_category_code):
        """Sets the merchant_category_code of this CardTransactionAuthorizationRequest.


        :param merchant_category_code: The merchant_category_code of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: int
        """

        self._merchant_category_code = merchant_category_code

    @property
    def card_id(self):
        """Gets the card_id of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The card_id of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: str
        """
        return self._card_id

    @card_id.setter
    def card_id(self, card_id):
        """Sets the card_id of this CardTransactionAuthorizationRequest.


        :param card_id: The card_id of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and card_id is None:
            raise ValueError("Invalid value for `card_id`, must not be `None`")  # noqa: E501

        self._card_id = card_id

    @property
    def transaction_category(self):
        """Gets the transaction_category of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The transaction_category of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: str
        """
        return self._transaction_category

    @transaction_category.setter
    def transaction_category(self, transaction_category):
        """Sets the transaction_category of this CardTransactionAuthorizationRequest.


        :param transaction_category: The transaction_category of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: str
        """

        self._transaction_category = transaction_category

    @property
    def cleanse_data(self):
        """Gets the cleanse_data of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The cleanse_data of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: bool
        """
        return self._cleanse_data

    @cleanse_data.setter
    def cleanse_data(self, cleanse_data):
        """Sets the cleanse_data of this CardTransactionAuthorizationRequest.


        :param cleanse_data: The cleanse_data of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: bool
        """

        self._cleanse_data = cleanse_data

    @property
    def auth_type(self):
        """Gets the auth_type of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The auth_type of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._auth_type

    @auth_type.setter
    def auth_type(self, auth_type):
        """Sets the auth_type of this CardTransactionAuthorizationRequest.


        :param auth_type: The auth_type of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: list[str]
        """
        allowed_values = ["spending_control"]  # noqa: E501
        if (self._configuration.client_side_validation and
                not set(auth_type).issubset(set(allowed_values))):  # noqa: E501
            raise ValueError(
                "Invalid values for `auth_type` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(auth_type) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._auth_type = auth_type

    @property
    def mid(self):
        """Gets the mid of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The mid of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: str
        """
        return self._mid

    @mid.setter
    def mid(self, mid):
        """Sets the mid of this CardTransactionAuthorizationRequest.


        :param mid: The mid of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: str
        """

        self._mid = mid

    @property
    def transaction_status_scope(self):
        """Gets the transaction_status_scope of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The transaction_status_scope of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._transaction_status_scope

    @transaction_status_scope.setter
    def transaction_status_scope(self, transaction_status_scope):
        """Sets the transaction_status_scope of this CardTransactionAuthorizationRequest.


        :param transaction_status_scope: The transaction_status_scope of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: list[str]
        """

        self._transaction_status_scope = transaction_status_scope

    @property
    def location(self):
        """Gets the location of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The location of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: Location
        """
        return self._location

    @location.setter
    def location(self, location):
        """Sets the location of this CardTransactionAuthorizationRequest.


        :param location: The location of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: Location
        """

        self._location = location

    @property
    def merchant(self):
        """Gets the merchant of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The merchant of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: str
        """
        return self._merchant

    @merchant.setter
    def merchant(self, merchant):
        """Sets the merchant of this CardTransactionAuthorizationRequest.


        :param merchant: The merchant of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: str
        """

        self._merchant = merchant

    @property
    def amount(self):
        """Gets the amount of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The amount of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this CardTransactionAuthorizationRequest.


        :param amount: The amount of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and amount is None:
            raise ValueError("Invalid value for `amount`, must not be `None`")  # noqa: E501

        self._amount = amount

    @property
    def _date(self):
        """Gets the _date of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The _date of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this CardTransactionAuthorizationRequest.


        :param _date: The _date of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: datetime
        """
        if self._configuration.client_side_validation and _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def merchant_id(self):
        """Gets the merchant_id of this CardTransactionAuthorizationRequest.  # noqa: E501


        :return: The merchant_id of this CardTransactionAuthorizationRequest.  # noqa: E501
        :rtype: str
        """
        return self._merchant_id

    @merchant_id.setter
    def merchant_id(self, merchant_id):
        """Sets the merchant_id of this CardTransactionAuthorizationRequest.


        :param merchant_id: The merchant_id of this CardTransactionAuthorizationRequest.  # noqa: E501
        :type: str
        """

        self._merchant_id = merchant_id

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
        if issubclass(CardTransactionAuthorizationRequest, dict):
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
        if not isinstance(other, CardTransactionAuthorizationRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, CardTransactionAuthorizationRequest):
            return True

        return self.to_dict() != other.to_dict()
