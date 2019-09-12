# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.0.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from atom_api.models.goal_config import GoalConfig  # noqa: F401,E501
from atom_api.models.goal_deposit_config import GoalDepositConfig  # noqa: F401,E501
from atom_api.models.goal_opt_config import GoalOptConfig  # noqa: F401,E501
from atom_api.models.goal_recommendation_config_status import GoalRecommendationConfigStatus  # noqa: F401,E501


class GoalAccumulationAllocation(object):
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
        'allocation_method': 'str',
        'allocation_priority': 'str',
        'opt_config': 'GoalOptConfig',
        'allocations': 'list[str]',
        'curr_inv': 'float',
        'horizon': 'int',
        'horizon_frequency': 'str',
        'goal_config': 'GoalConfig',
        'deposit_config': 'list[GoalDepositConfig]',
        'recommendation_config': 'GoalRecommendationConfigStatus',
        'recommend_type': 'str',
        'conf_tgt': 'float',
        'n': 'int',
        'remove_outliers': 'bool',
        'thresh_type': 'str',
        'thresh': 'float',
        'withdrawal_tax': 'float',
        'trading_days_per_year': 'int',
        'risk_score': 'int',
        'adjust_for_compounding': 'bool',
        'compounding_rate': 'float',
        'use_proxy_data': 'bool'
    }

    attribute_map = {
        'allocation_method': 'allocation_method',
        'allocation_priority': 'allocation_priority',
        'opt_config': 'opt_config',
        'allocations': 'allocations',
        'curr_inv': 'curr_inv',
        'horizon': 'horizon',
        'horizon_frequency': 'horizon_frequency',
        'goal_config': 'goal_config',
        'deposit_config': 'deposit_config',
        'recommendation_config': 'recommendation_config',
        'recommend_type': 'recommend_type',
        'conf_tgt': 'conf_tgt',
        'n': 'n',
        'remove_outliers': 'remove_outliers',
        'thresh_type': 'thresh_type',
        'thresh': 'thresh',
        'withdrawal_tax': 'withdrawal_tax',
        'trading_days_per_year': 'trading_days_per_year',
        'risk_score': 'risk_score',
        'adjust_for_compounding': 'adjust_for_compounding',
        'compounding_rate': 'compounding_rate',
        'use_proxy_data': 'use_proxy_data'
    }

    def __init__(self, allocation_method=None, allocation_priority=None, opt_config=None, allocations=None, curr_inv=None, horizon=None, horizon_frequency=None, goal_config=None, deposit_config=None, recommendation_config=None, recommend_type='horizon', conf_tgt=None, n=None, remove_outliers=True, thresh_type='perc', thresh=None, withdrawal_tax=None, trading_days_per_year=None, risk_score=None, adjust_for_compounding=False, compounding_rate=None, use_proxy_data=False):  # noqa: E501
        """GoalAccumulationAllocation - a model defined in Swagger"""  # noqa: E501

        self._allocation_method = None
        self._allocation_priority = None
        self._opt_config = None
        self._allocations = None
        self._curr_inv = None
        self._horizon = None
        self._horizon_frequency = None
        self._goal_config = None
        self._deposit_config = None
        self._recommendation_config = None
        self._recommend_type = None
        self._conf_tgt = None
        self._n = None
        self._remove_outliers = None
        self._thresh_type = None
        self._thresh = None
        self._withdrawal_tax = None
        self._trading_days_per_year = None
        self._risk_score = None
        self._adjust_for_compounding = None
        self._compounding_rate = None
        self._use_proxy_data = None
        self.discriminator = None

        self.allocation_method = allocation_method
        self.allocation_priority = allocation_priority
        if opt_config is not None:
            self.opt_config = opt_config
        if allocations is not None:
            self.allocations = allocations
        self.curr_inv = curr_inv
        self.horizon = horizon
        self.horizon_frequency = horizon_frequency
        self.goal_config = goal_config
        if deposit_config is not None:
            self.deposit_config = deposit_config
        if recommendation_config is not None:
            self.recommendation_config = recommendation_config
        if recommend_type is not None:
            self.recommend_type = recommend_type
        if conf_tgt is not None:
            self.conf_tgt = conf_tgt
        if n is not None:
            self.n = n
        if remove_outliers is not None:
            self.remove_outliers = remove_outliers
        if thresh_type is not None:
            self.thresh_type = thresh_type
        if thresh is not None:
            self.thresh = thresh
        if withdrawal_tax is not None:
            self.withdrawal_tax = withdrawal_tax
        if trading_days_per_year is not None:
            self.trading_days_per_year = trading_days_per_year
        if risk_score is not None:
            self.risk_score = risk_score
        if adjust_for_compounding is not None:
            self.adjust_for_compounding = adjust_for_compounding
        if compounding_rate is not None:
            self.compounding_rate = compounding_rate
        if use_proxy_data is not None:
            self.use_proxy_data = use_proxy_data

    @property
    def allocation_method(self):
        """Gets the allocation_method of this GoalAccumulationAllocation.  # noqa: E501

        The allocation universe source, either create or select  # noqa: E501

        :return: The allocation_method of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: str
        """
        return self._allocation_method

    @allocation_method.setter
    def allocation_method(self, allocation_method):
        """Sets the allocation_method of this GoalAccumulationAllocation.

        The allocation universe source, either create or select  # noqa: E501

        :param allocation_method: The allocation_method of this GoalAccumulationAllocation.  # noqa: E501
        :type: str
        """
        if allocation_method is None:
            raise ValueError("Invalid value for `allocation_method`, must not be `None`")  # noqa: E501
        allowed_values = ["select", "create"]  # noqa: E501
        if allocation_method not in allowed_values:
            raise ValueError(
                "Invalid value for `allocation_method` ({0}), must be one of {1}"  # noqa: E501
                .format(allocation_method, allowed_values)
            )

        self._allocation_method = allocation_method

    @property
    def allocation_priority(self):
        """Gets the allocation_priority of this GoalAccumulationAllocation.  # noqa: E501

        Priority when allocating, either risk or goal  # noqa: E501

        :return: The allocation_priority of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: str
        """
        return self._allocation_priority

    @allocation_priority.setter
    def allocation_priority(self, allocation_priority):
        """Sets the allocation_priority of this GoalAccumulationAllocation.

        Priority when allocating, either risk or goal  # noqa: E501

        :param allocation_priority: The allocation_priority of this GoalAccumulationAllocation.  # noqa: E501
        :type: str
        """
        if allocation_priority is None:
            raise ValueError("Invalid value for `allocation_priority`, must not be `None`")  # noqa: E501
        allowed_values = ["goal", "risk"]  # noqa: E501
        if allocation_priority not in allowed_values:
            raise ValueError(
                "Invalid value for `allocation_priority` ({0}), must be one of {1}"  # noqa: E501
                .format(allocation_priority, allowed_values)
            )

        self._allocation_priority = allocation_priority

    @property
    def opt_config(self):
        """Gets the opt_config of this GoalAccumulationAllocation.  # noqa: E501


        :return: The opt_config of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: GoalOptConfig
        """
        return self._opt_config

    @opt_config.setter
    def opt_config(self, opt_config):
        """Sets the opt_config of this GoalAccumulationAllocation.


        :param opt_config: The opt_config of this GoalAccumulationAllocation.  # noqa: E501
        :type: GoalOptConfig
        """

        self._opt_config = opt_config

    @property
    def allocations(self):
        """Gets the allocations of this GoalAccumulationAllocation.  # noqa: E501


        :return: The allocations of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: list[str]
        """
        return self._allocations

    @allocations.setter
    def allocations(self, allocations):
        """Sets the allocations of this GoalAccumulationAllocation.


        :param allocations: The allocations of this GoalAccumulationAllocation.  # noqa: E501
        :type: list[str]
        """

        self._allocations = allocations

    @property
    def curr_inv(self):
        """Gets the curr_inv of this GoalAccumulationAllocation.  # noqa: E501

        The current amount invested  # noqa: E501

        :return: The curr_inv of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: float
        """
        return self._curr_inv

    @curr_inv.setter
    def curr_inv(self, curr_inv):
        """Sets the curr_inv of this GoalAccumulationAllocation.

        The current amount invested  # noqa: E501

        :param curr_inv: The curr_inv of this GoalAccumulationAllocation.  # noqa: E501
        :type: float
        """
        if curr_inv is None:
            raise ValueError("Invalid value for `curr_inv`, must not be `None`")  # noqa: E501
        if curr_inv is not None and curr_inv < 0:  # noqa: E501
            raise ValueError("Invalid value for `curr_inv`, must be a value greater than or equal to `0`")  # noqa: E501

        self._curr_inv = curr_inv

    @property
    def horizon(self):
        """Gets the horizon of this GoalAccumulationAllocation.  # noqa: E501

        The accumulation goal horizon  # noqa: E501

        :return: The horizon of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: int
        """
        return self._horizon

    @horizon.setter
    def horizon(self, horizon):
        """Sets the horizon of this GoalAccumulationAllocation.

        The accumulation goal horizon  # noqa: E501

        :param horizon: The horizon of this GoalAccumulationAllocation.  # noqa: E501
        :type: int
        """
        if horizon is None:
            raise ValueError("Invalid value for `horizon`, must not be `None`")  # noqa: E501
        if horizon is not None and horizon >= 350:  # noqa: E501
            raise ValueError("Invalid value for `horizon`, must be a value less than `350`")  # noqa: E501
        if horizon is not None and horizon <= 0:  # noqa: E501
            raise ValueError("Invalid value for `horizon`, must be a value greater than `0`")  # noqa: E501

        self._horizon = horizon

    @property
    def horizon_frequency(self):
        """Gets the horizon_frequency of this GoalAccumulationAllocation.  # noqa: E501

        Frequency in relation to the horizon  # noqa: E501

        :return: The horizon_frequency of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: str
        """
        return self._horizon_frequency

    @horizon_frequency.setter
    def horizon_frequency(self, horizon_frequency):
        """Sets the horizon_frequency of this GoalAccumulationAllocation.

        Frequency in relation to the horizon  # noqa: E501

        :param horizon_frequency: The horizon_frequency of this GoalAccumulationAllocation.  # noqa: E501
        :type: str
        """
        if horizon_frequency is None:
            raise ValueError("Invalid value for `horizon_frequency`, must not be `None`")  # noqa: E501
        allowed_values = ["year", "six_months", "quarter", "month", "two_weeks", "week", "day"]  # noqa: E501
        if horizon_frequency not in allowed_values:
            raise ValueError(
                "Invalid value for `horizon_frequency` ({0}), must be one of {1}"  # noqa: E501
                .format(horizon_frequency, allowed_values)
            )

        self._horizon_frequency = horizon_frequency

    @property
    def goal_config(self):
        """Gets the goal_config of this GoalAccumulationAllocation.  # noqa: E501


        :return: The goal_config of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: GoalConfig
        """
        return self._goal_config

    @goal_config.setter
    def goal_config(self, goal_config):
        """Sets the goal_config of this GoalAccumulationAllocation.


        :param goal_config: The goal_config of this GoalAccumulationAllocation.  # noqa: E501
        :type: GoalConfig
        """
        if goal_config is None:
            raise ValueError("Invalid value for `goal_config`, must not be `None`")  # noqa: E501

        self._goal_config = goal_config

    @property
    def deposit_config(self):
        """Gets the deposit_config of this GoalAccumulationAllocation.  # noqa: E501

        The deposit attributes  # noqa: E501

        :return: The deposit_config of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: list[GoalDepositConfig]
        """
        return self._deposit_config

    @deposit_config.setter
    def deposit_config(self, deposit_config):
        """Sets the deposit_config of this GoalAccumulationAllocation.

        The deposit attributes  # noqa: E501

        :param deposit_config: The deposit_config of this GoalAccumulationAllocation.  # noqa: E501
        :type: list[GoalDepositConfig]
        """

        self._deposit_config = deposit_config

    @property
    def recommendation_config(self):
        """Gets the recommendation_config of this GoalAccumulationAllocation.  # noqa: E501


        :return: The recommendation_config of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: GoalRecommendationConfigStatus
        """
        return self._recommendation_config

    @recommendation_config.setter
    def recommendation_config(self, recommendation_config):
        """Sets the recommendation_config of this GoalAccumulationAllocation.


        :param recommendation_config: The recommendation_config of this GoalAccumulationAllocation.  # noqa: E501
        :type: GoalRecommendationConfigStatus
        """

        self._recommendation_config = recommendation_config

    @property
    def recommend_type(self):
        """Gets the recommend_type of this GoalAccumulationAllocation.  # noqa: E501

        The type of recommended action  # noqa: E501

        :return: The recommend_type of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: str
        """
        return self._recommend_type

    @recommend_type.setter
    def recommend_type(self, recommend_type):
        """Sets the recommend_type of this GoalAccumulationAllocation.

        The type of recommended action  # noqa: E501

        :param recommend_type: The recommend_type of this GoalAccumulationAllocation.  # noqa: E501
        :type: str
        """
        allowed_values = ["recurring", "one-time", "combo", "horizon"]  # noqa: E501
        if recommend_type not in allowed_values:
            raise ValueError(
                "Invalid value for `recommend_type` ({0}), must be one of {1}"  # noqa: E501
                .format(recommend_type, allowed_values)
            )

        self._recommend_type = recommend_type

    @property
    def conf_tgt(self):
        """Gets the conf_tgt of this GoalAccumulationAllocation.  # noqa: E501

        The confidence target  # noqa: E501

        :return: The conf_tgt of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: float
        """
        return self._conf_tgt

    @conf_tgt.setter
    def conf_tgt(self, conf_tgt):
        """Sets the conf_tgt of this GoalAccumulationAllocation.

        The confidence target  # noqa: E501

        :param conf_tgt: The conf_tgt of this GoalAccumulationAllocation.  # noqa: E501
        :type: float
        """
        if conf_tgt is not None and conf_tgt > 1:  # noqa: E501
            raise ValueError("Invalid value for `conf_tgt`, must be a value less than or equal to `1`")  # noqa: E501
        if conf_tgt is not None and conf_tgt <= 0:  # noqa: E501
            raise ValueError("Invalid value for `conf_tgt`, must be a value greater than `0`")  # noqa: E501

        self._conf_tgt = conf_tgt

    @property
    def n(self):
        """Gets the n of this GoalAccumulationAllocation.  # noqa: E501

        The number of Monte Carlo simulations to run  # noqa: E501

        :return: The n of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: int
        """
        return self._n

    @n.setter
    def n(self, n):
        """Sets the n of this GoalAccumulationAllocation.

        The number of Monte Carlo simulations to run  # noqa: E501

        :param n: The n of this GoalAccumulationAllocation.  # noqa: E501
        :type: int
        """
        if n is not None and n > 10000:  # noqa: E501
            raise ValueError("Invalid value for `n`, must be a value less than or equal to `10000`")  # noqa: E501
        if n is not None and n <= 0:  # noqa: E501
            raise ValueError("Invalid value for `n`, must be a value greater than `0`")  # noqa: E501

        self._n = n

    @property
    def remove_outliers(self):
        """Gets the remove_outliers of this GoalAccumulationAllocation.  # noqa: E501

        If TRUE, remove outlying results  # noqa: E501

        :return: The remove_outliers of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: bool
        """
        return self._remove_outliers

    @remove_outliers.setter
    def remove_outliers(self, remove_outliers):
        """Sets the remove_outliers of this GoalAccumulationAllocation.

        If TRUE, remove outlying results  # noqa: E501

        :param remove_outliers: The remove_outliers of this GoalAccumulationAllocation.  # noqa: E501
        :type: bool
        """

        self._remove_outliers = remove_outliers

    @property
    def thresh_type(self):
        """Gets the thresh_type of this GoalAccumulationAllocation.  # noqa: E501

        The goal deviation threshold type  # noqa: E501

        :return: The thresh_type of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: str
        """
        return self._thresh_type

    @thresh_type.setter
    def thresh_type(self, thresh_type):
        """Sets the thresh_type of this GoalAccumulationAllocation.

        The goal deviation threshold type  # noqa: E501

        :param thresh_type: The thresh_type of this GoalAccumulationAllocation.  # noqa: E501
        :type: str
        """
        allowed_values = ["amnt", "perc"]  # noqa: E501
        if thresh_type not in allowed_values:
            raise ValueError(
                "Invalid value for `thresh_type` ({0}), must be one of {1}"  # noqa: E501
                .format(thresh_type, allowed_values)
            )

        self._thresh_type = thresh_type

    @property
    def thresh(self):
        """Gets the thresh of this GoalAccumulationAllocation.  # noqa: E501

        The goal deviation threshold value  # noqa: E501

        :return: The thresh of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: float
        """
        return self._thresh

    @thresh.setter
    def thresh(self, thresh):
        """Sets the thresh of this GoalAccumulationAllocation.

        The goal deviation threshold value  # noqa: E501

        :param thresh: The thresh of this GoalAccumulationAllocation.  # noqa: E501
        :type: float
        """
        if thresh is not None and thresh < 0:  # noqa: E501
            raise ValueError("Invalid value for `thresh`, must be a value greater than or equal to `0`")  # noqa: E501

        self._thresh = thresh

    @property
    def withdrawal_tax(self):
        """Gets the withdrawal_tax of this GoalAccumulationAllocation.  # noqa: E501

        The tax rate for withdrawals  # noqa: E501

        :return: The withdrawal_tax of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: float
        """
        return self._withdrawal_tax

    @withdrawal_tax.setter
    def withdrawal_tax(self, withdrawal_tax):
        """Sets the withdrawal_tax of this GoalAccumulationAllocation.

        The tax rate for withdrawals  # noqa: E501

        :param withdrawal_tax: The withdrawal_tax of this GoalAccumulationAllocation.  # noqa: E501
        :type: float
        """
        if withdrawal_tax is not None and withdrawal_tax >= 1:  # noqa: E501
            raise ValueError("Invalid value for `withdrawal_tax`, must be a value less than `1`")  # noqa: E501
        if withdrawal_tax is not None and withdrawal_tax < 0:  # noqa: E501
            raise ValueError("Invalid value for `withdrawal_tax`, must be a value greater than or equal to `0`")  # noqa: E501

        self._withdrawal_tax = withdrawal_tax

    @property
    def trading_days_per_year(self):
        """Gets the trading_days_per_year of this GoalAccumulationAllocation.  # noqa: E501

        Days per year a portfolio trades  # noqa: E501

        :return: The trading_days_per_year of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: int
        """
        return self._trading_days_per_year

    @trading_days_per_year.setter
    def trading_days_per_year(self, trading_days_per_year):
        """Sets the trading_days_per_year of this GoalAccumulationAllocation.

        Days per year a portfolio trades  # noqa: E501

        :param trading_days_per_year: The trading_days_per_year of this GoalAccumulationAllocation.  # noqa: E501
        :type: int
        """
        if trading_days_per_year is not None and trading_days_per_year > 365:  # noqa: E501
            raise ValueError("Invalid value for `trading_days_per_year`, must be a value less than or equal to `365`")  # noqa: E501
        if trading_days_per_year is not None and trading_days_per_year <= 0:  # noqa: E501
            raise ValueError("Invalid value for `trading_days_per_year`, must be a value greater than `0`")  # noqa: E501

        self._trading_days_per_year = trading_days_per_year

    @property
    def risk_score(self):
        """Gets the risk_score of this GoalAccumulationAllocation.  # noqa: E501

        The investor's risk score  # noqa: E501

        :return: The risk_score of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: int
        """
        return self._risk_score

    @risk_score.setter
    def risk_score(self, risk_score):
        """Sets the risk_score of this GoalAccumulationAllocation.

        The investor's risk score  # noqa: E501

        :param risk_score: The risk_score of this GoalAccumulationAllocation.  # noqa: E501
        :type: int
        """
        if risk_score is not None and risk_score > 100:  # noqa: E501
            raise ValueError("Invalid value for `risk_score`, must be a value less than or equal to `100`")  # noqa: E501
        if risk_score is not None and risk_score < 0:  # noqa: E501
            raise ValueError("Invalid value for `risk_score`, must be a value greater than or equal to `0`")  # noqa: E501

        self._risk_score = risk_score

    @property
    def adjust_for_compounding(self):
        """Gets the adjust_for_compounding of this GoalAccumulationAllocation.  # noqa: E501

        If true, adjust periodic deposit amounts for compounding based on compounding_rate. This applies when a deposit’s dep_frequency is shorter than horizon_frequency. Defaults to false.  # noqa: E501

        :return: The adjust_for_compounding of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: bool
        """
        return self._adjust_for_compounding

    @adjust_for_compounding.setter
    def adjust_for_compounding(self, adjust_for_compounding):
        """Sets the adjust_for_compounding of this GoalAccumulationAllocation.

        If true, adjust periodic deposit amounts for compounding based on compounding_rate. This applies when a deposit’s dep_frequency is shorter than horizon_frequency. Defaults to false.  # noqa: E501

        :param adjust_for_compounding: The adjust_for_compounding of this GoalAccumulationAllocation.  # noqa: E501
        :type: bool
        """

        self._adjust_for_compounding = adjust_for_compounding

    @property
    def compounding_rate(self):
        """Gets the compounding_rate of this GoalAccumulationAllocation.  # noqa: E501

        The annualized rate to use when approximating a compounding effect on deposits. This value must be defined and adjust_for_compounding must be true in order to activate compounding adjustment. Defaults to 0.  # noqa: E501

        :return: The compounding_rate of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: float
        """
        return self._compounding_rate

    @compounding_rate.setter
    def compounding_rate(self, compounding_rate):
        """Sets the compounding_rate of this GoalAccumulationAllocation.

        The annualized rate to use when approximating a compounding effect on deposits. This value must be defined and adjust_for_compounding must be true in order to activate compounding adjustment. Defaults to 0.  # noqa: E501

        :param compounding_rate: The compounding_rate of this GoalAccumulationAllocation.  # noqa: E501
        :type: float
        """

        self._compounding_rate = compounding_rate

    @property
    def use_proxy_data(self):
        """Gets the use_proxy_data of this GoalAccumulationAllocation.  # noqa: E501

        If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false.  # noqa: E501

        :return: The use_proxy_data of this GoalAccumulationAllocation.  # noqa: E501
        :rtype: bool
        """
        return self._use_proxy_data

    @use_proxy_data.setter
    def use_proxy_data(self, use_proxy_data):
        """Sets the use_proxy_data of this GoalAccumulationAllocation.

        If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false.  # noqa: E501

        :param use_proxy_data: The use_proxy_data of this GoalAccumulationAllocation.  # noqa: E501
        :type: bool
        """

        self._use_proxy_data = use_proxy_data

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
        if issubclass(GoalAccumulationAllocation, dict):
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
        if not isinstance(other, GoalAccumulationAllocation):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
