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


class SensitivityAnalysisRequest(object):
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
        'allocation_id': 'str',
        'end_date': 'date',
        'market_data_source': 'str',
        'model_id': 'str',
        'account_id': 'str',
        'start_date': 'date',
        'frequency_interval': 'str',
        'trading_days_per_year': 'int',
        'sensitivity_factor': 'SensitivityFactor',
        'use_proxy_data': 'bool',
        'portfolio_weights': 'list[float]',
        'portfolio_tickers': 'list[str]',
        'create_log': 'bool',
        'aggregation_account_id': 'str',
        'portfolio_id': 'str'
    }

    attribute_map = {
        'allocation_id': 'allocation_id',
        'end_date': 'end_date',
        'market_data_source': 'market_data_source',
        'model_id': 'model_id',
        'account_id': 'account_id',
        'start_date': 'start_date',
        'frequency_interval': 'frequency_interval',
        'trading_days_per_year': 'trading_days_per_year',
        'sensitivity_factor': 'sensitivity_factor',
        'use_proxy_data': 'use_proxy_data',
        'portfolio_weights': 'portfolio_weights',
        'portfolio_tickers': 'portfolio_tickers',
        'create_log': 'create_log',
        'aggregation_account_id': 'aggregation_account_id',
        'portfolio_id': 'portfolio_id'
    }

    def __init__(self, allocation_id=None, end_date=None, market_data_source='nucleus', model_id=None, account_id=None, start_date=None, frequency_interval=None, trading_days_per_year=252, sensitivity_factor=None, use_proxy_data=False, portfolio_weights=None, portfolio_tickers=None, create_log=False, aggregation_account_id=None, portfolio_id=None, _configuration=None):  # noqa: E501
        """SensitivityAnalysisRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._allocation_id = None
        self._end_date = None
        self._market_data_source = None
        self._model_id = None
        self._account_id = None
        self._start_date = None
        self._frequency_interval = None
        self._trading_days_per_year = None
        self._sensitivity_factor = None
        self._use_proxy_data = None
        self._portfolio_weights = None
        self._portfolio_tickers = None
        self._create_log = None
        self._aggregation_account_id = None
        self._portfolio_id = None
        self.discriminator = None

        if allocation_id is not None:
            self.allocation_id = allocation_id
        if end_date is not None:
            self.end_date = end_date
        if market_data_source is not None:
            self.market_data_source = market_data_source
        if model_id is not None:
            self.model_id = model_id
        if account_id is not None:
            self.account_id = account_id
        if start_date is not None:
            self.start_date = start_date
        self.frequency_interval = frequency_interval
        if trading_days_per_year is not None:
            self.trading_days_per_year = trading_days_per_year
        self.sensitivity_factor = sensitivity_factor
        if use_proxy_data is not None:
            self.use_proxy_data = use_proxy_data
        if portfolio_weights is not None:
            self.portfolio_weights = portfolio_weights
        if portfolio_tickers is not None:
            self.portfolio_tickers = portfolio_tickers
        if create_log is not None:
            self.create_log = create_log
        if aggregation_account_id is not None:
            self.aggregation_account_id = aggregation_account_id
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id

    @property
    def allocation_id(self):
        """Gets the allocation_id of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The allocation_id of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._allocation_id

    @allocation_id.setter
    def allocation_id(self, allocation_id):
        """Sets the allocation_id of this SensitivityAnalysisRequest.


        :param allocation_id: The allocation_id of this SensitivityAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._allocation_id = allocation_id

    @property
    def end_date(self):
        """Gets the end_date of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The end_date of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: date
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this SensitivityAnalysisRequest.


        :param end_date: The end_date of this SensitivityAnalysisRequest.  # noqa: E501
        :type: date
        """

        self._end_date = end_date

    @property
    def market_data_source(self):
        """Gets the market_data_source of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The market_data_source of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._market_data_source

    @market_data_source.setter
    def market_data_source(self, market_data_source):
        """Sets the market_data_source of this SensitivityAnalysisRequest.


        :param market_data_source: The market_data_source of this SensitivityAnalysisRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["nucleus", "integration"]  # noqa: E501
        if (self._configuration.client_side_validation and
                market_data_source not in allowed_values):
            raise ValueError(
                "Invalid value for `market_data_source` ({0}), must be one of {1}"  # noqa: E501
                .format(market_data_source, allowed_values)
            )

        self._market_data_source = market_data_source

    @property
    def model_id(self):
        """Gets the model_id of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The model_id of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this SensitivityAnalysisRequest.


        :param model_id: The model_id of this SensitivityAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._model_id = model_id

    @property
    def account_id(self):
        """Gets the account_id of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The account_id of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this SensitivityAnalysisRequest.


        :param account_id: The account_id of this SensitivityAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._account_id = account_id

    @property
    def start_date(self):
        """Gets the start_date of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The start_date of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: date
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this SensitivityAnalysisRequest.


        :param start_date: The start_date of this SensitivityAnalysisRequest.  # noqa: E501
        :type: date
        """

        self._start_date = start_date

    @property
    def frequency_interval(self):
        """Gets the frequency_interval of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The frequency_interval of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._frequency_interval

    @frequency_interval.setter
    def frequency_interval(self, frequency_interval):
        """Sets the frequency_interval of this SensitivityAnalysisRequest.


        :param frequency_interval: The frequency_interval of this SensitivityAnalysisRequest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and frequency_interval is None:
            raise ValueError("Invalid value for `frequency_interval`, must not be `None`")  # noqa: E501
        allowed_values = ["year", "quarter", "month", "week", "day"]  # noqa: E501
        if (self._configuration.client_side_validation and
                frequency_interval not in allowed_values):
            raise ValueError(
                "Invalid value for `frequency_interval` ({0}), must be one of {1}"  # noqa: E501
                .format(frequency_interval, allowed_values)
            )

        self._frequency_interval = frequency_interval

    @property
    def trading_days_per_year(self):
        """Gets the trading_days_per_year of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The trading_days_per_year of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: int
        """
        return self._trading_days_per_year

    @trading_days_per_year.setter
    def trading_days_per_year(self, trading_days_per_year):
        """Sets the trading_days_per_year of this SensitivityAnalysisRequest.


        :param trading_days_per_year: The trading_days_per_year of this SensitivityAnalysisRequest.  # noqa: E501
        :type: int
        """
        if (self._configuration.client_side_validation and
                trading_days_per_year is not None and trading_days_per_year > 365):  # noqa: E501
            raise ValueError("Invalid value for `trading_days_per_year`, must be a value less than or equal to `365`")  # noqa: E501
        if (self._configuration.client_side_validation and
                trading_days_per_year is not None and trading_days_per_year < 1):  # noqa: E501
            raise ValueError("Invalid value for `trading_days_per_year`, must be a value greater than or equal to `1`")  # noqa: E501

        self._trading_days_per_year = trading_days_per_year

    @property
    def sensitivity_factor(self):
        """Gets the sensitivity_factor of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The sensitivity_factor of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: SensitivityFactor
        """
        return self._sensitivity_factor

    @sensitivity_factor.setter
    def sensitivity_factor(self, sensitivity_factor):
        """Sets the sensitivity_factor of this SensitivityAnalysisRequest.


        :param sensitivity_factor: The sensitivity_factor of this SensitivityAnalysisRequest.  # noqa: E501
        :type: SensitivityFactor
        """
        if self._configuration.client_side_validation and sensitivity_factor is None:
            raise ValueError("Invalid value for `sensitivity_factor`, must not be `None`")  # noqa: E501

        self._sensitivity_factor = sensitivity_factor

    @property
    def use_proxy_data(self):
        """Gets the use_proxy_data of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The use_proxy_data of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: bool
        """
        return self._use_proxy_data

    @use_proxy_data.setter
    def use_proxy_data(self, use_proxy_data):
        """Sets the use_proxy_data of this SensitivityAnalysisRequest.


        :param use_proxy_data: The use_proxy_data of this SensitivityAnalysisRequest.  # noqa: E501
        :type: bool
        """

        self._use_proxy_data = use_proxy_data

    @property
    def portfolio_weights(self):
        """Gets the portfolio_weights of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The portfolio_weights of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: list[float]
        """
        return self._portfolio_weights

    @portfolio_weights.setter
    def portfolio_weights(self, portfolio_weights):
        """Sets the portfolio_weights of this SensitivityAnalysisRequest.


        :param portfolio_weights: The portfolio_weights of this SensitivityAnalysisRequest.  # noqa: E501
        :type: list[float]
        """

        self._portfolio_weights = portfolio_weights

    @property
    def portfolio_tickers(self):
        """Gets the portfolio_tickers of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The portfolio_tickers of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._portfolio_tickers

    @portfolio_tickers.setter
    def portfolio_tickers(self, portfolio_tickers):
        """Sets the portfolio_tickers of this SensitivityAnalysisRequest.


        :param portfolio_tickers: The portfolio_tickers of this SensitivityAnalysisRequest.  # noqa: E501
        :type: list[str]
        """

        self._portfolio_tickers = portfolio_tickers

    @property
    def create_log(self):
        """Gets the create_log of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The create_log of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: bool
        """
        return self._create_log

    @create_log.setter
    def create_log(self, create_log):
        """Sets the create_log of this SensitivityAnalysisRequest.


        :param create_log: The create_log of this SensitivityAnalysisRequest.  # noqa: E501
        :type: bool
        """

        self._create_log = create_log

    @property
    def aggregation_account_id(self):
        """Gets the aggregation_account_id of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The aggregation_account_id of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._aggregation_account_id

    @aggregation_account_id.setter
    def aggregation_account_id(self, aggregation_account_id):
        """Sets the aggregation_account_id of this SensitivityAnalysisRequest.


        :param aggregation_account_id: The aggregation_account_id of this SensitivityAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._aggregation_account_id = aggregation_account_id

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this SensitivityAnalysisRequest.  # noqa: E501


        :return: The portfolio_id of this SensitivityAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this SensitivityAnalysisRequest.


        :param portfolio_id: The portfolio_id of this SensitivityAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

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
        if issubclass(SensitivityAnalysisRequest, dict):
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
        if not isinstance(other, SensitivityAnalysisRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, SensitivityAnalysisRequest):
            return True

        return self.to_dict() != other.to_dict()
