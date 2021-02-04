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


class CardAutoReloadResponseVO(object):
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
        'message': 'str',
        'nucleus_client_id': 'str',
        'reload_amount': 'float',
        'threshold_amount': 'float',
        'vendor_name': 'str',
        'vendor_response': 'object'
    }

    attribute_map = {
        'message': 'message',
        'nucleus_client_id': 'nucleus_client_id',
        'reload_amount': 'reload_amount',
        'threshold_amount': 'threshold_amount',
        'vendor_name': 'vendor_name',
        'vendor_response': 'vendor_response'
    }

    def __init__(self, message=None, nucleus_client_id=None, reload_amount=None, threshold_amount=None, vendor_name=None, vendor_response=None):  # noqa: E501
        """CardAutoReloadResponseVO - a model defined in Swagger"""  # noqa: E501

        self._message = None
        self._nucleus_client_id = None
        self._reload_amount = None
        self._threshold_amount = None
        self._vendor_name = None
        self._vendor_response = None
        self.discriminator = None

        if message is not None:
            self.message = message
        if nucleus_client_id is not None:
            self.nucleus_client_id = nucleus_client_id
        if reload_amount is not None:
            self.reload_amount = reload_amount
        if threshold_amount is not None:
            self.threshold_amount = threshold_amount
        if vendor_name is not None:
            self.vendor_name = vendor_name
        if vendor_response is not None:
            self.vendor_response = vendor_response

    @property
    def message(self):
        """Gets the message of this CardAutoReloadResponseVO.  # noqa: E501


        :return: The message of this CardAutoReloadResponseVO.  # noqa: E501
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this CardAutoReloadResponseVO.


        :param message: The message of this CardAutoReloadResponseVO.  # noqa: E501
        :type: str
        """

        self._message = message

    @property
    def nucleus_client_id(self):
        """Gets the nucleus_client_id of this CardAutoReloadResponseVO.  # noqa: E501


        :return: The nucleus_client_id of this CardAutoReloadResponseVO.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_client_id

    @nucleus_client_id.setter
    def nucleus_client_id(self, nucleus_client_id):
        """Sets the nucleus_client_id of this CardAutoReloadResponseVO.


        :param nucleus_client_id: The nucleus_client_id of this CardAutoReloadResponseVO.  # noqa: E501
        :type: str
        """

        self._nucleus_client_id = nucleus_client_id

    @property
    def reload_amount(self):
        """Gets the reload_amount of this CardAutoReloadResponseVO.  # noqa: E501


        :return: The reload_amount of this CardAutoReloadResponseVO.  # noqa: E501
        :rtype: float
        """
        return self._reload_amount

    @reload_amount.setter
    def reload_amount(self, reload_amount):
        """Sets the reload_amount of this CardAutoReloadResponseVO.


        :param reload_amount: The reload_amount of this CardAutoReloadResponseVO.  # noqa: E501
        :type: float
        """

        self._reload_amount = reload_amount

    @property
    def threshold_amount(self):
        """Gets the threshold_amount of this CardAutoReloadResponseVO.  # noqa: E501


        :return: The threshold_amount of this CardAutoReloadResponseVO.  # noqa: E501
        :rtype: float
        """
        return self._threshold_amount

    @threshold_amount.setter
    def threshold_amount(self, threshold_amount):
        """Sets the threshold_amount of this CardAutoReloadResponseVO.


        :param threshold_amount: The threshold_amount of this CardAutoReloadResponseVO.  # noqa: E501
        :type: float
        """

        self._threshold_amount = threshold_amount

    @property
    def vendor_name(self):
        """Gets the vendor_name of this CardAutoReloadResponseVO.  # noqa: E501


        :return: The vendor_name of this CardAutoReloadResponseVO.  # noqa: E501
        :rtype: str
        """
        return self._vendor_name

    @vendor_name.setter
    def vendor_name(self, vendor_name):
        """Sets the vendor_name of this CardAutoReloadResponseVO.


        :param vendor_name: The vendor_name of this CardAutoReloadResponseVO.  # noqa: E501
        :type: str
        """

        self._vendor_name = vendor_name

    @property
    def vendor_response(self):
        """Gets the vendor_response of this CardAutoReloadResponseVO.  # noqa: E501


        :return: The vendor_response of this CardAutoReloadResponseVO.  # noqa: E501
        :rtype: object
        """
        return self._vendor_response

    @vendor_response.setter
    def vendor_response(self, vendor_response):
        """Sets the vendor_response of this CardAutoReloadResponseVO.


        :param vendor_response: The vendor_response of this CardAutoReloadResponseVO.  # noqa: E501
        :type: object
        """

        self._vendor_response = vendor_response

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
        if issubclass(CardAutoReloadResponseVO, dict):
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
        if not isinstance(other, CardAutoReloadResponseVO):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other