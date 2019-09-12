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


class ClientAssetSizeResponseInner(object):
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
        '_date': 'date',
        'value': 'float',
        'additions': 'float'
    }

    attribute_map = {
        '_date': 'date',
        'value': 'value',
        'additions': 'additions'
    }

    def __init__(self, _date=None, value=None, additions=None):  # noqa: E501
        """ClientAssetSizeResponseInner - a model defined in Swagger"""  # noqa: E501

        self.__date = None
        self._value = None
        self._additions = None
        self.discriminator = None

        if _date is not None:
            self._date = _date
        if value is not None:
            self.value = value
        if additions is not None:
            self.additions = additions

    @property
    def _date(self):
        """Gets the _date of this ClientAssetSizeResponseInner.  # noqa: E501

        Date for this asset size record  # noqa: E501

        :return: The _date of this ClientAssetSizeResponseInner.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this ClientAssetSizeResponseInner.

        Date for this asset size record  # noqa: E501

        :param _date: The _date of this ClientAssetSizeResponseInner.  # noqa: E501
        :type: date
        """

        self.__date = _date

    @property
    def value(self):
        """Gets the value of this ClientAssetSizeResponseInner.  # noqa: E501

        Monetary value of all the client’s accounts on the particular date  # noqa: E501

        :return: The value of this ClientAssetSizeResponseInner.  # noqa: E501
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this ClientAssetSizeResponseInner.

        Monetary value of all the client’s accounts on the particular date  # noqa: E501

        :param value: The value of this ClientAssetSizeResponseInner.  # noqa: E501
        :type: float
        """

        self._value = value

    @property
    def additions(self):
        """Gets the additions of this ClientAssetSizeResponseInner.  # noqa: E501

        Amount added to all of the client’s accounts on the particular date, usually via deposits  # noqa: E501

        :return: The additions of this ClientAssetSizeResponseInner.  # noqa: E501
        :rtype: float
        """
        return self._additions

    @additions.setter
    def additions(self, additions):
        """Sets the additions of this ClientAssetSizeResponseInner.

        Amount added to all of the client’s accounts on the particular date, usually via deposits  # noqa: E501

        :param additions: The additions of this ClientAssetSizeResponseInner.  # noqa: E501
        :type: float
        """

        self._additions = additions

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
        if issubclass(ClientAssetSizeResponseInner, dict):
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
        if not isinstance(other, ClientAssetSizeResponseInner):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
