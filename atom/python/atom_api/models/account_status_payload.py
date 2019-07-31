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

from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class AccountStatusPayload(object):
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
        'account_id': 'str',
        'status': 'str',
        'stage_id': 'str',
        'comments': 'str',
        'secondary_id': 'SecondaryId',
        'metadata': 'object'
    }

    attribute_map = {
        'account_id': 'account_id',
        'status': 'status',
        'stage_id': 'stage_id',
        'comments': 'comments',
        'secondary_id': 'secondary_id',
        'metadata': 'metadata'
    }

    def __init__(self, account_id=None, status=None, stage_id=None, comments=None, secondary_id=None, metadata=None):  # noqa: E501
        """AccountStatusPayload - a model defined in Swagger"""  # noqa: E501

        self._account_id = None
        self._status = None
        self._stage_id = None
        self._comments = None
        self._secondary_id = None
        self._metadata = None
        self.discriminator = None

        self.account_id = account_id
        self.status = status
        self.stage_id = stage_id
        if comments is not None:
            self.comments = comments
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if metadata is not None:
            self.metadata = metadata

    @property
    def account_id(self):
        """Gets the account_id of this AccountStatusPayload.  # noqa: E501

        The ID of the account to which the status belongs  # noqa: E501

        :return: The account_id of this AccountStatusPayload.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this AccountStatusPayload.

        The ID of the account to which the status belongs  # noqa: E501

        :param account_id: The account_id of this AccountStatusPayload.  # noqa: E501
        :type: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

    @property
    def status(self):
        """Gets the status of this AccountStatusPayload.  # noqa: E501

        Status of the account such as “Signed Up” or “Awaiting Payment”  # noqa: E501

        :return: The status of this AccountStatusPayload.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this AccountStatusPayload.

        Status of the account such as “Signed Up” or “Awaiting Payment”  # noqa: E501

        :param status: The status of this AccountStatusPayload.  # noqa: E501
        :type: str
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status

    @property
    def stage_id(self):
        """Gets the stage_id of this AccountStatusPayload.  # noqa: E501

        Refers to the stage the client is in. Useful for sign-up funnels  # noqa: E501

        :return: The stage_id of this AccountStatusPayload.  # noqa: E501
        :rtype: str
        """
        return self._stage_id

    @stage_id.setter
    def stage_id(self, stage_id):
        """Sets the stage_id of this AccountStatusPayload.

        Refers to the stage the client is in. Useful for sign-up funnels  # noqa: E501

        :param stage_id: The stage_id of this AccountStatusPayload.  # noqa: E501
        :type: str
        """
        if stage_id is None:
            raise ValueError("Invalid value for `stage_id`, must not be `None`")  # noqa: E501

        self._stage_id = stage_id

    @property
    def comments(self):
        """Gets the comments of this AccountStatusPayload.  # noqa: E501

        Comments for the client regarding the status of their account  # noqa: E501

        :return: The comments of this AccountStatusPayload.  # noqa: E501
        :rtype: str
        """
        return self._comments

    @comments.setter
    def comments(self, comments):
        """Sets the comments of this AccountStatusPayload.

        Comments for the client regarding the status of their account  # noqa: E501

        :param comments: The comments of this AccountStatusPayload.  # noqa: E501
        :type: str
        """

        self._comments = comments

    @property
    def secondary_id(self):
        """Gets the secondary_id of this AccountStatusPayload.  # noqa: E501


        :return: The secondary_id of this AccountStatusPayload.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this AccountStatusPayload.


        :param secondary_id: The secondary_id of this AccountStatusPayload.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def metadata(self):
        """Gets the metadata of this AccountStatusPayload.  # noqa: E501

        Custom information associated with the aggregation account in the format key:value  # noqa: E501

        :return: The metadata of this AccountStatusPayload.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this AccountStatusPayload.

        Custom information associated with the aggregation account in the format key:value  # noqa: E501

        :param metadata: The metadata of this AccountStatusPayload.  # noqa: E501
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
        if issubclass(AccountStatusPayload, dict):
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
        if not isinstance(other, AccountStatusPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
