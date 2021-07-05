# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.9.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from proton_api.configuration import Configuration


class CardAnalysisRequest(object):
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
        'client_id': 'str',
        'show_history': 'bool',
        'response_limit': 'int',
        'currency_conversion': 'str',
        'end_date': 'date',
        'history_frequency_interval': 'str',
        'show_top_cards': 'bool',
        'start_date': 'date',
        'business_id': 'str',
        'transaction_status_scope': 'list[str]',
        'card_status_scope': 'list[str]',
        'show_top_cardholders': 'bool',
        'card_program_id': 'str',
        'show_top_businesses': 'bool'
    }

    attribute_map = {
        'currency_code': 'currency_code',
        'client_id': 'client_id',
        'show_history': 'show_history',
        'response_limit': 'response_limit',
        'currency_conversion': 'currency_conversion',
        'end_date': 'end_date',
        'history_frequency_interval': 'history_frequency_interval',
        'show_top_cards': 'show_top_cards',
        'start_date': 'start_date',
        'business_id': 'business_id',
        'transaction_status_scope': 'transaction_status_scope',
        'card_status_scope': 'card_status_scope',
        'show_top_cardholders': 'show_top_cardholders',
        'card_program_id': 'card_program_id',
        'show_top_businesses': 'show_top_businesses'
    }

    def __init__(self, currency_code=None, client_id=None, show_history=False, response_limit=10, currency_conversion=None, end_date=None, history_frequency_interval='month', show_top_cards=False, start_date=None, business_id=None, transaction_status_scope=None, card_status_scope=None, show_top_cardholders=False, card_program_id=None, show_top_businesses=False, _configuration=None):  # noqa: E501
        """CardAnalysisRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._currency_code = None
        self._client_id = None
        self._show_history = None
        self._response_limit = None
        self._currency_conversion = None
        self._end_date = None
        self._history_frequency_interval = None
        self._show_top_cards = None
        self._start_date = None
        self._business_id = None
        self._transaction_status_scope = None
        self._card_status_scope = None
        self._show_top_cardholders = None
        self._card_program_id = None
        self._show_top_businesses = None
        self.discriminator = None

        if currency_code is not None:
            self.currency_code = currency_code
        if client_id is not None:
            self.client_id = client_id
        if show_history is not None:
            self.show_history = show_history
        if response_limit is not None:
            self.response_limit = response_limit
        if currency_conversion is not None:
            self.currency_conversion = currency_conversion
        if end_date is not None:
            self.end_date = end_date
        if history_frequency_interval is not None:
            self.history_frequency_interval = history_frequency_interval
        if show_top_cards is not None:
            self.show_top_cards = show_top_cards
        if start_date is not None:
            self.start_date = start_date
        if business_id is not None:
            self.business_id = business_id
        if transaction_status_scope is not None:
            self.transaction_status_scope = transaction_status_scope
        if card_status_scope is not None:
            self.card_status_scope = card_status_scope
        if show_top_cardholders is not None:
            self.show_top_cardholders = show_top_cardholders
        if card_program_id is not None:
            self.card_program_id = card_program_id
        if show_top_businesses is not None:
            self.show_top_businesses = show_top_businesses

    @property
    def currency_code(self):
        """Gets the currency_code of this CardAnalysisRequest.  # noqa: E501


        :return: The currency_code of this CardAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this CardAnalysisRequest.


        :param currency_code: The currency_code of this CardAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def client_id(self):
        """Gets the client_id of this CardAnalysisRequest.  # noqa: E501


        :return: The client_id of this CardAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this CardAnalysisRequest.


        :param client_id: The client_id of this CardAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def show_history(self):
        """Gets the show_history of this CardAnalysisRequest.  # noqa: E501


        :return: The show_history of this CardAnalysisRequest.  # noqa: E501
        :rtype: bool
        """
        return self._show_history

    @show_history.setter
    def show_history(self, show_history):
        """Sets the show_history of this CardAnalysisRequest.


        :param show_history: The show_history of this CardAnalysisRequest.  # noqa: E501
        :type: bool
        """

        self._show_history = show_history

    @property
    def response_limit(self):
        """Gets the response_limit of this CardAnalysisRequest.  # noqa: E501


        :return: The response_limit of this CardAnalysisRequest.  # noqa: E501
        :rtype: int
        """
        return self._response_limit

    @response_limit.setter
    def response_limit(self, response_limit):
        """Sets the response_limit of this CardAnalysisRequest.


        :param response_limit: The response_limit of this CardAnalysisRequest.  # noqa: E501
        :type: int
        """
        if (self._configuration.client_side_validation and
                response_limit is not None and response_limit < 1):  # noqa: E501
            raise ValueError("Invalid value for `response_limit`, must be a value greater than or equal to `1`")  # noqa: E501

        self._response_limit = response_limit

    @property
    def currency_conversion(self):
        """Gets the currency_conversion of this CardAnalysisRequest.  # noqa: E501


        :return: The currency_conversion of this CardAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._currency_conversion

    @currency_conversion.setter
    def currency_conversion(self, currency_conversion):
        """Sets the currency_conversion of this CardAnalysisRequest.


        :param currency_conversion: The currency_conversion of this CardAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._currency_conversion = currency_conversion

    @property
    def end_date(self):
        """Gets the end_date of this CardAnalysisRequest.  # noqa: E501


        :return: The end_date of this CardAnalysisRequest.  # noqa: E501
        :rtype: date
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this CardAnalysisRequest.


        :param end_date: The end_date of this CardAnalysisRequest.  # noqa: E501
        :type: date
        """

        self._end_date = end_date

    @property
    def history_frequency_interval(self):
        """Gets the history_frequency_interval of this CardAnalysisRequest.  # noqa: E501


        :return: The history_frequency_interval of this CardAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._history_frequency_interval

    @history_frequency_interval.setter
    def history_frequency_interval(self, history_frequency_interval):
        """Sets the history_frequency_interval of this CardAnalysisRequest.


        :param history_frequency_interval: The history_frequency_interval of this CardAnalysisRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["day", "week", "month", "quarter", "year"]  # noqa: E501
        if (self._configuration.client_side_validation and
                history_frequency_interval not in allowed_values):
            raise ValueError(
                "Invalid value for `history_frequency_interval` ({0}), must be one of {1}"  # noqa: E501
                .format(history_frequency_interval, allowed_values)
            )

        self._history_frequency_interval = history_frequency_interval

    @property
    def show_top_cards(self):
        """Gets the show_top_cards of this CardAnalysisRequest.  # noqa: E501


        :return: The show_top_cards of this CardAnalysisRequest.  # noqa: E501
        :rtype: bool
        """
        return self._show_top_cards

    @show_top_cards.setter
    def show_top_cards(self, show_top_cards):
        """Sets the show_top_cards of this CardAnalysisRequest.


        :param show_top_cards: The show_top_cards of this CardAnalysisRequest.  # noqa: E501
        :type: bool
        """

        self._show_top_cards = show_top_cards

    @property
    def start_date(self):
        """Gets the start_date of this CardAnalysisRequest.  # noqa: E501


        :return: The start_date of this CardAnalysisRequest.  # noqa: E501
        :rtype: date
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this CardAnalysisRequest.


        :param start_date: The start_date of this CardAnalysisRequest.  # noqa: E501
        :type: date
        """

        self._start_date = start_date

    @property
    def business_id(self):
        """Gets the business_id of this CardAnalysisRequest.  # noqa: E501


        :return: The business_id of this CardAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id):
        """Sets the business_id of this CardAnalysisRequest.


        :param business_id: The business_id of this CardAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._business_id = business_id

    @property
    def transaction_status_scope(self):
        """Gets the transaction_status_scope of this CardAnalysisRequest.  # noqa: E501


        :return: The transaction_status_scope of this CardAnalysisRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._transaction_status_scope

    @transaction_status_scope.setter
    def transaction_status_scope(self, transaction_status_scope):
        """Sets the transaction_status_scope of this CardAnalysisRequest.


        :param transaction_status_scope: The transaction_status_scope of this CardAnalysisRequest.  # noqa: E501
        :type: list[str]
        """

        self._transaction_status_scope = transaction_status_scope

    @property
    def card_status_scope(self):
        """Gets the card_status_scope of this CardAnalysisRequest.  # noqa: E501


        :return: The card_status_scope of this CardAnalysisRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._card_status_scope

    @card_status_scope.setter
    def card_status_scope(self, card_status_scope):
        """Sets the card_status_scope of this CardAnalysisRequest.


        :param card_status_scope: The card_status_scope of this CardAnalysisRequest.  # noqa: E501
        :type: list[str]
        """

        self._card_status_scope = card_status_scope

    @property
    def show_top_cardholders(self):
        """Gets the show_top_cardholders of this CardAnalysisRequest.  # noqa: E501


        :return: The show_top_cardholders of this CardAnalysisRequest.  # noqa: E501
        :rtype: bool
        """
        return self._show_top_cardholders

    @show_top_cardholders.setter
    def show_top_cardholders(self, show_top_cardholders):
        """Sets the show_top_cardholders of this CardAnalysisRequest.


        :param show_top_cardholders: The show_top_cardholders of this CardAnalysisRequest.  # noqa: E501
        :type: bool
        """

        self._show_top_cardholders = show_top_cardholders

    @property
    def card_program_id(self):
        """Gets the card_program_id of this CardAnalysisRequest.  # noqa: E501


        :return: The card_program_id of this CardAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._card_program_id

    @card_program_id.setter
    def card_program_id(self, card_program_id):
        """Sets the card_program_id of this CardAnalysisRequest.


        :param card_program_id: The card_program_id of this CardAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._card_program_id = card_program_id

    @property
    def show_top_businesses(self):
        """Gets the show_top_businesses of this CardAnalysisRequest.  # noqa: E501


        :return: The show_top_businesses of this CardAnalysisRequest.  # noqa: E501
        :rtype: bool
        """
        return self._show_top_businesses

    @show_top_businesses.setter
    def show_top_businesses(self, show_top_businesses):
        """Sets the show_top_businesses of this CardAnalysisRequest.


        :param show_top_businesses: The show_top_businesses of this CardAnalysisRequest.  # noqa: E501
        :type: bool
        """

        self._show_top_businesses = show_top_businesses

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
        if issubclass(CardAnalysisRequest, dict):
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
        if not isinstance(other, CardAnalysisRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, CardAnalysisRequest):
            return True

        return self.to_dict() != other.to_dict()
