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

from atom_api.models.create_consultation_response import CreateConsultationResponse  # noqa: F401,E501
from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class SpecificConsultationResponse(object):
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
        'id': 'str',
        'create_date': 'str',
        'account_type_id': 'str',
        'additional_questions': 'str',
        'assets': 'str',
        'assigned': 'str',
        'calendar': 'bool',
        'category': 'str',
        'comments': 'str',
        'client_id': 'str',
        'time': 'date',
        'close_time': 'date',
        'closed_by': 'str',
        'completed': 'bool',
        'name': 'str',
        'email': 'str',
        'firmname': 'str',
        'phone': 'str',
        'investment_allocation': 'str',
        'investment_location': 'str',
        'investment_objectives': 'str',
        'is_active': 'bool',
        'reminded': 'bool',
        'source': 'str',
        'secondary_id': 'SecondaryId',
        'update_date': 'str'
    }

    attribute_map = {
        'id': 'id',
        'create_date': 'create_date',
        'account_type_id': 'account_type_id',
        'additional_questions': 'additional_questions',
        'assets': 'assets',
        'assigned': 'assigned',
        'calendar': 'calendar',
        'category': 'category',
        'comments': 'comments',
        'client_id': 'client_id',
        'time': 'time',
        'close_time': 'close_time',
        'closed_by': 'closed_by',
        'completed': 'completed',
        'name': 'name',
        'email': 'email',
        'firmname': 'firmname',
        'phone': 'phone',
        'investment_allocation': 'investment_allocation',
        'investment_location': 'investment_location',
        'investment_objectives': 'investment_objectives',
        'is_active': 'is_active',
        'reminded': 'reminded',
        'source': 'source',
        'secondary_id': 'secondary_id',
        'update_date': 'update_date'
    }

    def __init__(self, id=None, create_date=None, account_type_id=None, additional_questions=None, assets=None, assigned=None, calendar=False, category=None, comments=None, client_id=None, time=None, close_time=None, closed_by=None, completed=False, name=None, email=None, firmname=None, phone=None, investment_allocation=None, investment_location=None, investment_objectives=None, is_active=True, reminded=False, source=None, secondary_id=None, update_date=None):  # noqa: E501
        """SpecificConsultationResponse - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._create_date = None
        self._account_type_id = None
        self._additional_questions = None
        self._assets = None
        self._assigned = None
        self._calendar = None
        self._category = None
        self._comments = None
        self._client_id = None
        self._time = None
        self._close_time = None
        self._closed_by = None
        self._completed = None
        self._name = None
        self._email = None
        self._firmname = None
        self._phone = None
        self._investment_allocation = None
        self._investment_location = None
        self._investment_objectives = None
        self._is_active = None
        self._reminded = None
        self._source = None
        self._secondary_id = None
        self._update_date = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if create_date is not None:
            self.create_date = create_date
        if account_type_id is not None:
            self.account_type_id = account_type_id
        if additional_questions is not None:
            self.additional_questions = additional_questions
        if assets is not None:
            self.assets = assets
        if assigned is not None:
            self.assigned = assigned
        if calendar is not None:
            self.calendar = calendar
        if category is not None:
            self.category = category
        if comments is not None:
            self.comments = comments
        if client_id is not None:
            self.client_id = client_id
        if time is not None:
            self.time = time
        if close_time is not None:
            self.close_time = close_time
        if closed_by is not None:
            self.closed_by = closed_by
        if completed is not None:
            self.completed = completed
        if name is not None:
            self.name = name
        if email is not None:
            self.email = email
        if firmname is not None:
            self.firmname = firmname
        if phone is not None:
            self.phone = phone
        if investment_allocation is not None:
            self.investment_allocation = investment_allocation
        if investment_location is not None:
            self.investment_location = investment_location
        if investment_objectives is not None:
            self.investment_objectives = investment_objectives
        if is_active is not None:
            self.is_active = is_active
        if reminded is not None:
            self.reminded = reminded
        if source is not None:
            self.source = source
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def id(self):
        """Gets the id of this SpecificConsultationResponse.  # noqa: E501

        The ID of the consultation request  # noqa: E501

        :return: The id of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this SpecificConsultationResponse.

        The ID of the consultation request  # noqa: E501

        :param id: The id of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def create_date(self):
        """Gets the create_date of this SpecificConsultationResponse.  # noqa: E501

        Datetime the consultation request was created  # noqa: E501

        :return: The create_date of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this SpecificConsultationResponse.

        Datetime the consultation request was created  # noqa: E501

        :param create_date: The create_date of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._create_date = create_date

    @property
    def account_type_id(self):
        """Gets the account_type_id of this SpecificConsultationResponse.  # noqa: E501

        The ID of the account type for the account of the client who submitted the request  # noqa: E501

        :return: The account_type_id of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._account_type_id

    @account_type_id.setter
    def account_type_id(self, account_type_id):
        """Sets the account_type_id of this SpecificConsultationResponse.

        The ID of the account type for the account of the client who submitted the request  # noqa: E501

        :param account_type_id: The account_type_id of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._account_type_id = account_type_id

    @property
    def additional_questions(self):
        """Gets the additional_questions of this SpecificConsultationResponse.  # noqa: E501

        Any additional questions to be answered during the consultation  # noqa: E501

        :return: The additional_questions of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._additional_questions

    @additional_questions.setter
    def additional_questions(self, additional_questions):
        """Sets the additional_questions of this SpecificConsultationResponse.

        Any additional questions to be answered during the consultation  # noqa: E501

        :param additional_questions: The additional_questions of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._additional_questions = additional_questions

    @property
    def assets(self):
        """Gets the assets of this SpecificConsultationResponse.  # noqa: E501

        Asset value for a client’s account  # noqa: E501

        :return: The assets of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._assets

    @assets.setter
    def assets(self, assets):
        """Sets the assets of this SpecificConsultationResponse.

        Asset value for a client’s account  # noqa: E501

        :param assets: The assets of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._assets = assets

    @property
    def assigned(self):
        """Gets the assigned of this SpecificConsultationResponse.  # noqa: E501

        Internal user to whom the request is assigned  # noqa: E501

        :return: The assigned of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._assigned

    @assigned.setter
    def assigned(self, assigned):
        """Sets the assigned of this SpecificConsultationResponse.

        Internal user to whom the request is assigned  # noqa: E501

        :param assigned: The assigned of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._assigned = assigned

    @property
    def calendar(self):
        """Gets the calendar of this SpecificConsultationResponse.  # noqa: E501

        Indicates if the request is scheduled on the calendar. Defaults to false which indicates it has not been scheduled  # noqa: E501

        :return: The calendar of this SpecificConsultationResponse.  # noqa: E501
        :rtype: bool
        """
        return self._calendar

    @calendar.setter
    def calendar(self, calendar):
        """Sets the calendar of this SpecificConsultationResponse.

        Indicates if the request is scheduled on the calendar. Defaults to false which indicates it has not been scheduled  # noqa: E501

        :param calendar: The calendar of this SpecificConsultationResponse.  # noqa: E501
        :type: bool
        """

        self._calendar = calendar

    @property
    def category(self):
        """Gets the category of this SpecificConsultationResponse.  # noqa: E501

        Category for the purpose of the request such as “New Account”  # noqa: E501

        :return: The category of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this SpecificConsultationResponse.

        Category for the purpose of the request such as “New Account”  # noqa: E501

        :param category: The category of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._category = category

    @property
    def comments(self):
        """Gets the comments of this SpecificConsultationResponse.  # noqa: E501

        Additional information on the purpose of the request such as “Would like to open a new account”  # noqa: E501

        :return: The comments of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._comments

    @comments.setter
    def comments(self, comments):
        """Sets the comments of this SpecificConsultationResponse.

        Additional information on the purpose of the request such as “Would like to open a new account”  # noqa: E501

        :param comments: The comments of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._comments = comments

    @property
    def client_id(self):
        """Gets the client_id of this SpecificConsultationResponse.  # noqa: E501

        The ID for the client that submitted the request  # noqa: E501

        :return: The client_id of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this SpecificConsultationResponse.

        The ID for the client that submitted the request  # noqa: E501

        :param client_id: The client_id of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def time(self):
        """Gets the time of this SpecificConsultationResponse.  # noqa: E501

        Date that the consultation is scheduled  # noqa: E501

        :return: The time of this SpecificConsultationResponse.  # noqa: E501
        :rtype: date
        """
        return self._time

    @time.setter
    def time(self, time):
        """Sets the time of this SpecificConsultationResponse.

        Date that the consultation is scheduled  # noqa: E501

        :param time: The time of this SpecificConsultationResponse.  # noqa: E501
        :type: date
        """

        self._time = time

    @property
    def close_time(self):
        """Gets the close_time of this SpecificConsultationResponse.  # noqa: E501

        Date that the consultation request has been resolved and closed  # noqa: E501

        :return: The close_time of this SpecificConsultationResponse.  # noqa: E501
        :rtype: date
        """
        return self._close_time

    @close_time.setter
    def close_time(self, close_time):
        """Sets the close_time of this SpecificConsultationResponse.

        Date that the consultation request has been resolved and closed  # noqa: E501

        :param close_time: The close_time of this SpecificConsultationResponse.  # noqa: E501
        :type: date
        """

        self._close_time = close_time

    @property
    def closed_by(self):
        """Gets the closed_by of this SpecificConsultationResponse.  # noqa: E501

        Internal user that has resolved and closed the consultation request  # noqa: E501

        :return: The closed_by of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._closed_by

    @closed_by.setter
    def closed_by(self, closed_by):
        """Sets the closed_by of this SpecificConsultationResponse.

        Internal user that has resolved and closed the consultation request  # noqa: E501

        :param closed_by: The closed_by of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._closed_by = closed_by

    @property
    def completed(self):
        """Gets the completed of this SpecificConsultationResponse.  # noqa: E501

        Indicates if the consultation request has been resolved and closed. Defaults to false which indicates it has not been closed  # noqa: E501

        :return: The completed of this SpecificConsultationResponse.  # noqa: E501
        :rtype: bool
        """
        return self._completed

    @completed.setter
    def completed(self, completed):
        """Sets the completed of this SpecificConsultationResponse.

        Indicates if the consultation request has been resolved and closed. Defaults to false which indicates it has not been closed  # noqa: E501

        :param completed: The completed of this SpecificConsultationResponse.  # noqa: E501
        :type: bool
        """

        self._completed = completed

    @property
    def name(self):
        """Gets the name of this SpecificConsultationResponse.  # noqa: E501

        Name of the client that submitted the request  # noqa: E501

        :return: The name of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this SpecificConsultationResponse.

        Name of the client that submitted the request  # noqa: E501

        :param name: The name of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def email(self):
        """Gets the email of this SpecificConsultationResponse.  # noqa: E501

        Contact email or the client in the format sample@example.com  # noqa: E501

        :return: The email of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this SpecificConsultationResponse.

        Contact email or the client in the format sample@example.com  # noqa: E501

        :param email: The email of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def firmname(self):
        """Gets the firmname of this SpecificConsultationResponse.  # noqa: E501

        Firm name for the client’s firm  # noqa: E501

        :return: The firmname of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._firmname

    @firmname.setter
    def firmname(self, firmname):
        """Sets the firmname of this SpecificConsultationResponse.

        Firm name for the client’s firm  # noqa: E501

        :param firmname: The firmname of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._firmname = firmname

    @property
    def phone(self):
        """Gets the phone of this SpecificConsultationResponse.  # noqa: E501

        Contact phone number for the client  # noqa: E501

        :return: The phone of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """Sets the phone of this SpecificConsultationResponse.

        Contact phone number for the client  # noqa: E501

        :param phone: The phone of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._phone = phone

    @property
    def investment_allocation(self):
        """Gets the investment_allocation of this SpecificConsultationResponse.  # noqa: E501

        The type of investment allocation with which the client is associated  # noqa: E501

        :return: The investment_allocation of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._investment_allocation

    @investment_allocation.setter
    def investment_allocation(self, investment_allocation):
        """Sets the investment_allocation of this SpecificConsultationResponse.

        The type of investment allocation with which the client is associated  # noqa: E501

        :param investment_allocation: The investment_allocation of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._investment_allocation = investment_allocation

    @property
    def investment_location(self):
        """Gets the investment_location of this SpecificConsultationResponse.  # noqa: E501

        Description of the location of the client’s investments  # noqa: E501

        :return: The investment_location of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._investment_location

    @investment_location.setter
    def investment_location(self, investment_location):
        """Sets the investment_location of this SpecificConsultationResponse.

        Description of the location of the client’s investments  # noqa: E501

        :param investment_location: The investment_location of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._investment_location = investment_location

    @property
    def investment_objectives(self):
        """Gets the investment_objectives of this SpecificConsultationResponse.  # noqa: E501

        Brief information on the client’s investment objectives  # noqa: E501

        :return: The investment_objectives of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._investment_objectives

    @investment_objectives.setter
    def investment_objectives(self, investment_objectives):
        """Sets the investment_objectives of this SpecificConsultationResponse.

        Brief information on the client’s investment objectives  # noqa: E501

        :param investment_objectives: The investment_objectives of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._investment_objectives = investment_objectives

    @property
    def is_active(self):
        """Gets the is_active of this SpecificConsultationResponse.  # noqa: E501

        Indicates if the consultation request is active. Defaults to true which indicates it is active  # noqa: E501

        :return: The is_active of this SpecificConsultationResponse.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this SpecificConsultationResponse.

        Indicates if the consultation request is active. Defaults to true which indicates it is active  # noqa: E501

        :param is_active: The is_active of this SpecificConsultationResponse.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def reminded(self):
        """Gets the reminded of this SpecificConsultationResponse.  # noqa: E501

        Indicates if a reminder of the consultation was sent to the client. Defaults to false which indicates it has not been sent  # noqa: E501

        :return: The reminded of this SpecificConsultationResponse.  # noqa: E501
        :rtype: bool
        """
        return self._reminded

    @reminded.setter
    def reminded(self, reminded):
        """Sets the reminded of this SpecificConsultationResponse.

        Indicates if a reminder of the consultation was sent to the client. Defaults to false which indicates it has not been sent  # noqa: E501

        :param reminded: The reminded of this SpecificConsultationResponse.  # noqa: E501
        :type: bool
        """

        self._reminded = reminded

    @property
    def source(self):
        """Gets the source of this SpecificConsultationResponse.  # noqa: E501

        Information on how the client has requested the consultation  # noqa: E501

        :return: The source of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source):
        """Sets the source of this SpecificConsultationResponse.

        Information on how the client has requested the consultation  # noqa: E501

        :param source: The source of this SpecificConsultationResponse.  # noqa: E501
        :type: str
        """

        self._source = source

    @property
    def secondary_id(self):
        """Gets the secondary_id of this SpecificConsultationResponse.  # noqa: E501


        :return: The secondary_id of this SpecificConsultationResponse.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this SpecificConsultationResponse.


        :param secondary_id: The secondary_id of this SpecificConsultationResponse.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def update_date(self):
        """Gets the update_date of this SpecificConsultationResponse.  # noqa: E501

        Datetime the consultation request was last updated  # noqa: E501

        :return: The update_date of this SpecificConsultationResponse.  # noqa: E501
        :rtype: str
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this SpecificConsultationResponse.

        Datetime the consultation request was last updated  # noqa: E501

        :param update_date: The update_date of this SpecificConsultationResponse.  # noqa: E501
        :type: str
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
        if issubclass(SpecificConsultationResponse, dict):
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
        if not isinstance(other, SpecificConsultationResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
