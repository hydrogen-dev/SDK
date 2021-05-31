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


class AchCardLoadResponseVO(object):
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
        'card_load': 'object',
        'card_load_status_code': 'int'
    }

    attribute_map = {
        'card_load': 'card_load',
        'card_load_status_code': 'card_load_status_code'
    }

    def __init__(self, card_load=None, card_load_status_code=None, _configuration=None):  # noqa: E501
        """AchCardLoadResponseVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._card_load = None
        self._card_load_status_code = None
        self.discriminator = None

        if card_load is not None:
            self.card_load = card_load
        if card_load_status_code is not None:
            self.card_load_status_code = card_load_status_code

    @property
    def card_load(self):
        """Gets the card_load of this AchCardLoadResponseVO.  # noqa: E501


        :return: The card_load of this AchCardLoadResponseVO.  # noqa: E501
        :rtype: object
        """
        return self._card_load

    @card_load.setter
    def card_load(self, card_load):
        """Sets the card_load of this AchCardLoadResponseVO.


        :param card_load: The card_load of this AchCardLoadResponseVO.  # noqa: E501
        :type: object
        """

        self._card_load = card_load

    @property
    def card_load_status_code(self):
        """Gets the card_load_status_code of this AchCardLoadResponseVO.  # noqa: E501


        :return: The card_load_status_code of this AchCardLoadResponseVO.  # noqa: E501
        :rtype: int
        """
        return self._card_load_status_code

    @card_load_status_code.setter
    def card_load_status_code(self, card_load_status_code):
        """Sets the card_load_status_code of this AchCardLoadResponseVO.


        :param card_load_status_code: The card_load_status_code of this AchCardLoadResponseVO.  # noqa: E501
        :type: int
        """

        self._card_load_status_code = card_load_status_code

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
        if issubclass(AchCardLoadResponseVO, dict):
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
        if not isinstance(other, AchCardLoadResponseVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AchCardLoadResponseVO):
            return True

        return self.to_dict() != other.to_dict()
