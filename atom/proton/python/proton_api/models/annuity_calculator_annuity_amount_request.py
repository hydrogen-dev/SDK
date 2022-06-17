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


class AnnuityCalculatorAnnuityAmountRequest(object):
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
        'inflation_rate': 'float',
        'decumulation_horizon': 'int',
        'account_ids': 'list[str]',
        'tax_rate': 'float',
        'accumulation_horizon': 'int',
        'annuity_amount': 'float',
        'portfolio_return': 'float',
        'deposit_schedule': 'AnnuityDepositSchedule',
        'annuity_frequency_interval': 'str',
        'initial_balance': 'float',
        'aggregation_account_ids': 'list[str]',
        'create_log': 'bool'
    }

    attribute_map = {
        'inflation_rate': 'inflation_rate',
        'decumulation_horizon': 'decumulation_horizon',
        'account_ids': 'account_ids',
        'tax_rate': 'tax_rate',
        'accumulation_horizon': 'accumulation_horizon',
        'annuity_amount': 'annuity_amount',
        'portfolio_return': 'portfolio_return',
        'deposit_schedule': 'deposit_schedule',
        'annuity_frequency_interval': 'annuity_frequency_interval',
        'initial_balance': 'initial_balance',
        'aggregation_account_ids': 'aggregation_account_ids',
        'create_log': 'create_log'
    }

    def __init__(self, inflation_rate=0.0, decumulation_horizon=None, account_ids=None, tax_rate=0.0, accumulation_horizon=None, annuity_amount=1.0, portfolio_return=None, deposit_schedule=None, annuity_frequency_interval='year', initial_balance=0.0, aggregation_account_ids=None, create_log=False, _configuration=None):  # noqa: E501
        """AnnuityCalculatorAnnuityAmountRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._inflation_rate = None
        self._decumulation_horizon = None
        self._account_ids = None
        self._tax_rate = None
        self._accumulation_horizon = None
        self._annuity_amount = None
        self._portfolio_return = None
        self._deposit_schedule = None
        self._annuity_frequency_interval = None
        self._initial_balance = None
        self._aggregation_account_ids = None
        self._create_log = None
        self.discriminator = None

        if inflation_rate is not None:
            self.inflation_rate = inflation_rate
        self.decumulation_horizon = decumulation_horizon
        if account_ids is not None:
            self.account_ids = account_ids
        if tax_rate is not None:
            self.tax_rate = tax_rate
        self.accumulation_horizon = accumulation_horizon
        if annuity_amount is not None:
            self.annuity_amount = annuity_amount
        self.portfolio_return = portfolio_return
        if deposit_schedule is not None:
            self.deposit_schedule = deposit_schedule
        if annuity_frequency_interval is not None:
            self.annuity_frequency_interval = annuity_frequency_interval
        if initial_balance is not None:
            self.initial_balance = initial_balance
        if aggregation_account_ids is not None:
            self.aggregation_account_ids = aggregation_account_ids
        if create_log is not None:
            self.create_log = create_log

    @property
    def inflation_rate(self):
        """Gets the inflation_rate of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The inflation_rate of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: float
        """
        return self._inflation_rate

    @inflation_rate.setter
    def inflation_rate(self, inflation_rate):
        """Sets the inflation_rate of this AnnuityCalculatorAnnuityAmountRequest.


        :param inflation_rate: The inflation_rate of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                inflation_rate is not None and inflation_rate > 20):  # noqa: E501
            raise ValueError("Invalid value for `inflation_rate`, must be a value less than or equal to `20`")  # noqa: E501
        if (self._configuration.client_side_validation and
                inflation_rate is not None and inflation_rate < -1):  # noqa: E501
            raise ValueError("Invalid value for `inflation_rate`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._inflation_rate = inflation_rate

    @property
    def decumulation_horizon(self):
        """Gets the decumulation_horizon of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The decumulation_horizon of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: int
        """
        return self._decumulation_horizon

    @decumulation_horizon.setter
    def decumulation_horizon(self, decumulation_horizon):
        """Sets the decumulation_horizon of this AnnuityCalculatorAnnuityAmountRequest.


        :param decumulation_horizon: The decumulation_horizon of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: int
        """
        if self._configuration.client_side_validation and decumulation_horizon is None:
            raise ValueError("Invalid value for `decumulation_horizon`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                decumulation_horizon is not None and decumulation_horizon < 1):  # noqa: E501
            raise ValueError("Invalid value for `decumulation_horizon`, must be a value greater than or equal to `1`")  # noqa: E501

        self._decumulation_horizon = decumulation_horizon

    @property
    def account_ids(self):
        """Gets the account_ids of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The account_ids of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._account_ids

    @account_ids.setter
    def account_ids(self, account_ids):
        """Sets the account_ids of this AnnuityCalculatorAnnuityAmountRequest.


        :param account_ids: The account_ids of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: list[str]
        """

        self._account_ids = account_ids

    @property
    def tax_rate(self):
        """Gets the tax_rate of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The tax_rate of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: float
        """
        return self._tax_rate

    @tax_rate.setter
    def tax_rate(self, tax_rate):
        """Sets the tax_rate of this AnnuityCalculatorAnnuityAmountRequest.


        :param tax_rate: The tax_rate of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                tax_rate is not None and tax_rate > 1):  # noqa: E501
            raise ValueError("Invalid value for `tax_rate`, must be a value less than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                tax_rate is not None and tax_rate < 0):  # noqa: E501
            raise ValueError("Invalid value for `tax_rate`, must be a value greater than or equal to `0`")  # noqa: E501

        self._tax_rate = tax_rate

    @property
    def accumulation_horizon(self):
        """Gets the accumulation_horizon of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The accumulation_horizon of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: int
        """
        return self._accumulation_horizon

    @accumulation_horizon.setter
    def accumulation_horizon(self, accumulation_horizon):
        """Sets the accumulation_horizon of this AnnuityCalculatorAnnuityAmountRequest.


        :param accumulation_horizon: The accumulation_horizon of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: int
        """
        if self._configuration.client_side_validation and accumulation_horizon is None:
            raise ValueError("Invalid value for `accumulation_horizon`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                accumulation_horizon is not None and accumulation_horizon < 0):  # noqa: E501
            raise ValueError("Invalid value for `accumulation_horizon`, must be a value greater than or equal to `0`")  # noqa: E501

        self._accumulation_horizon = accumulation_horizon

    @property
    def annuity_amount(self):
        """Gets the annuity_amount of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The annuity_amount of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: float
        """
        return self._annuity_amount

    @annuity_amount.setter
    def annuity_amount(self, annuity_amount):
        """Sets the annuity_amount of this AnnuityCalculatorAnnuityAmountRequest.


        :param annuity_amount: The annuity_amount of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                annuity_amount is not None and annuity_amount < 0):  # noqa: E501
            raise ValueError("Invalid value for `annuity_amount`, must be a value greater than or equal to `0`")  # noqa: E501

        self._annuity_amount = annuity_amount

    @property
    def portfolio_return(self):
        """Gets the portfolio_return of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The portfolio_return of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: float
        """
        return self._portfolio_return

    @portfolio_return.setter
    def portfolio_return(self, portfolio_return):
        """Sets the portfolio_return of this AnnuityCalculatorAnnuityAmountRequest.


        :param portfolio_return: The portfolio_return of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and portfolio_return is None:
            raise ValueError("Invalid value for `portfolio_return`, must not be `None`")  # noqa: E501

        self._portfolio_return = portfolio_return

    @property
    def deposit_schedule(self):
        """Gets the deposit_schedule of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The deposit_schedule of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: AnnuityDepositSchedule
        """
        return self._deposit_schedule

    @deposit_schedule.setter
    def deposit_schedule(self, deposit_schedule):
        """Sets the deposit_schedule of this AnnuityCalculatorAnnuityAmountRequest.


        :param deposit_schedule: The deposit_schedule of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: AnnuityDepositSchedule
        """

        self._deposit_schedule = deposit_schedule

    @property
    def annuity_frequency_interval(self):
        """Gets the annuity_frequency_interval of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The annuity_frequency_interval of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: str
        """
        return self._annuity_frequency_interval

    @annuity_frequency_interval.setter
    def annuity_frequency_interval(self, annuity_frequency_interval):
        """Sets the annuity_frequency_interval of this AnnuityCalculatorAnnuityAmountRequest.


        :param annuity_frequency_interval: The annuity_frequency_interval of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["year", "quarter", "month", "week", "day"]  # noqa: E501
        if (self._configuration.client_side_validation and
                annuity_frequency_interval not in allowed_values):
            raise ValueError(
                "Invalid value for `annuity_frequency_interval` ({0}), must be one of {1}"  # noqa: E501
                .format(annuity_frequency_interval, allowed_values)
            )

        self._annuity_frequency_interval = annuity_frequency_interval

    @property
    def initial_balance(self):
        """Gets the initial_balance of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The initial_balance of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: float
        """
        return self._initial_balance

    @initial_balance.setter
    def initial_balance(self, initial_balance):
        """Sets the initial_balance of this AnnuityCalculatorAnnuityAmountRequest.


        :param initial_balance: The initial_balance of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                initial_balance is not None and initial_balance < 0):  # noqa: E501
            raise ValueError("Invalid value for `initial_balance`, must be a value greater than or equal to `0`")  # noqa: E501

        self._initial_balance = initial_balance

    @property
    def aggregation_account_ids(self):
        """Gets the aggregation_account_ids of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The aggregation_account_ids of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._aggregation_account_ids

    @aggregation_account_ids.setter
    def aggregation_account_ids(self, aggregation_account_ids):
        """Sets the aggregation_account_ids of this AnnuityCalculatorAnnuityAmountRequest.


        :param aggregation_account_ids: The aggregation_account_ids of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: list[str]
        """

        self._aggregation_account_ids = aggregation_account_ids

    @property
    def create_log(self):
        """Gets the create_log of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501


        :return: The create_log of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :rtype: bool
        """
        return self._create_log

    @create_log.setter
    def create_log(self, create_log):
        """Sets the create_log of this AnnuityCalculatorAnnuityAmountRequest.


        :param create_log: The create_log of this AnnuityCalculatorAnnuityAmountRequest.  # noqa: E501
        :type: bool
        """

        self._create_log = create_log

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
        if issubclass(AnnuityCalculatorAnnuityAmountRequest, dict):
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
        if not isinstance(other, AnnuityCalculatorAnnuityAmountRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AnnuityCalculatorAnnuityAmountRequest):
            return True

        return self.to_dict() != other.to_dict()
