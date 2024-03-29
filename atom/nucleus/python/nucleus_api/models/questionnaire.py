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


class Questionnaire(object):
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
        'create_date': 'datetime',
        'decision_tree_id': 'str',
        'description': 'str',
        'id': 'str',
        'is_active': 'bool',
        'metadata': 'dict(str, str)',
        'name': 'str',
        'questions': 'list[Question]',
        'secondary_id': 'str',
        'type': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'create_date': 'create_date',
        'decision_tree_id': 'decision_tree_id',
        'description': 'description',
        'id': 'id',
        'is_active': 'is_active',
        'metadata': 'metadata',
        'name': 'name',
        'questions': 'questions',
        'secondary_id': 'secondary_id',
        'type': 'type',
        'update_date': 'update_date'
    }

    def __init__(self, create_date=None, decision_tree_id=None, description=None, id=None, is_active=None, metadata=None, name=None, questions=None, secondary_id=None, type=None, update_date=None, _configuration=None):  # noqa: E501
        """Questionnaire - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._create_date = None
        self._decision_tree_id = None
        self._description = None
        self._id = None
        self._is_active = None
        self._metadata = None
        self._name = None
        self._questions = None
        self._secondary_id = None
        self._type = None
        self._update_date = None
        self.discriminator = None

        if create_date is not None:
            self.create_date = create_date
        if decision_tree_id is not None:
            self.decision_tree_id = decision_tree_id
        if description is not None:
            self.description = description
        if id is not None:
            self.id = id
        if is_active is not None:
            self.is_active = is_active
        if metadata is not None:
            self.metadata = metadata
        self.name = name
        if questions is not None:
            self.questions = questions
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if type is not None:
            self.type = type
        if update_date is not None:
            self.update_date = update_date

    @property
    def create_date(self):
        """Gets the create_date of this Questionnaire.  # noqa: E501


        :return: The create_date of this Questionnaire.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this Questionnaire.


        :param create_date: The create_date of this Questionnaire.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def decision_tree_id(self):
        """Gets the decision_tree_id of this Questionnaire.  # noqa: E501

        decision_tree_id  # noqa: E501

        :return: The decision_tree_id of this Questionnaire.  # noqa: E501
        :rtype: str
        """
        return self._decision_tree_id

    @decision_tree_id.setter
    def decision_tree_id(self, decision_tree_id):
        """Sets the decision_tree_id of this Questionnaire.

        decision_tree_id  # noqa: E501

        :param decision_tree_id: The decision_tree_id of this Questionnaire.  # noqa: E501
        :type: str
        """

        self._decision_tree_id = decision_tree_id

    @property
    def description(self):
        """Gets the description of this Questionnaire.  # noqa: E501

        description  # noqa: E501

        :return: The description of this Questionnaire.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this Questionnaire.

        description  # noqa: E501

        :param description: The description of this Questionnaire.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def id(self):
        """Gets the id of this Questionnaire.  # noqa: E501


        :return: The id of this Questionnaire.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Questionnaire.


        :param id: The id of this Questionnaire.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_active(self):
        """Gets the is_active of this Questionnaire.  # noqa: E501

        is_active  # noqa: E501

        :return: The is_active of this Questionnaire.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this Questionnaire.

        is_active  # noqa: E501

        :param is_active: The is_active of this Questionnaire.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def metadata(self):
        """Gets the metadata of this Questionnaire.  # noqa: E501

        metadata  # noqa: E501

        :return: The metadata of this Questionnaire.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this Questionnaire.

        metadata  # noqa: E501

        :param metadata: The metadata of this Questionnaire.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def name(self):
        """Gets the name of this Questionnaire.  # noqa: E501

        name  # noqa: E501

        :return: The name of this Questionnaire.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Questionnaire.

        name  # noqa: E501

        :param name: The name of this Questionnaire.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def questions(self):
        """Gets the questions of this Questionnaire.  # noqa: E501


        :return: The questions of this Questionnaire.  # noqa: E501
        :rtype: list[Question]
        """
        return self._questions

    @questions.setter
    def questions(self, questions):
        """Sets the questions of this Questionnaire.


        :param questions: The questions of this Questionnaire.  # noqa: E501
        :type: list[Question]
        """

        self._questions = questions

    @property
    def secondary_id(self):
        """Gets the secondary_id of this Questionnaire.  # noqa: E501


        :return: The secondary_id of this Questionnaire.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this Questionnaire.


        :param secondary_id: The secondary_id of this Questionnaire.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def type(self):
        """Gets the type of this Questionnaire.  # noqa: E501

        type  # noqa: E501

        :return: The type of this Questionnaire.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this Questionnaire.

        type  # noqa: E501

        :param type: The type of this Questionnaire.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def update_date(self):
        """Gets the update_date of this Questionnaire.  # noqa: E501


        :return: The update_date of this Questionnaire.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this Questionnaire.


        :param update_date: The update_date of this Questionnaire.  # noqa: E501
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
        if issubclass(Questionnaire, dict):
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
        if not isinstance(other, Questionnaire):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Questionnaire):
            return True

        return self.to_dict() != other.to_dict()
