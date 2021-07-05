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


class PurchaseCalculatorDepositAmountRequest(object):
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
        'account_ids': 'list[str]',
        'horizon_frequency_interval': 'str',
        'purchase_horizon': 'int',
        'investment_tax': 'float',
        'portfolio_return': 'float',
        'deposit_schedule': 'CalculatorDepositSchedule',
        'current_savings': 'float',
        'purchase_amount': 'float',
        'inflation_rate': 'float',
        'aggregation_account_ids': 'list[str]'
    }

    attribute_map = {
        'account_ids': 'account_ids',
        'horizon_frequency_interval': 'horizon_frequency_interval',
        'purchase_horizon': 'purchase_horizon',
        'investment_tax': 'investment_tax',
        'portfolio_return': 'portfolio_return',
        'deposit_schedule': 'deposit_schedule',
        'current_savings': 'current_savings',
        'purchase_amount': 'purchase_amount',
        'inflation_rate': 'inflation_rate',
        'aggregation_account_ids': 'aggregation_account_ids'
    }

    def __init__(self, account_ids=None, horizon_frequency_interval='year', purchase_horizon=None, investment_tax=0.0, portfolio_return=None, deposit_schedule=None, current_savings=0.0, purchase_amount=None, inflation_rate=0.0, aggregation_account_ids=None, _configuration=None):  # noqa: E501
        """PurchaseCalculatorDepositAmountRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._account_ids = None
        self._horizon_frequency_interval = None
        self._purchase_horizon = None
        self._investment_tax = None
        self._portfolio_return = None
        self._deposit_schedule = None
        self._current_savings = None
        self._purchase_amount = None
        self._inflation_rate = None
        self._aggregation_account_ids = None
        self.discriminator = None

        if account_ids is not None:
            self.account_ids = account_ids
        if horizon_frequency_interval is not None:
            self.horizon_frequency_interval = horizon_frequency_interval
        self.purchase_horizon = purchase_horizon
        if investment_tax is not None:
            self.investment_tax = investment_tax
        self.portfolio_return = portfolio_return
        if deposit_schedule is not None:
            self.deposit_schedule = deposit_schedule
        if current_savings is not None:
            self.current_savings = current_savings
        self.purchase_amount = purchase_amount
        if inflation_rate is not None:
            self.inflation_rate = inflation_rate
        if aggregation_account_ids is not None:
            self.aggregation_account_ids = aggregation_account_ids

    @property
    def account_ids(self):
        """Gets the account_ids of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501


        :return: The account_ids of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._account_ids

    @account_ids.setter
    def account_ids(self, account_ids):
        """Sets the account_ids of this PurchaseCalculatorDepositAmountRequest.


        :param account_ids: The account_ids of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :type: list[str]
        """

        self._account_ids = account_ids

    @property
    def horizon_frequency_interval(self):
        """Gets the horizon_frequency_interval of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501


        :return: The horizon_frequency_interval of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :rtype: str
        """
        return self._horizon_frequency_interval

    @horizon_frequency_interval.setter
    def horizon_frequency_interval(self, horizon_frequency_interval):
        """Sets the horizon_frequency_interval of this PurchaseCalculatorDepositAmountRequest.


        :param horizon_frequency_interval: The horizon_frequency_interval of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["year", "quarter", "month", "week"]  # noqa: E501
        if (self._configuration.client_side_validation and
                horizon_frequency_interval not in allowed_values):
            raise ValueError(
                "Invalid value for `horizon_frequency_interval` ({0}), must be one of {1}"  # noqa: E501
                .format(horizon_frequency_interval, allowed_values)
            )

        self._horizon_frequency_interval = horizon_frequency_interval

    @property
    def purchase_horizon(self):
        """Gets the purchase_horizon of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501


        :return: The purchase_horizon of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :rtype: int
        """
        return self._purchase_horizon

    @purchase_horizon.setter
    def purchase_horizon(self, purchase_horizon):
        """Sets the purchase_horizon of this PurchaseCalculatorDepositAmountRequest.


        :param purchase_horizon: The purchase_horizon of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :type: int
        """
        if self._configuration.client_side_validation and purchase_horizon is None:
            raise ValueError("Invalid value for `purchase_horizon`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                purchase_horizon is not None and purchase_horizon < 0):  # noqa: E501
            raise ValueError("Invalid value for `purchase_horizon`, must be a value greater than or equal to `0`")  # noqa: E501

        self._purchase_horizon = purchase_horizon

    @property
    def investment_tax(self):
        """Gets the investment_tax of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501


        :return: The investment_tax of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :rtype: float
        """
        return self._investment_tax

    @investment_tax.setter
    def investment_tax(self, investment_tax):
        """Sets the investment_tax of this PurchaseCalculatorDepositAmountRequest.


        :param investment_tax: The investment_tax of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                investment_tax is not None and investment_tax > 1):  # noqa: E501
            raise ValueError("Invalid value for `investment_tax`, must be a value less than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                investment_tax is not None and investment_tax < 0):  # noqa: E501
            raise ValueError("Invalid value for `investment_tax`, must be a value greater than or equal to `0`")  # noqa: E501

        self._investment_tax = investment_tax

    @property
    def portfolio_return(self):
        """Gets the portfolio_return of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501


        :return: The portfolio_return of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :rtype: float
        """
        return self._portfolio_return

    @portfolio_return.setter
    def portfolio_return(self, portfolio_return):
        """Sets the portfolio_return of this PurchaseCalculatorDepositAmountRequest.


        :param portfolio_return: The portfolio_return of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and portfolio_return is None:
            raise ValueError("Invalid value for `portfolio_return`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                portfolio_return is not None and portfolio_return < -1):  # noqa: E501
            raise ValueError("Invalid value for `portfolio_return`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._portfolio_return = portfolio_return

    @property
    def deposit_schedule(self):
        """Gets the deposit_schedule of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501


        :return: The deposit_schedule of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :rtype: CalculatorDepositSchedule
        """
        return self._deposit_schedule

    @deposit_schedule.setter
    def deposit_schedule(self, deposit_schedule):
        """Sets the deposit_schedule of this PurchaseCalculatorDepositAmountRequest.


        :param deposit_schedule: The deposit_schedule of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :type: CalculatorDepositSchedule
        """

        self._deposit_schedule = deposit_schedule

    @property
    def current_savings(self):
        """Gets the current_savings of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501


        :return: The current_savings of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :rtype: float
        """
        return self._current_savings

    @current_savings.setter
    def current_savings(self, current_savings):
        """Sets the current_savings of this PurchaseCalculatorDepositAmountRequest.


        :param current_savings: The current_savings of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                current_savings is not None and current_savings < 0):  # noqa: E501
            raise ValueError("Invalid value for `current_savings`, must be a value greater than or equal to `0`")  # noqa: E501

        self._current_savings = current_savings

    @property
    def purchase_amount(self):
        """Gets the purchase_amount of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501


        :return: The purchase_amount of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :rtype: float
        """
        return self._purchase_amount

    @purchase_amount.setter
    def purchase_amount(self, purchase_amount):
        """Sets the purchase_amount of this PurchaseCalculatorDepositAmountRequest.


        :param purchase_amount: The purchase_amount of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and purchase_amount is None:
            raise ValueError("Invalid value for `purchase_amount`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                purchase_amount is not None and purchase_amount < 0):  # noqa: E501
            raise ValueError("Invalid value for `purchase_amount`, must be a value greater than or equal to `0`")  # noqa: E501

        self._purchase_amount = purchase_amount

    @property
    def inflation_rate(self):
        """Gets the inflation_rate of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501


        :return: The inflation_rate of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :rtype: float
        """
        return self._inflation_rate

    @inflation_rate.setter
    def inflation_rate(self, inflation_rate):
        """Sets the inflation_rate of this PurchaseCalculatorDepositAmountRequest.


        :param inflation_rate: The inflation_rate of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                inflation_rate is not None and inflation_rate < -1):  # noqa: E501
            raise ValueError("Invalid value for `inflation_rate`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._inflation_rate = inflation_rate

    @property
    def aggregation_account_ids(self):
        """Gets the aggregation_account_ids of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501


        :return: The aggregation_account_ids of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._aggregation_account_ids

    @aggregation_account_ids.setter
    def aggregation_account_ids(self, aggregation_account_ids):
        """Sets the aggregation_account_ids of this PurchaseCalculatorDepositAmountRequest.


        :param aggregation_account_ids: The aggregation_account_ids of this PurchaseCalculatorDepositAmountRequest.  # noqa: E501
        :type: list[str]
        """

        self._aggregation_account_ids = aggregation_account_ids

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
        if issubclass(PurchaseCalculatorDepositAmountRequest, dict):
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
        if not isinstance(other, PurchaseCalculatorDepositAmountRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PurchaseCalculatorDepositAmountRequest):
            return True

        return self.to_dict() != other.to_dict()
