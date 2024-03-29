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


class PortfolioWhatIfRequest(object):
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
        'end_date': 'str',
        'market_data_source': 'str',
        'model_id': 'str',
        'account_id': 'str',
        'start_date': 'str',
        'current_portfolio_weights': 'list[float]',
        'use_proxy_data': 'bool',
        'altered_portfolio_weights': 'list[float]',
        'create_log': 'bool',
        'current_portfolio_tickers': 'list[str]',
        'aggregation_account_id': 'str',
        'altered_portfolio_tickers': 'list[str]',
        'portfolio_id': 'str'
    }

    attribute_map = {
        'allocation_id': 'allocation_id',
        'end_date': 'end_date',
        'market_data_source': 'market_data_source',
        'model_id': 'model_id',
        'account_id': 'account_id',
        'start_date': 'start_date',
        'current_portfolio_weights': 'current_portfolio_weights',
        'use_proxy_data': 'use_proxy_data',
        'altered_portfolio_weights': 'altered_portfolio_weights',
        'create_log': 'create_log',
        'current_portfolio_tickers': 'current_portfolio_tickers',
        'aggregation_account_id': 'aggregation_account_id',
        'altered_portfolio_tickers': 'altered_portfolio_tickers',
        'portfolio_id': 'portfolio_id'
    }

    def __init__(self, allocation_id=None, end_date=None, market_data_source='nucleus', model_id=None, account_id=None, start_date=None, current_portfolio_weights=None, use_proxy_data=False, altered_portfolio_weights=None, create_log=False, current_portfolio_tickers=None, aggregation_account_id=None, altered_portfolio_tickers=None, portfolio_id=None, _configuration=None):  # noqa: E501
        """PortfolioWhatIfRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._allocation_id = None
        self._end_date = None
        self._market_data_source = None
        self._model_id = None
        self._account_id = None
        self._start_date = None
        self._current_portfolio_weights = None
        self._use_proxy_data = None
        self._altered_portfolio_weights = None
        self._create_log = None
        self._current_portfolio_tickers = None
        self._aggregation_account_id = None
        self._altered_portfolio_tickers = None
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
        if current_portfolio_weights is not None:
            self.current_portfolio_weights = current_portfolio_weights
        if use_proxy_data is not None:
            self.use_proxy_data = use_proxy_data
        self.altered_portfolio_weights = altered_portfolio_weights
        if create_log is not None:
            self.create_log = create_log
        if current_portfolio_tickers is not None:
            self.current_portfolio_tickers = current_portfolio_tickers
        if aggregation_account_id is not None:
            self.aggregation_account_id = aggregation_account_id
        if altered_portfolio_tickers is not None:
            self.altered_portfolio_tickers = altered_portfolio_tickers
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id

    @property
    def allocation_id(self):
        """Gets the allocation_id of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The allocation_id of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: str
        """
        return self._allocation_id

    @allocation_id.setter
    def allocation_id(self, allocation_id):
        """Sets the allocation_id of this PortfolioWhatIfRequest.


        :param allocation_id: The allocation_id of this PortfolioWhatIfRequest.  # noqa: E501
        :type: str
        """

        self._allocation_id = allocation_id

    @property
    def end_date(self):
        """Gets the end_date of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The end_date of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: str
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this PortfolioWhatIfRequest.


        :param end_date: The end_date of this PortfolioWhatIfRequest.  # noqa: E501
        :type: str
        """

        self._end_date = end_date

    @property
    def market_data_source(self):
        """Gets the market_data_source of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The market_data_source of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: str
        """
        return self._market_data_source

    @market_data_source.setter
    def market_data_source(self, market_data_source):
        """Sets the market_data_source of this PortfolioWhatIfRequest.


        :param market_data_source: The market_data_source of this PortfolioWhatIfRequest.  # noqa: E501
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
        """Gets the model_id of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The model_id of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this PortfolioWhatIfRequest.


        :param model_id: The model_id of this PortfolioWhatIfRequest.  # noqa: E501
        :type: str
        """

        self._model_id = model_id

    @property
    def account_id(self):
        """Gets the account_id of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The account_id of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this PortfolioWhatIfRequest.


        :param account_id: The account_id of this PortfolioWhatIfRequest.  # noqa: E501
        :type: str
        """

        self._account_id = account_id

    @property
    def start_date(self):
        """Gets the start_date of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The start_date of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this PortfolioWhatIfRequest.


        :param start_date: The start_date of this PortfolioWhatIfRequest.  # noqa: E501
        :type: str
        """

        self._start_date = start_date

    @property
    def current_portfolio_weights(self):
        """Gets the current_portfolio_weights of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The current_portfolio_weights of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: list[float]
        """
        return self._current_portfolio_weights

    @current_portfolio_weights.setter
    def current_portfolio_weights(self, current_portfolio_weights):
        """Sets the current_portfolio_weights of this PortfolioWhatIfRequest.


        :param current_portfolio_weights: The current_portfolio_weights of this PortfolioWhatIfRequest.  # noqa: E501
        :type: list[float]
        """

        self._current_portfolio_weights = current_portfolio_weights

    @property
    def use_proxy_data(self):
        """Gets the use_proxy_data of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The use_proxy_data of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: bool
        """
        return self._use_proxy_data

    @use_proxy_data.setter
    def use_proxy_data(self, use_proxy_data):
        """Sets the use_proxy_data of this PortfolioWhatIfRequest.


        :param use_proxy_data: The use_proxy_data of this PortfolioWhatIfRequest.  # noqa: E501
        :type: bool
        """

        self._use_proxy_data = use_proxy_data

    @property
    def altered_portfolio_weights(self):
        """Gets the altered_portfolio_weights of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The altered_portfolio_weights of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: list[float]
        """
        return self._altered_portfolio_weights

    @altered_portfolio_weights.setter
    def altered_portfolio_weights(self, altered_portfolio_weights):
        """Sets the altered_portfolio_weights of this PortfolioWhatIfRequest.


        :param altered_portfolio_weights: The altered_portfolio_weights of this PortfolioWhatIfRequest.  # noqa: E501
        :type: list[float]
        """
        if self._configuration.client_side_validation and altered_portfolio_weights is None:
            raise ValueError("Invalid value for `altered_portfolio_weights`, must not be `None`")  # noqa: E501

        self._altered_portfolio_weights = altered_portfolio_weights

    @property
    def create_log(self):
        """Gets the create_log of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The create_log of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: bool
        """
        return self._create_log

    @create_log.setter
    def create_log(self, create_log):
        """Sets the create_log of this PortfolioWhatIfRequest.


        :param create_log: The create_log of this PortfolioWhatIfRequest.  # noqa: E501
        :type: bool
        """

        self._create_log = create_log

    @property
    def current_portfolio_tickers(self):
        """Gets the current_portfolio_tickers of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The current_portfolio_tickers of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._current_portfolio_tickers

    @current_portfolio_tickers.setter
    def current_portfolio_tickers(self, current_portfolio_tickers):
        """Sets the current_portfolio_tickers of this PortfolioWhatIfRequest.


        :param current_portfolio_tickers: The current_portfolio_tickers of this PortfolioWhatIfRequest.  # noqa: E501
        :type: list[str]
        """

        self._current_portfolio_tickers = current_portfolio_tickers

    @property
    def aggregation_account_id(self):
        """Gets the aggregation_account_id of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The aggregation_account_id of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: str
        """
        return self._aggregation_account_id

    @aggregation_account_id.setter
    def aggregation_account_id(self, aggregation_account_id):
        """Sets the aggregation_account_id of this PortfolioWhatIfRequest.


        :param aggregation_account_id: The aggregation_account_id of this PortfolioWhatIfRequest.  # noqa: E501
        :type: str
        """

        self._aggregation_account_id = aggregation_account_id

    @property
    def altered_portfolio_tickers(self):
        """Gets the altered_portfolio_tickers of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The altered_portfolio_tickers of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._altered_portfolio_tickers

    @altered_portfolio_tickers.setter
    def altered_portfolio_tickers(self, altered_portfolio_tickers):
        """Sets the altered_portfolio_tickers of this PortfolioWhatIfRequest.


        :param altered_portfolio_tickers: The altered_portfolio_tickers of this PortfolioWhatIfRequest.  # noqa: E501
        :type: list[str]
        """

        self._altered_portfolio_tickers = altered_portfolio_tickers

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this PortfolioWhatIfRequest.  # noqa: E501


        :return: The portfolio_id of this PortfolioWhatIfRequest.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this PortfolioWhatIfRequest.


        :param portfolio_id: The portfolio_id of this PortfolioWhatIfRequest.  # noqa: E501
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
        if issubclass(PortfolioWhatIfRequest, dict):
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
        if not isinstance(other, PortfolioWhatIfRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PortfolioWhatIfRequest):
            return True

        return self.to_dict() != other.to_dict()
