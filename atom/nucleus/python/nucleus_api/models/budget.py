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


class Budget(object):
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
        'aggregation_accounts': 'list[BudgetAggregationAccount]',
        'budget': 'list[BudgetObject]',
        'card_id': 'str',
        'client_id': 'str',
        'create_date': 'datetime',
        'currency_code': 'str',
        'end_date': 'date',
        'frequency': 'int',
        'frequency_unit': 'str',
        'goal_id': 'str',
        'id': 'str',
        'is_active': 'bool',
        'metadata': 'dict(str, str)',
        'name': 'str',
        'secondary_id': 'str',
        'start_date': 'date',
        'total_value': 'float',
        'update_date': 'datetime'
    }

    attribute_map = {
        'account_id': 'account_id',
        'aggregation_accounts': 'aggregation_accounts',
        'budget': 'budget',
        'card_id': 'card_id',
        'client_id': 'client_id',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        'end_date': 'end_date',
        'frequency': 'frequency',
        'frequency_unit': 'frequency_unit',
        'goal_id': 'goal_id',
        'id': 'id',
        'is_active': 'is_active',
        'metadata': 'metadata',
        'name': 'name',
        'secondary_id': 'secondary_id',
        'start_date': 'start_date',
        'total_value': 'total_value',
        'update_date': 'update_date'
    }

    def __init__(self, account_id=None, aggregation_accounts=None, budget=None, card_id=None, client_id=None, create_date=None, currency_code=None, end_date=None, frequency=None, frequency_unit=None, goal_id=None, id=None, is_active=None, metadata=None, name=None, secondary_id=None, start_date=None, total_value=None, update_date=None, _configuration=None):  # noqa: E501
        """Budget - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._account_id = None
        self._aggregation_accounts = None
        self._budget = None
        self._card_id = None
        self._client_id = None
        self._create_date = None
        self._currency_code = None
        self._end_date = None
        self._frequency = None
        self._frequency_unit = None
        self._goal_id = None
        self._id = None
        self._is_active = None
        self._metadata = None
        self._name = None
        self._secondary_id = None
        self._start_date = None
        self._total_value = None
        self._update_date = None
        self.discriminator = None

        if account_id is not None:
            self.account_id = account_id
        if aggregation_accounts is not None:
            self.aggregation_accounts = aggregation_accounts
        if budget is not None:
            self.budget = budget
        if card_id is not None:
            self.card_id = card_id
        self.client_id = client_id
        if create_date is not None:
            self.create_date = create_date
        self.currency_code = currency_code
        if end_date is not None:
            self.end_date = end_date
        if frequency is not None:
            self.frequency = frequency
        self.frequency_unit = frequency_unit
        if goal_id is not None:
            self.goal_id = goal_id
        if id is not None:
            self.id = id
        if is_active is not None:
            self.is_active = is_active
        if metadata is not None:
            self.metadata = metadata
        self.name = name
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if start_date is not None:
            self.start_date = start_date
        if total_value is not None:
            self.total_value = total_value
        if update_date is not None:
            self.update_date = update_date

    @property
    def account_id(self):
        """Gets the account_id of this Budget.  # noqa: E501

        accountId  # noqa: E501

        :return: The account_id of this Budget.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this Budget.

        accountId  # noqa: E501

        :param account_id: The account_id of this Budget.  # noqa: E501
        :type: str
        """

        self._account_id = account_id

    @property
    def aggregation_accounts(self):
        """Gets the aggregation_accounts of this Budget.  # noqa: E501


        :return: The aggregation_accounts of this Budget.  # noqa: E501
        :rtype: list[BudgetAggregationAccount]
        """
        return self._aggregation_accounts

    @aggregation_accounts.setter
    def aggregation_accounts(self, aggregation_accounts):
        """Sets the aggregation_accounts of this Budget.


        :param aggregation_accounts: The aggregation_accounts of this Budget.  # noqa: E501
        :type: list[BudgetAggregationAccount]
        """

        self._aggregation_accounts = aggregation_accounts

    @property
    def budget(self):
        """Gets the budget of this Budget.  # noqa: E501


        :return: The budget of this Budget.  # noqa: E501
        :rtype: list[BudgetObject]
        """
        return self._budget

    @budget.setter
    def budget(self, budget):
        """Sets the budget of this Budget.


        :param budget: The budget of this Budget.  # noqa: E501
        :type: list[BudgetObject]
        """

        self._budget = budget

    @property
    def card_id(self):
        """Gets the card_id of this Budget.  # noqa: E501

        cardId  # noqa: E501

        :return: The card_id of this Budget.  # noqa: E501
        :rtype: str
        """
        return self._card_id

    @card_id.setter
    def card_id(self, card_id):
        """Sets the card_id of this Budget.

        cardId  # noqa: E501

        :param card_id: The card_id of this Budget.  # noqa: E501
        :type: str
        """

        self._card_id = card_id

    @property
    def client_id(self):
        """Gets the client_id of this Budget.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this Budget.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this Budget.

        clientId  # noqa: E501

        :param client_id: The client_id of this Budget.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and client_id is None:
            raise ValueError("Invalid value for `client_id`, must not be `None`")  # noqa: E501

        self._client_id = client_id

    @property
    def create_date(self):
        """Gets the create_date of this Budget.  # noqa: E501


        :return: The create_date of this Budget.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this Budget.


        :param create_date: The create_date of this Budget.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this Budget.  # noqa: E501

        currencyCode  # noqa: E501

        :return: The currency_code of this Budget.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this Budget.

        currencyCode  # noqa: E501

        :param currency_code: The currency_code of this Budget.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and currency_code is None:
            raise ValueError("Invalid value for `currency_code`, must not be `None`")  # noqa: E501

        self._currency_code = currency_code

    @property
    def end_date(self):
        """Gets the end_date of this Budget.  # noqa: E501

        endDate  # noqa: E501

        :return: The end_date of this Budget.  # noqa: E501
        :rtype: date
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this Budget.

        endDate  # noqa: E501

        :param end_date: The end_date of this Budget.  # noqa: E501
        :type: date
        """

        self._end_date = end_date

    @property
    def frequency(self):
        """Gets the frequency of this Budget.  # noqa: E501

        frequency  # noqa: E501

        :return: The frequency of this Budget.  # noqa: E501
        :rtype: int
        """
        return self._frequency

    @frequency.setter
    def frequency(self, frequency):
        """Sets the frequency of this Budget.

        frequency  # noqa: E501

        :param frequency: The frequency of this Budget.  # noqa: E501
        :type: int
        """

        self._frequency = frequency

    @property
    def frequency_unit(self):
        """Gets the frequency_unit of this Budget.  # noqa: E501

        frequencyUnit  # noqa: E501

        :return: The frequency_unit of this Budget.  # noqa: E501
        :rtype: str
        """
        return self._frequency_unit

    @frequency_unit.setter
    def frequency_unit(self, frequency_unit):
        """Sets the frequency_unit of this Budget.

        frequencyUnit  # noqa: E501

        :param frequency_unit: The frequency_unit of this Budget.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and frequency_unit is None:
            raise ValueError("Invalid value for `frequency_unit`, must not be `None`")  # noqa: E501

        self._frequency_unit = frequency_unit

    @property
    def goal_id(self):
        """Gets the goal_id of this Budget.  # noqa: E501

        goalId  # noqa: E501

        :return: The goal_id of this Budget.  # noqa: E501
        :rtype: str
        """
        return self._goal_id

    @goal_id.setter
    def goal_id(self, goal_id):
        """Sets the goal_id of this Budget.

        goalId  # noqa: E501

        :param goal_id: The goal_id of this Budget.  # noqa: E501
        :type: str
        """

        self._goal_id = goal_id

    @property
    def id(self):
        """Gets the id of this Budget.  # noqa: E501


        :return: The id of this Budget.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Budget.


        :param id: The id of this Budget.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_active(self):
        """Gets the is_active of this Budget.  # noqa: E501

        is_active  # noqa: E501

        :return: The is_active of this Budget.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this Budget.

        is_active  # noqa: E501

        :param is_active: The is_active of this Budget.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def metadata(self):
        """Gets the metadata of this Budget.  # noqa: E501


        :return: The metadata of this Budget.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this Budget.


        :param metadata: The metadata of this Budget.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def name(self):
        """Gets the name of this Budget.  # noqa: E501

        name  # noqa: E501

        :return: The name of this Budget.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Budget.

        name  # noqa: E501

        :param name: The name of this Budget.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def secondary_id(self):
        """Gets the secondary_id of this Budget.  # noqa: E501


        :return: The secondary_id of this Budget.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this Budget.


        :param secondary_id: The secondary_id of this Budget.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def start_date(self):
        """Gets the start_date of this Budget.  # noqa: E501

        startDate  # noqa: E501

        :return: The start_date of this Budget.  # noqa: E501
        :rtype: date
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this Budget.

        startDate  # noqa: E501

        :param start_date: The start_date of this Budget.  # noqa: E501
        :type: date
        """

        self._start_date = start_date

    @property
    def total_value(self):
        """Gets the total_value of this Budget.  # noqa: E501

        totalValue  # noqa: E501

        :return: The total_value of this Budget.  # noqa: E501
        :rtype: float
        """
        return self._total_value

    @total_value.setter
    def total_value(self, total_value):
        """Sets the total_value of this Budget.

        totalValue  # noqa: E501

        :param total_value: The total_value of this Budget.  # noqa: E501
        :type: float
        """

        self._total_value = total_value

    @property
    def update_date(self):
        """Gets the update_date of this Budget.  # noqa: E501


        :return: The update_date of this Budget.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this Budget.


        :param update_date: The update_date of this Budget.  # noqa: E501
        :type: datetime
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
        if issubclass(Budget, dict):
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
        if not isinstance(other, Budget):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Budget):
            return True

        return self.to_dict() != other.to_dict()
