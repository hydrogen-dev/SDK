# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class GoalTrack(object):
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
        'accounts': 'list[GoalTrackAccounts]',
        'accumulation_horizon': 'float',
        'client_id': 'str',
        'create_date': 'datetime',
        'current_investment': 'float',
        'decumulation_horizon': 'float',
        'goal_achievement_score': 'float',
        'goal_amount': 'float',
        'goal_id': 'str',
        'goal_probability': 'float',
        'id': 'str',
        'metadata': 'dict(str, str)',
        'on_track': 'bool',
        'progress': 'float',
        'projection_balance': 'float',
        'projection_date': 'date',
        'secondary_id': 'str',
        'status_time_stamp': 'datetime',
        'update_date': 'datetime'
    }

    attribute_map = {
        'accounts': 'accounts',
        'accumulation_horizon': 'accumulation_horizon',
        'client_id': 'client_id',
        'create_date': 'create_date',
        'current_investment': 'current_investment',
        'decumulation_horizon': 'decumulation_horizon',
        'goal_achievement_score': 'goal_achievement_score',
        'goal_amount': 'goal_amount',
        'goal_id': 'goal_id',
        'goal_probability': 'goal_probability',
        'id': 'id',
        'metadata': 'metadata',
        'on_track': 'on_track',
        'progress': 'progress',
        'projection_balance': 'projection_balance',
        'projection_date': 'projection_date',
        'secondary_id': 'secondary_id',
        'status_time_stamp': 'status_time_stamp',
        'update_date': 'update_date'
    }

    def __init__(self, accounts=None, accumulation_horizon=None, client_id=None, create_date=None, current_investment=None, decumulation_horizon=None, goal_achievement_score=None, goal_amount=None, goal_id=None, goal_probability=None, id=None, metadata=None, on_track=None, progress=None, projection_balance=None, projection_date=None, secondary_id=None, status_time_stamp=None, update_date=None, _configuration=None):  # noqa: E501
        """GoalTrack - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._accounts = None
        self._accumulation_horizon = None
        self._client_id = None
        self._create_date = None
        self._current_investment = None
        self._decumulation_horizon = None
        self._goal_achievement_score = None
        self._goal_amount = None
        self._goal_id = None
        self._goal_probability = None
        self._id = None
        self._metadata = None
        self._on_track = None
        self._progress = None
        self._projection_balance = None
        self._projection_date = None
        self._secondary_id = None
        self._status_time_stamp = None
        self._update_date = None
        self.discriminator = None

        if accounts is not None:
            self.accounts = accounts
        if accumulation_horizon is not None:
            self.accumulation_horizon = accumulation_horizon
        if client_id is not None:
            self.client_id = client_id
        if create_date is not None:
            self.create_date = create_date
        if current_investment is not None:
            self.current_investment = current_investment
        if decumulation_horizon is not None:
            self.decumulation_horizon = decumulation_horizon
        if goal_achievement_score is not None:
            self.goal_achievement_score = goal_achievement_score
        if goal_amount is not None:
            self.goal_amount = goal_amount
        self.goal_id = goal_id
        if goal_probability is not None:
            self.goal_probability = goal_probability
        if id is not None:
            self.id = id
        if metadata is not None:
            self.metadata = metadata
        if on_track is not None:
            self.on_track = on_track
        if progress is not None:
            self.progress = progress
        if projection_balance is not None:
            self.projection_balance = projection_balance
        if projection_date is not None:
            self.projection_date = projection_date
        if secondary_id is not None:
            self.secondary_id = secondary_id
        self.status_time_stamp = status_time_stamp
        if update_date is not None:
            self.update_date = update_date

    @property
    def accounts(self):
        """Gets the accounts of this GoalTrack.  # noqa: E501


        :return: The accounts of this GoalTrack.  # noqa: E501
        :rtype: list[GoalTrackAccounts]
        """
        return self._accounts

    @accounts.setter
    def accounts(self, accounts):
        """Sets the accounts of this GoalTrack.


        :param accounts: The accounts of this GoalTrack.  # noqa: E501
        :type: list[GoalTrackAccounts]
        """

        self._accounts = accounts

    @property
    def accumulation_horizon(self):
        """Gets the accumulation_horizon of this GoalTrack.  # noqa: E501

        accumulationHorizon  # noqa: E501

        :return: The accumulation_horizon of this GoalTrack.  # noqa: E501
        :rtype: float
        """
        return self._accumulation_horizon

    @accumulation_horizon.setter
    def accumulation_horizon(self, accumulation_horizon):
        """Sets the accumulation_horizon of this GoalTrack.

        accumulationHorizon  # noqa: E501

        :param accumulation_horizon: The accumulation_horizon of this GoalTrack.  # noqa: E501
        :type: float
        """

        self._accumulation_horizon = accumulation_horizon

    @property
    def client_id(self):
        """Gets the client_id of this GoalTrack.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this GoalTrack.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this GoalTrack.

        clientId  # noqa: E501

        :param client_id: The client_id of this GoalTrack.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def create_date(self):
        """Gets the create_date of this GoalTrack.  # noqa: E501


        :return: The create_date of this GoalTrack.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this GoalTrack.


        :param create_date: The create_date of this GoalTrack.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def current_investment(self):
        """Gets the current_investment of this GoalTrack.  # noqa: E501

        currentInvestment  # noqa: E501

        :return: The current_investment of this GoalTrack.  # noqa: E501
        :rtype: float
        """
        return self._current_investment

    @current_investment.setter
    def current_investment(self, current_investment):
        """Sets the current_investment of this GoalTrack.

        currentInvestment  # noqa: E501

        :param current_investment: The current_investment of this GoalTrack.  # noqa: E501
        :type: float
        """

        self._current_investment = current_investment

    @property
    def decumulation_horizon(self):
        """Gets the decumulation_horizon of this GoalTrack.  # noqa: E501

        decumulationHorizon  # noqa: E501

        :return: The decumulation_horizon of this GoalTrack.  # noqa: E501
        :rtype: float
        """
        return self._decumulation_horizon

    @decumulation_horizon.setter
    def decumulation_horizon(self, decumulation_horizon):
        """Sets the decumulation_horizon of this GoalTrack.

        decumulationHorizon  # noqa: E501

        :param decumulation_horizon: The decumulation_horizon of this GoalTrack.  # noqa: E501
        :type: float
        """

        self._decumulation_horizon = decumulation_horizon

    @property
    def goal_achievement_score(self):
        """Gets the goal_achievement_score of this GoalTrack.  # noqa: E501

        goalAchievementScore  # noqa: E501

        :return: The goal_achievement_score of this GoalTrack.  # noqa: E501
        :rtype: float
        """
        return self._goal_achievement_score

    @goal_achievement_score.setter
    def goal_achievement_score(self, goal_achievement_score):
        """Sets the goal_achievement_score of this GoalTrack.

        goalAchievementScore  # noqa: E501

        :param goal_achievement_score: The goal_achievement_score of this GoalTrack.  # noqa: E501
        :type: float
        """

        self._goal_achievement_score = goal_achievement_score

    @property
    def goal_amount(self):
        """Gets the goal_amount of this GoalTrack.  # noqa: E501

        goalAmount  # noqa: E501

        :return: The goal_amount of this GoalTrack.  # noqa: E501
        :rtype: float
        """
        return self._goal_amount

    @goal_amount.setter
    def goal_amount(self, goal_amount):
        """Sets the goal_amount of this GoalTrack.

        goalAmount  # noqa: E501

        :param goal_amount: The goal_amount of this GoalTrack.  # noqa: E501
        :type: float
        """

        self._goal_amount = goal_amount

    @property
    def goal_id(self):
        """Gets the goal_id of this GoalTrack.  # noqa: E501

        goalId  # noqa: E501

        :return: The goal_id of this GoalTrack.  # noqa: E501
        :rtype: str
        """
        return self._goal_id

    @goal_id.setter
    def goal_id(self, goal_id):
        """Sets the goal_id of this GoalTrack.

        goalId  # noqa: E501

        :param goal_id: The goal_id of this GoalTrack.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and goal_id is None:
            raise ValueError("Invalid value for `goal_id`, must not be `None`")  # noqa: E501

        self._goal_id = goal_id

    @property
    def goal_probability(self):
        """Gets the goal_probability of this GoalTrack.  # noqa: E501

        goalProbability  # noqa: E501

        :return: The goal_probability of this GoalTrack.  # noqa: E501
        :rtype: float
        """
        return self._goal_probability

    @goal_probability.setter
    def goal_probability(self, goal_probability):
        """Sets the goal_probability of this GoalTrack.

        goalProbability  # noqa: E501

        :param goal_probability: The goal_probability of this GoalTrack.  # noqa: E501
        :type: float
        """

        self._goal_probability = goal_probability

    @property
    def id(self):
        """Gets the id of this GoalTrack.  # noqa: E501


        :return: The id of this GoalTrack.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this GoalTrack.


        :param id: The id of this GoalTrack.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def metadata(self):
        """Gets the metadata of this GoalTrack.  # noqa: E501

        metadata  # noqa: E501

        :return: The metadata of this GoalTrack.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this GoalTrack.

        metadata  # noqa: E501

        :param metadata: The metadata of this GoalTrack.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def on_track(self):
        """Gets the on_track of this GoalTrack.  # noqa: E501

        onTrack  # noqa: E501

        :return: The on_track of this GoalTrack.  # noqa: E501
        :rtype: bool
        """
        return self._on_track

    @on_track.setter
    def on_track(self, on_track):
        """Sets the on_track of this GoalTrack.

        onTrack  # noqa: E501

        :param on_track: The on_track of this GoalTrack.  # noqa: E501
        :type: bool
        """

        self._on_track = on_track

    @property
    def progress(self):
        """Gets the progress of this GoalTrack.  # noqa: E501

        progress  # noqa: E501

        :return: The progress of this GoalTrack.  # noqa: E501
        :rtype: float
        """
        return self._progress

    @progress.setter
    def progress(self, progress):
        """Sets the progress of this GoalTrack.

        progress  # noqa: E501

        :param progress: The progress of this GoalTrack.  # noqa: E501
        :type: float
        """

        self._progress = progress

    @property
    def projection_balance(self):
        """Gets the projection_balance of this GoalTrack.  # noqa: E501

        projectionBalance  # noqa: E501

        :return: The projection_balance of this GoalTrack.  # noqa: E501
        :rtype: float
        """
        return self._projection_balance

    @projection_balance.setter
    def projection_balance(self, projection_balance):
        """Sets the projection_balance of this GoalTrack.

        projectionBalance  # noqa: E501

        :param projection_balance: The projection_balance of this GoalTrack.  # noqa: E501
        :type: float
        """

        self._projection_balance = projection_balance

    @property
    def projection_date(self):
        """Gets the projection_date of this GoalTrack.  # noqa: E501

        projectionDate  # noqa: E501

        :return: The projection_date of this GoalTrack.  # noqa: E501
        :rtype: date
        """
        return self._projection_date

    @projection_date.setter
    def projection_date(self, projection_date):
        """Sets the projection_date of this GoalTrack.

        projectionDate  # noqa: E501

        :param projection_date: The projection_date of this GoalTrack.  # noqa: E501
        :type: date
        """

        self._projection_date = projection_date

    @property
    def secondary_id(self):
        """Gets the secondary_id of this GoalTrack.  # noqa: E501


        :return: The secondary_id of this GoalTrack.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this GoalTrack.


        :param secondary_id: The secondary_id of this GoalTrack.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def status_time_stamp(self):
        """Gets the status_time_stamp of this GoalTrack.  # noqa: E501

        statusTimeStamp  # noqa: E501

        :return: The status_time_stamp of this GoalTrack.  # noqa: E501
        :rtype: datetime
        """
        return self._status_time_stamp

    @status_time_stamp.setter
    def status_time_stamp(self, status_time_stamp):
        """Sets the status_time_stamp of this GoalTrack.

        statusTimeStamp  # noqa: E501

        :param status_time_stamp: The status_time_stamp of this GoalTrack.  # noqa: E501
        :type: datetime
        """
        if self._configuration.client_side_validation and status_time_stamp is None:
            raise ValueError("Invalid value for `status_time_stamp`, must not be `None`")  # noqa: E501

        self._status_time_stamp = status_time_stamp

    @property
    def update_date(self):
        """Gets the update_date of this GoalTrack.  # noqa: E501


        :return: The update_date of this GoalTrack.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this GoalTrack.


        :param update_date: The update_date of this GoalTrack.  # noqa: E501
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
        if issubclass(GoalTrack, dict):
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
        if not isinstance(other, GoalTrack):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, GoalTrack):
            return True

        return self.to_dict() != other.to_dict()
