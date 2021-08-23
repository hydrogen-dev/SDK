# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.4
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class DecisionTreeCO(object):
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
        'answers': 'list[AnswerMap]',
        'entity_type': 'str'
    }

    attribute_map = {
        'answers': 'answers',
        'entity_type': 'entity_type'
    }

    def __init__(self, answers=None, entity_type=None, _configuration=None):  # noqa: E501
        """DecisionTreeCO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._answers = None
        self._entity_type = None
        self.discriminator = None

        self.answers = answers
        self.entity_type = entity_type

    @property
    def answers(self):
        """Gets the answers of this DecisionTreeCO.  # noqa: E501


        :return: The answers of this DecisionTreeCO.  # noqa: E501
        :rtype: list[AnswerMap]
        """
        return self._answers

    @answers.setter
    def answers(self, answers):
        """Sets the answers of this DecisionTreeCO.


        :param answers: The answers of this DecisionTreeCO.  # noqa: E501
        :type: list[AnswerMap]
        """
        if self._configuration.client_side_validation and answers is None:
            raise ValueError("Invalid value for `answers`, must not be `None`")  # noqa: E501

        self._answers = answers

    @property
    def entity_type(self):
        """Gets the entity_type of this DecisionTreeCO.  # noqa: E501


        :return: The entity_type of this DecisionTreeCO.  # noqa: E501
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """Sets the entity_type of this DecisionTreeCO.


        :param entity_type: The entity_type of this DecisionTreeCO.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and entity_type is None:
            raise ValueError("Invalid value for `entity_type`, must not be `None`")  # noqa: E501

        self._entity_type = entity_type

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
        if issubclass(DecisionTreeCO, dict):
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
        if not isinstance(other, DecisionTreeCO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DecisionTreeCO):
            return True

        return self.to_dict() != other.to_dict()
