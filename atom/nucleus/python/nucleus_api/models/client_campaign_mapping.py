# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.7.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class ClientCampaignMapping(object):
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
        'campaign_id': 'str',
        'client_id': 'str',
        'create_date': 'datetime',
        'id': 'str',
        'ip': 'str',
        'metadata': 'dict(str, str)',
        'secondary_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'campaign_id': 'campaign_id',
        'client_id': 'client_id',
        'create_date': 'create_date',
        'id': 'id',
        'ip': 'ip',
        'metadata': 'metadata',
        'secondary_id': 'secondary_id',
        'update_date': 'update_date'
    }

    def __init__(self, campaign_id=None, client_id=None, create_date=None, id=None, ip=None, metadata=None, secondary_id=None, update_date=None):  # noqa: E501
        """ClientCampaignMapping - a model defined in Swagger"""  # noqa: E501

        self._campaign_id = None
        self._client_id = None
        self._create_date = None
        self._id = None
        self._ip = None
        self._metadata = None
        self._secondary_id = None
        self._update_date = None
        self.discriminator = None

        self.campaign_id = campaign_id
        if client_id is not None:
            self.client_id = client_id
        if create_date is not None:
            self.create_date = create_date
        if id is not None:
            self.id = id
        if ip is not None:
            self.ip = ip
        if metadata is not None:
            self.metadata = metadata
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def campaign_id(self):
        """Gets the campaign_id of this ClientCampaignMapping.  # noqa: E501

        campaignId  # noqa: E501

        :return: The campaign_id of this ClientCampaignMapping.  # noqa: E501
        :rtype: str
        """
        return self._campaign_id

    @campaign_id.setter
    def campaign_id(self, campaign_id):
        """Sets the campaign_id of this ClientCampaignMapping.

        campaignId  # noqa: E501

        :param campaign_id: The campaign_id of this ClientCampaignMapping.  # noqa: E501
        :type: str
        """
        if campaign_id is None:
            raise ValueError("Invalid value for `campaign_id`, must not be `None`")  # noqa: E501

        self._campaign_id = campaign_id

    @property
    def client_id(self):
        """Gets the client_id of this ClientCampaignMapping.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this ClientCampaignMapping.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this ClientCampaignMapping.

        clientId  # noqa: E501

        :param client_id: The client_id of this ClientCampaignMapping.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def create_date(self):
        """Gets the create_date of this ClientCampaignMapping.  # noqa: E501


        :return: The create_date of this ClientCampaignMapping.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this ClientCampaignMapping.


        :param create_date: The create_date of this ClientCampaignMapping.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def id(self):
        """Gets the id of this ClientCampaignMapping.  # noqa: E501


        :return: The id of this ClientCampaignMapping.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ClientCampaignMapping.


        :param id: The id of this ClientCampaignMapping.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def ip(self):
        """Gets the ip of this ClientCampaignMapping.  # noqa: E501

        ip  # noqa: E501

        :return: The ip of this ClientCampaignMapping.  # noqa: E501
        :rtype: str
        """
        return self._ip

    @ip.setter
    def ip(self, ip):
        """Sets the ip of this ClientCampaignMapping.

        ip  # noqa: E501

        :param ip: The ip of this ClientCampaignMapping.  # noqa: E501
        :type: str
        """

        self._ip = ip

    @property
    def metadata(self):
        """Gets the metadata of this ClientCampaignMapping.  # noqa: E501


        :return: The metadata of this ClientCampaignMapping.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this ClientCampaignMapping.


        :param metadata: The metadata of this ClientCampaignMapping.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def secondary_id(self):
        """Gets the secondary_id of this ClientCampaignMapping.  # noqa: E501


        :return: The secondary_id of this ClientCampaignMapping.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this ClientCampaignMapping.


        :param secondary_id: The secondary_id of this ClientCampaignMapping.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def update_date(self):
        """Gets the update_date of this ClientCampaignMapping.  # noqa: E501


        :return: The update_date of this ClientCampaignMapping.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this ClientCampaignMapping.


        :param update_date: The update_date of this ClientCampaignMapping.  # noqa: E501
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
        if issubclass(ClientCampaignMapping, dict):
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
        if not isinstance(other, ClientCampaignMapping):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other