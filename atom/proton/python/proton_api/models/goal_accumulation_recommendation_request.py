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


class GoalAccumulationRecommendationRequest(object):
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
        'recommendation_config': 'RecommendationConfig1',
        'compounding_rate': 'float',
        'recommend_type': 'str',
        'create_log': 'bool',
        'goal_config': 'GoalConfig',
        'n': 'int',
        'p_risk': 'list[float]',
        'remove_outliers': 'bool',
        'adjust_for_compounding': 'bool',
        'goal_id': 'str',
        'conf_tgt': 'float',
        'trading_days_per_year': 'int',
        'thresh': 'float',
        'withdrawal_tax': 'float',
        'client_id': 'str',
        'thresh_type': 'str',
        'horizon_frequency': 'str',
        'horizon': 'int',
        'curr_inv': 'float',
        'deposit_config': 'list[AccumulationGoalDepositConfig]',
        'p_ret': 'list[float]'
    }

    attribute_map = {
        'recommendation_config': 'recommendation_config',
        'compounding_rate': 'compounding_rate',
        'recommend_type': 'recommend_type',
        'create_log': 'create_log',
        'goal_config': 'goal_config',
        'n': 'n',
        'p_risk': 'p_risk',
        'remove_outliers': 'remove_outliers',
        'adjust_for_compounding': 'adjust_for_compounding',
        'goal_id': 'goal_id',
        'conf_tgt': 'conf_tgt',
        'trading_days_per_year': 'trading_days_per_year',
        'thresh': 'thresh',
        'withdrawal_tax': 'withdrawal_tax',
        'client_id': 'client_id',
        'thresh_type': 'thresh_type',
        'horizon_frequency': 'horizon_frequency',
        'horizon': 'horizon',
        'curr_inv': 'curr_inv',
        'deposit_config': 'deposit_config',
        'p_ret': 'p_ret'
    }

    def __init__(self, recommendation_config=None, compounding_rate=0.0, recommend_type='horizon', create_log=False, goal_config=None, n=1000, p_risk=None, remove_outliers=True, adjust_for_compounding=False, goal_id=None, conf_tgt=0.9, trading_days_per_year=252, thresh=None, withdrawal_tax=0.0, client_id=None, thresh_type='perc', horizon_frequency='year', horizon=None, curr_inv=None, deposit_config=None, p_ret=None, _configuration=None):  # noqa: E501
        """GoalAccumulationRecommendationRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._recommendation_config = None
        self._compounding_rate = None
        self._recommend_type = None
        self._create_log = None
        self._goal_config = None
        self._n = None
        self._p_risk = None
        self._remove_outliers = None
        self._adjust_for_compounding = None
        self._goal_id = None
        self._conf_tgt = None
        self._trading_days_per_year = None
        self._thresh = None
        self._withdrawal_tax = None
        self._client_id = None
        self._thresh_type = None
        self._horizon_frequency = None
        self._horizon = None
        self._curr_inv = None
        self._deposit_config = None
        self._p_ret = None
        self.discriminator = None

        if recommendation_config is not None:
            self.recommendation_config = recommendation_config
        if compounding_rate is not None:
            self.compounding_rate = compounding_rate
        if recommend_type is not None:
            self.recommend_type = recommend_type
        if create_log is not None:
            self.create_log = create_log
        if goal_config is not None:
            self.goal_config = goal_config
        if n is not None:
            self.n = n
        self.p_risk = p_risk
        if remove_outliers is not None:
            self.remove_outliers = remove_outliers
        if adjust_for_compounding is not None:
            self.adjust_for_compounding = adjust_for_compounding
        if goal_id is not None:
            self.goal_id = goal_id
        if conf_tgt is not None:
            self.conf_tgt = conf_tgt
        if trading_days_per_year is not None:
            self.trading_days_per_year = trading_days_per_year
        if thresh is not None:
            self.thresh = thresh
        if withdrawal_tax is not None:
            self.withdrawal_tax = withdrawal_tax
        if client_id is not None:
            self.client_id = client_id
        if thresh_type is not None:
            self.thresh_type = thresh_type
        if horizon_frequency is not None:
            self.horizon_frequency = horizon_frequency
        if horizon is not None:
            self.horizon = horizon
        if curr_inv is not None:
            self.curr_inv = curr_inv
        if deposit_config is not None:
            self.deposit_config = deposit_config
        self.p_ret = p_ret

    @property
    def recommendation_config(self):
        """Gets the recommendation_config of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The recommendation_config of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: RecommendationConfig1
        """
        return self._recommendation_config

    @recommendation_config.setter
    def recommendation_config(self, recommendation_config):
        """Sets the recommendation_config of this GoalAccumulationRecommendationRequest.


        :param recommendation_config: The recommendation_config of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: RecommendationConfig1
        """

        self._recommendation_config = recommendation_config

    @property
    def compounding_rate(self):
        """Gets the compounding_rate of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The compounding_rate of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: float
        """
        return self._compounding_rate

    @compounding_rate.setter
    def compounding_rate(self, compounding_rate):
        """Sets the compounding_rate of this GoalAccumulationRecommendationRequest.


        :param compounding_rate: The compounding_rate of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                compounding_rate is not None and compounding_rate < -1):  # noqa: E501
            raise ValueError("Invalid value for `compounding_rate`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._compounding_rate = compounding_rate

    @property
    def recommend_type(self):
        """Gets the recommend_type of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The recommend_type of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: str
        """
        return self._recommend_type

    @recommend_type.setter
    def recommend_type(self, recommend_type):
        """Sets the recommend_type of this GoalAccumulationRecommendationRequest.


        :param recommend_type: The recommend_type of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["recurring", "one-time", "combo", "horizon"]  # noqa: E501
        if (self._configuration.client_side_validation and
                recommend_type not in allowed_values):
            raise ValueError(
                "Invalid value for `recommend_type` ({0}), must be one of {1}"  # noqa: E501
                .format(recommend_type, allowed_values)
            )

        self._recommend_type = recommend_type

    @property
    def create_log(self):
        """Gets the create_log of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The create_log of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: bool
        """
        return self._create_log

    @create_log.setter
    def create_log(self, create_log):
        """Sets the create_log of this GoalAccumulationRecommendationRequest.


        :param create_log: The create_log of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: bool
        """

        self._create_log = create_log

    @property
    def goal_config(self):
        """Gets the goal_config of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The goal_config of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: GoalConfig
        """
        return self._goal_config

    @goal_config.setter
    def goal_config(self, goal_config):
        """Sets the goal_config of this GoalAccumulationRecommendationRequest.


        :param goal_config: The goal_config of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: GoalConfig
        """

        self._goal_config = goal_config

    @property
    def n(self):
        """Gets the n of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The n of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: int
        """
        return self._n

    @n.setter
    def n(self, n):
        """Sets the n of this GoalAccumulationRecommendationRequest.


        :param n: The n of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: int
        """
        if (self._configuration.client_side_validation and
                n is not None and n > 10000):  # noqa: E501
            raise ValueError("Invalid value for `n`, must be a value less than or equal to `10000`")  # noqa: E501
        if (self._configuration.client_side_validation and
                n is not None and n < 1):  # noqa: E501
            raise ValueError("Invalid value for `n`, must be a value greater than or equal to `1`")  # noqa: E501

        self._n = n

    @property
    def p_risk(self):
        """Gets the p_risk of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The p_risk of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: list[float]
        """
        return self._p_risk

    @p_risk.setter
    def p_risk(self, p_risk):
        """Sets the p_risk of this GoalAccumulationRecommendationRequest.


        :param p_risk: The p_risk of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: list[float]
        """
        if self._configuration.client_side_validation and p_risk is None:
            raise ValueError("Invalid value for `p_risk`, must not be `None`")  # noqa: E501

        self._p_risk = p_risk

    @property
    def remove_outliers(self):
        """Gets the remove_outliers of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The remove_outliers of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: bool
        """
        return self._remove_outliers

    @remove_outliers.setter
    def remove_outliers(self, remove_outliers):
        """Sets the remove_outliers of this GoalAccumulationRecommendationRequest.


        :param remove_outliers: The remove_outliers of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: bool
        """

        self._remove_outliers = remove_outliers

    @property
    def adjust_for_compounding(self):
        """Gets the adjust_for_compounding of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The adjust_for_compounding of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: bool
        """
        return self._adjust_for_compounding

    @adjust_for_compounding.setter
    def adjust_for_compounding(self, adjust_for_compounding):
        """Sets the adjust_for_compounding of this GoalAccumulationRecommendationRequest.


        :param adjust_for_compounding: The adjust_for_compounding of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: bool
        """

        self._adjust_for_compounding = adjust_for_compounding

    @property
    def goal_id(self):
        """Gets the goal_id of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The goal_id of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: str
        """
        return self._goal_id

    @goal_id.setter
    def goal_id(self, goal_id):
        """Sets the goal_id of this GoalAccumulationRecommendationRequest.


        :param goal_id: The goal_id of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: str
        """

        self._goal_id = goal_id

    @property
    def conf_tgt(self):
        """Gets the conf_tgt of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The conf_tgt of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: float
        """
        return self._conf_tgt

    @conf_tgt.setter
    def conf_tgt(self, conf_tgt):
        """Sets the conf_tgt of this GoalAccumulationRecommendationRequest.


        :param conf_tgt: The conf_tgt of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                conf_tgt is not None and conf_tgt > 1):  # noqa: E501
            raise ValueError("Invalid value for `conf_tgt`, must be a value less than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                conf_tgt is not None and conf_tgt < 0):  # noqa: E501
            raise ValueError("Invalid value for `conf_tgt`, must be a value greater than or equal to `0`")  # noqa: E501

        self._conf_tgt = conf_tgt

    @property
    def trading_days_per_year(self):
        """Gets the trading_days_per_year of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The trading_days_per_year of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: int
        """
        return self._trading_days_per_year

    @trading_days_per_year.setter
    def trading_days_per_year(self, trading_days_per_year):
        """Sets the trading_days_per_year of this GoalAccumulationRecommendationRequest.


        :param trading_days_per_year: The trading_days_per_year of this GoalAccumulationRecommendationRequest.  # noqa: E501
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
    def thresh(self):
        """Gets the thresh of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The thresh of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: float
        """
        return self._thresh

    @thresh.setter
    def thresh(self, thresh):
        """Sets the thresh of this GoalAccumulationRecommendationRequest.


        :param thresh: The thresh of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                thresh is not None and thresh < 0):  # noqa: E501
            raise ValueError("Invalid value for `thresh`, must be a value greater than or equal to `0`")  # noqa: E501

        self._thresh = thresh

    @property
    def withdrawal_tax(self):
        """Gets the withdrawal_tax of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The withdrawal_tax of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: float
        """
        return self._withdrawal_tax

    @withdrawal_tax.setter
    def withdrawal_tax(self, withdrawal_tax):
        """Sets the withdrawal_tax of this GoalAccumulationRecommendationRequest.


        :param withdrawal_tax: The withdrawal_tax of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                withdrawal_tax is not None and withdrawal_tax > 1):  # noqa: E501
            raise ValueError("Invalid value for `withdrawal_tax`, must be a value less than or equal to `1`")  # noqa: E501
        if (self._configuration.client_side_validation and
                withdrawal_tax is not None and withdrawal_tax < 0):  # noqa: E501
            raise ValueError("Invalid value for `withdrawal_tax`, must be a value greater than or equal to `0`")  # noqa: E501

        self._withdrawal_tax = withdrawal_tax

    @property
    def client_id(self):
        """Gets the client_id of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The client_id of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this GoalAccumulationRecommendationRequest.


        :param client_id: The client_id of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def thresh_type(self):
        """Gets the thresh_type of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The thresh_type of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: str
        """
        return self._thresh_type

    @thresh_type.setter
    def thresh_type(self, thresh_type):
        """Sets the thresh_type of this GoalAccumulationRecommendationRequest.


        :param thresh_type: The thresh_type of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["amnt", "perc"]  # noqa: E501
        if (self._configuration.client_side_validation and
                thresh_type not in allowed_values):
            raise ValueError(
                "Invalid value for `thresh_type` ({0}), must be one of {1}"  # noqa: E501
                .format(thresh_type, allowed_values)
            )

        self._thresh_type = thresh_type

    @property
    def horizon_frequency(self):
        """Gets the horizon_frequency of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The horizon_frequency of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: str
        """
        return self._horizon_frequency

    @horizon_frequency.setter
    def horizon_frequency(self, horizon_frequency):
        """Sets the horizon_frequency of this GoalAccumulationRecommendationRequest.


        :param horizon_frequency: The horizon_frequency of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["year", "six_months", "quarter", "month", "two_weeks", "week", "day"]  # noqa: E501
        if (self._configuration.client_side_validation and
                horizon_frequency not in allowed_values):
            raise ValueError(
                "Invalid value for `horizon_frequency` ({0}), must be one of {1}"  # noqa: E501
                .format(horizon_frequency, allowed_values)
            )

        self._horizon_frequency = horizon_frequency

    @property
    def horizon(self):
        """Gets the horizon of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The horizon of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: int
        """
        return self._horizon

    @horizon.setter
    def horizon(self, horizon):
        """Sets the horizon of this GoalAccumulationRecommendationRequest.


        :param horizon: The horizon of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: int
        """
        if (self._configuration.client_side_validation and
                horizon is not None and horizon > 350):  # noqa: E501
            raise ValueError("Invalid value for `horizon`, must be a value less than or equal to `350`")  # noqa: E501
        if (self._configuration.client_side_validation and
                horizon is not None and horizon < 0):  # noqa: E501
            raise ValueError("Invalid value for `horizon`, must be a value greater than or equal to `0`")  # noqa: E501

        self._horizon = horizon

    @property
    def curr_inv(self):
        """Gets the curr_inv of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The curr_inv of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: float
        """
        return self._curr_inv

    @curr_inv.setter
    def curr_inv(self, curr_inv):
        """Sets the curr_inv of this GoalAccumulationRecommendationRequest.


        :param curr_inv: The curr_inv of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                curr_inv is not None and curr_inv < 0):  # noqa: E501
            raise ValueError("Invalid value for `curr_inv`, must be a value greater than or equal to `0`")  # noqa: E501

        self._curr_inv = curr_inv

    @property
    def deposit_config(self):
        """Gets the deposit_config of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The deposit_config of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: list[AccumulationGoalDepositConfig]
        """
        return self._deposit_config

    @deposit_config.setter
    def deposit_config(self, deposit_config):
        """Sets the deposit_config of this GoalAccumulationRecommendationRequest.


        :param deposit_config: The deposit_config of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: list[AccumulationGoalDepositConfig]
        """

        self._deposit_config = deposit_config

    @property
    def p_ret(self):
        """Gets the p_ret of this GoalAccumulationRecommendationRequest.  # noqa: E501


        :return: The p_ret of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :rtype: list[float]
        """
        return self._p_ret

    @p_ret.setter
    def p_ret(self, p_ret):
        """Sets the p_ret of this GoalAccumulationRecommendationRequest.


        :param p_ret: The p_ret of this GoalAccumulationRecommendationRequest.  # noqa: E501
        :type: list[float]
        """
        if self._configuration.client_side_validation and p_ret is None:
            raise ValueError("Invalid value for `p_ret`, must not be `None`")  # noqa: E501

        self._p_ret = p_ret

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
        if issubclass(GoalAccumulationRecommendationRequest, dict):
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
        if not isinstance(other, GoalAccumulationRecommendationRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, GoalAccumulationRecommendationRequest):
            return True

        return self.to_dict() != other.to_dict()
