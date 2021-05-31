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


class IavResponseVo(object):
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
        'aggregation': 'IavAggregationResponseVo',
        'bank_link': 'IavBankLinkResponseVo',
        'vendor_name': 'str'
    }

    attribute_map = {
        'aggregation': 'aggregation',
        'bank_link': 'bank_link',
        'vendor_name': 'vendor_name'
    }

    def __init__(self, aggregation=None, bank_link=None, vendor_name=None, _configuration=None):  # noqa: E501
        """IavResponseVo - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._aggregation = None
        self._bank_link = None
        self._vendor_name = None
        self.discriminator = None

        if aggregation is not None:
            self.aggregation = aggregation
        if bank_link is not None:
            self.bank_link = bank_link
        if vendor_name is not None:
            self.vendor_name = vendor_name

    @property
    def aggregation(self):
        """Gets the aggregation of this IavResponseVo.  # noqa: E501


        :return: The aggregation of this IavResponseVo.  # noqa: E501
        :rtype: IavAggregationResponseVo
        """
        return self._aggregation

    @aggregation.setter
    def aggregation(self, aggregation):
        """Sets the aggregation of this IavResponseVo.


        :param aggregation: The aggregation of this IavResponseVo.  # noqa: E501
        :type: IavAggregationResponseVo
        """

        self._aggregation = aggregation

    @property
    def bank_link(self):
        """Gets the bank_link of this IavResponseVo.  # noqa: E501


        :return: The bank_link of this IavResponseVo.  # noqa: E501
        :rtype: IavBankLinkResponseVo
        """
        return self._bank_link

    @bank_link.setter
    def bank_link(self, bank_link):
        """Sets the bank_link of this IavResponseVo.


        :param bank_link: The bank_link of this IavResponseVo.  # noqa: E501
        :type: IavBankLinkResponseVo
        """

        self._bank_link = bank_link

    @property
    def vendor_name(self):
        """Gets the vendor_name of this IavResponseVo.  # noqa: E501


        :return: The vendor_name of this IavResponseVo.  # noqa: E501
        :rtype: str
        """
        return self._vendor_name

    @vendor_name.setter
    def vendor_name(self, vendor_name):
        """Sets the vendor_name of this IavResponseVo.


        :param vendor_name: The vendor_name of this IavResponseVo.  # noqa: E501
        :type: str
        """

        self._vendor_name = vendor_name

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
        if issubclass(IavResponseVo, dict):
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
        if not isinstance(other, IavResponseVo):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, IavResponseVo):
            return True

        return self.to_dict() != other.to_dict()
