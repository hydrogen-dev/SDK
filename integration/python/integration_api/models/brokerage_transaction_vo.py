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


class BrokerageTransactionVO(object):
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
        'nucleus_portfolio_id': 'str',
        'nucleus_transactions_posted': 'object',
        'status': 'str',
        'vendor_name': 'str',
        'vendor_response': 'object'
    }

    attribute_map = {
        'message': 'message',
        'nucleus_portfolio_id': 'nucleus_portfolio_id',
        'nucleus_transactions_posted': 'nucleus_transactions_posted',
        'status': 'status',
        'vendor_name': 'vendor_name',
        'vendor_response': 'vendor_response'
    }

    def __init__(self, message=None, nucleus_portfolio_id=None, nucleus_transactions_posted=None, status=None, vendor_name=None, vendor_response=None, _configuration=None):  # noqa: E501
        """BrokerageTransactionVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._message = None
        self._nucleus_portfolio_id = None
        self._nucleus_transactions_posted = None
        self._status = None
        self._vendor_name = None
        self._vendor_response = None
        self.discriminator = None

        if message is not None:
            self.message = message
        if nucleus_portfolio_id is not None:
            self.nucleus_portfolio_id = nucleus_portfolio_id
        if nucleus_transactions_posted is not None:
            self.nucleus_transactions_posted = nucleus_transactions_posted
        if status is not None:
            self.status = status
        if vendor_name is not None:
            self.vendor_name = vendor_name
        if vendor_response is not None:
            self.vendor_response = vendor_response

    @property
    def message(self):
        """Gets the message of this BrokerageTransactionVO.  # noqa: E501


        :return: The message of this BrokerageTransactionVO.  # noqa: E501
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this BrokerageTransactionVO.


        :param message: The message of this BrokerageTransactionVO.  # noqa: E501
        :type: str
        """

        self._message = message

    @property
    def nucleus_portfolio_id(self):
        """Gets the nucleus_portfolio_id of this BrokerageTransactionVO.  # noqa: E501


        :return: The nucleus_portfolio_id of this BrokerageTransactionVO.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_portfolio_id

    @nucleus_portfolio_id.setter
    def nucleus_portfolio_id(self, nucleus_portfolio_id):
        """Sets the nucleus_portfolio_id of this BrokerageTransactionVO.


        :param nucleus_portfolio_id: The nucleus_portfolio_id of this BrokerageTransactionVO.  # noqa: E501
        :type: str
        """

        self._nucleus_portfolio_id = nucleus_portfolio_id

    @property
    def nucleus_transactions_posted(self):
        """Gets the nucleus_transactions_posted of this BrokerageTransactionVO.  # noqa: E501


        :return: The nucleus_transactions_posted of this BrokerageTransactionVO.  # noqa: E501
        :rtype: object
        """
        return self._nucleus_transactions_posted

    @nucleus_transactions_posted.setter
    def nucleus_transactions_posted(self, nucleus_transactions_posted):
        """Sets the nucleus_transactions_posted of this BrokerageTransactionVO.


        :param nucleus_transactions_posted: The nucleus_transactions_posted of this BrokerageTransactionVO.  # noqa: E501
        :type: object
        """

        self._nucleus_transactions_posted = nucleus_transactions_posted

    @property
    def status(self):
        """Gets the status of this BrokerageTransactionVO.  # noqa: E501


        :return: The status of this BrokerageTransactionVO.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this BrokerageTransactionVO.


        :param status: The status of this BrokerageTransactionVO.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def vendor_name(self):
        """Gets the vendor_name of this BrokerageTransactionVO.  # noqa: E501


        :return: The vendor_name of this BrokerageTransactionVO.  # noqa: E501
        :rtype: str
        """
        return self._vendor_name

    @vendor_name.setter
    def vendor_name(self, vendor_name):
        """Sets the vendor_name of this BrokerageTransactionVO.


        :param vendor_name: The vendor_name of this BrokerageTransactionVO.  # noqa: E501
        :type: str
        """

        self._vendor_name = vendor_name

    @property
    def vendor_response(self):
        """Gets the vendor_response of this BrokerageTransactionVO.  # noqa: E501


        :return: The vendor_response of this BrokerageTransactionVO.  # noqa: E501
        :rtype: object
        """
        return self._vendor_response

    @vendor_response.setter
    def vendor_response(self, vendor_response):
        """Sets the vendor_response of this BrokerageTransactionVO.


        :param vendor_response: The vendor_response of this BrokerageTransactionVO.  # noqa: E501
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
        if issubclass(BrokerageTransactionVO, dict):
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
        if not isinstance(other, BrokerageTransactionVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, BrokerageTransactionVO):
            return True

        return self.to_dict() != other.to_dict()
