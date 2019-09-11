# coding: utf-8

"""
    Hydrogen Molecule API

    The Hydrogen Molecule API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from molecule_api.models.token_restriction_create_payload import TokenRestrictionCreatePayload  # noqa: F401,E501


class TokenRestrictionCreateResponse(object):
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
        'type': 'str',
        'value': 'str',
        'id': 'str',
        'label': 'str',
        'create_date': 'str'
    }

    attribute_map = {
        'type': 'type',
        'value': 'value',
        'id': 'id',
        'label': 'label',
        'create_date': 'create_date'
    }

    def __init__(self, type=None, value=None, id=None, label=None, create_date=None):  # noqa: E501
        """TokenRestrictionCreateResponse - a model defined in Swagger"""  # noqa: E501

        self._type = None
        self._value = None
        self._id = None
        self._label = None
        self._create_date = None
        self.discriminator = None

        self.type = type
        self.value = value
        if id is not None:
            self.id = id
        if label is not None:
            self.label = label
        if create_date is not None:
            self.create_date = create_date

    @property
    def type(self):
        """Gets the type of this TokenRestrictionCreateResponse.  # noqa: E501

        The type of the token restriction.  # noqa: E501

        :return: The type of this TokenRestrictionCreateResponse.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this TokenRestrictionCreateResponse.

        The type of the token restriction.  # noqa: E501

        :param type: The type of this TokenRestrictionCreateResponse.  # noqa: E501
        :type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def value(self):
        """Gets the value of this TokenRestrictionCreateResponse.  # noqa: E501

        The value assigned for the restriction  # noqa: E501

        :return: The value of this TokenRestrictionCreateResponse.  # noqa: E501
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this TokenRestrictionCreateResponse.

        The value assigned for the restriction  # noqa: E501

        :param value: The value of this TokenRestrictionCreateResponse.  # noqa: E501
        :type: str
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value

    @property
    def id(self):
        """Gets the id of this TokenRestrictionCreateResponse.  # noqa: E501

        ID of the wallet record  # noqa: E501

        :return: The id of this TokenRestrictionCreateResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this TokenRestrictionCreateResponse.

        ID of the wallet record  # noqa: E501

        :param id: The id of this TokenRestrictionCreateResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def label(self):
        """Gets the label of this TokenRestrictionCreateResponse.  # noqa: E501

        The unique label for the token restriction  # noqa: E501

        :return: The label of this TokenRestrictionCreateResponse.  # noqa: E501
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label):
        """Sets the label of this TokenRestrictionCreateResponse.

        The unique label for the token restriction  # noqa: E501

        :param label: The label of this TokenRestrictionCreateResponse.  # noqa: E501
        :type: str
        """

        self._label = label

    @property
    def create_date(self):
        """Gets the create_date of this TokenRestrictionCreateResponse.  # noqa: E501

        Datetime the wallet record was created  # noqa: E501

        :return: The create_date of this TokenRestrictionCreateResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this TokenRestrictionCreateResponse.

        Datetime the wallet record was created  # noqa: E501

        :param create_date: The create_date of this TokenRestrictionCreateResponse.  # noqa: E501
        :type: str
        """

        self._create_date = create_date

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
        if issubclass(TokenRestrictionCreateResponse, dict):
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
        if not isinstance(other, TokenRestrictionCreateResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other