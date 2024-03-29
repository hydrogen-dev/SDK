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


class StatisticResourceVO(object):
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
        'description': 'str',
        'parameter': 'str',
        'stat_name': 'str',
        'type': 'str'
    }

    attribute_map = {
        'description': 'description',
        'parameter': 'parameter',
        'stat_name': 'stat_name',
        'type': 'type'
    }

    def __init__(self, description=None, parameter=None, stat_name=None, type=None, _configuration=None):  # noqa: E501
        """StatisticResourceVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._description = None
        self._parameter = None
        self._stat_name = None
        self._type = None
        self.discriminator = None

        if description is not None:
            self.description = description
        if parameter is not None:
            self.parameter = parameter
        if stat_name is not None:
            self.stat_name = stat_name
        if type is not None:
            self.type = type

    @property
    def description(self):
        """Gets the description of this StatisticResourceVO.  # noqa: E501


        :return: The description of this StatisticResourceVO.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this StatisticResourceVO.


        :param description: The description of this StatisticResourceVO.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def parameter(self):
        """Gets the parameter of this StatisticResourceVO.  # noqa: E501


        :return: The parameter of this StatisticResourceVO.  # noqa: E501
        :rtype: str
        """
        return self._parameter

    @parameter.setter
    def parameter(self, parameter):
        """Sets the parameter of this StatisticResourceVO.


        :param parameter: The parameter of this StatisticResourceVO.  # noqa: E501
        :type: str
        """

        self._parameter = parameter

    @property
    def stat_name(self):
        """Gets the stat_name of this StatisticResourceVO.  # noqa: E501


        :return: The stat_name of this StatisticResourceVO.  # noqa: E501
        :rtype: str
        """
        return self._stat_name

    @stat_name.setter
    def stat_name(self, stat_name):
        """Sets the stat_name of this StatisticResourceVO.


        :param stat_name: The stat_name of this StatisticResourceVO.  # noqa: E501
        :type: str
        """

        self._stat_name = stat_name

    @property
    def type(self):
        """Gets the type of this StatisticResourceVO.  # noqa: E501


        :return: The type of this StatisticResourceVO.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this StatisticResourceVO.


        :param type: The type of this StatisticResourceVO.  # noqa: E501
        :type: str
        """

        self._type = type

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
        if issubclass(StatisticResourceVO, dict):
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
        if not isinstance(other, StatisticResourceVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, StatisticResourceVO):
            return True

        return self.to_dict() != other.to_dict()
