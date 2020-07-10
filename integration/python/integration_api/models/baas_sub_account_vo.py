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


class BaasSubAccountVO(object):
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
        'account_number': 'str',
        'account_status': 'str',
        'message': 'str',
        'nucleus_portfolio_id': 'str',
        'status': 'str',
        'vendor_name': 'object',
        'vendor_response': 'object'
    }

    attribute_map = {
        'account_number': 'account_number',
        'account_status': 'account_status',
        'message': 'message',
        'nucleus_portfolio_id': 'nucleus_portfolio_id',
        'status': 'status',
        'vendor_name': 'vendor_name',
        'vendor_response': 'vendor_response'
    }

    def __init__(self, account_number=None, account_status=None, message=None, nucleus_portfolio_id=None, status=None, vendor_name=None, vendor_response=None):  # noqa: E501
        """BaasSubAccountVO - a model defined in Swagger"""  # noqa: E501

        self._account_number = None
        self._account_status = None
        self._message = None
        self._nucleus_portfolio_id = None
        self._status = None
        self._vendor_name = None
        self._vendor_response = None
        self.discriminator = None

        if account_number is not None:
            self.account_number = account_number
        if account_status is not None:
            self.account_status = account_status
        if message is not None:
            self.message = message
        if nucleus_portfolio_id is not None:
            self.nucleus_portfolio_id = nucleus_portfolio_id
        if status is not None:
            self.status = status
        if vendor_name is not None:
            self.vendor_name = vendor_name
        if vendor_response is not None:
            self.vendor_response = vendor_response

    @property
    def account_number(self):
        """Gets the account_number of this BaasSubAccountVO.  # noqa: E501


        :return: The account_number of this BaasSubAccountVO.  # noqa: E501
        :rtype: str
        """
        return self._account_number

    @account_number.setter
    def account_number(self, account_number):
        """Sets the account_number of this BaasSubAccountVO.


        :param account_number: The account_number of this BaasSubAccountVO.  # noqa: E501
        :type: str
        """

        self._account_number = account_number

    @property
    def account_status(self):
        """Gets the account_status of this BaasSubAccountVO.  # noqa: E501


        :return: The account_status of this BaasSubAccountVO.  # noqa: E501
        :rtype: str
        """
        return self._account_status

    @account_status.setter
    def account_status(self, account_status):
        """Sets the account_status of this BaasSubAccountVO.


        :param account_status: The account_status of this BaasSubAccountVO.  # noqa: E501
        :type: str
        """

        self._account_status = account_status

    @property
    def message(self):
        """Gets the message of this BaasSubAccountVO.  # noqa: E501


        :return: The message of this BaasSubAccountVO.  # noqa: E501
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this BaasSubAccountVO.


        :param message: The message of this BaasSubAccountVO.  # noqa: E501
        :type: str
        """

        self._message = message

    @property
    def nucleus_portfolio_id(self):
        """Gets the nucleus_portfolio_id of this BaasSubAccountVO.  # noqa: E501


        :return: The nucleus_portfolio_id of this BaasSubAccountVO.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_portfolio_id

    @nucleus_portfolio_id.setter
    def nucleus_portfolio_id(self, nucleus_portfolio_id):
        """Sets the nucleus_portfolio_id of this BaasSubAccountVO.


        :param nucleus_portfolio_id: The nucleus_portfolio_id of this BaasSubAccountVO.  # noqa: E501
        :type: str
        """

        self._nucleus_portfolio_id = nucleus_portfolio_id

    @property
    def status(self):
        """Gets the status of this BaasSubAccountVO.  # noqa: E501


        :return: The status of this BaasSubAccountVO.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this BaasSubAccountVO.


        :param status: The status of this BaasSubAccountVO.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def vendor_name(self):
        """Gets the vendor_name of this BaasSubAccountVO.  # noqa: E501


        :return: The vendor_name of this BaasSubAccountVO.  # noqa: E501
        :rtype: object
        """
        return self._vendor_name

    @vendor_name.setter
    def vendor_name(self, vendor_name):
        """Sets the vendor_name of this BaasSubAccountVO.


        :param vendor_name: The vendor_name of this BaasSubAccountVO.  # noqa: E501
        :type: object
        """

        self._vendor_name = vendor_name

    @property
    def vendor_response(self):
        """Gets the vendor_response of this BaasSubAccountVO.  # noqa: E501


        :return: The vendor_response of this BaasSubAccountVO.  # noqa: E501
        :rtype: object
        """
        return self._vendor_response

    @vendor_response.setter
    def vendor_response(self, vendor_response):
        """Sets the vendor_response of this BaasSubAccountVO.


        :param vendor_response: The vendor_response of this BaasSubAccountVO.  # noqa: E501
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
        if issubclass(BaasSubAccountVO, dict):
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
        if not isinstance(other, BaasSubAccountVO):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other