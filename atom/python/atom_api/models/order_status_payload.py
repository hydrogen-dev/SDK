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


class OrderStatusPayload(object):
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
        'status': 'str',
        'description': 'str',
        'metadata': 'object'
    }

    attribute_map = {
        'status': 'status',
        'description': 'description',
        'metadata': 'metadata'
    }

    def __init__(self, status=None, description=None, metadata=None):  # noqa: E501
        """OrderStatusPayload - a model defined in Swagger"""  # noqa: E501

        self._status = None
        self._description = None
        self._metadata = None
        self.discriminator = None

        self.status = status
        self.description = description
        if metadata is not None:
            self.metadata = metadata

    @property
    def status(self):
        """Gets the status of this OrderStatusPayload.  # noqa: E501

        Value of the order status such as “Passed to Agent”  # noqa: E501

        :return: The status of this OrderStatusPayload.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this OrderStatusPayload.

        Value of the order status such as “Passed to Agent”  # noqa: E501

        :param status: The status of this OrderStatusPayload.  # noqa: E501
        :type: str
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status

    @property
    def description(self):
        """Gets the description of this OrderStatusPayload.  # noqa: E501

        Additional description of the order status  # noqa: E501

        :return: The description of this OrderStatusPayload.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this OrderStatusPayload.

        Additional description of the order status  # noqa: E501

        :param description: The description of this OrderStatusPayload.  # noqa: E501
        :type: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def metadata(self):
        """Gets the metadata of this OrderStatusPayload.  # noqa: E501

        Custom information associated with the order status in the format key:value  # noqa: E501

        :return: The metadata of this OrderStatusPayload.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this OrderStatusPayload.

        Custom information associated with the order status in the format key:value  # noqa: E501

        :param metadata: The metadata of this OrderStatusPayload.  # noqa: E501
        :type: object
        """

        self._metadata = metadata

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
        if issubclass(OrderStatusPayload, dict):
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
        if not isinstance(other, OrderStatusPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
