# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.3.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from integration_api.configuration import Configuration


class MergerAcquisition(object):
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
        'acquiree': 'Acquiree',
        'acquirer': 'Acquirer',
        'type': 'str'
    }

    attribute_map = {
        'acquiree': 'acquiree',
        'acquirer': 'acquirer',
        'type': 'type'
    }

    def __init__(self, acquiree=None, acquirer=None, type=None, _configuration=None):  # noqa: E501
        """MergerAcquisition - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._acquiree = None
        self._acquirer = None
        self._type = None
        self.discriminator = None

        if acquiree is not None:
            self.acquiree = acquiree
        if acquirer is not None:
            self.acquirer = acquirer
        if type is not None:
            self.type = type

    @property
    def acquiree(self):
        """Gets the acquiree of this MergerAcquisition.  # noqa: E501


        :return: The acquiree of this MergerAcquisition.  # noqa: E501
        :rtype: Acquiree
        """
        return self._acquiree

    @acquiree.setter
    def acquiree(self, acquiree):
        """Sets the acquiree of this MergerAcquisition.


        :param acquiree: The acquiree of this MergerAcquisition.  # noqa: E501
        :type: Acquiree
        """

        self._acquiree = acquiree

    @property
    def acquirer(self):
        """Gets the acquirer of this MergerAcquisition.  # noqa: E501


        :return: The acquirer of this MergerAcquisition.  # noqa: E501
        :rtype: Acquirer
        """
        return self._acquirer

    @acquirer.setter
    def acquirer(self, acquirer):
        """Sets the acquirer of this MergerAcquisition.


        :param acquirer: The acquirer of this MergerAcquisition.  # noqa: E501
        :type: Acquirer
        """

        self._acquirer = acquirer

    @property
    def type(self):
        """Gets the type of this MergerAcquisition.  # noqa: E501


        :return: The type of this MergerAcquisition.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this MergerAcquisition.


        :param type: The type of this MergerAcquisition.  # noqa: E501
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
        if issubclass(MergerAcquisition, dict):
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
        if not isinstance(other, MergerAcquisition):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, MergerAcquisition):
            return True

        return self.to_dict() != other.to_dict()
