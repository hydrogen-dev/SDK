# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class Application(object):
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
        'description': 'str',
        'device': 'str',
        'id': 'str',
        'metadata': 'dict(str, str)',
        'name': 'str',
        'secondary_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'create_date': 'create_date',
        'description': 'description',
        'device': 'device',
        'id': 'id',
        'metadata': 'metadata',
        'name': 'name',
        'secondary_id': 'secondary_id',
        'update_date': 'update_date'
    }

    def __init__(self, create_date=None, description=None, device=None, id=None, metadata=None, name=None, secondary_id=None, update_date=None, _configuration=None):  # noqa: E501
        """Application - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._create_date = None
        self._description = None
        self._device = None
        self._id = None
        self._metadata = None
        self._name = None
        self._secondary_id = None
        self._update_date = None
        self.discriminator = None

        if create_date is not None:
            self.create_date = create_date
        if description is not None:
            self.description = description
        if device is not None:
            self.device = device
        if id is not None:
            self.id = id
        if metadata is not None:
            self.metadata = metadata
        self.name = name
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def create_date(self):
        """Gets the create_date of this Application.  # noqa: E501


        :return: The create_date of this Application.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this Application.


        :param create_date: The create_date of this Application.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def description(self):
        """Gets the description of this Application.  # noqa: E501

        description  # noqa: E501

        :return: The description of this Application.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this Application.

        description  # noqa: E501

        :param description: The description of this Application.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def device(self):
        """Gets the device of this Application.  # noqa: E501

        device  # noqa: E501

        :return: The device of this Application.  # noqa: E501
        :rtype: str
        """
        return self._device

    @device.setter
    def device(self, device):
        """Sets the device of this Application.

        device  # noqa: E501

        :param device: The device of this Application.  # noqa: E501
        :type: str
        """

        self._device = device

    @property
    def id(self):
        """Gets the id of this Application.  # noqa: E501


        :return: The id of this Application.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Application.


        :param id: The id of this Application.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def metadata(self):
        """Gets the metadata of this Application.  # noqa: E501

        metadata  # noqa: E501

        :return: The metadata of this Application.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this Application.

        metadata  # noqa: E501

        :param metadata: The metadata of this Application.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def name(self):
        """Gets the name of this Application.  # noqa: E501

        name  # noqa: E501

        :return: The name of this Application.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Application.

        name  # noqa: E501

        :param name: The name of this Application.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def secondary_id(self):
        """Gets the secondary_id of this Application.  # noqa: E501


        :return: The secondary_id of this Application.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this Application.


        :param secondary_id: The secondary_id of this Application.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def update_date(self):
        """Gets the update_date of this Application.  # noqa: E501


        :return: The update_date of this Application.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this Application.


        :param update_date: The update_date of this Application.  # noqa: E501
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
        if issubclass(Application, dict):
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
        if not isinstance(other, Application):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Application):
            return True

        return self.to_dict() != other.to_dict()
