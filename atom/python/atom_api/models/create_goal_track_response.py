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

from atom_api.models.goal_track_payload import GoalTrackPayload  # noqa: F401,E501
from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class CreateGoalTrackResponse(object):
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
        'goal_id': 'str',
        'client_id': 'str',
        'goal_amount': 'float',
        'accumulation_horizon': 'float',
        'decumulation_horizon': 'float',
        'accounts': 'list[str]',
        'current_investment': 'float',
        'on_track': 'bool',
        'progress': 'float',
        'goal_probability': 'float',
        'goal_achievement_score': 'float',
        'projection_balance': 'float',
        'projection_date': 'date',
        'status_time_stamp': 'str',
        'metadata': 'object',
        'secondary_id': 'SecondaryId',
        'id': 'str',
        'create_date': 'str'
    }

    attribute_map = {
        'goal_id': 'goal_id',
        'client_id': 'client_id',
        'goal_amount': 'goal_amount',
        'accumulation_horizon': 'accumulation_horizon',
        'decumulation_horizon': 'decumulation_horizon',
        'accounts': 'accounts',
        'current_investment': 'current_investment',
        'on_track': 'on_track',
        'progress': 'progress',
        'goal_probability': 'goal_probability',
        'goal_achievement_score': 'goal_achievement_score',
        'projection_balance': 'projection_balance',
        'projection_date': 'projection_date',
        'status_time_stamp': 'status_time_stamp',
        'metadata': 'metadata',
        'secondary_id': 'secondary_id',
        'id': 'id',
        'create_date': 'create_date'
    }

    def __init__(self, goal_id=None, client_id=None, goal_amount=None, accumulation_horizon=None, decumulation_horizon=None, accounts=None, current_investment=None, on_track=None, progress=None, goal_probability=None, goal_achievement_score=None, projection_balance=None, projection_date=None, status_time_stamp=None, metadata=None, secondary_id=None, id=None, create_date=None):  # noqa: E501
        """CreateGoalTrackResponse - a model defined in Swagger"""  # noqa: E501

        self._goal_id = None
        self._client_id = None
        self._goal_amount = None
        self._accumulation_horizon = None
        self._decumulation_horizon = None
        self._accounts = None
        self._current_investment = None
        self._on_track = None
        self._progress = None
        self._goal_probability = None
        self._goal_achievement_score = None
        self._projection_balance = None
        self._projection_date = None
        self._status_time_stamp = None
        self._metadata = None
        self._secondary_id = None
        self._id = None
        self._create_date = None
        self.discriminator = None

        self.goal_id = goal_id
        if client_id is not None:
            self.client_id = client_id
        if goal_amount is not None:
            self.goal_amount = goal_amount
        if accumulation_horizon is not None:
            self.accumulation_horizon = accumulation_horizon
        if decumulation_horizon is not None:
            self.decumulation_horizon = decumulation_horizon
        if accounts is not None:
            self.accounts = accounts
        if current_investment is not None:
            self.current_investment = current_investment
        if on_track is not None:
            self.on_track = on_track
        if progress is not None:
            self.progress = progress
        if goal_probability is not None:
            self.goal_probability = goal_probability
        if goal_achievement_score is not None:
            self.goal_achievement_score = goal_achievement_score
        if projection_balance is not None:
            self.projection_balance = projection_balance
        if projection_date is not None:
            self.projection_date = projection_date
        if status_time_stamp is not None:
            self.status_time_stamp = status_time_stamp
        if metadata is not None:
            self.metadata = metadata
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if id is not None:
            self.id = id
        if create_date is not None:
            self.create_date = create_date

    @property
    def goal_id(self):
        """Gets the goal_id of this CreateGoalTrackResponse.  # noqa: E501

        The ID of a goal to which the goal track record pertains  # noqa: E501

        :return: The goal_id of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: str
        """
        return self._goal_id

    @goal_id.setter
    def goal_id(self, goal_id):
        """Sets the goal_id of this CreateGoalTrackResponse.

        The ID of a goal to which the goal track record pertains  # noqa: E501

        :param goal_id: The goal_id of this CreateGoalTrackResponse.  # noqa: E501
        :type: str
        """
        if goal_id is None:
            raise ValueError("Invalid value for `goal_id`, must not be `None`")  # noqa: E501

        self._goal_id = goal_id

    @property
    def client_id(self):
        """Gets the client_id of this CreateGoalTrackResponse.  # noqa: E501

        The ID of a client to whom the goal for the goal track record belongs  # noqa: E501

        :return: The client_id of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this CreateGoalTrackResponse.

        The ID of a client to whom the goal for the goal track record belongs  # noqa: E501

        :param client_id: The client_id of this CreateGoalTrackResponse.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def goal_amount(self):
        """Gets the goal_amount of this CreateGoalTrackResponse.  # noqa: E501

        Target amount for the goal  # noqa: E501

        :return: The goal_amount of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: float
        """
        return self._goal_amount

    @goal_amount.setter
    def goal_amount(self, goal_amount):
        """Sets the goal_amount of this CreateGoalTrackResponse.

        Target amount for the goal  # noqa: E501

        :param goal_amount: The goal_amount of this CreateGoalTrackResponse.  # noqa: E501
        :type: float
        """

        self._goal_amount = goal_amount

    @property
    def accumulation_horizon(self):
        """Gets the accumulation_horizon of this CreateGoalTrackResponse.  # noqa: E501

        The time horizon of the goal during the accumulation phase, in years  # noqa: E501

        :return: The accumulation_horizon of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: float
        """
        return self._accumulation_horizon

    @accumulation_horizon.setter
    def accumulation_horizon(self, accumulation_horizon):
        """Sets the accumulation_horizon of this CreateGoalTrackResponse.

        The time horizon of the goal during the accumulation phase, in years  # noqa: E501

        :param accumulation_horizon: The accumulation_horizon of this CreateGoalTrackResponse.  # noqa: E501
        :type: float
        """

        self._accumulation_horizon = accumulation_horizon

    @property
    def decumulation_horizon(self):
        """Gets the decumulation_horizon of this CreateGoalTrackResponse.  # noqa: E501

        The time horizon of the goal during the decumulation phase, in years  # noqa: E501

        :return: The decumulation_horizon of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: float
        """
        return self._decumulation_horizon

    @decumulation_horizon.setter
    def decumulation_horizon(self, decumulation_horizon):
        """Sets the decumulation_horizon of this CreateGoalTrackResponse.

        The time horizon of the goal during the decumulation phase, in years  # noqa: E501

        :param decumulation_horizon: The decumulation_horizon of this CreateGoalTrackResponse.  # noqa: E501
        :type: float
        """

        self._decumulation_horizon = decumulation_horizon

    @property
    def accounts(self):
        """Gets the accounts of this CreateGoalTrackResponse.  # noqa: E501

        List of accounts linked to the goal  # noqa: E501

        :return: The accounts of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: list[str]
        """
        return self._accounts

    @accounts.setter
    def accounts(self, accounts):
        """Sets the accounts of this CreateGoalTrackResponse.

        List of accounts linked to the goal  # noqa: E501

        :param accounts: The accounts of this CreateGoalTrackResponse.  # noqa: E501
        :type: list[str]
        """

        self._accounts = accounts

    @property
    def current_investment(self):
        """Gets the current_investment of this CreateGoalTrackResponse.  # noqa: E501

        The current amount invested toward the goal  # noqa: E501

        :return: The current_investment of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: float
        """
        return self._current_investment

    @current_investment.setter
    def current_investment(self, current_investment):
        """Sets the current_investment of this CreateGoalTrackResponse.

        The current amount invested toward the goal  # noqa: E501

        :param current_investment: The current_investment of this CreateGoalTrackResponse.  # noqa: E501
        :type: float
        """

        self._current_investment = current_investment

    @property
    def on_track(self):
        """Gets the on_track of this CreateGoalTrackResponse.  # noqa: E501

        Indicator for whether or not the goal is on track to be met. true indicates it is on track (no default)  # noqa: E501

        :return: The on_track of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: bool
        """
        return self._on_track

    @on_track.setter
    def on_track(self, on_track):
        """Sets the on_track of this CreateGoalTrackResponse.

        Indicator for whether or not the goal is on track to be met. true indicates it is on track (no default)  # noqa: E501

        :param on_track: The on_track of this CreateGoalTrackResponse.  # noqa: E501
        :type: bool
        """

        self._on_track = on_track

    @property
    def progress(self):
        """Gets the progress of this CreateGoalTrackResponse.  # noqa: E501

        The goal progress percentage as a decimal  # noqa: E501

        :return: The progress of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: float
        """
        return self._progress

    @progress.setter
    def progress(self, progress):
        """Sets the progress of this CreateGoalTrackResponse.

        The goal progress percentage as a decimal  # noqa: E501

        :param progress: The progress of this CreateGoalTrackResponse.  # noqa: E501
        :type: float
        """

        self._progress = progress

    @property
    def goal_probability(self):
        """Gets the goal_probability of this CreateGoalTrackResponse.  # noqa: E501

        The probability of achieving the goal with the client’s given investments  # noqa: E501

        :return: The goal_probability of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: float
        """
        return self._goal_probability

    @goal_probability.setter
    def goal_probability(self, goal_probability):
        """Sets the goal_probability of this CreateGoalTrackResponse.

        The probability of achieving the goal with the client’s given investments  # noqa: E501

        :param goal_probability: The goal_probability of this CreateGoalTrackResponse.  # noqa: E501
        :type: float
        """

        self._goal_probability = goal_probability

    @property
    def goal_achievement_score(self):
        """Gets the goal_achievement_score of this CreateGoalTrackResponse.  # noqa: E501

        Probability of achieving the goal in relation to the confidence target of a simulation  # noqa: E501

        :return: The goal_achievement_score of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: float
        """
        return self._goal_achievement_score

    @goal_achievement_score.setter
    def goal_achievement_score(self, goal_achievement_score):
        """Sets the goal_achievement_score of this CreateGoalTrackResponse.

        Probability of achieving the goal in relation to the confidence target of a simulation  # noqa: E501

        :param goal_achievement_score: The goal_achievement_score of this CreateGoalTrackResponse.  # noqa: E501
        :type: float
        """

        self._goal_achievement_score = goal_achievement_score

    @property
    def projection_balance(self):
        """Gets the projection_balance of this CreateGoalTrackResponse.  # noqa: E501

        The projected balance of the goal  # noqa: E501

        :return: The projection_balance of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: float
        """
        return self._projection_balance

    @projection_balance.setter
    def projection_balance(self, projection_balance):
        """Sets the projection_balance of this CreateGoalTrackResponse.

        The projected balance of the goal  # noqa: E501

        :param projection_balance: The projection_balance of this CreateGoalTrackResponse.  # noqa: E501
        :type: float
        """

        self._projection_balance = projection_balance

    @property
    def projection_date(self):
        """Gets the projection_date of this CreateGoalTrackResponse.  # noqa: E501

        The date of the projected balance of the goal  # noqa: E501

        :return: The projection_date of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: date
        """
        return self._projection_date

    @projection_date.setter
    def projection_date(self, projection_date):
        """Sets the projection_date of this CreateGoalTrackResponse.

        The date of the projected balance of the goal  # noqa: E501

        :param projection_date: The projection_date of this CreateGoalTrackResponse.  # noqa: E501
        :type: date
        """

        self._projection_date = projection_date

    @property
    def status_time_stamp(self):
        """Gets the status_time_stamp of this CreateGoalTrackResponse.  # noqa: E501

        Date and time to which this goal track record applies, defaults to the current timestamp  # noqa: E501

        :return: The status_time_stamp of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: str
        """
        return self._status_time_stamp

    @status_time_stamp.setter
    def status_time_stamp(self, status_time_stamp):
        """Sets the status_time_stamp of this CreateGoalTrackResponse.

        Date and time to which this goal track record applies, defaults to the current timestamp  # noqa: E501

        :param status_time_stamp: The status_time_stamp of this CreateGoalTrackResponse.  # noqa: E501
        :type: str
        """

        self._status_time_stamp = status_time_stamp

    @property
    def metadata(self):
        """Gets the metadata of this CreateGoalTrackResponse.  # noqa: E501

        Custom information associated with the goal track record in the format key:value  # noqa: E501

        :return: The metadata of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this CreateGoalTrackResponse.

        Custom information associated with the goal track record in the format key:value  # noqa: E501

        :param metadata: The metadata of this CreateGoalTrackResponse.  # noqa: E501
        :type: object
        """

        self._metadata = metadata

    @property
    def secondary_id(self):
        """Gets the secondary_id of this CreateGoalTrackResponse.  # noqa: E501


        :return: The secondary_id of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this CreateGoalTrackResponse.


        :param secondary_id: The secondary_id of this CreateGoalTrackResponse.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def id(self):
        """Gets the id of this CreateGoalTrackResponse.  # noqa: E501

        ID of the goal track record  # noqa: E501

        :return: The id of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CreateGoalTrackResponse.

        ID of the goal track record  # noqa: E501

        :param id: The id of this CreateGoalTrackResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def create_date(self):
        """Gets the create_date of this CreateGoalTrackResponse.  # noqa: E501

        Datetime the goal track record was created  # noqa: E501

        :return: The create_date of this CreateGoalTrackResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this CreateGoalTrackResponse.

        Datetime the goal track record was created  # noqa: E501

        :param create_date: The create_date of this CreateGoalTrackResponse.  # noqa: E501
        :type: str
        """

        self._create_date = create_date

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
        if issubclass(CreateGoalTrackResponse, dict):
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
        if not isinstance(other, CreateGoalTrackResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
