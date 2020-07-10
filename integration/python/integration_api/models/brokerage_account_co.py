# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.2.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class BrokerageAccountCO(object):
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
        'electron_document_id': 'list[str]',
        'nucleus_account_id': 'str',
        'nucleus_account_type_id': 'str'
    }

    attribute_map = {
        'electron_document_id': 'electron_document_id',
        'nucleus_account_id': 'nucleus_account_id',
        'nucleus_account_type_id': 'nucleus_account_type_id'
    }

    def __init__(self, electron_document_id=None, nucleus_account_id=None, nucleus_account_type_id=None):  # noqa: E501
        """BrokerageAccountCO - a model defined in Swagger"""  # noqa: E501

        self._electron_document_id = None
        self._nucleus_account_id = None
        self._nucleus_account_type_id = None
        self.discriminator = None

        if electron_document_id is not None:
            self.electron_document_id = electron_document_id
        if nucleus_account_id is not None:
            self.nucleus_account_id = nucleus_account_id
        if nucleus_account_type_id is not None:
            self.nucleus_account_type_id = nucleus_account_type_id

    @property
    def electron_document_id(self):
        """Gets the electron_document_id of this BrokerageAccountCO.  # noqa: E501


        :return: The electron_document_id of this BrokerageAccountCO.  # noqa: E501
        :rtype: list[str]
        """
        return self._electron_document_id

    @electron_document_id.setter
    def electron_document_id(self, electron_document_id):
        """Sets the electron_document_id of this BrokerageAccountCO.


        :param electron_document_id: The electron_document_id of this BrokerageAccountCO.  # noqa: E501
        :type: list[str]
        """

        self._electron_document_id = electron_document_id

    @property
    def nucleus_account_id(self):
        """Gets the nucleus_account_id of this BrokerageAccountCO.  # noqa: E501


        :return: The nucleus_account_id of this BrokerageAccountCO.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_account_id

    @nucleus_account_id.setter
    def nucleus_account_id(self, nucleus_account_id):
        """Sets the nucleus_account_id of this BrokerageAccountCO.


        :param nucleus_account_id: The nucleus_account_id of this BrokerageAccountCO.  # noqa: E501
        :type: str
        """

        self._nucleus_account_id = nucleus_account_id

    @property
    def nucleus_account_type_id(self):
        """Gets the nucleus_account_type_id of this BrokerageAccountCO.  # noqa: E501


        :return: The nucleus_account_type_id of this BrokerageAccountCO.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_account_type_id

    @nucleus_account_type_id.setter
    def nucleus_account_type_id(self, nucleus_account_type_id):
        """Sets the nucleus_account_type_id of this BrokerageAccountCO.


        :param nucleus_account_type_id: The nucleus_account_type_id of this BrokerageAccountCO.  # noqa: E501
        :type: str
        """

        self._nucleus_account_type_id = nucleus_account_type_id

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
        if issubclass(BrokerageAccountCO, dict):
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
        if not isinstance(other, BrokerageAccountCO):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other