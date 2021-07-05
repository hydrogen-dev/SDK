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


class BudgetCalculatorRequest(object):
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
        'scope': 'str',
        'currency_conversion': 'str',
        'relative_lookback': 'bool',
        'budget_id': 'str',
        'as_of_date': 'date',
        'show_average_spend': 'bool',
        'lookback_periods': 'int',
        'budget_details': 'BudgetDetails',
        'transaction_status_scope': 'list[str]',
        'only_cleansed': 'bool',
        'show_budget_track': 'bool'
    }

    attribute_map = {
        'scope': 'scope',
        'currency_conversion': 'currency_conversion',
        'relative_lookback': 'relative_lookback',
        'budget_id': 'budget_id',
        'as_of_date': 'as_of_date',
        'show_average_spend': 'show_average_spend',
        'lookback_periods': 'lookback_periods',
        'budget_details': 'budget_details',
        'transaction_status_scope': 'transaction_status_scope',
        'only_cleansed': 'only_cleansed',
        'show_budget_track': 'show_budget_track'
    }

    def __init__(self, scope='all', currency_conversion=None, relative_lookback=True, budget_id=None, as_of_date=None, show_average_spend=False, lookback_periods=1, budget_details=None, transaction_status_scope=None, only_cleansed=False, show_budget_track=True, _configuration=None):  # noqa: E501
        """BudgetCalculatorRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._scope = None
        self._currency_conversion = None
        self._relative_lookback = None
        self._budget_id = None
        self._as_of_date = None
        self._show_average_spend = None
        self._lookback_periods = None
        self._budget_details = None
        self._transaction_status_scope = None
        self._only_cleansed = None
        self._show_budget_track = None
        self.discriminator = None

        if scope is not None:
            self.scope = scope
        if currency_conversion is not None:
            self.currency_conversion = currency_conversion
        if relative_lookback is not None:
            self.relative_lookback = relative_lookback
        if budget_id is not None:
            self.budget_id = budget_id
        if as_of_date is not None:
            self.as_of_date = as_of_date
        if show_average_spend is not None:
            self.show_average_spend = show_average_spend
        if lookback_periods is not None:
            self.lookback_periods = lookback_periods
        if budget_details is not None:
            self.budget_details = budget_details
        if transaction_status_scope is not None:
            self.transaction_status_scope = transaction_status_scope
        if only_cleansed is not None:
            self.only_cleansed = only_cleansed
        if show_budget_track is not None:
            self.show_budget_track = show_budget_track

    @property
    def scope(self):
        """Gets the scope of this BudgetCalculatorRequest.  # noqa: E501


        :return: The scope of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: str
        """
        return self._scope

    @scope.setter
    def scope(self, scope):
        """Sets the scope of this BudgetCalculatorRequest.


        :param scope: The scope of this BudgetCalculatorRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["all", "external", "internal"]  # noqa: E501
        if (self._configuration.client_side_validation and
                scope not in allowed_values):
            raise ValueError(
                "Invalid value for `scope` ({0}), must be one of {1}"  # noqa: E501
                .format(scope, allowed_values)
            )

        self._scope = scope

    @property
    def currency_conversion(self):
        """Gets the currency_conversion of this BudgetCalculatorRequest.  # noqa: E501


        :return: The currency_conversion of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: str
        """
        return self._currency_conversion

    @currency_conversion.setter
    def currency_conversion(self, currency_conversion):
        """Sets the currency_conversion of this BudgetCalculatorRequest.


        :param currency_conversion: The currency_conversion of this BudgetCalculatorRequest.  # noqa: E501
        :type: str
        """

        self._currency_conversion = currency_conversion

    @property
    def relative_lookback(self):
        """Gets the relative_lookback of this BudgetCalculatorRequest.  # noqa: E501


        :return: The relative_lookback of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: bool
        """
        return self._relative_lookback

    @relative_lookback.setter
    def relative_lookback(self, relative_lookback):
        """Sets the relative_lookback of this BudgetCalculatorRequest.


        :param relative_lookback: The relative_lookback of this BudgetCalculatorRequest.  # noqa: E501
        :type: bool
        """

        self._relative_lookback = relative_lookback

    @property
    def budget_id(self):
        """Gets the budget_id of this BudgetCalculatorRequest.  # noqa: E501


        :return: The budget_id of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: str
        """
        return self._budget_id

    @budget_id.setter
    def budget_id(self, budget_id):
        """Sets the budget_id of this BudgetCalculatorRequest.


        :param budget_id: The budget_id of this BudgetCalculatorRequest.  # noqa: E501
        :type: str
        """

        self._budget_id = budget_id

    @property
    def as_of_date(self):
        """Gets the as_of_date of this BudgetCalculatorRequest.  # noqa: E501


        :return: The as_of_date of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: date
        """
        return self._as_of_date

    @as_of_date.setter
    def as_of_date(self, as_of_date):
        """Sets the as_of_date of this BudgetCalculatorRequest.


        :param as_of_date: The as_of_date of this BudgetCalculatorRequest.  # noqa: E501
        :type: date
        """

        self._as_of_date = as_of_date

    @property
    def show_average_spend(self):
        """Gets the show_average_spend of this BudgetCalculatorRequest.  # noqa: E501


        :return: The show_average_spend of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: bool
        """
        return self._show_average_spend

    @show_average_spend.setter
    def show_average_spend(self, show_average_spend):
        """Sets the show_average_spend of this BudgetCalculatorRequest.


        :param show_average_spend: The show_average_spend of this BudgetCalculatorRequest.  # noqa: E501
        :type: bool
        """

        self._show_average_spend = show_average_spend

    @property
    def lookback_periods(self):
        """Gets the lookback_periods of this BudgetCalculatorRequest.  # noqa: E501


        :return: The lookback_periods of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: int
        """
        return self._lookback_periods

    @lookback_periods.setter
    def lookback_periods(self, lookback_periods):
        """Sets the lookback_periods of this BudgetCalculatorRequest.


        :param lookback_periods: The lookback_periods of this BudgetCalculatorRequest.  # noqa: E501
        :type: int
        """
        if (self._configuration.client_side_validation and
                lookback_periods is not None and lookback_periods < 1):  # noqa: E501
            raise ValueError("Invalid value for `lookback_periods`, must be a value greater than or equal to `1`")  # noqa: E501

        self._lookback_periods = lookback_periods

    @property
    def budget_details(self):
        """Gets the budget_details of this BudgetCalculatorRequest.  # noqa: E501


        :return: The budget_details of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: BudgetDetails
        """
        return self._budget_details

    @budget_details.setter
    def budget_details(self, budget_details):
        """Sets the budget_details of this BudgetCalculatorRequest.


        :param budget_details: The budget_details of this BudgetCalculatorRequest.  # noqa: E501
        :type: BudgetDetails
        """

        self._budget_details = budget_details

    @property
    def transaction_status_scope(self):
        """Gets the transaction_status_scope of this BudgetCalculatorRequest.  # noqa: E501


        :return: The transaction_status_scope of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._transaction_status_scope

    @transaction_status_scope.setter
    def transaction_status_scope(self, transaction_status_scope):
        """Sets the transaction_status_scope of this BudgetCalculatorRequest.


        :param transaction_status_scope: The transaction_status_scope of this BudgetCalculatorRequest.  # noqa: E501
        :type: list[str]
        """

        self._transaction_status_scope = transaction_status_scope

    @property
    def only_cleansed(self):
        """Gets the only_cleansed of this BudgetCalculatorRequest.  # noqa: E501


        :return: The only_cleansed of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: bool
        """
        return self._only_cleansed

    @only_cleansed.setter
    def only_cleansed(self, only_cleansed):
        """Sets the only_cleansed of this BudgetCalculatorRequest.


        :param only_cleansed: The only_cleansed of this BudgetCalculatorRequest.  # noqa: E501
        :type: bool
        """

        self._only_cleansed = only_cleansed

    @property
    def show_budget_track(self):
        """Gets the show_budget_track of this BudgetCalculatorRequest.  # noqa: E501


        :return: The show_budget_track of this BudgetCalculatorRequest.  # noqa: E501
        :rtype: bool
        """
        return self._show_budget_track

    @show_budget_track.setter
    def show_budget_track(self, show_budget_track):
        """Sets the show_budget_track of this BudgetCalculatorRequest.


        :param show_budget_track: The show_budget_track of this BudgetCalculatorRequest.  # noqa: E501
        :type: bool
        """

        self._show_budget_track = show_budget_track

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
        if issubclass(BudgetCalculatorRequest, dict):
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
        if not isinstance(other, BudgetCalculatorRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, BudgetCalculatorRequest):
            return True

        return self.to_dict() != other.to_dict()
