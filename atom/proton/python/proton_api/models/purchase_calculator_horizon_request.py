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


class PurchaseCalculatorHorizonRequest(object):
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
        'investment_tax': 'float',
        'portfolio_return': 'float',
        'deposit_schedule': 'CalculatorDepositSchedule1',
        'current_savings': 'float',
        'purchase_amount': 'float',
        'inflation_rate': 'float',
        'aggregation_account_ids': 'list[str]'
    }

    attribute_map = {
        'account_ids': 'account_ids',
        'investment_tax': 'investment_tax',
        'portfolio_return': 'portfolio_return',
        'deposit_schedule': 'deposit_schedule',
        'current_savings': 'current_savings',
        'purchase_amount': 'purchase_amount',
        'inflation_rate': 'inflation_rate',
        'aggregation_account_ids': 'aggregation_account_ids'
    }

    def __init__(self, account_ids=None, investment_tax=0.0, portfolio_return=None, deposit_schedule=None, current_savings=0.0, purchase_amount=None, inflation_rate=0.0, aggregation_account_ids=None, _configuration=None):  # noqa: E501
        """PurchaseCalculatorHorizonRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._account_ids = None
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
        """Gets the account_ids of this PurchaseCalculatorHorizonRequest.  # noqa: E501


        :return: The account_ids of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._account_ids

    @account_ids.setter
    def account_ids(self, account_ids):
        """Sets the account_ids of this PurchaseCalculatorHorizonRequest.


        :param account_ids: The account_ids of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :type: list[str]
        """

        self._account_ids = account_ids

    @property
    def investment_tax(self):
        """Gets the investment_tax of this PurchaseCalculatorHorizonRequest.  # noqa: E501


        :return: The investment_tax of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :rtype: float
        """
        return self._investment_tax

    @investment_tax.setter
    def investment_tax(self, investment_tax):
        """Sets the investment_tax of this PurchaseCalculatorHorizonRequest.


        :param investment_tax: The investment_tax of this PurchaseCalculatorHorizonRequest.  # noqa: E501
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
        """Gets the portfolio_return of this PurchaseCalculatorHorizonRequest.  # noqa: E501


        :return: The portfolio_return of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :rtype: float
        """
        return self._portfolio_return

    @portfolio_return.setter
    def portfolio_return(self, portfolio_return):
        """Sets the portfolio_return of this PurchaseCalculatorHorizonRequest.


        :param portfolio_return: The portfolio_return of this PurchaseCalculatorHorizonRequest.  # noqa: E501
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
        """Gets the deposit_schedule of this PurchaseCalculatorHorizonRequest.  # noqa: E501


        :return: The deposit_schedule of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :rtype: CalculatorDepositSchedule1
        """
        return self._deposit_schedule

    @deposit_schedule.setter
    def deposit_schedule(self, deposit_schedule):
        """Sets the deposit_schedule of this PurchaseCalculatorHorizonRequest.


        :param deposit_schedule: The deposit_schedule of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :type: CalculatorDepositSchedule1
        """

        self._deposit_schedule = deposit_schedule

    @property
    def current_savings(self):
        """Gets the current_savings of this PurchaseCalculatorHorizonRequest.  # noqa: E501


        :return: The current_savings of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :rtype: float
        """
        return self._current_savings

    @current_savings.setter
    def current_savings(self, current_savings):
        """Sets the current_savings of this PurchaseCalculatorHorizonRequest.


        :param current_savings: The current_savings of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                current_savings is not None and current_savings < 0):  # noqa: E501
            raise ValueError("Invalid value for `current_savings`, must be a value greater than or equal to `0`")  # noqa: E501

        self._current_savings = current_savings

    @property
    def purchase_amount(self):
        """Gets the purchase_amount of this PurchaseCalculatorHorizonRequest.  # noqa: E501


        :return: The purchase_amount of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :rtype: float
        """
        return self._purchase_amount

    @purchase_amount.setter
    def purchase_amount(self, purchase_amount):
        """Sets the purchase_amount of this PurchaseCalculatorHorizonRequest.


        :param purchase_amount: The purchase_amount of this PurchaseCalculatorHorizonRequest.  # noqa: E501
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
        """Gets the inflation_rate of this PurchaseCalculatorHorizonRequest.  # noqa: E501


        :return: The inflation_rate of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :rtype: float
        """
        return self._inflation_rate

    @inflation_rate.setter
    def inflation_rate(self, inflation_rate):
        """Sets the inflation_rate of this PurchaseCalculatorHorizonRequest.


        :param inflation_rate: The inflation_rate of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                inflation_rate is not None and inflation_rate < -1):  # noqa: E501
            raise ValueError("Invalid value for `inflation_rate`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._inflation_rate = inflation_rate

    @property
    def aggregation_account_ids(self):
        """Gets the aggregation_account_ids of this PurchaseCalculatorHorizonRequest.  # noqa: E501


        :return: The aggregation_account_ids of this PurchaseCalculatorHorizonRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._aggregation_account_ids

    @aggregation_account_ids.setter
    def aggregation_account_ids(self, aggregation_account_ids):
        """Sets the aggregation_account_ids of this PurchaseCalculatorHorizonRequest.


        :param aggregation_account_ids: The aggregation_account_ids of this PurchaseCalculatorHorizonRequest.  # noqa: E501
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
        if issubclass(PurchaseCalculatorHorizonRequest, dict):
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
        if not isinstance(other, PurchaseCalculatorHorizonRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PurchaseCalculatorHorizonRequest):
            return True

        return self.to_dict() != other.to_dict()
