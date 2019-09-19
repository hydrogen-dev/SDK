# coding: utf-8

"""
    Hydrogen Molecule API

    The Hydrogen Molecule API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class OfferingSettingsUpdatePayload(object):
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
        'rate': 'float',
        'start_date': 'str',
        'end_date': 'str'
    }

    attribute_map = {
        'rate': 'rate',
        'start_date': 'start_date',
        'end_date': 'end_date'
    }

    def __init__(self, rate=None, start_date=None, end_date=None):  # noqa: E501
        """OfferingSettingsUpdatePayload - a model defined in Swagger"""  # noqa: E501

        self._rate = None
        self._start_date = None
        self._end_date = None
        self.discriminator = None

        if rate is not None:
            self.rate = rate
        if start_date is not None:
            self.start_date = start_date
        if end_date is not None:
            self.end_date = end_date

    @property
    def rate(self):
        """Gets the rate of this OfferingSettingsUpdatePayload.  # noqa: E501

        The exchange rate of the token during the token offering.  # noqa: E501

        :return: The rate of this OfferingSettingsUpdatePayload.  # noqa: E501
        :rtype: float
        """
        return self._rate

    @rate.setter
    def rate(self, rate):
        """Sets the rate of this OfferingSettingsUpdatePayload.

        The exchange rate of the token during the token offering.  # noqa: E501

        :param rate: The rate of this OfferingSettingsUpdatePayload.  # noqa: E501
        :type: float
        """

        self._rate = rate

    @property
    def start_date(self):
        """Gets the start_date of this OfferingSettingsUpdatePayload.  # noqa: E501

        The date the security token offering will go live  # noqa: E501

        :return: The start_date of this OfferingSettingsUpdatePayload.  # noqa: E501
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this OfferingSettingsUpdatePayload.

        The date the security token offering will go live  # noqa: E501

        :param start_date: The start_date of this OfferingSettingsUpdatePayload.  # noqa: E501
        :type: str
        """

        self._start_date = start_date

    @property
    def end_date(self):
        """Gets the end_date of this OfferingSettingsUpdatePayload.  # noqa: E501

        The date the security token offering will end  # noqa: E501

        :return: The end_date of this OfferingSettingsUpdatePayload.  # noqa: E501
        :rtype: str
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this OfferingSettingsUpdatePayload.

        The date the security token offering will end  # noqa: E501

        :param end_date: The end_date of this OfferingSettingsUpdatePayload.  # noqa: E501
        :type: str
        """

        self._end_date = end_date

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
        if issubclass(OfferingSettingsUpdatePayload, dict):
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
        if not isinstance(other, OfferingSettingsUpdatePayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
