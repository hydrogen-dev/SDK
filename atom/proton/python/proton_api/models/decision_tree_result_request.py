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


class DecisionTreeResultRequest(object):
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
        'entity_type': 'str',
        'answers': 'list[Answer]'
    }

    attribute_map = {
        'entity_type': 'entity_type',
        'answers': 'answers'
    }

    def __init__(self, entity_type=None, answers=None, _configuration=None):  # noqa: E501
        """DecisionTreeResultRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._entity_type = None
        self._answers = None
        self.discriminator = None

        self.entity_type = entity_type
        self.answers = answers

    @property
    def entity_type(self):
        """Gets the entity_type of this DecisionTreeResultRequest.  # noqa: E501


        :return: The entity_type of this DecisionTreeResultRequest.  # noqa: E501
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """Sets the entity_type of this DecisionTreeResultRequest.


        :param entity_type: The entity_type of this DecisionTreeResultRequest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and entity_type is None:
            raise ValueError("Invalid value for `entity_type`, must not be `None`")  # noqa: E501
        allowed_values = ["model", "allocation", "insurance_quote", "financial_offer"]  # noqa: E501
        if (self._configuration.client_side_validation and
                entity_type not in allowed_values):
            raise ValueError(
                "Invalid value for `entity_type` ({0}), must be one of {1}"  # noqa: E501
                .format(entity_type, allowed_values)
            )

        self._entity_type = entity_type

    @property
    def answers(self):
        """Gets the answers of this DecisionTreeResultRequest.  # noqa: E501


        :return: The answers of this DecisionTreeResultRequest.  # noqa: E501
        :rtype: list[Answer]
        """
        return self._answers

    @answers.setter
    def answers(self, answers):
        """Sets the answers of this DecisionTreeResultRequest.


        :param answers: The answers of this DecisionTreeResultRequest.  # noqa: E501
        :type: list[Answer]
        """
        if self._configuration.client_side_validation and answers is None:
            raise ValueError("Invalid value for `answers`, must not be `None`")  # noqa: E501

        self._answers = answers

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
        if issubclass(DecisionTreeResultRequest, dict):
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
        if not isinstance(other, DecisionTreeResultRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DecisionTreeResultRequest):
            return True

        return self.to_dict() != other.to_dict()
