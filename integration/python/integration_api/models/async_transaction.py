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


class AsyncTransaction(object):
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
        'create_date': 'datetime',
        'id': 'str',
        'response': 'object',
        'status': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'create_date': 'create_date',
        'id': 'id',
        'response': 'response',
        'status': 'status',
        'update_date': 'update_date'
    }

    def __init__(self, create_date=None, id=None, response=None, status=None, update_date=None, _configuration=None):  # noqa: E501
        """AsyncTransaction - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._create_date = None
        self._id = None
        self._response = None
        self._status = None
        self._update_date = None
        self.discriminator = None

        if create_date is not None:
            self.create_date = create_date
        if id is not None:
            self.id = id
        if response is not None:
            self.response = response
        if status is not None:
            self.status = status
        if update_date is not None:
            self.update_date = update_date

    @property
    def create_date(self):
        """Gets the create_date of this AsyncTransaction.  # noqa: E501


        :return: The create_date of this AsyncTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this AsyncTransaction.


        :param create_date: The create_date of this AsyncTransaction.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def id(self):
        """Gets the id of this AsyncTransaction.  # noqa: E501


        :return: The id of this AsyncTransaction.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this AsyncTransaction.


        :param id: The id of this AsyncTransaction.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def response(self):
        """Gets the response of this AsyncTransaction.  # noqa: E501


        :return: The response of this AsyncTransaction.  # noqa: E501
        :rtype: object
        """
        return self._response

    @response.setter
    def response(self, response):
        """Sets the response of this AsyncTransaction.


        :param response: The response of this AsyncTransaction.  # noqa: E501
        :type: object
        """

        self._response = response

    @property
    def status(self):
        """Gets the status of this AsyncTransaction.  # noqa: E501


        :return: The status of this AsyncTransaction.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this AsyncTransaction.


        :param status: The status of this AsyncTransaction.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def update_date(self):
        """Gets the update_date of this AsyncTransaction.  # noqa: E501


        :return: The update_date of this AsyncTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this AsyncTransaction.


        :param update_date: The update_date of this AsyncTransaction.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

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
        if issubclass(AsyncTransaction, dict):
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
        if not isinstance(other, AsyncTransaction):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AsyncTransaction):
            return True

        return self.to_dict() != other.to_dict()
