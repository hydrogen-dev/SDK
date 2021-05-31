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


class AccountingStatsResponseVO(object):
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
        'body': 'FinancialStatement',
        'status_code': 'int'
    }

    attribute_map = {
        'body': 'body',
        'status_code': 'status_code'
    }

    def __init__(self, body=None, status_code=None, _configuration=None):  # noqa: E501
        """AccountingStatsResponseVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._body = None
        self._status_code = None
        self.discriminator = None

        if body is not None:
            self.body = body
        if status_code is not None:
            self.status_code = status_code

    @property
    def body(self):
        """Gets the body of this AccountingStatsResponseVO.  # noqa: E501


        :return: The body of this AccountingStatsResponseVO.  # noqa: E501
        :rtype: FinancialStatement
        """
        return self._body

    @body.setter
    def body(self, body):
        """Sets the body of this AccountingStatsResponseVO.


        :param body: The body of this AccountingStatsResponseVO.  # noqa: E501
        :type: FinancialStatement
        """

        self._body = body

    @property
    def status_code(self):
        """Gets the status_code of this AccountingStatsResponseVO.  # noqa: E501


        :return: The status_code of this AccountingStatsResponseVO.  # noqa: E501
        :rtype: int
        """
        return self._status_code

    @status_code.setter
    def status_code(self, status_code):
        """Sets the status_code of this AccountingStatsResponseVO.


        :param status_code: The status_code of this AccountingStatsResponseVO.  # noqa: E501
        :type: int
        """

        self._status_code = status_code

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
        if issubclass(AccountingStatsResponseVO, dict):
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
        if not isinstance(other, AccountingStatsResponseVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AccountingStatsResponseVO):
            return True

        return self.to_dict() != other.to_dict()
