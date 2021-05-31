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


class AggregationVendorRequestCO(object):
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
        'item_id': 'str',
        'member_id': 'str',
        'nucleus_account_id': 'str'
    }

    attribute_map = {
        'item_id': 'item_id',
        'member_id': 'member_id',
        'nucleus_account_id': 'nucleus_account_id'
    }

    def __init__(self, item_id=None, member_id=None, nucleus_account_id=None, _configuration=None):  # noqa: E501
        """AggregationVendorRequestCO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._item_id = None
        self._member_id = None
        self._nucleus_account_id = None
        self.discriminator = None

        if item_id is not None:
            self.item_id = item_id
        if member_id is not None:
            self.member_id = member_id
        if nucleus_account_id is not None:
            self.nucleus_account_id = nucleus_account_id

    @property
    def item_id(self):
        """Gets the item_id of this AggregationVendorRequestCO.  # noqa: E501


        :return: The item_id of this AggregationVendorRequestCO.  # noqa: E501
        :rtype: str
        """
        return self._item_id

    @item_id.setter
    def item_id(self, item_id):
        """Sets the item_id of this AggregationVendorRequestCO.


        :param item_id: The item_id of this AggregationVendorRequestCO.  # noqa: E501
        :type: str
        """

        self._item_id = item_id

    @property
    def member_id(self):
        """Gets the member_id of this AggregationVendorRequestCO.  # noqa: E501


        :return: The member_id of this AggregationVendorRequestCO.  # noqa: E501
        :rtype: str
        """
        return self._member_id

    @member_id.setter
    def member_id(self, member_id):
        """Sets the member_id of this AggregationVendorRequestCO.


        :param member_id: The member_id of this AggregationVendorRequestCO.  # noqa: E501
        :type: str
        """

        self._member_id = member_id

    @property
    def nucleus_account_id(self):
        """Gets the nucleus_account_id of this AggregationVendorRequestCO.  # noqa: E501


        :return: The nucleus_account_id of this AggregationVendorRequestCO.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_account_id

    @nucleus_account_id.setter
    def nucleus_account_id(self, nucleus_account_id):
        """Sets the nucleus_account_id of this AggregationVendorRequestCO.


        :param nucleus_account_id: The nucleus_account_id of this AggregationVendorRequestCO.  # noqa: E501
        :type: str
        """

        self._nucleus_account_id = nucleus_account_id

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
        if issubclass(AggregationVendorRequestCO, dict):
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
        if not isinstance(other, AggregationVendorRequestCO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AggregationVendorRequestCO):
            return True

        return self.to_dict() != other.to_dict()
