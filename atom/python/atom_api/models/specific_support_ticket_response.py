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

from atom_api.models.create_support_ticket_response import CreateSupportTicketResponse  # noqa: F401,E501
from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class SpecificSupportTicketResponse(object):
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
        'description': 'str',
        'client_id': 'str',
        'account_id': 'str',
        'open_time': 'date',
        'close_time': 'date',
        'assigned_to': 'str',
        'status': 'str',
        'subject': 'str',
        'secondary_id': 'SecondaryId',
        'metadata': 'object',
        'update_date': 'str'
    }

    attribute_map = {
        'id': 'id',
        'create_date': 'create_date',
        'description': 'description',
        'client_id': 'client_id',
        'account_id': 'account_id',
        'open_time': 'open_time',
        'close_time': 'close_time',
        'assigned_to': 'assigned_to',
        'status': 'status',
        'subject': 'subject',
        'secondary_id': 'secondary_id',
        'metadata': 'metadata',
        'update_date': 'update_date'
    }

    def __init__(self, id=None, create_date=None, description=None, client_id=None, account_id=None, open_time=None, close_time=None, assigned_to=None, status=None, subject=None, secondary_id=None, metadata=None, update_date=None):  # noqa: E501
        """SpecificSupportTicketResponse - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._create_date = None
        self._description = None
        self._client_id = None
        self._account_id = None
        self._open_time = None
        self._close_time = None
        self._assigned_to = None
        self._status = None
        self._subject = None
        self._secondary_id = None
        self._metadata = None
        self._update_date = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if create_date is not None:
            self.create_date = create_date
        self.description = description
        self.client_id = client_id
        self.account_id = account_id
        self.open_time = open_time
        if close_time is not None:
            self.close_time = close_time
        if assigned_to is not None:
            self.assigned_to = assigned_to
        if status is not None:
            self.status = status
        if subject is not None:
            self.subject = subject
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if metadata is not None:
            self.metadata = metadata
        if update_date is not None:
            self.update_date = update_date

    @property
    def id(self):
        """Gets the id of this SpecificSupportTicketResponse.  # noqa: E501

        The ID of the support ticket  # noqa: E501

        :return: The id of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this SpecificSupportTicketResponse.

        The ID of the support ticket  # noqa: E501

        :param id: The id of this SpecificSupportTicketResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def create_date(self):
        """Gets the create_date of this SpecificSupportTicketResponse.  # noqa: E501

        Datetime the support ticket was created  # noqa: E501

        :return: The create_date of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this SpecificSupportTicketResponse.

        Datetime the support ticket was created  # noqa: E501

        :param create_date: The create_date of this SpecificSupportTicketResponse.  # noqa: E501
        :type: str
        """

        self._create_date = create_date

    @property
    def description(self):
        """Gets the description of this SpecificSupportTicketResponse.  # noqa: E501

        Details and description of the support ticket issue  # noqa: E501

        :return: The description of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this SpecificSupportTicketResponse.

        Details and description of the support ticket issue  # noqa: E501

        :param description: The description of this SpecificSupportTicketResponse.  # noqa: E501
        :type: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def client_id(self):
        """Gets the client_id of this SpecificSupportTicketResponse.  # noqa: E501

        The ID for the client associated with the support ticket  # noqa: E501

        :return: The client_id of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this SpecificSupportTicketResponse.

        The ID for the client associated with the support ticket  # noqa: E501

        :param client_id: The client_id of this SpecificSupportTicketResponse.  # noqa: E501
        :type: str
        """
        if client_id is None:
            raise ValueError("Invalid value for `client_id`, must not be `None`")  # noqa: E501

        self._client_id = client_id

    @property
    def account_id(self):
        """Gets the account_id of this SpecificSupportTicketResponse.  # noqa: E501

        The ID for the account associated with the support ticket  # noqa: E501

        :return: The account_id of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this SpecificSupportTicketResponse.

        The ID for the account associated with the support ticket  # noqa: E501

        :param account_id: The account_id of this SpecificSupportTicketResponse.  # noqa: E501
        :type: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

    @property
    def open_time(self):
        """Gets the open_time of this SpecificSupportTicketResponse.  # noqa: E501

        Date that the support ticket was opened  # noqa: E501

        :return: The open_time of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: date
        """
        return self._open_time

    @open_time.setter
    def open_time(self, open_time):
        """Sets the open_time of this SpecificSupportTicketResponse.

        Date that the support ticket was opened  # noqa: E501

        :param open_time: The open_time of this SpecificSupportTicketResponse.  # noqa: E501
        :type: date
        """
        if open_time is None:
            raise ValueError("Invalid value for `open_time`, must not be `None`")  # noqa: E501

        self._open_time = open_time

    @property
    def close_time(self):
        """Gets the close_time of this SpecificSupportTicketResponse.  # noqa: E501

        Date that the support ticket was resolved and closed  # noqa: E501

        :return: The close_time of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: date
        """
        return self._close_time

    @close_time.setter
    def close_time(self, close_time):
        """Sets the close_time of this SpecificSupportTicketResponse.

        Date that the support ticket was resolved and closed  # noqa: E501

        :param close_time: The close_time of this SpecificSupportTicketResponse.  # noqa: E501
        :type: date
        """

        self._close_time = close_time

    @property
    def assigned_to(self):
        """Gets the assigned_to of this SpecificSupportTicketResponse.  # noqa: E501

        The ID of the internal user to whom the support ticket is assigned to be resolved  # noqa: E501

        :return: The assigned_to of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: str
        """
        return self._assigned_to

    @assigned_to.setter
    def assigned_to(self, assigned_to):
        """Sets the assigned_to of this SpecificSupportTicketResponse.

        The ID of the internal user to whom the support ticket is assigned to be resolved  # noqa: E501

        :param assigned_to: The assigned_to of this SpecificSupportTicketResponse.  # noqa: E501
        :type: str
        """

        self._assigned_to = assigned_to

    @property
    def status(self):
        """Gets the status of this SpecificSupportTicketResponse.  # noqa: E501

        Status of the support ticket such as closed  # noqa: E501

        :return: The status of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this SpecificSupportTicketResponse.

        Status of the support ticket such as closed  # noqa: E501

        :param status: The status of this SpecificSupportTicketResponse.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def subject(self):
        """Gets the subject of this SpecificSupportTicketResponse.  # noqa: E501

        Title of the support ticket relating to the underlying issue  # noqa: E501

        :return: The subject of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: str
        """
        return self._subject

    @subject.setter
    def subject(self, subject):
        """Sets the subject of this SpecificSupportTicketResponse.

        Title of the support ticket relating to the underlying issue  # noqa: E501

        :param subject: The subject of this SpecificSupportTicketResponse.  # noqa: E501
        :type: str
        """

        self._subject = subject

    @property
    def secondary_id(self):
        """Gets the secondary_id of this SpecificSupportTicketResponse.  # noqa: E501


        :return: The secondary_id of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this SpecificSupportTicketResponse.


        :param secondary_id: The secondary_id of this SpecificSupportTicketResponse.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def metadata(self):
        """Gets the metadata of this SpecificSupportTicketResponse.  # noqa: E501

        Custom information associated with the support ticket in the format key:value  # noqa: E501

        :return: The metadata of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this SpecificSupportTicketResponse.

        Custom information associated with the support ticket in the format key:value  # noqa: E501

        :param metadata: The metadata of this SpecificSupportTicketResponse.  # noqa: E501
        :type: object
        """

        self._metadata = metadata

    @property
    def update_date(self):
        """Gets the update_date of this SpecificSupportTicketResponse.  # noqa: E501

        Datetime the support ticket was last updated  # noqa: E501

        :return: The update_date of this SpecificSupportTicketResponse.  # noqa: E501
        :rtype: str
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this SpecificSupportTicketResponse.

        Datetime the support ticket was last updated  # noqa: E501

        :param update_date: The update_date of this SpecificSupportTicketResponse.  # noqa: E501
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
        if issubclass(SpecificSupportTicketResponse, dict):
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
        if not isinstance(other, SpecificSupportTicketResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
