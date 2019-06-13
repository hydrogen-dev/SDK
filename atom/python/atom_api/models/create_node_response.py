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

from atom_api.models.node_payload import NodePayload  # noqa: F401,E501
from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class CreateNodeResponse(object):
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
        'name': 'str',
        'question_id': 'str',
        'is_first': 'bool',
        'secondary_id': 'SecondaryId',
        'id': 'str',
        'create_date': 'str'
    }

    attribute_map = {
        'name': 'name',
        'question_id': 'question_id',
        'is_first': 'is_first',
        'secondary_id': 'secondary_id',
        'id': 'id',
        'create_date': 'create_date'
    }

    def __init__(self, name=None, question_id=None, is_first=False, secondary_id=None, id=None, create_date=None):  # noqa: E501
        """CreateNodeResponse - a model defined in Swagger"""  # noqa: E501

        self._name = None
        self._question_id = None
        self._is_first = None
        self._secondary_id = None
        self._id = None
        self._create_date = None
        self.discriminator = None

        self.name = name
        self.question_id = question_id
        if is_first is not None:
            self.is_first = is_first
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if id is not None:
            self.id = id
        if create_date is not None:
            self.create_date = create_date

    @property
    def name(self):
        """Gets the name of this CreateNodeResponse.  # noqa: E501

        Name of the node  # noqa: E501

        :return: The name of this CreateNodeResponse.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this CreateNodeResponse.

        Name of the node  # noqa: E501

        :param name: The name of this CreateNodeResponse.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def question_id(self):
        """Gets the question_id of this CreateNodeResponse.  # noqa: E501

        The ID of the question that corresponds to this node  # noqa: E501

        :return: The question_id of this CreateNodeResponse.  # noqa: E501
        :rtype: str
        """
        return self._question_id

    @question_id.setter
    def question_id(self, question_id):
        """Sets the question_id of this CreateNodeResponse.

        The ID of the question that corresponds to this node  # noqa: E501

        :param question_id: The question_id of this CreateNodeResponse.  # noqa: E501
        :type: str
        """
        if question_id is None:
            raise ValueError("Invalid value for `question_id`, must not be `None`")  # noqa: E501

        self._question_id = question_id

    @property
    def is_first(self):
        """Gets the is_first of this CreateNodeResponse.  # noqa: E501

        Indicates if this is the first node of the decision tree. Defaults to false meaning it is not the first node  # noqa: E501

        :return: The is_first of this CreateNodeResponse.  # noqa: E501
        :rtype: bool
        """
        return self._is_first

    @is_first.setter
    def is_first(self, is_first):
        """Sets the is_first of this CreateNodeResponse.

        Indicates if this is the first node of the decision tree. Defaults to false meaning it is not the first node  # noqa: E501

        :param is_first: The is_first of this CreateNodeResponse.  # noqa: E501
        :type: bool
        """

        self._is_first = is_first

    @property
    def secondary_id(self):
        """Gets the secondary_id of this CreateNodeResponse.  # noqa: E501


        :return: The secondary_id of this CreateNodeResponse.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this CreateNodeResponse.


        :param secondary_id: The secondary_id of this CreateNodeResponse.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def id(self):
        """Gets the id of this CreateNodeResponse.  # noqa: E501

        ID of the node  # noqa: E501

        :return: The id of this CreateNodeResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CreateNodeResponse.

        ID of the node  # noqa: E501

        :param id: The id of this CreateNodeResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def create_date(self):
        """Gets the create_date of this CreateNodeResponse.  # noqa: E501

        Datetime the node was created  # noqa: E501

        :return: The create_date of this CreateNodeResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this CreateNodeResponse.

        Datetime the node was created  # noqa: E501

        :param create_date: The create_date of this CreateNodeResponse.  # noqa: E501
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
        if issubclass(CreateNodeResponse, dict):
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
        if not isinstance(other, CreateNodeResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
